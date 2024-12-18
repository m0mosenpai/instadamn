package X;

import android.os.Parcelable;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V2H extends AbstractC69220Vjn {
    public C68729Vb8 A00;
    public Product A01;
    public List A02;
    public final C68962Vf0 A03;

    public V2H(C69480Vo3 c69480Vo3) {
        super(new W2a(c69480Vo3.A04, c69480Vo3.A0G), c69480Vo3.A08, c69480Vo3.A0A, c69480Vo3.A00);
        C68767Vbk c68767Vbk;
        this.A03 = new C68962Vf0();
        List<C69389VmZ> list = c69480Vo3.A0F;
        C14360o3.A07(list);
        for (C69389VmZ c69389VmZ : list) {
            EnumC72406Xct enumC72406Xct = c69389VmZ.A03;
            if (EnumC72406Xct.A05 == enumC72406Xct) {
                this.A03.A00.add(new V2Q(new V2K(c69389VmZ, c69480Vo3.A00)));
            } else if (EnumC72406Xct.A04 == enumC72406Xct) {
                this.A03.A00.add(new V2M(new V2L(c69389VmZ, c69480Vo3.A00)));
                this.A02 = AbstractC70134W6i.A02(c69389VmZ.A05);
                String str = c69389VmZ.A04;
                this.A00 = new C68729Vb8(str);
                super.A01 = str;
            }
        }
        C69299Vl7 c69299Vl7 = c69480Vo3.A03;
        if (c69299Vl7 != null && c69299Vl7.A01 != null && (c68767Vbk = c69299Vl7.A00) != null) {
            String str2 = c69299Vl7.A02;
            String str3 = c69299Vl7.A03;
            ImageInfoImpl imageInfoImpl = new ImageInfoImpl(null, null, null, null, null);
            List<C69118Vi8> list2 = c68767Vbk.A00;
            ArrayList A10 = AbstractC31174DnI.A10(list2);
            for (C69118Vi8 c69118Vi8 : list2) {
                String str4 = c69118Vi8.A02;
                if (str4 != null) {
                    A10.add(new ExtendedImageUrl(str4, c69118Vi8.A01, c69118Vi8.A00));
                }
            }
            ProductImageContainerImpl productImageContainerImpl = new ProductImageContainerImpl(AbstractC40161tk.A05(imageInfoImpl, A10).F5B(), null);
            C69119Vi9 c69119Vi9 = c69299Vl7.A01;
            if (c69119Vi9 != null) {
                Parcelable.Creator creator = User.CREATOR;
                String str5 = c69119Vi9.A00;
                if (str5 != null) {
                    this.A01 = C41746IeK.A01(null, null, productImageContainerImpl, AbstractC38851rI.A03(new SimpleImageUrl(c69119Vi9.A01), str5, c69119Vi9.A02), null, null, null, null, null, str2, str2, null, null, str3, null, c69299Vl7.A04);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
