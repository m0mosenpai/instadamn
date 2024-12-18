package X;

import com.instagram.common.textwithentities.model.TextWithEntities;

/* renamed from: X.Gym, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38645Gym extends C0T6 {
    public C51759Mti A00;
    public C51759Mti A01;
    public C38688GzT A02;
    public TextWithEntities A03;
    public TextWithEntities A04;
    public TextWithEntities A05;
    public EnumC39576Hdm A06;
    public EnumC39574Hdk A07;
    public boolean A08;
    public boolean A09;

    public C38645Gym() {
        EnumC39574Hdk enumC39574Hdk = EnumC39574Hdk.A07;
        EnumC39576Hdm enumC39576Hdm = EnumC39576Hdm.A09;
        C51759Mti c51759Mti = new C51759Mti();
        TextWithEntities textWithEntities = new TextWithEntities(null, null, null, null, null, null);
        this.A00 = null;
        this.A07 = enumC39574Hdk;
        this.A06 = enumC39576Hdm;
        this.A02 = null;
        this.A01 = c51759Mti;
        this.A03 = textWithEntities;
        this.A04 = null;
        this.A05 = null;
        this.A09 = false;
        this.A08 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38645Gym) {
                C38645Gym c38645Gym = (C38645Gym) obj;
                if (!C14360o3.A0K(this.A00, c38645Gym.A00) || this.A07 != c38645Gym.A07 || this.A06 != c38645Gym.A06 || !C14360o3.A0K(this.A02, c38645Gym.A02) || !C14360o3.A0K(this.A01, c38645Gym.A01) || !C14360o3.A0K(this.A03, c38645Gym.A03) || !C14360o3.A0K(this.A04, c38645Gym.A04) || !C14360o3.A0K(this.A05, c38645Gym.A05) || this.A09 != c38645Gym.A09 || this.A08 != c38645Gym.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC167017dG.A0M(this.A00) * 31)) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31));
    }
}
