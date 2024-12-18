package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.68U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C68U {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.68V, java.lang.Object] */
    public static AnonymousClass693 A00(Context context, int i) {
        AbstractC56582ir abstractC56582ir = null;
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                while (true) {
                    int read = openRawResource.read(bArr, 0, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                abstractC56582ir = new Object().A00(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                openRawResource.close();
            } finally {
            }
        } catch (Exception e) {
            C0w9.A06("KeyFramesUtil", "Error when reading key frame UI", e);
        }
        if (abstractC56582ir != null) {
            try {
                return new AnonymousClass693(abstractC56582ir);
            } catch (C40U e2) {
                C0w9.A06("KeyFramesUtil", "Error when reading key frame UI", e2);
            }
        }
        return null;
    }
}
