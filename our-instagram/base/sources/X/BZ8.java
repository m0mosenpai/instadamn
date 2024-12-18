package X;

import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class BZ8 extends FrameLayout {
    public WYU A00;

    public final void setUrl(String str, String str2) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        WYU wyu = this.A00;
        if (wyu != null) {
            C70167WEj c70167WEj = wyu.A00;
            if (c70167WEj != null) {
                c70167WEj.A08 = A1a;
            }
            wyu.ABo(new C69062VhD(str2, str, str), C05F.A0C, "");
        }
    }
}
