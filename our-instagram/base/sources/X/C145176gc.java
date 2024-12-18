package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145176gc implements InterfaceC144586fe, CallerContextable {
    public static final String __redex_internal_original_name = "ReelViewerItemDelegateImpl";
    public float A00;
    public long A01;
    public Dialog A02;
    public C143376dc A03;
    public C148236lt A04;
    public C140966Yy A05;
    public InterfaceC149836oc A06;
    public C684436h A07;
    public C18920wW A08;
    public UserSession A09;
    public C3I9 A0A;
    public C57112jm A0B;
    public StoriesTemplateParticipationViewModel A0C;
    public InterfaceC69973Cg A0D;
    public C148086le A0E;
    public ReelViewerConfig A0F;
    public C3G2 A0G;
    public C64842wi A0H;
    public C64742wY A0I;
    public InterfaceC147086jk A0J;
    public C145816he A0K;
    public C145826hf A0L;
    public C6k8 A0M;
    public AbstractC149546o6 A0N;
    public C148176ln A0O;
    public C148146lk A0P;
    public C148536mO A0Q;
    public C145776ha A0R;
    public C148586mT A0S;
    public C147196jv A0T;
    public InterfaceC144656fl A0U;
    public C3t0 A0V;
    public C147956lR A0W;
    public C145896hm A0X;
    public C145876hk A0Y;
    public C145886hl A0Z;
    public C147316kH A0a;
    public C147376kN A0b;
    public C147356kL A0c;
    public C145906hn A0d;
    public C6k5 A0e;
    public InterfaceC61432r6 A0f;
    public C142236bg A0g;
    public C142206bd A0h;
    public C6WW A0i;
    public C143316dW A0j;
    public C145926hp A0k;
    public C6k2 A0l;
    public C145866hj A0m;
    public C146826jK A0n;
    public C147046jg A0o;
    public C145986hv A0p;
    public C148346m4 A0q;
    public C146026hz A0r;
    public C146836jL A0s;
    public C146966jY A0t;
    public C146956jX A0u;
    public C146946jW A0v;
    public C145356gu A0w;
    public C148566mR A0x;
    public String A0y;
    public String A0z;
    public HashSet A10;
    public boolean A11;
    public boolean A12;
    public C55909Os0 A13;
    public C26028BfH A14;
    public final InterfaceC60152ox A15;
    public final InterfaceC60442pS A16;
    public final InterfaceC1119353f A17;
    public final InterfaceC1118853a A18;
    public final C145126gX A1A;
    public final WeakReference A1B;
    public final C145216gg A1O;
    public final C145186gd A19 = new C145186gd(this);
    public final DialogInterface.OnDismissListener A1C = new DialogInterface.OnDismissListener() { // from class: X.6ge
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            ReelViewerFragment.A0I((ReelViewerFragment) C145176gc.this.A18, false);
        }
    };
    public final C145206gf A1I = new InterfaceC1119153d() { // from class: X.6gf
        @Override // X.InterfaceC1119153d
        public final void D00() {
        }

        @Override // X.InterfaceC1119153d
        public final void Czx() {
            ReelViewerFragment.A0I((ReelViewerFragment) C145176gc.this.A18, false);
        }
    };
    public final C145236gi A1G = new C145236gi(this);
    public final C145246gj A1L = new C145246gj(this);
    public final C145256gk A1K = new C145256gk(this);
    public final C145266gl A1F = new InterfaceC145276gm() { // from class: X.6gl
        @Override // X.InterfaceC145276gm
        public final void D9p(Reel reel, C41181vS c41181vS) {
            C145826hf c145826hf = C145176gc.this.A0L;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            if (c41181vS.CY4()) {
                C145836hg c145836hg = c145826hf.A0A;
                c145836hg.A00 = reel;
                C82713mZ c82713mZ = new C82713mZ(c145836hg, "reel_more_action");
                C145826hf.A04(c82713mZ, (C37948Gmq) c145826hf.A0I.get(c41181vS.CGe()), c145826hf);
                UserSession userSession = c145826hf.A06;
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    c82713mZ.A0G(userSession, c38321qM);
                    c82713mZ.A4P = "delete_post";
                    C32U.A0I(userSession, c82713mZ, c145836hg, C05F.A00);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    };
    public final C145286gn A1E = new C145286gn(this);
    public final C145296go A1J = new C145296go(this);
    public final C145306gp A1N = new C145306gp(this);
    public final C145316gq A1M = new C145316gq(this);
    public final C145326gr A1H = new C145326gr(this);
    public final C145336gs A1D = new InterfaceC145346gt() { // from class: X.6gs
        @Override // X.InterfaceC145346gt
        public final void Cvg(User user) {
            Context context;
            C14360o3.A0B(user, 0);
            C145176gc c145176gc = C145176gc.this;
            Fragment fragment = (Fragment) c145176gc.A1B.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                C684436h c684436h = c145176gc.A07;
                if (c684436h == null) {
                    C14360o3.A0F("closeFriendsController");
                    throw C00O.createAndThrow();
                }
                c684436h.A03(c145176gc.A16, new C61972ry(context, AbstractC018607g.A00(fragment), null), user, C05F.A00);
            }
        }
    };

    public static final void A04(C41181vS c41181vS, C41551w4 c41551w4, C145176gc c145176gc) {
        Context context;
        User user;
        String A38;
        String str;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) c145176gc.A1B.get();
        if (abstractC59962oe != null && (context = abstractC59962oe.getContext()) != null && (user = c41181vS.A0i) != null) {
            String username = user.getUsername();
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && (A38 = c38321qM.A38()) != null) {
                C141596ac C00 = ((C146226iL) ((ReelViewerFragment) c145176gc.A18).A1C).A0C.C00(c41181vS);
                UserSession userSession = c145176gc.A09;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    int i = 2131972431;
                    if (C14360o3.A0K(C08730cb.A00(userSession).A00().A03.AbH(), "off")) {
                        i = 2131972432;
                    }
                    String string = context.getString(i, username);
                    C14360o3.A0A(string);
                    C193328hC c193328hC = new C193328hC(context);
                    c193328hC.A0A(2131972435);
                    c193328hC.A0r(string);
                    c193328hC.A0J(new DialogInterfaceOnClickListenerC41815IfV(context, abstractC59962oe, c41181vS, c41551w4, C00, c145176gc, A38), 2131972433);
                    c193328hC.A0H(DialogInterfaceOnClickListenerC23171AOk.A00, 2131954754);
                    c193328hC.A0s(true);
                    c193328hC.A0t(true);
                    c193328hC.A0g(new AP1(c145176gc));
                    C0fJ.A00(c193328hC.A02());
                    C145826hf c145826hf = c145176gc.A0L;
                    if (c145826hf == null) {
                        str = "reelViewerLogger";
                    } else {
                        c145826hf.A0Q(c41551w4, "tap", "mention_request_entry_button", C00.A0B, C00.A0A);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A06(C41181vS c41181vS, C145176gc c145176gc) {
        Context context;
        Fragment fragment;
        AbstractC10360h2 abstractC10360h2;
        C38321qM c38321qM;
        WeakReference weakReference = c145176gc.A1B;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) weakReference.get();
        if (abstractC59962oe != null && (context = abstractC59962oe.getContext()) != null && (fragment = (Fragment) weakReference.get()) != null && (abstractC10360h2 = fragment.mFragmentManager) != null && (c38321qM = c41181vS.A0b) != null && ((ReelViewerFragment) c145176gc.A18).A0a != null) {
            C54809OKh c54809OKh = new C54809OKh(null, abstractC10360h2, C05F.A0N);
            UserSession userSession = c145176gc.A09;
            if (userSession != null) {
                Long.parseLong(userSession.userId);
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    AbstractC003100w.A0k(10, A2u);
                    User CDj = c38321qM.A0C.CDj();
                    if (CDj != null) {
                        AbstractC003100w.A0k(10, CDj.getId());
                    }
                    c38321qM.BRp();
                    HGV hgv = new HGV(context, abstractC59962oe, c38321qM, c54809OKh, c145176gc);
                    UserSession userSession2 = c145176gc.A09;
                    if (userSession2 != null) {
                        AbstractC1571873x.A06(context, hgv, userSession2, c38321qM, C3YU.A04, null);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    public static final void A07(C41181vS c41181vS, C145176gc c145176gc) {
        Context context;
        AbstractC10360h2 abstractC10360h2;
        User user;
        String A38;
        Fragment fragment = (Fragment) c145176gc.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (abstractC10360h2 = fragment.mFragmentManager) != null && (user = c41181vS.A0i) != null) {
            String username = user.getUsername();
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && (A38 = c38321qM.A38()) != null) {
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A0A(2131969968);
                c193328hC.A0r(context.getString(2131969967, username));
                c193328hC.A0M(new Og9(context, abstractC10360h2, c38321qM, c145176gc, A38), 2131957640);
                c193328hC.A0H(DialogInterfaceOnClickListenerC23172AOl.A00, 2131954754);
                c193328hC.A0s(true);
                c193328hC.A0t(true);
                c193328hC.A0g(new AP2(c145176gc));
                C0fJ.A00(c193328hC.A02());
            }
        }
    }

    public final void A0C() {
        C41551w4 c41551w4;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && fragment.getActivity() != null && fragment.isResumed()) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A18;
            if (!reelViewerFragment.A2a && (c41551w4 = reelViewerFragment.A0a) != null) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    C41181vS A08 = c41551w4.A08(userSession);
                    if (A08 != null) {
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            Reel reel = c41551w4.A0H;
                            if (AbstractC38260Gs3.A02(userSession2, reel)) {
                                ReelViewerConfig reelViewerConfig = this.A0F;
                                if (reelViewerConfig != null) {
                                    if (reelViewerConfig.A0G) {
                                        ReelViewerFragment.A0I(reelViewerFragment, false);
                                        return;
                                    }
                                    UserSession userSession3 = this.A09;
                                    if (userSession3 != null) {
                                        if (C08730cb.A00(userSession3).A00().A1M()) {
                                            AbstractC27401Ut.getInstance();
                                        }
                                        C3M4 A06 = C1OU.A06(reelViewerFragment.requireActivity(), reelViewerFragment.getSession());
                                        C3G2 c3g2 = this.A0G;
                                        String str = "reelViewerSource";
                                        if (c3g2 != null) {
                                            A06.A0Z(this.A16, null, A08, c41551w4, c3g2, 0.0f, 0.0f, 1.0f, 0, false, false);
                                            reelViewerFragment.A2V = true;
                                            A08.A0e();
                                            String str2 = A08.A0j;
                                            String id = reel.getId();
                                            C14360o3.A07(id);
                                            UserSession userSession4 = this.A09;
                                            if (userSession4 != null) {
                                                HashSet hashSet = new HashSet();
                                                if (!reel.A1a) {
                                                    User A00 = C08730cb.A00(userSession4).A00();
                                                    for (C41181vS c41181vS : reel.A0O(userSession4)) {
                                                        if (A00.equals(c41181vS.A0i) || c41181vS.A0h()) {
                                                            hashSet.add(c41181vS.A0j);
                                                        }
                                                    }
                                                }
                                                ReelViewerConfig reelViewerConfig2 = this.A0F;
                                                if (reelViewerConfig2 != null) {
                                                    C3G2 c3g22 = this.A0G;
                                                    if (c3g22 != null) {
                                                        C14360o3.A0B(str2, 0);
                                                        ReelDashboardFragment reelDashboardFragment = new ReelDashboardFragment();
                                                        Bundle bundle = new Bundle();
                                                        bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_STARTING_ID", str2);
                                                        bundle.putInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_DASHBOARD_TYPE", 0);
                                                        bundle.putString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ID", id);
                                                        bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER", hashSet);
                                                        bundle.putSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_SOURCE", c3g22);
                                                        bundle.putParcelable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_CONFIG", reelViewerConfig2);
                                                        bundle.putBoolean("ReelDashboardFragment.REEL_DASHBOARD_ARGUMENTS_KEY_EXTRA_FORCE_START_AT_VIEWERS_LIST", false);
                                                        reelDashboardFragment.setArguments(bundle);
                                                        reelDashboardFragment.setTargetFragment(fragment, 0);
                                                        C140966Yy c140966Yy = this.A05;
                                                        if (c140966Yy == null) {
                                                            str = "fragmentNavigator";
                                                        } else {
                                                            c140966Yy.A0B(null, reelDashboardFragment);
                                                            c140966Yy.A0A(0, 0, 0, 0);
                                                            c140966Yy.A04();
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F(str);
                                        throw C00O.createAndThrow();
                                    }
                                }
                                C14360o3.A0F("reelViewerConfig");
                                throw C00O.createAndThrow();
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        if ((!X.C14360o3.A0K(r10.A0C.BSN(), false)) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        r0 = r10.A0C.C1k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        r0 = r0.BoI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        r2 = new java.util.ArrayList();
        r11 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r11.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        r1 = r11.next();
        r0 = (com.instagram.user.model.User) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (r34 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        if (r34.contains(r0.getId()) != true) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012b, code lost:
    
        r2.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        r3 = X.C3DN.A00.A00(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013c, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        r0 = r30.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        r3.A0N(X.AbstractC34280FAa.A00(r0, null, r33, r18, r6, r5, r4, null, r23, r2, r14, r26, r27, true), new X.C24132AnH(r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        if (r11 != false) goto L39;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CvS(X.C41181vS r31, X.C41551w4 r32, X.EnumC33393EpQ r33, java.util.List r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.CvS(X.1vS, X.1w4, X.EpQ, java.util.List, boolean):void");
    }

    @Override // X.InterfaceC144586fe
    public final void Cvc(C41181vS c41181vS, C3G2 c3g2, String str) {
        FragmentActivity activity;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A01 >= 2000) {
            this.A01 = currentTimeMillis;
            Fragment fragment = (Fragment) this.A1B.get();
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                C41618Ib8 c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                EnumC46183KcL enumC46183KcL = c41618Ib8.A04;
                File A00 = OWL.A01.A00(enumC46183KcL, c41618Ib8.A05);
                if (!A00.exists()) {
                    C9GR.A0B(activity, "SuperlativeImageCaptureFailed");
                    return;
                }
                c41181vS.A0W = true;
                ArrayList<? extends Parcelable> arrayList = c41618Ib8.A06;
                ArrayList<? extends Parcelable> arrayList2 = c41618Ib8.A07;
                Bundle bundle = new Bundle();
                bundle.putSerializable("superlative_reel_viewer_source", c3g2);
                bundle.putString("superlative_media_file_path", str);
                bundle.putString("superlative_template_id", AbstractC47875LCv.A01(enumC46183KcL));
                bundle.putString("superlative_image", A00.getCanonicalPath());
                bundle.putParcelableArrayList("superlative_metions", arrayList);
                bundle.putParcelableArrayList("superlative_notify_users", arrayList2);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                C6XJ A02 = C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, "superlative_share_fragment");
                A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                A02.A0A(activity, 601);
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void Cwu(C41181vS c41181vS, C143766eK c143766eK) {
        ViewGroup viewGroup;
        String str;
        String str2;
        C14360o3.A0B(c143766eK, 0);
        if (c41181vS.CY4() && (viewGroup = c143766eK.A00) != null) {
            C145126gX c145126gX = this.A1A;
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                C149176nR c149176nR = c145126gX.A0I;
                if (c149176nR != null) {
                    JMM C1A = c38321qM.A0C.C1A();
                    if (C1A != null) {
                        str = C1A.getId();
                    } else {
                        str = null;
                    }
                    String A35 = c38321qM.A35();
                    String A36 = c38321qM.A36();
                    JMM C1A2 = c38321qM.A0C.C1A();
                    if (C1A2 != null) {
                        str2 = C1A2.getContentUrl();
                    } else {
                        str2 = null;
                    }
                    c149176nR.A00(viewGroup, str, A35, A36, str2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144586fe
    public final void CxC(C41181vS c41181vS) {
        int ordinal;
        String str;
        C25671My A00;
        InterfaceC41141vN c55979OtC;
        ReelViewerConfig reelViewerConfig = this.A0F;
        if (reelViewerConfig == null) {
            str = "reelViewerConfig";
        } else {
            ReelViewerContextButtonType reelViewerContextButtonType = reelViewerConfig.A00;
            if (reelViewerContextButtonType == null) {
                ordinal = -1;
            } else {
                ordinal = reelViewerContextButtonType.ordinal();
            }
            str = "userSession";
            if (ordinal != 0) {
                if (ordinal == 1 && c41181vS.A12()) {
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        A00 = AbstractC25651Mw.A00(userSession);
                        String str2 = c41181vS.A0j;
                        C14360o3.A07(str2);
                        c55979OtC = new LYD(str2);
                        A00.A05(c55979OtC);
                        this.A18.CqT();
                        return;
                    }
                } else {
                    return;
                }
            } else {
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    A00 = AbstractC25651Mw.A00(userSession2);
                    String str3 = c41181vS.A0j;
                    C14360o3.A07(str3);
                    c55979OtC = new C55979OtC(str3);
                    A00.A05(c55979OtC);
                    this.A18.CqT();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144586fe
    public final void CxG(C41181vS c41181vS, String str) {
        this.A1A.A01(true, true);
        C146966jY c146966jY = this.A0t;
        if (c146966jY == null) {
            C14360o3.A0F("reelViewerIGShareManager");
            throw C00O.createAndThrow();
        }
        Fragment fragment = c146966jY.A01;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            c146966jY.A04.EJE("context_switch");
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                AbstractC34836FWt.A01(activity, fragment, c146966jY.A02, c38321qM, str, null, false);
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void Cxh(View view, C41181vS c41181vS) {
        C149186nS c149186nS;
        String str;
        if (c41181vS.CY4() && (c149186nS = this.A1A.A0E) != null && !c149186nS.A02) {
            C5SW c5sw = c149186nS.A00;
            if (c5sw != null && c5sw.A09()) {
                return;
            }
            UserSession userSession = c149186nS.A04;
            User user = c41181vS.A0i;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            if (C2TN.A05(userSession, str) || !C18U.A06(C06090Tz.A05, userSession, 36319871247654617L)) {
                return;
            }
            C23031Ai c23031Ai = (C23031Ai) c149186nS.A05.getValue();
            if (((Boolean) c23031Ai.A2K.CES(c23031Ai, C23031Ai.A8c[170])).booleanValue()) {
                return;
            }
            c149186nS.A02 = true;
            view.post(new RunnableC24703Awk(view, c149186nS));
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Cxi(C41181vS c41181vS, C41551w4 c41551w4) {
        A05(c41181vS, c41551w4, true);
    }

    @Override // X.InterfaceC144596ff
    public final void CyX(C41181vS c41181vS) {
        Context context;
        C38321qM c38321qM;
        List A3w;
        C84823qW c84823qW;
        C102134ij c102134ij;
        C41551w4 c41551w4;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && c41181vS.CY4() && (c38321qM = c41181vS.A0b) != null && (A3w = c38321qM.A3w(EnumC75383a5.A09)) != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(A3w)) != null && (c102134ij = c84823qW.A0C) != null && (c41551w4 = ((ReelViewerFragment) this.A18).A0a) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            abstractC149546o6.A05(context, c102134ij, c41551w4, new C49567LvM(fragment, this, c102134ij.A04), "ig_stories_consumption_attribution_bottom_sheet", true, false);
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Cyj(C84823qW c84823qW) {
        Context context;
        C102134ij c102134ij;
        C41551w4 c41551w4;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (c102134ij = c84823qW.A0C) != null && (c41551w4 = ((ReelViewerFragment) this.A18).A0a) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            abstractC149546o6.A05(context, c102134ij, c41551w4, new C49567LvM(fragment, this, c102134ij.A04), "ig_stories_consumption_bottom_sheet", false, false);
        }
    }

    @Override // X.InterfaceC144596ff
    public final void Cz9(C41181vS c41181vS) {
        Context context;
        InterfaceC11380iw A02;
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (A02 = C150856qj.A02(context)) != null) {
            UserSession userSession = this.A09;
            String str2 = null;
            if (userSession != null) {
                FragmentActivity requireActivity = fragment.requireActivity();
                String moduleName = A02.getModuleName();
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    str = c38321qM.A0C.AdE();
                } else {
                    str = null;
                }
                C35265Fh0.A05(requireActivity, userSession, moduleName, str, "story_attribution", false);
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    c38321qM.getClass();
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        User A2E = c38321qM.A2E(userSession3);
                        if (A2E != null) {
                            str2 = A2E.getId();
                        }
                        AbstractC151386rg.A02(A02, userSession2, c38321qM, "story_attribution", str2, AbstractC14490oL.A0A(context));
                        return;
                    }
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void D1K(RectF rectF, C41181vS c41181vS, C41551w4 c41551w4, String str) {
        Fragment fragment;
        FragmentActivity activity;
        DirectCameraViewModel A01;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A18;
        if (!reelViewerFragment.A2r && (fragment = (Fragment) this.A1B.get()) != null && (activity = fragment.getActivity()) != null) {
            C3DN A00 = C3DN.A00.A00(activity);
            if (A00 != null) {
                A00.A0B();
            }
            InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
            if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
                C38321qM c38321qM = c41181vS.A0b;
                Integer num = null;
                if (c38321qM != null && "story_remix_reply".equals(str)) {
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        C1DW.A00(userSession).A03(c38321qM);
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                if ("story_selfie_reply".equals(str)) {
                    num = 60575;
                }
                if (c41551w4.A0H.A0W instanceof C6ZI) {
                    A01 = C75653aW.A00(c41181vS, str);
                } else {
                    A01 = C75653aW.A01(c41551w4, str);
                }
                InterfaceC1119353f interfaceC1119353f = this.A17;
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    A38.A00(activity, rectF, C22P.A53, userSession2, interfaceC1119353f, A01, c41551w4, num, str, r2.BSi(), reelViewerFragment.A2Y);
                    return;
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D1c(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A0A(str, str2);
    }

    @Override // X.InterfaceC144596ff
    public final void D1f(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        UserSession userSession = this.A09;
        if (userSession != null) {
            if (C3DL.A01(userSession, true)) {
                A0A(str, str2);
                return;
            }
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
            if (abstractC59962oe == null) {
                return;
            }
            FragmentActivity activity = abstractC59962oe.getActivity();
            Context context = abstractC59962oe.getContext();
            if (activity == null || context == null) {
                return;
            }
            this.A18.EJE("bottom_sheet");
            UserSession userSession2 = this.A09;
            if (userSession2 != null) {
                C50674MYs c50674MYs = new C50674MYs(context, userSession2);
                c50674MYs.A07(str2);
                c50674MYs.A01(new ViewOnClickListenerC28650Cky(context, abstractC59962oe, this, str), 2131954737);
                c50674MYs.A03 = this.A1O;
                new C31727DwY(c50674MYs).A05(activity);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144596ff
    public final void D1g(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A0A(str, str2);
    }

    @Override // X.C3h2
    public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        Integer num;
        C14360o3.A0B(interfaceC38401qU, 0);
        C14360o3.A0B(interfaceC109864xE, 2);
        UserSession userSession = this.A09;
        if (userSession != null) {
            InterfaceC60442pS interfaceC60442pS = this.A16;
            EnumC39628Hem enumC39628Hem = EnumC39628Hem.CLEAR_MEDIA_COVER;
            EnumC39624Hei A00 = EnumC39624Hei.A00(interfaceC109864xE);
            if (interfaceC38401qU instanceof C105824pt) {
                num = C05F.A0N;
            } else {
                num = C05F.A0C;
            }
            AbstractC41647Ibf.A00(enumC39628Hem, A00, interfaceC38401qU, interfaceC60442pS, userSession, num);
            UserSession userSession2 = this.A09;
            if (userSession2 != null) {
                AbstractC41653Ibl.A01(interfaceC38401qU, userSession2);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC144586fe
    public final void D7Q(C41551w4 c41551w4, C141596ac c141596ac, int i) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            String str = "userSession";
            if (userSession != null) {
                InterfaceC11380iw A02 = C150856qj.A02(context);
                if (A02 == null) {
                    A02 = new C19270xB("unknown");
                }
                C35233FgQ c35233FgQ = new C35233FgQ(fragment, A02, userSession, null, null);
                String obj = EnumC33444EqG.A08.toString();
                c35233FgQ.A04(null, new C42396Ipx(this), null, obj, "", true, true);
                C145826hf c145826hf = this.A0L;
                if (c145826hf == null) {
                    str = "reelViewerLogger";
                } else {
                    c145826hf.A0P(c41551w4, "ess_ci_card_contacts_sync", c141596ac.A0B, c141596ac.A0A, i);
                    InterfaceC11380iw A022 = C150856qj.A02(context);
                    if (A022 == null) {
                        A022 = new C19270xB("unknown");
                    }
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        new C147036jf(A022, userSession2).A02(false, -1000, obj, null);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void D88(View view, C41181vS c41181vS) {
        C22P c22p;
        ACRType aCRType;
        Context context = view.getContext();
        C14360o3.A0A(context);
        UserSession userSession = this.A09;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C8QJ c8qj = new C8QJ(context, userSession, null, false);
        if (c41181vS.A1K()) {
            c22p = C22P.A54;
        } else {
            c22p = C22P.A4I;
        }
        if (c41181vS.A1K()) {
            aCRType = ACRType.A07;
        } else {
            aCRType = ACRType.A04;
        }
        String string = context.getResources().getString(2131969757);
        C14360o3.A07(string);
        C199928sw c199928sw = new C199928sw(null, context.getDrawable(R.drawable.instagram_photo_grid_pano_outline_24), null, new C56411P2y(c22p, aCRType, c8qj, c41181vS, this), null, string, 0, 0, 0, false, false, false, true, false, false, false);
        String string2 = context.getResources().getString(2131955208);
        C14360o3.A07(string2);
        c8qj.A02(AbstractC16960so.A1Q(c199928sw, new C199928sw(null, context.getDrawable(R.drawable.instagram_reels_pano_outline_24), null, new C56410P2x(c22p, aCRType, c41181vS, this), null, string2, 0, 0, 0, false, false, false, true, false, false, false)));
        c8qj.setOnDismissListener(new C55522OlG(this));
        this.A18.EJE("story_creation_format_menu_shown");
        c8qj.showAsDropDown(view, 0, (-view.getHeight()) - ((Number) c8qj.A00().A01).intValue());
    }

    @Override // X.InterfaceC144586fe
    public final void D9Z(C41181vS c41181vS) {
        Context context;
        Fragment fragment;
        AbstractC10360h2 abstractC10360h2;
        WeakReference weakReference = this.A1B;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (context = fragment2.getContext()) != null && (fragment = (Fragment) weakReference.get()) != null && (abstractC10360h2 = fragment.mFragmentManager) != null) {
            UserSession userSession = this.A09;
            Reel reel = null;
            if (userSession != null) {
                AbstractC54126NwO.A00(userSession).A02("delete_button_click");
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    AbstractC54126NwO.A00(userSession2).A03(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A16.getModuleName());
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        AbstractC54126NwO.A00(userSession3).A01();
                        if (c41181vS.CY4()) {
                            C38321qM c38321qM = c41181vS.A0b;
                            if (c38321qM != null) {
                                UserSession userSession4 = this.A09;
                                if (userSession4 != null) {
                                    OMa A00 = AbstractC54126NwO.A00(userSession4);
                                    String id = c38321qM.getId();
                                    if (id != null) {
                                        A00.A03("media_id", id);
                                        UserSession userSession5 = this.A09;
                                        if (userSession5 != null) {
                                            AbstractC54126NwO.A00(userSession5).A03("media_type", c38321qM.BRp().name());
                                            UserSession userSession6 = this.A09;
                                            if (userSession6 != null) {
                                                new C55084Oag(context, abstractC10360h2, userSession6, c41181vS).A02(null, null, false, false);
                                                return;
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            boolean A1Z = c41181vS.A1Z();
                            UserSession userSession7 = this.A09;
                            if (A1Z) {
                                if (userSession7 != null) {
                                    C41551w4 c41551w4 = ((ReelViewerFragment) this.A18).A0a;
                                    if (c41551w4 != null) {
                                        reel = c41551w4.A0H;
                                    }
                                    C105814ps c105814ps = c41181vS.A0d;
                                    if (c105814ps != null) {
                                        AbstractC54129NwR.A00(context, userSession7, c105814ps, reel);
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else if (userSession7 != null) {
                                AbstractC54126NwO.A00(userSession7).A03(TraceFieldType.FailureReason, "unknown_failure");
                                UserSession userSession8 = this.A09;
                                if (userSession8 != null) {
                                    AbstractC54126NwO.A00(userSession8).A04("unknown_failure", AnonymousClass001.A0R("Reel item was not a media or a pending media, instead it was type: ", c41181vS.A0e.name()));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DBF(User user) {
        Context context;
        C3DN A01;
        C14360o3.A0B(user, 0);
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (A01 = C3DN.A00.A01(context)) != null) {
            this.A18.EJE("tapped");
            Bundle bundle = new Bundle();
            UserSession userSession = this.A09;
            if (userSession != null) {
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putSerializable("fundraiser_entrypoint", EnumC68135VCu.STORY_DONATE_PROMPT);
                try {
                    Parcelable.Creator creator = User.CREATOR;
                    bundle.putString("story_donate_prompt_user_model_json", AbstractC38851rI.A07(user));
                    V00 v00 = new V00();
                    v00.A06 = new C42784IwM(A01, this);
                    v00.setArguments(bundle);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C189448aO c189448aO = new C189448aO(userSession2);
                        c189448aO.A0a = false;
                        c189448aO.A0d = context.getString(2131970136);
                        c189448aO.A0X = new AbstractC86353t7() { // from class: X.9px
                            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                            public final void DB6() {
                                AbstractC166987dD.A1X(C145176gc.this);
                            }
                        };
                        c189448aO.A00().A03(context, v00);
                        return;
                    }
                } catch (IOException unused) {
                    C0w9.A03(__redex_internal_original_name, "Could not json serialize model User for the fundraiser consumption sheet.");
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DEi(C41181vS c41181vS, C41551w4 c41551w4) {
        FragmentActivity activity;
        Integer num;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1NB c1nb = c41551w4.A0H.A0W;
            if (c1nb != null) {
                num = c1nb.CBs();
            } else {
                num = null;
            }
            if (num != C05F.A01) {
                C0w9.A03("ReelViewerItemDelegateImpl#onExclusiveStoryBadgeClick with non user media owner", "we only expect users to create exclusive stories");
                return;
            }
            this.A18.EJE("dialog");
            User user = c41181vS.A0i;
            if (user == null) {
                return;
            }
            if (c41181vS.A1F()) {
                FragmentActivity requireActivity = fragment.requireActivity();
                UserSession userSession = this.A09;
                if (userSession != null) {
                    AbstractC35068Fcf.A02(requireActivity, new C19270xB("stories_teaser_badge"), userSession, user, null, true);
                    return;
                }
            } else {
                AbstractC35234FgS.A02(activity, new DialogInterfaceOnDismissListenerC23185AOy(this), ProductType.STORY, user.getUsername());
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    C99694dm A00 = AbstractC99684dl.A00(userSession2);
                    long parseLong = Long.parseLong(user.getId());
                    C18920wW c18920wW = A00.A00;
                    InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_fan_club_story_crown_icon_tapped");
                    A002.AAP("container_module", "story_viewer");
                    A002.A9K("creator_igid", Long.valueOf(parseLong));
                    A002.Cht();
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DFX(C41181vS c41181vS, C41551w4 c41551w4) {
        String str;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C141596ac C00 = ((C146226iL) ((ReelViewerFragment) this.A18).A1C).A0C.C00(c41181vS);
        C145826hf c145826hf = this.A0L;
        if (c145826hf == null) {
            str = "reelViewerLogger";
        } else {
            c145826hf.A0Q(c41551w4, "tap", "ig_story_item_share_to_facebook_story_action", C00.A0B, C00.A0A);
            UserSession userSession = this.A09;
            str = "userSession";
            if (userSession != null) {
                if (!Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36318728786483637L)).booleanValue()) {
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        if (!AbstractC49092Nc.A00(userSession2).A00(CallerContext.A00(C145176gc.class), "ig_android_sdk_token_cache_ig_to_fb_crossposting_connection_checking")) {
                            UserSession userSession3 = this.A09;
                            if (userSession3 != null) {
                                AbstractC35174FfR.A00(EnumC72435Xdf.A0N, userSession3, MSV.A00(600));
                            }
                        }
                    }
                }
                C14360o3.A07(C0HM.A00().toString());
                C146836jL c146836jL = this.A0s;
                if (c146836jL == null) {
                    str = "reelViewerFBShareManager";
                } else {
                    c146836jL.A06(c41181vS, C05F.A00);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r7 == null) goto L14;
     */
    @Override // X.InterfaceC144596ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DJq(X.C41181vS r12, X.C41551w4 r13) {
        /*
            r11 = this;
            r10 = 0
            X.6hn r2 = r11.A0d
            if (r2 != 0) goto Lf
            java.lang.String r0 = "reelProfileOpener"
        L7:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lf:
            X.53a r0 = r11.A18
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.5Gn r0 = r0.A1C
            r4 = r12
            X.6ac r6 = r0.C00(r12)
            X.1qM r1 = r12.A0b
            if (r1 == 0) goto L2b
            com.instagram.common.session.UserSession r0 = r11.A09
            if (r0 != 0) goto L25
            java.lang.String r0 = "userSession"
            goto L7
        L25:
            com.instagram.user.model.User r7 = r1.A2E(r0)
            if (r7 != 0) goto L2d
        L2b:
            com.instagram.user.model.User r7 = r12.A0i
        L2d:
            X.C65 r3 = X.C65.BRAND
            java.lang.String r8 = "name"
            java.lang.String r9 = "reel_viewer_go_to_profile"
            r5 = r13
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DJq(X.1vS, X.1w4):void");
    }

    @Override // X.InterfaceC144596ff
    public final void DKo(RectF rectF, User user, String str) {
        C14360o3.A0B(str, 0);
        C3t0 c3t0 = this.A0V;
        if (c3t0 == null) {
            C14360o3.A0F("highlightReelOpener");
            throw C00O.createAndThrow();
        }
        c3t0.A00(rectF, null, C3G2.A13, user, str, null);
    }

    @Override // X.InterfaceC144586fe
    public final void DKq(C41181vS c41181vS, C41551w4 c41551w4) {
        FragmentActivity activity;
        String str;
        String str2;
        C38321qM c38321qM;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C141596ac C00 = ((ReelViewerFragment) interfaceC1118853a).A1C.C00(c41181vS);
        C145826hf c145826hf = this.A0L;
        ImageUrl imageUrl = null;
        if (c145826hf == null) {
            str2 = "reelViewerLogger";
        } else {
            c145826hf.A0Q(c41551w4, "tap", "ig_story_item_highlight_add_highlight_action", C00.A0B, C00.A0A);
            Fragment fragment = (Fragment) this.A1B.get();
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                if (c41181vS.A0e == EnumC41231vY.A09 && (c38321qM = c41181vS.A0b) != null) {
                    str = c38321qM.getId();
                } else {
                    str = null;
                }
                C3I9 c3i9 = this.A0A;
                if (c3i9 == null) {
                    str2 = "keyboardHeightChangeDetector";
                } else {
                    c3i9.EFx(this.A15);
                    C38321qM c38321qM2 = c41181vS.A0b;
                    if (c38321qM2 != null) {
                        imageUrl = c38321qM2.A1S();
                    }
                    this.A1A.A01(false, true);
                    UserSession userSession = this.A09;
                    str2 = "userSession";
                    if (userSession != null) {
                        String str3 = userSession.token;
                        C3G2 c3g2 = this.A0G;
                        if (c3g2 == null) {
                            str2 = "reelViewerSource";
                        } else {
                            InlineAddHighlightFragment A03 = AbstractC55178Odj.A03(imageUrl, c3g2, str3, str);
                            UserSession userSession2 = this.A09;
                            if (userSession2 != null) {
                                C189448aO c189448aO = new C189448aO(userSession2);
                                c189448aO.A0T = new PHS(activity, c41181vS, this);
                                c189448aO.A00().A02(activity, A03);
                                interfaceC1118853a.EJE("fragment_paused");
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144596ff
    public final void DKv(View view, C41181vS c41181vS) {
        C149196nT c149196nT;
        if (c41181vS.CY4() && (c149196nT = this.A1A.A0F) != null && !c149196nT.A02) {
            C5SW c5sw = c149196nT.A00;
            if (c5sw != null && c5sw.A09()) {
                return;
            }
            C23031Ai c23031Ai = (C23031Ai) c149196nT.A05.getValue();
            if (((Boolean) c23031Ai.A3f.CES(c23031Ai, C23031Ai.A8c[203])).booleanValue()) {
                return;
            }
            c149196nT.A02 = true;
            view.post(new RunnableC24704Awl(view, c149196nT));
        }
    }

    @Override // X.InterfaceC144656fl
    public final void DOv(EnumC77173d3 enumC77173d3, Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(enumC77173d3, 2);
        InterfaceC144656fl interfaceC144656fl = this.A0U;
        if (interfaceC144656fl == null) {
            C14360o3.A0F("storyLikesDelegate");
            throw C00O.createAndThrow();
        }
        interfaceC144656fl.DOv(enumC77173d3, reel, c41181vS);
        C145926hp c145926hp = this.A0k;
        if (c145926hp != null) {
            c145926hp.A00(true);
        }
    }

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        Fragment fragment;
        FragmentActivity activity;
        C3DN A00;
        C14360o3.A0B(motionEvent, 0);
        if (!this.A11 || !A0B() || (fragment = (Fragment) this.A1B.get()) == null || (activity = fragment.getActivity()) == null || (A00 = C3DN.A00.A00(activity)) == null) {
            return false;
        }
        C3DP c3dp = (C3DP) A00;
        if (!c3dp.A0a) {
            return false;
        }
        c3dp.A0e = true;
        boolean dispatchTouchEvent = ((InterfaceC56392iX) c3dp.A12.getValue()).getView().dispatchTouchEvent(motionEvent);
        c3dp.A0e = false;
        if (!dispatchTouchEvent) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC144646fk
    public final void DS8(InterfaceC109864xE interfaceC109864xE, C38321qM c38321qM) {
        FragmentActivity activity;
        String actionUrl;
        InterfaceC1118853a interfaceC1118853a;
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (actionUrl = interfaceC109864xE.getActionUrl()) != null && actionUrl.length() != 0) {
            UserSession userSession = this.A09;
            String str2 = "userSession";
            if (userSession != null) {
                InterfaceC60442pS interfaceC60442pS = this.A16;
                EnumC39628Hem A00 = EnumC39628Hem.A00(interfaceC109864xE);
                A00.A00 = actionUrl;
                AbstractC41647Ibf.A00(A00, EnumC39624Hei.A00(interfaceC109864xE), c38321qM, interfaceC60442pS, userSession, C05F.A0C);
                Integer A01 = AbstractC28293Cdf.A01(interfaceC109864xE);
                if (A01 != null) {
                    int intValue = A01.intValue();
                    if (intValue != 0) {
                        if (intValue == 3) {
                            HashMap A002 = AbstractC41653Ibl.A00(c38321qM, interfaceC60442pS.getModuleName());
                            C146026hz c146026hz = this.A0r;
                            if (c146026hz == null) {
                                str2 = "reelViewerBloksHelper";
                            } else {
                                c146026hz.A00(null, actionUrl, A002);
                                interfaceC1118853a = this.A18;
                                str = "bloks";
                                interfaceC1118853a.EJE(str);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            C63397SjR c63397SjR = new C63397SjR(activity, userSession2, C2Fb.A2R, actionUrl, false);
                            UserSession userSession3 = this.A09;
                            if (userSession3 != null) {
                                c63397SjR.A0E(userSession3.userId);
                                c63397SjR.A0S = interfaceC60442pS.getModuleName();
                                c63397SjR.A0A();
                                interfaceC1118853a = this.A18;
                                str = "fragment_paused";
                                interfaceC1118853a.EJE(str);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DTQ(C41181vS c41181vS, Integer num, String str) {
        String str2;
        FragmentActivity activity;
        C84823qW c84823qW;
        String str3;
        Object obj;
        PromptStickerModel A0E;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 3 && intValue != 0) {
                if (intValue == 2) {
                    str2 = null;
                } else {
                    throw new RuntimeException();
                }
            } else {
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
                if (abstractC59962oe == null || (activity = abstractC59962oe.getActivity()) == null) {
                    return;
                }
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    Iterator it = c38321qM.A3N().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            C84823qW c84823qW2 = (C84823qW) obj;
                            if (c84823qW2.A12 == EnumC75383a5.A11 && (A0E = c84823qW2.A0E()) != null && A0E.A0B) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    c84823qW = (C84823qW) obj;
                } else {
                    c84823qW = null;
                }
                InterfaceC1118853a interfaceC1118853a = this.A18;
                interfaceC1118853a.EJE("bottom_sheet");
                if (c84823qW != null) {
                    UserSession userSession = this.A09;
                    if (userSession == null) {
                        str3 = "userSession";
                    } else {
                        PromptStickerModel A0E2 = c84823qW.A0E();
                        if (A0E2 != null) {
                            String str4 = c41181vS.A0k;
                            String str5 = this.A0y;
                            if (str5 == null) {
                                str3 = "traySessionId";
                            } else {
                                String str6 = this.A0z;
                                if (str6 == null) {
                                    str3 = "viewerSessionId";
                                } else {
                                    C145826hf c145826hf = this.A0L;
                                    if (c145826hf == null) {
                                        str3 = "reelViewerLogger";
                                    } else {
                                        AbstractC54892OPn.A00(activity, C22P.A47, abstractC59962oe, userSession, c41181vS, c145826hf, null, interfaceC1118853a, A0E2, null, str4, str5, str6, C16930sl.A00);
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                A09(null, C05F.A00, "memu_bottom_sheet_try_it_button");
                return;
            }
        } else {
            str2 = "imagine_with_meta_ai_intent_try_it_button";
        }
        A09(str, num, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel, com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel] */
    @Override // X.InterfaceC144596ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTd(X.C41181vS r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DTd(X.1vS, java.util.List):void");
    }

    @Override // X.InterfaceC144586fe
    public final void DUy(C38321qM c38321qM, boolean z) {
        FragmentActivity activity;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
        if (abstractC59962oe != null && (activity = abstractC59962oe.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C34570FLe c34570FLe = new C34570FLe(userSession, this.A16.getModuleName());
            J7R j7r = new J7R(this, 32);
            J7R j7r2 = new J7R(this, 33);
            j7r.invoke();
            UserSession userSession2 = c34570FLe.A01;
            String A0R = AnonymousClass001.A0R("myWeek:", userSession2.userId);
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession2);
            C14360o3.A07(A03);
            Reel A0M = A03.A0M(A0R);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            boolean z2 = !z;
            String str = "";
            String id = c38321qM.getId();
            if (z) {
                if (id != null) {
                    str = id;
                }
                linkedHashSet2.add(str);
            } else {
                if (id != null) {
                    str = id;
                }
                linkedHashSet.add(str);
            }
            C6WQ c6wq = new C6WQ(activity, true);
            C1ON A01 = AbstractC1571873x.A01(EnumC53243Ngg.A0A, userSession2, A0R, null, null, null, null, linkedHashSet, linkedHashSet2, 0, 0);
            A01.A00 = new EU5(activity, c38321qM, A0M, c6wq, c34570FLe, A0R, j7r2, z2);
            abstractC59962oe.schedule(A01);
        }
    }

    @Override // X.C3h2
    public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        C38321qM c38321qM;
        String A2u;
        Integer num;
        String str;
        String fbidV2;
        C14360o3.A0B(interfaceC38401qU, 0);
        C14360o3.A0B(interfaceC109864xE, 2);
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c38321qM = AuU.A0b) != null && (A2u = c38321qM.A2u()) != null && A2u.equals(interfaceC38401qU.Biw())) {
            if (C14360o3.A0K(interfaceC109864xE.getActionUrl(), "com.instagram.challenge.show_age_verification_flow.action")) {
                C145826hf c145826hf = this.A0L;
                if (c145826hf == null) {
                    str = "reelViewerLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                UserSession userSession = c145826hf.A06;
                AbstractC12220kQ.A02(userSession);
                String A38 = c38321qM.A38();
                if (A38 != null) {
                    AbstractC003100w.A0k(10, A38);
                }
                User A00 = AbstractC08690cX.A00(userSession);
                if (A00 != null && (fbidV2 = A00.A03.getFbidV2()) != null) {
                    AbstractC003100w.A0k(10, fbidV2);
                }
            }
            UserSession userSession2 = this.A09;
            if (userSession2 == null) {
                str = "userSession";
            } else {
                InterfaceC60442pS interfaceC60442pS = this.A16;
                EnumC39628Hem enumC39628Hem = EnumC39628Hem.OPEN_BLOKS_APP;
                enumC39628Hem.A00 = interfaceC109864xE.getActionUrl();
                EnumC39624Hei A002 = EnumC39624Hei.A00(interfaceC109864xE);
                if (AuU.CY4()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                AbstractC41647Ibf.A00(enumC39628Hem, A002, interfaceC38401qU, interfaceC60442pS, userSession2, num);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String Biw = interfaceC38401qU.Biw();
                C14360o3.A07(Biw);
                linkedHashMap.put("media_id", Biw);
                String Biv = interfaceC38401qU.Biv();
                C14360o3.A07(Biv);
                linkedHashMap.put("author_id", Biv);
                linkedHashMap.put("module", interfaceC60442pS.getModuleName());
                C146026hz c146026hz = this.A0r;
                if (c146026hz == null) {
                    str = "reelViewerBloksHelper";
                } else {
                    String actionUrl = interfaceC109864xE.getActionUrl();
                    if (actionUrl != null) {
                        c146026hz.A00(AuU, actionUrl, linkedHashMap);
                        interfaceC1118853a.EJE("bloks");
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DXh(C41181vS c41181vS, C41551w4 c41551w4) {
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            if (c38321qM.A3Z().size() == 2) {
                this.A18.EJE("tapped");
                InterfaceC60442pS interfaceC60442pS = this.A16;
                UserSession userSession = this.A09;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    AbstractC55229Oez.A0A(fragment, userSession, c38321qM, interfaceC60442pS, new AbstractC86353t7() { // from class: X.9py
                        @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                        public final void DB6() {
                            AbstractC166987dD.A1X(C145176gc.this);
                        }
                    });
                    return;
                }
            } else if (!c38321qM.A3Z().isEmpty()) {
                C145906hn c145906hn = this.A0d;
                if (c145906hn == null) {
                    str = "reelProfileOpener";
                } else {
                    c145906hn.A02(C65.BRAND, c41181vS, c41551w4, ((C146226iL) ((ReelViewerFragment) this.A18).A1C).A0C.C00(c41181vS), (User) c38321qM.A3Z().get(0), "sponsor_in_header", "reel_viewer_go_to_profile", false);
                    return;
                }
            } else {
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Dc6(C41181vS c41181vS, C41551w4 c41551w4) {
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && fragment.isAdded()) {
            if (fragment.getActivity() != null) {
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    C1Y6 A00 = AbstractC69888VxF.A00();
                    UserSession userSession = this.A09;
                    if (userSession == null) {
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                    InterfaceC60442pS interfaceC60442pS = this.A16;
                    String moduleName = interfaceC60442pS.getModuleName();
                    C105844pv c105844pv = c41181vS.A0f;
                    if (c105844pv != null) {
                        str = c105844pv.A00.AsC();
                    } else {
                        str = null;
                    }
                    A00.A07(fragment, new C42148Ilw(this), null, interfaceC60442pS, userSession, c38321qM, moduleName, str, true);
                    return;
                }
                throw new IllegalStateException("media can not be null for story promote");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DdS(C38321qM c38321qM) {
        User CDj;
        String A00;
        C146966jY c146966jY = this.A0t;
        if (c146966jY == null) {
            C14360o3.A0F("reelViewerIGShareManager");
            throw C00O.createAndThrow();
        }
        FragmentActivity activity = c146966jY.A01.getActivity();
        if (activity != null && (CDj = c38321qM.A0C.CDj()) != null && (A00 = AbstractC76433bn.A00(CDj)) != null) {
            UserSession userSession = c146966jY.A02;
            AnonymousClass189.A00(userSession).A01(CDj, false, false);
            c146966jY.A04.EJE("tapped");
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC43591JPw.A00(418), A00);
            C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, "reel_mention_share").A0C(activity);
        }
    }

    @Override // X.InterfaceC144616fh
    public final boolean Ddl(C84823qW c84823qW, int i, int i2) {
        String str;
        C14360o3.A0B(c84823qW, 0);
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A18;
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        if (c41551w4 == null || reelViewerFragment.A2r || reelViewerFragment.A2Y || c41551w4.A0D || this.A1A.A03()) {
            return false;
        }
        UserSession userSession = this.A09;
        if (userSession == null) {
            str = "userSession";
        } else {
            C41181vS A08 = c41551w4.A08(userSession);
            if (A08 != null && A08.A1Z()) {
                return false;
            }
            C148536mO c148536mO = this.A0Q;
            if (c148536mO == null) {
                str = "reelInteractiveController";
            } else {
                return c148536mO.A05(c84823qW, i, i2);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144586fe
    public final void Ddw(RectF rectF, C41181vS c41181vS, C41551w4 c41551w4, Integer num, boolean z) {
        FragmentActivity activity;
        Context context;
        C65 c65;
        User CDj;
        String str;
        C1NB c1nb;
        User CDj2;
        String A00;
        FragmentActivity activity2;
        Fragment fragment;
        FragmentActivity activity3;
        C22P c22p;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(num, 2);
        WeakReference weakReference = this.A1B;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (activity = fragment2.getActivity()) != null && (context = fragment2.getContext()) != null) {
            InterfaceC1118853a interfaceC1118853a = this.A18;
            interfaceC1118853a.CMc();
            String str2 = "userSession";
            String str3 = null;
            if (this.A09 != null) {
                Reel reel = c41551w4.A0H;
                boolean z2 = reel.A1a;
                if (z2 && !reel.A0b() && !reel.A0i()) {
                    Bundle bundle = new Bundle();
                    C3G2 c3g2 = this.A0G;
                    if (c3g2 == null) {
                        str2 = "reelViewerSource";
                    } else {
                        if (c3g2 == C3G2.A1W) {
                            c22p = C22P.A0W;
                        } else {
                            c22p = C22P.A0V;
                        }
                        bundle.putSerializable("camera_entry_point", c22p);
                        if (c41181vS.A0B() == EnumC76383bi.A0C && C37351oY.A03 != null) {
                            C37351oY A002 = AbstractC151756sL.A00();
                            UserSession userSession = this.A09;
                            if (userSession != null) {
                                if (A002.A05(userSession)) {
                                    Parcelable.Creator creator = PendingRecipient.CREATOR;
                                    UserSession userSession2 = this.A09;
                                    if (userSession2 != null) {
                                        PendingRecipient pendingRecipient = new PendingRecipient(C08730cb.A00(userSession2).A00());
                                        pendingRecipient.A0Y = true;
                                        bundle.putParcelable("target_group_profile_id", pendingRecipient);
                                        bundle.putSerializable("post_capture_story_shortcut_config", C81K.A09);
                                    }
                                }
                            }
                        }
                        InterfaceC1119353f interfaceC1119353f = this.A17;
                        UserSession userSession3 = this.A09;
                        if (userSession3 != null) {
                            AbstractC47126KsL.A00(rectF, bundle, fragment2, userSession3, interfaceC1119353f);
                            return;
                        }
                    }
                } else {
                    if (reel.A0g()) {
                        User user = c41181vS.A0i;
                        if (user != null) {
                            C145906hn c145906hn = this.A0d;
                            if (c145906hn != null) {
                                C145906hn.A01(c145906hn, null, user.getId(), "reel_viewer_go_to_profile", false);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        C1NB c1nb2 = reel.A0W;
                        if (c1nb2 != null) {
                            int intValue = c1nb2.BWG().intValue();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        if (intValue == 4 && (fragment = (Fragment) weakReference.get()) != null && (activity3 = fragment.getActivity()) != null) {
                                            UserSession userSession4 = this.A09;
                                            if (userSession4 != null) {
                                                C36881nl A01 = C36881nl.A01(activity3, this.A16, userSession4, "reel_viewer_title");
                                                C1NB c1nb3 = reel.A0W;
                                                if (c1nb3 != null) {
                                                    A01.A0A(c1nb3.getId());
                                                    A01.A06();
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        C1NB c1nb4 = reel.A0W;
                                        if (c1nb4 != null) {
                                            A02(AbstractC1120253r.A00(c1nb4.getId()));
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    C1NB c1nb5 = reel.A0W;
                                    if (c1nb5 != null) {
                                        String id = c1nb5.getId();
                                        Fragment fragment3 = (Fragment) weakReference.get();
                                        if (fragment3 != null && (activity2 = fragment3.getActivity()) != null) {
                                            UserSession userSession5 = this.A09;
                                            if (userSession5 != null) {
                                                C140966Yy c140966Yy = new C140966Yy(activity2, userSession5);
                                                c140966Yy.A0F = true;
                                                C1VW c1vw = C1VW.A00;
                                                if (c1vw != null) {
                                                    c140966Yy.A0B(null, c1vw.getFragmentFactory().CsU(id));
                                                    c140966Yy.A04();
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                C14360o3.A0F("userSession");
                                throw C00O.createAndThrow();
                            }
                            if (c41181vS.A0B() == EnumC76383bi.A0C) {
                                if (C37351oY.A03 != null) {
                                    C37351oY A003 = AbstractC151756sL.A00();
                                    UserSession userSession6 = this.A09;
                                    if (userSession6 != null) {
                                        if (A003.A04(userSession6) && (c1nb = reel.A0W) != null && (CDj2 = c1nb.CDj()) != null) {
                                            C35043FcG A012 = AbstractC151756sL.A00().A01();
                                            String id2 = CDj2.getId();
                                            if (num == C05F.A01) {
                                                A00 = "profile_picture";
                                            } else {
                                                A00 = AbstractC37316GcI.A00(34, 8, 83);
                                            }
                                            FragmentActivity requireActivity = fragment2.requireActivity();
                                            UserSession userSession7 = this.A09;
                                            if (userSession7 != null) {
                                                A012.A04(requireActivity, userSession7, null, id2, A00, true, false);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                if (reel.A0i() && z2) {
                                    if (reel.A0n()) {
                                        interfaceC1118853a.EJE("tapped");
                                        C55909Os0 A004 = A00(c41181vS, c41551w4);
                                        if (A004 != null) {
                                            C145216gg c145216gg = this.A1O;
                                            DialogInterface.OnDismissListener onDismissListener = this.A1C;
                                            C145236gi c145236gi = this.A1G;
                                            C145246gj c145246gj = this.A1L;
                                            A004.A0Y(context, onDismissListener, this.A16, c145216gg, this.A1F, new P8H(c41181vS, c41551w4, this), this.A1E, c145236gi, c145246gj);
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    return;
                                }
                                if (c41181vS.A10()) {
                                    c65 = C65.INFLUENCER;
                                } else {
                                    c65 = C65.BRAND;
                                }
                                int intValue2 = num.intValue();
                                if (intValue2 != 0) {
                                    if (intValue2 != 1) {
                                        if (intValue2 != 3) {
                                            if (intValue2 != 4) {
                                                if (intValue2 != 6) {
                                                    if (intValue2 == 7) {
                                                        str3 = "header_popularity_proof";
                                                    }
                                                } else {
                                                    str3 = "social_context_followed_by";
                                                }
                                            } else {
                                                str3 = "end_scene_name";
                                            }
                                        } else {
                                            str3 = "end_scene_icon";
                                        }
                                    } else {
                                        str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
                                    }
                                } else if (c41181vS.A10()) {
                                    str3 = "influencer_in_header";
                                } else {
                                    str3 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                                }
                                if (AbstractC130925vf.A0p(c41551w4)) {
                                    CDj = c41181vS.A0i;
                                } else {
                                    C1NB c1nb6 = reel.A0W;
                                    if (c1nb6 != null) {
                                        CDj = c1nb6.CDj();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                C38321qM c38321qM = c41181vS.A0b;
                                if (c38321qM != null && CDj != null && CDj.A01() == 31) {
                                    UserSession userSession8 = this.A09;
                                    if (userSession8 != null) {
                                        if (C18U.A06(C06090Tz.A05, userSession8, 36327765397486430L)) {
                                            C145906hn c145906hn2 = this.A0d;
                                            if (c145906hn2 != null) {
                                                UserSession userSession9 = this.A09;
                                                if (userSession9 != null) {
                                                    C141596ac C00 = ((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(c41181vS);
                                                    C41607Iaw c41607Iaw = C41607Iaw.A00;
                                                    InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                                                    if (injected == null || (str = injected.AZR()) == null) {
                                                        str = "";
                                                    }
                                                    c41607Iaw.A00(activity, userSession9, c38321qM, new C75113Zb(c38321qM.A0p(), c38321qM.A4w()), interfaceC1118853a, str);
                                                    C145906hn.A00(c65, c41181vS, c41551w4, C00, c145906hn2, str3, CDj.A2N(), z);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                C145906hn c145906hn3 = this.A0d;
                                if (c145906hn3 != null) {
                                    c145906hn3.A02(c65, c41181vS, c41551w4, ((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(c41181vS), CDj, str3, "reel_viewer_go_to_profile", z);
                                    A03(c41181vS);
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C14360o3.A0F("reelProfileOpener");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DeH(Reel reel, C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        InterfaceC1118853a interfaceC1118853a = this.A18;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
        if (interfaceC147266kB != null) {
            this.A1A.A01(true, true);
            InterfaceC114805Gn interfaceC114805Gn = reelViewerFragment.A1C;
            if (z) {
                interfaceC114805Gn.Epc(reel, c41551w4);
            } else {
                ((C147256kA) interfaceC147266kB).A04.A0L(interfaceC114805Gn.CNP(reel), 0.0f);
            }
            reelViewerFragment.A1C.C00(c41181vS).A0W = C05F.A05;
            interfaceC1118853a.FAc(-1);
            reelViewerFragment.A1C.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Dga(C41181vS c41181vS, ReelType reelType, C41551w4 c41551w4, String str) {
        FragmentActivity activity;
        C38321qM c38321qM;
        String id;
        String str2;
        String str3;
        EnumC72436Xdg enumC72436Xdg;
        C3DN A00;
        String str4 = null;
        if (c41551w4 != null) {
            C141596ac C00 = ((ReelViewerFragment) this.A18).A1C.C00(c41181vS);
            C145826hf c145826hf = this.A0L;
            if (c145826hf == null) {
                str3 = "reelViewerLogger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            c145826hf.A0Q(c41551w4, "tap", "ig_story_item_share_as_direct_string_action", C00.A0B, C00.A0A);
        }
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (c38321qM = c41181vS.A0b) != null && (id = c38321qM.getId()) != null) {
            this.A1A.A01(true, true);
            InterfaceC1118853a interfaceC1118853a = this.A18;
            interfaceC1118853a.EJE("context_switch");
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            UserSession userSession = this.A09;
            if (userSession != null) {
                C2EY c2ey = C2EY.A1g;
                InterfaceC60442pS interfaceC60442pS = this.A16;
                C34726FRp A07 = c28501Zl.A07(interfaceC60442pS, userSession, c2ey);
                A07.A06(id);
                A07.A04(interfaceC60442pS);
                Bundle bundle = A07.A07;
                bundle.putInt("DirectShareSheetConstants.carousel_index", 0);
                String str5 = c41181vS.A0k;
                C14360o3.A07(str5);
                bundle.putString(MSV.A00(160), str5);
                String str6 = c41181vS.A0j;
                C14360o3.A07(str6);
                bundle.putString("DirectShareSheetFragment.reel_item_id", str6);
                if (reelType != null) {
                    str2 = reelType.toString();
                } else {
                    str2 = null;
                }
                bundle.putString("DirectShareSheetFragment.reel_type", str2);
                String moduleName = interfaceC60442pS.getModuleName();
                C14360o3.A0B(moduleName, 0);
                bundle.putString("DirectShareSheetFragment.reel_viewer_module_name", moduleName);
                String str7 = this.A0y;
                str3 = "traySessionId";
                if (str7 != null) {
                    bundle.putString("DirectShareSheetFragment.tray_session_id", str7);
                    String str8 = this.A0z;
                    if (str8 == null) {
                        str3 = "viewerSessionId";
                    } else {
                        bundle.putString("DirectShareSheetFragment.viewer_session_id", str8);
                        if (c41181vS.A1K()) {
                            enumC72436Xdg = EnumC72436Xdg.A0g;
                        } else {
                            enumC72436Xdg = EnumC72436Xdg.A0e;
                        }
                        bundle.putSerializable("DirectShareSheetConstants.share_surface", enumC72436Xdg);
                        DirectShareSheetFragment A002 = A07.A00();
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            String str9 = this.A0y;
                            if (str9 != null) {
                                if (reelType == ReelType.A05) {
                                    str4 = "moments_with_friends";
                                }
                                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
                                IQF.A00(interfaceC60442pS, userSession2, c38321qM, null, ((C146226iL) reelViewerFragment.A1C).A0C.C00(c41181vS), null, null, null, null, str9, str4, 0);
                                if (fragment.isResumed() && (A00 = C3DN.A00.A00(activity)) != null) {
                                    A00.A0N(A002, new C24134AnJ(c41181vS, c41551w4, this));
                                }
                                C6k4 c6k4 = reelViewerFragment.A16;
                                C31349DqE c31349DqE = c6k4.A00;
                                if (c31349DqE != null) {
                                    C41451vu.A01.E4s(new C3KF(c31349DqE));
                                }
                                c6k4.A00 = null;
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DhG(C105814ps c105814ps) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C40131tg c40131tg = C40121td.A0G;
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C40121td A01 = c40131tg.A01(context, userSession);
            C47Z c47z = c105814ps.A00;
            C14360o3.A07(c47z);
            C150856qj.A02(context);
            A01.A08(c47z);
            this.A18.ADf(false);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0073. Please report as an issue. */
    @Override // X.InterfaceC144586fe
    public final boolean Dr1(C3G2 c3g2, List list) {
        FragmentActivity activity;
        C14360o3.A0B(c3g2, 1);
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    H6O h6o = (H6O) it.next();
                    EnumC46183KcL A00 = AbstractC47875LCv.A00(h6o.A04);
                    String str = (String) AbstractC47902LDw.A01.get(A00);
                    OWL owl = OWL.A01;
                    String str2 = h6o.A02;
                    String str3 = null;
                    if (str2 != null) {
                        File A002 = owl.A00(A00, str2);
                        if (A002.exists()) {
                            str3 = A002.getCanonicalPath();
                        }
                    }
                    if (str != null && str3 != null) {
                        List list2 = (List) C41618Ib8.A09.get(A00);
                        if (list2 == null) {
                            list2 = C16930sl.A00;
                        }
                        if (list2.isEmpty()) {
                            switch (A00.ordinal()) {
                                case 0:
                                case 4:
                                case 5:
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                case 6:
                                    break;
                                default:
                                    throw new RuntimeException();
                            }
                        }
                        List list3 = (List) C41618Ib8.A0A.get(A00);
                        if (list3 == null) {
                            list3 = C16930sl.A00;
                        }
                        arrayList.add(new SuperlativeStickerClientModel(A00, str, str3, list2, list3));
                    }
                }
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                Bundle bundle = new Bundle();
                C88X c88x = new C88X(new C189128Zd(null, C88Z.A0d, null));
                try {
                    bundle.putString("create_mode_attribution", ADL.A00(c88x));
                    bundle.putParcelable("camera_configuration", C82R.A00(C208509Kk.A00, C81W.A0C));
                    bundle.putSerializable("camera_entry_point", C37947Gmp.A00(c3g2));
                    bundle.putParcelableArrayList("SUPERLATIVE_SHARE_STICKER_MODELS", new ArrayList<>(arrayList));
                    bundle.putBoolean("IS_SUPERLATIVE_SHARE_FULL_STORY", true);
                    C6XJ A02 = C6XJ.A02(activity, bundle, userSession, ModalActivity.class, "attribution_quick_camera_fragment");
                    A02.A07();
                    A02.A0C(activity);
                    return true;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to serialize dialElement of type ");
                    C88Z c88z = c88x.A04;
                    if (c88z == null) {
                        c88z = C88Z.A0G;
                    }
                    sb.append(c88z);
                    C0w9.A06("serialize_create_mode_attribution", sb.toString(), e);
                    return true;
                }
            }
            C9GR.A0B(activity, "SuperlativeShareFullStoryFailed");
        }
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, X.HCu, X.2oe, X.51D] */
    @Override // X.InterfaceC144596ff
    public final void Dwg(C41181vS c41181vS) {
        Context context;
        AbstractC59962oe abstractC59962oe;
        WeakReference weakReference = this.A1B;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && (context = fragment.getContext()) != null && (abstractC59962oe = (AbstractC59962oe) weakReference.get()) != null) {
            this.A18.EJE("tapped");
            ?? abstractC59962oe2 = new AbstractC59962oe();
            abstractC59962oe2.A02 = new ILY(abstractC59962oe, this);
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                StoryUnlockableStickerTappableObject C2P = c38321qM.A0C.C2P();
                Bundle bundle = new Bundle();
                bundle.putParcelable("sticker_attribution", C2P);
                abstractC59962oe2.setArguments(bundle);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0a = false;
                c189448aO.A0T = abstractC59962oe2;
                c189448aO.A0X = new AbstractC86353t7() { // from class: X.9pz
                    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                    public final void DB6() {
                        AbstractC166987dD.A1X(C145176gc.this);
                    }
                };
                c189448aO.A00().A03(context, abstractC59962oe2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (X.AbstractC84863qa.A0D(r0, r4) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // X.InterfaceC144616fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dwo(boolean r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.Dwo(boolean):void");
    }

    @Override // X.InterfaceC144586fe
    public final void Dxh(C41181vS c41181vS, C41551w4 c41551w4, Integer num) {
        String str;
        Context context;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(num, 2);
        int intValue = num.intValue();
        String str2 = null;
        if (intValue != 0 && intValue != 5) {
            if (intValue == 1) {
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
            }
        } else {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }
        if (c41181vS.A18()) {
            C105824pt c105824pt = c41181vS.A0c;
            if (c105824pt != null) {
                C14360o3.A07(c105824pt.A06());
                if (!r0.isEmpty()) {
                    Fragment fragment = (Fragment) this.A1B.get();
                    if (fragment != null && (context = fragment.getContext()) != null) {
                        ArrayList arrayList = new ArrayList();
                        User user = c41181vS.A0i;
                        if (user != null) {
                            arrayList.add(user);
                            arrayList.addAll(c105824pt.A06());
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            C14360o3.A07(it);
                            while (it.hasNext()) {
                                Object next = it.next();
                                C14360o3.A07(next);
                                arrayList2.add(context.getString(2131976878, ((User) next).getUsername()));
                            }
                            C193328hC c193328hC = new C193328hC(context);
                            UserSession userSession = this.A09;
                            if (userSession == null) {
                                str = "userSession";
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                            c193328hC.A0m(fragment, userSession);
                            c193328hC.A0f(new DialogInterfaceOnClickListenerC41811IfR(c41181vS, c41551w4, this, str2, arrayList), (CharSequence[]) arrayList2.toArray(new CharSequence[0]));
                            c193328hC.A0s(true);
                            c193328hC.A0t(true);
                            C0fJ.A00(c193328hC.A02());
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C145906hn c145906hn = this.A0d;
        if (c145906hn == null) {
            str = "reelProfileOpener";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c145906hn.A02(C65.BRAND, c41181vS, c41551w4, ((C146226iL) ((ReelViewerFragment) this.A18).A1C).A0C.C00(c41181vS), c41181vS.A0i, str2, "reel_viewer_go_to_profile", false);
    }

    @Override // X.InterfaceC144666fm
    public final void E0y(Reel reel) {
        String str;
        reel.A1d = false;
        reel.A1q = true;
        C147316kH c147316kH = this.A0a;
        if (c147316kH == null) {
            str = "reelPhotoTimerController";
        } else {
            c147316kH.A02();
            C147356kL c147356kL = this.A0c;
            if (c147356kL == null) {
                str = "showreelNativeTimerController";
            } else {
                c147356kL.A01();
                C147376kN c147376kN = this.A0b;
                if (c147376kN == null) {
                    str = "showreelCompositionTimerController";
                } else {
                    c147376kN.A01();
                    this.A18.ADf(false);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144586fe
    public final void E15(C41181vS c41181vS, C141596ac c141596ac, boolean z) {
        if (z && c41181vS == this.A18.AuU()) {
            c141596ac.A07(true);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC69573Ar.A00(userSession).A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109 A[EDGE_INSN: B:78:0x0109->B:79:0x0109 BREAK  A[LOOP:2: B:68:0x00e2->B:77:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E16(X.C41181vS r20, X.C41551w4 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.E16(X.1vS, X.1w4, boolean):void");
    }

    @Override // X.InterfaceC144586fe
    public final void E1z(C41181vS c41181vS, C41551w4 c41551w4) {
        String str;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C141596ac C00 = ((C146226iL) ((ReelViewerFragment) this.A18).A1C).A0C.C00(c41181vS);
        C145826hf c145826hf = this.A0L;
        if (c145826hf == null) {
            str = "reelViewerLogger";
        } else {
            c145826hf.A0Q(c41551w4, "tap", "ig_story_share_to_whatsapp_action", C00.A0B, C00.A0A);
            C146946jW c146946jW = this.A0v;
            if (c146946jW == null) {
                str = "reelViewerWAShareManager";
            } else {
                if (c41181vS.A0v()) {
                    Activity activity = c146946jW.A00;
                    DialogInterfaceOnClickListenerC55274Ofp dialogInterfaceOnClickListenerC55274Ofp = new DialogInterfaceOnClickListenerC55274Ofp(c41181vS, c146946jW);
                    DialogInterfaceOnClickListenerC23173AOm dialogInterfaceOnClickListenerC23173AOm = DialogInterfaceOnClickListenerC23173AOm.A00;
                    C193328hC c193328hC = new C193328hC(activity);
                    c193328hC.A0A(2131977085);
                    c193328hC.A09(2131977084);
                    c193328hC.A0J(dialogInterfaceOnClickListenerC55274Ofp, 2131977083);
                    c193328hC.A0D(dialogInterfaceOnClickListenerC23173AOm);
                    c193328hC.A0t(true);
                    C0fJ.A00(c193328hC.A02());
                    return;
                }
                C146946jW.A00(c41181vS, c146946jW, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144586fe
    public final void E2Z(C41181vS c41181vS, C41551w4 c41551w4, Integer num, boolean z) {
        Fragment fragment;
        FragmentActivity activity;
        C14360o3.A0B(num, 2);
        InterfaceC1118853a interfaceC1118853a = this.A18;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        if (!reelViewerFragment.A2r && (fragment = (Fragment) this.A1B.get()) != null && (activity = fragment.getActivity()) != null) {
            C3DN A00 = C3DN.A00.A00(activity);
            if (A00 != null) {
                A00.A0B();
            }
            C143316dW c143316dW = this.A0j;
            if (c143316dW != null) {
                C148176ln c148176ln = this.A0O;
                if (c148176ln == null) {
                    C14360o3.A0F("storyQuickReactionsController");
                    throw C00O.createAndThrow();
                }
                c148176ln.A07 = z;
                this.A1A.A01(true, true);
                interfaceC1118853a.EJE("tapped");
                c143316dW.A0A(num);
                reelViewerFragment.A2P = true;
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final void E2a(C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) this.A18).mViewPager;
        if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
            E2Z(c41181vS, c41551w4, C05F.A01, z);
        }
    }

    private final C55909Os0 A00(C41181vS c41181vS, C41551w4 c41551w4) {
        Context context;
        Activity rootActivity;
        C141596ac C00 = ((ReelViewerFragment) this.A18).A1C.C00(c41181vS);
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
        if (abstractC59962oe == null || (context = abstractC59962oe.getContext()) == null || (rootActivity = abstractC59962oe.getRootActivity()) == null) {
            return null;
        }
        UserSession userSession = this.A09;
        if (userSession != null) {
            String str = this.A0y;
            if (str != null) {
                String str2 = this.A0z;
                String str3 = "viewerSessionId";
                if (str2 != null) {
                    Reel reel = c41551w4.A0H;
                    C130915ve c130915ve = new C130915ve(userSession, reel, str, str2, c41551w4.A01, c41551w4.A0E);
                    c130915ve.A0B = reel.A0X;
                    InterfaceC60442pS interfaceC60442pS = this.A16;
                    Resources resources = context.getResources();
                    C14360o3.A07(resources);
                    C145776ha c145776ha = this.A0R;
                    if (c145776ha == null) {
                        str3 = "reelViewerListenerManager";
                    } else {
                        C3G2 c3g2 = this.A0G;
                        if (c3g2 == null) {
                            str3 = "reelViewerSource";
                        } else {
                            String str4 = this.A0y;
                            if (str4 != null) {
                                String str5 = this.A0z;
                                if (str5 != null) {
                                    UserSession userSession2 = this.A09;
                                    if (userSession2 != null) {
                                        C145186gd c145186gd = this.A19;
                                        C57332k8 A00 = C57332k8.A0m.A00(context, userSession2);
                                        InterfaceC69973Cg interfaceC69973Cg = this.A0D;
                                        ReelViewerConfig reelViewerConfig = this.A0F;
                                        if (reelViewerConfig == null) {
                                            str3 = "reelViewerConfig";
                                        } else {
                                            C145876hk c145876hk = this.A0Y;
                                            if (c145876hk == null) {
                                                str3 = "reelCtaOpener";
                                            } else {
                                                return new C55909Os0(rootActivity, resources, abstractC59962oe, interfaceC60442pS, userSession2, interfaceC69973Cg, c130915ve, interfaceC60442pS, A00, c41181vS, c41551w4, reelViewerConfig, c3g2, c145776ha, C00, c145876hk, c145186gd, str4, str5, new C9E5(this, 23));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("traySessionId");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    public static final void A01(C22P c22p, ACRType aCRType, C41181vS c41181vS, MusicOverlayStickerModel musicOverlayStickerModel, C145176gc c145176gc) {
        String str;
        C38321qM c38321qM;
        String str2;
        UserSession userSession = c145176gc.A09;
        if (userSession != null) {
            C8JY A00 = C8JX.A00(userSession);
            A00.A00(c22p, aCRType);
            Fragment fragment = (Fragment) c145176gc.A1B.get();
            if (fragment == null) {
                str2 = "null_reel_viewer_fragment";
            } else {
                FragmentActivity activity = fragment.getActivity();
                if (activity == null) {
                    str2 = "null_reel_viewer_activity";
                } else if (c145176gc.A09 != null) {
                    INH A0C = AbstractC86593tX.A0C(c22p);
                    if (musicOverlayStickerModel != null) {
                        A0C.A08 = new MusicAttributionConfig(musicOverlayStickerModel);
                    }
                    Bundle A002 = A0C.A00();
                    A002.putSerializable(MSV.A00(17), C5JK.A05);
                    A002.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_TYPE", aCRType.A00);
                    if (aCRType == ACRType.A04) {
                        A002.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_SELF_STORIES_REEL_ID", c41181vS.A0k);
                    } else if (aCRType == ACRType.A07) {
                        A002.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_MEDIA_COLLECTION_ID", c41181vS.A0k);
                        C41181vS AuU = c145176gc.A18.AuU();
                        if (AuU != null && (c38321qM = AuU.A0b) != null) {
                            str = c38321qM.A2u();
                        } else {
                            str = null;
                        }
                        A002.putString("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_STORY_ID", str);
                    }
                    try {
                        UserSession userSession2 = c145176gc.A09;
                        if (userSession2 == null) {
                            C14360o3.A0F("userSession");
                            throw C00O.createAndThrow();
                        }
                        C6XJ A02 = C6XJ.A02(activity, A002, userSession2, TransparentModalActivity.class, "clips_camera");
                        A02.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                        A02.A0A(activity, 9587);
                        return;
                    } catch (TransactionTooLargeException unused) {
                        A00.A02("transaction_too_large_exception");
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to enter camera due to TransactionTooLarge for reel ID: %s", c41181vS.A0k);
                        C14360o3.A07(formatStrLocaleSafe);
                        AbstractC12120kG.A0I(formatStrLocaleSafe, null, AbstractC06930Yk.A0E());
                        C9GR.A0B(activity, "TransactionTooLargeException");
                        return;
                    }
                }
            }
            A00.A02(str2);
            return;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    private final void A02(Hashtag hashtag) {
        FragmentActivity activity;
        Fragment fragment;
        Context context;
        WeakReference weakReference = this.A1B;
        Fragment fragment2 = (Fragment) weakReference.get();
        if (fragment2 != null && (activity = fragment2.getActivity()) != null && (fragment = (Fragment) weakReference.get()) != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C6XJ c6xj = new C6XJ(activity, WE2.A00(hashtag, this.A16.getModuleName(), "DEFAULT"), userSession, ModalActivity.class, "hashtag_feed");
            c6xj.A08();
            c6xj.A0C(context);
        }
    }

    private final void A03(C41181vS c41181vS) {
        String str;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C148146lk c148146lk = this.A0P;
        if (c148146lk != null && c148146lk.A0X.A04() && c148146lk.A0X.A04() && c148146lk.A0J) {
            C41181vS c41181vS2 = c148146lk.A0C;
            String str2 = null;
            if (c41181vS2 != null && (c38321qM2 = c41181vS2.A0b) != null) {
                str = c38321qM2.getId();
            } else {
                str = null;
            }
            C41181vS c41181vS3 = c148146lk.A0B;
            if (c41181vS3 != null && (c38321qM = c41181vS3.A0b) != null) {
                str2 = c38321qM.getId();
            }
            if (C14360o3.A0K(str, str2) && c148146lk.A06(c41181vS)) {
                c148146lk.A0L = true;
                c148146lk.A0a.A00(c148146lk.A0B, C05F.A15, "navigation", c148146lk.A01, c148146lk.A0J);
            }
        }
    }

    private final void A05(C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        FragmentActivity activity;
        Integer num;
        User user;
        EnumC33505Ere enumC33505Ere;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        int i;
        AudienceListIntf audienceListIntf;
        EnumC33505Ere enumC33505Ere2;
        EnumC33505Ere enumC33505Ere3;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1NB c1nb = c41551w4.A0H.A0W;
            if (c1nb != null) {
                num = c1nb.CBs();
            } else {
                num = null;
            }
            if (num != C05F.A01) {
                C0w9.A03("ReelViewerItemDelegateImpl#onAudienceListsBadgeClick with non user media owner", "we only expect users to create private stories");
                return;
            }
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM == null || (user = c41181vS.A0i) == null) {
                return;
            }
            String id = user.getId();
            UserSession userSession2 = this.A09;
            if (userSession2 != null) {
                if (C14360o3.A0K(id, userSession2.userId)) {
                    List AdX = c38321qM.A0C.AdX();
                    if (AdX == null) {
                        return;
                    }
                    if (AdX.size() > 1) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(EnumC33367Ep0.A08, null);
                        EnumC33367Ep0 enumC33367Ep0 = EnumC33367Ep0.A05;
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(AdX, 10));
                        Iterator it = AdX.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AudienceListIntf) it.next()).BNl());
                        }
                        hashMap.put(enumC33367Ep0, arrayList);
                        EnumC33367Ep0 enumC33367Ep02 = EnumC33367Ep0.A07;
                        if (z) {
                            enumC33505Ere3 = EnumC33505Ere.PRODUCER_BADGE_CLICK;
                        } else {
                            enumC33505Ere3 = EnumC33505Ere.PRODUCER_LIST_NAME_CLICK;
                        }
                        hashMap.put(enumC33367Ep02, enumC33505Ere3);
                        AbstractC86353t7 abstractC86353t7 = new AbstractC86353t7() { // from class: X.9pw
                            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                            public final void DB6() {
                                AbstractC166987dD.A1X(C145176gc.this);
                            }
                        };
                        this.A18.EJE("bottom_sheet");
                        UserSession userSession3 = this.A09;
                        if (userSession3 != null) {
                            EOT A00 = AbstractC34039F0s.A00(null, userSession3, hashMap);
                            C189448aO c189448aO = new C189448aO(userSession3);
                            c189448aO.A0U = A00;
                            c189448aO.A0T = A00;
                            c189448aO.A0X = abstractC86353t7;
                            c189448aO.A00().A02(activity, A00);
                            return;
                        }
                    } else if (AdX.size() == 1) {
                        UserSession userSession4 = this.A09;
                        if (userSession4 != null) {
                            FRU fru = new FRU(this.A16, userSession4);
                            if (z) {
                                enumC33505Ere2 = EnumC33505Ere.PRODUCER_BADGE_CLICK;
                            } else {
                                enumC33505Ere2 = EnumC33505Ere.PRODUCER_LIST_NAME_CLICK;
                            }
                            fru.A02(enumC33505Ere2, ((AudienceListIntf) AdX.get(0)).BNl(), ((AudienceListIntf) AdX.get(0)).getName());
                            UserSession userSession5 = this.A09;
                            if (userSession5 != null) {
                                AbstractC35049FcM.A00(activity, (AudienceListIntf) AdX.get(0), userSession5);
                                return;
                            }
                        }
                    } else {
                        UserSession userSession6 = this.A09;
                        if (userSession6 != null) {
                            C684436h c684436h = this.A07;
                            if (c684436h != null) {
                                new FRV(activity, c684436h, userSession6).A01(new DialogInterfaceOnDismissListenerC23183AOw(this), new DialogInterfaceOnShowListenerC41849Ig3(this));
                                return;
                            }
                            C14360o3.A0F("closeFriendsController");
                        }
                    }
                } else {
                    UserSession userSession7 = this.A09;
                    if (userSession7 != null) {
                        C684436h c684436h2 = this.A07;
                        if (c684436h2 != null) {
                            FRV frv = new FRV(activity, c684436h2, userSession7);
                            InterfaceC60442pS interfaceC60442pS = this.A16;
                            if (z) {
                                enumC33505Ere = EnumC33505Ere.CONSUMER_BADGE_CLICK;
                            } else {
                                enumC33505Ere = EnumC33505Ere.CONSUMER_LIST_NAME_CLICK;
                            }
                            DialogInterfaceOnShowListenerC41850Ig4 dialogInterfaceOnShowListenerC41850Ig4 = new DialogInterfaceOnShowListenerC41850Ig4(this);
                            DialogInterfaceOnDismissListenerC23184AOx dialogInterfaceOnDismissListenerC23184AOx = new DialogInterfaceOnDismissListenerC23184AOx(this);
                            Activity activity2 = frv.A00;
                            Resources resources = activity2.getResources();
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(AbstractC172497mJ.A01(activity2));
                            arrayList2.add(new C89533yt(user.Bhu(), interfaceC60442pS.getModuleName(), (int) AbstractC13880nE.A04(activity2, 58), (int) AbstractC13880nE.A04(activity2, 2), activity2.getColor(R.color.igds_elevated_background), activity2.getColor(R.color.grey_1)));
                            C89553yv c89553yv = new C89553yv(activity2, C05F.A00, arrayList2, 0.3f, (int) AbstractC13880nE.A04(activity2, 58), true);
                            C193328hC c193328hC = new C193328hC(activity2);
                            c193328hC.A0j(c89553yv);
                            c193328hC.A0I(null, 2131961124);
                            c193328hC.A0h(dialogInterfaceOnShowListenerC41850Ig4);
                            c193328hC.A0g(dialogInterfaceOnDismissListenerC23184AOx);
                            List AdX2 = c38321qM.A0C.AdX();
                            if (AdX2 != null && (audienceListIntf = (AudienceListIntf) AbstractC001800i.A0O(AdX2, 0)) != null && audienceListIntf.CXV()) {
                                c193328hC.A05 = resources.getString(2131953272, audienceListIntf.getName());
                                userSession = frv.A02;
                                c06090Tz = C06090Tz.A05;
                                j = 36319871247654617L;
                                i = 2131953268;
                                if (C18U.A06(c06090Tz, userSession, 36319871247654617L)) {
                                    i = 2131953270;
                                }
                            } else {
                                c193328hC.A05 = resources.getString(2131953273);
                                userSession = frv.A02;
                                c06090Tz = C06090Tz.A05;
                                j = 36319871247654617L;
                                i = 2131953269;
                                if (C18U.A06(c06090Tz, userSession, 36319871247654617L)) {
                                    i = 2131953271;
                                }
                            }
                            c193328hC.A0r(resources.getString(i, user.getUsername()));
                            if (C18U.A06(c06090Tz, userSession, j)) {
                                c193328hC.A0J(new DialogInterfaceOnClickListenerC35332Fi9(enumC33505Ere, frv, interfaceC60442pS), 2131956963);
                            }
                            c193328hC.A0s(true);
                            c193328hC.A0t(true);
                            C0fJ.A00(c193328hC.A02());
                            return;
                        }
                        C14360o3.A0F("closeFriendsController");
                    }
                }
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    public static final void A08(C145176gc c145176gc) {
        UserSession userSession = c145176gc.A09;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A0T.Egi(A00, true, C23031Ai.A8c[144]);
        c145176gc.E12();
    }

    private final void A09(String str, Integer num, String str2) {
        FragmentActivity activity;
        C41181vS AuU;
        C38321qM c38321qM;
        String id;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            C42402Iq3 c42402Iq3 = new C42402Iq3(this, str2);
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && (c38321qM = AuU.A0b) != null && (id = c38321qM.getId()) != null) {
                    UserSession userSession = c143536ds.A01;
                    C14360o3.A0B(userSession, 0);
                    CreationGenAIAttributionBottomSheetParams creationGenAIAttributionBottomSheetParams = new CreationGenAIAttributionBottomSheetParams(id, num, str);
                    KDP kdp = new KDP();
                    Bundle bundle = new Bundle();
                    AbstractC03240Dh.A00(bundle, userSession);
                    bundle.putParcelable("arg_params", creationGenAIAttributionBottomSheetParams);
                    kdp.setArguments(bundle);
                    kdp.A01 = c42402Iq3;
                    C143536ds.A00(kdp, c143536ds).A00().A02(activity, kdp);
                    c143536ds.A00 = true;
                    C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                    if (c145726hV != null) {
                        c145726hV.A01();
                    }
                }
            }
        }
    }

    private final void A0A(String str, String str2) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC35258Fgs.A05(activity, userSession, str, str2);
        }
    }

    private final boolean A0B() {
        Context context;
        C3DN A01;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if ((abstractC149546o6 instanceof C143536ds) && (A01 = C3DN.A00.A01(context)) != null) {
                C3DP c3dp = (C3DP) A01;
                if (c3dp.A0h && !c3dp.A0b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0D(Context context, Integer num) {
        ReelViewerFragment reelViewerFragment;
        C41551w4 c41551w4;
        View view;
        XEX AjV;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c41551w4 = (reelViewerFragment = (ReelViewerFragment) interfaceC1118853a).A0a) != null) {
            String str = "userSession";
            if (context != null) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    if (AbstractC149536o5.A05(context, userSession, AuU, c41551w4)) {
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            if (!C18U.A06(C06090Tz.A05, userSession2, 36328448297352738L)) {
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
            if (interfaceC147266kB == null || (view = ((C147256kA) interfaceC147266kB).A04.A0F) == null) {
                return;
            }
            Object tag = view.getTag();
            if (!(tag instanceof C6e1) || (AjV = ((C6e1) tag).AjV()) == null) {
                return;
            }
            UserSession userSession3 = this.A09;
            if (userSession3 != null) {
                C3G2 c3g2 = this.A0G;
                if (c3g2 == null) {
                    str = "reelViewerSource";
                } else {
                    if (AbstractC84863qa.A0C(userSession3, c41551w4.A08(userSession3), c3g2)) {
                        C141596ac Blc = AjV.Blc();
                        if (Blc != null) {
                            UserSession userSession4 = this.A09;
                            if (userSession4 != null) {
                                if (AbstractC149536o5.A0C(userSession4, Blc)) {
                                    num = C05F.A0C;
                                }
                            }
                        }
                    } else {
                        num = C05F.A01;
                    }
                    AbstractC65725Tsz.A03(AjV, num);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A0E(C41181vS c41181vS, String str) {
        C38321qM c38321qM;
        String A2u;
        if (c41181vS != null && (c38321qM = c41181vS.A0b) != null && (A2u = c38321qM.A2u()) != null) {
            C40031tU c40031tU = c38321qM.A0c;
            UserSession userSession = this.A09;
            String str2 = "userSession";
            if (userSession != null) {
                String A04 = AbstractC12880la.A04(userSession.deviceSession.A06());
                String str3 = c40031tU.A03;
                String str4 = c40031tU.A06;
                String str5 = c40031tU.A05;
                String str6 = c40031tU.A00;
                C18920wW c18920wW = this.A08;
                if (c18920wW == null) {
                    str2 = "typedLogger";
                } else {
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "actionable_insights_tip");
                    if (str3 == null) {
                        str3 = "";
                    }
                    A00.AAP("metric", str3);
                    A00.AAP("action", str);
                    A00.AAP("media_id", A2u);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        A00.AAP("actor_id", userSession2.userId);
                        if (str4 == null) {
                            str4 = "";
                        }
                        A00.AAP("tip_stage", str4);
                        A00.AAP("interface", AbstractC58317Pt9.A00(62));
                        A00.AAP(AbstractC43591JPw.A00(17), A04);
                        A00.AAP("tip_id", str5);
                        A00.AAP("channel_id", str6);
                        A00.Cht();
                        return;
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public final void A0F(C41181vS c41181vS, boolean z) {
        boolean z2 = ((ReelViewerFragment) this.A18).A1C.C00(c41181vS).A0l;
        C145826hf c145826hf = this.A0L;
        if (z) {
            if (c145826hf != null) {
                C5GQ c5gq = c145826hf.A07.A01;
                if (c5gq != null) {
                    String A01 = C5GQ.A01(c5gq, c41181vS, "viewport");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (AbstractC75423a9.A02(c41181vS, c5gq.A00)) {
                        Map map = c5gq.A01;
                        if (!map.containsKey(A01)) {
                            map.put(A01, new C138226Od(c41181vS, "viewport", currentTimeMillis, z2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (c145826hf != null) {
            C5GQ c5gq2 = c145826hf.A07.A01;
            if (c5gq2 == null) {
                return;
            }
            c5gq2.A02(c41181vS, "viewport");
            return;
        }
        C14360o3.A0F("reelViewerLogger");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36317788188513853L) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(java.lang.Integer r6) {
        /*
            r5 = this;
            X.53a r0 = r5.A18
            X.1vS r3 = r0.AuU()
            if (r3 == 0) goto L62
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.1w4 r2 = r0.A0a
            if (r2 == 0) goto L62
            X.6kB r0 = r0.mViewPager
            if (r0 == 0) goto L62
            X.6kA r0 = (X.C147256kA) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L62
            java.lang.Object r4 = r0.getTag()
            boolean r0 = r4 instanceof X.InterfaceC141676ak
            if (r0 == 0) goto L62
            com.instagram.common.session.UserSession r0 = r5.A09
            java.lang.String r1 = "userSession"
            if (r0 == 0) goto Lcb
            boolean r0 = X.AbstractC130925vf.A0L(r0, r3, r2)
            if (r0 == 0) goto L9f
            com.instagram.common.session.UserSession r3 = r5.A09
            if (r3 == 0) goto Lcb
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317788188513853(0x8106d60001163d, double:3.0308537181866016E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9f
        L3f:
            X.6ak r4 = (X.InterfaceC141676ak) r4
            X.6Pc r2 = r4.AYW()
            int r0 = r6.intValue()
            r1 = 1
            r3 = 0
            if (r0 == r3) goto L63
            if (r0 == r1) goto La2
            X.0do r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L5c
            r0.cancel()
        L5c:
            X.6ac r0 = r2.A00
            if (r0 == 0) goto L62
            r0.A0i = r3
        L62:
            return
        L63:
            X.6ac r0 = r2.A00
            if (r0 == 0) goto L7c
            boolean r0 = r0.A0i
            if (r0 != r1) goto L7c
            X.0do r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto La2
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto La2
            return
        L7c:
            X.0do r1 = r2.A02
            java.lang.Object r0 = r1.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L89
            r0.cancel()
        L89:
            X.6TY r0 = r2.A01
            r0.A00()
            android.view.View r0 = r0.A04
            r0.setVisibility(r3)
            java.lang.Object r0 = r1.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L62
            r0.start()
            return
        L9f:
            java.lang.Integer r6 = X.C05F.A0C
            goto L3f
        La2:
            X.0do r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto Laf
            r0.cancel()
        Laf:
            X.6TY r2 = r2.A01
            int r1 = r2.A00
            X.2iX r0 = r2.A05
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
            android.graphics.drawable.TransitionDrawable r0 = r2.A02
            if (r0 == 0) goto Lc5
            r0.startTransition(r3)
        Lc5:
            android.view.View r0 = r2.A04
            r0.setVisibility(r3)
            return
        Lcb:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.A0G(java.lang.Integer):void");
    }

    public final void A0H(Integer num) {
        ReelViewerFragment reelViewerFragment;
        C41551w4 c41551w4;
        InterfaceC147266kB interfaceC147266kB;
        View view;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c41551w4 = (reelViewerFragment = (ReelViewerFragment) interfaceC1118853a).A0a) != null && (interfaceC147266kB = reelViewerFragment.mViewPager) != null && (view = ((C147256kA) interfaceC147266kB).A04.A0F) != null) {
            Object tag = view.getTag();
            if (tag instanceof InterfaceC141666aj) {
                Context context = view.getContext();
                C14360o3.A07(context);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                if (!C6TU.A01(context, userSession, AuU, c41551w4)) {
                    num = C05F.A0C;
                }
                ((InterfaceC141666aj) tag).C4e().A01(num);
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final boolean ARq() {
        String str;
        C143376dc c143376dc = this.A03;
        if (c143376dc == null) {
            str = "storyRepliesBlock";
        } else {
            UserSession userSession = c143376dc.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36317990052173571L) || C18U.A06(c06090Tz, userSession, 36322418164377831L)) {
                    C148686md c148686md = c143376dc.A01;
                    if (c148686md == null) {
                        str = "rollingDeprecationUtil";
                    } else if (c148686md.A00()) {
                        return true;
                    }
                }
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0416, code lost:
    
        if (r7 == X.EnumC41231vY.A06) goto L195;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJE(X.C22P r30, X.C41181vS r31, X.C41064IGh r32, X.C2Fb r33) {
        /*
            Method dump skipped, instructions count: 2719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.CJE(X.22P, X.1vS, X.IGh, X.2Fb):void");
    }

    @Override // X.InterfaceC144646fk
    public final void CkH(C41181vS c41181vS, String str, String str2) {
        String A2u;
        String str3;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (A2u = c38321qM.A2u()) != null) {
            C18920wW c18920wW = this.A08;
            if (c18920wW == null) {
                str3 = "typedLogger";
            } else {
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "actionable_insights_tip");
                if (str2 == null) {
                    str2 = "";
                }
                A00.AAP("metric", str2);
                A00.AAP("action", "stories_actionable_insights_tip_impression");
                A00.AAP("media_id", A2u);
                UserSession userSession = this.A09;
                if (userSession == null) {
                    str3 = "userSession";
                } else {
                    A00.AAP("actor_id", userSession.userId);
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("tip_stage", str);
                    A00.Cht();
                    return;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuE(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.CuE(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC144586fe
    public final void CuQ() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ?? obj = new Object();
            if (fragment.isResumed()) {
                C28458ChA c28458ChA = C28458ChA.A00;
                UserSession userSession = this.A09;
                if (userSession != null) {
                    c28458ChA.A06(userSession, "achievements_overview_bottomsheet", null);
                    C26700Bqh c26700Bqh = new C26700Bqh();
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C189448aO c189448aO = new C189448aO(userSession2);
                        c189448aO.A0a = false;
                        c189448aO.A0g = activity.getString(2131952126);
                        c189448aO.A1J = true;
                        c189448aO.A0K = new ViewOnClickListenerC28646Cku(activity, this, obj);
                        c189448aO.A0U = new C29386CxJ(activity, this, obj);
                        c189448aO.A00().A02(activity, c26700Bqh);
                        return;
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final void CuX(C41181vS c41181vS) {
        InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) this.A18).mViewPager;
        if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
            CJE(null, c41181vS, null, C2Fb.A3f);
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Cvd(C38321qM c38321qM) {
        String str;
        String str2;
        String str3;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
        if (abstractC59962oe != null) {
            InterfaceC1816483t BAr = c38321qM.A0C.BAr();
            if (BAr != null) {
                str = BAr.BAt();
                str2 = BAr.getName();
            } else {
                str = null;
                str2 = null;
            }
            UserSession userSession = this.A09;
            String str4 = "userSession";
            if (userSession != null) {
                C69623Aw c69623Aw = new C69623Aw(this.A16, userSession);
                Integer num = C05F.A0C;
                User CDj = c38321qM.A0C.CDj();
                if (CDj != null) {
                    str3 = CDj.getId();
                } else {
                    str3 = null;
                }
                String id = c38321qM.getId();
                String str5 = this.A0y;
                if (str5 == null) {
                    str4 = "traySessionId";
                } else {
                    String str6 = this.A0z;
                    if (str6 == null) {
                        str4 = "viewerSessionId";
                    } else {
                        c69623Aw.A00(null, num, null, str3, id, str5, str6, str, str2, "ig_group_story_add_cta");
                        this.A18.EJE("tapped");
                        if (str != null && str2 != null) {
                            UserSession userSession2 = this.A09;
                            if (userSession2 != null) {
                                AbstractC35258Fgs.A07(C22P.A35, abstractC59962oe, userSession2, str, str2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str4);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Cvj() {
        FragmentActivity fragmentActivity;
        Fragment fragment = (Fragment) this.A1B.get();
        Context context = null;
        if (fragment != null) {
            fragmentActivity = fragment.getActivity();
        } else {
            fragmentActivity = null;
        }
        UserSession userSession = this.A09;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C6XJ A02 = C6XJ.A02(fragmentActivity, AbstractC61636Rr0.A00(new C09530e4("camera_configuration", C82R.A00(C208509Kk.A00, C81W.A0p)), new C09530e4("camera_entry_point", C22P.A4D)), userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
        C41181vS AuU = this.A18.AuU();
        if (AuU != null && AuU.A0e == EnumC41231vY.A0Q) {
            A02.A0D(fragment, 23523);
            return;
        }
        if (fragment != null) {
            context = fragment.getContext();
        }
        A02.A0C(context);
    }

    @Override // X.InterfaceC144596ff
    public final void CxB() {
        Context context;
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (activity = fragment.getActivity()) != null && ((ReelViewerFragment) this.A18).A0a != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MSV.A00(103), true);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            new C6XJ(activity, bundle, userSession, ModalActivity.class, "archive_home").A0C(context);
        }
    }

    @Override // X.InterfaceC144596ff
    public final void Cxj() {
        C41551w4 c41551w4;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a) != null) {
            A05(AuU, c41551w4, false);
        }
    }

    @Override // X.InterfaceC144696fp
    public final void Cyy() {
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        if (c41551w4 != null) {
            c41551w4.A0D = false;
        }
        interfaceC1118853a.CqT();
    }

    @Override // X.InterfaceC144596ff
    public final void Czn(C41181vS c41181vS) {
        c41181vS.A0b.getClass();
        C38801rC c38801rC = C38321qM.A0h;
    }

    @Override // X.InterfaceC80083hx
    public final void D0O() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A0h, MSV.A00(50), false);
            c63397SjR.A0S = this.A16.getModuleName();
            c63397SjR.A0A();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC144586fe
    public final void D0S() {
        C50561MTs C2R;
        InterfaceC143576dw Av7 = this.A18.Av7();
        if (Av7 != null && (C2R = Av7.C2R()) != null) {
            C2R.A02 = "tap";
            C2R.A07.A06(1.0d);
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D24(C88X c88x) {
        C22P c22p;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && c88x != null) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("create_mode_attribution", ADL.A00(c88x));
                bundle.putParcelable("camera_configuration", C82R.A00(C208509Kk.A00, C81W.A0C));
                C88Z c88z = c88x.A04;
                if (c88z == null) {
                    c88z = C88Z.A0G;
                }
                switch (c88z.ordinal()) {
                    case 1:
                        c22p = C22P.A50;
                        break;
                    case 4:
                        c22p = C22P.A4s;
                        break;
                    case 5:
                        c22p = C22P.A4t;
                        break;
                    case 6:
                        c22p = C22P.A4u;
                        break;
                    case 7:
                        c22p = C22P.A4e;
                        break;
                    case 8:
                        c22p = C22P.A4y;
                        break;
                    case 9:
                        c22p = C22P.A4m;
                        break;
                    case 17:
                        c22p = C22P.A4i;
                        break;
                    case 18:
                        c22p = C22P.A4z;
                        break;
                    case Process.SIGSTOP /* 19 */:
                        c22p = C22P.A4n;
                        break;
                    case 20:
                        c22p = C22P.A4f;
                        break;
                    case 31:
                        c22p = C22P.A2Y;
                        break;
                    case 34:
                        c22p = C22P.A0Z;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Tried to infer CameraEntryPoint from DialElement, but DialElement.getType is ");
                        sb.append(c88z);
                        sb.append(", and there is no CameraEntryPoint currently mapped to that type");
                        AbstractC12120kG.A08("CanvasLoggingUtil", sb.toString(), null);
                        c22p = C22P.A5N;
                        break;
                }
                bundle.putSerializable("camera_entry_point", c22p);
                InterfaceC1119353f interfaceC1119353f = this.A17;
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                AbstractC47126KsL.A00(null, bundle, fragment, userSession, interfaceC1119353f);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to serialize dialElement of type ");
                C88Z c88z2 = c88x.A04;
                if (c88z2 == null) {
                    c88z2 = C88Z.A0G;
                }
                sb2.append(c88z2);
                C0w9.A06("serialize_create_mode_attribution", sb2.toString(), e);
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D2O() {
        Context context;
        C55U c55u;
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C41181vS AuU = this.A18.AuU();
            if (AuU == null) {
                C0w9.A03(__redex_internal_original_name, "No ReelItem active when Capture Format attribution is tapped");
                return;
            }
            C38321qM c38321qM = AuU.A0b;
            if (c38321qM != null) {
                CreativeConfigIntf Asm = c38321qM.A0C.Asm();
                if (Asm == null) {
                    return;
                }
                EnumC138476Pd A03 = AbstractC121575f6.A03(Asm);
                ReelViewerConfig reelViewerConfig = this.A0F;
                if (reelViewerConfig == null) {
                    str = "reelViewerConfig";
                } else {
                    if (reelViewerConfig.A04 || A03 == null || A03 == EnumC138476Pd.A0D) {
                        return;
                    }
                    if (Asm.B0b() == null) {
                        AbstractC149546o6 abstractC149546o6 = this.A0N;
                        str = "reelViewerBottomSheetManager";
                        if (abstractC149546o6 != null) {
                            if (abstractC149546o6 instanceof C143536ds) {
                                if (C18U.A06(C06090Tz.A05, ((C143536ds) abstractC149546o6).A01, 36311178233840079L)) {
                                    AbstractC149546o6 abstractC149546o62 = this.A0N;
                                    if (abstractC149546o62 != null) {
                                        abstractC149546o62.A06(context, A03);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    CameraConfiguration A00 = A03.A00();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("camera_configuration", A00);
                    if (A00 != null) {
                        c55u = A00.A03;
                    } else {
                        c55u = null;
                    }
                    str = "userSession";
                    if (C14360o3.A0K(c55u, C208509Kk.A00)) {
                        UserSession userSession = this.A09;
                        if (userSession != null) {
                            if (Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36322585666922861L)).booleanValue()) {
                                bundle.putBoolean("camera_story_destination_only", true);
                            }
                        }
                    }
                    InterfaceC1119353f interfaceC1119353f = this.A17;
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        AbstractC47126KsL.A00(null, bundle, fragment, userSession2, interfaceC1119353f);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D2k(C41181vS c41181vS) {
        FragmentActivity activity;
        List list;
        URJ urj;
        List list2;
        C45116Jxl c45116Jxl;
        String str;
        String str2;
        Al9 al9;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            String str3 = null;
            if (c41181vS != null) {
                list = c41181vS.A0c();
            } else {
                list = null;
            }
            C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0F, list);
            if (A00 != null && (al9 = A00.A0x) != null) {
                urj = al9.A00;
            } else {
                urj = null;
            }
            if (c41181vS != null) {
                list2 = c41181vS.A0c();
            } else {
                list2 = null;
            }
            C84823qW A002 = AbstractC120715dH.A00(EnumC75383a5.A12, list2);
            if (A002 != null) {
                c45116Jxl = A002.A0B;
            } else {
                c45116Jxl = null;
            }
            if (urj != null) {
                str = urj.A07;
                str2 = urj.A03;
            } else if (c45116Jxl != null) {
                str = c45116Jxl.A02;
                str2 = c45116Jxl.A00;
            } else {
                return;
            }
            if (str != null && str2 != null) {
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                C36881nl A01 = C36881nl.A01(activity, this.A16, userSession, "reel_viewer_channel_challenge_sticker");
                A01.A0A(str);
                A01.A0M = str2;
                if (c45116Jxl != null) {
                    str3 = c45116Jxl.A01;
                }
                A01.A0N = str3;
                A01.A06();
            }
        }
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        this.A18.ADf(false);
    }

    @Override // X.InterfaceC144596ff
    public final void D4w(C41181vS c41181vS) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            abstractC149546o6.A06(context, EnumC138476Pd.A05);
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D5P(C41181vS c41181vS) {
        List A0c;
        Object obj;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (A0c = c41181vS.A0c()) != null) {
            Iterator it = A0c.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    obj = it.next();
                }
            } while (((C84823qW) obj).A0n != ProductType.CLIPS);
            C84823qW c84823qW = (C84823qW) obj;
            if (c84823qW != null) {
                UserSession userSession = this.A09;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                AHT.A00(fragment.requireActivity(), EnumC120795dP.A03, userSession, this.A16.getModuleName(), c84823qW.A1b, ((ReelViewerFragment) this.A18).mVideoPlayer.getCurrentPositionMs());
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void D91(String str) {
        FragmentActivity activity;
        Context context;
        C41181vS AuU;
        C38321qM c38321qM;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && (c38321qM = AuU.A0b) != null && c38321qM.getId() != null) {
                    UserSession userSession = c143536ds.A01;
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    if (!((Boolean) A00.A32.CES(A00, C23031Ai.A8c[327])).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323019458620266L)) {
                        C38927HBz.A03.A00(activity, context, userSession, c38321qM.getId(), true);
                    } else {
                        C38935HCi A002 = AbstractC40573Hyt.A00(userSession, c38321qM.getId(), true);
                        C189448aO A003 = C143536ds.A00(A002, c143536ds);
                        A003.A0d = context.getString(2131957395);
                        A003.A00().A02(activity, A002);
                    }
                    c143536ds.A00 = true;
                    C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                    if (c145726hV != null) {
                        c145726hV.A01();
                    }
                }
            }
        }
    }

    @Override // X.C3h2
    public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        C41181vS AuU = this.A18.AuU();
        if (AuU != null) {
            D9Z(AuU);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r0 > r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r6.A2Y == false) goto L19;
     */
    @Override // X.InterfaceC144616fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DBc(float r8) {
        /*
            r7 = this;
            X.53a r4 = r7.A18
            r6 = r4
            instagram.features.stories.fragment.ReelViewerFragment r6 = (instagram.features.stories.fragment.ReelViewerFragment) r6
            boolean r0 = r6.A2r
            if (r0 != 0) goto L6b
            X.6k8 r0 = r7.A0M
            if (r0 == 0) goto L17
            X.1QT r3 = r0.A00
            r1 = 18942971(0x1210bfb, double:9.359071E-317)
            java.lang.String r0 = "tap_down"
            r3.flowMarkPoint(r1, r0)
        L17:
            java.lang.ref.WeakReference r0 = r7.A1B
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L6b
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L6b
            X.1vS r5 = r4.AuU()
            if (r5 == 0) goto L6b
            int r0 = X.AbstractC13880nE.A0A(r2)
            float r1 = (float) r0
            float r0 = X.AbstractC84863qa.A00(r2)
            float r1 = r1 * r0
            int r3 = (int) r1
            int r1 = X.AbstractC13880nE.A0A(r2)
            boolean r0 = X.AbstractC13620mo.A02(r2)
            if (r0 == 0) goto L44
            int r3 = r1 - r3
        L44:
            boolean r2 = X.AbstractC13620mo.A02(r2)
            r1 = 1
            int r0 = X.C1H4.A01(r8)
            if (r2 == 0) goto L6c
            if (r0 <= r3) goto L87
        L51:
            boolean r0 = r5.A18()
            if (r0 != 0) goto L6b
            if (r1 == 0) goto L66
            X.6m4 r1 = r7.A0q
            java.lang.String r0 = "backAffordanceHelper"
            if (r1 == 0) goto L74
            boolean r0 = r1.A01()
            r1.A00(r0)
        L66:
            java.lang.String r0 = "tapped"
            r4.EJE(r0)
        L6b:
            return
        L6c:
            if (r0 >= r3) goto L87
            X.6mO r0 = r7.A0Q
            if (r0 != 0) goto L7c
            java.lang.String r0 = "reelInteractiveController"
        L74:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L7c:
            boolean r0 = r0.A04()
            if (r0 != 0) goto L87
            boolean r0 = r6.A2Y
            if (r0 != 0) goto L87
            goto L51
        L87:
            r1 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DBc(float):void");
    }

    @Override // X.InterfaceC144736ft
    public final void DCn() {
        C148566mR c148566mR = this.A0x;
        if (c148566mR == null) {
            C14360o3.A0F("reelSuggestedHighlightsController");
            throw C00O.createAndThrow();
        }
        c148566mR.DCn();
    }

    @Override // X.InterfaceC144606fg
    public final void DCv(RectF rectF, CreativeConfigIntf creativeConfigIntf, String str) {
        Fragment fragment;
        Context context;
        String str2;
        String B3z;
        String captureType;
        ImageUrl imageUrl;
        AttributionUser AdP;
        ImageUrl imageUrl2;
        EnumC138476Pd enumC138476Pd;
        List list;
        List list2;
        boolean z;
        Boolean CPi;
        EffectActionSheetIntf B0O;
        EffectActionSheetIntf B0O2;
        ProfilePicture Bhx;
        EffectThumbnailImageDictIntf C84;
        ReelViewerConfig reelViewerConfig = this.A0F;
        if (reelViewerConfig == null) {
            str2 = "reelViewerConfig";
        } else if (!reelViewerConfig.A04 && (fragment = (Fragment) this.A1B.get()) != null && (context = fragment.getContext()) != null && creativeConfigIntf != null) {
            EnumC138476Pd enumC138476Pd2 = EnumC138476Pd.A0B;
            str2 = "reelEffectBottomSheetLauncher";
            if (!AbstractC121575f6.A0B(creativeConfigIntf, enumC138476Pd2) && !AbstractC121575f6.A0B(creativeConfigIntf, EnumC138476Pd.A08) && (!AbstractC121575f6.A0B(creativeConfigIntf, EnumC138476Pd.A04) || creativeConfigIntf.B3z() != null)) {
                C6k2 c6k2 = this.A0l;
                if (c6k2 != null) {
                    Context context2 = c6k2.A00.getContext();
                    if (context2 != null && (B3z = creativeConfigIntf.B3z()) != null) {
                        EffectPreviewIntf B0a = creativeConfigIntf.B0a();
                        if (B0a == null || (captureType = B0a.getName()) == null) {
                            captureType = creativeConfigIntf.getCaptureType();
                        }
                        if (captureType != null) {
                            UserSession userSession = c6k2.A01;
                            EffectPreviewIntf B0a2 = creativeConfigIntf.B0a();
                            if (B0a2 != null && (C84 = B0a2.C84()) != null) {
                                imageUrl = C84.CDO();
                            } else {
                                imageUrl = null;
                            }
                            String A06 = AbstractC121575f6.A06(creativeConfigIntf);
                            String A05 = AbstractC121575f6.A05(creativeConfigIntf);
                            EffectPreviewIntf B0a3 = creativeConfigIntf.B0a();
                            if (((B0a3 != null && (AdP = B0a3.AdP()) != null) || (AdP = creativeConfigIntf.AdP()) != null) && (Bhx = AdP.Bhx()) != null) {
                                imageUrl2 = Bhx.CDO();
                            } else {
                                imageUrl2 = null;
                            }
                            String failureReason = creativeConfigIntf.getFailureReason();
                            if (AbstractC121575f6.A0A(creativeConfigIntf)) {
                                enumC138476Pd = AbstractC121575f6.A03(creativeConfigIntf);
                            } else {
                                enumC138476Pd = null;
                            }
                            ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
                            EffectPreviewIntf B0a4 = creativeConfigIntf.B0a();
                            boolean z2 = true;
                            if (B0a4 == null || !"SAVED".equals(B0a4.getSaveStatus())) {
                                z2 = false;
                            }
                            EffectPreviewIntf B0a5 = creativeConfigIntf.B0a();
                            if (B0a5 == null || (B0O2 = B0a5.B0O()) == null || (list = B0O2.BgC()) == null) {
                                list = C16930sl.A00;
                            }
                            EffectPreviewIntf B0a6 = creativeConfigIntf.B0a();
                            if (B0a6 == null || (B0O = B0a6.B0O()) == null || (list2 = B0O.BrM()) == null) {
                                list2 = C16930sl.A00;
                            }
                            String BcZ = creativeConfigIntf.BcZ();
                            EnumC223179sw A04 = AbstractC121575f6.A04(creativeConfigIntf);
                            EffectPreviewIntf B0a7 = creativeConfigIntf.B0a();
                            if (B0a7 != null && (CPi = B0a7.CPi()) != null) {
                                z = CPi.booleanValue();
                            } else {
                                z = false;
                            }
                            c6k2.A00(LH4.A00(context2, userSession, imageUrl, imageUrl2, enumC138476Pd, A04, B0b, B3z, captureType, A06, A05, failureReason, BcZ, str, list, list2, 5, z2, z, c6k2.A02.A08));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (AbstractC121575f6.A0B(creativeConfigIntf, enumC138476Pd2, EnumC138476Pd.A08) && creativeConfigIntf.B0S() != null) {
                C6k2 c6k22 = this.A0l;
                if (c6k22 != null) {
                    Context context3 = c6k22.A00.getContext();
                    if (context3 == null) {
                        return;
                    }
                    c6k22.A00(LH4.A01(context3, creativeConfigIntf, str));
                    return;
                }
            } else {
                if (creativeConfigIntf.B0b() == null) {
                    AbstractC149546o6 abstractC149546o6 = this.A0N;
                    str2 = "reelViewerBottomSheetManager";
                    if (abstractC149546o6 != null) {
                        if (abstractC149546o6 instanceof C143536ds) {
                            if (C18U.A06(C06090Tz.A05, ((C143536ds) abstractC149546o6).A01, 36311178233840079L)) {
                                AbstractC149546o6 abstractC149546o62 = this.A0N;
                                if (abstractC149546o62 != null) {
                                    EnumC138476Pd A03 = AbstractC121575f6.A03(creativeConfigIntf);
                                    if (A03 != null) {
                                        abstractC149546o62.A06(context, A03);
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                    }
                }
                C47723L5k c47723L5k = (C47723L5k) AbstractC69933Cc.A00.getValue();
                UserSession userSession2 = this.A09;
                str2 = "userSession";
                if (userSession2 != null) {
                    Bundle A00 = c47723L5k.A00(rectF, C22P.A4g, userSession2, creativeConfigIntf);
                    InterfaceC1119353f interfaceC1119353f = this.A17;
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        AbstractC47126KsL.A00(rectF, A00, fragment, userSession3, interfaceC1119353f);
                        return;
                    }
                }
            }
        } else {
            return;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144586fe
    public final void DD4(C1P1 c1p1, boolean z) {
        Context context;
        User A2E;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            HG0 hg0 = new HG0(context, c1p1, this, z);
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A18;
            if (reelViewerFragment.AuU() != null && reelViewerFragment.AuU().A05 != null) {
                String str = null;
                if (reelViewerFragment.AuU().A0b != null && (A2E = reelViewerFragment.AuU().A0b.A2E(reelViewerFragment.getSession())) != null) {
                    str = A2E.getId();
                }
                C6k1 c6k1 = reelViewerFragment.A1k;
                AttributedAREffect attributedAREffect = reelViewerFragment.AuU().A05;
                C14360o3.A0B(attributedAREffect, 1);
                AbstractC23641Du.A05(AnonymousClass191.A00, new C57149PXn(c6k1, hg0, attributedAREffect, str, null, 2, z), AbstractC141776au.A00(c6k1));
                return;
            }
            hg0.onFail(new C115095Ie(new IllegalStateException("current item is null or not an effect")));
        }
    }

    @Override // X.InterfaceC144716fr
    public final void DDd() {
        C148566mR c148566mR = this.A0x;
        if (c148566mR == null) {
            C14360o3.A0F("reelSuggestedHighlightsController");
            throw C00O.createAndThrow();
        }
        c148566mR.DDd();
    }

    @Override // X.InterfaceC144596ff
    public final void DFA() {
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = this.A09;
            if (userSession != null) {
                C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
                c140966Yy.A0F = true;
                C41181IKu c41181IKu = (C41181IKu) AbstractC77423dS.A00().A01.getValue();
                if (this.A09 != null) {
                    c140966Yy.A0D(c41181IKu.A00(4));
                    c140966Yy.A04();
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DFY(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                String moduleName = this.A16.getModuleName();
                if (abstractC149546o6 instanceof C143536ds) {
                    C143536ds c143536ds = (C143536ds) abstractC149546o6;
                    UserSession userSession = c143536ds.A01;
                    C14360o3.A0B(userSession, 0);
                    C14360o3.A0B(moduleName, 1);
                    EML eml = new EML();
                    Bundle bundle = new Bundle();
                    bundle.putString("args_user_name", str);
                    bundle.putString("args_previous_module_name", moduleName);
                    AbstractC03240Dh.A00(bundle, userSession);
                    eml.setArguments(bundle);
                    C143536ds.A01(context, eml, c143536ds);
                }
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DGL(C41181vS c41181vS, C41551w4 c41551w4) {
        FragmentActivity activity;
        EnumC33409Epg enumC33409Epg;
        String str;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Reel reel = c41551w4.A0H;
            C1NB c1nb = reel.A0W;
            Integer num = null;
            if (c1nb != null) {
                num = c1nb.CBs();
            }
            if (num != C05F.A01) {
                C0w9.A03("ReelViewerItemDelegateImpl#onFavoritesBadgeClick with non user media owner", "we only expect users to have close friends");
                return;
            }
            this.A18.EJE("dialog");
            UserSession userSession = this.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                C684436h c684436h = this.A07;
                if (c684436h == null) {
                    str = "closeFriendsController";
                } else {
                    FRV frv = new FRV(activity, c684436h, userSession);
                    InterfaceC60442pS interfaceC60442pS = this.A16;
                    C55884OrY c55884OrY = new C55884OrY(c41181vS);
                    C145336gs c145336gs = this.A1D;
                    if (reel.A1a) {
                        enumC33409Epg = EnumC33409Epg.SELF_REEL;
                    } else {
                        enumC33409Epg = EnumC33409Epg.REEL;
                    }
                    frv.A02(new DialogInterfaceOnDismissListenerC23186AOz(this), fragment, enumC33409Epg, c55884OrY, c145336gs, interfaceC60442pS);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A18, false);
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
        this.A18.EJE("tapped");
    }

    @Override // X.InterfaceC144596ff
    public final void DIX(C41181vS c41181vS) {
        FragmentActivity activity;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
        if (abstractC59962oe != null && (activity = abstractC59962oe.getActivity()) != null) {
            HGE hge = new HGE(activity, abstractC59962oe, new C6WQ(activity, true), this);
            C61972ry c61972ry = new C61972ry(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), null);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C1ON A00 = AbstractC40784I5m.A00(userSession);
            A00.A00 = hge;
            c61972ry.schedule(A00);
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DIa(User user) {
        C145906hn c145906hn = this.A0d;
        if (c145906hn == null) {
            C14360o3.A0F("reelProfileOpener");
            throw C00O.createAndThrow();
        }
        C145906hn.A01(c145906hn, null, user.getId(), "reel_viewer_go_to_profile", false);
    }

    @Override // X.InterfaceC144596ff
    public final void DIw(C41181vS c41181vS) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                if (c146016hy != null) {
                    String moduleName = c146016hy.A02.getModuleName();
                    String str = c41181vS.A0j;
                    C14360o3.A0B(moduleName, 0);
                    EMK emk = new EMK();
                    Bundle bundle = new Bundle();
                    bundle.putString("args_previous_module_name", moduleName);
                    bundle.putString("source_media_id", str);
                    emk.setArguments(bundle);
                    C143536ds.A01(context, emk, c143536ds);
                }
            }
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DJ7(C41181vS c41181vS) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                KD3 kd3 = new KD3();
                C143536ds.A00(kd3, c143536ds).A00().A02(activity, kd3);
                c143536ds.A00 = true;
                C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                if (c145726hV != null) {
                    c145726hV.A01();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r7.A09 == null) goto L11;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DKf(X.C41551w4 r8, boolean r9) {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r0 = r7.A09
            java.lang.String r6 = "userSession"
            if (r0 == 0) goto L1d
            X.6Z1 r0 = X.C6Z1.A00(r0)
            com.instagram.model.reels.Reel r5 = r8.A0H
            r0.A01(r5)
            if (r9 == 0) goto L42
            com.instagram.common.session.UserSession r4 = r7.A09
            if (r4 == 0) goto L1d
            X.2pS r3 = r7.A16
            java.lang.String r1 = r7.A0y
            if (r1 != 0) goto L25
            java.lang.String r6 = "traySessionId"
        L1d:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            java.lang.String r0 = r7.A0z
            if (r0 != 0) goto L2c
            java.lang.String r6 = "viewerSessionId"
            goto L1d
        L2c:
            X.5ve r2 = X.C130905vd.A00(r4, r8, r1, r0)
            java.lang.String r1 = "instagram_netego_hide"
            X.3mZ r0 = new X.3mZ
            r0.<init>(r2, r3, r1)
            X.C3R6.A06(r0, r5)
            X.C32U.A0H(r4, r0, r3)
            com.instagram.common.session.UserSession r0 = r7.A09
            if (r0 != 0) goto L42
            goto L1d
        L42:
            X.53a r0 = r7.A18
            r0.De0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DKf(X.1w4, boolean):void");
    }

    @Override // X.InterfaceC144646fk
    public final void DMN(C41181vS c41181vS, String str, String str2) {
        String A2u;
        Context context;
        String str3 = "userSession";
        if (C14360o3.A0K(str2, "story_replies_count_total")) {
            Fragment fragment = (Fragment) this.A1B.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                AbstractC41776Ies.A03(context, "instagram://direct-inbox");
            } else {
                return;
            }
        } else {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A18;
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            if (c41551w4 != null) {
                UserSession userSession = this.A09;
                if (userSession != null) {
                    C41181vS A08 = c41551w4.A08(userSession);
                    if (A08 != null) {
                        ((C146226iL) reelViewerFragment.A1C).A0C.C00(A08).A0W = C05F.A09;
                        A0C();
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
        }
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (A2u = c38321qM.A2u()) != null) {
            C18920wW c18920wW = this.A08;
            if (c18920wW == null) {
                str3 = "typedLogger";
            } else {
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "actionable_insights_tip");
                if (str2 == null) {
                    str2 = "";
                }
                A00.AAP("metric", str2);
                A00.AAP("action", "stories_actionable_insights_tip_tap");
                A00.AAP("media_id", A2u);
                UserSession userSession2 = this.A09;
                if (userSession2 != null) {
                    A00.AAP("actor_id", userSession2.userId);
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("tip_stage", str);
                    A00.Cht();
                    return;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DO7(C41181vS c41181vS) {
        C143556du c143556du;
        Fragment fragment;
        FragmentActivity activity;
        C38321qM c38321qM;
        String A2u;
        C24012Akq A0A;
        if (c41181vS != null) {
            InterfaceC143576dw Av7 = this.A18.Av7();
            if ((Av7 instanceof C143556du) && (c143556du = (C143556du) Av7) != null && (fragment = (Fragment) this.A1B.get()) != null && (activity = fragment.getActivity()) != null && (c38321qM = c41181vS.A0b) != null && (A2u = c38321qM.A2u()) != null) {
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0g, c41181vS.A0c());
                if (A00 != null && (A0A = A00.A0A()) != null) {
                    UserSession userSession = this.A09;
                    if (userSession == null) {
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                    String A02 = A0A.A02();
                    ChatStickerChannelType chatStickerChannelType = A0A.A00.A03;
                    if (chatStickerChannelType == null) {
                        chatStickerChannelType = ChatStickerChannelType.A07;
                    }
                    FAV.A00(activity, userSession, c143556du.A18, A2u, A02, chatStickerChannelType.A00, new J7R(this, 30), A0A.A00(), false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (X.AbstractC84863qa.A0D(r3, r0) != false) goto L26;
     */
    @Override // X.InterfaceC144616fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQV(float r42, float r43) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DQV(float, float):void");
    }

    @Override // X.InterfaceC144596ff
    public final void DQy() {
        FragmentActivity activity;
        C41181vS AuU;
        C38321qM c38321qM;
        PromptStickerModel A0J;
        C38321qM c38321qM2;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && (c38321qM = AuU.A0b) != null) {
                    PromptStickerModel A0J2 = AuU.A0J();
                    if (A0J2 != null && A0J2.A03() == StoryPromptType.A09) {
                        InterfaceC1118853a interfaceC1118853a = ((AbstractC149546o6) c143536ds).A00.A04;
                        C41181vS AuU2 = interfaceC1118853a.AuU();
                        if (AuU2 != null && (A0J = AuU2.A0J()) != null) {
                            C41181vS AuU3 = interfaceC1118853a.AuU();
                            if (AuU3 != null) {
                                c38321qM2 = AuU3.A0b;
                            } else {
                                c38321qM2 = null;
                            }
                            ((ReelViewerFragment) interfaceC1118853a).A1f.DcH(C8JW.A09, c38321qM2, A0J, null, null);
                            return;
                        }
                        return;
                    }
                    String id = c38321qM.getId();
                    if (id != null) {
                        UserSession userSession = c143536ds.A01;
                        C14360o3.A0B(userSession, 0);
                        C26870BtX c26870BtX = new C26870BtX();
                        Bundle bundle = new Bundle();
                        AbstractC03240Dh.A00(bundle, userSession);
                        bundle.putString("args_media_id", id);
                        c26870BtX.setArguments(bundle);
                        C143536ds.A00(c26870BtX, c143536ds).A00().A02(activity, c26870BtX);
                        c143536ds.A00 = true;
                        C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                        if (c145726hV != null) {
                            c145726hV.A01();
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DRy() {
        C6WW c6ww = this.A0i;
        if (c6ww != null) {
            c6ww.A00();
        }
        this.A18.DsK(null, null);
    }

    @Override // X.InterfaceC80063hv
    public final void DSK(C51757Mtg c51757Mtg) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            this.A18.EJE("fragment_paused");
            C41720Idr c41720Idr = C41720Idr.A00;
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            c41720Idr.A02(context, userSession, "video_player_subtitles");
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DST(C41181vS c41181vS) {
        String AgQ;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && c38321qM.A57()) {
            InterfaceC39681sr BuT = c38321qM.A0C.BuT();
            if (BuT != null && (AgQ = BuT.AgQ()) != null) {
                this.A1A.A01(true, true);
                this.A18.EJE("context_switch");
                HashMap hashMap = new HashMap();
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    hashMap.put("media_id", A2u);
                    hashMap.put("module", this.A16.getModuleName());
                    C146026hz c146026hz = this.A0r;
                    if (c146026hz == null) {
                        C14360o3.A0F("reelViewerBloksHelper");
                        throw C00O.createAndThrow();
                    }
                    c146026hz.A00(c41181vS, AgQ, hashMap);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DSZ(C41181vS c41181vS, C41551w4 c41551w4) {
        Fragment fragment;
        FragmentActivity activity;
        if (c41551w4.A0H.A0k() && (fragment = (Fragment) this.A1B.get()) != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC50558MTp.A05(activity, EnumC53169NfQ.A02, userSession, 1000 * c41181vS.A03());
        }
    }

    @Override // X.InterfaceC144676fn
    public final void DSf(User user, int i, int i2) {
        this.A18.EJE("tapped");
        Ddl(new C84823qW(user), i, i2);
    }

    @Override // X.InterfaceC144586fe
    public final void DSi(C38321qM c38321qM) {
        C146966jY c146966jY = this.A0t;
        if (c146966jY == null) {
            C14360o3.A0F("reelViewerIGShareManager");
            throw C00O.createAndThrow();
        }
        Fragment fragment = c146966jY.A01;
        Context context = fragment.getContext();
        if (context != null) {
            c146966jY.A04.EJE("tapped");
            UserSession userSession = c146966jY.A02;
            C8J0 A00 = AbstractC185088Iz.A00(userSession, null);
            boolean z = false;
            C24Q c24q = A00.A03;
            long A04 = c24q.A04(null, null, 17315248, 12000L);
            A00.A02 = A04;
            c24q.A0B(A04, "entry_point ", "stories_viewer", false);
            String id = c38321qM.getId();
            if (id == null) {
                A00.A01("missing_media_id");
                return;
            }
            InterfaceC1119353f interfaceC1119353f = c146966jY.A03;
            MusicOverlayStickerModel A03 = AbstractC101614hW.A03(null, c38321qM, null);
            GFA gfa = new GFA(c146966jY);
            boolean Cff = c38321qM.Cff();
            boolean z2 = true;
            if (A03 != null && A03.A0t) {
                z2 = false;
            }
            if (A03 != null) {
                z = C14360o3.A0K(A03.A0E, true);
            }
            C22P c22p = C22P.A2V;
            AbstractC208269Jl.A00(userSession).A07(c22p, true);
            GF8 gf8 = new GF8(context, fragment, c22p, userSession, c38321qM, interfaceC1119353f, gfa, "ReelViewerFragment", null, id, null, Cff);
            if (!z2) {
                F9E.A00(context, new DialogInterfaceOnClickListenerC35312Fhn(gf8), z);
            } else {
                gf8.DlA(Collections.singletonList(true));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0316, code lost:
    
        if (r7 == X.EnumC41231vY.A0E) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0862, code lost:
    
        if (X.C18U.A06(r15, r2, 36316701562114676L) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0b4a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36317393051456631L) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0baa, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36323882747113130L) == false) goto L386;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSm(android.view.View r50, X.C41181vS r51, X.C41551w4 r52) {
        /*
            Method dump skipped, instructions count: 3087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DSm(android.view.View, X.1vS, X.1w4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    @Override // X.InterfaceC144596ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTI(X.C41181vS r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DTI(X.1vS, boolean):void");
    }

    @Override // X.InterfaceC144596ff
    public final void DUA() {
        String str;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null) {
            MusicOverlayStickerModel A04 = AbstractC101614hW.A04(AuU);
            if (A04 != null) {
                interfaceC1118853a.EJE("tapped");
                C148536mO c148536mO = this.A0Q;
                if (c148536mO == null) {
                    C14360o3.A0F("reelInteractiveController");
                    throw C00O.createAndThrow();
                }
                c148536mO.A01(A04);
                return;
            }
            str = "Audio data not available on music attribution tap";
        } else {
            str = "No ReelItem active to show Music attribution sheet for";
        }
        C0w9.A03(__redex_internal_original_name, str);
    }

    @Override // X.InterfaceC144706fq
    public final void DVp() {
        C148566mR c148566mR = this.A0x;
        if (c148566mR == null) {
            C14360o3.A0F("reelSuggestedHighlightsController");
            throw C00O.createAndThrow();
        }
        c148566mR.DVp();
    }

    @Override // X.InterfaceC144586fe
    public final void DWY(C41181vS c41181vS) {
        FragmentActivity activity;
        C38321qM c38321qM;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null && c41181vS.A0e == EnumC41231vY.A09 && (c38321qM = c41181vS.A0b) != null && C37351oY.A03 != null) {
            C37351oY A00 = AbstractC151756sL.A00();
            UserSession userSession = this.A09;
            if (userSession != null) {
                if (A00.A04(userSession)) {
                    this.A18.EJE("dialog");
                    AbstractC151756sL.A00().A01();
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        AbstractC34278F9y.A00(activity, new AP0(this), userSession2, c38321qM);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DWq() {
        String str;
        C6WW c6ww = this.A0i;
        if (c6ww != null && (str = c6ww.A03) != null) {
            V41 v41 = c6ww.A00;
            V42 v42 = c6ww.A01;
            if (v41 != null) {
                if (C1VN.A00 != null) {
                    C70188WFr.A00.A04(c6ww.A07, c6ww.A09, v41, str, true);
                }
            } else if (v42 != null && C1VN.A00 != null) {
                C70188WFr.A01(c6ww.A07, c6ww.A09, v42, str, true);
            }
            c6ww.A04 = true;
            c6ww.A00();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DX2(User user) {
        C145906hn c145906hn = this.A0d;
        if (c145906hn == null) {
            C14360o3.A0F("reelProfileOpener");
            throw C00O.createAndThrow();
        }
        C145906hn.A01(c145906hn, null, user.getId(), "reel_viewer_go_to_profile", false);
    }

    @Override // X.InterfaceC144596ff
    public final void DZS(C41181vS c41181vS) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C26840Bt2 c26840Bt2 = new C26840Bt2();
                C143536ds.A00(c26840Bt2, c143536ds).A00().A02(activity, c26840Bt2);
                c143536ds.A00 = true;
                C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
                if (c145726hV != null) {
                    c145726hV.A01();
                }
            }
        }
    }

    @Override // X.InterfaceC144676fn
    public final void DZs(String str, int i, int i2) {
        this.A18.EJE("tapped");
        C84823qW c84823qW = new C84823qW();
        c84823qW.A12 = EnumC75383a5.A0k;
        c84823qW.A1b = str;
        Ddl(c84823qW, i, i2);
    }

    @Override // X.InterfaceC144726fs
    public final void DcS() {
        C148566mR c148566mR = this.A0x;
        if (c148566mR == null) {
            C14360o3.A0F("reelSuggestedHighlightsController");
            throw C00O.createAndThrow();
        }
        c148566mR.DcS();
    }

    @Override // X.InterfaceC144596ff
    public final void Dcs() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            A6M a6m = new A6M(this);
            if (!AbstractC70443Ed.A01(userSession)) {
                a6m.A00.A18.EJE("dialog");
                C25027B5z c25027B5z = new C25027B5z(a6m, 8);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0d = activity.getString(2131971354);
                c189448aO.A0g = activity.getString(2131968948);
                c189448aO.A0v = true;
                c189448aO.A0U = new C24106Amr(c25027B5z);
                c189448aO.A00().A02(activity, new AbstractC59962oe() { // from class: X.9f5
                    public static final String __redex_internal_original_name = "QuickSnapUnavailableBottomSheetFragment";
                    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

                    @Override // X.InterfaceC11380iw
                    public final String getModuleName() {
                        return "QuickSnapUnAvailableBottomSheetFragment";
                    }

                    @Override // X.AbstractC59962oe
                    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
                        return AbstractC166987dD.A0n(this.A00);
                    }

                    @Override // androidx.fragment.app.Fragment
                    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                        int A02 = C0f9.A02(-1215931353);
                        C14360o3.A0B(layoutInflater, 0);
                        View inflate = layoutInflater.inflate(R.layout.layout_quick_snap_unavailable, viewGroup, false);
                        C14360o3.A07(inflate);
                        C0f9.A09(-1203363862, A02);
                        return inflate;
                    }
                });
                return;
            }
            C6XJ A02 = C6XJ.A02(activity, new Bundle(0), AbstractC12960li.A00, TransparentModalActivity.class, "quick_snap_camera");
            A02.A07();
            A02.A0C(activity);
        }
    }

    @Override // X.InterfaceC144746fu
    public final void Df7() {
        C148566mR c148566mR = this.A0x;
        if (c148566mR == null) {
            C14360o3.A0F("reelSuggestedHighlightsController");
            throw C00O.createAndThrow();
        }
        c148566mR.Df7();
    }

    @Override // X.InterfaceC144586fe
    public final void DhD() {
        this.A18.ADf(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC144586fe
    public final void DlC(ImageUrl imageUrl, ProductAREffectContainer productAREffectContainer, String str, String str2, String str3, String str4) {
        Context context;
        InterfaceC11380iw interfaceC11380iw;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, str, "effect_id");
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            UserSession userSession = this.A09;
            if (userSession != null) {
                C2EY c2ey = C2EY.A0M;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -1167061781:
                            if (str4.equals("pre_cap_tray_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A0E;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 118117347:
                            if (str4.equals("gallery_effect_preview_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A09;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 243717239:
                            if (str4.equals(AbstractC43591JPw.A00(210))) {
                                interfaceC11380iw = XkZ.A0G;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 293866938:
                            if (str4.equals("profile_effect_preview_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A0F;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 1008812026:
                            if (str4.equals("direct_effect_preview_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A00;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 1304578444:
                            if (str4.equals("feed_attribution_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A08;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        case 1513989928:
                            if (str4.equals("post_cap_tray_bottom_sheet")) {
                                interfaceC11380iw = XkZ.A0D;
                                break;
                            }
                            interfaceC11380iw = XkZ.A0H;
                            break;
                        default:
                            interfaceC11380iw = XkZ.A0H;
                            break;
                    }
                    C34726FRp A07 = c28501Zl.A07(interfaceC11380iw, userSession, c2ey);
                    A07.A03(imageUrl, productAREffectContainer, str, str2, str3);
                    A07.A02(c19260xA);
                    DirectShareSheetFragment A00 = A07.A00();
                    C3DN A01 = C3DN.A00.A01(context);
                    if (A01 != null) {
                        this.A18.EJE("context_switch");
                        A01.A0N(A00, new C24133AnI(this));
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            AbstractC23021Ah.A00(userSession2).A0S();
                            return;
                        }
                    } else {
                        C0w9.A03(__redex_internal_original_name, "shareEffect() BottomSheetNavigator should not be null.");
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144696fp
    public final void DlV(C3G2 c3g2) {
        List list;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null) {
            C41618Ib8 c41618Ib8 = AuU.A0E;
            c41618Ib8.getClass();
            list = c41618Ib8.A03.A01;
        } else {
            list = C16930sl.A00;
        }
        interfaceC1118853a.CqT();
        Dr1(c3g2, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r0 != true) goto L16;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DlY(android.view.View r14, X.C41181vS r15, X.C41551w4 r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            X.53a r0 = r13.A18
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.5Gn r0 = r0.A1C
            X.6ac r0 = r0.C00(r15)
            X.6hf r7 = r13.A0L
            if (r7 != 0) goto L18
            java.lang.String r0 = "reelViewerLogger"
        L10:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            float r11 = r0.A0B
            float r12 = r0.A0A
            java.lang.String r9 = "tap"
            java.lang.String r10 = "ig_story_item_share_on_action"
            r8 = r16
            r7.A0Q(r8, r9, r10, r11, r12)
            X.6jX r5 = r13.A0u
            if (r5 != 0) goto L2c
            java.lang.String r0 = "reelViewerShareOnManager"
            goto L10
        L2c:
            r6 = 0
            r2 = 1
            X.53a r1 = r5.A01
            java.lang.String r0 = "share"
            r1.EJE(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r17 == 0) goto L64
            X.1qM r0 = r15.A0b
            if (r0 == 0) goto L49
            boolean r0 = r0.A5W()
            r7 = 2131238353(0x7f081dd1, float:1.8092982E38)
            if (r0 == r2) goto L4c
        L49:
            r7 = 2131238354(0x7f081dd2, float:1.8092984E38)
        L4c:
            android.content.Context r3 = r14.getContext()
            X.C14360o3.A07(r3)
            r2 = 2131962048(0x7f1328c0, float:1.956081E38)
            r1 = 20
            X.D8P r0 = new X.D8P
            r0.<init>(r1, r8, r5, r15)
            X.8sw r0 = X.C146956jX.A00(r3, r0, r2, r7)
            r4.add(r0)
        L64:
            if (r18 == 0) goto La0
            java.lang.String r1 = r15.A0j
            X.C14360o3.A07(r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            java.util.List r0 = r0.A0H()
            if (r0 != 0) goto L7c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L7c:
            boolean r0 = r0.contains(r1)
            r7 = 2131237954(0x7f081c42, float:1.8092173E38)
            if (r0 == 0) goto L88
            r7 = 2131237952(0x7f081c40, float:1.8092169E38)
        L88:
            android.content.Context r3 = r14.getContext()
            X.C14360o3.A07(r3)
            r2 = 2131977082(0x7f13637a, float:1.9591303E38)
            r1 = 21
            X.D8P r0 = new X.D8P
            r0.<init>(r1, r8, r5, r15)
            X.8sw r0 = X.C146956jX.A00(r3, r0, r2, r7)
            r4.add(r0)
        La0:
            android.content.Context r3 = r14.getContext()
            X.C14360o3.A07(r3)
            com.instagram.common.session.UserSession r2 = r5.A00
            r0 = 0
            X.8QJ r1 = new X.8QJ
            r1.<init>(r3, r2, r0, r6)
            r1.A02(r4)
            X.Clq r0 = new X.Clq
            r0.<init>(r5)
            r1.setOnDismissListener(r0)
            r1.A01(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DlY(android.view.View, X.1vS, X.1w4, boolean, boolean):void");
    }

    @Override // X.InterfaceC144596ff
    public final void Dli(User user) {
        C145906hn c145906hn = this.A0d;
        if (c145906hn == null) {
            C14360o3.A0F("reelProfileOpener");
            throw C00O.createAndThrow();
        }
        C145906hn.A01(c145906hn, null, user.getId(), "reel_viewer_go_to_profile", false);
    }

    @Override // X.InterfaceC144586fe
    public final void Dlk(C41181vS c41181vS, C41551w4 c41551w4) {
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && fragment.isAdded()) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                boolean A0i = c41551w4.A0H.A0i();
                AbstractC10360h2 parentFragmentManager = fragment.getParentFragmentManager();
                if (A0i) {
                    String str = c41181vS.A0k;
                    String str2 = c41181vS.A0j;
                    User user = c41181vS.A0i;
                    if (user != null) {
                        InterfaceC60442pS interfaceC60442pS = this.A16;
                        C08790ch A00 = AbstractC018607g.A00(fragment);
                        UserSession userSession = this.A09;
                        if (userSession != null) {
                            AbstractC31510Dsu.A0J(activity, parentFragmentManager, A00, userSession, interfaceC60442pS, user, null, str, str2, "story_highlight_reel_bottom_toolbar");
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    InterfaceC60442pS interfaceC60442pS2 = this.A16;
                    C08790ch A002 = AbstractC018607g.A00(fragment);
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        AbstractC31510Dsu.A0G(activity, parentFragmentManager, A002, userSession2, interfaceC60442pS2, c41181vS, null, "story_reel_bottom_toolbar");
                        return;
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144696fp
    public final void Dll() {
        C143556du c143556du;
        C6e7 c6e7;
        View view;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
        if ((Av7 instanceof C143556du) && (c143556du = (C143556du) Av7) != null && (c6e7 = c143556du.A1e) != null && (view = c6e7.A0O) != null) {
            C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
            if (c41551w4 != null) {
                c41551w4.A0D = false;
            }
            view.performClick();
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DoT(C41181vS c41181vS, User user, C145726hV c145726hV) {
        Context context;
        String CAl;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && c145726hV != null && AbstractC76693cH.A03(user) && (CAl = user.A03.CAl()) != null) {
            c145726hV.A01();
            ReelViewerFragment.A0I((ReelViewerFragment) this.A18, false);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC76693cH.A01(context, Rie.STORIES, userSession, user.getId(), CAl);
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DpM(C41181vS c41181vS) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_REEL_ID", c41181vS.A0k);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C6XJ A02 = C6XJ.A02(activity, bundle, userSession, ModalActivity.class, "highlights_grid");
            A02.A0H = true;
            A02.A0A(activity, 10005);
        }
    }

    @Override // X.InterfaceC144586fe
    public final void DpN(C41181vS c41181vS) {
        A01(C22P.A54, ACRType.A07, c41181vS, null, this);
    }

    @Override // X.InterfaceC144596ff
    public final void DpQ(C41181vS c41181vS) {
        FragmentActivity activity;
        C38321qM c38321qM;
        String str;
        PromptStickerModel A0E;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A1B.get();
        if (abstractC59962oe != null && (activity = abstractC59962oe.getActivity()) != null && (c38321qM = c41181vS.A0b) != null) {
            ArrayList A3N = c38321qM.A3N();
            ArrayList arrayList = new ArrayList();
            Iterator it = A3N.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C84823qW c84823qW = (C84823qW) next;
                if (c84823qW.A12 == EnumC75383a5.A11 && (A0E = c84823qW.A0E()) != null && A0E.A0M()) {
                    arrayList.add(next);
                }
            }
            C84823qW c84823qW2 = (C84823qW) AbstractC001800i.A0J(arrayList);
            if (c84823qW2 != null) {
                InterfaceC1118853a interfaceC1118853a = this.A18;
                interfaceC1118853a.EJE("bottom_sheet");
                UserSession userSession = this.A09;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    PromptStickerModel A0E2 = c84823qW2.A0E();
                    if (A0E2 != null) {
                        String str2 = c41181vS.A0k;
                        String str3 = this.A0y;
                        if (str3 == null) {
                            str = "traySessionId";
                        } else {
                            String str4 = this.A0z;
                            if (str4 == null) {
                                str = "viewerSessionId";
                            } else {
                                AbstractC54892OPn.A00(activity, C22P.A47, abstractC59962oe, userSession, c41181vS, null, null, interfaceC1118853a, A0E2, AbstractC23125AKj.A01(c84823qW2), str2, str3, str4, C16930sl.A00);
                                return;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC1118953b
    public final void DpS(C50559MTq c50559MTq, C50561MTs c50561MTs, int i) {
        this.A18.DpS(c50559MTq, c50561MTs, i);
    }

    @Override // X.InterfaceC144586fe
    public final void Dpg(String str, boolean z) {
        FragmentActivity activity;
        Integer num;
        String str2;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A18.EJE("tapped");
            C1YY A01 = FVI.A01();
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            if (z) {
                num = C05F.A0V;
            } else {
                num = C05F.A0U;
            }
            java.util.Set set = FE3.A00;
            if (36 - num.intValue() != 0) {
                str2 = "stories_highlight_teaser";
            } else {
                str2 = "stories_teaser";
            }
            A01.A03(activity, userSession, new C24113Amy(this), str, str2);
        }
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        String str;
        InterfaceC1118853a interfaceC1118853a = this.A18;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        if (reelViewerFragment.A2Y) {
            interfaceC1118853a.CMc();
            return true;
        }
        if (interfaceC1118853a.AuU() != null) {
            C145776ha c145776ha = this.A0R;
            if (c145776ha == null) {
                str = "reelViewerListenerManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (c145776ha.DrR()) {
                return false;
            }
        }
        if (!interfaceC1118853a.Cgw() && f > this.A00 && f2 > 0.0f) {
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            if (c41551w4 != null) {
                UserSession userSession = this.A09;
                str = "userSession";
                if (userSession != null) {
                    reelViewerFragment.A1C.C00(c41551w4.A08(userSession)).A0W = C05F.A0j;
                    C6k8 c6k8 = this.A0M;
                    if (c6k8 != null) {
                        c6k8.A00(C05F.A0Y);
                    }
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C140706Xy A00 = AbstractC140696Xx.A00(userSession2);
                        UserSession userSession3 = this.A09;
                        if (userSession3 != null) {
                            A00.A09(c41551w4.A08(userSession3), C05F.A00);
                            interfaceC1118853a.CqT();
                            return true;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ba, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36326021640762938L) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x030e, code lost:
    
        if (r17 <= 0.73d) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04f8, code lost:
    
        if (r2 > 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05bd, code lost:
    
        if (r17 <= 0.78d) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05bf, code lost:
    
        if (r5 > r2) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x051e, code lost:
    
        if (r2.A00("4300") <= 4.5d) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x056f, code lost:
    
        if (r17 <= 0.78d) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x03bf, code lost:
    
        if (X.OZG.A00(r10, r31, r32, r4, r8) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x03d6, code lost:
    
        if (X.OZG.A00(r10, r31, r32, r2, r8) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x049a, code lost:
    
        if (r31.getRawY() >= r2) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x044c, code lost:
    
        if (r31.getRawY() >= r2) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
    
        if (r6 == X.C3G2.A1T) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0161, code lost:
    
        if (X.AbstractC76783cQ.A06(r3, r0, X.C05F.A0j, true) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
    
        r0 = r30.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        X.AbstractC38267GsC.A00(r0).A02(r9, "swipe_up_from_viewer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
    
        if (X.AbstractC23021Ah.A00(r0).A1l() == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x063b  */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, X.5vh] */
    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Drb(android.view.MotionEvent r31, android.view.MotionEvent r32, float r33, float r34) {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.Drb(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r11.A07.A01 != 1.0d) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    @Override // X.InterfaceC144616fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DsB(float r35, float r36) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.DsB(float, float):void");
    }

    @Override // X.InterfaceC144596ff
    public final void DvY(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AbstractC149546o6 abstractC149546o6 = this.A0N;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            if (abstractC149546o6 instanceof C143536ds) {
                C143536ds c143536ds = (C143536ds) abstractC149546o6;
                C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                if (c146016hy != null) {
                    String moduleName = c146016hy.A02.getModuleName();
                    C14360o3.A0B(moduleName, 0);
                    C38937HCk c38937HCk = new C38937HCk();
                    Bundle bundle = new Bundle();
                    bundle.putString("args_previous_module_name", moduleName);
                    bundle.putString("args_media_id", str);
                    c38937HCk.setArguments(bundle);
                    C143536ds.A01(context, c38937HCk, c143536ds);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (X.AbstractC76783cQ.A06(r1, r3, X.C05F.A0j, true) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r0 = r6.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        X.AbstractC38267GsC.A00(r0).A02(r4, "button_tap_from_viewer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (X.AbstractC23021Ah.A00(r0).A1l() == false) goto L18;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E12() {
        /*
            r6 = this;
            X.53a r2 = r6.A18
            instagram.features.stories.fragment.ReelViewerFragment r2 = (instagram.features.stories.fragment.ReelViewerFragment) r2
            X.1w4 r1 = r2.A0a
            if (r1 == 0) goto L51
            com.instagram.common.session.UserSession r0 = r6.A09
            java.lang.String r5 = "userSession"
            if (r0 == 0) goto L52
            X.1vS r4 = r1.A08(r0)
            if (r4 == 0) goto L51
            X.5Gn r0 = r2.A1C
            X.6iL r0 = (X.C146226iL) r0
            X.6iR r0 = r0.A0C
            X.6ac r1 = r0.C00(r4)
            java.lang.Integer r0 = X.C05F.A1F
            r1.A0W = r0
            X.1qM r3 = r4.A0b
            r2 = 1
            if (r3 == 0) goto L33
            com.instagram.common.session.UserSession r1 = r6.A09
            if (r1 == 0) goto L52
            java.lang.Integer r0 = X.C05F.A0j
            boolean r0 = X.AbstractC76783cQ.A06(r1, r3, r0, r2)
            if (r0 == 0) goto L41
        L33:
            com.instagram.common.session.UserSession r0 = r6.A09
            if (r0 == 0) goto L52
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            boolean r0 = r0.A1l()
            if (r0 != 0) goto L4e
        L41:
            com.instagram.common.session.UserSession r0 = r6.A09
            if (r0 == 0) goto L52
            X.GsJ r1 = X.AbstractC38267GsC.A00(r0)
            java.lang.String r0 = "button_tap_from_viewer"
            r1.A02(r4, r0)
        L4e:
            r6.A0C()
        L51:
            return
        L52:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.E12():void");
    }

    @Override // X.InterfaceC144586fe
    public final void E13(C41181vS c41181vS) {
        C41551w4 c41551w4 = ((ReelViewerFragment) this.A18).A0a;
        if (c41551w4 != null) {
            A0F(c41181vS, c41551w4.A08);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r0.A00 != r5.A1C.CNP(r12.A0H)) goto L12;
     */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E14(X.C41181vS r11, X.C41551w4 r12, X.C143556du r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.E14(X.1vS, X.1w4, X.6du, boolean):void");
    }

    @Override // X.InterfaceC144596ff
    public final void E1t(C41181vS c41181vS) {
        Context context;
        InterfaceC43580JMo CHL;
        FragmentActivity activity;
        FragmentActivity activity2;
        InterfaceC43580JMo CHL2;
        String str;
        boolean z;
        ImageUrl imageUrl;
        FragmentActivity activity3;
        FragmentActivity activity4;
        WeakReference weakReference = this.A1B;
        Fragment fragment = (Fragment) weakReference.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            UserSession userSession = this.A09;
            String str2 = "userSession";
            String str3 = null;
            if (userSession != null) {
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null && c38321qM.A6g(userSession)) {
                    Fragment fragment2 = (Fragment) weakReference.get();
                    if (fragment2 != null && (activity4 = fragment2.getActivity()) != null) {
                        C41178IKr c41178IKr = CMF.A00;
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            c41178IKr.A00(activity4, EnumC223429tZ.STORIES_ATTRIBUTION, C8JW.A0Y, userSession2, c38321qM.getId(), this.A16.getModuleName());
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    UserSession userSession3 = this.A09;
                    if (userSession3 != null) {
                        if (c38321qM != null && c38321qM.A6j(userSession3)) {
                            Fragment fragment3 = (Fragment) weakReference.get();
                            if (fragment3 == null || (activity3 = fragment3.getActivity()) == null) {
                                return;
                            }
                            UserSession userSession4 = this.A09;
                            if (userSession4 != null) {
                                AbstractC27614CGk.A00(activity3, userSession4);
                                return;
                            }
                        } else if (this.A09 != null) {
                            if (c38321qM != null && c38321qM.A6U()) {
                                Fragment fragment4 = (Fragment) weakReference.get();
                                if (fragment4 == null || (activity2 = fragment4.getActivity()) == null || (CHL2 = c38321qM.A0C.CHL()) == null) {
                                    return;
                                }
                                UserSession userSession5 = this.A09;
                                if (userSession5 != null) {
                                    String BdW = CHL2.BdW();
                                    User BdV = CHL2.BdV();
                                    if (BdV != null) {
                                        str = BdV.getUsername();
                                    } else {
                                        str = null;
                                    }
                                    User BdV2 = CHL2.BdV();
                                    if (BdV2 != null) {
                                        z = BdV2.isVerified();
                                    } else {
                                        z = false;
                                    }
                                    String BdS = CHL2.BdS();
                                    String BdU = CHL2.BdU();
                                    User BdV3 = CHL2.BdV();
                                    if (BdV3 != null) {
                                        imageUrl = BdV3.Bhu();
                                    } else {
                                        imageUrl = null;
                                    }
                                    User BdV4 = CHL2.BdV();
                                    if (BdV4 != null) {
                                        str3 = BdV4.getId();
                                    }
                                    CLI.A00(activity2, userSession5, imageUrl, c38321qM, BdW, str, BdS, BdU, str3, c38321qM.getId(), "story", z);
                                    return;
                                }
                            } else {
                                UserSession userSession6 = this.A09;
                                if (userSession6 != null) {
                                    if (c38321qM != null && c38321qM.A6k(userSession6)) {
                                        Fragment fragment5 = (Fragment) weakReference.get();
                                        if (fragment5 == null || (activity = fragment5.getActivity()) == null) {
                                            return;
                                        }
                                        UserSession userSession7 = this.A09;
                                        if (userSession7 != null) {
                                            AbstractC27715CKi.A00(activity, Nj6.STORIES, userSession7, c38321qM);
                                            return;
                                        }
                                    } else {
                                        AbstractC149546o6 abstractC149546o6 = this.A0N;
                                        if (abstractC149546o6 == null) {
                                            str2 = "reelViewerBottomSheetManager";
                                        } else {
                                            if (!(abstractC149546o6 instanceof C143536ds)) {
                                                return;
                                            }
                                            C143536ds c143536ds = (C143536ds) abstractC149546o6;
                                            if (c38321qM == null || (CHL = c38321qM.A0C.CHL()) == null) {
                                                return;
                                            }
                                            UserSession userSession8 = c143536ds.A01;
                                            String attributionTitle = CHL.getAttributionTitle();
                                            String attributionSubtitle = CHL.getAttributionSubtitle();
                                            String attributionIconUrl = CHL.getAttributionIconUrl();
                                            String attributionCtaText = CHL.getAttributionCtaText();
                                            String attributionCtaActionUrl = CHL.getAttributionCtaActionUrl();
                                            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("args_attribution_title", attributionTitle);
                                            bundle.putString("args_attribution_subtitle", attributionSubtitle);
                                            bundle.putString("args_attribution_icon_url", attributionIconUrl);
                                            bundle.putString("args_attribution_cta_text", attributionCtaText);
                                            bundle.putString("args_attribution_cta_action_url", attributionCtaActionUrl);
                                            if (userSession8 != null) {
                                                AbstractC03240Dh.A00(bundle, userSession8);
                                            }
                                            abstractC59962oe.setArguments(bundle);
                                            C143536ds.A01(context, abstractC59962oe, c143536ds);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144646fk
    public final void E5I(C41181vS c41181vS) {
        Context context;
        C38321qM c38321qM;
        String A2u;
        Fragment fragment = (Fragment) this.A1B.get();
        if (fragment != null && (context = fragment.getContext()) != null && (c38321qM = c41181vS.A0b) != null && (A2u = c38321qM.A2u()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
            hashMap.put("instance_id", String.valueOf((int) (Math.random() * 2.147483647E9d)));
            hashMap.put("target_id", A2u);
            hashMap.put("origin", __redex_internal_original_name);
            UserSession userSession = this.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            AbstractC191798eb.A03(context, new C191778eZ(userSession), "com.instagram.insights.media_refresh.stories.core", null, hashMap, 600L);
        }
    }

    @Override // X.InterfaceC144586fe
    public final void EDi(View view, C38321qM c38321qM) {
        C6k5 c6k5;
        if (c38321qM != null && (c6k5 = this.A0e) != null) {
            String A0R = AnonymousClass001.A0R("shopping_stories_cta_bar_impression_", c38321qM.getId());
            C57112jm c57112jm = c6k5.A01;
            List A1Q = AbstractC16960so.A1Q(c6k5.A02, "stories_cta");
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c38321qM, A1Q, A0R);
            c59072n8.A00(c6k5.A00);
            c57112jm.A05(view, c59072n8.A01());
        }
    }

    @Override // X.InterfaceC144586fe
    public final void EDm(View view, C38321qM c38321qM) {
        User CDj;
        if (c38321qM != null && view != null && (CDj = c38321qM.A0C.CDj()) != null) {
            UserSession userSession = this.A09;
            if (userSession != null) {
                if (CDj.CS0(new C150866ql(userSession))) {
                    String A0R = AnonymousClass001.A0R("story_reply_composer_impression_", c38321qM.getId());
                    UserSession userSession2 = this.A09;
                    if (userSession2 != null) {
                        C27098BxN c27098BxN = new C27098BxN(userSession2);
                        C57112jm c57112jm = this.A0B;
                        if (c57112jm != null) {
                            String moduleName = this.A16.getModuleName();
                            C59062n7 c59062n7 = C59062n7.A07;
                            C59072n8 c59072n8 = new C59072n8(c38321qM, moduleName, A0R);
                            c59072n8.A00(c27098BxN);
                            c57112jm.A05(view, c59072n8.A01());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144586fe
    public final void EkE() {
        C64842wi c64842wi = this.A0H;
        if (c64842wi != null) {
            EnumSet of = EnumSet.of(Trigger.A0u);
            C14360o3.A07(of);
            c64842wi.AVr(of);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    @Override // X.InterfaceC144586fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Elh(java.lang.String r8) {
        /*
            r7 = this;
            X.6dc r3 = r7.A03
            if (r3 != 0) goto Le
            java.lang.String r6 = "storyRepliesBlock"
        L6:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            android.content.Context r5 = r3.A00
            java.lang.String r6 = "context"
            if (r5 == 0) goto L6
            X.8hC r4 = new X.8hC
            r4.<init>(r5)
            int r0 = r8.length()
            if (r0 != 0) goto L60
            android.content.Context r1 = r3.A00
            if (r1 == 0) goto L6
            r0 = 2131974705(0x7f135a31, float:1.9586482E38)
            java.lang.String r0 = r1.getString(r0)
        L2a:
            X.C14360o3.A0A(r0)
            r4.A05 = r0
            r0 = 2131974703(0x7f135a2f, float:1.9586478E38)
            r4.A09(r0)
            r0 = 2131238478(0x7f081e4e, float:1.8093236E38)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r4.A0j(r0)
            r1 = 2131976274(0x7f136052, float:1.9589664E38)
            X.Fhc r0 = new X.Fhc
            r0.<init>(r3)
            r4.A0J(r0, r1)
            r1 = 2131954767(0x7f130c4f, float:1.9546043E38)
            X.Fhb r0 = new X.Fhb
            r0.<init>(r3)
            r4.A0I(r0, r1)
            android.app.Dialog r1 = r4.A02()
            X.6mc r0 = r3.A02
            if (r0 != 0) goto L70
            java.lang.String r6 = "audLogging"
            goto L6
        L60:
            android.content.Context r2 = r3.A00
            if (r2 == 0) goto L6
            r1 = 2131974704(0x7f135a30, float:1.958648E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r0 = r2.getString(r1, r0)
            goto L2a
        L70:
            r0.A01()
            X.C0fJ.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145176gc.Elh(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.6gs] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.6gf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6gg] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.6gl] */
    public C145176gc(InterfaceC60152ox interfaceC60152ox, InterfaceC60442pS interfaceC60442pS, InterfaceC1119353f interfaceC1119353f, final InterfaceC1118853a interfaceC1118853a, C145126gX c145126gX, WeakReference weakReference) {
        this.A18 = interfaceC1118853a;
        this.A1B = weakReference;
        this.A16 = interfaceC60442pS;
        this.A1A = c145126gX;
        this.A17 = interfaceC1119353f;
        this.A15 = interfaceC60152ox;
        this.A1O = new InterfaceC145226gh(interfaceC1118853a) { // from class: X.6gg
            public final InterfaceC1118853a A00;

            @Override // X.InterfaceC145226gh
            public final /* synthetic */ void Cul() {
            }

            @Override // X.InterfaceC145226gh
            public final /* synthetic */ void DkJ(View view, int i) {
            }

            @Override // X.C51D
            public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
            }

            @Override // X.C51D
            public final /* synthetic */ void onBottomSheetClosed() {
            }

            @Override // X.C51D
            public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
            }

            @Override // X.InterfaceC145226gh
            public final void DB7() {
                ReelViewerFragment.A0I((ReelViewerFragment) this.A00, false);
            }

            @Override // X.C51D
            public final /* synthetic */ EnumC27385C6o backPressDestination() {
                return EnumC27385C6o.A02;
            }

            @Override // X.C51E
            public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
                return false;
            }

            @Override // X.C51E
            public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
                return false;
            }

            @Override // X.C51E
            public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
                return false;
            }

            @Override // X.C51E
            public final /* synthetic */ int dragLockBouncePx() {
                return 0;
            }

            @Override // X.C51E
            public final /* synthetic */ double getDragUpReleaseRatio() {
                return 0.5d;
            }

            @Override // X.C51E
            public final /* synthetic */ int getExtraDragSpace() {
                return 0;
            }

            @Override // X.C51E
            public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
                return 0.5d;
            }

            @Override // X.C51E
            public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
                return 0.0d;
            }

            @Override // X.C51E
            public final /* synthetic */ boolean includeFragmentDragSpace() {
                return false;
            }

            @Override // X.C51D
            public final /* synthetic */ boolean isElementAboveTitleEnabled() {
                return false;
            }

            @Override // X.C51E
            public final /* synthetic */ boolean isScrolledToBottom() {
                return true;
            }

            @Override // X.C51D
            public final /* synthetic */ boolean isScrolledToTop() {
                return true;
            }

            @Override // X.C51D
            public final /* synthetic */ boolean useCustomScrollDetermination() {
                return false;
            }

            {
                this.A00 = interfaceC1118853a;
            }

            @Override // X.C51E
            public final /* synthetic */ float getSwipeDownFlingVelocity() {
                return 3500.0f;
            }

            @Override // X.C51E
            public final /* synthetic */ float getSwipeUpFlingVelocity() {
                return 3500.0f;
            }
        };
    }

    @Override // X.InterfaceC144596ff
    public final void Cwt(C41181vS c41181vS) {
        String str;
        String str2;
        if (c41181vS.CY4()) {
            C145126gX c145126gX = this.A1A;
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                C149176nR c149176nR = c145126gX.A0I;
                if (c149176nR != null) {
                    JMM C1A = c38321qM.A0C.C1A();
                    if (C1A != null) {
                        str = C1A.getId();
                    } else {
                        str = null;
                    }
                    String A35 = c38321qM.A35();
                    String A36 = c38321qM.A36();
                    JMM C1A2 = c38321qM.A0C.C1A();
                    if (C1A2 != null) {
                        str2 = C1A2.getContentUrl();
                    } else {
                        str2 = null;
                    }
                    c149176nR.A01(str, A35, A36, str2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC144596ff
    public final void DcQ(C41181vS c41181vS) {
        Object obj;
        String str;
        List A0c = c41181vS.A0c();
        if (A0c != null) {
            Iterator it = A0c.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    obj = it.next();
                }
            } while (((C84823qW) obj).A0M == null);
            C84823qW c84823qW = (C84823qW) obj;
            if (c84823qW != null) {
                C38750H4q c38750H4q = c84823qW.A0M;
                Fragment fragment = (Fragment) this.A1B.get();
                if (fragment != null && c38750H4q != null && (str = c38750H4q.A00) != null) {
                    FragmentActivity requireActivity = fragment.requireActivity();
                    UserSession userSession = this.A09;
                    if (userSession != null) {
                        C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
                        FB6.A00();
                        UserSession userSession2 = this.A09;
                        if (userSession2 != null) {
                            c140966Yy.A0D(FXL.A01(EnumC39551HdN.A06, EnumC33416Epn.A0A, userSession2.token, str, this.A16.getModuleName()));
                            c140966Yy.A04();
                            return;
                        }
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    @Override // X.InterfaceC144586fe
    public final void Czk(C41181vS c41181vS) {
        A0C();
    }

    @Override // X.InterfaceC144586fe
    public final void DK4(Hashtag hashtag) {
        A02(hashtag);
    }

    @Override // X.InterfaceC144586fe
    public final void D1d(String str, String str2) {
        A0A(str, str2);
    }
}
