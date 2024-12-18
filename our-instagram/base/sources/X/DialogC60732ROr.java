package X;

import android.content.Context;

/* renamed from: X.ROr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogC60732ROr extends Q5b {
    public final /* synthetic */ AbstractC60733ROs A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC60732ROr(Context context, AbstractC60733ROs abstractC60733ROs, int i) {
        super(context, i);
        this.A00 = abstractC60733ROs;
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public final void onBackPressed() {
        if (!this.A00.A0H()) {
            super.onBackPressed();
        }
    }
}
