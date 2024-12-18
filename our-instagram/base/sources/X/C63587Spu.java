package X;

import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Spu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63587Spu implements InterfaceC65296ThU {
    public final String A00;
    public final HashMap A01 = AbstractC166987dD.A1G();

    public static boolean A00(String str, String str2) {
        HashMap hashMap = FileProvider.A05;
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            if (str.charAt(i) == '/') {
                str = AbstractC58318PtA.A0j(str, i);
            }
        }
        int length2 = str2.length();
        if (length2 > 0) {
            int i2 = length2 - 1;
            if (str2.charAt(i2) == '/') {
                str2 = AbstractC58318PtA.A0j(str2, i2);
            }
        }
        if (!str.equals(str2) && !str.startsWith(AnonymousClass001.A0C(str2, '/'))) {
            return false;
        }
        return true;
    }

    public C63587Spu(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC65296ThU
    public final File B6D(android.net.Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = android.net.Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = android.net.Uri.decode(AbstractC58318PtA.A0g(indexOf, encodedPath));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File A0w = MSW.A0w(file, decode2);
            try {
                File canonicalFile = A0w.getCanonicalFile();
                if (A00(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw AbstractC37303Gc4.A0M(A0w, "Failed to resolve canonical path for ", AbstractC166987dD.A1C());
            }
        }
        throw AbstractC37303Gc4.A0M(uri, "Unable to find configured root for ", AbstractC166987dD.A1C());
    }
}
