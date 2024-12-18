package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;

/* renamed from: X.R7d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60562R7d extends AbstractC44444JlB {
    public EnumC61111RfR A00;
    public IdCaptureLogger A01;
    public IdCaptureUi A02;
    public S5Q A03;
    public boolean A04;
    public Bundle A05;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof InterfaceC65659Tqp) {
            IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) ((InterfaceC65659Tqp) context);
            idCaptureBaseActivity.A01().A01();
            this.A02 = idCaptureBaseActivity.A07;
            this.A01 = idCaptureBaseActivity.A02();
            this.A03 = idCaptureBaseActivity.A08;
            this.A05 = idCaptureBaseActivity.A01().A03;
            EnumC61111RfR A00 = idCaptureBaseActivity.A01().A00();
            C14360o3.A07(A00);
            this.A00 = A00;
            this.A04 = idCaptureBaseActivity.A01().A0I;
            C14360o3.A07(idCaptureBaseActivity.A01().A03());
        }
    }
}
