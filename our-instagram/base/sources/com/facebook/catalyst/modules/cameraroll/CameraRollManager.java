package com.facebook.catalyst.modules.cameraroll;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C0I2;
import X.C60782q2;
import X.InterfaceC65622ToD;
import X.InterfaceC65657Tqj;
import X.R32;
import X.R33;
import X.R3M;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreact.specs.NativeCameraRollManagerSpec;
import com.facebook.location.platform.api.Location;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = NativeCameraRollManagerSpec.NAME)
/* loaded from: classes10.dex */
public class CameraRollManager extends NativeCameraRollManagerSpec {
    public static final String ASSET_TYPE_ALL = "All";
    public static final String ASSET_TYPE_PHOTOS = "Photos";
    public static final String ASSET_TYPE_VIDEOS = "Videos";
    public static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    public static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    public static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    public static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final int IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL = 29;
    public static final String[] PROJECTION_LIST;
    public static final String SELECTION_BUCKET = "bucket_display_name = ?";
    public static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    public static final String SELECTION_MEDIA_SIZE = "_size < ?";

    static {
        ArrayList A12 = AbstractC58319PtB.A12(new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "_size", "_data"});
        if (Build.VERSION.SDK_INT < 29) {
            A12.add(Location.LATITUDE);
            A12.add("longitude");
        }
        PROJECTION_LIST = AbstractC58319PtB.A1b(A12, 0);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, InterfaceC65657Tqj interfaceC65657Tqj, int i) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex(IgReactMediaPickerNativeModule.WIDTH);
        int columnIndex6 = cursor.getColumnIndex(IgReactMediaPickerNativeModule.HEIGHT);
        int columnIndex7 = cursor.getColumnIndex("_size");
        int columnIndex8 = cursor.getColumnIndex("longitude");
        int columnIndex9 = cursor.getColumnIndex(Location.LATITUDE);
        int columnIndex10 = cursor.getColumnIndex("_data");
        int i2 = 0;
        while (i2 < i && !cursor.isAfterLast()) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
            if (putImageInfo(contentResolver, cursor, A0c2, columnIndex, columnIndex5, columnIndex6, columnIndex7, columnIndex10, columnIndex2)) {
                putBasicNodeInfo(cursor, A0c2, columnIndex2, columnIndex3, columnIndex4);
                if (Build.VERSION.SDK_INT < 29) {
                    putLocationInfo(cursor, A0c2, columnIndex8, columnIndex9);
                }
                A0c.putMap("node", A0c2);
                writableNativeArray.pushMap(A0c);
            } else {
                i2--;
            }
            cursor.moveToNext();
            i2++;
        }
        interfaceC65657Tqj.putArray("edges", writableNativeArray);
    }

    @Override // com.facebook.fbreact.specs.NativeCameraRollManagerSpec
    public void getPhotos(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD) {
        String str;
        String str2;
        String str3;
        Integer num;
        int i = readableMap.getInt("first");
        ReadableArray readableArray = null;
        if (readableMap.hasKey("after")) {
            str = readableMap.getString("after");
        } else {
            str = null;
        }
        if (readableMap.hasKey("groupName")) {
            str2 = readableMap.getString("groupName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("assetType")) {
            str3 = readableMap.getString("assetType");
        } else {
            str3 = ASSET_TYPE_PHOTOS;
        }
        if (readableMap.hasKey("maxSize") && !readableMap.isNull("maxSize")) {
            num = Integer.valueOf(readableMap.getInt("maxSize"));
        } else {
            num = null;
        }
        if (readableMap.hasKey("mimeTypes")) {
            readableArray = readableMap.getArray("mimeTypes");
        }
        if (!readableMap.hasKey("groupTypes")) {
            new R33(interfaceC65622ToD, AbstractC58321PtD.A0b(this), readableArray, num, str, str2, str3, i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new RuntimeException("groupTypes is not supported on Android");
    }

    public CameraRollManager(R3M r3m) {
        super(r3m);
    }

    public static void putBasicNodeInfo(Cursor cursor, InterfaceC65657Tqj interfaceC65657Tqj, int i, int i2, int i3) {
        interfaceC65657Tqj.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, cursor.getString(i));
        interfaceC65657Tqj.putString("group_name", cursor.getString(i2));
        interfaceC65657Tqj.putDouble("timestamp", cursor.getLong(i3) / 1000.0d);
    }

    public static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, InterfaceC65657Tqj interfaceC65657Tqj, int i, int i2, int i3, int i4, int i5, int i6) {
        StringBuilder A1C;
        String str;
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        Uri A03 = AbstractC08820cl.A03(AnonymousClass001.A0R("file://", cursor.getString(i5)));
        File A11 = AbstractC166987dD.A11(cursor.getString(i5));
        String name = A11.getName();
        A0c.putString("uri", A03.toString());
        A0c.putString("filename", name);
        float f = cursor.getInt(i2);
        float f2 = cursor.getInt(i3);
        long j = cursor.getLong(i4);
        String string = cursor.getString(i6);
        if (string != null) {
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(A03, "r");
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                    if (f <= 0.0f || f2 <= 0.0f) {
                        try {
                            try {
                                f = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            } catch (NumberFormatException e) {
                                C0I2.A05("ReactNative", AnonymousClass001.A0R("Number format exception occurred while trying to fetch video metadata for ", A03.toString()), e);
                                return false;
                            }
                        } finally {
                            mediaMetadataRetriever.release();
                            openAssetFileDescriptor.close();
                        }
                    }
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata != null && (extractMetadata.equals("90") || extractMetadata.equals("270"))) {
                        float f3 = f2;
                        f2 = f;
                        f = f3;
                    }
                    A0c.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                    mediaMetadataRetriever.release();
                    openAssetFileDescriptor.close();
                } catch (Exception e2) {
                    e = e2;
                    A1C = AbstractC166987dD.A1C();
                    str = "Could not get video metadata for ";
                    A1C.append(str);
                    C0I2.A05("ReactNative", AbstractC166997dE.A0x(A03.toString(), A1C), e);
                    return false;
                }
            } else if (string.startsWith("image")) {
                try {
                    boolean z = C60782q2.A0N;
                    int A0M = new C60782q2(A11.getCanonicalPath()).A0M("Orientation", 1);
                    if (A0M == 6 || A0M == 8) {
                        f2 = f;
                        f = f2;
                    }
                } catch (IOException e3) {
                    C0I2.A05("ReactNative", AnonymousClass001.A0R("Could not get Image Exif", A03.toString()), e3);
                }
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(A03, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = options.outWidth;
                f2 = options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e4) {
                e = e4;
                A1C = AbstractC166987dD.A1C();
                str = "Could not get width/height for ";
                A1C.append(str);
                C0I2.A05("ReactNative", AbstractC166997dE.A0x(A03.toString(), A1C), e);
                return false;
            }
        }
        A0c.putDouble(IgReactMediaPickerNativeModule.WIDTH, f);
        A0c.putDouble(IgReactMediaPickerNativeModule.HEIGHT, f2);
        A0c.putDouble("fileSize", j);
        interfaceC65657Tqj.putMap("image", A0c);
        return true;
    }

    public static void putLocationInfo(Cursor cursor, InterfaceC65657Tqj interfaceC65657Tqj, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putDouble("longitude", d);
            A0c.putDouble(Location.LATITUDE, d2);
            interfaceC65657Tqj.putMap("location", A0c);
        }
    }

    public static void putPageInfo(Cursor cursor, InterfaceC65657Tqj interfaceC65657Tqj, int i, int i2) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putBoolean("has_next_page", AbstractC167007dF.A1Q(i, cursor.getCount()));
        if (i < cursor.getCount()) {
            A0c.putString("end_cursor", Integer.toString(i2 + i));
        }
        interfaceC65657Tqj.putMap("page_info", A0c);
    }

    @Override // com.facebook.fbreact.specs.NativeCameraRollManagerSpec
    public void saveToCameraRoll(String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        new R32(AbstractC08820cl.A03(str), interfaceC65622ToD, AbstractC58321PtD.A0b(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
