package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public abstract class Rk2 extends Exception {
    public final Intent A00;

    public Rk2(Intent intent) {
        super("Google Play Services not available");
        this.A00 = intent;
    }
}
