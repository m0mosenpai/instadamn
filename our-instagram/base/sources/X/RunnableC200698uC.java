package X;

import java.util.Iterator;

/* renamed from: X.8uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC200698uC implements Runnable {
    public final /* synthetic */ C176347sr A00;
    public final /* synthetic */ String A01;

    public RunnableC200698uC(C176347sr c176347sr, String str) {
        this.A00 = c176347sr;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC174727q7) it.next()).Dea(this.A01);
        }
    }
}