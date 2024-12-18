package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87743vi {
    public final Context A00;
    public final SubscriptionManager A01;
    public final C23411Cd A02;

    public static final void A00(EnumC105014oH enumC105014oH, Map map, int i) {
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            if (map.get(valueOf) == null) {
                map.put(valueOf, new ArrayList());
            }
            List list = (List) map.get(valueOf);
            if (list != null) {
                list.add(enumC105014oH);
            }
        }
    }

    public final String A01() {
        int defaultDataSubscriptionId;
        String simOperator;
        C23411Cd c23411Cd = this.A02;
        if (c23411Cd == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30 || (defaultDataSubscriptionId = SubscriptionManager.getActiveDataSubscriptionId()) == -1) {
            defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        }
        if (defaultDataSubscriptionId != -1) {
            TelephonyManager telephonyManager = c23411Cd.A05(defaultDataSubscriptionId).A00;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator != null && !AbstractC001900j.A0T(networkOperator)) {
                simOperator = telephonyManager.getNetworkOperator();
            } else {
                simOperator = telephonyManager.getSimOperator();
            }
            if (simOperator != null && !AbstractC001900j.A0T(simOperator)) {
                return simOperator;
            }
        }
        TelephonyManager telephonyManager2 = c23411Cd.A00;
        String networkOperator2 = telephonyManager2.getNetworkOperator();
        if (networkOperator2 != null && !AbstractC001900j.A0T(networkOperator2)) {
            return telephonyManager2.getNetworkOperator();
        }
        return telephonyManager2.getSimOperator();
    }

    public final ArrayList A02() {
        int defaultDataSubscriptionId;
        String str;
        SubscriptionManager subscriptionManager;
        SubscriptionInfo activeSubscriptionInfo;
        C23411Cd c23411Cd = this.A02;
        if (c23411Cd != null) {
            if (Build.VERSION.SDK_INT < 30 || (defaultDataSubscriptionId = SubscriptionManager.getActiveDataSubscriptionId()) == -1) {
                defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            }
            int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
            int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
            TreeMap treeMap = new TreeMap();
            A00(EnumC105014oH.A03, treeMap, defaultDataSubscriptionId);
            A00(EnumC105014oH.A05, treeMap, defaultVoiceSubscriptionId);
            A00(EnumC105014oH.A04, treeMap, defaultSmsSubscriptionId);
            if (!treeMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : treeMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    List list = (List) entry.getValue();
                    Boolean bool = null;
                    TelephonyManager createForSubscriptionId = c23411Cd.A00.createForSubscriptionId(intValue);
                    int simCarrierId = createForSubscriptionId.getSimCarrierId();
                    CharSequence simCarrierIdName = createForSubscriptionId.getSimCarrierIdName();
                    if (simCarrierIdName != null) {
                        str = simCarrierIdName.toString();
                    } else {
                        str = null;
                    }
                    Context context = this.A00;
                    if (context != null && C02G.A00(context, "android.permission.READ_PHONE_STATE") == 0 && (subscriptionManager = this.A01) != null && (activeSubscriptionInfo = subscriptionManager.getActiveSubscriptionInfo(intValue)) != null) {
                        bool = Boolean.valueOf(activeSubscriptionInfo.isEmbedded());
                    }
                    arrayList.add(new C105024oI(bool, createForSubscriptionId.getSimCountryIso(), createForSubscriptionId.getSimOperator(), createForSubscriptionId.getSimOperatorName(), str, createForSubscriptionId.getNetworkCountryIso(), createForSubscriptionId.getNetworkOperator(), createForSubscriptionId.getNetworkOperatorName(), list, simCarrierId, createForSubscriptionId.isNetworkRoaming()));
                }
                return arrayList;
            }
        }
        return null;
    }

    public C87743vi(Context context) {
        Object obj;
        this.A00 = context;
        if (context != null) {
            obj = context.getSystemService("telephony_subscription_service");
        } else {
            obj = null;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        this.A01 = (SubscriptionManager) obj;
        this.A02 = context != null ? C1CZ.A00(context, null) : null;
    }
}
