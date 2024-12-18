package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.4N4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4N4 implements C4N5 {
    public C0QL A00;
    public final Context A01;
    public final C74103Uo A02;
    public final C4N0 A03;
    public final Integer A04;
    public volatile String A05;
    public volatile String A06;

    public final boolean A02(String str) {
        String[] strArr;
        if (str != null) {
            if (!str.startsWith("https://")) {
                str = AnonymousClass001.A0R("https://", str);
            }
            try {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                if (this instanceof C4N9) {
                    strArr = new String[]{IGPixelRequestBuffer.URL_PREFIX, "workplace.com"};
                } else {
                    strArr = new String[]{IGPixelRequestBuffer.URL_PREFIX, "workplace.com", "pushnotifs.com"};
                }
                for (String str2 : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)))) {
                    String host = A03.getHost();
                    if (host == null || (!host.equalsIgnoreCase(str2) && !host.endsWith(AnonymousClass001.A0R(".", str2)))) {
                    }
                    return true;
                }
                return false;
            } catch (SecurityException unused) {
                return false;
            }
        }
        return true;
    }

    public final void A00() {
        if (!(this instanceof C4N9) && this.A00 == null) {
            C0QL c0ql = new C0QL(new InterfaceC08240bm() { // from class: X.4NA
                @Override // X.InterfaceC08240bm
                public final ArrayList BIr() {
                    String str;
                    if (C4N4.this instanceof C4N3) {
                        str = "com.facebook.rti.mqtt.ACTION_ZR_SWITCH";
                    } else {
                        str = "com.facebook.rti.mqtt.ACTION_WORK_SWITCH";
                    }
                    return new ArrayList(Collections.singletonList(new IntentFilter(str)));
                }

                @Override // X.InterfaceC08240bm
                public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
                    String str;
                    Object[] objArr;
                    String str2;
                    C91M ARA;
                    String str3;
                    C74103Uo c74103Uo;
                    String stringExtra = intent.getStringExtra("extra_mqtt_endpoint");
                    String stringExtra2 = intent.getStringExtra("extra_analytics_endpoint");
                    String stringExtra3 = intent.getStringExtra("extra_fbns_endpoint");
                    String stringExtra4 = intent.getStringExtra("extra_fbns_analytics_endpoint");
                    C4N4 c4n4 = C4N4.this;
                    C08600cO c08600cO = new C08600cO();
                    c08600cO.A01();
                    c08600cO.A04("MQTT_CONFIG_CHANGE_DOMAIN");
                    if (!c08600cO.A00().A03(context, intent, null)) {
                        if (c4n4 instanceof C4N3) {
                            str = "ZeroRatingConnectionConfigOverrides";
                        } else {
                            str = "WorkConnectionConfigOverrides";
                        }
                        objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
                        str2 = "ignore unauthorized sender %s, %s, %s, %s";
                    } else {
                        if (c4n4.A02(stringExtra) && c4n4.A02(stringExtra3)) {
                            Integer num = c4n4.A04;
                            if (num == C05F.A01 || num == C05F.A0C) {
                                if (!TextUtils.isEmpty(stringExtra3)) {
                                    stringExtra = stringExtra3;
                                }
                                if (!TextUtils.isEmpty(stringExtra4)) {
                                    stringExtra2 = stringExtra4;
                                }
                            }
                            String str4 = c4n4.A06;
                            if (str4 != null ? str4.equals(stringExtra) : stringExtra == null) {
                                String str5 = c4n4.A05;
                                if (str5 == null) {
                                    if (stringExtra2 == null) {
                                        return;
                                    }
                                } else if (str5.equals(stringExtra2)) {
                                    return;
                                }
                            }
                            if (c4n4 instanceof C4N3) {
                                if (stringExtra != null && (c74103Uo = c4n4.A02) != null) {
                                    ARA = c74103Uo.A00(c4n4.A01, AnonymousClass001.A0R("rti.mqtt.", "mqtt_last_host")).ARA();
                                    ARA.E7I("zero_rating_last_host", stringExtra);
                                    ARA.E7E("zero_rating_last_host_timestamp", System.currentTimeMillis());
                                    str3 = "ZeroRatingConnectionConfigOverrides";
                                }
                                c4n4.A06 = stringExtra;
                                c4n4.A05 = stringExtra2;
                                c4n4.A03.A02();
                                return;
                            }
                            ARA = c4n4.A02.A00(c4n4.A01, AnonymousClass001.A0R("rti.mqtt.", "mqtt_last_host")).ARA();
                            if (stringExtra != null) {
                                ARA.E7I(AbstractC58317Pt9.A00(1046), stringExtra);
                            }
                            if (stringExtra2 != null) {
                                ARA.E7I(AbstractC58317Pt9.A00(1045), stringExtra2);
                            }
                            str3 = "WorkConnectionConfigOverrides";
                            ARA.AIb(str3, "Failed to save endpoints to preferences");
                            c4n4.A06 = stringExtra;
                            c4n4.A05 = stringExtra2;
                            c4n4.A03.A02();
                            return;
                        }
                        if (c4n4 instanceof C4N3) {
                            str = "ZeroRatingConnectionConfigOverrides";
                        } else {
                            str = "WorkConnectionConfigOverrides";
                        }
                        objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
                        str2 = "ignore illegal target endpoint switch %s, %s, %s, %s";
                    }
                    C0K8.A0P(str, str2, objArr);
                }
            });
            this.A00 = c0ql;
            C0DJ.A02(c0ql, this.A01, (IntentFilter) ((AbstractC07590aY) c0ql).A00.get(0), null, "com.facebook.permission.prod.FB_APP_COMMUNICATION", false);
        }
    }

    public final void A01() {
        String str;
        C0QL c0ql = this.A00;
        if (c0ql != null) {
            try {
                this.A01.unregisterReceiver(c0ql);
            } catch (IllegalArgumentException e) {
                if (this instanceof C4N3) {
                    str = "ZeroRatingConnectionConfigOverrides";
                } else {
                    str = "WorkConnectionConfigOverrides";
                }
                C0K8.A0I(str, AbstractC58317Pt9.A00(69), e);
            }
            this.A00 = null;
        }
    }

    @Override // X.C4N5
    public final String Abb() {
        return this.A05;
    }

    @Override // X.C4N5
    public final String BV7() {
        return this.A06;
    }

    public C4N4(Context context, C74103Uo c74103Uo, C4N0 c4n0, Integer num) {
        this.A01 = context;
        this.A03 = c4n0;
        this.A04 = num;
        this.A02 = c74103Uo;
    }
}
