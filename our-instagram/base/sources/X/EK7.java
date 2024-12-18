package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EK7 extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelsEducationFragment";
    public InterfaceC83733oI A00;
    public RecyclerView A02;
    public C66362zD A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A06 = AbstractC43591JPw.A00(834);
    public final InterfaceC09390do A05 = C1XM.A00(new C37017GSy(this, 30));
    public String A01 = "thread_view";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131955057);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC83733oI interfaceC83733oI;
        String str;
        Serializable serializable;
        C81663kb c81663kb;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        String str5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str6;
        String C7I;
        String C7q;
        int AdZ;
        InterfaceC16820sZ c50169MDw;
        String str7;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Bundle bundle2 = this.mArguments;
        String str8 = null;
        if (bundle2 != null) {
            interfaceC83733oI = AbstractC35077Fco.A00(bundle2, "channel_education_thread_id");
        } else {
            interfaceC83733oI = null;
        }
        this.A00 = interfaceC83733oI;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (str = bundle3.getString("channel_education_entrypoint")) == null) {
            str = "thread_view";
        }
        this.A01 = str;
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A02 = A0F;
        if (A0F != null) {
            AbstractC31177DnL.A0s(requireContext, A0F);
            C66392zG A00 = C66362zD.A00(requireContext);
            InterfaceC09390do interfaceC09390do = this.A04;
            A00.A01(new C32626EYa(AbstractC166987dD.A0r(interfaceC09390do), requireContext));
            A00.A01(new EYM(requireContext));
            C66362zD A0R = AbstractC31173DnH.A0R(A00, new C32627EYb(AbstractC166987dD.A0r(interfaceC09390do), requireContext));
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                serializable = bundle4.getSerializable("channel_education_type");
            } else {
                serializable = null;
            }
            C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.education.util.ChannelEducationType");
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            InterfaceC83733oI interfaceC83733oI2 = this.A00;
            String str9 = null;
            if (interfaceC83733oI2 != null) {
                c81663kb = ((C2DS) this.A05.getValue()).B3U(JRE.A01(AbstractC1345466e.A05(interfaceC83733oI2)));
            } else {
                c81663kb = null;
            }
            C36183Fxx c36183Fxx = new C36183Fxx(AbstractC16960so.A1Q(new C32073E6z((Integer) 2131955046, R.drawable.instagram_group_pano_outline_24, 2131955047), new C32073E6z((Integer) 2131955048, R.drawable.instagram_heart_pano_outline_24, 2131955049), new C32073E6z(2131955051, 2131955050, "https://help.instagram.com/495982749203769", R.drawable.instagram_shield_pano_outline_24, 2131955052, 0)));
            String str10 = this.A01;
            if (c81663kb != null) {
                str2 = c81663kb.C7I();
                str8 = c81663kb.C7q();
                i = c81663kb.AdZ();
            } else {
                str2 = null;
                i = 0;
            }
            C36210FyO c36210FyO = new C36210FyO(2131955054, 2131955055, 2131955053, AbstractC58317Pt9.A00(963), str10, str2, str8, new C37017GSy(this, 26), R.drawable.instagram_illustrations_product_illustration_pi_plus_message_frequently, 2131955056, i);
            String str11 = this.A01;
            if (c81663kb != null) {
                str3 = c81663kb.C7I();
                str4 = c81663kb.C7q();
                i2 = c81663kb.AdZ();
            } else {
                str3 = null;
                str4 = null;
                i2 = 0;
            }
            C36210FyO c36210FyO2 = new C36210FyO(2131955065, 2131955066, 2131955064, "voice_message", str11, str3, str4, new C37017GSy(this, 27), R.drawable.instagram_illustrations_product_illustration_pi_plus_send_content, 2131955067, i2);
            String str12 = this.A01;
            if (c81663kb != null) {
                str5 = c81663kb.C7I();
                str9 = c81663kb.C7q();
                i3 = c81663kb.AdZ();
            } else {
                str5 = null;
                i3 = 0;
            }
            A0E.A01(AbstractC16960so.A1Q(c36183Fxx, c36210FyO, c36210FyO2, new C36210FyO(2131955043, 2131955044, 2131955042, "create_poll", str12, str5, str9, new C37017GSy(this, 28), R.drawable.instagram_illustrations_product_illustration_pi_plus_interact_with_members, 2131955045, i3)));
            if (c81663kb != null) {
                C83403nh BM0 = ((C2DS) this.A05.getValue()).BM0(c81663kb.BKb());
                if (BM0 != null) {
                    if (C7QS.A01(AbstractC166987dD.A0r(interfaceC09390do), BM0, Integer.valueOf(c81663kb.AdZ()), c81663kb.BSH(), c81663kb.C7g(), c81663kb.CPZ())) {
                        i4 = R.drawable.instagram_illustrations_product_illustration_pi_plus_share_your_channel;
                        i5 = 2131955062;
                        i6 = 2131955060;
                        i7 = 2131955061;
                        i8 = 2131955058;
                        str6 = this.A01;
                        C7I = c81663kb.C7I();
                        C7q = c81663kb.C7q();
                        AdZ = c81663kb.AdZ();
                        c50169MDw = new C37017GSy(this, 29);
                        str7 = "share_last_message";
                        A0E.A00(new C36210FyO(i6, i7, i8, str7, str6, C7I, C7q, c50169MDw, i4, i5, AdZ));
                    }
                }
                i4 = R.drawable.instagram_illustrations_product_illustration_pi_plus_share_your_channel;
                i5 = 2131955062;
                i6 = 2131955060;
                i7 = 2131955061;
                i8 = 2131955059;
                str6 = this.A01;
                C7I = c81663kb.C7I();
                C7q = c81663kb.C7q();
                AdZ = c81663kb.AdZ();
                c50169MDw = new C50169MDw(41, this, c81663kb);
                str7 = "keep_sharing";
                A0E.A00(new C36210FyO(i6, i7, i8, str7, str6, C7I, C7q, c50169MDw, i4, i5, AdZ));
            }
            A0R.A05(A0E);
            this.A03 = A0R;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(A0R);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1450529509);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.channel_education_container, viewGroup, false);
        C0f9.A09(-1625373562, A02);
        return inflate;
    }
}
