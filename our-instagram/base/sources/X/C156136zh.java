package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156136zh extends AbstractC60592pi implements InterfaceC149556o7, InterfaceC156146zi, InterfaceC63982vJ {
    public C3G2 A00;
    public AutoLaunchReelParams A01;
    public String A02;
    public List A03;
    public AbstractC140596Xn A04;
    public final Activity A05;
    public final C69613Av A06;
    public final C155306yJ A07;
    public final HighlightsSettingsRepository A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final C156216zq A0B;
    public final UserDetailFragment A0C;
    public final StoryHighlightsTrayManager$Instance A0D;
    public final boolean A0E;
    public final C25671My A0F;
    public final InterfaceC41501vz A0G;
    public final C156096zd A0H;
    public final UserDetailTabController A0I;
    public final UserDetailTabController A0J;
    public final MUB A0K;
    public final C38E A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6zr, java.lang.Object] */
    public C156136zh(C69613Av c69613Av, C155306yJ c155306yJ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C156096zd c156096zd, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, UserDetailTabController userDetailTabController2, MUB mub, AutoLaunchReelParams autoLaunchReelParams, String str, boolean z) {
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(userDetailTabController, 7);
        C14360o3.A0B(c69613Av, 9);
        this.A0C = userDetailFragment;
        this.A07 = c155306yJ;
        this.A0A = userSession;
        this.A09 = interfaceC11380iw;
        this.A0E = z;
        this.A0I = userDetailTabController;
        this.A01 = autoLaunchReelParams;
        this.A06 = c69613Av;
        this.A0H = c156096zd;
        this.A0K = mub;
        this.A0J = userDetailTabController2;
        this.A0M = C08730cb.A00(userSession).A00().A2M();
        this.A0F = AbstractC25651Mw.A00(userSession);
        this.A05 = userDetailFragment.requireActivity();
        this.A0D = C156166zk.A02.A00(userSession, str);
        this.A0L = new C38E(userDetailFragment, userSession, new C38C(userDetailFragment, -1));
        this.A00 = C3G2.A1Y;
        this.A0G = new InterfaceC41501vz() { // from class: X.6zo
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1670329949);
                C140326Wl c140326Wl = (C140326Wl) obj;
                int A032 = C0f9.A03(782404702);
                C14360o3.A0B(c140326Wl, 0);
                Reel reel = c140326Wl.A00;
                if (reel != null) {
                    C156136zh c156136zh = C156136zh.this;
                    if (reel.A15(c156136zh.A0A)) {
                        C155306yJ c155306yJ2 = c156136zh.A07;
                        String id = reel.getId();
                        C14360o3.A07(id);
                        c155306yJ2.A07(id);
                    }
                }
                C0f9.A0A(-114936824, A032);
                C0f9.A0A(1861198558, A03);
            }
        };
        this.A0N = C18U.A06(C06090Tz.A05, userSession, 36322641501563258L);
        C156216zq A00 = AbstractC156206zp.A00(userSession);
        this.A0B = A00;
        this.A08 = AbstractC156236zs.A00(new Object(), userSession);
        c155306yJ.A01 = this;
        C08730cb.A00(userSession).A00().A03.EZX(Boolean.valueOf(A00.A00.getBoolean("my_week_enabled", false)));
    }

    public final void A06(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A0A;
        C14360o3.A0B(userSession, 0);
        C006802i.A0p.markerStart(R.xml.config_webview_packages);
        this.A06.A08(null);
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = this.A0D;
        Context requireContext = this.A0C.requireContext();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36328925038788462L);
        storyHighlightsTrayManager$Instance.A00 = requireContext;
        storyHighlightsTrayManager$Instance.A03 = true;
        Iterator it = storyHighlightsTrayManager$Instance.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC149556o7) it.next()).DKt(true);
        }
        C156166zk c156166zk = storyHighlightsTrayManager$Instance.A09;
        UserSession userSession2 = c156166zk.A00;
        C14360o3.A0B(userSession2, 0);
        if (C18U.A06(c06090Tz, userSession2, 36319978622689154L)) {
            C156186zn c156186zn = storyHighlightsTrayManager$Instance.A05;
            C6r8 c6r8 = C6r8.A00;
            Integer A00 = C156166zk.A00(c156166zk);
            C14360o3.A0B(c6r8, 4);
            C19L c19l = ((C4A7) c156186zn).A01;
            StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1 storyHighlightsRepository$fetchStoriesHighlightsStreaming$1 = new StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1(requireContext, userSession2, c6r8, c156186zn, A00, str, null, true);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, storyHighlightsRepository$fetchStoriesHighlightsStreaming$1, c19l);
            return;
        }
        storyHighlightsTrayManager$Instance.A05.A00(requireContext, userSession2, C6r8.A00, false, Boolean.valueOf(A06), null, C156166zk.A00(c156166zk), str, true);
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC156146zi
    public final boolean CfC(Reel reel) {
        if (this.A02 == null) {
            return false;
        }
        String id = reel.getId();
        C14360o3.A07(id);
        String str = this.A02;
        if (str != null) {
            if (!AbstractC001900j.A0a(id, str, false)) {
                return false;
            }
            this.A02 = null;
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC61272qp
    public final void Co4() {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC156146zi
    public final void DDO() {
        if (!A05(true)) {
            C146106i8 c146106i8 = new C146106i8();
            UserDetailFragment userDetailFragment = this.A0C;
            c146106i8.A0D = userDetailFragment.getString(2131961753);
            c146106i8.A0L = true;
            String string = userDetailFragment.getString(2131961752);
            C14360o3.A07(string);
            c146106i8.A0G = string;
            c146106i8.A0A(new P3E(this));
            c146106i8.A0O = true;
            c146106i8.A06();
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
        }
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC149556o7
    public final void DKu(C3LZ c3lz, List list, boolean z) {
        Integer num;
        C72V c72v;
        View findViewById;
        C14360o3.A0B(list, 2);
        C3NO F7f = c3lz.F7f();
        UserSession userSession = this.A0A;
        C1DS.A00(userSession);
        C74433Vz c74433Vz = F7f.A00;
        if (c74433Vz != null) {
            MUB mub = this.A0K;
            if (mub != null) {
                String moduleName = this.A09.getModuleName();
                C14360o3.A0B(moduleName, 1);
                List BQP = c74433Vz.BQP();
                if (BQP != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = BQP.iterator();
                    while (it.hasNext()) {
                        List Boc = ((InterfaceC74423Vy) it.next()).Boc();
                        if (Boc == null) {
                            Boc = C16930sl.A00;
                        }
                        AnonymousClass016.A16(Boc, arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ExtendedImageUrl BGU = ((InterfaceC74403Vw) it2.next()).BGU();
                        if (BGU != null) {
                            C14M.A05(new C14M());
                            C25821No.A07(new C55954Osm(BGU, mub, moduleName));
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        IGUserHighlightsTrayType iGUserHighlightsTrayType = F7f.A01;
        if (iGUserHighlightsTrayType != null) {
            MUB mub2 = this.A0K;
            if (mub2 != null) {
                mub2.A01 = iGUserHighlightsTrayType;
            }
            this.A0J.A0O.A00();
        }
        boolean z2 = false;
        if (iGUserHighlightsTrayType != IGUserHighlightsTrayType.A07) {
            if (iGUserHighlightsTrayType == IGUserHighlightsTrayType.A04) {
                z2 = true;
            }
            boolean z3 = this.A0E;
            if (z3) {
                this.A0B.A01(C14360o3.A0K(F7f.A07, true));
            }
            C155306yJ c155306yJ = this.A07;
            c155306yJ.A09(z2);
            if (z2) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            UserDetailFragment userDetailFragment = this.A0C;
            View view = userDetailFragment.mView;
            Object obj = null;
            if (view != null && (findViewById = view.findViewById(com.facebook.R.id.highlights_tray)) != null) {
                obj = findViewById.getTag();
            }
            if ((obj instanceof C72V) && (c72v = (C72V) obj) != null) {
                AbstractC1570273h.A00(userDetailFragment.requireContext(), c72v, num);
            }
            if (z3) {
                C0eR c0eR = userDetailFragment.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                C57312k6 A00 = AbstractC57302k5.A00(c0eR);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DJ(this, F7f, list, null, 6, z2), A00);
            }
            c155306yJ.A02 = true;
            A04(list, new C9EY(this, 18), z);
            C14360o3.A0B(userSession, 0);
            C006802i.A0p.markerEnd(R.xml.config_webview_packages, (short) 2);
            long j = c3lz.mServerElapsedTime;
            if (j >= 0) {
                this.A06.A01.A0F("story_highlights_ig_server_request_elapsed_time_ms", (float) j);
            }
            this.A06.A05();
            return;
        }
        C155306yJ c155306yJ2 = this.A07;
        c155306yJ2.A04 = false;
        c155306yJ2.A05();
        c155306yJ2.notifyDataSetChanged();
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC156146zi
    public final void DUx(Reel reel) {
        if (!A05(true)) {
            C189448aO c189448aO = new C189448aO(this.A0A);
            String str = null;
            c189448aO.A0T = null;
            C189478aR A00 = c189448aO.A00();
            Activity activity = this.A05;
            if (reel != null) {
                str = reel.getId();
            }
            C26742BrO c26742BrO = new C26742BrO();
            Bundle bundle = new Bundle();
            bundle.putString("reel_id_tag", str);
            c26742BrO.setArguments(bundle);
            A00.A02(activity, c26742BrO);
            C3DN A002 = C3DN.A00.A00(activity);
            if (A002 != null) {
                ((C3DP) A002).A0H = new C24125AnA(this);
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXf(long j, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXg(long j) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC63982vJ
    public final void Ddi(Reel reel) {
        C14360o3.A0B(reel, 0);
        C155306yJ c155306yJ = this.A07;
        c155306yJ.EcN(AbstractC001800i.A0f(c155306yJ.A04(), reel), false, this.A0A);
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        ArrayList A0U;
        String A00;
        C3G2 c3g2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(c3oo, 3);
        C56537P8j c56537P8j = null;
        if (!A05(AbstractC001900j.A0a(str, "myWeek", false))) {
            UserSession userSession = this.A0A;
            Reel A0M = C1OU.A04(userSession).A0M(str);
            if (A0M == null && (A0M = this.A07.A03(str)) == null) {
                C0w9.A03("ProfileReelTrayController", "Reel is null. Prematurely aborting stories viewer entry.");
                return;
            }
            if (A0M.A0p()) {
                A0U = new ArrayList();
                A0U.add(A0M);
                c56537P8j = new C56537P8j(A0M, this);
                A00 = "tap_reel_suggested_highlights";
            } else {
                A0U = AbstractC001800i.A0U(this.A07.A04());
                A00 = MSV.A00(590);
            }
            this.A0C.A0w(Boolean.valueOf(c3oo instanceof C51374MmZ), A00, str, A0M.A1S);
            if (A0M.A0p()) {
                c3g2 = C3G2.A1a;
            } else {
                c3g2 = C3G2.A1Y;
            }
            this.A00 = c3g2;
            C3G2 c3g22 = C3G2.A1Y;
            C14360o3.A0B(userSession, 0);
            AbstractC69573Ar.A00(userSession).A03(A0M, c3g22, i);
            Reel A03 = this.A07.A03(str);
            ViewParent parent = c3oo.itemView.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            A00((RecyclerView) parent, A03, this.A00, this, c56537P8j, A0U, i);
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A0A;
        Reel A0M = C1OU.A04(userSession).A0M(str);
        if (A0M != null && A0M.A0W != null) {
            Activity activity = this.A05;
            UserDetailFragment userDetailFragment = this.A0C;
            new C55173Odc(activity, userDetailFragment, userDetailFragment, userSession, A0M).A04(new C55850Or0(A0M, this, str), C05F.A01);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    @Override // X.InterfaceC61272qp
    public final boolean Eib(Integer num, int i, int i2) {
        C14360o3.A0B(num, 2);
        return this.A0D.Eib(num, i, i2);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A0D.A01(this, this.A0C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.38E] */
    /* JADX WARN: Type inference failed for: r17v2, types: [X.Psi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Psi] */
    public static final void A00(RecyclerView recyclerView, Reel reel, C3G2 c3g2, C156136zh c156136zh, InterfaceC58058Poj interfaceC58058Poj, List list, int i) {
        C3G2 c3g22;
        AbstractC140596Xn c6x3;
        int i2;
        if (reel == null) {
            C0w9.A03("ProfileReelTrayController", "Reel is null. Prematurely aborting stories viewer entry.");
            return;
        }
        Object A0V = recyclerView.A0V(i);
        C3Ow c3Ow = null;
        if (A0V == null) {
            A0V = null;
        }
        C38H c38h = new C38H();
        c38h.A07 = true;
        ReelViewerConfig reelViewerConfig = new ReelViewerConfig(c38h);
        boolean z = A0V instanceof C51374MmZ;
        if (z) {
            c6x3 = new NSA(c156136zh.A05, recyclerView, c156136zh.A07, c156136zh);
            c156136zh.A04 = c6x3;
        } else {
            Activity activity = c156136zh.A05;
            UserSession userSession = c156136zh.A0A;
            InterfaceC11380iw interfaceC11380iw = c156136zh.A09;
            if (reel.A0p()) {
                c3g22 = C3G2.A1a;
            } else {
                c3g22 = C3G2.A1Y;
            }
            c6x3 = new C6X3(activity, recyclerView, interfaceC11380iw, userSession, c3g22, c156136zh, false);
            c156136zh.A04 = c6x3;
        }
        ?? r14 = c156136zh.A0L;
        r14.A05 = c6x3;
        UserDetailFragment userDetailFragment = c156136zh.A0C;
        r14.A0C = userDetailFragment.A1M.A04;
        r14.A01 = userDetailFragment.A0j();
        r14.A0F = true;
        r14.A03 = reelViewerConfig;
        r14.A06 = interfaceC58058Poj;
        if (reel.A1R) {
            i2 = reel.A03(c156136zh.A0A);
        } else {
            i2 = -1;
        }
        if (z) {
            if (A0V instanceof InterfaceC58290Psi) {
                c3Ow = (InterfaceC58290Psi) A0V;
            }
            r14.A08(reel, c3g2, c3Ow, list, list, i2);
        } else {
            r14.A00 = i2;
            if (A0V instanceof InterfaceC72953Ov) {
                c3Ow = (C3Ow) A0V;
            }
            r14.A06(reel, c3g2, c3Ow, list, list, list);
        }
    }

    public static final void A01(C156136zh c156136zh) {
        c156136zh.A0C.A0x("reel_tray", MSV.A00(464));
        AbstractC50558MTp.A06(c156136zh.A05, EnumC53243Ngg.A09, c156136zh.A0A, true);
    }

    public static final void A02(C156136zh c156136zh) {
        UserSession userSession = c156136zh.A0A;
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(userSession, 0);
        C41121vL A00 = AbstractC41111vK.A00(userSession);
        C14360o3.A07(A00);
        c156136zh.A04(AbstractC001800i.A0U(A00.A00.values()), C152156t0.A00, true);
    }

    public static final void A03(C156136zh c156136zh, String str) {
        String str2;
        C1571673v c1571673v = C1571673v.A00;
        UserSession userSession = c156136zh.A0A;
        InterfaceC11380iw interfaceC11380iw = c156136zh.A09;
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        String str3 = userSession.userId;
        if (c156136zh.A0M) {
            str2 = MSV.A00(448);
        } else {
            str2 = "opt_in";
        }
        c1571673v.A0D(interfaceC11380iw, userSession, enumC1571773w, str, str3, str2, null);
    }

    private final void A04(List list, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        if (this.A0N && list.isEmpty()) {
            return;
        }
        UserSession userSession = this.A0A;
        C01T.A1D(list, Reel.A00(userSession, list));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            linkedHashSet.addAll(this.A07.A04());
        }
        linkedHashSet.addAll(list);
        C155306yJ.A01(null, this.A07, AbstractC001800i.A0a(linkedHashSet), new C154596x9(this, interfaceC16820sZ, z));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324849114821133L) && (z || !C18U.A06(c06090Tz, userSession, 36324849114886670L))) {
            ArrayList arrayList = new ArrayList();
            int A01 = (int) C18U.A01(c06090Tz, userSession, 36606324091655606L);
            int A012 = (int) C18U.A01(c06090Tz, userSession, 36606324091721143L);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                String id = reel.getId();
                C14360o3.A07(id);
                arrayList.add(new C81943lE(C3G5.A0B, id, A01, reel.A03(userSession), -1));
                if (arrayList.size() > A012) {
                    break;
                }
            }
            C3G6.A00(userSession).A0A(this.A09.getModuleName(), null, arrayList);
        }
        this.A0I.A0F();
    }

    private final boolean A05(boolean z) {
        if (z) {
            UserDetailFragment userDetailFragment = this.A0C;
            if (userDetailFragment.A12()) {
                UserSession userSession = this.A0A;
                if (C18U.A06(C06090Tz.A05, userSession, 36322233480325193L)) {
                    userDetailFragment.A0x("reel_tray", "tap_reel_highlights_updates_hub");
                    C140966Yy c140966Yy = new C140966Yy(userDetailFragment.requireActivity(), userSession);
                    c140966Yy.A0D(AbstractC55178Odj.A04(userSession.token));
                    c140966Yy.A0F = true;
                    c140966Yy.A04();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final void AVA() {
        this.A0D.AVA();
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CKt() {
        return this.A0D.A02;
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean CLg() {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLh() {
        return this.A0D.CLh();
    }

    @Override // X.InterfaceC156156zj
    public final void D8A(View view) {
        UserSession userSession = this.A0A;
        if (C18U.A06(C06090Tz.A05, userSession, 36326391008016227L)) {
            Context context = view.getContext();
            C14360o3.A0A(context);
            C8QJ c8qj = new C8QJ(context, userSession, null, false);
            String string = context.getResources().getString(2131974628);
            C14360o3.A07(string);
            C199928sw c199928sw = new C199928sw(null, context.getDrawable(com.facebook.R.drawable.instagram_story_highlight_pano_outline_24), null, new C56407P2u(this), null, string, 0, 0, 0, false, false, false, true, false, false, false);
            String string2 = context.getResources().getString(2131967950);
            C14360o3.A07(string2);
            c8qj.A02(AbstractC16960so.A1Q(c199928sw, new C199928sw(null, context.getDrawable(com.facebook.R.drawable.instagram_music_add_pano_outline_24), null, new C70935Wke(), null, string2, 0, 0, 0, false, false, false, true, false, false, false)));
            c8qj.showAsDropDown(view);
            return;
        }
        A01(this);
    }

    @Override // X.InterfaceC149556o7
    public final void DKr(boolean z) {
        C155306yJ c155306yJ = this.A07;
        if (c155306yJ.A05) {
            c155306yJ.A05 = false;
            c155306yJ.A06();
        }
    }

    @Override // X.InterfaceC149556o7
    public final void DKs(boolean z) {
        MUB mub;
        User user;
        UserSession userSession = this.A0A;
        C14360o3.A0B(userSession, 0);
        C006802i.A0p.markerEnd(R.xml.config_webview_packages, (short) 3);
        if (!C18U.A06(C06090Tz.A05, userSession, 36325201302532984L) || ((mub = this.A0K) != null && (user = mub.A03) != null && AbstractC154816xW.A03(userSession, user))) {
            this.A06.A01();
        } else {
            this.A06.A05();
        }
    }

    @Override // X.InterfaceC149556o7
    public final void DKt(boolean z) {
        C155306yJ c155306yJ = this.A07;
        if (!c155306yJ.A05) {
            c155306yJ.A05 = true;
            c155306yJ.A06();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        this.A0F.A01(this.A0G, C140326Wl.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A0F.A02(this.A0G, C140326Wl.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        List list = this.A03;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A0C.requireView().getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) it.next());
            }
        }
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = this.A0D;
        java.util.Set set = storyHighlightsTrayManager$Instance.A06;
        set.remove(this);
        if (set.isEmpty()) {
            storyHighlightsTrayManager$Instance.A00 = null;
        }
        this.A03 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        String str;
        if (this.A0E) {
            ArrayList A05 = C25A.A00(this.A0A).A05(C05F.A0N);
            C155306yJ c155306yJ = this.A07;
            Object obj = null;
            c155306yJ.A00 = null;
            if (!A05.isEmpty()) {
                Iterator it = A05.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j = ((C47Z) obj).A0e;
                        do {
                            Object next = it.next();
                            long j2 = ((C47Z) next).A0e;
                            if (j < j2) {
                                obj = next;
                                j = j2;
                            }
                        } while (it.hasNext());
                    }
                }
                C47Z c47z = (C47Z) obj;
                if (c47z != null) {
                    C188538Ws c188538Ws = c47z.A1Y;
                    if (c188538Ws == null || (str = c188538Ws.A00) == null) {
                        str = "myWeek";
                    }
                    this.A02 = str;
                    Bitmap decodeFile = BitmapFactory.decodeFile(c47z.A33);
                    String str2 = this.A02;
                    if (str2 != null && AbstractC001900j.A0a(str2, "myWeek", false) && decodeFile != null) {
                        c155306yJ.A00 = decodeFile;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new PNS(this), 3000L);
                }
            } else {
                this.A0C.A13();
            }
            A02(this);
            return;
        }
        this.A07.A06();
    }
}
