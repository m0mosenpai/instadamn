package X;

import com.instagram.common.ui.base.IgEditText;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Lf4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48628Lf4 implements C8BM {
    public final /* synthetic */ C45466KBb A00;
    public final /* synthetic */ C14510oO A01;
    public final /* synthetic */ C14510oO A02;
    public final /* synthetic */ C15370ps A03;

    @Override // X.C8BM
    public final /* synthetic */ void CzF() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUY() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUZ() {
    }

    @Override // X.C8BM
    public final /* synthetic */ void DUb(JIN jin) {
    }

    public C48628Lf4(C45466KBb c45466KBb, C14510oO c14510oO, C14510oO c14510oO2, C15370ps c15370ps) {
        this.A02 = c14510oO;
        this.A03 = c15370ps;
        this.A00 = c45466KBb;
        this.A01 = c14510oO2;
    }

    @Override // X.C8BM
    public final void DUa() {
        Object obj;
        if (this.A02.A00 && (obj = this.A03.A00) != null) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
            if (audioOverlayTrack != null) {
                C45466KBb.A0P(this.A00, audioOverlayTrack, this.A01.A00);
                return;
            }
            return;
        }
        IgEditText igEditText = this.A00.A0I;
        if (igEditText == null) {
            C14360o3.A0F("noteEditText");
            throw C00O.createAndThrow();
        }
        F3X.A00(igEditText);
    }

    @Override // X.C8BM
    public final void DlU() {
        C45466KBb.A02(this.A00).A04();
    }
}
