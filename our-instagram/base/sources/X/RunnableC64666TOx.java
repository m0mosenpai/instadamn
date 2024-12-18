package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.TOx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64666TOx implements Runnable {
    public final /* synthetic */ Rb5 A00;
    public final /* synthetic */ String A01;

    public RunnableC64666TOx(Rb5 rb5, String str) {
        this.A00 = rb5;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Rb5 rb5 = this.A00;
        SpinnerImageView spinnerImageView = rb5.A03;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setVisibility(8);
            C69797Vvh c69797Vvh = new C69797Vvh(rb5.requireContext());
            c69797Vvh.A02(2131954308);
            c69797Vvh.A01(2131954307);
            c69797Vvh.A06(DialogInterfaceOnClickListenerC63425Sk3.A00, "dismiss");
            C0fJ.A00(c69797Vvh.A00());
            C56352iT.A0t.A03(rb5.requireActivity()).ARk(0, true);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("FAILED_SAVE");
            A1C.append(this.A01);
            C62708SMw c62708SMw = rb5.A02;
            if (c62708SMw == null) {
                str = "holder";
            } else {
                Rb5.A02(rb5, AbstractC166997dE.A0v(c62708SMw.A00(), A1C));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
