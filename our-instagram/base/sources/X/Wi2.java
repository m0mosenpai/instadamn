package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class Wi2 implements InterfaceC13380mO {
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final AbstractC018607g A04;
    public final UserSession A05;
    public final C69619VsM A07;
    public final ReelStore A08;
    public final java.util.Set A09 = Collections.newSetFromMap(new WeakHashMap());
    public C69305VlD A00 = null;
    public final C13400mQ A06 = new C13400mQ(AbstractC167007dF.A0J(), this, 1000);

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C69305VlD c69305VlD = (C69305VlD) obj;
        if (!this.A02) {
            if (this.A01) {
                this.A06.A01(c69305VlD);
                return;
            }
            C69305VlD c69305VlD2 = this.A00;
            if (c69305VlD2 != null && c69305VlD2.A00.A00(c69305VlD.A00) < 500.0d) {
                return;
            }
            Context context = this.A03;
            AbstractC018607g abstractC018607g = this.A04;
            UserSession userSession = this.A05;
            C67954V3t c67954V3t = new C67954V3t(7, this, c69305VlD);
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("map/map_region_geohub/");
            A0M.A0S(C67834Uz7.class, C69942VyI.class);
            AbstractC70135W6m.A02(A0M, c69305VlD);
            A0M.A0R = true;
            C1ON A0N = A0M.A0N();
            A0N.A00 = c67954V3t;
            C1GJ.A00(context, abstractC018607g, A0N);
        }
    }

    public Wi2(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C69619VsM c69619VsM) {
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = abstractC018607g;
        this.A07 = c69619VsM;
        this.A08 = C1OU.A04(userSession);
    }
}
