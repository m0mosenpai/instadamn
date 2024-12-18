package X;

import android.os.Bundle;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Fc1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35028Fc1 {
    public int A00 = -1;
    public C11520jB A01;
    public AnonymousClass341 A02;
    public C3YU A03;
    public EnumC114765Gh A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;

    public final C38J A02() {
        C38J c38j = new C38J();
        c38j.setArguments(A01());
        return c38j;
    }

    public static C35028Fc1 A00(String str) {
        IgFragmentFactoryImpl.A00();
        C35028Fc1 c35028Fc1 = new C35028Fc1();
        c35028Fc1.A0B = str;
        return c35028Fc1;
    }

    public final Bundle A01() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(AbstractC111324zv.A00(2131), this.A01);
        A0b.putString(MSV.A00(87), this.A0B);
        A0b.putBoolean(AbstractC111324zv.A00(2113), this.A0U);
        A0b.putSerializable(AbstractC111324zv.A00(2103), this.A04);
        A0b.putInt(AbstractC111324zv.A00(2111), this.A00);
        A0b.putString(AbstractC111324zv.A00(2109), this.A07);
        A0b.putBoolean(AbstractC111324zv.A00(2112), this.A0M);
        A0b.putBoolean(AbstractC111324zv.A00(2127), this.A0N);
        A0b.putBoolean(AbstractC111324zv.A00(2132), false);
        A0b.putBoolean(AbstractC111324zv.A00(2104), this.A0O);
        A0b.putString(AbstractC111324zv.A00(813), this.A0E);
        A0b.putString(AbstractC111324zv.A00(2133), this.A0I);
        A0b.putString(AbstractC111324zv.A00(2124), this.A09);
        A0b.putString(AbstractC111324zv.A00(2125), this.A0G);
        A0b.putString(AbstractC111324zv.A00(2126), this.A0H);
        AbstractC31171DnF.A12(A0b, this.A0F);
        A0b.putString(AbstractC111324zv.A00(2129), this.A0C);
        A0b.putString("com.instagram.android.fragment.ARGUMENT_MESSAGE_AUTHOR_ID", this.A0D);
        A0b.putSerializable(AbstractC111324zv.A00(2130), this.A03);
        A0b.putBoolean(AbstractC111324zv.A00(2121), this.A0J);
        A0b.putBoolean(AbstractC111324zv.A00(2122), this.A0K);
        A0b.putBoolean(AbstractC111324zv.A00(2128), false);
        A0b.putBoolean(AbstractC111324zv.A00(2123), this.A0L);
        A0b.putBundle(AbstractC111324zv.A00(2110), null);
        A0b.putString(AbstractC111324zv.A00(2117), this.A0A);
        A0b.putString(AbstractC111324zv.A00(2116), this.A08);
        A0b.putString(AbstractC111324zv.A00(2114), this.A05);
        A0b.putString(AbstractC111324zv.A00(2115), this.A06);
        A0b.putBoolean(AbstractC111324zv.A00(2105), this.A0P);
        A0b.putBoolean(AbstractC111324zv.A00(2107), this.A0R);
        A0b.putBoolean(AbstractC111324zv.A00(2106), this.A0Q);
        AnonymousClass341 anonymousClass341 = this.A02;
        if (anonymousClass341 != null) {
            A0b.putString(AbstractC111324zv.A00(2118), String.valueOf(anonymousClass341));
        }
        A0b.putBoolean(AbstractC111324zv.A00(2119), this.A0T);
        A0b.putBoolean(AbstractC111324zv.A00(2108), this.A0S);
        A0b.putBoolean(AbstractC111324zv.A00(2120), this.A0V);
        return A0b;
    }
}
