package X;

import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.util.List;

/* loaded from: classes8.dex */
public final class MAZ extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAZ(OpalAudienceSelectorRepository opalAudienceSelectorRepository, Integer num, String str, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A04 = opalAudienceSelectorRepository;
        this.A01 = num;
        this.A05 = str;
        this.A02 = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            return new MAZ((OpalAudienceSelectorRepository) this.A04, (Integer) this.A01, this.A05, (List) this.A02, interfaceC23621Ds);
        }
        return new MAZ((KZQ) this.A04, this.A05, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MAZ) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAZ(KZQ kzq, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A04 = kzq;
        this.A05 = str;
    }
}
