package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0AK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AK {
    public final Handler A01;
    public final File A02;
    public final Properties A03 = new Properties();
    public char A00 = '!';

    public final synchronized char A00(String str) {
        char c;
        Properties properties = this.A03;
        String property = properties.getProperty(str);
        if (TextUtils.isEmpty(property)) {
            char c2 = this.A00;
            if (c2 != '~') {
                char c3 = (char) (c2 + 1);
                this.A00 = c3;
                properties.setProperty(str, Character.toString(c3));
                this.A01.post(new Runnable() { // from class: X.0AJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2;
                        String str3;
                        C0AK c0ak = C0AK.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(c0ak.A02);
                        sb.append("_entity");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(sb.toString()));
                            try {
                                Properties properties2 = new Properties();
                                synchronized (c0ak) {
                                    properties2.putAll(c0ak.A03);
                                }
                                properties2.store(fileOutputStream, (String) null);
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            str2 = "ForegroundEntityMapper";
                            str3 = "Error saving entity map";
                            C0K8.A0F(str2, str3, e);
                        } catch (AssertionError e2) {
                            e = e2;
                            str2 = "ForegroundEntityMapper";
                            str3 = "Error storing properties";
                            C0K8.A0F(str2, str3, e);
                        }
                    }
                });
                c = this.A00;
            } else {
                c = '!';
            }
        } else {
            c = property.charAt(0);
        }
        return c;
    }

    public C0AK(File file) {
        this.A02 = file;
        HandlerThread handlerThread = new HandlerThread("ForegroundEntityMapper");
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        this.A01 = new Handler(handlerThread.getLooper());
    }
}
