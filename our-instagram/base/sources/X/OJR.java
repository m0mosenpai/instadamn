package X;

import android.content.Context;
import com.instagram.bugreporter.BugReportComposerViewModel;

/* loaded from: classes9.dex */
public final class OJR {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public OJR(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166997dE.A0p(context, 2131954361);
        String A0K = AbstractC53242c7.A0K(context);
        C14360o3.A07(A0K);
        this.A02 = AbstractC31177DnL.A0b(context, A0K, 2131954347);
        this.A00 = AbstractC166997dE.A0p(context, 2131971483);
        this.A03 = true;
    }

    public final BugReportComposerViewModel A00() {
        return new BugReportComposerViewModel(this.A01, this.A02, this.A00, this.A04, this.A03, this.A05);
    }
}
