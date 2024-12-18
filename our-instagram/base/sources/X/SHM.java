package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes10.dex */
public final class SHM {
    public final int A00;
    public final File A01;
    public final SWU A02;
    public final File A03;

    public SHM(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = C23161Av.A00(context).AXd(null, 998546933);
        this.A03 = C23161Av.A00(context).AXd(null, 964705811);
        SWU A00 = SWU.A00(context);
        this.A02 = A00;
        this.A00 = A00.A02.getInt("native_version_override", A00.A01);
    }
}
