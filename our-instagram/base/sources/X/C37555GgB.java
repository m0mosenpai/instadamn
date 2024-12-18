package X;

import android.graphics.drawable.Drawable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GgB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37555GgB extends AbstractC37623GhI implements C38Y, MO5 {
    public int A00;
    public final UserSession A01;
    public final C37546Gg2 A02;

    public C37555GgB(UserSession userSession, C37546Gg2 c37546Gg2) {
        C14360o3.A0B(userSession, 2);
        this.A02 = c37546Gg2;
        this.A01 = userSession;
    }

    @Override // X.MO5
    public final void DJY(Drawable drawable) {
        C4CW c4cw;
        Object c116725Qb;
        C4CR c4cr;
        H2H h2h;
        C4CO c4co;
        Object c4cv;
        C4CV c4cv2;
        Object c84123oy;
        Object A00;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        String str3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        TreeUpdaterJNI F7o;
        TreeUpdaterJNI treeUpdaterJNI20;
        TreeUpdaterJNI treeUpdaterJNI21;
        TreeUpdaterJNI treeUpdaterJNI22;
        TreeUpdaterJNI treeUpdaterJNI23;
        C43743JWc c43743JWc;
        C14360o3.A0B(drawable, 0);
        int i = this.A00;
        if (i >= 0) {
            AbstractC37552Gg8 abstractC37552Gg8 = this.A02.A0A;
            if (i < abstractC37552Gg8.A0B()) {
                C120985dq A0F = abstractC37552Gg8.A0F(this.A00);
                C14360o3.A0B(A0F, 0);
                C75113Zb c75113Zb = abstractC37552Gg8.C09(A0F).A0E;
                if (c75113Zb != null && (c43743JWc = c75113Zb.A0g) != null && c43743JWc.A01 != null) {
                    c75113Zb.A1X = AbstractC25225BEi.A16(drawable);
                    C75113Zb.A00(c75113Zb, 42);
                    c75113Zb.A0G(drawable);
                }
                C38321qM c38321qM = A0F.A02;
                if (c38321qM != null) {
                    UserSession userSession = this.A01;
                    C14360o3.A0B(userSession, 0);
                    InterfaceC116735Qc interfaceC116735Qc = null;
                    AbstractC37300Gc1.A0Z();
                    C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                    InterfaceC84133oz A1O = c38321qM.A1O();
                    if (A1O != null) {
                        c4cw = A1O.B2S();
                        if (c4cw != null) {
                            interfaceC116735Qc = c4cw.CC9();
                        }
                    } else {
                        c4cw = null;
                    }
                    if (A0u != null && A1O != null && c4cw != null && interfaceC116735Qc != null) {
                        IGE AKG = interfaceC116735Qc.AKG();
                        int B9q = interfaceC116735Qc.B9q() + 1;
                        AKG.A00 = B9q;
                        InterfaceC116735Qc interfaceC116735Qc2 = AKG.A02;
                        if (interfaceC116735Qc2 instanceof C39192HMw) {
                            AppreciationUFIEntryActionType appreciationUFIEntryActionType = AKG.A01;
                            C14360o3.A0B(appreciationUFIEntryActionType, 0);
                            c116725Qb = AbstractC37303Gc4.A06(interfaceC116735Qc2, AbstractC25229BEm.A1b("gift_count", Integer.valueOf(AKG.A00), AbstractC166987dD.A1L("action_type", appreciationUFIEntryActionType.A00)));
                        } else {
                            c116725Qb = new C116725Qb(AKG.A01, B9q);
                        }
                        C41119IIk AKF = c4cw.AKF();
                        AKF.A03 = (InterfaceC116735Qc) c116725Qb;
                        C4CW c4cw2 = AKF.A04;
                        if (c4cw2 instanceof C38043GoW) {
                            TreeUpdaterJNI treeUpdaterJNI24 = TreeUpdaterJNI.$redex_init_class;
                            C4CS c4cs = AKF.A00;
                            TreeUpdaterJNI treeUpdaterJNI25 = null;
                            if (c4cs != null) {
                                treeUpdaterJNI21 = c4cs.F7o();
                            } else {
                                treeUpdaterJNI21 = null;
                            }
                            C09530e4 A1L = AbstractC166987dD.A1L(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI21);
                            InterfaceC116715Qa interfaceC116715Qa = AKF.A01;
                            if (interfaceC116715Qa != null) {
                                treeUpdaterJNI22 = interfaceC116715Qa.F7o();
                            } else {
                                treeUpdaterJNI22 = null;
                            }
                            C09530e4 A1L2 = AbstractC166987dD.A1L("overflow", treeUpdaterJNI22);
                            C4CP c4cp = AKF.A02;
                            if (c4cp != null) {
                                treeUpdaterJNI23 = c4cp.F7o();
                            } else {
                                treeUpdaterJNI23 = null;
                            }
                            C09530e4 A1L3 = AbstractC166987dD.A1L("pill", treeUpdaterJNI23);
                            InterfaceC116735Qc interfaceC116735Qc3 = AKF.A03;
                            if (interfaceC116735Qc3 != null) {
                                treeUpdaterJNI25 = interfaceC116735Qc3.F7o();
                            }
                            c4cv = AbstractC37303Gc4.A06(c4cw2, new C09530e4[]{A1L, A1L2, A1L3, AbstractC166987dD.A1L("ufi", treeUpdaterJNI25)});
                        } else {
                            C4CS c4cs2 = AKF.A00;
                            C116725Qb c116725Qb2 = null;
                            if (c4cs2 != null) {
                                c4cr = c4cs2.Eqr();
                            } else {
                                c4cr = null;
                            }
                            InterfaceC116715Qa interfaceC116715Qa2 = AKF.A01;
                            if (interfaceC116715Qa2 != null) {
                                h2h = interfaceC116715Qa2.Eqt();
                            } else {
                                h2h = null;
                            }
                            C4CP c4cp2 = AKF.A02;
                            if (c4cp2 != null) {
                                c4co = c4cp2.Equ();
                            } else {
                                c4co = null;
                            }
                            InterfaceC116735Qc interfaceC116735Qc4 = AKF.A03;
                            if (interfaceC116735Qc4 != null) {
                                c116725Qb2 = interfaceC116735Qc4.Eqv();
                            }
                            c4cv = new C4CV(c4cr, h2h, c4co, c116725Qb2);
                        }
                        C4CW c4cw3 = (C4CW) c4cv;
                        IGN AKe = A1O.AKe();
                        AKe.A00 = c4cw3;
                        InterfaceC84133oz interfaceC84133oz = AKe.A02;
                        if (interfaceC84133oz instanceof C37972GnE) {
                            TreeUpdaterJNI treeUpdaterJNI26 = TreeUpdaterJNI.$redex_init_class;
                            C09530e4 A1L4 = AbstractC166987dD.A1L("enabled", Boolean.valueOf(AKe.A01));
                            if (c4cw3 != null) {
                                treeUpdaterJNI20 = c4cw3.F7o();
                            } else {
                                treeUpdaterJNI20 = null;
                            }
                            c84123oy = AbstractC37303Gc4.A06(interfaceC84133oz, AbstractC25229BEm.A1b("entry_point_container", treeUpdaterJNI20, A1L4));
                        } else {
                            boolean z = AKe.A01;
                            if (c4cw3 != null) {
                                c4cv2 = c4cw3.Eqs();
                            } else {
                                c4cv2 = null;
                            }
                            c84123oy = new C84123oy(c4cv2, z);
                        }
                        C128865s0 AKg = A0u.AKg();
                        AKg.A0G = (InterfaceC84133oz) c84123oy;
                        TreeUpdaterJNI treeUpdaterJNI27 = null;
                        AbstractC37302Gc3.A0n();
                        C3x9 c3x9 = AKg.A0b;
                        if (c3x9 instanceof C37967Gn9) {
                            C09530e4[] c09530e4Arr = new C09530e4[37];
                            InterfaceC83973oh interfaceC83973oh = AKg.A01;
                            if (interfaceC83973oh != null) {
                                treeUpdaterJNI = interfaceC83973oh.F7o();
                            } else {
                                treeUpdaterJNI = null;
                            }
                            C09530e4 A1L5 = AbstractC166987dD.A1L("achievements_info", treeUpdaterJNI);
                            InterfaceC84033on interfaceC84033on = AKg.A0C;
                            if (interfaceC84033on != null) {
                                treeUpdaterJNI2 = interfaceC84033on.F7o();
                            } else {
                                treeUpdaterJNI2 = null;
                            }
                            C09530e4 A1L6 = AbstractC166987dD.A1L("additional_audio_info", treeUpdaterJNI2);
                            C5HF c5hf = AKg.A02;
                            if (c5hf != null) {
                                treeUpdaterJNI3 = c5hf.F7o();
                            } else {
                                treeUpdaterJNI3 = null;
                            }
                            C09530e4 A1L7 = AbstractC166987dD.A1L("asset_recommendation_info", treeUpdaterJNI3);
                            InterfaceC84063oq interfaceC84063oq = AKg.A00;
                            if (interfaceC84063oq != null) {
                                treeUpdaterJNI4 = interfaceC84063oq.F7o();
                            } else {
                                treeUpdaterJNI4 = null;
                            }
                            C09530e4 A1L8 = AbstractC166987dD.A1L("audio_ranking_info", treeUpdaterJNI4);
                            MusicCanonicalType musicCanonicalType = AKg.A07;
                            if (musicCanonicalType != null) {
                                str = musicCanonicalType.A00;
                            } else {
                                str = null;
                            }
                            C09530e4 A1L9 = AbstractC166987dD.A1L("audio_type", str);
                            InterfaceC84103ov interfaceC84103ov = AKg.A0D;
                            if (interfaceC84103ov != null) {
                                treeUpdaterJNI5 = interfaceC84103ov.F7o();
                            } else {
                                treeUpdaterJNI5 = null;
                            }
                            C09530e4 A1L10 = AbstractC166987dD.A1L("branded_content_tag_info", treeUpdaterJNI5);
                            C5HH c5hh = AKg.A0E;
                            if (c5hh != null) {
                                treeUpdaterJNI6 = c5hh.F7o();
                            } else {
                                treeUpdaterJNI6 = null;
                            }
                            C09530e4 A1L11 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2004), treeUpdaterJNI6);
                            ClipsBreakingCreatorInfo clipsBreakingCreatorInfo = AKg.A03;
                            if (clipsBreakingCreatorInfo != null) {
                                treeUpdaterJNI7 = clipsBreakingCreatorInfo.F7o();
                            } else {
                                treeUpdaterJNI7 = null;
                            }
                            C09530e4 A1L12 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2005), treeUpdaterJNI7);
                            C5HK c5hk = AKg.A0F;
                            if (c5hk != null) {
                                treeUpdaterJNI8 = c5hk.F7o();
                            } else {
                                treeUpdaterJNI8 = null;
                            }
                            C09530e4 A1L13 = AbstractC166987dD.A1L(AbstractC111324zv.A00(792), treeUpdaterJNI8);
                            ClipsCreationEntryPoint clipsCreationEntryPoint = AKg.A04;
                            if (clipsCreationEntryPoint != null) {
                                str2 = clipsCreationEntryPoint.A00;
                            } else {
                                str2 = null;
                            }
                            C09530e4 A1L14 = AbstractC166987dD.A1L("clips_creation_entry_point", str2);
                            InterfaceC84133oz interfaceC84133oz2 = AKg.A0G;
                            if (interfaceC84133oz2 != null) {
                                treeUpdaterJNI9 = interfaceC84133oz2.F7o();
                            } else {
                                treeUpdaterJNI9 = null;
                            }
                            C09530e4 A1L15 = AbstractC166987dD.A1L("content_appreciation_info", treeUpdaterJNI9);
                            ClipsContextualHighlightInfoIntf clipsContextualHighlightInfoIntf = AKg.A0H;
                            if (clipsContextualHighlightInfoIntf != null) {
                                treeUpdaterJNI10 = clipsContextualHighlightInfoIntf.F7o();
                            } else {
                                treeUpdaterJNI10 = null;
                            }
                            C09530e4 A1L16 = AbstractC166987dD.A1L("contextual_highlight_info", treeUpdaterJNI10);
                            List<JKA> list = AKg.A0Z;
                            if (list != null) {
                                arrayList = AbstractC166987dD.A1E();
                                for (JKA jka : list) {
                                    if (jka != null) {
                                        arrayList.add(jka.F7o());
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            C09530e4 A1L17 = AbstractC166987dD.A1L("cutout_sticker_info", arrayList);
                            C09530e4 A1L18 = AbstractC166987dD.A1L("disable_use_in_clips_client_cache", AKg.A0N);
                            C5HL c5hl = AKg.A05;
                            if (c5hl != null) {
                                treeUpdaterJNI11 = c5hl.F7o();
                            } else {
                                treeUpdaterJNI11 = null;
                            }
                            C09530e4 A1L19 = AbstractC166987dD.A1L("external_media_info", treeUpdaterJNI11);
                            C09530e4 A1L20 = AbstractC166987dD.A1L("featured_label", AKg.A0V);
                            C09530e4 A1L21 = AbstractC166987dD.A1L("high_intent_follow_eligible", AKg.A0O);
                            C09530e4 A1L22 = AbstractC166987dD.A1L("is_fan_club_promo_video", AKg.A0P);
                            C09530e4 A1L23 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2609), AKg.A0Q);
                            C09530e4 A1L24 = AbstractC166987dD.A1L("is_public_chat_welcome_video", AKg.A0R);
                            C09530e4 A1L25 = AbstractC166987dD.A1L("is_shared_to_fb", AKg.A0S);
                            InterfaceC84163p3 interfaceC84163p3 = AKg.A0I;
                            if (interfaceC84163p3 != null) {
                                treeUpdaterJNI12 = interfaceC84163p3.F7o();
                            } else {
                                treeUpdaterJNI12 = null;
                            }
                            C09530e4 A1L26 = AbstractC166987dD.A1L("mashup_info", treeUpdaterJNI12);
                            C5HM c5hm = AKg.A06;
                            if (c5hm != null) {
                                treeUpdaterJNI13 = c5hm.F7o();
                            } else {
                                treeUpdaterJNI13 = null;
                            }
                            C09530e4 A1L27 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2714), treeUpdaterJNI13);
                            C09530e4 A1L28 = AbstractC166987dD.A1L("music_canonical_id", AKg.A0W);
                            MusicInfo musicInfo = AKg.A08;
                            if (musicInfo != null) {
                                treeUpdaterJNI14 = musicInfo.F7o();
                            } else {
                                treeUpdaterJNI14 = null;
                            }
                            C09530e4 A1L29 = AbstractC166987dD.A1L("music_info", treeUpdaterJNI14);
                            C5HN c5hn = AKg.A0J;
                            if (c5hn != null) {
                                treeUpdaterJNI15 = c5hn.F7o();
                            } else {
                                treeUpdaterJNI15 = null;
                            }
                            C09530e4 A1L30 = AbstractC166987dD.A1L("nux_info", treeUpdaterJNI15);
                            OriginalSoundDataIntf originalSoundDataIntf = AKg.A09;
                            if (originalSoundDataIntf != null) {
                                treeUpdaterJNI16 = originalSoundDataIntf.F7o();
                            } else {
                                treeUpdaterJNI16 = null;
                            }
                            System.arraycopy(new C09530e4[]{A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, A1L26, A1L27, A1L28, A1L29, A1L30, AbstractC166987dD.A1L("original_sound_info", treeUpdaterJNI16)}, 0, c09530e4Arr, 0, 27);
                            OriginalityInfo originalityInfo = AKg.A0A;
                            if (originalityInfo != null) {
                                treeUpdaterJNI17 = originalityInfo.F7o();
                            } else {
                                treeUpdaterJNI17 = null;
                            }
                            C09530e4 A1L31 = AbstractC166987dD.A1L("originality_info", treeUpdaterJNI17);
                            ProfessionalClipsUpsellType professionalClipsUpsellType = AKg.A0B;
                            if (professionalClipsUpsellType != null) {
                                str3 = professionalClipsUpsellType.A00;
                            } else {
                                str3 = null;
                            }
                            C09530e4 A1L32 = AbstractC166987dD.A1L("professional_clips_upsell_type", str3);
                            C09530e4 A1L33 = AbstractC166987dD.A1L("reusable_text_attribute_string", AKg.A0X);
                            List<InterfaceC93104Fm> list2 = AKg.A0a;
                            if (list2 != null) {
                                arrayList2 = AbstractC166987dD.A1E();
                                for (InterfaceC93104Fm interfaceC93104Fm : list2) {
                                    if (interfaceC93104Fm != null && (F7o = interfaceC93104Fm.F7o()) != null) {
                                        arrayList2.add(F7o);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            C09530e4 A1L34 = AbstractC166987dD.A1L("reusable_text_info", arrayList2);
                            ClipsShoppingInfoIntf clipsShoppingInfoIntf = AKg.A0M;
                            if (clipsShoppingInfoIntf != null) {
                                treeUpdaterJNI18 = clipsShoppingInfoIntf.F7o();
                            } else {
                                treeUpdaterJNI18 = null;
                            }
                            C09530e4 A1L35 = AbstractC166987dD.A1L("shopping_info", treeUpdaterJNI18);
                            C09530e4 A1L36 = AbstractC166987dD.A1L("show_achievements", AKg.A0T);
                            C09530e4 A1L37 = AbstractC166987dD.A1L("show_tips", AKg.A0U);
                            C09530e4 A1L38 = AbstractC166987dD.A1L("stripped_media_id", AKg.A0Y);
                            InterfaceC110214xq interfaceC110214xq = AKg.A0K;
                            if (interfaceC110214xq != null) {
                                treeUpdaterJNI19 = interfaceC110214xq.F7o();
                            } else {
                                treeUpdaterJNI19 = null;
                            }
                            C09530e4 A1L39 = AbstractC166987dD.A1L("template_info", treeUpdaterJNI19);
                            C5HS c5hs = AKg.A0L;
                            if (c5hs != null) {
                                treeUpdaterJNI27 = c5hs.F7o();
                            }
                            System.arraycopy(new C09530e4[]{A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, A1L39, AbstractC166987dD.A1L(AbstractC111324zv.A00(3305), treeUpdaterJNI27)}, 0, c09530e4Arr, 27, 10);
                            A00 = AbstractC37303Gc4.A06(c3x9, c09530e4Arr);
                        } else {
                            A00 = AKg.A00();
                        }
                        c38321qM.A43((C3x9) A00);
                        c38321qM.AEH(userSession);
                    }
                }
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        this.A00 = i;
    }
}
