package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.List;

/* renamed from: X.CzQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29512CzQ implements InterfaceC31002Dk1 {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC31002Dk1
    public final void onFailure(Throwable th) {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 1:
                InterfaceC31002Dk1 interfaceC31002Dk1 = (InterfaceC31002Dk1) this.A01;
                if (interfaceC31002Dk1 == null) {
                    return;
                }
                interfaceC31002Dk1.onFailure(null);
                return;
            case 2:
                interfaceC09390do = ((C26778Brz) this.A01).A09;
                break;
            case 3:
                interfaceC09390do = ((C26820Bsi) this.A01).A03;
                break;
            case 4:
                ((InterfaceC23621Ds) this.A01).resumeWith(new C194848jk(""));
                return;
            default:
                return;
        }
        AbstractC25226BEj.A0x(interfaceC09390do).A06.F8m(C29234Cud.A00);
    }

    public C29512CzQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC31002Dk1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object c194848jk;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                C27959CUd c27959CUd = (C27959CUd) this.A01;
                UserSession userSession = c27959CUd.A01;
                if (C18U.A06(C06090Tz.A05, userSession, 36328250729184644L)) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    Activity activity = c27959CUd.A00;
                    C6XJ c6xj = new C6XJ(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(3667));
                    c6xj.A07();
                    c6xj.A0C(activity);
                    return;
                }
                return;
            case 1:
                InterfaceC31002Dk1 interfaceC31002Dk1 = (InterfaceC31002Dk1) this.A01;
                if (interfaceC31002Dk1 != null) {
                    interfaceC31002Dk1.onSuccess(obj);
                    return;
                }
                return;
            case 2:
                interfaceC09390do = ((C26778Brz) this.A01).A09;
                break;
            case 3:
                interfaceC09390do = ((C26820Bsi) this.A01).A03;
                break;
            case 4:
                OLN oln = (OLN) obj;
                C14360o3.A0B(oln, 0);
                List list = oln.A00;
                boolean A1b = AbstractC166987dD.A1b(list);
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                if (A1b) {
                    c194848jk = AbstractC25225BEi.A0z(new C50679MYx(((C8XE) AbstractC001800i.A0I(list)).A04, ((C8XE) AbstractC001800i.A0I(list)).A06, 31));
                } else {
                    c194848jk = new C194848jk("Empty response from Imagine");
                }
                interfaceC23621Ds.resumeWith(c194848jk);
                return;
            default:
                OLN oln2 = (OLN) obj;
                C14360o3.A0B(oln2, 0);
                C28214CcD c28214CcD = (C28214CcD) this.A01;
                List<C8XE> list2 = oln2.A00;
                C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(877377371, 3));
                for (C8XE c8xe : list2) {
                    int intValue = c8xe.A03.intValue();
                    if (intValue != 1 && intValue != 2 && intValue != 4) {
                        if (intValue == 3 || intValue == 5) {
                            AbstractC166987dD.A1Z(new C57161PZf(c28214CcD.A00, c28214CcD.A01, c8xe.A06, (InterfaceC23621Ds) null, new DSA(8, c8xe, c28214CcD)), A02);
                        }
                    } else {
                        AbstractC166987dD.A1Z(new GSS(c8xe, c28214CcD, null, 31), A02);
                    }
                }
                return;
        }
        C25866BcL A0x = AbstractC25226BEj.A0x(interfaceC09390do);
        AbstractC25231BEo.A1H(A0x, AbstractC141776au.A00(A0x), 44);
        AbstractC25226BEj.A0x(interfaceC09390do).A06.F8m(C29234Cud.A00);
    }
}
