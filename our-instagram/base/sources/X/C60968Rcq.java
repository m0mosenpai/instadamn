package X;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Rcq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60968Rcq extends AbstractC53634Nnf {
    public static final List A00;

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        Integer A0j;
        char c;
        C14360o3.A0B(str, 0);
        Locale locale = Locale.ROOT;
        String A10 = AbstractC166997dE.A10(locale, new C11L("[^\\dA-Z˜Ñ&]*").A00(AbstractC166997dE.A10(locale, str), ""));
        if (AbstractC58322PtE.A0A(A10) != 13) {
            return C05F.A01;
        }
        if (new C11L("[A-Z\\u00D1&]{4}\\d{6}[A-Z0-9]{3}").A08(A10)) {
            if (!A00.contains(AbstractC25227BEk.A0w(A10, 0, 4)) && (A0j = AbstractC003100w.A0j(AbstractC25227BEk.A0w(A10, 4, 6), 10)) != null) {
                int intValue = A0j.intValue();
                Integer A0j2 = AbstractC003100w.A0j(AbstractC25227BEk.A0w(A10, 6, 8), 10);
                if (A0j2 != null) {
                    int intValue2 = A0j2.intValue() - 1;
                    Integer A0j3 = AbstractC003100w.A0j(AbstractC25227BEk.A0w(A10, 8, 10), 10);
                    if (A0j3 != null) {
                        int intValue3 = A0j3.intValue();
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        int floor = ((int) Math.floor(gregorianCalendar.get(1) / 100)) * 100;
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(intValue + floor, intValue2, intValue3);
                        if (gregorianCalendar2.compareTo((Calendar) gregorianCalendar) > 0) {
                            gregorianCalendar2 = new GregorianCalendar((floor - 100) + intValue, intValue2, intValue3);
                        }
                        if (gregorianCalendar2.get(5) == intValue3 && gregorianCalendar2.get(2) == intValue2 && gregorianCalendar2.get(1) % 100 == intValue) {
                            int codePointAt = A10.codePointAt(12);
                            String A0d = AbstractC002300n.A0d(AbstractC25227BEk.A0w(A10, 0, 12), "-", "", false);
                            int i = 0;
                            int i2 = 0;
                            do {
                                i2 += AbstractC001900j.A04("0123456789ABCDEFGHIJKLMN&OPQRSTUVWXYZ Ñ", (char) A0d.codePointAt(i), 0) * (13 - i);
                                i++;
                            } while (i < 12);
                            int i3 = 11 - (i2 % 11);
                            if (i3 != 10) {
                                if (i3 != 11) {
                                    c = (char) String.valueOf(i3).codePointAt(0);
                                } else {
                                    c = '0';
                                }
                            } else {
                                c = 'A';
                            }
                            if (c != codePointAt) {
                                return C05F.A0j;
                            }
                            return C05F.A00;
                        }
                    }
                }
            }
        }
        return C05F.A15;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        StringBuilder A11;
        char codePointAt;
        C14360o3.A0B(str, 0);
        String A002 = new C11L("[^\\dA-Z˜Ñ&]*").A00(AbstractC166997dE.A10(Locale.ROOT, str), "");
        int A0A = AbstractC58322PtE.A0A(A002);
        if (A0A <= 4) {
            return AbstractC58319PtB.A0s(A002, "[\\d]*", "");
        }
        String A0s = AbstractC58319PtB.A0s(AbstractC25227BEk.A0w(A002, 0, 4), "[\\d]*", "");
        int i = A0A;
        if (A0A > 10) {
            i = 10;
        }
        String A0s2 = AbstractC58319PtB.A0s(AbstractC25227BEk.A0w(A002, 4, i), "\\D", "");
        if (A0A > 10) {
            if (A0A > 13) {
                A0A = 13;
            }
            String A0s3 = AbstractC58319PtB.A0s(AbstractC25227BEk.A0w(A002, 10, A0A), "&", "");
            int A0A2 = AbstractC58322PtE.A0A(A0s3);
            if (A0A2 != 0) {
                String A0i = AnonymousClass001.A0i(A0s, A0s2, AbstractC25227BEk.A0w(A0s3, 0, Math.min(2, A0A2)), '-');
                if (A0A2 != 3 || '0' > (codePointAt = (char) A0s3.codePointAt(2))) {
                    return A0i;
                }
                if (codePointAt >= ':' && codePointAt != 'A') {
                    return A0i;
                }
                A11 = AbstractC166997dE.A11(A0i);
                A11.append(codePointAt);
                return A11.toString();
            }
        }
        A11 = AbstractC166997dE.A11(A0s);
        A11.append(A0s2);
        return A11.toString();
    }

    static {
        String[] strArr = new String[41];
        System.arraycopy(new String[]{"MEAR", "MEAS", "MEON", "MION", "MOCO", "MULA", "PEDA", "PEDO", "PENE", "PUTA", "PUTO", "QULO", "RATA", "RUIN"}, AbstractC31175DnJ.A1b(new String[]{"BUEI", "BUEY", "CACA", "CACO", "CAGA", "CAGO", "CAKA", "CAKO", "COGE", "COJA", "COJE", "COJI", "CULO", "COJO", "FETO", "GUEY", "JOTO", "KACA", "KACO", "KAGA", "KAGO", "KOGE", "KOJO", "KAKA", "KULO", "MAME", "MAMO"}, strArr) ? 1 : 0, strArr, 27, 14);
        A00 = AbstractC16960so.A1Q(strArr);
    }
}
