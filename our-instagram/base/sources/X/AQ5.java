package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AQ5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C105154oV A00;

    public AQ5(C105154oV c105154oV) {
        this.A00 = c105154oV;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C25317BIm c25317BIm = this.A00.A04;
        if (c25317BIm != null) {
            c25317BIm.A01();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C25317BIm c25317BIm = this.A00.A04;
        if (c25317BIm != null) {
            c25317BIm.A08.cancel();
        }
    }
}
