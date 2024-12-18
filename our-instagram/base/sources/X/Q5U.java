package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class Q5U extends C00H {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C58766Q7v A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5U(FragmentActivity fragmentActivity, C58766Q7v c58766Q7v) {
        super(true);
        this.A00 = fragmentActivity;
        this.A01 = c58766Q7v;
    }

    @Override // X.C00H
    public final void A01() {
        FragmentActivity fragmentActivity = this.A00;
        fragmentActivity.setResult(0, C58766Q7v.A00(null, this.A01, null, C05F.A0C, null, null, null, null, null));
        fragmentActivity.finish();
    }
}
