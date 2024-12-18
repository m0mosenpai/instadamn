package X;

import android.view.ViewGroup;

/* renamed from: X.AqA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24305AqA implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public RunnableC24305AqA(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.announceForAccessibility(viewGroup.getResources().getString(2131969308));
    }
}
