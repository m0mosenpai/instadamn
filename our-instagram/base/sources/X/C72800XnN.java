package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.XnN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72800XnN {
    public final Context A00;
    public final YPY A01;
    public final C006802i A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.XQi] */
    public C72800XnN(Context context, UserSession userSession) {
        C23295AUg c23295AUg;
        C72150XQf c72150XQf;
        YPY ypy;
        C85R A00;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A03 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A04 = C18U.A06(c06090Tz, userSession, 36329062477611003L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36329062477742077L);
        this.A05 = A06;
        if (!this.A04 && !A06) {
            if (C18U.A06(c06090Tz, userSession, 36330565716165537L)) {
                C72152XQh c72152XQh = new C72152XQh(new C8ED(this.A03, AbstractC16960so.A1Q(C8E4.A0D.A00(), C8E4.A09.A00())));
                ((AbstractC72053XLu) c72152XQh).A00 = new C23295AUg(this, 0);
                ypy = c72152XQh;
            } else {
                UserSession userSession2 = this.A03;
                if (C18U.A06(c06090Tz, userSession2, 36322375213590737L)) {
                    A00 = null;
                } else {
                    A00 = C85R.A00(this.A00, userSession2);
                }
                List A1Q = AbstractC16960so.A1Q(VersionedCapability.Saliency, VersionedCapability.SegmentAnything);
                C16930sl c16930sl = C16930sl.A00;
                ypy = new C72151XQg(new C8EB(A00, userSession2, A1Q, AbstractC16960so.A1Q(new C8E5("Saliency", "PYTORCH_MODEL", c16930sl, 2020L), new C8E5("SegmentAnything", "PYTORCH_MODEL", c16930sl, 10020L))));
            }
        } else {
            UserSession userSession3 = this.A03;
            if (A06) {
                ?? c72153XQi = new C72153XQi(new C8ED(userSession3, AbstractC166987dD.A1J(new C8E5("UTwoNet", "PYTORCH_MODEL", C16930sl.A00, 1020L))));
                c23295AUg = new C23295AUg(this, 1);
                c72150XQf = c72153XQi;
            } else {
                C72150XQf c72150XQf2 = new C72150XQf(new C8ED(userSession3, AbstractC166987dD.A1J(C8E4.A0I.A00())));
                c23295AUg = new C23295AUg(this, 2);
                c72150XQf = c72150XQf2;
            }
            ((AbstractC72053XLu) c72150XQf).A00 = c23295AUg;
            ypy = c72150XQf;
        }
        this.A01 = ypy;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A02 = c006802i;
        ypy.Chb();
        ypy.Eag(new C72685XlC(this));
    }
}
