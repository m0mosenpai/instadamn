package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* renamed from: X.52y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1118652y {
    public static C1118752z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1118752z c1118752z = new C1118752z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (DatePickerDialogModule.ARG_MODE.equals(A0q)) {
                    c1118752z.A08 = c16l.A0d();
                } else if ("ttl_sec".equals(A0q)) {
                    c1118752z.A02 = Integer.valueOf(c16l.A1D());
                } else {
                    Integer num = null;
                    String str = null;
                    String str2 = null;
                    Integer num2 = null;
                    if ("last_set_actor_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c1118752z.A07 = str;
                    } else if ("last_set_timestamp_ms".equals(A0q)) {
                        c1118752z.A05 = Long.valueOf(c16l.A0y());
                    } else if ("last_set_action_log_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c1118752z.A06 = str2;
                    } else if ("last_set_ttl_sec".equals(A0q)) {
                        c1118752z.A00 = Integer.valueOf(c16l.A1D());
                    } else if ("e2ee_attribution_timestamp_ms".equals(A0q)) {
                        c1118752z.A04 = Long.valueOf(c16l.A0y());
                    } else if ("view_ttl_sec".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num2 = Integer.valueOf(c16l.A1D());
                        }
                        c1118752z.A03 = num2;
                    } else if ("last_set_view_ttl_sec".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num = Integer.valueOf(c16l.A1D());
                        }
                        c1118752z.A01 = num;
                    }
                }
                c16l.A0z();
            }
            return c1118752z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1118752z c1118752z) {
        anonymousClass182.A0d();
        anonymousClass182.A0T(DatePickerDialogModule.ARG_MODE, c1118752z.A08);
        Integer num = c1118752z.A02;
        if (num != null) {
            anonymousClass182.A0Q("ttl_sec", num.intValue());
        }
        String str = c1118752z.A07;
        if (str != null) {
            anonymousClass182.A0S("last_set_actor_id", str);
        }
        Long l = c1118752z.A05;
        if (l != null) {
            anonymousClass182.A0R("last_set_timestamp_ms", l.longValue());
        }
        String str2 = c1118752z.A06;
        if (str2 != null) {
            anonymousClass182.A0S("last_set_action_log_type", str2);
        }
        Integer num2 = c1118752z.A00;
        if (num2 != null) {
            anonymousClass182.A0Q("last_set_ttl_sec", num2.intValue());
        }
        Long l2 = c1118752z.A04;
        if (l2 != null) {
            anonymousClass182.A0R("e2ee_attribution_timestamp_ms", l2.longValue());
        }
        Integer num3 = c1118752z.A03;
        if (num3 != null) {
            anonymousClass182.A0Q("view_ttl_sec", num3.intValue());
        }
        Integer num4 = c1118752z.A01;
        if (num4 != null) {
            anonymousClass182.A0Q("last_set_view_ttl_sec", num4.intValue());
        }
        anonymousClass182.A0a();
    }
}
