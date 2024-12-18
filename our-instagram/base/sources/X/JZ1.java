package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class JZ1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZ1(Object obj, Object obj2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        int i;
        Object obj4;
        String str3;
        Object obj5;
        Object obj6;
        String str4;
        int i2;
        switch (this.A02) {
            case 0:
                obj5 = this.A04;
                str3 = this.A06;
                str4 = this.A05;
                obj4 = this.A01;
                obj6 = this.A03;
                i2 = 0;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 1:
                obj5 = this.A04;
                str3 = this.A06;
                str4 = this.A05;
                obj4 = this.A01;
                obj6 = this.A03;
                i2 = 1;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 2:
                obj2 = this.A04;
                str = this.A05;
                str2 = this.A06;
                obj3 = this.A03;
                i = 2;
                break;
            case 3:
                obj5 = this.A04;
                str4 = this.A05;
                obj6 = this.A03;
                str3 = this.A06;
                obj4 = this.A01;
                i2 = 3;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 4:
                obj5 = this.A04;
                str3 = this.A06;
                obj6 = this.A03;
                obj4 = this.A01;
                str4 = this.A05;
                i2 = 4;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 5:
                obj5 = this.A04;
                obj4 = this.A01;
                str4 = this.A05;
                obj6 = this.A03;
                str3 = this.A06;
                i2 = 5;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 6:
                obj4 = this.A01;
                obj5 = this.A04;
                obj6 = this.A03;
                str3 = this.A06;
                str4 = this.A05;
                i2 = 6;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 7:
                obj2 = this.A04;
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                i = 7;
                break;
            case 8:
                obj2 = this.A04;
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                i = 8;
                break;
            case 9:
                obj4 = this.A01;
                obj6 = this.A03;
                obj5 = this.A04;
                str3 = this.A06;
                str4 = this.A05;
                i2 = 9;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 10:
                Object obj7 = this.A04;
                String str5 = this.A06;
                JZ1 jz1 = new JZ1(obj7, this.A03, this.A05, str5, interfaceC23621Ds, 10);
                jz1.A01 = obj;
                return jz1;
            case 11:
                obj5 = this.A04;
                obj6 = this.A03;
                str3 = this.A06;
                obj4 = this.A01;
                str4 = this.A05;
                i2 = 11;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj5 = this.A04;
                obj6 = this.A03;
                obj4 = this.A01;
                str3 = this.A06;
                str4 = this.A05;
                i2 = 12;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj5 = this.A04;
                obj4 = this.A01;
                str4 = this.A05;
                str3 = this.A06;
                obj6 = this.A03;
                i2 = 13;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            case 14:
                obj4 = this.A01;
                str3 = this.A06;
                obj5 = this.A04;
                obj6 = this.A03;
                str4 = this.A05;
                i2 = 14;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
            default:
                obj5 = this.A04;
                str3 = this.A06;
                str4 = this.A05;
                obj6 = this.A03;
                obj4 = this.A01;
                i2 = 15;
                return new JZ1(obj4, obj6, obj5, str3, str4, interfaceC23621Ds, i2);
        }
        return new JZ1(obj2, obj3, str, str2, interfaceC23621Ds, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x051e, code lost:
    
        if (r3 == false) goto L209;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08b9 A[LOOP:9: B:366:0x08b3->B:368:0x08b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c9d A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v65, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v68, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 3430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZ1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JZ1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZ1(Object obj, Object obj2, Object obj3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A06 = str;
        this.A05 = str2;
    }
}
