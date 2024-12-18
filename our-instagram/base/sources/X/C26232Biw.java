package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Biw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26232Biw extends C0T6 implements InterfaceC58259Ps3 {
    public final GifUrlImpl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26232Biw) {
                C26232Biw c26232Biw = (C26232Biw) obj;
                if (!C14360o3.A0K(this.A01, c26232Biw.A01) || !C14360o3.A0K(this.A00, c26232Biw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C26232Biw(GifUrlImpl gifUrlImpl, String str) {
        this.A01 = str;
        this.A00 = gifUrlImpl;
    }
}
