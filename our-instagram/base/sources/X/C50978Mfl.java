package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

/* renamed from: X.Mfl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50978Mfl extends AbstractC52922bZ {
    public C51850Mvs A00;
    public boolean A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C2DS A04;
    public final InterfaceC58279PsX A05;
    public final MediaKitRepository A06;
    public final C54422O3c A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C05A A0C;

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.A01();
    }

    public C50978Mfl(UserSession userSession, C2DS c2ds, InterfaceC58279PsX interfaceC58279PsX, MediaKitRepository mediaKitRepository) {
        AbstractC167027dH.A13(c2ds, userSession, mediaKitRepository);
        this.A04 = c2ds;
        this.A03 = userSession;
        this.A06 = mediaKitRepository;
        this.A05 = interfaceC58279PsX;
        this.A07 = new C54422O3c(AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36597742747454429L));
        this.A02 = AbstractC31173DnH.A0S();
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0B = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0C = A002;
        this.A09 = C10Q.A03(new C25587BTa(this, 1), A00, A002);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A08 = A12;
        this.A0A = AbstractC07080Za.A03(A12);
    }
}
