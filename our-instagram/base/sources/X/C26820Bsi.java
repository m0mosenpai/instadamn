package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Bsi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26820Bsi extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MemuUploadedPhotosFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final View.OnClickListener A04;
    public final String A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A00 = interfaceC56362iU;
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966254);
        A00((C45124Jxt) AbstractC25226BEj.A0x(this.A03).A08.getValue(), this);
    }

    public static final void A00(C45124Jxt c45124Jxt, C26820Bsi c26820Bsi) {
        InterfaceC56362iU interfaceC56362iU = c26820Bsi.A00;
        if (interfaceC56362iU != null) {
            int i = 2131973219;
            if (c45124Jxt.A00) {
                i = 2131954754;
            }
            ((C56352iT) interfaceC56362iU).Ehb(c26820Bsi.A04, null, null, i);
            interfaceC56362iU.ARk(0, AbstractC25228BEl.A1X(c45124Jxt.A05));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C05A c05a = AbstractC25226BEj.A0x(this.A03).A07;
        ArrayList A0U = AbstractC001800i.A0U((Collection) ((C45124Jxt) c05a.getValue()).A05);
        ArrayList A0q = AbstractC167017dG.A0q(A0U);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            BJF bjf = (BJF) it.next();
            String str = bjf.A01;
            String str2 = bjf.A02;
            AbstractC167007dF.A1K(str, str2);
            A0q.add(new BJF(str, str2, 2, false));
        }
        C45124Jxt c45124Jxt = (C45124Jxt) c05a.getValue();
        C5Hc A00 = AbstractC133095zb.A00(A0q);
        boolean z = c45124Jxt.A01;
        c05a.F8m(C45124Jxt.A00((C7T) c45124Jxt.A04, (Boolean) c45124Jxt.A03, A00, z, false));
        return false;
    }

    public C26820Bsi() {
        C0YZ A1D = AbstractC25225BEi.A1D(C25866BcL.class);
        this.A03 = AbstractC25225BEi.A0a(new DGV(this, 49), new C57242PbQ(this, 0), new DH0(40, null, this), A1D);
        this.A04 = new ViewOnClickListenerC28667ClF(this, 40);
        this.A01 = C1XM.A00(new DGV(this, 47));
        this.A02 = AbstractC60492pY.A02(this);
        this.A05 = "gen_ai_memu_uploaded_photos";
    }

    public static final void A01(C26820Bsi c26820Bsi) {
        Activity rootActivity = c26820Bsi.getRootActivity();
        if (rootActivity != null) {
            new C27959CUd(rootActivity, AbstractC166987dD.A0r(c26820Bsi.A02)).A01(new CWL(C8k.SETTINGS, null, C05F.A0N, AbstractC25231BEo.A0p(), null, null, null, null, false, true, false), new C29512CzQ(c26820Bsi, 3));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1261013104);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 13), 146902125);
        C0f9.A09(-85727628, A02);
        return A00;
    }
}
