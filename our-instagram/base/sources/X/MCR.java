package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes8.dex */
public final class MCR extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MCR mcr;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        MCR mcr2;
        Object obj8;
        int i2;
        Object obj9;
        Object obj10;
        Object obj11;
        int i3;
        MCR mcr3;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        int i4;
        switch (this.A07) {
            case 0:
                mcr = new MCR((C5Y1) this.A02, (InterfaceC74963Ym) this.A01, (InterfaceC74963Ym) this.A04, interfaceC23621Ds, (InterfaceC24731Iq) this.A03);
                mcr.A05 = obj;
                return mcr;
            case 1:
                obj12 = this.A05;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                obj16 = this.A04;
                i4 = 1;
                mcr3 = new MCR(obj12, obj13, obj14, obj15, obj16, interfaceC23621Ds, i4);
                mcr3.A06 = obj;
                return mcr3;
            case 2:
                mcr2 = new MCR(this.A01, this.A02, interfaceC23621Ds, 2);
                mcr2.A03 = obj;
                return mcr2;
            case 3:
                Object obj17 = this.A02;
                Object obj18 = this.A03;
                Object obj19 = this.A04;
                return new MCR(this.A05, obj18, obj17, this.A01, obj19, interfaceC23621Ds, 3);
            case 4:
                obj11 = this.A02;
                obj9 = this.A06;
                obj10 = this.A01;
                i3 = 4;
                return new MCR(obj11, obj9, obj10, interfaceC23621Ds, i3);
            case 5:
                return new MCR(this.A06, this.A01, interfaceC23621Ds, 5, 42);
            case 6:
                obj4 = this.A06;
                obj3 = this.A02;
                obj6 = this.A03;
                obj5 = this.A01;
                obj2 = this.A04;
                obj7 = this.A05;
                i = 6;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 7:
                Object obj20 = this.A01;
                Object obj21 = this.A02;
                Object obj22 = this.A04;
                mcr3 = new MCR(this.A05, this.A03, obj21, obj20, obj22, interfaceC23621Ds, 7);
                mcr3.A06 = obj;
                return mcr3;
            case 8:
                obj7 = this.A05;
                obj2 = this.A04;
                obj4 = this.A06;
                obj6 = this.A03;
                obj3 = this.A02;
                obj5 = this.A01;
                i = 8;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 9:
                obj4 = this.A06;
                obj5 = this.A01;
                obj7 = this.A05;
                obj3 = this.A02;
                obj2 = this.A04;
                obj6 = this.A03;
                i = 9;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 10:
                obj9 = this.A06;
                obj10 = this.A01;
                obj11 = this.A02;
                i3 = 10;
                return new MCR(obj11, obj9, obj10, interfaceC23621Ds, i3);
            case 11:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A06;
                obj5 = this.A01;
                obj7 = this.A05;
                obj6 = this.A03;
                i = 11;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj7 = this.A05;
                obj3 = this.A02;
                obj4 = this.A06;
                obj5 = this.A01;
                obj2 = this.A04;
                obj6 = this.A03;
                i = 12;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj7 = this.A05;
                obj3 = this.A02;
                obj5 = this.A01;
                obj6 = this.A03;
                obj4 = this.A06;
                obj2 = this.A04;
                i = 13;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 14:
                obj8 = this.A06;
                i2 = 14;
                MCR mcr4 = new MCR(obj8, interfaceC23621Ds, i2);
                mcr4.A01 = obj;
                return mcr4;
            case Process.SIGTERM /* 15 */:
                return new MCR(this.A06, this.A01, interfaceC23621Ds, 15, 42);
            case 16:
                JWO jwo = (JWO) this.A06;
                return new MCR((Context) this.A01, (UserSession) this.A05, jwo, (C4GV) this.A02, (C83693oE) this.A04, (List) this.A03, interfaceC23621Ds, this.A00);
            case 17:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A06;
                obj7 = this.A05;
                obj6 = this.A03;
                obj5 = this.A01;
                i = 17;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 18:
                obj4 = this.A06;
                obj7 = this.A05;
                obj3 = this.A02;
                obj5 = this.A01;
                obj2 = this.A04;
                obj6 = this.A03;
                i = 18;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                MCR mcr5 = new MCR((Activity) this.A01, interfaceC23621Ds);
                mcr5.A02 = obj;
                return mcr5;
            case 20:
                obj4 = this.A06;
                obj5 = this.A01;
                obj6 = this.A03;
                obj7 = this.A05;
                obj3 = this.A02;
                obj2 = this.A04;
                i = 20;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 21:
                return new MCR(interfaceC23621Ds, this.A06, this.A01, this.A04, this.A03, this.A02, 21);
            case 22:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A06;
                obj6 = this.A03;
                obj7 = this.A05;
                obj5 = this.A01;
                i = 22;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 23:
                obj8 = this.A06;
                i2 = 23;
                MCR mcr42 = new MCR(obj8, interfaceC23621Ds, i2);
                mcr42.A01 = obj;
                return mcr42;
            case 24:
                mcr2 = new MCR(this.A01, this.A02, interfaceC23621Ds, 24);
                mcr2.A03 = obj;
                return mcr2;
            case 25:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A06;
                obj5 = this.A01;
                obj6 = this.A03;
                obj7 = this.A05;
                i = 25;
                return new MCR(obj7, obj3, obj5, obj6, obj4, obj2, interfaceC23621Ds, i);
            case 26:
                mcr = new MCR(interfaceC23621Ds, this.A06, this.A01, this.A04, this.A03, this.A02, 26);
                mcr.A05 = obj;
                return mcr;
            default:
                obj14 = this.A02;
                obj12 = this.A05;
                obj13 = this.A03;
                obj15 = this.A01;
                obj16 = this.A04;
                i4 = 27;
                mcr3 = new MCR(obj12, obj13, obj14, obj15, obj16, interfaceC23621Ds, i4);
                mcr3.A06 = obj;
                return mcr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f6, code lost:
    
        if (r1 == r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a6b, code lost:
    
        if (((X.C45173JzE) r1).A00 != 2) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0a94, code lost:
    
        if (((X.C45173JzE) r1).A00 != 1) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0ad0, code lost:
    
        if (((X.C45173JzE) r1).A00 != 0) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x101e, code lost:
    
        if (r3.EMz(r8, r0) == r2) goto L592;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00da. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ab A[Catch: all -> 0x02cf, LOOP:2: B:122:0x02a5->B:124:0x02ab, LOOP_END, TryCatch #8 {all -> 0x02cf, blocks: (B:121:0x0287, B:122:0x02a5, B:124:0x02ab, B:126:0x02b7, B:128:0x02bf, B:131:0x02ca), top: B:120:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x08b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0c1e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x108d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0dbd A[Catch: all -> 0x0e13, TRY_ENTER, TryCatch #3 {all -> 0x0e13, blocks: (B:538:0x0da2, B:539:0x0da5, B:540:0x0daa, B:541:0x0db5, B:544:0x0dbd, B:546:0x0dc5, B:548:0x0dcf, B:555:0x0dd5, B:551:0x0dde, B:560:0x0dec, B:564:0x0dfa, B:565:0x0df5, B:566:0x0df9, B:567:0x0dff, B:572:0x0d85, B:574:0x0d90), top: B:533:0x0d35 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x1047 A[PHI: r15
      0x1047: PHI (r15v32 java.lang.Object) = (r15v0 java.lang.Object), (r15v1 java.lang.Object), (r15v26 java.lang.Object), (r15v33 java.lang.Object) binds: [B:646:0x0f77, B:575:0x0d9e, B:156:0x03b3, B:53:0x1044] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0df2  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0ec6 A[Catch: all -> 0x0ef1, TryCatch #1 {all -> 0x0ef1, blocks: (B:605:0x0e8c, B:606:0x0eb2, B:610:0x0ec0, B:612:0x0ec6, B:621:0x0ebd, B:623:0x0eaa), top: B:600:0x0e82 }] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0ee2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0f63  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x10dd  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x110d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x111e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [X.47Z] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, X.47Z] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, X.47Z] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [X.Jxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [X.Jxb] */
    /* JADX WARN: Type inference failed for: r2v136, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v138, types: [com.instagram.common.session.UserSession] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int, X.139] */
    /* JADX WARN: Type inference failed for: r2v145 */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r2v147, types: [com.instagram.common.session.UserSession, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v148, types: [X.0ll, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v176 */
    /* JADX WARN: Type inference failed for: r2v177 */
    /* JADX WARN: Type inference failed for: r2v178 */
    /* JADX WARN: Type inference failed for: r2v179 */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v97, types: [X.1tg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x04f5 -> B:213:0x04cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x06aa -> B:267:0x0686). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x079a -> B:287:0x0701). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x101e -> B:46:0x1032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:582:0x0edd -> B:575:0x0eb2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:620:0x0fab -> B:612:0x0f5d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:622:0x0fae -> B:612:0x0f5d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:646:0x110b -> B:637:0x10d7). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 4468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCR) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A02 = obj;
        this.A06 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(C5Y1 c5y1, InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC24731Iq interfaceC24731Iq) {
        super(2, interfaceC23621Ds);
        this.A07 = 0;
        this.A03 = interfaceC24731Iq;
        this.A02 = c5y1;
        this.A01 = interfaceC74963Ym;
        this.A04 = interfaceC74963Ym2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A05 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A06 = obj5;
        this.A04 = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Context context, UserSession userSession, JWO jwo, C4GV c4gv, C83693oE c83693oE, List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = 16;
        this.A06 = jwo;
        this.A01 = context;
        this.A05 = userSession;
        this.A03 = list;
        this.A02 = c4gv;
        this.A04 = c83693oE;
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A06 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A06 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(InterfaceC23621Ds interfaceC23621Ds, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A06 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCR(Activity activity, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = 19;
        this.A01 = activity;
    }
}
