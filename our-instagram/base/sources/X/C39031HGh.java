package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.HGh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39031HGh extends C1P1 {
    public final InterfaceC09390do A00;
    public final boolean A01;
    public final /* synthetic */ EnumC77213d7 A02;
    public final /* synthetic */ C41625IbF A03;
    public final /* synthetic */ C64972wv A04;

    public C39031HGh(EnumC77213d7 enumC77213d7, C41625IbF c41625IbF, C64972wv c64972wv) {
        this.A02 = enumC77213d7;
        this.A03 = c41625IbF;
        this.A04 = c64972wv;
        this.A01 = AbstractC167007dF.A1X(enumC77213d7, EnumC77213d7.A04);
        this.A00 = AbstractC09440dt.A01(new C43210J8h(19, c64972wv, this, c41625IbF));
    }

    private final void A00(Integer num) {
        C25671My A00 = AbstractC25651Mw.A00(this.A04.A02);
        EnumC77213d7 enumC77213d7 = this.A02;
        C41625IbF c41625IbF = this.A03;
        String BqK = c41625IbF.A0D.BqK();
        C14360o3.A07(BqK);
        A00.E4s(new C42257Inh(enumC77213d7, num, BqK, c41625IbF.A08));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Gxa, X.0Zx] */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(848736163);
        int A032 = C0f9.A03(315323072);
        C64972wv c64972wv = this.A04;
        AbstractC35236FgV.A01(c64972wv.A01, c64972wv.A00.getResources().getString(2131972754), this.A01);
        C64982ww c64982ww = c64972wv.A04;
        C41625IbF c41625IbF = this.A03;
        InterfaceC76653cC interfaceC76653cC = c41625IbF.A0D;
        String BqK = interfaceC76653cC.BqK();
        C14360o3.A07(BqK);
        String str = c41625IbF.A0F;
        boolean z = c41625IbF.A0I;
        String str2 = c41625IbF.A08;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c64982ww.A01, "instagram_shopping_product_save_client_failure");
        C4SX c4sx = null;
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0f(A0f, C64982ww.A02(c64982ww, str2));
            ?? c0Zx = new C0Zx();
            c0Zx.A05("product_id", AbstractC25228BEl.A13(BqK));
            if (str != null) {
                c4sx = C4SX.A00(str);
            }
            c0Zx.A09(c4sx);
            c0Zx.A03("is_checkout_enabled", Boolean.valueOf(z));
            A0f.AAQ(c0Zx, "product_info");
            A0f.Cht();
        }
        Integer num = C05F.A01;
        C14360o3.A07(interfaceC76653cC.BqK());
        A00(num);
        C0f9.A0A(-1883985807, A032);
        C0f9.A0A(-704266627, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(2002784249, C0f9.A03(2075895252));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Gxa, X.0Zx] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ExtendedImageUrl extendedImageUrl;
        int A03 = C0f9.A03(978962143);
        int A032 = C0f9.A03(-1877511923);
        int A033 = C0f9.A03(664449274);
        C41625IbF c41625IbF = this.A03;
        if (c41625IbF.A09) {
            ImageInfo imageInfo = c41625IbF.A0C;
            if (imageInfo != null) {
                extendedImageUrl = AbstractC40161tk.A01(this.A04.A01, imageInfo);
            } else {
                extendedImageUrl = null;
            }
            C64972wv c64972wv = this.A04;
            boolean A1a = AbstractC25225BEi.A1a(c64972wv.A03.getModuleName(), "instagram_shopping_save_product_collection");
            int i = 2131970062;
            if (this.A01) {
                i = 2131970004;
            }
            if (c41625IbF.A0A) {
                FragmentActivity fragmentActivity = c64972wv.A01;
                InterfaceC58152PqH interfaceC58152PqH = (InterfaceC58152PqH) this.A00.getValue();
                Integer num = c64972wv.A05;
                C14360o3.A0B(interfaceC58152PqH, 1);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A0D = AbstractC166997dE.A0r(fragmentActivity.getResources(), fragmentActivity.getResources().getString(2131972754), i);
                A0K.A0O = true;
                if (extendedImageUrl != null) {
                    A0K.A09 = extendedImageUrl;
                    A0K.A03();
                }
                if (A1a) {
                    A0K.A0L = true;
                    A0K.A0A = interfaceC58152PqH;
                    A0K.A0G = AbstractC166997dE.A0q(fragmentActivity.getResources(), 2131952155);
                }
                if (num != null) {
                    A0K.A02 = num.intValue();
                }
                AbstractC31178DnM.A1S(A0K);
            }
            C64982ww c64982ww = c64972wv.A04;
            InterfaceC76653cC interfaceC76653cC = c41625IbF.A0D;
            String BqK = interfaceC76653cC.BqK();
            C14360o3.A07(BqK);
            String str = c41625IbF.A0F;
            boolean z = c41625IbF.A0I;
            String str2 = c41625IbF.A08;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c64982ww.A01, "instagram_shopping_product_save_client_success");
            C4SX c4sx = null;
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0f(A0f, C64982ww.A02(c64982ww, str2));
                ?? c0Zx = new C0Zx();
                c0Zx.A05("product_id", AbstractC25228BEl.A13(BqK));
                if (str != null) {
                    c4sx = C4SX.A00(str);
                }
                c0Zx.A09(c4sx);
                c0Zx.A03("is_checkout_enabled", Boolean.valueOf(z));
                A0f.AAQ(c0Zx, "product_info");
                A0f.Cht();
            }
            Integer num2 = C05F.A00;
            C14360o3.A07(interfaceC76653cC.BqK());
            A00(num2);
        }
        C0f9.A0A(-1065895465, A033);
        C0f9.A0A(-496633943, A032);
        C0f9.A0A(811417144, A03);
    }

    public C39031HGh() {
    }
}
