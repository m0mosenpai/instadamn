package X;

/* renamed from: X.PyV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58602PyV implements Runnable {
    public final /* synthetic */ C58601PyU A00;
    public final /* synthetic */ AbstractC128665rZ A01;

    public RunnableC58602PyV(C58601PyU c58601PyU, AbstractC128665rZ abstractC128665rZ) {
        this.A01 = abstractC128665rZ;
        this.A00 = c58601PyU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC128665rZ abstractC128665rZ = this.A01;
        if (abstractC128665rZ.A0F.getAndSet(false)) {
            InterfaceC65486Tl6 interfaceC65486Tl6 = abstractC128665rZ.A01;
            if (interfaceC65486Tl6 != null) {
                interfaceC65486Tl6.DE7(this.A00);
            }
            AbstractC128665rZ.A01(abstractC128665rZ);
        }
    }
}
