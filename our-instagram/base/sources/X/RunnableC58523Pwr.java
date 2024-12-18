package X;

/* renamed from: X.Pwr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58523Pwr implements Runnable {
    public final /* synthetic */ C103804lz A00;
    public final /* synthetic */ AbstractC128665rZ A01;

    public RunnableC58523Pwr(C103804lz c103804lz, AbstractC128665rZ abstractC128665rZ) {
        this.A01 = abstractC128665rZ;
        this.A00 = c103804lz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC65486Tl6 interfaceC65486Tl6;
        AbstractC128665rZ abstractC128665rZ = this.A01;
        if (abstractC128665rZ.A0F.get() && (interfaceC65486Tl6 = abstractC128665rZ.A01) != null) {
            interfaceC65486Tl6.DQA(this.A00);
        }
    }
}
