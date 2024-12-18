package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import java.util.List;

/* renamed from: X.Mvz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51855Mvz extends C0T6 implements InterfaceC57849PlF {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C51800Mv4 A03;
    public final C51801Mv5 A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C51855Mvz(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C51800Mv4 c51800Mv4, C51801Mv5 c51801Mv5, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(mediaPromptPrefType, 3);
        AbstractC167017dG.A1T(mediaPromptPrefType2, c51801Mv5);
        AbstractC25229BEm.A1J(list, 9, str);
        this.A08 = z;
        this.A03 = c51800Mv4;
        this.A01 = mediaPromptPrefType;
        this.A07 = z2;
        this.A02 = mediaPromptPrefType2;
        this.A04 = c51801Mv5;
        this.A09 = z3;
        this.A00 = i;
        this.A06 = list;
        this.A05 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51855Mvz) {
                C51855Mvz c51855Mvz = (C51855Mvz) obj;
                if (this.A08 != c51855Mvz.A08 || !C14360o3.A0K(this.A03, c51855Mvz.A03) || this.A01 != c51855Mvz.A01 || this.A07 != c51855Mvz.A07 || this.A02 != c51855Mvz.A02 || !C14360o3.A0K(this.A04, c51855Mvz.A04) || this.A09 != c51855Mvz.A09 || this.A00 != c51855Mvz.A00 || !C14360o3.A0K(this.A06, c51855Mvz.A06) || !C14360o3.A0K(this.A05, c51855Mvz.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0J(this.A06, (AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A01, (AbstractC25225BEi.A08(this.A08) + AbstractC167017dG.A0M(this.A03)) * 31))))) + this.A00) * 31));
    }
}
