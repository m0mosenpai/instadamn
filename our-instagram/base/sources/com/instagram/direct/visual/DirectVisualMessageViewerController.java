package com.instagram.direct.visual;

import X.AbstractC001800i;
import X.AbstractC101614hW;
import X.AbstractC111324zv;
import X.AbstractC120715dH;
import X.AbstractC121575f6;
import X.AbstractC12220kQ;
import X.AbstractC125325le;
import X.AbstractC13880nE;
import X.AbstractC1578876x;
import X.AbstractC1586079v;
import X.AbstractC158867Ay;
import X.AbstractC165967bO;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC16830sb;
import X.AbstractC25228BEl;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.AbstractC31277Doz;
import X.AbstractC31278Dp0;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC42951yN;
import X.AbstractC43592JPx;
import X.AbstractC43599JQf;
import X.AbstractC44138Jf3;
import X.AbstractC59962oe;
import X.AbstractC81033jX;
import X.AbstractC84863qa;
import X.AnonymousClass442;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C101394gx;
import X.C101584hT;
import X.C101594hU;
import X.C101674hc;
import X.C14360o3;
import X.C147326kI;
import X.C148536mO;
import X.C149176nR;
import X.C150956qv;
import X.C1575675q;
import X.C162317Ot;
import X.C18920wW;
import X.C18U;
import X.C1NI;
import X.C1OW;
import X.C1P1;
import X.C2DS;
import X.C2EC;
import X.C2EY;
import X.C35181kx;
import X.C38321qM;
import X.C3G2;
import X.C3I9;
import X.C3MJ;
import X.C3MT;
import X.C3ZM;
import X.C3o9;
import X.C41761wQ;
import X.C42411xV;
import X.C42981yQ;
import X.C43121yf;
import X.C43931Jbg;
import X.C43V;
import X.C44065Jdq;
import X.C44288Jhe;
import X.C45093JxN;
import X.C47423KxE;
import X.C47428KxJ;
import X.C47573Kzj;
import X.C47677L3k;
import X.C47946LGa;
import X.C48261LXk;
import X.C48348LaO;
import X.C49330LrO;
import X.C49336LrU;
import X.C49378LsC;
import X.C49570LvP;
import X.C49574LvT;
import X.C49575LvU;
import X.C49685LxG;
import X.C49791Lyy;
import X.C4Zp;
import X.C55942hf;
import X.C57012jc;
import X.C5TA;
import X.C64352vu;
import X.C6JW;
import X.C71058WnD;
import X.C75363a3;
import X.C7DO;
import X.C7E9;
import X.C7EA;
import X.C7KE;
import X.C7TH;
import X.C7XU;
import X.C81493kJ;
import X.C83403nh;
import X.C84823qW;
import X.C9BP;
import X.C9GR;
import X.EnumC40111tc;
import X.EnumC75383a5;
import X.G5I;
import X.InterfaceC1119053c;
import X.InterfaceC1119353f;
import X.InterfaceC11380iw;
import X.InterfaceC145146gZ;
import X.InterfaceC147306kG;
import X.InterfaceC148526mN;
import X.InterfaceC149856oe;
import X.InterfaceC41501vz;
import X.InterfaceC56392iX;
import X.InterfaceC60072op;
import X.InterfaceC60152ox;
import X.InterfaceC60442pS;
import X.JR8;
import X.JRE;
import X.L03;
import X.L05;
import X.L22;
import X.L5M;
import X.L5Y;
import X.M62;
import X.MRJ;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.store.ReplaceDirectMessageLoader;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.volume.VolumeIndicator;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class DirectVisualMessageViewerController implements InterfaceC60072op, InterfaceC1119053c, C7XU, InterfaceC147306kG, InterfaceC149856oe, InterfaceC60152ox, View.OnKeyListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C1P1 A06;
    public C3MJ A07;
    public C3MT A08;
    public C3MT A09;
    public CircularImageView A0A;
    public L5M A0B;
    public C43931Jbg A0C;
    public MRJ A0D;
    public C48261LXk A0E;
    public C45093JxN A0F;
    public C47946LGa A0G;
    public C71058WnD A0H;
    public L03 A0I;
    public L05 A0J;
    public C64352vu A0K;
    public C1NI A0L;
    public C148536mO A0M;
    public C47677L3k A0N;
    public C149176nR A0O;
    public InterfaceC1119053c A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final int A0c;
    public final RectF A0d;
    public final FragmentActivity A0e;
    public final AbstractC59962oe A0f;
    public final InterfaceC11380iw A0g;
    public final C18920wW A0h;
    public final InterfaceC41501vz A0i;
    public final InterfaceC41501vz A0j;
    public final InterfaceC41501vz A0k;
    public final C41761wQ A0l;
    public final UserSession A0m;
    public final C2EC A0n;
    public final G5I A0o;
    public final C2DS A0p;
    public final DirectThreadAnalyticsParams A0q;
    public final C7KE A0r;
    public final C7DO A0s;
    public final C47423KxE A0t;
    public final C47428KxJ A0u;
    public final InterfaceC60442pS A0v;
    public final InterfaceC1119353f A0w;
    public final C3o9 A0x;
    public final ReelViewerConfig A0y;
    public final InterfaceC148526mN A0z;
    public final InterfaceC145146gZ A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final String A15;
    public final String A16;
    public final HashSet A17;
    public final HashSet A18;
    public final List A19;
    public final List A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final C49574LvT A1H;
    public View backgroundDimmer;
    public C57012jc blurImageViewContainerStubHolder;
    public EditText composerEditText;
    public TextWatcher composerTextWatcher;
    public L5Y contentHolder;
    public View contentView;
    public View itemView;
    public C3I9 keyboardHeightChangeDetector;
    public C147326kI photoTimerController;
    public InterfaceC56392iX privacyOverlayStubHolder;
    public SegmentedProgressBar progressBar;
    public L22 reelViewerShadowAnimator;
    public View replyComposer;
    public View replyComposerContainer;
    public View rootView;
    public View selfViewFooterContainer;
    public C57012jc sparklerAnimationStubHolder;
    public View textSendButton;
    public C49685LxG videoPlayer;
    public TouchInterceptorFrameLayout viewerContainer;
    public View viewerInfoContainer;
    public VolumeIndicator volumeIndicator;

    public static final void A0G(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C45093JxN c45093JxN;
        L5Y l5y;
        A0N(directVisualMessageViewerController, false);
        directVisualMessageViewerController.A0R = true;
        directVisualMessageViewerController.A0X("start");
        C45093JxN A02 = A02(directVisualMessageViewerController);
        int i = 0;
        if (A02 != null && AbstractC167007dF.A1X(A02.A0B, EnumC40111tc.A0a) && (l5y = directVisualMessageViewerController.contentHolder) != null) {
            l5y.A04.setVisibility(0);
        }
        if (directVisualMessageViewerController.A0Y) {
            C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
            if (c47946LGa != null) {
                i = c47946LGa.A00;
                c45093JxN = c47946LGa.A00();
            } else {
                c45093JxN = null;
            }
            A07(c45093JxN, c47946LGa, directVisualMessageViewerController, i);
        }
    }

    public static final void A0M(DirectVisualMessageViewerController directVisualMessageViewerController, String str, String str2) {
        directVisualMessageViewerController.A0U = true;
        UserSession userSession = directVisualMessageViewerController.A0m;
        AbstractC25228BEl.A1G(directVisualMessageViewerController.A0e, AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A01(userSession, str, str2, directVisualMessageViewerController.A0v.getModuleName()).A03()), userSession, ModalActivity.class, "profile");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r1 == (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        A0I(r8);
        A0H(r8);
        A0E(r8);
        r0 = r8.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r1 = r0.A00;
        r0 = r0.A01(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if (r0.A0Y == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r0 = r8.progressBar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r0.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0O(com.instagram.direct.visual.DirectVisualMessageViewerController r8, boolean r9) {
        /*
            r4 = 1
            r3 = 5
            if (r9 == 0) goto L5
            r3 = 1
        L5:
            X.2jc r2 = r8.sparklerAnimationStubHolder
            r7 = 0
            if (r2 == 0) goto L2d
            boolean r0 = r2.A04()
            if (r0 != r4) goto L2d
            r1 = 0
            android.view.View r2 = r2.A01()
            if (r2 == 0) goto L1b
            android.graphics.drawable.Drawable r1 = r2.getBackground()
        L1b:
            boolean r0 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L26
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            if (r1 == 0) goto L26
            r1.stop()
        L26:
            android.view.View[] r0 = new android.view.View[]{r2}
            X.C150956qv.A08(r0, r4)
        L2d:
            X.LGa r2 = r8.A0G
            if (r2 == 0) goto Lb0
            int r0 = r2.A00
            int r1 = r0 + 1
            java.util.List r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto Lb0
            X.LGa r0 = r8.A0G
            if (r0 == 0) goto Lb0
            int r1 = r0.A00
            int r0 = r0.A01
            int r0 = r0 - r4
            if (r1 >= r0) goto Lb0
        L48:
            A0F(r8)
            A0K(r8, r3)
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r8.A0m
            com.instagram.user.model.User r6 = r1.A01(r0)
            X.LGa r5 = r8.A0G
            if (r5 == 0) goto Lcc
            int r2 = r5.A00
            int r1 = r2 + 1
        L5e:
            java.util.List r0 = r5.A03
            int r0 = r0.size()
            int r1 = r1 % r0
            if (r1 == r2) goto L9c
            X.JxN r0 = r5.A01(r1)
            if (r0 == 0) goto Lc7
            boolean r0 = A0S(r0, r8, r6)
            if (r0 == 0) goto L99
            r5.A00 = r1
        L75:
            r0 = -1
            if (r1 == r0) goto Lcc
            A0I(r8)
            A0H(r8)
            A0E(r8)
            X.LGa r0 = r8.A0G
            if (r0 == 0) goto L98
            int r1 = r0.A00
            X.JxN r0 = r0.A01(r1)
            if (r0 == 0) goto L98
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L98
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r8.progressBar
            if (r0 == 0) goto L98
            r0.A05(r1)
        L98:
            return
        L99:
            int r1 = r1 + 1
            goto L5e
        L9c:
            X.JxN r1 = r5.A00()
            X.C14360o3.A0B(r1, r7)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r0 = r1.A08
            if (r0 != 0) goto Lcc
            boolean r0 = A0S(r1, r8, r6)
            if (r0 == 0) goto Lcc
            int r1 = r5.A00
            goto L75
        Lb0:
            boolean r0 = r8.A0T
            if (r0 != 0) goto Lbb
            if (r9 != 0) goto Lcc
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L98
            goto L48
        Lbb:
            X.L03 r0 = r8.A0I
            if (r0 != 0) goto L98
            X.L03 r0 = new X.L03
            r0.<init>(r8, r9)
            r8.A0I = r0
            return
        Lc7:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Lcc:
            int r1 = r8.A0c
            r0 = 1
            if (r1 != r4) goto Ld2
            r0 = 0
        Ld2:
            A0L(r8, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0O(com.instagram.direct.visual.DirectVisualMessageViewerController, boolean):void");
    }

    private final boolean A0R(C45093JxN c45093JxN) {
        String str;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Set A07 = AbstractC16830sb.A07("once", "replayable");
        if (c45093JxN != null) {
            str = c45093JxN.A0N;
        } else {
            str = null;
        }
        if (!AbstractC001800i.A0u(A07, str)) {
            if (c45093JxN != null && (privacyMediaOverlayViewModel = c45093JxN.A00) != null && privacyMediaOverlayViewModel.A00 == 2) {
                if (!C18U.A06(C06090Tz.A05, this.A0m, 36327374555593252L)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (C18U.A06(C06090Tz.A05, this.A0m, 36327374555527715L)) {
            return true;
        }
        return false;
    }

    public final void A0W(String str) {
        C5TA c5ta;
        this.A0S = true;
        C49685LxG c49685LxG = this.videoPlayer;
        if (c49685LxG != null && !c49685LxG.A07 && (c5ta = c49685LxG.A05) != null && c49685LxG.A04 != null) {
            c49685LxG.A07 = true;
            c49685LxG.A03 = System.currentTimeMillis();
            c5ta.A09(str);
        }
        C147326kI c147326kI = this.photoTimerController;
        if (c147326kI != null) {
            c147326kI.A00();
        }
    }

    public final void A0X(String str) {
        C49685LxG c49685LxG;
        C5TA c5ta;
        this.A0S = false;
        C45093JxN A02 = A02(this);
        if (A02 != null && A02.A0B == EnumC40111tc.A0Q) {
            C147326kI c147326kI = this.photoTimerController;
            if (c147326kI != null) {
                c147326kI.A01();
            }
        } else {
            C45093JxN A022 = A02(this);
            if (A022 != null && AbstractC167007dF.A1X(A022.A0B, EnumC40111tc.A0a) && (c49685LxG = this.videoPlayer) != null && c49685LxG.A06 && c49685LxG.A07 && (c5ta = c49685LxG.A05) != null) {
                c49685LxG.A07 = false;
                c49685LxG.A02 += System.currentTimeMillis() - c49685LxG.A03;
                c5ta.A0B(str, false);
            }
        }
        A0C(this);
    }

    @Override // X.C7XU
    public final void DB3() {
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbs(Object obj) {
        C14360o3.A0B(obj, 0);
        A0O(this, false);
        InterfaceC1119053c interfaceC1119053c = this.A0P;
        if (interfaceC1119053c != null) {
            interfaceC1119053c.Dbs(obj);
        }
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbz(Object obj, float f) {
        C14360o3.A0B(obj, 0);
        SegmentedProgressBar segmentedProgressBar = this.progressBar;
        if (segmentedProgressBar != null) {
            segmentedProgressBar.setProgress(f);
        }
        this.A00 = f;
        InterfaceC1119053c interfaceC1119053c = this.A0P;
        if (interfaceC1119053c != null) {
            interfaceC1119053c.Dbz(obj, f);
        }
    }

    @Override // X.InterfaceC149856oe
    public final void Dfc(String str) {
    }

    @Override // X.InterfaceC149856oe
    public final void Dfd() {
    }

    @Override // X.InterfaceC149856oe
    public final void Dkc() {
    }

    @Override // X.InterfaceC149856oe
    public final void EFE(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r9 == 24) goto L6;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.view.View r8, int r9, android.view.KeyEvent r10) {
        /*
            r7 = this;
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            r3 = 0
            r2 = 25
            if (r9 == r2) goto Le
            r0 = 24
            r1 = 0
            if (r9 != r0) goto Lf
        Le:
            r1 = 1
        Lf:
            int r0 = r10.getAction()
            if (r0 != 0) goto L18
            if (r1 == 0) goto L18
            r3 = 1
        L18:
            r0 = 0
            if (r3 == 0) goto L4a
            X.JxN r1 = A02(r7)
            if (r1 == 0) goto L4a
            java.util.List r1 = r1.A0P
            X.C14360o3.A0B(r1, r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.AbstractC101614hW.A05(r1)
            if (r1 == 0) goto L4a
            boolean r1 = r1.A0t
            if (r1 == 0) goto L4a
            X.JxN r1 = A02(r7)
            if (r1 == 0) goto L49
            java.util.List r1 = r1.A0P
            if (r1 == 0) goto L49
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.AbstractC101614hW.A05(r1)
            if (r1 == 0) goto L49
            java.lang.String r2 = r1.A0j
            if (r2 == 0) goto L49
            androidx.fragment.app.FragmentActivity r1 = r7.A0e
            X.C9GR.A09(r1, r2)
        L49:
            return r0
        L4a:
            X.LxG r1 = r7.videoPlayer
            if (r1 == 0) goto L49
            X.5TA r1 = r1.A05
            if (r1 == 0) goto L81
            java.lang.String r0 = "This operation must be run on UI thread."
            X.C11T.A06(r0)
            boolean r0 = r1.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb6
            X.JgN r3 = r1.A07
            r1 = 1
            java.lang.ref.WeakReference r0 = r3.A01
            if (r0 == 0) goto L83
            java.lang.Object r4 = r0.get()
            X.4S7 r4 = (X.C4S7) r4
        L6a:
            android.media.AudioManager r6 = r3.A03
            r5 = 0
            if (r6 == 0) goto L81
            X.5TA r0 = r3.A00
            if (r0 == 0) goto L81
            if (r4 == 0) goto L81
            int r0 = r10.getAction()
            if (r0 != 0) goto L81
            r0 = 24
            if (r9 == r2) goto L85
            if (r9 == r0) goto L85
        L81:
            r0 = 0
            return r0
        L83:
            r4 = 0
            goto L6a
        L85:
            r3.A02 = r1
            r2 = -1
            if (r9 != r0) goto L8b
            r2 = 1
        L8b:
            r1 = 3
            r0 = 8
            r6.adjustStreamVolume(r1, r2, r0)
            int r2 = r6.getStreamVolume(r1)
            X.JgM r0 = r3.A06
            int r1 = r6.getStreamMaxVolume(r1)
            X.5TA r0 = r0.A00
            X.6C3 r0 = r0.A00
            r0.E0M(r2, r1)
            if (r2 <= 0) goto La5
            r5 = 1
        La5:
            boolean r0 = r4.A00
            if (r0 == 0) goto Lb0
            if (r5 != 0) goto Lae
            r3.A01(r9)
        Lae:
            r0 = 1
            return r0
        Lb0:
            if (r5 == 0) goto Lae
            r3.A02(r9)
            goto Lae
        Lb6:
            java.lang.IllegalStateException r0 = X.AbstractC31172DnG.A0u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public static final int A00(DirectVisualMessageViewerController directVisualMessageViewerController, User user, String str) {
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa == null) {
            return -1;
        }
        int i = c47946LGa.A00;
        List list = c47946LGa.A03;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (C14360o3.A0K(((C45093JxN) list.get(i2)).A01(), str)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        while (i2 != i && i2 != -1) {
            C45093JxN A01 = c47946LGa.A01(i2);
            if (A01 != null) {
                if (A0S(A01, directVisualMessageViewerController, user)) {
                    c47946LGa.A00 = i2;
                    return i2;
                }
                i2 = (i2 + 1) % c47946LGa.A03.size();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (!A0S(c47946LGa.A00(), directVisualMessageViewerController, user)) {
            return -1;
        }
        return c47946LGa.A00;
    }

    public static final AnonymousClass442 A01(DirectVisualMessageViewerController directVisualMessageViewerController) {
        String str;
        String str2;
        C83403nh c83403nh;
        C2EY c2ey;
        C101674hc c101674hc;
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        ImmutableMap immutableMap = null;
        if (c47946LGa != null) {
            C45093JxN A00 = c47946LGa.A00();
            if (!A00.A0X && (str = A00.A0K) != null && (str2 = A00.A0G) != null) {
                boolean A1W = AbstractC167007dF.A1W(A00.A08);
                C3o9 c3o9 = directVisualMessageViewerController.A0x;
                if (c3o9 instanceof DirectThreadKey) {
                    c83403nh = directVisualMessageViewerController.A0p.BSh(JRE.A01(c3o9), str);
                } else {
                    c83403nh = null;
                }
                if (A1W) {
                    c2ey = C2EY.A0z;
                } else {
                    c2ey = C2EY.A0q;
                }
                String str3 = A00.A0M;
                C101584hT c101584hT = null;
                Boolean valueOf = Boolean.valueOf(A00.A0T);
                if (c83403nh != null) {
                    immutableMap = c83403nh.A0K();
                }
                C38321qM c38321qM = A00.A0A;
                if (c38321qM != null && (c101674hc = A00.A06) != null) {
                    C101594hU c101594hU = A00.A07;
                    String str4 = A00.A0O;
                    int i = A00.A02;
                    c101584hT = C43V.A00(c101674hc, c101594hU, c38321qM, Integer.valueOf(i), str4, A00.A0N, i);
                }
                return new AnonymousClass442(null, null, null, null, null, null, c101584hT, null, null, null, null, null, c2ey, null, null, null, valueOf, str2, null, str, "visual_media_viewer", str3, null, null, immutableMap, 0L);
            }
        }
        return null;
    }

    public static final C45093JxN A02(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa != null) {
            return c47946LGa.A00();
        }
        return null;
    }

    private final AbstractC125325le A03() {
        View view = this.contentView;
        if (view != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0A();
            A0A.A04 = 0;
            A0A.A03 = 4;
            AbstractC125325le A0E = A0A.A0E(AbstractC43599JQf.A00);
            A0E.A05 = new C44065Jdq(this, 15);
            return A0E;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final AbstractC125325le A04(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View view = directVisualMessageViewerController.contentView;
        if (view != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0A();
            A0A.A04 = 0;
            AbstractC125325le A0E = A0A.A0E(AbstractC43599JQf.A00);
            A0E.A05 = new C44065Jdq(directVisualMessageViewerController, 16);
            return A0E;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A05(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Editable text;
        String obj;
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null) {
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A19 = AbstractC167027dH.A19(obj, i2);
                if (!z) {
                    if (!A19) {
                        z = true;
                    } else {
                        i++;
                    }
                } else {
                    if (!A19) {
                        break;
                    }
                    length--;
                }
            }
            String A0g = AbstractC31177DnL.A0g(obj, length, i);
            if (A0g != null) {
                return A0g;
            }
        }
        return "";
    }

    public static final String A06(DirectVisualMessageViewerController directVisualMessageViewerController) {
        String str;
        DirectThreadKey A02 = JRE.A02(directVisualMessageViewerController.A0x);
        if (A02 != null && (str = A02.A00) != null) {
            return str;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [X.1kx, X.1OW] */
    public static final void A07(C45093JxN c45093JxN, C47946LGa c47946LGa, DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        String str;
        String str2;
        Boolean CG3;
        String str3;
        FollowStatus followStatus;
        String A0g;
        String str4;
        C47573Kzj c47573Kzj;
        String str5;
        C47573Kzj c47573Kzj2;
        String str6;
        C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
        if (c47946LGa2 != null && i == c47946LGa2.A00 && directVisualMessageViewerController.A03 == 1) {
            if (!directVisualMessageViewerController.A0R) {
                directVisualMessageViewerController.A0Y = true;
                return;
            }
            MRJ mrj = directVisualMessageViewerController.A0D;
            if (mrj != null) {
                mrj.DfQ();
            }
            List list = null;
            if (c45093JxN != null) {
                str = c45093JxN.A0K;
            } else {
                str = null;
            }
            L5M l5m = directVisualMessageViewerController.A0B;
            if (l5m == null) {
                str2 = "directVisualViewerSummaryLogger";
            } else {
                if (c45093JxN != null && (str6 = c45093JxN.A0I) != null) {
                    List list2 = l5m.A0B;
                    if (!list2.contains(str6)) {
                        if (c45093JxN.A0B == EnumC40111tc.A0Q) {
                            l5m.A02++;
                        } else {
                            l5m.A04++;
                        }
                        if (c45093JxN.A0Y) {
                            l5m.A05++;
                        } else if (c45093JxN.A0W) {
                            l5m.A01++;
                        } else {
                            l5m.A03++;
                        }
                        list2.add(str6);
                    }
                }
                if (str != null) {
                    HashSet hashSet = directVisualMessageViewerController.A18;
                    if (!hashSet.contains(str)) {
                        UserSession userSession = directVisualMessageViewerController.A0m;
                        if (!C14360o3.A0K(userSession.userId, c45093JxN.A0M)) {
                            C3o9 c3o9 = directVisualMessageViewerController.A0x;
                            if (c3o9 instanceof MsysThreadId) {
                                G5I g5i = directVisualMessageViewerController.A0o;
                                g5i.A00.A02(AbstractC31180DnO.A0I(C6JW.A00(g5i.A01, "MsysThreadActionsManager").A00.A02.A0L(new C48348LaO(Long.parseLong(str), 4)), "tam_mark_visual_message_seen"), C49791Lyy.A00);
                                hashSet.add(str);
                            } else {
                                C2DS c2ds = directVisualMessageViewerController.A0p;
                                C83403nh BSh = c2ds.BSh(JRE.A01(c3o9), str);
                                if (BSh != null && (!c45093JxN.A0W || BSh.A1l(AbstractC166997dE.A0Y(userSession)))) {
                                    hashSet.add(str);
                                    DirectThreadKey A01 = JRE.A01(c3o9);
                                    String str7 = directVisualMessageViewerController.A14;
                                    boolean z = directVisualMessageViewerController.A1C;
                                    c2ds.FD6(A01, str, str7, z);
                                    DirectThreadKey A012 = JRE.A01(c3o9);
                                    if (!z) {
                                        AbstractC31278Dp0.A09(userSession, BSh, A012);
                                    } else {
                                        C14360o3.A0B(A012, 1);
                                        boolean z2 = BSh.A2P;
                                        if (BSh.A1S()) {
                                            A0g = null;
                                        } else {
                                            A0g = BSh.A0g();
                                        }
                                        ?? c1ow = new C1OW(AbstractC31277Doz.A04(userSession, null, C35181kx.class, null, A0g, z2));
                                        c1ow.A01 = A012;
                                        String A0h = BSh.A0h();
                                        if (A0h != null) {
                                            c1ow.A02 = A0h;
                                            c1ow.A05 = BSh.A0g();
                                            C101584hT c101584hT = BSh.A0e;
                                            String str8 = "";
                                            if (c101584hT == null || (c47573Kzj2 = c101584hT.A02) == null || (str4 = c47573Kzj2.A01) == null) {
                                                str4 = "";
                                            }
                                            c1ow.A04 = str4;
                                            if (c101584hT != null && (c47573Kzj = c101584hT.A02) != null && (str5 = c47573Kzj.A00) != null) {
                                                str8 = str5;
                                            }
                                            c1ow.A03 = str8;
                                            c1ow.A00 = AbstractC1586079v.A00(BSh);
                                            AbstractC31173DnH.A1U(userSession, c1ow);
                                        } else {
                                            throw AbstractC166997dE.A0g();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (c47946LGa != null && c45093JxN != null) {
                    String str9 = c45093JxN.A0I;
                    C49378LsC c49378LsC = new C49378LsC(str9);
                    User user = c45093JxN.A0C;
                    DirectThreadKey A02 = JRE.A02(directVisualMessageViewerController.A0x);
                    if (A02 != null) {
                        str3 = A02.A00;
                    } else {
                        str3 = null;
                    }
                    c49378LsC.A05 = str9;
                    c49378LsC.A00 = c45093JxN.A0B;
                    c49378LsC.A07 = directVisualMessageViewerController.A16;
                    c49378LsC.A03 = Integer.valueOf(i);
                    c49378LsC.A04 = AbstractC43592JPx.A0s(c47946LGa.A03);
                    c49378LsC.A02 = Boolean.valueOf(directVisualMessageViewerController.A1C);
                    if (user != null) {
                        followStatus = user.B7L();
                    } else {
                        followStatus = FollowStatus.A08;
                    }
                    c49378LsC.A01 = followStatus;
                    String str10 = c45093JxN.A0O;
                    if (str10 == null) {
                        str10 = "";
                    }
                    c49378LsC.A08 = str10;
                    if (str3 != null) {
                        c49378LsC.A06 = A06(directVisualMessageViewerController);
                    }
                    directVisualMessageViewerController.A0L = c49378LsC;
                    C64352vu c64352vu = directVisualMessageViewerController.A0K;
                    if (c64352vu != null) {
                        c64352vu.A00(null, c49378LsC, i, -1, true);
                        C64352vu c64352vu2 = directVisualMessageViewerController.A0K;
                        if (c64352vu2 != null) {
                            C1NI c1ni = directVisualMessageViewerController.A0L;
                            if (c1ni != null) {
                                c64352vu2.A01(C81493kJ.A02, c1ni, i);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                    C14360o3.A0F("impressionTracker");
                    throw C00O.createAndThrow();
                }
                directVisualMessageViewerController.A0Y = false;
                directVisualMessageViewerController.A03 = 2;
                if (c45093JxN != null) {
                    list = c45093JxN.A0P;
                }
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0x, list);
                if (A00 == null || directVisualMessageViewerController.contentHolder == null || c45093JxN == null) {
                    return;
                }
                C47677L3k c47677L3k = directVisualMessageViewerController.A0N;
                str2 = "pollTooltipHelper";
                if (c47677L3k != null) {
                    C101394gx A0D = A00.A0D();
                    if (A0D == null || (CG3 = A0D.CG3()) == null || !CG3.booleanValue() || A0D.A0A != null) {
                        return;
                    }
                    UserSession userSession2 = c47677L3k.A04;
                    if (AbstractC166987dD.A0x(userSession2).getBoolean("has_ever_voted_on_direct_poll", false) || AbstractC166987dD.A0x(userSession2).getInt("direct_poll_tooltip_impression_count", 0) >= 2) {
                        return;
                    }
                    C47677L3k c47677L3k2 = directVisualMessageViewerController.A0N;
                    if (c47677L3k2 != null) {
                        L5Y l5y = directVisualMessageViewerController.contentHolder;
                        if (l5y != null) {
                            C4Zp c4Zp = l5y.A0M;
                            User user2 = c45093JxN.A0C;
                            ViewGroup viewGroup = c4Zp.A02;
                            if (c47677L3k2.A02 != null || user2 == null || viewGroup == null) {
                                return;
                            }
                            M62 m62 = new M62(viewGroup, c47677L3k2, user2);
                            c47677L3k2.A02 = m62;
                            viewGroup.post(m62);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public static final void A08(C45093JxN c45093JxN, DirectVisualMessageViewerController directVisualMessageViewerController) {
        C5TA c5ta;
        C5TA c5ta2;
        MusicOverlayStickerModel A05;
        String str;
        if (directVisualMessageViewerController.videoPlayer != null && c45093JxN != null) {
            List list = c45093JxN.A0P;
            C14360o3.A0B(list, 0);
            MusicOverlayStickerModel A052 = AbstractC101614hW.A05(list);
            if (A052 != null && A052.A0t) {
                C49685LxG c49685LxG = directVisualMessageViewerController.videoPlayer;
                if (c49685LxG != null && (c5ta2 = c49685LxG.A05) != null && c5ta2.A0D() && (A05 = AbstractC101614hW.A05(list)) != null && (str = A05.A0j) != null) {
                    C9GR.A09(directVisualMessageViewerController.A0e, str);
                }
                C49685LxG c49685LxG2 = directVisualMessageViewerController.videoPlayer;
                if (c49685LxG2 != null && (c5ta = c49685LxG2.A05) != null) {
                    c5ta.A07.A01(0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r4 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.C45093JxN r23, com.instagram.direct.visual.DirectVisualMessageViewerController r24, int r25, boolean r26) {
        /*
            r2 = r24
            X.LxG r9 = r2.videoPlayer
            if (r9 == 0) goto La8
            X.L5Y r0 = r2.contentHolder
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto Lb4
            X.3o9 r4 = r2.A0x
            r12 = 0
            boolean r1 = r9.A06
            if (r1 != 0) goto La9
            java.lang.ref.WeakReference r1 = r9.A0B
            java.lang.Object r6 = r1.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto La8
            r1 = 1
            r9.A06 = r1
            r14 = r26
            r1 = r26 ^ 1
            r9.A07 = r1
            X.5TA r1 = r9.A05
            if (r1 != 0) goto L3a
            com.instagram.common.session.UserSession r7 = r9.A08
            X.Kal r8 = r9.A09
            java.lang.String r10 = r9.A0A
            X.5TA r5 = new X.5TA
            r5.<init>(r6, r7, r8, r9, r10)
            r9.A05 = r5
            r5.A01()
        L3a:
            com.instagram.ui.widget.textureview.ScalingTextureView r3 = r0.A0V
            android.view.ViewParent r2 = r3.getParent()
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r2 instanceof X.InterfaceC74623Ww
            if (r1 == 0) goto La8
            X.4Ds r17 = X.JRE.A00(r4)
            java.lang.String r22 = X.AbstractC43827JZq.A01(r4)
            r5 = r23
            boolean r1 = r5.A0T
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            java.lang.Long r7 = r5.A0E
            boolean r6 = r5.A0X
            X.1qM r4 = r5.A0A
            X.1tc r1 = r5.A0B
            X.LfZ r15 = new X.LfZ
            r16 = r5
            r18 = r4
            r19 = r1
            r21 = r7
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.5TA r1 = r9.A05
            if (r1 == 0) goto L78
            boolean r4 = r1.A0D()
            r1 = 1
            if (r4 != 0) goto L79
        L78:
            r1 = 0
        L79:
            X.Kap r4 = new X.Kap
            r6 = r25
            r4.<init>(r15, r0, r6, r1)
            r9.A04 = r4
            com.instagram.feed.widget.IgProgressImageView r0 = r0.A0J
            r0.setVisibility(r12)
            r3.setVisibility(r12)
            X.5TA r4 = r9.A05
            java.lang.String r8 = r5.A0H
            X.3a3 r6 = r5.A00()
            r5 = r2
            X.3Ww r5 = (X.InterfaceC74623Ww) r5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r11 = r2.indexOfChild(r3)
            X.Kap r7 = r9.A04
            r10 = 0
            if (r1 == 0) goto La2
            r10 = 1065353216(0x3f800000, float:1.0)
        La2:
            java.lang.String r9 = r9.A0A
            r13 = r12
            r4.A08(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        La8:
            return
        La9:
            r0 = 3873(0xf21, float:5.427E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A09(X.JxN, com.instagram.direct.visual.DirectVisualMessageViewerController, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.1vV, java.lang.Object, X.Lx2] */
    public static final void A0A(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Integer num;
        C45093JxN A01;
        C75363a3 c75363a3;
        UserSession userSession = directVisualMessageViewerController.A0m;
        C42411xV A00 = C42411xV.A00(userSession);
        C14360o3.A07(A00);
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa != null) {
            int i = c47946LGa.A00 + 1;
            int i2 = i + 2;
            int size = c47946LGa.A03.size();
            if (i2 > size) {
                i2 = size;
            }
            while (i < i2) {
                C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
                if (c47946LGa2 != null && (A01 = c47946LGa2.A01(i)) != null) {
                    if (A01.A0Z) {
                        if (directVisualMessageViewerController.A0x instanceof MsysThreadId) {
                            continue;
                        } else {
                            String A06 = A06(directVisualMessageViewerController);
                            String str = A01.A0K;
                            if (str != null) {
                                String str2 = A01.A0G;
                                if (str2 != null) {
                                    ReplaceDirectMessageLoader.A01(userSession, new C49330LrO(A01, directVisualMessageViewerController, i), A06, str, str2);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        C42981yQ A002 = AbstractC42951yN.A00(userSession);
                        String moduleName = directVisualMessageViewerController.A0f.getModuleName();
                        String A012 = A01.A01();
                        if (AbstractC167007dF.A1X(A01.A0B, EnumC40111tc.A0a)) {
                            c75363a3 = A01.A00();
                        } else {
                            c75363a3 = null;
                        }
                        C3ZM c3zm = new C3ZM(null, c75363a3, A012);
                        ?? obj = new Object();
                        obj.A01 = A01;
                        obj.A00 = i;
                        A002.A03(new C9BP(new C43121yf(c3zm, obj), i, 0), moduleName);
                    }
                    i++;
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(317));
                    A1C.append(i);
                    A1C.append(", size is ");
                    C47946LGa c47946LGa3 = directVisualMessageViewerController.A0G;
                    if (c47946LGa3 != null) {
                        num = AbstractC43592JPx.A0s(c47946LGa3.A03);
                    } else {
                        num = null;
                    }
                    throw new IndexOutOfBoundsException(AbstractC166997dE.A0v(num, A1C));
                }
            }
        }
        A00.A0B.Enk(C05F.A00);
    }

    public static final void A0B(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View A01;
        ImageUrl imageUrl;
        C45093JxN A00;
        C101594hU c101594hU;
        C45093JxN A002;
        C57012jc c57012jc = directVisualMessageViewerController.blurImageViewContainerStubHolder;
        if (c57012jc != null && (A01 = c57012jc.A01()) != null) {
            IgImageView A0T = AbstractC167007dF.A0T(A01, R.id.direct_visual_message_blur_image_view);
            C14360o3.A0B(A0T, 0);
            AbstractC158867Ay.A00(A0T, 2);
            C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
            if (c47946LGa != null && (A002 = c47946LGa.A00()) != null) {
                imageUrl = A002.A04;
            } else {
                imageUrl = null;
            }
            if (!AbstractC81033jX.A03(imageUrl)) {
                C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
                if (c47946LGa2 != null && (A00 = c47946LGa2.A00()) != null && (c101594hU = A00.A07) != null) {
                    A0T.A05 = c101594hU.A02;
                }
                if (imageUrl != null) {
                    A0T.setUrl(imageUrl, directVisualMessageViewerController.A0v);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                A0T.A09();
            }
            A01.setForeground(new ColorDrawable(directVisualMessageViewerController.A0e.getColor(R.color.black_50_transparent)));
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A012 = AbstractC125325le.A01(A01, 0);
            A012.A0I(1.0f);
            AbstractC125325le A0A = A012.A0A();
            A0A.A04 = 0;
            A0A.A0H();
        }
    }

    public static final void A0C(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C57012jc c57012jc = directVisualMessageViewerController.blurImageViewContainerStubHolder;
        if (c57012jc != null && c57012jc.A04()) {
            View A01 = c57012jc.A01();
            if (A01 != null) {
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le A00 = AbstractC125325le.A00(A01);
                A00.A0I(0.0f);
                AbstractC125325le A0F = A00.A0F(true);
                A0F.A03 = 8;
                A0F.A0H();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A0D(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Integer num;
        C2EC c2ec;
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa != null && c47946LGa.A03.size() != 0) {
            EnumC40111tc enumC40111tc = c47946LGa.A00().A0B;
            EnumC40111tc enumC40111tc2 = EnumC40111tc.A0a;
            if (enumC40111tc == enumC40111tc2 || enumC40111tc == EnumC40111tc.A0Q) {
                C3o9 c3o9 = directVisualMessageViewerController.A0x;
                boolean z = false;
                if ((c3o9 instanceof MsysThreadId) || ((c2ec = directVisualMessageViewerController.A0n) != null && c2ec.CWO())) {
                    z = true;
                }
                UserSession userSession = directVisualMessageViewerController.A0m;
                C7EA c7ea = new C7EA(userSession, new C7E9(userSession));
                if (enumC40111tc == enumC40111tc2) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0C;
                }
                MRJ A00 = c7ea.A00(directVisualMessageViewerController.A0g, num, C05F.A01, z);
                directVisualMessageViewerController.A0D = A00;
                if (A00 != null) {
                    A00.DfS(JRE.A05(c3o9));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x0716, code lost:
    
        if ((r7 + 3) >= r8.A03.size()) goto L384;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Type inference failed for: r21v6, types: [X.MQ6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v6, types: [X.MQ6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v5, types: [X.MQ6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v6, types: [X.MQ6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v5, types: [X.MQ6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v4, types: [X.MQ6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(com.instagram.direct.visual.DirectVisualMessageViewerController r36) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(com.instagram.direct.visual.DirectVisualMessageViewerController):void");
    }

    public static final void A0F(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C45093JxN c45093JxN;
        C45093JxN c45093JxN2;
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa != null) {
            c45093JxN = c47946LGa.A00();
        } else {
            c45093JxN = null;
        }
        if (directVisualMessageViewerController.A03 != 3 && c45093JxN != null && c45093JxN.A0S) {
            String str = "screenshotDetector";
            if (C18U.A06(C06090Tz.A05, directVisualMessageViewerController.A0m, 36327374555527715L)) {
                C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
                if (c47946LGa2 != null) {
                    c45093JxN2 = c47946LGa2.A00();
                } else {
                    c45093JxN2 = null;
                }
                if (directVisualMessageViewerController.A0R(c45093JxN2)) {
                    C162317Ot A00 = C162317Ot.A02.A00();
                    Window window = directVisualMessageViewerController.A0e.getWindow();
                    if (window != null) {
                        A00.A02(window, "DirectVisualMessageViewerController");
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C3MT c3mt = directVisualMessageViewerController.A08;
                if (c3mt != null) {
                    C3MJ c3mj = directVisualMessageViewerController.A07;
                    if (c3mj != null) {
                        c3mj.A06(c3mt);
                        directVisualMessageViewerController.A08 = null;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            C3MT c3mt2 = directVisualMessageViewerController.A09;
            if (c3mt2 != null) {
                C3MJ c3mj2 = directVisualMessageViewerController.A07;
                if (c3mj2 != null) {
                    c3mj2.A06(c3mt2);
                    directVisualMessageViewerController.A09 = null;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C1NI c1ni = directVisualMessageViewerController.A0L;
            if (c1ni != null) {
                C64352vu c64352vu = directVisualMessageViewerController.A0K;
                str = "impressionTracker";
                if (c64352vu != null) {
                    c64352vu.A03(c1ni, -1);
                    C64352vu c64352vu2 = directVisualMessageViewerController.A0K;
                    if (c64352vu2 != null) {
                        c64352vu2.A02(c1ni, -1);
                        directVisualMessageViewerController.A0L = null;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            MRJ mrj = directVisualMessageViewerController.A0D;
            if (mrj != null) {
                mrj.E0W();
                mrj.DfP();
                directVisualMessageViewerController.A0D = null;
            }
            directVisualMessageViewerController.A03 = 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(com.instagram.direct.visual.DirectVisualMessageViewerController r2) {
        /*
            X.LGa r1 = r2.A0G
            if (r1 == 0) goto L11
            int r0 = r1.A00
            X.JxN r0 = r1.A01(r0)
            if (r0 == 0) goto L11
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 2
        L12:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0H(com.instagram.direct.visual.DirectVisualMessageViewerController):void");
    }

    public static final void A0I(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C45093JxN A01;
        C83403nh BSh;
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa != null) {
            C3o9 c3o9 = directVisualMessageViewerController.A0x;
            if ((c3o9 instanceof DirectThreadKey) && (A01 = c47946LGa.A01(c47946LGa.A00)) != null && directVisualMessageViewerController.A0J != null && (BSh = directVisualMessageViewerController.A0p.BSh(JRE.A01(c3o9), A01.A0K)) != null && directVisualMessageViewerController.A0J != null) {
                UserSession userSession = directVisualMessageViewerController.A0m;
                FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                C1575675q c1575675q = new C1575675q(userSession, BSh, A01.A0I);
                PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = A01.A00;
                PrivacyMediaOverlayViewModel A04 = c1575675q.A04(fragmentActivity, false);
                if (!C14360o3.A0K(privacyMediaOverlayViewModel, A04)) {
                    A01.A00 = A04;
                }
            }
        }
    }

    public static final void A0J(DirectVisualMessageViewerController directVisualMessageViewerController, float f) {
        View view = directVisualMessageViewerController.viewerInfoContainer;
        if (view != null) {
            view.setAlpha(f);
        }
        L5Y l5y = directVisualMessageViewerController.contentHolder;
        if (l5y != null) {
            l5y.A02.setAlpha(f);
        }
        View view2 = directVisualMessageViewerController.replyComposerContainer;
        if (view2 != null || (view2 = directVisualMessageViewerController.selfViewFooterContainer) != null) {
            view2.setAlpha(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0K(com.instagram.direct.visual.DirectVisualMessageViewerController r26, int r27) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0K(com.instagram.direct.visual.DirectVisualMessageViewerController, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (X.C14360o3.A0K(r4, r1) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(com.instagram.direct.visual.DirectVisualMessageViewerController r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0L(com.instagram.direct.visual.DirectVisualMessageViewerController, int, boolean):void");
    }

    public static final void A0N(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        CircularImageView circularImageView = directVisualMessageViewerController.A0A;
        if (circularImageView != null && directVisualMessageViewerController.contentView != null) {
            if (z) {
                circularImageView.setLayerType(2, null);
                View view = directVisualMessageViewerController.contentView;
                if (view != null) {
                    view.setLayerType(2, null);
                    return;
                }
                return;
            }
            circularImageView.setLayerType(0, null);
            View view2 = directVisualMessageViewerController.contentView;
            if (view2 == null) {
                return;
            }
            view2.setLayerType(0, null);
        }
    }

    public static final void A0P(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        if (directVisualMessageViewerController.A0a != z) {
            directVisualMessageViewerController.A0a = z;
            L5Y l5y = directVisualMessageViewerController.contentHolder;
            if (l5y != null) {
                AbstractC84863qa.A08(l5y.A02, z);
            }
        }
    }

    public static final boolean A0Q(Context context, DirectVisualMessageViewerController directVisualMessageViewerController) {
        C7TH A00;
        String A05 = A05(directVisualMessageViewerController);
        if (A05.length() == 0) {
            return false;
        }
        AnonymousClass442 A01 = A01(directVisualMessageViewerController);
        C3o9 c3o9 = directVisualMessageViewerController.A0x;
        if (c3o9 instanceof MsysThreadId) {
            A00 = AbstractC44138Jf3.A00(directVisualMessageViewerController.A0m);
        } else {
            A00 = AbstractC165967bO.A00(directVisualMessageViewerController.A0m);
        }
        A00.EOY(context, null, A01, null, c3o9, null, A05, "toast", null, null, directVisualMessageViewerController.A15, directVisualMessageViewerController.A0W);
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (editText != null) {
            AbstractC31171DnF.A14(editText);
        }
        EditText editText2 = directVisualMessageViewerController.composerEditText;
        if (editText2 != null) {
            editText2.clearFocus();
        }
        AbstractC13880nE.A0O(directVisualMessageViewerController.composerEditText);
        return true;
    }

    public static final boolean A0S(C45093JxN c45093JxN, DirectVisualMessageViewerController directVisualMessageViewerController, User user) {
        C83403nh BSh;
        C3o9 c3o9 = directVisualMessageViewerController.A0x;
        if (c3o9 instanceof MsysThreadId) {
            if (c45093JxN.A0Y && AbstractC001800i.A0u(directVisualMessageViewerController.A18, c45093JxN.A0K)) {
                return false;
            }
        } else {
            String str = c45093JxN.A0K;
            if (str == null) {
                String str2 = c45093JxN.A0G;
                if (str2 == null) {
                    return false;
                }
                BSh = directVisualMessageViewerController.A0p.BSf(JRE.A01(c3o9), C2EY.A0q, str2);
            } else {
                BSh = directVisualMessageViewerController.A0p.BSh(JRE.A01(c3o9), str);
            }
            if (BSh == null) {
                return false;
            }
            BSh.A0h();
            if ("once".equals(BSh.A0k()) && !BSh.A1l(user)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0V(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C45093JxN A01;
        C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
        if (c47946LGa == null || (A01 = c47946LGa.A01(c47946LGa.A00)) == null || A01.A00 == null || directVisualMessageViewerController.A17.contains(c47946LGa.A00().A0I) || directVisualMessageViewerController.A02 != 1) {
            return false;
        }
        if (!"inbox".equals(directVisualMessageViewerController.A12) && c47946LGa.A00 == 0 && c47946LGa.A00().A0W) {
            return false;
        }
        return true;
    }

    @Override // X.C7XU
    public final void DAy() {
        A0X("resume");
    }

    @Override // X.InterfaceC147306kG
    public final /* bridge */ /* synthetic */ void DLd(Object obj) {
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        EditText editText;
        View view = this.replyComposerContainer;
        if (view != null) {
            boolean A1O = AbstractC167007dF.A1O(i);
            this.A0X = A1O;
            C71058WnD c71058WnD = this.A0H;
            if (c71058WnD == null) {
                C14360o3.A0F("directMediaViewerGestureController");
                throw C00O.createAndThrow();
            }
            c71058WnD.A00.A00 = !A1O;
            if (i == 0 && (editText = this.composerEditText) != null) {
                editText.clearFocus();
            }
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0A();
            View view2 = this.itemView;
            if (view2 != null) {
                int paddingBottom = view2.getPaddingBottom() - i;
                if (paddingBottom > 0) {
                    paddingBottom = 0;
                }
                A0A.A0K(paddingBottom);
                A0A.A0H();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbu(Object obj) {
        SegmentedProgressBar segmentedProgressBar = this.progressBar;
        if (segmentedProgressBar != null) {
            segmentedProgressBar.setProgress(0.0f);
        }
        InterfaceC1119053c interfaceC1119053c = this.A0P;
        if (interfaceC1119053c != null) {
            interfaceC1119053c.Dbu(obj);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        boolean z = true;
        if (this.A0c == 1) {
            z = false;
        }
        A0L(this, 8, z);
        return true;
    }

    public static final boolean A0T(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View view;
        if (A02(directVisualMessageViewerController) != null && (!r0.A0Y) && ((view = directVisualMessageViewerController.backgroundDimmer) == null || view.getVisibility() != 0)) {
            return true;
        }
        return false;
    }

    public static final boolean A0U(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C45093JxN A02 = A02(directVisualMessageViewerController);
        if (A02 != null && A02.A0Y) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC149856oe
    public final void DD6(boolean z, String str) {
        C101594hU c101594hU;
        CreativeConfigIntf creativeConfigIntf;
        C45093JxN A02 = A02(this);
        if (A02 != null && (c101594hU = A02.A07) != null && (creativeConfigIntf = c101594hU.A00) != null) {
            c101594hU.A00 = AbstractC121575f6.A02(creativeConfigIntf, z);
        }
    }

    @Override // X.InterfaceC147306kG
    public final /* bridge */ /* synthetic */ void DLb(Object obj, float f) {
    }

    @Override // X.InterfaceC147306kG
    public final /* bridge */ /* synthetic */ void DLc(Object obj, double d) {
    }

    public DirectVisualMessageViewerController(RectF rectF, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EC c2ec, C2DS c2ds, InterfaceC60442pS interfaceC60442pS, InterfaceC1119353f interfaceC1119353f, C3o9 c3o9, ReelViewerConfig reelViewerConfig, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167017dG.A1T(reelViewerConfig, c2ds);
        C14360o3.A0B(list2, 11);
        this.A0m = userSession;
        this.A0f = abstractC59962oe;
        this.A0e = fragmentActivity;
        this.A0w = interfaceC1119353f;
        this.A0y = reelViewerConfig;
        this.A0p = c2ds;
        this.A0x = c3o9;
        this.A0n = c2ec;
        this.A19 = list;
        this.A15 = str;
        this.A1A = list2;
        this.A11 = str2;
        this.A14 = str3;
        this.A13 = str4;
        this.A16 = str5;
        this.A12 = str6;
        this.A0v = interfaceC60442pS;
        this.A0d = rectF;
        this.A0c = i;
        this.A1C = z;
        this.A1F = z2;
        this.A1G = z3;
        this.A1B = z4;
        this.A1D = z5;
        this.A1E = z6;
        this.A0g = interfaceC11380iw;
        this.A0k = new C44288Jhe(this, 14);
        this.A18 = AbstractC166987dD.A1H();
        this.A0u = new C47428KxJ(userSession);
        this.A0z = new C49570LvP(this);
        this.A0t = new C47423KxE(this);
        this.A1H = new C49574LvT(this);
        this.A10 = new C49575LvU(this);
        this.A0h = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        this.A0o = new G5I(userSession);
        this.A0r = new C7KE(fragmentActivity, userSession, new C49336LrU(this), C3G2.A0h);
        this.A0s = new C7DO(userSession, null, null, 2);
        this.A0q = c2ec != null ? AbstractC1578876x.A01(c2ec, c3o9 instanceof MsysThreadId) : null;
        this.A03 = 3;
        this.A0Z = true;
        this.A0l = AbstractC31173DnH.A0S();
        this.A17 = AbstractC166987dD.A1H();
        this.A0j = new JR8(this, 2);
        this.A0i = new C44288Jhe(this, 13);
    }
}
