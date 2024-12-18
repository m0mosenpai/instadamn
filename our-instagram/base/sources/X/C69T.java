package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.69T */
/* loaded from: classes3.dex */
public final class C69T {
    public static final C69T A01 = new Object();
    public static final long A00 = AbstractC118155Vz.A01(10);
    public static final Pattern A02 = Pattern.compile("(\\v\\h*){2,}");

    public static final C5C8 A01(C5W3 c5w3, String str) {
        C14360o3.A0B(c5w3, 1);
        int i = 0;
        C6C7 c6c7 = new C6C7(16);
        c6c7.A09(AbstractC002300n.A0d(str, "@", "", false));
        Matcher A09 = AbstractC13670mt.A09(str);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1) - i;
                int end = (A09.end(1) - 1) - i;
                c6c7.A06(c5w3, start, end);
                c6c7.A0A("mention_span", group, start, end);
                i++;
            }
        }
        return c6c7.A02();
    }

    public static final void A02(Context context, C6C7 c6c7, C5W3 c5w3, String str) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        AbstractC119845bi A002 = C69X.A00(context);
        Matcher matcher = AbstractC13670mt.A02.matcher(str);
        C14360o3.A07(matcher);
        if (A002 != null) {
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group != null) {
                    int start = matcher.start(1);
                    int end = matcher.end(1);
                    c6c7.A06(c5w3, start, end);
                    c6c7.A0A("ig_mention_span", group, start, end);
                    long A012 = AbstractC118155Vz.A01(3);
                    C5W2 c5w2 = c5w3.A0C;
                    long ApK = c5w2.ApK();
                    long j = c5w3.A01;
                    C5W5 c5w5 = c5w3.A08;
                    C122165gC c122165gC = c5w3.A06;
                    C122175gD c122175gD = c5w3.A07;
                    String str2 = c5w3.A0E;
                    C122185gE c122185gE = c5w3.A0A;
                    C122195gF c122195gF = c5w3.A0D;
                    C114095Cv c114095Cv = c5w3.A09;
                    long j2 = c5w3.A00;
                    C122205gG c122205gG = c5w3.A0B;
                    C122215gH c122215gH = c5w3.A03;
                    AbstractC119825bg abstractC119825bg = c5w3.A04;
                    long ApK2 = c5w2.ApK();
                    long j3 = C1132359l.A01;
                    if (ApK != ApK2) {
                        c5w2 = C5W0.A00(ApK);
                    }
                    c6c7.A06(new C5W3(c122215gH, abstractC119825bg, A002, c122165gC, c122175gD, c5w5, c114095Cv, c122185gE, c122205gG, c5w2, c122195gF, str2, j, A012, j2), start, start + 1);
                }
            }
        }
    }

    public static /* synthetic */ C5C8 A00(Context context, C132275y6 c132275y6, String str, int i, long j, boolean z, boolean z2) {
        C5W3 c5w3;
        C0f5 AEp;
        StringBuilder sb;
        int i2;
        long j2 = j;
        boolean z3 = z2;
        C132275y6 c132275y62 = c132275y6;
        if ((i & 16) != 0) {
            c5w3 = new C5W3(null, null, null, null, null, 65534, j2, 0L, 0L);
        } else {
            c5w3 = null;
        }
        if ((i & 32) != 0) {
            c132275y62 = null;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c5w3, 4);
        C6C7 c6c7 = new C6C7(16);
        Matcher matcher = A02.matcher(str);
        long j3 = A00;
        C5W4 c5w4 = new C5W4(null, null, null, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, j3);
        C5W3 c5w32 = new C5W3(null, null, null, null, null, 65533, 0L, j3, 0L);
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        int i3 = 0;
        while (matcher.find()) {
            String substring = str.substring(i3, matcher.start());
            C14360o3.A07(substring);
            C9BW A002 = C69U.A00(substring, str.codePointCount(0, i3), j2, z, false);
            C5C8 c5c8 = (C5C8) A002.A00;
            c6c7.A05(c5c8);
            String A0R = AnonymousClass001.A0R(str2, c5c8.A00);
            C69V c69v = (C69V) A002.A01;
            C14360o3.A0B(c69v, 0);
            arrayList.addAll(c69v.A00);
            C6El c6El = new C6El(c5w4, "", c6c7.A00.length(), Integer.MIN_VALUE);
            List list = c6c7.A03;
            list.add(c6El);
            c6c7.A02.add(c6El);
            int size = list.size() - 1;
            try {
                int A003 = c6c7.A00(c5w32);
                try {
                    c6c7.A09(" ");
                    c6c7.A04(size);
                    str2 = AnonymousClass001.A0C(A0R, ' ');
                    String substring2 = str.substring(matcher.start(), matcher.end());
                    C14360o3.A07(substring2);
                    arrayList.add(new C6Em(str.codePointCount(0, matcher.start()), 1 - substring2.codePointCount(0, substring2.length())));
                    i3 = matcher.end();
                } finally {
                }
            } catch (Throwable th) {
                c6c7.A04(size);
                throw th;
            }
        }
        String substring3 = str.substring(i3, str.length());
        C14360o3.A07(substring3);
        C9BW A004 = C69U.A00(substring3, str.codePointCount(0, i3), j2, z, z3);
        C5C8 c5c82 = (C5C8) A004.A00;
        c6c7.A05(c5c82);
        String A0R2 = AnonymousClass001.A0R(str2, c5c82.A00);
        C69V c69v2 = (C69V) A004.A01;
        C14360o3.A0B(c69v2, 0);
        arrayList.addAll(c69v2.A00);
        Matcher A09 = AbstractC13670mt.A09(A0R2);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1);
                int end = A09.end(1);
                c6c7.A06(c5w3, start, end);
                c6c7.A0A("mention_span", group, start, end);
            }
        }
        A02(context, c6c7, c5w3, A0R2);
        if (c132275y62 != null) {
            String str3 = c132275y62.A02;
            if (str3 != null && str3.length() != 0) {
                j2 = C1132359l.A07;
            }
            int i4 = c132275y62.A00;
            Iterator it = arrayList.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                C6Em c6Em = (C6Em) it.next();
                if (c6Em.A01 <= i4) {
                    i2 = c6Em.A00;
                } else {
                    i2 = 0;
                }
                i5 += i2;
            }
            int i6 = i4 + i5;
            C14360o3.A0B(A0R2, 1);
            try {
                int length = A0R2.length();
                if (i6 < A0R2.codePointCount(0, length)) {
                    String str4 = c132275y62.A01;
                    int length2 = str4.length();
                    int offsetByCodePoints = A0R2.offsetByCodePoints(0, i6);
                    int i7 = length2 + offsetByCodePoints;
                    if (offsetByCodePoints < length && i7 <= length) {
                        c6c7.A06(new C5W3(null, null, null, null, null, 65534, j2, 0L, 0L), offsetByCodePoints, i7);
                        c6c7.A0A("tag_span", str4, offsetByCodePoints, i7);
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {
                AEp = C18950wb.A01.AEp("SpanUtil::addTagAnnotation", 817899461);
                sb = new StringBuilder();
                sb.append(e.getMessage());
                if (!(!z)) {
                    A0R2 = null;
                }
                sb.append(A0R2);
                sb.append(", codePointOffset: ");
                sb.append(i6);
                AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
                AEp.report();
                return c6c7.A02();
            } catch (IndexOutOfBoundsException e2) {
                AEp = C18950wb.A01.AEp("SpanUtil::addTagAnnotation", 817899461);
                sb = new StringBuilder();
                sb.append(e2.getMessage());
                if (!(!z)) {
                    A0R2 = null;
                }
                sb.append(A0R2);
                sb.append(", codePointOffset: ");
                sb.append(i6);
                AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
                AEp.report();
                return c6c7.A02();
            }
        }
        return c6c7.A02();
    }
}
