package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.320, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass320 extends C0T6 {
    public static final AnonymousClass320 A05 = new AnonymousClass320(C16930sl.A00, 0, 0, false);
    public boolean A00;
    public final int A01;
    public final int A02;
    public final List A03;
    public final List A04;

    public AnonymousClass320(List list, int i, int i2, boolean z) {
        C14360o3.A0B(list, 3);
        this.A02 = i;
        this.A01 = i2;
        this.A04 = list;
        this.A00 = z;
        List unmodifiableList = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList);
        this.A03 = unmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass320) {
                AnonymousClass320 anonymousClass320 = (AnonymousClass320) obj;
                if (this.A02 != anonymousClass320.A02 || this.A01 != anonymousClass320.A01 || !C14360o3.A0K(this.A04, anonymousClass320.A04) || this.A00 != anonymousClass320.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntryCriteria(initialContentIndex=");
        sb.append(this.A02);
        sb.append(", entryPointIndex=");
        sb.append(this.A01);
        sb.append(", reelTrayIds=");
        sb.append(this.A04);
        sb.append(", isHpAdSensitive=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((((this.A02 * 31) + this.A01) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return hashCode + i;
    }
}
