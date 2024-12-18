package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.3r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85153r6 {
    public static SpannableStringBuilder A00(Context context, C57352kA c57352kA, C85163r7 c85163r7, SearchContext searchContext, boolean z) {
        SpannableStringBuilder A0E;
        int color;
        if (!c85163r7.A0H) {
            if (c85163r7.A03 == AnonymousClass341.A07) {
                String A06 = C57352kA.A06(context, c85163r7);
                Integer num = c85163r7.A08;
                if (num != null) {
                    A06 = String.format("%s%d", A06, num);
                }
                if (z) {
                    A06 = String.format("%s%b", A06, Boolean.valueOf(z));
                }
                LruCache lruCache = c57352kA.A02;
                A0E = (SpannableStringBuilder) lruCache.get(A06);
                if (A0E == null) {
                    A0E = C57352kA.A03(context, c57352kA, c85163r7, searchContext, z);
                    lruCache.put(A06, A0E);
                }
            } else {
                A0E = C57352kA.A03(context, c57352kA, c85163r7, searchContext, z);
            }
        } else if (c85163r7.A0C) {
            String A062 = C57352kA.A06(context, c85163r7);
            LruCache lruCache2 = c57352kA.A02;
            A0E = (SpannableStringBuilder) lruCache2.get(A062);
            if (A0E == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c57352kA.A0D(context, c85163r7));
                if (c85163r7.A03 == AnonymousClass341.A0Y) {
                    spannableStringBuilder.setSpan(new C27223Bzi(c57352kA, c85163r7), 0, spannableStringBuilder.length(), 33);
                }
                if (C57352kA.A0A(c57352kA, c85163r7) && !C57352kA.A0B(c57352kA, c85163r7)) {
                    String string = context.getResources().getString(2131954793);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) string);
                    boolean z2 = c85163r7.A0F;
                    Integer num2 = c85163r7.A06;
                    if (num2 != null) {
                        color = num2.intValue();
                    } else {
                        color = context.getColor(AbstractC53242c7.A09(context));
                    }
                    spannableStringBuilder.setSpan(new C27224Bzj(c57352kA, c85163r7, color, z2), length, spannableStringBuilder.length(), 33);
                }
                A0E = new SpannableStringBuilder(spannableStringBuilder);
                C57352kA.A07(A0E, lruCache2, A062);
            }
        } else if (z) {
            A0E = new SpannableStringBuilder(c57352kA.A0D(context, c85163r7));
            if (c85163r7.A0I) {
                A0E.append((CharSequence) c57352kA.A0C(context, c85163r7, searchContext));
            }
        } else {
            A0E = c57352kA.A0E(context, c85163r7, searchContext);
        }
        if (!C2UX.A01 && (A0E instanceof Spannable)) {
            C2UX.A00().A8P(A0E, -1, false);
        }
        return A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r0 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.StaticLayout A01(android.content.Context r30, com.instagram.common.session.UserSession r31, X.C57482kN r32, X.C84923qg r33, X.AnonymousClass341 r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, int r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC85153r6.A01(android.content.Context, com.instagram.common.session.UserSession, X.2kN, X.3qg, X.341, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, boolean, boolean):android.text.StaticLayout");
    }
}
