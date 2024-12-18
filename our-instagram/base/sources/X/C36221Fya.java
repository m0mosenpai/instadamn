package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collection;

/* renamed from: X.Fya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36221Fya implements YO2 {
    public final /* synthetic */ AbstractC31330Dpv A00;
    public final /* synthetic */ C3o9 A01;

    public C36221Fya(AbstractC31330Dpv abstractC31330Dpv, C3o9 c3o9) {
        this.A00 = abstractC31330Dpv;
        this.A01 = c3o9;
    }

    @Override // X.YO2
    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        E72 e72 = (E72) obj;
        E72 e722 = (E72) obj2;
        AbstractC31330Dpv abstractC31330Dpv = this.A00;
        if (this.A01 instanceof MsysThreadId) {
            if (C18U.A06(C06090Tz.A05, abstractC31330Dpv.A04, 36315962827542363L) && !e72.A02) {
                boolean z = false;
                boolean A1M = AbstractC167007dF.A1M(e722.A02 ? 1 : 0);
                if (e72.A01 || e722.A01) {
                    z = true;
                }
                return new E72(A1M, z, AbstractC001800i.A0S((Iterable) e722.A00, (Collection) e72.A00), 7);
            }
            return e72;
        }
        return e72;
    }
}
