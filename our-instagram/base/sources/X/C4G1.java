package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4G1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4G1 {
    public static C4G2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4G2 c4g2 = new C4G2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("expiring_media_action_summary".equals(A0q)) {
                    c4g2.A01 = AbstractC101654ha.parseFromJson(c16l);
                } else if ("media".equals(A0q)) {
                    c4g2.A02 = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("pending_media".equals(A0q)) {
                    c4g2.A03 = C47Y.parseFromJson(c16l);
                } else {
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    if ("pending_media_key".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c4g2.A07 = str2;
                    } else if ("duration_ms".equals(A0q)) {
                        c4g2.A04 = Integer.valueOf(c16l.A1D());
                    } else if ("waveform_data".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(new Float(c16l.A0U()));
                            }
                        }
                        c4g2.A09 = arrayList;
                    } else if ("waveform_sampling_frequency_hz".equals(A0q)) {
                        c4g2.A05 = Integer.valueOf(c16l.A1D());
                    } else if ("seen_count".equals(A0q)) {
                        c4g2.A00 = c16l.A1D();
                    } else if ("url_expire_at_secs".equals(A0q)) {
                        c4g2.A06 = Long.valueOf(c16l.A0y());
                    } else if ("view_mode".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c4g2.A08 = str;
                    }
                }
                c16l.A0z();
            }
            C47Z c47z = c4g2.A03;
            if (c47z != null) {
                if (c4g2.A07 == null) {
                    c4g2.A07 = c47z.A35;
                }
                if (c4g2.A04 == null) {
                    C52W c52w = c47z.A1L;
                    c52w.getClass();
                    c4g2.A04 = Integer.valueOf(c52w.A00);
                }
                if (c4g2.A09 == null) {
                    List list = c4g2.A03.A4r;
                    list.getClass();
                    c4g2.A09 = list;
                }
                if (c4g2.A05 == null) {
                    Integer num = c4g2.A03.A2H;
                    num.getClass();
                    c4g2.A05 = num;
                    return c4g2;
                }
                return c4g2;
            }
            return c4g2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4G2 c4g2) {
        anonymousClass182.A0d();
        if (c4g2.A01 != null) {
            anonymousClass182.A0r("expiring_media_action_summary");
            AbstractC101654ha.A00(anonymousClass182, c4g2.A01);
        }
        if (c4g2.A02 != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = c4g2.A02;
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        if (c4g2.A03 != null) {
            anonymousClass182.A0r("pending_media");
            C47Y.A01(anonymousClass182, c4g2.A03);
        }
        String str = c4g2.A07;
        if (str != null) {
            anonymousClass182.A0S("pending_media_key", str);
        }
        Integer num = c4g2.A04;
        if (num != null) {
            anonymousClass182.A0Q("duration_ms", num.intValue());
        }
        if (c4g2.A09 != null) {
            C16V.A03(anonymousClass182, "waveform_data");
            for (Number number : c4g2.A09) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num2 = c4g2.A05;
        if (num2 != null) {
            anonymousClass182.A0Q("waveform_sampling_frequency_hz", num2.intValue());
        }
        anonymousClass182.A0Q("seen_count", c4g2.A00);
        Long l = c4g2.A06;
        if (l != null) {
            anonymousClass182.A0R("url_expire_at_secs", l.longValue());
        }
        String str2 = c4g2.A08;
        if (str2 != null) {
            anonymousClass182.A0S("view_mode", str2);
        }
        anonymousClass182.A0a();
    }
}
