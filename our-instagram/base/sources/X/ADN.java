package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ADN {
    public static C185368Kc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C185368Kc c185368Kc = new C185368Kc();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("original_media_id".equals(A0s)) {
                    c185368Kc.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("original_media_duration".equals(A0s)) {
                    c185368Kc.A00 = c16l.A1D();
                } else if ("original_media_is_shared_to_facebook".equals(A0s)) {
                    c185368Kc.A06 = c16l.A0d();
                } else if ("are_remixes_crosspostable".equals(A0s)) {
                    c185368Kc.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("source_media_creation_state".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    EnumC189548aZ enumC189548aZ = (EnumC189548aZ) EnumC189548aZ.A02.get(A0m);
                    if (enumC189548aZ != null) {
                        c185368Kc.A03 = enumC189548aZ;
                    } else {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A0m);
                    }
                } else if ("original_media_is_photo".equals(A0s)) {
                    c185368Kc.A07 = c16l.A0d();
                } else if ("mashup_type".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    EnumC222929sX enumC222929sX = (EnumC222929sX) EnumC222929sX.A01.get(A0m2);
                    if (enumC222929sX != null) {
                        c185368Kc.A02 = enumC222929sX;
                    } else {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A0m2);
                    }
                } else {
                    continue;
                }
                c16l.A0z();
            }
            if (c185368Kc.A03 == null) {
                c185368Kc.A03 = EnumC189548aZ.A06;
                return c185368Kc;
            }
            return c185368Kc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C185368Kc c185368Kc) {
        anonymousClass182.A0d();
        String str = c185368Kc.A05;
        if (str != null) {
            anonymousClass182.A0S("original_media_id", str);
        }
        anonymousClass182.A0Q("original_media_duration", c185368Kc.A00);
        anonymousClass182.A0T("original_media_is_shared_to_facebook", c185368Kc.A06);
        Boolean bool = c185368Kc.A04;
        if (bool != null) {
            anonymousClass182.A0T("are_remixes_crosspostable", bool.booleanValue());
        }
        EnumC189548aZ enumC189548aZ = c185368Kc.A03;
        if (enumC189548aZ != null) {
            anonymousClass182.A0S("source_media_creation_state", enumC189548aZ.A00);
        }
        anonymousClass182.A0T("original_media_is_photo", c185368Kc.A07);
        EnumC222929sX enumC222929sX = c185368Kc.A02;
        if (enumC222929sX != null) {
            anonymousClass182.A0S("mashup_type", enumC222929sX.A00);
        }
        anonymousClass182.A0a();
    }
}
