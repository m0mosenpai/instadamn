package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5TR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TR implements InterfaceC16620sF, InterfaceC16610sE, InterfaceC16600sD, InterfaceC16590sC, InterfaceC16570sA, C0s9, C0s8, C0s7, InterfaceC16810sY, InterfaceC16740sR, InterfaceC16800sX, InterfaceC16780sV, InterfaceC16770sU, InterfaceC16760sT, InterfaceC16750sS, InterfaceC16720sP, InterfaceC16670sK, InterfaceC16650sI, InterfaceC16640sH {
    public C5UV A00;
    public Object A01;
    public List A02;
    public final int A03;
    public final boolean A04;

    public final Object A02(C5Tl c5Tl, Object obj, Object obj2, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj3 = this.A01;
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj3, 4);
        Object invoke = ((InterfaceC16600sD) obj3).invoke(obj, obj2, c5Tl, Integer.valueOf((i2 << 7) | i));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C9FR(i, 1, this, obj2, obj);
        }
        return invoke;
    }

    public final Object A03(C5Tl c5Tl, Object obj, Object obj2, Object obj3, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj4 = this.A01;
        C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj4, 5);
        Object invoke = ((InterfaceC16590sC) obj4).invoke(obj, obj2, obj3, c5Tl, Integer.valueOf((i2 << 10) | i));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C207239Fc(this, obj, obj2, obj3, i, 0);
        }
        return invoke;
    }

    private final void A00(C5Tl c5Tl) {
        C5UU A0O;
        if (this.A04 && (A0O = ((C117505Tk) c5Tl).A0O()) != null) {
            A0O.A01 |= 1;
            if (C5UA.A05(this.A00, A0O)) {
                this.A00 = A0O;
                return;
            }
            List list = this.A02;
            if (list == null) {
                list = new ArrayList();
                this.A02 = list;
            } else {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (C5UA.A05((C5UV) list.get(i), A0O)) {
                        list.set(i, A0O);
                        return;
                    }
                }
            }
            list.add(A0O);
        }
    }

    public final Object A01(C5Tl c5Tl, Object obj, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj2 = this.A01;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj2, 3);
        Object invoke = ((InterfaceC16610sE) obj2).invoke(obj, c5Tl, Integer.valueOf((i2 << 4) | i));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C9FD(i, 1, obj, this);
        }
        return invoke;
    }

    public final Object A04(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj5 = this.A01;
        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj5, 6);
        Object invoke = ((InterfaceC16570sA) obj5).invoke(obj, obj2, obj3, obj4, c5Tl, Integer.valueOf((i2 << 13) | i));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUL(i, 0, this, obj, obj2, obj3, obj4);
        }
        return invoke;
    }

    public final Object A05(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj6 = this.A01;
        C14360o3.A0C(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj6, 7);
        Object invoke = ((C0s9) obj6).invoke(obj, obj2, obj3, obj4, obj5, c5Tl, Integer.valueOf(i | (i2 << 16)));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(obj5, this, obj4, obj2, obj3, obj, i, 1);
        }
        return invoke;
    }

    public final Object A06(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj7 = this.A01;
        C14360o3.A0C(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj7, 8);
        Object invoke = ((C0s8) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, c5Tl, Integer.valueOf(i | (i2 << 19)));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30289DVq(i, 0, this, obj, obj2, obj3, obj4, obj6, obj5);
        }
        return invoke;
    }

    public final Object A07(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj8 = this.A01;
        C14360o3.A0C(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj8, 9);
        Object invoke = ((C0s7) obj8).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, c5Tl, Integer.valueOf(i | (i2 << 22)));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWQ(obj, obj2, this, obj7, obj5, obj6, obj4, obj3, i, 0);
        }
        return invoke;
    }

    public final Object A08(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i2 = 1;
        if (c5Tl.AH4(this)) {
            i2 = 2;
        }
        Object obj9 = this.A01;
        C14360o3.A0C(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj9, 10);
        Object CP1 = ((InterfaceC16810sY) obj9).CP1(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c5Tl, Integer.valueOf(i | (i2 << 25)));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30319DWu(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i, 0);
        }
        return CP1;
    }

    public final Object A09(C5Tl c5Tl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i, int i2) {
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i3 = 1;
        if (c5Tl.AH4(this)) {
            i3 = 2;
        }
        Object obj15 = this.A01;
        C14360o3.A0C(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj15, 17);
        Object CP2 = ((InterfaceC16740sR) obj15).CP2(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, c5Tl, Integer.valueOf(i), Integer.valueOf(i2 | (i3 << 13)));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DYC(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i, i2);
        }
        return CP2;
    }

    public final void A0A(Object obj) {
        if (!C14360o3.A0K(this.A01, obj)) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            this.A01 = obj;
            if (!z && this.A04) {
                C5UV c5uv = this.A00;
                if (c5uv != null) {
                    C5UU c5uu = (C5UU) c5uv;
                    InterfaceC117425Tb interfaceC117425Tb = c5uu.A05;
                    if (interfaceC117425Tb != null) {
                        interfaceC117425Tb.COv(c5uu, null);
                    }
                    this.A00 = null;
                }
                List list = this.A02;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C5UU c5uu2 = (C5UU) ((C5UV) list.get(i));
                        InterfaceC117425Tb interfaceC117425Tb2 = c5uu2.A05;
                        if (interfaceC117425Tb2 != null) {
                            interfaceC117425Tb2.COv(c5uu2, null);
                        }
                    }
                    list.clear();
                }
            }
        }
    }

    @Override // X.InterfaceC16810sY
    public final /* bridge */ /* synthetic */ Object CP1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return A08((C5Tl) obj9, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, ((Number) obj10).intValue());
    }

    @Override // X.InterfaceC16740sR
    public final /* bridge */ /* synthetic */ Object CP2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return A09((C5Tl) obj15, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        int intValue = ((Number) obj2).intValue();
        c5Tl.Enr(this.A03);
        A00(c5Tl);
        int i = 1 << 1;
        if (c5Tl.AH4(this)) {
            i = 2 << 1;
        }
        Object obj3 = this.A01;
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C15500q5.A06(obj3, 2);
        Object invoke = ((InterfaceC16620sF) obj3).invoke(c5Tl, Integer.valueOf(intValue | i));
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C15500q5.A06(this, 2);
            ASZ.A06 = this;
        }
        return invoke;
    }

    public C5TR(int i, boolean z, Object obj) {
        this.A03 = i;
        this.A04 = z;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A01((C5Tl) obj2, obj, ((Number) obj3).intValue());
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return A02((C5Tl) obj3, obj, obj2, ((Number) obj4).intValue());
    }

    @Override // X.C0s8
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return A06((C5Tl) obj7, obj, obj2, obj3, obj4, obj5, obj6, ((Number) obj8).intValue());
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A03((C5Tl) obj4, obj, obj2, obj3, ((Number) obj5).intValue());
    }

    @Override // X.C0s7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return A07((C5Tl) obj8, obj, obj2, obj3, obj4, obj5, obj6, obj7, ((Number) obj9).intValue());
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return A05((C5Tl) obj6, obj, obj2, obj3, obj4, obj5, ((Number) obj7).intValue());
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A04((C5Tl) obj5, obj, obj2, obj3, obj4, ((Number) obj6).intValue());
    }
}
