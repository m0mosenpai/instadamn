package X;

/* renamed from: X.NoM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53671NoM {
    public static /* synthetic */ String A00(CharSequence charSequence, CharSequence[] charSequenceArr) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = charSequenceArr.length;
        if (length > 0) {
            A1C.append(charSequenceArr[0]);
            for (int i = 1; i < length; i++) {
                A1C.append(charSequence);
                A1C.append(charSequenceArr[i]);
            }
        }
        return A1C.toString();
    }
}
