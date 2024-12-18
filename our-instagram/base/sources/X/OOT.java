package X;

import android.content.Context;
import com.facebook.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class OOT {
    public static final File A00(Context context, File file) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(R.raw.bleep);
            C14360o3.A07(openRawResource);
            FileOutputStream A0x = MSW.A0x(file);
            byte[] bArr = new byte[8192];
            for (int read = openRawResource.read(bArr); read > 0; read = openRawResource.read(bArr)) {
                A0x.write(bArr, 0, read);
            }
            openRawResource.close();
            A0x.close();
            return file;
        } catch (FileNotFoundException | IOException e) {
            AbstractC12120kG.A05("KaraokeBleepAudioConcatInteractor_copyFromRawToFile", "KaraokeBleepConvert_readBytes_exception", e);
            return null;
        }
    }
}
