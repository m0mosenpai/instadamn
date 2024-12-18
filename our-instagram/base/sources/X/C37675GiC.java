package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GiC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37675GiC implements InterfaceC43585JPa, InterfaceC685936w, InterfaceC31137Dmc {
    public static int A1P;
    public static int A1Q;
    public View A00;
    public C120985dq A01;
    public ViewOnFocusChangeListenerC207579Gl A02;
    public Integer A03;
    public boolean A04;
    public C37644Ghd A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final AbstractC59962oe A08;
    public final ClipsViewerConfig A09;
    public final ClipsViewerSource A0A;
    public final InterfaceC41501vz A0B;
    public final UserSession A0C;
    public final InterfaceC60442pS A0D;
    public final MVO A0E;
    public final C38X A0F;
    public final SearchContext A0G;
    public final C37605Gh0 A0H;
    public final InterfaceC1119153d A0I;
    public final InterfaceC43589JPu A0J;
    public final EnumC114765Gh A0K;
    public final MVS A0L;
    public final C37540Gfw A0M;
    public final ILW A0N;
    public final C37546Gg2 A0O;
    public final C37594Ggp A0P;
    public final C37583Gge A0Q;
    public final INA A0R;
    public final C37716Gir A0S;
    public final JI2 A0T;
    public final C37711Gim A0U;
    public final IN9 A0V;
    public final C26914BuH A0W;
    public final C37522Gfe A0X;
    public final C37607Gh2 A0Y;
    public final IG5 A0Z;
    public final BKR A0a;
    public final C37612Gh7 A0b;
    public final C37671Gi4 A0c;
    public final C37560GgG A0d;
    public final C37556GgC A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final InterfaceC09390do A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final boolean A0l;
    public final C37734Gj9 A0m;
    public final InterfaceC43399JFo A0n;
    public final InterfaceC116925Qy A0o;
    public final C37603Ggy A0p;
    public final InterfaceC60142ow A0q;
    public final InterfaceC31077DlK A0r;
    public final C38i A0s;
    public final C149566o8 A0t;
    public final C75473aE A0u;
    public final C38E A0v;
    public final AnonymousClass388 A0w;
    public final C37502GfK A0x;
    public final C688938a A0y;
    public final C37596Ggr A0z;
    public final C37595Ggq A10;
    public final C59952od A11;
    public final IE0 A12;
    public final C37601Ggw A13;
    public final AbstractC37552Gg8 A14;
    public final C42206Ims A15;
    public final C37598Ggt A16;
    public final C37815GkV A17;
    public final MVF A18;
    public final C37602Ggx A19;
    public final C37582Ggd A1A;
    public final BKZ A1B;
    public final C37597Ggs A1C;
    public final C39465Hbr A1D;
    public final C37661Ghu A1E;
    public final JI8 A1F;
    public final InterfaceC31163Dn7 A1G;
    public final BKA A1H;
    public final C37542Gfy A1I;
    public final BKQ A1J;
    public final C37659Ghs A1K;
    public final C37599Ggu A1L;
    public final C37576GgX A1M;
    public final IKR A1N;
    public final String A1O;

    public static final void A08(MediaControlEventSourceEnum mediaControlEventSourceEnum, C38321qM c38321qM, C75113Zb c75113Zb, C37675GiC c37675GiC) {
        Integer A00 = AbstractC40626Hzk.A00(mediaControlEventSourceEnum);
        FragmentActivity fragmentActivity = c37675GiC.A07;
        UserSession userSession = c37675GiC.A0C;
        C37522Gfe c37522Gfe = c37675GiC.A0X;
        C41737Ie9.A01(fragmentActivity, mediaControlEventSourceEnum, c37522Gfe, userSession, c38321qM, c37675GiC, c75113Zb, c37675GiC.A0W);
        String A002 = AbstractC40627Hzl.A00(A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "ig_not_interested_toast_cta_click");
        if (A0f.isSampled()) {
            AbstractC37302Gc3.A0x(A0f, c38321qM);
            A0f.AAP("module", c37522Gfe.getModuleName());
            AbstractC25233BEq.A17(A0f, "event_source", A002);
            A0f.Cht();
        }
    }

    public final void A0J(View view, C71313Hs c71313Hs, C120985dq c120985dq, boolean z, boolean z2) {
        EnumC71343Hv enumC71343Hv;
        View findViewById = view.getRootView().findViewById(R.id.layout_container_right);
        if (findViewById != null) {
            UserSession userSession = this.A0C;
            C37616GhB c37616GhB = new C37616GhB(userSession, this.A0D);
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36314850430815088L)) {
                enumC71343Hv = EnumC71343Hv.A0H;
            } else {
                enumC71343Hv = EnumC71343Hv.A05;
            }
            c37616GhB.A04(findViewById, enumC71343Hv, null, c120985dq, null, false, z2);
            if (z && c71313Hs != null) {
                c71313Hs.A07(findViewById, EnumC71343Hv.A0H, new String[0], 0);
            }
        }
    }

    public final void A0L(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, Integer num) {
        Object obj;
        C37658Ghr c37658Ghr;
        interfaceC31077DlK.EWT(c120985dq, true);
        this.A1J.A02(num);
        this.A07.getWindow().setFlags(8192, 8192);
        C37556GgC c37556GgC = this.A0e;
        View A07 = c37556GgC.A07(c37556GgC.A03());
        if (A07 != null) {
            obj = A07.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C37658Ghr) {
            c37658Ghr = (C37658Ghr) obj;
        } else {
            c37658Ghr = null;
        }
        this.A1M.A01(null, null, null, c37658Ghr);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CJR(View view, C38321qM c38321qM) {
        List ByM;
        List list;
        InterfaceC37271GbO interfaceC37271GbO;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC87503vI A1M = c38321qM.A1M();
        if (A1M != null && (ByM = A1M.ByM()) != null && !ByM.isEmpty()) {
            ClipsViewerConfig clipsViewerConfig = this.A09;
            String str = clipsViewerConfig.A0n;
            if (str != null) {
                String str2 = clipsViewerConfig.A1J;
                if (str2 != null) {
                    List AgH = c38321qM.A0C.AgH();
                    if (AgH == null || (interfaceC37271GbO = (InterfaceC37271GbO) AbstractC001800i.A0J(AgH)) == null || (list = interfaceC37271GbO.BNG()) == null) {
                        list = C16930sl.A00;
                    }
                    UserSession userSession = this.A0C;
                    FragmentActivity fragmentActivity = this.A07;
                    C26740BrL c26740BrL = new C26740BrL();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString(AbstractC111324zv.A00(593), str);
                    A0b.putString(AbstractC111324zv.A00(594), str2);
                    ArrayList A0q = AbstractC167017dG.A0q(ByM);
                    Iterator it = ByM.iterator();
                    while (it.hasNext()) {
                        A0q.add(AbstractC76433bn.A00(AbstractC25226BEj.A15(it)));
                    }
                    A0b.putStringArray(AbstractC111324zv.A00(142), (String[]) A0q.toArray(new String[0]));
                    A0b.putStringArray(AbstractC111324zv.A00(141), (String[]) list.toArray(new String[0]));
                    AbstractC31173DnH.A0w(fragmentActivity, c26740BrL, AbstractC31174DnI.A0W(A0b, c26740BrL, userSession));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.JI8
    public final boolean CT2(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A1F.CT2(c120985dq);
    }

    @Override // X.JI8
    public final boolean CT3(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A1F.CT3(c120985dq);
    }

    @Override // X.JI2
    public final boolean CT4(C120985dq c120985dq, Boolean bool) {
        C14360o3.A0B(c120985dq, 0);
        return this.A0T.CT4(c120985dq, bool);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CiU(C38321qM c38321qM, int i) {
        ArrayList arrayList;
        long j;
        Long A0j;
        List ByM;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String str = this.A09.A0n;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_link_impression");
        InterfaceC87503vI A1M = c38321qM.A1M();
        Long l = null;
        if (A1M != null && (ByM = A1M.ByM()) != null) {
            arrayList = AbstractC167017dG.A0q(ByM);
            Iterator it = ByM.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC25226BEj.A15(it).getId(), arrayList);
            }
        } else {
            arrayList = null;
        }
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC37303Gc4.A0c(A0f, i, j);
            InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
            A0f.AAP("social_context_type", "suggested_for");
            AbstractC25233BEq.A17(A0f, "chaining_session_id", interfaceC43589JPu.Amq());
            AbstractC25225BEi.A1M(EnumC120795dP.A0h, A0f);
            A0f.AAk("facepile_user_ids", arrayList);
            if (str != null) {
                l = AbstractC25228BEl.A13(str);
            }
            A0f.A9K("blend_id", l);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void CiV(C38321qM c38321qM, int i) {
        ArrayList arrayList;
        long j;
        Long A0j;
        List ByM;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String str = this.A09.A0n;
        InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
        InterfaceC87503vI A1M = c38321qM.A1M();
        Long l = null;
        if (A1M != null && (ByM = A1M.ByM()) != null) {
            arrayList = AbstractC167017dG.A0q(ByM);
            Iterator it = ByM.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC25226BEj.A15(it).getId(), arrayList);
            }
        } else {
            arrayList = null;
        }
        if (A0A.isSampled()) {
            AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC37303Gc4.A0c(A0A, i, j);
            InterfaceC43589JPu.A00(A0A, interfaceC43589JPu);
            A0A.AAP("social_context_type", "suggested_for");
            AbstractC25233BEq.A17(A0A, "chaining_session_id", interfaceC43589JPu.Amq());
            AbstractC25225BEi.A1M(EnumC120795dP.A0h, A0A);
            A0A.AAk("facepile_user_ids", arrayList);
            if (str != null) {
                l = AbstractC25228BEl.A13(str);
            }
            A0A.A9K("blend_id", l);
            A0A.Cht();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cip(EnumC120795dP enumC120795dP, BQL bql, C120985dq c120985dq, C37644Ghd c37644Ghd, Integer num) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, bql);
        C14360o3.A0B(enumC120795dP, 3);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, this.A0D, this.A0C, c38321qM, this.A0J, null, c37644Ghd.A06());
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Ciq(EnumC120795dP enumC120795dP, BQL bql, C120985dq c120985dq, Integer num, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC25233BEq.A0v(0, c120985dq, bql, enumC120795dP);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            Long l2 = null;
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            }
            AbstractC37670Gi3.A08(enumC120795dP, bql, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), i, j);
        }
    }

    @Override // X.InterfaceC30964DjL
    public final void Cok(View view) {
        C37711Gim c37711Gim = this.A0U;
        if (!c37711Gim.A02) {
            InterfaceC19630xq interfaceC19630xq = c37711Gim.A08.A01;
            if (!interfaceC19630xq.getBoolean("has_seen_reels_end_scene_nux", false)) {
                if (C18U.A06(C06090Tz.A06, c37711Gim.A07, 36315541921795471L)) {
                    C5SU c5su = new C5SU(c37711Gim.A04, new C149686oL(AbstractC166997dE.A0q(view.getResources(), 2131971978)));
                    c5su.A03(view);
                    c5su.A01();
                    c5su.A00 = 5000;
                    c5su.A0A = true;
                    c5su.A0G = true;
                    c5su.A04 = new C39149HLd(2);
                    view.postDelayed(new J45(c5su.A00()), 500L);
                    AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_reels_end_scene_nux", true);
                    c37711Gim.A02 = true;
                }
            }
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cos(View view) {
        C37711Gim c37711Gim = this.A0U;
        if (!c37711Gim.A02) {
            InterfaceC19630xq interfaceC19630xq = c37711Gim.A08.A01;
            if (!interfaceC19630xq.getBoolean("has_seen_tap_to_pause_audio_control_nux", false)) {
                if (C18U.A06(C06090Tz.A05, c37711Gim.A07, 36321211277714652L)) {
                    C5SU c5su = new C5SU(c37711Gim.A04, new C149686oL(AbstractC166997dE.A0q(view.getResources(), 2131975222)));
                    c5su.A03(view);
                    c5su.A02();
                    c5su.A00 = 5000;
                    c5su.A0A = true;
                    c5su.A0G = true;
                    c5su.A04 = new C39149HLd(3);
                    view.postDelayed(new J46(c5su.A00()), 500L);
                    AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_tap_to_pause_audio_control_nux", true);
                    c37711Gim.A02 = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.A0x != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // X.JIE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CvC(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r3 = 0
            X.C14360o3.A0B(r8, r3)
            X.5dq r1 = r7.A01
            r5 = 0
            if (r1 == 0) goto L19
            boolean r0 = r1.CdW()
            if (r0 == 0) goto Lb7
            X.1v4 r5 = r1.A06()
        L13:
            if (r5 == 0) goto L19
            boolean r0 = r5.A0x
            if (r0 != 0) goto La9
        L19:
            X.5dq r2 = r7.A01
            if (r2 == 0) goto La9
            java.lang.String r6 = "Required value was null."
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L2c
            X.DlK r1 = r7.A0r
            X.3Zm r0 = X.EnumC75193Zm.A09
            r1.Ecj(r2, r0)
        L2c:
            X.Gfw r4 = r7.A0M
            X.5dq r2 = r7.A01
            if (r2 == 0) goto Lc8
            java.lang.String r1 = "three_dot_menu"
            r0 = 1
            r4.A0M(r2, r1, r0, r3)
        L38:
            if (r5 == 0) goto L74
            if (r9 == 0) goto L9b
            java.lang.String r0 = "hide_button"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L75
            X.5dq r6 = r7.A01
            if (r6 == 0) goto L74
            X.Ghd r5 = r7.A05
            if (r5 == 0) goto L74
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.JI2 r1 = r7.A0T
            boolean r0 = r1.CT4(r6, r0)
            if (r0 == 0) goto L65
            X.CUJ r0 = r1.As5()
            if (r0 == 0) goto L65
            X.0sZ r0 = r0.A01
            if (r0 == 0) goto L65
            r0.invoke()
        L65:
            X.5Qy r4 = r7.A0o
            X.317 r3 = X.AnonymousClass317.A0Y
            r2 = 0
            java.lang.String r1 = ""
            X.6T6 r0 = new X.6T6
            r0.<init>(r2, r2, r9, r1)
            r4.DVi(r0, r3, r6, r5)
        L74:
            return
        L75:
            java.lang.String r0 = "report_button"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L74
            X.5dq r2 = r7.A01
            if (r2 == 0) goto L74
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.JI2 r1 = r7.A0T
            boolean r0 = r1.CT4(r2, r0)
            if (r0 == 0) goto L74
            X.CUJ r0 = r1.As5()
            if (r0 == 0) goto L74
            X.0sZ r0 = r0.A01
            if (r0 == 0) goto L74
            r0.invoke()
            return
        L9b:
            java.lang.String r0 = "remove_from_ad_activity"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L74
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            r0.finish()
            return
        La9:
            X.5dq r0 = r7.A01
            if (r0 == 0) goto L38
            X.1qM r1 = r0.A02
            if (r1 == 0) goto L38
            com.instagram.common.session.UserSession r0 = r7.A0C
            r1.AEH(r0)
            goto L38
        Lb7:
            X.1v4 r1 = r1.A07()
            if (r1 == 0) goto L19
            com.instagram.common.session.UserSession r0 = r7.A0C
            boolean r0 = X.AbstractC37587Ggi.A00(r0)
            if (r0 == 0) goto L19
            r5 = r1
            goto L13
        Lc8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.CvC(java.lang.String, java.lang.String):void");
    }

    @Override // X.JIE
    public final /* synthetic */ void CvE() {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvG() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvz() {
    }

    @Override // X.InterfaceC31028DkR
    public final void Cx4(C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb, String str, float f, float f2, int i, boolean z, boolean z2) {
        BQL bql;
        C14360o3.A0B(c120985dq, 0);
        this.A0P.A00(c120985dq, c37644Ghd, null, c2Fb, null, null, null, null, f, f2, z, z2, false);
        AbstractC59962oe abstractC59962oe = this.A08;
        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type instagram.features.clips.viewer.ClipsViewerFragment");
        View A0K = ((C59952od) abstractC59962oe).A0K();
        if (A0K != null) {
            UserSession userSession = this.A0C;
            new C37616GhB(userSession, this.A0D).A04(A0K, EnumC71343Hv.A05, null, c120985dq, null, false, false);
            AbstractC37301Gc2.A07(userSession).A07(A0K, EnumC71343Hv.A06, new String[0], 0);
            if (c2Fb == C2Fb.A13) {
                bql = BQL.A07;
            } else {
                bql = BQL.A05;
            }
            Ciq(EnumC120795dP.A02, bql, c120985dq, null, i);
        }
    }

    @Override // X.InterfaceC31028DkR
    public final void Cx5(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        BQL bql;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            if (z) {
                bql = BQL.A07;
            } else {
                bql = BQL.A05;
            }
            AbstractC37670Gi3.A06(EnumC120795dP.A02, bql, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, null, A06);
        }
    }

    @Override // X.InterfaceC43399JFo
    public final void Cx8(C120985dq c120985dq, Integer num, String str) {
        C14360o3.A0B(num, 1);
        AGM(c120985dq, EnumC37860GlF.A03, EnumC37861GlG.A03);
        this.A0n.Cx8(c120985dq, num, str);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxp(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        C38321qM c38321qM;
        BQL bql;
        EnumC120795dP enumC120795dP;
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        if (c120985dq.A01 != EnumC129395t1.A03 && (c38321qM = c120985dq.A02) != null) {
            boolean A0K = AbstractC76643c9.A0K(c38321qM);
            boolean A1b = AbstractC37302Gc3.A1b(c38321qM);
            if (!A0K && !A1b) {
                return;
            }
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            if (A0K) {
                if (A1b) {
                    bql = BQL.A0D;
                    enumC120795dP = EnumC120795dP.A04;
                    AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, AbstractC25227BEk.A0p(), A06);
                } else {
                    bql = BQL.A0C;
                    enumC120795dP = EnumC120795dP.A05;
                    AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, AbstractC25227BEk.A0p(), A06);
                }
            }
            if (A1b) {
                bql = BQL.A09;
                enumC120795dP = EnumC120795dP.A04;
                AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, AbstractC25227BEk.A0p(), A06);
            } else {
                bql = BQL.A0h;
                enumC120795dP = EnumC120795dP.A02;
                AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, AbstractC25227BEk.A0p(), A06);
            }
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxq(C8JW c8jw, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        InterfaceC84063oq interfaceC84063oq;
        long j;
        Long l;
        Long l2;
        BQL bql;
        EnumC120795dP enumC120795dP;
        String attributionAppId;
        Long A0j;
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(c37644Ghd, c8jw);
        if (c120985dq.A01 != EnumC129395t1.A03) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                C37716Gir c37716Gir = this.A0S;
                UserSession userSession = this.A0C;
                if (!AbstractC40917IAp.A00(userSession, c38321qM, c37716Gir)) {
                    C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                    AbstractC92574Cr.A03(A0u);
                    String A0j2 = AbstractC167017dG.A0j();
                    String A0j3 = AbstractC167017dG.A0j();
                    String str = null;
                    if (A0u != null) {
                        interfaceC84063oq = A0u.Adx();
                        if (AbstractC117245Sj.A04(A0u) != null) {
                            A0C(c120985dq, c37644Ghd);
                        }
                    } else {
                        interfaceC84063oq = null;
                    }
                    if (z) {
                        boolean A0K = AbstractC76643c9.A0K(c38321qM);
                        boolean A1b = AbstractC37302Gc3.A1b(c38321qM);
                        InterfaceC60442pS interfaceC60442pS = this.A0D;
                        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
                        String A2u = c38321qM.A2u();
                        if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = 0;
                        }
                        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
                        if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                            l = AbstractC166997dE.A0j(attributionAppId);
                        } else {
                            l = null;
                        }
                        User A2E = c38321qM.A2E(userSession);
                        if (A2E != null) {
                            l2 = AbstractC25231BEo.A0k(A2E);
                        } else {
                            l2 = null;
                        }
                        String A1G = AbstractC25226BEj.A1G(c38321qM);
                        int A06 = c37644Ghd.A06();
                        if (A0K) {
                            if (A1b) {
                                bql = BQL.A0D;
                                enumC120795dP = EnumC120795dP.A04;
                                AbstractC37670Gi3.A08(enumC120795dP, bql, interfaceC60442pS, userSession, interfaceC43589JPu, 0, l, l2, A1G, A06, j);
                            } else {
                                bql = BQL.A0C;
                                enumC120795dP = EnumC120795dP.A05;
                                AbstractC37670Gi3.A08(enumC120795dP, bql, interfaceC60442pS, userSession, interfaceC43589JPu, 0, l, l2, A1G, A06, j);
                            }
                        } else if (A1b) {
                            bql = BQL.A09;
                            enumC120795dP = EnumC120795dP.A04;
                            AbstractC37670Gi3.A08(enumC120795dP, bql, interfaceC60442pS, userSession, interfaceC43589JPu, 0, l, l2, A1G, A06, j);
                        } else {
                            bql = BQL.A0B;
                            enumC120795dP = EnumC120795dP.A02;
                            AbstractC37670Gi3.A08(enumC120795dP, bql, interfaceC60442pS, userSession, interfaceC43589JPu, 0, l, l2, A1G, A06, j);
                        }
                    }
                    C37671Gi4.A00(this.A0c, C05F.A01);
                    this.A0E.A02();
                    boolean z2 = !this.A0d.A0c(c120985dq);
                    String str2 = c120985dq.A0Q;
                    FragmentActivity fragmentActivity = this.A07;
                    String str3 = this.A0f;
                    if (str3 == null) {
                        str3 = c120985dq.A0D();
                    }
                    String str4 = this.A0g;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    if (interfaceC84063oq != null) {
                        str = interfaceC84063oq.getBestAudioClusterId();
                    }
                    AbstractC37834Gko.A00(fragmentActivity, c8jw, c120985dq, userSession, c38321qM, A0j2, str3, str4, str2, str, A0j3, z2);
                    AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A04);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final View.OnTouchListener Cxr(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 == EnumC129395t1.A03) {
            return null;
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            return new C105174oX(AbstractC166987dD.A0O(this.A07), this.A0C, c38321qM, C05F.A00, this.A0D.getModuleName());
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC144816g1
    public final void CzU(UpcomingEvent upcomingEvent, String str, boolean z) {
    }

    @Override // X.InterfaceC31073DlF
    public final void D0X(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        AbstractC37862GlH.A02(socialContextType, userSession, c120985dq.A02, interfaceC60442pS, interfaceC43589JPu.CGJ(), interfaceC43589JPu.Amq(), c37644Ghd.A06(), i, j, true);
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void D0e(List list) {
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    @Override // X.InterfaceC30970DjR
    public final void D0g(C120985dq c120985dq) {
        User A14;
        long j;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
            long parseLong = Long.parseLong(A14.getId());
            Context context = this.A06;
            UserSession userSession = this.A0C;
            String moduleName = this.A0X.getModuleName();
            ?? A1a = AbstractC31175DnJ.A1a(moduleName);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0R = "com.bloks.www.bk.ig_ads.ratings_and_reviews.all_reviews";
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            BitSet bitSet = new BitSet(A1a == true ? 1 : 0);
            A1G.put("merchant_igid", Long.valueOf(parseLong));
            bitSet.set(0);
            A1G.put("prior_module", moduleName);
            switch (AdsRatingAndReviewDisplayFormat.A04.ordinal()) {
                case 1:
                    j = 7;
                    break;
                case 2:
                    j = 5;
                    break;
                case 3:
                    j = 0;
                    break;
                case 4:
                    j = 1;
                    break;
                case 5:
                    j = 2;
                    break;
                case 6:
                    j = 3;
                    break;
                case 7:
                    j = 6;
                    break;
                case 8:
                    j = 4;
                    break;
                default:
                    j = -1;
                    break;
            }
            A1G.put(AbstractC111324zv.A00(2947), Long.valueOf(j));
            if (bitSet.nextClearBit(0) >= A1a) {
                C66277U6x A02 = C66277U6x.A02("com.bloks.www.bk.ig_ads.ratings_and_reviews.all_reviews", AbstractC191768eY.A01(A1G), A1G2);
                AbstractC31178DnM.A1M(A02, -1);
                A02.A03 = null;
                A02.A02 = null;
                A02.A04 = null;
                A02.A08(A1G3);
                A02.A05(context, A0C);
                return;
            }
            throw AbstractC31173DnH.A0f();
        }
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D27() {
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D29() {
    }

    @Override // X.InterfaceC144776fx
    public final /* synthetic */ void D2C(C84823qW c84823qW, int i, int i2) {
    }

    @Override // X.InterfaceC30973DjU
    public final void D2b(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        if (z) {
            c120985dq.A06();
            this.A0P.A00(c120985dq, c37644Ghd, null, C2Fb.A0p, null, null, null, null, -1.0f, -1.0f, false, false, false);
            AbstractC37300Gc1.A11(this.A0o, AnonymousClass317.A08, c120985dq, c37644Ghd);
        } else {
            C37603Ggy c37603Ggy = this.A0p;
            Float valueOf = Float.valueOf(-1.0f);
            c37603Ggy.A03(new MUW(valueOf, valueOf, "swipe_left_on_last_card", (String) null), c120985dq, null);
        }
    }

    @Override // X.C3h2
    public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        AbstractC167017dG.A1O(interfaceC38401qU, interfaceC109864xE);
        UserSession userSession = this.A0C;
        AbstractC41647Ibf.A00(EnumC39628Hem.CLEAR_MEDIA_COVER, EnumC39624Hei.A00(interfaceC109864xE), interfaceC38401qU, this.A0D, userSession, C05F.A0Y);
        AbstractC41653Ibl.A01(interfaceC38401qU, userSession);
        if (interfaceC38401qU instanceof C38321qM) {
            ((C38321qM) interfaceC38401qU).AEH(userSession);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.InterfaceC31159Dn3
    public final void D4v(InterfaceC43434JGy interfaceC43434JGy, C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb, Boolean bool, String str, String str2, float f, float f2, boolean z, boolean z2) {
        InterfaceC116925Qy interfaceC116925Qy;
        AnonymousClass317 anonymousClass317;
        EnumC37861GlG enumC37861GlG;
        UpcomingEvent A2B;
        ?? A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if ((C59942oc.A04(c120985dq) || (AbstractC166997dE.A1Z(bool, A1R) && C59942oc.A05(c120985dq))) && c38321qM != 0) {
            ArrayList A3S = c38321qM.A3S(A1R);
            if (c75113Zb != null && A3S != null && A3S.size() > A1R) {
                this.A0R.A01(c38321qM, c75113Zb, "shopping_reels_cta");
                return;
            }
        }
        UserSession userSession = this.A0C;
        C18U.A06(C06090Tz.A05, userSession, 36320588507128510L);
        if (c120985dq.A01 == EnumC129395t1.A03) {
            return;
        }
        this.A0P.A00(c120985dq, c37644Ghd, null, c2Fb, null, null, bool, null, f, f2, z, z2, false);
        if (!z) {
            if (!C18U.A06(C06090Tz.A06, userSession, 2342171363021962722L)) {
                this.A0p.A03(new MUW(Float.valueOf(f), Float.valueOf(f2), AbstractC111324zv.A00(2222), str2), c120985dq, str);
            }
            IMT imt = (IMT) this.A0k.getValue();
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A2B = c38321qM2.A2B(imt.A02)) != null) {
                imt.A03.A04(A2B, c38321qM2.getId(), "offsite_link_click", "clips_cta_bar_ads_cta");
            }
            interfaceC116925Qy = this.A0o;
            anonymousClass317 = AnonymousClass317.A08;
        } else {
            interfaceC116925Qy = this.A0o;
            anonymousClass317 = AnonymousClass317.A0G;
        }
        AbstractC37300Gc1.A11(interfaceC116925Qy, anonymousClass317, c120985dq, c37644Ghd);
        if (interfaceC43434JGy != null) {
            interfaceC43434JGy.Cvw();
        }
        EnumC37860GlF enumC37860GlF = EnumC37860GlF.A04;
        if (c75113Zb != null && c75113Zb.A0n() == A1R) {
            enumC37861GlG = EnumC37861GlG.A0Q;
        } else {
            enumC37861GlG = EnumC37861GlG.A02;
        }
        AGM(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c5, code lost:
    
        if (r0.A09() != true) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        if (r0 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0153, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc A[ADDED_TO_REGION] */
    @Override // X.InterfaceC30974DjV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D50(X.C120985dq r32, X.C38321qM r33, X.SPM r34, X.C27845CPi r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.D50(X.5dq, X.1qM, X.SPM, X.CPi, boolean, boolean):void");
    }

    @Override // X.InterfaceC31159Dn3
    public final void D53(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c120985dq, 0);
        User user = c120985dq.A0K;
        if (user != null) {
            C1YY A01 = FVI.A01();
            FragmentActivity requireActivity = this.A08.requireActivity();
            UserSession userSession = this.A0C;
            String id = user.getId();
            java.util.Set set = FE3.A00;
            A01.A03(requireActivity, userSession, new C43012J0c(2, user, this), id, "promo_reels_viewer");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5B(C120985dq c120985dq, String str, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        this.A0M.A0M(c120985dq, str, false, z);
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5N(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                this.A0y.A00(this.A08, null, null, str, FTf.A00(C07950bF.A04.A01(this.A0C, str2)));
            } catch (IOException unused) {
                C0w9.A03("ClipsMediaItemViewBinderDelegateKt", AnonymousClass001.A0R("Failed to parse json for bloks action:", str2));
            }
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void D5O(InterfaceC43434JGy interfaceC43434JGy, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        UserSession userSession;
        UpcomingEvent A2B;
        EnumC39550HdM enumC39550HdM;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        IMT imt = (IMT) this.A0k.getValue();
        InterfaceC31077DlK interfaceC31077DlK = this.A0r;
        Context context = this.A06;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (A2B = c38321qM.A2B((userSession = imt.A02))) != null && (enumC39550HdM = c37644Ghd.A0B) != null) {
            int ordinal = enumC39550HdM.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        String id = c38321qM.getId();
                        this.A0P.A00(c120985dq, c37644Ghd, null, C2Fb.A4B, null, null, null, null, -1.0f, -1.0f, false, false, false);
                        imt.A03.A04(A2B, id, "offsite_link_click", "clips_reminder_ad_cta_bar_offsite_link");
                    }
                } else {
                    imt.A00(A2B, c38321qM.getId());
                }
            } else {
                IJM ijm = new IJM(context, userSession, A2B);
                MEB meb = new MEB(34, interfaceC31077DlK, c120985dq, imt, A2B, c38321qM);
                if (!ijm.A04 && !ijm.A03) {
                    C193328hC c193328hC = ijm.A01;
                    c193328hC.A0g(new DialogInterfaceOnDismissListenerC41843Ifx(meb, 3));
                    AbstractC166987dD.A1W(c193328hC);
                } else {
                    meb.invoke();
                }
            }
        }
        if (interfaceC43434JGy != null) {
            interfaceC43434JGy.Cvw();
        }
        AGM(c120985dq, EnumC37860GlF.A03, EnumC37861GlG.A02);
    }

    @Override // X.InterfaceC30972DjT
    public final void D5r(InterfaceC102674k2 interfaceC102674k2, C38321qM c38321qM, String str, int i, boolean z) {
        ProductDetailsProductItemDictIntf Bgl;
        C38683GzO A03;
        String A00;
        long j;
        Long l;
        String str2;
        String A002;
        C4SX c4sx;
        Long A0j;
        EnumC906041v A01;
        C2Fb c2Fb;
        List BNi = interfaceC102674k2.BNi();
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A0C;
        boolean z2 = false;
        AndroidLink A032 = AbstractC905941u.A03(fragmentActivity, userSession, BNi, false);
        if (A032 != null && (A01 = AbstractC114965Hm.A01(A032)) != null) {
            String CHN = A032.CHN();
            if (CHN != null) {
                if (z) {
                    c2Fb = C2Fb.A1F;
                } else {
                    c2Fb = C2Fb.A1E;
                }
                String id = c38321qM.getId();
                if (id != null) {
                    AbstractC41776Ies.A07(fragmentActivity, userSession, A01, c2Fb, CHN, id, this.A0D.getModuleName(), AbstractC41071vF.A07(userSession, c38321qM), AbstractC41071vF.A0F(userSession, c38321qM), AbstractC41071vF.A0K(userSession, c38321qM));
                    A03 = null;
                    z2 = true;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A03 = null;
        } else {
            if (interfaceC102674k2.Bgl() != null && (Bgl = interfaceC102674k2.Bgl()) != null) {
                Product A012 = AbstractC38048Gob.A01(Bgl);
                Long.parseLong(A012.A0H);
                A03 = C128205qp.A03(userSession, A012);
                C42130Ile A0L = C1XJ.A00.A0L(fragmentActivity, userSession, this.A0D, A012, "collection_ads", null);
                A0L.A02(c38321qM.A1g(userSession), AbstractC37301Gc2.A0c(userSession, c38321qM));
                A0L.A0b = true;
                A0L.A08 = null;
                A0L.A0X = AbstractC37301Gc2.A1Z(userSession, c38321qM);
                A0L.A0a = true;
                C42130Ile.A01(A0L);
                z2 = true;
            }
            A03 = null;
        }
        CornerStyle Aru = interfaceC102674k2.Aru();
        if (z2) {
            if (Aru != null) {
                int ordinal = Aru.ordinal();
                if (ordinal != 3) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            A00 = AbstractC111324zv.A00(3213);
                        }
                    } else {
                        A00 = "tappable_rounded";
                    }
                } else {
                    A00 = "tappable_squared";
                }
            }
            A00 = null;
        } else {
            if (Aru == null) {
                A00 = AbstractC111324zv.A00(2759);
            }
            A00 = null;
        }
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), AbstractC111324zv.A00(2556));
        A0f.AAP("action", A00);
        Long valueOf = Long.valueOf(j);
        A0f.A9K("ad_id", valueOf);
        A0f.A7v("is_tappable", AbstractC31173DnH.A0d(A0f, false, "is_checkout_enabled", z2));
        if (A03 != null && (c4sx = A03.A01) != null) {
            l = c4sx.A00;
        } else {
            l = null;
        }
        A0f.A9K("merchant_id", l);
        A0f.AAP("m_pk", c38321qM.getId());
        A0f.A9K("m_t", AbstractC37302Gc3.A0U(c38321qM));
        AbstractC37300Gc1.A0i(A0f, AbstractC82733mb.A00(str));
        if (Aru != null) {
            str2 = Aru.A00;
        } else {
            str2 = null;
        }
        A0f.AAP("tile_style", str2);
        A0f.AAP("tracking_token", c38321qM.A33());
        A0f.Cht();
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_tap_collection_main_product");
        A0f2.A9K("ad_id", valueOf);
        A0f2.A7v("is_checkout_enabled", false);
        A0f2.AAP("m_pk", c38321qM.getId());
        A0f2.A9K("m_t", AbstractC37302Gc3.A0U(c38321qM));
        A0f2.AAP("tracking_token", c38321qM.A33());
        A0f2.Cht();
        if (z) {
            A002 = AbstractC111324zv.A00(2088);
        } else {
            A002 = AbstractC111324zv.A00(808);
        }
        C82713mZ A013 = C32U.A01(null, c38321qM, interfaceC60442pS, "action");
        A013.A0J(userSession, c38321qM);
        Long A003 = AbstractC82733mb.A00(str);
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A04(C5I8.A1K, AbstractC31171DnF.A0V(i));
        A0B.A04(C5I8.A1P, A003);
        A013.A0n = A0B;
        A013.A5R = A002;
        C32U.A0C(userSession, A013, c38321qM, interfaceC60442pS, null);
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "collection_main_media_tap");
        A0F.A6b = str;
        A0F.A74 = C2Fb.A1C.toString();
        C32U.A0B(userSession, A0F, c38321qM, interfaceC60442pS, C05F.A00);
    }

    @Override // X.InterfaceC31159Dn3
    public final void D68(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A16.A01(EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd, null, false);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC30975DjW
    public final void D6J(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
        AbstractC167017dG.A1P(c37644Ghd, str);
        this.A16.A01(EnumC120785dO.REELS_PREVIEW_COMMENT, c120985dq, c37644Ghd, str, false);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31159Dn3
    public final void D6O(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
        C38321qM c38321qM;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        UserSession userSession = this.A0C;
        if (C18U.A06(C06090Tz.A05, userSession, 2342165603470551407L) && (c38321qM = c120985dq.A02) != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            if (c38321qM.A38() != null) {
                AbstractC37670Gi3.A0S(SocialContextType.A05, userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu, A06);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        this.A16.A01(EnumC120785dO.REELS_SOCIAL_CONTEXT, c120985dq, c37644Ghd, str, false);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31159Dn3
    public final void D7i(ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167027dH.A0a(1, c37644Ghd, interfaceC11380iw, clipsViewerConfig, clipsViewerSource);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C41760Ieb.A00(this.A07, this.A08, clipsViewerConfig, clipsViewerSource, c120985dq, c37644Ghd, interfaceC11380iw, this.A0C, c38321qM, this.A0Z);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC144786fy
    public final void D7u(C41181vS c41181vS, AlC alC) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void D99(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C37595Ggq c37595Ggq = this.A10;
            FragmentActivity fragmentActivity = c37595Ggq.A00;
            UserSession userSession = c37595Ggq.A03;
            long j = i;
            boolean z = !c37595Ggq.A0A.A0c(c120985dq);
            String CGJ = c37595Ggq.A06.CGJ();
            String str = c37595Ggq.A09.A00;
            String str2 = c37595Ggq.A0B;
            ClipsViewerSource clipsViewerSource = c37595Ggq.A02;
            InterfaceC1119153d interfaceC1119153d = c37595Ggq.A05;
            C43072J2m c43072J2m = new C43072J2m(c120985dq, c37644Ghd, c38321qM, c37595Ggq, i);
            AbstractC25233BEq.A0y(5, CGJ, clipsViewerSource, interfaceC1119153d);
            String id = c38321qM.getId();
            if (id != null) {
                RecipeSheetParams recipeSheetParams = new RecipeSheetParams(id, CGJ, str, str2, clipsViewerSource.ordinal(), 2, j, z, false);
                C26868BtV c26868BtV = new C26868BtV();
                Bundle A05 = AbstractC31178DnM.A05(userSession);
                A05.putParcelable("arg_extra_params", recipeSheetParams);
                c26868BtV.setArguments(A05);
                c26868BtV.A03 = c43072J2m;
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A06 = fragmentActivity.getColor(AbstractC53242c7.A0D(fragmentActivity));
                A0y.A1G = !c38321qM.CdW();
                A0y.A03 = C28493Chl.A00.A06(fragmentActivity, userSession, c38321qM, false);
                A0y.A0y = true;
                A0y.A0T = c26868BtV;
                A0y.A0U = interfaceC1119153d;
                c26868BtV.A02 = A0y.A00().A02(fragmentActivity, c26868BtV);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C3h2
    public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
    }

    @Override // X.XEZ
    public final void DBQ(C120985dq c120985dq, C37644Ghd c37644Ghd, C37905Gm2 c37905Gm2) {
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        if (!A0I(c120985dq, c37644Ghd, C05F.A0Y, "double_tap")) {
            A03(null, c120985dq, c37644Ghd, c37905Gm2, A1a);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DCc(C38321qM c38321qM) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        C9C1 A0E = this.A0d.A0E();
        UserSession userSession = this.A0C;
        if (AbstractC75373a4.A09(userSession, c38321qM)) {
            if (A0E != null) {
                str = A0E.A02;
            } else {
                str = null;
            }
            ElR(c38321qM, str);
            return;
        }
        if (A0E != null) {
            boolean z = A0E.A03;
            C38943HCs c38943HCs = new C38943HCs();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean(AbstractC111324zv.A00(1040), z);
            c38943HCs.setArguments(A0b);
            c38943HCs.A00 = ViewOnClickListenerC38053Gog.A02(c38321qM, this, 66);
            AbstractC31175DnJ.A0N(userSession).A03(this.A06, c38943HCs);
            return;
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(this.A06, A0K, 2131954811);
        AbstractC25233BEq.A1F(A0K);
    }

    @Override // X.InterfaceC31073DlF
    public final void DHZ(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i, long j) {
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        AbstractC37862GlH.A05(socialContextType, userSession, c120985dq.A02, interfaceC60442pS, interfaceC43589JPu.CGJ(), interfaceC43589JPu.Amq(), str, c37644Ghd.A06(), i, j, true);
    }

    @Override // X.InterfaceC30965DjM
    public final void DIc(Integer num) {
        C14360o3.A0B(num, 0);
        this.A1J.A01(num);
        this.A07.getWindow().clearFlags(8192);
        this.A1M.A00();
        this.A1A.A0B();
    }

    @Override // X.InterfaceC31007Dk6
    public final void DIh(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String A34 = c38321qM.A34();
        if (A34 != null) {
            UserSession userSession = this.A0C;
            User A2E = c38321qM.A2E(userSession);
            AbstractC72143Ln.A00(this.A08, userSession);
            Context A0O = AbstractC166987dD.A0O(this.A07);
            String A0t = AbstractC25231BEo.A0t(A2E);
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                AbstractC55224Oeq.A04(A0O, userSession, A34, "REELS", A0t, A2u);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31007Dk6
    public final void DIi(C38321qM c38321qM) {
        String fundraiserId;
        Long l;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC39031rc B99 = c38321qM.A0C.B99();
        if (B99 != null && (fundraiserId = B99.getFundraiserId()) != null) {
            UserSession userSession = this.A0C;
            User A2E = c38321qM.A2E(userSession);
            String str = userSession.userId;
            String str2 = null;
            String str3 = null;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A0D, userSession), MSV.A00(471));
            A0f.A9K("fundraiser_id", AbstractC003100w.A0k(10, fundraiserId));
            A0f.AAP(AbstractC111324zv.A00(930), "reels_donate_pill");
            A0f.AAP("source_name", "REELS");
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A0f.A9K("source_owner_id", l);
            A0f.A9M("attributes", null);
            A0f.Cht();
            String id = c38321qM.getId();
            String A34 = c38321qM.A34();
            AbstractC72143Ln.A01 = id;
            AbstractC72143Ln.A00 = A34;
            FragmentActivity fragmentActivity = this.A07;
            if (A2E != null) {
                str2 = A2E.getId();
            }
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                AbstractC55224Oeq.A0A(fragmentActivity, userSession, fundraiserId, "REELS", str2, A2u, true);
                Context A0O = AbstractC166987dD.A0O(fragmentActivity);
                if (A2E != null) {
                    str3 = A2E.getId();
                }
                String A2u2 = c38321qM.A2u();
                if (A2u2 != null) {
                    AbstractC55224Oeq.A03(A0O, userSession, fundraiserId, "REELS", str3, A2u2);
                    AGM(C37556GgC.A01(this.A0e), EnumC37860GlF.A04, EnumC37861GlG.A0I);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC144916gB
    public final void DIm(C41181vS c41181vS, AlB alB, C144186f0 c144186f0) {
    }

    @Override // X.InterfaceC31008Dk7
    public final void DJf(C120985dq c120985dq, C37644Ghd c37644Ghd, C37526Gfi c37526Gfi, Integer num, String str, int i) {
        C120985dq c120985dq2;
        IntentAwareAdsInfoIntf A00;
        Integer Bry;
        C14360o3.A0B(c37526Gfi, 4);
        if (C18U.A06(C06090Tz.A06, this.A0C, 36319209826688080L)) {
            this.A1N.A05.A03 = false;
        }
        if (num == C05F.A15 && (A00 = c120985dq.A00()) != null && (Bry = A00.Bry()) != null) {
            c120985dq2 = this.A0O.A0A.A0F(Bry.intValue());
        } else {
            c120985dq2 = c120985dq;
        }
        int A06 = c37644Ghd.A06();
        boolean A1V = AbstractC167007dF.A1V(c120985dq2);
        if (c120985dq.A0G()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2554));
            List A01 = C42159Im7.A01(c120985dq);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                Long A0j = AbstractC25231BEo.A0j(0, ((C40971v4) it.next()).A0S);
                if (A0j != null) {
                    A1E.add(A0j);
                }
            }
            if (A0f.isSampled()) {
                IntentAwareAdsInfoIntf A002 = C42159Im7.A00(c120985dq);
                AbstractC37301Gc2.A12(A0f, A06);
                C1M1 c1m1 = c37526Gfi.A03;
                AbstractC37303Gc4.A0k(A0f, c1m1);
                AbstractC37300Gc1.A0r(A0f, c1m1.getSessionId());
                AbstractC37301Gc2.A14(A0f, A002);
                Integer BVJ = A002.BVJ();
                Long l = null;
                if (BVJ != null) {
                    l = AbstractC25229BEm.A0n(BVJ);
                }
                A0f.A9K("multi_ads_type_number", l);
                A0f.AAP("insertion_mechanism", A002.BIG());
                A0f.A9K("hscroll_seed_ad_id", AbstractC37302Gc3.A0V(AbstractC25226BEj.A1E(c120985dq2)));
                A0f.AAP("hscroll_seed_ad_tracking_token", c120985dq2.BzL(c37526Gfi.A02));
                A0f.A9K("first_hscroll_item_ad_id", (Long) AbstractC001800i.A0J(A1E));
                AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                A0f.A7v("is_seed_ad_multi_ads_eligible", Boolean.valueOf(A1V));
                A0f.AAk("ad_ids", A1E);
                A0f.Cht();
            }
            A0B(c120985dq, c120985dq2, num, "button_click", str, i);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC144846g4
    public final void DJm(C217859kI c217859kI) {
    }

    @Override // X.InterfaceC144856g5
    public final void DJo(C41181vS c41181vS, C217859kI c217859kI) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DL9(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        Integer num;
        List emptyList;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        UserSession userSession = this.A0C;
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36885252152689252L);
        Integer[] A00 = C05F.A00(2);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (1 - num.intValue() != 0) {
                    str = "unknown";
                } else {
                    str = "interested_in_this_reel";
                }
                if (str.equals(A04)) {
                    break;
                } else {
                    i++;
                }
            } else {
                num = C05F.A00;
                break;
            }
        }
        if (num.intValue() == A1R) {
            emptyList = AbstractC166987dD.A1J(new C199928sw(null, null, null, new C70936Wkf(2), null, AbstractC166997dE.A0p(this.A06, 2131964507), 0, 0, 0, A1R, false, false, A1R, A1R, A1R, false));
        } else {
            emptyList = Collections.emptyList();
        }
        int intValue = AbstractC40906IAe.A00(C18U.A04(c06090Tz, userSession, 36885252152951397L)).intValue();
        if (intValue != A1R && intValue != 0) {
            throw B4Z.A00();
        }
        int intValue2 = AbstractC40906IAe.A00(C18U.A04(c06090Tz, userSession, 36885252152951397L)).intValue();
        if (intValue2 != A1R && intValue2 != 0) {
            throw B4Z.A00();
        }
        Context context = this.A06;
        List A1Q2 = AbstractC16960so.A1Q(new C199928sw(null, context.getDrawable(R.drawable.instagram_thumb_up_pano_outline_24), null, new C49482Ltv(2, c37644Ghd, this, c120985dq), null, AbstractC166997dE.A0p(context, 2131964506), 0, 0, 0, false, false, false, A1R, false, false, false), new C199928sw(null, context.getDrawable(R.drawable.instagram_thumb_down_pano_outline_24), null, new C49482Ltv(3, c37644Ghd, this, c120985dq), null, AbstractC166997dE.A0p(context, 2131964508), 0, 0, 0, false, false, false, A1R, false, false, false));
        C14360o3.A0A(emptyList);
        ArrayList A0S = AbstractC001800i.A0S(A1Q2, emptyList);
        C8QJ c8qj = new C8QJ(context, userSession, null, false);
        c8qj.A02(A0S);
        c8qj.showAsDropDown(view, 0, (-view.getHeight()) - AbstractC166987dD.A0H(c8qj.A00().A01));
        if (AbstractC37647Ghg.A00(c120985dq)) {
            H8L A002 = AbstractC53764NqG.A00(this.A0X, userSession, this.A0J);
            ((AbstractC38017Go4) A002).A01 = c120985dq.A06();
            A002.Ck6();
            return;
        }
        C37522Gfe c37522Gfe = this.A0X;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C41771Ien.A07(c37522Gfe, userSession, c38321qM, MediaControlEventSourceEnum.A08.A00, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLC(C38321qM c38321qM) {
        String iconicHorizonWorldDeeplink;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC43580JMo CHL = c38321qM.A0C.CHL();
        if (CHL != null && (iconicHorizonWorldDeeplink = CHL.getIconicHorizonWorldDeeplink()) != null) {
            AbstractC41776Ies.A03(this.A06, iconicHorizonWorldDeeplink);
        }
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DLj(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DLk(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLy(InterfaceC109864xE interfaceC109864xE, C120985dq c120985dq) {
        C38321qM c38321qM;
        AbstractC167007dF.A1K(c120985dq, interfaceC109864xE);
        String actionUrl = interfaceC109864xE.getActionUrl();
        if (actionUrl != null && (c38321qM = c120985dq.A02) != null) {
            AbstractC59962oe abstractC59962oe = this.A08;
            if (abstractC59962oe.getActivity() != null) {
                UserSession userSession = this.A0C;
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                EnumC39628Hem A00 = EnumC39628Hem.A00(interfaceC109864xE);
                A00.A00 = actionUrl;
                AbstractC41647Ibf.A00(A00, EnumC39624Hei.A00(interfaceC109864xE), c38321qM, interfaceC60442pS, userSession, C05F.A0Y);
                Integer A01 = AbstractC28293Cdf.A01(interfaceC109864xE);
                if (A01 != null) {
                    int intValue = A01.intValue();
                    if (intValue != 0) {
                        if (intValue == 3) {
                            this.A0y.A00(abstractC59962oe, null, null, actionUrl, AbstractC41653Ibl.A00(c120985dq.A02, interfaceC60442pS.getModuleName()));
                        }
                    } else {
                        C63397SjR c63397SjR = new C63397SjR(abstractC59962oe.requireActivity(), userSession, C2Fb.A2R, actionUrl, false);
                        c63397SjR.A0E(userSession.userId);
                        AbstractC31175DnJ.A1M(interfaceC60442pS, c63397SjR);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC30976DjX
    public final void DMC(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(c37644Ghd, str);
        C37603Ggy c37603Ggy = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        c37603Ggy.A03(new MUW(valueOf, valueOf, "social_context_inline_comment_tap", (String) null), c120985dq, null);
        if (z) {
            this.A16.A01(EnumC120785dO.REELS_INLINE_COMMENT, c120985dq, c37644Ghd, str, false);
            this.A1I.A01(c120985dq, c37644Ghd);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DOx(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        A03(view, c120985dq, c37644Ghd, null, false);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DP0(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        int i;
        C75113Zb c75113Zb;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String id = c38321qM.getId();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString(AbstractC111324zv.A00(1684), id);
            UserSession userSession = this.A0C;
            AbstractC31173DnH.A1C(A0b, userSession);
            A0b.putBoolean(AbstractC111324zv.A00(85), true);
            A0b.putBoolean(AbstractC111324zv.A00(162), true);
            if (c37644Ghd != null && (c75113Zb = c37644Ghd.A0E) != null) {
                A0b.putInt(AbstractC111324zv.A00(86), c75113Zb.A03);
            }
            A0b.putBoolean(AbstractC111324zv.A00(706), false);
            A0b.putBoolean(AbstractC111324zv.A00(705), false);
            A0b.putBoolean(AbstractC111324zv.A00(1685), z);
            if (c120985dq.CdW()) {
                AbstractC151266rU.A02(A0b, userSession, c120985dq.A06());
            }
            boolean A4a = c38321qM.A4a();
            Context applicationContext = this.A07.getApplicationContext();
            if (FYF.A00(userSession).booleanValue()) {
                i = C35145Fem.A00.A01(userSession, c38321qM, false);
            } else if (BO2.A02(userSession, c38321qM)) {
                if (A4a) {
                    i = 2131976906;
                } else {
                    i = 2131969691;
                    if (C18U.A06(C06090Tz.A05, userSession, 36320820435493801L)) {
                        i = 2131969689;
                    }
                }
            } else {
                i = 2131969688;
                if (A4a) {
                    i = 2131976905;
                }
            }
            String A0p = AbstractC166997dE.A0p(applicationContext, i);
            Fragment CsT = AbstractC31412DrH.A00().A00.CsT(A0b, userSession);
            boolean z2 = CsT instanceof ENZ;
            if (z2) {
                ENZ enz = (ENZ) CsT;
                enz.A0I = new C29901DGp(43, null, c120985dq, this, c37644Ghd);
                enz.A0H = new MEB(41, null, null, this, c120985dq, c37644Ghd);
            }
            IN9 in9 = this.A0V;
            in9.A00(view, CsT, A0p, false);
            if (z2 && BO2.A01(userSession, c38321qM)) {
                C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                c189458aP.A02 = R.drawable.instagram_info_outline_16;
                c189458aP.A07 = AbstractC166997dE.A0p(this.A06, 2131969690);
                c189458aP.A0A = true;
                c189458aP.A05 = new ViewOnClickListenerC55409OjK(this, id, A0p, 7);
                C189468aQ A00 = c189458aP.A00();
                C189478aR c189478aR = in9.A03;
                if (c189478aR != null) {
                    c189478aR.A0K(A00, true);
                }
            }
            AbstractC37670Gi3.A0U(c120985dq, userSession, this.A0D, this.A0G, this.A0Z.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31073DlF
    public final void DP4(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j, boolean z) {
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String CGJ = interfaceC43589JPu.CGJ();
        String Amq = interfaceC43589JPu.Amq();
        AbstractC37862GlH.A04(SocialContextType.A0C, userSession, c120985dq.A02, interfaceC60442pS, CGJ, Amq, c37644Ghd.A06(), i, j, true, z);
    }

    @Override // X.XEZ
    public final void DQg(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        EnumC37861GlG enumC37861GlG;
        Object obj;
        C37556GgC c37556GgC;
        Fragment A09;
        View A07;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        C37583Gge c37583Gge = this.A0Q;
        if (!C37583Gge.A07(c120985dq, c37644Ghd, c37583Gge)) {
            C37556GgC c37556GgC2 = ((AbstractC37623GhI) c37583Gge).A02;
            View view = null;
            if (c37556GgC2 != null && (A07 = c37556GgC2.A07(c37556GgC2.A03())) != null) {
                obj = A07.getTag();
            } else {
                obj = null;
            }
            C3DN A00 = C3DN.A00.A00(c37583Gge.A02);
            if (A00 != null && (A09 = A00.A09()) != null) {
                view = A09.mView;
            }
            if (obj instanceof C37658Ghr) {
                c37583Gge.A0D(c120985dq, c37644Ghd, f, f2);
                c37583Gge.A07.A01(null, null, view, (C37658Ghr) obj);
                if (!c37583Gge.A08 && (c37556GgC = ((AbstractC37623GhI) c37583Gge).A02) != null) {
                    c37556GgC.A0B();
                }
                SwipeRefreshLayout swipeRefreshLayout = ((AbstractC37623GhI) c37583Gge).A00;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(false);
                }
                c37583Gge.A00 = A1R;
            }
        }
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            if (c75113Zb.A2h != A1R) {
                c75113Zb.A2h = A1R;
                C75113Zb.A00(c75113Zb, 30);
            }
            c75113Zb.A0f(false);
        }
        EnumC37860GlF enumC37860GlF = EnumC37860GlF.A03;
        if (CUN(c120985dq, c37644Ghd, f, f2)) {
            enumC37861GlG = EnumC37861GlG.A0O;
        } else {
            enumC37861GlG = EnumC37861GlG.A0N;
        }
        AGM(c120985dq, enumC37860GlF, enumC37861GlG);
        this.A0p.A03(new MUW(Float.valueOf(f), Float.valueOf(f2), "long_press", (String) null), c120985dq, "primary");
    }

    @Override // X.XEZ
    public final void DQh(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        C37583Gge c37583Gge = this.A0Q;
        if (C37583Gge.A07(c120985dq, c37644Ghd, c37583Gge)) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            EnumC37732Gj7 enumC37732Gj7 = null;
            if (c75113Zb != null) {
                enumC37732Gj7 = c75113Zb.A0n;
            }
            if (enumC37732Gj7 == EnumC37732Gj7.A02 && (clipsWatchAndBrowseData = c37583Gge.A03.A0K) != null && clipsWatchAndBrowseData.A0O == A1R) {
                boolean z = clipsWatchAndBrowseData.A0H;
                C3DN A00 = C3DN.A00.A00(c37583Gge.A02);
                if (z == A1R) {
                    if (A00 != null) {
                        A00.A0V(C05F.A04, A1R);
                    }
                    str = "collapse";
                } else {
                    if (A00 != null) {
                        A00.A0T(C05F.A0j);
                    }
                    str = "dismiss";
                }
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    UserSession userSession = c37583Gge.A04;
                    C14360o3.A0B(userSession, A1R ? 1 : 0);
                    C37635GhU.A00(userSession, c38321qM, c37583Gge.A05, "long_press", str);
                }
            }
        } else {
            C37556GgC c37556GgC = ((AbstractC37623GhI) c37583Gge).A02;
            if (c37556GgC != null) {
                c37556GgC.A0C();
            }
            SwipeRefreshLayout swipeRefreshLayout = ((AbstractC37623GhI) c37583Gge).A00;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(c37583Gge.A03.A1q);
            }
            c37583Gge.A00 = false;
            c37583Gge.A0G(c120985dq, c37644Ghd, f, f2);
        }
        if (c120985dq.CdW()) {
            this.A0p.A03(new MUW(Float.valueOf(f), Float.valueOf(f2), AbstractC111324zv.A00(1085), (String) null), c120985dq, "primary");
        }
        C75113Zb c75113Zb2 = c37644Ghd.A0E;
        if (c75113Zb2 != null && c75113Zb2.A2h) {
            c75113Zb2.A2h = false;
            C75113Zb.A00(c75113Zb2, 30);
        }
        EJo();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DS7(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C76263bW.A00.A06(this.A07, this.A0C, c38321qM);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DSD(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            AbstractC37670Gi3.A0l(userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu.CGJ(), interfaceC43589JPu.getSessionId(), i);
            if (((C25379BKw) C28493Chl.A02.getValue()).A00(this.A06, userSession, c38321qM)) {
                this.A10.A01(c120985dq, c37644Ghd, c38321qM, i, true);
            } else {
                C37855Gl9.A05(this.A08, userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu.getSessionId(), this.A0R.A00);
            }
        }
    }

    @Override // X.InterfaceC144796fz
    public final void DTK(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C84823qW c84823qW) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (X.C18U.A06(r6, r5, 36319360146480330L) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36321567759672946L) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0048, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36317393051456631L) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0153  */
    @Override // X.InterfaceC31159Dn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTo(android.view.View r31, X.C120985dq r32, X.C37644Ghd r33) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.DTo(android.view.View, X.5dq, X.Ghd):void");
    }

    @Override // X.InterfaceC31008Dk7
    public final void DU1(View view, C120985dq c120985dq, Integer num, Integer num2, String str, int i) {
        Integer num3;
        FragmentActivity fragmentActivity;
        C116875Qr c116875Qr;
        Integer num4;
        ClipsViewerSource clipsViewerSource;
        UserSession userSession = this.A0C;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36319209826688080L)) {
            this.A1N.A05.A03 = false;
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            int intValue = num.intValue();
            if (intValue != 4) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 0) {
                                throw B4Z.A00();
                            }
                            return;
                        }
                        if (num2 == C05F.A15) {
                            clipsViewerSource = ClipsViewerSource.A0Z;
                        } else {
                            clipsViewerSource = ClipsViewerSource.A0Q;
                        }
                        fragmentActivity = this.A07;
                        c116875Qr = new C116875Qr(clipsViewerSource, userSession);
                        c116875Qr.A1D = c38321qM.getId();
                        c116875Qr.A1d = true;
                        c116875Qr.A1h = false;
                        num4 = C05F.A01;
                        C14360o3.A0B(num4, 0);
                        c116875Qr.A0T = num4;
                        c116875Qr.A02(userSession, c120985dq.A06(), true);
                        AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
                    }
                    A0B(c120985dq, null, num2, "card_click", null, i);
                    return;
                }
            } else if (C18U.A06(c06090Tz, userSession, 36319209824001078L)) {
                ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.A0R;
                C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
                C39B A00 = IAQ.A00(clipsViewerSource2);
                if (A00 != null) {
                    C86833tv c86833tv = C86833tv.A00;
                    InterfaceC60442pS interfaceC60442pS = this.A0D;
                    IAR A0B = c86833tv.A0B(this.A06, userSession, A0y, A00);
                    if (A0B instanceof C72309Xb6) {
                        C71313Hs A07 = AbstractC37301Gc2.A07(userSession);
                        new C37616GhB(userSession, interfaceC60442pS).A04(view, null, null, c120985dq, null, false, true);
                        A07.A07(view, EnumC71343Hv.A0H, new String[0], 1);
                        C72309Xb6 c72309Xb6 = (C72309Xb6) A0B;
                        if (C14360o3.A0K(c72309Xb6.A0C, "cross")) {
                            num3 = C05F.A0C;
                        } else {
                            num3 = C05F.A00;
                        }
                        C116875Qr c116875Qr2 = new C116875Qr(clipsViewerSource2, userSession);
                        c116875Qr2.A1h = true;
                        c116875Qr2.A1D = A0y.getId();
                        c116875Qr2.A1d = false;
                        Integer num5 = c72309Xb6.A0B;
                        C14360o3.A0B(num5, 0);
                        c116875Qr2.A0T = num5;
                        c116875Qr2.A0Z = Integer.valueOf(c72309Xb6.A0A);
                        c116875Qr2.A01(Xjh.A00((C39448Hba) A0B));
                        C14360o3.A0B(num3, 0);
                        c116875Qr2.A0Q = num3;
                        c116875Qr2.A1E = this.A0X.getModuleName();
                        AbstractC41751IeQ.A01(this.A07, c116875Qr2, userSession, false);
                        AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0f);
                        return;
                    }
                }
            }
            fragmentActivity = this.A07;
            c116875Qr = new C116875Qr(ClipsViewerSource.A0O, userSession);
            c116875Qr.A1D = c38321qM.getId();
            c116875Qr.A1d = false;
            c116875Qr.A1h = true;
            num4 = C05F.A00;
            C14360o3.A0B(num4, 0);
            c116875Qr.A0T = num4;
            c116875Qr.A02(userSession, c120985dq.A06(), true);
            AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
        }
    }

    @Override // X.InterfaceC144806g0
    public final void DUQ(MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
    }

    @Override // X.InterfaceC144806g0
    public final void DUR(C41181vS c41181vS, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC31159Dn3
    public final void DUw(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
        C38321qM c38321qM;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        UserSession userSession = this.A0C;
        User A09 = c120985dq.A09(userSession);
        if (A09 != null) {
            if (C18U.A06(C06090Tz.A05, userSession, 2342165603470551407L) && (c38321qM = c120985dq.A02) != null) {
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                InterfaceC43589JPu interfaceC43589JPu = this.A0J;
                int A06 = c37644Ghd.A06();
                if (c38321qM.A38() != null) {
                    AbstractC37670Gi3.A0S(SocialContextType.A0A, userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu, A06);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C1571673v.A05(this.A0D, userSession, AbstractC31179DnN.A0R(userSession, A09), AbstractC111324zv.A00(3206), A09.getId());
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = new SocialContextFollowListFragmentConfig(AbstractC31565Dtq.A00(EnumC31556Dtg.A0E, A09.getId(), null, false), A09.getId());
            socialContextFollowListFragmentConfig.A01 = A09;
            socialContextFollowListFragmentConfig.A00 = i;
            socialContextFollowListFragmentConfig.A03 = A1R;
            socialContextFollowListFragmentConfig.A05 = A1R;
            socialContextFollowListFragmentConfig.A04 = A1R;
            socialContextFollowListFragmentConfig.A06 = A1R;
            ENY CsZ = AbstractC31412DrH.A00().A00.CsZ(null, userSession, socialContextFollowListFragmentConfig);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            AbstractC59962oe abstractC59962oe = this.A08;
            A0y.A06 = abstractC59962oe.requireContext().getColor(AbstractC53242c7.A0D(this.A06));
            FragmentActivity fragmentActivity = this.A07;
            A0y.A0d = AbstractC31178DnM.A0c(fragmentActivity.getApplicationContext(), A09, 2131968104);
            A0y.A0M = new ViewOnClickListenerC42030Ijz(16, c120985dq, c37644Ghd, this, A09);
            A0y.A1O = A1R;
            C14360o3.A0C(CsZ, MSV.A00(3));
            A0y.A0T = CsZ;
            AbstractC25225BEi.A1Q(A0y, A1R);
            A0y.A03 = 0.7f;
            C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type com.instagram.ui.statusbar.intf.HasTransparentStatusBar");
            ((InterfaceC60172oz) abstractC59962oe).Cen();
            A0y.A0B = AbstractC53242c7.A0H(AbstractC53172bz.A01(fragmentActivity), R.attr.status_bar_background);
            AbstractC167007dF.A0J().post(new J5Y(CsZ, A0y, this));
        }
    }

    @Override // X.InterfaceC31069DlB
    public final void DVD(MediaControlEventSourceEnum mediaControlEventSourceEnum, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM c38321qM;
        Drawable drawable;
        Drawable A02;
        C26914BuH c26914BuH;
        C14360o3.A0B(c120985dq, 0);
        C14360o3.A0B(c37644Ghd, 1);
        if (c120985dq.A02 != null) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                int A0C = this.A0O.A0A.A0C(c120985dq);
                EnumC129395t1 enumC129395t1 = c120985dq.A01;
                if (AbstractC37647Ghg.A01(enumC129395t1)) {
                    if (mediaControlEventSourceEnum.ordinal() == 5) {
                        H8L A00 = AbstractC53764NqG.A00(this.A0X, this.A0C, this.A0J);
                        ((AbstractC38017Go4) A00).A01 = c120985dq.A06();
                        CSJ csj = new CSJ(c120985dq, this, AbstractC40626Hzk.A00(mediaControlEventSourceEnum), A0C);
                        C37734Gj9 c37734Gj9 = this.A0m;
                        c37734Gj9.A00 = A00;
                        c37734Gj9.A02(this.A06, mediaControlEventSourceEnum, c75113Zb, c120985dq.A06(), csj);
                        return;
                    }
                    this.A0m.A02(this.A06, mediaControlEventSourceEnum, c75113Zb, c120985dq.A06(), null);
                    return;
                }
                int ordinal = mediaControlEventSourceEnum.ordinal();
                if ((ordinal != 5 && ordinal != 1) || (c38321qM = c120985dq.A02) == null) {
                    return;
                }
                Integer A002 = AbstractC40626Hzk.A00(mediaControlEventSourceEnum);
                InterfaceC104934o6 AoT = c38321qM.A0C.AoT();
                if (AoT == null && mediaControlEventSourceEnum == MediaControlEventSourceEnum.A05) {
                    return;
                }
                UserSession userSession = this.A0C;
                if (!C18U.A06(C06090Tz.A05, userSession, 36312170372334528L)) {
                    FragmentActivity fragmentActivity = this.A07;
                    C130175uN c130175uN = C130175uN.A00;
                    C130175uN.A00(c38321qM);
                    c130175uN.A01(fragmentActivity, userSession, c38321qM);
                    InterfaceC43589JPu interfaceC43589JPu = this.A0J;
                    String str = this.A0Z.A00;
                    AbstractC37843Gkx.A00(c120985dq.A02);
                    AbstractC37670Gi3.A0j(userSession, c38321qM, this.A0D, interfaceC43589JPu, str, A0C);
                }
                C37540Gfw c37540Gfw = this.A0M;
                String A003 = AbstractC40627Hzl.A00(A002);
                c37540Gfw.A0M(c120985dq, A003, true, false);
                A0F(c120985dq, this, A003, A0C, false);
                if (enumC129395t1 == EnumC129395t1.A0G && (c26914BuH = this.A0W) != null) {
                    C26914BuH.A01(c26914BuH, C05F.A0Y, c38321qM.getId());
                }
                if (ordinal != 5) {
                    if (ordinal != 1 || AoT == null) {
                        return;
                    }
                    FragmentActivity fragmentActivity2 = this.A07;
                    C14360o3.A0C(fragmentActivity2, AbstractC43591JPw.A00(6));
                    C3O0 By1 = ((BaseFragmentActivity) fragmentActivity2).By1();
                    Context context = this.A06;
                    String BWS = AoT.BWS();
                    String BWP = AoT.BWP();
                    String BWR = AoT.BWR();
                    String BWQ = AoT.BWQ();
                    C42689Iuk c42689Iuk = new C42689Iuk(1, A002, c38321qM, c75113Zb, mediaControlEventSourceEnum, this);
                    C14360o3.A0B(By1, 1);
                    if (BWR != null && (A02 = AbstractC65877Tvg.A02(context, BWR)) != null && (drawable = A02.mutate()) != null) {
                        AbstractC25231BEo.A0x(context, drawable, R.color.audio_bar_action_color_enabled);
                    } else {
                        drawable = null;
                    }
                    if (BWQ == null) {
                        return;
                    }
                    IMN imn = new IMN();
                    imn.A00 = 5000;
                    imn.A04 = BWS;
                    imn.A05 = BWP;
                    imn.A06 = BWQ;
                    imn.A07 = context.getString(2131976066);
                    imn.A01 = drawable;
                    imn.A03 = c42689Iuk;
                    By1.A07(imn.A00());
                    return;
                }
                Context context2 = this.A06;
                String A0p = AbstractC166997dE.A0p(context2, 2131976027);
                C36523G8v c36523G8v = new C36523G8v(3, this, c38321qM, c75113Zb, mediaControlEventSourceEnum);
                String string = context2.getString(2131966904);
                Drawable drawable2 = context2.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                if (drawable2 == null) {
                    return;
                }
                IQc.A00(context2, drawable2, c36523G8v, A0p, null, string, AbstractC53242c7.A05(context2), 5000, true);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31006Dk5
    public final void DWF(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        C37603Ggy c37603Ggy = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        c37603Ggy.A03(new MUW(valueOf, valueOf, "swipe_left_nudge", (String) null), c120985dq, null);
    }

    @Override // X.InterfaceC31006Dk5
    public final void DWG(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.CdW()) {
            C40971v4 A06 = c120985dq.A06();
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                UserSession userSession = this.A0C;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A0D, userSession), "instagram_ad_reels_nudge_impression");
                if (A0f.isSampled()) {
                    AbstractC37300Gc1.A0g(A0f, AbstractC25231BEo.A0j(0, A06.A0S));
                    AbstractC37300Gc1.A0o(A0f, c120985dq.BzL(userSession));
                    AbstractC37302Gc3.A0x(A0f, c38321qM);
                    A0f.AAP("a_pk", AbstractC37303Gc4.A0T(userSession, c38321qM));
                    A0f.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DWX(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        C37661Ghu c37661Ghu = this.A1E;
        c37661Ghu.A04 = true;
        C37661Ghu.A03(c37661Ghu, false);
        C37661Ghu.A01(c120985dq, c37661Ghu, true);
    }

    @Override // X.C3h2
    public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        AbstractC167017dG.A1O(interfaceC38401qU, interfaceC109864xE);
        if (interfaceC38401qU instanceof C38321qM) {
            UserSession userSession = this.A0C;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            EnumC39628Hem enumC39628Hem = EnumC39628Hem.OPEN_BLOKS_APP;
            enumC39628Hem.A00 = interfaceC109864xE.getActionUrl();
            AbstractC41647Ibf.A00(enumC39628Hem, EnumC39624Hei.A00(interfaceC109864xE), interfaceC38401qU, interfaceC60442pS, userSession, C05F.A0Y);
            if (interfaceC109864xE.getActionUrl() == null) {
                C0f5 AEp = C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateV2", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Action URL is null for Media Overlay Bloks Action Type.");
                AEp.report();
                return;
            }
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("media_id", ((C38321qM) interfaceC38401qU).Biw());
            A1G.put("module", interfaceC60442pS.getModuleName());
            C688938a c688938a = this.A0y;
            AbstractC59962oe abstractC59962oe = this.A08;
            String actionUrl = interfaceC109864xE.getActionUrl();
            if (actionUrl != null) {
                c688938a.A00(abstractC59962oe, null, null, actionUrl, A1G);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DXJ(C120985dq c120985dq, C40971v4 c40971v4) {
        if (c120985dq.A02 != null && c40971v4.A0f != null) {
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0W, userSession);
            c116875Qr.A1D = c40971v4.A0K.getId();
            c116875Qr.A1h = true;
            c116875Qr.A1d = false;
            Integer num = C05F.A00;
            C14360o3.A0B(num, 0);
            c116875Qr.A0T = num;
            c116875Qr.A02(userSession, c40971v4, false);
            AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
        }
    }

    @Override // X.InterfaceC144906gA
    public final void DYh(String str) {
    }

    @Override // X.XEZ
    public final void DYl(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        C14360o3.A0B(c120985dq, 0);
        this.A0p.A03(new MUW(Float.valueOf(f), Float.valueOf(f2), AbstractC111324zv.A00(2874), (String) null), c120985dq, "primary");
        if (!c120985dq.CdW()) {
            if (C18U.A06(C06090Tz.A05, this.A0C, 36325789713184114L)) {
                A0L(c120985dq, this.A0r, C05F.A15);
            }
        }
    }

    @Override // X.InterfaceC144926gC
    public final void DZT(InterfaceC41201vU interfaceC41201vU, C144506fW c144506fW) {
    }

    @Override // X.InterfaceC97544Zo
    public final void DZX() {
    }

    @Override // X.InterfaceC97544Zo
    public final void DZY(InterfaceC41201vU interfaceC41201vU, C101394gx c101394gx, InterfaceC97554Zq interfaceC97554Zq, String str, String str2, float f, int i) {
        AbstractC167017dG.A1N(interfaceC97554Zq, c101394gx);
        this.A0F.A07(c101394gx, interfaceC97554Zq, str, str2, i);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DZc(C8JW c8jw, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(c37644Ghd, c8jw);
        A05(EnumC120795dP.A0Z, c120985dq, c37644Ghd);
        Cxq(c8jw, c120985dq, c37644Ghd, false);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DZd(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        A05(EnumC120795dP.A0a, c120985dq, c37644Ghd);
        FragmentActivity fragmentActivity = this.A07;
        Context context = this.A06;
        UserSession userSession = this.A0C;
        String A0s = AbstractC25231BEo.A0s(c120985dq.A02);
        int A06 = c37644Ghd.A06();
        if (A0s != null) {
            C38926HBy c38926HBy = new C38926HBy();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("media_id", A0s);
            A0b.putInt("media_position", A06);
            C189448aO A0W = AbstractC31174DnI.A0W(A0b, c38926HBy, userSession);
            A0W.A06 = context.getColor(AbstractC53242c7.A0D(context));
            A0W.A1O = A1R;
            AbstractC25225BEi.A1Q(A0W, false);
            AbstractC31173DnH.A0w(fragmentActivity, c38926HBy, A0W);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r13 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r13 = "circle_check_pano_outline_24";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        X.C37734Gj9.A01(r5, r6, r15, r8, r9, null, X.C05F.A00, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // X.InterfaceC31069DlB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZq(com.instagram.api.schemas.MediaControlEventSourceEnum r15, X.C120985dq r16, X.C37644Ghd r17) {
        /*
            r14 = this;
            r12 = 0
            r3 = r16
            X.C14360o3.A0B(r3, r12)
            r4 = 1
            r2 = 5
            r5 = r17
            X.C14360o3.A0B(r5, r4)
            r1 = 2
            X.1qM r10 = r3.A02
            if (r10 == 0) goto L5e
            boolean r0 = X.AbstractC37647Ghg.A00(r3)
            r7 = r15
            if (r0 == 0) goto L67
            X.3Zb r8 = r5.A0E
            if (r8 == 0) goto L62
            int r0 = r15.ordinal()
            if (r0 != r2) goto L5f
            com.instagram.common.session.UserSession r2 = r14.A0C
            X.JPu r1 = r14.A0J
            X.Gfe r0 = r14.A0X
            X.H8L r1 = X.AbstractC53764NqG.A00(r0, r2, r1)
            X.1v4 r0 = r3.A06()
            r1.A01 = r0
            X.Gj9 r6 = r14.A0m
            r6.A00 = r1
        L37:
            android.content.Context r5 = r14.A06
            X.1v4 r9 = r3.A06()
            X.4o6 r1 = r9.A0E
            if (r1 == 0) goto L47
            java.lang.String r12 = r1.Bek()
            if (r12 != 0) goto L50
        L47:
            r0 = 2131973199(0x7f13544f, float:1.9583427E38)
            java.lang.String r12 = X.AbstractC166997dE.A0p(r5, r0)
            if (r1 == 0) goto L56
        L50:
            java.lang.String r13 = r1.Bej()
            if (r13 != 0) goto L58
        L56:
            java.lang.String r13 = "circle_check_pano_outline_24"
        L58:
            java.lang.Integer r11 = X.C05F.A00
            r10 = 0
            X.C37734Gj9.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L5e:
            return
        L5f:
            X.Gj9 r6 = r14.A0m
            goto L37
        L62:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L67:
            int r3 = r15.ordinal()
            if (r3 == r2) goto L82
            if (r3 == r4) goto L72
            if (r3 == r1) goto L82
            return
        L72:
            com.instagram.common.session.UserSession r0 = r14.A0C
            X.Glm r0 = X.AbstractC37876GlW.A00(r0)
            boolean r0 = r0.A01(r10)
            if (r0 == 0) goto L82
            A09(r15, r10, r14)
            return
        L82:
            X.1rF r0 = r10.A0C
            X.4o6 r6 = r0.AoT()
            com.instagram.common.session.UserSession r9 = r14.A0C
            X.Glm r1 = X.AbstractC37876GlW.A00(r9)
            java.lang.Integer r0 = X.C05F.A01
            r1.A00(r10, r0)
            X.Gfe r8 = r14.A0X
            X.JPu r0 = r14.A0J
            java.lang.String r11 = r0.getSessionId()
            X.AbstractC41705Idb.A02(r7, r8, r9, r10, r11, r12)
            X.BuH r4 = r14.A0W
            if (r4 == 0) goto Lab
            java.lang.String r1 = r10.getId()
            java.lang.Integer r0 = X.C05F.A0C
            X.C26914BuH.A02(r4, r0, r1)
        Lab:
            if (r3 != r2) goto Le0
            androidx.fragment.app.FragmentActivity r1 = r14.A07
            r0 = 2131976028(0x7f135f5c, float:1.9589165E38)
            java.lang.String r5 = r1.getString(r0)
        Lb6:
            X.C14360o3.A0A(r5)
            if (r3 != r2) goto Ld0
            java.lang.String r4 = "circle_check_pano_outline_24"
            r0 = 2130970242(0x7f040682, float:1.7549189E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        Lc4:
            android.content.Context r2 = r14.A06
            r1 = 4
            X.Iuq r0 = new X.Iuq
            r0.<init>(r1, r15, r14, r10)
            X.IQc.A01(r2, r0, r3, r5, r4)
            return
        Ld0:
            if (r6 == 0) goto Ld8
            java.lang.String r4 = r6.Bej()
            if (r4 != 0) goto Lde
        Ld8:
            r0 = 2044(0x7fc, float:2.864E-42)
            java.lang.String r4 = X.AbstractC111324zv.A00(r0)
        Lde:
            r3 = 0
            goto Lc4
        Le0:
            if (r6 == 0) goto Le8
            java.lang.String r5 = r6.Bek()
            if (r5 != 0) goto Lb6
        Le8:
            androidx.fragment.app.FragmentActivity r1 = r14.A07
            r0 = 2131957632(0x7f131780, float:1.9551853E38)
            java.lang.String r5 = X.AbstractC166997dE.A0p(r1, r0)
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.DZq(com.instagram.api.schemas.MediaControlEventSourceEnum, X.5dq, X.Ghd):void");
    }

    @Override // X.InterfaceC31159Dn3
    public final void DbS(C38321qM c38321qM, Product product) {
        C42130Ile A0L = C1XJ.A00.A0L(this.A07, this.A0C, this.A0X, product, "tags", this.A1O);
        A0L.A02(c38321qM, null);
        A0L.A0X = c38321qM.CdW();
        A0L.A0Z = true;
        C42130Ile.A01(A0L);
    }

    @Override // X.InterfaceC97664a1
    public final void DcA(PromptStickerModel promptStickerModel) {
    }

    @Override // X.InterfaceC97664a1
    public final void DcH(C8JW c8jw, C38321qM c38321qM, PromptStickerModel promptStickerModel, C8FC c8fc, List list) {
        C14360o3.A0B(c8jw, 4);
        this.A0F.A04(c8jw, c38321qM, promptStickerModel, A02(this));
    }

    @Override // X.InterfaceC97614Zw
    public final void Dct(InterfaceC41201vU interfaceC41201vU, C97624Zx c97624Zx, Wm1 wm1, int i) {
        C14360o3.A0B(c97624Zx, 3);
        this.A0F.A05(this.A0t, interfaceC41201vU, c97624Zx, wm1, i);
    }

    @Override // X.InterfaceC144896g9
    public final void Dd4(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DfU(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            AbstractC37670Gi3.A06(EnumC120795dP.A0i, BQL.A0w, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, null, A06);
        }
    }

    @Override // X.InterfaceC685936w
    public final void DiB(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        if (c75113Zb != null) {
            AnonymousClass388 anonymousClass388 = this.A0w;
            anonymousClass388.Di3(c38321qM, c75113Zb, anonymousClass388.CCt(), i);
        }
    }

    @Override // X.InterfaceC144766fw
    public final void Djf() {
    }

    @Override // X.InterfaceC144766fw
    public final void Djg(InterfaceC41201vU interfaceC41201vU) {
    }

    @Override // X.InterfaceC144766fw
    public final void Djh() {
    }

    @Override // X.InterfaceC144766fw
    public final void Dji() {
    }

    @Override // X.InterfaceC144766fw
    public final void Djj() {
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlL(View view, C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        this.A1L.A02(view, c120985dq);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlM(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A1L.A03(view, c120985dq, c37644Ghd, str, false, z);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DlO(MotionEvent motionEvent, C120985dq c120985dq) {
        String id;
        C14360o3.A0B(c120985dq, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            this.A1L.A01(motionEvent, id);
        }
    }

    @Override // X.InterfaceC30968DjP
    public final void Dlq(C38321qM c38321qM, C75113Zb c75113Zb) {
        boolean z;
        String str;
        ClipsShoppingInfoIntf Buh;
        ProductCollection Ap9;
        String str2;
        String ctaBarType;
        List list;
        C14360o3.A0B(c75113Zb, 1);
        UserSession userSession = this.A0C;
        ClipsShoppingCTABarIntf A00 = AbstractC37667Gi0.A00(c38321qM);
        if (A00 != null && (ctaBarType = A00.getCtaBarType()) != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            String str3 = this.A1O;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_reels_cta_tap");
            boolean z2 = true;
            List BSa = c38321qM.BSa();
            LinkedHashMap linkedHashMap = null;
            if (BSa != null) {
                linkedHashMap = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(BSa, 10)));
                Iterator it = BSa.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    C14360o3.A0A(A1B);
                    Long A13 = AbstractC25228BEl.A13(A1B);
                    ArrayList A3S = c38321qM.A3S(true);
                    if (A3S != null) {
                        list = AbstractC224517h.A02(AbstractC224517h.A09(JET.A00, AbstractC224517h.A04(new DHI(A1B, 19), new C0eN(A3S))));
                    } else {
                        list = C16930sl.A00;
                    }
                    linkedHashMap.put(A13, list);
                }
            }
            if (!A0f.isSampled()) {
                z2 = false;
            }
            if (z2) {
                String id = c38321qM.getId();
                if (id != null) {
                    AbstractC37300Gc1.A0l(A0f, id);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC37301Gc2.A1C(c0Zx, "prior_module", interfaceC60442pS.getModuleName(), "shopping_reels_cta");
                    AbstractC37302Gc3.A0u(A0f, c0Zx, str3);
                    A0f.AAP("cta_bar_type", ctaBarType);
                    A0f.A9M("product_merchant_ids", linkedHashMap);
                    A0f.AAk("product_ids", c38321qM.A3o());
                    AbstractC37302Gc3.A0y(A0f, c38321qM);
                    A0f.Cht();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C25531Mh A01 = C25531Mh.A01(AbstractC12220kQ.A01(interfaceC60442pS, userSession));
            if (AbstractC25226BEj.A1Z(A01)) {
                if (str3 == null) {
                    str3 = "";
                }
                A01.A0R("shopping_session_id", str3);
                A01.A0R("navigation_chain", AbstractC25225BEi.A14());
                AbstractC37303Gc4.A10(A01, interfaceC60442pS, c38321qM, "instagram_shopping_reels_cta_tap");
                A01.A0R("cta_bar_type", ctaBarType);
                A01.A0S("product_ids", c38321qM.A3o());
                A01.A0x(linkedHashMap);
                A01.Cht();
            }
        }
        InterfaceC09390do interfaceC09390do = this.A0k;
        IMT imt = (IMT) interfaceC09390do.getValue();
        UpcomingEvent A2B = c38321qM.A2B(imt.A02);
        if (A2B != null) {
            z = imt.A05.A01(A2B);
        } else {
            z = false;
        }
        ClipsShoppingCTABarIntf A002 = AbstractC37667Gi0.A00(c38321qM);
        if (A002 != null) {
            str = A002.getDestination();
        } else {
            str = null;
        }
        switch (AbstractC37667Gi0.A01(str, z).intValue()) {
            case 0:
                C225117n A04 = AbstractC224517h.A04(C43343JDk.A00, AbstractC224517h.A05(AbstractC224517h.A09(C43342JDj.A00, AbstractC001800i.A0o(AbstractC37667Gi0.A02(c38321qM)))));
                C43344JDl c43344JDl = C43344JDl.A00;
                C14360o3.A0B(c43344JDl, 1);
                List A02 = AbstractC224517h.A02(new C37488Gf6(c43344JDl, A04));
                if (A02.size() == 1) {
                    this.A0R.A00(c38321qM, c75113Zb, (User) AbstractC166987dD.A16(A02));
                    break;
                } else if (A02.size() > 1) {
                    INA ina = this.A0R;
                    UserSession userSession2 = ina.A03;
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession2);
                    FragmentActivity fragmentActivity = ina.A02;
                    AbstractC25226BEj.A1M(fragmentActivity, A0y, 2131973944);
                    C189478aR A003 = A0y.A00();
                    A003.A02(fragmentActivity, C1XJ.A00.A0T().A0G(userSession2, new HZZ(1, ina, c38321qM, c75113Zb, A003), null, ina.A05, "shopping_reels_cta", c38321qM.getId(), c38321qM.CAR(), AbstractC166987dD.A1F(A02)));
                    break;
                }
                break;
            case 1:
                this.A0R.A01(c38321qM, c75113Zb, "shopping_reels_cta");
                break;
            case 2:
                Product product = (Product) AbstractC001800i.A0J(AbstractC37667Gi0.A02(c38321qM));
                if (product != null) {
                    INA ina2 = this.A0R;
                    C42130Ile A0L = C1XJ.A00.A0L(ina2.A02, ina2.A03, ina2.A04, product, "shopping_reels_cta", ina2.A00);
                    A0L.A0O = "shopping_reels_cta";
                    A0L.A02(c38321qM, null);
                    C42130Ile.A01(A0L);
                    break;
                }
                break;
            case 3:
                INA ina3 = this.A0R;
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                if (A0u != null && (Buh = A0u.Buh()) != null && (Ap9 = Buh.Ap9()) != null) {
                    INF A0J = C1XJ.A00.A0J(ina3.A02, ina3.A03, EnumC39622HeW.A0I, ina3.A00, ina3.A04.getModuleName());
                    String Ap3 = Ap9.Ap3();
                    ProductCollectionV2Type ApF = Ap9.ApF();
                    if (ApF != null) {
                        str2 = ApF.A00;
                    } else {
                        str2 = null;
                    }
                    A0J.A01(AbstractC40733I3n.A00(str2), Ap3);
                    A0J.A07 = c38321qM.getId();
                    A0J.A0A = "shopping_reels_cta";
                    A0J.A00();
                    break;
                }
                break;
            case 4:
                if (!c75113Zb.A1t) {
                    this.A0x.A03(c38321qM, c75113Zb, "clips_cta_bar_set_online_reminder");
                    break;
                }
                break;
            case 5:
                UpcomingEvent A2B2 = c38321qM.A2B(userSession);
                if (A2B2 != null) {
                    ((IMT) interfaceC09390do.getValue()).A00(A2B2, c38321qM.getId());
                    break;
                }
                break;
        }
        AGM(C120985dq.A0d.A04(c38321qM), EnumC37860GlF.A05, EnumC37861GlG.A0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x016e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r32.A0C, 36324879179854385L) == false) goto L62;
     */
    @Override // X.XEZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dmd(android.view.View r33, X.C120985dq r34, X.C37644Ghd r35, java.lang.Float r36, java.lang.Float r37) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.Dmd(android.view.View, X.5dq, X.Ghd, java.lang.Float, java.lang.Float):void");
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn3() {
    }

    @Override // X.InterfaceC144886g8
    public final void Dn8(C41181vS c41181vS, C41629IbK c41629IbK) {
    }

    @Override // X.InterfaceC31073DlF
    public final void DnE(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, List list) {
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        AbstractC37862GlH.A06(socialContextType, userSession, c120985dq.A02, interfaceC60442pS, interfaceC43589JPu.CGJ(), interfaceC43589JPu.Amq(), list, c37644Ghd.A06(), true);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnV(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
        if (c120985dq.CdW()) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                UserSession userSession = this.A0C;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "music_cover_button_tapped");
                if (A0f.isSampled()) {
                    A0f.AAP("media_id", c38321qM.A2u());
                    A0f.AAP("ad_id", AbstractC41071vF.A07(userSession, c38321qM));
                    A0f.Cht();
                }
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    if (((C25379BKw) C28493Chl.A02.getValue()).A00(this.A06, userSession, c38321qM2)) {
                        this.A10.A01(c120985dq, c37644Ghd, c38321qM2, c37644Ghd.A06(), false);
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnW(C120985dq c120985dq, C37644Ghd c37644Ghd, int i) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        if (c120985dq.CdW()) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                UserSession userSession = this.A0C;
                InterfaceC43589JPu interfaceC43589JPu = this.A0J;
                int A06 = c37644Ghd.A06();
                AbstractC37670Gi3.A0A(EnumC120795dP.A02, BQL.A0B, userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu, A06);
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    if (((C25379BKw) C28493Chl.A02.getValue()).A00(this.A06, userSession, c38321qM2)) {
                        this.A10.A01(c120985dq, c37644Ghd, c38321qM2, c37644Ghd.A06(), false);
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC144786fy, X.InterfaceC144866g6, X.InterfaceC144876g7
    public final void Dok(View view, C41181vS c41181vS, C84823qW c84823qW) {
    }

    @Override // X.InterfaceC97664a1
    public final /* synthetic */ void DpF(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C8FC c8fc) {
    }

    @Override // X.InterfaceC31073DlF
    public final void DsY(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C37603Ggy c37603Ggy = this.A0p;
        Float valueOf = Float.valueOf(-1.0f);
        c37603Ggy.A03(new MUW(valueOf, valueOf, "testimonial_tap", (String) null), c120985dq, null);
        this.A16.A01(EnumC120785dO.TESTIMONIAL, c120985dq, c37644Ghd, null, false);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC97454Zf
    public final void DvW(View view, C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        C14360o3.A0B(view, 0);
        this.A0F.A02(view, c4zq, interfaceC41201vU, A02(this));
    }

    @Override // X.InterfaceC30945Dj2
    public final void Dva(C38321qM c38321qM, EnumC75183Zl enumC75183Zl) {
        C38321qM c38321qM2;
        Boolean bool;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, c38321qM, enumC75183Zl);
        BKZ bkz = this.A1B;
        C37560GgG c37560GgG = bkz.A07;
        C4S7 Av4 = c37560GgG.Av4();
        C45124Jxt c45124Jxt = bkz.A00;
        String str2 = null;
        if (c45124Jxt != null && (c38321qM2 = (C38321qM) c45124Jxt.A03) != null) {
            UserSession userSession = bkz.A06;
            if (Av4 != null) {
                bool = Boolean.valueOf(Av4.A00);
            } else {
                bool = null;
            }
            boolean CdW = c38321qM2.CdW();
            boolean Cff = c38321qM2.Cff();
            boolean A5A = c38321qM2.A5A();
            boolean A4T = c38321qM2.A4T();
            List CAf = c38321qM2.A0C.CAf();
            C75363a3 CFR = c38321qM2.CFR();
            User A14 = AbstractC25226BEj.A14(c38321qM2);
            if (A14 != null) {
                str = A14.getId();
            } else {
                str = null;
            }
            if (AbstractC75343a1.A09(userSession, CFR, bool, str, c38321qM2.A0C.CFX(), CAf, false, CdW, Cff, A5A, A4T) == A1R) {
                int ordinal = enumC75183Zl.ordinal();
                if (ordinal != 0) {
                    if (ordinal != A1R) {
                        throw B4Z.A00();
                    }
                    C14360o3.A0B(userSession, 0);
                    if (AbstractC75373a4.A06(userSession)) {
                        str2 = C1Q2.A02().getLanguage();
                    }
                }
                c37560GgG.A0Z(A1R, str2);
            }
        }
        for (BO6 bo6 : bkz.A08) {
            bo6.A00.A04.FCM(AbstractC167007dF.A1X(enumC75183Zl, EnumC75183Zl.A06), !r1.A03.FCM(r2, A1R));
        }
        if (AbstractC75373a4.A0B(this.A0C, c38321qM.CFR())) {
            int ordinal2 = enumC75183Zl.ordinal();
            C37560GgG c37560GgG2 = this.A0d;
            if (ordinal2 != 0) {
                c37560GgG2.A0Y(A1R);
            } else {
                c37560GgG2.A0Y(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    @Override // X.InterfaceC31159Dn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dvi(com.instagram.clips.intf.ClipsViewerConfig r15, X.C120985dq r16, X.C37644Ghd r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.Dvi(com.instagram.clips.intf.ClipsViewerConfig, X.5dq, X.Ghd):void");
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvl(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C3x9 c3x9;
        C14360o3.A0B(c120985dq, 0);
        C1ZP A00 = AbstractC40901I9z.A00();
        UserSession userSession = this.A0C;
        AbstractC59962oe abstractC59962oe = this.A08;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c3x9 = AbstractC25226BEj.A0u(c38321qM);
        } else {
            c3x9 = null;
        }
        A00.A01(requireActivity, c3x9, userSession, EnumC39549HdL.A05, null);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0d);
            EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0C;
            String A38 = c38321qM2.A38();
            if (A38 != null) {
                long parseLong = Long.parseLong(A38);
                String BHD = c38321qM2.A0C.BHD();
                String A382 = c38321qM2.A38();
                if (A382 != null) {
                    AbstractC37670Gi3.A0P(enumC39652Hih, abstractC59962oe, userSession, BHD, null, A382, parseLong);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC31069DlB
    public final void Dvm(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        String str;
        ClipsTrialDict Aog;
        String id;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            str = C38801rC.A06(id);
        } else {
            str = null;
        }
        UserSession userSession = this.A0C;
        C37522Gfe c37522Gfe = this.A0X;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        C153936w2.A04(null, AbstractC153926w1.A01(c37522Gfe, userSession, interfaceC43589JPu.CGJ()), DexOptimization.OPT_KEY_CLIENT, "self_view", "impression", str, null);
        if (view != null) {
            C37711Gim c37711Gim = this.A0U;
            String CGJ = interfaceC43589JPu.CGJ();
            C14360o3.A0B(CGJ, 2);
            if (!c37711Gim.A02) {
                C23031Ai c23031Ai = c37711Gim.A08;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A4x;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 524)) {
                    C37711Gim.A02(view, EnumC58132lV.A02, null, c37711Gim, 2131973263);
                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 524, A1R);
                    c37711Gim.A02 = A1R;
                    C153936w2.A04(null, AbstractC153926w1.A01(c37711Gim.A06, c37711Gim.A07, CGJ), DexOptimization.OPT_KEY_CLIENT, "insights_tooltip", "impression", AbstractC25231BEo.A0s(c120985dq.A02), null);
                    return;
                }
            }
        }
        if (c38321qM == null || (Aog = c38321qM.A0C.Aog()) == null || !AbstractC166997dE.A1Z(Aog.Cc9(), A1R) || ((InterfaceC19630xq) AbstractC153926w1.A00(userSession).A02.getValue()).getBoolean(MSV.A00(1671), false)) {
            return;
        }
        A04(null, c120985dq, c37644Ghd, null, A1R, A1R);
    }

    @Override // X.InterfaceC31069DlB
    public final void Dvn(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        A04(null, c120985dq, c37644Ghd, null, z, AbstractC25229BEm.A1Y(c37644Ghd));
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvv(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        OriginalSoundDataIntf BZw;
        InterfaceC88553xD c117235Si;
        MusicInfo BVc;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (BVc = A0u.BVc()) != null) {
                c117235Si = new C88543xC(BVc);
            } else {
                C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
                if (A0u2 == null || (BZw = A0u2.BZw()) == null) {
                    return;
                } else {
                    c117235Si = new C117235Si(BZw);
                }
            }
            InterfaceC88553xD interfaceC88553xD = c117235Si;
            C22P c22p = C22P.A0q;
            AudioFilterType A01 = AbstractC92574Cr.A01(AbstractC25226BEj.A0u(c38321qM));
            FragmentActivity fragmentActivity = this.A07;
            MusicAttributionConfig Cq1 = interfaceC88553xD.Cq1(AbstractC166987dD.A0O(fragmentActivity));
            Cq1.A01 = A01;
            UserSession userSession = this.A0C;
            INH A0C = AbstractC86593tX.A0C(c22p);
            A0C.A08 = Cq1;
            A0C.A0G = interfaceC88553xD.getAudioAssetId();
            AbstractC41671Ic3.A01(fragmentActivity, A0C.A00(), this.A08, c22p, userSession, true, false);
        }
    }

    @Override // X.InterfaceC144816g1
    public final void Dww(IJ3 ij3, UpcomingEvent upcomingEvent, String str) {
    }

    @Override // X.InterfaceC31069DlB
    public final void E0i(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        EnumC120795dP enumC120795dP;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            if (z) {
                enumC120795dP = EnumC120795dP.A0S;
            } else {
                enumC120795dP = EnumC120795dP.A0T;
            }
            AbstractC37670Gi3.A06(enumC120795dP, BQL.A0k, c120985dq, this.A0D, this.A0C, c38321qM, this.A0J, null, c37644Ghd.A06());
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void E0m(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            AbstractC37670Gi3.A06(EnumC120795dP.A03, BQL.A1N, c120985dq, interfaceC60442pS, userSession, c38321qM, interfaceC43589JPu, null, A06);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void E0n(C37644Ghd c37644Ghd, C38321qM c38321qM, String str) {
        String str2;
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        C14360o3.A0B(c38321qM, 0);
        AbstractC167017dG.A1P(c37644Ghd, str);
        UserSession userSession = this.A0C;
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        User A2E = c38321qM.A2E(userSession);
        Long l2 = null;
        if (A2E != null) {
            str2 = A2E.getId();
        } else {
            str2 = null;
        }
        AbstractC151386rg.A00(interfaceC60442pS, userSession, c38321qM, "reel_attribution", str2, AbstractC14490oL.A0A(this.A06));
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
        if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
            l = AbstractC166997dE.A0j(attributionAppId);
        } else {
            l = null;
        }
        User A2E2 = c38321qM.A2E(userSession);
        if (A2E2 != null) {
            l2 = AbstractC25231BEo.A0k(A2E2);
        }
        AbstractC37670Gi3.A08(EnumC120795dP.A03, BQL.A1N, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
        C35265Fh0.A05(this.A07, userSession, interfaceC60442pS.getModuleName(), str, "reel_attribution", false);
    }

    @Override // X.InterfaceC30977DjY
    public final void E32(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        EnumC37319GcL enumC37319GcL;
        C14360o3.A0B(c37644Ghd, 1);
        int ordinal = this.A0A.ordinal();
        if (ordinal != 50) {
            if (ordinal != 64) {
                enumC37319GcL = null;
            } else {
                enumC37319GcL = EnumC37319GcL.PUSH;
            }
        } else {
            enumC37319GcL = EnumC37319GcL.ACTIVITY_FEED;
        }
        A04(enumC37319GcL, c120985dq, c37644Ghd, str, z, false);
    }

    @Override // X.InterfaceC31159Dn3
    public final void EHS(JLM jlm, JMS jms, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM) {
        Long A0k;
        Long A0j;
        C14360o3.A0B(c38321qM, 2);
        if (jlm != null) {
            UserSession userSession = this.A0C;
            if (C18U.A06(C06090Tz.A05, userSession, 36326996598339819L)) {
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_lumen_recipe_sheet_impression");
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null && A0f.isSampled()) {
                    AbstractC37303Gc4.A0h(A0f, c38321qM, interfaceC60442pS.getModuleName(), AbstractC37303Gc4.A0Y(A0f, new C0Zx(), jlm, A0j));
                    AbstractC31176DnK.A1I(A0f);
                }
            }
        }
        if (jms != null) {
            UserSession userSession2 = this.A0C;
            if (C18U.A06(C06090Tz.A05, userSession2, 36326996598470893L)) {
                InterfaceC60442pS interfaceC60442pS2 = this.A0D;
                List BxN = jms.BxN();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS2, userSession2, BxN, 3), "ig_lumen_recipe_sheet_impression");
                String A2u2 = c38321qM.A2u();
                if (A2u2 != null && (A0k = AbstractC003100w.A0k(10, A2u2)) != null && A0f2.isSampled()) {
                    ArrayList A0i = AbstractC167007dF.A0i(BxN);
                    Iterator it = BxN.iterator();
                    while (it.hasNext()) {
                        AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
                    }
                    AbstractC37303Gc4.A0l(A0f2, A0k, BxN);
                    AbstractC37303Gc4.A0h(A0f2, c38321qM, interfaceC60442pS2.getModuleName(), A0i);
                    AbstractC31176DnK.A1I(A0f2);
                }
            }
        }
    }

    @Override // X.InterfaceC31013DkC
    public final void EMM(boolean z) {
        this.A0e.A0I(true);
    }

    @Override // X.InterfaceC30929Dij
    public final void EPR(C25377BKu c25377BKu, C40971v4 c40971v4) {
        C14360o3.A0B(c25377BKu, 1);
        JI9 ji9 = this.A0m.A00;
        if (ji9 instanceof AbstractC38017Go4) {
            C14360o3.A0C(ji9, "null cannot be cast to non-null type com.instagram.adsignal.afi.logger.ClipsAfiLogger");
            AbstractC38017Go4 abstractC38017Go4 = (AbstractC38017Go4) ji9;
            if (abstractC38017Go4.A01 != null && !C14360o3.A0K(abstractC38017Go4.A07(), c40971v4)) {
                ((AbstractC37585Ggg) abstractC38017Go4).A00 = AbstractC167017dG.A0j();
            }
            abstractC38017Go4.A01 = c40971v4;
            abstractC38017Go4.A00 = c25377BKu;
        }
    }

    @Override // X.InterfaceC43585JPa
    public final void Ekf(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC43432JGw
    public final void ElR(C38321qM c38321qM, String str) {
        if (this.A0d.A0E() != null) {
            A0G(c38321qM, this, str, false, true);
        }
    }

    @Override // X.InterfaceC43585JPa
    public final void ElW(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb, VG2 vg2, String str) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        C14360o3.A0B(seekBar, 0);
        C37582Ggd c37582Ggd = this.A1A;
        if (z) {
            UserSession userSession = c37582Ggd.A08;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36317620685378986L) && (scrubberPreviewThumbnailView = c37582Ggd.A05) != null) {
                scrubberPreviewThumbnailView.A00(i, seekBar.getMax());
            }
            C37556GgC c37556GgC = this.A0e;
            C120985dq A09 = c37556GgC.A09(c37556GgC.A03());
            if (A09 != null) {
                AGM(A09, EnumC37860GlF.A09, EnumC37861GlG.A0f);
                if (A09.CdW()) {
                    this.A17.A02 = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0 != null) goto L10;
     */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStartTrackingTouch(android.widget.SeekBar r9) {
        /*
            r8 = this;
            r6 = 0
            X.C14360o3.A0B(r9, r6)
            X.GgG r1 = r8.A0d
            java.lang.String r0 = "seek"
            r7 = 0
            r1.A0S(r7, r0, r6, r6)
            X.Ggd r3 = r8.A1A
            com.instagram.common.session.UserSession r2 = r3.A08
            X.0Tz r4 = X.AbstractC25225BEi.A0j(r2, r6)
            r0 = 36317620685378986(0x8106af000a15aa, double:3.030747788529631E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L7f
            X.GgC r1 = r3.A02
            r5 = 0
            if (r1 == 0) goto Ld2
            int r0 = r3.A00
            android.view.View r4 = r1.A07(r0)
            if (r4 == 0) goto Ld3
            r0 = 2057(0x809, float:2.882E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.view.View r0 = r4.findViewWithTag(r0)
            com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView r0 = (com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView) r0
            if (r0 == 0) goto Ld3
        L3a:
            r3.A05 = r0
            X.GgC r0 = r3.A02
            if (r0 == 0) goto Ld0
            X.5dq r1 = X.C37556GgC.A01(r0)
            if (r1 == 0) goto Ld0
            X.2oc r0 = X.AbstractC25470BOj.A00
            boolean r2 = r0.A0J(r1, r2)
            if (r2 == 0) goto L61
            if (r4 == 0) goto L5f
            r0 = 2056(0x808, float:2.881E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.view.View r0 = r4.findViewWithTag(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            if (r0 == 0) goto L5f
            r5 = r0
        L5f:
            r3.A04 = r5
        L61:
            com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView r1 = r3.A05
            if (r1 == 0) goto L7f
            if (r2 == 0) goto L6e
            X.J13 r0 = new X.J13
            r0.<init>(r3)
            r1.A03 = r0
        L6e:
            r1.setVisibility(r6)
            com.instagram.common.ui.base.IgTextView r0 = r3.A04
            if (r0 == 0) goto L78
            r0.setVisibility(r6)
        L78:
            X.3a3 r0 = r3.A06
            if (r0 == 0) goto L7f
            r1.A01(r0)
        L7f:
            r0 = 1
            r8.A0H(r0)
            X.GgC r3 = r8.A0e
            int r0 = r3.A03()
            android.view.View r0 = r3.A07(r0)
            r2 = 0
            if (r0 == 0) goto Lce
            java.lang.Object r1 = r0.getTag()
        L94:
            boolean r0 = r1 instanceof X.C37658Ghr
            if (r0 == 0) goto Lcc
            X.Ghr r1 = (X.C37658Ghr) r1
        L9a:
            X.GgX r0 = r8.A1M
            r0.A01(r2, r2, r2, r1)
            X.5dq r0 = X.C37556GgC.A01(r3)
            if (r0 == 0) goto Lcb
            X.1qM r5 = r0.A02
            boolean r0 = r0.CdW()
            if (r0 == 0) goto Lcb
            if (r5 == 0) goto Lcb
            X.GkV r4 = r8.A17
            long r0 = java.lang.System.currentTimeMillis()
            r4.A01 = r0
            r4.A02 = r6
            int r0 = r9.getProgress()
            double r2 = (double) r0
            int r0 = r9.getMax()
            double r0 = (double) r0
            double r2 = r2 / r0
            double r0 = r5.A0l()
            double r0 = r0 * r2
            r4.A00 = r0
        Lcb:
            return
        Lcc:
            r1 = r2
            goto L9a
        Lce:
            r1 = r2
            goto L94
        Ld0:
            r2 = 0
            goto L61
        Ld2:
            r4 = r7
        Ld3:
            r0 = r7
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.onStartTrackingTouch(android.widget.SeekBar):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r21.A0O.A0A.C09(r3).A0R == false) goto L24;
     */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopTrackingTouch(android.widget.SeekBar r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    public static String A02(C37675GiC c37675GiC) {
        return c37675GiC.A0J.CGJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0229, code lost:
    
        if (r40.A02 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(android.view.View r39, X.C120985dq r40, X.C37644Ghd r41, X.C37905Gm2 r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.A03(android.view.View, X.5dq, X.Ghd, X.Gm2, boolean):void");
    }

    private final void A04(EnumC37319GcL enumC37319GcL, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z, boolean z2) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A0C;
            FragmentActivity fragmentActivity = this.A07;
            TrialMetricsData trialMetricsData = new TrialMetricsData(AbstractC167017dG.A0K(c38321qM.A0C.Bdm()), c38321qM.A0w(), c38321qM.A0s(), c38321qM.A12());
            String A02 = A02(this);
            AbstractC59962oe abstractC59962oe = this.A08;
            boolean A4a = c38321qM.A4a();
            D8J d8j = new D8J(37, c37644Ghd, c38321qM);
            C14360o3.A0B(A02, 4);
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A1O = true;
                HC0 hc0 = new HC0();
                hc0.setArguments(AbstractC61636Rr0.A00(AbstractC166987dD.A1L("TRIAL_MEDIA_ID_KEY", A2u), AbstractC166987dD.A1L(MSV.A00(857), trialMetricsData), AbstractC166987dD.A1L("SESSION_ID_KEY", A02), AbstractC166987dD.A1L(MSV.A00(858), Boolean.valueOf(z)), AbstractC166987dD.A1L(MSV.A00(353), str), AbstractC166987dD.A1L(MSV.A00(352), enumC37319GcL), AbstractC166987dD.A1L(MSV.A00(786), Boolean.valueOf(z2)), AbstractC166987dD.A1L(MSV.A00(853), Boolean.valueOf(A4a))));
                hc0.A03 = new C29901DGp(27, abstractC59962oe, hc0, userSession, c38321qM);
                hc0.A04 = d8j;
                AbstractC31173DnH.A0w(fragmentActivity, hc0, A0y);
            }
        }
    }

    private final void A05(EnumC120795dP enumC120795dP, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            Long l2 = null;
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            }
            AbstractC37670Gi3.A08(enumC120795dP, BQL.A0b, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A09(MediaControlEventSourceEnum mediaControlEventSourceEnum, C38321qM c38321qM, C37675GiC c37675GiC) {
        UserSession userSession = c37675GiC.A0C;
        AbstractC37876GlW.A00(userSession).A00(c38321qM, C05F.A0N);
        AbstractC41705Idb.A02(mediaControlEventSourceEnum, c37675GiC.A0X, userSession, c38321qM, c37675GiC.A0J.getSessionId(), true);
    }

    public static final void A0A(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, C37675GiC c37675GiC, Integer num, Long l) {
        if (c120985dq != null && c37644Ghd != null && l != null && num != null) {
            InterfaceC60442pS interfaceC60442pS = c37675GiC.A0D;
            UserSession userSession = c37675GiC.A0C;
            InterfaceC43589JPu interfaceC43589JPu = c37675GiC.A0J;
            String CGJ = interfaceC43589JPu.CGJ();
            String Amq = interfaceC43589JPu.Amq();
            AbstractC37862GlH.A03(socialContextType, userSession, c120985dq.A02, interfaceC60442pS, CGJ, Amq, c37644Ghd.A06(), num.intValue(), l.longValue(), true);
        }
    }

    private final void A0B(C120985dq c120985dq, C120985dq c120985dq2, Integer num, String str, String str2, int i) {
        ClipsViewerSource clipsViewerSource;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf;
        String id;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            if (num == C05F.A15) {
                clipsViewerSource = ClipsViewerSource.A0Y;
            } else {
                clipsViewerSource = ClipsViewerSource.A0P;
            }
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, userSession);
            c116875Qr.A1D = c38321qM.getId();
            c116875Qr.A1h = false;
            c116875Qr.A1d = false;
            Integer num2 = C05F.A0C;
            C14360o3.A0B(num2, 0);
            c116875Qr.A0T = num2;
            c116875Qr.A18 = AbstractC25226BEj.A1E(c120985dq);
            c116875Qr.A02(userSession, c120985dq.A06(), true);
            boolean equals = str.equals("card_click");
            IntentAwareAdsInfoIntf intentAwareAdsInfoIntf2 = null;
            if (equals) {
                intentAwareAdsInfoIntf = c120985dq.A00();
            } else if (c120985dq2 != null) {
                intentAwareAdsInfoIntf = c120985dq2.A00();
            } else {
                intentAwareAdsInfoIntf = null;
            }
            c116875Qr.A0D = intentAwareAdsInfoIntf;
            c116875Qr.A0D = c120985dq.A00();
            if (equals) {
                intentAwareAdsInfoIntf2 = c120985dq.A00();
            } else if (c120985dq2 != null) {
                intentAwareAdsInfoIntf2 = c120985dq2.A00();
            }
            c116875Qr.A0D = intentAwareAdsInfoIntf2;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36319209826688080L)) {
                c116875Qr.A1i = true;
                c116875Qr.A05 = i;
            }
            if ((equals && C18U.A06(c06090Tz, userSession, 36319209827736668L)) || (str.equals("button_click") && C14360o3.A0K(str2, "see_all"))) {
                ArrayList A1E = AbstractC166987dD.A1E();
                List<C40971v4> A01 = C42159Im7.A01(c120985dq);
                if (A01 != null) {
                    for (C40971v4 c40971v4 : A01) {
                        C3YT A00 = C3YS.A00(userSession);
                        C38321qM c38321qM2 = c40971v4.A0K;
                        if (!A00.A05(c38321qM2) && (id = c38321qM2.getId()) != null) {
                            A1E.add(id);
                        }
                    }
                }
                c116875Qr.A0B = ImmutableList.copyOf((Collection) A1E);
                c116875Qr.A0t = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A1E, JEU.A00);
            }
            AbstractC41751IeQ.A01(fragmentActivity, c116875Qr, userSession, false);
        }
    }

    private final void A0C(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        String str;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null) {
                String A0j = AbstractC167017dG.A0j();
                String A0j2 = AbstractC167017dG.A0j();
                InterfaceC84063oq Adx = A0u.Adx();
                Long A04 = AbstractC117245Sj.A04(A0u);
                if (A04 != null) {
                    InterfaceC60442pS interfaceC60442pS = this.A0D;
                    UserSession userSession = this.A0C;
                    EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0G;
                    long longValue = A04.longValue();
                    C38321qM c38321qM2 = c120985dq.A02;
                    long A06 = c37644Ghd.A06();
                    String A02 = A02(this);
                    String str2 = this.A0Z.A00;
                    C8JW c8jw = C8JW.A09;
                    if (Adx != null) {
                        str = Adx.getBestAudioClusterId();
                    } else {
                        str = null;
                    }
                    AbstractC37670Gi3.A0K(enumC39652Hih, c8jw, interfaceC60442pS, userSession, c38321qM2, this.A0G, Boolean.valueOf(AbstractC76643c9.A0H(userSession, c38321qM)), Boolean.valueOf(AbstractC76643c9.A0K(c38321qM)), Boolean.valueOf(AbstractC37302Gc3.A1b(c38321qM)), null, A0j, A02, str2, A0j2, str, null, longValue, A06);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A0D(C120985dq c120985dq, C37644Ghd c37644Ghd, C37675GiC c37675GiC, Long l) {
        if (c120985dq != null && c37644Ghd != null && l != null) {
            InterfaceC60442pS interfaceC60442pS = c37675GiC.A0D;
            UserSession userSession = c37675GiC.A0C;
            C38321qM c38321qM = c120985dq.A02;
            long longValue = l.longValue();
            c37644Ghd.A06();
            AbstractC37862GlH.A07(userSession, c38321qM, interfaceC60442pS, longValue, true);
        }
    }

    private final void A0E(C120985dq c120985dq, C65 c65, C75113Zb c75113Zb, User user, Float f, Float f2, String str, boolean z) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A0C;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C42548IsR c42548IsR = new C42548IsR(c120985dq, userSession, c75113Zb, user);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                boolean A2N = A2E.A2N();
                int position = c75113Zb.getPosition();
                ClipsViewerConfig clipsViewerConfig = this.A09;
                C32U.A0J(userSession, c42548IsR, c65, c120985dq, interfaceC60442pS, this.A0J, f, f2, null, null, str, clipsViewerConfig.A14, clipsViewerConfig.A15, clipsViewerConfig.A19, position, A2N, z);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (X.C14360o3.A0K(r0.getId(), r5.getId()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.C38321qM r5, X.C37675GiC r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            X.GgG r0 = r6.A0d
            X.9C1 r3 = r0.A0E()
            if (r3 == 0) goto L97
            X.MVS r2 = r6.A0L
            boolean r0 = r2.A02
            if (r0 == 0) goto L20
            X.1qM r0 = r2.A00
            if (r0 == 0) goto La2
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r5.getId()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L3a
        L20:
            java.lang.Object r0 = r3.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AbstractC001800i.A0X(r0)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1F(r0)
            X.05A r0 = r2.A04
            r0.Egh(r1)
            r0 = 1
            r2.A02 = r0
            r2.A00 = r5
            X.Gfe r0 = r6.A0X
            r2.A01 = r0
        L3a:
            X.HBt r3 = new X.HBt
            r3.<init>()
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            X.0UO r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = X.AbstractC166987dD.A1F(r0)
            r1 = 0
            r0 = 0
            r2.add(r1, r0)
            java.lang.String r0 = "selected_audio_language_key"
            r4.putString(r0, r7)
            java.lang.String r0 = "available_audio_languages_key"
            r4.putStringArrayList(r0, r2)
            java.lang.String r1 = r5.A2u()
            java.lang.String r0 = "media_id"
            r4.putString(r0, r1)
            java.lang.String r0 = "is_self_view"
            r4.putBoolean(r0, r9)
            r3.setArguments(r4)
            X.J2Z r0 = new X.J2Z
            r0.<init>(r6)
            r3.A01 = r0
            com.instagram.common.session.UserSession r0 = r6.A0C
            X.8aO r2 = X.AbstractC25225BEi.A0y(r0)
            android.content.Context r1 = r6.A06
            r0 = 2131972090(0x7f134ffa, float:1.9581178E38)
            X.AbstractC25226BEj.A1M(r1, r2, r0)
            if (r8 == 0) goto L98
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r6.A07
            X.3DN r0 = r1.A00(r0)
            X.8aR r0 = X.F86.A00(r0)
            if (r0 == 0) goto L97
            r0.A0F(r3, r2)
        L97:
            return
        L98:
            X.8aR r1 = r2.A00()
            androidx.fragment.app.FragmentActivity r0 = r6.A07
            r1.A02(r0, r3)
            return
        La2:
            java.lang.String r0 = "media"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.A0G(X.1qM, X.GiC, java.lang.String, boolean, boolean):void");
    }

    private final void A0H(boolean z) {
        C37644Ghd A01;
        C75113Zb c75113Zb;
        C120985dq A012 = C37556GgC.A01(this.A0e);
        AbstractC59962oe abstractC59962oe = this.A08;
        if ((abstractC59962oe instanceof C59952od) && A012 != null && (A01 = ((C59952od) abstractC59962oe).A0M().A01(A012)) != null && (c75113Zb = A01.A0E) != null && c75113Zb.A23 != z) {
            c75113Zb.A23 = z;
        }
        if (z && A012 != null) {
            AGM(A012, EnumC37860GlF.A09, EnumC37861GlG.A0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5.A0E != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0I(X.C120985dq r8, X.C37644Ghd r9, java.lang.Integer r10, java.lang.String r11) {
        /*
            r7 = this;
            com.instagram.clips.intf.ClipsViewerConfig r4 = r7.A09
            boolean r0 = r4.A00()
            r2 = 0
            if (r0 == 0) goto L68
            X.3Zb r6 = r9.A0E
            r1 = 0
            if (r6 == 0) goto L62
            X.Gj7 r3 = r6.A0n
        L10:
            X.Gj7 r0 = X.EnumC37732Gj7.A03
            if (r3 == r0) goto L68
            com.instagram.clips.intf.ClipsWatchAndBrowseData r5 = r4.A0K
            r4 = 1
            if (r5 == 0) goto L1e
            boolean r3 = r5.A0E
            r0 = 1
            if (r3 == 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.String r3 = "double_tap"
            if (r0 != 0) goto L64
            if (r6 == 0) goto L27
            X.Gj7 r1 = r6.A0n
        L27:
            X.Gj7 r0 = X.EnumC37732Gj7.A02
            if (r1 != r0) goto L68
            if (r5 == 0) goto L52
            boolean r0 = r5.A0O
            if (r0 == 0) goto L64
            boolean r0 = r5.A0H
            if (r0 != r4) goto L52
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto L44
            java.lang.Integer r0 = X.C05F.A04
            r1.A0V(r0, r4)
        L44:
            java.lang.String r3 = "collapse"
        L46:
            X.1qM r2 = r8.A02
            if (r2 == 0) goto L51
            com.instagram.common.session.UserSession r1 = r7.A0C
            X.2pS r0 = r7.A0D
            X.C37635GhU.A00(r1, r2, r0, r11, r3)
        L51:
            return r4
        L52:
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r7.A07
            X.3DN r0 = r1.A00(r0)
            if (r0 == 0) goto L5f
            r0.A0T(r10)
        L5f:
            java.lang.String r3 = "dismiss"
            goto L46
        L62:
            r3 = r1
            goto L10
        L64:
            boolean r2 = r11.equals(r3)
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.A0I(X.5dq, X.Ghd, java.lang.Integer, java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0K(View view, C120985dq c120985dq, C75113Zb c75113Zb, User user, boolean z, boolean z2) {
        int A1U = AbstractC167007dF.A1U(user);
        if (c120985dq.CdW()) {
            UserSession userSession = this.A0C;
            C71313Hs A07 = AbstractC37301Gc2.A07(userSession);
            new C37616GhB(userSession, this.A0D).A04(view, null, null, c120985dq, null, A1U, z2);
            A07.A07(view, EnumC71343Hv.A0N, new String[A1U], A1U);
        }
        if (z) {
            A0E(c120985dq, C76493bt.A01(c120985dq), c75113Zb, user, null, null, "swipe_left", z2);
        }
    }

    @Override // X.JI8
    public final void AGM(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        this.A1F.AGM(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31138Dmd
    public final void ARt(boolean z) {
        C37556GgC c37556GgC = this.A0e;
        if (z) {
            c37556GgC.A0C();
        } else {
            if (c37556GgC.A0A() != C05F.A00) {
                return;
            }
            c37556GgC.A0B();
        }
    }

    @Override // X.InterfaceC31013DkC
    public final C120985dq AoJ(int i) {
        return this.A0O.A0A.A0G(i);
    }

    @Override // X.AnonymousClass372
    public final C39G Ar3() {
        return (C39G) AbstractC166987dD.A17(this.A0j);
    }

    @Override // X.JI2
    public final CUJ As5() {
        return this.A0T.As5();
    }

    @Override // X.JI8
    public final long BYI() {
        return this.A1F.BYI();
    }

    @Override // X.JI2
    public final int BmI(C120985dq c120985dq) {
        return this.A0T.BmI(c120985dq);
    }

    @Override // X.C37B
    public final InterfaceC31076DlJ C56() {
        return this.A0a;
    }

    @Override // X.AnonymousClass371
    public final InterfaceC692739n C9D() {
        return this.A0b;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC43585JPa
    public final void CMs(C38321qM c38321qM, C75113Zb c75113Zb, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        int i2 = i;
        C120985dq A02 = C128085qc.A02(c38321qM);
        int A0C = this.A0O.A0A.A0C(A02);
        ?? obj = new Object();
        if (A0C != -1) {
            str3 = "three_dot_menu";
            A0F(A02, this, "three_dot_menu", A0C, z);
        } else {
            str3 = "on_impression";
        }
        obj.A00 = str3;
        if (str != null) {
            Context context = this.A06;
            C42700Iuv c42700Iuv = new C42700Iuv(c38321qM, c75113Zb, this, obj, z2);
            if (i == 0) {
                i2 = R.drawable.instagram_eye_off_pano_outline_24;
            }
            Drawable drawable = context.getDrawable(i2);
            if (drawable != null) {
                IQc.A00(context, drawable, c42700Iuv, str, str2, null, AbstractC53242c7.A05(context), 5000, true);
            }
        }
    }

    @Override // X.JI2
    public final boolean CST(C120985dq c120985dq) {
        return this.A0T.CST(c120985dq);
    }

    @Override // X.XEZ
    public final boolean CYD() {
        return this.A0Q.A00;
    }

    @Override // X.JI2
    public final boolean Cax(C120985dq c120985dq) {
        return this.A0T.Cax(c120985dq);
    }

    @Override // X.JI8
    public final void Co0(C120985dq c120985dq) {
        this.A1F.Co0(c120985dq);
    }

    @Override // X.InterfaceC31159Dn3
    public final boolean Com(View view) {
        C37711Gim c37711Gim = this.A0U;
        if (!c37711Gim.A02) {
            C23031Ai c23031Ai = c37711Gim.A08;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A4w;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 444)) {
                C37711Gim.A03(view, c37711Gim, 2131973262);
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 444, true);
                c37711Gim.A02 = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.JIE
    public final void CvD() {
        C38321qM c38321qM;
        C120985dq c120985dq = this.A01;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            AnonymousClass388 anonymousClass388 = this.A0w;
            anonymousClass388.Di3(c38321qM, A0E, anonymousClass388.CCt(), A0E.getPosition());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIE
    public final void Cvx() {
        Integer num;
        C75113Zb c75113Zb;
        C120985dq c120985dq;
        C38321qM c38321qM;
        int A0C;
        this.A0N.A00();
        UserSession userSession = this.A0C;
        if (C18U.A06(C06090Tz.A05, userSession, 36319360147266773L) && (c120985dq = this.A01) != null && (c38321qM = c120985dq.A02) != null && !c120985dq.A0G() && AbstractC37301Gc2.A1Y(userSession, c38321qM) && (A0C = this.A0O.A0A.A0C(c120985dq)) != -1) {
            A0F(c120985dq, this, "three_dot_menu", A0C, false);
        }
        C37644Ghd c37644Ghd = this.A05;
        if (c37644Ghd != null && (c75113Zb = c37644Ghd.A0E) != null) {
            num = c75113Zb.A10;
        } else {
            num = null;
        }
        if (num != C05F.A00 && C18U.A06(C06090Tz.A06, userSession, 36315541921402250L)) {
            EkF(false);
        }
    }

    @Override // X.JIE
    public final void Cvy() {
        C37661Ghu.A03(this.A0N.A00, false);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CxK(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        InterfaceC84063oq interfaceC84063oq;
        Long l;
        String str;
        C38321qM c38321qM;
        String str2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM2);
            String A0j = AbstractC167017dG.A0j();
            String A0j2 = AbstractC167017dG.A0j();
            if (A0u != null) {
                interfaceC84063oq = A0u.Adx();
                l = AbstractC117245Sj.A04(A0u);
            } else {
                interfaceC84063oq = null;
                l = null;
            }
            C37671Gi4.A00(this.A0c, C05F.A01);
            this.A0E.A02();
            boolean z = !this.A0d.A0c(c120985dq);
            String str3 = c120985dq.A0Q;
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A0C;
            String str4 = this.A0f;
            if (str4 == null) {
                str4 = c120985dq.A0D();
            }
            String str5 = this.A0g;
            if (str5 == null) {
                str5 = str3;
            }
            if (interfaceC84063oq != null) {
                str = interfaceC84063oq.getBestAudioClusterId();
            } else {
                str = null;
            }
            AbstractC37834Gko.A00(fragmentActivity, null, c120985dq, userSession, c38321qM2, A0j, str4, str5, str3, str, A0j2, z);
            if (l != null && (c38321qM = c120985dq.A02) != null) {
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0E;
                long longValue = l.longValue();
                long A06 = c37644Ghd.A06();
                String A02 = A02(this);
                String str6 = this.A0Z.A00;
                C8JW c8jw = C8JW.A08;
                if (interfaceC84063oq != null) {
                    str2 = interfaceC84063oq.getBestAudioClusterId();
                } else {
                    str2 = null;
                }
                AbstractC37670Gi3.A0K(enumC39652Hih, c8jw, interfaceC60442pS, userSession, c38321qM, this.A0G, Boolean.valueOf(AbstractC76643c9.A0H(userSession, c120985dq.A02)), Boolean.valueOf(AbstractC76643c9.A0K(c38321qM2)), Boolean.valueOf(AbstractC37302Gc3.A1b(c38321qM2)), l, A0j, A02, str6, A0j2, str2, null, longValue, A06);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxs(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        this.A0z.A00(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Cxv() {
        this.A0d.A0K(-3);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyR(C51757Mtg c51757Mtg) {
        BKZ bkz = this.A1B;
        try {
            C45124Jxt c45124Jxt = bkz.A00;
            if (c45124Jxt != null) {
                UserSession userSession = bkz.A06;
                if (AbstractC75343a1.A0A(userSession, ((C38321qM) c45124Jxt.A03).CFR(), ((C38321qM) c45124Jxt.A03).A0C.CAf()) && C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36322860545026757L)) {
                    return;
                }
                if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                    C0w9.A01(EnumC12410kj.A03, "ClipsVideoSubtitlesController::onAutoTranslatedAttributionClick", "Before UI handler post");
                }
                bkz.A03.post(new RunnableC43137J5a(c45124Jxt, c51757Mtg, bkz));
            }
        } catch (Exception e) {
            EnumC12410kj enumC12410kj = EnumC12410kj.A03;
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to load context menu";
            }
            C0w9.A01(enumC12410kj, "ClipsVideoSubtitlesController::onAutoTranslatedAttributionClick", message);
        }
    }

    @Override // X.InterfaceC144836g3
    public final void D2p(C38321qM c38321qM, InterfaceC144306fC interfaceC144306fC, C144296fB c144296fB, C84823qW c84823qW) {
        C38X c38x = this.A0F;
        String A02 = A02(this);
        C14360o3.A0B(A02, 4);
        C24012Akq A0A = c84823qW.A0A();
        if (A0A != null) {
            FragmentActivity fragmentActivity = c38x.A01;
            UserSession userSession = c38x.A02;
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                String A022 = A0A.A02();
                ChatStickerChannelType chatStickerChannelType = A0A.A00.A03;
                if (chatStickerChannelType == null) {
                    chatStickerChannelType = ChatStickerChannelType.A07;
                }
                FAV.A00(fragmentActivity, userSession, c144296fB, A2u, A022, chatStickerChannelType.A00, J82.A00, A0A.A00(), true);
                AbstractC37670Gi3.A0a(c38x.A03, userSession, c38321qM, AbstractC111324zv.A00(229), ReelTappableObjectType.A0C.A00, A02);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31073DlF
    public final void D6N(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i, long j) {
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String CGJ = interfaceC43589JPu.CGJ();
        String Amq = interfaceC43589JPu.Amq();
        AbstractC37862GlH.A04(SocialContextType.A05, userSession, c120985dq.A02, interfaceC60442pS, CGJ, Amq, c37644Ghd.A06(), i, j, true, true);
        this.A16.A01(EnumC120785dO.REELS_SOCIAL_CONTEXT_BUBBLE, c120985dq, c37644Ghd, str, false);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC43436JHa
    public final void DGJ(C75113Zb c75113Zb) {
        InterfaceC43436JHa interfaceC43436JHa;
        C38Y c38y = this.A0Q;
        if ((c38y instanceof InterfaceC43436JHa) && (interfaceC43436JHa = (InterfaceC43436JHa) c38y) != null) {
            interfaceC43436JHa.DGJ(c75113Zb);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DLz(InterfaceC109094vY interfaceC109094vY, C120985dq c120985dq) {
        C38321qM c38321qM;
        if (interfaceC109094vY != null && BFB.A03(interfaceC109094vY) == C05F.A00 && (c38321qM = c120985dq.A02) != null) {
            AbstractC41647Ibf.A02(c38321qM, this.A0D, this.A0C, C05F.A0Y);
        }
    }

    @Override // X.InterfaceC31009Dk8
    public final void DMM(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str.startsWith(AbstractC43591JPw.A00(40))) {
            AbstractC70160WDy.A03(this.A0C, this.A06, str);
        } else {
            AbstractC41776Ies.A03(this.A06, str);
        }
        UserSession userSession = this.A0C;
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        String A04 = AbstractC12880la.A04(AbstractC25225BEi.A0F(userSession));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, AbstractC111324zv.A00(714));
        if (str3 == null) {
            str3 = "";
        }
        A0f.AAP("metric", str3);
        AbstractC31171DnF.A1C(A0f, AbstractC111324zv.A00(1890));
        String str7 = str4;
        if (str4 == null) {
            str7 = "";
        }
        A0f.AAP("media_id", str7);
        A0f.AAP("actor_id", userSession.userId);
        if (str2 == null) {
            str2 = "";
        }
        A0f.AAP("tip_stage", str2);
        A0f.AAP("interface", "Android");
        A0f.AAP(AbstractC43591JPw.A00(17), A04);
        A0f.AAP("tip_id", str5);
        A0f.AAP("channel_id", str6);
        A0f.Cht();
        if (str4 != null) {
            AGM(C37556GgC.A01(this.A0e), EnumC37860GlF.A04, EnumC37861GlG.A0K);
        }
    }

    @Override // X.InterfaceC31009Dk8
    public final void DMO(String str, String str2, String str3, String str4, String str5) {
        UserSession userSession = this.A0C;
        String A04 = AbstractC12880la.A04(AbstractC25225BEi.A0F(userSession));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), AbstractC111324zv.A00(714));
        if (str2 == null) {
            str2 = "";
        }
        A0f.AAP("metric", str2);
        AbstractC31171DnF.A1C(A0f, "actionable_insights_tip_impression");
        if (str3 == null) {
            str3 = "";
        }
        A0f.AAP("media_id", str3);
        A0f.AAP("actor_id", userSession.userId);
        if (str == null) {
            str = "";
        }
        A0f.AAP("tip_stage", str);
        A0f.AAP("interface", "Android");
        A0f.AAP(AbstractC43591JPw.A00(17), A04);
        A0f.AAP("tip_id", str4);
        A0f.AAP("channel_id", str5);
        A0f.Cht();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DPG() {
        this.A0d.A0W("resume", false);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DSK(C51757Mtg c51757Mtg) {
        this.A1B.DSK(c51757Mtg);
    }

    @Override // X.JIE
    public final void DWz(String str) {
        EnumC75193Zm enumC75193Zm;
        if (str != null && (str.equals(AbstractC111324zv.A00(996)) || str.equals("ig_its_inappropriate"))) {
            enumC75193Zm = EnumC75193Zm.A07;
        } else {
            enumC75193Zm = EnumC75193Zm.A08;
        }
        InterfaceC31077DlK interfaceC31077DlK = this.A0r;
        C120985dq c120985dq = this.A01;
        if (c120985dq != null) {
            interfaceC31077DlK.Ecj(c120985dq, enumC75193Zm);
            C37540Gfw c37540Gfw = this.A0M;
            C120985dq c120985dq2 = this.A01;
            if (c120985dq2 != null) {
                c37540Gfw.A0M(c120985dq2, "three_dot_menu", true, false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    @Override // X.InterfaceC31159Dn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DXK(X.C120985dq r28, X.C37644Ghd r29) {
        /*
            r27 = this;
            r16 = 0
            r14 = 1
            r5 = r27
            r4 = r28
            r5.A01 = r4
            X.1v4 r6 = r4.A07()
            if (r6 == 0) goto L68
            boolean r0 = r6.A0y
            r10 = 0
            r13 = 0
            com.instagram.common.session.UserSession r7 = r5.A0C
            java.lang.String r2 = r4.Ayl(r7)
            if (r0 == 0) goto L60
            if (r2 == 0) goto L26
            androidx.fragment.app.FragmentActivity r1 = r5.A07
            r0 = 2131969288(0x7f134508, float:1.9575495E38)
        L22:
            java.lang.String r10 = X.AbstractC167007dF.A0f(r1, r2, r0)
        L26:
            X.Gh0 r3 = r5.A0H
            X.HLE r2 = new X.HLE
            r8 = r29
            r2.<init>(r8, r7, r6)
            r11 = 0
            com.instagram.clips.intf.ClipsViewerSource r1 = r5.A0A
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0s
            if (r1 != r0) goto L37
            r13 = 1
        L37:
            X.IKm r9 = new X.IKm
            r12 = r11
            r15 = r14
            r17 = r16
            r18 = r14
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A06()
            r3.A0N(r2, r6, r9)
            X.GlF r1 = X.EnumC37860GlF.A05
            X.GlG r0 = X.EnumC37861GlG.A0f
            r5.AGM(r4, r1, r0)
            return
        L60:
            if (r2 == 0) goto L26
            androidx.fragment.app.FragmentActivity r1 = r5.A07
            r0 = 2131969287(0x7f134507, float:1.9575493E38)
            goto L22
        L68:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.DXK(X.5dq, X.Ghd):void");
    }

    @Override // X.InterfaceC97664a1
    public final void DcG(C38321qM c38321qM, PromptStickerModel promptStickerModel) {
        C38X c38x = this.A0F;
        AbstractC59962oe abstractC59962oe = this.A08;
        C14360o3.A0C(abstractC59962oe, AbstractC111324zv.A00(29));
        c38x.A03(abstractC59962oe, c38321qM, promptStickerModel, A02(this));
    }

    @Override // X.InterfaceC144826g2
    public final void Dcm(InterfaceC41201vU interfaceC41201vU, AlD alD, JFZ jfz) {
        View view;
        ViewOnFocusChangeListenerC207579Gl viewOnFocusChangeListenerC207579Gl = this.A02;
        if (viewOnFocusChangeListenerC207579Gl != null && (view = this.A00) != null) {
            User CDj = interfaceC41201vU.CDj();
            if (CDj != null) {
                C38321qM BQN = interfaceC41201vU.BQN();
                if (BQN != null) {
                    String id = BQN.getId();
                    C38321qM BQN2 = interfaceC41201vU.BQN();
                    if (BQN2 != null) {
                        viewOnFocusChangeListenerC207579Gl.A02(view, alD, jfz, CDj, id, AbstractC86623ta.A00(BQN2.A2P()), -1);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C38321qM BQN3 = interfaceC41201vU.BQN();
        String str = alD.A00.A08;
        if (BQN3 != null && str != null) {
            AbstractC37670Gi3.A0a(this.A0D, this.A0C, BQN3, str, AbstractC111324zv.A00(4107), A02(this));
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720);
        AEp.ABW(DialogModule.KEY_MESSAGE, "Unable to log question sticker click due to null media or model");
        AEp.report();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DfV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        long j;
        Long l;
        Long l2;
        String attributionAppId;
        Long A0j;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            } else {
                l2 = null;
            }
            AbstractC37670Gi3.A08(EnumC120795dP.A0i, BQL.A0w, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
        }
        this.A16.A01(EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd, null, A1a);
        this.A1I.A01(c120985dq, c37644Ghd);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di4(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        long j;
        long j2;
        Long A0k;
        Long A0j;
        C38321qM c38321qM = c120985dq.A02;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c38321qM != null && c75113Zb != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int position = c75113Zb.getPosition();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_save_icon_impression");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                AbstractC25230BEn.A1B(A0f, j);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null && (A0k = AbstractC25231BEo.A0k(A14)) != null) {
                    j2 = A0k.longValue();
                } else {
                    j2 = -1;
                }
                AbstractC25230BEn.A1D(A0f, j2);
                AbstractC25229BEm.A19(A0f, position);
                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                AbstractC37303Gc4.A0a(A0f);
                InterfaceC43589JPu.A01(A0f, interfaceC43589JPu);
                AbstractC25232BEp.A1L(A0f, "ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
                return;
            }
            return;
        }
        A07(C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720), c38321qM, c75113Zb, "onSaveButtonImpression: media (", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di6(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM c38321qM = c120985dq.A02;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c38321qM != null && c75113Zb != null) {
            this.A0w.Di5(c38321qM, c75113Zb, c75113Zb.getPosition());
        } else {
            A07(C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720), c38321qM, c75113Zb, "onSaveButtonTap: media (", AbstractC166987dD.A1C());
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Di7(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        long j;
        long j2;
        Long A0k;
        Long A0j;
        C38321qM c38321qM = c120985dq.A02;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c38321qM != null && c75113Zb != null) {
            c75113Zb.A08();
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int position = c75113Zb.getPosition();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_save_icon_tap");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                AbstractC25230BEn.A1B(A0f, j);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null && (A0k = AbstractC25231BEo.A0k(A14)) != null) {
                    j2 = A0k.longValue();
                } else {
                    j2 = -1;
                }
                AbstractC25230BEn.A1D(A0f, j2);
                AbstractC25229BEm.A19(A0f, position);
                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                InterfaceC43589JPu.A01(A0f, interfaceC43589JPu);
                AbstractC25233BEq.A17(A0f, "ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
                A0f.Cht();
            }
            AnonymousClass388 anonymousClass388 = this.A0w;
            anonymousClass388.Di3(c38321qM, c75113Zb, anonymousClass388.CCt(), c75113Zb.getPosition());
            return;
        }
        A07(C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720), c38321qM, c75113Zb, "onSaveButtonTap: media (", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn0(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, boolean z) {
        C38X c38x = this.A0F;
        if (z) {
            viewOnTouchListenerC97504Zk.A06.post(new RunnableC71513WvI(viewOnTouchListenerC97504Zk, c38x.A04));
        }
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn1() {
        C5SW c5sw = this.A0F.A04.A00;
        if (c5sw != null) {
            c5sw.A08(false);
        }
    }

    @Override // X.InterfaceC97494Zj
    public final void Dn2(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C41160IJz c41160IJz) {
        this.A0F.A06(viewOnTouchListenerC97504Zk, c41160IJz);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DnT(C38321qM c38321qM) {
        User A2D = c38321qM.A2D();
        if (A2D != null) {
            if (c38321qM.A3Z().size() == 2) {
                AbstractC55229Oez.A0A(this.A08, this.A0C, c38321qM, this.A0D, null);
            } else {
                UserSession userSession = this.A0C;
                C31368DqX A02 = AbstractC31402Dr6.A02(userSession, A2D.getUsername(), "clips_viewer_go_to_sponsor_profile", this.A0D.getModuleName());
                A02.A0O = A01(c38321qM, A2D.getId());
                Bundle A022 = AbstractC37303Gc4.A02(userSession, A02);
                FragmentActivity fragmentActivity = this.A07;
                AbstractC31171DnF.A0L(fragmentActivity, A022, userSession, ModalActivity.class, "profile").A0C(fragmentActivity.getApplicationContext());
            }
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnc(C120985dq c120985dq, String str, boolean z) {
        String A00 = AbstractC111324zv.A00(1273);
        C14360o3.A0B(c120985dq, 0);
        String str2 = null;
        this.A0p.A03(new MUW((Float) null, (Float) null, A00, (String) null), c120985dq, "primary");
        AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0b);
        User user = c120985dq.A0K;
        if (user != null && z) {
            UserSession userSession = this.A0C;
            FragmentActivity fragmentActivity = this.A07;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                str2 = c38321qM.getId();
            }
            C06090Tz c06090Tz = C06090Tz.A06;
            FYC.A01(fragmentActivity, interfaceC60442pS, userSession, null, user, str2, C18U.A06(c06090Tz, userSession, 36323637935287757L), C18U.A06(c06090Tz, userSession, 2342163859715204041L));
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnd(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        User A09;
        String A00 = AbstractC43591JPw.A00(1333);
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        this.A0p.A03(new MUW((Float) null, (Float) null, A00, (String) null), c120985dq, "primary");
        AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0f);
        if (z && (A09 = c120985dq.A09(this.A0C)) != null) {
            Dbc(null, c120985dq, c37644Ghd, C76493bt.A01(c120985dq), A09, null, null, null, null, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null, "primary", null, false, false);
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dnf(View view, C120985dq c120985dq, String str, boolean z) {
        String A00 = AbstractC111324zv.A00(3119);
        C14360o3.A0B(c120985dq, 0);
        this.A0p.A03(new MUW((Float) null, (Float) null, A00, (String) null), c120985dq, "primary");
        AGM(c120985dq, EnumC37860GlF.A03, EnumC37861GlG.A0f);
        if (z) {
            DP0(view, c120985dq, this.A05, C18U.A06(C06090Tz.A06, this.A0C, 36323637935287757L));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC30971DjS
    public final void Dt8(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
        C40971v4 c40971v4;
        C40971v4 A07;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != 0) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                if (z) {
                    UserSession userSession = this.A0C;
                    AbstractC59962oe abstractC59962oe = this.A08;
                    C2Fb c2Fb = C2Fb.A12;
                    InterfaceC60442pS interfaceC60442pS = this.A0D;
                    if (c120985dq.CdW()) {
                        c40971v4 = c120985dq.A06();
                    } else {
                        C40971v4 A072 = c120985dq.A07();
                        c40971v4 = c38321qM;
                        if (A072 != null) {
                            c40971v4 = A072;
                        }
                    }
                    C5SE c5se = new C5SE(userSession, c40971v4, c75113Zb.A06());
                    c5se.A04 = c75113Zb.A1K;
                    C37952Gmu c37952Gmu = new C37952Gmu(abstractC59962oe, userSession, c5se, interfaceC60442pS, c2Fb);
                    if (c120985dq.CdW()) {
                        A07 = c120985dq.A06();
                    } else {
                        A07 = c120985dq.A07();
                    }
                    if (A07 != null) {
                        c37952Gmu.A0O = A07;
                        c37952Gmu.A0J = c38321qM;
                        c37952Gmu.A0B = c75113Zb.getPosition();
                        c37952Gmu.A0K = c75113Zb;
                        c37952Gmu.A0i = this.A0J.getSessionId();
                        c37952Gmu.A09 = i;
                        C37953Gmv.A02(c37952Gmu);
                        AbstractC37300Gc1.A11(this.A0o, AnonymousClass317.A08, c120985dq, c37644Ghd);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (!C18U.A06(C06090Tz.A06, this.A0C, 2342171363021831648L)) {
                    C37603Ggy c37603Ggy = this.A0p;
                    Float valueOf = Float.valueOf(-1.0f);
                    C37603Ggy.A01(new MUW(valueOf, valueOf, "thumbnail_hscroll_cta_tap", (String) null), c37603Ggy, c120985dq, null, new DHW(c120985dq, i, c75113Zb.A03, 4));
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvb(C38321qM c38321qM) {
        C38918HBp c38918HBp = new C38918HBp();
        C189448aO A0y = AbstractC25225BEi.A0y(this.A0C);
        AbstractC25226BEj.A1M(this.A06, A0y, 2131972090);
        A0y.A00().A02(this.A07, c38918HBp);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvj(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        InterfaceC88553xD interfaceC88553xD;
        OriginalSoundDataIntf BZw;
        C3x9 A0u;
        String str;
        MusicInfo BVc;
        long j;
        Long l;
        Long A0j;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            if (c38321qM.A38() != null) {
                InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
                if (A0A.isSampled()) {
                    AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
                    String A2u = c38321qM.A2u();
                    if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC37303Gc4.A0c(A0A, A06, j);
                    InterfaceC43589JPu.A00(A0A, interfaceC43589JPu);
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    if (A14 != null) {
                        l = AbstractC25231BEo.A0k(A14);
                    } else {
                        l = null;
                    }
                    AbstractC37300Gc1.A0k(A0A, l);
                    A0A.AAP("chaining_session_id", interfaceC43589JPu.Amq());
                    AbstractC37302Gc3.A0y(A0A, c38321qM);
                    AbstractC37300Gc1.A0e(BQL.A0m, A0A);
                    AbstractC25225BEi.A1M(EnumC120795dP.A0h, A0A);
                    A0A.AAP("chaining_session_id", interfaceC43589JPu.Amq());
                    A0A.Cht();
                }
                C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
                if (A0u2 != null && (BVc = A0u2.BVc()) != null) {
                    interfaceC88553xD = new C88543xC(BVc);
                } else {
                    C3x9 A0u3 = AbstractC25226BEj.A0u(c38321qM);
                    if (A0u3 != null && (BZw = A0u3.BZw()) != null) {
                        interfaceC88553xD = new C117235Si(BZw);
                    } else {
                        interfaceC88553xD = null;
                    }
                }
                InterfaceC88553xD interfaceC88553xD2 = interfaceC88553xD;
                if (interfaceC88553xD2 != null && C18U.A06(C06090Tz.A05, userSession, 36325617913902288L)) {
                    C22P c22p = C22P.A0v;
                    INH A0C = AbstractC86593tX.A0C(c22p);
                    FragmentActivity fragmentActivity = this.A07;
                    A0C.A08 = interfaceC88553xD2.Cq1(AbstractC166987dD.A0O(fragmentActivity));
                    A0C.A0G = interfaceC88553xD2.getAudioAssetId();
                    A0C.A0H = null;
                    EnumC185548Kw enumC185548Kw = EnumC185548Kw.A05;
                    C14360o3.A0B(enumC185548Kw, 0);
                    A0C.A01 = enumC185548Kw;
                    AbstractC41671Ic3.A00(fragmentActivity, A0C.A00(), this.A08, c22p, userSession);
                    return;
                }
                C37716Gir c37716Gir = this.A0S;
                if (!AbstractC40917IAp.A00(userSession, c38321qM, c37716Gir) && C18U.A06(C06090Tz.A05, userSession, 36325617913967825L)) {
                    if (AbstractC40917IAp.A00(userSession, c38321qM, c37716Gir) || (A0u = AbstractC25226BEj.A0u(c38321qM)) == null) {
                        return;
                    }
                    C37671Gi4 c37671Gi4 = this.A0c;
                    Integer num = C05F.A01;
                    C37671Gi4.A00(c37671Gi4, num);
                    MVO mvo = this.A0E;
                    mvo.A02();
                    String A0j2 = AbstractC167017dG.A0j();
                    String A0j3 = AbstractC167017dG.A0j();
                    InterfaceC84063oq Adx = A0u.Adx();
                    Long A04 = AbstractC117245Sj.A04(A0u);
                    String str2 = null;
                    if (A04 != null) {
                        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0C;
                        long longValue = A04.longValue();
                        long A062 = c37644Ghd.A06();
                        String CGJ = interfaceC43589JPu.CGJ();
                        String str3 = this.A0Z.A00;
                        C8JW c8jw = C8JW.A06;
                        if (Adx != null) {
                            str = Adx.getBestAudioClusterId();
                        } else {
                            str = null;
                        }
                        AbstractC37670Gi3.A0K(enumC39652Hih, c8jw, interfaceC60442pS, userSession, c38321qM, this.A0G, null, Boolean.valueOf(AbstractC76643c9.A0K(c38321qM)), Boolean.valueOf(AbstractC37302Gc3.A1b(c38321qM)), null, A0j2, CGJ, str3, A0j3, str, null, longValue, A062);
                    }
                    C37671Gi4.A00(c37671Gi4, num);
                    mvo.A02();
                    boolean z = !this.A0d.A0c(c120985dq);
                    String str4 = c120985dq.A0Q;
                    FragmentActivity fragmentActivity2 = this.A07;
                    String str5 = this.A0f;
                    if (str5 == null) {
                        str5 = c120985dq.A0D();
                    }
                    String str6 = this.A0g;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    if (Adx != null) {
                        str2 = Adx.getBestAudioClusterId();
                    }
                    AbstractC37834Gko.A00(fragmentActivity2, C8JW.A06, c120985dq, userSession, c38321qM, A0j2, str5, str6, str4, str2, A0j3, z);
                    return;
                }
                if (interfaceC88553xD2 == null || !C18U.A06(C06090Tz.A05, userSession, 36325617914033362L)) {
                    return;
                }
                Dvl(c120985dq, c37644Ghd);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31138Dmd
    public final void E0P() {
        this.A1K.A05.A0E("view_bound");
        this.A0d.A0X(true);
    }

    @Override // X.InterfaceC31069DlB
    public final void E0h(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        EnumC120795dP enumC120795dP;
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AbstractC59962oe abstractC59962oe = this.A08;
            UserSession userSession = this.A0C;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C41760Ieb.A04(abstractC59962oe, interfaceC60442pS, userSession, c38321qM);
            if (z) {
                enumC120795dP = EnumC120795dP.A0S;
            } else {
                enumC120795dP = EnumC120795dP.A0T;
            }
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            Long l2 = null;
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            }
            AbstractC37670Gi3.A08(enumC120795dP, BQL.A0k, interfaceC60442pS, userSession, interfaceC43589JPu, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
        }
    }

    @Override // X.InterfaceC30948Dj5
    public final void E1H(C38321qM c38321qM, String str, String str2, boolean z) {
        C38X c38x = this.A0F;
        String A02 = A02(this);
        C14360o3.A0B(A02, 4);
        UserSession userSession = c38x.A02;
        AbstractC37670Gi3.A0a(c38x.A03, userSession, c38321qM, str, ReelTappableObjectType.A0w.A00, A02);
        AbstractC40676I1i.A00(c38x.A01, userSession, str, str2, z);
    }

    @Override // X.InterfaceC31159Dn3
    public final void E1N(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A13.A00(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC30969DjQ
    public final void E1X(C120985dq c120985dq, String str, String str2, String str3) {
        C38321qM c38321qM;
        String A00 = AbstractC111324zv.A00(3127);
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 != EnumC129395t1.A03 && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A0C;
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C82713mZ A01 = C32U.A01(null, c38321qM, interfaceC60442pS, "waist_button");
            A01.A0J(userSession, c38321qM);
            C32U.A0C(userSession, A01, c38321qM, interfaceC60442pS, null);
            MUW muw = new MUW((Float) null, (Float) null, A00, (String) null);
            C37603Ggy c37603Ggy = this.A0p;
            if (!ITO.A01(muw, c37603Ggy, c120985dq, this.A0T.BmI(c120985dq))) {
                c37603Ggy.A03(new MUW((Float) null, (Float) null, A00, (String) null), c120985dq, "primary");
            }
            AbstractC41669Ic1.A00(this.A06, userSession, null, A07, A0F, "CLIPS");
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void EI7(C38321qM c38321qM, C75113Zb c75113Zb, EnumC25465BOe enumC25465BOe, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
        Long l2 = null;
        if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
            l = AbstractC166997dE.A0j(attributionAppId);
        } else {
            l = null;
        }
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            l2 = AbstractC25231BEo.A0k(A2E);
        }
        AbstractC37670Gi3.A08(EnumC120795dP.A02, A00(enumC25465BOe), interfaceC60442pS, userSession, interfaceC43589JPu, Integer.valueOf(i), l, l2, AbstractC25226BEj.A1G(c38321qM), c75113Zb.getPosition(), j);
    }

    @Override // X.JI8
    public final void EJo() {
        this.A1F.EJo();
    }

    @Override // X.InterfaceC31138Dmd
    public final void EKl() {
        this.A0d.A0W("resume", true);
    }

    @Override // X.InterfaceC31138Dmd
    public final void EPE(int i, Paint paint) {
        C56352iT A05 = C56352iT.A0t.A05(this.A08);
        if (A05 != null) {
            ViewGroup viewGroup = A05.A0O;
            if (viewGroup.getLayerType() != i) {
                viewGroup.setLayerType(i, paint);
            }
        }
    }

    @Override // X.InterfaceC31138Dmd
    public final void EkF(boolean z) {
        ViewGroup viewGroup;
        C56352iT A05 = C56352iT.A0t.A05(this.A08);
        if (A05 != null && (viewGroup = A05.A0O) != null) {
            viewGroup.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public static final BQL A00(EnumC25465BOe enumC25465BOe) {
        switch (enumC25465BOe.ordinal()) {
            case 0:
                return BQL.A02;
            case 1:
                return BQL.A0x;
            case 2:
                return BQL.A0o;
            case 3:
                return BQL.A1J;
            case 4:
                return BQL.A0f;
            case 5:
                return BQL.A0i;
            case 6:
                return BQL.A0p;
            case 7:
                return BQL.A1Z;
            case 8:
                return BQL.A1M;
            case 9:
                return BQL.A1H;
            case 10:
                return BQL.A1T;
            case 11:
            case 16:
            case 17:
            case 23:
                return BQL.A0u;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return BQL.A0Y;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return BQL.A0g;
            case 14:
                return BQL.A0c;
            case Process.SIGTERM /* 15 */:
                return BQL.A0q;
            case 18:
                return BQL.A0j;
            case Process.SIGSTOP /* 19 */:
                return BQL.A0a;
            case 20:
                return BQL.A04;
            case 21:
            case 22:
                return BQL.A1a;
            case 24:
                return BQL.A03;
            default:
                throw B4Z.A00();
        }
    }

    private final String A01(C38321qM c38321qM, String str) {
        if (c38321qM.CdW() && new C154616xB(this.A0C).A01(c38321qM.getId(), str)) {
            return "profile_products";
        }
        if (!c38321qM.A5P() && !c38321qM.A5R()) {
            if (c38321qM.CdW()) {
                if (C18U.A06(C06090Tz.A05, this.A0C, 36322839069993656L)) {
                    return "profile_clips";
                }
                return "profile_media_grid";
            }
            return "profile_media_grid";
        }
        return "profile_clips";
    }

    public static final void A06(C8JW c8jw, EffectPreviewIntf effectPreviewIntf, C38321qM c38321qM, C75113Zb c75113Zb, C37675GiC c37675GiC) {
        boolean z;
        String A0j = AbstractC167017dG.A0j();
        Long A0j2 = AbstractC25231BEo.A0j(0, effectPreviewIntf.getId());
        if (A0j2 != null) {
            long longValue = A0j2.longValue();
            InterfaceC60442pS interfaceC60442pS = c37675GiC.A0D;
            UserSession userSession = c37675GiC.A0C;
            AbstractC37670Gi3.A0L(EnumC39652Hih.A0E, c8jw, userSession, c38321qM, interfaceC60442pS, A0j, A02(c37675GiC), c37675GiC.A0Z.A00, longValue, c75113Zb.getPosition());
            C37671Gi4.A00(c37675GiC.A0c, C05F.A0C);
            if (!AbstractC167007dF.A1W(effectPreviewIntf.getFailureReason())) {
                String id = effectPreviewIntf.getId();
                C14360o3.A0B(id, 0);
                String str = c37675GiC.A0h;
                if (str == null || c37675GiC.A0A != ClipsViewerSource.A08 || !str.equals(id)) {
                    z = true;
                    AbstractC37834Gko.A01(c37675GiC.A07, c8jw, interfaceC60442pS, userSession, effectPreviewIntf, c38321qM, AbstractC41770Iem.A03(c38321qM), A0j, AbstractC25226BEj.A1G(c38321qM), AbstractC41770Iem.A0A(userSession, c38321qM), AbstractC37843Gkx.A00(c38321qM), z);
                    return;
                }
            }
            z = false;
            AbstractC37834Gko.A01(c37675GiC.A07, c8jw, interfaceC60442pS, userSession, effectPreviewIntf, c38321qM, AbstractC41770Iem.A03(c38321qM), A0j, AbstractC25226BEj.A1G(c38321qM), AbstractC41770Iem.A0A(userSession, c38321qM), AbstractC37843Gkx.A00(c38321qM), z);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static void A07(C0f5 c0f5, Object obj, Object obj2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(") or media state (");
        sb.append(obj2);
        sb.append(") is null");
        c0f5.ABW(DialogModule.KEY_MESSAGE, sb.toString());
        c0f5.report();
    }

    public static final void A0F(C120985dq c120985dq, C37675GiC c37675GiC, String str, int i, boolean z) {
        c37675GiC.A03 = Integer.valueOf(i);
        C37540Gfw c37540Gfw = c37675GiC.A0M;
        C37540Gfw.A02(c120985dq, c37540Gfw);
        c37675GiC.A0O.A07().notifyDataSetChanged();
        c37675GiC.A0d.A0N(c120985dq, i);
        C11T.A03(new RunnableC43103J3s(c37675GiC));
        if (!z) {
            c37540Gfw.A0L(c120985dq, null, null, null, str);
        }
    }

    @Override // X.XEZ
    public final boolean CUN(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        if (!c37644Ghd.A0Y && this.A0Q.A0F(c120985dq, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // X.XEZ
    public final void Cuj(C120985dq c120985dq, C37644Ghd c37644Ghd, float f, float f2) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A0Q.A0C(c120985dq, c37644Ghd, f, f2);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyG(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C30S c30s;
        Context context;
        String A08;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        A0C(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A0C;
            if (!C2TN.A02(userSession, c38321qM) && AbstractC76643c9.A0G(userSession, c38321qM)) {
                c30s = (C30S) this.A0i.getValue();
                context = this.A06;
                A08 = AbstractC76643c9.A03(context, userSession, c38321qM);
                c30s.A00(context, A08, A1a);
            }
        }
        UserSession userSession2 = this.A0C;
        String str = null;
        User A09 = c120985dq.A09(userSession2);
        if (A09 != null) {
            str = A09.getId();
        }
        if (C14360o3.A0K(str, userSession2.userId) && AbstractC37907Gm4.A00(userSession2, c120985dq.A02)) {
            Context context2 = this.A06;
            FragmentActivity fragmentActivity = this.A07;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 == null) {
                return;
            }
            fragmentActivity.runOnUiThread(new RunnableC36974GQr(fragmentActivity, context2, interfaceC60442pS, userSession2, c38321qM2));
            return;
        }
        if (!AbstractC76643c9.A0F(userSession2, c38321qM)) {
            return;
        }
        c30s = (C30S) this.A0i.getValue();
        context = this.A06;
        A08 = AbstractC76643c9.A08(userSession2, c38321qM);
        c30s.A00(context, A08, A1a);
    }

    @Override // X.InterfaceC31159Dn3
    public final void CyH(C120985dq c120985dq) {
        MusicMuteAudioReason musicMuteAudioReason;
        C88543xC A1Q2;
        Boolean bool;
        String str;
        String A38;
        C88543xC A1Q3;
        MusicConsumptionModel BVa;
        OriginalSoundDataIntf A1K;
        OriginalSoundConsumptionInfoIntf AqX;
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        Long l = null;
        if (A0G == null || (A1K = A0G.A1K()) == null || (AqX = A1K.AqX()) == null || (musicMuteAudioReason = AqX.BvC()) == null) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A1Q2 = c38321qM.A1Q()) != null) {
                musicMuteAudioReason = A1Q2.BvC();
            } else {
                musicMuteAudioReason = null;
            }
        }
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (A1Q3 = c38321qM2.A1Q()) != null && (BVa = A1Q3.A00.BVa()) != null) {
            bool = BVa.Buu();
        } else {
            bool = null;
        }
        C75473aE c75473aE = this.A0u;
        if (musicMuteAudioReason != null) {
            str = musicMuteAudioReason.A00;
        } else {
            str = null;
        }
        c75473aE.A02 = str;
        c75473aE.A00 = bool;
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null && (A38 = c38321qM3.A38()) != null) {
            l = AbstractC166997dE.A0j(A38);
        }
        IRT.A01(interfaceC60442pS, userSession, l, AbstractC37302Gc3.A0V(AbstractC76643c9.A09(c120985dq.A02)));
    }

    @Override // X.InterfaceC31069DlB
    public final void Czs(C120985dq c120985dq, boolean z) {
        VG4 vg4;
        if (AbstractC37301Gc2.A0G(c120985dq) != null) {
            String A00 = AbstractC111324zv.A00(1993);
            String A002 = AbstractC111324zv.A00(1994);
            if (z) {
                vg4 = VG4.A0Q;
            } else {
                A00 = A002;
                vg4 = VG4.A0R;
            }
            C1Y6 A003 = AbstractC69888VxF.A00();
            UserSession userSession = this.A0C;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                A003.A07(this.A08, null, null, this.A0D, userSession, c38321qM, A00, null, true);
                C70399WUb A004 = C70399WUb.A00(userSession);
                A004.A01 = A00;
                A004.A0G(vg4, A00);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC30966DjN
    public final void D14(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null && A0G.A0C.BGH() != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            String id = A0G.getId();
            if (id != null) {
                A1G.put("ig_post_id", id);
                FragmentActivity requireActivity = this.A08.requireActivity();
                UserSession userSession = this.A0C;
                C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
                C72743Nv A0G2 = AbstractC31180DnO.A0G(userSession, AbstractC111324zv.A00(100), A1G);
                Long l = null;
                A0r.A0B(null, A0G2);
                A0r.A04();
                HashMap A1G2 = AbstractC166987dD.A1G();
                String id2 = A0G.getId();
                if (id2 != null) {
                    A1G2.put("post_igid", id2);
                    String str = null;
                    if (A0G.A0C.BGH() != null) {
                        InterfaceC84473pq BGH = A0G.A0C.BGH();
                        if (BGH != null) {
                            l = Long.valueOf(BGH.BF4());
                        }
                        A1G2.put("product_id", String.valueOf(l));
                    }
                    User A2E = A0G.A2E(userSession);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A0X, userSession), "ig_ads_conversion_funnel");
                    A0f.A8R(EnumC53368NjJ.BIO_IG_REELS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f.AAP("consumer_igid", userSession.userId);
                    if (A2E != null) {
                        str = A2E.getId();
                    }
                    A0f.AAP("seller_igid", str);
                    AbstractC37300Gc1.A0u(A0f, A1G2);
                    A0f.AAP("event", "buyer_click_inquiry_cta");
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void D6E(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        this.A16.A00(EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd);
        this.A1I.A00(c120985dq);
    }

    @Override // X.InterfaceC31159Dn3
    public final void D8e(C120985dq c120985dq) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            PromptStickerModel A00 = C37759GjY.A00(A0G);
            if (A00 != null) {
                DcH(C8JW.A0C, A0G, A00, null, null);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void D8g(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            int A06 = c37644Ghd.A06();
            C37855Gl9 c37855Gl9 = C37855Gl9.A00;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            UserSession userSession = this.A0C;
            Integer valueOf = Integer.valueOf(A06);
            String str = this.A0Z.A00;
            c37855Gl9.A0I(this.A08, this.A07, IB0.A00(ClipsViewerSource.A29), interfaceC60442pS, userSession, c38321qM, valueOf, str);
            AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0Y);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void DAY(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A0C;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String str = c120985dq.A06().A0Z;
            if (str != null) {
                String str2 = c120985dq.A06().A0a;
                String str3 = c120985dq.A06().A0Y;
                String A03 = c120985dq.A06().A03(userSession);
                if (A03 != null) {
                    C75113Zb c75113Zb = c37644Ghd.A0E;
                    if (c75113Zb != null) {
                        I9X.A00(fragmentActivity, userSession, new C42548IsR(c120985dq, userSession, c75113Zb, null), c38321qM, this.A0D, str, str2, str3, A03);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC30963DjK
    public final void DJg(C120985dq c120985dq, C37644Ghd c37644Ghd, String str, int i) {
        C40971v4 c40971v4;
        C40971v4 A07;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != 0) {
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                UserSession userSession = this.A0C;
                AbstractC59962oe abstractC59962oe = this.A08;
                C2Fb c2Fb = C2Fb.A10;
                InterfaceC60442pS interfaceC60442pS = this.A0D;
                if (c120985dq.CdW()) {
                    c40971v4 = c120985dq.A06();
                } else {
                    C40971v4 A072 = c120985dq.A07();
                    c40971v4 = c38321qM;
                    if (A072 != null) {
                        c40971v4 = A072;
                    }
                }
                C5SE c5se = new C5SE(userSession, c40971v4, c75113Zb.A06());
                c5se.A04 = c75113Zb.A1K;
                C37952Gmu c37952Gmu = new C37952Gmu(abstractC59962oe, userSession, c5se, interfaceC60442pS, c2Fb);
                if (c120985dq.CdW()) {
                    A07 = c120985dq.A06();
                } else {
                    A07 = c120985dq.A07();
                }
                if (A07 != null) {
                    c37952Gmu.A0O = A07;
                    c37952Gmu.A0J = c38321qM;
                    c37952Gmu.A0B = c75113Zb.getPosition();
                    c37952Gmu.A0K = c75113Zb;
                    c37952Gmu.A0i = this.A0J.getSessionId();
                    c37952Gmu.A09 = i;
                    C37953Gmv.A02(c37952Gmu);
                    if (str != null) {
                        C37603Ggy c37603Ggy = this.A0p;
                        Float valueOf = Float.valueOf(-1.0f);
                        C37603Ggy.A01(new MUW(valueOf, valueOf, str, (String) null), c37603Ggy, c120985dq, null, new C25512BQa(i, 7));
                    }
                    AbstractC37300Gc1.A11(this.A0o, AnonymousClass317.A08, c120985dq, c37644Ghd);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31159Dn3
    public final void DML(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            C41760Ieb.A04(this.A08, this.A0D, this.A0C, A0G);
            AGM(this.A01, EnumC37860GlF.A04, EnumC37861GlG.A0J);
        }
    }

    @Override // X.InterfaceC97454Zf
    public final void DMX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        AbstractC167017dG.A1N(interfaceC41201vU, c4zq);
        C38X c38x = this.A0F;
        String A02 = A02(this);
        C14360o3.A0B(A02, 2);
        AbstractC37670Gi3.A0b(c38x.A03, c38x.A02, interfaceC41201vU.BQN(), A02, c4zq.Cdl());
    }

    @Override // X.InterfaceC31159Dn3
    public final void DP5(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM c38321qM;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        UserSession userSession = this.A0C;
        if (C18U.A06(C06090Tz.A05, userSession, 2342165603470551407L) && (c38321qM = c120985dq.A02) != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            int A06 = c37644Ghd.A06();
            if (c38321qM.A38() != null) {
                AbstractC37670Gi3.A0S(SocialContextType.A0C, userSession, c38321qM, interfaceC60442pS, interfaceC43589JPu, A06);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        DP0(view, c120985dq, c37644Ghd, A1a);
        AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0a);
    }

    @Override // X.InterfaceC31159Dn3
    public final void DTs(C38321qM c38321qM, C75113Zb c75113Zb, List list) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C41214IMd A0P = C1XJ.A00.A0P(this.A07, this.A0C, this.A0X);
        A0P.A07 = C05F.A00;
        A0P.A01 = c38321qM;
        A0P.A02 = c75113Zb;
        A0P.A0B = this.A1O;
        A0P.A0A = "shopping_reels_cta";
        A0P.A0C = list;
        A0P.A00();
    }

    @Override // X.InterfaceC31011DkA
    public final void DVw(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC104764ng interfaceC104764ng) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, interfaceC104764ng);
        FragmentActivity fragmentActivity = this.A07;
        UserSession userSession = this.A0C;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String title = interfaceC104764ng.getTitle();
            if (title != null) {
                String url = interfaceC104764ng.getUrl();
                String text = interfaceC104764ng.getText();
                String A03 = c120985dq.A06().A03(userSession);
                if (A03 != null) {
                    C75113Zb c75113Zb = c37644Ghd.A0E;
                    if (c75113Zb != null) {
                        I9X.A00(fragmentActivity, userSession, new C42548IsR(c120985dq, userSession, c75113Zb, null), c38321qM, this.A0D, title, url, text, A03);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC31011DkA
    public final void DZW(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        UserSession userSession = this.A0C;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                AbstractC41559Ia8.A00(this.A07, userSession, new C42548IsR(c120985dq, userSession, c75113Zb, null), c38321qM, interfaceC60442pS, J8O.A00, 3);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC30967DjO
    public final void DbV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        JLT BZV;
        String str;
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null && (BZV = A0G.A0C.BZV()) != null) {
            C38i.A00(this.A0s, A0G, "reels");
            int ordinal = BZV.Atr().ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        IQ7.A01(this.A08, A0G);
                    } else {
                        return;
                    }
                } else {
                    C35157Fez c35157Fez = C35157Fez.A00;
                    AbstractC59962oe abstractC59962oe = this.A08;
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    UserSession userSession = this.A0C;
                    String str2 = userSession.userId;
                    User A2E = A0G.A2E(userSession);
                    if (A2E != null) {
                        str = A2E.getId();
                    } else {
                        str = "";
                    }
                    c35157Fez.A01(requireActivity, abstractC59962oe, userSession, AbstractC111324zv.A00(102), str2, str, null, "book_now_cta_media_post");
                    return;
                }
            } else {
                IQ7.A00(this.A08, this.A0C, A0G, null);
            }
            AGM(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A0W);
        }
    }

    @Override // X.InterfaceC31010Dk9
    public final View.OnTouchListener Dbd(C120985dq c120985dq, User user, String str) {
        AbstractC167017dG.A1O(c120985dq, str);
        return this.A1G.Dbd(c120985dq, user, str);
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dck(C120985dq c120985dq) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            JL6 A1L = A0G.A1L();
            if (A1L != null) {
                String originalMediaId = A1L.getOriginalMediaId();
                if (originalMediaId != null) {
                    FVK.A01(this.A0C, C1GJ.A01(), new P2O(this, 4), originalMediaId);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC144826g2
    public final void Dcn(InterfaceC41201vU interfaceC41201vU, AlD alD) {
        long j;
        Long l;
        Long A0j;
        C38321qM BQN = interfaceC41201vU.BQN();
        String str = alD.A00.A08;
        if (BQN != null) {
            if (str != null) {
                UserSession userSession = this.A0C;
                String id = BQN.getId();
                if (id != null) {
                    String sessionId = this.A0J.getSessionId();
                    C14360o3.A0B(sessionId, 3);
                    Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A1b(AbstractC111324zv.A00(608), sessionId, AbstractC166987dD.A1L("QuestionResponseListFragment.MEDIA_ID", id), AbstractC166987dD.A1L("QuestionResponseListFragment.QUESTION_ID", str)));
                    AbstractC60492pY.A04(A00, userSession);
                    AbstractC25228BEl.A1G(this.A07, A00, userSession, ModalActivity.class, AbstractC111324zv.A00(5144));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            UserSession userSession2 = this.A0C;
            InterfaceC43589JPu interfaceC43589JPu = this.A0J;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            InterfaceC02590Ai A10 = AbstractC25232BEp.A10(interfaceC60442pS, userSession2);
            if (A10.isSampled()) {
                A10.AAP("organic_tap_action", "navigation_question_sticker_response_sheet");
                A10.AAP("organic_tap_action_source", AbstractC111324zv.A00(1202));
                AbstractC25229BEm.A1A(A10, interfaceC60442pS);
                AbstractC25229BEm.A19(A10, -1);
                InterfaceC43589JPu.A00(A10, interfaceC43589JPu);
                String A2u = BQN.A2u();
                if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                AbstractC25230BEn.A1B(A10, j);
                User A14 = AbstractC25226BEj.A14(BQN);
                if (A14 != null) {
                    l = AbstractC25231BEo.A0k(A14);
                } else {
                    l = null;
                }
                AbstractC37300Gc1.A0k(A10, l);
                InterfaceC43589JPu.A01(A10, interfaceC43589JPu);
                A10.Cht();
                return;
            }
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720);
        AEp.ABW(DialogModule.KEY_MESSAGE, "Unable to log response count click on question sticker due to null media");
        AEp.report();
    }

    @Override // X.InterfaceC31073DlF
    public final void DfX(SocialContextType socialContextType, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
        A0A(socialContextType, c120985dq, c37644Ghd, this, Integer.valueOf(i), Long.valueOf(j));
    }

    @Override // X.InterfaceC31159Dn3
    public final void DjZ(C120985dq c120985dq, C38321qM c38321qM, C75113Zb c75113Zb, EnumC25465BOe enumC25465BOe, int i) {
        BQL A00 = A00(enumC25465BOe);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        AbstractC37670Gi3.A06(EnumC120795dP.A02, A00, c120985dq, interfaceC60442pS, userSession, c38321qM, this.A0J, Integer.valueOf(i), c75113Zb.getPosition());
        if (A00 == BQL.A0x) {
            AbstractC41775Ier.A04(interfaceC60442pS, userSession, c38321qM, this.A1O);
        }
        AnonymousClass426.A00.A09(userSession, c38321qM.getId(), AbstractC76193bO.A04(userSession, c38321qM, c75113Zb));
    }

    @Override // X.InterfaceC31159Dn3
    public final void Djo(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw) {
        if (AbstractC37301Gc2.A0G(c120985dq) != null) {
            C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(814), AbstractC166987dD.A1G());
            FragmentActivity fragmentActivity = this.A07;
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A0C);
            AbstractC31171DnF.A10(fragmentActivity, A0C, 2131956194);
            A0C.A0P = C05F.A01;
            A01.A04(fragmentActivity, A0C);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    @Override // X.InterfaceC31159Dn3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DnF(com.instagram.api.schemas.SocialContextType r9, X.C38321qM r10, int r11) {
        /*
            r8 = this;
            X.AbstractC167017dG.A1O(r10, r9)
            X.2pS r7 = r8.A0D
            com.instagram.common.session.UserSession r0 = r8.A0C
            X.JPu r5 = r8.A0J
            X.0wW r1 = X.AbstractC12220kQ.A01(r7, r0)
            java.lang.String r0 = "instagram_clips_social_context_impression"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto Lb1
            X.1rF r0 = r10.A0C
            java.util.List r0 = r0.ByK()
            r2 = 0
            if (r0 == 0) goto L69
            java.util.Iterator r3 = r0.iterator()
        L26:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3vI r0 = (X.InterfaceC87503vI) r0
            com.instagram.api.schemas.SocialContextType r0 = r0.ByT()
            if (r0 != r9) goto L26
        L39:
            X.3vI r1 = (X.InterfaceC87503vI) r1
            if (r1 == 0) goto L69
            java.util.List r0 = r1.ByM()
            if (r0 == 0) goto L69
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r6 = r0.iterator()
        L4b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L4b
        L67:
            r1 = r2
            goto L39
        L69:
            r3 = r2
        L6a:
            X.AbstractC25229BEm.A1A(r4, r7)
            java.lang.String r0 = r10.A2u()
            if (r0 == 0) goto Lb2
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto Lb2
            long r0 = r0.longValue()
        L7d:
            X.AbstractC37303Gc4.A0c(r4, r11, r0)
            X.InterfaceC43589JPu.A00(r4, r5)
            java.lang.String r1 = X.AbstractC37670Gi3.A02(r9)
            if (r1 != 0) goto L8b
            java.lang.String r1 = "unknown"
        L8b:
            java.lang.String r0 = "social_context_type"
            r4.AAP(r0, r1)
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r10)
            if (r0 == 0) goto L9a
            java.lang.Long r2 = X.AbstractC25231BEo.A0k(r0)
        L9a:
            X.AbstractC37300Gc1.A0k(r4, r2)
            X.InterfaceC43589JPu.A01(r4, r5)
            java.lang.String r1 = X.AbstractC25226BEj.A1G(r10)
            java.lang.String r0 = "ranking_info_token"
            X.AbstractC25233BEq.A17(r4, r0, r1)
            java.lang.String r0 = "facepile_user_ids"
            r4.AAk(r0, r3)
            X.AbstractC31176DnK.A1I(r4)
        Lb1:
            return
        Lb2:
            r0 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.DnF(com.instagram.api.schemas.SocialContextType, X.1qM, int):void");
    }

    @Override // X.InterfaceC31159Dn3
    public final void DoU(C120985dq c120985dq, User user) {
        C38321qM c38321qM;
        boolean A1a = AbstractC167017dG.A1a(user, c120985dq);
        AbstractC59962oe abstractC59962oe = this.A08;
        if (abstractC59962oe.getContext() != null && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A0C;
            AnonymousClass730 anonymousClass730 = new AnonymousClass730(userSession);
            String CAl = user.A03.CAl();
            if (CAl != null) {
                String id = user.getId();
                Rie rie = Rie.REELS;
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    anonymousClass730.A00(rie, id, CAl, A2u, A1a);
                    AbstractC76693cH.A01(abstractC59962oe.requireContext(), rie, userSession, user.getId(), CAl);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dqf(C120985dq c120985dq) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            C41721Ids.A01(this.A08, this.A0C, A0G, this.A0D, C05F.A01, null, null, this.A0J.getSessionId());
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DsU(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            AbstractC40927IAz.A00(this.A07, this.A08, C22P.A1w, null, this.A0C, A0G, null, true);
        }
    }

    @Override // X.InterfaceC97454Zf
    public final void DvX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        AbstractC167017dG.A1N(interfaceC41201vU, c4zq);
        C38X c38x = this.A0F;
        String A02 = A02(this);
        C14360o3.A0B(A02, 2);
        AbstractC37670Gi3.A0b(c38x.A03, c38x.A02, interfaceC41201vU.BQN(), A02, c4zq.Cdl());
        this.A1B.A0B(c4zq.Cdl());
    }

    @Override // X.InterfaceC31159Dn3
    public final void Dvk(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            String A0j = AbstractC167017dG.A0j();
            UserSession userSession = this.A0C;
            AbstractC59962oe abstractC59962oe = this.A08;
            EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0C;
            C153756vk c153756vk = new C153756vk(null, A0j);
            String A38 = A0G.A38();
            if (A38 != null) {
                String A382 = A0G.A38();
                if (A382 != null) {
                    AbstractC37670Gi3.A0M(enumC39652Hih, c153756vk, abstractC59962oe, userSession, A38, null, Long.parseLong(A382), AbstractC76643c9.A0E(AbstractC25226BEj.A0u(A0G)));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC31159Dn3
    public final void DwF(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, SPM spm, C27845CPi c27845CPi) {
        AbstractC167017dG.A1Q(c120985dq, userSession);
        if (c120985dq.A01 != EnumC129395t1.A03) {
            AGM(c120985dq, EnumC37860GlF.A03, EnumC37861GlG.A0f);
            if (C18U.A06(C06090Tz.A05, userSession, 36316100267347937L)) {
                C37603Ggy c37603Ggy = this.A0p;
                Float valueOf = Float.valueOf(-1.0f);
                c37603Ggy.A03(new MUW(valueOf, valueOf, "unexpandable_caption_click", (String) null), c120985dq, null);
            }
        }
    }

    @Override // X.InterfaceC31073DlF
    public final void Dy4(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, long j) {
        A0D(c120985dq, c37644Ghd, this, Long.valueOf(j));
    }

    @Override // X.InterfaceC31159Dn3
    public final void E1L(C37644Ghd c37644Ghd, C38321qM c38321qM) {
        Long l;
        boolean A1a = AbstractC167017dG.A1a(c38321qM, c37644Ghd);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        InterfaceC43589JPu interfaceC43589JPu = this.A0J;
        int A06 = c37644Ghd.A06();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_visual_reply_attribution_tap");
        AbstractC37300Gc1.A0e(BQL.A1V, A0f);
        AbstractC25225BEi.A1M(EnumC120795dP.A0t, A0f);
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        String id = c38321qM.getId();
        if (id != null) {
            A0f.AAP("media_compound_key", id);
            AbstractC25230BEn.A1C(A0f, A06);
            InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
            A0f.Cht();
            AnonymousClass924 CGu = c38321qM.A0C.CGu();
            if (CGu != null) {
                l = AbstractC25228BEl.A13(CGu.BZq().getPk());
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                AnonymousClass924 CGu2 = c38321qM.A0C.CGu();
                if (CGu2 != null) {
                    long parseLong = Long.parseLong(CGu2.Apb().getCommentId());
                    if (Long.valueOf(parseLong) != null) {
                        FragmentActivity fragmentActivity = this.A07;
                        AnonymousClass924 CGu3 = c38321qM.A0C.CGu();
                        boolean z = true;
                        if (CGu3 == null || CGu3.getCanViewerLinkBackToOriginalMediaFromVcr() != A1a) {
                            z = false;
                        }
                        AbstractC40676I1i.A00(fragmentActivity, userSession, String.valueOf(parseLong), String.valueOf(longValue), z);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31159Dn3
    public final void E2X(JMS jms, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM) {
        Long A0k;
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c38321qM);
        C14360o3.A0B(jms, 3);
        InterfaceC60442pS interfaceC60442pS = this.A0D;
        UserSession userSession = this.A0C;
        List BxN = jms.BxN();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, BxN, 3), "ig_lumen_recipe_sheet_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && A0f.isSampled()) {
            ArrayList A0i = AbstractC167007dF.A0i(BxN);
            Iterator it = BxN.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
            }
            AbstractC37303Gc4.A0l(A0f, A0k, BxN);
            AbstractC37301Gc2.A15(A0f, interfaceC60442pS);
            AbstractC37301Gc2.A1A(A0f, "flow", "recipe_sheet", A0i);
            AbstractC31176DnK.A1I(A0f);
        }
        FragmentActivity fragmentActivity = this.A07;
        Context context = this.A06;
        String A0s = AbstractC25231BEo.A0s(c120985dq.A02);
        int A06 = c37644Ghd.A06();
        String title = jms.getTitle();
        if (A0s != null) {
            HC2 hc2 = new HC2();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("media_id", A0s);
            A0b.putInt("media_position", A06);
            C189448aO A0W = AbstractC31174DnI.A0W(A0b, hc2, userSession);
            A0W.A0d = title;
            A0W.A06 = context.getColor(AbstractC53242c7.A02(context));
            A0W.A1O = true;
            AbstractC25225BEi.A1Q(A0W, false);
            A0W.A1P = true;
            AbstractC31173DnH.A0w(fragmentActivity, hc2, A0W);
        }
    }

    @Override // X.InterfaceC43585JPa
    public final void E2g(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
        C120985dq A02 = C128085qc.A02(c38321qM);
        this.A1D.A0B(A02, jg9, this.A0M, this.A0O);
    }

    @Override // X.InterfaceC43436JHa
    public final void Dj4(C120985dq c120985dq) {
    }

    @Override // X.InterfaceC31159Dn3
    public final View.OnTouchListener DnU(C38321qM c38321qM, String str) {
        return ViewOnTouchListenerC42061IkU.A00;
    }

    public C37675GiC(Context context, FragmentActivity fragmentActivity, C37734Gj9 c37734Gj9, InterfaceC43399JFo interfaceC43399JFo, AbstractC59962oe abstractC59962oe, InterfaceC116925Qy interfaceC116925Qy, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, InterfaceC60142ow interfaceC60142ow, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, MVO mvo, C38X c38x, C149566o8 c149566o8, C37502GfK c37502GfK, InterfaceC43589JPu interfaceC43589JPu, EnumC114765Gh enumC114765Gh, MVS mvs, C37596Ggr c37596Ggr, C37595Ggq c37595Ggq, C59952od c59952od, IE0 ie0, C37540Gfw c37540Gfw, ILW ilw, C37601Ggw c37601Ggw, AbstractC37552Gg8 abstractC37552Gg8, C37546Gg2 c37546Gg2, C37594Ggp c37594Ggp, C42206Ims c42206Ims, C37598Ggt c37598Ggt, C37815GkV c37815GkV, MVF mvf, C37602Ggx c37602Ggx, C37583Gge c37583Gge, C37582Ggd c37582Ggd, BKZ bkz, C37597Ggs c37597Ggs, C39465Hbr c39465Hbr, C37661Ghu c37661Ghu, INA ina, C37716Gir c37716Gir, JI8 ji8, JI2 ji2, C37711Gim c37711Gim, InterfaceC31163Dn7 interfaceC31163Dn7, IN9 in9, C26914BuH c26914BuH, BKA bka, C37543Gfz c37543Gfz, C37542Gfy c37542Gfy, C37522Gfe c37522Gfe, C37659Ghs c37659Ghs, IG5 ig5, C37599Ggu c37599Ggu, C37671Gi4 c37671Gi4, C37576GgX c37576GgX, IKR ikr, C37560GgG c37560GgG, C37556GgC c37556GgC, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C14360o3.A0B(ig5, 3);
        AbstractC25233BEq.A0y(4, interfaceC60442pS, c37560GgG, ilw);
        AbstractC25234BEr.A1Q(interfaceC43589JPu, c37597Ggs, c37661Ghu);
        C14360o3.A0B(ina, 21);
        C14360o3.A0B(c37502GfK, 22);
        C14360o3.A0B(c37716Gir, 23);
        C14360o3.A0B(bkz, 25);
        C14360o3.A0B(c37671Gi4, 30);
        C14360o3.A0B(interfaceC116925Qy, 31);
        C14360o3.A0B(abstractC37552Gg8, 32);
        C14360o3.A0B(interfaceC31077DlK, 33);
        C14360o3.A0B(c39465Hbr, 40);
        C14360o3.A0B(c37522Gfe, 41);
        C14360o3.A0B(mvo, 42);
        C14360o3.A0B(c37711Gim, 44);
        C14360o3.A0B(ie0, 48);
        C14360o3.A0B(c37659Ghs, 49);
        C14360o3.A0B(ikr, 62);
        this.A06 = context;
        this.A0C = userSession;
        this.A0Z = ig5;
        this.A0D = interfaceC60442pS;
        this.A07 = fragmentActivity;
        this.A08 = abstractC59962oe;
        this.A1G = interfaceC31163Dn7;
        this.A0d = c37560GgG;
        this.A0N = ilw;
        this.A0V = in9;
        this.A0M = c37540Gfw;
        this.A0J = interfaceC43589JPu;
        this.A1C = c37597Ggs;
        this.A1E = c37661Ghu;
        this.A1A = c37582Ggd;
        this.A17 = c37815GkV;
        this.A11 = c59952od;
        this.A0t = c149566o8;
        this.A0Q = c37583Gge;
        this.A1M = c37576GgX;
        this.A0R = ina;
        this.A0x = c37502GfK;
        this.A0S = c37716Gir;
        this.A19 = c37602Ggx;
        this.A1B = bkz;
        this.A18 = mvf;
        this.A09 = clipsViewerConfig;
        this.A0A = clipsViewerSource;
        this.A0h = str;
        this.A0c = c37671Gi4;
        this.A0o = interfaceC116925Qy;
        this.A14 = abstractC37552Gg8;
        this.A0r = interfaceC31077DlK;
        this.A0O = c37546Gg2;
        this.A0e = c37556GgC;
        this.A0f = str2;
        this.A0g = str3;
        this.A1O = str4;
        this.A1D = c39465Hbr;
        this.A0X = c37522Gfe;
        this.A0E = mvo;
        this.A0K = enumC114765Gh;
        this.A0U = c37711Gim;
        this.A0F = c38x;
        this.A0l = z2;
        this.A0n = interfaceC43399JFo;
        this.A12 = ie0;
        this.A1K = c37659Ghs;
        this.A0m = c37734Gj9;
        this.A0q = interfaceC60142ow;
        this.A1F = ji8;
        this.A0T = ji2;
        this.A0W = c26914BuH;
        this.A15 = c42206Ims;
        this.A1H = bka;
        this.A0P = c37594Ggp;
        this.A10 = c37595Ggq;
        this.A16 = c37598Ggt;
        this.A1I = c37542Gfy;
        this.A0L = mvs;
        this.A1N = ikr;
        this.A0z = c37596Ggr;
        this.A1L = c37599Ggu;
        this.A13 = c37601Ggw;
        this.A0y = new C688938a(userSession);
        SearchContext searchContext = clipsViewerConfig.A0S;
        this.A0G = searchContext;
        this.A0p = new C37603Ggy(fragmentActivity, userSession, interfaceC60442pS);
        this.A0s = new C38i(userSession, interfaceC60442pS.getModuleName());
        this.A0H = new C37605Gh0(fragmentActivity, userSession, interfaceC60442pS, interfaceC116925Qy, this, EnumC37745GjK.A05, interfaceC43589JPu.getSessionId());
        C37600Ggv c37600Ggv = new C37600Ggv(abstractC59962oe, userSession, interfaceC60442pS, searchContext, interfaceC43589JPu, ilw, String.valueOf(clipsViewerConfig.A0h), clipsViewerConfig.A0q);
        this.A0w = c37600Ggv;
        this.A0Y = new C37607Gh2(fragmentActivity, abstractC59962oe, new C42150Ily(this, 5), clipsViewerConfig, interfaceC60142ow, interfaceC31077DlK, userSession, interfaceC60442pS, this, c37600Ggv, interfaceC43589JPu, c37540Gfw, ilw, abstractC37552Gg8, this, this, bkz, c26914BuH, ig5, c37671Gi4, c37560GgG, z);
        this.A0a = new BKR(context, abstractC59962oe, fragmentActivity, userSession, interfaceC60442pS, c38x, searchContext, interfaceC43589JPu, this, ina, bka, ig5);
        this.A0b = new C37612Gh7(fragmentActivity, userSession, this, c37540Gfw, c37546Gg2, this, c37560GgG, c37556GgC);
        this.A0j = AbstractC09440dt.A00(EnumC09460dv.A04, new C57515Pfp(this, 46));
        this.A0k = C1XM.A00(new C57515Pfp(this, 48));
        this.A0i = AbstractC09440dt.A01(C37741GjG.A00);
        this.A0v = new C38E(c37522Gfe, userSession, AbstractC37301Gc2.A0L(abstractC59962oe));
        this.A1J = new BKQ(userSession);
        this.A0B = C37816GkW.A00(this, 47);
        this.A0I = new C43010J0a(this, 3);
        this.A0u = (C75473aE) userSession.A01(C75473aE.class, new C57526Pg0(userSession, 35));
        c37597Ggs.A01 = this;
        abstractC59962oe.registerLifecycleListener(new C37767Gji(this, 2));
        C30750Dfn c30750Dfn = new C30750Dfn(this, 27);
        C30519Dc2 c30519Dc2 = new C30519Dc2(this, 17);
        c37543Gfz.A01 = c30750Dfn;
        c37543Gfz.A00 = c30519Dc2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x032f  */
    @Override // X.InterfaceC31010Dk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dbc(android.view.View r30, X.C120985dq r31, X.C37644Ghd r32, X.C65 r33, com.instagram.user.model.User r34, java.lang.Boolean r35, java.lang.Boolean r36, java.lang.Float r37, java.lang.Float r38, java.lang.Float r39, java.lang.Float r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, X.InterfaceC16820sZ r44, boolean r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37675GiC.Dbc(android.view.View, X.5dq, X.Ghd, X.C65, com.instagram.user.model.User, java.lang.Boolean, java.lang.Boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, X.0sZ, boolean, boolean):void");
    }
}
