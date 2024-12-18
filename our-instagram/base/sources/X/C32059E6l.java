package X;

/* renamed from: X.E6l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32059E6l extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C25805BbM A04;
    public final String A05 = "universal";
    public final String A06 = "direct_user_search_nullstate";
    public final String A07 = "direct_user_search_keypressed";
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32059E6l) {
                C32059E6l c32059E6l = (C32059E6l) obj;
                if (!C14360o3.A0K(this.A05, c32059E6l.A05) || this.A09 != c32059E6l.A09 || !C14360o3.A0K(this.A06, c32059E6l.A06) || !C14360o3.A0K(this.A07, c32059E6l.A07) || this.A03 != c32059E6l.A03 || this.A02 != c32059E6l.A02 || this.A01 != c32059E6l.A01 || this.A00 != c32059E6l.A00 || this.A0E != c32059E6l.A0E || this.A0B != c32059E6l.A0B || this.A0C != c32059E6l.A0C || this.A0A != c32059E6l.A0A || this.A0F != c32059E6l.A0F || this.A0D != c32059E6l.A0D || !C14360o3.A0K(this.A08, c32059E6l.A08) || !C14360o3.A0K(this.A04, c32059E6l.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32059E6l(C25805BbM c25805BbM, String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A09 = z;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A0E = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A0D = z7;
        this.A08 = str;
        this.A04 = c25805BbM;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(false, AbstractC167007dF.A0D(false, AbstractC167007dF.A0D(this.A0E, (((((((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A09, AbstractC166987dD.A0J(this.A05)))) + this.A03) * 31 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31))));
        int A00 = AbstractC53644Nnp.A00();
        return ((((AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0A, (AbstractC167007dF.A0D(this.A0C, (A0D + A00) * 31) + A00) * 31))) * 31) + AbstractC167017dG.A0O(this.A08)) * 31 * 31) + AbstractC167017dG.A0M(this.A04)) * 31 * 31;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SearchResultProviderConfiguration(mode=");
        A1C.append(this.A05);
        A1C.append(", includeThreads=");
        A1C.append(this.A09);
        A1C.append(", nullStateBanyanSurfaceName=");
        A1C.append(this.A06);
        A1C.append(", queryStateBanyanSurfaceName=");
        A1C.append(this.A07);
        A1C.append(", maxIgResults=");
        A1C.append(this.A03);
        A1C.append(", maxFbResults=");
        A1C.append(0);
        A1C.append(", maxIgBusResults=");
        A1C.append(this.A02);
        A1C.append(", maxIbcResults=");
        A1C.append(this.A01);
        A1C.append(", maxAiAgentResults=");
        A1C.append(this.A00);
        A1C.append(", isMsysEnabled=");
        A1C.append(this.A0E);
        A1C.append(", msysRecipientsOnly=");
        A1C.append(false);
        A1C.append(", excludeThreadWithoutCurrentUser=");
        A1C.append(false);
        A1C.append(", isContentSearchEnabled=");
        A1C.append(this.A0B);
        A1C.append(", isReshareFlywheelEnabled=");
        A1C.append(false);
        A1C.append(", isIBCInNullStateEnabled=");
        A1C.append(this.A0C);
        A1C.append(", isRTROnShareSheetEnabled=");
        A1C.append(false);
        A1C.append(", isAiAgentEnabled=");
        A1C.append(this.A0A);
        A1C.append(", isNullStatePromptsEnabled=");
        A1C.append(this.A0F);
        A1C.append(", isMetaAiTypeaheadPromptsEnabled=");
        A1C.append(this.A0D);
        A1C.append(", posterId=");
        A1C.append((String) null);
        A1C.append(AbstractC58317Pt9.A00(60));
        A1C.append(this.A08);
        A1C.append(", directShareSheetViewModel=");
        A1C.append((Object) null);
        A1C.append(", inviteContactViewModel=");
        A1C.append(this.A04);
        A1C.append(MSV.A00(619));
        A1C.append((String) null);
        A1C.append(", sharingLifeCycleOwner=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
