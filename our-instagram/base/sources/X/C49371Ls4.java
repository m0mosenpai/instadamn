package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ls4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49371Ls4 implements InterfaceC50485MQn {
    public C66362zD A00;
    public C41761wQ A01;
    public List A02;
    public boolean A03;
    public final Context A04;
    public final InterfaceC66382zF A05;
    public final C42201xA A06;
    public final UserSession A07;
    public final L7L A08;
    public final L6W A09;
    public final L8T A0A;
    public final LE4 A0B;
    public final InterfaceC1571373s A0C;
    public final InterfaceC11380iw A0D;
    public final InterfaceC50464MPs A0E;
    public final C48742LhA A0F;

    @Override // X.InterfaceC50485MQn
    public final void EPI(C66362zD c66362zD) {
        this.A00 = c66362zD;
    }

    public C49371Ls4(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC66382zF interfaceC66382zF, UserSession userSession, InterfaceC50464MPs interfaceC50464MPs, L7L l7l, L6W l6w, L8T l8t, C48742LhA c48742LhA, LE4 le4, InterfaceC1571373s interfaceC1571373s, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        AbstractC25234BEr.A0k(3, interfaceC11380iw, l8t, c48742LhA, interfaceC50464MPs);
        AbstractC167007dF.A1J(interfaceC1571373s, 8, le4);
        AbstractC25229BEm.A1L(l6w, 11, interfaceC66382zF);
        this.A06 = AbstractC42021ws.A00();
        this.A01 = AbstractC31173DnH.A0S();
        this.A02 = AbstractC166987dD.A1E();
        this.A04 = context;
        this.A07 = userSession;
        this.A0D = interfaceC11380iw;
        this.A0F = c48742LhA;
        this.A0E = interfaceC50464MPs;
        this.A08 = l7l;
        this.A03 = z;
        this.A0C = interfaceC1571373s;
        this.A0B = le4;
        this.A0A = l8t;
        this.A05 = interfaceC66382zF;
        this.A09 = l6w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2.A01() != false) goto L6;
     */
    @Override // X.InterfaceC50485MQn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFG() {
        /*
            r8 = this;
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = X.AbstractC31171DnF.A0E()
            X.L8T r2 = r8.A0A
            X.LLk r0 = r2.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L13
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 == 0) goto L14
        L13:
            r1 = 0
        L14:
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L51
            r6 = 0
            r5 = 0
        L1e:
            java.util.List r0 = r8.A02
            java.lang.Object r4 = r0.get(r5)
            X.MRv r4 = (X.InterfaceC50518MRv) r4
            X.3o9 r0 = r4.CCb()
            java.lang.String r0 = X.JRE.A07(r0)
            if (r0 == 0) goto L4a
            boolean r2 = X.InterfaceC50518MRv.A00(r4)
            X.L7L r1 = r8.A08
            boolean r0 = r8.A03
            if (r0 == 0) goto L3d
            r0 = 1
            if (r2 == 0) goto L3e
        L3d:
            r0 = 0
        L3e:
            X.LZp r0 = r1.A00(r4, r5, r0, r6)
            r3.A00(r0)
            int r5 = r5 + 1
            if (r5 >= r7) goto L78
            goto L1e
        L4a:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L51:
            if (r1 == 0) goto L78
            boolean r0 = r2.A00()
            if (r0 != 0) goto L7e
            android.content.Context r5 = r8.A04
            com.instagram.common.session.UserSession r4 = r8.A07
            X.Kcw r2 = X.EnumC46220Kcw.A0C
            boolean r1 = X.AbstractC47372Fk.A00(r4)
            X.73s r0 = r8.A0C
            X.73r r2 = X.LJQ.A01(r5, r4, r2, r0, r1)
            X.6up r1 = X.EnumC153216up.A02
            X.HIs r0 = new X.HIs
            r0.<init>(r2, r1)
            r3.A00(r0)
            X.L6W r0 = r8.A09
            r0.A00()
        L78:
            X.1xA r0 = r8.A06
            r0.accept(r3)
            return
        L7e:
            android.content.Context r2 = r8.A04
            com.instagram.common.session.UserSession r1 = r8.A07
            X.LE4 r0 = r8.A0B
            X.73r r2 = X.LJQ.A02(r2, r1, r0)
            X.6up r1 = X.EnumC153216up.A04
            X.HIs r0 = new X.HIs
            r0.<init>(r2, r1)
            r3.A00(r0)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49371Ls4.AFG():void");
    }

    @Override // X.InterfaceC50485MQn
    public final ImmutableList AN4() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A07;
        builder.add((Object) new KIE(context, this.A0D, userSession, this.A0E, this.A0F));
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}
