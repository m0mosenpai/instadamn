package X;

import java.util.HashMap;

/* renamed from: X.PtV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58335PtV extends C58336PtW {
    public final HashMap A00 = AbstractC166987dD.A1G();

    @Override // X.C58336PtW
    public final C58345Ptg A04(Object obj) {
        return (C58345Ptg) this.A00.get(obj);
    }

    public final C58345Ptg A08(Object obj) {
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(obj)) {
            return ((C58345Ptg) hashMap.get(obj)).A01;
        }
        return null;
    }

    public final boolean A09(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.C58336PtW
    public final Object A06(Object obj) {
        Object A06 = super.A06(obj);
        this.A00.remove(obj);
        return A06;
    }

    @Override // X.C58336PtW
    public final Object A07(Object obj, Object obj2) {
        C58345Ptg A04 = A04(obj);
        if (A04 != null) {
            return A04.A03;
        }
        HashMap hashMap = this.A00;
        C58345Ptg c58345Ptg = new C58345Ptg(obj, obj2);
        super.A00++;
        C58345Ptg c58345Ptg2 = this.A01;
        if (c58345Ptg2 == null) {
            this.A02 = c58345Ptg;
        } else {
            c58345Ptg2.A00 = c58345Ptg;
            c58345Ptg.A01 = c58345Ptg2;
        }
        this.A01 = c58345Ptg;
        hashMap.put(obj, c58345Ptg);
        return null;
    }
}
