package X;

import android.os.Bundle;

/* loaded from: classes9.dex */
public final class OK9 {
    public final N7O A01(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        EnumC53158NfD enumC53158NfD;
        boolean A1R = AbstractC167007dF.A1R(0, str, str2);
        Bundle A0E = AbstractC31174DnI.A0E(str3, 2);
        A0E.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_ID", str);
        A0E.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_INSIGHTS_ID", str4);
        A0E.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_BADGES_ESTIMATED_EARNINGS", str2);
        A0E.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_BADGES", str3);
        if (num != null) {
            A0E.putInt("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_SUPPORTERS", num.intValue());
        }
        A0E.putBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_POST_LIVE", z);
        A0E.putBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_FROM_SETTINGS", z2);
        int intValue = num2.intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                if (intValue != 2) {
                    enumC53158NfD = EnumC53158NfD.A05;
                } else {
                    enumC53158NfD = EnumC53158NfD.A04;
                }
            } else {
                enumC53158NfD = EnumC53158NfD.A03;
            }
        } else {
            enumC53158NfD = EnumC53158NfD.A02;
        }
        A0E.putSerializable("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_ENTRY_POINT", enumC53158NfD);
        A0E.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_TITLE", str5);
        if (l != null) {
            A0E.putLong("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_DATETIME", l.longValue());
        }
        N7O n7o = new N7O();
        n7o.setArguments(A0E);
        return n7o;
    }

    public final /* bridge */ /* synthetic */ EgJ A00(String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("ARGUMENT_ENTRY_POINT", str);
        A0b.putString("ARGUMENT_ENTRY_EXTRA", str2);
        EgJ egJ = new EgJ();
        egJ.setArguments(A0b);
        return egJ;
    }
}
