package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;

/* renamed from: X.TvT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65866TvT implements XCG {
    public final C65865TvS A00;

    @Override // X.XCG
    public final AutoplayConfigRoot AuL() {
        return this.A00.A00();
    }

    @Override // X.XCG
    public final boolean BBP() {
        if (this.A00.A00() == null) {
            return false;
        }
        return true;
    }

    public C65866TvT(C65865TvS c65865TvS) {
        this.A00 = c65865TvS;
    }
}
