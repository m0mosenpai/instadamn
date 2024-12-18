package X;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9E7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E7 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E7(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [X.3Fx] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        switch (this.A00) {
            case 0:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_go_to_world_container);
            case 1:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_go_to_world_icon);
            case 2:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_presense_subtitle_container);
            case 3:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_presense_count);
            case 4:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_go_to_world_sticker_container);
            case 5:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_go_to_world_sticker_icon);
            case 6:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_go_to_world_sticker_text);
            case 7:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_world_name);
            case 8:
                return Integer.valueOf(((C144226f4) this.A01).A0H.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
            case 9:
                return Integer.valueOf(((C144226f4) this.A01).A0H.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
            case 10:
                return Integer.valueOf(((C144226f4) this.A01).A0H.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            case 11:
                return Integer.valueOf(((C144226f4) this.A01).A0H.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return Integer.valueOf(AbstractC13890nF.A01(((C144226f4) this.A01).A0H));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C61252qn((UserSession) this.A01);
            case 14:
                UserSession userSession = (UserSession) this.A01;
                return new C48862Me(userSession, userSession.userId);
            case Process.SIGTERM /* 15 */:
                C82113lX c82113lX = C82103lW.A02;
                UserSession userSession2 = (UserSession) this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                return new C82103lW(userSession2, (int) C18U.A01(c06090Tz, userSession2, 36592099160031511L), (int) C18U.A01(c06090Tz, userSession2, 36592099159769365L), C18U.A01(c06090Tz, userSession2, 36592099160097048L));
            case 16:
                return new C82013lN((UserSession) this.A01);
            case 17:
                return new C3G7((UserSession) this.A01);
            case 18:
                View inflate = ((C144386fK) this.A01).A03.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                return inflate;
            case Process.SIGSTOP /* 19 */:
                View inflate2 = ((C144406fM) this.A01).A02.inflate();
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
                return inflate2;
            case 20:
                Paint paint = new Paint();
                paint.setColor(((C8P7) this.A01).A08.getColor(R.color.grey_2));
                paint.setStrokeWidth(2.0f);
                return paint;
            case 21:
                return new C25371Lr((UserSession) this.A01);
            case 22:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C25371Lr) this.A01).A00, 36320296451055952L));
            case 23:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C25371Lr) this.A01).A00, 36311474591040025L));
            case 24:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C25371Lr) this.A01).A00, 36311474591367706L));
            case 25:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C25371Lr) this.A01).A00, 36321988666468276L));
            case 26:
                final UserSession userSession3 = (UserSession) this.A01;
                return new C70843Fw(C1AT.A01(userSession3).A04(C1AV.A2o, C70843Fw.class), new Object(userSession3) { // from class: X.3Fx
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession3, 1);
                        this.A00 = userSession3;
                    }
                }, C08730cb.A00(userSession3), C70863Fy.A00);
            case 27:
                return new C41121vL((UserSession) this.A01);
            case 28:
                return new C6Z4((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C108324uJ((UserSession) this.A01);
            case 30:
                return new C25871Nu((UserSession) this.A01);
            case 31:
                return AbstractC23021Ah.A00(((C149186nS) this.A01).A04);
            case 32:
                return AbstractC23021Ah.A00(((C149196nT) this.A01).A04);
            case 33:
                return C1AT.A01((UserSession) this.A01).A03(C1AV.A35);
            case 34:
                return AbstractC73123Pn.A00((UserSession) this.A01, InterfaceC73103Pl.A00, true);
            case 35:
                ViewStub viewStub = ((C6b8) this.A01).A00;
                if (viewStub != null) {
                    view = viewStub.inflate();
                } else {
                    view = null;
                }
                if (!(view instanceof ViewGroup)) {
                    return null;
                }
                return view;
            case 36:
                View view2 = (View) ((C6b8) this.A01).A06.getValue();
                if (view2 != null) {
                    return view2.requireViewById(R.id.reel_item_like_animation_view);
                }
                return null;
            case 37:
                AnonymousClass693 A00 = C68U.A00(((C6b8) this.A01).A04.getContext(), R.raw.story_likes_crowd_noise);
                if (A00 != null) {
                    return A00;
                }
                throw new IllegalStateException("Required value was null.");
            case 38:
                return C3PW.A00((View) ((C72993Pa) this.A01).A04.getValue(), R.id.live_avatar_four_stub);
            case 39:
                return C3PW.A00((View) ((C72993Pa) this.A01).A04.getValue(), R.id.live_avatar_one_stub);
            case 40:
                return C3PW.A00((View) ((C72993Pa) this.A01).A04.getValue(), R.id.live_avatar_three_stub);
            case Seq.NULL_REFNUM /* 41 */:
                return C3PW.A00((View) ((C72993Pa) this.A01).A04.getValue(), R.id.live_avatar_two_stub);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((C3PX) ((C72993Pa) this.A01).A05.getValue()).A00();
            case 43:
                return C3PW.A00((View) this.A01, R.id.live_avatar_stub);
            case 44:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.06f);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(300L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.addUpdateListener(new ANV(this.A01, 14));
                return ofFloat;
            case 45:
                return ((View) ((C72993Pa) this.A01).A04.getValue()).findViewById(R.id.live_pulsing_background);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC56372iV.A00(((View) this.A01).requireViewById(R.id.avatar_checkmark_overlay_stub));
            case 47:
                return AbstractC56372iV.A00(((View) this.A01).requireViewById(R.id.branding_badge_stub));
            case 48:
                return new C3PV((View) this.A01);
            default:
                return new C3P2((View) this.A01);
        }
    }
}
