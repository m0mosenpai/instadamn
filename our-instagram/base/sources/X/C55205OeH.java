package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.base.IgReactQEModule;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.OeH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55205OeH {
    public static final java.util.Set A01;
    public static final String A03;
    public static final SimpleDateFormat A04;
    public static final C55205OeH A00 = new Object();
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C57379Pdd.A00);

    public static final C51761Mtk A00(Context context, String str) {
        CountryCodeData A002;
        int A0A;
        C14360o3.A0B(str, 1);
        if (((java.util.Set) A02.getValue()).contains(str) && !AbstractC001900j.A0T(str) && (A0A = PhoneNumberUtil.A01(context).A0A(str)) != 0) {
            Locale locale = new Locale(C1Q2.A02().getLanguage(), str);
            String valueOf = String.valueOf(A0A);
            String displayCountry = locale.getDisplayCountry();
            String country = locale.getCountry();
            C14360o3.A07(country);
            A002 = new CountryCodeData(valueOf, displayCountry, country);
        } else {
            A002 = AnonymousClass780.A00(context);
        }
        return new C51761Mtk(A002, (Integer) null, 2);
    }

    public static final C5QE A01(String str) {
        if (str != null && str.length() != 0) {
            return new BQO(str);
        }
        return BHS.A00(new Object[0], 2131964980);
    }

    public static final String A03(Context context, VEF vef, String str) {
        int i;
        switch (AbstractC25227BEk.A05(vef, 2)) {
            case 4:
            case 23:
                i = 2131964884;
                break;
            case 5:
            case 22:
                i = 2131964907;
                break;
            case 11:
                i = 2131964908;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 2131964914;
                break;
            default:
                return str;
        }
        return context.getString(i);
    }

    public static final void A04(C50634MWv c50634MWv, LeadGenInfoFieldTypes leadGenInfoFieldTypes, boolean z) {
        C14360o3.A0B(c50634MWv, 0);
        int A05 = AbstractC25227BEk.A05(leadGenInfoFieldTypes, 1);
        if (A05 != 6) {
            if (A05 != 14) {
                if (A05 == 20) {
                    c50634MWv.A02 = z;
                    return;
                }
                return;
            }
            c50634MWv.A01 = z;
            return;
        }
        c50634MWv.A00 = z;
    }

    public final String A06(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        VEF vef = VEF.A06;
        VEF vef2 = leadGenFormBaseQuestion.A03;
        if (vef != vef2 && VEF.A0U != vef2 && VEF.A0V != vef2 && VEF.A08 != vef2) {
            return vef2.toString();
        }
        return null;
    }

    public final String A07(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        VEF vef = VEF.A06;
        Object obj = leadGenFormBaseQuestion.A03;
        if (vef != obj) {
            if (VEF.A0U != obj && VEF.A0V != obj) {
                if (VEF.A08 != obj) {
                    return VEF.A07.toString();
                }
            } else {
                obj = EnumC53189Nfl.A0D;
            }
        } else if (leadGenFormBaseQuestion.A02 > 0 && leadGenFormBaseQuestion.A0B != null && leadGenFormBaseQuestion.A0E != null) {
            obj = EnumC53189Nfl.A0C;
        } else if (leadGenFormBaseQuestion.A0D.isEmpty()) {
            obj = EnumC53203Nfz.A04;
        } else {
            List list = leadGenFormBaseQuestion.A0C;
            if (list != null && !list.isEmpty()) {
                obj = EnumC53189Nfl.A09;
            } else if (!MSW.A1b(leadGenFormBaseQuestion.A0G) && !leadGenFormBaseQuestion.A0H) {
                obj = EnumC53203Nfz.A03;
            } else {
                obj = EnumC53189Nfl.A02;
            }
        }
        return obj.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OeH, java.lang.Object] */
    static {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(C1Q2.A02(), "MM/dd/yy, hh:mm a");
        A03 = bestDateTimePattern;
        A04 = new SimpleDateFormat(bestDateTimePattern, C1Q2.A02());
        String[] strArr = new String[28];
        boolean A1b = AbstractC31175DnJ.A1b(new String[]{"GB", "AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES"}, strArr);
        System.arraycopy(new String[]{"SE"}, A1b ? 1 : 0, strArr, 27, 1);
        C14360o3.A0B(strArr, A1b ? 1 : 0);
        A01 = AbstractC009903n.A0K(strArr);
    }

    public final int A05(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        VFS vfs = (VFS) EnumHelper.A00(leadGenFormBaseQuestion.A08, VFS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (vfs != null) {
            switch (vfs.ordinal()) {
                case 2:
                    return 4097;
                case 3:
                    return 33;
                case 4:
                case 6:
                case 7:
                case 8:
                case 10:
                    return 2;
                case 5:
                case 9:
                    return 528497;
                case 11:
                    return 3;
            }
        }
        int ordinal = leadGenFormBaseQuestion.A03.ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                return 3;
            }
            return 16385;
        }
        return 33;
    }

    public static final String A02(Context context) {
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = A04;
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        simpleDateFormat.applyLocalizedPattern(A03);
        return AbstractC31177DnL.A0b(context, simpleDateFormat.format(time), 2131964934);
    }
}
