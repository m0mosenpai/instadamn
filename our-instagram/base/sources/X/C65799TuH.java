package X;

import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.TuH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65799TuH implements C03L {
    public final int A00;
    public final Object A01;

    public C65799TuH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        View view2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c011504d, 1);
                WEV wev = (WEV) this.A01;
                c011504d.A00.A01();
                view2 = wev.A04;
                if (view2 == null) {
                    return c011504d;
                }
                return AbstractC010103p.A05(view2, c011504d);
            case 1:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.A01;
                C011504d c011504d2 = null;
                if (collapsingToolbarLayout.getFitsSystemWindows()) {
                    c011504d2 = c011504d;
                }
                if (!C02O.A00(collapsingToolbarLayout.A09, c011504d2)) {
                    collapsingToolbarLayout.A09 = c011504d2;
                    collapsingToolbarLayout.requestLayout();
                }
                return c011504d.A00.A0A();
            case 2:
                AbstractC70175WEx abstractC70175WEx = (AbstractC70175WEx) this.A01;
                int A02 = c011504d.A02();
                Handler handler = AbstractC70175WEx.A0D;
                abstractC70175WEx.A01 = A02;
                C011304b c011304b = c011504d.A00;
                abstractC70175WEx.A02 = c011304b.A03().A01;
                abstractC70175WEx.A03 = c011304b.A03().A02;
                AbstractC70175WEx.A02(abstractC70175WEx);
                return c011504d;
            default:
                N53 n53 = (N53) this.A01;
                if (n53.A01.getFitsSystemWindows()) {
                    View rootView = view.getRootView();
                    RectF rectF = AbstractC13880nE.A01;
                    C14360o3.A0B(rootView, 0);
                    int systemUiVisibility = rootView.getSystemUiVisibility();
                    if ((systemUiVisibility & 2) != 0 || (systemUiVisibility & 512) != 0 || (systemUiVisibility & 4) != 0) {
                        int A022 = c011504d.A02() - c011504d.A00.A01().A00;
                        C04Z c04z = new C04Z();
                        C02I A00 = C02I.A00(0, 0, 0, A022);
                        AbstractC011204a abstractC011204a = c04z.A00;
                        abstractC011204a.A06(A00);
                        c011504d = abstractC011204a.A00();
                    }
                }
                view2 = n53.A01;
                return AbstractC010103p.A05(view2, c011504d);
        }
    }
}
