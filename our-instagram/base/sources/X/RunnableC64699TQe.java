package X;

import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.TQe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64699TQe implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ ImageStoreManager A02;
    public final /* synthetic */ String A03;

    public RunnableC64699TQe(Callback callback, Callback callback2, ImageStoreManager imageStoreManager, String str) {
        this.A02 = imageStoreManager;
        this.A03 = str;
        this.A01 = callback;
        this.A00 = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InputStream openInputStream = AbstractC58321PtD.A0b(this.A02).getContentResolver().openInputStream(android.net.Uri.parse(this.A03));
            C14360o3.A0C(openInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    Callback callback = this.A01;
                    C14360o3.A0B(openInputStream, 0);
                    ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(A0U, 2);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        try {
                            int read = openInputStream.read(bArr);
                            if (read > -1) {
                                base64OutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            try {
                                base64OutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    callback.invoke(AbstractC166987dD.A19(A0U));
                } catch (IOException e) {
                    this.A00.invoke(e.getMessage());
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException unused3) {
                }
            }
        } catch (FileNotFoundException e2) {
            AbstractC58321PtD.A1K(this.A00, e2.getMessage());
        }
    }
}
