package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.9a8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211819a8 extends C0T6 implements InterfaceC93104Fm {
    public final boolean A00;
    public final InterfaceC93104Fm A01;

    @Override // X.InterfaceC93104Fm
    public final C22998ABx AKh() {
        return this.A01.AKh();
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextAlignment Aar() {
        return this.A01.Aar();
    }

    @Override // X.InterfaceC93104Fm
    public final List ApQ() {
        return this.A01.ApQ();
    }

    @Override // X.InterfaceC93104Fm
    public final float B27() {
        return this.A01.B27();
    }

    @Override // X.InterfaceC93104Fm
    public final float B7f() {
        return this.A01.B7f();
    }

    @Override // X.InterfaceC93104Fm
    public final float BDQ() {
        return this.A01.BDQ();
    }

    @Override // X.InterfaceC93104Fm
    public final float BYd() {
        return this.A01.BYd();
    }

    @Override // X.InterfaceC93104Fm
    public final float BYf() {
        return this.A01.BYf();
    }

    @Override // X.InterfaceC93104Fm
    public final float Bpb() {
        return this.A01.Bpb();
    }

    @Override // X.InterfaceC93104Fm
    public final float BqP() {
        return this.A01.BqP();
    }

    @Override // X.InterfaceC93104Fm
    public final float Bzo() {
        return this.A01.Bzo();
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextEmphasisMode C6D() {
        return this.A01.C6D();
    }

    @Override // X.InterfaceC93104Fm
    public final ClipsTextFormatType C6K() {
        return this.A01.C6K();
    }

    @Override // X.InterfaceC93104Fm
    public final float CHe() {
        return this.A01.CHe();
    }

    @Override // X.InterfaceC93104Fm
    public final C93094Fl F4O() {
        return this.A01.F4O();
    }

    @Override // X.InterfaceC93104Fm
    public final TreeUpdaterJNI F7o() {
        return this.A01.F7o();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211819a8) {
                C211819a8 c211819a8 = (C211819a8) obj;
                if (!C14360o3.A0K(this.A01, c211819a8.A01) || this.A00 != c211819a8.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC93104Fm
    public final String getId() {
        return this.A01.getId();
    }

    @Override // X.InterfaceC93104Fm
    public final String getText() {
        return this.A01.getText();
    }

    @Override // X.InterfaceC93104Fm
    public final int getZIndex() {
        return this.A01.getZIndex();
    }

    @Override // X.InterfaceC93104Fm
    public final int isAnimated() {
        return this.A01.isAnimated();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C211819a8(InterfaceC93104Fm interfaceC93104Fm, boolean z) {
        this.A01 = interfaceC93104Fm;
        this.A00 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsTextInfoExt(item=");
        A1C.append(this.A01);
        A1C.append(", isTimedSticker=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
