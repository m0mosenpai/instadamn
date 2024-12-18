package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.J4b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43112J4b implements Runnable {
    public final /* synthetic */ C3Y1 A00;
    public final /* synthetic */ C75113Zb A01;

    public RunnableC43112J4b(C3Y1 c3y1, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = c3y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3FP c3fp;
        if (this.A01.A13 == C05F.A00) {
            C3Y1 c3y1 = this.A00;
            if (c3y1.A02) {
                ViewGroup viewGroup = c3y1.A07;
                C14360o3.A0C(viewGroup, AbstractC111324zv.A00(2));
                Object invoke = c3y1.A00().A00.A04.invoke();
                if ((invoke instanceof C3FP) && (c3fp = (C3FP) invoke) != null) {
                    Rect A0U = AbstractC166987dD.A0U();
                    Rect A0U2 = AbstractC166987dD.A0U();
                    RectF rectF = AbstractC13880nE.A01;
                    C14360o3.A0B(viewGroup, 0);
                    RectF rectF2 = AbstractC13880nE.A01;
                    AbstractC13880nE.A0M(rectF2, viewGroup);
                    rectF2.round(A0U);
                    c3fp.BA7(A0U2);
                    int i = A0U.top;
                    if (i != A0U2.top) {
                        C18950wb c18950wb = C18950wb.A01;
                        C0f5 AEp = c18950wb.AEp("WatchAndBrowseMediaViewHolder", 817903741);
                        AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A02(i, A0U2.top, "scrolled media view distance to top of screen is: ", ", ViewPortAreaTop is: "));
                        AEp.report();
                        if (c3y1.A03) {
                            C0f5 AEp2 = c18950wb.AEp("WatchAndBrowseMediaViewHolder", 817903741);
                            AEp2.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A02(i, A0U2.top, "not enough space to scroll, scrolled media view distance to top of screen is: ", ", ViewPortAreaTop is: "));
                            AEp2.report();
                        }
                    }
                }
            }
        }
    }
}
