package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.VQj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68427VQj {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        int A0E;
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        Fragment A00 = C6BQ.A00(C6BQ.A09(c6fq));
        if (A00 instanceof C72743Nv) {
            C72743Nv c72743Nv = (C72743Nv) A00;
            if (c72743Nv.A08 != null) {
                IgBloksScreenConfig igBloksScreenConfig = c72743Nv.A09;
                Integer num = igBloksScreenConfig.A0J;
                if (num != null) {
                    U6N.A00(igBloksScreenConfig.A0B).A03(num.intValue());
                }
                igBloksScreenConfig.A06 = C1338462s.A00(c6fq, c102884kP);
                C6T7 c6t7 = c72743Nv.A0B;
                if (c6t7 != null) {
                    c6t7.A03();
                    c72743Nv.A0B = null;
                }
                if (c72743Nv.A07 == null) {
                    c72743Nv.A02 = new FrameLayout(c72743Nv.requireContext());
                    U3u u3u = new U3u(c72743Nv.requireContext());
                    c72743Nv.A07 = u3u;
                    c72743Nv.A02.addView(u3u);
                    MSY.A10(c72743Nv.A07, -2, -1);
                    C126545np c126545np = c72743Nv.A07;
                    if (c72743Nv.A0I) {
                        A0E = 0;
                    } else {
                        A0E = AbstractC167017dG.A0E(c72743Nv.requireContext());
                    }
                    C56352iT.A0t.A03(c72743Nv.A03).ESo(c126545np, A0E, 0, false);
                }
                C6T7 c6t72 = c72743Nv.A0B;
                if (c6t72 != null) {
                    c6t72.A03();
                }
                C6T7 A002 = C6T7.A00(c72743Nv.requireContext(), C1338462s.A04(c102884kP), c72743Nv.A08).A00();
                c72743Nv.A0B = A002;
                A002.A07(c72743Nv.A07);
                return null;
            }
            return null;
        }
        return null;
    }
}
