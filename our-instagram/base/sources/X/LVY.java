package X;

import android.app.Activity;
import android.app.Dialog;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.arlink.ui.NametagCardHintView;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LVY implements InterfaceC1814282u {
    public final int A00;
    public final Object A01;

    public LVY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1814282u
    public final void DEf(Exception exc) {
        if (this.A00 != 0) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
            viewOnClickListenerC44269JhH.A0C = true;
            ViewOnClickListenerC44269JhH.A03(viewOnClickListenerC44269JhH);
            AbstractC167007dF.A15(C18950wb.A01.AEp("InAppCaptureView.CameraInitialisationError", 817904119), DialogModule.KEY_MESSAGE, "An exception occurred attempting to connect the camera.", exc);
            return;
        }
        if (exc == null) {
            return;
        }
        C0w9.A03("Camera initialization failure.", Arrays.deepToString(exc.getStackTrace()));
    }

    @Override // X.InterfaceC1814282u
    public final void DM7(C177447ue c177447ue) {
        if (this.A00 != 0) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
            C174757qB c174757qB = viewOnClickListenerC44269JhH.A0Y;
            c174757qB.A0I(new C45327K4f(viewOnClickListenerC44269JhH, 5));
            viewOnClickListenerC44269JhH.A0A = Integer.valueOf(c177447ue.A01);
            viewOnClickListenerC44269JhH.A0b.setBackground(null);
            Integer num = viewOnClickListenerC44269JhH.A0A;
            boolean z = true;
            if (num == null || 1 != num.intValue()) {
                z = false;
            }
            int i = 0;
            if (z) {
                c174757qB.A0J(viewOnClickListenerC44269JhH.A0V, 0);
            } else {
                C23031Ai A00 = AbstractC23021Ah.A00(viewOnClickListenerC44269JhH.A0a);
                if (AbstractC208929Ma.A00((String) AbstractC31171DnF.A0Y(A00, A00.A1I, C23031Ai.A8c, 25)) != 0) {
                    i = 1;
                    if (viewOnClickListenerC44269JhH.A06 == EnumC44287Jhd.A02) {
                        i = 3;
                    }
                }
                viewOnClickListenerC44269JhH.setFlashMode(i);
            }
            ViewOnClickListenerC44269JhH.A04(viewOnClickListenerC44269JhH);
            return;
        }
        KFD kfd = (KFD) this.A01;
        synchronized (kfd) {
            if (kfd.A02 == null) {
                kfd.A02 = new C47957LGt(kfd, kfd.A0R, kfd.A0S);
            }
            Activity activity = kfd.A0H;
            if (!AbstractC15820qc.A0E(activity)) {
                Dialog dialog = kfd.A00;
                if (dialog == null) {
                    C193328hC A0H = AbstractC31171DnF.A0H(activity);
                    A0H.A0A(2131968573);
                    A0H.A09(2131971208);
                    A0H.A0J(null, 2131960994);
                    dialog = A0H.A02();
                    kfd.A00 = dialog;
                }
                if (!dialog.isShowing()) {
                    C0fJ.A00(kfd.A00);
                }
            }
            kfd.A02.A02();
            NametagCardHintView nametagCardHintView = kfd.A0Q;
            if (nametagCardHintView.getVisibility() == 4) {
                nametagCardHintView.setVisibility(0);
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le A01 = AbstractC125325le.A01(nametagCardHintView, 0);
                A01.A0M(0.0f, 1.0f);
                A01.A0A().A0H();
            }
        }
        kfd.A07();
    }
}
