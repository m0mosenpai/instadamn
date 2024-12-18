package X;

import java.util.AbstractCollection;

/* renamed from: X.AyC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24790AyC implements Runnable {
    public final /* synthetic */ C7Ko A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public RunnableC24790AyC(C7Ko c7Ko, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c7Ko;
        this.A01 = str;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractCollection abstractCollection = (AbstractCollection) this.A00.A01.get(this.A01);
        if (abstractCollection != null) {
            abstractCollection.remove(this);
        }
        this.A02.invoke();
    }
}
