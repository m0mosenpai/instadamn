package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class PPF implements Runnable {
    public final /* synthetic */ C52229N9s A00;

    public PPF(C52229N9s c52229N9s) {
        this.A00 = c52229N9s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A00;
        C9GR.A03(context, context.getString(2131976159), "onPublishHighlightTapped_unknown_error_occured", 0);
    }
}
