package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;

/* loaded from: classes7.dex */
public final class H3q extends C0T6 implements InterfaceC43572JMg {
    public final IGNativeSmartTextOverlayBackgroundShape A00;
    public final IGNativeSmartTextOverlayFontStyleEnum A01;
    public final IGNativeSmartTextOverlayStylingAlignment A02;
    public final IGNativeSmartTextOverlayStylingFontStyle A03;
    public final IGNativeSmartTextOverlayTextAlignmentEnum A04;
    public final Float A05;
    public final Float A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;

    @Override // X.InterfaceC43572JMg
    public final H3q EvH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3q) {
                H3q h3q = (H3q) obj;
                if (this.A02 != h3q.A02 || !C14360o3.A0K(this.A0A, h3q.A0A) || this.A00 != h3q.A00 || !C14360o3.A0K(this.A0B, h3q.A0B) || !C14360o3.A0K(this.A07, h3q.A07) || this.A03 != h3q.A03 || !C14360o3.A0K(this.A05, h3q.A05) || !C14360o3.A0K(this.A08, h3q.A08) || !C14360o3.A0K(this.A06, h3q.A06) || !C14360o3.A0K(this.A09, h3q.A09) || this.A04 != h3q.A04 || this.A01 != h3q.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43572JMg
    public final IGNativeSmartTextOverlayStylingAlignment Aas() {
        return this.A02;
    }

    @Override // X.InterfaceC43572JMg
    public final IGNativeSmartTextOverlayBackgroundShape Af4() {
        return this.A00;
    }

    @Override // X.InterfaceC43572JMg
    public final String B7c() {
        return this.A0B;
    }

    @Override // X.InterfaceC43572JMg
    public final Integer B7h() {
        return this.A07;
    }

    @Override // X.InterfaceC43572JMg
    public final IGNativeSmartTextOverlayStylingFontStyle B7i() {
        return this.A03;
    }

    @Override // X.InterfaceC43572JMg
    public final Float BNK() {
        return this.A05;
    }

    @Override // X.InterfaceC43572JMg
    public final Integer BPn() {
        return this.A08;
    }

    @Override // X.InterfaceC43572JMg
    public final Float BPs() {
        return this.A06;
    }

    @Override // X.InterfaceC43572JMg
    public final Integer BPy() {
        return this.A09;
    }

    @Override // X.InterfaceC43572JMg
    public final IGNativeSmartTextOverlayTextAlignmentEnum C5x() {
        return this.A04;
    }

    @Override // X.InterfaceC43572JMg
    public final IGNativeSmartTextOverlayFontStyleEnum C6G() {
        return this.A01;
    }

    @Override // X.InterfaceC43572JMg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGNativeSmartTextOverlayStyling", AbstractC40006Hon.A00(this));
    }

    @Override // X.InterfaceC43572JMg
    public final String getBackgroundColor() {
        return this.A0A;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H3q(IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape, IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum, IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment, IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle, IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum, Float f, Float f2, Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A02 = iGNativeSmartTextOverlayStylingAlignment;
        this.A0A = str;
        this.A00 = iGNativeSmartTextOverlayBackgroundShape;
        this.A0B = str2;
        this.A07 = num;
        this.A03 = iGNativeSmartTextOverlayStylingFontStyle;
        this.A05 = f;
        this.A08 = num2;
        this.A06 = f2;
        this.A09 = num3;
        this.A04 = iGNativeSmartTextOverlayTextAlignmentEnum;
        this.A01 = iGNativeSmartTextOverlayFontStyleEnum;
    }
}
