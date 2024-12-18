package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Iaq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41602Iaq {
    public final void A01(int i, Integer num) {
        String A0p = AbstractC166997dE.A0p(AbstractC12290kX.A00, i);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A04();
        A0K.A0D = A0p;
        A0K.A0O = true;
        if (num != null) {
            int intValue = num.intValue();
            A0K.A02();
            A0K.A04 = AbstractC12290kX.A00.getDrawable(intValue);
        }
        C41451vu.A01.E4s(new C3KD(A0K.A00()));
    }

    public static final HGY A00(Fragment fragment, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, int i4) {
        C6WQ A0i = AbstractC31174DnI.A0i(fragment.requireContext());
        C57312k6 A0a = AbstractC25229BEm.A0a(fragment);
        A0i.A00(fragment.getString(i));
        return new HGY(A0i, interfaceC16820sZ, interfaceC16820sZ2, A0a, i4, i2, i3);
    }
}
