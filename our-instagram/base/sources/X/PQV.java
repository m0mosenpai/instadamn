package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

/* loaded from: classes9.dex */
public final class PQV implements Runnable {
    public final /* synthetic */ C51751Mta A00;
    public final /* synthetic */ P10 A01;

    public PQV(C51751Mta c51751Mta, P10 p10) {
        this.A00 = c51751Mta;
        this.A01 = p10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        C54778OIs c54778OIs;
        long j;
        C51751Mta c51751Mta = this.A00;
        Location location = null;
        if (c51751Mta.A03) {
            P10 p10 = this.A01;
            InterfaceC58310Pt2 interfaceC58310Pt2 = p10.A04;
            NKO nko = p10.A05;
            C56037Ou9 c56037Ou9 = nko.A00;
            if (c56037Ou9 != null) {
                location = c56037Ou9.A00;
                j = c56037Ou9.A01;
            } else {
                j = 0;
            }
            interfaceC58310Pt2.E2k(location, j);
            C05A c05a = nko.A03;
            C51751Mta c51751Mta2 = (C51751Mta) c05a.getValue();
            List list2 = (List) c51751Mta2.A01;
            String str = c51751Mta2.A02;
            Venue venue = (Venue) c51751Mta2.A00;
            C14360o3.A0B(list2, 0);
            c05a.Egh(new C51751Mta(venue, str, list2, false));
        }
        P10 p102 = this.A01;
        C52370NFk c52370NFk = p102.A01;
        if (c52370NFk != null) {
            OWd oWd = c52370NFk.A02;
            if (oWd != null) {
                oWd.A02((Venue) c51751Mta.A00);
            }
            Venue venue2 = (Venue) c51751Mta.A00;
            if (venue2 != null && (c54778OIs = p102.A00) != null) {
                c54778OIs.A00(venue2);
            }
            List list3 = (List) c51751Mta.A01;
            if (list3.isEmpty()) {
                C52370NFk c52370NFk2 = p102.A01;
                if (c52370NFk2 != null) {
                    OWd oWd2 = c52370NFk2.A02;
                    if (oWd2 != null) {
                        C51143Mim c51143Mim = oWd2.A04;
                        c51143Mim.A00.clear();
                        c51143Mim.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            } else {
                C52370NFk c52370NFk3 = p102.A01;
                if (c52370NFk3 != null) {
                    OWd oWd3 = c52370NFk3.A02;
                    if (oWd3 != null) {
                        if (p102.A06) {
                            int size = list3.size();
                            int i = 5;
                            if (5 > size) {
                                i = size;
                            }
                            list = list3.subList(0, i);
                        } else {
                            list = list3;
                        }
                        C14360o3.A0B(list, 0);
                        C51143Mim c51143Mim2 = oWd3.A04;
                        AbstractC31175DnJ.A0x(c51143Mim2, list, c51143Mim2.A00);
                    }
                    UserSession userSession = p102.A03;
                    String str2 = c51751Mta.A02;
                    if (str2 != null) {
                        p102.A00 = new C54778OIs(p102.A02, userSession, str2, list3);
                    }
                    C52370NFk c52370NFk4 = p102.A01;
                    if (c52370NFk4 != null) {
                        OWd oWd4 = c52370NFk4.A02;
                        if (oWd4 == null) {
                            return;
                        }
                        OWd.A00(oWd4, oWd4.A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("locationTagOption");
        throw C00O.createAndThrow();
    }
}
