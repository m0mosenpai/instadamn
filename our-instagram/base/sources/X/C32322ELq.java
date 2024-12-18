package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ELq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32322ELq extends AbstractC59962oe implements InterfaceC62892tS {
    public static final String __redex_internal_original_name = "ChannelCreationNuxFragment";
    public C45492KCh A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC60122ou A07;

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "channel_creation_nux_carousel_container_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(ViewOnClickListenerC35681FpG.A00(this, 46), AbstractC31176DnK.A0C(view, R.id.direct_channel_action_bar)).A0X(this.A07);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0a();
        TextView A0T = AbstractC166997dE.A0T(view, R.id.nux_get_started_button);
        A0T.setText(2131955086);
        ViewOnClickListenerC35681FpG.A01(A0T, 45, this);
        List list = (List) ((C51753Mtc) ((C44453JlL) this.A06.getValue()).A08.getValue()).A02;
        C14360o3.A0B(list, 0);
        C45492KCh c45492KCh = new C45492KCh();
        c45492KCh.A04 = list;
        this.A00 = c45492KCh;
        c45492KCh.A02 = this;
        c45492KCh.setArguments(requireArguments());
        C14240no c14240no = new C14240no(getChildFragmentManager());
        C45492KCh c45492KCh2 = this.A00;
        if (c45492KCh2 == null) {
            C14360o3.A0F("slideFragment");
            throw C00O.createAndThrow();
        }
        c14240no.A0A(c45492KCh2, R.id.fragment_container);
        c14240no.A00();
        C142846ck A0d = AbstractC31172DnG.A0d(this.A03);
        int A01 = AbstractC167027dH.A01(this.A02);
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) this.A05.getValue();
        C14360o3.A0B(channelCreationSource, 1);
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            HashMap A1G = AbstractC166987dD.A1G();
            AbstractC31175DnJ.A1B(A0I, A0d);
            AbstractC31174DnI.A1I(A0I, "creator_nux_sheet_rendered");
            A0I.A0o("channel_item");
            AbstractC31178DnM.A1H(A0I, C142846ck.A00(channelCreationSource), A01);
            AbstractC31181DnP.A0l(A0I, A0d, A1G);
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
        Object value;
        C05A c05a = ((C44453JlL) this.A06.getValue()).A07;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, new C51753Mtc(AbstractC25228BEl.A1C(((C51753Mtc) value).A02), i2, 8)));
        C142846ck A0d = AbstractC31172DnG.A0d(this.A03);
        int A01 = AbstractC167027dH.A01(this.A02);
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("carousel_id", String.valueOf(i2));
            AbstractC31175DnJ.A1B(A0I, A0d);
            A0I.A0k("carousel_nux_screen_viewed");
            A0I.A0j("swipe");
            A0I.A0o("carousel_nux");
            AbstractC31178DnM.A1H(A0I, "broadcast_chat_creator_nux", A01);
            AbstractC31181DnP.A0l(A0I, A0d, A1G);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C32322ELq() {
        C37055GUl c37055GUl = new C37055GUl(this, 47);
        C37055GUl c37055GUl2 = new C37055GUl(this, 44);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C37055GUl.A00(c37055GUl2, enumC09460dv, 45);
        this.A06 = AbstractC25225BEi.A0a(new C37055GUl(A00, 46), c37055GUl, new C50172MDz(33, null, A00), AbstractC25225BEi.A1D(C44453JlL.class));
        this.A02 = DH5.A01(this, "interest_based_channel_implicit_audience_type", enumC09460dv, 16);
        this.A05 = DH5.A01(this, "social_channel_creation_source", enumC09460dv, 17);
        this.A01 = DH5.A01(this, "direct_channel_creation_flow_extra_args", enumC09460dv, 18);
        this.A03 = C37055GUl.A00(this, enumC09460dv, 43);
        this.A07 = C35891FtB.A00;
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(486126407);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_channels_nux_carousel_container, false);
        C0f9.A09(-1900866116, A02);
        return A0R;
    }
}
