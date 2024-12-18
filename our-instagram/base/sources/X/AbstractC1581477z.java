package X;

import android.content.Context;
import android.os.Build;
import android.util.AndroidRuntimeException;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Matcher;

/* renamed from: X.77z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1581477z {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r13.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder A00(android.content.Context r7, X.AnonymousClass541 r8, com.instagram.common.session.UserSession r9, X.C98K r10, X.C7IJ r11, X.C115955Ml r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1581477z.A00(android.content.Context, X.541, com.instagram.common.session.UserSession, X.98K, X.7IJ, X.5Ml, java.lang.String, boolean, boolean):android.text.SpannableStringBuilder");
    }

    public static final C115955Ml A01(Context context, UserSession userSession, C98K c98k, String str, List list, boolean z) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (C18U.A06(C06090Tz.A05, userSession, 36318033004533586L)) {
            randomAccess = C16930sl.A00;
        } else {
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    randomAccess = AbstractC85433rY.A02(str);
                } else {
                    randomAccess = AbstractC85433rY.A01(context, str);
                }
            } catch (Exception unused) {
                randomAccess = C16930sl.A00;
            }
        }
        arrayList.addAll(randomAccess);
        return A02(userSession, c98k, str, list, arrayList, null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final C115955Ml A02(UserSession userSession, C98K c98k, String str, List list, List list2, List list3, boolean z) {
        int i;
        ?? r8;
        ArrayList A00;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c98k, 8);
        C115955Ml c115955Ml = new C115955Ml(511, null, null, null);
        try {
            try {
                AbstractC09800fd.A01("DirectMessageLinkifyHelper.buildLinksInfo", 1999849799);
                Matcher matcher = AbstractC13670mt.A00.matcher(str);
                C14360o3.A07(matcher);
                ArrayList arrayList = new ArrayList();
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    String group = matcher.group();
                    C14360o3.A07(group);
                    arrayList.add(new C89393yf(start, end, group));
                }
                c115955Ml.A03 = arrayList;
                c115955Ml.A05 = AbstractC85433rY.A03(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                c115955Ml.A00 = list2;
                if (list3 == null) {
                    list3 = new ArrayList();
                }
                c115955Ml.A04 = list3;
                if (list != null) {
                    r8 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C206179Ba c206179Ba = (C206179Ba) it.next();
                        int i2 = c206179Ba.A02;
                        int i3 = i2 + c206179Ba.A01;
                        if (i3 <= str.length()) {
                            String substring = str.substring(i2, i3);
                            C14360o3.A07(substring);
                            r8.add(new C89393yf(i2, i3, substring));
                        }
                    }
                } else {
                    r8 = C16930sl.A00;
                }
                c115955Ml.A02 = r8;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36318033005516639L)) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    A00 = AbstractC85433rY.A00(context, (CountryCodeData) c98k.A00.getValue(), str);
                } else {
                    Context context2 = AbstractC12290kX.A00;
                    C14360o3.A07(context2);
                    A00 = AbstractC85433rY.A00(context2, AnonymousClass780.A00(context2), str);
                }
                c115955Ml.A07 = A00;
                if (!C18U.A06(c06090Tz, userSession, 36320128945889366L) || !AbstractC13670mt.A06.matcher(str).find()) {
                    c115955Ml.A06 = AbstractC85433rY.A05(str, false);
                }
                if (z) {
                    c115955Ml.A08 = AbstractC85433rY.A07(str);
                }
                i = 1626426341;
            } catch (AndroidRuntimeException e) {
                C0w9.A06("error_linkifying", "Unable to linkify", e);
                i = -974035996;
            } catch (UnsatisfiedLinkError e2) {
                C0w9.A06("error_linkifying", "Unable to linkify", e2);
                i = -1617397032;
            }
            AbstractC09800fd.A00(i);
            return c115955Ml;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1159848540);
            throw th;
        }
    }

    public static final List A03(List list, String str) {
        if (str == null) {
            return C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC85433rY.A03(str).iterator();
        while (it.hasNext()) {
            C89393yf c89393yf = (C89393yf) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C89393yf c89393yf2 = (C89393yf) it2.next();
                    if (c89393yf.A01 < c89393yf2.A01 || c89393yf.A00 > c89393yf2.A00) {
                    }
                } else {
                    arrayList.add(c89393yf);
                    break;
                }
            }
        }
        return arrayList;
    }
}
