package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Ika, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnPreDrawListenerC42067Ika implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ C41583IaW A02;

    public ViewTreeObserverOnPreDrawListenerC42067Ika(ViewTreeObserver viewTreeObserver, C41583IaW c41583IaW, int i) {
        this.A02 = c41583IaW;
        this.A01 = viewTreeObserver;
        this.A00 = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int Ayo;
        this.A01.removeOnPreDrawListener(this);
        C41583IaW c41583IaW = this.A02;
        C3FQ c3fq = c41583IaW.A02;
        int B6q = c3fq.B6q();
        if (c3fq.AZU() != null) {
            for (int i = 0; i < c3fq.AnZ(); i++) {
                View AnU = c3fq.AnU(i);
                int i2 = B6q + i;
                if (i2 < c3fq.AZU().getCount()) {
                    Object item = c3fq.AZU().getItem(i2);
                    if (item != null && c41583IaW.A01.CX4(item, AnU.getTag())) {
                        AnU.setAlpha(0.0f);
                        AnU.animate().setDuration(100L).alpha(1.0f);
                    } else {
                        Number number = (Number) c41583IaW.A03.get(AnonymousClass001.A0O(C41583IaW.A00(c41583IaW, i2), AnU.hashCode()));
                        int top = AnU.getTop();
                        if (number != null) {
                            int intValue = number.intValue();
                            if (intValue != top) {
                                Ayo = intValue - top;
                            }
                        } else {
                            Ayo = this.A00 + c3fq.Ayo();
                        }
                        AnU.setAlpha(1.0f);
                        AnU.setTranslationY(Ayo);
                        c41583IaW.A00.A0A(new H8H(Ayo, 0, AnU, c41583IaW));
                    }
                }
            }
        }
        c41583IaW.A00.A04();
        c41583IaW.A03.clear();
        return true;
    }
}
