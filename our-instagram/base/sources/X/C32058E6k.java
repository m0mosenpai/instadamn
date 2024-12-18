package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;

/* renamed from: X.E6k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32058E6k extends C0T6 {
    public final C120985dq A00;
    public final C75113Zb A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final C65 A08;
    public final Float A09;
    public final Float A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32058E6k) {
                C32058E6k c32058E6k = (C32058E6k) obj;
                if (!C14360o3.A0K(this.A03, c32058E6k.A03) || !C14360o3.A0K(this.A00, c32058E6k.A00) || !C14360o3.A0K(this.A01, c32058E6k.A01) || !C14360o3.A0K(this.A02, c32058E6k.A02) || !C14360o3.A0K(this.A04, c32058E6k.A04) || this.A08 != c32058E6k.A08 || !C14360o3.A0K(this.A05, c32058E6k.A05) || !C14360o3.A0K(this.A06, c32058E6k.A06) || this.A07 != c32058E6k.A07 || !C14360o3.A0K(this.A09, c32058E6k.A09) || !C14360o3.A0K(this.A0A, c32058E6k.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32058E6k(C120985dq c120985dq, C65 c65, C75113Zb c75113Zb, User user, Float f, Float f2, String str, String str2, boolean z) {
        String A00 = AbstractC111324zv.A00(2074);
        AbstractC25229BEm.A1I(str, 1, c65);
        this.A03 = str;
        this.A00 = c120985dq;
        this.A01 = c75113Zb;
        this.A02 = user;
        this.A04 = A00;
        this.A08 = c65;
        this.A05 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        this.A06 = str2;
        this.A07 = z;
        this.A09 = f;
        this.A0A = f2;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03)))))))) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC166997dE.A0I(this.A0A);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProfileLaunchInfo(moduleName=");
        A1C.append(this.A03);
        A1C.append(", clipsItem=");
        A1C.append(this.A00);
        A1C.append(AbstractC43591JPw.A00(57));
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(234));
        A1C.append(this.A02);
        A1C.append(", profileEntryTrigger=");
        A1C.append(this.A04);
        A1C.append(", profileType=");
        A1C.append(this.A08);
        A1C.append(", sourceOfTapping=");
        A1C.append(this.A05);
        A1C.append(", startingTab=");
        A1C.append(this.A06);
        A1C.append(", isFromSidePanel=");
        A1C.append(false);
        A1C.append(", enableProfileAndBrowse=");
        A1C.append(this.A07);
        A1C.append(", tapXPosition=");
        A1C.append(this.A09);
        A1C.append(", tapYPosition=");
        return AbstractC167017dG.A0o(this.A0A, A1C);
    }
}
