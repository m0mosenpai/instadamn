package X;

import com.instagram.api.schemas.AudioFilterType;
import java.util.List;

/* renamed from: X.GyA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38607GyA extends C0T6 {
    public final AudioFilterType A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38607GyA) {
                C38607GyA c38607GyA = (C38607GyA) obj;
                if (this.A00 != c38607GyA.A00 || !C14360o3.A0K(this.A01, c38607GyA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C38607GyA(AudioFilterType audioFilterType, List list) {
        this.A00 = audioFilterType;
        this.A01 = list;
    }
}
