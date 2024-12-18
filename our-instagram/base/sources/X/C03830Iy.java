package X;

import android.os.Process;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03830Iy {
    public final C0J2 A02;
    public Map A01 = new HashMap();
    public long A00 = Long.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.0J2] */
    public final synchronized void A00(int i) {
        String A00;
        if (i != this.A02.A00 && (A00 = C0J3.A00(i)) != null) {
            ?? obj = new Object();
            obj.A00 = i;
            obj.A01 = A00;
            this.A01.put(Integer.valueOf(i), obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0J2] */
    public C03830Iy() {
        int myPid = Process.myPid();
        String A00 = C0J3.A00(myPid);
        A00 = A00 == null ? "" : A00;
        ?? obj = new Object();
        obj.A00 = myPid;
        obj.A01 = A00;
        this.A02 = obj;
    }
}
