package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;

/* renamed from: X.6IB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6IB {
    public static final InterfaceC74953Yl A00(C5Tl c5Tl, C07S c07s, C07T c07t, Object obj, C12W c12w, InterfaceC19390xP interfaceC19390xP, int i) {
        c5Tl.Enp(1977777920);
        if (C0fH.A02()) {
            C0fH.A01(1574164650, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        boolean z = false;
        Object[] objArr = {interfaceC19390xP, c07t, c07s, c12w};
        c5Tl.Enp(710004817);
        boolean AH6 = c5Tl.AH6(c07t);
        if ((((i & 7168) ^ 3072) > 2048 && c5Tl.AH4(c07s)) || (i & 3072) == 2048) {
            z = true;
        }
        boolean AH62 = z | AH6 | c5Tl.AH6(c12w) | c5Tl.AH6(interfaceC19390xP);
        Object EEc = c5Tl.EEc();
        if (AH62 || EEc == C5UI.A00) {
            EEc = new C9DS(c07s, c07t, (InterfaceC23621Ds) null, c12w, interfaceC19390xP);
            c5Tl.FBy(EEc);
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        if (C0fH.A02()) {
            C0fH.A01(1195955882, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        Object EEc2 = c5Tl.EEc();
        Object obj2 = C5UI.A00;
        if (EEc2 == obj2) {
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            EEc2 = new ParcelableSnapshotMutableState(A00, obj);
            c117505Tk.A0Q(EEc2);
        }
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean AH63 = c5Tl.AH6(EEc);
        Object EEc3 = c5Tl.EEc();
        if (AH63 || EEc3 == obj2) {
            EEc3 = new C57172PZq(EEc, interfaceC74953Yl, (InterfaceC23621Ds) null, 17);
            c5Tl.FBy(EEc3);
        }
        C5UX.A07(c5Tl, (InterfaceC16620sF) EEc3, copyOf);
        if (C0fH.A02()) {
            C0fH.A00(619777764);
        }
        if (C0fH.A02()) {
            C0fH.A00(1224249212);
        }
        C117505Tk.A0L(c117505Tk, false);
        return interfaceC74953Yl;
    }

    public static final InterfaceC74963Ym A01(C5Tl c5Tl, Object obj, InterfaceC19390xP interfaceC19390xP, int i) {
        c5Tl.Enp(-1485997211);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C07X c07x = (C07X) C5UT.A01(C5VN.A00, C117505Tk.A04(c117505Tk));
        C07S c07s = C07S.STARTED;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        if (C0fH.A02()) {
            C0fH.A01(1946537185, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        InterfaceC74953Yl A00 = A00(c5Tl, c07s, c07x.getLifecycle(), obj, anonymousClass191, interfaceC19390xP, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344));
        if (C0fH.A02()) {
            C0fH.A00(-929311021);
        }
        C117505Tk.A0L(c117505Tk, false);
        return A00;
    }

    public static final InterfaceC74963Ym A02(C5Tl c5Tl, C0UO c0uo, int i) {
        c5Tl.Enp(743249048);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C07X c07x = (C07X) C5UT.A01(C5VN.A00, C117505Tk.A04(c117505Tk));
        C07S c07s = C07S.STARTED;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        if (C0fH.A02()) {
            C0fH.A01(-940507653, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i2 = i << 3;
        InterfaceC74953Yl A00 = A00(c5Tl, c07s, c07x.getLifecycle(), c0uo.getValue(), anonymousClass191, c0uo, (i & 14) | (i2 & 7168) | (i2 & 57344));
        if (C0fH.A02()) {
            C0fH.A00(-400038336);
        }
        C117505Tk.A0L(c117505Tk, false);
        return A00;
    }
}
