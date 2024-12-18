package X;

import androidx.compose.foundation.lazy.ParentSizeElement;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;

/* renamed from: X.6IU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IU implements C6IV {
    public InterfaceC119545bC A00;
    public InterfaceC119545bC A01;

    @Override // X.C6IV
    public final Modifier AVE(Modifier modifier, float f) {
        return modifier.Eq3(new ParentSizeElement(this.A01, null, f));
    }

    public C6IU() {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A01 = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
        this.A00 = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    }
}
