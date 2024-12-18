package X;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.2ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53592ch {
    public static final Comparator A00 = new Comparator() { // from class: X.2ci
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = length - length2;
            if (length == length2) {
                for (int i2 = 0; i2 < length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            }
            return i;
        }
    };

    public static C05170Pm A00(Context context, C53532cb c53532cb) {
        C54162eO[] c54162eOArr;
        int i;
        int i2;
        int i3;
        android.net.Uri withAppendedId;
        int i4;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c53532cb.A02;
        int i5 = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = ((PackageItemInfo) resolveContentProvider).packageName;
            String str3 = c53532cb.A03;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Comparator comparator = A00;
                Collections.sort(arrayList, comparator);
                List list = c53532cb.A05;
                if (list == null) {
                    list = AbstractC2051996k.A00(resources, c53532cb.A00);
                }
                while (true) {
                    if (i5 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i5));
                        Collections.sort(arrayList2, comparator);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                if (Arrays.equals((byte[]) arrayList.get(i6), (byte[]) arrayList2.get(i6))) {
                                }
                            }
                            String str4 = resolveContentProvider.authority;
                            ArrayList arrayList3 = new ArrayList();
                            android.net.Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                            android.net.Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                            ContentProviderClient A002 = C0fI.A00(context.getContentResolver(), build, -1676707122);
                            try {
                                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                                String[] strArr2 = {c53532cb.A04};
                                if (A002 != null) {
                                    try {
                                        Cursor query = A002.query(build, strArr, "query = ?", strArr2, null, null);
                                        if (query != null) {
                                            try {
                                                if (query.getCount() > 0) {
                                                    int columnIndex = query.getColumnIndex("result_code");
                                                    arrayList3 = new ArrayList();
                                                    int columnIndex2 = query.getColumnIndex("_id");
                                                    int columnIndex3 = query.getColumnIndex("file_id");
                                                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                                                    int columnIndex5 = query.getColumnIndex("font_weight");
                                                    int columnIndex6 = query.getColumnIndex("font_italic");
                                                    while (query.moveToNext()) {
                                                        if (columnIndex != -1) {
                                                            i2 = query.getInt(columnIndex);
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        if (columnIndex4 != -1) {
                                                            i3 = query.getInt(columnIndex4);
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        if (columnIndex3 == -1) {
                                                            withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                                                        } else {
                                                            withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                                                        }
                                                        if (columnIndex5 != -1) {
                                                            i4 = query.getInt(columnIndex5);
                                                        } else {
                                                            i4 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                                                        }
                                                        if (columnIndex6 != -1) {
                                                            z = true;
                                                            if (query.getInt(columnIndex6) == 1) {
                                                                arrayList3.add(new C54162eO(withAppendedId, i3, i4, i2, z));
                                                            }
                                                        }
                                                        z = false;
                                                        arrayList3.add(new C54162eO(withAppendedId, i3, i4, i2, z));
                                                    }
                                                }
                                                query.close();
                                            } catch (Throwable th) {
                                                th = th;
                                                query.close();
                                                A002.close();
                                                throw th;
                                            }
                                        }
                                    } catch (RemoteException e) {
                                        android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
                                    }
                                    A002.close();
                                }
                                c54162eOArr = (C54162eO[]) arrayList3.toArray(new C54162eO[0]);
                                i = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                if (A002 == null) {
                                    throw th;
                                }
                            }
                        }
                        i5++;
                    } else {
                        c54162eOArr = null;
                        i = 1;
                        break;
                    }
                }
                return new C05170Pm(c54162eOArr, i);
            }
            throw new PackageManager.NameNotFoundException(AnonymousClass001.A0u("Found content provider ", str, ", but package was not ", str3));
        }
        throw new PackageManager.NameNotFoundException(AnonymousClass001.A0R("No package found for authority: ", str));
    }
}
