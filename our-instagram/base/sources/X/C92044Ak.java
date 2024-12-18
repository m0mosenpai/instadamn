package X;

import android.os.Process;

/* renamed from: X.4Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92044Ak extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int myTid = Process.myTid();
        C92064Am c92064Am = C92064Am.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (c92064Am) {
            if (valueOf != null) {
                c92064Am.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (c92064Am) {
            if (valueOf != null) {
                c92064Am.A01.remove(valueOf);
                c92064Am.A00.remove(valueOf);
            }
        }
    }
}
