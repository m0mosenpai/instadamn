package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Lf6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48630Lf6 implements C8BK, AnonymousClass844 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C48630Lf6(C45480KBs c45480KBs, C14510oO c14510oO, C14510oO c14510oO2) {
        this.A03 = c45480KBs;
        this.A01 = c14510oO;
        this.A02 = c14510oO2;
        this.A04 = c45480KBs.A08;
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A04;
    }

    @Override // X.C8BK
    public final /* synthetic */ void DUX(boolean z) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void DuZ(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.C8BK
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        boolean z;
        int i = this.A00;
        C14360o3.A0B(audioOverlayTrack, 0);
        Object obj = this.A03;
        if (i != 0) {
            C45480KBs c45480KBs = (C45480KBs) obj;
            AudioOverlayTrack audioOverlayTrack2 = c45480KBs.A02;
            String str = null;
            if (audioOverlayTrack2 != null) {
                str = audioOverlayTrack2.A0A;
            }
            boolean A0g = AbstractC002300n.A0g(str, audioOverlayTrack.A0A, false);
            z = true;
            if (A0g) {
                ((C14510oO) this.A01).A00 = true;
            }
            c45480KBs.A02 = audioOverlayTrack;
        } else {
            C15370ps c15370ps = (C15370ps) obj;
            AudioOverlayTrack audioOverlayTrack3 = (AudioOverlayTrack) c15370ps.A00;
            String str2 = null;
            if (audioOverlayTrack3 != null) {
                str2 = audioOverlayTrack3.A0A;
            }
            boolean A0g2 = AbstractC002300n.A0g(str2, audioOverlayTrack.A0A, false);
            z = true;
            if (A0g2) {
                ((C14510oO) this.A01).A00 = true;
            } else {
                c15370ps.A00 = audioOverlayTrack;
            }
        }
        ((C14510oO) this.A02).A00 = z;
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }

    public C48630Lf6(C45466KBb c45466KBb, C14510oO c14510oO, C14510oO c14510oO2, C15370ps c15370ps) {
        this.A03 = c15370ps;
        this.A01 = c14510oO;
        this.A02 = c14510oO2;
        this.A04 = c45466KBb.A0s;
    }
}
