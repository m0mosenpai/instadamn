package X;

import android.content.Context;
import android.util.Base64InputStream;
import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/* loaded from: classes9.dex */
public final class OX7 {
    public final C109574wj A00;
    public final C55761OpU A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.OpU, java.lang.Object] */
    public OX7(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = new C109574wj(context.getAssets());
        this.A01 = new Object();
    }

    public final C51759Mti A01(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MSY.A1a(str));
        try {
            Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, 0);
            try {
                C51759Mti A00 = A00(this, base64InputStream);
                base64InputStream.close();
                byteArrayInputStream.close();
                return A00;
            } finally {
            }
        } finally {
        }
    }

    public final C51759Mti A02(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MSY.A1a(str));
        try {
            Base64InputStream base64InputStream = new Base64InputStream(byteArrayInputStream, 0);
            try {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new BufferedInputStream(base64InputStream));
                try {
                    C51759Mti A00 = A00(this, inflaterInputStream);
                    inflaterInputStream.close();
                    base64InputStream.close();
                    byteArrayInputStream.close();
                    return A00;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static C51759Mti A00(OX7 ox7, InputStream inputStream) {
        C95024Pl c95024Pl = new C95024Pl(new C4PN(inputStream));
        C109574wj c109574wj = ox7.A00;
        return new C51759Mti((RtcMessageBody) c109574wj.A00(c95024Pl, "com.facebook.fbwebrtc.multiway.RtcMessageBody"), (RtcMessageHeader) c109574wj.A00(c95024Pl, "com.facebook.fbwebrtc.multiway.RtcMessageHeader"));
    }

    public final C51759Mti A03(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C51759Mti A00 = A00(this, byteArrayInputStream);
            byteArrayInputStream.close();
            return A00;
        } finally {
        }
    }

    public final byte[] A04(C51759Mti c51759Mti) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C95024Pl c95024Pl = new C95024Pl(new C4PN(byteArrayOutputStream));
            C109574wj c109574wj = this.A00;
            c109574wj.A01((RtcMessageHeader) c51759Mti.A01, c95024Pl, "com.facebook.fbwebrtc.multiway.RtcMessageHeader");
            c109574wj.A01((RtcMessageBody) c51759Mti.A00, c95024Pl, "com.facebook.fbwebrtc.multiway.RtcMessageBody");
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C14360o3.A07(byteArray);
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }
}
