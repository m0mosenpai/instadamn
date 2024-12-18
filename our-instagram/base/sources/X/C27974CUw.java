package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @ReplaceWith(expression = "LinkAnnotation.Url(url)", imports = {}))
/* renamed from: X.CUw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27974CUw {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27974CUw) && C14360o3.A0K(this.A00, ((C27974CUw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("UrlAnnotation(url=", this.A00);
    }

    public C27974CUw(String str) {
        this.A00 = str;
    }
}
