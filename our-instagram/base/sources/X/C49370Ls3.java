package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ls3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49370Ls3 implements InterfaceC50485MQn {
    public C66362zD A00;
    public L7L A01;
    public List A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final L6W A06;
    public final L8T A07;
    public final InterfaceC1571373s A08;
    public final boolean A09;
    public final InterfaceC11380iw A0A;
    public final InterfaceC50464MPs A0B;
    public final C47433KxO A0C;
    public final C48742LhA A0D;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (r1.A07() == false) goto L32;
     */
    @Override // X.InterfaceC50485MQn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFG() {
        /*
            r8 = this;
            X.2zD r0 = r8.A00
            if (r0 == 0) goto Lcb
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = X.AbstractC31171DnF.A0E()
            java.util.List r0 = r8.A02
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L21
            android.content.Context r1 = r8.A04
            r0 = 2131960088(0x7f132118, float:1.9556835E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r1, r0)
            X.KIg r0 = new X.KIg
            r0.<init>(r1)
            r3.A00(r0)
        L21:
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L5f
            r6 = 0
        L2a:
            java.util.List r0 = r8.A02
            java.lang.Object r5 = r0.get(r6)
            X.MRv r5 = (X.InterfaceC50518MRv) r5
            X.3o9 r0 = r5.CCb()
            java.lang.String r0 = X.JRE.A07(r0)
            if (r0 == 0) goto L58
            boolean r4 = X.InterfaceC50518MRv.A00(r5)
            X.L7L r2 = r8.A01
            boolean r0 = r8.A03
            if (r0 == 0) goto L49
            r1 = 1
            if (r4 == 0) goto L4a
        L49:
            r1 = 0
        L4a:
            boolean r0 = r8.A09
            X.LZp r0 = r2.A00(r5, r6, r1, r0)
            r3.A00(r0)
            int r6 = r6 + 1
            if (r6 >= r7) goto L9f
            goto L2a
        L58:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L5f:
            X.L8T r4 = r8.A07
            X.LLk r0 = r4.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L9f
            boolean r0 = r4.A01()
            if (r0 != 0) goto L9f
            com.instagram.common.session.UserSession r2 = r8.A05
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = X.AbstractC2042992d.A00(r2)
            boolean r0 = r4.A00()
            if (r0 != 0) goto Lbd
            android.content.Context r5 = r8.A04
            if (r1 == 0) goto L84
            boolean r0 = r1.A07()
            r4 = 1
            if (r0 != 0) goto L85
        L84:
            r4 = 0
        L85:
            boolean r2 = X.AbstractC47372Fk.A00(r2)
            X.73s r1 = r8.A08
            r0 = 0
            X.73r r2 = X.LJQ.A03(r5, r1, r4, r2, r0)
            X.L6W r0 = r8.A06
            r0.A00()
            X.6up r1 = X.EnumC153216up.A02
        L97:
            X.HIs r0 = new X.HIs
            r0.<init>(r2, r1)
            r3.A00(r0)
        L9f:
            X.L8T r0 = r8.A07
            boolean r0 = r0.A01()
            if (r0 == 0) goto Lb5
            java.util.List r0 = r8.A02
            boolean r1 = r0.isEmpty()
            X.KIi r0 = new X.KIi
            r0.<init>(r1)
            r3.A00(r0)
        Lb5:
            X.2zD r0 = r8.A00
            if (r0 == 0) goto Lc6
            r0.A05(r3)
            return
        Lbd:
            android.content.Context r0 = r8.A04
            X.73r r2 = X.LJQ.A00(r0)
            X.6up r1 = X.EnumC153216up.A04
            goto L97
        Lc6:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49370Ls3.AFG():void");
    }

    @Override // X.InterfaceC50485MQn
    public final void EPI(C66362zD c66362zD) {
        this.A00 = c66362zD;
    }

    public C49370Ls3(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50464MPs interfaceC50464MPs, C47433KxO c47433KxO, L6W l6w, L8T l8t, C48742LhA c48742LhA, InterfaceC1571373s interfaceC1571373s, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        AbstractC25234BEr.A0k(3, interfaceC11380iw, c48742LhA, interfaceC50464MPs, l8t);
        AbstractC167007dF.A1J(l6w, 8, interfaceC1571373s);
        C14360o3.A0B(c47433KxO, 10);
        this.A04 = context;
        this.A05 = userSession;
        this.A0A = interfaceC11380iw;
        this.A03 = z;
        this.A0D = c48742LhA;
        this.A0B = interfaceC50464MPs;
        this.A07 = l8t;
        this.A06 = l6w;
        this.A08 = interfaceC1571373s;
        this.A0C = c47433KxO;
        this.A01 = new L7L(context, userSession);
        this.A09 = AbstractC1337462f.A06(userSession);
        this.A02 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC50485MQn
    public final ImmutableList AN4() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new Object());
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A05;
        builder.add((Object) new KIE(context, this.A0A, userSession, this.A0B, this.A0D));
        builder.add((Object) new C45621KHk(this.A0C));
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}
