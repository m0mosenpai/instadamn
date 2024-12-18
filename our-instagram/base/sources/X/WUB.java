package X;

import com.facebook.locationsharing.core.models.Location;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class WUB implements InterfaceC65338TiJ, InterfaceC65636Tpx {
    public final int A00;
    public final Object A01;

    public WUB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        AbstractC66543ULy abstractC66543ULy;
        Object[] objArr;
        String str;
        switch (this.A00) {
            case 0:
                abstractC66543ULy = ((RunnableC71249Wqe) this.A01).A00;
                objArr = new Object[0];
                str = "address error";
                break;
            case 1:
            case 2:
            default:
                throw C00O.createAndThrow();
            case 3:
                abstractC66543ULy = (AbstractC66543ULy) this.A01;
                AbstractC66543ULy.A04(abstractC66543ULy, th, "ERROR");
                objArr = new Object[0];
                str = "screen error";
                break;
        }
        AbstractC66543ULy.A05(abstractC66543ULy, str, objArr);
    }

    @Override // X.InterfaceC65636Tpx
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC66543ULy.A04(((RunnableC71249Wqe) this.A01).A00, obj, "PIN_ADDRESS_UPDATED");
                return;
            case 1:
                ImmutableList immutableList = (ImmutableList) obj;
                C66542ULx c66542ULx = (C66542ULx) this.A01;
                if (!((AbstractC68892Vdo) c66542ULx).A00) {
                    return;
                }
                AbstractC66543ULy.A04(c66542ULx, immutableList, "SHARERS_UPDATED");
                C66542ULx.A00(c66542ULx);
                C1LC it = immutableList.iterator();
                while (it.hasNext()) {
                    it.next();
                    System.currentTimeMillis();
                }
                return;
            case 2:
                Location location = (Location) obj;
                C66542ULx c66542ULx2 = (C66542ULx) this.A01;
                AbstractC66543ULy.A04(c66542ULx2, location, "CURRENT_LOCATION_UPDATED");
                C62537SFo c62537SFo = new C62537SFo(c66542ULx2.A01, location, c66542ULx2.A04);
                c62537SFo.A00.AYt(new C63928Sw3(2, new Object(), c62537SFo));
                return;
            default:
                C66542ULx c66542ULx3 = (C66542ULx) this.A01;
                C69632VsZ c69632VsZ = c66542ULx3.A02;
                c69632VsZ.A04.A01(c69632VsZ.A02, c69632VsZ.A03, C05F.A00);
                c69632VsZ.A00 = true;
                AbstractC66543ULy.A04(c66542ULx3, obj, "LIVE_LOCATION_STARTED");
                C66542ULx.A02(c66542ULx3);
                C66542ULx.A01(c66542ULx3);
                return;
        }
    }
}
