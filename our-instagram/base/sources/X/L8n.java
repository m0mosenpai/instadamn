package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;

/* loaded from: classes8.dex */
public final class L8n {
    public final C50B A00;
    public final UserSession A01;
    public final C132575yg A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.5Nu] */
    public final C116155Nu A00(SimpleImageUrl simpleImageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, boolean z) {
        AbstractC167007dF.A1F(str2, 1, str5);
        C50B c50b = this.A00;
        ?? obj = new Object();
        obj.A1O = true;
        obj.A03 = System.currentTimeMillis();
        obj.A1N = false;
        obj.A14 = null;
        obj.A0B = PushChannelType.A0D;
        obj.A07 = EnumC47122Ee.A0c;
        obj.A00 = -1.0f;
        obj.A01 = 0;
        obj.A02 = 0;
        obj.A0Z = null;
        obj.A1T = false;
        obj.A1L = null;
        obj.A1M = false;
        obj.A0K = AbstractC167007dF.A0d();
        obj.A05 = null;
        obj.A1I = str;
        obj.A0r = str2;
        obj.A0X = str3;
        obj.A0g = str6;
        obj.A0j = str5;
        obj.A1C = str7;
        obj.A12 = str8;
        obj.A11 = str4;
        obj.A0f = str9;
        obj.A08 = c50b;
        obj.A1T = z;
        obj.A1L = list;
        obj.A0C = simpleImageUrl;
        obj.A1A = str10;
        obj.A1F = str11;
        return obj;
    }

    public /* synthetic */ L8n(UserSession userSession) {
        C132575yg c132575yg = new C132575yg(AbstractC12290kX.A00);
        C50B c50b = new C50B(0, 0);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c132575yg;
        this.A00 = c50b;
    }

    public final C116155Nu A01(String str, String str2, String str3) {
        String str4 = this.A01.userId;
        if (str != null) {
            if (str2 != null) {
                return A00(null, null, "", "direct_v2_delete_item", "direct_v2_text", str4, str3, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, str, str2, null, null, null, false);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
