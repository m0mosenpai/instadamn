package X;

import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VLW {
    /* JADX WARN: Type inference failed for: r0v13, types: [X.8jl, java.lang.Object] */
    public static final C1338462s A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP2 = (C102884kP) A02;
        List A0O = c102884kP2.A0O(40);
        List A0O2 = c102884kP2.A0O(38);
        List A0O3 = c102884kP2.A0O(36);
        List<C102884kP> A0O4 = c102884kP2.A0O(41);
        ArrayList arrayList = new ArrayList();
        InterfaceC103384lE A0B = c102884kP2.A0B(43);
        C1338862w c1338862w = null;
        if (A0B != null) {
            Object A00 = C131845xK.A00(c6fq, C6FW.A01, A0B);
            if (A00 instanceof Map) {
                c1338862w = AbstractC1338762v.A00((Map) A00);
            }
        }
        for (C102884kP c102884kP3 : A0O4) {
            String A0L = c102884kP3.A0L(36);
            if (A0L != null) {
                String A0E = c102884kP3.A0E();
                if (A0E != null) {
                    ?? obj = new Object();
                    obj.A00 = A0L;
                    obj.A01 = A0E;
                    arrayList.add(obj);
                } else {
                    throw new IllegalArgumentException("Received null name from props in the payload.Make tree resource references");
                }
            } else {
                throw new IllegalArgumentException("Received null variable id from props in the payload.Make tree resource references");
            }
        }
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            str = null;
        } else {
            str = (String) c6fg.A01.get(R.id.bk_context_key_logging_id);
        }
        return U72.A00(c6fq, c102884kP, c1338862w, str, A0O, A0O2, A0O3, arrayList, emptyList, emptyList2, null, null, null, false, false);
    }
}
