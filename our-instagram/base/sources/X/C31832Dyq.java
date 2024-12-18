package X;

import com.instagram.model.business.ProfileAddressData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dyq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31832Dyq extends AbstractC52922bZ {
    public final C05A A00;
    public final List A01;

    public C31832Dyq(List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = AbstractC25225BEi.A1H(list);
    }

    public final void A00(ProfileAddressData profileAddressData) {
        ArrayList A0S;
        String str = profileAddressData.A06;
        if (C14360o3.A0K(str, "primary") && A02()) {
            return;
        }
        C05A c05a = this.A00;
        Collection collection = (Collection) c05a.getValue();
        if (collection == null) {
            collection = C16930sl.A00;
        }
        if (C14360o3.A0K(str, "primary")) {
            A0S = AbstractC001800i.A0S(collection, AbstractC166987dD.A1J(profileAddressData));
        } else {
            A0S = AbstractC001800i.A0S(AbstractC166987dD.A1J(new ProfileAddressData(profileAddressData.A00, profileAddressData.A01, AnonymousClass001.A0O("new:", profileAddressData.hashCode()), profileAddressData.A03, profileAddressData.A04, profileAddressData.A05, profileAddressData.A08, profileAddressData.A07)), collection);
        }
        c05a.Egh(A0S);
    }

    public final void A01(ProfileAddressData profileAddressData) {
        String str = profileAddressData.A06;
        C05A c05a = this.A00;
        List list = (List) c05a.getValue();
        if (list != null) {
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((ProfileAddressData) it.next()).A06, str)) {
                    if (i != -1) {
                        ArrayList A1F = AbstractC166987dD.A1F(list);
                        A1F.set(i, profileAddressData);
                        c05a.Egh(A1F);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public final boolean A02() {
        List list = (List) this.A00.getValue();
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((ProfileAddressData) it.next()).A06, "primary")) {
                    return true;
                }
            }
        }
        return false;
    }
}
