package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOI implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8JT A01;

    public AOI(C8JT c8jt, int i) {
        this.A01 = c8jt;
        this.A00 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8JT c8jt = this.A01;
        c8jt.A0p = true;
        C8JT.A0s(c8jt, this.A00);
    }
}
