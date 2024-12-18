package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.C4l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27330C4l extends AbstractC28375Cfd {
    public AnonymousClass195 A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public boolean A03;
    public final C28274CdJ A04;
    public final CWL A05;
    public final Integer A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC16660sJ A09;
    public final boolean A0A;

    public static C25806BbN A00(C27330C4l c27330C4l) {
        return (C25806BbN) c27330C4l.A08.getValue();
    }

    public C27330C4l(Context context, FoaUserSession foaUserSession, CWL cwl, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, foaUserSession);
        Integer num;
        this.A05 = cwl;
        this.A09 = interfaceC16660sJ;
        this.A07 = AbstractC09440dt.A00(EnumC09460dv.A02, C29896DGk.A00(foaUserSession, this, 40));
        if (cwl.A09) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        this.A06 = num;
        this.A0A = C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(foaUserSession), 36328800484605744L);
        this.A04 = AbstractC86593tX.A0B("IMPLEMENTATION").A00;
        this.A08 = AbstractC25225BEi.A0a(C29910DGy.A01(this, 30), C29896DGk.A00(foaUserSession, this, 41), C149636oG.A00, AbstractC25225BEi.A1D(C25806BbN.class));
    }
}
