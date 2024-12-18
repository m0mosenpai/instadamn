package X;

import android.content.Intent;
import android.net.Uri;
import com.instagram.realtimeclient.RealtimeConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.48a, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48a {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ C48a[] A04;
    public static final C48a A05;
    public final int A00;
    public final Intent A01;
    public final String A02;
    public static final C48a A07 = new C48a("CAMERA", "camera", "story-camera", 0, 2131954598);
    public static final C48a A0B = new C48a("POST", "post", "share", 1, 2131969834);
    public static final C48a A06 = new C48a("ACTIVITY", "activity", "news", 2, 2131952212);
    public static final C48a A08 = new C48a("DIRECT", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "direct-inbox", 3, 2131960477);
    public static final C48a A0A = new C48a("MAP", "map", "map", 4, 2131966037);
    public static final C48a A09 = new C48a("DIRECT_INTEROP", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "direct-inbox", 5, 2131959719);

    public static C48a valueOf(String str) {
        return (C48a) Enum.valueOf(C48a.class, str);
    }

    public static C48a[] values() {
        return (C48a[]) A04.clone();
    }

    static {
        C48a c48a = new C48a("ACCOUNT_SWITCH", "account_switch", "mainfeed", 6, 2131952104);
        A05 = c48a;
        C48a[] c48aArr = {A07, A0B, A06, A08, A0A, A09, c48a};
        A04 = c48aArr;
        A03 = AbstractC12190kN.A00(c48aArr);
    }

    public C48a(String str, String str2, String str3, int i, int i2) {
        this.A02 = str2;
        this.A00 = i2;
        Intent intent = new Intent("android.intent.action.VIEW");
        this.A01 = intent;
        intent.setData(new Uri.Builder().scheme("instagram").authority(str3).appendQueryParameter("app_shortcut", "true").build());
    }
}
