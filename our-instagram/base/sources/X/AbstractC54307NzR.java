package X;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: X.NzR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54307NzR {
    public static final String A00(Resources resources, int i) {
        C14360o3.A0B(resources, 0);
        InputStream openRawResource = resources.openRawResource(i);
        C14360o3.A07(openRawResource);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        StringBuilder A1C = AbstractC166987dD.A1C();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    A1C.append(readLine);
                    A1C.append("\n");
                } else {
                    bufferedReader.close();
                    return AbstractC166987dD.A19(A1C);
                }
            } catch (IOException unused) {
                throw AbstractC166987dD.A18("failed to read raw resource");
            }
        }
    }
}
