package X;

import java.util.List;

/* renamed from: X.Apf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24274Apf implements Runnable {
    public final /* synthetic */ C180177z7 A00;

    public RunnableC24274Apf(C180177z7 c180177z7) {
        this.A00 = c180177z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C180177z7 c180177z7 = this.A00;
        WIL wil = c180177z7.A0K;
        C180177z7.A03(wil, c180177z7.A0M);
        List list = c180177z7.A0E.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C180177z7.A03(wil, (C176507t8) list.get(i));
        }
        WIL wil2 = c180177z7.A0K;
        if (wil2 != null) {
            if (c180177z7.A0G) {
                c180177z7.A0K = null;
                wil2.A01();
            } else {
                wil2.A00();
            }
        }
        C176507t8 c176507t8 = c180177z7.A0L;
        c180177z7.A0L = null;
        if (c176507t8 != null) {
            c176507t8.A01();
        }
        C176507t8 c176507t82 = c180177z7.A0M;
        c180177z7.A0M = null;
        if (c176507t82 != null) {
            c176507t82.A01();
        }
    }
}
