package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes9.dex */
public final class PI2 implements GYT {
    public final int A00;
    public final Object A01;

    public PI2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYT
    public final void DjF() {
        if (this.A00 != 0) {
            C52174N7f c52174N7f = ((OL1) this.A01).A01.A00;
            C65974TxR c65974TxR = c52174N7f.A04;
            String str = null;
            if (c65974TxR != null) {
                if (!c65974TxR.A04()) {
                    IgdsInlineSearchBox igdsInlineSearchBox = c52174N7f.A03;
                    if (igdsInlineSearchBox != null) {
                        str = igdsInlineSearchBox.getSearchString();
                    }
                    String A01 = AbstractC13670mt.A01(str);
                    IgdsInlineSearchBox igdsInlineSearchBox2 = c52174N7f.A03;
                    if (igdsInlineSearchBox2 != null) {
                        igdsInlineSearchBox2.clearFocus();
                    }
                    if (A01 != null && A01.length() != 0) {
                        C65974TxR c65974TxR2 = c52174N7f.A04;
                        if (c65974TxR2 != null) {
                            c65974TxR2.A06(A01);
                        }
                    } else {
                        InterfaceC58082Pp7 interfaceC58082Pp7 = c52174N7f.A05;
                        if (interfaceC58082Pp7 != null) {
                            interfaceC58082Pp7.AVh();
                        }
                    }
                    IgdsInlineSearchBox igdsInlineSearchBox3 = c52174N7f.A03;
                    if (igdsInlineSearchBox3 != null) {
                        igdsInlineSearchBox3.A03();
                        return;
                    }
                    return;
                }
                return;
            }
            C14360o3.A0F("queuedTypeaheadManager");
            throw C00O.createAndThrow();
        }
    }
}
