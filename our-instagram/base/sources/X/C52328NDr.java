package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.NDr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52328NDr extends AbstractC61132qb {
    public final Application A00;
    public final C07X A01;
    public final InterfaceC018407e A02;
    public final C22P A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final AnonymousClass841 A06;
    public final C44547Jmr A07;
    public final C52458NJc A08;
    public final P0H A09;
    public final C50991Mfy A0A;
    public final String A0B;

    public C52328NDr(Application application, C07X c07x, InterfaceC018407e interfaceC018407e, C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AnonymousClass841 anonymousClass841, C44547Jmr c44547Jmr, C52458NJc c52458NJc, P0H p0h, C50991Mfy c50991Mfy, String str) {
        AbstractC25234BEr.A0k(2, userSession, p0h, interfaceC11380iw, str);
        AbstractC25229BEm.A1L(c22p, 8, c44547Jmr);
        this.A00 = application;
        this.A05 = userSession;
        this.A06 = anonymousClass841;
        this.A08 = c52458NJc;
        this.A09 = p0h;
        this.A04 = interfaceC11380iw;
        this.A0B = str;
        this.A03 = c22p;
        this.A02 = interfaceC018407e;
        this.A01 = c07x;
        this.A0A = c50991Mfy;
        this.A07 = c44547Jmr;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        AnonymousClass841 anonymousClass841 = this.A06;
        MediaCaptureConfig mediaCaptureConfig = ((MX5) anonymousClass841).A01.A09;
        boolean z = true;
        if (mediaCaptureConfig == null || !mediaCaptureConfig.A04) {
            z = false;
        }
        UserSession userSession = this.A05;
        NJN njn = new NJN(userSession, anonymousClass841);
        C52458NJc c52458NJc = this.A08;
        C52468NJm c52468NJm = new C52468NJm(userSession, c52458NJc);
        NKA nka = new NKA(userSession, anonymousClass841, c52458NJc);
        P0H p0h = this.A09;
        Application application = this.A00;
        NKO nko = new NKO(AbstractC166987dD.A0O(application), userSession, p0h, c52458NJc, new C57749Pjc(this, 1), true);
        C52467NJl c52467NJl = new C52467NJl(userSession, c52458NJc);
        C52481NJz c52481NJz = new C52481NJz(c52458NJc);
        NKB nkb = new NKB(userSession, c52458NJc);
        NK3 nk3 = new NK3(c52458NJc);
        C52478NJw c52478NJw = new C52478NJw(c52458NJc);
        C44547Jmr c44547Jmr = this.A07;
        C52479NJx c52479NJx = new C52479NJx(userSession, c52458NJc, c44547Jmr.A02);
        C52473NJr c52473NJr = new C52473NJr(userSession, EnumC53117NeU.A03, c52458NJc, false);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        NKK nkk = new NKK(AbstractC166987dD.A0O(application), p0h.A00, interfaceC11380iw, userSession, c52458NJc);
        NKC nkc = new NKC(userSession, c52458NJc);
        NKI nki = new NKI(userSession, anonymousClass841, c52458NJc, this.A0B);
        C52470NJo c52470NJo = new C52470NJo(c52458NJc, z);
        C52462NJg c52462NJg = new C52462NJg(c52458NJc);
        NK6 nk6 = new NK6(userSession, c52458NJc, z);
        NKD nkd = new NKD(this.A03, userSession, c52458NJc);
        C52480NJy c52480NJy = new C52480NJy(userSession, c52458NJc, (C51045Mgx) MSW.A0F(new C52275NBq(userSession, c52458NJc), this.A02).A00(C51045Mgx.class));
        C52463NJh c52463NJh = new C52463NJh(c52458NJc);
        C52477NJv c52477NJv = new C52477NJv(userSession, c52458NJc, interfaceC11380iw.getModuleName());
        return new NJQ(application, this.A01, userSession, c44547Jmr, c52458NJc, njn, nk6, c52467NJl, nkd, nka, c52462NJg, nki, c52468NJm, c52479NJx, c52480NJy, c52463NJh, this.A0A, c52481NJz, nkb, nk3, c52473NJr, new NKE(userSession, c52458NJc), c52477NJv, nko, c52478NJw, nkk, c52470NJo, nkc);
    }
}
