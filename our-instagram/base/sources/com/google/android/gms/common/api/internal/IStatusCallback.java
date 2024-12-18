package com.google.android.gms.common.api.internal;

import X.AbstractC58320PtC;
import X.C0f9;
import X.C63097Scx;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

/* loaded from: classes10.dex */
public interface IStatusCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            int A03 = C0f9.A03(1502747780);
            attachInterface(this, "com.google.android.gms.common.api.internal.IStatusCallback");
            C0f9.A0A(1912880798, A03);
            C0f9.A0A(1257834874, C0f9.A03(718259093));
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(409316828);
            boolean z = true;
            if (i == 1) {
                Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                C63097Scx.A00(parcel);
                Dh0(status);
                i3 = -1572063994;
            } else {
                z = false;
                i3 = -1889013388;
            }
            C0f9.A0A(i3, A03);
            return z;
        }
    }

    void Dh0(Status status);
}
