package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.AEc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23046AEc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    public static final int A00(EnumC185018Iq enumC185018Iq) {
        C14360o3.A0B(enumC185018Iq, 0);
        String str = enumC185018Iq.A00;
        if (str != null) {
            switch (str.hashCode()) {
                case -899450013:
                    if (str.equals("slowmo")) {
                        return 2131953985;
                    }
                    break;
                case 99838:
                    if (str.equals("duo")) {
                        return 2131953980;
                    }
                    break;
                case 3107365:
                    if (str.equals("echo")) {
                        return 2131953982;
                    }
                    break;
                case 3208383:
                    if (str.equals("hold")) {
                        return 2131953983;
                    }
                    break;
                case 3387192:
                    if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                        return 2131953984;
                    }
                    break;
                case 853620882:
                    if (str.equals("classic")) {
                        return 2131953979;
                    }
                    break;
                case 1081676587:
                    if (str.equals("rebound")) {
                        return 2131953981;
                    }
                    break;
            }
        }
        throw AbstractC166987dD.A12("Unsupported boomerang mode id.");
    }

    public static final ArrayList A01(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (C18U.A06(C06090Tz.A05, userSession, 36320571327586992L)) {
            A1E.add(EnumC185018Iq.A07);
        }
        A1E.addAll(AbstractC16960so.A1Q(EnumC185018Iq.A08, EnumC185018Iq.A09, EnumC185018Iq.A03));
        if (C6PX.A00(context)) {
            A1E.add(EnumC185018Iq.A05);
        }
        return A1E;
    }
}
