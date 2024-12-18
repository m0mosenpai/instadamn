package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class KEF extends C2US {
    public List A00;
    public final Context A01;
    public final KEU A02;
    public final C67927V2r A03;
    public final KEK A04;
    public final KEL A05;
    public final KEM A06;
    public final C67928V2s A07;
    public final KEN A08;
    public final KEO A09;
    public final UserSession A0A;

    public KEF(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A0A = userSession;
        this.A00 = AbstractC166987dD.A1E();
        KEM kem = new KEM(context);
        this.A06 = kem;
        KEU keu = new KEU(context, abstractC10360h2, userSession);
        this.A02 = keu;
        KEO keo = new KEO(context);
        this.A09 = keo;
        KEN ken = new KEN(context);
        this.A08 = ken;
        KEL kel = new KEL(context);
        this.A05 = kel;
        C67927V2r c67927V2r = new C67927V2r(context);
        this.A03 = c67927V2r;
        C67928V2s c67928V2s = new C67928V2s(context);
        this.A07 = c67928V2s;
        KEK kek = new KEK(context);
        this.A04 = kek;
        init(kem, keu, keo, ken, kel, c67927V2r, c67928V2s, kek);
    }

    public final void A00() {
        InterfaceC65642y0 interfaceC65642y0;
        for (Object obj : this.A00) {
            if (obj instanceof C47607L0s) {
                interfaceC65642y0 = this.A08;
            } else if (obj instanceof C47525Kys) {
                interfaceC65642y0 = this.A06;
            } else if (obj instanceof C47273Kuk) {
                interfaceC65642y0 = this.A09;
            } else if (obj instanceof C68237VIy) {
                interfaceC65642y0 = this.A05;
            } else if (obj instanceof C69342Vlo) {
                interfaceC65642y0 = this.A03;
            } else if (obj instanceof C69343Vlp) {
                interfaceC65642y0 = this.A07;
            } else if (obj instanceof L3D) {
                interfaceC65642y0 = this.A04;
            }
            addModel(obj, interfaceC65642y0);
        }
        notifyDataSetChanged();
    }
}
