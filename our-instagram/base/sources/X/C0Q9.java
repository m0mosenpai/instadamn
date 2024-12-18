package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.common.build.BuildConstants;
import com.facebook.superpack.AssetDecompressionException;
import com.facebook.superpack.AssetDecompressor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0Q9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Q9 extends AbstractC07480aN implements InterfaceC09120dK {
    public EnumC09360dl A00;
    public C09240dZ[] A01;
    public final File A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final File A06;

    @Override // X.C006402e, X.AbstractC09180dS
    public final String A06() {
        return "SuperpackSoSource";
    }

    @Override // X.AbstractC07480aN
    public final AbstractC09260db A0A() {
        return new AbstractC09260db() { // from class: X.0yK
            public final ZipEntry A00;
            public final ZipFile A01;

            {
                ZipFile zipFile = new ZipFile(C0Q9.this.A02);
                try {
                    this.A00 = zipFile.getEntry(C0Q9.this.A04);
                    this.A01 = zipFile;
                } catch (Throwable th) {
                    zipFile.close();
                    throw th;
                }
            }

            @Override // X.AbstractC09260db
            public final void A01(File file) {
                ZipEntry zipEntry = this.A00;
                if (zipEntry == null) {
                    android.util.Log.e("SoLoader", "Trying to unpack, but the compressed asset is null.");
                    return;
                }
                String str = C0Q9.this.A00.A01;
                String substring = str.substring(str.lastIndexOf(46) + 1);
                C09170dP.A0C("superpack-jni");
                try {
                    InputStream inputStream = this.A01.getInputStream(zipEntry);
                    try {
                        android.util.Log.w("SoLoader", AnonymousClass001.A0c("Extracted ", " libs using Superpack", AssetDecompressor.decompress_legacy(inputStream, substring, file.getCanonicalPath()).length));
                        if (inputStream == null) {
                            return;
                        }
                        inputStream.close();
                    } finally {
                    }
                } catch (AssetDecompressionException e) {
                    throw new IOException(e);
                }
            }

            @Override // X.AbstractC09260db
            public final C09240dZ[] A02() {
                String str;
                String str2;
                C0Q9 c0q9 = C0Q9.this;
                C09240dZ[] c09240dZArr = c0q9.A01;
                if (c09240dZArr == null) {
                    ZipFile zipFile = this.A01;
                    ZipEntry entry = zipFile.getEntry(c0q9.A03);
                    if (entry == null) {
                        android.util.Log.w("SoLoader", "Metadata file not found in Superpack asset");
                        c09240dZArr = new C09240dZ[0];
                    } else {
                        ArrayList arrayList = new ArrayList();
                        try {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(' ');
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        if (readLine.length() != 0) {
                                            simpleStringSplitter.setString(readLine);
                                            String str3 = null;
                                            if (simpleStringSplitter.hasNext()) {
                                                String next = simpleStringSplitter.next();
                                                if (simpleStringSplitter.hasNext()) {
                                                    str2 = simpleStringSplitter.next();
                                                    if (simpleStringSplitter.hasNext()) {
                                                        str3 = simpleStringSplitter.next();
                                                    }
                                                    str = str3;
                                                    str3 = next;
                                                } else {
                                                    str2 = null;
                                                    str3 = next;
                                                    str = null;
                                                }
                                            } else {
                                                str = null;
                                                str2 = null;
                                            }
                                            if (str3 == null || str2 == null || str == null) {
                                                break;
                                            }
                                            int lastIndexOf = str3.lastIndexOf(47);
                                            if (lastIndexOf == -1) {
                                                android.util.Log.w("SoLoader", AnonymousClass001.A0g("Illegal line in compressed metadata: [", readLine, "]"));
                                                c09240dZArr = new C09240dZ[0];
                                                break;
                                            }
                                            arrayList.add(new C09240dZ(str3.substring(lastIndexOf + 1), str));
                                        }
                                    } else {
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        c09240dZArr = (C09240dZ[]) arrayList.toArray(new C09240dZ[arrayList.size()]);
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            android.util.Log.w("SoLoader", "Error reading metadata file", e);
                            c09240dZArr = new C09240dZ[0];
                        }
                    }
                    c0q9.A01 = c09240dZArr;
                }
                return c09240dZArr;
            }

            @Override // X.AbstractC09260db, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.A01.close();
            }
        };
    }

    @Override // X.AbstractC07480aN
    public final byte[] A0B() {
        Context context = ((AbstractC07480aN) this).A01;
        File file = this.A06;
        Parcel obtain = Parcel.obtain();
        File canonicalFile = file.getCanonicalFile();
        try {
            if (BuildConstants.A01() == 0 || BuildConstants.A01() == 1) {
                obtain.writeString(canonicalFile.getPath());
                obtain.writeLong(canonicalFile.lastModified());
                PackageManager packageManager = context.getPackageManager();
                int i = 0;
                if (packageManager != null) {
                    try {
                        i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                    }
                }
                obtain.writeInt(i);
            }
            obtain.writeLong(BuildConstants.A01());
            obtain.writeString(this.A05);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC09120dK
    public final AbstractC09180dS ECf(Context context) {
        ((C006402e) this).A00 |= 1;
        return this;
    }

    @Override // X.C006402e, X.AbstractC09180dS
    public final String toString() {
        String name;
        try {
            name = String.valueOf(((C006402e) this).A01.getCanonicalPath());
        } catch (IOException unused) {
            name = ((C006402e) this).A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SuperpackSoSource");
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        sb.append(((C006402e) this).A00);
        sb.append(" zipSource = ");
        sb.append(this.A02.getPath());
        sb.append(" compressedPath = ");
        sb.append(this.A04);
        sb.append(" identity = ");
        sb.append(this.A05);
        sb.append(']');
        return sb.toString();
    }

    public C0Q9(Context context, EnumC09360dl enumC09360dl, File file, File file2, String str, String str2, String str3) {
        super(context, file);
        this.A01 = null;
        this.A05 = str;
        this.A06 = new File(context.getApplicationInfo().sourceDir);
        this.A02 = file2;
        this.A00 = enumC09360dl;
        this.A04 = str2;
        this.A03 = str3;
    }

    public C0Q9(Context context, EnumC09360dl enumC09360dl) {
        super(context, C0eS.A00(context, 114712842));
        this.A01 = null;
        this.A05 = "";
        File file = new File(((AbstractC07480aN) this).A01.getApplicationInfo().sourceDir);
        this.A06 = file;
        this.A02 = file;
        this.A00 = enumC09360dl;
        this.A04 = enumC09360dl.A00;
        this.A03 = "assets/lib/metadata.txt";
    }
}
