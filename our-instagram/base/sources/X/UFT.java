package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UFT extends AbstractC52922bZ {
    public final XIGIGBoostDestination A00;
    public final C68957Vev A01;
    public final L4S A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final C0UO A09;
    public final boolean A0A;

    public UFT(XIGIGBoostDestination xIGIGBoostDestination, C68957Vev c68957Vev, UserSession userSession, String str, String str2, String str3, boolean z) {
        AbstractC167007dF.A1I(userSession, 1, str3);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = xIGIGBoostDestination;
        this.A0A = z;
        this.A01 = c68957Vev;
        this.A06 = str3;
        L4S l4s = new L4S(this);
        this.A02 = l4s;
        InterfaceC19390xP interfaceC19390xP = l4s.A00;
        this.A09 = AbstractC208910l.A01(new C45124Jxt((C51758Mth) l4s.A05.getValue(), (UQJ) l4s.A01.getValue(), (C66628UPq) l4s.A04.getValue(), ((Boolean) l4s.A02.getValue()).booleanValue(), ((Boolean) l4s.A03.getValue()).booleanValue()), AbstractC141776au.A00(this), interfaceC19390xP, C10I.A00);
        C24721Ip A0q = MSX.A0q();
        this.A07 = A0q;
        this.A08 = AbstractC07080Za.A03(A0q);
    }

    public static final UPY A00(XIGIGBoostDestination xIGIGBoostDestination, UQJ uqj, UserSession userSession, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        double d;
        double d2;
        int i;
        String str2;
        C14360o3.A0B(uqj, 0);
        List list = uqj.A07;
        String str3 = uqj.A04;
        String str4 = uqj.A05;
        int i2 = uqj.A01;
        int i3 = uqj.A00;
        List list2 = uqj.A06;
        if (list2 != null) {
            arrayList = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudienceGender) it.next()).A00);
            }
        } else {
            arrayList = null;
        }
        List list3 = uqj.A08;
        if (list3 != null) {
            arrayList2 = AbstractC167007dF.A0i(list3);
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AudienceInterest) it2.next()).A00());
            }
        } else {
            arrayList2 = null;
        }
        TargetingRelaxationConstants targetingRelaxationConstants = uqj.A03;
        AdvantageAudienceData advantageAudienceData = uqj.A02;
        String str5 = C70399WUb.A00(userSession).A03;
        C14360o3.A07(str5);
        if (list != null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : list) {
                AdGeoLocationType adGeoLocationType = AdGeoLocationType.A05;
                AdGeoLocationType adGeoLocationType2 = ((AudienceGeoLocation) obj).A03;
                if (adGeoLocationType2 != null && adGeoLocationType == VRX.A00(adGeoLocationType2)) {
                    arrayList7.add(obj);
                }
            }
            arrayList3 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                String str6 = ((AudienceGeoLocation) it3.next()).A06;
                if (str6 != null) {
                    arrayList3.add(str6);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj2 : list) {
                AdGeoLocationType adGeoLocationType3 = AdGeoLocationType.A0G;
                AdGeoLocationType adGeoLocationType4 = ((AudienceGeoLocation) obj2).A03;
                if (adGeoLocationType4 != null && adGeoLocationType3 == VRX.A00(adGeoLocationType4)) {
                    arrayList8.add(obj2);
                }
            }
            arrayList4 = new ArrayList();
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                String str7 = ((AudienceGeoLocation) it4.next()).A06;
                if (str7 != null) {
                    arrayList4.add(str7);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj3 : list) {
                AdGeoLocationType adGeoLocationType5 = AdGeoLocationType.A04;
                AdGeoLocationType adGeoLocationType6 = ((AudienceGeoLocation) obj3).A03;
                if (adGeoLocationType6 != null && adGeoLocationType5 == VRX.A00(adGeoLocationType6)) {
                    arrayList9.add(obj3);
                }
            }
            arrayList5 = new ArrayList();
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                String str8 = ((AudienceGeoLocation) it5.next()).A06;
                if (str8 != null) {
                    arrayList5.add(str8);
                }
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj4 : list) {
                AdGeoLocationType adGeoLocationType7 = AdGeoLocationType.A0L;
                AdGeoLocationType adGeoLocationType8 = ((AudienceGeoLocation) obj4).A03;
                if (adGeoLocationType8 != null && adGeoLocationType7 == VRX.A00(adGeoLocationType8)) {
                    arrayList10.add(obj4);
                }
            }
            arrayList6 = new ArrayList();
            Iterator it6 = arrayList10.iterator();
            while (it6.hasNext()) {
                String str9 = ((AudienceGeoLocation) it6.next()).A06;
                if (str9 != null) {
                    arrayList6.add(str9);
                }
            }
        } else {
            arrayList3 = null;
            arrayList4 = null;
            arrayList5 = null;
            arrayList6 = null;
        }
        AudienceGeoLocation A01 = uqj.A01();
        if (A01 != null) {
            d = A01.A00;
        } else {
            d = 0.0d;
        }
        AudienceGeoLocation A012 = uqj.A01();
        if (A012 != null) {
            d2 = A012.A01;
        } else {
            d2 = 0.0d;
        }
        AudienceGeoLocation A013 = uqj.A01();
        if (A013 != null) {
            i = A013.A02;
        } else {
            i = 0;
        }
        AudienceGeoLocation A014 = uqj.A01();
        if (A014 != null) {
            str2 = A014.A05;
        } else {
            str2 = null;
        }
        return new UPY(advantageAudienceData, targetingRelaxationConstants, xIGIGBoostDestination, userSession, str3, str4, str5, str2, str, list, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, C16930sl.A00, d, d2, i2, i3, i);
    }

    public final void A08(XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus) {
        Object advantageAudienceDataImpl;
        Object value;
        Integer BTn;
        C05A c05a = this.A02.A01;
        AdvantageAudienceData advantageAudienceData = ((UQJ) c05a.getValue()).A02;
        if (advantageAudienceData != null) {
            advantageAudienceData.AaJ();
            Integer BTn2 = advantageAudienceData.BTn();
            if (advantageAudienceData instanceof ImmutablePandoAdvantageAudienceData) {
                advantageAudienceDataImpl = AbstractC37303Gc4.A06(advantageAudienceData, AbstractC25229BEm.A1b("min_age_constraint", BTn2, new C09530e4("advantage_audience_status", xFBTargetingAutomationAdvantageAudienceStatus.A00)));
            } else {
                advantageAudienceDataImpl = new AdvantageAudienceDataImpl(xFBTargetingAutomationAdvantageAudienceStatus, BTn2);
            }
            AdvantageAudienceData advantageAudienceData2 = (AdvantageAudienceData) advantageAudienceDataImpl;
            Parcelable.Creator creator = PromoteAudienceInfo.CREATOR;
            int i = 13;
            if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.A05) {
                int i2 = ((UQJ) c05a.getValue()).A01;
                AdvantageAudienceData advantageAudienceData3 = ((UQJ) c05a.getValue()).A02;
                if (advantageAudienceData3 != null && (BTn = advantageAudienceData3.BTn()) != null) {
                    i = BTn.intValue();
                } else {
                    i = 0;
                }
                if (i2 >= i) {
                    i = i2;
                }
            }
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, UQJ.A00(advantageAudienceData2, null, (UQJ) value, null, null, null, null, i, 0, 763, false)));
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static final void A01(Context context, UFT uft) {
        Object value;
        C66628UPq c66628UPq;
        ?? obj;
        C70179WFe c70179WFe = VZI.A00;
        LatLng A00 = C70179WFe.A00(uft.A03);
        C05A c05a = uft.A02.A04;
        do {
            value = c05a.getValue();
            c66628UPq = (C66628UPq) value;
            double d = A00.A00;
            Double valueOf = Double.valueOf(d);
            double d2 = A00.A01;
            String A0t = AbstractC31174DnI.A0t(context, valueOf, Double.valueOf(d2), 2131970508);
            C14360o3.A07(A0t);
            AdGeoLocationType adGeoLocationType = AdGeoLocationType.A07;
            int i = uft.A06().A01;
            obj = new Object();
            obj.A06 = null;
            obj.A05 = A0t;
            obj.A03 = adGeoLocationType;
            obj.A00 = d;
            obj.A01 = d2;
            obj.A02 = i;
            obj.A04 = null;
            obj.A08 = null;
            obj.A07 = null;
        } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, obj, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, c66628UPq.A01, c66628UPq.A06)));
    }

    public static final void A02(UFT uft, List list) {
        Object value;
        C66628UPq c66628UPq;
        ArrayList arrayList;
        C05A c05a = uft.A02.A04;
        do {
            value = c05a.getValue();
            c66628UPq = (C66628UPq) value;
            C70179WFe c70179WFe = VZI.A00;
            arrayList = new ArrayList();
            int size = list.size();
            while (true) {
                size--;
                if (size <= 0) {
                    break;
                }
                AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) list.get(size);
                if (C70179WFe.A03(audienceGeoLocation, list.subList(0, size))) {
                    arrayList.add(audienceGeoLocation);
                }
            }
        } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, list, arrayList, c66628UPq.A00, c66628UPq.A01, c66628UPq.A06)));
    }

    public static final void A03(UFT uft, boolean z) {
        C05A c05a = uft.A02.A02;
        do {
        } while (!c05a.AIi(c05a.getValue(), Boolean.valueOf(z)));
    }

    public final VG4 A04() {
        if (this.A04 != null) {
            return VG4.A0e;
        }
        return VG4.A0X;
    }

    public final UQJ A05() {
        return (UQJ) this.A02.A01.getValue();
    }

    public final C66628UPq A06() {
        return (C66628UPq) this.A02.A04.getValue();
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public final void A09(AudienceGeoLocation audienceGeoLocation) {
        Object value;
        C66628UPq c66628UPq;
        AudienceGeoLocation audienceGeoLocation2;
        C05A c05a = this.A02.A04;
        do {
            value = c05a.getValue();
            c66628UPq = (C66628UPq) value;
            if (audienceGeoLocation != null) {
                String str = audienceGeoLocation.A06;
                String str2 = audienceGeoLocation.A05;
                AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
                double d = audienceGeoLocation.A00;
                double d2 = audienceGeoLocation.A01;
                String str3 = audienceGeoLocation.A04;
                String str4 = audienceGeoLocation.A08;
                String str5 = audienceGeoLocation.A07;
                int i = A06().A01;
                ?? obj = new Object();
                obj.A06 = str;
                obj.A05 = str2;
                obj.A03 = adGeoLocationType;
                obj.A00 = d;
                obj.A01 = d2;
                obj.A02 = i;
                obj.A04 = str3;
                obj.A08 = str4;
                obj.A07 = str5;
                audienceGeoLocation2 = obj;
            } else {
                audienceGeoLocation2 = null;
            }
        } while (!c05a.AIi(value, C66628UPq.A00(audienceGeoLocation2, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, c66628UPq.A01, c66628UPq.A06)));
    }

    public final void A0A(UQJ uqj) {
        InterfaceC19390xP A04;
        UPY A00 = A00(this.A00, uqj, this.A03, this.A05);
        C68957Vev c68957Vev = this.A01;
        c68957Vev.A00 = A00;
        Object obj = c68957Vev.A01.get(A00);
        if (obj != null) {
            A04 = new AnonymousClass058(new MCK(obj, (InterfaceC23621Ds) null, 14, 42));
        } else {
            UserSession userSession = A00.A08;
            String str = A00.A0D;
            if (str == null) {
                str = "";
            }
            XIGIGBoostDestination xIGIGBoostDestination = A00.A07;
            if (xIGIGBoostDestination == null) {
                xIGIGBoostDestination = XIGIGBoostDestination.A0C;
            }
            List list = A00.A0E;
            if (list == null) {
                list = C16930sl.A00;
            }
            int i = A00.A03;
            int i2 = A00.A02;
            List list2 = A00.A0H;
            List list3 = A00.A0I;
            List list4 = A00.A0G;
            List list5 = A00.A0J;
            List list6 = A00.A0F;
            List list7 = A00.A0K;
            TargetingRelaxationConstants targetingRelaxationConstants = A00.A06;
            double d = A00.A00;
            double d2 = A00.A01;
            int i3 = A00.A04;
            String str2 = A00.A09;
            XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
            A04 = JX4.A04(new MC7((InterfaceC23621Ds) null, c68957Vev, A00, 17), AbstractC70178WFd.A00(A00.A05, targetingRelaxationConstants, xIGIGBoostDestination2, new C1OL(), userSession, str, str2, A00.A0C, list, list2, list3, list4, list5, list6, list7, d, d2, i, i2, i3).A03(1958324470));
        }
        AbstractC25232BEp.A1J(this, new MC7((InterfaceC23621Ds) null, this, A00, 18), A04);
    }

    public final boolean A0B() {
        UserSession userSession = this.A03;
        return WGs.A0M(this.A00, A05(), userSession, this.A0A, false, AbstractC167007dF.A1W(this.A04));
    }

    public final List A07() {
        AudienceGeoLocation audienceGeoLocation;
        int i = A06().A00;
        if (i != 0) {
            if (i == 1) {
                boolean z = A06().A06;
                C66628UPq A06 = A06();
                if (z) {
                    audienceGeoLocation = A06.A02;
                } else {
                    audienceGeoLocation = A06.A03;
                }
                if (audienceGeoLocation != null) {
                    return AbstractC16960so.A1N(audienceGeoLocation);
                }
            }
            return new ArrayList();
        }
        return A06().A05;
    }
}
