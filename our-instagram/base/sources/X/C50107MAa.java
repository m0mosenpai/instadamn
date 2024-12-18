package X;

import com.instagram.genai.imageservice.service.GenAIImageService;

/* renamed from: X.MAa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50107MAa extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50107MAa(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(1, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        switch (this.A03) {
            case 0:
                obj2 = this.A02;
                obj = this.A05;
                obj4 = this.A04;
                obj3 = this.A01;
                i = 0;
                return new C50107MAa(obj2, obj, obj4, obj3, interfaceC23621Ds, i);
            case 1:
                obj = this.A05;
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 1;
                return new C50107MAa(obj2, obj, obj4, obj3, interfaceC23621Ds, i);
            case 2:
                InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A01;
                return new C50107MAa((C14090nZ) this.A04, (AAW) this.A05, interfaceC25207BDf, interfaceC23621Ds);
            case 3:
                return new C50107MAa((GenAIImageService) this.A02, (LK9) this.A04, (C45067Jww) this.A05, interfaceC23621Ds);
            default:
                obj2 = this.A02;
                obj4 = this.A04;
                obj3 = this.A01;
                obj = this.A05;
                i = 4;
                return new C50107MAa(obj2, obj, obj4, obj3, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C50107MAa) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x029f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0164 A[RETURN] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.0oO, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50107MAa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50107MAa(C14090nZ c14090nZ, AAW aaw, InterfaceC25207BDf interfaceC25207BDf, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A03 = 2;
        this.A01 = interfaceC25207BDf;
        this.A05 = aaw;
        this.A04 = c14090nZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50107MAa(GenAIImageService genAIImageService, LK9 lk9, C45067Jww c45067Jww, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A03 = 3;
        this.A02 = genAIImageService;
        this.A05 = c45067Jww;
        this.A04 = lk9;
    }
}
