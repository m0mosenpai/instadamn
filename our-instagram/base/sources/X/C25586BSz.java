package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BSz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25586BSz extends C0T6 {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25586BSz) {
                C25586BSz c25586BSz = (C25586BSz) obj;
                if (!C14360o3.A0K(this.A00, c25586BSz.A00) || !C14360o3.A0K(this.A01, c25586BSz.A01) || this.A05 != c25586BSz.A05 || !C14360o3.A0K(this.A02, c25586BSz.A02) || !C14360o3.A0K(this.A04, c25586BSz.A04) || !C14360o3.A0K(this.A03, c25586BSz.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
    }

    public C25586BSz(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, String str, String str2, boolean z) {
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A05 = z;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CtaStickerUiState(legacyClipsItem=");
        A1C.append(this.A00);
        A1C.append(", legacyClipsItemState=");
        A1C.append(this.A01);
        A1C.append(", isEnabled=");
        A1C.append(this.A05);
        A1C.append(AbstractC43591JPw.A00(235));
        A1C.append(this.A02);
        A1C.append(", text=");
        A1C.append(this.A04);
        A1C.append(", contextualColor=");
        A1C.append(this.A03);
        A1C.append(", contentDescriptionText=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
