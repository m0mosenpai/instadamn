package X;

import android.view.View;

/* renamed from: X.2YG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YG implements View.OnFocusChangeListener {
    public C2V9 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2YI, java.lang.Object] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C2V9 c2v9 = this.A00;
        if (c2v9 != 0) {
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = view;
            c2v9.A00(obj);
        }
    }
}
