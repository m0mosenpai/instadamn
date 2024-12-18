package X;

import androidx.preference.PreferenceGroup;

/* renamed from: X.WqH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71226WqH implements Runnable {
    public final /* synthetic */ PreferenceGroup A00;

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.A00.A05.clear();
        }
    }

    public RunnableC71226WqH(PreferenceGroup preferenceGroup) {
        this.A00 = preferenceGroup;
    }
}
