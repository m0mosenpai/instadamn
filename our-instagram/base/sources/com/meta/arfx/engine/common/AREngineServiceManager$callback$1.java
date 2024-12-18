package com.meta.arfx.engine.common;

import X.AM6;
import X.AbstractC167017dG;
import X.AbstractC180277zH;
import X.C05F;
import X.C0f9;
import X.C201378vQ;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.util.List;

/* loaded from: classes4.dex */
public final class AREngineServiceManager$callback$1 extends Binder implements IAREngineServiceCallback {
    public final /* synthetic */ AM6 A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AREngineServiceManager$callback$1(AM6 am6) {
        this();
        this.A00 = am6;
        C0f9.A0A(-1277488028, C0f9.A03(-1376519212));
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void Ct9(String str) {
        int A03 = C0f9.A03(72276081);
        AM6.A00(this.A00);
        C0f9.A0A(619959275, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void EWB(Surface surface, int i, int i2) {
        int A03 = C0f9.A03(1390202621);
        AM6 am6 = this.A00;
        C201378vQ c201378vQ = am6.A0Y.A00;
        AbstractC180277zH abstractC180277zH = c201378vQ.A03;
        if (abstractC180277zH != null) {
            abstractC180277zH.A02();
        }
        c201378vQ.A03 = null;
        c201378vQ.A01 = surface;
        am6.A0D = C05F.A0C;
        C0f9.A0A(944754407, A03);
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void Edk(List list) {
        int A0N = AbstractC167017dG.A0N(list, 1545844758);
        this.A00.A0c.addAll(list);
        C0f9.A0A(-692877887, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-959230627, C0f9.A03(1869203473));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Object obj;
        int A03 = C0f9.A03(-738987168);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Ct9(parcel.readString());
                        }
                    } else {
                        Edk(parcel.createTypedArrayList(Bundle.CREATOR));
                    }
                } else {
                    Parcelable.Creator creator = Surface.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    EWB((Surface) obj, parcel.readInt(), parcel.readInt());
                }
                parcel2.writeNoException();
                i3 = 80746524;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
                i3 = 602747455;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-662114915, A03);
        return onTransact;
    }

    public AREngineServiceManager$callback$1() {
        int A03 = C0f9.A03(-1578594945);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
        C0f9.A0A(1915699844, A03);
    }
}
