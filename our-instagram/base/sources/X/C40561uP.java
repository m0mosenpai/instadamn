package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1uP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40561uP {
    public final Integer A00;
    public final List A01 = new ArrayList();
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final boolean A04;

    public C40561uP(AbstractC12990ll abstractC12990ll) {
        Integer valueOf;
        this.A02 = AbstractC09440dt.A01(new C9EI(abstractC12990ll, 18));
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, abstractC12990ll, 36324007303327525L);
        this.A04 = A06;
        if (!((Boolean) this.A02.getValue()).booleanValue() && !A06) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf((int) C18U.A01(c06090Tz, abstractC12990ll, 36605482280097034L));
        }
        this.A00 = valueOf;
        this.A03 = AbstractC09440dt.A01(new C9F8(25, abstractC12990ll, this));
    }
}
