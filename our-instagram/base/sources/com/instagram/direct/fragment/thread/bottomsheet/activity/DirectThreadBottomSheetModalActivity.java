package com.instagram.direct.fragment.thread.bottomsheet.activity;

import X.AbstractC31177DnL;
import X.C32313ELc;
import X.C3DN;
import X.C3DP;
import X.GXV;
import X.InterfaceC08430c6;
import X.InterfaceC37291Gbs;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public final class DirectThreadBottomSheetModalActivity extends TransparentModalActivity implements GXV {
    @Override // X.GXV
    public final C3DN Ahc() {
        GXV gxv;
        InterfaceC08430c6 A0I = AbstractC31177DnL.A0I(this);
        if (!(A0I instanceof GXV) || (gxv = (GXV) A0I) == null) {
            return null;
        }
        return gxv.Ahc();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC47352Fi
    public final C3DN getBottomSheetNavigator() {
        InterfaceC37291Gbs interfaceC37291Gbs;
        InterfaceC08430c6 A0I = AbstractC31177DnL.A0I(this);
        if ((A0I instanceof InterfaceC37291Gbs) && (interfaceC37291Gbs = (InterfaceC37291Gbs) A0I) != null) {
            C32313ELc c32313ELc = (C32313ELc) interfaceC37291Gbs;
            C3DN c3dn = c32313ELc.A00;
            if (c3dn != null && ((C3DP) c3dn).A0h) {
                return c3dn;
            }
            C3DN c3dn2 = c32313ELc.A01;
            if (c3dn2 != null && ((C3DP) c3dn2).A0h) {
                return c3dn2;
            }
        }
        return super.getBottomSheetNavigator();
    }
}
