package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6G3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6G3 {
    public float A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final C6Fz A0A;
    public final Map A0B;

    public C6G3(C6Fz c6Fz) {
        C14360o3.A0B(c6Fz, 1);
        this.A0A = c6Fz;
        this.A0B = new LinkedHashMap();
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A07 = new ParcelableSnapshotMutableState(A00, null);
        this.A08 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), true);
        this.A09 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A05 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A06 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), 0);
    }

    public C6G3() {
        this(C29101CsS.A00);
    }
}
