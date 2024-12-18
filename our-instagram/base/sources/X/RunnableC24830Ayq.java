package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ayq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24830Ayq implements Runnable {
    public final /* synthetic */ C1F9 A00;
    public final /* synthetic */ C23484Aaz A01;
    public final /* synthetic */ C1FC A02;
    public final /* synthetic */ File A03;

    public RunnableC24830Ayq(C1F9 c1f9, C23484Aaz c23484Aaz, C1FC c1fc, File file) {
        this.A01 = c23484Aaz;
        this.A03 = file;
        this.A00 = c1f9;
        this.A02 = c1fc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        long currentTimeMillis = System.currentTimeMillis();
        File file = this.A03;
        file.setLastModified(currentTimeMillis);
        C23484Aaz c23484Aaz = this.A01;
        C214099e8 c214099e8 = new C214099e8(this.A02, this.A00.A02, AbstractC166987dD.A0L(currentTimeMillis));
        try {
            try {
                absolutePath = file.getCanonicalPath();
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
            }
            JSONObject EqM = c214099e8.EqM();
            EqM.put("usage_timestamp_s", c214099e8.A00);
            c23484Aaz.A00.A02(absolutePath, EqM);
        } catch (JSONException unused2) {
        }
    }
}
