package com.advanced.petclothesshop.data

import com.advanced.petclothesshop.R
import com.advanced.petclothesshop.utils.ProductType

/***
 * Created by HoangRyan aka LilDua on 10/10/2024.
 */
class Datasource {
    fun loadPetClothesList() = listOf(
        PetClothes(
            id = 1,
            name = "Cổ áo len hoa xinh xắn",
            originalPrice = 25.00,
            discountPrice = 20.00,
            image = R.drawable.image_clothes_1,
            rating = "4.8",
            productType = ProductType.ACCESSORIES,
            description = "Cổ áo len handmade với thiết kế hoa 3D đáng yêu, chất liệu len mềm mại, an toàn cho da của thú cưng. Có nhiều màu sắc tươi tắn cho bạn lựa chọn. Sản phẩm phù hợp với các loại chó mèo nhỏ và vừa."
        ),
        PetClothes(
            id = 2,
            name = "Mũ len quả dâu tây",
            originalPrice = 35.00,
            discountPrice = 32.00,
            image = R.drawable.image_clothes_2,
            rating = "5.0",
            productType = ProductType.MODEL,
            description = "Mũ len quả dâu tây handmade với thiết kế độc đáo, chất liệu len mềm mại, an toàn cho da của mèo. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ giữ ấm cho mèo mà còn tạo điểm nhấn thời trang cực kỳ đáng yêu cho bé yêu của bạn."
        ),
        PetClothes(
            id = 3,
            name = "Mũ len hình hổ",
            originalPrice = 28.00,
            discountPrice = 25.00,
            image = R.drawable.image_clothes_3,
            rating = "4.9",
            productType = ProductType.ACCESSORIES,
            description = "Mũ len hình hổ handmade với thiết kế ngộ nghĩnh, chất liệu len mềm mại, an toàn cho da của thú cưng. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ giữ ấm cho thú cưng mà còn tạo điểm nhấn thời trang cho bé yêu của bạn."
        ),
        PetClothes(
            id = 4,
            name = "Mũ ong vàng",
            originalPrice = 30.00,
            discountPrice = 27.00,
            image = R.drawable.image_clothes_4,
            rating = "5.0",
            productType = ProductType.MODEL,
            description = "Mũ ong vàng handmade với thiết kế đáng yêu, chất liệu len mềm mại, an toàn cho da của chó. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ tạo điểm nhấn thời trang mà còn giúp chú chó của bạn trở nên thật độc đáo và thu hút."
        ),
        PetClothes(
            id = 5,
            name = "Mũ len hoa họa tiết",
            originalPrice = 32.00,
            discountPrice = 29.00,
            image = R.drawable.image_clothes_5,
            rating = "4.9",
            productType = ProductType.MODEL,
            description = "Mũ len hoa handmade với thiết kế nữ tính, chất liệu len mềm mại, tạo cảm giác thoải mái cho thú cưng. Sản phẩm có nhiều màu sắc tươi tắn để bạn lựa chọn. Mũ sẽ làm tăng thêm vẻ đáng yêu cho bé cưng của bạn."
        ),
        PetClothes(
            id = 6,
            name = "Mũ hoa hồng xinh xắn",
            originalPrice = 32.00,
            discountPrice = 29.00,
            image = R.drawable.image_clothes_6,
            rating = "5.0",
            productType = ProductType.MODEL,
            description = "Mũ hoa hồng handmade với thiết kế nữ tính, chất liệu len mềm mại, an toàn cho da của mèo. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ tạo điểm nhấn thời trang mà còn giúp chú mèo của bạn trở nên thật đáng yêu và ngọt ngào."

        ),
        PetClothes(
            id = 7,
            name = "Mũ hoa xanh tươi mát cho mèo",
            originalPrice = 32.00,
            discountPrice = 29.00,
            image = R.drawable.image_clothes_7,
            rating = "5.0",
            productType = ProductType.MODEL,
            description = "Mũ hoa xanh handmade với thiết kế tươi mát, chất liệu len mềm mại, an toàn cho da của mèo. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ tạo điểm nhấn thời trang mà còn giúp chú mèo của bạn trở nên thật đáng yêu và ngọt ngào."

        ),
        PetClothes(
            id = 8,
            name = "Mũ ếch xanh đáng yêu",
            originalPrice = 32.00,
            discountPrice = 29.00,
            image = R.drawable.image_clothes_8,
            rating = "5.0",
            productType = ProductType.MODEL,
            description = "Mũ ếch xanh handmade với thiết kế ngộ nghĩnh, chất liệu len mềm mại, an toàn cho da của chó. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ tạo điểm nhấn thời trang mà còn giúp chú chó của bạn trở nên thật độc đáo và hài hước."
        ),
        PetClothes(
            id = 9,
            name = "Mũ ếch nhảy nhót",
            originalPrice = 32.00,
            discountPrice = 29.00,
            image = R.drawable.image_clothes_9,
            rating = "5.0",
            productType = ProductType.ACCESSORIES,
            description = "Biến chú chó cưng của bạn thành một chú ếch xanh siêu ngầu với chiếc mũ ếch crochet độc đáo này! Với thiết kế ngộ nghĩnh, đôi mắt tròn xoe và chiếc lưỡi dài đầy biểu cảm, mũ ếch chắc chắn sẽ khiến ai cũng phải bật cười. Chất liệu len mềm mại, an toàn cho da, đảm bảo sự thoải mái cho thú cưng của bạn. Đường kim mũi chỉ tỉ mỉ, chắc chắn, bền đẹp theo thời gian. Mũ có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Hãy để thú cưng của bạn trở thành tâm điểm của mọi ánh nhìn với chiếc mũ ếch độc đáo này! Món quà tuyệt vời dành tặng cho những người yêu thú cưng.",
        ),
        PetClothes(
            id = 10,
            name = "Mũ hoa cúc handmade",
            originalPrice = 28.00,
            discountPrice = 25.00,
            image = R.drawable.image_clothes_10,
            rating = "5.0",
            productType = ProductType.ACCESSORIES,
            description = "Mũ hoa cúc handmade với thiết kế đáng yêu, chất liệu len mềm mại, an toàn cho da của mèo. Sản phẩm có độ co giãn tốt, phù hợp với nhiều kích cỡ đầu khác nhau. Mũ không chỉ tạo điểm nhấn thời trang mà còn giúp chú mèo của bạn trở nên thật ngọt ngào và thu hút."
        ),
    )
}