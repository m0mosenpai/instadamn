package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;

/* renamed from: X.EIt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32259EIt extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MuteSettingsFragment";
    public User A00;
    public InterfaceC37186GZx A01;
    public final InterfaceC09390do A03 = C37057GUn.A00(this, 26);
    public final InterfaceC09390do A05 = C37057GUn.A00(this, 27);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A02 = "media_mute_sheet";

    public static final void A01(C32259EIt c32259EIt, Integer num) {
        UserSession A0r = AbstractC166987dD.A0r(c32259EIt.A04);
        User user = c32259EIt.A00;
        if (user != null) {
            FCG.A00(c32259EIt, A0r, user, num, null, AbstractC25225BEi.A15(c32259EIt.A03));
            InterfaceC37186GZx interfaceC37186GZx = c32259EIt.A01;
            if (interfaceC37186GZx != null) {
                interfaceC37186GZx.Ckc(c32259EIt, num);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FriendshipStatus B8n;
        Boolean CZB;
        FriendshipStatus B8n2;
        Boolean CZA;
        FriendshipStatus B8n3;
        Boolean CZC;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.posts_mute_row);
        AbstractC167007dF.A0N(A0S, R.id.posts_mute_setting_row_label).setText(2131976463);
        IgdsSwitch igdsSwitch = (IgdsSwitch) AbstractC166997dE.A0R(A0S, R.id.posts_mute_setting_row_switch);
        C32540EUq c32540EUq = new C32540EUq(14, C05F.A01, igdsSwitch, this);
        User user = this.A00;
        boolean z = true;
        if (user == null || !user.A1p()) {
            z = false;
        }
        igdsSwitch.setChecked(z);
        igdsSwitch.A07 = new G9C(5, c32540EUq, this);
        F89.A00(A0S, igdsSwitch);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.stories_mute_row);
        AbstractC167007dF.A0N(A0S2, R.id.stories_mute_setting_row_label).setText(2131976465);
        IgdsSwitch igdsSwitch2 = (IgdsSwitch) AbstractC166997dE.A0R(A0S2, R.id.stories_mute_setting_row_switch);
        C32540EUq c32540EUq2 = new C32540EUq(14, C05F.A0C, igdsSwitch2, this);
        User user2 = this.A00;
        boolean z2 = true;
        if (user2 == null || !user2.A1r()) {
            z2 = false;
        }
        igdsSwitch2.setChecked(z2);
        igdsSwitch2.A07 = new G9C(7, c32540EUq2, this);
        F89.A00(A0S2, igdsSwitch2);
        View A0S3 = AbstractC166997dE.A0S(view, R.id.notes_mute_row);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, A0k, 36316053021659043L) && C14360o3.A0K(C18U.A04(c06090Tz, A0k, 36879002975142122L), "CARDS")) || C4AC.A03(AbstractC166987dD.A0r(interfaceC09390do))) {
            AbstractC167007dF.A0N(A0S3, R.id.notes_mute_setting_row_label).setText(2131976461);
            IgdsSwitch igdsSwitch3 = (IgdsSwitch) AbstractC166997dE.A0R(A0S3, R.id.notes_mute_setting_row_switch);
            C32540EUq c32540EUq3 = new C32540EUq(14, C05F.A0N, igdsSwitch3, this);
            User user3 = this.A00;
            boolean z3 = true;
            if (user3 == null || (B8n3 = user3.A03.B8n()) == null || (CZC = B8n3.CZC()) == null || !CZC.booleanValue()) {
                z3 = false;
            }
            igdsSwitch3.setChecked(z3);
            igdsSwitch3.A07 = new G9C(6, c32540EUq3, this);
            F89.A00(A0S3, igdsSwitch3);
        } else {
            A0S3.setVisibility(8);
        }
        View A0S4 = AbstractC166997dE.A0S(view, R.id.content_notes_mute_row);
        if (!C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320618573406949L) && !C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320618574258923L)) {
            A0S4.setVisibility(8);
        } else {
            AbstractC167007dF.A0N(A0S4, R.id.content_notes_mute_setting_row_label).setText(2131976453);
            IgdsSwitch igdsSwitch4 = (IgdsSwitch) AbstractC166997dE.A0R(A0S4, R.id.content_notes_mute_setting_row_switch);
            User user4 = this.A00;
            boolean z4 = true;
            if (user4 == null || (B8n = user4.A03.B8n()) == null || (CZB = B8n.CZB()) == null || !CZB.booleanValue()) {
                z4 = false;
            }
            igdsSwitch4.setChecked(z4);
            igdsSwitch4.A07 = new G9H(this, 31);
            F89.A00(A0S4, igdsSwitch4);
        }
        View A0S5 = AbstractC166997dE.A0S(view, R.id.friend_map_mute_row);
        boolean z5 = false;
        if (C3LA.A05(AbstractC166987dD.A0r(interfaceC09390do), false)) {
            AbstractC166997dE.A0T(A0S5, R.id.friend_map_mute_setting_row_label).setText(2131976457);
            IgdsSwitch igdsSwitch5 = (IgdsSwitch) A0S5.requireViewById(R.id.friend_map_mute_setting_row_switch);
            User user5 = this.A00;
            if (user5 != null && (B8n2 = user5.A03.B8n()) != null && (CZA = B8n2.CZA()) != null && CZA.booleanValue()) {
                z5 = true;
            }
            igdsSwitch5.setChecked(z5);
            igdsSwitch5.A07 = new G9H(this, 32);
            F89.A00(A0S5, igdsSwitch5);
        } else {
            A0S5.setVisibility(8);
        }
        if (C18U.A06(C06090Tz.A06, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36321563464705646L)) {
            User user6 = this.A00;
            if (user6 != null && user6.A03.Cdp() != null) {
                A00(view, this);
            } else {
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, view, c07s, this, null, 32), C07Y.A00(viewLifecycleOwner));
            }
        }
        TextView A0N = AbstractC167007dF.A0N(view, R.id.mute_sheet_subtext);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        AbstractC31177DnL.A0r(context, A0N, AbstractC13180m4.A00(context), 2131968084);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public static final void A00(View view, C32259EIt c32259EIt) {
        FanClubInfoDict A0M;
        Boolean Cdp;
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.stories_teaser_mute_setting_row);
        User user = c32259EIt.A00;
        if (user != null && (A0M = AbstractC31172DnG.A0M(user)) != null && A0M.getFanClubId() != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(c32259EIt.A04);
            if (C18U.A06(AbstractC25225BEi.A0j(A0o, 0), A0o, 36321563464705646L)) {
                boolean z = false;
                igdsListCell.setVisibility(0);
                igdsListCell.A06(2131976456);
                igdsListCell.setTextCellType(EnumC53237Nga.A08);
                User user2 = c32259EIt.A00;
                if (user2 != null && (Cdp = user2.A03.Cdp()) != null) {
                    z = Cdp.booleanValue();
                }
                igdsListCell.setChecked(z);
                igdsListCell.A0E(new P3X(12, igdsListCell, c32259EIt));
                return;
            }
        }
        igdsListCell.setVisibility(8);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1290277031);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0h(this.A04).A02(AbstractC25225BEi.A15(this.A05));
        C0f9.A09(-1105498299, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(58435708);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mute_sheet, viewGroup, false);
        C0f9.A09(44750186, A02);
        return inflate;
    }
}
