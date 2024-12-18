package X;

/* renamed from: X.Sb3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63031Sb3 {
    public C63031Sb3() {
        this(0);
    }

    public C63031Sb3(int i) {
    }

    public final /* synthetic */ int A00(Object obj) {
        return ((C63372Sid) obj).A04();
    }

    public final /* synthetic */ int A01(Object obj) {
        return ((C63372Sid) obj).A05();
    }

    public final /* synthetic */ C63372Sid A02(Object obj) {
        return ((RO8) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ C63372Sid A03(Object obj) {
        RO8 ro8 = (RO8) obj;
        C63372Sid c63372Sid = ro8.zzc;
        if (c63372Sid == C63372Sid.A00()) {
            C63372Sid A01 = C63372Sid.A01();
            ro8.zzc = A01;
            return A01;
        }
        return c63372Sid;
    }

    public final /* synthetic */ void A05(InterfaceC65599Tno interfaceC65599Tno, Object obj) {
        ((C63372Sid) obj).A0A(interfaceC65599Tno);
    }

    public final void A06(Object obj) {
        ((RO8) obj).zzc.A07();
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj, int i, long j) {
        ((C63372Sid) obj).A08(i << 3, Long.valueOf(j));
    }

    public final /* synthetic */ void A08(Object obj, Object obj2) {
        ((RO8) obj).zzc = (C63372Sid) obj2;
    }

    public final /* bridge */ /* synthetic */ Object A04(Object obj, Object obj2) {
        C63372Sid A00 = C63372Sid.A00();
        if (!A00.equals(obj2)) {
            C63372Sid c63372Sid = (C63372Sid) obj2;
            if (A00.equals(obj)) {
                return C63372Sid.A02((C63372Sid) obj, c63372Sid);
            }
            ((C63372Sid) obj).A09(c63372Sid);
            return obj;
        }
        return obj;
    }
}
