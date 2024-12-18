package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WVD implements InterfaceC58742mX {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.68V, java.lang.Object] */
    @Override // X.InterfaceC58742mX
    public final /* bridge */ /* synthetic */ Object AK1(File file) {
        if (file != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] A00 = C15V.A00(fileInputStream);
                    fileInputStream.close();
                    ByteBuffer wrap = ByteBuffer.wrap(A00);
                    if (wrap != null) {
                        UOQ uoq = new UOQ(new Object().A00(wrap), wrap);
                        return C1VO.A00(C1VO.A05, C1VO.A06, uoq);
                    }
                } finally {
                }
            } catch (FileNotFoundException | SecurityException | Exception unused) {
            }
        }
        return null;
    }
}
