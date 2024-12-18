package X;

import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.user.model.User;

/* renamed from: X.GyI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38615GyI extends C0T6 {
    public final ThreadHeaderContextType A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38615GyI) {
                C38615GyI c38615GyI = (C38615GyI) obj;
                if (this.A00 != c38615GyI.A00 || !C14360o3.A0K(this.A02, c38615GyI.A02) || !C14360o3.A0K(this.A03, c38615GyI.A03) || !C14360o3.A0K(this.A01, c38615GyI.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38615GyI(ThreadHeaderContextType threadHeaderContextType, User user, String str, String str2) {
        AbstractC167017dG.A1P(threadHeaderContextType, str);
        this.A00 = threadHeaderContextType;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }
}
