package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_common.zza;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TEJ implements InterfaceC65551TmU {
    public zzh A00;
    public boolean A01;
    public final Context A02;
    public final zzp A03 = new zzp(null);

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.Tjp] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.RNe] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.mlkit_vision_text_common.zzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.RNe] */
    @Override // X.InterfaceC65551TmU
    public final SVX FFb(C62552SGd c62552SGd) {
        List c60707RNj;
        List c60707RNj2;
        String str;
        int i;
        if (this.A00 == null) {
            FFq();
        }
        if (this.A00 != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(c62552SGd.A02);
            int i2 = c62552SGd.A00;
            int i3 = c62552SGd.A01;
            ?? obj = new Object();
            obj.A00 = i2;
            obj.A01 = i3;
            obj.A02 = 0;
            obj.A04 = 0L;
            obj.A03 = 0;
            try {
                zzh zzhVar = this.A00;
                C3U5.A02(zzhVar);
                int A03 = C0f9.A03(-559114030);
                Parcel A00 = zzhVar.A00();
                AbstractC58321PtD.A19(objectWrapper, A00);
                A00.writeInt(1);
                obj.writeToParcel(A00, 0);
                Parcel A01 = zzhVar.A01(A00, 1);
                zzl[] zzlVarArr = (zzl[]) A01.createTypedArray(zzl.CREATOR);
                A01.recycle();
                C0f9.A0A(304528109, A03);
                SparseArray A0G = AbstractC58318PtA.A0G();
                for (zzl zzlVar : zzlVarArr) {
                    SparseArray sparseArray = (SparseArray) A0G.get(zzlVar.A02);
                    if (sparseArray == null) {
                        sparseArray = AbstractC58318PtA.A0G();
                        A0G.append(zzlVar.A02, sparseArray);
                    }
                    sparseArray.append(zzlVar.A03, zzlVar);
                }
                AbstractC60714RNu abstractC60714RNu = AbstractC60708RNk.A00;
                ?? obj2 = new Object();
                obj2.A02 = new Object[4];
                obj2.A00 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= A0G.size()) {
                        break;
                    }
                    SparseArray sparseArray2 = (SparseArray) A0G.valueAt(i5);
                    ?? obj3 = new Object();
                    obj3.A02 = new Object[4];
                    obj3.A00 = 0;
                    for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                        obj3.A00(sparseArray2.valueAt(i6));
                    }
                    obj3.A01 = true;
                    Object[] objArr = obj3.A02;
                    int i7 = obj3.A00;
                    if (i7 == 0) {
                        c60707RNj2 = C60707RNj.A02;
                    } else {
                        c60707RNj2 = new C60707RNj(objArr, i7);
                    }
                    List A002 = AbstractC62212S2h.A00(new Object(), c60707RNj2);
                    zzf zzfVar = ((zzl) c60707RNj2.get(0)).A04;
                    AbstractC60714RNu listIterator = c60707RNj2.listIterator(0);
                    int i8 = Integer.MIN_VALUE;
                    int i9 = Integer.MIN_VALUE;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = Integer.MAX_VALUE;
                    while (listIterator.hasNext()) {
                        zzf zzfVar2 = ((zzl) listIterator.next()).A04;
                        int i12 = zzfVar.A01;
                        int i13 = zzfVar.A02;
                        double radians = Math.toRadians(zzfVar.A00);
                        double sin = Math.sin(radians);
                        double cos = Math.cos(radians);
                        Point point = new Point(zzfVar2.A01, zzfVar2.A02);
                        point.offset(-i12, -i13);
                        Point point2 = r5[0];
                        int i14 = point2.x;
                        double d = point2.y;
                        int i15 = (int) ((i14 * cos) + (d * sin));
                        int i16 = (int) (((-i14) * sin) + (d * cos));
                        point2.x = i15;
                        point2.y = i16;
                        int i17 = zzfVar2.A03 + i15;
                        int i18 = zzfVar2.A04 + i16;
                        Point[] pointArr = {point, new Point(i17, i16), new Point(i17, i18), new Point(i15, i18)};
                        int i19 = 0;
                        do {
                            Point point3 = pointArr[i19];
                            int i20 = point3.x;
                            i10 = Math.min(i10, i20);
                            i8 = Math.max(i8, i20);
                            int i21 = point3.y;
                            i11 = Math.min(i11, i21);
                            i9 = Math.max(i9, i21);
                            i19++;
                        } while (i19 < 4);
                    }
                    int i22 = zzfVar.A01;
                    int i23 = zzfVar.A02;
                    double radians2 = Math.toRadians(zzfVar.A00);
                    double sin2 = Math.sin(radians2);
                    double cos2 = Math.cos(radians2);
                    Point[] pointArr2 = {new Point(i10, i11), new Point(i8, i11), new Point(i8, i9), new Point(i10, i9)};
                    int i24 = 0;
                    do {
                        Point point4 = pointArr2[i24];
                        int i25 = point4.x;
                        double d2 = point4.y;
                        point4.x = (int) ((i25 * cos2) - (d2 * sin2));
                        point4.y = (int) ((i25 * sin2) + (d2 * cos2));
                        point4.offset(i22, i23);
                        i24++;
                    } while (i24 < 4);
                    List asList = Arrays.asList(pointArr2);
                    String A003 = S91.A00.A00(AbstractC62212S2h.A00(T6M.A00, A002));
                    Rect A004 = SSX.A00(asList);
                    HashMap A1G = AbstractC166987dD.A1G();
                    Iterator it = A002.iterator();
                    while (it.hasNext()) {
                        String str2 = ((AbstractC62588SHo) it.next()).A02;
                        if (A1G.containsKey(str2)) {
                            i = AbstractC166987dD.A0H(A1G.get(str2));
                        } else {
                            i = 0;
                        }
                        AbstractC166997dE.A1U(str2, A1G, i + 1);
                    }
                    java.util.Set entrySet = A1G.entrySet();
                    if (entrySet.isEmpty() || (str = AbstractC31172DnG.A17((Map.Entry) Collections.max(entrySet, S91.A01))) == null || str.isEmpty()) {
                        str = "und";
                    }
                    obj2.A00(new RWA(A004, A003, str, asList, A002));
                    i4++;
                }
                obj2.A01 = true;
                Object[] objArr2 = obj2.A02;
                int i26 = obj2.A00;
                if (i26 == 0) {
                    c60707RNj = C60707RNj.A02;
                } else {
                    c60707RNj = new C60707RNj(objArr2, i26);
                }
                S91.A00.A00(AbstractC62212S2h.A00(T6N.A00, c60707RNj));
                return new SVX(c60707RNj);
            } catch (RemoteException e) {
                throw new RkG("Failed to run legacy text recognizer.", e);
            }
        }
        throw new RkG("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65551TmU
    public final void FFq() {
        IInterface zzaVar;
        zzh zzhVar;
        if (this.A00 == null) {
            try {
                Context context = this.A02;
                IBinder A08 = C63392SjE.A04(context, C63392SjE.A0A, "com.google.android.gms.vision.dynamite").A08("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
                if (A08 == null) {
                    zzaVar = null;
                } else {
                    IInterface queryLocalInterface = A08.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    if (queryLocalInterface instanceof zzk) {
                        zzaVar = (zzk) queryLocalInterface;
                    } else {
                        zzaVar = new zza("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", A08);
                        C0f9.A0A(-1714970687, C0f9.A03(-1078268369));
                    }
                }
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzp zzpVar = this.A03;
                zza zzaVar2 = (zza) zzaVar;
                int A03 = C0f9.A03(1069776854);
                Parcel A00 = zzaVar2.A00();
                AbstractC58321PtD.A19(objectWrapper, A00);
                A00.writeInt(1);
                zzpVar.writeToParcel(A00, 0);
                Parcel A01 = zzaVar2.A01(A00, 1);
                IBinder readStrongBinder = A01.readStrongBinder();
                if (readStrongBinder == null) {
                    zzhVar = 0;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                    if (queryLocalInterface2 instanceof zzh) {
                        zzhVar = (zzh) queryLocalInterface2;
                    } else {
                        zza zzaVar3 = new zza("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", readStrongBinder);
                        C0f9.A0A(-401952875, C0f9.A03(563648400));
                        zzhVar = zzaVar3;
                    }
                }
                A01.recycle();
                C0f9.A0A(672878838, A03);
                this.A00 = zzhVar;
                if (zzhVar == 0 && !this.A01) {
                    AbstractC62229S3a.A00(context);
                    this.A01 = true;
                }
            } catch (RjO e) {
                throw new RkG("Failed to load deprecated vision dynamite module.", e);
            } catch (RemoteException e2) {
                throw new RkG("Failed to create legacy text recognizer.", e2);
            }
        }
    }

    @Override // X.InterfaceC65551TmU
    public final void FFz() {
        zzh zzhVar = this.A00;
        if (zzhVar != null) {
            try {
                int A03 = C0f9.A03(476126879);
                zzhVar.A02(zzhVar.A00(), 2);
                C0f9.A0A(-518064536, A03);
            } catch (RemoteException e) {
                android.util.Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
            }
            this.A00 = null;
        }
    }

    public TEJ(Context context) {
        this.A02 = context;
    }
}
