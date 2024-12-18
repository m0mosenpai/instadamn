package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class Wab implements InterfaceC72013XFb {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Wab) && C14360o3.A0K(this.A00, ((Wab) obj).A00));
    }

    public final String toString() {
        return AnonymousClass001.A0S("StaticTextStringResource(text=", this.A00, ')');
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public Wab(String str) {
        this.A00 = str;
    }

    public static Wab A00(C2JS c2js, String str, int i) {
        return new Wab(c2js.getOptionalStringField(i, str));
    }

    @Override // X.InterfaceC72013XFb
    public final CharSequence C2i(Context context) {
        return this.A00;
    }
}
