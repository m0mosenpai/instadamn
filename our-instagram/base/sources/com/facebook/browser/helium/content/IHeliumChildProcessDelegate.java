package com.facebook.browser.helium.content;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface IHeliumChildProcessDelegate extends IInterface {
    ParcelFileDescriptor B4H();

    long B4I();

    long B4J();

    ParcelFileDescriptor BAC();

    void Cnb(String str, long j);

    void EHO(long j);

    /* loaded from: classes.dex */
    public abstract class Stub extends Binder implements IHeliumChildProcessDelegate {

        /* loaded from: classes.dex */
        public final class Proxy implements IHeliumChildProcessDelegate {
            public IBinder A00;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.A00;
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final ParcelFileDescriptor B4H() {
                Object obj;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                    if (obtain2.readInt() != 0) {
                        obj = creator.createFromParcel(obtain2);
                    } else {
                        obj = null;
                    }
                    return (ParcelFileDescriptor) obj;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final long B4I() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final long B4J() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    this.A00.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final ParcelFileDescriptor BAC() {
                Object obj;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    this.A00.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                    if (obtain2.readInt() != 0) {
                        obj = creator.createFromParcel(obtain2);
                    } else {
                        obj = null;
                    }
                    return (ParcelFileDescriptor) obj;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final void Cnb(String str, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.A00.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.facebook.browser.helium.content.IHeliumChildProcessDelegate
            public final void EHO(long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
                    obtain.writeLong(j);
                    this.A00.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000d. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r3 = 1
                java.lang.String r1 = "com.facebook.browser.helium.content.IHeliumChildProcessDelegate"
                if (r5 < r3) goto L10
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r5 > r0) goto L15
                r6.enforceInterface(r1)
                switch(r5) {
                    case 1: goto L1e;
                    case 2: goto L23;
                    case 3: goto L28;
                    case 4: goto L33;
                    case 5: goto L48;
                    case 6: goto L54;
                    default: goto L10;
                }
            L10:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L15:
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 != r0) goto L10
                r7.writeString(r1)
                return r3
            L1e:
                android.os.ParcelFileDescriptor r0 = r4.B4H()
                goto L37
            L23:
                long r0 = r4.B4J()
                goto L2c
            L28:
                long r0 = r4.B4I()
            L2c:
                r7.writeNoException()
                r7.writeLong(r0)
                return r3
            L33:
                android.os.ParcelFileDescriptor r0 = r4.BAC()
            L37:
                r7.writeNoException()
                if (r0 == 0) goto L43
                r7.writeInt(r3)
                r0.writeToParcel(r7, r3)
                return r3
            L43:
                r0 = 0
                r7.writeInt(r0)
                return r3
            L48:
                java.lang.String r2 = r6.readString()
                long r0 = r6.readLong()
                r4.Cnb(r2, r0)
                return r3
            L54:
                long r0 = r6.readLong()
                r4.EHO(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.helium.content.IHeliumChildProcessDelegate.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public Stub() {
            attachInterface(this, "com.facebook.browser.helium.content.IHeliumChildProcessDelegate");
        }
    }
}
