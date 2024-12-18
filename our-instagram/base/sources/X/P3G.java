package X;

import android.view.View;
import com.instagram.modal.ModalActivity;

/* loaded from: classes9.dex */
public final class P3G implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public P3G(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                interfaceC16820sZ = ((C54720OEx) this.A01).A07;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
            case 1:
            case 2:
            default:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return;
            case 3:
                return;
            case 4:
                N7K n7k = (N7K) this.A01;
                n7k.A0E.getValue();
                OLM olm = (OLM) n7k.A0D.getValue();
                String str = n7k.A07;
                AbstractC167017dG.A1N(olm, str);
                olm.A02("upsell_snackbar", str, "comment_block_comments_from", "block_account_review");
                AbstractC12990ll A0o = AbstractC166987dD.A0o(n7k.A0A);
                MSX.A18(n7k, AbstractC31171DnF.A0L(n7k.getActivity(), AbstractC166987dD.A0b(), A0o, ModalActivity.class, AbstractC111324zv.A00(4015)));
                return;
            case 5:
                C1XH A00 = FB6.A00();
                C26764Brl c26764Brl = (C26764Brl) this.A01;
                A00.A05(c26764Brl.requireActivity(), AbstractC166987dD.A0r(c26764Brl.A05));
                return;
            case 6:
                C23031Ai c23031Ai = ((C53073Ndm) this.A01).A0A;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A7K, C23031Ai.A8c, 270, true);
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (3 - this.A00 == 0) {
            ((AbstractC50987Mfu) ((C56163OwV) this.A01).A0I.getValue()).A01 = false;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (3 - this.A00 == 0) {
            ((AbstractC50987Mfu) ((C56163OwV) this.A01).A0I.getValue()).A01 = true;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
