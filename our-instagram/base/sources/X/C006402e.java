package X;

import android.os.StrictMode;
import com.facebook.soloader.SoLoaderULErrorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.02e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C006402e extends AbstractC09180dS {
    public int A00;
    public final File A01;

    @Override // X.AbstractC09180dS
    public String A06() {
        return "DirectorySoSource";
    }

    @Override // X.AbstractC09180dS
    public final void A02(Collection collection) {
        try {
            collection.add(this.A01.getCanonicalPath());
        } catch (IOException e) {
            File file = this.A01;
            android.util.Log.e("SoLoader", AnonymousClass001.A11("Failed to get canonical path for ", file.getName(), " due to ", e.toString(), ", falling to the absolute one"));
            collection.add(file.getAbsolutePath());
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0d5, java.lang.Object, X.00y] */
    @Override // X.AbstractC09180dS
    public int A04(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        File file = this.A01;
        if (C09170dP.A04 != null) {
            File A09 = A09(str);
            if (A09 == null) {
                file.getCanonicalPath();
                android.util.Log.isLoggable("SoLoader", 2);
                return 0;
            }
            String canonicalPath = A09.getCanonicalPath();
            android.util.Log.isLoggable("SoLoader", 3);
            if ((i & 1) != 0 && (this.A00 & 2) != 0) {
                android.util.Log.isLoggable("SoLoader", 3);
                return 2;
            }
            if ((this.A00 & 1) != 0) {
                ?? obj = new Object();
                obj.A00 = A09;
                FileInputStream fileInputStream = new FileInputStream(A09);
                obj.A01 = fileInputStream;
                obj.A02 = fileInputStream.getChannel();
                try {
                    String[] A03 = C09090dG.A03(obj, str);
                    Arrays.toString(A03);
                    android.util.Log.isLoggable("SoLoader", 3);
                    for (String str2 : A03) {
                        if (!str2.startsWith("/") && !C09090dG.A03.contains(str2)) {
                            C09170dP.A07(threadPolicy, str2, i);
                        }
                    }
                    obj.close();
                } catch (Throwable th) {
                    try {
                        obj.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            } else {
                android.util.Log.isLoggable("SoLoader", 3);
            }
            try {
                C09170dP.A04.load(canonicalPath, i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                throw SoLoaderULErrorFactory.create(str, e);
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    public final File A09(String str) {
        File file = new File(this.A01, str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    @Override // X.AbstractC09180dS
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            name = this.A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A06());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public C006402e(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0d5, java.lang.Object, X.00y] */
    @Override // X.AbstractC09180dS
    public final String[] A03(String str) {
        File A09 = A09(str);
        if (A09 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = A09;
        FileInputStream fileInputStream = new FileInputStream(A09);
        obj.A01 = fileInputStream;
        obj.A02 = fileInputStream.getChannel();
        try {
            String[] A03 = C09090dG.A03(obj, str);
            obj.close();
            return A03;
        } catch (Throwable th) {
            try {
                obj.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.AbstractC09180dS
    public final File A05(String str) {
        return A09(str);
    }

    @Override // X.AbstractC09180dS
    public final String A07(String str) {
        File A09 = A09(str);
        if (A09 == null) {
            return null;
        }
        return A09.getCanonicalPath();
    }
}
