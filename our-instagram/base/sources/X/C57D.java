package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* renamed from: X.57D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57D implements C57B {
    public final C57F A00;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.C57B
    public final float BqR() {
        return this.A00.B72();
    }

    @Override // X.C12V
    public final /* synthetic */ InterfaceC212412b getKey() {
        return C57B.A00;
    }

    public C57D() {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A00 = new ParcelableSnapshotMutableFloatState(1.0f);
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
