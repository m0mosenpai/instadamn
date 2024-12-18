package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0QD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QD extends AbstractC07480aN implements InterfaceC09120dK {
    public boolean A00;
    public final ArrayList A01;

    @Override // X.C006402e, X.AbstractC09180dS
    public final String A06() {
        return "BackupSoSource";
    }

    @Override // X.C006402e, X.AbstractC09180dS
    public final int A04(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        if (!this.A00) {
            return 0;
        }
        return super.A04(threadPolicy, str, i);
    }

    @Override // X.AbstractC07480aN, X.AbstractC09180dS
    public final void A08(int i) {
        if ((i & 8) == 0) {
            super.A08(i);
            this.A00 = true;
        }
    }

    @Override // X.AbstractC07480aN
    public final AbstractC09260db A0A() {
        return new C07H(this);
    }

    @Override // X.AbstractC07480aN
    public final C09240dZ[] A0C() {
        C0QB c0qb = (C0QB) this.A01.get(0);
        C00Z c00z = new C00Z(c0qb, c0qb);
        try {
            C09240dZ[] A02 = c00z.A02();
            c00z.close();
            return A02;
        } catch (Throwable th) {
            try {
                c00z.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC09120dK
    public final AbstractC09180dS ECf(Context context) {
        C0QD c0qd = new C0QD(context, ((C006402e) this).A01.getName(), true);
        try {
            c0qd.A08(0);
            return c0qd;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.File] */
    @Override // X.C006402e, X.AbstractC09180dS
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BackupSoSource");
        sb.append("[root = ");
        ?? r0 = ((C006402e) this).A01;
        try {
            r0 = r0.getCanonicalPath();
            str = r0;
        } catch (IOException unused) {
            str = r0.getName();
        }
        sb.append(str);
        sb.append(" flags = ");
        sb.append(((C006402e) this).A00);
        sb.append(" apks = ");
        sb.append(this.A01.toString());
        sb.append("]");
        return sb.toString();
    }

    public C0QD(Context context, String str, boolean z) {
        super(context, str, z);
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A00 = false;
        arrayList.add(new C0QB(context, new File(context.getApplicationInfo().sourceDir), str, "^lib/([^/]+)/([^/]+\\.so)$"));
        if (context.getApplicationInfo().splitSourceDirs != null) {
            try {
                for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                    C0QB c0qb = new C0QB(context, new File(str2), str, "^lib/([^/]+)/([^/]+\\.so)$");
                    C00Z c00z = new C00Z(c0qb, c0qb);
                    try {
                        boolean z2 = c00z.A03().length != 0;
                        c00z.close();
                        if (z2) {
                            android.util.Log.w("BackupSoSource", AnonymousClass001.A0R("adding backup source from split: ", c0qb.toString()));
                            this.A01.add(c0qb);
                        }
                    } catch (Throwable th) {
                        try {
                            c00z.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                android.util.Log.w("BackupSoSource", "failed to read split apks", e);
            }
        }
    }

    @Override // X.AbstractC07480aN
    public final byte[] A0B() {
        byte[] marshall;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 3);
            Context context = ((AbstractC07480aN) this).A01;
            PackageManager packageManager = context.getPackageManager();
            int i = 0;
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            obtain.writeInt(i);
            ArrayList arrayList = this.A01;
            obtain.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                obtain.writeByteArray(((C0QB) it.next()).A0B());
            }
            String str = context.getApplicationInfo().sourceDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                marshall = obtain.marshall();
            } else {
                File canonicalFile = new File(str).getCanonicalFile();
                if (!canonicalFile.exists()) {
                    obtain.writeByte((byte) 1);
                    marshall = obtain.marshall();
                } else {
                    obtain.writeByte((byte) 2);
                    obtain.writeString(canonicalFile.getPath());
                    obtain.writeLong(canonicalFile.lastModified());
                    marshall = obtain.marshall();
                }
            }
            return marshall;
        } finally {
            obtain.recycle();
        }
    }
}
