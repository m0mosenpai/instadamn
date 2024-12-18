package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OyK implements InterfaceC57936Pmg {
    public final /* synthetic */ C51051Mh5 A00;

    public OyK(C51051Mh5 c51051Mh5) {
        this.A00 = c51051Mh5;
    }

    @Override // X.InterfaceC57936Pmg
    public final void Cxw(String str) {
        if (str != null) {
            C51051Mh5 c51051Mh5 = this.A00;
            UserSession userSession = c51051Mh5.A07;
            C1C6 A00 = C1C6.A00();
            C14360o3.A07(A00);
            OJH ojh = new OJH(A00, userSession, "ig_stories");
            c51051Mh5.A00 = ojh;
            ojh.A00 = new OyL(c51051Mh5);
            C006802i.A0p.markerStart(18946359);
            OJH ojh2 = c51051Mh5.A00;
            if (ojh2 == null) {
                C14360o3.A0F("transcriptionFetcher");
                throw C00O.createAndThrow();
            }
            ojh2.A00(str);
            return;
        }
        this.A00.A06.A0A(C218419lD.A00);
    }
}
