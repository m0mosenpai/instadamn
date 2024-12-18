package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;

/* renamed from: X.627, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AnonymousClass627 {
    public static final AnonymousClass058 A02(InterfaceC16820sZ interfaceC16820sZ) {
        return new AnonymousClass058(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(null, interfaceC16820sZ));
    }

    public static final InterfaceC74953Yl A00(C5Tl c5Tl, Object obj, C12W c12w, InterfaceC19390xP interfaceC19390xP, int i) {
        if ((i & 2) != 0) {
            c12w = AnonymousClass191.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(-556827611, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean AH6 = c5Tl.AH6(c12w) | c5Tl.AH6(interfaceC19390xP);
        Object EEc = c5Tl.EEc();
        if (AH6 || EEc == C5UI.A00) {
            EEc = new C57172PZq(c12w, interfaceC19390xP, (InterfaceC23621Ds) null, 18);
            c5Tl.FBy(EEc);
        }
        if (C0fH.A02()) {
            C0fH.A01(473502065, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object EEc2 = c5Tl.EEc();
        Object obj2 = C5UI.A00;
        if (EEc2 == obj2) {
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            EEc2 = new ParcelableSnapshotMutableState(A00, obj);
            ((C117505Tk) c5Tl).A0Q(EEc2);
        }
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc2;
        boolean AH62 = c5Tl.AH6(EEc);
        Object EEc3 = c5Tl.EEc();
        if (AH62 || EEc3 == obj2) {
            EEc3 = new C57172PZq(EEc, interfaceC74953Yl, (InterfaceC23621Ds) null, 16);
            c5Tl.FBy(EEc3);
        }
        C5UX.A02(c5Tl, interfaceC19390xP, c12w, (InterfaceC16620sF) EEc3);
        if (C0fH.A02()) {
            C0fH.A00(-652149609);
        }
        if (C0fH.A02()) {
            C0fH.A00(1281785150);
        }
        return interfaceC74953Yl;
    }

    public static final InterfaceC74963Ym A01(C5Tl c5Tl, C0UO c0uo) {
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        if (C0fH.A02()) {
            C0fH.A01(-2088893856, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        InterfaceC74953Yl A00 = A00(c5Tl, c0uo.getValue(), anonymousClass191, c0uo, 0);
        if (C0fH.A02()) {
            C0fH.A00(955441152);
        }
        return A00;
    }
}
