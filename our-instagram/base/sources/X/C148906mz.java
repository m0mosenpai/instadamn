package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148906mz implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return ((C143556du) interfaceC143576dw).A19.A02.getView();
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getString(2131956880));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        int i = interfaceC19630xq.getInt("story_countdown_tooltip_impression_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("story_countdown_tooltip_impression_count", i);
        ARD.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.InterfaceC148826mr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ejo(com.instagram.common.session.UserSession r5, X.C41181vS r6, X.C41551w4 r7, X.InterfaceC143576dw r8) {
        /*
            r4 = this;
            X.AlC r2 = X.AbstractC141456aO.A00(r6)
            X.1qM r0 = r6.A0b
            r3 = 1
            if (r0 == 0) goto L10
            boolean r1 = r0.CdW()
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L40
            boolean r0 = X.AbstractC141456aO.A03(r2)
            if (r0 == 0) goto L40
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "has_ever_tapped_on_story_countdown"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L40
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "story_countdown_tooltip_impression_count"
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 >= r0) goto L40
            return r3
        L40:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148906mz.Ejo(com.instagram.common.session.UserSession, X.1vS, X.1w4, X.6dw):boolean");
    }
}
