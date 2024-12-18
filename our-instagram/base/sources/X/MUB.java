package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public final class MUB extends AbstractC52922bZ {
    public int A00;
    public IGUserHighlightsTrayType A01;
    public User A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A0A;
    public final UserDetailLaunchConfig A0B;
    public final InterfaceC09390do A0E;
    public final C2GS A09 = new C2GT(MVB.A00);
    public final C05A A0F = C10E.A00(null);
    public boolean A08 = true;
    public String A04 = "";
    public final C1M0 A0C = C1M3.A00();
    public final InterfaceC09390do A0D = AbstractC09440dt.A01(new GSv(this, 16));
    public C17Q A02 = C17Q.A08;

    public final String A02() {
        User user = this.A03;
        if (user != null) {
            return user.getId();
        }
        String str = this.A0B.A0O;
        if (str != null) {
            return str;
        }
        return "INVALID_USER_ID";
    }

    public final String A03() {
        User user = this.A03;
        if (user != null) {
            return user.getUsername();
        }
        String str = this.A0B.A0P;
        if (str != null) {
            return str;
        }
        return "INVALID_USER_NAME";
    }

    public final void A04() {
        long j;
        User user = this.A03;
        if (user != null) {
            UserSession userSession = this.A0A;
            C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
            if (C18U.A06(A0j, userSession, 36325081045414607L) && AbstractC166997dE.A1Z(user.A03.BBm(), false)) {
                return;
            }
            C1566571n c1566571n = new C1566571n(user.getId());
            if (AbstractC31171DnF.A1W(userSession, user.getId())) {
                j = 36325081043120825L;
            } else {
                j = 36325081044169411L;
            }
            if (!C18U.A06(A0j, userSession, j)) {
                return;
            }
            if (user.A0M() == C05F.A0C && !user.A26() && !A02().equals(userSession.userId)) {
                return;
            }
            if (this.A05 && ((NSM) this.A0D.getValue()).A01.A00(c1566571n) != null) {
                return;
            }
            this.A0F.Egh(((NSM) this.A0D.getValue()).A01.A00(c1566571n));
            AbstractC166987dD.A1Z(new C57165PZj(this, c1566571n, (InterfaceC23621Ds) null, 16), AbstractC141776au.A00(this));
        }
    }

    public final void A05(Context context, Context context2, InterfaceC11380iw interfaceC11380iw, EnumC125775mS enumC125775mS, UserDetailTabController userDetailTabController, String str, String str2, List list, boolean z) {
        EnumC125765mR enumC125765mR;
        int A09;
        Context context3;
        AbstractC167017dG.A1O(userDetailTabController, list);
        AbstractC167007dF.A1H(enumC125775mS, 4, str2);
        LinkedList linkedList = new LinkedList();
        if (enumC125775mS == EnumC125775mS.A06) {
            enumC125765mR = EnumC125765mR.A09;
        } else if (enumC125775mS == EnumC125775mS.A09) {
            enumC125765mR = EnumC125765mR.A0B;
        } else if (enumC125775mS == EnumC125775mS.A04) {
            enumC125765mR = EnumC125765mR.A08;
        } else if (enumC125775mS == EnumC125775mS.A0A) {
            enumC125765mR = EnumC125765mR.A0C;
        } else {
            return;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C38321qM c38321qM = (C38321qM) list.get(i2);
            if (i >= 3) {
                i = 0;
            }
            if (z) {
                A09 = i2 / 3;
            } else {
                A09 = userDetailTabController.A09(enumC125765mR.A00, c38321qM.getId());
            }
            if (context == null) {
                if (context2 != null) {
                    context3 = context2;
                }
            } else {
                context3 = context;
            }
            linkedList.add(new C9BP(AbstractC153326v1.A00(context3, interfaceC11380iw, this.A0A, c38321qM, enumC125765mR, str2, A09, i), A09, i));
            i++;
        }
        C42981yQ A00 = AbstractC42951yN.A00(this.A0A);
        if (z) {
            A00.A06(str, linkedList);
        } else {
            A00.A05(str, linkedList);
        }
    }

    public final void A06(final UserSession userSession, C1GL c1gl, MV1 mv1, final C53M c53m, final C37494GfC c37494GfC, final AnonymousClass700 anonymousClass700, String str, String str2, boolean z, boolean z2) {
        AnonymousClass706 c52686NSr;
        int i;
        AbstractC167007dF.A1H(c37494GfC, 4, str);
        if (Systrace.A0E(1L)) {
            C0fO.A01("UserDetailViewModel.startUserInfoFetch", -1183771704);
        }
        try {
            C2ZI c2zi = C2ZI.A00;
            InterfaceC09390do interfaceC09390do = mv1.A01;
            c2zi.A0C("profile", "user_info_request_strategy", ((AnonymousClass701) interfaceC09390do.getValue()).name());
            C2ZI.A00.A0E("profile", "user_info_prefetched", z2);
            if (z2 && C18U.A06(C06090Tz.A05, userSession, 36327597894089431L)) {
                final C1P1 c1p1 = new C1P1(c53m, c37494GfC, anonymousClass700) { // from class: X.702
                    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(AnonymousClass702.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
                    public int A00;
                    public int A01;
                    public final C37494GfC A02;
                    public final AnonymousClass700 A03;
                    public final InterfaceC16130rD A04;

                    private final C53M A00() {
                        return (C53M) this.A04.CES(this, A05[0]);
                    }

                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        int i2;
                        int A03 = C0f9.A03(-1616605628);
                        C2045893s c2045893s = (C2045893s) obj;
                        int A032 = C0f9.A03(-146085892);
                        C14360o3.A0B(c2045893s, 0);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailRequestCallback.onSuccess", 1870436538);
                        }
                        try {
                            this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_flush", this.A01));
                            this.A01++;
                            C53M A00 = A00();
                            if (A00 != null && A00.isValid()) {
                                C53M A002 = A00();
                                if (A002 != null) {
                                    A002.EWZ(false);
                                }
                                User A003 = C72W.A00(c2045893s);
                                if (A003 != null) {
                                    C53M A004 = A00();
                                    if (A004 != null) {
                                        A004.DyF(new C72X(this.A03.A03), A003, C72W.A01(c2045893s), c2045893s.mServerElapsedTime, c2045893s.CR4());
                                    }
                                    C53M A005 = A00();
                                    if (A005 != null) {
                                        A005.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                                    }
                                } else {
                                    C53M A006 = A00();
                                    if (A006 != null) {
                                        A006.DGu(false, true, MSV.A00(368));
                                    }
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-1278139061);
                                }
                                i2 = -1900763014;
                            } else {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(1938005707);
                                }
                                i2 = -1876936995;
                            }
                            C0f9.A0A(i2, A032);
                            C0f9.A0A(1605952138, A03);
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-249840448);
                            }
                            C0f9.A0A(-1589886429, A032);
                            throw th;
                        }
                    }

                    {
                        this.A03 = anonymousClass700;
                        this.A02 = c37494GfC;
                        final WeakReference weakReference = new WeakReference(c53m);
                        this.A04 = new InterfaceC16130rD() { // from class: X.703
                            @Override // X.InterfaceC16130rD
                            public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
                                return weakReference.get();
                            }
                        };
                    }

                    @Override // X.C1P1
                    public final void onFail(AbstractC115105If abstractC115105If) {
                        int i2;
                        String str3;
                        C2045893s c2045893s;
                        int A03 = C0f9.A03(-1740016749);
                        C14360o3.A0B(abstractC115105If, 0);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailRequestCallback.onFail", 524101976);
                        }
                        try {
                            C53M A00 = A00();
                            if (A00 != null) {
                                A00.CmM();
                            }
                            C53M A002 = A00();
                            boolean z3 = false;
                            if (A002 != null && A002.isValid()) {
                                C53M A003 = A00();
                                if (A003 != null) {
                                    A003.EWZ(false);
                                }
                                boolean z4 = abstractC115105If instanceof C115115Ig;
                                if (!z4 || ((c2045893s = (C2045893s) ((C115115Ig) abstractC115105If).A00) != null && c2045893s.getStatusCode() == 404)) {
                                    z3 = true;
                                }
                                C53M A004 = A00();
                                if (A004 != null) {
                                    Throwable A01 = abstractC115105If.A01();
                                    if (A01 != null) {
                                        str3 = A01.getMessage();
                                    } else {
                                        str3 = null;
                                    }
                                    A004.DGu(z4, z3, str3);
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(830686245);
                                }
                                i2 = 332438052;
                            } else {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(2037986134);
                                }
                                i2 = -514411380;
                            }
                            C0f9.A0A(i2, A03);
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1491355620);
                            }
                            C0f9.A0A(-1428257078, A03);
                            throw th;
                        }
                    }

                    @Override // X.C1P1
                    public final void onFinish() {
                        int A03 = C0f9.A03(-264816045);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailRequestCallback.onFinish", 460619922);
                        }
                        try {
                            this.A02.A0E("fetch_user_network_end");
                            C53M A00 = A00();
                            if (A00 != null) {
                                A00.Dxm();
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-525768550);
                            }
                            C0f9.A0A(-1444420828, A03);
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1846925229);
                            }
                            C0f9.A0A(-471797819, A03);
                            throw th;
                        }
                    }

                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                        int A03 = C0f9.A03(1062193399);
                        int A032 = C0f9.A03(1004494501);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailRequestCallback.onSuccessInBackground", 1006272634);
                        }
                        try {
                            this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_bg_flush", this.A00));
                            this.A00++;
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(904819173);
                            }
                            C0f9.A0A(-1444504616, A032);
                            C0f9.A0A(512463556, A03);
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(1564610577);
                            }
                            C0f9.A0A(-236284751, A032);
                            throw th;
                        }
                    }
                };
                InterfaceC24551Hy interfaceC24551Hy = new InterfaceC24551Hy(c1p1, userSession) { // from class: X.704
                    public boolean A00;
                    public final C1P1 A01;
                    public final UserSession A02;

                    @Override // X.InterfaceC24551Hy
                    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                        C14360o3.A0B(abstractC115105If, 1);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailStreamingCallback.onFailed", -1044940199);
                        }
                        try {
                            this.A01.onFail(abstractC115105If);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-905878740);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(692882616);
                            }
                            throw th;
                        }
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* synthetic */ void DVR() {
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                        C14360o3.A0B(interfaceC40801un, 2);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailStreamingCallback.onNewDataInBackground", 110551065);
                        }
                        try {
                            this.A01.onSuccessInBackground(interfaceC40801un);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1676672862);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1770783410);
                            }
                            throw th;
                        }
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* synthetic */ void Dg4() {
                    }

                    @Override // X.InterfaceC24551Hy
                    public final void DgK() {
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    }

                    @Override // X.InterfaceC24551Hy
                    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailStreamingCallback.onComplete", -1467509814);
                        }
                        try {
                            this.A01.onFinish();
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-253840619);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1412573538);
                            }
                            throw th;
                        }
                    }

                    @Override // X.InterfaceC24551Hy
                    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                        C3DB c3db = (C3DB) interfaceC40801un;
                        C14360o3.A0B(c3db, 2);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("UserDetailStreamingCallback.onNewData", 329667797);
                        }
                        try {
                            this.A01.onSuccess(c3db);
                            User A00 = C72W.A00(c3db);
                            if (A00 != null && !this.A00) {
                                this.A00 = true;
                                C5K5.A00(this.A02).EPB(A00.A0I(), A00.getId());
                            }
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(-1465815973);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(296439779);
                            }
                            throw th;
                        }
                    }

                    {
                        this.A01 = c1p1;
                        this.A02 = userSession;
                    }
                };
                EnumC2045493n enumC2045493n = EnumC2045493n.A0D;
                AbstractC2044993i.A01(enumC2045493n, A02());
                boolean A0C = AbstractC2044993i.A00(userSession).A0C(interfaceC24551Hy, c1gl, enumC2045493n, A02());
                C2ZI.A00.A0E("profile", "user_info_prefetch_was_successful", A0C);
                if (A0C) {
                    if (Systrace.A0E(1L)) {
                        i = 1991063901;
                        C0fO.A00(i);
                    }
                    return;
                }
            }
            C5K8 A00 = C5K5.A00(userSession);
            int ordinal = ((AnonymousClass701) interfaceC09390do.getValue()).ordinal();
            if (ordinal != 3) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal != 0) {
                            c52686NSr = new C52684NSp(new C1P1(c53m, c37494GfC, anonymousClass700) { // from class: X.702
                                public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(AnonymousClass702.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
                                public int A00;
                                public int A01;
                                public final C37494GfC A02;
                                public final AnonymousClass700 A03;
                                public final InterfaceC16130rD A04;

                                private final C53M A00() {
                                    return (C53M) this.A04.CES(this, A05[0]);
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                    int i2;
                                    int A03 = C0f9.A03(-1616605628);
                                    C2045893s c2045893s = (C2045893s) obj;
                                    int A032 = C0f9.A03(-146085892);
                                    C14360o3.A0B(c2045893s, 0);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onSuccess", 1870436538);
                                    }
                                    try {
                                        this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_flush", this.A01));
                                        this.A01++;
                                        C53M A002 = A00();
                                        if (A002 != null && A002.isValid()) {
                                            C53M A0022 = A00();
                                            if (A0022 != null) {
                                                A0022.EWZ(false);
                                            }
                                            User A003 = C72W.A00(c2045893s);
                                            if (A003 != null) {
                                                C53M A004 = A00();
                                                if (A004 != null) {
                                                    A004.DyF(new C72X(this.A03.A03), A003, C72W.A01(c2045893s), c2045893s.mServerElapsedTime, c2045893s.CR4());
                                                }
                                                C53M A005 = A00();
                                                if (A005 != null) {
                                                    A005.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                                                }
                                            } else {
                                                C53M A006 = A00();
                                                if (A006 != null) {
                                                    A006.DGu(false, true, MSV.A00(368));
                                                }
                                            }
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(-1278139061);
                                            }
                                            i2 = -1900763014;
                                        } else {
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(1938005707);
                                            }
                                            i2 = -1876936995;
                                        }
                                        C0f9.A0A(i2, A032);
                                        C0f9.A0A(1605952138, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-249840448);
                                        }
                                        C0f9.A0A(-1589886429, A032);
                                        throw th;
                                    }
                                }

                                {
                                    this.A03 = anonymousClass700;
                                    this.A02 = c37494GfC;
                                    final WeakReference weakReference = new WeakReference(c53m);
                                    this.A04 = new InterfaceC16130rD() { // from class: X.703
                                        @Override // X.InterfaceC16130rD
                                        public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
                                            return weakReference.get();
                                        }
                                    };
                                }

                                @Override // X.C1P1
                                public final void onFail(AbstractC115105If abstractC115105If) {
                                    int i2;
                                    String str3;
                                    C2045893s c2045893s;
                                    int A03 = C0f9.A03(-1740016749);
                                    C14360o3.A0B(abstractC115105If, 0);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onFail", 524101976);
                                    }
                                    try {
                                        C53M A002 = A00();
                                        if (A002 != null) {
                                            A002.CmM();
                                        }
                                        C53M A0022 = A00();
                                        boolean z3 = false;
                                        if (A0022 != null && A0022.isValid()) {
                                            C53M A003 = A00();
                                            if (A003 != null) {
                                                A003.EWZ(false);
                                            }
                                            boolean z4 = abstractC115105If instanceof C115115Ig;
                                            if (!z4 || ((c2045893s = (C2045893s) ((C115115Ig) abstractC115105If).A00) != null && c2045893s.getStatusCode() == 404)) {
                                                z3 = true;
                                            }
                                            C53M A004 = A00();
                                            if (A004 != null) {
                                                Throwable A01 = abstractC115105If.A01();
                                                if (A01 != null) {
                                                    str3 = A01.getMessage();
                                                } else {
                                                    str3 = null;
                                                }
                                                A004.DGu(z4, z3, str3);
                                            }
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(830686245);
                                            }
                                            i2 = 332438052;
                                        } else {
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(2037986134);
                                            }
                                            i2 = -514411380;
                                        }
                                        C0f9.A0A(i2, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-1491355620);
                                        }
                                        C0f9.A0A(-1428257078, A03);
                                        throw th;
                                    }
                                }

                                @Override // X.C1P1
                                public final void onFinish() {
                                    int A03 = C0f9.A03(-264816045);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onFinish", 460619922);
                                    }
                                    try {
                                        this.A02.A0E("fetch_user_network_end");
                                        C53M A002 = A00();
                                        if (A002 != null) {
                                            A002.Dxm();
                                        }
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-525768550);
                                        }
                                        C0f9.A0A(-1444420828, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-1846925229);
                                        }
                                        C0f9.A0A(-471797819, A03);
                                        throw th;
                                    }
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                                    int A03 = C0f9.A03(1062193399);
                                    int A032 = C0f9.A03(1004494501);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onSuccessInBackground", 1006272634);
                                    }
                                    try {
                                        this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_bg_flush", this.A00));
                                        this.A00++;
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(904819173);
                                        }
                                        C0f9.A0A(-1444504616, A032);
                                        C0f9.A0A(512463556, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(1564610577);
                                        }
                                        C0f9.A0A(-236284751, A032);
                                        throw th;
                                    }
                                }
                            }, c1gl, A00);
                        } else {
                            c52686NSr = new C52684NSp(new C1P1(c53m, c37494GfC, anonymousClass700) { // from class: X.702
                                public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(AnonymousClass702.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
                                public int A00;
                                public int A01;
                                public final C37494GfC A02;
                                public final AnonymousClass700 A03;
                                public final InterfaceC16130rD A04;

                                private final C53M A00() {
                                    return (C53M) this.A04.CES(this, A05[0]);
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                    int i2;
                                    int A03 = C0f9.A03(-1616605628);
                                    C2045893s c2045893s = (C2045893s) obj;
                                    int A032 = C0f9.A03(-146085892);
                                    C14360o3.A0B(c2045893s, 0);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onSuccess", 1870436538);
                                    }
                                    try {
                                        this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_flush", this.A01));
                                        this.A01++;
                                        C53M A002 = A00();
                                        if (A002 != null && A002.isValid()) {
                                            C53M A0022 = A00();
                                            if (A0022 != null) {
                                                A0022.EWZ(false);
                                            }
                                            User A003 = C72W.A00(c2045893s);
                                            if (A003 != null) {
                                                C53M A004 = A00();
                                                if (A004 != null) {
                                                    A004.DyF(new C72X(this.A03.A03), A003, C72W.A01(c2045893s), c2045893s.mServerElapsedTime, c2045893s.CR4());
                                                }
                                                C53M A005 = A00();
                                                if (A005 != null) {
                                                    A005.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                                                }
                                            } else {
                                                C53M A006 = A00();
                                                if (A006 != null) {
                                                    A006.DGu(false, true, MSV.A00(368));
                                                }
                                            }
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(-1278139061);
                                            }
                                            i2 = -1900763014;
                                        } else {
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(1938005707);
                                            }
                                            i2 = -1876936995;
                                        }
                                        C0f9.A0A(i2, A032);
                                        C0f9.A0A(1605952138, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-249840448);
                                        }
                                        C0f9.A0A(-1589886429, A032);
                                        throw th;
                                    }
                                }

                                {
                                    this.A03 = anonymousClass700;
                                    this.A02 = c37494GfC;
                                    final WeakReference weakReference = new WeakReference(c53m);
                                    this.A04 = new InterfaceC16130rD() { // from class: X.703
                                        @Override // X.InterfaceC16130rD
                                        public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
                                            return weakReference.get();
                                        }
                                    };
                                }

                                @Override // X.C1P1
                                public final void onFail(AbstractC115105If abstractC115105If) {
                                    int i2;
                                    String str3;
                                    C2045893s c2045893s;
                                    int A03 = C0f9.A03(-1740016749);
                                    C14360o3.A0B(abstractC115105If, 0);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onFail", 524101976);
                                    }
                                    try {
                                        C53M A002 = A00();
                                        if (A002 != null) {
                                            A002.CmM();
                                        }
                                        C53M A0022 = A00();
                                        boolean z3 = false;
                                        if (A0022 != null && A0022.isValid()) {
                                            C53M A003 = A00();
                                            if (A003 != null) {
                                                A003.EWZ(false);
                                            }
                                            boolean z4 = abstractC115105If instanceof C115115Ig;
                                            if (!z4 || ((c2045893s = (C2045893s) ((C115115Ig) abstractC115105If).A00) != null && c2045893s.getStatusCode() == 404)) {
                                                z3 = true;
                                            }
                                            C53M A004 = A00();
                                            if (A004 != null) {
                                                Throwable A01 = abstractC115105If.A01();
                                                if (A01 != null) {
                                                    str3 = A01.getMessage();
                                                } else {
                                                    str3 = null;
                                                }
                                                A004.DGu(z4, z3, str3);
                                            }
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(830686245);
                                            }
                                            i2 = 332438052;
                                        } else {
                                            if (Systrace.A0E(1L)) {
                                                C0fO.A00(2037986134);
                                            }
                                            i2 = -514411380;
                                        }
                                        C0f9.A0A(i2, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-1491355620);
                                        }
                                        C0f9.A0A(-1428257078, A03);
                                        throw th;
                                    }
                                }

                                @Override // X.C1P1
                                public final void onFinish() {
                                    int A03 = C0f9.A03(-264816045);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onFinish", 460619922);
                                    }
                                    try {
                                        this.A02.A0E("fetch_user_network_end");
                                        C53M A002 = A00();
                                        if (A002 != null) {
                                            A002.Dxm();
                                        }
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-525768550);
                                        }
                                        C0f9.A0A(-1444420828, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-1846925229);
                                        }
                                        C0f9.A0A(-471797819, A03);
                                        throw th;
                                    }
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                                    int A03 = C0f9.A03(1062193399);
                                    int A032 = C0f9.A03(1004494501);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A01("UserDetailRequestCallback.onSuccessInBackground", 1006272634);
                                    }
                                    try {
                                        this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_bg_flush", this.A00));
                                        this.A00++;
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(904819173);
                                        }
                                        C0f9.A0A(-1444504616, A032);
                                        C0f9.A0A(512463556, A03);
                                    } catch (Throwable th) {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(1564610577);
                                        }
                                        C0f9.A0A(-236284751, A032);
                                        throw th;
                                    }
                                }
                            }, c1gl, A00);
                        }
                    } else {
                        final C1P1 c1p12 = new C1P1(c53m, c37494GfC, anonymousClass700) { // from class: X.702
                            public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass019(AnonymousClass702.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
                            public int A00;
                            public int A01;
                            public final C37494GfC A02;
                            public final AnonymousClass700 A03;
                            public final InterfaceC16130rD A04;

                            private final C53M A00() {
                                return (C53M) this.A04.CES(this, A05[0]);
                            }

                            @Override // X.C1P1
                            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                int i2;
                                int A03 = C0f9.A03(-1616605628);
                                C2045893s c2045893s = (C2045893s) obj;
                                int A032 = C0f9.A03(-146085892);
                                C14360o3.A0B(c2045893s, 0);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailRequestCallback.onSuccess", 1870436538);
                                }
                                try {
                                    this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_flush", this.A01));
                                    this.A01++;
                                    C53M A002 = A00();
                                    if (A002 != null && A002.isValid()) {
                                        C53M A0022 = A00();
                                        if (A0022 != null) {
                                            A0022.EWZ(false);
                                        }
                                        User A003 = C72W.A00(c2045893s);
                                        if (A003 != null) {
                                            C53M A004 = A00();
                                            if (A004 != null) {
                                                A004.DyF(new C72X(this.A03.A03), A003, C72W.A01(c2045893s), c2045893s.mServerElapsedTime, c2045893s.CR4());
                                            }
                                            C53M A005 = A00();
                                            if (A005 != null) {
                                                A005.EcE(((InterfaceC128135qh) c2045893s.F7f()).BlD());
                                            }
                                        } else {
                                            C53M A006 = A00();
                                            if (A006 != null) {
                                                A006.DGu(false, true, MSV.A00(368));
                                            }
                                        }
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(-1278139061);
                                        }
                                        i2 = -1900763014;
                                    } else {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(1938005707);
                                        }
                                        i2 = -1876936995;
                                    }
                                    C0f9.A0A(i2, A032);
                                    C0f9.A0A(1605952138, A03);
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-249840448);
                                    }
                                    C0f9.A0A(-1589886429, A032);
                                    throw th;
                                }
                            }

                            {
                                this.A03 = anonymousClass700;
                                this.A02 = c37494GfC;
                                final WeakReference weakReference = new WeakReference(c53m);
                                this.A04 = new InterfaceC16130rD() { // from class: X.703
                                    @Override // X.InterfaceC16130rD
                                    public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
                                        return weakReference.get();
                                    }
                                };
                            }

                            @Override // X.C1P1
                            public final void onFail(AbstractC115105If abstractC115105If) {
                                int i2;
                                String str3;
                                C2045893s c2045893s;
                                int A03 = C0f9.A03(-1740016749);
                                C14360o3.A0B(abstractC115105If, 0);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailRequestCallback.onFail", 524101976);
                                }
                                try {
                                    C53M A002 = A00();
                                    if (A002 != null) {
                                        A002.CmM();
                                    }
                                    C53M A0022 = A00();
                                    boolean z3 = false;
                                    if (A0022 != null && A0022.isValid()) {
                                        C53M A003 = A00();
                                        if (A003 != null) {
                                            A003.EWZ(false);
                                        }
                                        boolean z4 = abstractC115105If instanceof C115115Ig;
                                        if (!z4 || ((c2045893s = (C2045893s) ((C115115Ig) abstractC115105If).A00) != null && c2045893s.getStatusCode() == 404)) {
                                            z3 = true;
                                        }
                                        C53M A004 = A00();
                                        if (A004 != null) {
                                            Throwable A01 = abstractC115105If.A01();
                                            if (A01 != null) {
                                                str3 = A01.getMessage();
                                            } else {
                                                str3 = null;
                                            }
                                            A004.DGu(z4, z3, str3);
                                        }
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(830686245);
                                        }
                                        i2 = 332438052;
                                    } else {
                                        if (Systrace.A0E(1L)) {
                                            C0fO.A00(2037986134);
                                        }
                                        i2 = -514411380;
                                    }
                                    C0f9.A0A(i2, A03);
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1491355620);
                                    }
                                    C0f9.A0A(-1428257078, A03);
                                    throw th;
                                }
                            }

                            @Override // X.C1P1
                            public final void onFinish() {
                                int A03 = C0f9.A03(-264816045);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailRequestCallback.onFinish", 460619922);
                                }
                                try {
                                    this.A02.A0E("fetch_user_network_end");
                                    C53M A002 = A00();
                                    if (A002 != null) {
                                        A002.Dxm();
                                    }
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-525768550);
                                    }
                                    C0f9.A0A(-1444420828, A03);
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1846925229);
                                    }
                                    C0f9.A0A(-471797819, A03);
                                    throw th;
                                }
                            }

                            @Override // X.C1P1
                            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                                int A03 = C0f9.A03(1062193399);
                                int A032 = C0f9.A03(1004494501);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailRequestCallback.onSuccessInBackground", 1006272634);
                                }
                                try {
                                    this.A02.A0E(AnonymousClass001.A0O("fetch_user_on_data_bg_flush", this.A00));
                                    this.A00++;
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(904819173);
                                    }
                                    C0f9.A0A(-1444504616, A032);
                                    C0f9.A0A(512463556, A03);
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(1564610577);
                                    }
                                    C0f9.A0A(-236284751, A032);
                                    throw th;
                                }
                            }
                        };
                        c52686NSr = new AnonymousClass705(c1p12, new InterfaceC24551Hy(c1p12, userSession) { // from class: X.704
                            public boolean A00;
                            public final C1P1 A01;
                            public final UserSession A02;

                            @Override // X.InterfaceC24551Hy
                            public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                                C14360o3.A0B(abstractC115105If, 1);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailStreamingCallback.onFailed", -1044940199);
                                }
                                try {
                                    this.A01.onFail(abstractC115105If);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-905878740);
                                    }
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(692882616);
                                    }
                                    throw th;
                                }
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* synthetic */ void DVR() {
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                                C14360o3.A0B(interfaceC40801un, 2);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailStreamingCallback.onNewDataInBackground", 110551065);
                                }
                                try {
                                    this.A01.onSuccessInBackground(interfaceC40801un);
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1676672862);
                                    }
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1770783410);
                                    }
                                    throw th;
                                }
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* synthetic */ void Dg4() {
                            }

                            @Override // X.InterfaceC24551Hy
                            public final void DgK() {
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                            }

                            @Override // X.InterfaceC24551Hy
                            public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailStreamingCallback.onComplete", -1467509814);
                                }
                                try {
                                    this.A01.onFinish();
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-253840619);
                                    }
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1412573538);
                                    }
                                    throw th;
                                }
                            }

                            @Override // X.InterfaceC24551Hy
                            public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                                C3DB c3db = (C3DB) interfaceC40801un;
                                C14360o3.A0B(c3db, 2);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("UserDetailStreamingCallback.onNewData", 329667797);
                                }
                                try {
                                    this.A01.onSuccess(c3db);
                                    User A002 = C72W.A00(c3db);
                                    if (A002 != null && !this.A00) {
                                        this.A00 = true;
                                        C5K5.A00(this.A02).EPB(A002.A0I(), A002.getId());
                                    }
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(-1465815973);
                                    }
                                } catch (Throwable th) {
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(296439779);
                                    }
                                    throw th;
                                }
                            }

                            {
                                this.A01 = c1p12;
                                this.A02 = userSession;
                            }
                        }, c1gl, A00);
                    }
                } else {
                    c52686NSr = new C52685NSq(C1DS.A00(userSession), new NAE(C1DS.A00(userSession), c53m, c37494GfC, anonymousClass700), c1gl, A00);
                }
            } else {
                c52686NSr = new C52686NSr(new C55815OqQ(C1DS.A00(userSession), userSession, c53m, c37494GfC, anonymousClass700, A00(this)), new NAE(C1DS.A00(userSession), c53m, c37494GfC, anonymousClass700), c1gl, A00);
            }
            c53m.EWZ(true);
            c37494GfC.A04.A04();
            c37494GfC.A03.A04();
            c37494GfC.A08.A04();
            c37494GfC.A06.A04();
            boolean A1N = AbstractC167007dF.A1N(z ? 1 : 0);
            int i2 = ((AbstractC69603Au) c37494GfC).A00;
            this.A09.A0B(AnonymousClass707.A00);
            ((MV2) this.A0E.getValue()).A03(c52686NSr, anonymousClass700, A00(this), str, str2, i2, A1N);
            if (Systrace.A0E(1L)) {
                i = -1351447583;
                C0fO.A00(i);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(79578644);
            }
            throw th;
        }
    }

    public final boolean A07() {
        EnumC2045493n enumC2045493n;
        MV2 mv2 = (MV2) this.A0E.getValue();
        String A02 = A02();
        C14360o3.A0B(A02, 0);
        boolean z = mv2.A05;
        C2045093j c2045093j = mv2.A01;
        if (z) {
            enumC2045493n = EnumC2045493n.A0A;
        } else {
            enumC2045493n = EnumC2045493n.A0D;
        }
        if (c2045093j.A0D(enumC2045493n, A02) && !this.A07) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    public MUB(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig, MV3 mv3) {
        User user;
        this.A0A = userSession;
        this.A0B = userDetailLaunchConfig;
        this.A0E = AbstractC09440dt.A01(new C57257Pbf(5, mv3, new C8CY(mv3.A00)));
        C18A A00 = AnonymousClass189.A00(userSession);
        String str = userDetailLaunchConfig.A0O;
        if (str != null) {
            user = A00.A02(str);
        } else {
            String str2 = userDetailLaunchConfig.A0P;
            if (str2 != null) {
                user = (User) A00.A02.get(str2);
            } else {
                throw AbstractC166987dD.A18("UserDetailLaunchConfig does not contain a valid user id or username");
            }
        }
        this.A03 = user;
        C2ZI.A00.A0B("profile", "has_initial_user", user == null ? 0 : 1);
        AbstractC31176DnK.A1Z(this, AbstractC141776au.A00(this), 17);
    }

    public static final AnonymousClass501 A00(MUB mub) {
        AnonymousClass501 c50617MWe;
        if (!C14360o3.A0K(mub.A02(), "INVALID_USER_ID")) {
            c50617MWe = new AnonymousClass500(mub.A02());
        } else if (!C14360o3.A0K(mub.A03(), "INVALID_USER_NAME")) {
            c50617MWe = new C50617MWe(mub.A03());
        } else {
            throw AbstractC166987dD.A14("userId and userName are both invalid");
        }
        return c50617MWe;
    }

    public static final List A01(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ImageUrlBase imageUrlBase = (ImageUrlBase) it.next();
            C38321qM c38321qM = new C38321qM();
            c38321qM.A09 = imageUrlBase;
            A0q.add(c38321qM);
        }
        return A0q;
    }
}
