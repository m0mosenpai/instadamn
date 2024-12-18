package X;

import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I7R {
    public static final User A00(User user) {
        Parcelable.Creator creator = User.CREATOR;
        String id = user.getId();
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        return AbstractC38851rI.A02(user.A03.BSX(), AbstractC37300Gc1.A08(user), Bhu, null, Boolean.valueOf(user.isVerified()), false, id, null, username);
    }
}
