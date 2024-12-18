package X;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.facebook.secure.fileprovider.SecureFileProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.4iQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102054iQ {
    public final AbstractC58329PtM A00;

    public int A05(android.net.Uri uri, String str, String[] strArr) {
        SecureFileProvider.Impl impl = (SecureFileProvider.Impl) this;
        OX5 A00 = OX5.A00(uri);
        AbstractC58329PtM abstractC58329PtM = ((AbstractC102054iQ) impl).A00;
        if (A00.A04(abstractC58329PtM.getContext()).booleanValue()) {
            try {
                File A02 = A00.A02(abstractC58329PtM.getContext(), uri);
                if (impl.A00.A00.A06(A02) == null) {
                    return 0;
                }
                if (!A02.delete()) {
                    return 0;
                }
                return 1;
            } catch (IOException unused) {
                return 0;
            }
        }
        throw new SecurityException("Access denied");
    }

    public final Context A03() {
        return this.A00.getContext();
    }

    public int A04(android.net.Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(AbstractC58317Pt9.A00(593));
    }

    public int A06(android.net.Uri uri, ContentValues[] contentValuesArr) {
        return this.A00.A02(uri, contentValuesArr);
    }

    public AssetFileDescriptor A07(android.net.Uri uri, String str) {
        return this.A00.A03(uri, str);
    }

    public AssetFileDescriptor A08(android.net.Uri uri, String str, Bundle bundle) {
        return this.A00.A04(uri, str, bundle);
    }

    public android.net.Uri A0B(android.net.Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(AbstractC58317Pt9.A00(592));
    }

    public Bundle A0C(String str, String str2, Bundle bundle) {
        return this.A00.A05(str, str2, bundle);
    }

    public ParcelFileDescriptor A0D(android.net.Uri uri, String str) {
        return this.A00.A06(uri, str);
    }

    public void A0F() {
        this.A00.A08();
    }

    public void A0G() {
        this.A00.A09();
    }

    public void A0H(int i) {
        this.A00.A0A(i);
    }

    public void A0I(Configuration configuration) {
        this.A00.A0B(configuration);
    }

    public boolean A0J() {
        return this.A00.A0D();
    }

    public ContentProviderResult[] A0K(ArrayList arrayList) {
        return this.A00.A0E(arrayList);
    }

    public String[] A0L(android.net.Uri uri, String str) {
        return this.A00.A0F(uri, str);
    }

    public AbstractC102054iQ(AbstractC58329PtM abstractC58329PtM) {
        AbstractC08170bf.A00();
        this.A00 = abstractC58329PtM;
    }

    public Cursor A09(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object valueOf;
        OX5 A00 = OX5.A00(uri);
        AbstractC58329PtM abstractC58329PtM = this.A00;
        if (A00.A04(abstractC58329PtM.getContext()).booleanValue()) {
            try {
                File A02 = A00.A02(abstractC58329PtM.getContext(), uri);
                if (strArr == null) {
                    strArr = SecureFileProvider.Impl.A02;
                }
                int length = strArr.length;
                String[] strArr3 = new String[length];
                Object[] objArr = new Object[length];
                int i2 = 0;
                for (String str3 : strArr) {
                    if ("_display_name".equals(str3)) {
                        strArr3[i2] = "_display_name";
                        i = i2 + 1;
                        valueOf = A02.getName();
                    } else if ("_size".equals(str3)) {
                        strArr3[i2] = "_size";
                        i = i2 + 1;
                        valueOf = Long.valueOf(A02.length());
                    }
                    objArr[i2] = valueOf;
                    i2 = i;
                }
                String[] strArr4 = (String[]) Arrays.copyOf(strArr3, i2);
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                MatrixCursor matrixCursor = new MatrixCursor(strArr4, 0);
                if (i2 > 0) {
                    matrixCursor.addRow(copyOf);
                    return matrixCursor;
                }
                return matrixCursor;
            } catch (IOException e) {
                SecureFileProvider.Impl.A01.EHA("SecureFileProvider.Impl", "Query incurred an IOException", e);
                return new MatrixCursor(new String[strArr.length], 0);
            }
        }
        throw new SecurityException("Access denied");
    }

    public Cursor A0A(android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return A09(uri, strArr, str, strArr2, str2);
    }

    public String A0E(android.net.Uri uri) {
        String substring;
        String mimeTypeFromExtension;
        OX5 A00 = OX5.A00(uri);
        AbstractC58329PtM abstractC58329PtM = this.A00;
        if (A00.A04(abstractC58329PtM.getContext()).booleanValue()) {
            try {
                File A02 = A00.A02(abstractC58329PtM.getContext(), uri);
                int lastIndexOf = A02.getName().lastIndexOf(46);
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = A02.getName().substring(lastIndexOf + 1);
                }
                if (substring.length() > 0 && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring)) != null) {
                    return mimeTypeFromExtension;
                }
                return AbstractC58317Pt9.A00(9);
            } catch (IOException e) {
                SecureFileProvider.Impl.A01.EHA("SecureFileProvider.Impl", "Could not resolve file type.", e);
                return "";
            }
        }
        throw new SecurityException("Access denied");
    }
}
