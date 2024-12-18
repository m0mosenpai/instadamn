package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KBg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45471KBg extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SuggestedRepliesSettingsFragment";
    public L16 A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final String A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131974924);
        interfaceC56362iU.ETp(true);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC46279KeB enumC46279KeB;
        String str;
        C14360o3.A0B(view, 0);
        UserSession A0r = AbstractC166987dD.A0r(this.A01);
        String string = requireArguments().getString("entrypoint");
        if (string == null) {
            string = "unknown";
        }
        L16 l16 = new L16(A0r, (SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) requireArguments().getParcelable(AbstractC111324zv.A00(4850)), string);
        this.A00 = l16;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(l16.A00, "ig_creator_agents_suggested_replies_settings_view");
        if (A0f.isSampled()) {
            A0f.AAQ(new C0Zx(), "sr_context");
            SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = l16.A01;
            String str2 = null;
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                enumC46279KeB = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00;
            } else {
                enumC46279KeB = null;
            }
            A0f.A8R(enumC46279KeB, "inbox_type");
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                str = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02;
            } else {
                str = null;
            }
            A0f.AAP("sr_session_id", str);
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                str2 = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03;
            }
            A0f.AAP("thread_session_id", str2);
            AbstractC31175DnJ.A17(A0f, l16.A02);
        }
        IgdsFooterCell igdsFooterCell = (IgdsFooterCell) view.findViewById(R.id.suggested_replies_settings_footer);
        CharSequence text = getText(2131974921);
        C14360o3.A07(text);
        igdsFooterCell.A00(text);
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.suggested_replies_settings_toggle);
        igdsListCell.setTextCellType(EnumC53237Nga.A08);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(igdsListCell, viewLifecycleOwner, c07s, this, null, 10), C07Y.A00(viewLifecycleOwner));
        igdsListCell.A0E(new C49502LuF(0, view, this));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C45471KBg() {
        C29887DGb c29887DGb = new C29887DGb(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29887DGb(new C29887DGb(this, 17), 18));
        this.A02 = AbstractC25225BEi.A0a(new C29887DGb(A00, 19), c29887DGb, new C50169MDw(9, A00, null), AbstractC25225BEi.A1D(C44510JmG.class));
        this.A03 = "suggested_replies_settings";
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1126650994);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.suggested_replies_settings_layout, false);
        C0f9.A09(1557638646, A02);
        return A0R;
    }
}
