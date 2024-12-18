package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V8L extends C1I2 implements InterfaceC65626Tpm {
    public final int A00;
    public final Activity A01;
    public final ViewOnTouchListenerC60632pm A02;
    public final UserSession A03;
    public final List A04;
    public final boolean A05;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    private final void A00(float f) {
        float f2 = 1.0f - (f / this.A00);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(f2);
        }
    }

    public final void A01() {
        C3DO c3do = C3DN.A00;
        Activity activity = this.A01;
        C3DN A00 = c3do.A00(activity);
        if (A00 != null && ((C3DP) A00).A0h) {
            return;
        }
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
        float f = viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01;
        A00(f);
        if (!this.A05 || C1H6.A03()) {
            return;
        }
        if (f > 25.0f && !AbstractC56402iY.A0A(activity)) {
            AbstractC56402iY.A06(activity, true);
        } else {
            if (f != 0.0f || !AbstractC56402iY.A0A(activity)) {
                return;
            }
            AbstractC56402iY.A06(activity, false);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AbstractC43593JPy.A1Q(it.next());
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
        A00(viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        if (this.A05 && !C1H6.A03()) {
            Activity activity = this.A01;
            if (!AbstractC56402iY.A0A(activity)) {
                AbstractC145016gM.A04(activity, this.A03, false);
            }
        }
    }

    public V8L(Activity activity, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, List list, int i, boolean z) {
        AbstractC167017dG.A1Q(userSession, list);
        this.A03 = userSession;
        this.A01 = activity;
        this.A04 = list;
        this.A02 = viewOnTouchListenerC60632pm;
        this.A00 = i;
        this.A05 = z;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(662129944);
        A01();
        C0f9.A0A(1063520295, A03);
    }
}
