package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04240Kq {
    public static volatile C04240Kq A03;
    public final Context A00;
    public final AtomicInteger A01;
    public final AtomicReference A02;

    public C04240Kq(Context context) {
        this.A01 = new AtomicInteger(1);
        this.A02 = new AtomicReference();
        this.A00 = context.getApplicationContext();
    }

    public C04240Kq() {
    }
}
