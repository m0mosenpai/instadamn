package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.MYm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50668MYm implements InterfaceC58309Pt1 {
    public final UserSession A00;
    public final C154796xU A01;
    public final MusicBrowseCategory A02;
    public final InterfaceC58197Pr3 A03;
    public final java.util.Set A04;
    public final java.util.Set A05;
    public final InterfaceC09390do A06;
    public final boolean A07;

    public C50668MYm(AbstractC59962oe abstractC59962oe, UserSession userSession, MusicBrowseCategory musicBrowseCategory, InterfaceC58197Pr3 interfaceC58197Pr3, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A03 = interfaceC58197Pr3;
        this.A02 = musicBrowseCategory;
        this.A06 = AbstractC09440dt.A01(new C57245PbT(this, 11));
        this.A01 = AbstractC37302Gc3.A0L(abstractC59962oe.requireContext(), abstractC59962oe, userSession);
        this.A07 = z;
        this.A05 = new C58406Puk(9);
        this.A04 = new C58406Puk(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r0 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if (r14 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Integer r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50668MYm.A00(java.lang.Integer, boolean):void");
    }

    @Override // X.InterfaceC58309Pt1
    public final void AD4() {
        if (this.A01.A06()) {
            A00(null, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return this.A03.CLl();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A01.A03.A03, C05F.A01);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(null, AbstractC25229BEm.A1Z(this.A01.A03.A07));
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC167007dF.A1X(this.A01.A03.A03, C05F.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (!CUG()) {
            if (!isLoading() || !this.A03.EjZ()) {
                InterfaceC58197Pr3 interfaceC58197Pr3 = this.A03;
                if (!interfaceC58197Pr3.CLl() && interfaceC58197Pr3.EjU() && this.A01.A03.A03 == C05F.A0C) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
