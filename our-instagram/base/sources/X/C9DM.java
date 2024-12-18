package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9DM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DM extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = 16;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        C9DM c9dm;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i4;
        switch (this.A05) {
            case 0:
                obj3 = this.A04;
                obj5 = this.A01;
                obj4 = this.A02;
                i2 = 0;
                C9DM c9dm2 = new C9DM(obj3, obj5, obj4, interfaceC23621Ds, i2, 42);
                c9dm2.A03 = obj;
                return c9dm2;
            case 1:
                c9dm = new C9DM(this.A04, interfaceC23621Ds, 1);
                c9dm.A01 = obj;
                return c9dm;
            case 2:
                obj8 = this.A03;
                obj6 = this.A02;
                obj7 = this.A01;
                i3 = 2;
                C9DM c9dm3 = new C9DM(obj8, obj6, obj7, interfaceC23621Ds, i3);
                c9dm3.A04 = obj;
                return c9dm3;
            case 3:
                return new C9DM(interfaceC23621Ds, (InterfaceC16620sF) this.A01, (AnonymousClass139) this.A02);
            case 4:
                obj8 = this.A03;
                obj6 = this.A02;
                obj7 = this.A01;
                i3 = 4;
                C9DM c9dm32 = new C9DM(obj8, obj6, obj7, interfaceC23621Ds, i3);
                c9dm32.A04 = obj;
                return c9dm32;
            case 5:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i3 = 5;
                C9DM c9dm322 = new C9DM(obj8, obj6, obj7, interfaceC23621Ds, i3);
                c9dm322.A04 = obj;
                return c9dm322;
            case 6:
                obj11 = this.A04;
                obj9 = this.A03;
                obj12 = this.A01;
                obj10 = this.A02;
                i4 = 6;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 7:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                obj9 = this.A03;
                i4 = 7;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 8:
                obj11 = this.A04;
                obj10 = this.A02;
                obj12 = this.A01;
                obj9 = this.A03;
                i4 = 8;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 9:
                obj3 = this.A04;
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 9;
                C9DM c9dm22 = new C9DM(obj3, obj5, obj4, interfaceC23621Ds, i2, 42);
                c9dm22.A03 = obj;
                return c9dm22;
            case 10:
                obj11 = this.A04;
                obj12 = this.A01;
                obj10 = this.A02;
                obj9 = this.A03;
                i4 = 10;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 11:
                return new C9DM(this.A04, this.A01, this.A02, interfaceC23621Ds, 11, 42);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj9 = this.A03;
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i4 = 12;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A04;
                i = 13;
                return new C9DM(obj2, interfaceC23621Ds, i);
            case 14:
                obj2 = this.A04;
                i = 14;
                return new C9DM(obj2, interfaceC23621Ds, i);
            case Process.SIGTERM /* 15 */:
                obj9 = this.A03;
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i4 = 15;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 16:
                c9dm = new C9DM(interfaceC23621Ds);
                c9dm.A01 = obj;
                return c9dm;
            case 17:
                obj11 = this.A04;
                obj10 = this.A02;
                obj12 = this.A01;
                obj9 = this.A03;
                i4 = 17;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            case 18:
                obj9 = this.A03;
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i4 = 18;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
            default:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                obj9 = this.A03;
                i4 = 19;
                return new C9DM(obj10, obj12, obj11, obj9, interfaceC23621Ds, i4);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DM) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x06fc, code lost:
    
        if (r12 != null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0708, code lost:
    
        if (r12 != null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x072b, code lost:
    
        r17.A01 = r5;
        r17.A02 = r9;
        r17.A03 = r11;
        r17.A04 = r12;
        r17.A00 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0739, code lost:
    
        if (r5.EMz(r10, r17) != r0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x073b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x070a, code lost:
    
        X.C14360o3.A0B(r10, 0);
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0715, code lost:
    
        if (r12.A00 >= r10.A00) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0717, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0718, code lost:
    
        if (r1 != true) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x071a, code lost:
    
        r17.A01 = r5;
        r17.A02 = r9;
        r17.A03 = r11;
        r17.A04 = r10;
        r17.A00 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0728, code lost:
    
        if (r5.EMz(r12, r17) != r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x072a, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x0103. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x07c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05e0 A[Catch: all -> 0x0620, TryCatch #0 {all -> 0x0620, blocks: (B:268:0x05d7, B:269:0x05da, B:271:0x05e0, B:274:0x05f3, B:276:0x05f7), top: B:267:0x05d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f3 A[Catch: all -> 0x0620, TryCatch #0 {all -> 0x0620, blocks: (B:268:0x05d7, B:269:0x05da, B:271:0x05e0, B:274:0x05f3, B:276:0x05f7), top: B:267:0x05d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9 A[Catch: CancellationException -> 0x01d8, TryCatch #9 {CancellationException -> 0x01d8, blocks: (B:61:0x010a, B:74:0x0186, B:78:0x01a3, B:80:0x01a9, B:84:0x01c2, B:86:0x01c6, B:94:0x01a0), top: B:58:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2 A[Catch: CancellationException -> 0x01d8, TryCatch #9 {CancellationException -> 0x01d8, blocks: (B:61:0x010a, B:74:0x0186, B:78:0x01a3, B:80:0x01a9, B:84:0x01c2, B:86:0x01c6, B:94:0x01a0), top: B:58:0x0103 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:325:0x0739 -> B:315:0x06bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:332:0x0728 -> B:322:0x06fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x016e -> B:61:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01bf -> B:61:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01c4 -> B:61:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01d5 -> B:61:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e7 -> B:61:0x0133). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, AnonymousClass139 anonymousClass139) {
        super(2, interfaceC23621Ds);
        this.A05 = 3;
        this.A02 = anonymousClass139;
        this.A01 = interfaceC16620sF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DM(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
    }
}
