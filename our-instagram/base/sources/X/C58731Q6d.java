package X;

/* renamed from: X.Q6d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58731Q6d extends AbstractC53410Njz {
    public final String A00;

    @Override // X.AbstractC53410Njz
    public final String A01() {
        return this.A00;
    }

    public C58731Q6d(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.A00 = str;
        if (str.length() > 0) {
        } else {
            throw AbstractC166987dD.A12("type must not be empty");
        }
    }
}
