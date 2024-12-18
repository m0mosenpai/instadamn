package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.11L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11L implements Serializable {
    public final Pattern A00;

    public C11L(String str) {
        C14360o3.A0B(str, 1);
        Pattern compile = Pattern.compile(str);
        C14360o3.A07(compile);
        this.A00 = compile;
    }

    public final String A00(CharSequence charSequence, String str) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(str, 1);
        String replaceAll = this.A00.matcher(charSequence).replaceAll(str);
        C14360o3.A07(replaceAll);
        return replaceAll;
    }

    public final String A01(CharSequence charSequence, String str) {
        C14360o3.A0B(charSequence, 0);
        String replaceFirst = this.A00.matcher(charSequence).replaceFirst(str);
        C14360o3.A07(replaceFirst);
        return replaceFirst;
    }

    public final String A02(CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(charSequence, 0);
        int i = 0;
        C117315Sq A06 = A06(charSequence, 0);
        if (A06 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, A06.A01().A00);
            sb.append((CharSequence) interfaceC16660sJ.invoke(A06));
            i = A06.A01().A01 + 1;
            A06 = A06.A02();
            if (i >= length) {
                break;
            }
        } while (A06 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final List A03(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        Matcher matcher = this.A00.matcher(charSequence);
        if (!matcher.find()) {
            List singletonList = Collections.singletonList(charSequence.toString());
            C14360o3.A07(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final C53042bl A04(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        if (0 <= charSequence.length()) {
            C9FE c9fe = new C9FE(0, 7, this, charSequence);
            C6KT c6kt = C6KT.A00;
            C14360o3.A0B(c6kt, 1);
            return new C53042bl(c9fe, c6kt);
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(0, charSequence.length(), "Start index out of bounds: ", ", input length: "));
    }

    public final C117315Sq A05(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        Matcher matcher = this.A00.matcher(charSequence);
        C14360o3.A07(matcher);
        if (!matcher.matches()) {
            return null;
        }
        return new C117315Sq(charSequence, matcher);
    }

    public final C117315Sq A06(CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 0);
        Matcher matcher = this.A00.matcher(charSequence);
        C14360o3.A07(matcher);
        if (!matcher.find(i)) {
            return null;
        }
        return new C117315Sq(charSequence, matcher);
    }

    public final boolean A07(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        return this.A00.matcher(charSequence).find();
    }

    public final boolean A08(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        return this.A00.matcher(charSequence).matches();
    }

    public final String toString() {
        String obj = this.A00.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C11L(String str, java.util.Set set) {
        C14360o3.A0B(set, 2);
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC46315Kel) ((InterfaceC50411MNn) it.next())).A00;
        }
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        C14360o3.A07(compile);
        this.A00 = compile;
    }

    public C11L(String str, EnumC46315Kel enumC46315Kel) {
        C14360o3.A0B(str, 1);
        int i = enumC46315Kel.A00;
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        C14360o3.A07(compile);
        this.A00 = compile;
    }
}
