package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.3Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73883Sx extends C3OO {
    public final View A00;
    public final SpinnerImageView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73883Sx(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.loading_spinner_view);
        C14360o3.A07(requireViewById);
        SpinnerImageView spinnerImageView = (SpinnerImageView) requireViewById;
        this.A01 = spinnerImageView;
        spinnerImageView.setLoadingStatus(C3T1.LOADING);
    }

    public final void A00(InterfaceC61272qp interfaceC61272qp) {
        SpinnerImageView spinnerImageView = this.A01;
        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
        spinnerImageView.setOnClickListener(null);
        if (interfaceC61272qp.CKt()) {
            spinnerImageView.setLoadingStatus(C3T1.FAILED);
            C0fQ.A00(new ViewOnClickListenerC55378Oio(interfaceC61272qp, this), spinnerImageView);
        } else {
            if (!interfaceC61272qp.CLh()) {
                return;
            }
            spinnerImageView.setLoadingStatus(C3T1.LOADING);
        }
    }
}
