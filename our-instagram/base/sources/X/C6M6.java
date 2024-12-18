package X;

import java.util.Arrays;

/* renamed from: X.6M6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6M6 {
    public static final Object A00(C5Tl c5Tl, C5C7 c5c7, InterfaceC16820sZ interfaceC16820sZ, Object[] objArr, int i, int i2) {
        Object invoke;
        Object invoke2;
        Object AJe;
        C5C7 c5c72 = c5c7;
        if ((i2 & 2) != 0) {
            c5c72 = AbstractC27747CLo.A00;
            C14360o3.A0C(c5c72, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        if (C0fH.A02()) {
            C0fH.A01(-558662283, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        boolean z = true;
        String num = Integer.toString(C5X2.A00(c5Tl), 36);
        C14360o3.A07(num);
        C14360o3.A0C(c5c72, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC117845Uu interfaceC117845Uu = (InterfaceC117845Uu) C5UT.A01(C5VP.A00, C117505Tk.A04((C117505Tk) c5Tl));
        Object EEc = c5Tl.EEc();
        Object obj = C5UI.A00;
        if (EEc == obj) {
            if (interfaceC117845Uu == null || (AJe = interfaceC117845Uu.AJe(num)) == null || (invoke2 = c5c72.EKR(AJe)) == null) {
                invoke2 = interfaceC16820sZ.invoke();
            }
            EEc = new C6MQ(interfaceC117845Uu, c5c72, invoke2, num, objArr);
            c5Tl.FBy(EEc);
        }
        C6MQ c6mq = (C6MQ) EEc;
        if (!Arrays.equals(objArr, c6mq.A05) || (invoke = c6mq.A03) == null) {
            invoke = interfaceC16820sZ.invoke();
        }
        boolean AH6 = c5Tl.AH6(c6mq);
        if ((((i & 112) ^ 48) <= 32 || !c5Tl.AH6(c5c72)) && (i & 48) != 32) {
            z = false;
        }
        boolean AH62 = AH6 | z | c5Tl.AH6(interfaceC117845Uu) | c5Tl.AH4(num) | c5Tl.AH6(invoke) | c5Tl.AH6(objArr);
        Object EEc2 = c5Tl.EEc();
        if (AH62 || EEc2 == obj) {
            EEc2 = new B65(c6mq, interfaceC117845Uu, c5c72, invoke, num, objArr);
            c5Tl.FBy(EEc2);
        }
        C5UX.A05(c5Tl, (InterfaceC16820sZ) EEc2);
        if (C0fH.A02()) {
            C0fH.A00(-922537134);
        }
        return invoke;
    }
}
