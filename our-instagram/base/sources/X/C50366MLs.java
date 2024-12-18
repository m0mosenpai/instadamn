package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.MLs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50366MLs extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50366MLs(UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = directShareTarget;
        this.A02 = userSession;
        switch (i) {
            case 2:
            case 3:
            case 4:
                this.A03 = str;
                this.A04 = str2;
                this.A05 = str3;
                break;
            default:
                this.A05 = str;
                this.A03 = str2;
                this.A04 = str3;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C62991SaF c62991SaF;
        SJJ sjj;
        String str2;
        switch (this.A00) {
            case 0:
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                if (C63406Sjd.A0J(c63406Sjd)) {
                    c62991SaF = C2FP.A01().A0E;
                    sjj = (SJJ) this.A01;
                    Object obj2 = c63406Sjd.A01;
                    obj2.getClass();
                    str2 = (String) obj2;
                } else {
                    if (!C63406Sjd.A0G(c63406Sjd)) {
                        return null;
                    }
                    c62991SaF = C2FP.A01().A0E;
                    sjj = (SJJ) this.A01;
                    str2 = this.A03;
                    C14360o3.A0A(str2);
                }
                return c62991SaF.A02(((Q8g) this.A02).A0A.A04(null, true), sjj, str2, this.A04, this.A05);
            case 1:
                InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
                C14360o3.A0B(interfaceC113515Ao, 0);
                AbstractC113575Au.A03(interfaceC113515Ao, this.A04);
                AbstractC113575Au.A02(interfaceC113515Ao, 0);
                int ordinal = ((C7E) this.A02).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        str = null;
                    } else {
                        str = this.A03;
                    }
                } else {
                    str = this.A05;
                }
                AbstractC113575Au.A04(interfaceC113515Ao, str, new C50154MDh(this.A01, 5));
                return C0eB.A00;
            case 2:
                InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A01;
                boolean z = false;
                if (interfaceC83713oG instanceof InterfaceC2056098k) {
                    directShareTarget = new DirectShareTarget(interfaceC83713oG, AbstractC31178DnM.A0R(directShareTarget, 0));
                }
                if (!(interfaceC83713oG instanceof C23974Ak9)) {
                    z = C35143Fek.A00.A01((UserSession) this.A02, directShareTarget);
                }
                AbstractC140396Wt.A01((UserSession) this.A02, directShareTarget.A01()).ENS(directShareTarget, this.A03, this.A04, this.A05, z);
                return C0eB.A00;
            case 3:
                InterfaceC83713oG interfaceC83713oG2 = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A01;
                boolean z2 = false;
                if (interfaceC83713oG2 instanceof InterfaceC2056098k) {
                    directShareTarget2 = new DirectShareTarget(interfaceC83713oG2, AbstractC31178DnM.A0R(directShareTarget2, 0));
                }
                if (!(interfaceC83713oG2 instanceof C23974Ak9)) {
                    z2 = C35143Fek.A00.A01((UserSession) this.A02, directShareTarget2);
                }
                AbstractC140396Wt.A01((UserSession) this.A02, directShareTarget2.A01()).EO2(directShareTarget2, this.A03, this.A04, this.A05, z2);
                return C0eB.A00;
            case 4:
                InterfaceC83713oG interfaceC83713oG3 = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget3 = (DirectShareTarget) this.A01;
                boolean z3 = false;
                if (interfaceC83713oG3 instanceof InterfaceC2056098k) {
                    directShareTarget3 = new DirectShareTarget(interfaceC83713oG3, AbstractC31178DnM.A0R(directShareTarget3, 0));
                }
                if (!(interfaceC83713oG3 instanceof C23974Ak9)) {
                    z3 = C35143Fek.A00.A01((UserSession) this.A02, directShareTarget3);
                }
                AbstractC140396Wt.A01((UserSession) this.A02, directShareTarget3.A01()).EO9(directShareTarget3, this.A03, this.A04, this.A05, z3);
                return C0eB.A00;
            default:
                InterfaceC83713oG interfaceC83713oG4 = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget4 = (DirectShareTarget) this.A01;
                boolean z4 = false;
                if (interfaceC83713oG4 instanceof InterfaceC2056098k) {
                    directShareTarget4 = new DirectShareTarget(interfaceC83713oG4, AbstractC31178DnM.A0R(directShareTarget4, 0));
                }
                if (!(interfaceC83713oG4 instanceof C23974Ak9)) {
                    z4 = C35143Fek.A00.A01((UserSession) this.A02, directShareTarget4);
                }
                AbstractC140396Wt.A01((UserSession) this.A02, directShareTarget4.A01()).EOq(directShareTarget4, this.A05, this.A03, this.A04, z4);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50366MLs(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A05 = str2;
        this.A03 = str3;
    }
}
