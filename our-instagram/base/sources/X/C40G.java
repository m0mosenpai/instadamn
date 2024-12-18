package X;

import java.io.IOException;

/* renamed from: X.40G, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C40G {
    public static C40H parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            String str = null;
            String str2 = null;
            Integer num2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("end_scene_length".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("follower_count".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("icon_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("image_ad_length".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_profile_pic_end_scene".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("join_date_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("primary_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("swipe_area_height".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("swipe_area_width".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C40H(bool, num, num2, num3, num4, l, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
