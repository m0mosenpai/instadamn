package X;

import android.content.res.AssetManager;

/* renamed from: X.Sud, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63845Sud implements InterfaceC65324Ti4, InterfaceC65323Ti3 {
    public final AssetManager A00;

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        return new C63816SuA(this.A00, this);
    }

    @Override // X.InterfaceC65323Ti3
    public final InterfaceC65570Tn3 AEe(AssetManager assetManager, String str) {
        return new AbstractC63762StI(assetManager, str);
    }

    public C63845Sud(AssetManager assetManager) {
        this.A00 = assetManager;
    }
}
