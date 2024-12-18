package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes9.dex */
public final class NG6 extends AbstractViewOnClickListenerC13340mK {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NG6(EOJ eoj) {
        super(2000L);
        this.A00 = 0;
        this.A01 = eoj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.AbstractViewOnClickListenerC13340mK
    public final void A00(View view) {
        N55 n55;
        C6XJ A02;
        switch (this.A00) {
            case 0:
                FKN fkn = ((EOJ) this.A01).A03;
                if (fkn == null) {
                    return;
                }
                fkn.A01.invoke();
                return;
            case 1:
                N55 n552 = (N55) this.A01;
                ((OKL) n552.A0b.getValue()).A00(C05F.A0C, C05F.A01);
                C12260kU.A0G(n552.requireContext(), AbstractC08820cl.A03("https://www.meta.com/help/smart-glasses/articles/ray-ban-meta/livestream-ray-ban-meta-smart-glasses/"));
                return;
            case 2:
                n55 = (N55) this.A01;
                OKL okl = (OKL) n55.A0b.getValue();
                Integer num = C05F.A01;
                okl.A00(num, num);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("ARGS_DEFAULT_FOLDER_NAME", "Meta View");
                A02 = C6XJ.A02(n55.requireActivity(), A0b, AbstractC166987dD.A0o(n55.A0a), TransparentModalActivity.class, AbstractC111324zv.A00(51));
                A02.A07();
                AbstractC31172DnG.A1M(n55, A02);
                return;
            default:
                n55 = (N55) this.A01;
                ((OKL) n55.A0b.getValue()).A00(C05F.A0N, C05F.A01);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(n55.A0a);
                A02 = AbstractC31171DnF.A0L(n55.requireActivity(), CLH.A00(null, null, null, null, null, null, null, "rbs_live_streaming", null, false, false), A0o, TransparentModalActivity.class, AbstractC111324zv.A00(1208));
                AbstractC31172DnG.A1M(n55, A02);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NG6(N55 n55, int i) {
        super(1000L);
        this.A00 = i;
        this.A01 = n55;
    }
}
