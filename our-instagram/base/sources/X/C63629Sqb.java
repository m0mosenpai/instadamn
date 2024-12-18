package X;

import android.content.Context;

/* renamed from: X.Sqb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63629Sqb implements InterfaceC52932ba {
    public final Context A00;
    public final C63337Shp A01;
    public final C63337Shp A02;
    public final C62962SZf A03;
    public final C63174SeZ A04;
    public final C58443PvM A05;
    public final C62567SGs A06;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [X.2bZ, X.Q8Q] */
    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        if (cls.equals(Q8Z.class)) {
            C62962SZf c62962SZf = this.A03;
            return new Q8Z(new C58770Q8c(this.A00, this.A02, c62962SZf, this.A04, this.A05), c62962SZf);
        }
        if (cls.equals(C58771Q8d.class)) {
            return new C58771Q8d(this.A00, this.A03);
        }
        if (cls.equals(QGA.class)) {
            return new QGA(this.A02);
        }
        if (cls.equals(QG9.class)) {
            return new Q8S(this.A02);
        }
        if (cls.equals(Q8S.class)) {
            return new Q8S(this.A02);
        }
        if (cls.equals(Q8Q.class)) {
            C63337Shp c63337Shp = this.A01;
            C62567SGs c62567SGs = this.A06;
            C58443PvM c58443PvM = this.A05;
            ?? abstractC52922bZ = new AbstractC52922bZ();
            abstractC52922bZ.A01 = c58443PvM;
            abstractC52922bZ.A00 = c63337Shp;
            abstractC52922bZ.A02 = c62567SGs;
            return abstractC52922bZ;
        }
        if (cls.equals(Q8V.class)) {
            return new Q8V(this.A03);
        }
        if (cls.equals(C58773Q8f.class)) {
            return new C58773Q8f(this.A00, this.A03);
        }
        if (cls.equals(C58770Q8c.class)) {
            Context context = this.A00;
            C58443PvM c58443PvM2 = this.A05;
            return new C58770Q8c(context, this.A02, this.A03, this.A04, c58443PvM2);
        }
        throw AbstractC37303Gc4.A0M(cls, "Not aware about view model :", AbstractC166987dD.A1C());
    }

    public C63629Sqb(Context context, C63337Shp c63337Shp, C63337Shp c63337Shp2, C62962SZf c62962SZf, C63174SeZ c63174SeZ, C58443PvM c58443PvM, C62567SGs c62567SGs) {
        this.A00 = context;
        this.A03 = c62962SZf;
        this.A02 = c63337Shp;
        this.A01 = c63337Shp2;
        this.A06 = c62567SGs;
        this.A05 = c58443PvM;
        this.A04 = c63174SeZ;
    }
}
