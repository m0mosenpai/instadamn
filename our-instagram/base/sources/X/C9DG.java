package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9DG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DG extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DG(ConcurrentUploadQueueProcessor concurrentUploadQueueProcessor, C46032KYx c46032KYx, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 2;
        this.A01 = c46032KYx;
        this.A04 = concurrentUploadQueueProcessor;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        switch (this.A03) {
            case 0:
                return new C9DG(this.A04, interfaceC23621Ds, 0);
            case 1:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 1;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 2:
                C9DG c9dg = new C9DG((ConcurrentUploadQueueProcessor) this.A04, (C46032KYx) this.A01, interfaceC23621Ds);
                c9dg.A02 = obj;
                return c9dg;
            case 3:
                C9DG c9dg2 = new C9DG(this.A04, interfaceC23621Ds, 3);
                c9dg2.A01 = obj;
                return c9dg2;
            case 4:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 4;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 5;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 6:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 6;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 7:
                obj2 = this.A02;
                obj4 = this.A04;
                obj3 = this.A01;
                i = 7;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 8:
                obj3 = this.A01;
                obj4 = this.A04;
                obj2 = this.A02;
                i = 8;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 9:
                obj3 = this.A01;
                obj4 = this.A04;
                obj2 = this.A02;
                i = 9;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 10;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 11;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 12;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 13;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
            default:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 14;
                return new C9DG(obj2, obj3, obj4, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DG) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x034e, code lost:
    
        if (r0 == r1) goto L165;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x041f A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DG(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DG(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
    }
}
