package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Sw4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63929Sw4 implements InterfaceC65636Tpx {
    public final int A00;
    public final InterfaceC159157Cb A01;
    public final String A02;
    public final /* synthetic */ SMM A03;

    public C63929Sw4(InterfaceC159157Cb interfaceC159157Cb, SMM smm, String str, int i) {
        C14360o3.A0B(str, 2);
        this.A03 = smm;
        this.A02 = str;
        this.A00 = i;
        this.A01 = interfaceC159157Cb;
    }

    @Override // X.InterfaceC65636Tpx
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C7CY c7cy;
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C14360o3.A0B(abstractCollection, 0);
        if (abstractCollection.isEmpty()) {
            SMM smm = this.A03;
            String str = this.A02;
            InterfaceC159157Cb interfaceC159157Cb = this.A01;
            smm.A02.remove(str);
            Object remove = smm.A01.remove(str);
            if ((remove instanceof C7CY) && (c7cy = (C7CY) remove) != null) {
                c7cy.A01.remove(interfaceC159157Cb);
            }
            smm.A03.remove(str);
        }
        SMM smm2 = this.A03;
        boolean isEmpty = smm2.A02.isEmpty();
        SCN scn = smm2.A00;
        if (isEmpty) {
            int i = this.A00;
            DirectLiveLocationService directLiveLocationService = scn.A00;
            RGW rgw = directLiveLocationService.A00;
            if (rgw != null) {
                rgw.A01(directLiveLocationService.A04);
            }
            directLiveLocationService.A03 = false;
            directLiveLocationService.stopForeground(1);
            if (i > 0) {
                directLiveLocationService.stopSelf(i);
                return;
            } else {
                directLiveLocationService.stopSelf();
                return;
            }
        }
        String str2 = this.A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            String str3 = ((LiveLocationSession) it.next()).A04;
            C14360o3.A07(str3);
            Long A0j = AbstractC166997dE.A0j(str3);
            if (A0j != null) {
                A1E.add(A0j);
            }
        }
        DirectLiveLocationService directLiveLocationService2 = scn.A00;
        if (!DirectLiveLocationService.A04(directLiveLocationService2) || !AbstractC25226BEj.A1b(A1E)) {
            return;
        }
        Object computeIfAbsent = directLiveLocationService2.A06.computeIfAbsent(str2, new TVN(new C50363MLp(27, directLiveLocationService2, directLiveLocationService2), 1));
        C14360o3.A07(computeIfAbsent);
        SXJ sxj = (SXJ) computeIfAbsent;
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            DirectLiveLocationService.A01(directLiveLocationService2, sxj, MSY.A07(it2));
        }
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
