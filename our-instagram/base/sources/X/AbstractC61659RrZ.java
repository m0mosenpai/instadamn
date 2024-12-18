package X;

import android.util.Pair;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.RrZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61659RrZ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C1339263a c1339263a;
        Map map;
        Integer num;
        C63E c63e;
        C63F A00;
        InterfaceC103384lE A0B;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        Object A002 = c6fw.A00();
        C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A002);
        C102884kP c102884kP = (C102884kP) c6fw.A03(3);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            c1339263a = (C1339263a) c6fg.A00(R.id.bk_context_key_async_component_store);
        } else {
            c1339263a = null;
        }
        if (c6fg != null && c1339263a != null) {
            AnonymousClass630 A022 = AnonymousClass634.A02(c6fg);
            AbstractC79383gk.A02("Tree resources can only be read from the UI Thread");
            C62517SEt c62517SEt = (C62517SEt) A022.A04.A02.get(str);
            if (c62517SEt == null) {
                AbstractC25241Le.A02(AnonymousClass001.A0R("Didn't find payload with id ", str), "BKBloksActionAsyncComponentCacheWriteImpl");
                return null;
            }
            if (c102884kP != null && (A0B = c102884kP.A0B(42)) != null) {
                map = (Map) C131845xK.A00(c6fq, C6FW.A01, A0B);
            } else {
                map = null;
            }
            Pair pair = c62517SEt.A00;
            if (pair != null) {
                Object obj = pair.first;
                Q06 q06 = (Q06) pair.second;
                if (obj != null && q06 != null) {
                    Q0E A003 = Q0B.A00(q06, null);
                    if (map == null) {
                        map = AbstractC06930Yk.A0E();
                    }
                    C14360o3.A0B(str2, 0);
                    C63I c63i = c1339263a.A02;
                    if (c63i != null && (A00 = c63i.A00.A00(str2)) != null) {
                        num = A00.A00;
                    } else {
                        num = null;
                    }
                    if (num != C05F.A01) {
                        if (c63i != null) {
                            c63e = c63i.A00;
                        } else {
                            c63e = null;
                        }
                        String A004 = C58674Pzn.A00(c63e, str2, map);
                        C63U A005 = c1339263a.A07.A00(str2);
                        EnumC58683Pzw enumC58683Pzw = EnumC58683Pzw.A03;
                        AbstractC167007dF.A1D(A004, 0, enumC58683Pzw);
                        A005.A01.A00(A003, enumC58683Pzw, null, A004, A0N, A005.A02.now());
                        return null;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Cannot write to cache for secure prepackaged query ", str2, '.'));
                }
            }
            AbstractC25241Le.A02(AnonymousClass001.A0g("Stored payload for ", str, " is null"), "BKBloksActionAsyncComponentCacheWriteImpl");
            return null;
        }
        AbstractC25241Le.A02("Failed to get query store", "BKBloksActionAsyncComponentCacheWriteImpl");
        return null;
    }
}
