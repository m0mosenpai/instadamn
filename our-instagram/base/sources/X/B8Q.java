package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import go.Seq;

/* loaded from: classes4.dex */
public final class B8Q extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8Q(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new B8Q(obj, i));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new B8Q(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        View view2;
        int i2;
        String str;
        PromptStickerModel promptStickerModel;
        View view3;
        int i3;
        Bitmap bitmap;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 180.0f);
                Object obj = this.A01;
                ofFloat.setDuration(400L);
                ofFloat.setRepeatCount(0);
                ANV.A00(ofFloat, obj, 4);
                return ofFloat;
            case 1:
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play((Animator) AbstractC166987dD.A17(((C9R5) this.A01).A07));
                return animatorSet;
            case 2:
                view = ((ViewStub) AbstractC166987dD.A17(((C9R5) this.A01).A0A)).inflate();
                i = R.id.roll_call_dummy_camera_view;
                return view.requireViewById(i);
            case 3:
                view = (View) this.A01;
                i = R.id.roll_call_dummy_camera_view_stub;
                return view.requireViewById(i);
            case 4:
                C9R2 c9r2 = (C9R2) this.A01;
                if (c9r2.A0B.CRB(EnumC1810181d.A18)) {
                    c9r2.A00 = false;
                    c9r2.A0C.run();
                }
                return C0eB.A00;
            case 5:
                interfaceC09390do = ((C9R2) this.A01).A0E;
                View A0V = AbstractC167017dG.A0V(interfaceC09390do);
                C14360o3.A0C(A0V, AbstractC111324zv.A00(21));
                return A0V;
            case 6:
                view3 = (View) this.A01;
                i3 = R.id.roll_call_full_screen_background_stub;
                return AbstractC166997dE.A0X(view3, i3);
            case 7:
                interfaceC09390do = ((C9R2) this.A01).A0G;
                View A0V2 = AbstractC167017dG.A0V(interfaceC09390do);
                C14360o3.A0C(A0V2, AbstractC111324zv.A00(21));
                return A0V2;
            case 8:
                view3 = (View) this.A01;
                i3 = R.id.roll_call_gradient_background_stub;
                return AbstractC166997dE.A0X(view3, i3);
            case 9:
                C9R2 c9r22 = (C9R2) this.A01;
                if (c9r22.A0B.CRB(EnumC1810181d.A18)) {
                    C9R3 c9r3 = c9r22.A09;
                    View A0L = AbstractC167007dF.A0L(c9r3.A03);
                    A0L.setVisibility(0);
                    InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c9r3.A01).A0K;
                    A0L.setLayoutParams(new FrameLayout.LayoutParams(interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight()));
                    InterfaceC09390do interfaceC09390do2 = c9r3.A02;
                    C185458Kn c185458Kn = (C185458Kn) interfaceC09390do2.getValue();
                    c185458Kn.A02.removeCallbacksAndMessages(null);
                    c185458Kn.A01 = 4;
                    ((C185458Kn) interfaceC09390do2.getValue()).A02.sendMessage(Message.obtain());
                }
                return C0eB.A00;
            case 10:
                C9R2 c9r23 = (C9R2) this.A01;
                C9R5 c9r5 = c9r23.A08;
                C174757qB c174757qB = c9r5.A06;
                C174747qA c174747qA = c174757qB.A0H;
                if (c174747qA.A00 != null) {
                    c9r5.A01 = true;
                    int i4 = c9r5.A03;
                    c174757qB.A0K(new C212659bY(c9r5, 11), i4, i4);
                } else {
                    View view4 = c9r5.A05;
                    int measuredWidth = view4.getMeasuredWidth();
                    int measuredHeight = view4.getMeasuredHeight();
                    TextureView textureView = c174747qA.A01;
                    if (textureView != null) {
                        bitmap = textureView.getBitmap(measuredWidth, measuredHeight);
                    } else {
                        bitmap = null;
                    }
                    c9r5.A02 = AbstractC167007dF.A1W(bitmap);
                    if (bitmap != null) {
                        C9R5.A00(bitmap, c9r5);
                    }
                    ((IgImageView) AbstractC166987dD.A17(c9r5.A09)).setVisibility(8);
                }
                c9r23.A06.A0H.A00().setVisibility(4);
                c9r5.A01(new B8Q(c9r23, 9));
                return C0eB.A00;
            case 11:
            case 17:
                return ((ComponentActivity) this.A01).getViewModelStore();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                view2 = (View) this.A01;
                i2 = R.id.roll_call_timer;
                return AbstractC166997dE.A0S(view2, i2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                final UserSession userSession = ((C9R2) this.A01).A07;
                return new AbstractC61132qb(userSession) { // from class: X.9R6
                    public final UserSession A00;

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C208779Ll(AbstractC70833Fv.A00(this.A00));
                    }

                    {
                        this.A00 = userSession;
                    }
                };
            case 14:
                C9R3 c9r32 = (C9R3) this.A01;
                return new C185458Kn(new B43(c9r32), new B44(c9r32), 4, 750);
            case Process.SIGTERM /* 15 */:
                return AbstractC167017dG.A0U((View) this.A01, R.id.roll_call_countdown_overlay_stub);
            case 16:
                view = AbstractC167007dF.A0L(((C9R3) this.A01).A03);
                i = R.id.roll_call_countdown_text;
                return view.requireViewById(i);
            case 18:
                final UserSession userSession2 = ((C9R4) this.A01).A04;
                return new AbstractC61132qb(userSession2) { // from class: X.9R6
                    public final UserSession A00;

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C208779Ll(AbstractC70833Fv.A00(this.A00));
                    }

                    {
                        this.A00 = userSession2;
                    }
                };
            case Process.SIGSTOP /* 19 */:
                AAI aai = (AAI) this.A01;
                View requireViewById = AbstractC167017dG.A0V(aai.A05).requireViewById(R.id.secret_sticker_preview_background);
                C14360o3.A0A(requireViewById);
                InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) aai.A02).A0K;
                AbstractC13880nE.A0h(requireViewById, interfaceC1812882f2.getWidth(), interfaceC1812882f2.getHeight());
                AbstractC185998Mt.A00(requireViewById);
                return requireViewById;
            case 20:
                return AbstractC166997dE.A0S(AbstractC167017dG.A0V(((AAI) this.A01).A05), R.id.secret_sticker_preview_info_text);
            case 21:
                view3 = (View) this.A01;
                i3 = R.id.secret_sticker_preview_overlay_stub;
                return AbstractC166997dE.A0X(view3, i3);
            case 22:
                view = AbstractC167017dG.A0V(((AAI) this.A01).A05);
                i = R.id.secret_sticker_view;
                return view.requireViewById(i);
            case 23:
                return new C23596Acq(this.A01, 3);
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 25:
                C218939m3 c218939m3 = (C218939m3) this.A01;
                AbstractC130945vi abstractC130945vi = c218939m3.A00;
                if (abstractC130945vi != null) {
                    int intrinsicWidth = abstractC130945vi.getIntrinsicWidth();
                    AbstractC130945vi abstractC130945vi2 = c218939m3.A00;
                    if (abstractC130945vi2 != null) {
                        abstractC130945vi.setBounds(0, 0, intrinsicWidth, abstractC130945vi2.getIntrinsicHeight());
                        c218939m3.A05();
                        return C0eB.A00;
                    }
                }
                C14360o3.A0F("profileStickerDrawable");
                throw C00O.createAndThrow();
            case 26:
                C8NW c8nw = (C8NW) this.A01;
                AbstractC167007dF.A0x(((C56181Owo) c8nw.A1Q.get()).A00);
                C220999pN c220999pN = c8nw.A0A;
                if (c220999pN != null && (promptStickerModel = c220999pN.A04) != null) {
                    str = promptStickerModel.A00.getText();
                } else {
                    str = null;
                }
                c8nw.A1O(str);
                c8nw.A1A.E4u(new Object());
                return C0eB.A00;
            case 27:
                C183688Ct c183688Ct = ((C8NW) this.A01).A0y;
                UserSession userSession3 = c183688Ct.A0w;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession3);
                InterfaceC16530ry interfaceC16530ry = A00.A3h;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 78)) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession3);
                    AbstractC167007dF.A1L(A002, A002.A3h, c0yrArr, 78, true);
                    C193328hC c193328hC = new C193328hC(c183688Ct.A0o);
                    c193328hC.A0A(2131964310);
                    c193328hC.A09(2131964309);
                    c193328hC.A0T(new AOD(c183688Ct, 0), EnumC193348hE.A06, 2131956794, 2131960946);
                    c193328hC.A0B(2131954754, 2131954754);
                    c193328hC.A0s(true);
                    c193328hC.A0t(true);
                    AbstractC166987dD.A1W(c193328hC);
                } else {
                    C183688Ct.A06(c183688Ct);
                }
                return C0eB.A00;
            case 28:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
                return this.A01;
            case 30:
            case 40:
            case 43:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 31:
                return new C183818Dh((UserSession) this.A01);
            case 32:
                C24151Ana c24151Ana = (C24151Ana) this.A01;
                InterfaceC56392iX A0X = AbstractC166997dE.A0X(c24151Ana.A04, R.id.stories_template_dice_icon_stub);
                A0X.EZv(new C23713Aem(c24151Ana, 3));
                return A0X;
            case 33:
                view2 = ((C24151Ana) this.A01).A04;
                i2 = R.id.stories_template_header;
                return AbstractC166997dE.A0S(view2, i2);
            case 34:
                view = ((C24151Ana) this.A01).A04;
                i = R.id.stories_template_sticker_info_text;
                return view.requireViewById(i);
            case 35:
                view = ((C24151Ana) this.A01).A0C.getView();
                i = R.id.stories_template_music_only_button_drawable;
                return view.requireViewById(i);
            case 36:
                view = ((C24151Ana) this.A01).A0C.getView();
                i = R.id.stories_template_music_only_button_tappable;
                return view.requireViewById(i);
            case 37:
                C24151Ana c24151Ana2 = (C24151Ana) this.A01;
                InterfaceC56392iX A0X2 = AbstractC166997dE.A0X(c24151Ana2.A04, R.id.pinnables_footer_stub);
                A0X2.EZv(new C23713Aem(c24151Ana2, 4));
                return A0X2;
            case 47:
                C24151Ana c24151Ana3 = (C24151Ana) this.A01;
                UserSession userSession4 = c24151Ana3.A0B;
                return new C8OC(userSession4, C18U.A06(C06090Tz.A05, userSession4, 36319909903605584L), AbstractC13890nF.A01(AbstractC166997dE.A0L(c24151Ana3.A0H)));
            case 48:
                return new C183818Dh(((C24151Ana) this.A01).A0B);
            case 49:
                C24151Ana c24151Ana4 = (C24151Ana) this.A01;
                final UserSession userSession5 = c24151Ana4.A0B;
                final C183828Di c183828Di = (C183828Di) c24151Ana4.A0P.getValue();
                return new AbstractC61132qb(userSession5, c183828Di) { // from class: X.9gm
                    public final UserSession A00;
                    public final C183828Di A01;

                    {
                        C14360o3.A0B(c183828Di, 2);
                        this.A00 = userSession5;
                        this.A01 = c183828Di;
                    }

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C9U3(this.A00, this.A01);
                    }
                };
        }
    }
}
