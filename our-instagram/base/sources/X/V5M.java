package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V5M extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;
    public final C68812VcT A02;
    public final C68813VcU A03;

    public V5M(Activity activity, UserSession userSession, C68812VcT c68812VcT, C68813VcU c68813VcU) {
        AbstractC25233BEq.A0w(2, userSession, c68813VcU, c68812VcT);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = c68813VcU;
        this.A02 = c68812VcT;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C68038V7j c68038V7j = (C68038V7j) interfaceC66482zP;
        AbstractC167017dG.A1N(c68038V7j, c3oo);
        C68812VcT c68812VcT = this.A02;
        View view = c3oo.itemView;
        C14360o3.A06(view);
        C69359Vm5 c69359Vm5 = c68812VcT.A00.A0J;
        if (c69359Vm5 == null) {
            C14360o3.A0F("viewpointHelper");
            throw C00O.createAndThrow();
        }
        C59072n8 A00 = C59062n7.A00(c68038V7j, c69359Vm5.A05, AnonymousClass001.A0R("grid:", "map_tile_with_pins"));
        A00.A00(c69359Vm5.A04);
        c69359Vm5.A01.A05(view, A00.A01());
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.mediamap.binder.MediaLocationMapRowViewBinder.Holder");
        C68977VfF c68977VfF = (C68977VfF) tag;
        C132815z4 c132815z4 = c68038V7j.A00;
        UserSession userSession = this.A01;
        C68813VcU c68813VcU = this.A03;
        AbstractC25233BEq.A0v(0, c68977VfF, userSession, c68813VcU);
        c68977VfF.A01.A0F(new C70390WTs(userSession, c68977VfF, c132815z4, c68813VcU));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Activity activity = this.A00;
        C14360o3.A0B(activity, 1);
        double d = C66356UBx.A0p;
        W3L w3l = new W3L();
        w3l.A0A = false;
        w3l.A0E = false;
        w3l.A06 = "ig_media_location";
        if ("MediaLocationMapRowViewBinder.java".length() > 0) {
            w3l.A05 = "MediaLocationMapRowViewBinder.java";
        }
        w3l.A08 = C1H6.A03();
        C66356UBx c66356UBx = new C66356UBx(activity, w3l);
        c66356UBx.setTag(new C68977VfF(c66356UBx));
        return new C3OO(c66356UBx);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C68038V7j.class;
    }
}
