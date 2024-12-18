package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.io.Closeables;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.2kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57672kg extends AbstractRunnableC14200nk {
    public final InterfaceC57632kc A00;
    public final String A01;
    public final /* synthetic */ C25301Lk A02;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC60252p8 abstractC60252p8;
        AbstractC60252p8 abstractC60252p82 = null;
        try {
            try {
                C25301Lk c25301Lk = this.A02;
                C59732oG AXI = C25301Lk.A00(c25301Lk).AXI(this.A01);
                if (AXI.A00 != null) {
                    abstractC60252p8 = (AbstractC60252p8) AXI.A00();
                    try {
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = abstractC60252p8.A00.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                sb.append(new String(bArr, 0, read, Charset.forName(ReactWebViewManager.HTML_ENCODING)));
                            }
                        }
                        this.A00.onResult(c25301Lk.A00.E3T(sb.toString()));
                        abstractC60252p82 = abstractC60252p8;
                    } catch (IOException e) {
                        e = e;
                        C0w9.A03("JSONDiskSerializer_Cannot_Read_InputStream", "input stream cannot be read from IgDiskCache");
                        this.A00.DEF(e);
                        Closeables.A01(abstractC60252p8);
                        return;
                    } catch (NullPointerException e2) {
                        e = e2;
                        C0w9.A03("JSONDiskSerializer_Cannot_Parse", "input stream returned null");
                        this.A00.DEF(e);
                        Closeables.A01(abstractC60252p8);
                        return;
                    }
                } else {
                    this.A00.onResult(null);
                }
                Closeables.A01(abstractC60252p82);
            } catch (Throwable th) {
                th = th;
                Closeables.A01(null);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            abstractC60252p8 = null;
        } catch (NullPointerException e4) {
            e = e4;
            abstractC60252p8 = null;
        } catch (Throwable th2) {
            th = th2;
            Closeables.A01(null);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57672kg(InterfaceC57632kc interfaceC57632kc, C25301Lk c25301Lk, String str) {
        super(-14);
        this.A02 = c25301Lk;
        this.A01 = str;
        this.A00 = interfaceC57632kc;
    }
}
