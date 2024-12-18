package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.WFl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70183WFl {
    public static final Map A00;
    public static final Map A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap hashMap = new HashMap();
        boolean A0C = AbstractC65704Tsa.A0C(hashMap);
        A01 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        AbstractC65704Tsa.A0B(hashMap2, A0C ? 1 : 0);
        A00 = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0044. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x00eb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString A00(java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70183WFl.A00(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static C69040Vgh A01(WFa wFa, String str, List list, Matcher matcher) {
        C69653Vsu c69653Vsu = new C69653Vsu();
        try {
            String group = matcher.group(1);
            group.getClass();
            c69653Vsu.A09 = AbstractC70144W6x.A01(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c69653Vsu.A08 = AbstractC70144W6x.A01(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            A04(c69653Vsu, group3);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String A0H = wFa.A0H(AbstractC50482Ts.A05);
                if (!TextUtils.isEmpty(A0H)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(A0H.trim());
                } else {
                    c69653Vsu.A0A = A00(str, sb.toString(), list);
                    return new C69040Vgh(c69653Vsu.A00().A00(), c69653Vsu.A09, c69653Vsu.A08);
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC63374Sil.A04("WebvttCueParser", AnonymousClass001.A0R("Skipping cue with bad header: ", matcher.group()));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList A02(C69187VjG c69187VjG, String str, List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C69472Vnv c69472Vnv = (C69472Vnv) list.get(i2);
            String str2 = c69187VjG.A01;
            java.util.Set set = c69187VjG.A03;
            String str3 = c69187VjG.A02;
            if (c69472Vnv.A09.isEmpty() && c69472Vnv.A0A.isEmpty() && c69472Vnv.A0C.isEmpty() && c69472Vnv.A0B.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                String str4 = c69472Vnv.A09;
                int i3 = 0;
                if (!str4.isEmpty()) {
                    i3 = -1;
                    if (str4.equals(str)) {
                        i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                    }
                }
                String str5 = c69472Vnv.A0A;
                if (!str5.isEmpty()) {
                    int i4 = -1;
                    if (i3 != -1) {
                        if (str5.equals(str2)) {
                            i4 = i3 + 2;
                        }
                        i3 = i4;
                    }
                }
                String str6 = c69472Vnv.A0B;
                if (!str6.isEmpty()) {
                    if (i3 != -1 && str6.equals(str3)) {
                        i3 += 4;
                    }
                }
                if (i3 != -1 && set.containsAll(c69472Vnv.A0C)) {
                    i = i3 + (c69472Vnv.A0C.size() * 4);
                }
            }
            if (i > 0) {
                arrayList.add(new C71191Wpd(c69472Vnv, i));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.text.SpannableStringBuilder r17, X.C69187VjG r18, java.lang.String r19, java.util.List r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70183WFl.A03(android.text.SpannableStringBuilder, X.VjG, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00fe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x003a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C69653Vsu r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70183WFl.A04(X.Vsu, java.lang.String):void");
    }
}
