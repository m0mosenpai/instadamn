package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

/* renamed from: X.8KR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KR implements InterfaceC13000lm {
    public final InterfaceC19630xq A00;
    public final HashMap A01;

    public C8KR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A3b);
        this.A00 = A03;
        this.A01 = new HashMap();
        long j = A03.getLong("last_clear_cache_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > 604800000) {
            InterfaceC19610xo ARD = this.A00.ARD();
            ARD.AHW();
            ARD.apply();
            InterfaceC19610xo ARD2 = A03.ARD();
            ARD2.E7G("last_clear_cache_time", currentTimeMillis);
            ARD2.apply();
        }
    }

    public final AA9 A00(String str) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(str)) {
            return (AA9) hashMap.get(str);
        }
        AA9 aa9 = null;
        try {
            String string = this.A00.getString(str, "not_found");
            if ("not_found".equals(string)) {
                return null;
            }
            aa9 = A1J.parseFromJson(C16V.A00(string));
            return aa9;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing json parameters ");
            sb.append(e);
            C0w9.A03("VideoSummarizerDataStore", sb.toString());
            return aa9;
        }
    }

    public final void A01(AA9 aa9) {
        this.A01.put(aa9.A01, aa9);
        try {
            InterfaceC19610xo ARD = this.A00.ARD();
            String str = aa9.A01;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            A0A.A0S("file_path", aa9.A01);
            A0A.A0Q("highest_rating_time_stamp", aa9.A00);
            C16V.A03(A0A, "keyframe_indexes");
            for (Number number : aa9.A03) {
                if (number != null) {
                    A0A.A0h(number.intValue());
                }
            }
            A0A.A0Z();
            C16V.A03(A0A, "frame_indices");
            for (Number number2 : aa9.A02) {
                if (number2 != null) {
                    A0A.A0h(number2.intValue());
                }
            }
            A0A.A0Z();
            C16V.A03(A0A, "timestampsUs");
            for (Number number3 : aa9.A05) {
                if (number3 != null) {
                    A0A.A0i(number3.longValue());
                }
            }
            A0A.A0Z();
            C16V.A03(A0A, "ratings");
            for (Number number4 : aa9.A04) {
                if (number4 != null) {
                    A0A.A0g(number4.floatValue());
                }
            }
            A0A.A0Z();
            A0A.A0a();
            A0A.close();
            ARD.E7K(str, stringWriter.toString());
            ARD.apply();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error setting json parameters ");
            sb.append(e);
            C0w9.A03("VideoSummarizerDataStore", sb.toString());
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.AHW();
        ARD.apply();
    }
}
