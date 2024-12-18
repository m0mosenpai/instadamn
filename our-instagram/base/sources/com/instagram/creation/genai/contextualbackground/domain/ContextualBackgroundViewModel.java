package com.instagram.creation.genai.contextualbackground.domain;

import X.AbstractC141776au;
import X.AbstractC208910l;
import X.AbstractC25235BEs;
import X.AbstractC52922bZ;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C10M;
import X.C14360o3;
import X.C16930sl;
import X.C27262C1f;
import X.C27949CTj;
import X.C51739MtM;
import X.D5h;
import X.InterfaceC06180Ui;
import X.InterfaceC15070pN;
import X.InterfaceC19390xP;
import X.MWG;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class ContextualBackgroundViewModel extends AbstractC52922bZ {
    public C27949CTj A00;
    public final UserSession A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final InterfaceC15070pN A09;
    public final C0UO A0A;
    public final C27262C1f A0B;
    public final C05A A0C;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 45
            boolean r0 = X.MAG.A01(r14, r3)
            if (r0 == 0) goto L75
            r4 = r14
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 2
            r11 = 1
            if (r0 == 0) goto L2a
            if (r0 == r11) goto L5b
            if (r0 != r5) goto L7b
            X.AbstractC09560e7.A00(r2)
        L27:
            X.0eB r3 = X.C0eB.A00
            return r3
        L2a:
            X.AbstractC09560e7.A00(r2)
            X.05A r7 = r12.A04
            java.util.List r8 = X.AbstractC47151Ksk.A00
            int r6 = r8.size()
            java.util.ArrayList r2 = X.AbstractC25225BEi.A17(r6)
            r1 = 0
        L3a:
            if (r1 >= r6) goto L44
            X.CaW r0 = X.C28123CaW.A00
            r2.add(r0)
            int r1 = r1 + 1
            goto L3a
        L44:
            r7.Egh(r2)
            X.C1f r7 = r12.A0B
            r4.A01 = r12
            r4.A00 = r11
            r10 = 0
            X.J6o r6 = new X.J6o
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            X.05N r2 = X.C0JE.A01(r6)
            if (r2 != r3) goto L60
            return r3
        L5b:
            java.lang.Object r12 = r4.A01
            X.AbstractC09560e7.A00(r2)
        L60:
            X.0xP r2 = (X.InterfaceC19390xP) r2
            r0 = 57
            X.BEx r1 = new X.BEx
            r1.<init>(r12, r0)
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.collect(r1, r4)
            if (r0 != r3) goto L27
            return r3
        L75:
            X.MAG r4 = new X.MAG
            r4.<init>(r12, r14, r3)
            goto L16
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel.A00(com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel.A01(com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage, X.1Ds):java.lang.Object");
    }

    public ContextualBackgroundViewModel(UserSession userSession, C27262C1f c27262C1f) {
        this.A01 = userSession;
        this.A0B = c27262C1f;
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        this.A00 = new C27949CTj(userSession);
        C008002u A002 = C10E.A00(null);
        this.A0C = A002;
        C008002u A003 = C10E.A00(null);
        this.A06 = A003;
        this.A05 = C10E.A00(null);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A03 = A1A;
        C008002u A004 = C10E.A00(C16930sl.A00);
        this.A04 = A004;
        C008002u A005 = C10E.A00(null);
        this.A07 = A005;
        D5h d5h = D5h.A00;
        C14360o3.A0B(d5h, 6);
        MWG mwg = new MWG(21, d5h, new InterfaceC19390xP[]{A004, A002, A005, A00, A1A, A003});
        this.A0A = AbstractC208910l.A01(new C51739MtM(), AbstractC141776au.A00(this), mwg, C10I.A01);
        AnonymousClass057 A006 = C10M.A00(C05F.A00, 0, 0);
        this.A02 = A006;
        this.A09 = A006;
    }
}
