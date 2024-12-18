package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class AOW implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AOW(C8NW c8nw, User user, String str, String str2) {
        this.A00 = c8nw;
        this.A03 = str;
        this.A01 = user;
        this.A02 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8NW c8nw = this.A00;
        UserSession userSession = c8nw.A0r;
        AbstractC55215Oed.A04(c8nw.A0o, userSession, "STICKER_TRAY", this.A03);
        User user = this.A01;
        String str = this.A02;
        User A10 = AbstractC166987dD.A10(userSession);
        String B8y = user.B8y();
        AHE ahe = new AHE(A10.getUsername(), A10.Bhu().getUrl(), A10.isVerified());
        AHE ahe2 = new AHE(user.getUsername(), user.Bhu().getUrl(), user.isVerified());
        C06090Tz c06090Tz = C06090Tz.A06;
        int intValue = AbstractC166997dE.A0i(c06090Tz, userSession, 36599576697769572L).intValue();
        String A04 = C18U.A04(c06090Tz, userSession, 36881051674542449L);
        String B8y2 = user.B8y();
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318101721192329L);
        List emptyList = Collections.emptyList();
        C8NW.A0Y(c8nw, new C1816383s(new NewFundraiserInfo(null, A04, B8y2, "", MSV.A00(362), str, FundraiserCampaignTypeEnum.A0E.toString(), null, emptyList, intValue, A06), ahe2, ahe, null, null, "", null, "", B8y, 0));
    }
}
