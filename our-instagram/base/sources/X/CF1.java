package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CF1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, AbstractC58317Pt9.A00(1));
        Map map = (Map) A01;
        Object obj = map.get("bloks_app_id");
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get("obfuscated_user_id");
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = map.get("initiator_name");
        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj3;
        Object obj4 = map.get("entrypoint_name");
        C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) obj4;
        Object obj5 = map.get(AbstractC111324zv.A00(5594));
        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.String");
        String str5 = (String) obj5;
        String str6 = (String) map.get(AbstractC111324zv.A00(4260));
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            FragmentActivity A04 = C6BQ.A04(c6fq);
            C14360o3.A0B(A0B, 0);
            ((C28207Cc4) A0B.A01(C28207Cc4.class, new C50152MDf(A0B, 14))).A00(context, A04, CallerContext.A01("AccountSwitcherInstagramAppBindings"), str, str2, str3, str4, str5, str6);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
