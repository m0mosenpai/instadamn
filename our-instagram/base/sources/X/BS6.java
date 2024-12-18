package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* loaded from: classes5.dex */
public final class BS6 extends C0T6 {
    public final ContentNoteMetadata A00;
    public final InterfaceC30806Dgh A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public BS6(ContentNoteMetadata contentNoteMetadata, InterfaceC30806Dgh interfaceC30806Dgh, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AbstractC167007dF.A1F(interfaceC30806Dgh, 1, num);
        this.A01 = interfaceC30806Dgh;
        this.A03 = z;
        this.A0A = z2;
        this.A02 = num;
        this.A00 = contentNoteMetadata;
        this.A08 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A07 = z6;
        this.A09 = z7;
        this.A06 = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BS6) {
                BS6 bs6 = (BS6) obj;
                if (!C14360o3.A0K(this.A01, bs6.A01) || this.A03 != bs6.A03 || this.A0A != bs6.A0A || this.A02 != bs6.A02 || !C14360o3.A0K(this.A00, bs6.A00) || this.A08 != bs6.A08 || this.A04 != bs6.A04 || this.A05 != bs6.A05 || this.A07 != bs6.A07 || this.A09 != bs6.A09 || this.A06 != bs6.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)));
        Integer num = this.A02;
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0L(num, BS4.A00(num), A0D))))))));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NotesPogBubbleUiState(content=");
        A1C.append(this.A01);
        A1C.append(", canLikeNote=");
        A1C.append(this.A03);
        A1C.append(", likeAffordanceEnabled=");
        A1C.append(this.A0A);
        A1C.append(", nuxType=");
        Integer num = this.A02;
        if (num != null) {
            str = BS4.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", contentNoteMetadata=");
        A1C.append(this.A00);
        A1C.append(", iconicStylingEnabled=");
        A1C.append(this.A08);
        A1C.append(", iconicAnimationEnabled=");
        A1C.append(this.A04);
        A1C.append(", iconicNeumorphismEnabled=");
        A1C.append(this.A05);
        A1C.append(", iconicShadowEnabled=");
        A1C.append(this.A07);
        A1C.append(", iconicSwRenderingEnabled=");
        A1C.append(this.A09);
        A1C.append(", iconicPseudoShadowEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
