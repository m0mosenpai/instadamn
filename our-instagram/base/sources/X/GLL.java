package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GLL implements Runnable {
    public final /* synthetic */ ELx A00;

    public GLL(ELx eLx) {
        this.A00 = eLx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if ("there's already an e2ee thread for them".length() > 0) {
            Context context = this.A00.A00;
            if (context == null) {
                C14360o3.A0F("directThemedContext");
                throw C00O.createAndThrow();
            }
            C9GR.A09(context, "there's already an e2ee thread for them");
        }
    }
}
