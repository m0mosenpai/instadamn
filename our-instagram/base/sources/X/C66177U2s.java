package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U2s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66177U2s extends C1I4 implements InterfaceC65626Tpm {
    public int A00;
    public final List A01;
    public final int A02;
    public final Activity A03;
    public final UserSession A04;
    public final boolean A05;

    public C66177U2s(Activity activity, UserSession userSession, List list, int i, int i2) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = activity;
        this.A01 = list;
        this.A05 = true;
        this.A02 = i + i2;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    public final void A00(int i) {
        C3DO c3do = C3DN.A00;
        Activity activity = this.A03;
        C3DN A00 = c3do.A00(activity);
        if (A00 != null && ((C3DP) A00).A0h) {
            return;
        }
        float f = 1.0f - (i / this.A02);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = (1.0f - f) + 0.2f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(f2);
        }
        if (!this.A05 || C1H6.A03()) {
            return;
        }
        if (f == 0.0f && AbstractC56402iY.A0A(activity)) {
            AbstractC56402iY.A06(activity, false);
        }
        boolean A0A = AbstractC56402iY.A0A(activity);
        if (f > 0.2f) {
            if (A0A) {
                return;
            }
            AbstractC56402iY.A06(activity, true);
        } else {
            if (!A0A) {
                return;
            }
            AbstractC56402iY.A06(activity, false);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC43593JPy.A1Q(it.next());
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        A00(this.A00);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        if (this.A05 && !C1H6.A03()) {
            Activity activity = this.A03;
            if (!AbstractC56402iY.A0A(activity)) {
                AbstractC145016gM.A04(activity, this.A04, false);
            }
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(2091005857);
        C14360o3.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset < 0) {
            computeVerticalScrollOffset = 0;
        }
        this.A00 = computeVerticalScrollOffset;
        A00(computeVerticalScrollOffset);
        C0f9.A0A(1494574719, A03);
    }
}
