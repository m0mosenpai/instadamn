package X;

/* renamed from: X.Ap3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24236Ap3 implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C24236Ap3 c24236Ap3 = (C24236Ap3) obj;
            if (this.A00 != c24236Ap3.A00 || this.A01 != c24236Ap3.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * 31) + AbstractC225359wy.A00(this.A00);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C24236Ap3 clone() {
        try {
            Object clone = super.clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.enhancerenderer.EnhanceRenderer.CopyRendererProgramConfig");
            return (C24236Ap3) clone;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
