package androidx.compose.runtime;

import X.AbstractC74873Yc;
import X.AbstractC74923Yi;
import X.AbstractC75003Yq;
import X.AbstractC75013Yr;
import X.C14360o3;
import X.C206149Aw;
import X.C3Z5;
import X.C57F;
import X.C57G;
import X.InterfaceC74893Ye;
import X.InterfaceC74943Yk;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes3.dex */
public final class ParcelableSnapshotMutableFloatState extends AbstractC74923Yi implements C57F, Parcelable, InterfaceC74943Yk {
    public static final Parcelable.Creator CREATOR = new C206149Aw(0);
    public C57G A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.C57F
    public final float B72() {
        return ((C57G) AbstractC75013Yr.A07(this, this.A00)).A00;
    }

    @Override // X.AbstractC74923Yi, X.InterfaceC74933Yj
    public final AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        C14360o3.A0C(abstractC75003Yq3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((C57G) abstractC75003Yq2).A00 != ((C57G) abstractC75003Yq3).A00) {
            return null;
        }
        return abstractC75003Yq2;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.A00 = (C57G) abstractC75003Yq;
    }

    @Override // X.C57F
    public final void EUc(float f) {
        Snapshot A00;
        C57G c57g = (C57G) AbstractC75013Yr.A08(this.A00);
        if (c57g.A00 != f) {
            C57G c57g2 = this.A00;
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                ((C57G) AbstractC75013Yr.A03(A00, this, c57g2, c57g)).A00 = f;
            }
            AbstractC75013Yr.A0H(A00, this);
        }
    }

    @Override // X.InterfaceC74953Yl
    public final /* bridge */ /* synthetic */ void Egh(Object obj) {
        EUc(((Number) obj).floatValue());
    }

    public final String toString() {
        C57G c57g = (C57G) AbstractC75013Yr.A08(this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("MutableFloatState(value=");
        sb.append(c57g.A00);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.57G, X.3Yq] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.57G, X.3Yq] */
    public ParcelableSnapshotMutableFloatState(float f) {
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A00 = f;
        if (C3Z5.A07()) {
            ?? abstractC75003Yq2 = new AbstractC75003Yq();
            abstractC75003Yq2.A00 = f;
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
        return Float.valueOf(B72());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(B72());
    }
}
