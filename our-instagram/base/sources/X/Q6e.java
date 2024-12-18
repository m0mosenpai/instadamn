package X;

/* loaded from: classes10.dex */
public abstract class Q6e extends AbstractC53410Njz {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6e(String str, CharSequence charSequence) {
        super(str, charSequence);
        C14360o3.A0B(str, 1);
        this.A00 = str;
        if (str.length() > 0) {
        } else {
            throw AbstractC166987dD.A12("type must not be empty");
        }
    }

    @Override // X.AbstractC53410Njz
    public final String A01() {
        return this.A00;
    }
}
