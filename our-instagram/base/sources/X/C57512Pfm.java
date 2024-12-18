package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.Pfm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57512Pfm extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57512Pfm(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57512Pfm(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                UserSession userSession = ((C55044OZq) this.A01).A00;
                return new C54557O8j(userSession, C47382Fl.A00(userSession));
            case 1:
                return new OCF(((C55044OZq) this.A01).A00);
            case 2:
                return new O5L(((C55044OZq) this.A01).A00);
            case 3:
                return Boolean.valueOf(((C55044OZq) this.A01).A02.A0K.A06);
            case 4:
                return ((C55135Oc3) this.A01).A03;
            case 5:
            case 7:
            default:
                return ((C55135Oc3) this.A01).A02;
            case 6:
                return ((C55135Oc3) this.A01).A04;
            case 8:
                C55044OZq c55044OZq = (C55044OZq) this.A01;
                C52700NTl c52700NTl = c55044OZq.A02.A0M;
                InterfaceC19390xP interfaceC19390xP = c55044OZq.A0G;
                C14360o3.A0B(interfaceC19390xP, 0);
                return C10Q.A03(new C57182PaB(c52700NTl, (InterfaceC23621Ds) null, 37, 42), MV5.A00(c52700NTl, new MZP(interfaceC19390xP, 10), 19), new C16400rl(new PZL(AbstractC166997dE.A0b(), (InterfaceC23621Ds) null, 8), c52700NTl.A02.A06));
            case 9:
                return AbstractC31179DnN.A0M(((NT5) this.A01).A08, R.id.ai_status_stub);
            case 10:
                return ((PC6) this.A01).A01.getView().findViewById(R.id.ai_status_compose_view);
            case 11:
                return new C54458O4m((C52692NTd) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC43594JPz.A0F(((C52692NTd) this.A01).A0A, R.id.ar_effect_picker_background_stub);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return Float.valueOf(((C52692NTd) this.A01).A0A.getResources().getDimension(R.dimen.ar_effect_picker_halo_vertical_offset));
            case 14:
                return new OyF((C52692NTd) this.A01);
            case Process.SIGTERM /* 15 */:
                C52692NTd c52692NTd = (C52692NTd) this.A01;
                Context A0L = AbstractC166997dE.A0L(c52692NTd.A0A);
                UserSession userSession2 = c52692NTd.A0F;
                OHG ohg = c52692NTd.A0I;
                View inflate = ((ViewStub) c52692NTd.A0k.getValue()).inflate();
                C14360o3.A07(inflate);
                C8FP c8fp = (C8FP) c52692NTd.A0U.getValue();
                EnumC53279NhH enumC53279NhH = c52692NTd.A03.A07;
                OI6 oi6 = c52692NTd.A0G;
                OJ1 oj1 = c52692NTd.A0K;
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add(EnumC53279NhH.A04);
                if (C18U.A06(C06090Tz.A05, oj1.A03.A00, 36317092403745575L)) {
                    A1E.add(EnumC53279NhH.A07);
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                A1E2.add(EnumC53279NhH.A02);
                C55210OeT c55210OeT = new C55210OeT(A0L, inflate, userSession2, c8fp, oi6, ohg, enumC53279NhH, A1E, A1E2);
                c55210OeT.A01 = new C54463O4r(c52692NTd);
                return c55210OeT;
            case 16:
                return Float.valueOf(-((C52692NTd) this.A01).A0A.getResources().getDimension(R.dimen.account_group_management_clickable_width));
            case 17:
                C52692NTd c52692NTd2 = (C52692NTd) this.A01;
                C54614OAp c54614OAp = c52692NTd2.A0J;
                InterfaceC11380iw interfaceC11380iw = c52692NTd2.A0C;
                C1810281e c1810281e = (C1810281e) c52692NTd2.A0j.getValue();
                View view = c52692NTd2.A0A;
                OyF oyF = (OyF) c52692NTd2.A0R.getValue();
                C54458O4m c54458O4m = (C54458O4m) c52692NTd2.A0O.getValue();
                AbstractC25233BEq.A0w(1, c1810281e, oyF, c54458O4m);
                OyD oyD = new OyD(c54614OAp);
                C87Q c87q = new C87Q(null, null, 1);
                UserSession userSession3 = c54614OAp.A01;
                C8FL c8fl = new C8FL(userSession3, oyD, c87q);
                OyC oyC = new OyC(view, interfaceC11380iw, userSession3, c8fl, oyF, c54458O4m, c1810281e, "video_call", true, true);
                oyC.ETI(true);
                c8fl.A00 = oyC;
                return oyC;
            case 18:
                C52692NTd c52692NTd3 = (C52692NTd) this.A01;
                C54614OAp c54614OAp2 = c52692NTd3.A0J;
                Context A0L2 = AbstractC166997dE.A0L(c52692NTd3.A0A);
                ComponentCallbacks2 componentCallbacks2 = c52692NTd3.A09;
                C07X c07x = (C07X) componentCallbacks2;
                C8C0 c8c0 = new C8C0(A0L2, MSY.A0E(c52692NTd3.A0h), c07x, null, c54614OAp2.A01, null, null, null, new C56261Oy8(c52692NTd3), new C56262Oy9(c52692NTd3), null, null, R.drawable.floating_button_black_background, true, false, false);
                View view2 = c8c0.A0J;
                view2.setFitsSystemWindows(true);
                view2.requestApplyInsets();
                C1810281e c1810281e2 = (C1810281e) c52692NTd3.A0j.getValue();
                C14360o3.A0C(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                NHN nhn = new NHN(c8c0, c1810281e2, C07Y.A00(c07x));
                ((C8J9) nhn).A00 = new C8JC(A0L2, c52692NTd3.A0C, c52692NTd3.A0F, nhn);
                nhn.A02 = new C54462O4q(c52692NTd3);
                float f = c52692NTd3.A00;
                nhn.A00 = f;
                nhn.A05.A0P.setTranslationY(f);
                return nhn;
            case Process.SIGSTOP /* 19 */:
                C52692NTd c52692NTd4 = (C52692NTd) this.A01;
                ViewStub viewStub = (ViewStub) c52692NTd4.A0c.getValue();
                C1810281e c1810281e3 = (C1810281e) c52692NTd4.A0j.getValue();
                ComponentCallbacks2 componentCallbacks22 = c52692NTd4.A09;
                C14360o3.A0C(componentCallbacks22, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C54727OFe c54727OFe = new C54727OFe(viewStub, c1810281e3, C07Y.A00((C07X) componentCallbacks22), AbstractC167027dH.A01(c52692NTd4.A0i));
                c54727OFe.A02.A0F = new PI9(c52692NTd4);
                return c54727OFe;
            case 20:
                return ((C52692NTd) this.A01).A0A.getContext().getDrawable(R.drawable.avatar_effect_placeholder);
            case 21:
                C52692NTd c52692NTd5 = (C52692NTd) this.A01;
                View view3 = c52692NTd5.A0A;
                Context context = view3.getContext();
                Drawable drawable = context.getDrawable(R.drawable.instagram_browse_effects_pano_outline_24);
                C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
                Bitmap A00 = C0fK.A00(((BitmapDrawable) drawable).getBitmap(), dimensionPixelSize, dimensionPixelSize, true);
                C14360o3.A07(A00);
                BitmapDrawable A0A = AbstractC43593JPy.A0A(context, A00);
                AbstractC25231BEo.A0x(context, A0A, AbstractC53242c7.A05(c52692NTd5.A09));
                AbstractC31171DnF.A07(view3, R.id.effect_gallery_entry_button_view_stub).inflate();
                ImageView A08 = AbstractC31171DnF.A08(view3, R.id.gallery_entry_button);
                A08.setImageDrawable(A0A);
                C0fQ.A00(new ViewOnClickListenerC55369Oia(c52692NTd5), A08);
                return A08;
            case 22:
                return ((C52692NTd) this.A01).A0A.findViewById(R.id.ar_effect_loading_indicator_stub);
            case 23:
                ViewStub viewStub2 = (ViewStub) ((C52692NTd) this.A01).A0Z.getValue();
                C14360o3.A07(viewStub2);
                return new C1821185v(viewStub2);
            case 24:
                return new OI7(AbstractC166997dE.A0L(((C52692NTd) this.A01).A0A));
            case 25:
                return ((C52692NTd) this.A01).A0A.requireViewById(R.id.rtc_effect_slider_stub);
            case 26:
                return new C55825Oqb((C52692NTd) this.A01);
            case 27:
                return new C54460O4o((C52692NTd) this.A01);
            case 28:
                C52692NTd c52692NTd6 = (C52692NTd) this.A01;
                UserSession userSession4 = c52692NTd6.A0F;
                Activity activity = c52692NTd6.A09;
                C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                InterfaceC11380iw interfaceC11380iw2 = c52692NTd6.A0C;
                return new C189698ao(AbstractC166987dD.A0O(activity), (FragmentActivity) activity, null, interfaceC11380iw2, userSession4);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return Float.valueOf(((C52692NTd) this.A01).A0A.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
            case 30:
                return ((C52692NTd) this.A01).A0A.findViewById(R.id.floating_button_picker_stub);
            case 31:
                return Integer.valueOf(AbstractC167017dG.A0E(((C52692NTd) this.A01).A0A.getContext()));
            case 32:
                EnumC1810181d enumC1810181d = EnumC1810181d.A08;
                C1810281e c1810281e4 = new C1810281e(enumC1810181d);
                C52692NTd c52692NTd7 = (C52692NTd) this.A01;
                EnumC1810181d enumC1810181d2 = EnumC1810181d.A11;
                c1810281e4.A03(C187608Td.class, enumC1810181d, enumC1810181d2);
                c1810281e4.A03(C187608Td.class, enumC1810181d2, enumC1810181d);
                c1810281e4.A02(new C56742PGk(c52692NTd7));
                return c1810281e4;
            case 33:
                return ((C52692NTd) this.A01).A0A.findViewById(R.id.ar_effect_picker_tabs_view_stub);
            case 34:
                return new OyG((C52692NTd) this.A01);
            case 35:
                C52692NTd c52692NTd8 = (C52692NTd) this.A01;
                return new C69608VsB(c52692NTd8.A09, c52692NTd8.A0F, "video_call", false);
            case 36:
                return AbstractC43594JPz.A0F(((PC7) this.A01).A01, R.id.effect_delivery_debug_info_stub);
            case 37:
                return AbstractC167007dF.A0L(((PC7) this.A01).A03).findViewById(R.id.debug_text_view);
            case 38:
                return Float.valueOf(AbstractC25228BEl.A0M(((NTW) this.A01).A09).getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            case 39:
                ((NTW) this.A01).A0C.A00(new PAU(C05F.A1F));
                return C0eB.A00;
            case 40:
                ((NTW) this.A01).A0C.A00(C56580PAc.A00);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                PCS pcs = (PCS) this.A01;
                return PCS.A00(AbstractC167007dF.A0L(pcs.A0L), pcs, Integer.valueOf(R.drawable.instagram_photo_filter_outline_44), MSW.A1F(pcs.A05(), 43), null, R.id.avatar_backgrounds_button);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                PCS pcs2 = (PCS) this.A01;
                return PCS.A00(AbstractC167007dF.A0L(pcs2.A0L), pcs2, null, MSW.A1F(pcs2.A05(), 44), null, R.id.avatar_thumbnail_button);
            case 43:
                return AbstractC167007dF.A0L(((PCS) this.A01).A0L).findViewById(R.id.ig_avatar_thumbnail_loader);
            case 44:
                return AbstractC167007dF.A0L(((PCS) this.A01).A0L).findViewById(R.id.avatar_cross_mini_icon);
            case 45:
                PCS pcs3 = (PCS) this.A01;
                View A0L3 = AbstractC167007dF.A0L(pcs3.A0L);
                boolean A06 = C18U.A06(C06090Tz.A05, pcs3.A06, 36322409573263579L);
                int i = R.drawable.instagram_facebook_avatars_outline_44;
                if (A06) {
                    i = R.drawable.instagram_avatars_outline_44;
                }
                return PCS.A00(A0L3, pcs3, Integer.valueOf(i), MSW.A1F(pcs3.A05(), 45), MSW.A1F(pcs3.A05(), 46), R.id.avatars_button);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                PCS pcs4 = (PCS) this.A01;
                return PCS.A00(AbstractC167007dF.A0L(pcs4.A0L), pcs4, Integer.valueOf(R.drawable.instagram_chevron_down_outline_44), MSW.A1F(pcs4.A05(), 47), null, R.id.chevron_button);
            case 47:
                PCS pcs5 = (PCS) this.A01;
                return PCS.A00(AbstractC167007dF.A0L(pcs5.A0L), pcs5, Integer.valueOf(R.drawable.instagram_dual_camera_pano_outline_24), MSW.A1F(pcs5.A05(), 48), null, R.id.dual_camera_button);
            case 48:
                PCS pcs6 = (PCS) this.A01;
                return PCS.A00(AbstractC167007dF.A0L(pcs6.A0L), pcs6, Integer.valueOf(AbstractC172037lY.A00(pcs6.A06)), MSW.A1F(pcs6.A05(), 49), null, R.id.effects_button);
            case 49:
                PCS pcs7 = (PCS) this.A01;
                View A0L4 = AbstractC167007dF.A0L(pcs7.A0L);
                boolean booleanValue = C6PY.A00(pcs7.A06).booleanValue();
                int i2 = R.drawable.instagram_color_filters_outline_44;
                if (booleanValue) {
                    i2 = R.drawable.instagram_palette_outline_44;
                }
                return PCS.A00(A0L4, pcs7, Integer.valueOf(i2), MSW.A1F(pcs7.A05(), 50), null, R.id.filters_button);
        }
    }
}
