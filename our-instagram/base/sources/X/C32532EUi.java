package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.EUi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32532EUi extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C32532EUi(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = obj3;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(869340104);
        ((C1P1) this.A02).onFail(abstractC115105If);
        C0f9.A0A(-1098702584, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1930518596);
            ((C1P1) this.A02).onFailInBackground(abstractC115105If);
            i = -1514645937;
        } else {
            A03 = C0f9.A03(-1296633521);
            LBE.A00((FragmentActivity) this.A01, (UserSession) this.A03, this.A06, this.A05, this.A07);
            i = -1065493071;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        if (1 - this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(1484967812);
        ((C1P1) this.A02).onFinish();
        C0f9.A0A(-1395272722, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-673843709);
        ((C1P1) this.A02).onStart();
        C0f9.A0A(-1604745580, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            int r0 = 1 - r0
            if (r0 == 0) goto La
            super.onSuccess(r15)
            return
        La:
            r0 = -848057379(0xffffffffcd73abdd, float:-2.5550792E8)
            int r2 = X.C0f9.A03(r0)
            r0 = 749155589(0x2ca73505, float:4.752312E-12)
            int r3 = X.C0f9.A03(r0)
            java.lang.Object r0 = r14.A02
            X.AbstractC31171DnF.A1R(r0, r15)
            java.lang.Object r4 = r14.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.Fzp r8 = X.FBA.A00(r4)
            java.lang.String r0 = r14.A07
            if (r0 == 0) goto L3b
            X.1qM r10 = X.AbstractC25229BEm.A0h(r4, r0)
        L2d:
            java.lang.String r12 = r14.A05
            java.lang.String r13 = r14.A06
            r11 = 0
            java.lang.Object r9 = r14.A03
            com.instagram.api.schemas.CollectionPrivacyModeEnum r9 = (com.instagram.api.schemas.CollectionPrivacyModeEnum) r9
            r8.A03(r9, r10, r11, r12, r13)
            monitor-enter(r8)
            goto L3d
        L3b:
            r10 = 0
            goto L2d
        L3d:
            r5 = 0
            X.C14360o3.A0B(r12, r5)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r8.A05     // Catch: java.lang.Throwable -> Ld8
            r7 = 0
            if (r0 == 0) goto L65
            java.util.LinkedList r0 = r8.A00     // Catch: java.lang.Throwable -> Ld8
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Ld8
        L4c:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L62
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> Ld8
            r0 = r1
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r0.A0F     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C14360o3.A0K(r0, r12)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L4c
            r7 = r1
        L62:
            com.instagram.save.model.SavedCollection r7 = (com.instagram.save.model.SavedCollection) r7     // Catch: java.lang.Throwable -> Ld8
            goto L9a
        L65:
            java.util.concurrent.ConcurrentHashMap r0 = r8.A03     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r1 = r0.get(r12)     // Catch: java.lang.Throwable -> Ld8
            X.Epn r1 = (X.EnumC33416Epn) r1     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto L9a
            java.util.concurrent.ConcurrentHashMap r0 = r8.A04     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> Ld8
            X.FaG r1 = (X.C34930FaG) r1     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto L9a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld8
            java.util.LinkedList r0 = r1.A00     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Ld8
        L81:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L9a
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> Ld8
            com.instagram.save.model.SavedCollection r6 = (com.instagram.save.model.SavedCollection) r6     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = r6.A0F     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = X.C14360o3.A0K(r0, r12)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L81
            monitor-exit(r8)
            goto L9e
        L97:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld8
            throw r0     // Catch: java.lang.Throwable -> Ld8
        L9a:
            monitor-exit(r8)
            r6 = r7
            if (r7 == 0) goto Lcb
        L9e:
            java.lang.Object r7 = r14.A01
            X.0iw r7 = (X.InterfaceC11380iw) r7
            X.0wW r1 = X.AbstractC31172DnG.A0Q(r7, r4, r5)
            java.lang.String r0 = "ig_collections"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto Lcb
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "module_name"
            r5.AAP(r0, r1)
            java.lang.String r1 = "collection_save_edits"
            java.lang.String r0 = "event"
            java.lang.String r1 = X.AbstractC31180DnO.A0d(r5, r6, r0, r1)
            java.lang.String r0 = "collection_type"
            X.AbstractC25233BEq.A17(r5, r0, r1)
            X.AbstractC35089Fd0.A02(r5, r4, r6)
        Lcb:
            r0 = -269304450(0xffffffffeff2bd7e, float:-1.5024891E29)
            X.C0f9.A0A(r0, r3)
            r0 = 1090853820(0x41051bbc, float:8.319271)
            X.C0f9.A0A(r0, r2)
            return
        Ld8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32532EUi.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        UserSession userSession;
        Reel A00;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1818944268);
            int A032 = C0f9.A03(-1137136027);
            ((C1P1) this.A02).onSuccessInBackground(obj);
            C0f9.A0A(1486905736, A032);
            i = 1556488841;
        } else {
            A03 = C0f9.A03(1230861163);
            AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
            int A0N = AbstractC167017dG.A0N(anonymousClass435, 183170544);
            C44954Jv6 c44954Jv6 = (C44954Jv6) anonymousClass435.A01;
            if (c44954Jv6 != null && (A00 = AbstractC46661Kke.A00((userSession = (UserSession) this.A03), c44954Jv6, AbstractC43591JPw.A00(461), 10)) != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                C31479DsO c31479DsO = new C31479DsO((Context) this.A02, fragmentActivity);
                C14360o3.A0C(fragmentActivity, MSV.A00(9));
                C38E c38e = new C38E((InterfaceC11380iw) fragmentActivity, userSession, c31479DsO);
                c38e.A0C = AbstractC166997dE.A0n();
                LBE lbe = (LBE) this.A04;
                c38e.A05 = new C33078Eib(fragmentActivity, lbe);
                c38e.A06 = new GF4(fragmentActivity, lbe);
                c38e.A04(A00, C3G2.A0Z, null);
            } else {
                LBE.A00((FragmentActivity) this.A01, (UserSession) this.A03, this.A06, this.A05, this.A07);
            }
            C0f9.A0A(1126968998, A0N);
            i = 1825902683;
        }
        C0f9.A0A(i, A03);
    }
}
