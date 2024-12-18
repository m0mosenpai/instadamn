package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;
import go.Seq;

/* renamed from: X.9E4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E4 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E4(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [X.6cX, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View A0O;
        int i;
        switch (this.A00) {
            case 0:
                C194598jK c194598jK = (C194598jK) this.A01;
                return new C180657zt(c194598jK.A01, c194598jK.A03);
            case 1:
                C55982hj A02 = AbstractC13560mi.A00().A02();
                A02.A0A((C188918Yh) this.A01);
                return A02;
            case 2:
                C8YY c8yy = (C8YY) this.A01;
                return new C193808i1(c8yy.A08, c8yy.A0E, c8yy, c8yy.A0F.A08().A02);
            case 3:
                ((C8YY) this.A01).A0L(true);
                return C0eB.A00;
            case 4:
                C193838i4 c193838i4 = ((C8YY) this.A01).A02;
                if (c193838i4 != null) {
                    return c193838i4.A1K.getValue();
                }
                return null;
            case 5:
                C8YY c8yy2 = (C8YY) this.A01;
                return new C23885Ahe(c8yy2.A0B, c8yy2.A0E, new C23886Ahf(c8yy2, 0), new C23976AkB(c8yy2));
            case 6:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 7:
                C8YY c8yy3 = (C8YY) this.A01;
                return new C193678hn(c8yy3.A0B.requireContext(), c8yy3.A0E);
            case 8:
                C8YY c8yy4 = (C8YY) this.A01;
                UserSession userSession = c8yy4.A0E;
                AbstractC59962oe abstractC59962oe = c8yy4.A0B;
                C23977AkC c23977AkC = new C23977AkC(c8yy4);
                C8JU c8ju = c8yy4.A0Z;
                C14360o3.A0C(c8ju, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.music.ClipsTrackSelector.Delegate");
                return new C56304OzP(abstractC59962oe, c8yy4.A0D, userSession, (C8BK) c8ju, c8yy4.A0a, c23977AkC);
            case 9:
            case 10:
                return ((C8CV) this.A01).A00();
            case 11:
                C183988Ef c183988Ef = (C183988Ef) this.A01;
                View requireViewById = c183988Ef.A02.requireViewById(R.id.gltf_scene_layout_stub);
                C14360o3.A07(requireViewById);
                View inflate = ((ViewStub) requireViewById).inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.xme.threed.view.IgGltfSceneLayoutView");
                IgGltfSceneLayoutView igGltfSceneLayoutView = (IgGltfSceneLayoutView) inflate;
                igGltfSceneLayoutView.setCornerRadius(c183988Ef.A01.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
                return igGltfSceneLayoutView;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
            case 24:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            default:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC83713oG interfaceC83713oG = ((DirectShareTarget) this.A01).A09;
                interfaceC83713oG.getClass();
                return interfaceC83713oG;
            case 14:
                return ((DirectShareTarget) this.A01).A02();
            case Process.SIGTERM /* 15 */:
                C211689Zc c211689Zc = (C211689Zc) this.A01;
                boolean z = true;
                if (c211689Zc == null || !c211689Zc.A07) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                ((C8MR) this.A01).A00();
                return C0eB.A00;
            case 17:
                C184048Et c184048Et = (C184048Et) this.A01;
                InterfaceC09390do interfaceC09390do = c184048Et.A0C;
                Object value = interfaceC09390do.getValue();
                C14360o3.A07(value);
                ClipsTrimFilmstrip clipsTrimFilmstrip = (ClipsTrimFilmstrip) ((View) value).requireViewById(R.id.post_capture_video_trim_filmstrip);
                FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
                filmstripTimelineView.setAllowSeekbarTouch(false);
                filmstripTimelineView.setTrimmerMinimumRange(0.016666668f);
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                AbstractC13880nE.A0n(clipsTrimFilmstrip, (View) value2);
                clipsTrimFilmstrip.A02 = c184048Et.A09;
                return clipsTrimFilmstrip;
            case 18:
                return ((ViewStub) this.A01).inflate();
            case 20:
                IgProgressBar igProgressBar = new IgProgressBar(((C146176iG) this.A01).A05, null, android.R.attr.progressBarStyleLarge);
                igProgressBar.setIndeterminate(true);
                igProgressBar.setIndeterminateDrawable(igProgressBar.getContext().getDrawable(R.drawable.video_indeterminate_progress));
                return igProgressBar;
            case 21:
                C146176iG c146176iG = (C146176iG) this.A01;
                C6WQ c6wq = new C6WQ(c146176iG.A05, true);
                c6wq.setContentView((View) c146176iG.A08.getValue());
                return c6wq;
            case 22:
                return ((C189448aO) ((C8EO) this.A01).A03.getValue()).A00();
            case 23:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case 25:
                Object value3 = ((C172437mC) this.A01).A0U.getValue();
                C14360o3.A07(value3);
                return ((View) value3).requireViewById(R.id.story_caption_legibility_background);
            case 26:
                Object value4 = ((C172437mC) this.A01).A0U.getValue();
                C14360o3.A07(value4);
                return ((View) value4).requireViewById(R.id.post_capture_caption_entry_point_text);
            case 27:
                C172437mC c172437mC = (C172437mC) this.A01;
                CreationActionBar creationActionBar = c172437mC.A0G;
                Context context = creationActionBar.getContext();
                C14360o3.A07(context);
                EphemeralMediaToggleView ephemeralMediaToggleView = new EphemeralMediaToggleView(context, null, 0);
                ephemeralMediaToggleView.setLayoutParams(new C56302iJ(-2, -2));
                ephemeralMediaToggleView.setId(View.generateViewId());
                creationActionBar.A00 = ephemeralMediaToggleView;
                creationActionBar.addView(ephemeralMediaToggleView);
                creationActionBar.A0F(null);
                Context context2 = c172437mC.A09;
                UserSession userSession2 = c172437mC.A0C;
                C9BW c9bw = c172437mC.A0A;
                ImmutableList copyOf = ImmutableList.copyOf((Object[]) c9bw.A00);
                C14360o3.A07(copyOf);
                c172437mC.A01 = new C199028r5(context2, copyOf, userSession2, (C8DO) c9bw.A01, ephemeralMediaToggleView);
                return ephemeralMediaToggleView;
            case 28:
                return ((View) ((C172437mC) this.A01).A0W.getValue()).requireViewById(R.id.post_capture_media_overlay_footer_button_container);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C8Q6) ((C172437mC) this.A01).A0V.getValue()).A0O();
            case 30:
                C172437mC c172437mC2 = (C172437mC) this.A01;
                Object value5 = c172437mC2.A0U.getValue();
                C14360o3.A07(value5);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) ((View) value5).requireViewById(R.id.post_capture_secret_sticker_preview_button);
                String string = igdsMediaButton.getContext().getString(2131973090);
                C14360o3.A07(string);
                igdsMediaButton.setButtonStyle(EnumC151036r4.A03);
                igdsMediaButton.setSize(EnumC151046r5.A04);
                ?? obj = new Object();
                obj.A00 = R.drawable.instagram_eye_outline_18;
                igdsMediaButton.setStartAddOn(obj, string);
                igdsMediaButton.setLabel(string);
                C0fQ.A00(new ViewOnClickListenerC23249ASk(c172437mC2, 32), igdsMediaButton);
                return igdsMediaButton;
            case 31:
                View requireViewById2 = ((View) ((C172437mC) this.A01).A0W.getValue()).requireViewById(R.id.post_capture_button_share_container);
                C14360o3.A07(requireViewById2);
                return requireViewById2;
            case 32:
                C172437mC c172437mC3 = (C172437mC) this.A01;
                if (C172437mC.A0C(c172437mC3)) {
                    UserSession userSession3 = c172437mC3.A0C;
                    if (!C18U.A06(C06090Tz.A06, userSession3, 36320279269548268L)) {
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession3);
                        if (((Boolean) A00.A3Z.CES(A00, C23031Ai.A8c[173])).booleanValue()) {
                            AnonymousClass856 anonymousClass856 = c172437mC3.A0N;
                            if (!anonymousClass856.A00().A01) {
                                anonymousClass856.A00().A01(c172437mC3.A0G, c172437mC3.A0P, EnumC199188rL.A0P);
                            }
                        }
                    }
                }
                return C0eB.A00;
            case 33:
                A0O = ((C8Q6) this.A01).A0O();
                i = R.id.ai_contextual_background_button;
                View requireViewById3 = A0O.requireViewById(i);
                C14360o3.A07(requireViewById3);
                return requireViewById3;
            case 34:
                A0O = ((C8Q6) this.A01).A0O();
                i = R.id.magic_mod_backdrop_button;
                View requireViewById32 = A0O.requireViewById(i);
                C14360o3.A07(requireViewById32);
                return requireViewById32;
            case 35:
                A0O = ((C8Q6) this.A01).A0O();
                i = R.id.magic_mod_button;
                View requireViewById322 = A0O.requireViewById(i);
                C14360o3.A07(requireViewById322);
                return requireViewById322;
            case 36:
                C8Q6 c8q6 = (C8Q6) this.A01;
                return new C8QJ(c8q6.A0G, c8q6.A0f, Integer.valueOf(R.drawable.overflow_popup_menu_background_updated_blur), true);
            case 37:
                A0O = ((C8Q6) this.A01).A0O();
                i = R.id.magic_mod_restyle_button;
                View requireViewById3222 = A0O.requireViewById(i);
                C14360o3.A07(requireViewById3222);
                return requireViewById3222;
            case 38:
                return new AB4(((C8Q6) this.A01).A0f);
            case 39:
                return new C199248rR((TargetViewSizeProvider) this.A01);
            case 40:
                return Boolean.valueOf(AbstractC185298Jv.A01(((C8Q6) this.A01).A0f));
            case Seq.NULL_REFNUM /* 41 */:
                AnimatorSet animatorSet = new AnimatorSet();
                C8EL c8el = (C8EL) this.A01;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setDuration(350L);
                ofFloat.setRepeatCount(0);
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = c8el.A00;
                ofFloat.addUpdateListener(animatorUpdateListener);
                ofFloat.setInterpolator(new LinearInterpolator());
                AnimatorSet.Builder after = animatorSet.play(ofFloat).after(4000L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setDuration(350L);
                ofFloat2.setRepeatCount(0);
                ofFloat2.addUpdateListener(animatorUpdateListener);
                ofFloat2.setInterpolator(new LinearInterpolator());
                after.after(ofFloat2);
                return animatorSet;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C8EL c8el2 = (C8EL) this.A01;
                ComponentActivity componentActivity = c8el2.A02;
                UserSession userSession4 = c8el2.A03;
                View inflate2 = c8el2.A01.inflate();
                C14360o3.A0C(inflate2, AbstractC43591JPw.A00(3));
                return new C9R4(componentActivity, userSession4, (IgTextView) inflate2);
            case 43:
                C8AC c8ac = (C8AC) this.A01;
                C8B7 c8b7 = c8ac.A03;
                if (c8b7 == null) {
                    return null;
                }
                return AbstractC18560vj.A03(C07Y.A00(c8ac.A02.getViewLifecycleOwner()), new C15340po(new PYX(c8ac, null, 14), c8b7.A07));
            case 48:
                return this.A01;
        }
    }
}
