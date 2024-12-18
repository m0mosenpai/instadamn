package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTemplatesStickerType;

/* renamed from: X.9Zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211749Zz extends C0T6 implements BE5 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final ClipsTemplatesStickerType A09;
    public final String A0A;

    @Override // X.BE5
    public final C211749Zz Es9() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211749Zz) {
                C211749Zz c211749Zz = (C211749Zz) obj;
                if (Float.compare(this.A00, c211749Zz.A00) != 0 || Float.compare(this.A01, c211749Zz.A01) != 0 || Float.compare(this.A02, c211749Zz.A02) != 0 || Float.compare(this.A03, c211749Zz.A03) != 0 || Float.compare(this.A04, c211749Zz.A04) != 0 || Float.compare(this.A05, c211749Zz.A05) != 0 || Float.compare(this.A06, c211749Zz.A06) != 0 || !C14360o3.A0K(this.A0A, c211749Zz.A0A) || this.A09 != c211749Zz.A09 || Float.compare(this.A07, c211749Zz.A07) != 0 || this.A08 != c211749Zz.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public C211749Zz(ClipsTemplatesStickerType clipsTemplatesStickerType, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        AbstractC167007dF.A1J(str, 8, clipsTemplatesStickerType);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0A = str;
        this.A09 = clipsTemplatesStickerType;
        this.A07 = f8;
        this.A08 = i;
    }

    @Override // X.BE5
    public final float B27() {
        return this.A00;
    }

    @Override // X.BE5
    public final float BDQ() {
        return this.A01;
    }

    @Override // X.BE5
    public final float BYd() {
        return this.A02;
    }

    @Override // X.BE5
    public final float BYf() {
        return this.A03;
    }

    @Override // X.BE5
    public final float Bpb() {
        return this.A04;
    }

    @Override // X.BE5
    public final float BqP() {
        return this.A05;
    }

    @Override // X.BE5
    public final float Bzo() {
        return this.A06;
    }

    @Override // X.BE5
    public final String C0c() {
        return this.A0A;
    }

    @Override // X.BE5
    public final ClipsTemplatesStickerType C0l() {
        return this.A09;
    }

    @Override // X.BE5
    public final float CHe() {
        return this.A07;
    }

    @Override // X.BE5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsStickerInfo", AbstractC225429x7.A00(this));
    }

    @Override // X.BE5
    public final int getZIndex() {
        return this.A08;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02), this.A03), this.A04), this.A05), this.A06))), this.A07) + this.A08;
    }
}
