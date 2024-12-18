package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AccountSessionBootstrapper;
import com.facebook.simplejni.NativeHolder;
import com.instagram.common.session.UserSession;
import com.mcftypeholder.McfTypeHolder;
import com.messagingclient.service.mciaccountsessionbootstrapper.MCIAccountSessionBootstrapperMCFBridgejniDispatcher;
import com.msys.msysInfraNoSqliteMCFBridgejniDispatcher;

/* renamed from: X.99a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2057599a {
    public final String A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("isMainDBNeeded: ");
        sb.append(A00(userSession));
        sb.append("\nshouldInitializeMEMBeforeMailbox: ");
        sb.append(A02(userSession, false));
        sb.append("\nshouldUseMEMLoginForBackground: ");
        sb.append(A03(userSession, false));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean A02(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (C023409i.A0A.A09(userSession)) {
            if (A00(userSession)) {
                return false;
            }
            return C6E9.A00(userSession, AbstractC20100yh.A00(36325892792137186L), z);
        }
        return A03(userSession, z);
    }

    public static final boolean A00(UserSession userSession) {
        AccountSession A02 = C61A.A02(userSession, AbstractC94034Kn.A00(userSession));
        C61B A00 = C61A.A00(AbstractC47132Ef.A00(userSession));
        boolean z = A00.A05;
        boolean z2 = A00.A06;
        boolean z3 = A00.A07;
        boolean z4 = A00.A01;
        boolean z5 = A00.A02;
        boolean z6 = A00.A03;
        boolean z7 = A00.A04;
        AccountSessionBootstrapper accountSessionBootstrapper = AccountSessionBootstrapper.$redex_init_class;
        NativeHolder MCIAuxiliaryDatabasesConfigCreateWithValuesNative = msysInfraNoSqliteMCFBridgejniDispatcher.MCIAuxiliaryDatabasesConfigCreateWithValuesNative(null, true, false, z, z2, z3, 500, true, 500, z4, z5, 500, z6, z7, 0);
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        return MCIAccountSessionBootstrapperMCFBridgejniDispatcher.MCIAccountSessionBootstrapIsMainDBNeededNative(A02, MCIAuxiliaryDatabasesConfigCreateWithValuesNative);
    }

    public final boolean A03(UserSession userSession, boolean z) {
        if (A00(userSession)) {
            return false;
        }
        return C6E9.A00(userSession, AbstractC20100yh.A00(36325892792989164L), z);
    }
}
