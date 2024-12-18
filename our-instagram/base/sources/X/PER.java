package X;

import android.content.Intent;
import android.graphics.Point;

/* loaded from: classes9.dex */
public final class PER implements InterfaceC58170Pqa {
    public final /* synthetic */ OW9 A00;

    public PER(OW9 ow9) {
        this.A00 = ow9;
    }

    @Override // X.InterfaceC58170Pqa
    public final void APW() {
        C55207OeK.A02(this.A00.A0Z, C57696Pil.A00);
    }

    @Override // X.InterfaceC58170Pqa
    public final void DYC() {
        C55207OeK.A02(this.A00.A0Z, C57691Pig.A00);
    }

    @Override // X.InterfaceC58170Pqa
    public final void Epp() {
        C55207OeK c55207OeK = this.A00.A0Z;
        C55207OeK.A02(c55207OeK, new C57750Pjd(25, c55207OeK, C05F.A00));
    }

    @Override // X.InterfaceC58170Pqa
    public final void FAF(boolean z) {
        C55207OeK.A02(this.A00.A0Z, new C25310BIf(z, 14));
    }

    @Override // X.InterfaceC58170Pqa
    public final void ARn(Intent intent, Point point) {
        AbstractC167017dG.A1N(intent, point);
        C55207OeK.A02(this.A00.A0Z, new C57750Pjd(26, intent, point));
    }
}
