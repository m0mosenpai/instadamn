package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.PvZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58451PvZ {
    public final Context A00;
    public final C40681ub A01;
    public final InterfaceC40711ue A02;

    public final void A00(String str, boolean z) {
        UserSession userSession = this.A01.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321292882093354L)) {
            long A06 = AbstractC31177DnL.A06();
            if (!z && ((int) A06) - this.A00.getSharedPreferences("token_ack_prefs", 0).getInt(str, 0) < AbstractC25225BEi.A07(c06090Tz, userSession, 36602767858864965L)) {
                return;
            }
            try {
                C64063SyZ c64063SyZ = (C64063SyZ) AbstractC50523MSb.A0R("create", C62777SQu.class);
                C2JM c2jm = c64063SyZ.A00;
                c2jm.A04("token_fbid", str);
                c64063SyZ.A02 = true;
                Integer valueOf = Integer.valueOf((int) A06);
                c2jm.A03("timestamp", valueOf);
                c64063SyZ.A01 = AbstractC167007dF.A1W(valueOf);
                PandoGraphQLRequest A00 = c64063SyZ.A00();
                this.A02.ATV(new C64006Sxd(this, 0), new WW6(this, str, 0, A06), A00);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw AbstractC58318PtA.A0f(e);
            }
        }
    }

    public C58451PvZ(Context context, InterfaceC40711ue interfaceC40711ue, C40681ub c40681ub) {
        this.A02 = interfaceC40711ue;
        this.A00 = context;
        this.A01 = c40681ub;
    }
}
