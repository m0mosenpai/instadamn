package X;

import com.facebook.primitive.canvas.model.CanvasInverseTransform;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CBv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27500CBv {
    public static final C26112Bgw A00(C102884kP c102884kP, long j) {
        InterfaceC30927Die A00;
        float A02;
        float A022;
        float A002;
        float A003;
        long A004;
        int i;
        if (c102884kP.A05 == 16606) {
            float A023 = c102884kP.A02(35, 1.0f);
            float A024 = c102884kP.A02(36, 0.0f);
            float A025 = c102884kP.A02(38, 0.0f);
            float A026 = c102884kP.A02(40, 1.0f);
            String A0J = c102884kP.A0J();
            float A005 = AbstractC25231BEo.A00(j);
            float A006 = AbstractC68291VLd.A00(A0J, 0.0f, A005);
            String A0H = c102884kP.A0H();
            float A007 = AbstractC25232BEp.A00(j);
            float A008 = AbstractC68291VLd.A00(A0H, 0.0f, A007);
            List<C102884kP> A0M = c102884kP.A0M();
            C14360o3.A07(A0M);
            ArrayList A0q = AbstractC167017dG.A0q(A0M);
            for (C102884kP c102884kP2 : A0M) {
                C14360o3.A0A(c102884kP2);
                int i2 = c102884kP2.A05;
                if (i2 == 16834) {
                    A00 = CanvasInverseTransform.A00;
                } else {
                    if (AbstractC167007dF.A1P(i2, 16590)) {
                        A02 = c102884kP2.A02(38, 1.0f);
                        A022 = c102884kP2.A02(40, 1.0f);
                        A004 = CXD.A01(c102884kP2.A0G(), A007, AbstractC25235BEs.A00(c102884kP2, A005, 35));
                        i = 0;
                    } else if (i2 == 16607) {
                        A00 = new C26109Bgt(CXD.A01(c102884kP2.A0L(38), A007, AbstractC68291VLd.A00(c102884kP2.A0G(), 0.0f, A005)), c102884kP2.A02(35, 0.0f));
                    } else if (i2 == 16599) {
                        A00 = new C26110Bgu(AbstractC25235BEs.A00(c102884kP2, A005, 35), AbstractC68291VLd.A00(c102884kP2.A0G(), 0.0f, A007));
                    } else {
                        if (i2 == 16589) {
                            A02 = AbstractC25235BEs.A00(c102884kP2, A005, 38);
                            A022 = AbstractC25235BEs.A00(c102884kP2, A007, 40);
                            A002 = AbstractC25235BEs.A00(c102884kP2, A005, 35);
                            A003 = AbstractC68291VLd.A00(c102884kP2.A0G(), 0.0f, A007);
                        } else if (i2 == 16830) {
                            A02 = c102884kP2.A02(38, 0.0f);
                            A022 = c102884kP2.A02(40, 0.0f);
                            A002 = AbstractC25235BEs.A00(c102884kP2, A005, 35);
                            A003 = AbstractC68291VLd.A00(c102884kP2.A0G(), 0.0f, A007);
                        } else if (i2 == 16606) {
                            A00 = A00(c102884kP2, j);
                        } else {
                            throw AbstractC166987dD.A12("Unknown canvas child transform.");
                        }
                        A004 = CXD.A00(A002, A003);
                        i = 1;
                    }
                    A00 = new C26111Bgv(A02, A022, i, A004);
                }
                A0q.add(A00);
            }
            return new C26112Bgw(A0q, A023, A024, A025, A026, A006, A008);
        }
        throw AbstractC166987dD.A12("Expected non-inverse transform model.");
    }
}
