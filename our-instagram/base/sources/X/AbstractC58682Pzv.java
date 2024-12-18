package X;

import com.facebook.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Pzv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58682Pzv {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC58683Pzw enumC58683Pzw;
        C1339263a c1339263a;
        String A0G;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A00);
        C102884kP c102884kP = (C102884kP) MSW.A10(c6fw, 3);
        if (c102884kP != null && (A0G = c102884kP.A0G()) != null) {
            enumC58683Pzw = EnumC58683Pzw.valueOf(AbstractC166997dE.A10(Locale.ROOT, A0G));
        } else {
            enumC58683Pzw = null;
        }
        C14360o3.A0C(enumC58683Pzw, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.BloksComponentQueryStore.BloksAsyncComponentQueryPurpose");
        boolean A0S = c102884kP.A0S(41, false);
        boolean A0S2 = c102884kP.A0S(40, false);
        List A0O = c102884kP.A0O(43);
        C14360o3.A07(A0O);
        java.util.Set A0k = AbstractC001800i.A0k(A0O);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null && (c1339263a = (C1339263a) c6fg.A00(R.id.bk_context_key_async_component_store)) != null) {
            c1339263a.A03(enumC58683Pzw, null, str, map, A0k, A0N, A0S2, A0S);
        }
        return null;
    }
}
