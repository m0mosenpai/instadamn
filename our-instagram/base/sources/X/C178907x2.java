package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178907x2 {
    public static final Map A0H = Collections.synchronizedMap(new HashMap());
    public Handler A00;
    public final int A01;
    public final Context A02;
    public final InterfaceC178897x1 A03;
    public final InterfaceC178897x1 A04;
    public final C178847ww A05;
    public final C178947x6 A06;
    public final C1814082s A07 = new C1814082s();
    public final Object A08 = new Object();
    public final boolean A09;
    public final boolean A0A;
    public final C178887x0 A0B;
    public final C178877wz A0C;
    public volatile Looper A0D;
    public volatile InterfaceC180227zC A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.RuntimeException, X.B4J] */
    public static void A00(C178907x2 c178907x2) {
        InterfaceC180227zC interfaceC180227zC = c178907x2.A0E;
        if (interfaceC180227zC != null) {
            try {
                List list = c178907x2.A07.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC179087xK) list.get(i)).detach();
                }
                interfaceC180227zC.release();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final InterfaceC180227zC A01() {
        InterfaceC180227zC interfaceC180227zC;
        synchronized (this.A08) {
            interfaceC180227zC = null;
            C178907x2 c178907x2 = (C178907x2) A0H.get(Looper.myLooper());
            if (c178907x2 != null) {
                interfaceC180227zC = c178907x2.A0E;
            }
            interfaceC180227zC.getClass();
        }
        return interfaceC180227zC;
    }

    public final void A02() {
        if (this.A0A && !this.A0G) {
            synchronized (this.A08) {
                this.A0G = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.RuntimeException, X.B4J] */
    public final void A03(InterfaceC179087xK interfaceC179087xK) {
        Object obj = this.A08;
        C1814082s c1814082s = this.A07;
        if (interfaceC179087xK != null) {
            synchronized (obj) {
                try {
                    if (!c1814082s.A00.contains(interfaceC179087xK)) {
                        interfaceC179087xK.CNk(this);
                        InterfaceC180227zC interfaceC180227zC = this.A0E;
                        if (interfaceC180227zC != null && A06()) {
                            interfaceC179087xK.ACv(interfaceC180227zC);
                        }
                        c1814082s.A01(interfaceC179087xK);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4J] */
    public final void A04(InterfaceC179087xK interfaceC179087xK) {
        Object obj = this.A08;
        C1814082s c1814082s = this.A07;
        if (interfaceC179087xK != null) {
            synchronized (obj) {
                try {
                    if (c1814082s.A02(interfaceC179087xK) && this.A0E != null) {
                        interfaceC179087xK.detach();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.9ty, X.9b5] */
    public final void A05(B4J b4j) {
        C178887x0 c178887x0 = this.A0B;
        ?? abstractC223559ty = new AbstractC223559ty(31000, b4j);
        C178797wr c178797wr = c178887x0.A00;
        InterfaceC178837wv interfaceC178837wv = c178797wr.A02;
        if (interfaceC178837wv != 0) {
            interfaceC178837wv.DRi(abstractC223559ty);
        }
        C178797wr.A00(c178797wr, abstractC223559ty);
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A08) {
            InterfaceC180227zC interfaceC180227zC = this.A0E;
            Looper looper = this.A0D;
            if (interfaceC180227zC != null && (!this.A0G || looper == Looper.myLooper())) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C178907x2(Context context, Looper looper, C178887x0 c178887x0, InterfaceC178897x1 interfaceC178897x1, C178847ww c178847ww, C178877wz c178877wz) {
        this.A02 = context;
        this.A05 = c178847ww;
        C178857wx c178857wx = C178847ww.A07;
        Map map = c178847ww.A00;
        Object obj = map.get(c178857wx);
        int intValue = ((Number) (obj != null ? obj : 3)).intValue();
        this.A01 = intValue;
        C178857wx c178857wx2 = C178847ww.A02;
        Object obj2 = C178867wy.A05;
        Object obj3 = map.get(c178857wx2);
        this.A03 = C178917x3.A01(obj3 != null ? obj3 : obj2, intValue);
        this.A04 = interfaceC178897x1;
        this.A0B = c178887x0;
        this.A00 = new Handler(looper);
        this.A0D = looper;
        Object obj4 = map.get(C178847ww.A01);
        this.A09 = ((Boolean) (obj4 != null ? obj4 : false)).booleanValue();
        Object obj5 = map.get(C178847ww.A09);
        this.A0A = ((Boolean) (obj5 != null ? obj5 : true)).booleanValue();
        this.A06 = new C178947x6((Looper) map.get(C178847ww.A0A));
        this.A0C = c178877wz;
    }
}
