package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.WOg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70260WOg implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ C67777Uxt A00;

    public C70260WOg(C67777Uxt c67777Uxt) {
        this.A00 = c67777Uxt;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        C67777Uxt c67777Uxt = this.A00;
        c67777Uxt.A06 = true;
        c67777Uxt.A00 = System.currentTimeMillis();
        C67777Uxt.A02(c67777Uxt, false);
    }
}
