package X;

/* loaded from: classes10.dex */
public final class SNT {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof SNT) {
            SNT snt = (SNT) obj;
            if (this.A00 == snt.A00) {
                CharSequence charSequence = snt.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        Integer valueOf = Integer.valueOf(this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return AbstractC37301Gc2.A02(valueOf, str);
    }

    public SNT(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }
}
