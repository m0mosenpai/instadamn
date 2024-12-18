package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SjQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63396SjQ {
    public static final THb A0M;
    public static final Pattern A0N;
    public static final Pattern A0O;
    public static final Pattern A0P;
    public static final Pattern A0Q;
    public static final Pattern A0R;
    public THb A02;
    public THb A0G;
    public String A0I;
    public final PhoneNumberUtil A0L;
    public String A04 = "";
    public StringBuilder A08 = AbstractC166987dD.A1C();
    public String A0H = "";
    public StringBuilder A06 = AbstractC166987dD.A1C();
    public StringBuilder A07 = AbstractC166987dD.A1C();
    public boolean A0C = true;
    public boolean A0J = false;
    public boolean A0D = false;
    public boolean A0E = false;
    public int A0F = 0;
    public int A00 = 0;
    public int A01 = 0;
    public StringBuilder A0A = AbstractC166987dD.A1C();
    public boolean A0K = false;
    public String A05 = "";
    public StringBuilder A09 = AbstractC166987dD.A1C();
    public List A0B = AbstractC166987dD.A1E();
    public C78F A03 = new C78F(64);

    static {
        THb tHb = new THb();
        tHb.A0I = "NA";
        A0M = tHb;
        A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
        A0P = Pattern.compile("\\d(?=[^,}][^,}])");
        A0O = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");
        A0R = Pattern.compile("[- ]");
        A0Q = Pattern.compile("\u2008");
    }

    private String A00() {
        THb tHb;
        List<C64512THa> list;
        StringBuilder sb = this.A09;
        int length = sb.length();
        String obj = sb.toString();
        if (length >= 3) {
            if (this.A0D && this.A02.A0P.size() > 0) {
                tHb = this.A02;
                list = tHb.A0P;
            } else {
                tHb = this.A02;
                list = tHb.A0Q;
            }
            boolean z = tHb.A0X;
            for (C64512THa c64512THa : list) {
                if (!z || this.A0D || c64512THa.A07 || PhoneNumberUtil.A08(c64512THa.A02)) {
                    if (AbstractC31175DnJ.A1Z(c64512THa.A01, A0O)) {
                        this.A0B.add(c64512THa);
                    }
                }
            }
            A06(obj);
            String A0A = A0A();
            if (A0A.length() <= 0) {
                if (A09()) {
                    return A01();
                }
                return this.A06.toString();
            }
            return A0A;
        }
        return A05(obj);
    }

    private String A01() {
        StringBuilder sb;
        String A03;
        StringBuilder sb2 = this.A09;
        int length = sb2.length();
        if (length > 0) {
            int i = 0;
            do {
                A03 = A03(sb2.charAt(i));
                i++;
            } while (i < length);
            if (this.A0C) {
                return A05(A03);
            }
            sb = this.A06;
        } else {
            sb = this.A0A;
        }
        return sb.toString();
    }

    private String A02() {
        boolean z = false;
        if (this.A02.A00 == 1) {
            StringBuilder sb = this.A09;
            if (sb.charAt(0) == '1' && sb.charAt(1) != '0' && sb.charAt(1) != '1') {
                z = true;
            }
        }
        int i = 1;
        if (z) {
            StringBuilder sb2 = this.A0A;
            sb2.append('1');
            sb2.append(' ');
            this.A0D = true;
        } else {
            THb tHb = this.A02;
            if (tHb.A0Y) {
                Pattern A00 = this.A03.A00(tHb.A0K);
                StringBuilder sb3 = this.A09;
                Matcher matcher = A00.matcher(sb3);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.A0D = true;
                    i = matcher.end();
                    this.A0A.append(sb3.substring(0, i));
                }
            }
            i = 0;
        }
        StringBuilder sb4 = this.A09;
        String substring = sb4.substring(0, i);
        sb4.delete(0, i);
        return substring;
    }

    private String A03(char c) {
        Pattern pattern = A0Q;
        StringBuilder sb = this.A08;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A0F)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A0F = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0B.size() == 1) {
            this.A0C = false;
        }
        this.A0H = "";
        return this.A06.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (X.AbstractC31175DnJ.A1Z(java.lang.Character.toString(r7), r3) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r6.A07() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A04(X.C63396SjQ r6, char r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63396SjQ.A04(X.SjQ, char, boolean):java.lang.String");
    }

    private String A05(String str) {
        StringBuilder A0y;
        StringBuilder sb = this.A0A;
        int length = sb.length();
        if (this.A0K && length > 0 && sb.charAt(length - 1) != ' ') {
            A0y = AbstractC166987dD.A1C();
            A0y.append(new String(sb));
            A0y.append(' ');
        } else {
            A0y = AbstractC31174DnI.A0y(sb);
        }
        return AbstractC166997dE.A0x(str, A0y);
    }

    private boolean A07() {
        StringBuilder A1C;
        PhoneNumberUtil phoneNumberUtil;
        int A0B;
        THb A0E;
        StringBuilder sb = this.A09;
        if (sb.length() == 0 || (A0B = (phoneNumberUtil = this.A0L).A0B(sb, (A1C = AbstractC166987dD.A1C()))) == 0) {
            return false;
        }
        sb.setLength(0);
        sb.append((CharSequence) A1C);
        C78E c78e = phoneNumberUtil.A00;
        String A01 = c78e.A01(A0B);
        if ("001".equals(A01)) {
            A0E = phoneNumberUtil.A0D(A0B);
        } else {
            if (!A01.equals(this.A0I)) {
                A0E = phoneNumberUtil.A0E(c78e.A01(phoneNumberUtil.A0A(A01)));
                if (A0E == null) {
                    A0E = A0M;
                }
            }
            String num = Integer.toString(A0B);
            StringBuilder sb2 = this.A0A;
            sb2.append(num);
            sb2.append(' ');
            this.A05 = "";
            return true;
        }
        this.A02 = A0E;
        String num2 = Integer.toString(A0B);
        StringBuilder sb22 = this.A0A;
        sb22.append(num2);
        sb22.append(' ');
        this.A05 = "";
        return true;
    }

    private boolean A08() {
        Pattern A00 = this.A03.A00(AnonymousClass001.A0R("\\+|", this.A02.A0I));
        StringBuilder sb = this.A07;
        Matcher matcher = A00.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.A0D = true;
        int end = matcher.end();
        StringBuilder sb2 = this.A09;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.A0A;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    private boolean A09() {
        String replaceAll;
        Iterator it = this.A0B.iterator();
        while (true) {
            if (it.hasNext()) {
                C64512THa c64512THa = (C64512THa) it.next();
                String str = c64512THa.A03;
                if (this.A0H.equals(str)) {
                    break;
                }
                if (str.indexOf(124) == -1) {
                    String replaceAll2 = A0P.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                    StringBuilder sb = this.A08;
                    sb.setLength(0);
                    String str2 = c64512THa.A01;
                    Matcher matcher = this.A03.A00(replaceAll2).matcher("999999999999999");
                    matcher.find();
                    String group = matcher.group();
                    if (group.length() < this.A09.length()) {
                        replaceAll = "";
                    } else {
                        replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", "\u2008");
                    }
                    if (replaceAll.length() > 0) {
                        sb.append(replaceAll);
                        this.A0H = str;
                        this.A0K = A0R.matcher(c64512THa.A02).find();
                        this.A0F = 0;
                        return true;
                    }
                }
                it.remove();
            } else {
                this.A0C = false;
                break;
            }
        }
        return false;
    }

    public final String A0A() {
        for (C64512THa c64512THa : this.A0B) {
            Matcher matcher = this.A03.A00(c64512THa.A03).matcher(this.A09);
            if (matcher.matches()) {
                this.A0K = A0R.matcher(c64512THa.A02).find();
                return A05(matcher.replaceAll(c64512THa.A01));
            }
        }
        return "";
    }

    public final void A0B() {
        this.A04 = "";
        this.A06.setLength(0);
        this.A07.setLength(0);
        this.A08.setLength(0);
        this.A0F = 0;
        this.A0H = "";
        this.A0A.setLength(0);
        this.A05 = "";
        this.A09.setLength(0);
        this.A0C = true;
        this.A0J = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0D = false;
        this.A0E = false;
        this.A0B.clear();
        this.A0K = false;
        if (!this.A02.equals(this.A0G)) {
            String str = this.A0I;
            PhoneNumberUtil phoneNumberUtil = this.A0L;
            THb A0E = phoneNumberUtil.A0E(phoneNumberUtil.A00.A01(phoneNumberUtil.A0A(str)));
            if (A0E == null) {
                A0E = A0M;
            }
            this.A02 = A0E;
        }
    }

    public C63396SjQ(PhoneNumberUtil phoneNumberUtil, String str) {
        this.A0L = phoneNumberUtil;
        this.A0I = str;
        THb A0E = phoneNumberUtil.A0E(phoneNumberUtil.A00.A01(phoneNumberUtil.A0A(str)));
        A0E = A0E == null ? A0M : A0E;
        this.A02 = A0E;
        this.A0G = A0E;
    }

    private void A06(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            List list = ((C64512THa) it.next()).A04;
            if (list.size() != 0) {
                if (!this.A03.A00(AbstractC25226BEj.A1I(list, Math.min(length, AbstractC25226BEj.A05(list)))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }
}
