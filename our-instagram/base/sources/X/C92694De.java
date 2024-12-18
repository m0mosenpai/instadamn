package X;

import com.instagram.common.mvvm.SingleFlightImpl$wrapAction$1;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92694De {
    public final ConcurrentHashMap A00;
    public final AbstractC92684Dd A01;

    public final Object A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC16620sF c9dh;
        AbstractC92684Dd abstractC92684Dd = this.A01;
        if (C14360o3.A0K(abstractC92684Dd, C92674Dc.A00)) {
            c9dh = new C9DM(this, new SingleFlightImpl$wrapAction$1(null, interfaceC16660sJ), obj, (InterfaceC23621Ds) null, 9, 42);
        } else if (C14360o3.A0K(abstractC92684Dd, MZG.A00)) {
            c9dh = new C9DH(this, obj, new SingleFlightImpl$wrapAction$1(null, interfaceC16660sJ), null, 16);
        } else {
            throw new RuntimeException();
        }
        return AnonymousClass194.A00(interfaceC23621Ds, c9dh);
    }

    public final void A01() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        for (Object obj : concurrentHashMap.values()) {
            C14360o3.A07(obj);
            ((AnonymousClass195) obj).AGH(null);
        }
        concurrentHashMap.clear();
    }

    public final boolean A02(Object obj) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) this.A00.get(obj);
        if (anonymousClass195 != null && anonymousClass195.isActive()) {
            return true;
        }
        return false;
    }

    public C92694De(AbstractC92684Dd abstractC92684Dd) {
        this.A01 = abstractC92684Dd;
        this.A00 = new ConcurrentHashMap();
    }

    public C92694De() {
        this(C92674Dc.A00);
    }
}
