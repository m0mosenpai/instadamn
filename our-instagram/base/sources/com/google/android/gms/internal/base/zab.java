package com.google.android.gms.internal.base;

import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class zab extends Binder implements IInterface {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A00(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r3 = r4
            com.google.android.gms.signin.internal.zad r3 = (com.google.android.gms.signin.internal.zad) r3
            r0 = 532833864(0x1fc26648, float:8.2331406E-20)
            int r2 = X.C0f9.A03(r0)
            switch(r5) {
                case 3: goto L18;
                case 4: goto L26;
                case 5: goto Ld;
                case 6: goto L26;
                case 7: goto L29;
                case 8: goto L43;
                case 9: goto L15;
                default: goto Ld;
            }
        Ld:
            r1 = 0
            r0 = -1661156465(0xffffffff9cfcc38f, float:-1.6726512E-21)
        L11:
            X.C0f9.A0A(r0, r2)
            return r1
        L15:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zag.CREATOR
            goto L36
        L18:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            int r0 = r6.readInt()
            if (r0 == 0) goto L23
            r1.createFromParcel(r6)
        L23:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zaa.CREATOR
            goto L36
        L26:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            goto L36
        L29:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            int r0 = r6.readInt()
            if (r0 == 0) goto L34
            r1.createFromParcel(r6)
        L34:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
        L36:
            int r0 = r6.readInt()
            if (r0 == 0) goto L3f
            r1.createFromParcel(r6)
        L3f:
            X.C63097Scx.A00(r6)
            goto L54
        L43:
            android.os.Parcelable$Creator r1 = com.google.android.gms.signin.internal.zak.CREATOR
            int r0 = r6.readInt()
            if (r0 != 0) goto L5c
            r0 = 0
        L4c:
            com.google.android.gms.signin.internal.zak r0 = (com.google.android.gms.signin.internal.zak) r0
            X.C63097Scx.A00(r6)
            r3.FF0(r0)
        L54:
            r7.writeNoException()
            r1 = 1
            r0 = 1582938461(0x5e59b95d, float:3.9221683E18)
            goto L11
        L5c:
            java.lang.Object r0 = r1.createFromParcel(r6)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zab.A00(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-75446214, C0f9.A03(-1937372195));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A00;
        int i3;
        int A03 = C0f9.A03(-187010873);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A00 = true;
                i3 = 984591939;
                C0f9.A0A(i3, A03);
                return A00;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        A00 = A00(i, parcel, parcel2, i2);
        i3 = 714703134;
        C0f9.A0A(i3, A03);
        return A00;
    }
}
