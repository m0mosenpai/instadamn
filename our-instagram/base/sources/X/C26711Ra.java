package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.1Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26711Ra {
    public static C26711Ra A07;
    public final C19490xZ A00;
    public final C09970fz A01;
    public final C10040gH A02;
    public final C10050gI A03;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final boolean A05;
    public final C26741Rd A06;

    public static synchronized C26711Ra A00(Context context) {
        C26711Ra c26711Ra;
        synchronized (C26711Ra.class) {
            c26711Ra = A07;
            if (c26711Ra == null) {
                c26711Ra = new C26711Ra(context.getApplicationContext());
                A07 = c26711Ra;
            }
        }
        return c26711Ra;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Rd, X.0gG] */
    public C26711Ra(final Context context) {
        C19490xZ A00 = C19490xZ.A00(context);
        this.A00 = A00;
        C09970fz c09970fz = new C09970fz(context);
        this.A01 = c09970fz;
        final C26731Rc c26731Rc = new C26731Rc(context);
        ?? r1 = new InterfaceC10030gG(context, c26731Rc) { // from class: X.1Rd
            public final C26731Rc A00;
            public final Context A01;

            @Override // X.InterfaceC10030gG
            public final void AU5(android.net.Uri uri, File file, String str) {
                ParcelFileDescriptor openFileDescriptor = this.A01.getContentResolver().openFileDescriptor(uri, "r");
                if (openFileDescriptor != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(openFileDescriptor.getFileDescriptor()));
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            File createTempFile = File.createTempFile(AnonymousClass001.A0R(str, "_x_"), null, file.getParentFile());
                            file.getCanonicalPath();
                            createTempFile.getCanonicalPath();
                            try {
                                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                                int i = 0;
                                while (true) {
                                    try {
                                        int read = bufferedInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        i += read;
                                        fileOutputStream.write(bArr, 0, read);
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        }
                                    }
                                }
                                fileOutputStream.close();
                                if (i != 0) {
                                    if (createTempFile.canRead()) {
                                        C26731Rc c26731Rc2 = this.A00;
                                        ZipFile zipFile = new ZipFile(createTempFile);
                                        File createTempFile2 = File.createTempFile(str, null);
                                        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(createTempFile2));
                                        AssetManager assets = c26731Rc2.A00.getAssets();
                                        String format = String.format(Locale.US, "app_modules/contents/%s.json", str);
                                        HashMap hashMap = new HashMap();
                                        try {
                                            JsonReader jsonReader = new JsonReader(new InputStreamReader(assets.open(format), ReactWebViewManager.HTML_ENCODING));
                                            try {
                                                jsonReader.beginObject();
                                                while (jsonReader.hasNext()) {
                                                    String nextName = jsonReader.nextName();
                                                    JsonToken peek = jsonReader.peek();
                                                    if (peek == JsonToken.STRING) {
                                                        hashMap.put(nextName, jsonReader.nextString());
                                                    } else {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("Expected STRING, got ");
                                                        sb.append(peek);
                                                        throw new IOException(sb.toString());
                                                    }
                                                }
                                                jsonReader.close();
                                                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                                                while (entries.hasMoreElements()) {
                                                    ZipEntry nextElement = entries.nextElement();
                                                    if (nextElement != null) {
                                                        String name = nextElement.getName();
                                                        String str2 = (String) hashMap.get(name);
                                                        if (str2 != null) {
                                                            hashMap.remove(name);
                                                            S1Z.A00(null, zipFile.getInputStream(nextElement), str2);
                                                            zipOutputStream.putNextEntry(new ZipEntry(nextElement.getName()));
                                                            byte[] bArr2 = new byte[1024];
                                                            InputStream inputStream = zipFile.getInputStream(nextElement);
                                                            if (inputStream != null) {
                                                                while (true) {
                                                                    int read2 = inputStream.read(bArr2);
                                                                    if (read2 <= 0) {
                                                                        break;
                                                                    } else {
                                                                        zipOutputStream.write(bArr2, 0, read2);
                                                                    }
                                                                }
                                                            }
                                                            zipOutputStream.closeEntry();
                                                        }
                                                    } else {
                                                        throw new IOException("entry is unexpected null, unable to verify module");
                                                    }
                                                }
                                                if (hashMap.isEmpty()) {
                                                    zipOutputStream.close();
                                                    boolean renameTo = createTempFile2.renameTo(file);
                                                    createTempFile2.delete();
                                                    if (renameTo) {
                                                        A00(file);
                                                    }
                                                    bufferedInputStream.close();
                                                    return;
                                                }
                                                throw new IOException("Unable to verify module contents");
                                            } catch (Throwable th3) {
                                                try {
                                                    jsonReader.close();
                                                } catch (Throwable th4) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                }
                                                throw th3;
                                            }
                                        } catch (FileNotFoundException e) {
                                            throw new IOException(AnonymousClass001.A0R("Failed to open app module content manifest: ", format), e);
                                        }
                                    }
                                    throw new IOException(AnonymousClass001.A0R("tmpFile not readable: ", createTempFile.getCanonicalPath()));
                                }
                                C0K8.A0E("VoltronFileVerifier", "No bytes reads");
                                throw new IOException(AnonymousClass001.A0R("No bytes read of file ", createTempFile.getName()));
                            } finally {
                                if (createTempFile.exists()) {
                                    createTempFile.delete();
                                }
                            }
                        } finally {
                        }
                    } finally {
                        openFileDescriptor.close();
                    }
                }
                throw new IOException("file descriptor not found");
            }

            {
                this.A01 = context;
                this.A00 = c26731Rc;
            }

            public static void A00(File file) {
                if (file.exists() && !file.setWritable(false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("App module file util was unable to set file owner only read permission. location:");
                    sb.append(file.getCanonicalFile());
                    throw new IOException(sb.toString());
                }
            }

            @Override // X.InterfaceC10030gG
            public final void FEU(File file, InputStream inputStream, String str, String str2) {
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    File file2 = new File(file.getParentFile(), AnonymousClass001.A0R(file.getName(), ".tmp"));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            S1Z.A00(fileOutputStream, inputStream, str2);
                            boolean renameTo = file2.renameTo(file);
                            if (!renameTo) {
                                if (!file.exists()) {
                                    throw new IOException(String.format(Locale.US, "App module was unable to be moved after hash validation. Previous location: %s new location: %s output file", file2.getCanonicalFile(), file.getCanonicalFile()));
                                }
                            } else {
                                A00(file);
                            }
                            fileOutputStream.close();
                            if (!renameTo && file2.exists()) {
                                file2.delete();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (0 == 0 && file2.exists()) {
                            file2.delete();
                        }
                        throw th;
                    }
                }
            }
        };
        this.A06 = r1;
        this.A02 = new C10040gH(context, c09970fz, r1);
        this.A03 = new C10050gI(context, A00, c09970fz);
        this.A05 = AbstractC26751Re.A00(context);
    }
}
