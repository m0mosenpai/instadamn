package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.4Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93094Fl extends C0T6 implements InterfaceC93104Fm {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final ClipsTextAlignment A0B;
    public final ClipsTextEmphasisMode A0C;
    public final ClipsTextFormatType A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;

    public C93094Fl(ClipsTextAlignment clipsTextAlignment, ClipsTextEmphasisMode clipsTextEmphasisMode, ClipsTextFormatType clipsTextFormatType, String str, String str2, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2) {
        C14360o3.A0B(clipsTextAlignment, 1);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(str, 6);
        C14360o3.A0B(str2, 13);
        C14360o3.A0B(clipsTextEmphasisMode, 14);
        C14360o3.A0B(clipsTextFormatType, 15);
        this.A0B = clipsTextAlignment;
        this.A0G = list;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A0E = str;
        this.A09 = i;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A07 = f8;
        this.A0F = str2;
        this.A0C = clipsTextEmphasisMode;
        this.A0D = clipsTextFormatType;
        this.A08 = f9;
        this.A0A = i2;
    }

    @Override // X.InterfaceC93104Fm
    public final C93094Fl F4O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93094Fl) {
                C93094Fl c93094Fl = (C93094Fl) obj;
                if (this.A0B != c93094Fl.A0B || !C14360o3.A0K(this.A0G, c93094Fl.A0G) || Float.compare(this.A00, c93094Fl.A00) != 0 || Float.compare(this.A01, c93094Fl.A01) != 0 || Float.compare(this.A02, c93094Fl.A02) != 0 || !C14360o3.A0K(this.A0E, c93094Fl.A0E) || this.A09 != c93094Fl.A09 || Float.compare(this.A03, c93094Fl.A03) != 0 || Float.compare(this.A04, c93094Fl.A04) != 0 || Float.compare(this.A05, c93094Fl.A05) != 0 || Float.compare(this.A06, c93094Fl.A06) != 0 || Float.compare(this.A07, c93094Fl.A07) != 0 || !C14360o3.A0K(this.A0F, c93094Fl.A0F) || this.A0C != c93094Fl.A0C || this.A0D != c93094Fl.A0D || Float.compare(this.A08, c93094Fl.A08) != 0 || this.A0A != c93094Fl.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((this.A0B.hashCode() * 31) + this.A0G.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + this.A0E.hashCode()) * 31) + this.A09) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A06)) * 31) + Float.floatToIntBits(this.A07)) * 31) + this.A0F.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31) + Float.floatToIntBits(this.A08)) * 31) + this.A0A;
    }

    @Override // X.InterfaceC93104Fm
    public final /* bridge */ /* synthetic */ C22998ABx AKh() {
        return new C22998ABx(this);
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextAlignment Aar() {
        return this.A0B;
    }

    @Override // X.InterfaceC93104Fm
    public final List ApQ() {
        return this.A0G;
    }

    @Override // X.InterfaceC93104Fm
    public final float B27() {
        return this.A00;
    }

    @Override // X.InterfaceC93104Fm
    public final float B7f() {
        return this.A01;
    }

    @Override // X.InterfaceC93104Fm
    public final float BDQ() {
        return this.A02;
    }

    @Override // X.InterfaceC93104Fm
    public final float BYd() {
        return this.A03;
    }

    @Override // X.InterfaceC93104Fm
    public final float BYf() {
        return this.A04;
    }

    @Override // X.InterfaceC93104Fm
    public final float Bpb() {
        return this.A05;
    }

    @Override // X.InterfaceC93104Fm
    public final float BqP() {
        return this.A06;
    }

    @Override // X.InterfaceC93104Fm
    public final float Bzo() {
        return this.A07;
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextEmphasisMode C6D() {
        return this.A0C;
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextFormatType C6K() {
        return this.A0D;
    }

    @Override // X.InterfaceC93104Fm
    public final float CHe() {
        return this.A08;
    }

    @Override // X.InterfaceC93104Fm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTextInfo", C9H0.A00(this));
    }

    @Override // X.InterfaceC93104Fm
    public final String getId() {
        return this.A0E;
    }

    @Override // X.InterfaceC93104Fm
    public final String getText() {
        return this.A0F;
    }

    @Override // X.InterfaceC93104Fm
    public final int getZIndex() {
        return this.A0A;
    }

    @Override // X.InterfaceC93104Fm
    public final int isAnimated() {
        return this.A09;
    }
}
