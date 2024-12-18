package X;

/* renamed from: X.Pwz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58531Pwz implements Runnable {
    public final /* synthetic */ AbstractC128665rZ A00;

    public RunnableC58531Pwz(AbstractC128665rZ abstractC128665rZ) {
        this.A00 = abstractC128665rZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC128665rZ abstractC128665rZ = this.A00;
        synchronized (abstractC128665rZ) {
            abstractC128665rZ.A05();
            Integer num = C05F.A01;
            AbstractC128665rZ.A02(abstractC128665rZ, "TIMEOUT");
            abstractC128665rZ.A05.execute(new RunnableC58602PyV(new C58601PyU(num), abstractC128665rZ));
        }
    }
}
