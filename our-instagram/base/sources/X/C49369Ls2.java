package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ls2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49369Ls2 implements InterfaceC50485MQn {
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
    public final C48742LhA A0C;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r3 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r1.A07() == false) goto L31;
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
            if (r0 == 0) goto Lae
            com.instagram.common.recyclerview.ViewModelListUpdate r5 = X.AbstractC31171DnF.A0E()
            X.JdP r1 = X.C44038JdP.A00
            X.LZO r0 = new X.LZO
            r0.<init>(r1)
            r5.A00(r0)
            java.util.List r0 = r8.A02
            int r7 = r0.size()
            if (r7 <= 0) goto L50
            r6 = 0
        L1b:
            java.util.List r0 = r8.A02
            java.lang.Object r4 = r0.get(r6)
            X.MRv r4 = (X.InterfaceC50518MRv) r4
            X.3o9 r0 = r4.CCb()
            java.lang.String r0 = X.JRE.A07(r0)
            if (r0 == 0) goto L49
            boolean r3 = X.InterfaceC50518MRv.A00(r4)
            X.L7L r2 = r8.A01
            boolean r0 = r8.A03
            if (r0 == 0) goto L3a
            r1 = 1
            if (r3 == 0) goto L3b
        L3a:
            r1 = 0
        L3b:
            boolean r0 = r8.A09
            X.LZp r0 = r2.A00(r4, r6, r1, r0)
            r5.A00(r0)
            int r6 = r6 + 1
            if (r6 >= r7) goto L98
            goto L1b
        L49:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L50:
            X.L8T r3 = r8.A07
            X.LLk r0 = r3.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L98
            boolean r0 = r3.A01()
            if (r0 == 0) goto L66
            java.util.List r0 = r8.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L98
        L66:
            com.instagram.common.session.UserSession r2 = r8.A05
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = X.AbstractC2042992d.A00(r2)
            boolean r0 = r3.A00()
            if (r0 != 0) goto La0
            android.content.Context r4 = r8.A04
            if (r1 == 0) goto L7d
            boolean r0 = r1.A07()
            r3 = 1
            if (r0 != 0) goto L7e
        L7d:
            r3 = 0
        L7e:
            boolean r2 = X.AbstractC47372Fk.A00(r2)
            X.73s r1 = r8.A08
            r0 = 0
            X.73r r2 = X.LJQ.A03(r4, r1, r3, r2, r0)
            X.L6W r0 = r8.A06
            r0.A00()
            X.6up r1 = X.EnumC153216up.A02
        L90:
            X.HIs r0 = new X.HIs
            r0.<init>(r2, r1)
            r5.A00(r0)
        L98:
            X.2zD r0 = r8.A00
            if (r0 == 0) goto La9
            r0.A05(r5)
            return
        La0:
            android.content.Context r0 = r8.A04
            X.73r r2 = X.LJQ.A00(r0)
            X.6up r1 = X.EnumC153216up.A04
            goto L90
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49369Ls2.AFG():void");
    }

    @Override // X.InterfaceC50485MQn
    public final void EPI(C66362zD c66362zD) {
        this.A00 = c66362zD;
    }

    public C49369Ls2(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50464MPs interfaceC50464MPs, L6W l6w, L8T l8t, C48742LhA c48742LhA, InterfaceC1571373s interfaceC1571373s, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        AbstractC25234BEr.A0k(3, interfaceC11380iw, c48742LhA, interfaceC50464MPs, l8t);
        AbstractC167007dF.A1J(l6w, 8, interfaceC1571373s);
        this.A04 = context;
        this.A05 = userSession;
        this.A0A = interfaceC11380iw;
        this.A03 = z;
        this.A0C = c48742LhA;
        this.A0B = interfaceC50464MPs;
        this.A07 = l8t;
        this.A06 = l6w;
        this.A08 = interfaceC1571373s;
        this.A01 = new L7L(context, userSession);
        this.A09 = AbstractC1337462f.A06(userSession);
        this.A02 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC50485MQn
    public final ImmutableList AN4() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((Object) new C45624KHn(C49368Ls1.A00));
        builder.add(new Object());
        Context context = this.A04;
        UserSession userSession = this.A05;
        builder.add((Object) new KIE(context, this.A0A, userSession, this.A0B, this.A0C));
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}
