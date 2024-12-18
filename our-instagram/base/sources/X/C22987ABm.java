package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.ABm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C22987ABm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AbstractC24481Hr A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ LinkedHashMap A06;

    public /* synthetic */ C22987ABm(Context context, UserSession userSession, AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, C47Z c47z, String str, LinkedHashMap linkedHashMap) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = c47z;
        this.A02 = abstractC24481Hr;
        this.A03 = abstractC24481Hr2;
        this.A06 = linkedHashMap;
        this.A05 = str;
    }

    public final void A00(Object obj) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C47Z c47z = this.A04;
        AbstractC24481Hr abstractC24481Hr = this.A02;
        AbstractC24481Hr abstractC24481Hr2 = this.A03;
        LinkedHashMap linkedHashMap = this.A06;
        String str = this.A05;
        String str2 = (String) obj;
        c47z.A0c(ShareType.A0W);
        c47z.A4w = true;
        if (str != null) {
            c47z.A3e = str;
        }
        if (c47z.A5w) {
            str2.getClass();
            Iterator it = c47z.A0K().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C47Z c47z2 = (C47Z) it.next();
                if (c47z2.A0D() == ShareType.A0Y) {
                    c47z2.A33 = str2;
                    break;
                }
            }
        }
        C1GJ.A03(new C216029hI(context, userSession, abstractC24481Hr, abstractC24481Hr2, new C23834Agj(c47z), c47z, linkedHashMap));
        C40121td.A00(context, userSession).A0D(c47z);
        PendingMediaStore A00 = C25A.A00(userSession);
        A00.A07.add(c47z.A35);
    }
}
