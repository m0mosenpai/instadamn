package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* renamed from: X.NFe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52366NFe extends IgLinearLayout {
    public OW0 A00;
    public OHd A01;
    public boolean A02;
    public View A03;
    public InterfaceC43578JMm A04;
    public NewFundraiserInfo A05;
    public ExistingStandaloneFundraiserForFeedModel A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C54399O2f A09;
    public final String A0A;

    public final void setExistingFundraiserInfo(InterfaceC43578JMm interfaceC43578JMm) {
        if (interfaceC43578JMm == null || !interfaceC43578JMm.AlL()) {
            interfaceC43578JMm = null;
        }
        this.A04 = interfaceC43578JMm;
        A00();
    }

    private final void A00() {
        OHd oHd = this.A01;
        if (oHd != null) {
            NewFundraiserInfo newFundraiserInfo = this.A05;
            InterfaceC43578JMm interfaceC43578JMm = this.A04;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = this.A06;
            oHd.A00(new OFO(interfaceC43578JMm, newFundraiserInfo, new PJS(this), new OCX(this.A07, this.A08, "REELS", this.A0A), existingStandaloneFundraiserForFeedModel, AbstractC167007dF.A05(this.A02 ? 1 : 0)));
        }
    }

    public final InterfaceC43578JMm getExistingFundraiserInfo() {
        return this.A04;
    }

    public final ExistingStandaloneFundraiserForFeedModel getFundraiserToAttach() {
        return this.A06;
    }

    public final NewFundraiserInfo getNewFundraiserModel() {
        return this.A05;
    }

    public final boolean getShowIcon() {
        return this.A02;
    }

    public final OW0 getSuggestionsRowController() {
        return this.A00;
    }

    public final void setFundraiserToAttach(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        this.A06 = existingStandaloneFundraiserForFeedModel;
        A00();
    }

    public final void setNewFundraiserModel(NewFundraiserInfo newFundraiserInfo) {
        this.A05 = newFundraiserInfo;
        A00();
    }

    public C52366NFe(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54399O2f c54399O2f, String str) {
        super(context);
        this.A09 = c54399O2f;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0A = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        List list;
        int A06 = C0f9.A06(-1516840094);
        super.onAttachedToWindow();
        if (this.A03 == null) {
            View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(AbstractC166997dE.A0L(this)), this, R.layout.layout_share_content_row_action_with_suggestions, false);
            this.A01 = new OHd(new PJU(A0R));
            A00();
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A08;
            InterfaceC81733ki AYu = AbstractC31171DnF.A0T(userSession, c08730cb).AYu();
            if (AYu != null) {
                list = AYu.B9F();
            } else {
                list = null;
            }
            OW0 ow0 = new OW0(A0R, userSession, new C54396O2c(this), new C54524O7b(this.A07, userSession));
            this.A00 = ow0;
            if (list == null) {
                list = AbstractC166987dD.A1E();
            }
            ow0.A01(list);
            addView(A0R);
            this.A03 = A0R;
        }
        C0f9.A0D(-907959682, A06);
    }

    public final void setShowIcon(boolean z) {
        this.A02 = z;
    }

    public final void setSuggestionsRowController(OW0 ow0) {
        this.A00 = ow0;
    }
}
