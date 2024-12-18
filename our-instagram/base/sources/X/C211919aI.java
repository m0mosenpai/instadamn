package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.9aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211919aI extends C0T6 implements InterfaceC185218Jm {
    public final ImageUrl A00;
    public final MusicAttributionConfig A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211919aI) {
                C211919aI c211919aI = (C211919aI) obj;
                if (!C14360o3.A0K(this.A00, c211919aI.A00) || !C14360o3.A0K(this.A01, c211919aI.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C211919aI(ImageUrl imageUrl, MusicAttributionConfig musicAttributionConfig) {
        this.A00 = imageUrl;
        this.A01 = musicAttributionConfig;
    }
}
