package X;

import android.text.Spannable;
import com.instagram.api.schemas.ClipsTextEmphasisMode;

/* loaded from: classes4.dex */
public abstract class A00 {
    public static final ClipsTextEmphasisMode A00(Spannable spannable, C190888ck c190888ck) {
        AbstractC190968cs abstractC190968cs;
        Object obj;
        Object obj2;
        C6S5 c6s5;
        if (c190888ck != null && (abstractC190968cs = c190888ck.A04) != null) {
            Class A01 = abstractC190968cs.A01();
            int A0A = AbstractC167007dF.A0A(spannable.toString());
            Object[] spans = spannable.getSpans(0, A0A, A01);
            Object[] spans2 = spannable.getSpans(0, A0A, C202888y6.class);
            C14360o3.A0B(spans, 0);
            if (spans.length == 0) {
                obj = null;
            } else {
                obj = spans[0];
            }
            C6S0 c6s0 = (C6S0) obj;
            if (c6s0 == null || (c6s5 = c6s0.C6E()) == null) {
                C14360o3.A0B(spans2, 0);
                if (spans2.length == 0) {
                    obj2 = null;
                } else {
                    obj2 = spans2[0];
                }
                C6S0 c6s02 = (C6S0) obj2;
                if (c6s02 != null) {
                    c6s5 = c6s02.C6E();
                } else {
                    c6s5 = C6S5.A05;
                }
            }
            int ordinal = c6s5.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return ClipsTextEmphasisMode.A09;
                        }
                    } else {
                        return ClipsTextEmphasisMode.A05;
                    }
                } else {
                    return ClipsTextEmphasisMode.A08;
                }
            } else {
                return ClipsTextEmphasisMode.A04;
            }
        }
        return ClipsTextEmphasisMode.A06;
    }
}
