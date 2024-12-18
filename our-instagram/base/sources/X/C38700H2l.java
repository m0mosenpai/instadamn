package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.H2l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38700H2l extends C0T6 implements InterfaceC43579JMn {
    public final ClipsTextAlignment A00;
    public final ClipsTextEmphasisMode A01;
    public final ClipsTextFormatType A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Float A0B;
    public final Float A0C;
    public final Float A0D;
    public final Integer A0E;
    public final String A0F;
    public final List A0G;

    public C38700H2l(ClipsTextAlignment clipsTextAlignment, ClipsTextEmphasisMode clipsTextEmphasisMode, ClipsTextFormatType clipsTextFormatType, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Integer num, String str, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = clipsTextAlignment;
        this.A0G = list;
        this.A05 = f;
        this.A06 = f2;
        this.A07 = f3;
        this.A03 = bool;
        this.A04 = bool2;
        this.A08 = f4;
        this.A09 = f5;
        this.A0A = f6;
        this.A0B = f7;
        this.A0C = f8;
        this.A0F = str;
        this.A01 = clipsTextEmphasisMode;
        this.A02 = clipsTextFormatType;
        this.A0D = f9;
        this.A0E = num;
    }

    @Override // X.InterfaceC43579JMn
    public final C38700H2l Es6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38700H2l) {
                C38700H2l c38700H2l = (C38700H2l) obj;
                if (this.A00 != c38700H2l.A00 || !C14360o3.A0K(this.A0G, c38700H2l.A0G) || !C14360o3.A0K(this.A05, c38700H2l.A05) || !C14360o3.A0K(this.A06, c38700H2l.A06) || !C14360o3.A0K(this.A07, c38700H2l.A07) || !C14360o3.A0K(this.A03, c38700H2l.A03) || !C14360o3.A0K(this.A04, c38700H2l.A04) || !C14360o3.A0K(this.A08, c38700H2l.A08) || !C14360o3.A0K(this.A09, c38700H2l.A09) || !C14360o3.A0K(this.A0A, c38700H2l.A0A) || !C14360o3.A0K(this.A0B, c38700H2l.A0B) || !C14360o3.A0K(this.A0C, c38700H2l.A0C) || !C14360o3.A0K(this.A0F, c38700H2l.A0F) || this.A01 != c38700H2l.A01 || this.A02 != c38700H2l.A02 || !C14360o3.A0K(this.A0D, c38700H2l.A0D) || !C14360o3.A0K(this.A0E, c38700H2l.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43579JMn
    public final ClipsTextAlignment Aar() {
        return this.A00;
    }

    @Override // X.InterfaceC43579JMn
    public final List ApQ() {
        return this.A0G;
    }

    @Override // X.InterfaceC43579JMn
    public final Float B29() {
        return this.A05;
    }

    @Override // X.InterfaceC43579JMn
    public final Float B7g() {
        return this.A06;
    }

    @Override // X.InterfaceC43579JMn
    public final Float BDR() {
        return this.A07;
    }

    @Override // X.InterfaceC43579JMn
    public final Float BYe() {
        return this.A08;
    }

    @Override // X.InterfaceC43579JMn
    public final Float BYg() {
        return this.A09;
    }

    @Override // X.InterfaceC43579JMn
    public final Float Bpc() {
        return this.A0A;
    }

    @Override // X.InterfaceC43579JMn
    public final Float BqQ() {
        return this.A0B;
    }

    @Override // X.InterfaceC43579JMn
    public final Float Bzq() {
        return this.A0C;
    }

    @Override // X.InterfaceC43579JMn
    public final ClipsTextEmphasisMode C6D() {
        return this.A01;
    }

    @Override // X.InterfaceC43579JMn
    public final ClipsTextFormatType C6K() {
        return this.A02;
    }

    @Override // X.InterfaceC43579JMn
    public final Float CHf() {
        return this.A0D;
    }

    @Override // X.InterfaceC43579JMn
    public final Integer CIi() {
        return this.A0E;
    }

    @Override // X.InterfaceC43579JMn
    public final Boolean CPu() {
        return this.A03;
    }

    @Override // X.InterfaceC43579JMn
    public final Boolean CUj() {
        return this.A04;
    }

    @Override // X.InterfaceC43579JMn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsSpinSwappableText", AbstractC39822HlW.A00(this));
    }

    @Override // X.InterfaceC43579JMn
    public final String getText() {
        return this.A0F;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((AbstractC166997dE.A0J(this.A0G, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC166997dE.A0I(this.A0E);
    }
}
