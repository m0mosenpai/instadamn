package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LAH {
    public InterfaceC11380iw A00;
    public C43632JRq A01;
    public C43632JRq A02;
    public C137766Ly A03;
    public InboxNetworkSource A04;
    public InboxNetworkSource A05;
    public InboxNetworkSource A06;
    public boolean A07;
    public C43632JRq A08;
    public final UserSession A09;
    public final C2057098u A0A;
    public final MutedWordsFilterManager A0B;
    public final C44180Jfj A0C;
    public final KXD A0D;
    public final LA3 A0E;
    public final java.util.Set A0F;

    public final void A00() {
        this.A07 = true;
        InboxNetworkSource inboxNetworkSource = this.A06;
        if (inboxNetworkSource == null) {
            C2057098u c2057098u = this.A0A;
            synchronized (c2057098u) {
                inboxNetworkSource = c2057098u.A0A;
            }
            this.A06 = inboxNetworkSource;
        }
        C14360o3.A0C(inboxNetworkSource, "null cannot be cast to non-null type com.instagram.direct.store.InboxNetworkSource");
        A04(inboxNetworkSource);
        this.A08 = this.A02;
    }

    public final void A01(AnonymousClass935 anonymousClass935) {
        C14360o3.A0B(anonymousClass935, 0);
        if (this.A0F.add(anonymousClass935)) {
            InboxNetworkSource inboxNetworkSource = this.A04;
            if (inboxNetworkSource == null) {
                C14360o3.A0F("directCurrentSource");
                throw C00O.createAndThrow();
            }
            inboxNetworkSource.A0C.add(anonymousClass935);
            if (inboxNetworkSource.A05) {
                anonymousClass935.onStart();
            }
        }
    }

    public final void A04(InboxNetworkSource inboxNetworkSource) {
        C14360o3.A0B(inboxNetworkSource, 0);
        Iterator it = this.A0F.iterator();
        InboxNetworkSource inboxNetworkSource2 = this.A04;
        if (inboxNetworkSource2 != null) {
            inboxNetworkSource2.A00 = null;
            while (it.hasNext()) {
                C1P1 c1p1 = (C1P1) it.next();
                InboxNetworkSource inboxNetworkSource3 = this.A04;
                if (inboxNetworkSource3 == null) {
                    C14360o3.A0F("directCurrentSource");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0B(c1p1, 0);
                inboxNetworkSource3.A0C.remove(c1p1);
                inboxNetworkSource.A0C.add(c1p1);
                if (inboxNetworkSource.A05) {
                    c1p1.onStart();
                }
            }
        } else {
            while (it.hasNext()) {
                C1P1 c1p12 = (C1P1) it.next();
                C14360o3.A0B(c1p12, 0);
                inboxNetworkSource.A0C.add(c1p12);
                if (inboxNetworkSource.A05) {
                    c1p12.onStart();
                }
            }
        }
        inboxNetworkSource.A00 = this.A00;
        this.A04 = inboxNetworkSource;
    }

    public final void A05(C2EB c2eb) {
        InboxNetworkSource inboxNetworkSource;
        C14360o3.A0B(c2eb, 0);
        this.A07 = false;
        C2057098u c2057098u = this.A0A;
        synchronized (c2057098u) {
            inboxNetworkSource = (InboxNetworkSource) c2057098u.A0B.get(c2eb);
        }
        this.A05 = inboxNetworkSource;
        C14360o3.A0C(inboxNetworkSource, "null cannot be cast to non-null type com.instagram.direct.store.InboxNetworkSource");
        A04(inboxNetworkSource);
        this.A08 = this.A01;
    }

    public /* synthetic */ LAH(UserSession userSession) {
        IntentFilter intentFilter = C2057098u.A0J;
        C2057098u A00 = AbstractC2057198v.A00(userSession);
        C14360o3.A0B(A00, 2);
        this.A09 = userSession;
        this.A0A = A00;
        this.A0E = new LA3(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36313209753634629L)) {
            this.A03 = C137746Lw.A00(userSession, "MessageRequestsNetworkSourceManager").A01;
        }
        this.A0F = AbstractC166987dD.A1H();
        this.A0D = AbstractC47017Kqa.A00(userSession);
        this.A0C = AbstractC44179Jfi.A00(userSession);
        this.A0B = AbstractC2042992d.A00(userSession);
    }

    public final void A02(EnumC46220Kcw enumC46220Kcw, C4I3 c4i3) {
        ArrayList A03;
        ArrayList arrayList;
        EnumC31648DvE enumC31648DvE;
        boolean equals;
        String str;
        C4I3 c4i32 = c4i3;
        C14360o3.A0B(enumC46220Kcw, 0);
        InboxNetworkSource inboxNetworkSource = this.A04;
        if (inboxNetworkSource != null) {
            if (inboxNetworkSource.A03) {
                C44180Jfj c44180Jfj = this.A0C;
                Integer num = C05F.A0C;
                if (this.A07) {
                    enumC31648DvE = EnumC31648DvE.A0B;
                } else {
                    enumC31648DvE = EnumC31648DvE.A08;
                }
                c44180Jfj.A06(enumC31648DvE, num);
                String str2 = enumC46220Kcw.A03;
                C14360o3.A0B(str2, 0);
                c44180Jfj.A03("filter_type", str2);
                if (c44180Jfj.A00 != num || !c44180Jfj.A01) {
                    c44180Jfj.A04("fetch_threads_server_start", null);
                }
                c44180Jfj.A01 = true;
                boolean z = this.A07;
                KXD kxd = this.A0D;
                if (z) {
                    equals = "pending".equals("spam");
                } else {
                    equals = "pending".equals("pending");
                }
                if (equals) {
                    str = "fetch_threads_start_pending";
                } else {
                    str = "fetch_threads_start_other";
                }
                kxd.A04(str, "server");
            }
            if (this.A07 && !AbstractC1337462f.A0A(this.A09, true)) {
                c4i32 = C4I3.A03;
            } else if (c4i3 == null) {
                c4i32 = AbstractC125565m2.A00(enumC46220Kcw.A01);
            }
            if (this.A07 && !AbstractC1337462f.A0A(this.A09, true)) {
                A03 = null;
            } else {
                A03 = this.A0E.A03(enumC46220Kcw.A01, false);
            }
            InboxNetworkSource inboxNetworkSource2 = this.A04;
            if (inboxNetworkSource2 != null) {
                if (!inboxNetworkSource2.A05 && !inboxNetworkSource2.A04 && inboxNetworkSource2.A03) {
                    UserSession userSession = inboxNetworkSource2.A07;
                    AbstractC46972Dl abstractC46972Dl = inboxNetworkSource2.A08;
                    String str3 = inboxNetworkSource2.A01;
                    String str4 = inboxNetworkSource2.A02;
                    Integer num2 = C05F.A01;
                    String A01 = C99P.A01(userSession, abstractC46972Dl.A01, c4i32);
                    String str5 = inboxNetworkSource2.A0A.A00;
                    if (A03 != null) {
                        arrayList = AbstractC2057298w.A01(A03);
                    } else {
                        arrayList = null;
                    }
                    AnonymousClass777 A00 = C99W.A00(userSession, abstractC46972Dl, null, false, num2, null, null, str3, str4, A01, str5, null, AbstractC166997dE.A0n(), arrayList, -1L);
                    A00.A00(new C45393K8g(userSession, inboxNetworkSource2, AbstractC167007dF.A1W(inboxNetworkSource2.A01)));
                    InboxNetworkSource.A01(A00, inboxNetworkSource2);
                }
                C43632JRq c43632JRq = this.A08;
                if (c43632JRq != null) {
                    c43632JRq.Che(C2057498z.A00, c4i32);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("directCurrentSource");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0290 A[LOOP:2: B:40:0x0286->B:42:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.EnumC46220Kcw r29, X.C4I3 r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LAH.A03(X.Kcw, X.4I3, boolean):void");
    }

    public final boolean A06() {
        C43632JRq c43632JRq = this.A08;
        InboxNetworkSource inboxNetworkSource = this.A04;
        if (c43632JRq == null) {
            if (inboxNetworkSource != null) {
                return inboxNetworkSource.A05;
            }
        } else if (inboxNetworkSource != null) {
            if (!inboxNetworkSource.A05 && !c43632JRq.isLoading()) {
                return false;
            }
            return true;
        }
        C14360o3.A0F("directCurrentSource");
        throw C00O.createAndThrow();
    }
}
