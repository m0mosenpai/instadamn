package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.9EH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EH extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EH(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C6XW c6xw;
        int i;
        int A0C;
        ViewGroup viewGroup;
        View view;
        int i2;
        View A00;
        int i3;
        switch (this.A00) {
            case 0:
                return new C72993Pa((View) this.A01);
            case 1:
                view = (View) this.A01;
                i2 = R.id.memories_badge_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 2:
                view = (View) this.A01;
                i2 = R.id.music_highlight_overlay_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 3:
                view = (View) this.A01;
                i2 = R.id.my_week_disabled_overlay_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 4:
                view = (View) this.A01;
                i2 = R.id.my_week_enabled_overlay_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 5:
                view = (View) this.A01;
                i2 = R.id.own_reel_badge_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 6:
                view = (View) this.A01;
                i2 = R.id.reel_glyph_stub;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 7:
                view = (View) this.A01;
                i2 = R.id.suggested_highlight_add_icon;
                return AbstractC56372iV.A00(view.requireViewById(i2));
            case 8:
                return ((C3PX) ((C3PV) this.A01).A01.getValue()).A00();
            case 9:
                return C3PW.A00((View) this.A01, R.id.campfire_avatar_stub);
            case 10:
                C3t0 c3t0 = (C3t0) this.A01;
                return new C38E(c3t0.A01, c3t0.A02, new C38C(c3t0.A00));
            case 11:
                IgProgressImageView igProgressImageView = (IgProgressImageView) ((C144456fR) this.A01).A00.getView().requireViewById(R.id.blurred_overlay_image_view);
                igProgressImageView.setPostProcessor(C23707Aeg.A00);
                return igProgressImageView;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C3PW.A00(((C138376Ot) this.A01).A0V, R.id.iglive_chain_preview_view_stub).A00();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((C143736eG) this.A01).A00.getView().requireViewById(R.id.reel_item_share_to_friends_story_producer_likes_text);
            case 14:
                return new C6XU(((C143556du) this.A01).A0S);
            case Process.SIGTERM /* 15 */:
                UserSession userSession = ((C146226iL) this.A01).A07;
                C14360o3.A0B(userSession, 0);
                userSession.A01(C142086bR.class, new C9EU(userSession, 19));
                return null;
            case 16:
            case 18:
            default:
                A00 = ((C144446fQ) this.A01).A00.getView();
                i3 = R.id.roll_call_overlay_title;
                View requireViewById = A00.requireViewById(i3);
                C14360o3.A07(requireViewById);
                return requireViewById;
            case 17:
                A00 = ((C144446fQ) this.A01).A00.getView();
                i3 = R.id.roll_call_cta;
                View requireViewById2 = A00.requireViewById(i3);
                C14360o3.A07(requireViewById2);
                return requireViewById2;
            case Process.SIGSTOP /* 19 */:
                A00 = ((C144336fF) this.A01).A00();
                i3 = R.id.emoji_view;
                View requireViewById22 = A00.requireViewById(i3);
                C14360o3.A07(requireViewById22);
                return requireViewById22;
            case 20:
                return ((C144336fF) this.A01).A01.A01();
            case 21:
                A00 = ((C144336fF) this.A01).A00();
                i3 = R.id.sticker_view;
                View requireViewById222 = A00.requireViewById(i3);
                C14360o3.A07(requireViewById222);
                return requireViewById222;
            case 22:
                View view2 = (View) this.A01;
                boolean z = view2 instanceof ViewGroup;
                if (!z) {
                    view2 = null;
                }
                if ((view2 == null || view2.findViewWithTag("e2e__test_last_reel_item") == null) && z && (viewGroup = (ViewGroup) view2) != null) {
                    FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                    frameLayout.setTag("e2e__test_last_reel_item");
                    viewGroup.addView(frameLayout);
                }
                return C0eB.A00;
            case 23:
                return new C138466Pc(((C6TS) this.A01).A07);
            case 24:
                return new C138446Pa(((C6TS) this.A01).A0A);
            case 25:
                return new C65724Tsy(((C6TS) this.A01).A05);
            case 26:
                C138466Pc c138466Pc = (C138466Pc) this.A01;
                C6TY c6ty = c138466Pc.A01;
                if (c6ty.A05.CWW() && c6ty.A06) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    long j = c6ty.A03;
                    ofFloat.setStartDelay(j);
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new ANV(c6ty, 15));
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
                    ofInt.setStartDelay(j);
                    ofInt.setDuration(0L);
                    ofInt.addUpdateListener(new C44249Jgt(8, ofInt, c6ty));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(ofFloat).with(ofInt);
                    animatorSet.addListener(new U5Q(c138466Pc, 23));
                    return animatorSet;
                }
                return null;
            case 27:
                return new C138446Pa(((C6UI) this.A01).A0A);
            case 28:
                ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz = (ViewOnTouchListenerC138696Pz) this.A01;
                return new GestureDetector(viewOnTouchListenerC138696Pz.A06, viewOnTouchListenerC138696Pz.A08);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C22956AAa c22956AAa = ((C6R4) this.A01).A0E;
                String str = c22956AAa.A08;
                if (str == null) {
                    A0C = -1;
                } else {
                    StringBuilder sb = new StringBuilder(str);
                    String str2 = c22956AAa.A09;
                    if (str2 != null && str2.length() != 0) {
                        sb.insert(1, str2);
                    }
                    A0C = AbstractC13950nL.A0C(sb.toString(), -1);
                }
                return Integer.valueOf(A0C);
            case 30:
                return Integer.valueOf(AbstractC13950nL.A0C(((C6R4) this.A01).A0E.A0A, -16777216));
            case 31:
                int[] iArr = new int[2];
                ((C6TT) this.A01).A00().getLocationOnScreen(iArr);
                return iArr;
            case 32:
                int[] iArr2 = new int[2];
                ((C6TT) this.A01).A01().getLocationOnScreen(iArr2);
                return iArr2;
            case 33:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_conclusion_header_text;
                return c6xw.A04().requireViewById(i);
            case 34:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_conclusion_items_container;
                return c6xw.A04().requireViewById(i);
            case 35:
                View requireViewById3 = ((C6XW) this.A01).A07.getView().requireViewById(R.id.superlative_conclusion_share_full_story_button);
                C14360o3.A07(requireViewById3);
                return requireViewById3;
            case 36:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_day_one_body_text;
                return c6xw.A04().requireViewById(i);
            case 37:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_day_one_date_text;
                return c6xw.A04().requireViewById(i);
            case 38:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_day_one_header_text;
                return c6xw.A04().requireViewById(i);
            case 39:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_day_one_mention_sticker;
                return c6xw.A04().requireViewById(i);
            case 40:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_day_one_user_avatar;
                return c6xw.A04().requireViewById(i);
            case Seq.NULL_REFNUM /* 41 */:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_around_you;
                return c6xw.A04().requireViewById(i);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_here_the_people;
                return c6xw.A04().requireViewById(i);
            case 43:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_other_user_1_avatar;
                return c6xw.A04().requireViewById(i);
            case 44:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_other_user_2_avatar;
                return c6xw.A04().requireViewById(i);
            case 45:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_other_user_3_avatar;
                return c6xw.A04().requireViewById(i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_other_user_4_avatar;
                return c6xw.A04().requireViewById(i);
            case 47:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_intro_user_avatar;
                return c6xw.A04().requireViewById(i);
            case 48:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_lots_of_heart_body_text;
                return c6xw.A04().requireViewById(i);
            case 49:
                c6xw = (C6XW) this.A01;
                i = R.id.superlative_lots_of_heart_header_text;
                return c6xw.A04().requireViewById(i);
        }
    }
}
