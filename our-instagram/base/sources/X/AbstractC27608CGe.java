package X;

import android.view.View;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CGe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27608CGe {
    public static final Object A00(View view, C011904h c011904h, InterfaceC23621Ds interfaceC23621Ds) {
        if (!C28425CgX.A00()) {
            c011904h.A00.A03(8);
            return C0eB.A00;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        AbstractC008903d.A00(view, new LRT(0, view, c24891Jo));
        c24891Jo.CPA(new C50260MHp(view, 7));
        c011904h.A00.A03(8);
        return c24891Jo.A0E();
    }
}
