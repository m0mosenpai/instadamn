package X;

import java.io.IOException;

/* renamed from: X.I6o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40812I6o {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IKo, java.lang.Object] */
    public static C41175IKo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("about_this_shop_content".equals(A0s)) {
                    obj.A02 = AbstractC40807I6j.parseFromJson(c16l);
                } else if ("bloks_content".equals(A0s)) {
                    obj.A04 = AbstractC40809I6l.parseFromJson(c16l);
                } else if ("checkout_button_content".equals(A0s)) {
                    obj.A05 = AbstractC40811I6n.parseFromJson(c16l);
                } else if ("details_link_content".equals(A0s)) {
                    obj.A06 = AbstractC40813I6p.parseFromJson(c16l);
                } else if ("set_reminder_and_save_button_content".equals(A0s)) {
                    obj.A00 = I7D.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(4045).equals(A0s)) {
                    obj.A08 = AbstractC40817I6t.parseFromJson(c16l);
                } else if ("hero_carousel_content".equals(A0s)) {
                    obj.A09 = AbstractC40818I6u.parseFromJson(c16l);
                } else if (MSV.A00(1382).equals(A0s)) {
                    obj.A0A = I71.parseFromJson(c16l);
                } else if ("media_content".equals(A0s)) {
                    obj.A0B = I73.parseFromJson(c16l);
                } else if ("description_content".equals(A0s)) {
                    obj.A0C = I74.parseFromJson(c16l);
                } else if ("product_feed_content".equals(A0s)) {
                    obj.A0D = I75.parseFromJson(c16l);
                } else if ("shop_content".equals(A0s)) {
                    obj.A0F = I78.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3227).equals(A0s)) {
                    obj.A0G = I79.parseFromJson(c16l);
                } else if ("seller_badge_content".equals(A0s)) {
                    obj.A0E = I77.parseFromJson(c16l);
                } else if ("ar_content".equals(A0s)) {
                    obj.A0H = I7A.parseFromJson(c16l);
                } else if ("boolean_content".equals(A0s)) {
                    obj.A03 = AbstractC40808I6k.parseFromJson(c16l);
                } else if ("featured_product_permission_content".equals(A0s)) {
                    obj.A07 = AbstractC40816I6s.parseFromJson(c16l);
                } else if ("ig_funded_incentive_content".equals(A0s)) {
                    obj.A01 = AbstractC40723I3d.parseFromJson(c16l);
                } else if ("view_insights_content".equals(A0s)) {
                    obj.A0I = I7B.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
