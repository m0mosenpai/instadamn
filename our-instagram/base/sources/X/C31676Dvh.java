package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Dvh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31676Dvh extends AbstractRunnableC14200nk {
    public final /* synthetic */ JR2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31676Dvh(JR2 jr2) {
        super(1857862624, 2, false, false);
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JR2 jr2 = this.A00;
        C5e4 c5e4 = jr2.A0K;
        if (c5e4 == null) {
            C14360o3.A0F("banyanClient");
        } else {
            C121305eT A01 = c5e4.A01("direct_ibc_inbox_invitations");
            ArrayList A1E = AbstractC166987dD.A1E();
            HashSet A0D = ((C2DU) jr2.A0w()).A0C.A0D(jr2.A0u());
            for (DirectShareTarget directShareTarget : A01.A02) {
                if (!AbstractC001800i.A0u(A0D, directShareTarget.A08())) {
                    A1E.add(directShareTarget);
                }
            }
            if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36317908448581291L)) {
                jr2.A0y = A1E;
                if (C14360o3.A0K(jr2.A0t(), C47062Du.A00)) {
                    if (!A1E.isEmpty() && !jr2.A12) {
                        F3T.A00(jr2.A0p()).A0C("inbox");
                        jr2.A12 = true;
                    }
                    C43626JRj A0q = jr2.A0q();
                    C43970JcJ c43970JcJ = A0q.A0E;
                    if (!c43970JcJ.A0K.isEmpty() || !A1E.isEmpty()) {
                        ArrayList A0q2 = AbstractC167017dG.A0q(A1E);
                        int i = 0;
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                AbstractC16960so.A1U();
                            } else {
                                A0q2.add(new C32083E8h((DirectShareTarget) next, i));
                                i = i2;
                            }
                        }
                        c43970JcJ.A0K = A0q2;
                        C43626JRj.A03(A0q);
                    }
                }
            }
            C11T.A02(new RunnableC31678Dvj(jr2, A1E));
            return;
        }
        throw C00O.createAndThrow();
    }
}
