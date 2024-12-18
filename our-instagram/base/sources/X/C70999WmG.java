package X;

import android.graphics.RectF;
import com.instagram.archive.fragment.ArchiveReelMapFragment;

/* renamed from: X.WmG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70999WmG implements InterfaceC58290Psi {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ ArchiveReelMapFragment A01;
    public final /* synthetic */ KYY A02;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    public C70999WmG(RectF rectF, ArchiveReelMapFragment archiveReelMapFragment, KYY kyy) {
        this.A01 = archiveReelMapFragment;
        this.A00 = rectF;
        this.A02 = kyy;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return this.A00;
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return this.A00;
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A02.A03.setAlpha(0);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A02.A03.setAlpha(255);
    }
}
