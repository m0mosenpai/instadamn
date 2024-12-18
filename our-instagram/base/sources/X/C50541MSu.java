package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.MSu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50541MSu extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50541MSu(C28726CmI c28726CmI, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(3, interfaceC23621Ds);
        this.A03 = 16;
        this.A02 = c28726CmI;
        this.A01 = interfaceC16620sF;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        int i2;
        C50541MSu c50541MSu;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A03) {
            case 0:
                i = 0;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 1:
                i = 1;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 2:
                i = 2;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 3:
                i = 3;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 4:
                obj4 = this.A01;
                i2 = 4;
                c50541MSu = new C50541MSu(obj4, interfaceC23621Ds, i2);
                c50541MSu.A02 = obj;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 5:
                obj4 = this.A01;
                i2 = 5;
                c50541MSu = new C50541MSu(obj4, interfaceC23621Ds, i2);
                c50541MSu.A02 = obj;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 6:
                i = 6;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 7:
                i = 7;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 8:
                i = 8;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 9:
                i = 9;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 10:
                i = 10;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 11:
                i = 11;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 12;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 13;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case 14:
                i = 14;
                c50541MSu = new C50541MSu(i, interfaceC23621Ds);
                c50541MSu.A01 = obj;
                c50541MSu.A02 = obj2;
                return c50541MSu.invokeSuspend(C0eB.A00);
            case Process.SIGTERM /* 15 */:
                C50541MSu c50541MSu2 = new C50541MSu(this.A01, interfaceC23621Ds, 15);
                c50541MSu2.A02 = obj;
                return c50541MSu2.invokeSuspend(C0eB.A00);
            default:
                c50541MSu = new C50541MSu((C28726CmI) this.A02, interfaceC23621Ds, (InterfaceC16620sF) this.A01);
                return c50541MSu.invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r9 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
    
        if (r9 == X.EnumC46172KcA.A03) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0341 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [X.50Z] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.E62] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.JxG] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50541MSu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50541MSu(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50541MSu(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }
}
