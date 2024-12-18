package androidx.compose.runtime;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC74873Yc;
import X.AbstractC74923Yi;
import X.AbstractC75003Yq;
import X.AbstractC75013Yr;
import X.C14360o3;
import X.InterfaceC74893Ye;
import X.InterfaceC74943Yk;
import X.InterfaceC74953Yl;
import X.InterfaceC74963Ym;
import X.MSW;
import X.Py5;
import X.Q66;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes10.dex */
public final class ParcelableSnapshotMutableDoubleState extends AbstractC74923Yi implements InterfaceC74953Yl, InterfaceC74963Ym, Parcelable, InterfaceC74943Yk {
    public static final Parcelable.Creator CREATOR = Py5.A00(14);
    public Q66 A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.AbstractC74923Yi, X.InterfaceC74933Yj
    public final AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        C14360o3.A0C(abstractC75003Yq3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((Q66) abstractC75003Yq2).A00 != ((Q66) abstractC75003Yq3).A00) {
            return null;
        }
        return abstractC75003Yq2;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.A00 = (Q66) abstractC75003Yq;
    }

    @Override // X.InterfaceC74953Yl, X.InterfaceC74963Ym
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Double.valueOf(((Q66) AbstractC75013Yr.A07(this, this.A00)).A00);
    }

    public final String toString() {
        Q66 q66 = (Q66) AbstractC75013Yr.A08(this.A00);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MutableDoubleState(value=");
        A1C.append(q66.A00);
        A1C.append(")@");
        return AbstractC58318PtA.A0l(A1C, hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(((Q66) AbstractC75013Yr.A07(this, this.A00)).A00);
    }

    @Override // X.InterfaceC74943Yk
    public final InterfaceC74893Ye BeD() {
        return AbstractC74873Yc.A00();
    }

    @Override // X.InterfaceC74953Yl
    public final /* bridge */ /* synthetic */ void Egh(Object obj) {
        Snapshot A00;
        double A002 = MSW.A00(obj);
        Q66 q66 = (Q66) AbstractC75013Yr.A08(this.A00);
        if (q66.A00 != A002) {
            Q66 q662 = this.A00;
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                ((Q66) AbstractC75013Yr.A03(A00, this, q662, q66)).A00 = A002;
            }
            AbstractC75013Yr.A0H(A00, this);
        }
    }
}
