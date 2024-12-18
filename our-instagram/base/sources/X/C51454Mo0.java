package X;

/* renamed from: X.Mo0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51454Mo0 extends AbstractC53421NkA {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51454Mo0) {
                C51454Mo0 c51454Mo0 = (C51454Mo0) obj;
                if (!C14360o3.A0K(this.A01, c51454Mo0.A01) || this.A00 != c51454Mo0.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166987dD.A0J(this.A01);
        Integer num = this.A00;
        return A0J + AbstractC25230BEn.A0C(num, AbstractC53664NoF.A00(num));
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC53664NoF.A00(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0v("ODRTemplateErrorEvent(errorMessage=", str2, ", errorType=", str, ')');
    }

    public C51454Mo0(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
