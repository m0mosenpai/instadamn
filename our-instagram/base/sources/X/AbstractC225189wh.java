package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.9wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225189wh {
    public static File A00(Context context, String str, String str2) {
        File cacheDir = context.getCacheDir();
        AssetManager assets = context.getAssets();
        File file = new File(cacheDir, str2);
        try {
            InputStream open = assets.open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1048576];
                    while (true) {
                        int read = open.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            return file;
                        }
                    }
                } finally {
                    fileOutputStream.close();
                }
            } finally {
                open.close();
            }
        } catch (IOException e) {
            throw new IOException(AnonymousClass001.A0R("Could not open ", str), e);
        }
    }
}
