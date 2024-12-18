package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.PZf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57161PZf extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57161PZf(Context context, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A04 = 11;
        this.A06 = str;
        this.A05 = context;
        this.A02 = userSession;
        this.A01 = interfaceC16620sF;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        String str2;
        int i2;
        Object obj8;
        String str3;
        Object obj9;
        Object obj10;
        int i3;
        C57161PZf c57161PZf;
        Object obj11;
        String str4;
        Object obj12;
        Object obj13;
        int i4;
        C57161PZf c57161PZf2;
        Object obj14;
        Object obj15;
        String str5;
        int i5;
        switch (this.A04) {
            case 0:
                obj13 = this.A01;
                obj12 = this.A05;
                str4 = this.A06;
                obj11 = this.A03;
                i4 = 0;
                c57161PZf = new C57161PZf(obj13, obj12, obj11, str4, interfaceC23621Ds, i4);
                c57161PZf.A02 = obj;
                return c57161PZf;
            case 1:
                obj2 = this.A03;
                str = this.A06;
                obj3 = this.A05;
                obj5 = this.A01;
                obj4 = this.A02;
                i = 1;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 2:
                obj14 = this.A03;
                obj15 = this.A05;
                str5 = this.A06;
                i5 = 2;
                c57161PZf2 = new C57161PZf(obj14, obj15, str5, interfaceC23621Ds, i5);
                c57161PZf2.A01 = obj;
                return c57161PZf2;
            case 3:
                obj2 = null;
                str = this.A06;
                obj3 = this.A05;
                obj5 = this.A01;
                obj4 = this.A02;
                i = 3;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 4:
                obj2 = this.A03;
                str = this.A06;
                obj3 = this.A05;
                obj4 = this.A02;
                obj5 = this.A01;
                i = 4;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A03;
                str = this.A06;
                obj4 = this.A02;
                obj5 = this.A01;
                obj3 = this.A05;
                i = 5;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 6:
                obj8 = this.A03;
                str3 = this.A06;
                obj9 = this.A01;
                obj10 = this.A05;
                i3 = 6;
                return new C57161PZf(obj9, obj10, obj8, str3, interfaceC23621Ds, i3);
            case 7:
                obj8 = this.A03;
                str3 = this.A06;
                obj9 = this.A01;
                obj10 = this.A05;
                i3 = 7;
                return new C57161PZf(obj9, obj10, obj8, str3, interfaceC23621Ds, i3);
            case 8:
                obj4 = this.A02;
                obj5 = this.A01;
                obj2 = this.A03;
                obj3 = this.A05;
                str = this.A06;
                i = 8;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 9:
                obj2 = this.A03;
                obj3 = this.A05;
                str = this.A06;
                obj5 = this.A01;
                obj4 = this.A02;
                i = 9;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 10:
                obj10 = this.A05;
                obj8 = this.A03;
                str3 = this.A06;
                obj9 = this.A01;
                i3 = 10;
                return new C57161PZf(obj9, obj10, obj8, str3, interfaceC23621Ds, i3);
            case 11:
                return new C57161PZf((Context) this.A05, (UserSession) this.A02, this.A06, interfaceC23621Ds, (InterfaceC16620sF) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj11 = this.A03;
                str4 = this.A06;
                obj12 = this.A05;
                obj13 = this.A01;
                i4 = 12;
                c57161PZf = new C57161PZf(obj13, obj12, obj11, str4, interfaceC23621Ds, i4);
                c57161PZf.A02 = obj;
                return c57161PZf;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj5 = this.A01;
                obj2 = this.A03;
                obj4 = this.A02;
                obj3 = this.A05;
                str = this.A06;
                i = 13;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 14:
                obj7 = this.A05;
                obj6 = this.A01;
                str2 = this.A06;
                i2 = 14;
                c57161PZf = new C57161PZf(obj6, obj7, str2, interfaceC23621Ds, i2, 42);
                c57161PZf.A02 = obj;
                return c57161PZf;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A03;
                obj4 = this.A02;
                obj3 = this.A05;
                obj5 = this.A01;
                str = this.A06;
                i = 15;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 16:
                obj4 = this.A02;
                obj5 = this.A01;
                obj2 = this.A03;
                obj3 = this.A05;
                str = this.A06;
                i = 16;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 17:
                obj8 = this.A03;
                str3 = this.A06;
                obj9 = this.A01;
                obj10 = this.A05;
                i3 = 17;
                return new C57161PZf(obj9, obj10, obj8, str3, interfaceC23621Ds, i3);
            case 18:
                obj2 = this.A03;
                obj3 = this.A05;
                str = this.A06;
                obj4 = this.A02;
                obj5 = this.A01;
                i = 18;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                obj6 = this.A01;
                obj7 = this.A05;
                str2 = this.A06;
                i2 = 19;
                c57161PZf = new C57161PZf(obj6, obj7, str2, interfaceC23621Ds, i2, 42);
                c57161PZf.A02 = obj;
                return c57161PZf;
            case 20:
                c57161PZf2 = new C57161PZf(this.A03, this.A05, this.A06, interfaceC23621Ds, 20);
                c57161PZf2.A01 = obj;
                return c57161PZf2;
            case 21:
                obj2 = this.A03;
                str = this.A06;
                obj3 = this.A05;
                obj4 = this.A02;
                obj5 = this.A01;
                i = 21;
                return new C57161PZf(obj4, obj5, obj2, obj3, str, interfaceC23621Ds, i);
            case 22:
                return new C57161PZf(this.A03, this.A05, this.A06, interfaceC23621Ds, 22);
            default:
                obj15 = this.A05;
                obj14 = this.A03;
                str5 = this.A06;
                i5 = 23;
                c57161PZf2 = new C57161PZf(obj14, obj15, str5, interfaceC23621Ds, i5);
                c57161PZf2.A01 = obj;
                return c57161PZf2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:660:0x1174
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b4f A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [X.4wj] */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v31, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 4616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57161PZf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57161PZf) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57161PZf(Object obj, Object obj2, Object obj3, Object obj4, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A06 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57161PZf(Object obj, Object obj2, Object obj3, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A06 = str;
        this.A03 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57161PZf(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57161PZf(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }
}
