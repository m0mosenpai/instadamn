package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Wnc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71080Wnc implements InterfaceC57999Pnj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71080Wnc(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC57999Pnj
    public final void D2t(View view, boolean z) {
        C66359UCf c66359UCf;
        if (this.A00 != 0) {
            if (z) {
                V0W v0w = (V0W) this.A03;
                v0w.A00 = (XIGIGBoostCallToAction) this.A01;
                V0W.A00(v0w);
                AbstractC65703TsZ.A0A(v0w.requireContext()).hideSoftInputFromWindow(((View) this.A02).getWindowToken(), 0);
                return;
            }
            return;
        }
        V0X v0x = (V0X) this.A03;
        PromoteData promoteData = v0x.A0A;
        if (promoteData != null) {
            boolean z2 = true;
            if ((promoteData.A2v || promoteData.A2p) && v0x.A0F) {
                c66359UCf = (C66359UCf) this.A02;
                c66359UCf.A05(true);
            } else {
                c66359UCf = (C66359UCf) this.A02;
                c66359UCf.A05(z);
            }
            PromoteData promoteData2 = v0x.A0A;
            if (promoteData2 != null) {
                promoteData2.A2H = true;
                if (!z || ((!promoteData2.A2p && !promoteData2.A2v) || v0x.A0F)) {
                    z2 = false;
                }
                c66359UCf.A06(z2);
                if (z) {
                    v0x.A04 = XIGIGBoostDestination.A0G;
                    V0X.A02(v0x);
                    V0X.A00((View) this.A01, v0x);
                }
                if (!C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(v0x.A0J), 36326799029844087L)) {
                    return;
                }
                c66359UCf.A03(z);
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }
}
