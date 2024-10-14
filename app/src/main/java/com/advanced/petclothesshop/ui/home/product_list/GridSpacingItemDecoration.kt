package com.advanced.petclothesshop.ui.home.product_list

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/***
 * Created by HoangRyan aka LilDua on 10/14/2024.
 */

class GridSpacingItemDecoration(
    private val spanCount: Int,
    private val spacing: Int,
    private val includeEdge: Boolean
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view) // vị trí của item
        val column = position % spanCount // tính cột của item

        if (includeEdge) {
            outRect.left = spacing - column * spacing / spanCount
            outRect.right = (column + 1) * spacing / spanCount

            if (position < spanCount) { // thêm khoảng cách phía trên nếu là hàng đầu tiên
                outRect.top = spacing
            }
            outRect.bottom = spacing // thêm khoảng cách phía dưới
        } else {
            outRect.left = column * spacing / spanCount
            outRect.right = spacing - (column + 1) * spacing / spanCount
            if (position >= spanCount) {
                outRect.top = spacing // thêm khoảng cách phía trên (trừ hàng đầu tiên)
            }
        }
    }
}