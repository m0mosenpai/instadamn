package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.AfZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23762AfZ implements InterfaceC149856oe {
    public final /* synthetic */ C198768qZ A00;

    @Override // X.InterfaceC149856oe
    public final void Dfc(String str) {
        C14360o3.A0B(str, 0);
        C198768qZ.A02(this.A00, str);
    }

    @Override // X.InterfaceC149856oe
    public final void Dfd() {
    }

    @Override // X.InterfaceC149856oe
    public final void Dkc() {
    }

    @Override // X.InterfaceC149856oe
    public final void EFE(String str) {
        C14360o3.A0B(str, 0);
        C198768qZ.A02(this.A00, str);
    }

    public C23762AfZ(C198768qZ c198768qZ) {
        this.A00 = c198768qZ;
    }

    @Override // X.InterfaceC149856oe
    public final void DD6(boolean z, String str) {
        CameraAREffect A00;
        C198768qZ c198768qZ = this.A00;
        C88X AuN = c198768qZ.A05.AuN();
        if (AuN != null && (A00 = AuN.A00()) != null) {
            A00.A01 = AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0;
            ((C198818qe) c198768qZ.A0A.getValue()).A00();
        }
    }
}
