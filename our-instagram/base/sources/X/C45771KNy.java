package X;

import com.instagram.api.schemas.Achievement;
import java.util.List;

/* renamed from: X.KNy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45771KNy extends AbstractC46412KgY {
    public final Achievement A00;
    public final List A01;
    public final List A02;

    public C45771KNy(Achievement achievement, List list, List list2) {
        C14360o3.A0B(achievement, 1);
        this.A00 = achievement;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45771KNy) {
                C45771KNy c45771KNy = (C45771KNy) obj;
                if (!C14360o3.A0K(this.A00, c45771KNy.A00) || !C14360o3.A0K(this.A01, c45771KNy.A01) || !C14360o3.A0K(this.A02, c45771KNy.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
