package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.170, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass170 {
    public static final User A00(C16L c16l) {
        User user;
        C16X parseFromJson = C16W.parseFromJson(c16l);
        if (parseFromJson != null) {
            user = A01(parseFromJson);
        } else {
            user = null;
        }
        return ((C07950bF) c16l).A1U(user, false);
    }

    public static final User A01(C16X c16x) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        boolean z7;
        boolean z8;
        Integer num;
        User user = new User(c16x.A0y, c16x.A17);
        user.A0q(String.valueOf(c16x.A0x));
        user.A03.EQI(c16x.A0r);
        Boolean bool = c16x.A0N;
        boolean z9 = false;
        if (bool != null) {
            user.A0v(bool.booleanValue());
        }
        Boolean bool2 = c16x.A0O;
        if (bool2 != null) {
            user.A0w(bool2.booleanValue());
        }
        user.A03.EU1(c16x.A0u);
        user.A03.EUj(c16x.A0i);
        user.A03.EUk(c16x.A0j);
        String str = c16x.A0w;
        if (str != null) {
            user.A0k(AbstractC38871rK.A00(str));
        }
        String str2 = c16x.A0z;
        if (str2 != null) {
            user.A03.EWv(AbstractC38871rK.A00(str2));
        }
        user.A03.EYn(c16x.A0l);
        String str3 = c16x.A12;
        if (str3 != null) {
            if (str3.equals("PrivacyStatusUnknown")) {
                num = C05F.A00;
            } else if (str3.equals("PrivacyStatusPublic")) {
                num = C05F.A01;
            } else if (str3.equals("PrivacyStatusPrivate")) {
                num = C05F.A0C;
            } else {
                throw new IllegalArgumentException(str3);
            }
            user.A0n(num);
        }
        user.A0i(c16x.A0A);
        user.A03.Ebj(c16x.A13);
        ExtendedImageUrl extendedImageUrl = c16x.A0B;
        if (extendedImageUrl != null) {
            user.A0j(extendedImageUrl);
        }
        Boolean bool3 = c16x.A0I;
        if (bool3 != null) {
            user.A03.EVF(bool3);
        }
        Boolean bool4 = c16x.A0J;
        if (bool4 != null) {
            z = bool4.booleanValue();
        } else {
            z = false;
        }
        user.A03.EVP(Boolean.valueOf(z));
        Boolean bool5 = c16x.A0c;
        if (bool5 != null) {
            z2 = bool5.booleanValue();
        } else {
            z2 = false;
        }
        user.A1C(z2);
        Boolean bool6 = c16x.A0b;
        if (bool6 != null) {
            user.A03.Ege(bool6);
        }
        Boolean bool7 = c16x.A0H;
        if (bool7 != null) {
            user.A03.ER8(bool7);
        }
        Boolean bool8 = c16x.A0E;
        if (bool8 != null) {
            user.A03.ER2(bool8);
        }
        Boolean bool9 = c16x.A0F;
        if (bool9 != null) {
            user.A03.ER5(bool9);
        }
        user.A03.ER1(c16x.A0D);
        user.A03.EQf(c16x.A0P);
        String str4 = c16x.A10;
        if (str4 != null) {
            user.A03.EaR(str4);
        } else {
            user.A03.EaR(null);
        }
        user.A03.EaS(c16x.A11);
        Integer num2 = c16x.A0h;
        if (num2 != null) {
            user.A03.EQG(num2);
        }
        user.A03.EcH(c16x.A05);
        user.A03.EZY(c16x.A07);
        user.A03.Edv(c16x.A08);
        String str5 = c16x.A0t;
        if (str5 != null) {
            user.A03.ESZ(str5);
        }
        user.A03.EWF(c16x.A0U);
        user.A03.EdG(c16x.A15);
        user.A03.EdI(c16x.A16);
        user.A03.EdE(c16x.A14);
        user.A03.EdF(c16x.A0n);
        Boolean bool10 = c16x.A0Q;
        if (bool10 != null) {
            user.A03.EQj(bool10);
        }
        user.A03.EQk(c16x.A03);
        user.A03.EUI(c16x.A0v);
        user.A03.EUH(c16x.A01);
        user.A0l(c16x.A0C);
        user.A0p(c16x.A0q);
        Integer num3 = c16x.A0k;
        if (num3 != null) {
            user.A0b(num3.intValue());
        }
        user.A03.EU5(c16x.A0R);
        Boolean bool11 = c16x.A0V;
        if (bool11 != null) {
            user.A03.EWG(bool11);
        }
        Boolean bool12 = c16x.A0W;
        if (bool12 != null) {
            user.A03.EZ1(bool12);
        }
        user.A03.Edb(c16x.A06);
        user.A03.ES7(c16x.A0s);
        Boolean bool13 = c16x.A0d;
        if (bool13 != null) {
            user.A03.EhJ(bool13);
        }
        Integer num4 = c16x.A0g;
        if (num4 != null) {
            i = num4.intValue();
        } else {
            i = -1;
        }
        user.A03.EhK(Integer.valueOf(i));
        Boolean bool14 = c16x.A0L;
        if (bool14 != null) {
            z3 = bool14.booleanValue();
        } else {
            z3 = false;
        }
        user.A03.EPp(Boolean.valueOf(z3));
        Integer num5 = c16x.A0m;
        if (num5 != null) {
            i2 = num5.intValue();
        } else {
            i2 = 0;
        }
        user.A03.Ecp(Integer.valueOf(i2));
        Boolean bool15 = c16x.A0Y;
        if (bool15 != null) {
            z4 = bool15.booleanValue();
        } else {
            z4 = false;
        }
        user.A03.EZR(Boolean.valueOf(z4));
        Boolean bool16 = c16x.A0Z;
        if (bool16 != null) {
            z5 = bool16.booleanValue();
        } else {
            z5 = false;
        }
        user.A03.EZS(Boolean.valueOf(z5));
        Boolean bool17 = c16x.A0a;
        if (bool17 != null) {
            z6 = bool17.booleanValue();
        } else {
            z6 = false;
        }
        user.A03.EZT(Boolean.valueOf(z6));
        user.A03.EVA(c16x.A0T);
        user.A03.EfB(c16x.A09);
        Boolean bool18 = c16x.A0S;
        if (bool18 != null) {
            user.A10(bool18.booleanValue());
        }
        user.A03.EU8(c16x.A02);
        user.A03.ESS(c16x.A00);
        user.A03.Efn(c16x.A0M);
        user.A03.EVY(c16x.A0K);
        Integer num6 = c16x.A0p;
        if (num6 != null) {
            i3 = num6.intValue();
        } else {
            i3 = 0;
        }
        user.A03.Efc(Integer.valueOf(i3));
        Boolean bool19 = c16x.A0f;
        if (bool19 != null) {
            z7 = bool19.booleanValue();
        } else {
            z7 = false;
        }
        user.A03.Efa(Boolean.valueOf(z7));
        user.A03.EfZ(c16x.A0o);
        Boolean bool20 = c16x.A0e;
        if (bool20 != null) {
            z8 = bool20.booleanValue();
        } else {
            z8 = false;
        }
        user.A03.EfW(Boolean.valueOf(z8));
        Boolean bool21 = c16x.A0X;
        if (bool21 != null) {
            z9 = bool21.booleanValue();
        }
        user.A03.EZA(Boolean.valueOf(z9));
        user.A03.Ea6(c16x.A04);
        return user;
    }
}
