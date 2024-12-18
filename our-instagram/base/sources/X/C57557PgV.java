package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PgV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57557PgV extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57557PgV(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(C57557PgV c57557PgV) {
        return ((OFT) c57557PgV.A01).A00.getView();
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C57557PgV(obj, i));
    }

    public static C17050sx A02(Object obj, int i) {
        return AbstractC09440dt.A01(new C57557PgV(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        ViewStub viewStub;
        switch (this.A00) {
            case 0:
                return ((View) this.A01).findViewById(R.id.iglive_archive_seek_forward_button);
            case 1:
                return ((View) this.A01).findViewById(R.id.archive_share_button);
            case 2:
                return ((View) this.A01).findViewById(R.id.reel_viewer_subtitle);
            case 3:
                return AbstractC166997dE.A0X((View) this.A01, R.id.reel_viewer_tall_android_top_bar_stub);
            case 4:
                return ((View) this.A01).findViewById(R.id.reel_viewer_text_container);
            case 5:
                return ((View) this.A01).findViewById(R.id.reel_viewer_title);
            case 6:
                return ((View) this.A01).findViewById(R.id.reel_viewer_top_shadow);
            case 7:
                return ((View) this.A01).findViewById(R.id.video_loading_spinner);
            case 8:
                View findViewById = ((View) this.A01).findViewById(R.id.reel_viewer_zero_rating_data_banner_stub);
                if (findViewById instanceof ViewStub) {
                    viewStub = (ViewStub) findViewById;
                } else {
                    viewStub = null;
                }
                return new C57012jc(viewStub);
            case 9:
                return ((C50549MTg) this.A01).A01.findViewById(R.id.go_live_button);
            case 10:
                return ((C50549MTg) this.A01).A01.findViewById(R.id.loading_spinner);
            case 11:
                return C3PW.A00(((C50549MTg) this.A01).A01, R.id.message_banner_stub);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((C50549MTg) this.A01).A01.findViewById(R.id.message_body);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((C50549MTg) this.A01).A01.findViewById(R.id.message_title);
            case 14:
                return ((C50549MTg) this.A01).A01.findViewById(R.id.ssi_resource_button);
            case Process.SIGTERM /* 15 */:
                return new O4H((ViewStub) AbstractC166987dD.A0c(((C50549MTg) this.A01).A01, R.id.iglive_viewer_end_stub));
            case 16:
                return new C56131Ovr((UserSession) this.A01);
            case 17:
            case Process.SIGSTOP /* 19 */:
                return Integer.valueOf(AbstractC37301Gc2.A0i(((C41551w4) this.A01).A0H).hashCode());
            case 18:
            case 20:
            default:
                return this.A01;
            case 21:
                return Integer.valueOf(((C146226iL) this.A01).A0C.A00());
            case 22:
                RecyclerView A0G = AbstractC31172DnG.A0G(((InterfaceC56392iX) this.A01).getView(), R.id.roll_call_interstitial_grid);
                Context A0L = AbstractC166997dE.A0L(A0G);
                A0G.A10(new C195638l4(false, 0, AbstractC13690mv.A01(A0L, 6), AbstractC13690mv.A01(A0L, 6), 0));
                return A0G;
            case 23:
                view = (View) this.A01;
                i = R.id.item_avatar;
                break;
            case 24:
                IgImageView A0Z = AbstractC31172DnG.A0Z((View) this.A01, R.id.item_background);
                A0Z.A0I = C56173Owg.A00;
                return A0Z;
            case 25:
                view = (View) this.A01;
                i = R.id.item_subtitle;
                break;
            case 26:
                view = (View) this.A01;
                i = R.id.item_title;
                break;
            case 27:
                view = (View) this.A01;
                i = R.id.self_avatar;
                break;
            case 28:
                InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) this.A01;
                List<ViewGroup> A1R = AbstractC16960so.A1R((ViewGroup) interfaceC56392iX.getView().requireViewById(R.id.roll_call_interstitial_container_0), (ViewGroup) interfaceC56392iX.getView().requireViewById(R.id.roll_call_interstitial_container_1), (ViewGroup) interfaceC56392iX.getView().requireViewById(R.id.roll_call_interstitial_container_2));
                ArrayList A0q = AbstractC167017dG.A0q(A1R);
                for (ViewGroup viewGroup : A1R) {
                    LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    A0q.add(new C51333Mlu(viewGroup, AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.layout_roll_call_interstitial_item, true)));
                }
                return A0q;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC166997dE.A0S(((InterfaceC56392iX) this.A01).getView(), R.id.roll_call_interstitial_add_item);
            case 30:
                view = A00(this);
                i = R.id.avatar_image_view;
                break;
            case 31:
                view = A00(this);
                i = R.id.roll_call_cta;
                break;
            case 32:
                return new O4J((ViewGroup) AbstractC31179DnN.A0M(A00(this), R.id.roll_call_interstitial_empty_stub).getView());
            case 33:
                return new O4I(AbstractC31179DnN.A0M(A00(this), R.id.roll_call_interstitial_grid_stub));
            case 34:
                return new NSI(AbstractC31179DnN.A0M(A00(this), R.id.roll_call_interstitial_stack_stub));
            case 35:
                view = A00(this);
                i = R.id.roll_call_interstitial_nux_body;
                break;
            case 36:
                view = A00(this);
                i = R.id.roll_call_interstitial_nux_title;
                break;
            case 37:
                view = A00(this);
                i = R.id.roll_call_timer;
                break;
            case 38:
                view = A00(this);
                i = R.id.roll_call_interstitial_timestamp;
                break;
            case 39:
                view = A00(this);
                i = R.id.roll_call_interstitial_title;
                break;
            case 40:
                view = ((C54607OAi) this.A01).A00.getView();
                i = R.id.survey_invitation_cta;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC166997dE.A0S(((C54607OAi) this.A01).A00.getView(), R.id.survey_invitation_container);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Integer.valueOf(AbstractC25225BEi.A07(C06090Tz.A05, ((C141636ag) this.A01).A02, 36597858713734186L));
            case 43:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C141636ag) this.A01).A02, 36597858713537577L);
            case 44:
                return Double.valueOf(C18U.A00(C06090Tz.A05, ((C141636ag) this.A01).A02, 37160808667021464L));
            case 45:
                int A00 = AbstractC13890nF.A00((Context) this.A01);
                int i3 = AbstractC75953b0.A00;
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                int A01 = AbstractC13890nF.A01((Context) this.A01);
                int i4 = AbstractC75953b0.A00;
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            case 47:
                view = ((C27938CSx) this.A01).A00;
                i = R.id.reel_viewer_superlative_post_container;
                break;
            case 48:
                view = ((C27938CSx) this.A01).A00;
                i = R.id.reel_viewer_superlative_post_header_profile_pic;
                break;
            case 49:
                view = ((C27938CSx) this.A01).A00;
                i = R.id.reel_viewer_superlative_post_header_text;
                break;
        }
        return AbstractC166997dE.A0S(view, i);
    }
}
