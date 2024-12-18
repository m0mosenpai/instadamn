package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Goc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38049Goc extends AbstractRunnableC14200nk {
    public final /* synthetic */ C57502kP A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38049Goc(C57502kP c57502kP) {
        super(408, 4, false, false);
        this.A00 = c57502kP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList A1F;
        C57502kP c57502kP = this.A00;
        Map map = c57502kP.A04;
        C14360o3.A07(map);
        synchronized (map) {
            A1F = AbstractC166987dD.A1F(map.values());
        }
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            AbstractC57542kT abstractC57542kT = (AbstractC57542kT) it.next();
            if (abstractC57542kT.A02() > 0) {
                if (C18U.A06(C06090Tz.A05, c57502kP.A01, 36327864181799861L)) {
                    abstractC57542kT.A0A();
                }
            }
        }
    }
}
