package X;

import android.widget.FrameLayout;

/* renamed from: X.Hzp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40631Hzp {
    public static void A00(C62862tP c62862tP, IGS igs, C103464lM c103464lM) {
        C914346k c914346k;
        C103434lJ c103434lJ = c103464lM.A02;
        if (c103434lJ == null && (c914346k = c103464lM.A03) != null) {
            c103434lJ = AbstractC40567Hyn.A00(c914346k).A01;
            c103464lM.A02 = c103434lJ;
        }
        if (c103434lJ == null) {
            C0w9.A03("null_bloks_data_adapter", AbstractC111324zv.A00(3686));
            return;
        }
        if (c103464lM.A09) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            igs.A01.setLayoutParams(layoutParams);
        }
        C6T7 c6t7 = c103464lM.A01;
        if (c6t7 == null && c103464lM.A01() != null) {
            c6t7 = AbstractC37301Gc2.A0B(igs.A01.getContext(), C1338462s.A02(null, c103464lM.A01()), c62862tP);
            c103464lM.A01 = c6t7;
            c62862tP.A05(new C60929Rbj(6, c62862tP, c103464lM, c6t7));
        }
        C6T7 c6t72 = igs.A00;
        if (c6t72 != c6t7) {
            if (c6t72 != null) {
                c6t72.A04();
            }
            igs.A00 = c6t7;
            if (c6t7 != null) {
                c6t7.A07(igs.A02);
            }
        }
        C102884kP A00 = c103464lM.A00();
        A00.getClass();
        String.valueOf(A00.A0D());
    }
}
