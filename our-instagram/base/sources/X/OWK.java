package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.bugreporter.model.BugReport;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes9.dex */
public final class OWK {
    public static final OWK A00 = new Object();
    public static final AbstractC73763Sg A01 = C5KX.A00(C57619PhV.A00, AbstractC73763Sg.A03);

    public final Object A00(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID")) {
            String string = bundle.getString("BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID");
            if (string != null) {
                File A0w = MSW.A0w(new OVY(string).A00(), "metadata");
                A0w.mkdirs();
                File A0w2 = MSW.A0w(A0w, "bugreport.json");
                if (!A0w2.exists()) {
                    RuntimeException A0d = MSY.A0d("File does not exist: ", A0w2.getPath());
                    C14360o3.A0B(A0d, 0);
                    return MSW.A1D(A0d);
                }
                try {
                    AbstractC73763Sg abstractC73763Sg = A01;
                    String A06 = AbstractC57194Pae.A06(A0w2, C15W.A05);
                    C3R9[] c3r9Arr = BugReport.A0P;
                    return (BugReport) abstractC73763Sg.A00(A06, C57114PVd.A00);
                } catch (Throwable th) {
                    return MSW.A1D(th);
                }
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        try {
            Parcelable parcelable = bundle.getParcelable("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
            if (parcelable != null) {
                return parcelable;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        } catch (RuntimeException e) {
            return MSW.A1D(e);
        }
    }

    public final void A01(Intent intent, BugReport bugReport, AbstractC12990ll abstractC12990ll) {
        if (C18U.A06(AbstractC25225BEi.A0j(bugReport, 1), abstractC12990ll, 36327795462388594L)) {
            String str = bugReport.A0G;
            C14360o3.A0B(str, 0);
            File A0w = MSW.A0w(new OVY(str).A00(), "metadata");
            A0w.mkdirs();
            FileOutputStream A0x = MSW.A0x(MSW.A0w(A0w, "bugreport.json"));
            try {
                A0x.write(MSY.A1a(A01.A02(bugReport, C57114PVd.A00)));
                A0x.close();
                intent.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT_ID", str);
            } finally {
            }
        } else {
            intent.putExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT", bugReport);
        }
    }
}
