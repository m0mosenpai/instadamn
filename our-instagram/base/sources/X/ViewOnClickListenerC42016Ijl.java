package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ijl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42016Ijl implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;
    public final /* synthetic */ H7Z A03;
    public final /* synthetic */ C41181vS A04;
    public final /* synthetic */ C41551w4 A05;
    public final /* synthetic */ C141596ac A06;
    public final /* synthetic */ C6UN A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public ViewOnClickListenerC42016Ijl(UserSession userSession, InterfaceC60442pS interfaceC60442pS, H7Z h7z, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, C6UN c6un, String str, int i, boolean z) {
        this.A08 = str;
        this.A03 = h7z;
        this.A00 = i;
        this.A09 = z;
        this.A07 = c6un;
        this.A01 = userSession;
        this.A05 = c41551w4;
        this.A04 = c41181vS;
        this.A06 = c141596ac;
        this.A02 = interfaceC60442pS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        int A05 = C0f9.A05(1570910981);
        HashSet hashSet = C6WP.A06;
        String str2 = this.A08;
        if (hashSet.contains(str2)) {
            i = 136391628;
        } else {
            C6WP.A03 = true;
            H7Z h7z = this.A03;
            H6R h6r = null;
            List<H6R> list = h7z.A04;
            if (list != null) {
                h6r = (H6R) list.get(this.A00);
            }
            HashMap hashMap = C6WP.A05;
            String str3 = h7z.A01;
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str3);
            if (h6r != null) {
                if (abstractCollection != null) {
                    String str4 = h6r.A03;
                    if (abstractCollection.contains(str4)) {
                        abstractCollection.remove(str4);
                    }
                } else {
                    abstractCollection = AbstractC166987dD.A1H();
                }
                abstractCollection.add(h6r.A03);
                String str5 = str3;
                if (str3 == null) {
                    str5 = "";
                }
                hashMap.put(str5, abstractCollection);
            }
            if (this.A09) {
                AbstractCollection abstractCollection2 = (AbstractCollection) hashMap.get(str3);
                if (h6r != null) {
                    Boolean bool = h6r.A00;
                    if (bool != null && bool.booleanValue()) {
                        String str6 = h6r.A03;
                        if (str6 != null && abstractCollection2 != null && abstractCollection2.contains(str6) && list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str7 = ((H6R) it.next()).A03;
                                if (!str6.equals(str7)) {
                                    abstractCollection2.remove(str7);
                                }
                            }
                        }
                    } else {
                        String str8 = h6r.A03;
                        if (str8 != null && list != null) {
                            for (H6R h6r2 : list) {
                                String str9 = h6r2.A03;
                                if (!C14360o3.A0K(str8, str9) && abstractCollection2 != null && abstractCollection2.contains(str9) && AbstractC166997dE.A1Z(h6r2.A00, true)) {
                                    abstractCollection2.remove(str9);
                                }
                            }
                        }
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                hashMap.put(str3, abstractCollection2);
                C6UN c6un = this.A07;
                C6WP.A03(h7z, c6un, str2, true);
                C6WP.A02(this.A01, this.A02, this.A04, this.A05, this.A06, c6un, false);
            } else {
                C6UN c6un2 = this.A07;
                UserSession userSession = this.A01;
                C41551w4 c41551w4 = this.A05;
                C41181vS c41181vS = this.A04;
                C141596ac c141596ac = this.A06;
                InterfaceC60442pS interfaceC60442pS = this.A02;
                C6WP.A02(userSession, interfaceC60442pS, c41181vS, c41551w4, c141596ac, c6un2, false);
                C38541qi c38541qi = c41551w4.A0H.A0I;
                if (c38541qi == null || (str = c38541qi.A06) == null) {
                    str = "";
                }
                C6WP.A01(userSession, interfaceC60442pS, c38541qi, str);
            }
            i = -1113854137;
        }
        C0f9.A0C(i, A05);
    }
}
