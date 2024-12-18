package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.os.DeadObjectException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.PtP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58331PtP {
    public static final HashMap A06 = AbstractC166987dD.A1G();
    public static final HashSet A07 = AbstractC58319PtB.A13(new EnumC58332PtQ[]{EnumC58332PtQ.FILES_PATH, EnumC58332PtQ.CACHE_PATH, EnumC58332PtQ.EXTERNAL_FILES_PATH, EnumC58332PtQ.EXTERNAL_CACHE_PATH});
    public final C58333PtR A01;
    public final String A02;
    public final Context A04;
    public final InterfaceC08100bW A05;
    public final HashMap A03 = AbstractC166987dD.A1G();
    public boolean A00 = false;

    private android.net.Uri A00(String str, String str2, String str3, boolean z) {
        boolean endsWith = str.endsWith("/");
        String str4 = "";
        int length = str3.length();
        int length2 = str.length();
        if (!endsWith) {
            length2++;
        }
        if (length > length2) {
            str4 = str3.substring(length2);
        }
        if (z) {
            str2 = AnonymousClass001.A0R("secure_shared_", str2);
        }
        int length3 = str4.length();
        String encode = android.net.Uri.encode(str2);
        if (length3 > 0) {
            encode = AnonymousClass001.A0T(encode, android.net.Uri.encode(str4, "/"), '/');
        }
        return AbstractC58320PtC.A0D().authority(this.A02).encodedPath(encode).build();
    }

    public static C58331PtP A01(Context context, ProviderInfo providerInfo, InterfaceC08100bW interfaceC08100bW) {
        String str;
        C58331PtP c58331PtP;
        if (providerInfo == null) {
            str = AnonymousClass001.A0R(context.getApplicationContext().getPackageName(), ".securefileprovider");
        } else {
            str = providerInfo.authority;
        }
        HashMap hashMap = A06;
        synchronized (hashMap) {
            c58331PtP = (C58331PtP) hashMap.get(str);
            if (c58331PtP == null) {
                try {
                    c58331PtP = new C58331PtP(context, providerInfo, interfaceC08100bW);
                    hashMap.put(str, c58331PtP);
                } catch (IOException | XmlPullParserException e) {
                    interfaceC08100bW.EHA("SecurePathStrategy", "Failed to parse com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS meta-data.", e);
                    throw AbstractC166987dD.A12("Failed to parse com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS meta-data.");
                }
            }
        }
        return c58331PtP;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0bW, java.lang.Object] */
    public static C54807OKb A02(C58331PtP c58331PtP, EnumC58332PtQ enumC58332PtQ) {
        C54807OKb c54807OKb;
        File A00;
        HashMap hashMap = c58331PtP.A03;
        synchronized (hashMap) {
            c54807OKb = (C54807OKb) hashMap.get(enumC58332PtQ);
            if (c54807OKb == null) {
                if (A07.contains(enumC58332PtQ)) {
                    Context context = c58331PtP.A04;
                    int i = enumC58332PtQ.A00;
                    if (i == 0) {
                        A00 = MSW.A0w(enumC58332PtQ.A00(context), "secure_shared");
                    } else {
                        A00 = C0eS.A00(context, i);
                        A00.mkdirs();
                    }
                    c54807OKb = new C54807OKb(new Object(), A00.getCanonicalFile());
                    hashMap.put(enumC58332PtQ, c54807OKb);
                } else {
                    throw AbstractC37303Gc4.A0M(enumC58332PtQ, "No directory manager defined for ", AbstractC166987dD.A1C());
                }
            }
        }
        return c54807OKb;
    }

    public static void A03(C58331PtP c58331PtP) {
        if (!c58331PtP.A00) {
            synchronized (c58331PtP.A03) {
                if (!c58331PtP.A00) {
                    Iterator it = A07.iterator();
                    while (it.hasNext()) {
                        A02(c58331PtP, (EnumC58332PtQ) it.next());
                    }
                    c58331PtP.A00 = true;
                }
            }
        }
    }

    public C58331PtP(Context context, ProviderInfo providerInfo, InterfaceC08100bW interfaceC08100bW) {
        this.A05 = interfaceC08100bW;
        this.A04 = context;
        if (providerInfo != null && ((PackageItemInfo) providerInfo).metaData != null) {
            this.A02 = providerInfo.authority;
        } else {
            String A0R = AnonymousClass001.A0R(context.getApplicationContext().getPackageName(), ".securefileprovider");
            this.A02 = A0R;
            try {
                providerInfo = AbstractC08120bY.A01(context, A0R, 2176);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    this.A05.EHA("SecurePathStrategy", "DeadObjectException", e);
                } else {
                    throw e;
                }
            }
        }
        this.A01 = new C58333PtR(context, providerInfo, interfaceC08100bW, this.A02);
    }

    public final android.net.Uri A04(File file) {
        String canonicalPath;
        String path;
        String str;
        boolean z;
        int length;
        Map.Entry A062 = A06(file);
        if (A062 == null) {
            C58333PtR c58333PtR = this.A01;
            if (c58333PtR.A03) {
                String canonicalPath2 = file.getCanonicalPath();
                C58333PtR.A00(c58333PtR);
                HashMap hashMap = c58333PtR.A02;
                Iterator A14 = AbstractC166997dE.A14(hashMap);
                Map.Entry entry = null;
                int i = 0;
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    String canonicalPath3 = ((File) A1K.getValue()).getCanonicalPath();
                    if (canonicalPath2.startsWith(canonicalPath3) && (length = canonicalPath3.length()) > i) {
                        i = length;
                        entry = A1K;
                    }
                }
                canonicalPath = file.getCanonicalPath();
                if (entry == null) {
                    StringBuilder A0s = AbstractC58318PtA.A0s(canonicalPath);
                    Iterator A142 = AbstractC166997dE.A14(hashMap);
                    while (A142.hasNext()) {
                        Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                        AbstractC58318PtA.A1S(A0s);
                        A0s.append(((File) A1K2.getValue()).getCanonicalPath());
                    }
                    throw AbstractC58319PtB.A0o("Resolved path jumped beyond configured direct roots: ", A0s.toString());
                }
                path = ((File) entry.getValue()).getPath();
                str = AbstractC31172DnG.A17(entry);
                z = false;
            } else {
                throw AbstractC58319PtB.A0o("Resolved path jumped beyond configured temporary roots: ", file.getPath());
            }
        } else {
            File A00 = ((C54807OKb) A062.getValue()).A00();
            canonicalPath = file.getCanonicalPath();
            path = A00.getPath();
            str = ((EnumC58332PtQ) A062.getKey()).A01;
            z = true;
        }
        return A00(path, str, canonicalPath, z);
    }

    public final File A05(android.net.Uri uri, Boolean bool) {
        File canonicalFile;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = android.net.Uri.decode(encodedPath.substring(1, indexOf));
            if (decode != null && decode.startsWith("secure_shared")) {
                File A00 = A02(this, (EnumC58332PtQ) EnumC58332PtQ.A03.get(decode.substring(14))).A00();
                String decode2 = android.net.Uri.decode(AbstractC58318PtA.A0g(indexOf, encodedPath));
                if (decode2 != null) {
                    File A0w = MSW.A0w(A00, decode2);
                    if (A0w.getCanonicalFile().getPath().startsWith(A00.getPath()) || ((!A0w.getCanonicalFile().equals(A0w.getAbsoluteFile())) && bool.booleanValue())) {
                        canonicalFile = A0w.getCanonicalFile();
                        if (!canonicalFile.exists()) {
                            throw new FileNotFoundException(AnonymousClass001.A0g("File ", canonicalFile.getPath(), " not found"));
                        }
                    } else {
                        throw new SecurityException("Resolved path jumped beyond configured roots");
                    }
                } else {
                    throw new FileNotFoundException("Unable to resolve file path");
                }
            } else {
                C58333PtR c58333PtR = this.A01;
                if (c58333PtR.A03) {
                    String encodedPath2 = uri.getEncodedPath();
                    int indexOf2 = encodedPath2.indexOf(47, 1);
                    String decode3 = android.net.Uri.decode(encodedPath2.substring(1, indexOf2));
                    String decode4 = android.net.Uri.decode(AbstractC58318PtA.A0g(indexOf2, encodedPath2));
                    C58333PtR.A00(c58333PtR);
                    File file = (File) c58333PtR.A02.get(decode3);
                    if (file != null) {
                        canonicalFile = MSW.A0w(file, decode4).getCanonicalFile();
                        if (canonicalFile.getPath().startsWith(file.getPath())) {
                            if (!canonicalFile.exists()) {
                                throw new FileNotFoundException(AnonymousClass001.A0g("File ", canonicalFile.getPath(), " not found"));
                            }
                        } else {
                            throw new SecurityException("Resolved path jumped beyond configured roots");
                        }
                    } else {
                        throw new SecurityException("Resolved path jumped beyond configured roots");
                    }
                } else {
                    throw new SecurityException("Direct access to shared files is not enabled.");
                }
            }
            return canonicalFile;
        }
        throw new FileNotFoundException("Unable to resolve file path");
    }

    public final Map.Entry A06(File file) {
        String canonicalPath = file.getCanonicalPath();
        A03(this);
        Iterator A14 = AbstractC166997dE.A14(this.A03);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            try {
            } catch (IOException e) {
                InterfaceC08100bW interfaceC08100bW = this.A05;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Cannot use the path ");
                A1C.append(A1K.getValue());
                A1C.append(" as the writable root.\n The path triggers an IOException: ");
                interfaceC08100bW.EHA("SecurePathStrategy", AbstractC166997dE.A0x(e.getMessage(), A1C), null);
            }
            if (canonicalPath.startsWith(((C54807OKb) A1K.getValue()).A00().getPath())) {
                return A1K;
            }
        }
        return null;
    }
}
