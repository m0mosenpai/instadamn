package X;

import java.util.Arrays;

/* renamed from: X.6Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136326Fl {
    public final AnonymousClass632 A00;
    public final C102884kP A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C136326Fl)) {
            return false;
        }
        C136326Fl c136326Fl = (C136326Fl) obj;
        if (this.A01 != c136326Fl.A01 || !this.A00.equals(c136326Fl.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C136326Fl(AnonymousClass632 anonymousClass632, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = anonymousClass632;
    }
}
