package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GIv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36772GIv implements InterfaceC37188GZz {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC37188GZz
    public final void Dit() {
    }

    public C36772GIv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        boolean isEmpty;
        switch (this.A00) {
            case 2:
                C38976HEe c38976HEe = ((C38925HBx) this.A01).A01;
                if (c38976HEe != null) {
                    isEmpty = c38976HEe.A03.isEmpty();
                    return !isEmpty;
                }
                break;
            case 3:
                EQM eqm = ((ENS) this.A01).A00;
                if (eqm != null) {
                    isEmpty = eqm.A0R.isEmpty();
                    return !isEmpty;
                }
                break;
            default:
                isEmpty = ((ELn) this.A01).A0A().isEmpty();
                return !isEmpty;
        }
        AbstractC31171DnF.A0t();
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        String str;
        switch (this.A00) {
            case 0:
                C33151Eju c33151Eju = (C33151Eju) this.A01;
                C31543DtT c31543DtT = c33151Eju.A01;
                str = "suggestedUsersPaginationHelper";
                if (c31543DtT != null) {
                    c31543DtT.A02 = true;
                    String str2 = c33151Eju.A02;
                    if (str2 != null) {
                        AbstractC166987dD.A1Z(new C50120MBu(c33151Eju, str2, null, 30), C07Y.A00(c33151Eju));
                        return;
                    }
                    Context requireContext = c33151Eju.requireContext();
                    C08790ch A00 = AbstractC018607g.A00(c33151Eju);
                    InterfaceC09390do interfaceC09390do = c33151Eju.A09;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    C31543DtT c31543DtT2 = c33151Eju.A01;
                    if (c31543DtT2 != null) {
                        C32548EUy.A00(requireContext, A00, FTd.A00(A0r, 40, c31543DtT2.A00, true, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36319871248178910L)), c33151Eju, 36);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                C33149Ejs c33149Ejs = (C33149Ejs) this.A01;
                C31543DtT c31543DtT3 = c33149Ejs.A02;
                str = "suggestedUsersPaginationHelper";
                if (c31543DtT3 != null) {
                    c31543DtT3.A02 = true;
                    Context requireContext2 = c33149Ejs.requireContext();
                    C08790ch A002 = AbstractC018607g.A00(c33149Ejs);
                    UserSession A0r2 = AbstractC166987dD.A0r(c33149Ejs.A06);
                    C31543DtT c31543DtT4 = c33149Ejs.A02;
                    if (c31543DtT4 != null) {
                        C32548EUy.A00(requireContext2, A002, FTd.A00(A0r2, 40, c31543DtT4.A00, false, true), c33149Ejs, 40);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                C38925HBx c38925HBx = (C38925HBx) this.A01;
                C25846Bc1 c25846Bc1 = (C25846Bc1) c38925HBx.A0B.getValue();
                C31543DtT c31543DtT5 = c38925HBx.A03;
                if (c31543DtT5 != null) {
                    c25846Bc1.A00(c31543DtT5.A00);
                    return;
                }
                str = "paginationHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                ENS ens = (ENS) this.A01;
                C31830Dyo c31830Dyo = (C31830Dyo) ens.A09.getValue();
                String A15 = AbstractC25225BEi.A15(ens.A02);
                String A152 = AbstractC25225BEi.A15(ens.A04);
                C31543DtT c31543DtT6 = ens.A01;
                if (c31543DtT6 != null) {
                    c31830Dyo.A00(c31543DtT6, A15, A152);
                    return;
                }
                str = "paginationHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
