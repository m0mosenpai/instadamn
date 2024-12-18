package X;

import java.util.List;

/* renamed from: X.JfQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44161JfQ extends C0T6 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44161JfQ) {
                C44161JfQ c44161JfQ = (C44161JfQ) obj;
                if (!C14360o3.A0K(this.A00, c44161JfQ.A00) || !C14360o3.A0K(this.A01, c44161JfQ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode();
    }

    public C44161JfQ(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
