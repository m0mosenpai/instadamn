package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDJ extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36325613618869449L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        return new X.C51036Mgl(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r6 == r2) goto L12;
     */
    @Override // X.AbstractC61132qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.AbstractC52922bZ create() {
        /*
            r14 = this;
            X.8bo r0 = X.C190298bn.A03
            android.content.Context r3 = r14.A00
            com.instagram.common.session.UserSession r4 = r14.A02
            X.8bn r1 = r0.A00(r3, r4)
            X.6l8 r0 = X.AbstractC147826l7.A0K
            X.6cg r6 = r14.A03
            X.6l7 r0 = r0.A00(r4, r6)
            X.OLC r10 = r0.A02()
            X.6lA r9 = r0.A03
            X.MTU r11 = r0.A03()
            X.ObM r5 = r1.A00()
            X.6cg r2 = X.EnumC142806cg.A03
            if (r6 != r2) goto L7a
            X.0iw r0 = r14.A01
            X.NYV r0 = X.OQX.A01(r0, r4)
            X.PIw r7 = r0.A01(r3)
        L2e:
            X.0iw r3 = r14.A01
            X.6cg r1 = X.EnumC142806cg.A04
            X.AbstractC167017dG.A1N(r4, r3)
            X.6l0 r0 = X.AbstractC147746kz.A0A
            X.6kz r1 = r0.A00(r3, r4, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveParticipantLoggerStore"
            X.C14360o3.A0C(r1, r0)
            X.NYW r1 = (X.NYW) r1
            X.PIv r8 = r1.A01
            if (r6 != r2) goto L76
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36325613619393741(0x810df4000834cd, double:3.035802552185524E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 != 0) goto L60
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36325613618934986(0x810df4000134ca, double:3.035802551895405E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L76
        L60:
            r12 = 1
        L61:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325613618869449(0x810df4000034c9, double:3.0358025518539593E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r13 = 1
            if (r0 != 0) goto L70
        L6f:
            r13 = 0
        L70:
            X.Mgl r3 = new X.Mgl
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L76:
            r12 = 0
            if (r6 != r2) goto L6f
            goto L61
        L7a:
            r7 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NDJ.create():X.2bZ");
    }

    public NDJ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        MSZ.A1O(userSession, enumC142806cg);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = enumC142806cg;
    }
}
