package X;

import android.content.Context;
import android.util.Patterns;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextLinks;
import android.webkit.WebView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.phonenumber.model.CountryCodeData;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85433rY {
    public static final ArrayList A00(Context context, CountryCodeData countryCodeData, final String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(countryCodeData, 1);
        final PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        final String str2 = countryCodeData.A00;
        final C78S c78s = C78S.A00;
        ArrayList arrayList = new ArrayList();
        Iterator it = new Iterator(c78s, A01, str, str2) { // from class: X.78V
            public static final Pattern A08;
            public static final Pattern A09;
            public static final Pattern A0A;
            public static final Pattern A0B = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
            public static final Pattern A0C = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
            public static final Pattern A0D = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
            public static final Pattern A0E = Pattern.compile(":[0-5]\\d");
            public static final Pattern[] A0F = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
            public long A01;
            public final C78S A04;
            public final PhoneNumberUtil A05;
            public final CharSequence A06;
            public final String A07;
            public Integer A03 = C05F.A00;
            public C78W A02 = null;
            public int A00 = 0;

            /* JADX WARN: Code restructure failed: missing block: B:41:0x017c, code lost:
            
                if (r0 != false) goto L86;
             */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0195 A[EDGE_INSN: B:71:0x0195->B:101:0x0195 BREAK  A[LOOP:0: B:48:0x00c4->B:54:0x0139], SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C78W A00(X.C78V r16, java.lang.String r17, int r18) {
                /*
                    Method dump skipped, instructions count: 406
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C78V.A00(X.78V, java.lang.String, int):X.78W");
            }

            static {
                String A0n = AnonymousClass001.A0n("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 3);
                StringBuilder sb = new StringBuilder();
                sb.append("(?:[");
                sb.append("(\\[（［");
                sb.append("])?(?:");
                sb.append("[^(\\[（［)\\]）］]");
                sb.append("+[");
                sb.append(")\\]）］");
                sb.append("])?");
                sb.append("[^(\\[（［)\\]）］]");
                sb.append("+(?:[");
                sb.append("(\\[（［");
                sb.append("]");
                sb.append("[^(\\[（［)\\]）］]");
                sb.append("+[");
                sb.append(")\\]）］");
                sb.append("])");
                sb.append(A0n);
                sb.append("[^(\\[（［)\\]）］]");
                sb.append("*");
                A09 = Pattern.compile(sb.toString());
                String A0n2 = AnonymousClass001.A0n("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 2);
                String A0n3 = AnonymousClass001.A0n("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 4);
                String A0n4 = AnonymousClass001.A0n("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 0, 20);
                String A0R = AnonymousClass001.A0R("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]", A0n3);
                String A0R2 = AnonymousClass001.A0R("\\p{Nd}", AnonymousClass001.A0n("{", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "}", 1, 20));
                String A0g = AnonymousClass001.A0g("[", "(\\[（［+＋", "]");
                A08 = Pattern.compile(A0g);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("(?:");
                sb2.append(A0g);
                sb2.append(A0R);
                sb2.append(")");
                sb2.append(A0n2);
                sb2.append(A0R2);
                sb2.append("(?:");
                sb2.append(A0R);
                sb2.append(A0R2);
                sb2.append(")");
                sb2.append(A0n4);
                sb2.append("(?:");
                sb2.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
                sb2.append(")?");
                A0A = Pattern.compile(sb2.toString(), 66);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                C78W c78w;
                Integer num = this.A03;
                if (num == C05F.A00) {
                    int i = this.A00;
                    Pattern pattern = A0A;
                    CharSequence charSequence = this.A06;
                    Matcher matcher = pattern.matcher(charSequence);
                    loop0: while (this.A01 > 0 && matcher.find(i)) {
                        int start = matcher.start();
                        CharSequence subSequence = charSequence.subSequence(start, matcher.end());
                        Pattern pattern2 = PhoneNumberUtil.A0C;
                        if (pattern2 == null) {
                            pattern2 = Pattern.compile("[\\\\/] *x", 0);
                        }
                        PhoneNumberUtil.A0C = pattern2;
                        Matcher matcher2 = pattern2.matcher(subSequence);
                        if (matcher2.find()) {
                            subSequence = subSequence.subSequence(0, matcher2.start());
                        }
                        if (!A0C.matcher(subSequence).find()) {
                            if (A0D.matcher(subSequence).find()) {
                                if (A0E.matcher(charSequence.toString().substring(subSequence.length() + start)).lookingAt()) {
                                    continue;
                                }
                            }
                            String charSequence2 = subSequence.toString();
                            c78w = A00(this, charSequence2, start);
                            if (c78w != null) {
                                break;
                            }
                            Pattern[] patternArr = A0F;
                            int i2 = 0;
                            do {
                                Matcher matcher3 = patternArr[i2].matcher(charSequence2);
                                boolean z = true;
                                while (matcher3.find() && this.A01 > 0) {
                                    if (z) {
                                        Pattern pattern3 = PhoneNumberUtil.A0D;
                                        Pattern pattern4 = pattern3;
                                        if (pattern3 == null) {
                                            pattern4 = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
                                        }
                                        PhoneNumberUtil.A0D = pattern4;
                                        String substring = charSequence2.substring(0, matcher3.start());
                                        Matcher matcher4 = pattern4.matcher(substring);
                                        CharSequence charSequence3 = substring;
                                        if (matcher4.find()) {
                                            charSequence3 = substring.subSequence(0, matcher4.start());
                                        }
                                        c78w = A00(this, charSequence3.toString(), start);
                                        if (c78w != null) {
                                            break loop0;
                                        }
                                        this.A01--;
                                        z = false;
                                    }
                                    Pattern pattern5 = PhoneNumberUtil.A0D;
                                    Pattern pattern6 = pattern5;
                                    if (pattern5 == null) {
                                        pattern6 = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
                                    }
                                    PhoneNumberUtil.A0D = pattern6;
                                    String group = matcher3.group(1);
                                    Matcher matcher5 = pattern6.matcher(group);
                                    CharSequence charSequence4 = group;
                                    if (matcher5.find()) {
                                        charSequence4 = group.subSequence(0, matcher5.start());
                                    }
                                    c78w = A00(this, charSequence4.toString(), matcher3.start(1) + start);
                                    if (c78w != null) {
                                        break loop0;
                                    }
                                    this.A01--;
                                }
                                i2++;
                            } while (i2 < 6);
                        }
                        i = start + subSequence.length();
                        this.A01--;
                    }
                    c78w = null;
                    this.A02 = c78w;
                    if (c78w == null) {
                        num = C05F.A0C;
                    } else {
                        this.A00 = c78w.A00 + c78w.A01.length();
                        num = C05F.A01;
                    }
                    this.A03 = num;
                }
                if (num != C05F.A01) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            public static boolean A01(char c) {
                if (Character.isLetter(c) || Character.getType(c) == 6) {
                    Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
                    if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                if (hasNext()) {
                    C78W c78w = this.A02;
                    this.A02 = null;
                    this.A03 = C05F.A00;
                    return c78w;
                }
                throw new NoSuchElementException();
            }

            {
                if (A01 != null) {
                    this.A05 = A01;
                    this.A06 = str == null ? "" : str;
                    this.A07 = str2;
                    this.A04 = c78s;
                    this.A01 = Long.MAX_VALUE;
                    return;
                }
                throw null;
            }
        };
        while (it.hasNext()) {
            C78W c78w = (C78W) it.next();
            int i = c78w.A00;
            String str3 = c78w.A01;
            arrayList.add(new C89393yf(i, i + str3.length(), str3));
        }
        return arrayList;
    }

    public static final ArrayList A02(String str) {
        C14360o3.A0B(str, 0);
        ArrayList arrayList = new ArrayList();
        String findAddress = WebView.findAddress(str);
        int i = 0;
        while (findAddress != null) {
            int A08 = AbstractC001900j.A08(str, findAddress, 0, false);
            int i2 = i + A08;
            if (i2 < 0) {
                break;
            }
            int length = findAddress.length();
            int i3 = length + i2;
            arrayList.add(new C89393yf(i2, i3, findAddress));
            str = str.substring(A08 + length);
            C14360o3.A07(str);
            findAddress = WebView.findAddress(str);
            i = i3;
        }
        return arrayList;
    }

    public static final ArrayList A03(String str) {
        C14360o3.A0B(str, 0);
        Matcher matcher = AbstractC85443rZ.A01().matcher(str);
        C14360o3.A07(matcher);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                arrayList.add(new C89393yf(matcher.start(1), matcher.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A01(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() < 10000) {
            TextLinks.Request.Builder builder = new TextLinks.Request.Builder(str);
            TextClassifier.EntityConfig.Builder builder2 = new TextClassifier.EntityConfig.Builder();
            List singletonList = Collections.singletonList("address");
            C14360o3.A07(singletonList);
            TextClassifier.EntityConfig.Builder includedTypes = builder2.setIncludedTypes(singletonList);
            List singletonList2 = Collections.singletonList("datetime");
            C14360o3.A07(singletonList2);
            TextLinks.Request build = builder.setEntityConfig(includedTypes.setExcludedTypes(singletonList2).build()).build();
            C14360o3.A07(build);
            TextLinks generateLinks = ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier().generateLinks(build);
            C14360o3.A07(generateLinks);
            for (TextLinks.TextLink textLink : generateLinks.getLinks()) {
                int start = textLink.getStart();
                int end = textLink.getEnd();
                String substring = str.substring(textLink.getStart(), textLink.getEnd());
                C14360o3.A07(substring);
                arrayList.add(new C89393yf(start, end, substring));
            }
        }
        return arrayList;
    }

    public static final ArrayList A04(String str) {
        Matcher matcher = AbstractC13670mt.A05.matcher(str);
        C14360o3.A07(matcher);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                arrayList.add(new C89393yf(matcher.start(1), matcher.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A05(String str, boolean z) {
        Matcher A09;
        if (z) {
            A09 = AbstractC13670mt.A03.matcher(str);
            C14360o3.A07(A09);
        } else {
            A09 = AbstractC13670mt.A09(str);
        }
        ArrayList arrayList = new ArrayList();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                arrayList.add(new C89393yf(A09.start(1), A09.end(1), group));
            }
        }
        return arrayList;
    }

    public static final ArrayList A06(Matcher matcher) {
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group != null) {
                C89393yf c89393yf = new C89393yf(matcher.start(0), matcher.end(0), group);
                if (!AbstractC13670mt.A0A(c89393yf.A02)) {
                    arrayList.add(c89393yf);
                }
            }
        }
        return arrayList;
    }

    public static final List A07(String str) {
        if (str != null && str.length() != 0) {
            Pattern pattern = AbstractC13670mt.A03;
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            C14360o3.A07(matcher);
            return A06(matcher);
        }
        return C16930sl.A00;
    }
}
