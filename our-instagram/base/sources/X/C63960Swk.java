package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

/* renamed from: X.Swk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63960Swk implements InterfaceC65483Tl0 {
    public final /* synthetic */ C62525SFb A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ File A02;

    @Override // X.InterfaceC65483Tl0
    public final void Dh2(String str) {
        OutputStreamWriter outputStreamWriter;
        try {
            File A0w = MSW.A0w(this.A02, "iab_source.html");
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(A0w), ReactWebViewManager.HTML_ENCODING);
            try {
                try {
                    outputStreamWriter.write(str);
                    C62525SFb c62525SFb = this.A00;
                    Map map = c62525SFb.A02;
                    map.put("html_source_uri", A0w.getAbsolutePath());
                    C63305ShB.A00().A07(c62525SFb.A00, map);
                } catch (Exception unused) {
                    C62525SFb c62525SFb2 = this.A00;
                    C63305ShB.A00().A07(c62525SFb2.A00, c62525SFb2.A02);
                    if (outputStreamWriter == null) {
                        return;
                    }
                    outputStreamWriter.close();
                }
            } finally {
            }
        } catch (Exception unused2) {
            outputStreamWriter = null;
        } catch (Throwable th) {
            throw th;
        }
        try {
            outputStreamWriter.close();
        } catch (IOException unused3) {
        }
    }

    public C63960Swk(C62525SFb c62525SFb, QF6 qf6, File file) {
        this.A01 = qf6;
        this.A02 = file;
        this.A00 = c62525SFb;
    }

    @Override // X.InterfaceC65483Tl0
    public final void onFailure() {
        C62525SFb c62525SFb = this.A00;
        C63305ShB.A00().A07(c62525SFb.A00, c62525SFb.A02);
    }
}
