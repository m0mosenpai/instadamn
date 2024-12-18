package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* renamed from: X.ROo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60729ROo extends AbstractC62644SKd {
    public final C60727ROl A00;

    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.Parcelable, java.lang.Object, com.google.android.gms.internal.vision.zzs] */
    public final SparseArray A01(C62681SLu c62681SLu) {
        Barcode[] barcodeArr;
        ?? obj = new Object();
        SEZ sez = c62681SLu.A02;
        obj.A00 = sez.A00;
        obj.A01 = sez.A01;
        obj.A03 = 0;
        obj.A02 = 0;
        obj.A04 = 0L;
        Bitmap bitmap = c62681SLu.A00;
        if (bitmap != null) {
            C60727ROl c60727ROl = this.A00;
            if (!AbstractC167007dF.A1W(c60727ROl.A00())) {
                barcodeArr = new Barcode[0];
            } else {
                try {
                    ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
                    Object A00 = c60727ROl.A00();
                    C3U5.A02(A00);
                    zzb zzbVar = (zzb) ((zzl) A00);
                    int A03 = C0f9.A03(-1436719897);
                    Parcel A002 = zzbVar.A00();
                    AbstractC58321PtD.A19(objectWrapper, A002);
                    A002.writeInt(1);
                    obj.writeToParcel(A002, 0);
                    Parcel A01 = zzbVar.A01(A002, 2);
                    barcodeArr = (Barcode[]) A01.createTypedArray(Barcode.CREATOR);
                    A01.recycle();
                    C0f9.A0A(-2065881195, A03);
                } catch (RemoteException e) {
                    android.util.Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                    barcodeArr = new Barcode[0];
                }
            }
            if (barcodeArr == null) {
                throw AbstractC166987dD.A12("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer A003 = c62681SLu.A00();
            C60727ROl c60727ROl2 = this.A00;
            C3U5.A02(A003);
            if (!AbstractC167007dF.A1W(c60727ROl2.A00())) {
                barcodeArr = new Barcode[0];
            } else {
                try {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(A003);
                    Object A004 = c60727ROl2.A00();
                    C3U5.A02(A004);
                    zzb zzbVar2 = (zzb) ((zzl) A004);
                    int A032 = C0f9.A03(176351068);
                    Parcel A005 = zzbVar2.A00();
                    AbstractC58321PtD.A19(objectWrapper2, A005);
                    A005.writeInt(1);
                    obj.writeToParcel(A005, 0);
                    Parcel A012 = zzbVar2.A01(A005, 1);
                    barcodeArr = (Barcode[]) A012.createTypedArray(Barcode.CREATOR);
                    A012.recycle();
                    C0f9.A0A(-1206288851, A032);
                } catch (RemoteException e2) {
                    android.util.Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                    barcodeArr = new Barcode[0];
                }
            }
        }
        SparseArray sparseArray = new SparseArray(barcodeArr.length);
        for (Barcode barcode : barcodeArr) {
            sparseArray.append(barcode.A0C.hashCode(), barcode);
        }
        return sparseArray;
    }

    public C60729ROo(C60727ROl c60727ROl) {
        this.A00 = c60727ROl;
    }

    @Override // X.AbstractC62644SKd
    public final void A00() {
        super.A00();
        this.A00.A03();
    }

    public C60729ROo() {
        throw AbstractC166987dD.A14("Default constructor called");
    }
}
