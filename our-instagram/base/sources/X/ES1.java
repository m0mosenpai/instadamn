package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ES1 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Context A03;
    public final InterfaceC37224GaZ A04;
    public final C41951wl A05;
    public final C41891wf A06;
    public final boolean A07;

    public ES1(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37224GaZ interfaceC37224GaZ, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A00 = interfaceC11380iw;
        this.A04 = interfaceC37224GaZ;
        this.A07 = AbstractC31174DnI.A1V(userSession);
        this.A05 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A06 = A01;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
        E40 e40;
        AbstractC25233BEq.A0v(0, view, obj, obj2);
        Object tag = view.getTag();
        if ((tag instanceof E40) && (e40 = (E40) tag) != null) {
            this.A04.DdO(e40.A06);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r23.A06.A0A(r11, r23.A05) == false) goto L15;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r11 = r26
            r0 = -1443440725(0xffffffffa9f6d7ab, float:-1.0962007E-13)
            int r1 = X.C0f9.A03(r0)
            r5 = r25
            r0 = r27
            X.AbstractC167027dH.A13(r5, r11, r0)
            com.instagram.model.direct.DirectShareTarget r11 = (com.instagram.model.direct.DirectShareTarget) r11
            int r13 = X.AbstractC166987dD.A0H(r0)
            r4 = r23
            com.instagram.common.session.UserSession r8 = r4.A01
            X.2Eg r0 = X.AbstractC47132Ef.A00(r8)
            r18 = 0
            X.2Ei r0 = r0.A0E
            java.lang.Object r0 = r0.A00()
            boolean r3 = X.AbstractC166987dD.A1a(r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L44
            X.0iw r0 = r4.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "direct_thread_add_member"
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L44
            boolean r0 = r11.A0a(r3)
            if (r0 != 0) goto L44
            r18 = 1
        L44:
            android.content.Context r6 = r4.A03
            java.lang.Object r10 = r5.getTag()
            if (r10 == 0) goto L8e
            X.E40 r10 = (X.E40) r10
            X.0iw r7 = r4.A00
            r12 = 6
            boolean r0 = r4.A07
            if (r0 == 0) goto L61
            X.1wf r2 = r4.A06
            X.1wl r0 = r4.A05
            boolean r0 = r2.A0A(r11, r0)
            r16 = 1
            if (r0 != 0) goto L63
        L61:
            r16 = 0
        L63:
            r17 = 0
            X.1wf r3 = r4.A06
            X.1wl r2 = r4.A05
            r0 = 10
            int r15 = r3.A07(r11, r2, r0)
            X.GaZ r9 = r4.A04
            r3 = 0
            r19 = r18 ^ 1
            r14 = r13
            r20 = r17
            r21 = r17
            r22 = r17
            X.FV9.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r9
            r4 = r11
            r5 = r17
            r6 = r13
            r7 = r13
            r2.DdG(r3, r4, r5, r6, r7)
            r0 = 397154641(0x17ac1951, float:1.112163E-24)
            X.C0f9.A0A(r0, r1)
            return
        L8e:
            java.lang.IllegalStateException r2 = X.AbstractC166997dE.A0g()
            r0 = 971634708(0x39e9f814, float:4.4626056E-4)
            X.C0f9.A0A(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES1.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 721485459);
        Context context = this.A03;
        FrameLayout frameLayout = (FrameLayout) AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.directshare_row_user);
        frameLayout.setTag(new E40(context, frameLayout));
        C0f9.A0A(226017586, A0G);
        return frameLayout;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
