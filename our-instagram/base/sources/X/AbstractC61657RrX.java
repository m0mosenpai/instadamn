package X;

import com.facebook.R;
import java.util.Map;

/* renamed from: X.RrX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61657RrX {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C1339263a c1339263a;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null && (c1339263a = (C1339263a) c6fg.A00(R.id.bk_context_key_async_component_store)) != null) {
            c1339263a.A04(A0d, map, EnumC61117RfX.A00);
            return null;
        }
        return null;
    }
}
