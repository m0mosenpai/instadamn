package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.GyG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38613GyG extends C0T6 {
    public User A00;
    public Integer A01;
    public ArrayList A02;

    public C38613GyG() {
        Parcelable.Creator creator = User.CREATOR;
        User A02 = AbstractC38851rI.A02(null, null, null, null, null, null, null, null, null);
        Integer num = C05F.A00;
        C14360o3.A0B(A02, 1);
        this.A00 = A02;
        this.A02 = null;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38613GyG) {
                C38613GyG c38613GyG = (C38613GyG) obj;
                if (!C14360o3.A0K(this.A00, c38613GyG.A00) || !C14360o3.A0K(this.A02, c38613GyG.A02) || this.A01 != c38613GyG.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A02)) * 31) + (-1140810758) + this.A01.intValue();
    }
}
