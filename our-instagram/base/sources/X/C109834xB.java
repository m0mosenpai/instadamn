package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.4xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109834xB extends C0T6 implements InterfaceC109844xC {
    public final IGLiveBadgeSettings A00;
    public final LiveUserPaySupportTier A01;
    public final C109804x7 A02;
    public final Boolean A03;
    public final Integer A04;

    @Override // X.InterfaceC109844xC
    public final C109834xB Ew4() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109834xB) {
                C109834xB c109834xB = (C109834xB) obj;
                if (this.A00 != c109834xB.A00 || !C14360o3.A0K(this.A04, c109834xB.A04) || !C14360o3.A0K(this.A03, c109834xB.A03) || !C14360o3.A0K(this.A02, c109834xB.A02) || this.A01 != c109834xB.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGLiveBadgeSettings iGLiveBadgeSettings = this.A00;
        int hashCode = (iGLiveBadgeSettings == null ? 0 : iGLiveBadgeSettings.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C109804x7 c109804x7 = this.A02;
        int hashCode4 = (hashCode3 + (c109804x7 == null ? 0 : c109804x7.hashCode())) * 31;
        LiveUserPaySupportTier liveUserPaySupportTier = this.A01;
        return hashCode4 + (liveUserPaySupportTier != null ? liveUserPaySupportTier.hashCode() : 0);
    }

    @Override // X.InterfaceC109844xC
    public final IGLiveBadgeSettings AfH() {
        return this.A00;
    }

    @Override // X.InterfaceC109844xC
    public final Integer AfI() {
        return this.A04;
    }

    @Override // X.InterfaceC109844xC
    public final Boolean BPm() {
        return this.A03;
    }

    @Override // X.InterfaceC109844xC
    public final /* bridge */ /* synthetic */ InterfaceC109814x8 Bbh() {
        return this.A02;
    }

    @Override // X.InterfaceC109844xC
    public final LiveUserPaySupportTier CGK() {
        return this.A01;
    }

    @Override // X.InterfaceC109844xC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayViewerConfig", AbstractC53783NqZ.A00(this));
    }

    public C109834xB(IGLiveBadgeSettings iGLiveBadgeSettings, LiveUserPaySupportTier liveUserPaySupportTier, C109804x7 c109804x7, Boolean bool, Integer num) {
        this.A00 = iGLiveBadgeSettings;
        this.A04 = num;
        this.A03 = bool;
        this.A02 = c109804x7;
        this.A01 = liveUserPaySupportTier;
    }
}
