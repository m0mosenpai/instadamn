package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.9zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226929zo {
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.AbH] */
    public static final C23501AbH A00(Context context, String str) {
        String A00;
        C14360o3.A0B(str, 1);
        try {
            File createTempFile = File.createTempFile(AnonymousClass001.A0Q("audio-effect-", System.currentTimeMillis()), RealtimeLogsProvider.LOG_SUFFIX);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                InputStream open = context.getAssets().open(str);
                try {
                    C14360o3.A0A(open);
                    AbstractC54919OQu.A00(open, fileOutputStream);
                    if (open != null) {
                        open.close();
                    }
                    fileOutputStream.close();
                    String path = createTempFile.getPath();
                    ?? obj = new Object();
                    obj.A00 = path;
                    return obj;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException e) {
            e = e;
            A00 = AnonymousClass001.A0R("Unable to open temp file ", str);
            AbstractC12120kG.A05("AudioEffectUtil_toFbaAudioEffect", A00, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            A00 = MSV.A00(168);
            AbstractC12120kG.A05("AudioEffectUtil_toFbaAudioEffect", A00, e);
            return null;
        }
    }
}
