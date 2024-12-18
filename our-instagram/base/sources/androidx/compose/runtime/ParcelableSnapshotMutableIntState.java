package androidx.compose.runtime;

import X.AbstractC74873Yc;
import X.AbstractC74923Yi;
import X.AbstractC75003Yq;
import X.AbstractC75013Yr;
import X.AnonymousClass001;
import X.C119575bF;
import X.C14360o3;
import X.C206149Aw;
import X.C3Z5;
import X.InterfaceC119545bC;
import X.InterfaceC74893Ye;
import X.InterfaceC74943Yk;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes3.dex */
public final class ParcelableSnapshotMutableIntState extends AbstractC74923Yi implements InterfaceC119545bC, Parcelable, InterfaceC74943Yk {
    public static final Parcelable.Creator CREATOR = new C206149Aw(1);
    public C119575bF A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.InterfaceC119545bC
    public final int BIi() {
        return ((C119575bF) AbstractC75013Yr.A07(this, this.A00)).A00;
    }

    @Override // X.AbstractC74923Yi, X.InterfaceC74933Yj
    public final AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        C14360o3.A0C(abstractC75003Yq3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((C119575bF) abstractC75003Yq2).A00 != ((C119575bF) abstractC75003Yq3).A00) {
            return null;
        }
        return abstractC75003Yq2;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (C119575bF) abstractC75003Yq;
    }

    @Override // X.InterfaceC119545bC
    public final void EWE(int i) {
        Snapshot A00;
        C119575bF c119575bF = (C119575bF) AbstractC75013Yr.A08(this.A00);
        if (c119575bF.A00 != i) {
            C119575bF c119575bF2 = this.A00;
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                ((C119575bF) AbstractC75013Yr.A03(A00, this, c119575bF2, c119575bF)).A00 = i;
            }
            AbstractC75013Yr.A0H(A00, this);
        }
    }

    @Override // X.InterfaceC74953Yl
    public final /* bridge */ /* synthetic */ void Egh(Object obj) {
        EWE(((Number) obj).intValue());
    }

    public final String toString() {
        return AnonymousClass001.A02(((C119575bF) AbstractC75013Yr.A08(this.A00)).A00, hashCode(), "MutableIntState(value=", ")@");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Yq, X.5bF] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Yq, X.5bF] */
    public ParcelableSnapshotMutableIntState(int i) {
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A00 = i;
        if (C3Z5.A07()) {
            ?? abstractC75003Yq2 = new AbstractC75003Yq();
            abstractC75003Yq2.A00 = i;
            abstractC75003Yq2.A00 = 1;
            abstractC75003Yq.A01 = abstractC75003Yq2;
        }
        this.A00 = abstractC75003Yq;
    }

    @Override // X.InterfaceC74943Yk
    public final InterfaceC74893Ye BeD() {
        return AbstractC74873Yc.A00();
    }

    @Override // X.InterfaceC74953Yl, X.InterfaceC74963Ym
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(BIi());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(BIi());
    }
}
