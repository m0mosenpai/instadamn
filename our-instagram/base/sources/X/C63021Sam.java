package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Sam, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63021Sam {
    public static final C0JO A02;
    public final C43031yW A00;
    public final QuickPerformanceLogger A01;

    public final void A04(JSONObject jSONObject) {
        int i;
        Iterator<String> keys;
        if (this.A00.A09(true)) {
            String optString = jSONObject.optString("markerID");
            String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C14360o3.A0A(optString);
            switch (optString.hashCode()) {
                case -1302779920:
                    if (!optString.equals("JS_MARKER")) {
                        return;
                    }
                    i = 772802650;
                    break;
                case -774331922:
                    if (!optString.equals("JS_SET_PAYMENT_VALUES")) {
                        return;
                    }
                    i = 772810608;
                    break;
                case -404306583:
                    if (!optString.equals("JS_AUTOFILL_PING")) {
                        return;
                    }
                    i = 772803488;
                    break;
                case -230162796:
                    if (!optString.equals("JS_SET_CONTACT_VALUES")) {
                        return;
                    }
                    i = 772807851;
                    break;
                case 997599488:
                    if (!optString.equals("JS_FIND_ALL_PAYMENT_FIELDS")) {
                        return;
                    }
                    i = 772802242;
                    break;
                case 1242941368:
                    if (!optString.equals("JS_REQUEST_AUTOFILL")) {
                        return;
                    }
                    i = 772812940;
                    break;
                case 2118983270:
                    if (!optString.equals("JS_PAGE_FORM_CALLBACK")) {
                        return;
                    }
                    i = 772816680;
                    break;
                default:
                    return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null) {
                return;
            }
            int intValue = valueOf.intValue();
            int optInt = jSONObject.optInt("instanceKey", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject(AbstractC43591JPw.A00(294));
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(keys);
                    this.A01.markerAnnotate(intValue, optInt, A1B, optJSONObject.optString(A1B));
                }
            }
            if (optString2 == null) {
                return;
            }
            int hashCode = optString2.hashCode();
            if (hashCode != 68795) {
                if (hashCode != 76307824) {
                    if (hashCode != 79219778 || !optString2.equals("START")) {
                        return;
                    }
                    this.A01.markerStart(intValue, optInt);
                    return;
                }
                if (!optString2.equals("POINT")) {
                    return;
                }
                this.A01.markerPoint(intValue, optInt, jSONObject.optString("point"));
                return;
            }
            if (!optString2.equals("END")) {
                return;
            }
            this.A01.markerEnd(intValue, optInt, (short) 2);
        }
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        A02 = awakeTimeSinceBootClock;
    }

    public final Integer A00(Long l, int i, int i2) {
        int i3;
        if (this.A00.A09(true)) {
            if (i2 == 0) {
                i3 = C0HM.A00().hashCode();
            } else {
                i3 = i2;
            }
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerStart(i, i3, false);
            } else {
                quickPerformanceLogger.markerStartWithCancelPolicy(i, false, i3, l.longValue(), TimeUnit.MILLISECONDS);
            }
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            return Integer.valueOf(i3);
        }
        return null;
    }

    public final void A01(Integer num, Long l, int i) {
        if (this.A00.A09(true) && num != null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerEnd(i, num.intValue(), (short) 2);
            } else {
                quickPerformanceLogger.markerEnd(i, num.intValue(), (short) 2, l.longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void A02(Integer num, Long l, String str, int i) {
        if (this.A00.A09(true) && num != null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A01;
            if (l == null) {
                quickPerformanceLogger.markerPoint(i, num.intValue(), str);
            } else {
                quickPerformanceLogger.markerPoint(i, num.intValue(), str, l.longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void A03(Integer num, String str, String str2, int i) {
        if (this.A00.A09(true) && num != null) {
            this.A01.markerAnnotate(i, num.intValue(), str, str2);
        }
    }

    public C63021Sam(C43031yW c43031yW, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        this.A00 = c43031yW;
    }
}
