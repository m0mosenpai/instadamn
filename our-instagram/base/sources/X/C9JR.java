package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9JR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JR {
    public static C9JS parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            EnumC209589Ot enumC209589Ot = null;
            String str3 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            EnumC189548aZ enumC189548aZ = null;
            AbstractC172157lk abstractC172157lk = null;
            C202278x7 c202278x7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("original_source_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("original_source_length_ms".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("original_source_progressive_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("original_source_media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    enumC209589Ot = (EnumC209589Ot) EnumC209589Ot.A01.get(A1P2);
                    if (enumC209589Ot == null) {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A1P2);
                    }
                } else if ("original_source_author_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("are_remixes_crosspostable".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("remix_image_regions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C5NJ parseFromJson = C5NI.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("source_media_creation_state".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    enumC189548aZ = (EnumC189548aZ) EnumC189548aZ.A02.get(A1P);
                    if (enumC189548aZ == null) {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A1P);
                    }
                } else if ("visualReplyDisplayMode".equals(A0q)) {
                    abstractC172157lk = (AbstractC172157lk) AbstractC40411u9.A00.A01(c16l);
                } else if ("interactive_drawable_transform".equals(A0q)) {
                    c202278x7 = AbstractC203328yp.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("original_source_media_id", c16l, "ClipsRemixDraftModel");
            } else if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("original_source_length_ms", c16l, "ClipsRemixDraftModel");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("original_source_progressive_url", c16l, "ClipsRemixDraftModel");
            } else if (enumC209589Ot == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("original_source_media_type", c16l, "ClipsRemixDraftModel");
            } else if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("original_source_author_name", c16l, "ClipsRemixDraftModel");
            } else {
                return new C9JS(enumC209589Ot, abstractC172157lk, enumC189548aZ, c202278x7, bool, str, str2, str3, arrayList, l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C9JS c9js) {
        anonymousClass182.A0d();
        String str = c9js.A09;
        if (str != null) {
            anonymousClass182.A0S("original_source_media_id", str);
        }
        anonymousClass182.A0R("original_source_length_ms", c9js.A02);
        String str2 = c9js.A0A;
        if (str2 != null) {
            anonymousClass182.A0S("original_source_progressive_url", str2);
        }
        EnumC209589Ot enumC209589Ot = c9js.A03;
        if (enumC209589Ot != null) {
            anonymousClass182.A0S("original_source_media_type", enumC209589Ot.A00);
        }
        String str3 = c9js.A08;
        if (str3 != null) {
            anonymousClass182.A0S("original_source_author_name", str3);
        }
        Boolean bool = c9js.A00;
        if (bool != null) {
            anonymousClass182.A0T("are_remixes_crosspostable", bool.booleanValue());
        }
        if (c9js.A01 != null) {
            C16V.A03(anonymousClass182, "remix_image_regions");
            for (C5NJ c5nj : c9js.A01) {
                if (c5nj != null) {
                    C5NI.A00(anonymousClass182, c5nj);
                }
            }
            anonymousClass182.A0Z();
        }
        EnumC189548aZ enumC189548aZ = c9js.A06;
        if (enumC189548aZ != null) {
            anonymousClass182.A0S("source_media_creation_state", enumC189548aZ.A00);
        }
        AbstractC172157lk abstractC172157lk = c9js.A05;
        if (abstractC172157lk != null) {
            anonymousClass182.A0r("visualReplyDisplayMode");
            AbstractC40411u9.A00.A02(anonymousClass182, abstractC172157lk);
        }
        C202278x7 c202278x7 = c9js.A07;
        if (c202278x7 != null) {
            anonymousClass182.A0r("interactive_drawable_transform");
            AbstractC203328yp.A00(anonymousClass182, c202278x7);
        }
        anonymousClass182.A0a();
    }
}
