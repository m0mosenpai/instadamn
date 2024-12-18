package X;

import android.content.ComponentName;

/* renamed from: X.027, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass027 {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public final void A00(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
        } else {
            int i2 = this.A00;
            if (i2 == i) {
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A02(i, i2, "Given job ID ", " is different than previous "));
            }
        }
    }

    public AnonymousClass027(ComponentName componentName) {
        this.A02 = componentName;
    }
}
