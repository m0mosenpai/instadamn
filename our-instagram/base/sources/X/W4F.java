package X;

import android.content.Context;
import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W4F {
    public final Integer[] A01 = C05F.A00(4);
    public final C44S A00 = C102274j2.A02();

    public final void A01(Context context, PreferenceScreen preferenceScreen, InterfaceC55722hD interfaceC55722hD) {
        boolean A1R = AbstractC167007dF.A1R(0, preferenceScreen, context);
        QuickPromotionSurface[] values = QuickPromotionSurface.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (QuickPromotionSurface quickPromotionSurface : values) {
            linkedHashMap.put(quickPromotionSurface.name(), String.valueOf(quickPromotionSurface.A00));
        }
        Preference preference = new Preference(context, null);
        preference.A0H("/QP/reset_promotion_setting/");
        preference.A0F("Reset Quick Promotion Data");
        preference.A08 = new C70366WSu(context, preferenceScreen, this, interfaceC55722hD, linkedHashMap);
        A00(preference, preferenceScreen);
        QPCheckBoxPreference qPCheckBoxPreference = new QPCheckBoxPreference(context, interfaceC55722hD);
        qPCheckBoxPreference.A0H("/shared/qp/dev_mode");
        qPCheckBoxPreference.A0F("Enable Dev Mode");
        qPCheckBoxPreference.A0E("Disables hardcoded interstitial delays");
        qPCheckBoxPreference.A0D = false;
        A00(qPCheckBoxPreference, preferenceScreen);
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            PreferenceCategory preferenceCategory = new PreferenceCategory(context, null);
            C14360o3.A0B(entry, A1R ? 1 : 0);
            preferenceCategory.A0H((String) entry.getKey());
            A00(preferenceCategory, preferenceScreen);
            preferenceCategory.A0F((CharSequence) entry.getKey());
            HashMap hashMap = new HashMap();
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57170PZo(entry, interfaceC55722hD, this, context, hashMap, preferenceScreen, preferenceCategory, null, 3), AnonymousClass194.A02(C12P.A01));
        }
        Preference preference2 = new Preference(context, null);
        preference2.A0H("/QP/reset_delays/");
        preference2.A0F("Reset Impression and Dismissal Delays");
        preference2.A08 = new C70364WSs(A1R ? 1 : 0, context, interfaceC55722hD);
        A00(preference2, preferenceScreen);
        Preference preference3 = new Preference(context, null);
        preference3.A0H("/QP/reset_force_modes/");
        preference3.A0F("Reset All Force Modes to Default");
        preference3.A08 = new C70365WSt(context, preferenceScreen, this, interfaceC55722hD);
        A00(preference3, preferenceScreen);
    }

    public static final void A00(Preference preference, PreferenceScreen preferenceScreen) {
        long j;
        Preference A0N = preferenceScreen.A0N(preference.A0G);
        if (A0N != null) {
            PreferenceGroup preferenceGroup = A0N.A0A;
            synchronized (preferenceGroup) {
                Preference.A02(A0N);
                if (A0N.A0A == preferenceGroup) {
                    A0N.A0A = null;
                }
                if (preferenceGroup.A07.remove(A0N)) {
                    String str = A0N.A0G;
                    if (str != null) {
                        C005001p c005001p = preferenceGroup.A05;
                        if (A0N instanceof UG3) {
                            j = ((UG3) A0N).A00;
                        } else {
                            j = A0N.A04;
                        }
                        c005001p.put(str, Long.valueOf(j));
                        Handler handler = preferenceGroup.A04;
                        Runnable runnable = preferenceGroup.A06;
                        handler.removeCallbacks(runnable);
                        handler.post(runnable);
                    }
                    if (preferenceGroup.A01) {
                        A0N.A06();
                    }
                }
            }
            preferenceGroup.A07();
        }
        preferenceScreen.A0O(preference);
    }
}
