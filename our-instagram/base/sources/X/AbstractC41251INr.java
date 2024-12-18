package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.INr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41251INr {
    public static C38700H2l parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ClipsTextAlignment clipsTextAlignment = null;
            ArrayList arrayList = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            String str = null;
            ClipsTextEmphasisMode clipsTextEmphasisMode = null;
            ClipsTextFormatType clipsTextFormatType = null;
            Float f9 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    clipsTextAlignment = (ClipsTextAlignment) ClipsTextAlignment.A01.get(A1P3);
                    if (clipsTextAlignment == null) {
                        clipsTextAlignment = ClipsTextAlignment.A07;
                    }
                } else if ("colors".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C93064Fg parseFromJson = AbstractC93054Ff.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1R(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("font_size".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("is_animated".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_feels_like_ig".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("offset_x".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                } else if ("offset_y".equals(A0s)) {
                    f5 = AbstractC167007dF.A0a(c16l);
                } else if ("rotation_degree".equals(A0s)) {
                    f6 = AbstractC167007dF.A0a(c16l);
                } else if ("scale".equals(A0s)) {
                    f7 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1V(A0s)) {
                    f8 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text_emphasis_mode".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    clipsTextEmphasisMode = (ClipsTextEmphasisMode) ClipsTextEmphasisMode.A01.get(A1P2);
                    if (clipsTextEmphasisMode == null) {
                        clipsTextEmphasisMode = ClipsTextEmphasisMode.A0A;
                    }
                } else if ("text_format_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsTextFormatType = AbstractC93084Fj.A00(A1P);
                } else if (AbstractC37300Gc1.A1G(A0s)) {
                    f9 = AbstractC167007dF.A0Z(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "z_index");
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("colors", c16l, "ClipsSpinSwappableTextImpl");
                throw C00O.createAndThrow();
            }
            return new C38700H2l(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, bool, bool2, f, f2, f3, f4, f5, f6, f7, f8, f9, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38700H2l c38700H2l) {
        anonymousClass182.A0d();
        ClipsTextAlignment clipsTextAlignment = c38700H2l.A00;
        if (clipsTextAlignment != null) {
            anonymousClass182.A0S("alignment", clipsTextAlignment.A00);
        }
        List list = c38700H2l.A0G;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "colors", list);
            while (A0q.hasNext()) {
                C93064Fg c93064Fg = (C93064Fg) A0q.next();
                if (c93064Fg != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("count", c93064Fg.A00);
                    String str = c93064Fg.A01;
                    if (str != null) {
                        anonymousClass182.A0S("hex_rgba_color", str);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37302Gc3.A1G(anonymousClass182, c38700H2l.A05);
        Float f = c38700H2l.A06;
        if (f != null) {
            anonymousClass182.A0P("font_size", f.floatValue());
        }
        AbstractC37302Gc3.A1E(anonymousClass182, c38700H2l.A07);
        Boolean bool = c38700H2l.A03;
        if (bool != null) {
            anonymousClass182.A0T("is_animated", bool.booleanValue());
        }
        Boolean bool2 = c38700H2l.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("is_feels_like_ig", bool2.booleanValue());
        }
        Float f2 = c38700H2l.A08;
        if (f2 != null) {
            anonymousClass182.A0P("offset_x", f2.floatValue());
        }
        Float f3 = c38700H2l.A09;
        if (f3 != null) {
            anonymousClass182.A0P("offset_y", f3.floatValue());
        }
        Float f4 = c38700H2l.A0A;
        if (f4 != null) {
            anonymousClass182.A0P("rotation_degree", f4.floatValue());
        }
        Float f5 = c38700H2l.A0B;
        if (f5 != null) {
            anonymousClass182.A0P("scale", f5.floatValue());
        }
        AbstractC37302Gc3.A1H(anonymousClass182, c38700H2l.A0C);
        AbstractC37301Gc2.A1E(anonymousClass182, c38700H2l.A0F);
        ClipsTextEmphasisMode clipsTextEmphasisMode = c38700H2l.A01;
        if (clipsTextEmphasisMode != null) {
            anonymousClass182.A0S("text_emphasis_mode", clipsTextEmphasisMode.A00);
        }
        ClipsTextFormatType clipsTextFormatType = c38700H2l.A02;
        if (clipsTextFormatType != null) {
            anonymousClass182.A0S("text_format_type", clipsTextFormatType.A00);
        }
        AbstractC37302Gc3.A1D(anonymousClass182, c38700H2l.A0D);
        Integer num = c38700H2l.A0E;
        if (num != null) {
            anonymousClass182.A0Q("z_index", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
