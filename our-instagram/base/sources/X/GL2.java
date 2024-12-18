package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GL2 implements Runnable {
    public final /* synthetic */ EI4 A00;

    public GL2(EI4 ei4) {
        this.A00 = ei4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            C9GR.A0F(context, "AI Subscription item deletion", 2131952871);
        }
    }
}
