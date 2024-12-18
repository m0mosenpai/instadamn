package X;

import android.content.Context;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.WFe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70179WFe {
    public static final DistanceUnit A01(Context context) {
        Locale locale = AbstractC58319PtB.A08(context).getLocales().get(0);
        if (locale != null && VZI.A01.contains(locale.getCountry())) {
            return DistanceUnit.A04;
        }
        return DistanceUnit.A03;
    }

    public static final boolean A04(List list) {
        return list != null && !list.isEmpty() && list.size() == 1 && ((AudienceGeoLocation) list.get(0)).A03 == AdGeoLocationType.A07;
    }

    public static final LatLng A00(UserSession userSession) {
        Location lastLocation;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null && (lastLocation = c1vw.getLastLocation(userSession, "PromoteLocationUtil")) != null) {
            return AbstractC43594JPz.A0L(lastLocation);
        }
        return new LatLng(0.0d, 0.0d);
    }

    public static final String A02(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((AudienceGeoLocation) it.next()).A05;
            if (str != null) {
                arrayList.add(str);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        String A00 = S5X.A00(context, arrayList, AbstractC58319PtB.A08(context).locale);
        C14360o3.A07(A00);
        return A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.business.promote.model.AudienceGeoLocation r10, java.util.List r11) {
        /*
            boolean r2 = X.AbstractC167017dG.A1a(r10, r11)
            boolean r0 = r11 instanceof java.util.Collection
            r9 = 0
            if (r0 == 0) goto L10
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L10
        Lf:
            return r9
        L10:
            java.util.Iterator r8 = r11.iterator()
        L14:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lf
            java.lang.Object r7 = r8.next()
            com.instagram.business.promote.model.AudienceGeoLocation r7 = (com.instagram.business.promote.model.AudienceGeoLocation) r7
            X.WFe r0 = X.VZI.A00
            r4 = r10
            r3 = r7
            r6 = 2
            X.C14360o3.A0B(r7, r2)
            boolean r0 = r10.equals(r7)
            if (r0 != 0) goto L6a
            com.instagram.api.schemas.AdGeoLocationType r5 = r10.A03
            java.lang.String r1 = "Required value was null."
            if (r5 == 0) goto L9c
            com.instagram.api.schemas.AdGeoLocationType r0 = r7.A03
            if (r0 == 0) goto L96
            int r0 = r5.compareTo(r0)
            if (r0 < 0) goto L40
            r3 = r10
            r4 = r7
        L40:
            com.instagram.api.schemas.AdGeoLocationType r0 = r4.A03
            if (r0 == 0) goto L14
            int r1 = r0.ordinal()
            if (r1 == r6) goto L81
            r0 = 3
            if (r1 == r0) goto L6c
            r0 = 4
            if (r1 != r0) goto L14
            com.instagram.api.schemas.AdGeoLocationType r1 = r3.A03
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.A04
            if (r1 == r0) goto L14
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r3.A07
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6a
            java.lang.String r1 = r4.A07
            java.lang.String r0 = r3.A07
        L64:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L14
        L6a:
            r9 = 1
            return r9
        L6c:
            com.instagram.api.schemas.AdGeoLocationType r1 = r3.A03
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.A0G
            if (r1 == r0) goto L14
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r3.A08
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6a
            java.lang.String r1 = r4.A08
            java.lang.String r0 = r3.A08
            goto L64
        L81:
            com.instagram.api.schemas.AdGeoLocationType r1 = r3.A03
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.A05
            if (r1 == r0) goto L14
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6a
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r3.A04
            goto L64
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70179WFe.A03(com.instagram.business.promote.model.AudienceGeoLocation, java.util.List):boolean");
    }
}
