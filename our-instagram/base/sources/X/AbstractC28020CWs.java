package X;

import android.graphics.Matrix;
import android.provider.Settings;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3;
import com.facebook.common.dextricks.Constants;
import java.util.Map;

/* renamed from: X.CWs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28020CWs {
    public static final void A00(C5Tl c5Tl, Alignment alignment, Modifier modifier, C5YL c5yl, SQ2 sq2, EnumC61098RfC enumC61098RfC, Map map, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        float f2 = f;
        int i5 = i;
        Alignment alignment2 = alignment;
        EnumC61098RfC enumC61098RfC2 = enumC61098RfC;
        Modifier modifier2 = modifier;
        C5YL c5yl2 = c5yl;
        Map map2 = map;
        c5Tl.Enr(185154698);
        if ((i4 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1V = AbstractC25226BEj.A1V(i4 & 4, z);
        boolean A1V2 = AbstractC25226BEj.A1V(i4 & 8, z2);
        if ((i4 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i4 & 64) != 0) {
            i5 = 1;
        }
        boolean A1U = AbstractC25226BEj.A1U(i4 & 128, z3);
        boolean A1U2 = AbstractC25226BEj.A1U(i4 & 256, z4);
        boolean A1U3 = AbstractC25226BEj.A1U(i4 & 512, z5);
        if ((i4 & 1024) != 0) {
            enumC61098RfC2 = EnumC61098RfC.AUTOMATIC;
        }
        boolean A1U4 = AbstractC25226BEj.A1U(i4 & C3OO.FLAG_MOVED, z6);
        boolean A1U5 = AbstractC25226BEj.A1U(i4 & 4096, z7);
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            alignment2 = C118195Wf.A09;
        }
        if ((32768 & i4) != 0) {
            c5yl2 = C5YJ.A04;
        }
        boolean A1V3 = AbstractC25226BEj.A1V(65536 & i4, z8);
        if ((131072 & i4) != 0) {
            map2 = null;
        }
        c5Tl.Enp(-180607681);
        Integer num = C05F.A00;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            c5Tl.Enp(-610207901);
            Object A0k = AbstractC25235BEs.A0k(c5Tl, -3687241);
            Object obj = C5UI.A00;
            if (A0k == obj) {
                A0k = new C28794CnQ();
                c5Tl.FBy(A0k);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C28794CnQ c28794CnQ = (C28794CnQ) A0k;
            C117505Tk.A0L(A0K, false);
            Object A0c = AbstractC25234BEr.A0c(c5Tl, AbstractC25235BEs.A0k(c5Tl, -3687241), obj, A1V);
            C117505Tk.A0L(A0K, false);
            c5Tl.Enp(-180606834);
            float f3 = f2 / Settings.Global.getFloat(AbstractC25228BEl.A0K(c5Tl).getContentResolver(), AbstractC111324zv.A00(172), 1.0f);
            C5UX.A07(c5Tl, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3((InterfaceC74953Yl) A0c, sq2, c28794CnQ, num, null, f3, i5, A1V, A1V2, A1U4, false), new Object[]{sq2, AbstractC25227BEk.A0k(A0K, A1V), null, Float.valueOf(f3), Integer.valueOf(i5)});
            C117505Tk.A0L(A0K, false);
            c5Tl.Enp(-3686930);
            boolean AH4 = c5Tl.AH4(c28794CnQ);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == obj) {
                EEc = new C57514Pfo(c28794CnQ, 33);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0L(A0K, false);
            int i6 = i2 >> 12;
            int i7 = i3 << 15;
            int i8 = 134217736 | ((i2 << 3) & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | ((i3 << 18) & 3670016) | (29360128 & i7) | (1879048192 & i7);
            int i9 = i3 >> 15;
            A01(c5Tl, alignment2, modifier2, c5yl2, sq2, enumC61098RfC2, map2, (InterfaceC16820sZ) EEc, i8, (i9 & 112) | (i9 & 14) | 512, 0, A1U, A1U2, A1U3, A1U5, A1V3);
            C5UU ASZ = c5Tl.ASZ();
            if (ASZ != null) {
                ASZ.A06 = new DYT(alignment2, modifier2, c5yl2, sq2, enumC61098RfC2, map2, f2, i5, i2, i3, i4, A1V, A1V2, A1U, A1U2, A1U3, A1U4, A1U5, A1V3);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0F("Speed must be a finite number. It is ", '.', f2));
    }

    public static final void A01(C5Tl c5Tl, Alignment alignment, Modifier modifier, C5YL c5yl, SQ2 sq2, EnumC61098RfC enumC61098RfC, Map map, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Modifier modifier2 = modifier;
        Map map2 = map;
        EnumC61098RfC enumC61098RfC2 = enumC61098RfC;
        C5YL c5yl2 = c5yl;
        Alignment alignment2 = alignment;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(185150686);
        if ((i3 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1U = AbstractC25226BEj.A1U(i3 & 8, z);
        boolean A1U2 = AbstractC25226BEj.A1U(i3 & 16, z2);
        boolean A1U3 = AbstractC25226BEj.A1U(i3 & 32, z3);
        if ((i3 & 64) != 0) {
            enumC61098RfC2 = EnumC61098RfC.AUTOMATIC;
        }
        boolean A1U4 = AbstractC25226BEj.A1U(i3 & 128, z4);
        if ((i3 & 512) != 0) {
            alignment2 = C118195Wf.A09;
        }
        if ((i3 & 1024) != 0) {
            c5yl2 = C5YJ.A04;
        }
        boolean A1V = AbstractC25226BEj.A1V(i3 & C3OO.FLAG_MOVED, z5);
        if ((i3 & 4096) != 0) {
            map2 = null;
        }
        Object A0k = AbstractC25235BEs.A0k(c5Tl, -3687241);
        Object obj = C5UI.A00;
        if (A0k == obj) {
            A0k = new Q2O();
            c5Tl.FBy(A0k);
        }
        C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
        Q2O q2o = (Q2O) A0k;
        Object A0k2 = AbstractC25235BEs.A0k(c5Tl, -3687241);
        if (A0k2 == obj) {
            A0k2 = new Matrix();
            c5Tl.FBy(A0k2);
        }
        C117505Tk.A0I(A0J);
        Matrix matrix = (Matrix) A0k2;
        Object A0k3 = AbstractC25235BEs.A0k(c5Tl, -3687241);
        if (A0k3 == obj) {
            A0k3 = AbstractC25232BEp.A0w(c5Tl, null);
        }
        C117505Tk.A0L(A0J, false);
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0k3;
        c5Tl.Enp(185151463);
        if (sq2 != null && sq2.A00() != 0.0f) {
            C117505Tk.A0L(A0J, false);
            float A00 = AbstractC63359SiH.A00();
            AbstractC119665bP.A00(c5Tl, AbstractC118185Wd.A0G(modifier2, sq2.A05.width() / A00, sq2.A05.height() / A00), new C65032TcI(matrix, interfaceC74953Yl, alignment2, c5yl2, sq2, q2o, enumC61098RfC2, map2, interfaceC16820sZ, A1U3, A1U, A1U2, A1U4, A1V), 0);
            C5UU ASZ = c5Tl.ASZ();
            if (ASZ != null) {
                ASZ.A06 = new DY3(alignment2, modifier2, c5yl2, sq2, enumC61098RfC2, map2, interfaceC16820sZ, i, i2, i3, A1U, A1U2, A1U3, A1U4, A1V);
                return;
            }
            return;
        }
        C117505Tk.A0L(A0J, false);
        C5UU ASZ2 = c5Tl.ASZ();
        if (ASZ2 != null) {
            ASZ2.A06 = new DY3(alignment2, modifier2, c5yl2, sq2, enumC61098RfC2, map2, interfaceC16820sZ, i, i2, i3, A1U, A1U2, A1U3, A1U4, A1V);
        }
        C5XX.A02(c5Tl, modifier2, (i >> 6) & 14);
    }
}
