package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.Q7o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58759Q7o extends C0SG implements TmO, InterfaceC65506Tlb {
    public View A00;
    public InterfaceC65380TjD A01;
    public Q8V A02;
    public TmO A03;
    public InterfaceC65507Tlc A04;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Dialog dialog = super.A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setStatusBarColor(0);
        }
        View requireViewById = view.requireViewById(R.id.progress_bar_layout);
        this.A00 = requireViewById;
        requireViewById.setVisibility(8);
        C63627SqZ.A01(this, this.A02.A00, C63628Sqa.A00(this, 34), 44);
    }

    @Override // X.InterfaceC65506Tlb
    public final void AVf(Bundle bundle, C63152Se0 c63152Se0, Throwable th) {
        InterfaceC65507Tlc interfaceC65507Tlc = this.A04;
        if (interfaceC65507Tlc != null) {
            if (th == null) {
                interfaceC65507Tlc.CyK(new SGB(bundle, c63152Se0, null));
            } else {
                interfaceC65507Tlc.CyJ(th);
            }
        }
        A08();
    }

    @Override // X.TmO
    public final C63152Se0 BLy() {
        return this.A03.BLy();
    }

    @Override // X.TmO
    public final void DHb(Bundle bundle, C63152Se0 c63152Se0) {
        this.A03.DHb(bundle, c63152Se0);
    }

    @Override // X.TmO
    public final void DHc(Throwable th) {
        this.A03.DHc(th);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Dialog A0F = super.A0F(bundle);
        A0F.setOnKeyListener(new DialogInterfaceOnKeyListenerC63430Sk9(this, 1));
        return A0F;
    }

    @Override // X.InterfaceC65506Tlb
    public final void EQ3(InterfaceC65507Tlc interfaceC65507Tlc) {
        this.A04 = interfaceC65507Tlc;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TmO c64186T2s;
        int A02 = C0f9.A02(-250985190);
        super.onCreate(bundle);
        A09(2, R.style.FBPayAuthContainerFullScreenDialog);
        C52942bb c52942bb = new C52942bb(C2FP.A03().A00(), this);
        this.A02 = (Q8V) c52942bb.A00(Q8V.class);
        C58770Q8c c58770Q8c = (C58770Q8c) c52942bb.A00(C58770Q8c.class);
        String A0j = AbstractC31173DnH.A0j(requireArguments(), "AUTH_METHOD_TYPE");
        Q8V q8v = this.A02;
        Bundle requireArguments = requireArguments();
        if (!"PIN".equalsIgnoreCase(A0j) && !"BIO_OR_PIN".equalsIgnoreCase(A0j)) {
            if (!"CSC".equalsIgnoreCase(A0j) && !"PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(A0j)) {
                if ("THREE_DS".equalsIgnoreCase(A0j)) {
                    c64186T2s = new C64183T2p(requireArguments, q8v);
                } else if ("SDC".equalsIgnoreCase(A0j)) {
                    c64186T2s = new C64184T2q(requireArguments, q8v);
                } else {
                    throw AbstractC167007dF.A0c("Not yet Impl! : ", A0j);
                }
            } else {
                c64186T2s = new C64185T2r(requireArguments, q8v);
            }
        } else {
            c64186T2s = new C64186T2s(requireArguments, c58770Q8c, q8v);
        }
        this.A03 = c64186T2s;
        C63627SqZ.A01(this, this.A02.A02, C63628Sqa.A00(this, 31), 44);
        C63627SqZ.A01(this, this.A02.A01, C63628Sqa.A00(this, 32), 44);
        C63627SqZ.A01(this, c58770Q8c.A05, C63628Sqa.A00(this, 33), 44);
        C0f9.A09(1317670437, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1205870356);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.auth_container);
        C0f9.A09(1036948479, A02);
        return A0A;
    }
}
