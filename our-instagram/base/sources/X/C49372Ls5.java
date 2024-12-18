package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ls5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49372Ls5 implements InterfaceC50485MQn {
    public int A00;
    public C66362zD A01;
    public C41761wQ A02;
    public AbstractC46972Dl A03;
    public K8K A04;
    public LZT A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public C45649KIm A09;
    public LZS A0A;
    public boolean A0B;
    public final Context A0C;
    public final InterfaceC66382zF A0D;
    public final C42201xA A0E;
    public final UserSession A0F;
    public final L6W A0G;
    public final L8T A0H;
    public final LE4 A0I;
    public final InterfaceC1571373s A0J;
    public final Map A0K;
    public final boolean A0L;
    public final InterfaceC11380iw A0M;
    public final InterfaceC50464MPs A0N;
    public final MRG A0O;
    public final LA3 A0P;
    public final C54685ODl A0Q;
    public final MP3 A0R;
    public final L7L A0S;
    public final L6V A0T;
    public final C47431KxM A0U;
    public final C47432KxN A0V;
    public final C47434KxP A0W;
    public final C47435KxQ A0X;
    public final C47436KxR A0Y;
    public final C47437KxS A0Z;
    public final C48742LhA A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    private final void A00(ViewModelListUpdate viewModelListUpdate) {
        boolean z = false;
        int A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(C125585m4.A00, this.A0K));
        K8K k8k = this.A04;
        if (k8k != null) {
            z = k8k.A01;
        }
        viewModelListUpdate.A00(new C48304LZd(A0K, z, this.A08));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r0.A07() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(com.instagram.common.recyclerview.ViewModelListUpdate r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49372Ls5.A01(com.instagram.common.recyclerview.ViewModelListUpdate, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.A01 != X.EnumC46220Kcw.A0G) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A02() {
        /*
            r4 = this;
            boolean r0 = r4.A0L
            r3 = 1
            if (r0 == 0) goto L10
            X.LZT r0 = r4.A05
            if (r0 == 0) goto L24
            X.Kcw r1 = r0.A01
            X.Kcw r0 = X.EnumC46220Kcw.A0G
            r2 = 1
            if (r1 == r0) goto L11
        L10:
            r2 = 0
        L11:
            X.L8T r1 = r4.A0H
            X.LLk r0 = r1.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L22
            if (r2 != 0) goto L21
            boolean r0 = r1.A01()
            if (r0 != 0) goto L22
        L21:
            return r3
        L22:
            r3 = 0
            return r3
        L24:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49372Ls5.A02():boolean");
    }

    @Override // X.InterfaceC50485MQn
    public final void EPI(C66362zD c66362zD) {
        this.A01 = c66362zD;
    }

    @Override // X.InterfaceC50485MQn
    public final void AFG() {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        C54685ODl c54685ODl = this.A0Q;
        C4F4 A00 = AbstractC54912fq.A00().A00(c54685ODl.A04, c54685ODl.A00);
        if (A00 != null) {
            A0E.A00(A00);
        }
        InterfaceC66482zP interfaceC66482zP = this.A09;
        if ((interfaceC66482zP != null && this.A07) || ((interfaceC66482zP = this.A0A) != null && this.A07)) {
            A0E.A00(interfaceC66482zP);
        }
        LZT lzt = this.A05;
        if (lzt != null) {
            A0E.A00(lzt);
        }
        if (this.A0f) {
            UserSession userSession = this.A0F;
            if (AbstractC1337462f.A0A(userSession, true)) {
                A0E.A00(new LZN(AbstractC001800i.A0a(C4I4.A00(this.A0P.A00).A00)));
            }
            Context context = this.A0C;
            Map map = this.A0K;
            ArrayList A12 = AbstractC166997dE.A12(map, 2);
            Iterator it = new LA3(userSession).A02().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) it.next();
                int A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(abstractC46972Dl, map));
                int i = 100;
                if (C14360o3.A0K(abstractC46972Dl, C2057398y.A00)) {
                    i = 20;
                }
                String A002 = JUR.A00(context, userSession, abstractC46972Dl);
                int i2 = A0K;
                if (A0K > i) {
                    i2 = i;
                }
                if (A0K <= i) {
                    z = false;
                }
                A12.add(new C25313BIi(abstractC46972Dl, A002, i2, z));
            }
            A0E.A00(new JUS(C125575m3.A00, A12, true));
            if (!this.A06.isEmpty()) {
                AbstractC46972Dl abstractC46972Dl2 = this.A03;
                if (abstractC46972Dl2.equals(C44039JdQ.A00) || abstractC46972Dl2.equals(C44038JdP.A00) || (abstractC46972Dl2.equals(C2057398y.A00) && !AbstractC1337462f.A01(userSession))) {
                    A0E.A00(new LZO(abstractC46972Dl2));
                }
            }
        }
        if (this.A0e) {
            L8T l8t = this.A0H;
            if (!l8t.A01() && this.A06.isEmpty()) {
                A0E.A00(new C48303LZc(AbstractC166997dE.A0p(this.A0C, 2131960087), this.A00, !this.A08));
            }
            A01(A0E, A02());
            LLk lLk = l8t.A00;
            if ((!lLk.A0G || !lLk.A0F) && l8t.A01() && !l8t.A00()) {
                A0E.A00(new C45644KIh(this.A06.isEmpty()));
            }
            if (l8t.A01() || AbstractC166987dD.A1b(this.A06)) {
                A0E.A00(new C48303LZc(AbstractC166997dE.A0p(this.A0C, 2131960089), this.A00, !this.A08));
            }
        } else {
            A01(A0E, A02());
        }
        this.A0E.accept(A0E);
    }

    @Override // X.InterfaceC50485MQn
    public final ImmutableList AN4() {
        Object c45618KHh;
        ImmutableList.Builder builder = ImmutableList.builder();
        C54685ODl c54685ODl = this.A0Q;
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession userSession = c54685ODl.A04;
        C64842wi c64842wi = c54685ODl.A01;
        if (c64842wi == null) {
            C14360o3.A0F("quickPromotionPresenter");
            throw C00O.createAndThrow();
        }
        builder.addAll(A00.A06(c54685ODl.A03, userSession, c64842wi));
        if (!this.A0c) {
            boolean z = this.A0b;
            L6V l6v = this.A0T;
            if (z) {
                c45618KHh = new C45617KHg(l6v);
            } else {
                c45618KHh = new C45618KHh(l6v);
            }
            builder.add(c45618KHh);
        }
        if (this.A0L) {
            builder.add((Object) new C45622KHl(this.A0Z));
        }
        EnumC46220Kcw enumC46220Kcw = null;
        if (this.A0f) {
            UserSession userSession2 = this.A0F;
            if (AbstractC1337462f.A0A(userSession2, true)) {
                builder.add((Object) new KI2(this.A0C, this.A0X));
            }
            builder.add((Object) new C44004Jcr(userSession2, this.A0O));
            builder.add((Object) new C45624KHn(this.A0R));
            if (this.A0d) {
                builder.add((Object) new C45619KHi(this.A0Y));
            }
            if (this.A0B) {
                builder.add((Object) new C45623KHm(this.A0W));
            }
        }
        builder.add(new Object());
        if (this.A0e) {
            UserSession userSession3 = this.A0F;
            InterfaceC11380iw interfaceC11380iw = this.A0M;
            C47431KxM c47431KxM = this.A0U;
            LZT lzt = this.A05;
            if (lzt != null) {
                enumC46220Kcw = lzt.A01;
            }
            builder.add((Object) new KID(interfaceC11380iw, userSession3, enumC46220Kcw, c47431KxM));
            builder.add((Object) new C45620KHj(this.A0V));
        }
        Context context = this.A0C;
        UserSession userSession4 = this.A0F;
        builder.add((Object) new KIE(context, this.A0M, userSession4, this.A0N, this.A0a));
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r30, 36317139648516916L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49372Ls5(android.content.Context r27, X.InterfaceC11380iw r28, X.InterfaceC66382zF r29, com.instagram.common.session.UserSession r30, X.InterfaceC50464MPs r31, X.MRG r32, X.EnumC46220Kcw r33, X.C54685ODl r34, X.MP3 r35, X.L7L r36, X.L6V r37, X.C47431KxM r38, X.C47432KxN r39, X.L6W r40, X.C47434KxP r41, X.C47435KxQ r42, X.C47436KxR r43, X.L8T r44, X.C47437KxS r45, X.C48742LhA r46, X.LE4 r47, X.InterfaceC1571373s r48, boolean r49, boolean r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49372Ls5.<init>(android.content.Context, X.0iw, X.2zF, com.instagram.common.session.UserSession, X.MPs, X.MRG, X.Kcw, X.ODl, X.MP3, X.L7L, X.L6V, X.KxM, X.KxN, X.L6W, X.KxP, X.KxQ, X.KxR, X.L8T, X.KxS, X.LhA, X.LE4, X.73s, boolean, boolean, boolean):void");
    }
}
