package X;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T21 implements InterfaceC65502TlR {
    public final SMW A00;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.R7z, X.SLl] */
    private R7z A00(File file, String str, Map map, int i) {
        boolean z;
        File[] A04;
        long j;
        long j2;
        int length;
        R7z r7z;
        List A1E;
        String name;
        SMW smw = this.A00;
        if (smw.A01 == null) {
            File parentFile = smw.A03.getDatabasePath("ignore").getParentFile();
            if (parentFile == null) {
                name = "/databases";
            } else {
                name = parentFile.getName();
            }
            smw.A01 = name;
        }
        if (!file.getPath().contains(smw.A01)) {
            String A0R = AnonymousClass001.A0R(file.getPath(), "/");
            if (i != 1) {
                A1E = C16930sl.A00;
            } else {
                A1E = AbstractC166987dD.A1E();
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                if (A0R.contains(AbstractC166987dD.A1B(it))) {
                }
            }
            z = false;
            int i2 = i + 1;
            A04 = AbstractC73583Rk.A04(file);
            long j3 = 0;
            if (A04 == null && (length = A04.length) > 0) {
                j = 0;
                j2 = 0;
                int i3 = 0;
                do {
                    File file2 = A04[i3];
                    if (!AbstractC73583Rk.A03(file2)) {
                        if (file2.isDirectory()) {
                            if (i2 > smw.A00) {
                                String A0R2 = AnonymousClass001.A0R(file2.getPath(), "/");
                                Iterator it2 = Collections.emptyList().iterator();
                                while (it2.hasNext()) {
                                    if (A0R2.contains(AbstractC166987dD.A1B(it2))) {
                                    }
                                }
                                r7z = new R7z(AbstractC73583Rk.A01(file2));
                            }
                            r7z = A00(file2, AnonymousClass001.A0g(str, smw.A00(file2), "/"), map, i2);
                            break;
                        }
                        r7z = new R7z(AbstractC73583Rk.A01(file2));
                        if (z) {
                            A01(r7z, AnonymousClass001.A0R(str, smw.A00(file2)), map);
                        }
                        j3 += r7z.A00;
                        j += r7z.A02;
                        j2 += r7z.A01;
                    }
                    i3++;
                } while (i3 < length);
            } else {
                j = 0;
                j2 = 0;
            }
            C62673SLl A02 = AbstractC73583Rk.A02(file, file.isDirectory());
            ?? c62673SLl = new C62673SLl(j3 + A02.A00, A02.A02 + j, 1 + j2);
            A01(c62673SLl, str, map);
            return c62673SLl;
        }
        z = true;
        int i22 = i + 1;
        A04 = AbstractC73583Rk.A04(file);
        long j32 = 0;
        if (A04 == null) {
        }
        j = 0;
        j2 = 0;
        C62673SLl A022 = AbstractC73583Rk.A02(file, file.isDirectory());
        ?? c62673SLl2 = new C62673SLl(j32 + A022.A00, A022.A02 + j, 1 + j2);
        A01(c62673SLl2, str, map);
        return c62673SLl2;
    }

    @Override // X.InterfaceC65502TlR
    public final String CgW() {
        return "filetree";
    }

    public T21(SMW smw) {
        this.A00 = smw;
    }

    public static void A01(R7z r7z, String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, r7z);
            return;
        }
        C62673SLl c62673SLl = (C62673SLl) map.get(str);
        if (c62673SLl == null) {
            return;
        }
        map.put(str, new R7z(r7z.A00(c62673SLl)));
    }

    @Override // X.InterfaceC65502TlR
    public final HashMap E6N() {
        HashMap A1G = AbstractC166987dD.A1G();
        SMW smw = this.A00;
        Map map = smw.A02;
        if (map.size() == 0) {
            Context context = smw.A03;
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                map.put("/", cacheDir.getParentFile());
            }
            try {
                map.put("<external_cache>/", context.getExternalCacheDir());
                map.put("<external_files>/", context.getExternalFilesDir(null));
            } catch (Exception e) {
                C0I2.A07("DefaultFileTreeProviderConfig", "Failed to report external dirs", e);
            }
            try {
                File[] externalMediaDirs = context.getExternalMediaDirs();
                for (int i = 0; i < externalMediaDirs.length; i++) {
                    map.put(AnonymousClass001.A0c("<external_media_", ">/", i), externalMediaDirs[i]);
                }
            } catch (Exception unused) {
            }
        }
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getValue() != null) {
                A00((File) A1K.getValue(), AbstractC31172DnG.A17(A1K), A1G, 0);
            }
        }
        return A1G;
    }
}
