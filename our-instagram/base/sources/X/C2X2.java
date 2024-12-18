package X;

import android.view.View;

/* renamed from: X.2X2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2X2 implements View.OnLongClickListener {
    public C2V9 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.COU] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C14360o3.A0B(view, 0);
        C2V9 c2v9 = this.A00;
        if (c2v9 == 0) {
            return false;
        }
        C2XV.A00();
        ?? obj = new Object();
        obj.A00 = view;
        Object A00 = c2v9.A00(obj);
        if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
            return true;
        }
        return false;
    }
}
