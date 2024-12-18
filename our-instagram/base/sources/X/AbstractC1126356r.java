package X;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.webkit.MimeTypeMap;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.56r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1126356r {
    public static final int A00 = Build.VERSION.SDK_INT;

    public static final File A02(Context context, String str) {
        String extensionFromMimeType;
        if (AbstractC002300n.A0h(str, "content", false)) {
            try {
                File cacheDir = context.getCacheDir();
                String type = context.getContentResolver().getType(AbstractC08820cl.A03(str));
                String str2 = ".tmp";
                if (type != null && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type)) != null) {
                    str2 = extensionFromMimeType;
                }
                File createTempFile = File.createTempFile("media_", str2, cacheDir);
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                C14360o3.A0A(createTempFile);
                C14360o3.A0B(createTempFile, 2);
                InputStream openInputStream = context.getContentResolver().openInputStream(A03);
                if (openInputStream != null) {
                    if (createTempFile.exists()) {
                        createTempFile.delete();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read >= 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileOutputStream.flush();
                                try {
                                    fileOutputStream.getFD().sync();
                                    fileOutputStream.close();
                                    return createTempFile;
                                } catch (IOException unused) {
                                    throw new IOException("IOException when getting file from URI:\" + contentURIFilePath");
                                }
                            }
                        }
                    } catch (Throwable th) {
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw new IOException("IOException when getting file from URI:\" + contentURIFilePath");
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open ");
                    sb.append(A03);
                    throw new FileNotFoundException(sb.toString());
                }
            } catch (IOException unused3) {
            }
        }
        if (AbstractC002300n.A0h(str, "file:/", false)) {
            try {
                String path = AbstractC08820cl.A03(str).getPath();
                if (path != null) {
                    return new File(path);
                }
            } catch (SecurityException unused4) {
            }
        }
        return new File(str);
    }

    public static final String A03(MediaCodec.CodecException codecException) {
        C14360o3.A0B(codecException, 0);
        String format = String.format(Locale.US, "mediaCodecErrorCode: %s, mediaCodecErrorDiagnosticInfo: %s, isRecoverable: %s, isTransient: %s", Arrays.copyOf(new Object[]{Integer.valueOf(codecException.getErrorCode()), codecException.getDiagnosticInfo(), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient())}, 4));
        C14360o3.A07(format);
        return format;
    }

    public static final String A05(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String format = String.format(Locale.ROOT, "%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            C14360o3.A07(format);
            sb.append(format);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final String A04(Class cls, Map map) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(cls.getSimpleName());
        sb.append('{');
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append('=');
            sb.append(value);
            sb.append(", ");
        }
        if (sb.charAt(sb.length() - 2) == ',') {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append('}');
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A06(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException("argument cannot be null");
        }
    }

    public static final void A07(boolean z, String str) {
        if (!z) {
            if (str == null) {
                str = "";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final long A00() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static final C54509O6m A01(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        C14360o3.A07(obj);
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        byte[] bytes = obj.getBytes(forName);
        C14360o3.A07(bytes);
        return new C54509O6m(new C55191Odx(new ByteArrayInputStream(bytes)), 0L);
    }
}
