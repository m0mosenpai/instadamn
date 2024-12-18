package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6W8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6W8 {
    public static final C6W8 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r6 == 16917) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69189VjI A00(X.C6FG r7, X.C102884kP r8, X.C102884kP r9, X.C102884kP r10, int r11, int r12, boolean r13) {
        /*
            r5 = r10
            int r6 = r10.A05
            r0 = 16891(0x41fb, float:2.367E-41)
            if (r6 == r0) goto Lc
            r0 = 16917(0x4215, float:2.3706E-41)
            r10 = 0
            if (r6 != r0) goto Ld
        Lc:
            r10 = 1
        Ld:
            X.Vso r1 = new X.Vso
            r2 = r7
            r4 = r8
            r3 = r9
            r7 = r11
            r8 = r12
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.VjI r0 = new X.VjI
            r0.<init>(r1, r11, r12, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W8.A00(X.6FG, X.4kP, X.4kP, X.4kP, int, int, boolean):X.VjI");
    }

    public static final C6W9 A02(C6FG c6fg, C102884kP c102884kP, List list, boolean z) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c6fg, 1);
        C6W8 c6w8 = A00;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb = new StringBuilder();
            ArrayList A03 = c6w8.A03(spannableStringBuilder, c6fg, c102884kP, sb, list);
            ArrayList arrayList = new ArrayList();
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                C69189VjI c69189VjI = (C69189VjI) it.next();
                if (c69189VjI.A03) {
                    arrayList.add(c69189VjI);
                } else {
                    c69189VjI.A02.A00(null, spannableStringBuilder, c69189VjI, -1, -1);
                }
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            return new C6W9(spannableStringBuilder, obj, arrayList);
        }
        return A01(c6fg, c102884kP, list);
    }

    public static final void A04(Spannable spannable, C6FG c6fg, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, C6BE.A02(str), c6fg.A00.getResources().getDisplayMetrics())), i, i2, 0);
            } catch (C41M e) {
                AbstractC25241Le.A00(c6fg, "TextNodeUtils:TextSpan:size-parsing", "Error parsing TextSpan size", e);
            }
        }
    }

    public static final void A05(Spannable spannable, C6FG c6fg, String str, String str2, int i, int i2) {
        Typeface typeface;
        if (str != null) {
            Context context = c6fg.A00;
            C1LZ.A00();
            typeface = C6BI.A00(context, str);
        } else {
            typeface = null;
        }
        if (str2 != null) {
            try {
                typeface = C6BJ.A00(typeface, str2);
            } catch (C41M e) {
                AbstractC25241Le.A00(c6fg, "TextNodeUtils:TextSpan:text-style-parsing", "Error parsing TextSpan textStyle", e);
            }
        }
        if (typeface != null) {
            spannable.setSpan(new TypefaceSpan(typeface), i, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r8 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r12 = new android.graphics.Rect(r0, r7, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r9 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(android.text.Spannable r17, X.C6FG r18, X.C102884kP r19, X.C102884kP r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W8.A06(android.text.Spannable, X.6FG, X.4kP, X.4kP, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r0.A0E() != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C6W9 A01(X.C6FG r23, X.C102884kP r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W8.A01(X.6FG, X.4kP, java.util.List):X.6W9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    private final ArrayList A03(SpannableStringBuilder spannableStringBuilder, C6FG c6fg, C102884kP c102884kP, StringBuilder sb, List list) {
        boolean z;
        C102884kP A08;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C102884kP c102884kP2 = (C102884kP) it.next();
            int i = c102884kP2.A05;
            if (i == 16887) {
                arrayList = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                ?? A0E = c102884kP2.A0E();
                List A0O = c102884kP2.A0O(36);
                C14360o3.A07(A0O);
                int length = spannableStringBuilder.length();
                ArrayList A03 = A03(spannableStringBuilder, c6fg, c102884kP, sb2, A0O);
                int length2 = spannableStringBuilder.length();
                List A0O2 = c102884kP2.A0O(38);
                C14360o3.A07(A0O2);
                Iterator it2 = A0O2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(A00(c6fg, c102884kP, c102884kP2, (C102884kP) it2.next(), length, length2, false));
                }
                arrayList.addAll(A03);
                if (A0E != 0) {
                    sb2 = A0E;
                }
                sb.append((CharSequence) sb2);
            } else {
                if (i == 16898) {
                    z = true;
                    A08 = null;
                } else {
                    z = false;
                    A08 = c102884kP2.A08(40);
                }
                CharSequence charSequence = "";
                if (z) {
                    charSequence = " ";
                } else {
                    String A0I = c102884kP2.A0I();
                    if (A0I != null) {
                        charSequence = A0I;
                    }
                    if (A08 != null) {
                        charSequence = VSC.A00(A08);
                    }
                    C14360o3.A0A(charSequence);
                }
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append(charSequence);
                int length4 = spannableStringBuilder.length();
                int i2 = 35;
                if (z) {
                    i2 = 44;
                }
                String A0L = c102884kP2.A0L(i2);
                if (A0L != null && A0L.length() != 0) {
                    charSequence = A0L;
                }
                int i3 = 36;
                if (z) {
                    i3 = 43;
                }
                List A0O3 = c102884kP2.A0O(i3);
                C14360o3.A07(A0O3);
                sb.append(charSequence);
                arrayList = new ArrayList();
                if (z) {
                    arrayList.add(A00(c6fg, c102884kP, c102884kP2, c102884kP2, length3, length4, true));
                }
                Iterator it3 = A0O3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(A00(c6fg, c102884kP, c102884kP2, (C102884kP) it3.next(), length3, length4, false));
                }
            }
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }
}
