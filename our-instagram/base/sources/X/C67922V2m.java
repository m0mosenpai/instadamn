package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.V2m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67922V2m extends C2US implements InterfaceC65242xM {
    public C65956Tx8 A00;
    public final Context A01;
    public final V3D A02;
    public final V39 A03;
    public final V37 A04;
    public final V38 A05;
    public final V3E A06;
    public final U0K A07;
    public final C67929V2t A08;
    public final C31545DtV A09;

    public C67922V2m(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, U0K u0k, C67898V1g c67898V1g, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A01 = context;
        this.A07 = u0k;
        this.A00 = U24.A00();
        InterfaceC72020XFi interfaceC72020XFi = InterfaceC72020XFi.A01;
        V39 v39 = new V39(context, interfaceC11380iw, userSession, c67898V1g, interfaceC72020XFi);
        this.A03 = v39;
        V38 v38 = new V38(context, interfaceC11380iw, c67898V1g, interfaceC72020XFi);
        this.A05 = v38;
        V3E v3e = new V3E(context, interfaceC11380iw, userSession, c67898V1g, interfaceC72020XFi, null, null, false, false, false, A1V, A1V, A1V);
        this.A06 = v3e;
        V37 v37 = new V37(context, c67898V1g, interfaceC72020XFi, z4);
        this.A04 = v37;
        V3D v3d = new V3D(userSession, c67898V1g, new C71023Wme(this), interfaceC72020XFi, z, z2, z3);
        this.A02 = v3d;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A09 = c31545DtV;
        C67929V2t c67929V2t = new C67929V2t(c67898V1g);
        this.A08 = c67929V2t;
        init(v39, v38, v3e, v37, v3d, c31545DtV, c67929V2t);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00() {
        InterfaceC65642y0 interfaceC65642y0;
        clear();
        if (this.A00.A00.size() == 0) {
            Context context = this.A01;
            int i = 2131968598;
            if (this.A07 == U0K.A08) {
                i = 2131968557;
            }
            addModel(context.getString(i), this.A09);
        } else {
            int size = this.A00.A00.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = this.A00.A00.get(i2);
                Object obj2 = this.A00.A01.get(i2);
                if (C51760Mtj.A04(obj, 48)) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchTitleState");
                    interfaceC65642y0 = this.A08;
                } else if (obj instanceof C65741TtG) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A06;
                } else if (obj instanceof C68090V9z) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A03;
                } else if (obj instanceof HYX) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A05;
                } else if (obj instanceof C66130U0o) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A04;
                } else if (obj instanceof HYY) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A02;
                } else {
                    throw AbstractC31175DnJ.A0V(obj.getClass().getCanonicalName(), " not supported for edit search history");
                }
                addModel(obj, obj2, interfaceC65642y0);
            }
        }
        notifyDataSetChanged();
    }
}
