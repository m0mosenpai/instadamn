package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.8M2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M2 {
    public final UserSession A00;

    public C8M2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final EnumC92794Ds A01(DirectShareTarget directShareTarget, Boolean bool, Integer num, boolean z, boolean z2) {
        C3o9 c3o9;
        C14360o3.A0B(num, 0);
        C3o9 c3o92 = null;
        if (directShareTarget != null) {
            c3o9 = directShareTarget.A02();
        } else {
            c3o9 = null;
        }
        if (!(c3o9 instanceof MsysThreadId)) {
            if (directShareTarget != null) {
                c3o92 = directShareTarget.A02();
            }
            Boolean A02 = A02(c3o92, bool, num, z, z2);
            if (A02 != null) {
                if (!A02.booleanValue()) {
                    if (directShareTarget != null) {
                        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
                        interfaceC83713oG.getClass();
                        EnumC92794Ds A00 = AbstractC140946Yw.A00(interfaceC83713oG);
                        if (A00 != null) {
                            return A00;
                        }
                    }
                }
            }
            return EnumC92794Ds.A05;
        }
        return EnumC92794Ds.A04;
    }

    public final Boolean A02(C3o9 c3o9, Boolean bool, Integer num, boolean z, boolean z2) {
        DirectThreadKey A02;
        C14360o3.A0B(num, 0);
        if (!(c3o9 instanceof DirectThreadKey) || c3o9 == null || (A02 = JRE.A02(c3o9)) == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC159387Cy.A03(this.A00, A02, bool, num, z, z2, false).A01());
    }

    public static final Map A00(Boolean bool, boolean z, boolean z2) {
        boolean z3;
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        return AbstractC06930Yk.A06(new C09530e4("is_vm", Boolean.valueOf(z3)), new C09530e4(AbstractC111324zv.A00(2620), Boolean.valueOf(z)), new C09530e4(AbstractC111324zv.A00(2621), Boolean.valueOf(z2)));
    }
}
