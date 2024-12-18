package X;

import java.util.Iterator;

/* renamed from: X.Goe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38051Goe extends AbstractRunnableC14200nk {
    public final /* synthetic */ C57502kP A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38051Goe(C57502kP c57502kP) {
        super(409, 4, false, false);
        this.A00 = c57502kP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = AbstractC166987dD.A1F(this.A00.A04.values()).iterator();
        while (it.hasNext()) {
            ((AbstractC57542kT) it.next()).A09();
        }
    }
}
