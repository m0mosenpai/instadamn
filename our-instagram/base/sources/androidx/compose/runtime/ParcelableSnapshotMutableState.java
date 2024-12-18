package androidx.compose.runtime;

import X.AbstractC111324zv;
import X.AbstractC74923Yi;
import X.AbstractC75003Yq;
import X.AbstractC75013Yr;
import X.C14360o3;
import X.C3Z5;
import X.C58H;
import X.C6M9;
import X.C74883Yd;
import X.C74993Yp;
import X.InterfaceC74893Ye;
import X.InterfaceC74943Yk;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableState extends AbstractC74923Yi implements Parcelable, InterfaceC74943Yk {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.3Yn
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            InterfaceC74893Ye interfaceC74893Ye;
            int i;
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        interfaceC74893Ye = C58H.A00;
                        i = 2775;
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0c("Unsupported MutableState policy ", " was restored", readInt));
                    }
                } else {
                    interfaceC74893Ye = C74883Yd.A00;
                    C14360o3.A0C(interfaceC74893Ye, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                    return new ParcelableSnapshotMutableState(interfaceC74893Ye, readValue);
                }
            } else {
                interfaceC74893Ye = C6M9.A00;
                i = 2774;
            }
            C14360o3.A0C(interfaceC74893Ye, AbstractC111324zv.A00(i));
            return new ParcelableSnapshotMutableState(interfaceC74893Ye, readValue);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    };
    public C74993Yp A00;
    public final InterfaceC74893Ye A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.InterfaceC74943Yk
    public final InterfaceC74893Ye BeD() {
        return this.A01;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (C74993Yp) abstractC75003Yq;
    }

    @Override // X.InterfaceC74953Yl
    public final void Egh(Object obj) {
        Snapshot A00;
        C74993Yp c74993Yp = (C74993Yp) AbstractC75013Yr.A08(this.A00);
        if (!this.A01.AT1(c74993Yp.A00, obj)) {
            C74993Yp c74993Yp2 = this.A00;
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                ((C74993Yp) AbstractC75013Yr.A03(A00, this, c74993Yp2, c74993Yp)).A00 = obj;
            }
            AbstractC75013Yr.A0H(A00, this);
        }
    }

    @Override // X.InterfaceC74953Yl, X.InterfaceC74963Ym
    public final Object getValue() {
        return ((C74993Yp) AbstractC75013Yr.A07(this, this.A00)).A00;
    }

    public final String toString() {
        C74993Yp c74993Yp = (C74993Yp) AbstractC75013Yr.A08(this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("MutableState(value=");
        sb.append(c74993Yp.A00);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Yq, X.3Yp] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Yq, X.3Yp] */
    public ParcelableSnapshotMutableState(InterfaceC74893Ye interfaceC74893Ye, Object obj) {
        this.A01 = interfaceC74893Ye;
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A00 = obj;
        if (C3Z5.A07()) {
            ?? abstractC75003Yq2 = new AbstractC75003Yq();
            abstractC75003Yq2.A00 = obj;
            abstractC75003Yq2.A00 = 1;
            abstractC75003Yq.A01 = abstractC75003Yq2;
        }
        this.A00 = abstractC75003Yq;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        InterfaceC74893Ye interfaceC74893Ye = this.A01;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, AbstractC111324zv.A00(2774));
        if (C14360o3.A0K(interfaceC74893Ye, c6m9)) {
            i2 = 0;
        } else {
            C74883Yd c74883Yd = C74883Yd.A00;
            C14360o3.A0C(c74883Yd, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (C14360o3.A0K(interfaceC74893Ye, c74883Yd)) {
                i2 = 1;
            } else {
                C58H c58h = C58H.A00;
                C14360o3.A0C(c58h, AbstractC111324zv.A00(2775));
                if (C14360o3.A0K(interfaceC74893Ye, c58h)) {
                    i2 = 2;
                } else {
                    throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
            }
        }
        parcel.writeInt(i2);
    }
}
