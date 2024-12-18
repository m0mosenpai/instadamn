package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ewz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33835Ewz {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        GKO gko;
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, MSV.A00(10));
        C102884kP c102884kP = (C102884kP) A03;
        C102884kP A08 = c102884kP.A08(41);
        if (A08 != null) {
            C102884kP A082 = c102884kP.A08(40);
            UserSession A0S = AbstractC31177DnL.A0S(c6fq);
            C2EY c2ey = C2EY.A0w;
            InterfaceC11380iw A083 = C6BQ.A08(c6fq);
            String A0I = A08.A0I();
            if (A0I != null) {
                GKO gko2 = new GKO(A0I, A08.A0L(36), A08.A0S(35, false));
                if (A082 != null) {
                    String A0I2 = A082.A0I();
                    if (A0I2 != null) {
                        gko = new GKO(A0I2, A082.A0L(36), A082.A0S(35, false));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    gko = null;
                }
                String A0H = c102884kP.A0H();
                if (A0H != null) {
                    String A0L = c102884kP.A0L(46);
                    if (A0L != null) {
                        String A0I3 = c102884kP.A0I();
                        String A0L2 = c102884kP.A0L(44);
                        int A032 = c102884kP.A03(36, 0);
                        boolean A0S2 = c102884kP.A0S(43, true);
                        boolean A0S3 = c102884kP.A0S(35, false);
                        String A0L3 = c102884kP.A0L(45);
                        if (A0L3 != null) {
                            GKP gkp = new GKP(gko2, gko, A0H, A0L, A0I3, A0L2, A0L3, A032, A0S2, A0S3);
                            C34726FRp A07 = C28531Zo.A04.A02.A07(A083, A0S, c2ey);
                            A07.A07.putSerializable("DirectShareSheetConstants.fundraiser", gkp);
                            AbstractC31176DnK.A0x(C6BQ.A04(c6fq), A07.A00(), C3DN.A00);
                            return null;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
