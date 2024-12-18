package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.W6e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70132W6e {
    public static final void A01(FragmentActivity fragmentActivity, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP) {
        AbstractC167007dF.A1E(fragmentActivity, 0, c102884kP);
        C193328hC c193328hC = new C193328hC((Context) fragmentActivity);
        String A0F = c102884kP.A0F();
        if (A0F != null && A0F.length() != 0) {
            c193328hC.A05 = A0F;
        }
        String A0L = c102884kP.A0L(35);
        if (A0L != null && A0L.length() != 0) {
            c193328hC.A0r(A0L);
        }
        C102884kP A08 = c102884kP.A08(36);
        if (A08 != null) {
            InterfaceC103384lE A0B = A08.A0B(35);
            String A0L2 = A08.A0L(36);
            if (A0L2 != null && A0B != null) {
                c193328hC.A0d(new DialogInterfaceOnClickListenerC70207WHl(0, c6fg, c6fq, A08, A0B), A0L2);
            }
        }
        C102884kP A082 = c102884kP.A08(38);
        if (A082 != null) {
            InterfaceC103384lE A0B2 = A082.A0B(35);
            String A0L3 = A082.A0L(36);
            if (A0L3 != null && A0B2 != null) {
                c193328hC.A0c(new DialogInterfaceOnClickListenerC70207WHl(1, c6fg, c6fq, A082, A0B2), A0L3);
            }
        }
        AbstractC166987dD.A1W(c193328hC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        if (r1.A07 == null) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.WpW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C6FQ r14, X.C102884kP r15, X.C102884kP r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70132W6e.A02(X.6FQ, X.4kP, X.4kP, java.util.Map):void");
    }

    public static final void A00(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2) {
        AbstractC167017dG.A1N(abstractC10360h2, fragmentActivity);
        if (abstractC10360h2.A0L() > 0 && !abstractC10360h2.A0G) {
            abstractC10360h2.A0b();
        } else {
            fragmentActivity.onBackPressed();
        }
    }
}
