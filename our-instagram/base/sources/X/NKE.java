package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class NKE extends OX6 {
    public InterfaceC81733ki A00;
    public InterfaceC43578JMm A01;
    public NewFundraiserInfo A02;
    public EnumC76383bi A03;
    public ExistingStandaloneFundraiserForFeedModel A04;
    public String A05;
    public HashSet A06;
    public LinkedHashSet A07;
    public LinkedHashSet A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public final UserSession A0C;
    public final AbstractC55082Oac A0D;
    public final String A0E;
    public final C19L A0F;
    public final InterfaceC06180Ui A0G;
    public final InterfaceC15070pN A0H;

    public final void A08() {
        this.A02 = null;
        this.A04 = null;
        AbstractC53597Nn4.A00 = false;
        AbstractC25651Mw.A00(this.A0C).E4s(new C56004Otb(false));
        PZT.A03(this, this.A0F, 43);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NKE(UserSession userSession, AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        C19K A02 = AnonymousClass194.A02(new C12M().A04);
        AbstractC167027dH.A13(userSession, abstractC55082Oac, A02);
        this.A0C = userSession;
        this.A0D = abstractC55082Oac;
        this.A0F = A02;
        this.A0E = AbstractC167017dG.A0j();
        AnonymousClass057 A0t = MSY.A0t();
        this.A0G = A0t;
        this.A0H = MSX.A0r(A0t);
        this.A06 = AbstractC166987dD.A1H();
        this.A07 = AbstractC31171DnF.A0l();
        this.A08 = AbstractC31171DnF.A0l();
        this.A09 = AbstractC166987dD.A1E();
        this.A05 = "";
    }

    public final void A09() {
        User A01 = C17060sy.A01.A01(this.A0C);
        this.A02 = new NewFundraiserInfo(A01.getId(), null, A01.B8y(), null, "FEED_COMPOSER", A01.A03.AnC(), FundraiserCampaignTypeEnum.A0C.toString(), null, C16930sl.A00, -1, false);
        PZT.A03(this, this.A0F, 44);
    }
}
