package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122635gy implements InterfaceC122625gx {
    public InterfaceC74963Ym A00;

    public C122635gy() {
        InterfaceC74963Ym interfaceC74963Ym;
        if (C58341Ptc.A09 != null) {
            interfaceC74963Ym = A00(this);
        } else {
            interfaceC74963Ym = null;
        }
        this.A00 = interfaceC74963Ym;
    }

    public static final InterfaceC74963Ym A00(C122635gy c122635gy) {
        Object obj;
        C58341Ptc A00 = C58341Ptc.A00();
        if (A00.A01() == 1) {
            obj = new C122645gz(true);
        } else {
            C74883Yd A002 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A002, false);
            A00.A04(new C66382UEq(parcelableSnapshotMutableState, c122635gy));
            obj = parcelableSnapshotMutableState;
        }
        return (InterfaceC74963Ym) obj;
    }
}
