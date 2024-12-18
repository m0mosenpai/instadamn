package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C160477Hh {
    public final UserSession A00;
    public final C2EE A01;
    public final C7VF A02;
    public final C160557Hp A03;
    public final InterfaceC83713oG A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C160477Hh(X.C160477Hh r11) {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r1 = r11.A00
            boolean r8 = r11.A08
            boolean r9 = r11.A07
            X.0sZ r6 = r11.A05
            X.0sZ r7 = r11.A06
            X.3oG r5 = r11.A04
            X.7VF r3 = r11.A02
            X.2EE r2 = r11.A01
            X.7Hp r4 = r11.A03
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160477Hh.<init>(X.7Hh):void");
    }

    public final C2EY A00() {
        L51 l51;
        C160557Hp c160557Hp = this.A03;
        if (c160557Hp != null && (l51 = c160557Hp.A09) != null) {
            return l51.A02.A01.A0F;
        }
        return null;
    }

    public final boolean A01() {
        C2EE c2ee = this.A01;
        if (c2ee != null && c2ee.CWl()) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        C160557Hp c160557Hp = this.A03;
        if (c160557Hp != null && c160557Hp.A02()) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        DirectThreadKey directThreadKey;
        C2EE c2ee = this.A01;
        C3o9 c3o9 = null;
        if (c2ee != null) {
            c3o9 = c2ee.BKb();
        }
        if ((c3o9 instanceof DirectThreadKey) && (directThreadKey = (DirectThreadKey) c3o9) != null && directThreadKey.A00 != null) {
            return true;
        }
        return false;
    }

    public final boolean A04(Integer num) {
        DirectThreadKey directThreadKey;
        C2EE c2ee = this.A01;
        C3o9 c3o9 = null;
        if (c2ee != null) {
            c3o9 = c2ee.BKb();
        }
        if ((c3o9 instanceof DirectThreadKey) && (directThreadKey = (DirectThreadKey) c3o9) != null) {
            if (AbstractC159387Cy.A03(this.A00, directThreadKey, Boolean.valueOf(this.A07), num, ((Boolean) this.A06.invoke()).booleanValue(), false, false) != EnumC159397Cz.A06) {
                return true;
            }
        }
        return false;
    }

    public C160477Hh(UserSession userSession, C2EE c2ee, C7VF c7vf, C160557Hp c160557Hp, InterfaceC83713oG interfaceC83713oG, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC83713oG, 6);
        C14360o3.A0B(c7vf, 7);
        this.A00 = userSession;
        this.A08 = z;
        this.A07 = z2;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A04 = interfaceC83713oG;
        this.A02 = c7vf;
        this.A01 = c2ee;
        this.A03 = c160557Hp;
    }
}
