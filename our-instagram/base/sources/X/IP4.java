package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IP4 {
    public static H5X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(408).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fb_entity_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("fb_entity_subtype".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("fb_entity_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("fb_entity_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(409).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("mib_extid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H5X(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H5X h5x, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = h5x.A00;
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(408), str);
        }
        String str2 = h5x.A01;
        if (str2 != null) {
            anonymousClass182.A0S("fb_entity_id", str2);
        }
        String str3 = h5x.A02;
        if (str3 != null) {
            anonymousClass182.A0S("fb_entity_subtype", str3);
        }
        String str4 = h5x.A03;
        if (str4 != null) {
            anonymousClass182.A0S("fb_entity_type", str4);
        }
        String str5 = h5x.A04;
        if (str5 != null) {
            anonymousClass182.A0S("fb_entity_url", str5);
        }
        String str6 = h5x.A05;
        if (str6 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(409), str6);
        }
        String str7 = h5x.A06;
        if (str7 != null) {
            anonymousClass182.A0S("mib_extid", str7);
        }
        String str8 = h5x.A07;
        if (str8 != null) {
            anonymousClass182.A0S("pk", str8);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
