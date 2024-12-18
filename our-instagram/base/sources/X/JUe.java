package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* loaded from: classes8.dex */
public final class JUe extends AbstractC129515tG implements InterfaceC129545tJ, InterfaceC129555tK {
    public ImageUrl A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final ImageUrl A05;
    public final C158797Aq A06;
    public final C7QX A07;
    public final C7QL A08;
    public final AbstractC46446Kh6 A09;
    public final DirectThreadAnalyticsParams A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.media.model.MediaContentViewModel");
                JUe jUe = (JUe) obj;
                if (this.A02 != jUe.A02 || this.A0G != jUe.A0G || this.A0H != jUe.A0H || this.A01 != jUe.A01 || !C14360o3.A0K(this.A0E, jUe.A0E) || !C14360o3.A0K(this.A05, jUe.A05) || !C14360o3.A0K(this.A0C, jUe.A0C) || !C14360o3.A0K(this.A09, jUe.A09) || !C14360o3.A0K(this.A0D, jUe.A0D) || this.A0I != jUe.A0I || this.A0J != jUe.A0J || !C14360o3.A0K(this.A08, jUe.A08) || !C14360o3.A0K(this.A07, jUe.A07) || this.A04 != jUe.A04 || this.A0F != jUe.A0F || !C14360o3.A0K(BSy(), jUe.BSy()) || BT8() != jUe.BT8() || CYW() != jUe.CYW() || BCt() != jUe.BCt() || CXQ() != jUe.CXQ() || !C14360o3.A0K(BPA(), jUe.BPA()) || !C14360o3.A0K(AuO(), jUe.AuO()) || Ar9() != jUe.Ar9() || CVC() != jUe.CVC() || Cd1() != jUe.Cd1() || !C14360o3.A0K(ArP(), jUe.ArP()) || this.A03 != jUe.A03 || !C14360o3.A0K(this.A0B, jUe.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A08.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A08.A01;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((AbstractC167007dF.A0D(Cd1(), AbstractC167007dF.A0D(CVC(), AbstractC166997dE.A0J(Ar9(), (AbstractC166997dE.A0J(BPA(), AbstractC167007dF.A0D(CXQ(), AbstractC167007dF.A0D(BCt(), AbstractC167007dF.A0D(CYW(), AbstractC167007dF.A07(BT8(), AbstractC166997dE.A0J(BSy(), AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A07(this.A04, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0I, (AbstractC166997dE.A0J(this.A09, (((((AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0G, this.A02 * 31)), this.A01) + AbstractC31177DnL.A04(this.A0E)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC31177DnL.A04(this.A0C)) * 31) + AbstractC31177DnL.A04(this.A0D)) * 31)))))))))))) + AbstractC25235BEs.A06(AuO())) * 31))) + AbstractC25235BEs.A06(ArP())) * 31) + this.A03) * 31;
        String str = this.A0B;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public JUe(ImageUrl imageUrl, C158797Aq c158797Aq, C7QX c7qx, C7QL c7ql, AbstractC46446Kh6 abstractC46446Kh6, DirectThreadAnalyticsParams directThreadAnalyticsParams, String str, String str2, String str3, String str4, float f, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(c7qx);
        this.A02 = i;
        this.A0G = z;
        this.A0H = z2;
        this.A01 = f;
        this.A0E = str;
        this.A05 = imageUrl;
        this.A0C = str2;
        this.A09 = abstractC46446Kh6;
        this.A06 = c158797Aq;
        this.A0D = str3;
        this.A0I = z3;
        this.A0J = z4;
        this.A08 = c7ql;
        this.A07 = c7qx;
        this.A04 = j;
        this.A0F = z5;
        this.A03 = i2;
        this.A0B = str4;
        this.A0A = directThreadAnalyticsParams;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
