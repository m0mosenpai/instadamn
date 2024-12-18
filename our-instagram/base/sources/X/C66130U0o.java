package X;

import android.text.SpannableString;
import com.instagram.model.keyword.Keyword;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.U0o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66130U0o extends AbstractC65924TwV {
    public int A00;
    public Keyword A01;
    public CharSequence A02;
    public boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66130U0o(Keyword keyword) {
        super(4);
        C14360o3.A0B(keyword, 1);
        this.A01 = keyword;
        this.A02 = keyword.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A06(String str, boolean z) {
        int i;
        String str2 = this.A01.A04;
        C14360o3.A0B(str2, 0);
        int length = str.length();
        int i2 = 0;
        if (length != 0 && (!U3K.A02.A08(str2))) {
            SpannableString spannableString = new SpannableString(str2);
            ArrayList arrayList = new ArrayList();
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String lowerCase = str2.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            StringBuilder sb = new StringBuilder(lowerCase);
            int i3 = length - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= i3) {
                int i5 = i3;
                if (!z2) {
                    i5 = i4;
                }
                int A00 = C14360o3.A00(str.charAt(i5), 32);
                boolean z3 = false;
                if (A00 <= 0) {
                    z3 = true;
                }
                if (!z2) {
                    if (!z3) {
                        z2 = true;
                    } else {
                        i4++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    i3--;
                }
            }
            String obj = str.subSequence(i4, i3 + 1).toString();
            Locale locale2 = Locale.getDefault();
            C14360o3.A07(locale2);
            String lowerCase2 = obj.toLowerCase(locale2);
            C14360o3.A07(lowerCase2);
            String[] strArr = (String[]) new C11L("\\s+").A03(lowerCase2).toArray(new String[0]);
            Arrays.sort(strArr, new C71659WyA((InterfaceC16620sF) U3O.A00, 8));
            for (String str3 : strArr) {
                int indexOf = sb.indexOf(str3);
                StringBuffer stringBuffer = new StringBuffer(sb);
                while (true) {
                    if (indexOf != -1) {
                        boolean z4 = true;
                        if (indexOf != 0 && str2.codePointAt(indexOf - 1) != 32) {
                            z4 = false;
                        }
                        Pattern pattern = AbstractC13670mt.A00;
                        if (str3 != null) {
                            i = str3.length();
                        } else {
                            i = 0;
                        }
                        if (!z4) {
                            int i6 = i + indexOf;
                            while (indexOf < i6) {
                                int i7 = indexOf + 1;
                                stringBuffer.replace(indexOf, i7, " ");
                                indexOf = i7;
                            }
                            indexOf = stringBuffer.indexOf(str3);
                        } else {
                            arrayList.add(new U3L(indexOf, i));
                            int i8 = i + indexOf;
                            while (indexOf < i8) {
                                int i9 = indexOf + 1;
                                sb.replace(indexOf, i9, " ");
                                indexOf = i9;
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList, new C71659WyA((InterfaceC16620sF) U3N.A00, 8));
            C16930sl c16930sl = C16930sl.A00;
            List list = c16930sl;
            U3M u3m = U3K.A00;
            List singletonList = Collections.singletonList(u3m);
            C14360o3.A07(singletonList);
            if (z) {
                list = Collections.singletonList(u3m);
                C14360o3.A07(list);
                singletonList = c16930sl;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                U3L u3l = (U3L) it.next();
                int i10 = u3l.A01;
                if (i10 != 0) {
                    U3K.A00(spannableString, singletonList, i2, i10);
                    i2 += i10 - i2;
                }
                int i11 = u3l.A00;
                U3K.A00(spannableString, list, i10, i10 + i11);
                i2 += i11;
            }
            Pattern pattern2 = AbstractC13670mt.A00;
            U3K.A00(spannableString, singletonList, i2, str2.length());
            str2 = spannableString;
        }
        this.A02 = str2;
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if ((obj instanceof C66130U0o) && C14360o3.A0K(this.A01, ((C66130U0o) obj).A01)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C66130U0o() {
        super(4);
        this.A01 = new Keyword(null, null, "", null, null, null, null, null, 0L, false, false);
        this.A02 = null;
    }
}
