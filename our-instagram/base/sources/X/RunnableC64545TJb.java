package X;

/* renamed from: X.TJb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64545TJb implements Runnable {
    public final /* synthetic */ Object A00;

    public RunnableC64545TJb(Object obj) {
        this.A00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object obj = this.A00;
            synchronized (obj) {
                obj.notify();
            }
        } catch (Exception unused) {
        }
    }
}
