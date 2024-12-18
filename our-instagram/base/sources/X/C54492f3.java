package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54492f3 {
    public final InterfaceC54232eZ A00;
    public final InterfaceC19390xP A01;
    public final C05A A02;
    public final List A03;
    public final InterfaceC19390xP A04;
    public final /* synthetic */ C54462f0 A05;

    public C54492f3(InterfaceC54232eZ interfaceC54232eZ, C54462f0 c54462f0, List list) {
        C14360o3.A0B(interfaceC54232eZ, 2);
        this.A05 = c54462f0;
        this.A00 = interfaceC54232eZ;
        this.A03 = list;
        this.A02 = new C008002u(new C54432ex(interfaceC54232eZ, null, 0, 0));
        java.util.Set A00 = A00();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A00, 10));
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            arrayList.add(((C54492f3) it.next()).A02);
        }
        final InterfaceC19390xP[] interfaceC19390xPArr = (InterfaceC19390xP[]) AbstractC001800i.A0a(arrayList).toArray(new InterfaceC19390xP[0]);
        InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP() { // from class: X.2f8
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                InterfaceC19390xP[] interfaceC19390xPArr2 = interfaceC19390xPArr;
                Object A002 = AnonymousClass104.A00(interfaceC23621Ds, new C206919Dw(interfaceC19390xPArr2, 4), new C9D5(6, null), interfaceC19960yQ, interfaceC19390xPArr2);
                if (A002 != C1JX.A02) {
                    return C0eB.A00;
                }
                return A002;
            }
        };
        this.A04 = interfaceC19390xP;
        boolean z = !this.A03.isEmpty();
        InterfaceC19390xP interfaceC19390xP2 = this.A02;
        this.A01 = z ? C10Q.A03(new C9DE(this, null, 2), interfaceC19390xP2, interfaceC19390xP) : interfaceC19390xP2;
    }

    private final java.util.Set A00() {
        List<C54492f3> list = this.A03;
        HashSet hashSet = new HashSet();
        for (C54492f3 c54492f3 : list) {
            AnonymousClass016.A16(AnonymousClass090.A01(c54492f3, c54492f3.A00()), hashSet);
        }
        return hashSet;
    }

    public final void A01() {
        this.A02.Egh(new C54432ex(this.A00, null, 0, 0));
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C54492f3) it.next()).A01();
        }
    }
}
