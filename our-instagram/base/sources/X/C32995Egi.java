package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.nux.activity.SignedOutFragmentActivity;

/* renamed from: X.Egi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32995Egi extends ESM {
    public final /* synthetic */ SignedOutFragmentActivity A00;

    public C32995Egi(FragmentActivity fragmentActivity, C07270a1 c07270a1, SignedOutFragmentActivity signedOutFragmentActivity) {
        String A00 = AbstractC31189DnY.A00();
        this.A00 = signedOutFragmentActivity;
        this.A01 = c07270a1;
        super.A00 = fragmentActivity;
        this.A03 = true;
        this.A02 = A00;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-501039696);
        super.onFinish();
        C6WQ c6wq = this.A00.A05;
        if (c6wq != null && (c6wq.getOwnerActivity() == null || !c6wq.getOwnerActivity().isDestroyed())) {
            c6wq.cancel();
        }
        C0f9.A0A(-1182319771, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1542189077);
        super.onStart();
        C6WQ c6wq = this.A00.A05;
        if (c6wq != null && !c6wq.isShowing()) {
            C0fJ.A00(c6wq);
            new Handler().postDelayed(new RunnableC36847GLu(this), 10000L);
        }
        C0f9.A0A(-1860279756, A03);
    }
}
