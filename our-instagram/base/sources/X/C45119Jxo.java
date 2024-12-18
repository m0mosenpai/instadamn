package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;

/* renamed from: X.Jxo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45119Jxo extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public C45119Jxo(NoteAudience noteAudience, C45099JxT c45099JxT, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list) {
        this(noteAudience, c45099JxT, noteCreationSource, noteStyle, str, list, false);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45119Jxo) {
                    C45119Jxo c45119Jxo = (C45119Jxo) obj;
                    if (c45119Jxo.A00 != 1 || !C14360o3.A0K(this.A05, c45119Jxo.A05) || !C14360o3.A0K(this.A03, c45119Jxo.A03) || this.A04 != c45119Jxo.A04 || !C14360o3.A0K(this.A02, c45119Jxo.A02) || this.A07 != c45119Jxo.A07 || !C14360o3.A0K(this.A06, c45119Jxo.A06) || !C14360o3.A0K(this.A01, c45119Jxo.A01)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C45119Jxo)) {
                return false;
            }
            C45119Jxo c45119Jxo2 = (C45119Jxo) obj;
            if (c45119Jxo2.A00 != 0 || !C14360o3.A0K(this.A06, c45119Jxo2.A06) || this.A01 != c45119Jxo2.A01 || this.A05 != c45119Jxo2.A05 || this.A03 != c45119Jxo2.A03 || !C14360o3.A0K(this.A02, c45119Jxo2.A02) || !C14360o3.A0K(this.A04, c45119Jxo2.A04) || this.A07 != c45119Jxo2.A07) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int i;
        if (this.A00 != 0) {
            A0J = AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A05))))));
            i = AbstractC167017dG.A0M(this.A01);
        } else {
            A0J = AbstractC166997dE.A0J(this.A04, (AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A06)))) + AbstractC167017dG.A0M(this.A02)) * 31);
            i = 1237;
            if (this.A07) {
                i = 1231;
            }
        }
        return A0J + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiState(title=");
        A1C.append(this.A05);
        A1C.append(", headers=");
        A1C.append(this.A03);
        A1C.append(", screenId=");
        A1C.append(this.A04);
        A1C.append(", contentUiState=");
        A1C.append(this.A02);
        A1C.append(", showSearchBar=");
        A1C.append(this.A07);
        A1C.append(", searchQuery=");
        A1C.append(this.A06);
        A1C.append(", actionButton=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C45119Jxo(C51759Mti c51759Mti, AbstractC27446C9o abstractC27446C9o, EnumC72365Xc1 enumC72365Xc1, List list) {
        this((C51752Mtb) null, c51759Mti, abstractC27446C9o, enumC72365Xc1, "", list, false);
    }

    public C45119Jxo(C51752Mtb c51752Mtb, C51759Mti c51759Mti, AbstractC27446C9o abstractC27446C9o, EnumC72365Xc1 enumC72365Xc1, String str, List list, boolean z) {
        AbstractC167027dH.A0a(1, c51759Mti, list, enumC72365Xc1, abstractC27446C9o);
        C14360o3.A0B(str, 6);
        this.A05 = c51759Mti;
        this.A03 = list;
        this.A04 = enumC72365Xc1;
        this.A02 = abstractC27446C9o;
        this.A07 = z;
        this.A06 = str;
        this.A01 = c51752Mtb;
    }

    public C45119Jxo(NoteAudience noteAudience, C45099JxT c45099JxT, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, boolean z) {
        AbstractC167017dG.A1P(str, noteAudience);
        this.A06 = str;
        this.A01 = noteAudience;
        this.A05 = noteStyle;
        this.A03 = noteCreationSource;
        this.A02 = c45099JxT;
        this.A04 = list;
        this.A07 = z;
    }
}
