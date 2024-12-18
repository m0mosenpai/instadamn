package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148976n6 implements InterfaceC148826mr {
    public boolean A00;
    public boolean A01;

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        View view;
        C14360o3.A0B(interfaceC143576dw, 0);
        if (this.A00) {
            view = interfaceC143576dw.C9J();
        } else {
            view = null;
        }
        if (this.A01) {
            return interfaceC143576dw.C9I();
        }
        return view;
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131971937);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        if (this.A00) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E77("story_promote_seen_tooltip", true);
            ARD.apply();
            this.A00 = false;
        }
        if (this.A01) {
            InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD2.E77("story_promote_button_seen_tooltip", true);
            ARD2.apply();
            this.A01 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (X.AbstractC23021Ah.A00(r4).A01.getBoolean("story_promote_button_seen_tooltip", false) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (X.AbstractC23021Ah.A00(r4).A01.getBoolean("story_promote_seen_tooltip", false) != false) goto L8;
     */
    @Override // X.InterfaceC148826mr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ejo(com.instagram.common.session.UserSession r4, X.C41181vS r5, X.C41551w4 r6, X.InterfaceC143576dw r7) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 3
            X.C14360o3.A0B(r7, r0)
            android.view.View r0 = r7.C9J()
            if (r0 == 0) goto L28
            android.view.View r0 = r7.C9I()
            if (r0 != 0) goto L28
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_seen_tooltip"
            r0 = 0
            boolean r1 = r2.getBoolean(r1, r0)
            r0 = 1
            if (r1 == 0) goto L29
        L28:
            r0 = 0
        L29:
            r3.A00 = r0
            android.view.View r0 = r7.C9I()
            if (r0 == 0) goto L41
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_button_seen_tooltip"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r1 = 1
            if (r0 == 0) goto L42
        L41:
            r1 = 0
        L42:
            r3.A01 = r1
            boolean r0 = r3.A00
            if (r0 != 0) goto L4a
            if (r1 == 0) goto L85
        L4a:
            X.1qM r2 = r5.A0b
            X.0sy r0 = X.C08730cb.A00(r4)
            com.instagram.user.model.User r1 = r0.A00()
            if (r2 == 0) goto L85
            com.instagram.user.model.User r0 = r2.A2E(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L85
            boolean r0 = r1.A1J()
            if (r0 == 0) goto L85
            X.He7 r0 = r2.A1b()
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L85
            r0 = 2
            if (r1 == r0) goto L85
            r0 = 4
            if (r1 == r0) goto L85
            r0 = 6
            if (r1 == r0) goto L85
            r0 = 11
            if (r1 == r0) goto L85
            boolean r0 = X.BH3.A00(r4)
            r1 = 1
            if (r0 != 0) goto L86
        L85:
            r1 = 0
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148976n6.Ejo(com.instagram.common.session.UserSession, X.1vS, X.1w4, X.6dw):boolean");
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
