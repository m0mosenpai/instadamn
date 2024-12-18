package X;

import android.view.View;

/* renamed from: X.OkQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnFocusChangeListenerC55471OkQ implements View.OnFocusChangeListener {
    public final /* synthetic */ C139706Tz A00;

    public ViewOnFocusChangeListenerC55471OkQ(C139706Tz c139706Tz) {
        this.A00 = c139706Tz;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            AbstractC13880nE.A0O(this.A00.A02());
        }
    }
}
