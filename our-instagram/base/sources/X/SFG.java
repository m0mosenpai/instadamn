package X;

/* loaded from: classes10.dex */
public final class SFG {
    public final CharSequence A00;
    public final CharSequence A01;
    public final String A02;

    public SFG(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A01 = charSequence;
        this.A00 = charSequence2;
        this.A02 = str;
        if (charSequence.length() > 0) {
        } else {
            throw AbstractC166987dD.A12("userId should not be empty");
        }
    }
}
