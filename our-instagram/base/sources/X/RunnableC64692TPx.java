package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.TPx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64692TPx implements Runnable {
    public final /* synthetic */ DocumentType A00;
    public final /* synthetic */ C64094SzB A01;
    public final /* synthetic */ boolean A02;

    public RunnableC64692TPx(DocumentType documentType, C64094SzB c64094SzB, boolean z) {
        this.A01 = c64094SzB;
        this.A00 = documentType;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64094SzB c64094SzB = this.A01;
        InterfaceC65547TmM interfaceC65547TmM = (InterfaceC65547TmM) c64094SzB.A0K.get();
        if (interfaceC65547TmM != null) {
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) interfaceC65547TmM;
            float f = AbstractC167007dF.A0K(idCaptureActivity).density;
            DocumentType documentType = this.A00;
            FrameLayout frameLayout = idCaptureActivity.A01;
            C14360o3.A0A(frameLayout);
            int width = frameLayout.getWidth();
            FrameLayout frameLayout2 = idCaptureActivity.A01;
            C14360o3.A0A(frameLayout2);
            int height = frameLayout2.getHeight();
            C14360o3.A0B(documentType, 1);
            Rect A0J = AbstractC58323PtF.A0J(documentType, f, width, height);
            CaptureState captureState = c64094SzB.A04;
            boolean z = this.A02;
            K5I k5i = idCaptureActivity.A04;
            C14360o3.A0A(k5i);
            ContourView contourView = ((K5D) k5i).A0A;
            C14360o3.A0A(contourView);
            contourView.post(new M67(A0J, contourView, captureState, z));
        }
    }
}
