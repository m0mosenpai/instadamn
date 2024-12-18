package com.instagram.filterkit.filter.resize;

import X.AbstractC31718DwN;
import X.C05F;
import X.C0w9;
import X.C72451Xdv;
import X.InterfaceC197718oi;
import X.LNL;
import X.XOI;
import X.YPq;
import X.YRL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.filterkit.filter.intf.IgFilter;

/* loaded from: classes12.dex */
public class ResizeFilter implements IgFilter {
    public static final Parcelable.Creator CREATOR = new LNL(79);
    public boolean A00;
    public final UserSession A01;
    public final IgFilter A02;
    public final IdentityFilter A03 = new BaseSimpleFilter();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.BCA
    public final void AHR(YPq yPq) {
        IgFilter igFilter = this.A02;
        if (igFilter != null) {
            igFilter.AHR(yPq);
        }
        this.A03.AHR(yPq);
    }

    @Override // com.instagram.filterkit.filter.intf.IgFilter
    public final void EGY(YPq yPq, InterfaceC197718oi interfaceC197718oi, YRL yrl) {
        if (this.A00) {
            IgFilter igFilter = this.A02;
            igFilter.getClass();
            try {
                igFilter.EGY(yPq, interfaceC197718oi, yrl);
                AbstractC31718DwN.A01(this.A01, C05F.A0S);
                return;
            } catch (C72451Xdv e) {
                C0w9.A07("ResizeFilter Render exception", e);
                this.A00 = false;
                igFilter.AHR(yPq);
                AbstractC31718DwN.A01(this.A01, C05F.A0T);
                A00(yPq, interfaceC197718oi, yrl);
                return;
            }
        }
        AbstractC31718DwN.A01(this.A01, C05F.A0U);
        A00(yPq, interfaceC197718oi, yrl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.token);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.filterkit.filter.resize.IdentityFilter, com.instagram.filterkit.filter.BaseSimpleFilter] */
    public ResizeFilter(UserSession userSession, boolean z) {
        this.A01 = userSession;
        this.A00 = z;
        if (z) {
            this.A02 = new LanczosFilter();
        }
    }

    private void A00(YPq yPq, InterfaceC197718oi interfaceC197718oi, YRL yrl) {
        int i = 1;
        for (int Bmj = (int) ((yrl.Bmj() * 1.9f) + 0.5f); interfaceC197718oi.getWidth() > Bmj; Bmj = (int) ((Bmj * 1.9f) + 0.5f)) {
            i++;
        }
        while (i > 1) {
            XOI Cto = yPq.Cto((int) ((interfaceC197718oi.getWidth() / 1.9f) + 0.5f), (int) ((interfaceC197718oi.getHeight() / 1.9f) + 0.5f));
            this.A03.EGY(yPq, interfaceC197718oi, Cto);
            yPq.ECh(null, interfaceC197718oi);
            i--;
            interfaceC197718oi = Cto;
        }
        this.A03.EGY(yPq, interfaceC197718oi, yrl);
        yPq.ECh(null, interfaceC197718oi);
    }
}
