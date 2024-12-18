package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Pjs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57765Pjs extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ InterfaceC16610sE A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57765Pjs(String str, List list, InterfaceC16610sE interfaceC16610sE, boolean z) {
        super(3);
        this.A03 = z;
        this.A00 = str;
        this.A02 = interfaceC16610sE;
        this.A01 = list;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C09530e4 A1L;
        AbstractC167007dF.A1K(obj, obj2);
        boolean z = this.A03;
        if (z) {
            A1L = AbstractC166987dD.A1L(new C30194DRz(new InterfaceC16620sF[]{(InterfaceC16620sF) obj}, 6), null);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            A1L = AbstractC166987dD.A1L(new C30194DRz(new InterfaceC16620sF[]{(InterfaceC16620sF) obj, new C30193DRy(atomicReference, 42)}, 6), new C9GQ(atomicReference, 0));
        }
        Object obj4 = A1L.A00;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) A1L.A01;
        String str = this.A00;
        InterfaceC16610sE interfaceC16610sE = this.A02;
        List list = this.A01;
        InterfaceC16660sJ[] interfaceC16660sJArr = (InterfaceC16660sJ[]) list.toArray(new InterfaceC16660sJ[0]);
        Object[] copyOf = Arrays.copyOf(interfaceC16660sJArr, interfaceC16660sJArr.length);
        C14360o3.A0B(copyOf, 0);
        C57782Pk9 c57782Pk9 = new C57782Pk9(str, interfaceC16820sZ, (InterfaceC31063Dl5) interfaceC16610sE.invoke(obj4, obj2, new DHH(copyOf, 9)), z);
        InterfaceC16660sJ interfaceC16660sJ = c57782Pk9.A00;
        c57782Pk9.ETK(C57601PhD.A00);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC16660sJ) it.next()).invoke(c57782Pk9));
        }
        c57782Pk9.ETK(new C50372MLz(11, A0q, c57782Pk9, interfaceC16660sJ, MSW.A1C(0)));
        c57782Pk9.A00(new C50358MLk(c57782Pk9, 15), false);
        return c57782Pk9;
    }
}
