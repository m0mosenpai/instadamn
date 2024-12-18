package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KTK extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final C158797Aq A01;
    public final C7QY A02;
    public final DirectThreadAnalyticsParams A03;
    public final PrivacyMediaOverlayViewModel A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTK(C158797Aq c158797Aq, C7QY c7qy, DirectThreadAnalyticsParams directThreadAnalyticsParams, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(c7qy.A0B);
        C14360o3.A0B(c7qy, 1);
        this.A02 = c7qy;
        this.A05 = z;
        this.A01 = c158797Aq;
        this.A06 = z2;
        this.A04 = privacyMediaOverlayViewModel;
        this.A07 = z3;
        this.A00 = i;
        this.A08 = z4;
        this.A03 = directThreadAnalyticsParams;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTK) {
                KTK ktk = (KTK) obj;
                if (!C14360o3.A0K(this.A02, ktk.A02) || this.A05 != ktk.A05 || !C14360o3.A0K(this.A01, ktk.A01) || this.A06 != ktk.A06 || !C14360o3.A0K(this.A04, ktk.A04) || this.A07 != ktk.A07 || this.A00 != ktk.A00 || this.A08 != ktk.A08 || !C14360o3.A0K(this.A03, ktk.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A07, (AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public static C7QY A00(Iterator it) {
        return ((KTK) it.next()).A02;
    }

    public static C7QY A01(List list, int i) {
        return ((KTK) list.get(i)).A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
