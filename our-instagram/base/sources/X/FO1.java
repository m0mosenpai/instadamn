package X;

import android.content.Context;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FO1 {
    public final Context A00;
    public final C38321qM A01;
    public final UserDetailEntryInfo A02;
    public final ProgressButton A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public FO1(Context context, C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, ProgressButton progressButton, User user, String str, String str2, String str3) {
        C14360o3.A0B(user, 2);
        this.A00 = context;
        this.A04 = user;
        this.A01 = c38321qM;
        this.A03 = progressButton;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = userDetailEntryInfo;
    }
}
