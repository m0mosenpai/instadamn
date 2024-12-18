package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import go.Seq;
import java.util.List;
import java.util.Map;

/* renamed from: X.9E9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E9 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E9(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        C1AU A01;
        C1AV c1av;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        C149166nQ c149166nQ;
        switch (this.A00) {
            case 0:
                C146806jI c146806jI = (C146806jI) this.A01;
                final C146306iT c146306iT = c146806jI.A02;
                final Context context = c146806jI.A00;
                final UserSession userSession2 = c146306iT.A01;
                C62722tB A00 = AbstractC62712tA.A00(userSession2);
                final InterfaceC60442pS interfaceC60442pS = c146306iT.A02;
                final C1BX c1bx = A00.A00.A01;
                C14360o3.A07(c1bx);
                return new AbstractC64162vb(context, c1bx, userSession2, interfaceC60442pS, c146306iT) { // from class: X.6Q7
                    public final Context A00;
                    public final UserSession A01;
                    public final InterfaceC60442pS A02;
                    public final C146306iT A03;

                    {
                        super(c1bx, new InterfaceC62702t9() { // from class: X.6Q8
                            @Override // X.InterfaceC62702t9
                            public final String BKe(C59062n7 c59062n7) {
                                C14360o3.A0B(c59062n7, 0);
                                StringBuilder sb = new StringBuilder();
                                sb.append("carousel_transformation_reel_");
                                Reel reel = ((C41551w4) c59062n7.A03).A0H;
                                String id = reel.getId();
                                C14360o3.A07(id);
                                sb.append(id);
                                sb.append("_segment_");
                                sb.append(((C6Q6) c59062n7.A04).A00);
                                sb.append("_token_");
                                sb.append(reel.BzL(UserSession.this));
                                return sb.toString();
                            }
                        });
                        this.A03 = c146306iT;
                        this.A01 = userSession2;
                        this.A02 = interfaceC60442pS;
                        this.A00 = context;
                    }

                    private final void A00(C41551w4 c41551w4, C6Q6 c6q6, String str) {
                        List list;
                        C41181vS c41181vS = c6q6.A01;
                        InterfaceC60442pS interfaceC60442pS2 = this.A02;
                        UserSession userSession3 = this.A01;
                        C82713mZ A02 = AbstractC37955Gmx.A02(userSession3, interfaceC60442pS2, c41181vS, str);
                        A02.A4G = Long.valueOf(c6q6.A00);
                        C146306iT c146306iT2 = this.A03;
                        C141596ac c141596ac = c6q6.A02;
                        C3R6.A07(A02, c41181vS, c41551w4, c146306iT2, c141596ac, -1, false);
                        if (c6q6.A03) {
                            A02.A0X(c41551w4.A0H.A17);
                        } else {
                            Context context2 = this.A00;
                            A02.A04(AbstractC13880nE.A01(context2, AbstractC13880nE.A0A(context2)), AbstractC13880nE.A01(context2, AbstractC13880nE.A09(context2)), AbstractC13880nE.A0I(context2).density);
                            InterfaceC138906Qw interfaceC138906Qw = c141596ac.A0S;
                            if (interfaceC138906Qw != null) {
                                A02.A0Y(interfaceC138906Qw.BMV());
                                Map BNk = interfaceC138906Qw.BNk();
                                if (BNk != null) {
                                    list = (List) BNk.get("caption_highlights_showed");
                                } else {
                                    list = null;
                                }
                                A02.A0W(list);
                            }
                        }
                        C32U.A0I(userSession3, A02, interfaceC60442pS2, C05F.A01);
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C6Q6 c6q6 = (C6Q6) obj2;
                        C14360o3.A0B(c41551w4, 0);
                        C14360o3.A0B(c6q6, 1);
                        A00(c41551w4, c6q6, "segment_impression");
                    }

                    @Override // X.AbstractC64162vb
                    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C6Q6 c6q6 = (C6Q6) obj2;
                        C14360o3.A0B(c41551w4, 0);
                        C14360o3.A0B(c6q6, 1);
                        A00(c41551w4, c6q6, "segment_sub_impression");
                    }
                };
            case 1:
                final C146306iT c146306iT2 = ((C146806jI) this.A01).A02;
                return new AbstractC64412w0(c146306iT2) { // from class: X.6QJ
                    public final UserSession A00;
                    public final InterfaceC60442pS A01;
                    public final C146306iT A02;

                    @Override // X.AbstractC64412w0
                    public final /* bridge */ /* synthetic */ void A00(Object obj, long j2, Object obj2) {
                        C41551w4 c41551w4 = (C41551w4) obj;
                        C6Q6 c6q6 = (C6Q6) obj2;
                        C14360o3.A0B(c41551w4, 0);
                        C14360o3.A0B(c6q6, 1);
                        C41181vS c41181vS = c6q6.A01;
                        InterfaceC60442pS interfaceC60442pS2 = this.A01;
                        UserSession userSession3 = this.A00;
                        C82713mZ A02 = AbstractC37955Gmx.A02(userSession3, interfaceC60442pS2, c41181vS, "segment_time_spent");
                        A02.A0B(j2);
                        A02.A0X(c41551w4.A0H.A17);
                        A02.A4G = Long.valueOf(c6q6.A00);
                        C3R6.A07(A02, c41181vS, c41551w4, this.A02, c6q6.A02, -1, false);
                        C32U.A0I(userSession3, A02, interfaceC60442pS2, C05F.A01);
                    }

                    {
                        this.A02 = c146306iT2;
                        this.A00 = c146306iT2.A01;
                        this.A01 = c146306iT2.A02;
                    }
                };
            case 2:
                C146806jI c146806jI2 = (C146806jI) this.A01;
                final Context context2 = c146806jI2.A00;
                final C146306iT c146306iT3 = c146806jI2.A02;
                return new InterfaceC43071ya(context2, c146306iT3) { // from class: X.6Q9
                    public final InterfaceC64122vX A00;
                    public final C64092vU A01;

                    @Override // X.InterfaceC43071ya
                    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                        C14360o3.A0B(c59062n7, 0);
                        C14360o3.A0B(interfaceC57162jr, 1);
                        C64092vU c64092vU = this.A01;
                        C82383m1 A002 = c64092vU.A00(c59062n7.A05);
                        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                A002.A04(interfaceC57162jr);
                                c64092vU.A01(this.A00, A002, c59062n7.A03, c59062n7.A04);
                            } else {
                                A002.A03(c59062n7, interfaceC57162jr);
                            }
                        }
                    }

                    {
                        UserSession userSession3 = c146306iT3.A01;
                        this.A01 = new C64092vU(AbstractC11060iN.A00(userSession3), false);
                        C28091Xn c28091Xn = (C28091Xn) userSession3.A01(C142106bT.class, new C9EO(new C28091Xn(context2, userSession3, "stories_impression_store", AbstractC28081Xm.A00(userSession3)), 47));
                        InterfaceC60442pS interfaceC60442pS2 = c146306iT3.A02;
                        C3G2 c3g2 = c146306iT3.A03;
                        C14360o3.A0B(c28091Xn, 0);
                        this.A00 = new C6QD(new C146386ib(userSession3, interfaceC60442pS2, c3g2, c146306iT3.A06, c28091Xn, c146306iT3.A08, "instagram_ad_segment_vpvd_imp", c146306iT3.A07));
                    }
                };
            case 3:
                final C146306iT c146306iT4 = ((C146806jI) this.A01).A02;
                return new AbstractC146716j9(c146306iT4) { // from class: X.6QK
                    public final C146306iT A00;

                    {
                        super(c146306iT4);
                        this.A00 = c146306iT4;
                    }
                };
            case 4:
                return ((C144466fS) this.A01).A08.getView().requireViewById(R.id.story_caption_text);
            case 5:
                view = (View) ((C148446mE) this.A01).A0H.getValue();
                i = R.id.story_comment_avatar;
                View requireViewById = view.requireViewById(i);
                C14360o3.A07(requireViewById);
                return requireViewById;
            case 6:
                view = (View) ((C148446mE) this.A01).A0H.getValue();
                i = R.id.story_comment_character_indicator;
                View requireViewById2 = view.requireViewById(i);
                C14360o3.A07(requireViewById2);
                return requireViewById2;
            case 7:
                View requireViewById3 = ((View) ((C148446mE) this.A01).A0H.getValue()).requireViewById(R.id.story_comment_composer_background);
                C14360o3.A07(requireViewById3);
                return requireViewById3;
            case 8:
                View requireViewById4 = ((View) ((C148446mE) this.A01).A0H.getValue()).requireViewById(R.id.bottom_sheet_drag_handle);
                C14360o3.A07(requireViewById4);
                return requireViewById4;
            case 9:
                view = (View) ((C148446mE) this.A01).A0H.getValue();
                i = R.id.story_comment_composer_group;
                View requireViewById22 = view.requireViewById(i);
                C14360o3.A07(requireViewById22);
                return requireViewById22;
            case 10:
                return ((View) ((C148446mE) this.A01).A0H.getValue()).getContext();
            case 11:
                Object value = ((C148446mE) this.A01).A0B.getValue();
                C14360o3.A07(value);
                return Integer.valueOf((int) ((Context) value).getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                view = (View) ((C148446mE) this.A01).A0H.getValue();
                i = R.id.story_comment_text;
                View requireViewById222 = view.requireViewById(i);
                C14360o3.A07(requireViewById222);
                return requireViewById222;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((View) ((C148446mE) this.A01).A0H.getValue()).requireViewById(R.id.story_comment_composer_comments_flow);
            case 14:
                return ((View) ((C148446mE) this.A01).A0H.getValue()).requireViewById(R.id.story_comment_overlay);
            case Process.SIGTERM /* 15 */:
                view = (View) ((C148446mE) this.A01).A0H.getValue();
                i = R.id.story_comment_post_button;
                View requireViewById2222 = view.requireViewById(i);
                C14360o3.A07(requireViewById2222);
                return requireViewById2222;
            case 16:
                return ((C148446mE) this.A01).A03.getView();
            case 17:
            case 18:
                return ((InterfaceC018407e) this.A01).getViewModelStore();
            case Process.SIGSTOP /* 19 */:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C210969Ut(((C143556du) this.A01).A0z.getView());
            case 20:
                C148456mF c148456mF = (C148456mF) this.A01;
                return new C141806ax(new MTX(c148456mF, 32), new MTY(c148456mF, 3), (C19L) c148456mF.A0B.getValue());
            case 21:
                return ((View) this.A01).requireViewById(R.id.highlight_pill);
            case 22:
                return ((View) this.A01).requireViewById(R.id.background_pill);
            case 23:
                C149166nQ c149166nQ2 = (C149166nQ) this.A01;
                A01 = C1AT.A01(c149166nQ2.A03);
                c1av = C1AV.A1f;
                c149166nQ = c149166nQ2;
                return A01.A04(c1av, c149166nQ.getClass());
            case 24:
                C148386m8 c148386m8 = (C148386m8) this.A01;
                A01 = C1AT.A01(c148386m8.A01);
                c1av = C1AV.A33;
                c149166nQ = c148386m8;
                return A01.A04(c1av, c149166nQ.getClass());
            case 25:
                C149136nN c149136nN = (C149136nN) this.A01;
                A01 = C1AT.A01(c149136nN.A03);
                c1av = C1AV.A2C;
                c149166nQ = c149136nN;
                return A01.A04(c1av, c149166nQ.getClass());
            case 26:
                return new C148696me(((C148176ln) this.A01).A0F);
            case 27:
                view = ((C148176ln) this.A01).A0H.getView();
                i = R.id.reel_create_avatar_button;
                View requireViewById22222 = view.requireViewById(i);
                C14360o3.A07(requireViewById22222);
                return requireViewById22222;
            case 28:
                view = ((C148176ln) this.A01).A0H.getView();
                i = R.id.reel_create_avatar_imageview;
                View requireViewById222222 = view.requireViewById(i);
                C14360o3.A07(requireViewById222222);
                return requireViewById222222;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new AvatarStickerInteractor(null, ((C148176ln) this.A01).A0F, 30);
            case 30:
                return new AvatarStickerPreRenderInteractor(null, ((C148176ln) this.A01).A0F, 126);
            case 31:
                return C20Y.A00(((C148176ln) this.A01).A0F);
            case 32:
                return new C215649gg(((C148176ln) this.A01).A0F);
            case 33:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A06;
                j = 36318264929884240L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 34:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A06;
                j = 36314906265521059L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 35:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A05;
                j = 36322409573263579L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 36:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A05;
                j = 36318466793281691L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 37:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A06;
                j = 36318264930015313L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 38:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A05;
                j = 36320730241049443L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 39:
                userSession = ((C148176ln) this.A01).A0F;
                c06090Tz = C06090Tz.A05;
                j = 36319828297981636L;
                return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
            case 40:
                C148176ln c148176ln = (C148176ln) this.A01;
                A01 = C1AT.A01(c148176ln.A0F);
                c1av = C1AV.A37;
                c149166nQ = c148176ln;
                return A01.A04(c1av, c149166nQ.getClass());
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
                return this.A01;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 43:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 47:
                C148376m7 c148376m7 = (C148376m7) this.A01;
                A01 = C1AT.A01(c148376m7.A04);
                c1av = C1AV.A39;
                c149166nQ = c148376m7;
                return A01.A04(c1av, c149166nQ.getClass());
            case 48:
                C149146nO c149146nO = (C149146nO) this.A01;
                A01 = C1AT.A01(c149146nO.A03);
                c1av = C1AV.A3A;
                c149166nQ = c149146nO;
                return A01.A04(c1av, c149166nQ.getClass());
            case 49:
                return ((C144476fT) this.A01).A02.getView().requireViewById(R.id.reel_item_iconic_entrypoints_animation_container);
        }
    }
}
