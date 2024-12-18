package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOR implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public AOR(C8JT c8jt, Runnable runnable, boolean z) {
        this.A00 = c8jt;
        this.A02 = z;
        this.A01 = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8JT c8jt = this.A00;
        AnonymousClass229.A01(c8jt.A1D).A1m(MSV.A00(746));
        C8JT.A17(c8jt, this.A01);
    }
}
