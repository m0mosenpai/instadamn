package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64902wo {
    public final int A00;
    public final C18920wW A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;

    public final void A00(InterfaceC99144cb interfaceC99144cb, String str, int i) {
        User BSW;
        C14360o3.A0B(interfaceC99144cb, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2574));
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("submodule", str);
            c0Zx.A06("prior_module", this.A05);
            c0Zx.A06("prior_submodule", this.A06);
            c0Zx.A06("shopping_session_id", this.A07);
            c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(c0Zx, "navigation_info");
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A05("chaining_position", Long.valueOf(i));
            c0Zx2.A06("chaining_session_id", this.A02);
            c0Zx2.A06("m_pk", interfaceC99144cb.Byk());
            c0Zx2.A06("parent_m_pk", this.A04);
            c0Zx2.A05("m_t", Long.valueOf(this.A00));
            c0Zx2.A06("source_media_type", interfaceC99144cb.Byo());
            A00.AAQ(c0Zx2, "pivots_logging_info");
            JI4 Aiv = interfaceC99144cb.Aiv();
            String str2 = null;
            if (Aiv != null && Aiv.BSW() != null) {
                JI4 Aiv2 = interfaceC99144cb.Aiv();
                if (Aiv2 != null && (BSW = Aiv2.BSW()) != null) {
                    str2 = AbstractC76433bn.A00(BSW);
                }
                A00.AAK(C4SX.A00(str2), "merchant_id");
            }
            A00.Cht();
        }
    }

    public C64902wo(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A09 = interfaceC60442pS;
        this.A08 = userSession;
        this.A07 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = str5;
        this.A04 = str6;
        this.A00 = i;
        this.A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
