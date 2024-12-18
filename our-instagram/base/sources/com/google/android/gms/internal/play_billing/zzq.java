package com.google.android.gms.internal.play_billing;

import X.AbstractC167027dH;
import X.C0f9;
import X.C63258SgG;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class zzq implements IInterface, zzs {
    public final IBinder A00;

    public zzq(String str, IBinder iBinder) {
        int A03 = C0f9.A03(678282863);
        this.A00 = iBinder;
        C0f9.A0A(-1496362575, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-484911195);
        IBinder iBinder = this.A00;
        C0f9.A0A(631168460, A03);
        return iBinder;
    }

    public zzq(IBinder iBinder) {
        this("com.android.vending.billing.IInAppBillingService", iBinder);
        C0f9.A0A(-54439185, C0f9.A03(-1240290399));
    }

    public static Bundle A00(Parcel parcel, zzq zzqVar, int i) {
        Parcel A03 = zzqVar.A03(parcel, i);
        Bundle bundle = (Bundle) C63258SgG.A00(A03, Bundle.CREATOR);
        A03.recycle();
        return bundle;
    }

    public static void A01(Parcel parcel, String str, String str2, int i) {
        parcel.writeInt(i);
        parcel.writeString(str);
        parcel.writeString(str2);
    }

    public final Parcel A02() {
        int A03 = C0f9.A03(-1274318119);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        C0f9.A0A(-795885213, A03);
        return obtain;
    }

    public final Parcel A03(Parcel parcel, int i) {
        int A03 = C0f9.A03(191137988);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(1188140812, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(1426428882, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(1628576773, A03);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int FFV(int i, String str, String str2) {
        int A03 = C0f9.A03(-638272200);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        Parcel A032 = A03(A02, 5);
        int readInt = A032.readInt();
        A032.recycle();
        C0f9.A0A(-1484769603, A03);
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int FG3(Bundle bundle, String str, String str2, int i) {
        int A03 = C0f9.A03(-1198202798);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        C63258SgG.A01(A02, bundle);
        Parcel A032 = A03(A02, 10);
        int readInt = A032.readInt();
        A032.recycle();
        C0f9.A0A(72009387, A03);
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGA(Bundle bundle, String str, String str2, int i) {
        int A03 = C0f9.A03(1246135016);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 902);
        C0f9.A0A(152304438, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGI(Bundle bundle, String str, String str2, int i) {
        int A03 = C0f9.A03(272557791);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 12);
        C0f9.A0A(1058619827, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGO(String str, String str2, String str3, String str4, int i) {
        int A03 = C0f9.A03(-1307383102);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        A02.writeString(null);
        Bundle A00 = A00(A02, this, 3);
        C0f9.A0A(-364791396, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGV(Bundle bundle, String str, String str2, String str3, String str4, int i) {
        int A03 = C0f9.A03(970179152);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        A02.writeString(null);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 8);
        C0f9.A0A(-1636542717, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGb(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = C0f9.A03(1867122103);
        Parcel A02 = A02();
        A01(A02, str, str2, 6);
        A02.writeString(str3);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 9);
        C0f9.A0A(-2143232390, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGf(String str, String str2, String str3, int i) {
        int A03 = C0f9.A03(-744358610);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        Bundle A00 = A00(A02, this, 4);
        C0f9.A0A(1149163865, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGj(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = C0f9.A03(277151362);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 11);
        C0f9.A0A(1936986514, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGm(Bundle bundle, String str, String str2, int i) {
        int A03 = C0f9.A03(-1186087047);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        C63258SgG.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 2);
        C0f9.A0A(250668223, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle FGp(Bundle bundle, Bundle bundle2, String str, String str2, int i) {
        int A03 = C0f9.A03(1543223846);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        C63258SgG.A01(A02, bundle);
        C63258SgG.A01(A02, bundle2);
        Bundle A00 = A00(A02, this, 901);
        C0f9.A0A(-2333570, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int FH4(int i, String str, String str2) {
        int A03 = C0f9.A03(1533316962);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        Parcel A032 = A03(A02, 1);
        int readInt = A032.readInt();
        A032.recycle();
        C0f9.A0A(1329997573, A03);
        return readInt;
    }
}
