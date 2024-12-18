package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes5.dex */
public abstract class CF7 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Long l;
        String str;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        C102884kP c102884kP = (C102884kP) c6fw.A00.get(0);
        if (c102884kP != null) {
            c102884kP.A0P();
            l = Long.valueOf(c102884kP.A04(35, -1L));
            str = c102884kP.A0L(44);
        } else {
            l = null;
            str = null;
        }
        C8k c8k = C8k.MEMU_IN_FEED_THREE_DOT_MENU;
        C26778Brz c26778Brz = new C26778Brz();
        Bundle A0b = AbstractC166987dD.A0b();
        if (l != null) {
            A0b.putLong("arg_mifu_content_id", l.longValue());
        }
        A0b.putString("arg_entry_point", c8k.toString());
        if (str != null) {
            A0b.putString("arg_mifu_session_id", str);
        }
        c26778Brz.setArguments(A0b);
        C140966Yy A0r = AbstractC25225BEi.A0r(A04, A0B);
        A0r.A08();
        C14360o3.A0A(c26778Brz);
        A0r.A0B(null, c26778Brz);
        A0r.A04();
        return null;
    }
}
