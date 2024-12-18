package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.5tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129565tL extends AbstractC129515tG implements InterfaceC129555tK {
    public final C9BR A00;
    public final C7QX A01;
    public final C7QL A02;
    public final AbstractC46453KhD A03;
    public final DirectThreadAnalyticsParams A04;
    public final PrivacyMediaOverlayViewModel A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C129565tL) {
                C129565tL c129565tL = (C129565tL) obj;
                if (this.A08 != c129565tL.A08 || this.A09 != c129565tL.A09 || !C14360o3.A0K(this.A03, c129565tL.A03) || !C14360o3.A0K(this.A00, c129565tL.A00) || !C14360o3.A0K(this.A02, c129565tL.A02) || !C14360o3.A0K(this.A01, c129565tL.A01) || !C14360o3.A0K(this.A06, c129565tL.A06) || this.A0A != c129565tL.A0A || this.A07 != c129565tL.A07 || !C14360o3.A0K(this.A05, c129565tL.A05) || this.A0B != c129565tL.A0B || !C14360o3.A0K(this.A04, c129565tL.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        AbstractC46453KhD abstractC46453KhD = this.A03;
        int i5 = 0;
        if (abstractC46453KhD == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC46453KhD.hashCode();
        }
        int hashCode4 = (((((((i4 + hashCode) * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (hashCode4 + hashCode2) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A07) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = this.A05;
        if (privacyMediaOverlayViewModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = privacyMediaOverlayViewModel.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        int i12 = 1237;
        if (this.A0B) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        DirectThreadAnalyticsParams directThreadAnalyticsParams = this.A04;
        if (directThreadAnalyticsParams != null) {
            i5 = directThreadAnalyticsParams.hashCode();
        }
        return i13 + i5;
    }

    public C129565tL(C9BR c9br, C7QX c7qx, C7QL c7ql, AbstractC46453KhD abstractC46453KhD, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(c7qx);
        this.A08 = z;
        this.A09 = z2;
        this.A03 = abstractC46453KhD;
        this.A00 = c9br;
        this.A02 = c7ql;
        this.A01 = c7qx;
        this.A06 = str;
        this.A0A = z3;
        this.A07 = z4;
        this.A05 = privacyMediaOverlayViewModel;
        this.A0B = z5;
        this.A04 = directThreadAnalyticsParams;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
