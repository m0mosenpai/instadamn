package X;

import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;
import java.io.IOException;

/* renamed from: X.0yN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19930yN implements InterfaceC09320dh {
    public int A00 = 0;

    @Override // X.InterfaceC09320dh
    public final boolean ECg(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC09180dS[] abstractC09180dSArr) {
        boolean z;
        if (unsatisfiedLinkError instanceof SoLoaderULError) {
            SoLoaderULError soLoaderULError = (SoLoaderULError) unsatisfiedLinkError;
            String str = soLoaderULError.mSoName;
            String message = soLoaderULError.getMessage();
            if (str == null) {
                android.util.Log.e("SoLoader", "No so name provided in ULE, cannot recover");
            } else if (soLoaderULError instanceof SoLoaderDSONotFoundError) {
                if ((this.A00 & 1) != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Reunpacking BackupSoSources due to ");
                    sb.append(soLoaderULError);
                    sb.append(", retrying for specific library ");
                    sb.append(str);
                    android.util.Log.e("SoLoader", sb.toString());
                    try {
                        for (AbstractC09180dS abstractC09180dS : abstractC09180dSArr) {
                            if (abstractC09180dS instanceof C0QD) {
                                C0QD c0qd = (C0QD) abstractC09180dS;
                                C07H c07h = new C07H(c0qd);
                                try {
                                    C09240dZ[] A02 = c07h.A02();
                                    int length = A02.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            if (A02[i].A01.equals(str)) {
                                                android.util.Log.e("SoLoader", AnonymousClass001.A0u("Found ", str, " in ", "BackupSoSource"));
                                                z = true;
                                                break;
                                            }
                                            i++;
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                    c07h.close();
                                    if (z) {
                                        android.util.Log.e("SoLoader", AnonymousClass001.A0R("Preparing ", "BackupSoSource"));
                                        c0qd.A08(0);
                                        return true;
                                    }
                                } finally {
                                }
                            }
                        }
                        return false;
                    } catch (IOException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to run recovery for backup so source due to: ");
                        sb2.append(e);
                        android.util.Log.e("SoLoader", sb2.toString());
                        return false;
                    }
                }
            } else if (message != null) {
                if (!message.contains("/app/") && !message.contains("/mnt/")) {
                    return false;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Reunpacking BackupSoSources due to ");
                sb3.append(soLoaderULError);
                sb3.append(", retrying for specific library ");
                sb3.append(str);
                android.util.Log.e("SoLoader", sb3.toString());
                for (AbstractC09180dS abstractC09180dS2 : abstractC09180dSArr) {
                    if (abstractC09180dS2 instanceof C0QD) {
                        try {
                            android.util.Log.e("SoLoader", AnonymousClass001.A0R("Preparing BackupSoSource for the first time ", "BackupSoSource"));
                            abstractC09180dS2.A08(0);
                            for (AbstractC09180dS abstractC09180dS3 : abstractC09180dSArr) {
                                if ((abstractC09180dS3 instanceof C006402e) && !(abstractC09180dS3 instanceof C0QD)) {
                                    ((C006402e) abstractC09180dS3).A00 |= 1;
                                }
                            }
                            return true;
                        } catch (Exception e2) {
                            android.util.Log.e("SoLoader", AnonymousClass001.A11("Encountered an exception while reunpacking BackupSoSource ", "BackupSoSource", " for library ", str, ": "), e2);
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
