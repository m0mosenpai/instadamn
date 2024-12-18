package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PG9 implements InterfaceC57990Pna {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C201848wH A01;
    public final /* synthetic */ InterfaceC57990Pna A02;
    public final /* synthetic */ C54804OJy A03;

    public PG9(UserSession userSession, C201848wH c201848wH, InterfaceC57990Pna interfaceC57990Pna, C54804OJy c54804OJy) {
        this.A02 = interfaceC57990Pna;
        this.A00 = userSession;
        this.A03 = c54804OJy;
        this.A01 = c201848wH;
    }

    @Override // X.InterfaceC57990Pna
    public final void afterSelection(boolean z) {
        String str;
        InterfaceC57990Pna interfaceC57990Pna = this.A02;
        if (interfaceC57990Pna != null) {
            interfaceC57990Pna.afterSelection(z);
        }
        if (!z) {
            UserSession userSession = this.A00;
            boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "NoticeSnoozeUtil");
            C54804OJy c54804OJy = this.A03;
            C82G c82g = c54804OJy.A0D;
            C82H c82h = C82H.A07;
            C82I A0H = MSW.A0H();
            EnumC46582Bw enumC46582Bw = (EnumC46582Bw) this.A01.getOptionalEnumField(2, "variant", EnumC46582Bw.A0Z);
            if (enumC46582Bw != null) {
                str = enumC46582Bw.name();
            } else {
                str = null;
            }
            A0H.A06("pre_snooze_variant", str);
            A0H.A0A(AbstractC166997dE.A0a());
            MSX.A1I(A0H, A1X);
            A0H.A06("waterfall_id", c54804OJy.A0A);
            A0H.A06("ig_media_id", c54804OJy.A08);
            new C82L(c82g, c82h, A0H, userSession, true).A02(c54804OJy.A0C, null);
        }
    }
}
