package X;

import java.io.IOException;

/* renamed from: X.6ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151526ry {
    public static C151516rx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C151516rx c151516rx = new C151516rx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                A00(c16l, c151516rx, A0q);
                c16l.A0z();
            }
            return c151516rx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C16L c16l, C151516rx c151516rx, String str) {
        if ("outgoing_request".equals(str)) {
            c151516rx.A0F = c16l.A0d();
            return;
        }
        if ("following".equals(str)) {
            c151516rx.A0E = c16l.A0d();
            return;
        }
        if ("followed_by".equals(str)) {
            c151516rx.A02 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("incoming_request".equals(str)) {
            c151516rx.A07 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("blocking".equals(str)) {
            c151516rx.A00 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_blocking_reel".equals(str)) {
            c151516rx.A01 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("muting".equals(str)) {
            c151516rx.A05 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_muting_reel".equals(str)) {
            c151516rx.A06 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_muting_notes".equals(str)) {
            c151516rx.A04 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_muting_media_notes".equals(str)) {
            c151516rx.A03 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_private".equals(str)) {
            c151516rx.A0A = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("subscribed".equals(str)) {
            c151516rx.A0B = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_eligible_to_subscribe".equals(str)) {
            c151516rx.A09 = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("is_viewer_unconnected".equals(str)) {
            c151516rx.A0C = Boolean.valueOf(c16l.A0d());
            return;
        }
        if ("should_show_profile_upsell".equals(str)) {
            c151516rx.A0D = Boolean.valueOf(c16l.A0d());
        } else if ("is_banner_profile_upsell".equals(str)) {
            c151516rx.A08 = Boolean.valueOf(c16l.A0d());
        } else {
            C55702hA.A01(c16l, c151516rx, str);
        }
    }
}
