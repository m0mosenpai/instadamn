package X;

import android.view.View;

/* renamed from: X.WNg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLongClickListenerC70243WNg implements View.OnLongClickListener {
    public final /* synthetic */ int A00;

    public ViewOnLongClickListenerC70243WNg(int i) {
        this.A00 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return view.performAccessibilityAction(this.A00, null);
    }
}
