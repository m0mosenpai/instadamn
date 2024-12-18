package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57555PgT extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57555PgT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57555PgT(obj, i));
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57555PgT(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View A0d;
        int i;
        ViewStub A07;
        View A0E;
        switch (this.A00) {
            case 0:
                View findViewById = ((C52833NZq) this.A01).A01.findViewById(R.id.iglive_audio_button);
                C14360o3.A0A(findViewById);
                findViewById.setVisibility(0);
                return findViewById;
            case 1:
                View findViewById2 = ((C52833NZq) this.A01).A01.findViewById(R.id.iglive_video_button);
                C14360o3.A0A(findViewById2);
                findViewById2.setVisibility(0);
                return findViewById2;
            case 2:
                OJp oJp = (OJp) this.A01;
                RecyclerView A0G = AbstractC31172DnG.A0G(oJp.A01, R.id.iglive_mention_suggestions_recycler_view);
                AbstractC31174DnI.A17(oJp.A03.requireContext(), A0G, false);
                A0G.setAdapter(oJp.A05);
                return A0G;
            case 3:
            case 7:
            case 11:
            case 16:
            case 22:
            case 26:
            case 32:
            case 36:
            default:
                return this.A01;
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 23:
            case 27:
            case 33:
            case 37:
                return AbstractC25226BEj.A1C(this.A01);
            case 5:
            case 9:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 18:
            case 24:
            case 28:
            case 34:
            case 38:
                return AbstractC167027dH.A0B(this.A01);
            case 6:
                OJp oJp2 = (OJp) this.A01;
                return new C52304NCt(oJp2.A03, oJp2.A04, oJp2.A06);
            case 10:
                return new NBU(AbstractC166987dD.A0r(((C52186N7z) this.A01).A03));
            case 14:
                ODT odt = (ODT) this.A01;
                return new NCF(odt.A02, odt.A03);
            case Process.SIGTERM /* 15 */:
                View A0d2 = AbstractC166987dD.A0d(((N7s) this.A01).A02);
                if (A0d2 != null) {
                    return A0d2.findViewById(R.id.iglive_invite_inline_search_box);
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                return new NBU(AbstractC166987dD.A0r(((C52826NZj) this.A01).A02));
            case 20:
                View view = ((Fragment) this.A01).mView;
                if (view == null || (A07 = AbstractC31171DnF.A07(view, R.id.recycler_null_state_view_stub)) == null || (A0E = AbstractC31173DnH.A0E(A07, R.layout.layout_iglive_moderator_actions_fragment)) == null) {
                    return null;
                }
                return A0E.findViewById(R.id.moderator_actions_empty_container);
            case 21:
                N80 n80 = (N80) this.A01;
                return new FR7(n80, AbstractC166987dD.A0r(n80.A05));
            case 25:
                OE9 oe9 = (OE9) this.A01;
                return new NCG(oe9.A03, oe9.A04);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C55064OaK c55064OaK = (C55064OaK) this.A01;
                UserSession userSession = c55064OaK.A04;
                EnumC142806cg enumC142806cg = c55064OaK.A05;
                AbstractC59962oe abstractC59962oe = c55064OaK.A02;
                return new NDK(abstractC59962oe.requireContext(), abstractC59962oe, userSession, enumC142806cg);
            case 30:
                C52835NZs c52835NZs = (C52835NZs) this.A01;
                return new C52297NCm(c52835NZs.requireContext(), c52835NZs, AbstractC166987dD.A0r(c52835NZs.A08));
            case 31:
                InterfaceC19630xq interfaceC19630xq = ((C50961MfU) ((C52835NZs) this.A01).A07.getValue()).A08.A02.A00;
                AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "key_ig_live_upsell_number_times", 0);
                return C0eB.A00;
            case 35:
                return AbstractC147806l5.A00(AbstractC166987dD.A0r(((C52834NZr) this.A01).A0D));
            case 39:
                C52834NZr c52834NZr = (C52834NZr) this.A01;
                return new C52305NCu(c52834NZr.requireContext(), c52834NZr, AbstractC166987dD.A0r(c52834NZr.A0D));
            case 40:
                C56049OuO c56049OuO = (C56049OuO) this.A01;
                ViewGroup viewGroup = c56049OuO.A05;
                boolean A06 = C18U.A06(C06090Tz.A05, c56049OuO.A0D, 36322757465745891L);
                int i2 = R.id.iglive_audience_pill_stub;
                if (A06) {
                    i2 = R.id.iglive_audience_pill_new_stub;
                }
                View A0U = AbstractC167017dG.A0U(viewGroup, i2);
                C14360o3.A0A(A0U);
                A0U.setVisibility(8);
                C3P9 A0s = AbstractC166987dD.A0s(A0U);
                A0s.A04 = new C56157OwP(c56049OuO, 2);
                A0s.A05 = C05F.A01;
                A0s.A00();
                return A0U;
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC167007dF.A0L(((C56049OuO) this.A01).A0M).requireViewById(R.id.iglive_audience_pill_icon);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC167007dF.A0L(((C56049OuO) this.A01).A0M).requireViewById(R.id.iglive_audience_pill_text);
            case 43:
                ViewGroup viewGroup2 = ((C56049OuO) this.A01).A05;
                AbstractC50523MSb.A0m(viewGroup2, R.id.camera_home_button_stub);
                return viewGroup2.requireViewById(R.id.camera_home_button);
            case 44:
                ViewGroup viewGroup3 = ((C56049OuO) this.A01).A05;
                AbstractC50523MSb.A0m(viewGroup3, R.id.camera_settings_gear_stub);
                return viewGroup3.requireViewById(R.id.camera_settings_gear);
            case 45:
                return AbstractC50523MSb.A07(((C56049OuO) this.A01).A05, R.id.iglive_new_title_background_stub);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A0d = AbstractC166987dD.A0d(((C56049OuO) this.A01).A0R);
                i = R.id.iglive_new_title_cancel_button;
                break;
            case 47:
                A0d = AbstractC166987dD.A0d(((C56049OuO) this.A01).A0R);
                i = R.id.iglive_new_title_done_button;
                break;
            case 48:
                C56049OuO c56049OuO2 = (C56049OuO) this.A01;
                TextView textView = (TextView) AbstractC50523MSb.A07(c56049OuO2.A05, R.id.iglive_new_title_stub);
                C55346Oi6.A01(textView, c56049OuO2, 28);
                ViewOnFocusChangeListenerC55473OkS.A00(textView, 7, c56049OuO2);
                return textView;
        }
        return A0d.requireViewById(i);
    }
}
