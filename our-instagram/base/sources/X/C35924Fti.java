package X;

import android.view.ViewGroup;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Fti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35924Fti implements GZZ {
    public final /* synthetic */ C32312ELa A00;

    public C35924Fti(C32312ELa c32312ELa) {
        this.A00 = c32312ELa;
    }

    @Override // X.GZZ
    public final void DGk() {
        C32312ELa c32312ELa = this.A00;
        AbstractC31176DnK.A0K(c32312ELa.A05).A07 = true;
        ViewGroup viewGroup = c32312ELa.A03;
        viewGroup.getClass();
        viewGroup.setVisibility(0);
        SpinnerImageView spinnerImageView = c32312ELa.A0D;
        spinnerImageView.getClass();
        spinnerImageView.setVisibility(8);
        EVM evm = c32312ELa.A06;
        evm.getClass();
        evm.A00();
        C32312ELa.A01(c32312ELa);
    }

    @Override // X.GZZ
    public final void DGl(FOW fow) {
        C32312ELa c32312ELa = this.A00;
        C31825Dyj c31825Dyj = c32312ELa.A07;
        c31825Dyj.A05.CjJ(new Y7A("intro", c31825Dyj.A08, "quick_conversion_settings", null, null, null, null, FTU.A01(fow)));
        if (fow != null) {
            AbstractC31176DnK.A0K(c32312ELa.A05).A03 = FTU.A00(c32312ELa.requireContext(), fow);
            ((BusinessConversionActivity) c32312ELa.A05).A09.getValue();
        }
    }

    @Override // X.GZZ
    public final void DGj(AbstractC115105If abstractC115105If) {
        String A02 = AbstractC151876sX.A02(abstractC115105If);
        String A01 = AbstractC151876sX.A01(abstractC115105If);
        C31825Dyj c31825Dyj = this.A00.A07;
        c31825Dyj.A05.CjK(new Y7A("intro", c31825Dyj.A08, "quick_conversion_settings", A02, A01, null, null, null));
    }
}
