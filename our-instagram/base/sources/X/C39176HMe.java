package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;

/* renamed from: X.HMe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39176HMe extends C17T implements JJK {
    public JJJ A00;
    public C38321qM A01;

    @Override // X.JJK
    public final JJK E8f(C1DY c1dy) {
        JJJ jjj = this.A00;
        if (jjj == null) {
            jjj = (JJJ) A05(-1964537064, C39175HMd.class);
        }
        if (jjj != null) {
            jjj.E8e(c1dy);
        } else {
            jjj = null;
        }
        this.A00 = jjj;
        this.A01 = AbstractC37304Gc5.A0E(c1dy, this, 700235949);
        return this;
    }

    @Override // X.JJK
    public final C45136Jyc EqX(C1DY c1dy) {
        H2A h2a;
        JJJ jjj = this.A00;
        if (jjj == null) {
            jjj = (JJJ) A05(-1964537064, C39175HMd.class);
        }
        C38806H6w c38806H6w = null;
        if (jjj != null) {
            h2a = jjj.EqW(c1dy);
        } else {
            h2a = null;
        }
        ACRType aCRType = (ACRType) A0N(-772425076, C43222J8t.A00);
        String A0j = A0j(501281532);
        String A0k = A0k(1025801609);
        C38321qM c38321qM = (C38321qM) c1dy.A00(AbstractC37304Gc5.A0E(c1dy, this, 700235949));
        String A0i = A0i(2106546059);
        String A0j2 = A0j(-153285260);
        String A0j3 = A0j(501699126);
        SmartReelType smartReelType = (SmartReelType) A0N(-357148978, C43223J8u.A00);
        ReelType reelType = (ReelType) A0N(1096874389, C43224J8v.A00);
        InterfaceC43521JKh interfaceC43521JKh = (InterfaceC43521JKh) A05(-2028976363, HVN.class);
        if (interfaceC43521JKh != null) {
            c38806H6w = interfaceC43521JKh.F3S();
        }
        return new C45136Jyc(h2a, aCRType, smartReelType, c38806H6w, c38321qM, reelType, A0j, A0k, A0i, A0j2, A0j3);
    }
}
