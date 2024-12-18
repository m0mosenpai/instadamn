package X;

import android.view.KeyEvent;

/* renamed from: X.LYg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48283LYg implements InterfaceC60022ok {
    public final /* synthetic */ C47786L8r A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C48283LYg(C47786L8r c47786L8r, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c47786L8r;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC60022ok
    public final boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
        C14360o3.A0B(enumC37329GcX, 0);
        C47786L8r c47786L8r = this.A00;
        if (!AbstractC167007dF.A1X(c47786L8r.A01.A04, MXU.STARTED) || !c47786L8r.A00 || enumC37329GcX != EnumC37329GcX.A03) {
            return false;
        }
        c47786L8r.A01(false);
        this.A01.invoke();
        return true;
    }
}
