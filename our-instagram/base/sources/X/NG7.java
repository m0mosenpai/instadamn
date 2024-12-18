package X;

import android.os.Build;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class NG7 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C56060Ouc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NG7(C56060Ouc c56060Ouc) {
        super(1817138379, 3, false, false);
        this.A00 = c56060Ouc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        try {
            ArrayList A1E = AbstractC166987dD.A1E();
            C56060Ouc c56060Ouc = this.A00;
            List list = c56060Ouc.A03;
            A1E.addAll(list);
            if (new AnonymousClass944(c56060Ouc.A02).A02 && !A1E.isEmpty()) {
                C006802i A0N = AbstractC43592JPx.A0N();
                A0N.markerStart(424099727);
                try {
                    List A0Z = AbstractC001800i.A0Z(A1E);
                    A0N.markerAnnotate(424099727, "number_of_scrolls", c56060Ouc.A00);
                    int A0B = AbstractC50522MSa.A0B(A0Z, 10) - 1;
                    if (A0B >= 0 && A0B < A0Z.size()) {
                        i = AbstractC31176DnK.A01(A0Z, A0B);
                    } else {
                        i = -1;
                    }
                    double d = i;
                    int A0B2 = AbstractC50522MSa.A0B(A0Z, 50) - 1;
                    if (A0B2 >= 0 && A0B2 < A0Z.size()) {
                        i2 = AbstractC31176DnK.A01(A0Z, A0B2);
                    } else {
                        i2 = -1;
                    }
                    double d2 = i2;
                    int A0B3 = AbstractC50522MSa.A0B(A0Z, 90) - 1;
                    if (A0B3 >= 0 && A0B3 < A0Z.size()) {
                        i3 = AbstractC31176DnK.A01(A0Z, A0B3);
                    } else {
                        i3 = -1;
                    }
                    double d3 = i3;
                    double A02 = (AbstractC001800i.A02(A0Z) * 1.0d) / A0Z.size();
                    String str = Build.MODEL;
                    String str2 = Build.MANUFACTURER;
                    C71383Hz c71383Hz = c56060Ouc.A01;
                    int i4 = c71383Hz.A03;
                    int i5 = c71383Hz.A02;
                    double d4 = c71383Hz.A00;
                    double d5 = c71383Hz.A01;
                    double d6 = -1.0d;
                    if (d4 != -1.0d && d5 != -1.0d) {
                        d6 = Math.sqrt((d4 * d4) + (d5 * d5));
                    }
                    A0N.markerAnnotate(424099727, "dy_mean", A02);
                    A0N.markerAnnotate(424099727, "dy_p10", d);
                    A0N.markerAnnotate(424099727, "dy_p50", d2);
                    A0N.markerAnnotate(424099727, "dy_p90", d3);
                    A0N.markerAnnotate(424099727, AbstractC111324zv.A00(133), i4);
                    A0N.markerAnnotate(424099727, AbstractC111324zv.A00(1248), i5);
                    A0N.markerAnnotate(424099727, "x_ppi", d4);
                    A0N.markerAnnotate(424099727, "y_ppi", d5);
                    A0N.markerAnnotate(424099727, "diagonal_ppi", d6);
                    A0N.markerAnnotate(424099727, AbstractC111324zv.A00(386), str);
                    A0N.markerAnnotate(424099727, "device_manufacturer", str2);
                    A0N.markerEnd(424099727, (short) 2);
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    MSY.A1D(A0N, TraceFieldType.FailureReason, message, 424099727);
                }
            }
            list.clear();
            c56060Ouc.A00 = 0;
        } catch (Exception unused) {
        }
    }
}
