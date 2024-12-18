package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148956n4 implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        C41768Iek c41768Iek = C41768Iek.A00;
        int i = C41768Iek.A02(userSession, c41768Iek).getInt("product_sticker_tooltip_seen_count", 0);
        InterfaceC19610xo ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
        ARD.E7D("product_sticker_tooltip_seen_count", i + 1);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C144376fJ c144376fJ;
        if (interfaceC143576dw instanceof C143556du) {
            c144376fJ = ((C143556du) interfaceC143576dw).A1R;
        } else if (interfaceC143576dw instanceof C140436Wx) {
            c144376fJ = ((C140436Wx) interfaceC143576dw).A0Q;
        } else {
            return null;
        }
        return C144376fJ.A00(c144376fJ);
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 == false) goto L6;
     */
    @Override // X.InterfaceC148826mr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ejo(com.instagram.common.session.UserSession r6, X.C41181vS r7, X.C41551w4 r8, X.InterfaceC143576dw r9) {
        /*
            r5 = this;
            com.instagram.model.reels.Reel r1 = r8.A0H
            boolean r0 = r1.A0b()
            r4 = 1
            if (r0 == 0) goto Le
            boolean r0 = r1.A1a
            r1 = 1
            if (r0 != 0) goto Lf
        Le:
            r1 = 0
        Lf:
            X.3a5 r0 = X.EnumC75383a5.A0y
            java.util.List r0 = r7.BlY(r0)
            if (r0 == 0) goto L3f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            if (r1 != 0) goto L3f
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            X.Iek r2 = X.C41768Iek.A00
            X.0xq r1 = X.C41768Iek.A02(r6, r2)
            java.lang.String r0 = "product_sticker_tooltip_seen_count"
            int r1 = r1.getInt(r0, r3)
            r0 = 2
            if (r1 >= r0) goto L3f
            X.0xq r1 = X.C41768Iek.A02(r6, r2)
            java.lang.String r0 = "has_entered_pdp_via_product_sticker"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L3f
            return r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148956n4.Ejo(com.instagram.common.session.UserSession, X.1vS, X.1w4, X.6dw):boolean");
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getString(2131970036));
    }
}
