package X;

import android.view.View;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Wna, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71078Wna implements InterfaceC57999Pnj {
    public final int A00;
    public final Object A01;

    public C71078Wna(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57999Pnj
    public final void D2t(View view, boolean z) {
        V0U v0u;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations;
        boolean z2;
        switch (this.A00) {
            case 0:
                ((C66359UCf) this.A01).A04(z);
                return;
            case 1:
                if (z) {
                    v0u = (V0U) this.A01;
                    instagramProfileCallToActionDestinations = InstagramProfileCallToActionDestinations.A04;
                    break;
                } else {
                    return;
                }
            default:
                v0u = (V0U) this.A01;
                C66359UCf c66359UCf = v0u.A06;
                if (c66359UCf != null) {
                    c66359UCf.A05(z);
                }
                C66359UCf c66359UCf2 = v0u.A06;
                if (c66359UCf2 != null) {
                    if (z) {
                        PromoteData promoteData = v0u.A03;
                        if (promoteData == null) {
                            C14360o3.A0F("promoteData");
                            throw C00O.createAndThrow();
                        }
                        if (promoteData.A2p || promoteData.A2v) {
                            z2 = true;
                            c66359UCf2.A06(z2);
                        }
                    }
                    z2 = false;
                    c66359UCf2.A06(z2);
                }
                if (z) {
                    instagramProfileCallToActionDestinations = InstagramProfileCallToActionDestinations.A0B;
                    break;
                } else {
                    return;
                }
                break;
        }
        v0u.A00 = instagramProfileCallToActionDestinations;
    }
}
