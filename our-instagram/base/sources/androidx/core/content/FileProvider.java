package androidx.core.content;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.AbstractC37303Gc4;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.C63587Spu;
import X.InterfaceC65296ThU;
import X.MSW;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public class FileProvider extends ContentProvider {
    public InterfaceC65296ThU A00;
    public String A01;
    public final int A02;
    public final Object A03;
    public static final String[] A06 = {"_display_name", "_size"};
    public static final File A04 = AbstractC166987dD.A11("/");
    public static final HashMap A05 = AbstractC166987dD.A1G();

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public static Uri A00(Context context, File file) {
        C63587Spu c63587Spu = (C63587Spu) A02(context, "com.instagram.fileprovider", 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            Iterator A14 = AbstractC166997dE.A14(c63587Spu.A01);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                String path = ((File) A1K.getValue()).getPath();
                if (C63587Spu.A00(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = A1K;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return AbstractC58320PtC.A0D().authority(c63587Spu.A00).encodedPath(AnonymousClass001.A0T(Uri.encode(AbstractC31172DnG.A17(entry)), Uri.encode(canonicalPath.substring(length), "/"), '/')).build();
            }
            throw AbstractC167007dF.A0c("Failed to find configured root that contains ", canonicalPath);
        } catch (IOException unused) {
            throw AbstractC37303Gc4.A0M(file, "Failed to resolve canonical path for ", AbstractC166987dD.A1C());
        }
    }

    private InterfaceC65296ThU A01() {
        InterfaceC65296ThU interfaceC65296ThU;
        synchronized (this.A03) {
            if (this.A01 != null) {
                interfaceC65296ThU = this.A00;
                if (interfaceC65296ThU == null) {
                    interfaceC65296ThU = A02(getContext(), this.A01, this.A02);
                    this.A00 = interfaceC65296ThU;
                }
            } else {
                throw AbstractC166987dD.A15("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
        }
        return interfaceC65296ThU;
    }

    public static InterfaceC65296ThU A02(Context context, String str, int i) {
        File file;
        File[] externalFilesDirs;
        InterfaceC65296ThU interfaceC65296ThU;
        HashMap hashMap = A05;
        synchronized (hashMap) {
            InterfaceC65296ThU interfaceC65296ThU2 = (InterfaceC65296ThU) hashMap.get(str);
            interfaceC65296ThU = interfaceC65296ThU2;
            if (interfaceC65296ThU2 == null) {
                try {
                    C63587Spu c63587Spu = new C63587Spu(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        if (((PackageItemInfo) resolveContentProvider).metaData == null && i != 0) {
                            Bundle bundle = new Bundle(1);
                            ((PackageItemInfo) resolveContentProvider).metaData = bundle;
                            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next != 1) {
                                    if (next == 2) {
                                        String name = loadXmlMetaData.getName();
                                        String attributeValue = loadXmlMetaData.getAttributeValue(null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                        if ("root-path".equals(name)) {
                                            file = A04;
                                        } else if ("files-path".equals(name)) {
                                            file = context.getFilesDir();
                                        } else if ("cache-path".equals(name)) {
                                            file = context.getCacheDir();
                                        } else if ("external-path".equals(name)) {
                                            file = Environment.getExternalStorageDirectory();
                                        } else {
                                            if ("external-files-path".equals(name)) {
                                                externalFilesDirs = context.getExternalFilesDirs(null);
                                            } else if ("external-cache-path".equals(name)) {
                                                externalFilesDirs = context.getExternalCacheDirs();
                                            } else if ("external-media-path".equals(name)) {
                                                externalFilesDirs = context.getExternalMediaDirs();
                                            } else {
                                                continue;
                                            }
                                            if (externalFilesDirs.length > 0) {
                                                file = externalFilesDirs[0];
                                            } else {
                                                continue;
                                            }
                                        }
                                        if (file == null) {
                                            continue;
                                        } else {
                                            String str2 = new String[]{attributeValue2}[0];
                                            if (str2 != null) {
                                                file = MSW.A0w(file, str2);
                                            }
                                            if (!TextUtils.isEmpty(attributeValue)) {
                                                try {
                                                    c63587Spu.A01.put(attributeValue, file.getCanonicalFile());
                                                } catch (IOException e) {
                                                    throw new IllegalArgumentException(AbstractC167017dG.A0n(file, "Failed to resolve canonical path for ", AbstractC166987dD.A1C()), e);
                                                }
                                            } else {
                                                throw AbstractC166987dD.A12("Name must not be empty");
                                            }
                                        }
                                    }
                                } else {
                                    hashMap.put(str, c63587Spu);
                                    interfaceC65296ThU = c63587Spu;
                                    break;
                                }
                            }
                        } else {
                            throw AbstractC166987dD.A12("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        throw AbstractC167007dF.A0c("Couldn't find meta-data for provider with authority ", str);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return interfaceC65296ThU;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw AbstractC166987dD.A1D("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AbstractC166987dD.A1D("No external updates");
    }

    public FileProvider(int i) {
        this.A03 = AbstractC58318PtA.A0b();
        this.A02 = i;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!((ComponentInfo) providerInfo).exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.A03) {
                    this.A01 = str;
                }
                HashMap hashMap = A05;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return A01().B6D(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File B6D = A01().B6D(uri);
        int lastIndexOf = B6D.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC58318PtA.A0g(lastIndexOf, B6D.getName()));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File B6D = A01().B6D(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw AbstractC167007dF.A0c("Invalid mode: ", str);
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(B6D, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object valueOf;
        File B6D = A01().B6D(uri);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        if (strArr == null) {
            strArr = A06;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    valueOf = B6D.getName();
                } else {
                    valueOf = queryParameter;
                }
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                valueOf = Long.valueOf(B6D.length());
            }
            objArr[i2] = valueOf;
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public FileProvider() {
        this(0);
    }
}
