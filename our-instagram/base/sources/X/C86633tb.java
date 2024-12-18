package X;

import java.util.List;

/* renamed from: X.3tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86633tb extends C0T6 {
    public final C206209Bd A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86633tb) {
                C86633tb c86633tb = (C86633tb) obj;
                if (!C14360o3.A0K(this.A02, c86633tb.A02) || !C14360o3.A0K(this.A01, c86633tb.A01) || this.A04 != c86633tb.A04 || !C14360o3.A0K(this.A03, c86633tb.A03) || !C14360o3.A0K(this.A00, c86633tb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaInteractiveUiState(mediaId=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1409));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(567));
        sb.append(this.A04);
        sb.append(AbstractC111324zv.A00(1445));
        sb.append(this.A03);
        sb.append(", actions=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        List list = this.A03;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A00.hashCode();
    }

    public C86633tb(C206209Bd c206209Bd, String str, String str2, List list, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = list;
        this.A00 = c206209Bd;
    }
}
