package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: X.VsM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69619VsM {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final HashMap A03;
    public final java.util.Set A04;
    public final C69786VvR A05;

    public final void A00(C37771pE c37771pE, String str) {
        C14360o3.A0B(str, 0);
        if (c37771pE != null) {
            this.A03.put(str, C1OU.A04(this.A02).A0I(c37771pE, false));
            MediaMapPin mediaMapPin = (MediaMapPin) this.A05.A02.get(str);
            if (mediaMapPin != null) {
                mediaMapPin.A08 = c37771pE;
            }
        }
    }

    public C69619VsM(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C69786VvR c69786VvR) {
        AbstractC167017dG.A1R(userSession, c69786VvR);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = c69786VvR;
        this.A01 = abstractC018607g;
        this.A04 = Collections.newSetFromMap(new WeakHashMap());
        this.A03 = new HashMap();
    }
}
