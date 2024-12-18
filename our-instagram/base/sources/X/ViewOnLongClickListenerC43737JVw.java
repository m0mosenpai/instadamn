package X;

import android.view.View;

/* renamed from: X.JVw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnLongClickListenerC43737JVw implements View.OnLongClickListener {
    public final /* synthetic */ C163107Rv A00;
    public final /* synthetic */ C43740JVz A01;

    public ViewOnLongClickListenerC43737JVw(C163107Rv c163107Rv, C43740JVz c43740JVz) {
        this.A01 = c43740JVz;
        this.A00 = c163107Rv;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C7ZX c7zx = this.A01.A0B;
        if (c7zx != null) {
            C163107Rv c163107Rv = this.A00;
            c7zx.DDJ(c163107Rv.A09, c163107Rv.A0D);
            return true;
        }
        return true;
    }
}
