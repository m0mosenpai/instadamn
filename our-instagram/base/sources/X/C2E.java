package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;

/* loaded from: classes5.dex */
public final class C2E extends BYV {
    public final /* synthetic */ C26816Bse A00;

    public C2E(C26816Bse c26816Bse) {
        this.A00 = c26816Bse;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C26816Bse c26816Bse = this.A00;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c26816Bse.A01);
        C14360o3.A0B(A0o, 1);
        String A00 = AbstractC111324zv.A00(371);
        String A0p = AbstractC166997dE.A0p(c26816Bse.requireContext(), 2131952200);
        Bundle A0b = AbstractC166987dD.A0b();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0o);
        igBloksScreenConfig.A0U = A0p;
        IgBloksScreenConfig.A03(A0b, igBloksScreenConfig, false);
        C66273U6s.A02(A0b, new C66273U6s(null, null, A00, null, null, null, AbstractC166987dD.A1E(), null, null, null, 0, false), false);
        C6XJ c6xj = new C6XJ(c26816Bse.requireActivity(), A0b, A0o, ModalActivity.class, "bloks");
        c6xj.A07();
        c6xj.A0C(c26816Bse.requireContext());
    }
}
