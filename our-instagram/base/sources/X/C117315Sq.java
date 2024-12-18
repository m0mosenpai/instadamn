package X;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.5Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117315Sq {
    public List A00;
    public final Matcher A01;
    public final C117325Sr A02 = new C117325Sr(this);
    public final CharSequence A03;

    public final List A00() {
        List list = this.A00;
        if (list == null) {
            C58486PwC c58486PwC = new C58486PwC(this);
            this.A00 = c58486PwC;
            return c58486PwC;
        }
        return list;
    }

    public final C17u A01() {
        Matcher matcher = this.A01;
        return C17s.A0C(matcher.start(), matcher.end());
    }

    public final C117315Sq A02() {
        Matcher matcher = this.A01;
        int end = matcher.end();
        int i = 0;
        if (matcher.end() == matcher.start()) {
            i = 1;
        }
        int i2 = end + i;
        CharSequence charSequence = this.A03;
        if (i2 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            C14360o3.A07(matcher2);
            if (matcher2.find(i2)) {
                return new C117315Sq(charSequence, matcher2);
            }
            return null;
        }
        return null;
    }

    public C117315Sq(CharSequence charSequence, Matcher matcher) {
        this.A01 = matcher;
        this.A03 = charSequence;
    }
}
