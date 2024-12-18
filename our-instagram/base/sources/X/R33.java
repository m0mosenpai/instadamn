package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class R33 extends AbstractAsyncTaskC58703Q2g {
    public final int A00;
    public final Context A01;
    public final InterfaceC65622ToD A02;
    public final ReadableArray A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractAsyncTaskC58703Q2g
    public final /* bridge */ /* synthetic */ void A00(Object[] objArr) {
        String str;
        int i;
        String str2;
        String str3;
        StringBuilder A0s = AbstractC58318PtA.A0s(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        ArrayList A1E = AbstractC166987dD.A1E();
        String str4 = this.A07;
        if (!TextUtils.isEmpty(str4)) {
            A0s.append(" AND bucket_display_name = ?");
            A1E.add(str4);
        }
        Integer num = this.A04;
        if (num != null) {
            A0s.append(" AND _size < ?");
            AbstractC166997dE.A1S(num, A1E);
        }
        String str5 = this.A06;
        int i2 = 0;
        switch (str5.hashCode()) {
            case -1905167199:
                if (str5.equals(CameraRollManager.ASSET_TYPE_PHOTOS)) {
                    str = " AND media_type = 1";
                    break;
                }
                this.A02.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, AnonymousClass001.A18("Invalid filter option: '", str5, "'. Expected one of '", CameraRollManager.ASSET_TYPE_PHOTOS, "', '", CameraRollManager.ASSET_TYPE_VIDEOS, "' or '", CameraRollManager.ASSET_TYPE_ALL, "'."));
                return;
            case -1732810888:
                if (str5.equals(CameraRollManager.ASSET_TYPE_VIDEOS)) {
                    str = " AND media_type = 3";
                    break;
                }
                this.A02.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, AnonymousClass001.A18("Invalid filter option: '", str5, "'. Expected one of '", CameraRollManager.ASSET_TYPE_PHOTOS, "', '", CameraRollManager.ASSET_TYPE_VIDEOS, "' or '", CameraRollManager.ASSET_TYPE_ALL, "'."));
                return;
            case 65921:
                if (str5.equals(CameraRollManager.ASSET_TYPE_ALL)) {
                    str = " AND media_type IN (3,1)";
                    break;
                }
                this.A02.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, AnonymousClass001.A18("Invalid filter option: '", str5, "'. Expected one of '", CameraRollManager.ASSET_TYPE_PHOTOS, "', '", CameraRollManager.ASSET_TYPE_VIDEOS, "' or '", CameraRollManager.ASSET_TYPE_ALL, "'."));
                return;
            default:
                this.A02.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, AnonymousClass001.A18("Invalid filter option: '", str5, "'. Expected one of '", CameraRollManager.ASSET_TYPE_PHOTOS, "', '", CameraRollManager.ASSET_TYPE_VIDEOS, "' or '", CameraRollManager.ASSET_TYPE_ALL, "'."));
                return;
        }
        A0s.append(str);
        ReadableArray readableArray = this.A03;
        if (readableArray != null && readableArray.size() > 0) {
            A0s.append(" AND mime_type IN (");
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                A0s.append("?,");
                A1E.add(readableArray.getString(i3));
            }
            A0s.replace(A0s.length() - 1, A0s.length(), ")");
        }
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        ContentResolver contentResolver = this.A01.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    i = this.A00;
                    A0b.putInt("android:query-arg-limit", i + 1);
                    str2 = this.A05;
                    if (!TextUtils.isEmpty(str2)) {
                        A0b.putInt("android:query-arg-offset", Integer.parseInt(str2));
                    }
                    A0b.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
                    A0b.putInt("android:query-arg-sort-direction", 1);
                    A0b.putString("android:query-arg-sql-selection", A0s.toString());
                    A0b.putStringArray("android:query-arg-sql-selection-args", AbstractC58319PtB.A1b(A1E, A1E.size()));
                    android.net.Uri contentUri = MediaStore.Files.getContentUri("external");
                    String[] strArr = CameraRollManager.PROJECTION_LIST;
                    Integer num2 = C05F.A01;
                    if (contentUri != null) {
                        str3 = contentUri.getAuthority();
                    } else {
                        str3 = null;
                    }
                    C06280Ut.A00(str3, -910059163, num2);
                    cursor = contentResolver.query(contentUri, strArr, A0b, null);
                } else {
                    i = this.A00;
                    int i4 = i + 1;
                    String A0O = AnonymousClass001.A0O("limit=", i4);
                    str2 = this.A05;
                    if (!TextUtils.isEmpty(str2)) {
                        A0O = AnonymousClass001.A07(i4, "limit=", str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    cursor = C0fI.A01(contentResolver, MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(A0O).build(), A0s.toString(), "date_added DESC, date_modified DESC", CameraRollManager.PROJECTION_LIST, (String[]) A1E.toArray(new String[A1E.size()]), 790849953);
                }
            } catch (SecurityException e) {
                ((PromiseImpl) this.A02).reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e, null);
                if (0 == 0) {
                    return;
                }
            }
            if (cursor == null) {
                this.A02.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                return;
            }
            try {
                CameraRollManager.putEdges(contentResolver, cursor, A0c, i);
                if (!TextUtils.isEmpty(str2)) {
                    i2 = Integer.parseInt(str2);
                }
                CameraRollManager.putPageInfo(cursor, A0c, i, i2);
                this.A02.resolve(A0c);
                cursor.close();
            } catch (Throwable th) {
                this.A02.resolve(A0c);
                throw th;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public R33(InterfaceC65622ToD interfaceC65622ToD, Q21 q21, ReadableArray readableArray, Integer num, String str, String str2, String str3, int i) {
        super(q21);
        this.A01 = q21;
        this.A00 = i;
        this.A05 = str;
        this.A07 = str2;
        this.A03 = readableArray;
        this.A02 = interfaceC65622ToD;
        this.A06 = str3;
        this.A04 = num;
    }
}
