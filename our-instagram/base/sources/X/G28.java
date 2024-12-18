package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* loaded from: classes6.dex */
public final class G28 implements InterfaceC37223GaY {
    public final /* synthetic */ EVU A00;

    @Override // X.InterfaceC37223GaY
    public final VKF DN7() {
        return new C32889EdW(this, 0);
    }

    public G28(EVU evu) {
        this.A00 = evu;
    }

    @Override // X.InterfaceC37223GaY
    public final List Bsn() {
        return AbstractC31180DnO.A0n(this.A00.A0r);
    }

    @Override // X.InterfaceC37223GaY
    public final boolean CLm() {
        if (!this.A00.A0r.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37223GaY
    public final boolean CRt() {
        return AbstractC25230BEn.A1Q(this.A00.A0U ? 1 : 0);
    }

    @Override // X.InterfaceC37223GaY
    public final boolean Ccg(DirectShareTarget directShareTarget) {
        return AbstractC31174DnI.A1W(directShareTarget, this.A00.A0r);
    }

    @Override // X.InterfaceC37223GaY
    public final boolean Cet(DirectShareTarget directShareTarget) {
        return this.A00.A0l.Ceu(directShareTarget);
    }

    @Override // X.InterfaceC37223GaY
    public final boolean EiS(DirectShareTarget directShareTarget) {
        return EVU.A0L(this.A00, directShareTarget);
    }

    @Override // X.InterfaceC37223GaY
    public final boolean CXC(DirectShareTarget directShareTarget) {
        return directShareTarget.A0I();
    }
}
