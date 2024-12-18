package X;

import android.content.Context;
import java.io.OutputStream;
import java.io.PrintWriter;

/* renamed from: X.OIm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54773OIm {
    public static C54773OIm A03;
    public final PrintWriter A00;
    public final InterfaceC24731Iq A01;
    public final C19L A02;

    public final void finalize() {
        this.A00.close();
        this.A01.AID(null);
    }

    public C54773OIm(Context context) {
        C19K A01 = AbstractC24771Iv.A01(1893943706, 3);
        this.A02 = A01;
        this.A01 = AbstractC25229BEm.A12();
        this.A00 = new PrintWriter((OutputStream) context.getApplicationContext().openFileOutput("mobile_config_usage.csv", 0), true);
        AbstractC166987dD.A1Z(new PZM(this, null, 33), A01);
    }
}
