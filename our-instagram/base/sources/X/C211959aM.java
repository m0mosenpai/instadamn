package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211959aM extends C0T6 implements BEW {
    public final EnumC185548Kw A00;
    public final ImageUrl A01;
    public final MusicAttributionConfig A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211959aM) {
                C211959aM c211959aM = (C211959aM) obj;
                if (!C14360o3.A0K(this.A02, c211959aM.A02) || this.A00 != c211959aM.A00 || !C14360o3.A0K(this.A01, c211959aM.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.BEW
    public final MusicAttributionConfig BVX() {
        return this.A02;
    }

    @Override // X.BEY
    public final EnumC185548Kw C3o() {
        return this.A00;
    }

    @Override // X.BEY
    public final ImageUrl C89() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02)));
    }

    public C211959aM(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, MusicAttributionConfig musicAttributionConfig) {
        this.A02 = musicAttributionConfig;
        this.A00 = enumC185548Kw;
        this.A01 = imageUrl;
    }
}
