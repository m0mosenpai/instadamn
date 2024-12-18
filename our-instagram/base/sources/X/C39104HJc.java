package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.HJc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39104HJc extends AbstractC18280vF {
    public final /* synthetic */ C60662pp A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39104HJc(C60662pp c60662pp) {
        super("scheduleMegaphone", 696053296, 3, false, false);
        this.A00 = c60662pp;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C60662pp c60662pp = this.A00;
        FragmentActivity activity = c60662pp.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new J4C(c60662pp));
        }
    }
}
