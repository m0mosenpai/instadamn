package X;

import android.os.Bundle;

/* renamed from: X.EKc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32289EKc extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DataDownloadBaseFragment";
    public AbstractC18680vv A00;

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC10360h2 parentFragmentManager;
        if (this instanceof C33157Ek0) {
            C33157Ek0 c33157Ek0 = (C33157Ek0) this;
            AbstractC13880nE.A0O(c33157Ek0.A02);
            parentFragmentManager = c33157Ek0.getParentFragmentManager();
        } else {
            if (this instanceof C33156Ejz) {
                AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
                if (abstractC10360h2 != null && abstractC10360h2.A0L() > 0 && !abstractC10360h2.A0G) {
                    abstractC10360h2.A18(null, 1);
                    return true;
                }
                AbstractC31177DnL.A12(this);
                return true;
            }
            parentFragmentManager = getParentFragmentManager();
        }
        parentFragmentManager.A12();
        return true;
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963155);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35689FpO.A00(this, 59), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1449483412);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0R(this);
        EVO.A00(this);
        C0f9.A09(1114717213, A02);
    }
}
