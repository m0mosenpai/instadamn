package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.VPm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68404VPm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Map A0E;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A01;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        List list = c6fw.A00;
        C102884kP c102884kP2 = (C102884kP) list.get(2);
        List list2 = (List) list.get(3);
        C6FG A00 = C103064kh.A00(c6fq, c6fw, 4);
        if (c102884kP2 != null) {
            A0E = U5E.A0B(c6fq, c102884kP2, 35);
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        AbstractC70200WGp.A0C(C6BQ.A06(c6fq), A00, c6fq, c102884kP, list2, map, A0E);
        return null;
    }
}
