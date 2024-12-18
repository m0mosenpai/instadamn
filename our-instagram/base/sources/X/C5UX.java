package X;

import java.util.Arrays;

/* renamed from: X.5UX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UX {
    public static final C5UY A00 = new Object();

    public static final C19K A00(C5Tl c5Tl, C12W c12w) {
        C12W c12w2;
        AnonymousClass196 anonymousClass196 = AnonymousClass195.A00;
        if (c12w.get(anonymousClass196) != null) {
            AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
            anonymousClass197.A0L(new C1JW(false, new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")));
            c12w2 = anonymousClass197;
        } else {
            C12W A08 = ((C117505Tk) c5Tl).A0U.A08();
            c12w2 = A08.plus(new AnonymousClass197((AnonymousClass195) A08.get(anonymousClass196))).plus(c12w);
        }
        return AnonymousClass194.A02(c12w2);
    }

    public static final void A01(C5Tl c5Tl, Object obj, Object obj2, InterfaceC16660sJ interfaceC16660sJ) {
        if (C0fH.A02()) {
            C0fH.A01(402719942, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean AH4 = c5Tl.AH4(obj) | c5Tl.AH4(obj2);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            c5Tl.FBy(new C117875Ux(interfaceC16660sJ));
        }
        if (C0fH.A02()) {
            C0fH.A00(-235108972);
        }
    }

    public static final void A02(C5Tl c5Tl, Object obj, Object obj2, InterfaceC16620sF interfaceC16620sF) {
        if (C0fH.A02()) {
            C0fH.A01(-500544843, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        C12W A08 = ((C117505Tk) c5Tl).A0U.A08();
        boolean AH4 = c5Tl.AH4(obj) | c5Tl.AH4(obj2);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            c5Tl.FBy(new C5UZ(A08, interfaceC16620sF));
        }
        if (C0fH.A02()) {
            C0fH.A00(-2110466718);
        }
    }

    public static final void A03(C5Tl c5Tl, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        if (C0fH.A02()) {
            C0fH.A01(-1803692365, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean AH4 = c5Tl.AH4(obj);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            c5Tl.FBy(new C117875Ux(interfaceC16660sJ));
        }
        if (C0fH.A02()) {
            C0fH.A00(1100962876);
        }
    }

    public static final void A04(C5Tl c5Tl, Object obj, InterfaceC16620sF interfaceC16620sF) {
        if (C0fH.A02()) {
            C0fH.A01(-145785844, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        C12W A08 = ((C117505Tk) c5Tl).A0U.A08();
        boolean AH4 = c5Tl.AH4(obj);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            c5Tl.FBy(new C5UZ(A08, interfaceC16620sF));
        }
        if (C0fH.A02()) {
            C0fH.A00(933247296);
        }
    }

    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ) {
        if (C0fH.A02()) {
            C0fH.A01(-1339200586, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        C117485Th c117485Th = ((C117505Tk) c5Tl).A0b.A05.A00;
        C5ZE c5ze = C5ZE.A00;
        c117485Th.A02(c5ze);
        AbstractC117665Ub.A01(c117485Th, interfaceC16820sZ, 0);
        int i = c117485Th.A03;
        int i2 = c5ze.A00;
        int i3 = 0;
        if (i2 != 0) {
            i3 = (-1) >>> (32 - i2);
        }
        if (i == i3) {
            int i4 = c117485Th.A04;
            int i5 = c5ze.A01;
            int i6 = 0;
            if (i5 != 0) {
                i6 = (-1) >>> (32 - i5);
            }
            if (i4 == i6) {
                if (C0fH.A02()) {
                    C0fH.A00(1213087865);
                    return;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            if (((1 << i8) & c117485Th.A03) != 0) {
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(c5ze.A00(i8));
                i7++;
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        StringBuilder sb2 = new StringBuilder();
        int i9 = c5ze.A01;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (((1 << i11) & c117485Th.A04) != 0) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c5ze.A01(i11));
                i10++;
            }
        }
        String obj2 = sb2.toString();
        C14360o3.A07(obj2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Error while pushing ");
        sb3.append(c5ze);
        sb3.append(". Not all arguments were provided. Missing ");
        sb3.append(i7);
        sb3.append(" int arguments (");
        sb3.append(obj);
        sb3.append(") and ");
        sb3.append(i10);
        sb3.append(" object arguments (");
        sb3.append(obj2);
        sb3.append(").");
        SQP.A01(sb3.toString());
        throw C00O.createAndThrow();
    }

    public static final void A06(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr) {
        if (C0fH.A02()) {
            C0fH.A01(-375584926, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= c5Tl.AH4(obj);
        }
        Object EEc = c5Tl.EEc();
        if (z || EEc == C5UI.A00) {
            c5Tl.FBy(new C117875Ux(interfaceC16660sJ));
        }
        if (C0fH.A02()) {
            C0fH.A00(255823998);
        }
    }

    public static final void A07(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, Object[] objArr) {
        if (C0fH.A02()) {
            C0fH.A01(1633019375, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        C12W A08 = ((C117505Tk) c5Tl).A0U.A08();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= c5Tl.AH4(obj);
        }
        Object EEc = c5Tl.EEc();
        if (z || EEc == C5UI.A00) {
            c5Tl.FBy(new C5UZ(A08, interfaceC16620sF));
        }
        if (C0fH.A02()) {
            C0fH.A00(1377014493);
        }
    }
}
