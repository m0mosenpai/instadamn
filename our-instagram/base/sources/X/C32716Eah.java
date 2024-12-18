package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.Eah, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32716Eah extends G49 implements InterfaceC66482zP {
    public InterfaceC16660sJ A00;
    public final C32050E6c A01;
    public final G5F A02;
    public final C32869EdB A03;
    public final DirectThreadAnalyticsParams A04;
    public final C45061Jwq A05;
    public final PrivacyMediaOverlayViewModel A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C37838Gks A0C;
    public final String A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32716Eah(C37838Gks c37838Gks, C32050E6c c32050E6c, G5F g5f, C32869EdB c32869EdB, DirectThreadAnalyticsParams directThreadAnalyticsParams, C45061Jwq c45061Jwq, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(c32050E6c, str, str2);
        AbstractC167007dF.A1H(str2, 5, num);
        this.A01 = c32050E6c;
        this.A03 = c32869EdB;
        this.A02 = g5f;
        this.A08 = str;
        this.A0D = str2;
        this.A0C = c37838Gks;
        this.A07 = num;
        this.A0B = z;
        this.A06 = privacyMediaOverlayViewModel;
        this.A05 = c45061Jwq;
        this.A09 = z2;
        this.A0A = z3;
        this.A04 = directThreadAnalyticsParams;
        this.A00 = GVR.A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32716Eah) {
                C32716Eah c32716Eah = (C32716Eah) obj;
                if (!C14360o3.A0K(this.A01, c32716Eah.A01) || !C14360o3.A0K(this.A03, c32716Eah.A03) || !C14360o3.A0K(this.A02, c32716Eah.A02) || !C14360o3.A0K(this.A08, c32716Eah.A08) || !C14360o3.A0K(this.A0D, c32716Eah.A0D) || !C14360o3.A0K(this.A0C, c32716Eah.A0C) || this.A07 != c32716Eah.A07 || this.A0B != c32716Eah.A0B || !C14360o3.A0K(this.A06, c32716Eah.A06) || !C14360o3.A0K(this.A05, c32716Eah.A05) || this.A09 != c32716Eah.A09 || this.A0A != c32716Eah.A0A || !C14360o3.A0K(this.A04, c32716Eah.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A05;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, (((AbstractC167007dF.A0D(this.A0B, (((AbstractC166997dE.A0K(this.A0D, AbstractC166997dE.A0K(this.A08, (AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC53957NtU.A00(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A04);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32716Eah c32716Eah = (C32716Eah) obj;
        C14360o3.A0B(c32716Eah, 0);
        C32050E6c c32050E6c = this.A01;
        String str = c32050E6c.A05;
        C32050E6c c32050E6c2 = c32716Eah.A01;
        if (C14360o3.A0K(str, c32050E6c2.A05) && C14360o3.A0K(c32050E6c.A07, c32050E6c2.A07) && c32050E6c.A03 == c32716Eah.A07 && this.A0B == c32716Eah.A0B && C14360o3.A0K(this.A06, c32716Eah.A06) && this.A0A == c32716Eah.A0A && C14360o3.A0K(this.A04, c32716Eah.A04)) {
            return true;
        }
        return false;
    }
}
