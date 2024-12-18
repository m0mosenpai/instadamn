package X;

import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;

/* renamed from: X.Bef, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25991Bef extends C0T6 {
    public final float A00;
    public final float A01;
    public final IGNativeTextOverlayTextBoxAlignmentEnum A02;
    public final Float A03;
    public final Float A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25991Bef) {
                C25991Bef c25991Bef = (C25991Bef) obj;
                if (Float.compare(this.A00, c25991Bef.A00) != 0 || Float.compare(this.A01, c25991Bef.A01) != 0 || !C14360o3.A0K(this.A03, c25991Bef.A03) || !C14360o3.A0K(this.A04, c25991Bef.A04) || this.A02 != c25991Bef.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C25991Bef(IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum, Float f, Float f2, float f3, float f4) {
        this.A00 = f3;
        this.A01 = f4;
        this.A03 = f;
        this.A04 = f2;
        this.A02 = iGNativeTextOverlayTextBoxAlignmentEnum;
    }
}
