package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: X.Tw1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65897Tw1 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC189488aT A01;
    public final /* synthetic */ C3DP A02;

    public final void A03(Integer num) {
        C14360o3.A0B(num, 0);
        C3DP c3dp = this.A02;
        for (InterfaceC86363t8 interfaceC86363t8 : c3dp.A10) {
            interfaceC86363t8.D5o();
            interfaceC86363t8.D5p(num);
        }
        C68815VcW c68815VcW = c3dp.A0C;
        if (c68815VcW != null) {
            c68815VcW.A00.FD0(VD2.A05, AbstractC68583VWk.A00(num));
        }
        if (c3dp.A0Q) {
            c3dp.A0D();
        }
    }

    public C65897Tw1(Fragment fragment, InterfaceC189488aT interfaceC189488aT, C3DP c3dp) {
        this.A02 = c3dp;
        this.A00 = fragment;
        this.A01 = interfaceC189488aT;
    }

    public final void A00() {
        C3DP c3dp = this.A02;
        if (c3dp.A0l) {
            C3DP.A05(this.A00, c3dp, C05F.A1I);
            return;
        }
        C3DN A00 = C3DN.A00.A00(c3dp.A0s);
        if (A00 == null) {
            return;
        }
        A00.A0Y();
    }

    public final void A01(int i, int i2) {
        C3DP c3dp = this.A02;
        Iterator it = c3dp.A10.iterator();
        while (it.hasNext()) {
            ((InterfaceC86363t8) it.next()).DZk(i, i2);
        }
        if (c3dp.A0Z) {
            float Cpk = this.A01.Cpk();
            C37910Gm7 c37910Gm7 = c3dp.A0E;
            if (c37910Gm7 == null || c37910Gm7.A00) {
                float height = C3DP.A02(c3dp).getHeight();
                float f = height - (Cpk * height);
                float f2 = i;
                float height2 = (f2 - f) / (C3DP.A02(c3dp).getHeight() - f);
                float f3 = 1.0f;
                if (f2 > f) {
                    f3 = 1.0f - height2;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                }
                C3DP.A01(c3dp).setAlpha(f3);
                int i3 = c3dp.A03;
                if (i3 != 255) {
                    AbstractC56402iY.A02(c3dp.A0s, AbstractC56842jH.A06(i3, (int) (f3 * 128.0f)));
                }
            }
        }
        if (c3dp.A0j) {
            Context context = C3DP.A02(c3dp).getContext();
            C14360o3.A07(context);
            float A00 = AbstractC13890nF.A00(context);
            C25671My A002 = AbstractC25651Mw.A00(c3dp.A0w);
            boolean z = false;
            if ((A00 - i) / A00 < 0.8d) {
                z = true;
            }
            A002.E4s(new C3MY(z));
        }
    }

    public final void A02(C51752Mtb c51752Mtb) {
        Iterator it = this.A02.A10.iterator();
        while (it.hasNext()) {
            ((InterfaceC86363t8) it.next()).Dyj(c51752Mtb);
        }
    }
}
