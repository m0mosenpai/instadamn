package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.google.common.collect.ImmutableList;

/* renamed from: X.AUv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23310AUv implements C85V {
    public final /* synthetic */ InterfaceC203698zY A00;
    public final /* synthetic */ ARRequestAsset A01;
    public final /* synthetic */ C224099ut A02;
    public final /* synthetic */ C23055AEm A03;
    public final /* synthetic */ C1819185b A04;

    public C23310AUv(InterfaceC203698zY interfaceC203698zY, ARRequestAsset aRRequestAsset, C224099ut c224099ut, C23055AEm c23055AEm, C1819185b c1819185b) {
        this.A02 = c224099ut;
        this.A01 = aRRequestAsset;
        this.A04 = c1819185b;
        this.A00 = interfaceC203698zY;
        this.A03 = c23055AEm;
    }

    @Override // X.C85V
    public final void DCz(C150156pL c150156pL) {
        ImmutableList of = ImmutableList.of((Object) this.A01);
        C1819185b c1819185b = this.A04;
        InterfaceC203698zY interfaceC203698zY = this.A00;
        AbstractC167007dF.A1K(of, c1819185b);
        C150156pL.A00(null, interfaceC203698zY, c150156pL.A04, c150156pL, c1819185b, of, false);
    }
}
