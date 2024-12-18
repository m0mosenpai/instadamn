package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.9aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211899aG extends C0T6 implements BB8 {
    public final int A00;
    public final Reel A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211899aG) {
                C211899aG c211899aG = (C211899aG) obj;
                if (!C14360o3.A0K(this.A01, c211899aG.A01) || this.A00 != c211899aG.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C211899aG(Reel reel, int i) {
        this.A01 = reel;
        this.A00 = i;
    }
}
