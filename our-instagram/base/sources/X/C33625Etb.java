package X;

import android.os.Bundle;

/* renamed from: X.Etb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33625Etb {
    public final EK6 A00(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null && str.length() != 0) {
            A0b.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT", str);
        }
        if (str4 != null && str4.length() != 0) {
            A0b.putString("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE", str4);
        }
        if (str2 != null && str2.length() != 0) {
            A0b.putString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE", str2);
        }
        if (str3 != null && str3.length() != 0) {
            A0b.putString("ExplorePeopleFragment.ARGUMENT_TYPE", str3);
        }
        if (bool != null) {
            A0b.putBoolean("ExplorePeopleFragment.ARGUMENT_SHOULD_SHOW_NEW_HEADER", bool.booleanValue());
        }
        if (str5 != null) {
            A0b.putString(MSV.A00(40), str5);
        }
        if (str6 != null) {
            A0b.putString("ExplorePeopleFragment.ARGUMENT_SURFACE", str6);
        }
        A0b.putBoolean(AbstractC111324zv.A00(84), false);
        EK6 ek6 = new EK6();
        ek6.setArguments(A0b);
        return ek6;
    }

    public final EK6 A01(String str, String str2) {
        return A00(null, str, str2, null, null, null, null);
    }
}
