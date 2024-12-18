package X;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.396, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass396 extends C1I2 implements InterfaceC60602pj {
    public C62882tR A00;
    public boolean A01;
    public C3A4 A02;
    public boolean A03;
    public final InterfaceC65272xP A04;
    public final C33P A05;
    public final Fragment A06;
    public final C60462pV A07;
    public final UserSession A08;
    public final AnonymousClass397 A09;
    public final C61372qz A0A;
    public final ViewOnKeyListenerC677333n A0B;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass396(final Fragment fragment, C61792rg c61792rg, UserSession userSession, C36Y c36y, InterfaceC686036x interfaceC686036x, InterfaceC65272xP interfaceC65272xP, AnonymousClass392 anonymousClass392, InterfaceC60442pS interfaceC60442pS, C33A c33a, C57352kA c57352kA, C33P c33p, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, C62882tR c62882tR, InterfaceC684136e interfaceC684136e, InterfaceC61432r6 interfaceC61432r6, C676533f c676533f, C1M1 c1m1, List list) {
        AnonymousClass397 anonymousClass397;
        C61372qz c61372qz = new C61372qz();
        this.A0A = c61372qz;
        C60462pV c60462pV = new C60462pV();
        this.A07 = c60462pV;
        this.A01 = false;
        this.A03 = true;
        this.A00 = c62882tR;
        this.A05 = c33p;
        this.A0B = viewOnKeyListenerC677333n;
        if (c61792rg != null) {
            anonymousClass397 = new AnonymousClass397(fragment, c61792rg, userSession, interfaceC65272xP);
        } else {
            anonymousClass397 = null;
        }
        this.A09 = anonymousClass397;
        interfaceC65272xP.EUR(c33p);
        this.A06 = fragment;
        interfaceC65272xP.ETA(interfaceC686036x);
        this.A04 = interfaceC65272xP;
        this.A08 = userSession;
        this.A02 = new C3A4(userSession);
        c60462pV.A0E(c36y.A04);
        c60462pV.A0E(c36y);
        final C3A9 c3a9 = new C3A9(new C3A5(interfaceC65272xP), new C3A7((InterfaceC60682pr) fragment), list);
        C1I7 c1i7 = new C1I7(fragment, c3a9) { // from class: X.3AD
            public final Fragment A00;
            public final C3A9 A01;

            {
                this.A00 = fragment;
                this.A01 = c3a9;
            }

            @Override // X.C1I7, X.C1I2
            public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
                int i6;
                int A03 = C0f9.A03(-458264169);
                if (!this.A00.isResumed()) {
                    i6 = 1527268208;
                } else {
                    this.A01.A01();
                    i6 = -1812962827;
                }
                C0f9.A0A(i6, A03);
            }
        };
        C3AE c3ae = new C3AE(fragment, userSession, interfaceC60442pS, interfaceC65272xP, c57352kA, interfaceC61432r6, null, c1m1);
        C3AO c3ao = new C3AO(fragment, userSession, interfaceC686036x.C9C(), interfaceC65272xP);
        c61372qz.A03(c33p);
        c61372qz.A03(c1i7);
        if (anonymousClass397 != null && C18U.A06(C06090Tz.A05, userSession, 36323530559728980L)) {
            c61372qz.A03(anonymousClass397);
            c60462pV.A0E(anonymousClass397);
        }
        c61372qz.A03(c62882tR);
        c60462pV.A0E(c62882tR);
        c60462pV.A0E(c33p);
        c60462pV.A0E(c3ae);
        c60462pV.A0E(c3ao);
        c60462pV.A0E(c676533f);
        c60462pV.A0E(interfaceC684136e);
        if (C36A.A07(userSession)) {
            c60462pV.A0E(viewOnKeyListenerC677333n);
            C3A4 c3a4 = this.A02;
            C14360o3.A0B(c33p, 0);
            c3a4.A07.add(c33p);
            c33p.A02 = c3a4;
            c33p.A0F.A03 = c3a4;
            C3A4 c3a42 = this.A02;
            C14360o3.A0B(viewOnKeyListenerC677333n, 0);
            c3a42.A07.add(viewOnKeyListenerC677333n);
            viewOnKeyListenerC677333n.A01 = c3a42;
        }
        if (c33a != null) {
            c60462pV.A0E(c33a);
        }
        if (anonymousClass392 != null) {
            c60462pV.A0E(anonymousClass392);
        }
        InterfaceC60022ok interfaceC60022ok = c33p.A09;
        if (fragment instanceof InterfaceC60032ol) {
            this.A03 = false;
            C60762q0 volumeKeyPressController = ((InterfaceC60032ol) fragment).getVolumeKeyPressController();
            volumeKeyPressController.A00(interfaceC60022ok);
            if (C36A.A07(userSession)) {
                volumeKeyPressController.A00(viewOnKeyListenerC677333n.A05);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        View findViewById;
        if (this.A03 && (findViewById = view.findViewById(R.id.list)) != null) {
            findViewById.setOnKeyListener(this.A05);
            if (C36A.A07(this.A08)) {
                findViewById.setOnKeyListener(this.A0B);
            }
        }
        this.A07.A0C(view);
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A07.A01();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A07.A02();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A07.A03();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A07.A04();
        this.A01 = false;
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A07.A05();
        this.A01 = true;
        C33P c33p = this.A05;
        if (!c33p.A0M) {
            c33p.A0F.A0D.sendEmptyMessage(0);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A07.A0D(view, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(X.C3FQ r10) {
        /*
            r9 = this;
            int r7 = r10.B6q()
            r6 = -1
            r5 = 0
            r4 = -1
        L7:
            int r0 = r10.BM3()
            java.lang.String r3 = ""
            if (r7 > r0) goto L65
            X.2xP r0 = r9.A04
            int r0 = r0.getCount()
            if (r7 >= r0) goto L8c
            android.view.View r8 = r10.AnW(r7)
            if (r8 == 0) goto L43
            androidx.fragment.app.Fragment r0 = r9.A06
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L43
            r0 = 2131441895(0x7f0b38e7, float:1.8505815E38)
            r1.findViewById(r0)
            r3 = 1
            r0 = 2
            int[] r2 = new int[r0]
            r8.getLocationInWindow(r2)
            r1 = r2[r3]
            if (r1 >= 0) goto L46
            int r1 = r8.getBottom()
            r0 = r2[r3]
            int r0 = java.lang.Math.abs(r0)
        L3e:
            int r1 = r1 - r0
        L3f:
            if (r1 <= r5) goto L43
            r4 = r7
            r5 = r1
        L43:
            int r7 = r7 + 1
            goto L7
        L46:
            int r0 = r8.getBottom()
            int r1 = r1 + r0
            android.view.ViewGroup r0 = r10.CFj()
            int r0 = r0.getBottom()
            if (r1 <= r0) goto L60
            android.view.ViewGroup r0 = r10.CFj()
            int r1 = r0.getHeight()
            r0 = r2[r3]
            goto L3e
        L60:
            int r1 = r8.getBottom()
            goto L3f
        L65:
            if (r4 == r6) goto L8c
            X.2xP r2 = r9.A04
            java.lang.Object r1 = r2.getItem(r4)
            boolean r0 = r1 instanceof X.InterfaceC38371qR
            if (r0 == 0) goto L7f
            X.1qR r1 = (X.InterfaceC38371qR) r1
            X.1qM r0 = r1.BQN()
            X.1tc r0 = r0.BRp()
            java.lang.String r3 = r0.name()
        L7f:
            java.lang.String r2 = r2.getBinderGroupName(r4)
            java.lang.String r1 = "["
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass001.A0u(r2, r1, r3, r0)
            return r0
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass396.A00(X.3FQ):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r14.CXX() == false) goto L6;
     */
    @Override // X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r14, int r15, int r16, int r17, int r18, int r19) {
        /*
            r13 = this;
            r0 = 1017572890(0x3ca6ee1a, float:0.020377208)
            int r5 = X.C0f9.A03(r0)
            X.2xP r2 = r13.A04
            boolean r1 = r2.CSO()
            r7 = r14
            if (r1 == 0) goto L17
            boolean r0 = r14.CXX()
            r4 = 0
            if (r0 != 0) goto L18
        L17:
            r4 = 1
        L18:
            boolean r0 = r14.CXX()
            if (r0 == 0) goto L39
            if (r1 == 0) goto L50
            boolean r0 = X.LJW.A01()
            if (r0 == 0) goto L50
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            X.J32 r2 = new X.J32
            r2.<init>(r13)
            r0 = 0
            r3.postDelayed(r2, r0)
        L39:
            if (r4 == 0) goto L49
        L3b:
            X.2qz r6 = r13.A0A
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r6.onScroll(r7, r8, r9, r10, r11, r12)
        L49:
            r0 = -1996166032(0xffffffff8904ec70, float:-1.6000094E-33)
            X.C0f9.A0A(r0, r5)
            return
        L50:
            android.view.ViewGroup r0 = r14.CFj()
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            boolean r0 = X.LJW.A02(r0)
            if (r0 == 0) goto L39
            r2.Ct5()
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass396.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(1858169347);
        if (i == 1) {
            if (Process.getThreadPriority(Process.myTid()) > -4) {
                Process.setThreadPriority(-4);
            }
        } else if (i == 0) {
            this.A00.A01.A0G.A0B = A00(c3fq);
        }
        this.A0A.onScrollStateChanged(c3fq, i);
        if (i == 1) {
            this.A00.A01.A0G.A0D = A00(c3fq);
        }
        C0f9.A0A(-997429107, A03);
    }
}
