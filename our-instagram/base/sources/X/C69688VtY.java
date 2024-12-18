package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.VtY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69688VtY {
    public C1125456i A00;
    public MediaEffect A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69688VtY c69688VtY = (C69688VtY) obj;
            if (!this.A00.equals(c69688VtY.A00) || !this.A01.equals(c69688VtY.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public C69688VtY(C1125456i c1125456i, MediaEffect mediaEffect) {
        this.A00 = c1125456i;
        this.A01 = mediaEffect;
    }
}
