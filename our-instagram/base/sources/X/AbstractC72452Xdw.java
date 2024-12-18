package X;

import android.os.Bundle;

/* renamed from: X.Xdw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72452Xdw extends Exception {
    public final int A00;
    public final Bundle A01;

    public AbstractC72452Xdw(Bundle bundle, String str, Throwable th, int i) {
        super(str, th);
        this.A00 = i;
        this.A01 = bundle;
    }
}
