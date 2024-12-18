package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6N3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N3 implements C6N2 {
    public static final C5C7 A03 = new C5C6(C6N5.A00, C6N4.A00);
    public InterfaceC117845Uu A00;
    public final Map A01;
    public final Map A02;

    @Override // X.C6N2
    public final void EGL(Object obj) {
        C6OB c6ob = (C6OB) this.A01.get(obj);
        if (c6ob != null) {
            c6ob.A00 = false;
        } else {
            this.A02.remove(obj);
        }
    }

    public C6N3(Map map) {
        this.A02 = map;
        this.A01 = new LinkedHashMap();
    }

    @Override // X.C6N2
    public final void A6z(C5Tl c5Tl, Object obj, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-1198538093);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(obj)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i5 = 128;
            if (c5Tl.AH6(this)) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1240152150, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            c5Tl.Ens(207, obj);
            Object EEc = c5Tl.EEc();
            Object obj2 = C5UI.A00;
            if (EEc == obj2) {
                InterfaceC117845Uu interfaceC117845Uu = this.A00;
                if (interfaceC117845Uu != null && !interfaceC117845Uu.AFS(obj)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type of the key ");
                    sb.append(obj);
                    sb.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    throw new IllegalArgumentException(sb.toString());
                }
                EEc = new C6OB(this, obj);
                ((C117505Tk) c5Tl).A0Q(EEc);
            }
            C6OB c6ob = (C6OB) EEc;
            AbstractC117695Ue.A00(c5Tl, C5VP.A00.A02(c6ob.A01), interfaceC16620sF, (i2 & 112) | 8);
            C0eB c0eB = C0eB.A00;
            boolean AH6 = c5Tl.AH6(this) | c5Tl.AH6(obj) | c5Tl.AH6(c6ob);
            Object EEc2 = c5Tl.EEc();
            if (AH6 || EEc2 == obj2) {
                EEc2 = new C9FO(3, this, obj, c6ob);
                c5Tl.FBy(EEc2);
            }
            C5UX.A03(c5Tl, c0eB, (InterfaceC16660sJ) EEc2);
            c5Tl.ASa();
            if (C0fH.A02()) {
                C0fH.A00(-1803572240);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30509Dbs(i, 3, this, interfaceC16620sF, obj);
        }
    }

    public C6N3() {
        this(new LinkedHashMap());
    }
}
