package X;

/* renamed from: X.ApZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24268ApZ implements Runnable {
    public final /* synthetic */ C196518mh A00;

    public RunnableC24268ApZ(C196518mh c196518mh) {
        this.A00 = c196518mh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC178817wt interfaceC178817wt = this.A00.A00;
        if (interfaceC178817wt == null) {
            C14360o3.A0F("mediaGraphController");
            throw C00O.createAndThrow();
        }
        interfaceC178817wt.EGZ(null);
    }
}
