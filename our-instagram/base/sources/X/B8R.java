package X;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import go.Seq;
import java.util.List;
import java.util.Queue;

/* loaded from: classes4.dex */
public final class B8R extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8R(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(B8R b8r) {
        return ((InterfaceC56392iX) ((C23854Ah6) b8r.A01).A0L.getValue()).getView();
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new B8R(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View requireView;
        int i;
        View A00;
        int i2;
        ImmutableList of;
        String str;
        View inflate;
        switch (this.A00) {
            case 0:
                return Integer.valueOf(AbstractC167017dG.A0B(((C48624Lf0) this.A01).A09));
            case 1:
                C23630AdP c23630AdP = (C23630AdP) this.A01;
                View view = c23630AdP.A00;
                if (view == null) {
                    str = "captionEditor";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C215759gr(AbstractC166997dE.A0S(view, R.id.karaoke_sticker_edit_bleep_hint), c23630AdP.A0J, c23630AdP.A0L);
            case 2:
                C23630AdP c23630AdP2 = (C23630AdP) this.A01;
                C66392zG A002 = C66362zD.A00(c23630AdP2.A0F);
                A002.A01((AbstractC66422zJ) c23630AdP2.A0P.getValue());
                C66362zD A003 = A002.A00();
                RecyclerView recyclerView = c23630AdP2.A03;
                if (recyclerView == null) {
                    str = "editRecyclerView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                recyclerView.setAdapter(A003);
                return A003;
            case 3:
                C24150AnZ c24150AnZ = (C24150AnZ) this.A01;
                View requireViewById = AbstractC167007dF.A0L(c24150AnZ.A0C).requireViewById(R.id.color_customization_button);
                C14360o3.A0A(requireViewById);
                C24150AnZ.A01(requireViewById, c24150AnZ, false);
                return requireViewById;
            case 4:
                return AbstractC166997dE.A0S(AbstractC166987dD.A0d(((C24150AnZ) this.A01).A0D), R.id.sticker_layering_tool_footer_text);
            case 5:
                A00 = AbstractC166987dD.A0d(((C24150AnZ) this.A01).A0D);
                i2 = R.id.layering_position_indicator;
                return A00.requireViewById(i2);
            case 6:
                return AbstractC166987dD.A0d(((C24150AnZ) this.A01).A0D).requireViewById(R.id.layering_tool_side_menu);
            case 7:
                return AbstractC167017dG.A0U((View) this.A01, R.id.layering_tool_stub);
            case 8:
                C24150AnZ c24150AnZ2 = (C24150AnZ) this.A01;
                View requireViewById2 = AbstractC167007dF.A0L(c24150AnZ2.A0C).requireViewById(R.id.lock_button);
                C14360o3.A0A(requireViewById2);
                C24150AnZ.A01(requireViewById2, c24150AnZ2, false);
                return requireViewById2;
            case 9:
            case 20:
                return this.A01;
            case 10:
            case 21:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 11:
            case 22:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C6WQ c6wq = new C6WQ(((C208769Lk) this.A01).A08, true);
                c6wq.A00(c6wq.getContext().getString(2131969964));
                return c6wq;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C208769Lk c208769Lk = (C208769Lk) this.A01;
                C210089Qx c210089Qx = c208769Lk.A0P;
                List A004 = C210089Qx.A00(c210089Qx, c208769Lk.A01);
                if (A004 != null) {
                    long j = 0;
                    int size = A004.size();
                    int i3 = 450 / (size - 1);
                    for (int i4 = 1; i4 < size; i4++) {
                        Queue queue = c208769Lk.A0W;
                        if (!queue.isEmpty()) {
                            Object poll = queue.poll();
                            if (poll != null) {
                                inflate = (View) poll;
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            inflate = LayoutInflater.from(c208769Lk.A08).inflate(R.layout.layout_flash_overlay, (ViewGroup) c208769Lk.A0C, false);
                            C14360o3.A0A(inflate);
                        }
                        C56302iJ A03 = c210089Qx.A03(c208769Lk.A01, i4);
                        if (A03 != null) {
                            inflate.setLayoutParams(A03);
                            inflate.setBackgroundColor(-1);
                            c208769Lk.A0C.addView(inflate);
                            C11T.A04(new RunnableC24639AvZ(inflate, c208769Lk), j);
                            j += i3;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                return C0eB.A00;
            case 14:
                C23790Ag1 c23790Ag1 = (C23790Ag1) this.A01;
                return new C218249kw(c23790Ag1.A03, c23790Ag1.A0A, c23790Ag1);
            case Process.SIGTERM /* 15 */:
                C6WQ c6wq2 = new C6WQ(((C23790Ag1) this.A01).A02, true);
                c6wq2.A00(c6wq2.getContext().getString(2131969964));
                return c6wq2;
            case 16:
                return new C441621y((UserSession) this.A01);
            case 17:
                C171287kK.A02((C171287kK) this.A01);
                return C0eB.A00;
            case 18:
                C171287kK c171287kK = (C171287kK) this.A01;
                UserSession userSession = c171287kK.A0K;
                AbstractC55215Oed.A00(c171287kK.A0H, userSession);
                AbstractC55224Oeq.A05(c171287kK.A0G.requireActivity(), userSession);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C37021nz A005 = C4M5.A00();
                C171287kK c171287kK2 = (C171287kK) this.A01;
                A005.A03(c171287kK2.A0G, c171287kK2.A0K, c171287kK2.A0H.getModuleName());
                return C0eB.A00;
            case 23:
                AbstractC59962oe abstractC59962oe = ((C24061Alx) this.A01).A00;
                final DisplayMetrics A0K = AbstractC167007dF.A0K(abstractC59962oe.requireContext());
                C14360o3.A07(A0K);
                final int color = abstractC59962oe.requireContext().getColor(AbstractC53242c7.A0H(abstractC59962oe.requireContext(), R.attr.igds_color_media_background));
                return new AbstractC61132qb(A0K, color) { // from class: X.9gk
                    public final int A00;
                    public final DisplayMetrics A01;

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C9U1(this.A01, this.A00);
                    }

                    {
                        this.A01 = A0K;
                        this.A00 = color;
                    }
                };
            case 24:
                return A00(this).requireViewById(R.id.music_pick_album_selected);
            case 25:
                return AbstractC166997dE.A0S(((C23854Ah6) this.A01).A04, R.id.text_overlay_edit_text_container);
            case 26:
                return AbstractC166997dE.A0S(((C23854Ah6) this.A01).A04, R.id.done_button);
            case 27:
                A00 = A00(this);
                i2 = R.id.music_pick_sticker_facepile;
                return A00.requireViewById(i2);
            case 28:
                A00 = A00(this);
                i2 = R.id.music_pick_album_author;
                return A00.requireViewById(i2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return A00(this).requireViewById(R.id.music_pick_create_explanation_text);
            case 30:
                return A00(this).requireViewById(R.id.music_pick_hint_text);
            case 31:
                return A00(this).requireViewById(R.id.music_pick_album_selector);
            case 32:
                return AbstractC166997dE.A0X(((C23854Ah6) this.A01).A04, R.id.music_pick_sticker_editor_stub);
            case 33:
                return A00(this).requireViewById(R.id.music_pick_sticker_container);
            case 34:
                LinearLayout linearLayout = (LinearLayout) A00(this).requireViewById(R.id.music_pick_sticker_layout);
                linearLayout.setGravity(8388659);
                return linearLayout;
            case 35:
                A00 = A00(this);
                i2 = R.id.music_pick_cancel_selection_button;
                return A00.requireViewById(i2);
            case 36:
                C23854Ah6 c23854Ah6 = (C23854Ah6) this.A01;
                AbstractC59962oe abstractC59962oe2 = c23854Ah6.A06;
                Context requireContext = abstractC59962oe2.requireContext();
                UserSession userSession2 = c23854Ah6.A07;
                EnumC1810381f enumC1810381f = EnumC1810381f.A05;
                if (C36A.A0E(userSession2)) {
                    of = ImmutableList.of((Object) AudioTrackType.A04);
                } else {
                    of = ImmutableList.of((Object) AudioTrackType.A03, (Object) AudioTrackType.A04);
                }
                C14360o3.A0A(of);
                C23883Ahc c23883Ahc = new C23883Ahc(c23854Ah6);
                C23882Ahb c23882Ahb = new C23882Ahb(c23854Ah6, 0);
                MusicProduct musicProduct = MusicProduct.A0J;
                C8BN c8bn = C8BN.STORY_ADD_YOURS_MUSIC_STICKER;
                MusicPickStickerModel musicPickStickerModel = c23854Ah6.A02;
                if (musicPickStickerModel == null) {
                    str = "model";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C8BP(requireContext, c8bn, of, musicProduct, abstractC59962oe2, userSession2, null, null, null, c23882Ahb, c23883Ahc, null, C8BO.A09, enumC1810381f, musicPickStickerModel.A00.A08, false, true, true, false, false);
            case 37:
                A00 = A00(this);
                i2 = R.id.music_pick_wave_drawable;
                return A00.requireViewById(i2);
            case 38:
                A00 = A00(this);
                i2 = R.id.music_pick_album_title;
                return A00.requireViewById(i2);
            case 39:
                return Float.valueOf(((TextView) AbstractC166987dD.A17(((C23854Ah6) this.A01).A0J)).getTextSize());
            case 40:
                return ((ComponentActivity) this.A01).getDefaultViewModelProviderFactory();
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC166997dE.A0S((View) this.A01, R.id.text_overlay_edit_text_container);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC166997dE.A0X((View) this.A01, R.id.poll_sticker_v2_editor_stub);
            case 43:
                C214729fA c214729fA = (C214729fA) this.A01;
                return AbstractC174697q4.A02((ViewStub) c214729fA.requireView().requireViewById(R.id.potato_capture_camera_stub), null, null, new C23568AcM(c214729fA), AbstractC166987dD.A0r(c214729fA.A08), "potato", 0, true);
            case 44:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle == null) {
                    return null;
                }
                return bundle.getString("arg_potato_media_id", null);
            case 45:
                requireView = ((Fragment) this.A01).requireView();
                i = R.id.potato_capture_footer_description;
                return AbstractC166997dE.A0S(requireView, i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                requireView = ((Fragment) this.A01).requireView();
                i = R.id.potato_capture_footer_title;
                return AbstractC166997dE.A0S(requireView, i);
            case 47:
                requireView = ((Fragment) this.A01).requireView();
                i = R.id.potato_capture_header_text;
                return AbstractC166997dE.A0S(requireView, i);
            case 48:
                return AbstractC166997dE.A0S(((Fragment) this.A01).requireView(), R.id.potato_camera_shape_mask_container);
            case 49:
                requireView = ((Fragment) this.A01).requireView();
                i = R.id.potato_capture_subheader_text;
                return AbstractC166997dE.A0S(requireView, i);
        }
    }
}
