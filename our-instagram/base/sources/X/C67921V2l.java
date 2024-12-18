package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.V2l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67921V2l extends C2US implements InterfaceC65242xM {
    public C65956Tx8 A00;
    public final Context A01;
    public final UserSession A02;
    public final V39 A03;
    public final V30 A04;
    public final V38 A05;
    public final C31544DtU A06;
    public final C31545DtV A07;

    public C67921V2l(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68032V7a c68032V7a) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = U24.A00();
        InterfaceC72020XFi interfaceC72020XFi = InterfaceC72020XFi.A01;
        V39 v39 = new V39(context, interfaceC11380iw, userSession, c68032V7a, interfaceC72020XFi);
        this.A03 = v39;
        V38 v38 = new V38(context, interfaceC11380iw, c68032V7a, interfaceC72020XFi);
        this.A05 = v38;
        V30 v30 = new V30(context, c68032V7a, interfaceC72020XFi);
        this.A04 = v30;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A07 = c31545DtV;
        C31544DtU c31544DtU = new C31544DtU(context);
        this.A06 = c31544DtU;
        init(v39, v38, v30, c31545DtV, c31544DtU);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void A00() {
        InterfaceC65642y0 interfaceC65642y0;
        clear();
        if (this.A00.A00.size() == 0) {
            addModel(this.A01.getString(2131968598), this.A07);
        } else {
            int size = this.A00.A00.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.A00.A00.get(i);
                Object obj2 = this.A00.A01.get(i);
                if (obj instanceof C68090V9z) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A03;
                } else if (obj instanceof HYX) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A05;
                } else if (obj instanceof NUN) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
                    interfaceC65642y0 = this.A04;
                } else {
                    throw AbstractC31175DnJ.A0V(obj.getClass().getCanonicalName(), " not supported for edit search history");
                }
                addModel(obj, obj2, interfaceC65642y0);
            }
        }
        notifyDataSetChanged();
    }
}
