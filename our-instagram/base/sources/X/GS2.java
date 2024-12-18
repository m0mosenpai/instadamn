package X;

import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

/* loaded from: classes6.dex */
public final class GS2 implements InterfaceC19960yQ {
    public final /* synthetic */ FanClubConsiderationViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public GS2(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str, String str2, String str3) {
        this.A00 = fanClubConsiderationViewModel;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public static void A00(FJ8 fj8, String str) {
        C006802i c006802i = fj8.A00;
        int hashCode = fj8.A01.hashCode();
        c006802i.markerAnnotate(1062866800, hashCode, "error", str);
        c006802i.markerEndAtPoint(1062866800, hashCode, (short) 3, str);
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C05A c05a;
        Object obj2;
        AbstractC33555EsT abstractC33555EsT = (AbstractC33555EsT) obj;
        if (C14360o3.A0K(abstractC33555EsT, C32936EeH.A00)) {
            FanClubConsiderationViewModel fanClubConsiderationViewModel = this.A00;
            FJ8 fj8 = fanClubConsiderationViewModel.A05;
            fj8.A00.markerPoint(1062866800, fj8.A01.hashCode(), "google_iap_start");
            c05a = fanClubConsiderationViewModel.A0D;
            obj2 = EnumC33336EoV.A02;
        } else {
            if (C14360o3.A0K(abstractC33555EsT, C32934EeF.A00)) {
                A00(this.A00.A05, "init_failed");
            } else if (C14360o3.A0K(abstractC33555EsT, C32932EeD.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel2 = this.A00;
                fanClubConsiderationViewModel2.A04.A0C(fanClubConsiderationViewModel2.A0A, abstractC33555EsT.toString(), this.A02, this.A03, fanClubConsiderationViewModel2.A0B);
                A00(fanClubConsiderationViewModel2.A05, "google_payment_failed");
                c05a = fanClubConsiderationViewModel2.A0D;
                obj2 = EnumC33336EoV.A04;
            } else if (C14360o3.A0K(abstractC33555EsT, C32933EeE.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel3 = this.A00;
                FJ8 fj82 = fanClubConsiderationViewModel3.A05;
                C006802i c006802i = fj82.A00;
                int hashCode = fj82.A01.hashCode();
                c006802i.markerPoint(1062866800, hashCode, "google_iap_end");
                c006802i.markerPoint(1062866800, hashCode, "verification_start");
                c05a = fanClubConsiderationViewModel3.A0D;
                obj2 = EnumC33336EoV.A03;
            } else if (abstractC33555EsT instanceof C32931EeC) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel4 = this.A00;
                C99694dm c99694dm = fanClubConsiderationViewModel4.A04;
                String str = fanClubConsiderationViewModel4.A0A;
                EnumC61185Rgl enumC61185Rgl = ((C32931EeC) abstractC33555EsT).A00;
                c99694dm.A0C(str, enumC61185Rgl.A00, this.A02, this.A03, fanClubConsiderationViewModel4.A0B);
                A00(fanClubConsiderationViewModel4.A05, "purchase_failed");
                fanClubConsiderationViewModel4.A0D.Egh(EnumC33336EoV.A04);
                if (enumC61185Rgl == EnumC61185Rgl.A0J) {
                    c05a = fanClubConsiderationViewModel4.A0F;
                    obj2 = EnumC33348Eoh.A04;
                } else if (enumC61185Rgl != EnumC61185Rgl.A0P && enumC61185Rgl != EnumC61185Rgl.A0Q) {
                    c05a = fanClubConsiderationViewModel4.A0F;
                    obj2 = EnumC33348Eoh.A05;
                }
            } else if (C14360o3.A0K(abstractC33555EsT, C32935EeG.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel5 = this.A00;
                FJ8 fj83 = fanClubConsiderationViewModel5.A05;
                fj83.A00.markerPoint(1062866800, fj83.A01.hashCode(), "verification_end");
                String str2 = this.A01;
                if (str2 != null) {
                    FanClubConsiderationViewModel.A0A(fanClubConsiderationViewModel5, str2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return C0eB.A00;
        }
        c05a.Egh(obj2);
        return C0eB.A00;
    }
}
