package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class WE0 {
    public static final SpannableStringBuilder A00(Context context, C5QL c5ql, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c5ql.A00);
        int A0A = AbstractC167007dF.A0A(c5ql.A00);
        for (C5QO c5qo : c5ql.A01) {
            int i = c5qo.A02;
            int i2 = c5qo.A00;
            int i3 = c5qo.A01;
            if (i >= 0 && i2 >= 0) {
                Object A02 = A02(context, c5qo, z);
                if (A02 instanceof C202918y9) {
                    AbstractC202958yD.A00(spannableStringBuilder, ((C202918y9) A02).A03);
                }
                if (i > A0A) {
                    i = A0A;
                }
                if (i2 > A0A) {
                    i2 = A0A;
                }
                spannableStringBuilder.setSpan(A02, i, i2, i3);
            }
        }
        return spannableStringBuilder;
    }

    public static final C5QL A01(Spannable spannable, boolean z) {
        if (spannable != null && !AbstractC001900j.A0T(spannable)) {
            C5QL c5ql = new C5QL(spannable.toString());
            Iterator it = AbstractC22788A3g.A00.iterator();
            while (it.hasNext()) {
                A03(spannable, c5ql, (Class) it.next());
            }
            if (z) {
                A03(spannable, c5ql, StyleSpan.class);
                return c5ql;
            }
            return c5ql;
        }
        return new C5QL(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0240, code lost:
    
        if (r11 != null) goto L92;
     */
    /* JADX WARN: Type inference failed for: r5v17, types: [X.8yB, android.text.style.MetricAffectingSpan, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(android.content.Context r20, X.C5QO r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WE0.A02(android.content.Context, X.5QO, boolean):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.5QO, java.lang.Object] */
    public static final void A03(Spannable spannable, C5QL c5ql, Class cls) {
        for (Object obj : C4GL.A06(spannable, cls)) {
            if (obj instanceof C6S2) {
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                int spanFlags = spannable.getSpanFlags(obj);
                if (spanStart >= 0 && spanEnd >= 0) {
                    XCW Bz1 = ((C6S2) obj).Bz1();
                    C14360o3.A0B(Bz1, 4);
                    ?? obj2 = new Object();
                    obj2.A02 = spanStart;
                    obj2.A00 = spanEnd;
                    obj2.A01 = spanFlags;
                    Integer CBt = Bz1.CBt();
                    C14360o3.A0B(CBt, 0);
                    obj2.A03 = CBt;
                    String json = Bz1.toJson();
                    if (json == null) {
                        json = "";
                    }
                    obj2.A04 = json;
                    c5ql.A01.add(obj2);
                }
            }
        }
    }
}
