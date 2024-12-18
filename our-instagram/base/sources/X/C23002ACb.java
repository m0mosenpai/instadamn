package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ACb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23002ACb {
    public final AbstractC223899uY A00;
    public final C115475Kh A01;
    public final InterfaceC16820sZ A02;

    public C23002ACb(AbstractC223899uY abstractC223899uY, C115475Kh c115475Kh, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c115475Kh, 2);
        this.A00 = abstractC223899uY;
        this.A01 = c115475Kh;
        this.A02 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        AbstractC223899uY abstractC223899uY;
        C23002ACb c23002ACb;
        C115475Kh c115475Kh;
        int i;
        int i2;
        C23002ACb c23002ACb2;
        C23002ACb c23002ACb3;
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            AbstractC223899uY abstractC223899uY2 = this.A00;
            boolean z = obj instanceof C23002ACb;
            String str = null;
            if (z && (c23002ACb3 = (C23002ACb) obj) != null) {
                abstractC223899uY = c23002ACb3.A00;
            } else {
                abstractC223899uY = null;
            }
            if (C14360o3.A0K(abstractC223899uY2, abstractC223899uY)) {
                C115475Kh c115475Kh2 = this.A01;
                String str2 = c115475Kh2.A0G.A0F;
                if (z && (c23002ACb2 = (C23002ACb) obj) != null) {
                    str = c23002ACb2.A01.A0G.A0F;
                }
                if (!C14360o3.A0K(str2, str) || !z || (c23002ACb = (C23002ACb) obj) == null || (i = c115475Kh2.A09) != (i2 = (c115475Kh = c23002ACb.A01).A09) || c115475Kh2.A08 - i != c115475Kh.A08 - i2) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int A00(UserSession userSession) {
        int i;
        AbstractC223899uY abstractC223899uY = this.A00;
        if (C14360o3.A0K(abstractC223899uY, C219459mt.A00)) {
            return -1;
        }
        if (abstractC223899uY instanceof C219439mr) {
            return ((C219439mr) abstractC223899uY).A00;
        }
        if (abstractC223899uY instanceof C219449ms) {
            int i2 = ((C219449ms) abstractC223899uY).A00;
            C115475Kh c115475Kh = this.A01;
            if (i2 > c115475Kh.A08) {
                i = AnonymousClass827.A00(userSession).A01 * 2;
            } else {
                int i3 = c115475Kh.A09;
                if (i2 < i3) {
                    i = AnonymousClass827.A00(userSession).A01;
                } else {
                    return i2 - i3;
                }
            }
            return i + i2;
        }
        throw B4Z.A00();
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00) * 31;
        C115475Kh c115475Kh = this.A01;
        int A0K = AbstractC166997dE.A0K(c115475Kh.A0G.A0F, A0G);
        int i = c115475Kh.A09;
        return ((A0K + i) * 31) + (c115475Kh.A08 - i);
    }
}
