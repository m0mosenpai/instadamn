package X;

import com.facebook.dsp.core.ColorData;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import kotlin.enums.EnumEntries;

/* loaded from: classes11.dex */
public final class U6D {
    public static final U6D A00 = new Object();

    public static final ColorData A01(C102884kP c102884kP) {
        if (c102884kP == null) {
            return null;
        }
        String A0G = c102884kP.A0G();
        int i = 16777215;
        if (A0G != null) {
            i = C6BE.A03(A0G);
        }
        String A0E = c102884kP.A0E();
        int i2 = 16777215;
        if (A0E != null) {
            i2 = C6BE.A03(A0E);
        }
        return new ColorData(i, i2);
    }

    public static final ColorData A02(C102884kP c102884kP) {
        if (c102884kP == null) {
            return null;
        }
        String A0G = c102884kP.A0G();
        int i = -1728053248;
        if (A0G != null) {
            i = C6BE.A03(A0G);
        }
        String A0E = c102884kP.A0E();
        int i2 = -1728053248;
        if (A0E != null) {
            i2 = C6BE.A03(A0E);
        }
        return new ColorData(i, i2);
    }

    public static final C65981Txa A03() {
        U6H u6h = C65981Txa.A0S;
        C14360o3.A0B(u6h, 1);
        Integer num = C05F.A0C;
        U6G u6g = C65981Txa.A0R;
        EnumC68205VFx enumC68205VFx = C65981Txa.A0N;
        EnumC68201VFt enumC68201VFt = C65981Txa.A0Q;
        EnumC68200VFs enumC68200VFs = C65981Txa.A0P;
        if (AbstractC68607VXi.A00()) {
            enumC68200VFs = EnumC68200VFs.A05;
        }
        return new C65981Txa(null, null, null, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx, null, enumC68200VFs, enumC68201VFt, u6g, u6h, null, num, null, null, null, null, 16542, false, false, false, false, false);
    }

    public static final C65981Txa A04(C6FG c6fg, C102884kP c102884kP) {
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins;
        EnumC68205VFx enumC68205VFx;
        EnumC68201VFt enumC68201VFt;
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins2;
        Integer num;
        Integer num2;
        U6G u6g;
        U6H u6h;
        EnumC68205VFx enumC68205VFx2;
        if (c102884kP != null) {
            int i = c102884kP.A05;
            if (i == 14059) {
                boolean A0S = c102884kP.A0S(36, false);
                String str = "FULL_SHEET";
                String A0L = c102884kP.A0L(40);
                if (A0L != null) {
                    str = A0L;
                }
                try {
                    if (str.equals("FULL_SHEET")) {
                        num = C05F.A00;
                    } else if (str.equals("HALF_SHEET")) {
                        num = C05F.A01;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } catch (IllegalArgumentException e) {
                    AbstractC25241Le.A03(C65981Txa.A0T, e);
                    num = C05F.A00;
                }
                String str2 = "NEVER_ANIMATED";
                String A0L2 = c102884kP.A0L(46);
                if (A0L2 != null) {
                    str2 = A0L2;
                }
                try {
                    if (str2.equals("ALWAYS_ANIMATED")) {
                        num2 = C05F.A00;
                    } else if (str2.equals("DISABLED")) {
                        num2 = C05F.A01;
                    } else if (str2.equals("NEVER_ANIMATED")) {
                        num2 = C05F.A0C;
                    } else if (str2.equals("ONLY_ANIMATED_WHILE_LOADING")) {
                        num2 = C05F.A0N;
                    } else {
                        throw new IllegalArgumentException(str2);
                    }
                } catch (IllegalArgumentException e2) {
                    AbstractC25241Le.A03(C65981Txa.A0T, e2);
                    num2 = C05F.A0C;
                }
                InterfaceC103384lE A0B = c102884kP.A0B(42);
                if (A0S) {
                    u6g = U6G.A05;
                } else {
                    u6g = U6G.A06;
                }
                Integer num3 = C05F.A00;
                if (num == num3) {
                    u6h = U6H.A08;
                } else {
                    u6h = U6H.A09;
                }
                int intValue = num2.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            enumC68205VFx2 = EnumC68205VFx.A08;
                        } else {
                            enumC68205VFx2 = EnumC68205VFx.A06;
                        }
                    } else {
                        enumC68205VFx2 = EnumC68205VFx.A07;
                    }
                } else {
                    enumC68205VFx2 = EnumC68205VFx.A04;
                }
                CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = new CdsOpenScreenCallerDismissCallback(new C71171Wp7(c6fg, c102884kP, A0B));
                C69513Vps c69513Vps = C65981Txa.A0O;
                Integer num4 = C05F.A0C;
                EnumC68201VFt enumC68201VFt2 = EnumC68201VFt.A04;
                return new C65981Txa(null, null, null, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx2, null, EnumC68200VFs.A04, enumC68201VFt2, u6g, u6h, cdsOpenScreenCallerDismissCallback, num4, null, null, num3, null, 16542, false, false, false, false, false);
            }
            String str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            String str4 = "full_sheet";
            String str5 = "auto";
            if (i == 16085) {
                String str6 = "auto";
                String A0L3 = c102884kP.A0L(36);
                if (A0L3 != null) {
                    str6 = A0L3;
                }
                EnumEntries enumEntries = U6G.A02;
                U6G A002 = U6F.A00(str6);
                String A0L4 = c102884kP.A0L(38);
                if (A0L4 != null) {
                    str4 = A0L4;
                }
                EnumEntries enumEntries2 = U6H.A03;
                U6H A003 = U6E.A00(str4);
                String str7 = "static";
                String A0L5 = c102884kP.A0L(35);
                if (A0L5 != null) {
                    str7 = A0L5;
                }
                EnumC68205VFx[] enumC68205VFxArr = EnumC68205VFx.A01;
                int length = enumC68205VFxArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        enumC68205VFx = enumC68205VFxArr[i2];
                        if (C14360o3.A0K(enumC68205VFx.toString(), str7)) {
                            break;
                        }
                        i2++;
                    } else {
                        C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding BackgroundMode enum value for: ", str7));
                        enumC68205VFx = EnumC68205VFx.A08;
                        break;
                    }
                }
                String A0L6 = c102884kP.A0L(43);
                if (A0L6 != null) {
                    str5 = A0L6;
                }
                EnumC68201VFt[] enumC68201VFtArr = EnumC68201VFt.A01;
                int length2 = enumC68201VFtArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        enumC68201VFt = enumC68201VFtArr[i3];
                        if (C14360o3.A0K(enumC68201VFt.toString(), str5)) {
                            break;
                        }
                        i3++;
                    } else {
                        C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding DimmedBackgroundTapToDismiss enum value for: ", str5));
                        enumC68201VFt = EnumC68201VFt.A04;
                        break;
                    }
                }
                ColorData A02 = A02(c102884kP.A08(55));
                String A0L7 = c102884kP.A0L(45);
                if (A0L7 != null) {
                    str3 = A0L7;
                }
                Integer A004 = U63.A00(str3);
                C14360o3.A07(A004);
                ColorData A01 = A01(c102884kP.A08(57));
                C102884kP A08 = c102884kP.A08(58);
                if (A08 == null) {
                    cdsOpenScreenConfig$BottomSheetMargins2 = null;
                } else {
                    cdsOpenScreenConfig$BottomSheetMargins2 = new CdsOpenScreenConfig$BottomSheetMargins(A00(A08, 36), A00(A08, 40), A00(A08, 38), A00(A08, 35));
                }
                InterfaceC103384lE A0B2 = c102884kP.A0B(40);
                boolean A0S2 = c102884kP.A0S(48, false);
                CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback2 = new CdsOpenScreenCallerDismissCallback(new C71171Wp7(c6fg, c102884kP, A0B2));
                C69513Vps c69513Vps2 = C65981Txa.A0O;
                Integer num5 = C05F.A0C;
                return new C65981Txa(null, A02, A01, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx, cdsOpenScreenConfig$BottomSheetMargins2, EnumC68200VFs.A04, enumC68201VFt, A002, A003, cdsOpenScreenCallerDismissCallback2, num5, null, A004, C05F.A00, null, 16542, A0S2, false, false, false, false);
            }
            if (i == 16542) {
                String A0L8 = c102884kP.A0L(35);
                if (A0L8 != null) {
                    str4 = A0L8;
                }
                EnumEntries enumEntries3 = U6H.A03;
                U6H A005 = U6E.A00(str4);
                String A0L9 = c102884kP.A0L(38);
                if (A0L9 != null) {
                    str5 = A0L9;
                }
                EnumEntries enumEntries4 = U6G.A02;
                U6G A006 = U6F.A00(str5);
                String str8 = "adjust_pan";
                String A0L10 = c102884kP.A0L(40);
                if (A0L10 != null) {
                    str8 = A0L10;
                }
                int hashCode = str8.hashCode();
                int i4 = 32;
                if (hashCode != -1009740956) {
                    if (hashCode == -205076707 && str8.equals("adjust_nothing")) {
                        i4 = 48;
                    }
                } else if (str8.equals("adjust_resize")) {
                    i4 = 16;
                }
                String A0L11 = c102884kP.A0L(41);
                if (A0L11 != null) {
                    str3 = A0L11;
                }
                Integer A007 = U63.A00(str3);
                C14360o3.A07(A007);
                ColorData A022 = A02(c102884kP.A08(52));
                ColorData A012 = A01(c102884kP.A08(54));
                C102884kP A082 = c102884kP.A08(55);
                if (A082 == null) {
                    cdsOpenScreenConfig$BottomSheetMargins = null;
                } else {
                    cdsOpenScreenConfig$BottomSheetMargins = new CdsOpenScreenConfig$BottomSheetMargins(A00(A082, 36), A00(A082, 40), A00(A082, 38), A00(A082, 35));
                }
                C69513Vps c69513Vps3 = C65981Txa.A0O;
                Integer num6 = C05F.A0C;
                EnumC68205VFx enumC68205VFx3 = EnumC68205VFx.A08;
                EnumC68201VFt enumC68201VFt3 = EnumC68201VFt.A04;
                Integer valueOf = Integer.valueOf(i4);
                return new C65981Txa(null, A022, A012, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx3, cdsOpenScreenConfig$BottomSheetMargins, EnumC68200VFs.A04, enumC68201VFt3, A006, A005, null, num6, valueOf, A007, C05F.A00, null, 16542, false, false, false, false, false);
            }
            String str9 = C65981Txa.A0T;
            StringBuilder sb = new StringBuilder();
            sb.append("Error matching OpenCDSSCreenConfig from options styleId: ");
            sb.append(c102884kP.A08(132));
            AbstractC25241Le.A02(str9, sb.toString());
        }
        return A03();
    }

    public static final int A00(C102884kP c102884kP, int i) {
        String str;
        StringBuilder sb;
        String A0L = c102884kP.A0L(i);
        float f = 4.0f;
        if (A0L != null) {
            try {
                f = C6BE.A01(A0L);
            } catch (C41M unused) {
                if (i != 35) {
                    if (i != 36) {
                        if (i != 38) {
                            if (i != 40) {
                                sb = new StringBuilder();
                                sb.append("Invalid BottomSheetMargin prop constant: ");
                                sb.append(i);
                                AbstractC25241Le.A02("BloksCdsOpenScreenConfig", sb.toString());
                                return 0;
                            }
                            str = "top";
                        } else {
                            str = "right";
                        }
                    } else {
                        str = "left";
                    }
                } else {
                    str = "bottom";
                }
                sb = new StringBuilder();
                sb.append("Invalid format for bottom-sheet-margin prop ");
                sb.append(str);
                sb.append(" : ");
                sb.append(A0L);
                AbstractC25241Le.A02("BloksCdsOpenScreenConfig", sb.toString());
                return 0;
            }
        }
        return (int) f;
    }
}
