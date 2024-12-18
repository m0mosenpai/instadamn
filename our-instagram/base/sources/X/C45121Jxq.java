package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jxq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45121Jxq extends C0T6 {
    public static final C46918Koz A01;
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45121Jxq) && C14360o3.A0K(this.A00, ((C45121Jxq) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Koz] */
    static {
        ?? obj = new Object();
        A01 = obj;
        C14360o3.A07(AbstractC31173DnH.A0q(obj));
    }

    public static final int A00(C45121Jxq c45121Jxq) {
        C45108Jxc c45108Jxc = (C45108Jxc) AbstractC001800i.A0J(c45121Jxq.A00);
        if (c45108Jxc != null) {
            int i = c45108Jxc.A05;
            if (Integer.valueOf(i) != null) {
                if (i == 2) {
                    return 1519;
                }
                if (i == 1) {
                    return 1520;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public static final long A01(C45121Jxq c45121Jxq) {
        Iterator it = c45121Jxq.A00.iterator();
        if (it.hasNext()) {
            long j = ((C45108Jxc) it.next()).A07;
            while (true) {
                long j2 = j;
                while (it.hasNext()) {
                    j = ((C45108Jxc) it.next()).A07;
                    if (j2 < j) {
                        break;
                    }
                }
                return j2;
            }
        }
        throw new NoSuchElementException();
    }

    public static final String A02(C45121Jxq c45121Jxq) {
        Resources resources;
        int i;
        List list = c45121Jxq.A00;
        C45108Jxc c45108Jxc = (C45108Jxc) AbstractC001800i.A0J(list);
        if (c45108Jxc != null) {
            int i2 = c45108Jxc.A05;
            if (Integer.valueOf(i2) != null) {
                if (i2 == 2) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    resources = context.getResources();
                    i = R.plurals.security_alert_bundle_login_alert_text;
                } else if (i2 == 1) {
                    Context context2 = AbstractC12290kX.A00;
                    C14360o3.A07(context2);
                    resources = context2.getResources();
                    i = R.plurals.security_alert_bundle_keychange_alert_text;
                } else {
                    return "";
                }
                String quantityString = resources.getQuantityString(i, list.size(), AbstractC25228BEl.A1Y(list.size()));
                C14360o3.A07(quantityString);
                return quantityString;
            }
            return "";
        }
        return "";
    }

    public final C5HW A04(UserSession userSession) {
        Map map;
        Object c09540e5;
        int i;
        int i2;
        List list = this.A00;
        if (!list.isEmpty()) {
            C09530e4 A1L = AbstractC166987dD.A1L("destination", A03(this));
            C09530e4 A1L2 = AbstractC166987dD.A1L("icon_url", "https://i.instagram.com/static/images/activity/info-1.5.png/3385260677b8.png");
            C09530e4 A1L3 = AbstractC166987dD.A1L("rich_text", A02(this));
            C09530e4 A1L4 = AbstractC166987dD.A1L("timestamp", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(A01(this))));
            Map A0n = AbstractC167007dF.A0n("action_type", "hide");
            if (C18U.A06(C06090Tz.A06, userSession, 36321438911702469L)) {
                map = AbstractC167007dF.A0n("action_type", "turn_off_security_alert");
            } else {
                map = null;
            }
            LinkedHashMap A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("inline_controls", AbstractC16960so.A1R(A0n, map)), AbstractC166987dD.A1L(AbstractC111324zv.A00(976), AbstractC167007dF.A0n(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "unseen")));
            try {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("security_alert/");
                C45108Jxc c45108Jxc = (C45108Jxc) AbstractC001800i.A0J(list);
                if (c45108Jxc != null) {
                    i2 = c45108Jxc.A06;
                } else {
                    i2 = 0;
                }
                A1C.append(i2);
                A1C.append('/');
                c09540e5 = C5HV.parseFromJson(C16V.A00(AbstractC31175DnJ.A0d(AbstractC06930Yk.A06(AbstractC166987dD.A1L("pk", AbstractC166997dE.A0v(UUID.randomUUID(), A1C)), AbstractC166987dD.A1L("args", A06), AbstractC166987dD.A1L("notif_name", "local_bundle_security_alert"), AbstractC167007dF.A0o("story_type", A00(this)), AbstractC167007dF.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C5Hd.BUNDLE_WITH_ICON.A00)))));
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
            Throwable A00 = C09550e6.A00(c09540e5);
            if (A00 != null) {
                A00.getMessage();
                c09540e5 = null;
            }
            C5HW c5hw = (C5HW) c09540e5;
            if (c5hw != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C45108Jxc) it.next()).A02 == null) {
                            i = 2753;
                            break;
                        }
                    }
                }
                i = 2814;
                c5hw.A0D = AbstractC111324zv.A00(i);
                return c5hw;
            }
        }
        return null;
    }

    public C45121Jxq(List list) {
        this.A00 = list;
    }

    public static final String A03(C45121Jxq c45121Jxq) {
        StringBuilder A11;
        EnumC31336Dq1 enumC31336Dq1;
        int i;
        int A00 = A00(c45121Jxq);
        if (A00 != 1519) {
            if (A00 != 1520) {
                return "";
            }
            A11 = AbstractC166997dE.A11("ig://");
            enumC31336Dq1 = EnumC31336Dq1.A2f;
        } else {
            A11 = AbstractC166997dE.A11("ig://");
            enumC31336Dq1 = EnumC31336Dq1.A2e;
        }
        A11.append(enumC31336Dq1);
        A11.append("?deviceId=");
        List list = c45121Jxq.A00;
        C45108Jxc c45108Jxc = (C45108Jxc) AbstractC001800i.A0J(list);
        if (c45108Jxc != null) {
            i = c45108Jxc.A06;
        } else {
            i = 0;
        }
        A11.append(i);
        A11.append("&ids=");
        return AbstractC166997dE.A0x(AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, C50338MKq.A00), A11);
    }

    public final String toString() {
        int i;
        JSR A00 = JSS.A00(this);
        List list = this.A00;
        A00.A01(AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, C50338MKq.A00), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C45108Jxc c45108Jxc = (C45108Jxc) AbstractC001800i.A0J(list);
        if (c45108Jxc != null) {
            i = c45108Jxc.A06;
        } else {
            i = 0;
        }
        A00.A02("deviceId", i);
        A00.A03("createdTimestampMs", A01(this));
        A00.A01(A02(this), "label");
        A00.A02("notificationType", A00(this));
        A00.A01("local_bundle_security_alert", "notificationName");
        A00.A01(A03(this), "notificationDestination");
        A00.A01(list, "alerts");
        return AbstractC166987dD.A19(A00);
    }
}
