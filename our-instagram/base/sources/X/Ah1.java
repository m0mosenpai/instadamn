package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState;

/* loaded from: classes4.dex */
public final class Ah1 implements C82M {
    public String A00;
    public boolean A01;
    public InterfaceC58362lv A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final InterfaceC58362lv A05;
    public final C83L A06;
    public final UserSession A07;
    public final C2AH A08;
    public final C1829189m A09;
    public final InterfaceC09390do A0A;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C210399Se r4, X.AbstractC172157lk r5) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            boolean r0 = r5 instanceof X.C172147lj
            if (r0 == 0) goto L30
            X.89m r0 = r3.A09
            X.89k r0 = r0.A08
            X.83r r0 = r0.A00
            if (r0 == 0) goto L2e
            X.9Ot r1 = r0.A02
        L12:
            X.9Ot r0 = X.EnumC209589Ot.A04
            if (r1 != r0) goto L5a
            X.7lj r5 = (X.C172147lj) r5
            X.7l2 r2 = r5.A00
            X.7l2 r0 = X.EnumC171727l2.A04
            if (r2 != r0) goto L25
            if (r4 == 0) goto L24
            X.9sY r0 = X.EnumC222939sY.A05
        L22:
            r4.A04 = r0
        L24:
            return
        L25:
            X.7l2 r0 = X.EnumC171727l2.A05
            if (r2 != r0) goto L5f
            if (r4 == 0) goto L24
            X.9sY r0 = X.EnumC222939sY.A08
            goto L22
        L2e:
            r1 = 0
            goto L12
        L30:
            boolean r0 = r5 instanceof X.C171737l3
            if (r0 == 0) goto L49
            X.89m r0 = r3.A09
            X.89k r0 = r0.A08
            X.83r r0 = r0.A00
            if (r0 == 0) goto L47
            X.9Ot r1 = r0.A02
        L3e:
            X.9Ot r0 = X.EnumC209589Ot.A04
            if (r1 != r0) goto L5a
            if (r4 == 0) goto L24
            X.9sY r0 = X.EnumC222939sY.A07
            goto L22
        L47:
            r1 = 0
            goto L3e
        L49:
            boolean r0 = r5 instanceof X.C171757l5
            if (r0 == 0) goto L5a
            X.7l5 r5 = (X.C171757l5) r5
            X.7l4 r1 = r5.A00
            X.7l4 r0 = X.EnumC171747l4.A04
            if (r1 != r0) goto L24
            if (r4 == 0) goto L24
            X.9sY r0 = X.EnumC222939sY.A04
            goto L22
        L5a:
            if (r4 == 0) goto L24
            X.9sY r0 = X.EnumC222939sY.A06
            goto L22
        L5f:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "VisualReplyDisplayMode orientation "
            r1.append(r0)
            r1.append(r2)
            r0 = 99
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r0 = X.AbstractC166997dE.A0x(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ah1.A00(X.9Se, X.7lk):void");
    }

    public final void A02(boolean z) {
        boolean z2;
        WQm wQm = new WQm(1, this, z);
        this.A02 = wQm;
        C1829189m c1829189m = this.A09;
        C1828989k c1828989k = c1829189m.A08;
        C05A c05a = c1828989k.A07;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        CoroutineLiveData A00 = AbstractC58232lf.A00(anonymousClass191, c05a);
        FragmentActivity fragmentActivity = c1829189m.A01;
        A00.A06(fragmentActivity, wQm);
        android.net.Uri A03 = AbstractC08820cl.A03(this.A00);
        C14360o3.A07(A03);
        if (A03.getScheme() != null && !"file".equals(A03.getScheme())) {
            String str = this.A00;
            if (z) {
                C14360o3.A0B(str, 0);
                C1816283r c1816283r = c1829189m.A07;
                if (c1816283r != null) {
                    C38321qM c38321qM = c1816283r.A04;
                    UserSession userSession = c1829189m.A03;
                    String A38 = c38321qM.A38();
                    if (A38 != null) {
                        boolean A5x = c38321qM.A5x();
                        AbstractC23641Du.A05(anonymousClass191, new B5N(fragmentActivity, userSession, c1828989k, A38, str, null, 0, A5x), AbstractC141776au.A00(c1828989k));
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return;
            }
            FragmentActivity fragmentActivity2 = this.A04;
            UserSession userSession2 = this.A07;
            C14360o3.A0B(str, 0);
            C23084AFq.A02.getValue();
            C1816283r c1816283r2 = c1828989k.A00;
            if (c1816283r2 != null) {
                z2 = c1816283r2.A04.Cff();
            } else {
                z2 = false;
            }
            OUQ ouq = new OUQ(str, "RemixSourceMediaSaver", z2, false, false);
            C23084AFq.A01 = str;
            C121275eQ A032 = AbstractC50633MWu.A03(fragmentActivity2, userSession2, ouq);
            C23084AFq.A00 = A032;
            C1GJ.A03(A032);
            c1828989k.A06.A0B(EnumC1829089l.A02);
            c1829189m.A01(this.A08, this.A00);
            return;
        }
        c1828989k.A01 = AbstractC166987dD.A11(this.A00);
        c1828989k.A06.A0B(EnumC1829089l.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AbstractC172157lk r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ah1.A01(X.7lk):void");
    }

    public final boolean A03() {
        C1816283r c1816283r = this.A09.A08.A00;
        if (c1816283r != null && c1816283r.A04.A6F()) {
            if (C18U.A06(C06090Tz.A05, this.A07, 36314987870161862L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        ClipsRemixControllerSavedState clipsRemixControllerSavedState = (ClipsRemixControllerSavedState) parcelable;
        if (clipsRemixControllerSavedState != null) {
            this.A01 = clipsRemixControllerSavedState.A01;
            this.A00 = clipsRemixControllerSavedState.A00;
        }
        if (this.A01) {
            C1829189m c1829189m = this.A09;
            C83L c83l = this.A06;
            C14360o3.A0B(c83l, 0);
            c1829189m.A02.A00().A06(c83l);
        }
        C1829189m c1829189m2 = this.A09;
        c1829189m2.A01(this.A08, this.A00);
        InterfaceC58362lv interfaceC58362lv = this.A05;
        C14360o3.A0B(interfaceC58362lv, 0);
        c1829189m2.A06.A0G.A06(c1829189m2.A01, interfaceC58362lv);
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        ClipsRemixControllerSavedState clipsRemixControllerSavedState = new ClipsRemixControllerSavedState(this.A01, this.A00);
        C1829189m c1829189m = this.A09;
        InterfaceC58362lv interfaceC58362lv = this.A05;
        C14360o3.A0B(interfaceC58362lv, 0);
        c1829189m.A06.A0G.A08(interfaceC58362lv);
        C83L c83l = this.A06;
        C14360o3.A0B(c83l, 0);
        c1829189m.A02.A00().A07(c83l);
        C23084AFq.A02.getValue();
        C121275eQ c121275eQ = C23084AFq.A00;
        if (c121275eQ != null) {
            c121275eQ.A00 = null;
        }
        return clipsRemixControllerSavedState;
    }

    public Ah1(Context context, FragmentActivity fragmentActivity, UserSession userSession, C1829189m c1829189m, String str) {
        AbstractC167017dG.A1R(userSession, fragmentActivity);
        AbstractC167017dG.A1S(context, c1829189m);
        this.A00 = str;
        this.A07 = userSession;
        this.A04 = fragmentActivity;
        this.A03 = context;
        this.A09 = c1829189m;
        this.A0A = C1XM.A00(new C57521Pfv(this, 42));
        C208309Jp c208309Jp = new C208309Jp(this, 6);
        this.A05 = c208309Jp;
        this.A06 = new C23575AcU(this, 2);
        C1828989k c1828989k = c1829189m.A08;
        C2GS c2gs = c1828989k.A06;
        if (c2gs.A02() == EnumC1829089l.A05) {
            c2gs.A0B(EnumC1829089l.A02);
        }
        c1828989k.A00 = c1829189m.A07;
        if (!C2B0.A00(C05F.A0K)) {
            c1829189m.A06.A0G.A06(c1829189m.A01, c208309Jp);
        }
        this.A08 = new C215859h1(this, 1);
    }
}
