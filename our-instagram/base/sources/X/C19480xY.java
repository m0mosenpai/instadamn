package X;

import android.content.Context;
import com.facebook.common.dextricks.ResProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19480xY extends ResProvider {
    public final Context A00;
    public final String A01;
    public final List A02;
    public final ZipFile A03;

    @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                C0K8.A0N("VoltronResProvider", "failed to close module zip file for module %s", e, this.A01);
            }
        }
    }

    @Override // com.facebook.common.dextricks.ResProvider
    public final InputStream open(String str) {
        InputStream inputStream;
        String str2 = this.A01;
        ZipFile zipFile = this.A03;
        if (zipFile != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ZipEntry entry = zipFile.getEntry(AnonymousClass001.A0R((String) it.next(), str));
                if (entry != null && (inputStream = zipFile.getInputStream(entry)) != null) {
                    return inputStream;
                }
            }
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null && nextElement.getName().endsWith(str)) {
                    C0K8.A0P("VoltronResProvider", "found %s at %s", str, nextElement.getName());
                    InputStream inputStream2 = zipFile.getInputStream(nextElement);
                    if (inputStream2 != null) {
                        return inputStream2;
                    }
                }
            }
        } else {
            try {
                InputStream open = this.A00.getAssets().open(AnonymousClass001.A0g(str2, File.separator, str));
                if (open != null) {
                    return open;
                }
            } catch (IOException unused) {
            }
        }
        throw new FileNotFoundException(AnonymousClass001.A0R("unable to find ", str));
    }

    public C19480xY(Context context, File file, String str) {
        ZipFile zipFile;
        this.A00 = context;
        this.A01 = str;
        if (file != null) {
            zipFile = new ZipFile(file);
        } else {
            zipFile = null;
        }
        this.A03 = zipFile;
        String str2 = File.separator;
        this.A02 = Arrays.asList(AnonymousClass001.A0u("assets", str2, str, str2));
    }
}
