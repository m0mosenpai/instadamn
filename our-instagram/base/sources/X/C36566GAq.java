package X;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Status;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;

/* renamed from: X.GAq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36566GAq implements GY1 {
    public final /* synthetic */ C07270a1 A00;
    public final /* synthetic */ C53414Nk3 A01;
    public final /* synthetic */ AymhViewModel A02;

    @Override // X.GY1
    public final void CIz(FragmentActivity fragmentActivity) {
        C14360o3.A0B(fragmentActivity, 0);
        Throwable cause = this.A01.getCause();
        C14360o3.A0C(cause, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
        Status status = ((Rk3) cause).A00;
        status.A00(fragmentActivity, 64206);
        C07270a1 c07270a1 = this.A00;
        C63378Siq.A00(status, c07270a1, "aymh", C83743oJ.A01(c07270a1).A05().size(), true);
    }

    public C36566GAq(C07270a1 c07270a1, C53414Nk3 c53414Nk3, AymhViewModel aymhViewModel) {
        this.A01 = c53414Nk3;
        this.A02 = aymhViewModel;
        this.A00 = c07270a1;
    }
}
