package X;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95904Sz {
    public final long A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final C95804So A03;
    public final InterfaceC95764Sk A04;
    public final C42351xP A05;
    public final C95504Rk A06;
    public final InterfaceC95894Sy videoLoggerHandler;

    public final void A01(C123205hv c123205hv, Boolean bool, Boolean bool2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, boolean z) {
        this.A02.getAndIncrement();
        C4T9 c4t9 = new C4T9(c123205hv, null, bool, bool2, l, l2, str, str2, str3, str5, str4, j3, j, j2, z);
        Queue queue = this.A01;
        queue.offer(c4t9);
        ArrayList arrayList = new ArrayList(queue);
        InterfaceC95764Sk interfaceC95764Sk = this.A04;
        if (interfaceC95764Sk != null) {
            interfaceC95764Sk.E8X(this.A03, arrayList);
        }
    }

    public final void A00() {
        C4T9 c4t9;
        String str;
        final ArrayList arrayList = new ArrayList();
        do {
            Queue queue = this.A01;
            if (!queue.isEmpty() && (c4t9 = (C4T9) queue.poll()) != null) {
                arrayList.add(c4t9);
                str = c4t9.A0A;
                if (C14360o3.A0K(str, "completed")) {
                    break;
                }
            } else {
                break;
            }
        } while (!C14360o3.A0K(str, "paused"));
        this.A02.set(0);
        C95504Rk c95504Rk = this.A06;
        if (this.A05.A07) {
            c95504Rk.A00(new Runnable() { // from class: X.5j2
                @Override // java.lang.Runnable
                public final void run() {
                    C95904Sz c95904Sz = C95904Sz.this;
                    c95904Sz.videoLoggerHandler.EIb(arrayList, c95904Sz.A00, 1L);
                }
            }, 0L);
        } else {
            this.videoLoggerHandler.EIb(arrayList, this.A00, 1L);
        }
    }

    public C95904Sz(C95804So c95804So, InterfaceC95764Sk interfaceC95764Sk, InterfaceC95894Sy interfaceC95894Sy, C42351xP c42351xP, C95504Rk c95504Rk, long j) {
        this.videoLoggerHandler = interfaceC95894Sy;
        this.A00 = j;
        this.A04 = interfaceC95764Sk;
        this.A03 = c95804So;
        this.A05 = c42351xP;
        this.A06 = c95504Rk;
    }
}
