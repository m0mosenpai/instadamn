package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FSH {
    public static C114585Fe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_scene_length".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("follower_count".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("is_end_scene_permanent".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("page_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C114585Fe(bool, num, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114585Fe c114585Fe) {
        anonymousClass182.A0d();
        Integer num = c114585Fe.A01;
        if (num != null) {
            anonymousClass182.A0Q("end_scene_length", num.intValue());
        }
        Long l = c114585Fe.A02;
        if (l != null) {
            anonymousClass182.A0R("follower_count", l.longValue());
        }
        Boolean bool = c114585Fe.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_end_scene_permanent", bool.booleanValue());
        }
        String str = c114585Fe.A03;
        if (str != null) {
            anonymousClass182.A0S("page_name", str);
        }
        String str2 = c114585Fe.A04;
        if (str2 != null) {
            anonymousClass182.A0S("subtitle", str2);
        }
        anonymousClass182.A0a();
    }
}
