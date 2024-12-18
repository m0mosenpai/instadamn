package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57542PgG extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57542PgG(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57542PgG(obj, i));
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57542PgG(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C109054vU c109054vU;
        InterfaceC108984vN interfaceC108984vN;
        ViewStub A07;
        View A0E;
        int i;
        switch (this.A00) {
            case 0:
                return new NBO(((OBH) this.A01).A01);
            case 1:
                A0E = AbstractC166987dD.A0d(((N7s) this.A01).A02);
                if (A0E != null) {
                    i = R.id.iglive_invite_inline_search_box;
                    break;
                } else {
                    return null;
                }
            case 2:
            case 9:
            case Process.SIGTERM /* 15 */:
            case 18:
            case 22:
            case 27:
            case 33:
            case 36:
            case 40:
            case 45:
                return this.A01;
            case 3:
            case 10:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 28:
            case 34:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
            case 11:
            case 17:
            case 20:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                return new NBQ(AbstractC166987dD.A0r(((C52825NZi) this.A01).A02));
            case 6:
                A0E = AbstractC166987dD.A0d(((OUY) this.A01).A07);
                i = R.id.iglive_action_button_text;
                break;
            case 7:
                A0E = AbstractC166987dD.A0d(((OUY) this.A01).A07);
                i = R.id.iglive_arrow_to_feature_image_view;
                break;
            case 8:
                A0E = AbstractC166987dD.A0d(((OUY) this.A01).A07);
                i = R.id.iglive_step_description_text_view;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0E = AbstractC166987dD.A0d(((OUY) this.A01).A07);
                i = R.id.iglive_step_number_text_view;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC166987dD.A0d(((OUY) this.A01).A07).findViewById(R.id.iglive_three_text_pieces);
            case 14:
                return AbstractC50523MSb.A07(((OUY) this.A01).A01, R.id.iglive_nux_tutroial_screen_stub);
            case 21:
                return new NBR(AbstractC166987dD.A0r(((C52824NZh) this.A01).A02));
            case 25:
                return C3PW.A00((View) this.A01, R.id.iglive_capture_hint_text_stub);
            case 26:
                return new NBP((UserSession) this.A01);
            case 30:
                return new NBQ(AbstractC166987dD.A0r(((C52183N7u) this.A01).A01));
            case 31:
                View view = ((Fragment) this.A01).mView;
                if (view == null || (A07 = AbstractC31171DnF.A07(view, R.id.recycler_null_state_view_stub)) == null || (A0E = AbstractC31173DnH.A0E(A07, R.layout.iglive_cohost_request_empty)) == null) {
                    return null;
                }
                i = R.id.live_cohost_request_empty;
                break;
                break;
            case 32:
                return new NBR(AbstractC166987dD.A0r(((N7t) this.A01).A03));
            case 39:
                return new NBS((UserSession) this.A01);
            case 43:
                return new NBT((UserSession) this.A01);
            case 44:
                C54730OFh c54730OFh = (C54730OFh) this.A01;
                return AbstractC174697q4.A00(c54730OFh.A03.requireContext(), c54730OFh.A04, AbstractC43591JPw.A00(1144));
            case 48:
                C54730OFh c54730OFh2 = (C54730OFh) this.A01;
                UserSession userSession = c54730OFh2.A04;
                AbstractC59962oe abstractC59962oe = c54730OFh2.A03;
                Context context = c54730OFh2.A01;
                C105824pt c105824pt = c54730OFh2.A05.A0c;
                boolean z = true;
                if (c105824pt == null || (c109054vU = c105824pt.A02) == null || (interfaceC108984vN = c109054vU.A0A) == null || !interfaceC108984vN.CX2()) {
                    z = false;
                }
                return new NDI(context, abstractC59962oe, userSession, z);
            case 49:
                View findViewById = ((C56180Own) this.A01).A01.requireView().findViewById(R.id.avatar_likes_container);
                if (findViewById != null) {
                    return AbstractC125325le.A00(findViewById);
                }
                return null;
        }
        return A0E.findViewById(i);
    }
}
