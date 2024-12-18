package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P97 implements GZN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C22P A02;
    public final /* synthetic */ ACRType A03;
    public final /* synthetic */ AbstractC59962oe A04;
    public final /* synthetic */ C8JY A05;
    public final /* synthetic */ C41181vS A06;
    public final /* synthetic */ C145176gc A07;
    public final /* synthetic */ List A08;

    @Override // X.GZN
    public final void DlA(List list) {
        C14360o3.A0B(list, 0);
        AbstractC59962oe abstractC59962oe = this.A04;
        if (abstractC59962oe.mDetached) {
            UserSession userSession = this.A07.A09;
            if (userSession != null) {
                if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36325695223248146L)) {
                    AbstractC166987dD.A1T(C18950wb.A01, "crash_when_showing_crossposting_progress", 817890849);
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
        Context context = this.A01;
        C145176gc c145176gc = this.A07;
        UserSession userSession2 = c145176gc.A09;
        if (userSession2 != null) {
            C75H c75h = new C75H(context, userSession2);
            C6WQ A0i = AbstractC31174DnI.A0i(context);
            AbstractC31176DnK.A13(context, A0i);
            List list2 = this.A08;
            ArrayList A0q = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0q.add(c75h.A00(AbstractC31172DnG.A0i(it)));
            }
            C121275eQ A01 = c75h.A01(AbstractC001800i.A0a(A0q), list);
            A01.A00 = new NFW(context, A00, this.A02, this.A03, this.A05, this.A06, A0i, c145176gc, list2, this.A00);
            C1GJ.A00(context, A00, A01);
            return;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    public P97(Context context, C22P c22p, ACRType aCRType, AbstractC59962oe abstractC59962oe, C8JY c8jy, C41181vS c41181vS, C145176gc c145176gc, List list, int i) {
        this.A04 = abstractC59962oe;
        this.A07 = c145176gc;
        this.A01 = context;
        this.A08 = list;
        this.A05 = c8jy;
        this.A02 = c22p;
        this.A03 = aCRType;
        this.A06 = c41181vS;
        this.A00 = i;
    }

    @Override // X.GZN
    public final void onCancel() {
        throw C00O.createAndThrow();
    }
}
