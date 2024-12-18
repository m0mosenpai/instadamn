package X;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.FileDescriptor;

/* renamed from: X.Q2j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class BinderC58705Q2j extends Binder {
    public static boolean A03;
    public final Context A00;
    public final IBinder A01;
    public final InterfaceC16820sZ A02;

    @Override // android.os.Binder, android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) {
        C14360o3.A0B(fileDescriptor, 0);
        this.A01.dump(fileDescriptor, strArr);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        C14360o3.A0B(fileDescriptor, 0);
        this.A01.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        C14360o3.A0B(deathRecipient, 0);
        this.A01.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C14360o3.A0B(parcel, 1);
        try {
            throw new SecurityException(AnonymousClass001.A0g("Attempted to look up interface descriptor: ", this.A01.getInterfaceDescriptor(), " in the STUB file for GlobalSecureAIDLTrustedCallerMap, which is completely empty. This file being included usually indicates an issue with global Metagen setup. @SecureAIDL and related functionality will not work without global Metagen - please check that it is being enabled correctly."));
        } catch (R79 unused) {
            this.A02.invoke();
            return this.A01.transact(i, parcel, parcel2, i2);
        } catch (R7A e) {
            if (!A03) {
                C0K8.A0H("IdentityCheckingBinder", "StubGlobalMapException was thrown. Falling back to using default identity check in IdentityCheckingBinder.", e);
                A03 = true;
            }
            this.A02.invoke();
            return this.A01.transact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.Binder, android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.queryLocalInterface(str);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        C14360o3.A0B(deathRecipient, 0);
        return this.A01.unlinkToDeath(deathRecipient, i);
    }

    @Override // android.os.Binder, android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.A01.getInterfaceDescriptor();
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean isBinderAlive() {
        return this.A01.isBinderAlive();
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.A01.pingBinder();
    }

    public BinderC58705Q2j(Context context, IBinder iBinder, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = context;
        this.A01 = iBinder;
        this.A02 = interfaceC16820sZ;
    }
}
