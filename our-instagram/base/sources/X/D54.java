package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* loaded from: classes5.dex */
public final class D54 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public static Object A00(Object obj, D54 d54) {
        C37161oE.A00();
        UserSession userSession = (UserSession) d54.A02;
        String str = d54.A07;
        d54.A03 = obj;
        d54.A00 = 1;
        return AbstractC54281Nz1.A00(userSession).A04(str, d54);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C29206CuB c29206CuB, Integer num, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 8;
        this.A03 = c29206CuB;
        this.A06 = notesPogThoughtBubbleUiState;
        this.A07 = str;
        this.A05 = num;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C25845Bc0 c25845Bc0;
        String str;
        C15370ps c15370ps;
        C15370ps c15370ps2;
        C15370ps c15370ps3;
        C15370ps c15370ps4;
        int i;
        Object obj2;
        String str2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        String str3;
        int i3;
        switch (this.A04) {
            case 0:
                obj10 = this.A01;
                obj6 = this.A03;
                obj8 = this.A06;
                obj9 = this.A05;
                str3 = this.A07;
                obj7 = this.A02;
                i3 = 0;
                return new D54(obj10, obj6, obj8, obj9, obj7, str3, interfaceC23621Ds, i3);
            case 1:
                int i4 = this.A00;
                UserSession userSession = (UserSession) this.A02;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A06;
                String str4 = this.A07;
                return new D54((InterfaceC74953Yl) this.A05, (InterfaceC74953Yl) this.A01, (C44463JlV) this.A03, userSession, interfaceC60442pS, str4, interfaceC23621Ds, i4);
            case 2:
                Object obj11 = this.A06;
                Object obj12 = this.A02;
                String str5 = this.A07;
                return new D54(obj12, this.A05, this.A01, obj11, str5, interfaceC23621Ds, 2);
            case 3:
                obj2 = this.A02;
                str2 = this.A07;
                obj3 = this.A05;
                obj4 = this.A01;
                obj5 = this.A06;
                i2 = 3;
                return new D54(obj2, obj3, obj4, obj5, str2, interfaceC23621Ds, i2);
            case 4:
                obj2 = this.A02;
                str2 = this.A07;
                obj3 = this.A05;
                obj4 = this.A01;
                obj5 = this.A06;
                i2 = 4;
                return new D54(obj2, obj3, obj4, obj5, str2, interfaceC23621Ds, i2);
            case 5:
                obj2 = this.A02;
                str2 = this.A07;
                obj3 = this.A05;
                obj4 = this.A01;
                obj5 = this.A06;
                i2 = 5;
                return new D54(obj2, obj3, obj4, obj5, str2, interfaceC23621Ds, i2);
            case 6:
                obj6 = this.A03;
                obj9 = this.A05;
                str3 = this.A07;
                obj10 = this.A01;
                obj8 = this.A06;
                obj7 = this.A02;
                i3 = 6;
                return new D54(obj10, obj6, obj8, obj9, obj7, str3, interfaceC23621Ds, i3);
            case 7:
                obj6 = this.A03;
                obj9 = this.A05;
                str3 = this.A07;
                obj10 = this.A01;
                obj8 = this.A06;
                obj7 = this.A02;
                i3 = 7;
                return new D54(obj10, obj6, obj8, obj9, obj7, str3, interfaceC23621Ds, i3);
            case 8:
                C29206CuB c29206CuB = (C29206CuB) this.A03;
                return new D54((NotesPogThoughtBubbleUiState) this.A06, c29206CuB, (Integer) this.A05, this.A07, interfaceC23621Ds);
            case 9:
                D54 d54 = new D54((C1Dk) this.A01, (CVK) this.A05, (CTm) this.A03, this.A07, (Map) this.A06, interfaceC23621Ds);
                d54.A02 = obj;
                return d54;
            case 10:
                c25845Bc0 = (C25845Bc0) this.A03;
                str = this.A07;
                c15370ps = (C15370ps) this.A01;
                c15370ps2 = (C15370ps) this.A02;
                c15370ps3 = (C15370ps) this.A06;
                c15370ps4 = (C15370ps) this.A05;
                i = 10;
                return new D54(c25845Bc0, str, interfaceC23621Ds, c15370ps, c15370ps2, c15370ps3, c15370ps4, i);
            case 11:
                c25845Bc0 = (C25845Bc0) this.A03;
                str = this.A07;
                c15370ps = (C15370ps) this.A05;
                c15370ps2 = (C15370ps) this.A06;
                c15370ps3 = (C15370ps) this.A02;
                c15370ps4 = (C15370ps) this.A01;
                i = 11;
                return new D54(c25845Bc0, str, interfaceC23621Ds, c15370ps, c15370ps2, c15370ps3, c15370ps4, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj6 = this.A03;
                obj7 = this.A02;
                obj8 = this.A06;
                obj9 = this.A05;
                obj10 = this.A01;
                str3 = this.A07;
                i3 = 12;
                return new D54(obj10, obj6, obj8, obj9, obj7, str3, interfaceC23621Ds, i3);
            default:
                obj6 = this.A03;
                obj7 = this.A02;
                obj10 = this.A01;
                obj8 = this.A06;
                obj9 = this.A05;
                str3 = this.A07;
                i3 = 13;
                return new D54(obj10, obj6, obj8, obj9, obj7, str3, interfaceC23621Ds, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0269, code lost:
    
        if (r0 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ba, code lost:
    
        if (r5 != X.EnumC27370C5z.A02) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x055c, code lost:
    
        if (r7 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0939, code lost:
    
        if (r0 == X.C84.PUBLISHED_EDITS_IN_REVIEW) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x08c3, code lost:
    
        if (r8 == null) goto L385;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v94, types: [X.Mtj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v26, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v34, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 2440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D54.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D54) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(C25845Bc0 c25845Bc0, String str, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, C15370ps c15370ps2, C15370ps c15370ps3, C15370ps c15370ps4, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = c25845Bc0;
        this.A07 = str;
        if (10 - i != 0) {
            this.A05 = c15370ps;
            this.A06 = c15370ps2;
            this.A02 = c15370ps3;
            this.A01 = c15370ps4;
        } else {
            this.A01 = c15370ps;
            this.A02 = c15370ps2;
            this.A06 = c15370ps3;
            this.A05 = c15370ps4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C44463JlV c44463JlV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 1;
        this.A00 = i;
        this.A02 = userSession;
        this.A06 = interfaceC60442pS;
        this.A07 = str;
        this.A03 = c44463JlV;
        this.A05 = interfaceC74953Yl;
        this.A01 = interfaceC74953Yl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(C1Dk c1Dk, CVK cvk, CTm cTm, String str, Map map, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 9;
        this.A03 = cTm;
        this.A01 = c1Dk;
        this.A05 = cvk;
        this.A07 = str;
        this.A06 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A07 = str;
        this.A02 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D54(Object obj, Object obj2, Object obj3, Object obj4, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A07 = str;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A06 = obj4;
    }
}
