package X;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzl;

/* renamed from: X.SPk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62753SPk {
    public Object A00;
    public final Context A03;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Object A04 = AbstractC58318PtA.A0b();
    public boolean A01 = false;
    public boolean A02 = false;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A01(android.content.Context r7, X.C63392SjE r8) {
        /*
            r6 = this;
            r5 = r6
            X.ROl r5 = (X.C60727ROl) r5
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r3 = r8.A08(r0)
            r2 = 0
            if (r3 == 0) goto L1a
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r4 = r3.queryLocalInterface(r1)
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.zzn
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.vision.zzn r4 = (com.google.android.gms.internal.vision.zzn) r4
            if (r4 != 0) goto L2d
        L1a:
            return r2
        L1b:
            com.google.android.gms.internal.vision.zzp r4 = new com.google.android.gms.internal.vision.zzp
            r4.<init>(r1, r3)
            r0 = -420278230(0xffffffffe6f3102a, float:-5.739166E23)
            int r1 = X.C0f9.A03(r0)
            r0 = -237881695(0xfffffffff1d236a1, float:-2.0818526E30)
            X.C0f9.A0A(r0, r1)
        L2d:
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper
            r1.<init>(r7)
            com.google.android.gms.internal.vision.zzk r3 = r5.A00
            X.C3U5.A02(r3)
            com.google.android.gms.internal.vision.zzb r4 = (com.google.android.gms.internal.vision.zzb) r4
            r0 = 996171622(0x3b605f66, float:0.003423655)
            int r5 = X.C0f9.A03(r0)
            android.os.Parcel r2 = r4.A00()
            X.AbstractC58321PtD.A19(r1, r2)
            r1 = 0
            r0 = 1
            r2.writeInt(r0)
            r3.writeToParcel(r2, r1)
            android.os.Parcel r4 = r4.A01(r2, r0)
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L64
            r2 = 0
        L5a:
            r4.recycle()
            r0 = -1837134743(0xffffffff927f8c69, float:-8.063688E-28)
            X.C0f9.A0A(r0, r5)
            return r2
        L64:
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r2 = r3.queryLocalInterface(r1)
            boolean r0 = r2 instanceof com.google.android.gms.internal.vision.zzl
            if (r0 != 0) goto L5a
            com.google.android.gms.internal.vision.zzo r2 = new com.google.android.gms.internal.vision.zzo
            r2.<init>(r1, r3)
            r0 = 55434940(0x34ddebc, float:6.049977E-37)
            int r1 = X.C0f9.A03(r0)
            r0 = 145437329(0x8ab3291, float:1.0303576E-33)
            X.C0f9.A0A(r0, r1)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62753SPk.A01(android.content.Context, X.SjE):java.lang.Object");
    }

    public final Object A00() {
        Object obj;
        synchronized (this.A04) {
            obj = this.A00;
            if (obj == null) {
                C63392SjE c63392SjE = null;
                try {
                    c63392SjE = C63392SjE.A04(this.A03, C63392SjE.A08, this.A06);
                } catch (RjO unused) {
                    String str = this.A07;
                    String format = String.format("%s.%s", "com.google.android.gms.vision", str);
                    Object[] objArr = {format};
                    if (android.util.Log.isLoggable("Vision", 3)) {
                        String.format("Cannot load thick client module, fall back to load optional module %s", objArr);
                    }
                    try {
                        c63392SjE = C63392SjE.A04(this.A03, C63392SjE.A0A, format);
                    } catch (RjO e) {
                        Object[] objArr2 = {format};
                        if (android.util.Log.isLoggable("Vision", 6)) {
                            boolean isLoggable = android.util.Log.isLoggable("Vision", 3);
                            String format2 = String.format("Error loading optional module %s", objArr2);
                            if (isLoggable) {
                                android.util.Log.e("Vision", format2, e);
                            } else {
                                String valueOf = String.valueOf(e);
                                StringBuilder A15 = AbstractC58320PtC.A15(valueOf, AbstractC58319PtB.A05(format2) + 2);
                                A15.append(format2);
                                android.util.Log.e("Vision", MSZ.A0u(": ", valueOf, A15));
                            }
                        }
                        if (!this.A01) {
                            Object[] objArr3 = {str};
                            if (android.util.Log.isLoggable("Vision", 3)) {
                                String.format("Broadcasting download intent for dependency %s", objArr3);
                            }
                            Intent A04 = AbstractC31171DnF.A04();
                            A04.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                            A04.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                            A04.setAction("com.google.android.gms.vision.DEPENDENCY");
                            this.A03.sendBroadcast(A04);
                            this.A01 = true;
                        }
                    }
                }
                if (c63392SjE != null) {
                    try {
                        this.A00 = A01(this.A03, c63392SjE);
                    } catch (RjO | RemoteException e2) {
                        android.util.Log.e(this.A05, "Error creating remote native handle", e2);
                    }
                }
                boolean z = this.A02;
                if (!z && this.A00 == null) {
                    android.util.Log.w(this.A05, "Native handle not yet available. Reverting to no-op handle.");
                    this.A02 = true;
                } else if (z && this.A00 != null) {
                    android.util.Log.w(this.A05, "Native handle is now available.");
                }
                obj = this.A00;
            }
        }
        return obj;
    }

    public final void A03() {
        synchronized (this.A04) {
            if (this.A00 != null) {
                try {
                    A02();
                } catch (RemoteException e) {
                    android.util.Log.e(this.A05, "Could not finalize native handle", e);
                }
            }
        }
    }

    public AbstractC62753SPk(Context context, String str, String str2) {
        this.A03 = context;
        this.A05 = str;
        String valueOf = String.valueOf(str2);
        this.A06 = AbstractC58320PtC.A0w(valueOf.length(), "com.google.android.gms.vision.dynamite.", valueOf);
        this.A07 = str2;
    }

    public void A02() {
        if (A00() != null) {
            Object A00 = A00();
            C3U5.A02(A00);
            zzb zzbVar = (zzb) ((zzl) A00);
            int A03 = C0f9.A03(1430192686);
            zzbVar.A02(zzbVar.A00(), 3);
            C0f9.A0A(212135401, A03);
        }
    }
}
