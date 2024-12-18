package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H6n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38798H6n extends C0T6 implements InterfaceC43568JMc {
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC43568JMc
    public final C38798H6n F3F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38798H6n) {
                C38798H6n c38798H6n = (C38798H6n) obj;
                if (!C14360o3.A0K(this.A03, c38798H6n.A03) || !C14360o3.A0K(this.A02, c38798H6n.A02) || !C14360o3.A0K(this.A04, c38798H6n.A04) || !C14360o3.A0K(this.A00, c38798H6n.A00) || !C14360o3.A0K(this.A01, c38798H6n.A01) || !C14360o3.A0K(this.A05, c38798H6n.A05) || !C14360o3.A0K(this.A06, c38798H6n.A06) || !C14360o3.A0K(this.A07, c38798H6n.A07) || !C14360o3.A0K(this.A08, c38798H6n.A08) || !C14360o3.A0K(this.A09, c38798H6n.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43568JMc
    public final String B1I() {
        return this.A03;
    }

    @Override // X.InterfaceC43568JMc
    public final Float B7g() {
        return this.A02;
    }

    @Override // X.InterfaceC43568JMc
    public final String C5z() {
        return this.A06;
    }

    @Override // X.InterfaceC43568JMc
    public final String C6J() {
        return this.A08;
    }

    @Override // X.InterfaceC43568JMc
    public final List CAe() {
        return this.A09;
    }

    @Override // X.InterfaceC43568JMc
    public final Boolean CPu() {
        return this.A00;
    }

    @Override // X.InterfaceC43568JMc
    public final Boolean CV0() {
        return this.A01;
    }

    @Override // X.InterfaceC43568JMc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextStickerTappableData", AbstractC40412Hvz.A00(this));
    }

    @Override // X.InterfaceC43568JMc
    public final String getId() {
        return this.A04;
    }

    @Override // X.InterfaceC43568JMc
    public final String getText() {
        return this.A05;
    }

    @Override // X.InterfaceC43568JMc
    public final String getTextColor() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC166997dE.A0I(this.A09);
    }

    public C38798H6n(Boolean bool, Boolean bool2, Float f, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A03 = str;
        this.A02 = f;
        this.A04 = str2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = list;
    }
}
