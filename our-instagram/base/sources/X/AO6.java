package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AO6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Runnable A00;

    public AO6(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.run();
    }
}
