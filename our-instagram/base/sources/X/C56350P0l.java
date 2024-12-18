package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56350P0l implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final UserSession A01;
    public final O2R A02;
    public final InterfaceC58310Pt2 A03;
    public final NKJ A04;
    public final EnumC53380NjV A05;
    public final C81X A06;
    public final AbstractC59962oe A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        this.A00 = OOy.A00(this.A07.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 19), Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), 2131955273);
        NKJ nkj = this.A04;
        UserSession userSession = nkj.A05;
        if (AbstractC166987dD.A0x(userSession).getInt("clips_share_sheet_audience_control_row_new_badge_count", 0) < 3) {
            nkj.A02 = true;
            AbstractC167007dF.A18(AbstractC166987dD.A0x(userSession), "clips_share_sheet_audience_control_row_new_badge_count", AbstractC166987dD.A0x(userSession).getInt("clips_share_sheet_audience_control_row_new_badge_count", 0) + 1);
            C05A c05a = nkj.A08;
            C51738MtL c51738MtL = (C51738MtL) c05a.getValue();
            c05a.Egh(new C51738MtL((EnumC76383bi) c51738MtL.A01, c51738MtL.A02, true, c51738MtL.A04, c51738MtL.A03));
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A00, A00.A7i, C23031Ai.A8c, 182)) {
            nkj.A03 = true;
            C05A c05a2 = nkj.A08;
            C51738MtL c51738MtL2 = (C51738MtL) c05a2.getValue();
            c05a2.Egh(new C51738MtL((EnumC76383bi) c51738MtL2.A01, c51738MtL2.A02, c51738MtL2.A05, true, c51738MtL2.A03));
        }
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("audienceRow");
            throw C00O.createAndThrow();
        }
        return c50821Mcw;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A07;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 23), C07Y.A00(viewLifecycleOwner));
    }

    public C56350P0l(AbstractC59962oe abstractC59962oe, UserSession userSession, O2R o2r, InterfaceC58310Pt2 interfaceC58310Pt2, NKJ nkj) {
        MSZ.A1O(abstractC59962oe, interfaceC58310Pt2);
        this.A07 = abstractC59962oe;
        this.A01 = userSession;
        this.A04 = nkj;
        this.A03 = interfaceC58310Pt2;
        this.A02 = o2r;
        this.A06 = C81X.A0Q;
        this.A05 = EnumC53380NjV.A07;
    }
}
