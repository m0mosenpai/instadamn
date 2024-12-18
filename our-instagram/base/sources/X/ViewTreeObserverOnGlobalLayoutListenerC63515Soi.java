package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Soi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC63515Soi implements ViewTreeObserver.OnGlobalLayoutListener {
    public double A00;
    public int A01;
    public Point A02 = null;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ View A05;
    public final /* synthetic */ C63153Se1 A06;
    public final /* synthetic */ List A07;

    public ViewTreeObserverOnGlobalLayoutListenerC63515Soi(View view, C63153Se1 c63153Se1, List list) {
        this.A06 = c63153Se1;
        this.A05 = view;
        this.A07 = list;
        this.A00 = c63153Se1.A00;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C63305ShB c63305ShB;
        Rect A0U = AbstractC166987dD.A0U();
        View view = this.A05;
        view.getWindowVisibleDisplayFrame(A0U);
        Point point = new Point();
        FragmentActivity fragmentActivity = this.A06.A01;
        fragmentActivity.getWindowManager().getDefaultDisplay().getSize(point);
        if (this.A02 == null) {
            this.A02 = point;
            return;
        }
        boolean z = true;
        boolean A1P = AbstractC167007dF.A1P(AbstractC58319PtB.A08(fragmentActivity).orientation, 2);
        if (A0U.height() >= point.y - 100) {
            z = false;
        }
        int height = view.getRootView().getHeight() - ((int) (A0U.height() * this.A00));
        if (z != this.A03 || A1P != this.A04 || height != this.A01) {
            for (SDO sdo : this.A07) {
                boolean z2 = this.A03;
                boolean z3 = this.A04;
                C63153Se1 c63153Se1 = sdo.A01;
                BrowserLiteFragment browserLiteFragment = c63153Se1.A02;
                if (browserLiteFragment != null) {
                    if (z && (c63305ShB = c63153Se1.A04) != null) {
                        c63305ShB.A07(browserLiteFragment.A09, sdo.A00);
                    }
                    BrowserLiteFragment browserLiteFragment2 = c63153Se1.A02;
                    List list = browserLiteFragment2.A0o;
                    if (list != null) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        ACQ A0Q = AbstractC58321PtD.A0Q(browserLiteFragment2, "onSoftKeyboardOrOrientationChanged", A1C);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((BEG) it.next()).DnJ(z2, height, z, z3, A1P);
                        }
                        A0Q.A00(AbstractC166997dE.A0x(".End", A1C));
                    }
                }
            }
        }
        this.A01 = height;
        this.A03 = z;
        this.A04 = A1P;
    }
}
