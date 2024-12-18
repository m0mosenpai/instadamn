package X;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.CfP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28365CfP {
    public static final Integer A0A = AbstractC25227BEk.A0p();
    public long A00;
    public AnonymousClass583 A01;
    public HashMap A02;
    public HashMap A03;
    public HashMap A04;
    public boolean A05;
    public final InterfaceC1128957x A06;
    public final C28879Con A07;
    public final List A08;
    public final java.util.Set A09;

    public C28365CfP(InterfaceC1128957x interfaceC1128957x) {
        this();
        this.A06 = interfaceC1128957x;
        this.A00 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A08 = AbstractC166987dD.A1E();
        this.A05 = true;
        this.A09 = new LinkedHashSet();
    }

    public final C28879Con A00(Object obj) {
        HashMap hashMap = this.A03;
        InterfaceC30918DiV interfaceC30918DiV = (InterfaceC30918DiV) hashMap.get(obj);
        InterfaceC30918DiV interfaceC30918DiV2 = interfaceC30918DiV;
        if (interfaceC30918DiV == null) {
            C28879Con c28879Con = new C28879Con(this);
            hashMap.put(obj, c28879Con);
            c28879Con.A0K = obj;
            interfaceC30918DiV2 = c28879Con;
        }
        if (interfaceC30918DiV2 instanceof C28879Con) {
            return (C28879Con) interfaceC30918DiV2;
        }
        return null;
    }

    public C28365CfP() {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A03 = A1G;
        this.A02 = AbstractC166987dD.A1G();
        this.A04 = AbstractC166987dD.A1G();
        C28879Con c28879Con = new C28879Con(this);
        this.A07 = c28879Con;
        A1G.put(A0A, c28879Con);
    }
}
