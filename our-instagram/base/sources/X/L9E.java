package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes8.dex */
public class L9E {
    public ImageUrl A00;
    public ImageUrl A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public Boolean A07;
    public Integer A08;
    public List A09;
    public final InterfaceC223316m A0A;

    public final InterfaceC223316m A00() {
        Object A01;
        String str;
        InterfaceC223316m interfaceC223316m = this.A0A;
        if (interfaceC223316m instanceof C39254HSp) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            C09530e4 A1L = AbstractC166987dD.A1L("available_theme_colors", this.A09);
            ImageUrl imageUrl = this.A00;
            String str2 = null;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            C09530e4 A1L2 = AbstractC166987dD.A1L("background_image_url", str);
            C09530e4 A1L3 = AbstractC166987dD.A1L("emoji", this.A06);
            C09530e4 A1L4 = AbstractC166987dD.A1L("emoji_color", this.A02);
            C09530e4 A1L5 = AbstractC166987dD.A1L("gradient", this.A03);
            C09530e4 A1L6 = AbstractC166987dD.A1L("is_background_image_blurred", this.A07);
            C09530e4 A1L7 = AbstractC166987dD.A1L(DatePickerDialogModule.ARG_MODE, this.A04);
            C09530e4 A1L8 = AbstractC166987dD.A1L("selected_theme_color", this.A08);
            C09530e4 A1L9 = AbstractC166987dD.A1L("selfie_sticker", this.A05);
            ImageUrl imageUrl2 = this.A01;
            if (imageUrl2 != null) {
                str2 = imageUrl2.getUrl();
            }
            A01 = AbstractC37303Gc4.A06(interfaceC223316m, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, AbstractC166987dD.A1L("selfie_url", str2)});
        } else {
            A01 = A01();
        }
        return (InterfaceC223316m) A01;
    }

    public final C223216l A01() {
        List list = this.A09;
        ImageUrl imageUrl = this.A00;
        String str = this.A06;
        Integer num = this.A02;
        Integer num2 = this.A03;
        return new C223216l(imageUrl, this.A01, this.A07, num, num2, this.A04, this.A08, this.A05, str, list);
    }

    public L9E(InterfaceC223316m interfaceC223316m) {
        this.A0A = interfaceC223316m;
        this.A09 = interfaceC223316m.AeP();
        this.A00 = interfaceC223316m.Aez();
        this.A06 = interfaceC223316m.getEmoji();
        this.A02 = interfaceC223316m.B1G();
        this.A03 = interfaceC223316m.BAD();
        this.A07 = interfaceC223316m.CQS();
        this.A04 = interfaceC223316m.BUH();
        this.A08 = interfaceC223316m.Bsp();
        this.A05 = interfaceC223316m.Bt1();
        this.A01 = interfaceC223316m.Bt2();
    }
}
