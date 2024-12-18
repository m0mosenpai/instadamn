package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77383dO {
    public static final C77383dO A00 = new Object();

    public final void A00(Context context, UserSession userSession, Integer num, String str, long j, boolean z) {
        long j2;
        String str2;
        String str3;
        C14360o3.A0B(str, 3);
        int intValue = num.intValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (intValue != 0) {
            j2 = 36323775373061736L;
        } else {
            j2 = 36323775372996199L;
        }
        if (C18U.A06(c06090Tz, userSession, j2)) {
            C18920wW A002 = new C12210kP(userSession).A00();
            InterfaceC02590Ai A003 = A002.A00(A002.A00, "ig_bg_prefetch_save");
            if (A003.isSampled()) {
                A003.AAP(TraceFieldType.RequestID, str);
                if (intValue != 0) {
                    str2 = "STORIES";
                } else {
                    str2 = "FEED";
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                A003.AAP("product", lowerCase);
                A003.A9K("bg_prefetch_timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    str3 = "success";
                } else {
                    str3 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
                }
                A003.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str3);
                A003.A9K("previous_bg_prefetch_timestamp", Long.valueOf(j));
                long j3 = C226218q.A00(context).getLong("last_app_start_timestamp", -1L);
                if (j3 > 0) {
                    A003.A9K("previous_app_start_timestamp", Long.valueOf(j3));
                }
                A003.Cht();
            }
        }
    }

    public final void A01(UserSession userSession, C1CA c1ca, Integer num, Long l, String str, List list) {
        long j;
        String str2;
        long j2;
        int intValue = num.intValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (intValue != 0) {
            j = 36323775373061736L;
        } else {
            j = 36323775372996199L;
        }
        if (C18U.A06(c06090Tz, userSession, j)) {
            C18920wW A002 = new C12210kP(userSession).A00();
            InterfaceC02590Ai A003 = A002.A00(A002.A00, "ig_app_start");
            if (A003.isSampled()) {
                A003.AAP("start_type", c1ca.name());
                if (intValue != 0) {
                    str2 = "STORIES";
                } else {
                    str2 = "FEED";
                }
                A003.AAP("product", str2);
                EnumC73363Qm enumC73363Qm = (EnumC73363Qm) AbstractC001800i.A0L(list);
                if (enumC73363Qm != null) {
                    j2 = enumC73363Qm.ordinal();
                } else {
                    j2 = 0;
                }
                A003.A9K("delivery_method", Long.valueOf(j2));
                if (list.contains(EnumC73363Qm.A03)) {
                    A003.AAP("cache_fetch_reason", str);
                    A003.A9K("cache_referesh_timestamp", l);
                }
                A003.Cht();
            }
        }
    }
}
