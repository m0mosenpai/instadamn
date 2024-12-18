package com.instagram.avatars.suggestions;

import X.AbstractC167007dF;
import X.AbstractC25226BEj;
import X.AbstractC439521d;
import X.C006802i;
import X.C125545m0;
import X.C14360o3;
import X.C150236pX;
import X.C20Y;
import X.C23671Dx;
import X.C439421c;
import X.C4A7;
import X.C4A8;
import X.C50254MHj;
import X.EnumC09460dv;
import X.EnumC143276dS;
import X.EnumC143286dT;
import X.InterfaceC09390do;
import X.InterfaceC19390xP;
import X.MBq;
import X.MRB;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class ContextualSuggestionsStickersRepository extends C4A7 implements MRB {
    public AbstractC439521d A00;
    public final EnumC143276dS A01;
    public final EnumC143286dT A02;
    public final AvatarStore A03;
    public final C006802i A04;
    public final UserSession A05;
    public final C150236pX A06;
    public final ConcurrentHashMap A07;
    public final ConcurrentHashMap A08;
    public final AtomicBoolean A09;
    public final InterfaceC09390do A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r14, java.lang.String r15, X.InterfaceC23621Ds r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.A00(com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.A01(X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0009 A[SYNTHETIC] */
    @Override // X.MRB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Aji(java.util.List r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.ArrayList r4 = X.AbstractC166997dE.A12(r6, r0)
            java.util.Iterator r3 = r6.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()
            X.L9X r2 = (X.L9X) r2
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L3a
            r0 = 4
            if (r1 == r0) goto L36
            r0 = 6
            if (r1 != r0) goto L9
            boolean r0 = r5.A0C
            if (r0 == 0) goto L9
            java.util.concurrent.ConcurrentHashMap r1 = r5.A07
        L2a:
            java.lang.String r0 = r2.A01
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L9
            r4.add(r0)
            goto L9
        L36:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L9
        L3a:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08
            goto L2a
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.Aji(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.MRB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E5J(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = X.MAG.A01(r8, r3)
            if (r0 == 0) goto L5b
            r6 = r8
            X.MAG r6 = (X.MAG) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L3e
            if (r0 != r4) goto L61
            java.lang.Object r0 = r6.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository r0 = (com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository) r0
            X.AbstractC09560e7.A00(r1)
        L27:
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36603403514352559(0x820a9a000b13af, double:3.211478000327604E-306)
            int r2 = X.AbstractC25225BEi.A07(r2, r3, r0)
            java.lang.String r1 = "igd_typeahead"
            r0 = 8
            X.E6x r5 = new X.E6x
            r5.<init>(r2, r1, r0)
        L3d:
            return r5
        L3e:
            X.AbstractC09560e7.A00(r1)
            X.19L r3 = r7.A01
            r2 = 0
            r1 = 27
            X.MBq r0 = new X.MBq
            r0.<init>(r7, r2, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r3)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = r0.CgU(r6)
            if (r0 == r5) goto L3d
            r0 = r7
            goto L27
        L5b:
            X.MAG r6 = new X.MAG
            r6.<init>(r7, r8, r3)
            goto L15
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository.E5J(X.1Ds):java.lang.Object");
    }

    @Override // X.MRB
    public final InterfaceC19390xP F8n(List list) {
        return null;
    }

    @Override // X.MRB
    public final boolean BBA() {
        C14360o3.A0B(this.A08, 0);
        return !r1.isEmpty();
    }

    @Override // X.MRB
    public final boolean CLq() {
        AbstractC439521d abstractC439521d = this.A03.A01;
        if (C14360o3.A0K(abstractC439521d, C125545m0.A00)) {
            ConcurrentHashMap concurrentHashMap = this.A08;
            C14360o3.A0B(concurrentHashMap, 0);
            return AbstractC167007dF.A1N(!concurrentHashMap.isEmpty() ? 1 : 0);
        }
        return C14360o3.A0K(this.A00, abstractC439521d);
    }

    @Override // X.MRB
    public final C23671Dx ECr() {
        if (!this.A09.compareAndSet(false, true)) {
            return null;
        }
        this.A08.clear();
        return AbstractC25226BEj.A1L(new MBq(this, null, 28), super.A01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextualSuggestionsStickersRepository(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, C006802i c006802i, UserSession userSession, boolean z, boolean z2) {
        super("ContextualSuggestionsStickersRepository", C4A8.A00(1342004349));
        AvatarStore A00 = C20Y.A00(userSession);
        C150236pX c150236pX = new C150236pX(userSession);
        AbstractC167007dF.A1G(c006802i, 2, enumC143276dS);
        C14360o3.A0B(A00, 7);
        this.A05 = userSession;
        this.A04 = c006802i;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = enumC143276dS;
        this.A02 = enumC143286dT;
        this.A03 = A00;
        this.A06 = c150236pX;
        this.A08 = new ConcurrentHashMap();
        this.A07 = new ConcurrentHashMap();
        this.A00 = C439421c.A00;
        this.A0A = C50254MHj.A00(this, EnumC09460dv.A02, 43);
        this.A09 = new AtomicBoolean(false);
    }
}
