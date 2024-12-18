package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GG0 implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        FO1 fo1 = (FO1) obj;
        C18C.A07(fo1, "Payload for FollowFromOtherAccountOperation cannot be null!");
        Context context = fo1.A00;
        User user = fo1.A04;
        ProgressButton progressButton = fo1.A03;
        EnumC33402EpZ enumC33402EpZ = EnumC33402EpZ.A06;
        C38321qM c38321qM = fo1.A01;
        String str = fo1.A05;
        String str2 = fo1.A07;
        String str3 = fo1.A06;
        UserDetailEntryInfo userDetailEntryInfo = fo1.A02;
        String id = user.getId();
        C14360o3.A0B(userSession, 1);
        C1ON A00 = AbstractC151506rw.A00(context, userSession, c38321qM, null, null, null, null, null, id, "create", "follow_from_other_accounts_fragment", null, null, null, null, null);
        A00.A00 = new C33278EnZ(userSession, userSession, this, interfaceC03960Jm, progressButton, user, user);
        C1GJ.A03(A00);
        AbstractC129875tr.A01(null, userSession, c38321qM, userDetailEntryInfo, null, null, enumC33402EpZ, user, null, C05F.A01, null, str, str2, str3, null, null, null);
    }
}
