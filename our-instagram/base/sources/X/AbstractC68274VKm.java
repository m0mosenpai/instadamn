package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.VKm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68274VKm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Map A0E;
        String str;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A01;
        List list = c6fw.A00;
        Map map = (Map) list.get(1);
        if (map == null) {
            map = AbstractC06930Yk.A0E();
        }
        C102884kP c102884kP2 = (C102884kP) list.get(2);
        List list2 = (List) list.get(3);
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        Object A03 = c6fw.A03(4);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        if (c102884kP2 != null) {
            A0E = U5E.A0B(c6fq, c102884kP2, 35);
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        C189478aR A06 = AbstractC70200WGp.A06(C6BQ.A09(c6fq));
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        FragmentActivity A032 = C6BQ.A03(c6fg);
        if (A06 == null && (A06 = AbstractC70200WGp.A05(A032, A0A)) == null) {
            AbstractC25241Le.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside controller");
            return null;
        }
        C62862tP A062 = C6BQ.A06(c6fq);
        U5K A00 = U5L.A00(null, c6fg, c6fq, U5E.A03(c102884kP));
        U60 A012 = AbstractC70200WGp.A01(A062, A00, c6fg, c6fq, c102884kP, list2, map, A0E);
        A012.A0C = A06;
        C102884kP A002 = AbstractC69812Vvy.A00(list2);
        try {
            str = U5E.A08(c102884kP);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        A06.A0F(A012, AbstractC70200WGp.A07(A032, A012, A00, c6fg, c6fq, A002, str));
        return null;
    }
}
