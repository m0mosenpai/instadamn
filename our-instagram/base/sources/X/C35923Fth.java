package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Fth, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35923Fth implements GZZ {
    public final /* synthetic */ ELW A00;

    public C35923Fth(ELW elw) {
        this.A00 = elw;
    }

    @Override // X.GZZ
    public final void DGj(AbstractC115105If abstractC115105If) {
        ELW elw = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = elw.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        businessFlowAnalyticsLogger.CjK(new Y7A("renew", elw.A03, "quick_conversion_settings", AbstractC151876sX.A02(abstractC115105If), AbstractC151876sX.A01(abstractC115105If), null, null, null));
        ELW.A00(elw);
    }

    @Override // X.GZZ
    public final void DGk() {
        String str;
        ELW elw = this.A00;
        InterfaceC37222GaX interfaceC37222GaX = elw.A01;
        if (interfaceC37222GaX == null) {
            str = "controller";
        } else {
            AbstractC31176DnK.A0K(interfaceC37222GaX).A07 = true;
            SpinnerImageView spinnerImageView = elw.A02;
            if (spinnerImageView == null) {
                str = "loadingSpinner";
            } else {
                spinnerImageView.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GZZ
    public final void DGl(FOW fow) {
        String str;
        ELW elw = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = elw.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.CjJ(new Y7A("renew", elw.A03, "quick_conversion_settings", null, null, null, null, FTU.A01(fow)));
            if (fow != null) {
                InterfaceC37222GaX interfaceC37222GaX = elw.A01;
                str = "controller";
                if (interfaceC37222GaX != null) {
                    AbstractC31176DnK.A0K(interfaceC37222GaX).A03 = FTU.A00(elw.requireContext(), fow);
                    InterfaceC37222GaX interfaceC37222GaX2 = elw.A01;
                    if (interfaceC37222GaX2 != null) {
                        ((BusinessConversionActivity) interfaceC37222GaX2).A09.getValue();
                    }
                }
            }
            ELW.A00(elw);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
