package X;

/* loaded from: classes10.dex */
public abstract class Q6Z extends AbstractC53409Njy {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6Z(String str, CharSequence charSequence) {
        super(str, charSequence);
        C14360o3.A0B(str, 1);
        this.A00 = str;
        if (str.length() > 0) {
        } else {
            throw AbstractC166987dD.A12("type must not be empty");
        }
    }

    @Override // X.AbstractC53409Njy
    public final String A00() {
        return this.A00;
    }
}
