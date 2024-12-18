package android.view;

import X.C00O;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public interface IRotationWatcher extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements IRotationWatcher {
        public static IRotationWatcher asInterface(IBinder iBinder) {
            return null;
        }

        @Override // android.os.IInterface
        public abstract IBinder asBinder();

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw C00O.createAndThrow();
        }

        /* loaded from: classes10.dex */
        public class Proxy implements IRotationWatcher {
            public Proxy(IBinder iBinder) {
                C0f9.A0A(875279929, C0f9.A03(851862653));
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                C0f9.A0A(1166090037, C0f9.A03(2136751874));
                return null;
            }

            public String getInterfaceDescriptor() {
                C0f9.A0A(1597013778, C0f9.A03(540220819));
                return null;
            }

            @Override // android.view.IRotationWatcher
            public void onRotationChanged(int i) {
                C0f9.A0A(-1896582477, C0f9.A03(1888122664));
            }
        }

        public Stub() {
            throw C00O.createAndThrow();
        }
    }

    void onRotationChanged(int i);
}
