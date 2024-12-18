package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.5tI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129535tI extends AbstractC129515tG implements InterfaceC129545tJ, InterfaceC129555tK {
    public final int A00;
    public final C158797Aq A01;
    public final C7QL A02;
    public final C7QY A03;
    public final AbstractC158777Ao A04;
    public final AbstractC158787Ap A05;
    public final DirectThreadAnalyticsParams A06;
    public final PrivacyMediaOverlayViewModel A07;
    public final C38321qM A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final /* synthetic */ C7QL A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C129535tI) {
                C129535tI c129535tI = (C129535tI) obj;
                if (!C14360o3.A0K(this.A04, c129535tI.A04) || !C14360o3.A0K(this.A03, c129535tI.A03) || !C14360o3.A0K(this.A09, c129535tI.A09) || this.A00 != c129535tI.A00 || !C14360o3.A0K(this.A05, c129535tI.A05) || this.A0A != c129535tI.A0A || !C14360o3.A0K(this.A08, c129535tI.A08) || !C14360o3.A0K(this.A01, c129535tI.A01) || !C14360o3.A0K(this.A07, c129535tI.A07) || this.A0B != c129535tI.A0B || !C14360o3.A0K(this.A06, c129535tI.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public C129535tI(C158797Aq c158797Aq, C7QY c7qy, AbstractC158777Ao abstractC158777Ao, AbstractC158787Ap abstractC158787Ap, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, C38321qM c38321qM, String str, int i, boolean z, boolean z2) {
        super(c7qy.A0B);
        C7QL c7ql = c7qy.A0C;
        this.A0C = c7ql;
        this.A04 = abstractC158777Ao;
        this.A03 = c7qy;
        this.A09 = str;
        this.A00 = i;
        this.A05 = abstractC158787Ap;
        this.A0A = z;
        this.A08 = c38321qM;
        this.A01 = c158797Aq;
        this.A07 = privacyMediaOverlayViewModel;
        this.A0B = z2;
        this.A06 = directThreadAnalyticsParams;
        this.A02 = c7ql;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A0C.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A0C.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        AbstractC158777Ao abstractC158777Ao = this.A04;
        int i = 0;
        if (abstractC158777Ao == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC158777Ao.hashCode();
        }
        int hashCode6 = ((((((hashCode * 31) + this.A03.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A00) * 31;
        AbstractC158787Ap abstractC158787Ap = this.A05;
        if (abstractC158787Ap == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC158787Ap.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        C38321qM c38321qM = this.A08;
        if (c38321qM == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c38321qM.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C158797Aq c158797Aq = this.A01;
        if (c158797Aq == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c158797Aq.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = this.A07;
        if (privacyMediaOverlayViewModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = privacyMediaOverlayViewModel.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        DirectThreadAnalyticsParams directThreadAnalyticsParams = this.A06;
        if (directThreadAnalyticsParams != null) {
            i = directThreadAnalyticsParams.hashCode();
        }
        return i9 + i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
