package X;

import android.content.Context;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.instagram.msys.InstagramDasmConfigCreator;
import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.dasm.DasmSupportHelper;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AccountSessionBootstrapper;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.simplejni.NativeHolder;
import com.instagram.common.session.UserSession;
import com.mcftypeholder.McfTypeHolder;
import com.messagingclient.service.mciaccountsessionbootstrapper.MCIAccountSessionBootstrapperMCFBridgejniDispatcher;
import com.msys.mcf.mcfMCFBridgejniDispatcher;
import com.msys.msysInfraMCFBridgejniDispatcher;
import com.msys.msysInfraMnsMCFBridgejniDispatcher;
import com.msys.msysInfraNoSqliteMCFBridgejniDispatcher;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.61A, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C61A {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x005b, code lost:
    
        if (((java.lang.Boolean) r9.A0h.get()).booleanValue() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C61B A00(X.C47142Eg r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.2Ei r0 = r9.A0k
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            X.2Ei r0 = r9.A0l
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            X.2Ei r0 = r9.A16
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            X.2Ei r0 = r9.A0e
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.2Ei r0 = r9.A0f
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.2Ei r0 = r9.A0g
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5d
            X.2Ei r0 = r9.A0h
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L5e
        L5d:
            r0 = 1
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r4 = r0.booleanValue()
            X.2Ei r0 = r9.A0i
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            X.61B r1 = new X.61B
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61A.A00(X.2Eg):X.61B");
    }

    public static final AccountSession A02(UserSession userSession, boolean z) {
        Object A01;
        int i;
        C14360o3.A0B(userSession, 0);
        boolean A04 = AbstractC453326q.A04(userSession);
        C41871wb A00 = AbstractC41851wZ.A00(userSession);
        if (A04) {
            i = 7;
        } else if (z) {
            i = 8;
        } else {
            C18C.A0I(!A00.A05(AccountSession.class), "Foreground AccountSession already exists for the same user id", new Object[0]);
            A01 = userSession.A01(AccountSession.class, new C9E3(userSession, 9));
            return (AccountSession) A01;
        }
        A01 = A00.A01(AccountSession.class, new C9E3(userSession, i));
        return (AccountSession) A01;
    }

    public static final AccountSession A01(UserSession userSession, int i) {
        String absolutePath;
        McfTypeHolder mcfTypeHolder;
        McfTypeHolder mcfTypeHolder2;
        C6EU c6eu;
        C6EU c6eu2;
        C6EU c6eu3;
        C6EW c6ew;
        C61B A00 = A00(AbstractC47132Ef.A00(userSession));
        DasmSupportHelper.initialize(AbstractC12290kX.A00);
        C61E.A00(userSession.deviceSession);
        PlatformStorageProvider.initialize(AbstractC12290kX.A00);
        NotificationCenter A002 = C136066Dl.A00();
        C1334860s c1334860s = (C1334860s) userSession.A01(C1334860s.class, new MHH(userSession, 29));
        NetworkSession A003 = MsysInfraNoSqliteObjectHolder.A00();
        if (A003 == null) {
            A003 = C61G.A00(c1334860s, A002);
        }
        C136096Dr A004 = AbstractC136086Dq.A00(userSession);
        AuthData A005 = AnonymousClass618.A00(userSession);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        String facebookUserID = AnonymousClass618.A00(userSession).getFacebookUserID();
        if (facebookUserID == null) {
            facebookUserID = "";
        }
        File databasePath = context.getDatabasePath(AnonymousClass001.A0R("ig_msys_database_", facebookUserID));
        File parentFile = databasePath.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        try {
            absolutePath = databasePath.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = databasePath.getAbsolutePath();
        }
        C14360o3.A07(absolutePath);
        Database.SchemaDeployer schemaDeployer = (Database.SchemaDeployer) AbstractC136106Ds.A04.getValue();
        Database.SchemaDeployer schemaDeployer2 = (Database.SchemaDeployer) AbstractC136106Ds.A02.getValue();
        Database.SchemaDeployer schemaDeployer3 = (Database.SchemaDeployer) AbstractC136106Ds.A03.getValue();
        Database.SchemaDeployer schemaDeployer4 = (Database.SchemaDeployer) AbstractC136106Ds.A01.getValue();
        Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator = (Database.VirtualTableModuleRegistrator) AbstractC136106Ds.A05.getValue();
        InstagramDasmConfigCreator instagramDasmConfigCreator = InstagramDasmConfigCreator.getInstance();
        boolean A006 = C6E9.A00(userSession, AbstractC20100yh.A00(36325892793644530L), true);
        boolean z = A00.A05;
        boolean z2 = A00.A06;
        boolean z3 = A00.A07;
        boolean z4 = A00.A01;
        boolean z5 = A00.A02;
        boolean z6 = A00.A03;
        boolean z7 = A00.A04;
        C6EA c6ea = new C6EA(A004);
        AccountSessionBootstrapper accountSessionBootstrapper = AccountSessionBootstrapper.$redex_init_class;
        NativeHolder MCIAccountIdentifierCreateWithAuthDataNative = msysInfraMnsMCFBridgejniDispatcher.MCIAccountIdentifierCreateWithAuthDataNative(A005);
        if (MCIAccountIdentifierCreateWithAuthDataNative == null) {
            mcfTypeHolder = null;
        } else {
            mcfTypeHolder = new McfTypeHolder(-12399581, MCIAccountIdentifierCreateWithAuthDataNative);
        }
        mcfTypeHolder.getClass();
        NativeHolder MCFURLCreateWithFileSystemPathNative = mcfMCFBridgejniDispatcher.MCFURLCreateWithFileSystemPathNative(absolutePath, false);
        if (MCFURLCreateWithFileSystemPathNative == null) {
            mcfTypeHolder2 = null;
        } else {
            mcfTypeHolder2 = new McfTypeHolder(956958879, MCFURLCreateWithFileSystemPathNative);
        }
        mcfTypeHolder2.getClass();
        C6EU c6eu4 = new C6EU(schemaDeployer);
        if (schemaDeployer2 != null) {
            c6eu = new C6EU(schemaDeployer2);
        } else {
            c6eu = null;
        }
        if (schemaDeployer3 != null) {
            c6eu2 = new C6EU(schemaDeployer3);
        } else {
            c6eu2 = null;
        }
        if (schemaDeployer4 != null) {
            c6eu3 = new C6EU(schemaDeployer4);
        } else {
            c6eu3 = null;
        }
        HashMap hashMap = new HashMap();
        if (virtualTableModuleRegistrator != null) {
            c6ew = new C6EW(virtualTableModuleRegistrator);
        } else {
            c6ew = null;
        }
        McfTypeHolder mcfTypeHolder3 = new McfTypeHolder(-748730796, msysInfraMCFBridgejniDispatcher.MCIDatabaseConfigCreateNative(mcfTypeHolder2.mNativeHolder, c6eu4, c6eu, c6eu2, c6eu3, null, null, null, null, hashMap, null, c6ew));
        msysInfraMCFBridgejniDispatcher.MCIDatabaseConfigSetEnableEarlyAuxDBOpenNative(mcfTypeHolder3.mNativeHolder, true);
        msysInfraMCFBridgejniDispatcher.MCIDatabaseConfigSetEarlyInjectAuxDBConnectionsNative(mcfTypeHolder3.mNativeHolder, A006);
        AccountSession MCIAccountSessionCreateAndBootstrapNative = MCIAccountSessionBootstrapperMCFBridgejniDispatcher.MCIAccountSessionCreateAndBootstrapNative(mcfTypeHolder.mNativeHolder, i, A005, mcfTypeHolder3.mNativeHolder, new McfTypeHolder(-1487933518, msysInfraNoSqliteMCFBridgejniDispatcher.MCIAuxiliaryDatabasesConfigCreateWithValuesNative(c6ea, true, false, z, z2, z3, 500, true, 500, z4, z5, 500, z6, z7, 0)).mNativeHolder, A002, instagramDasmConfigCreator.createDasmConfig().mNativeHolder, "8151237778318355", A003, null);
        C14360o3.A07(MCIAccountSessionCreateAndBootstrapNative);
        C6Ee c6Ee = (C6Ee) userSession.A01(C6Ee.class, C6Ef.A00);
        SessionedNotificationCenter sessionedNotificationCenter = MCIAccountSessionCreateAndBootstrapNative.getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter);
        c6Ee.A00 = sessionedNotificationCenter;
        sessionedNotificationCenter.addObserver(c6Ee.A01, "MEMContextReadyNotification", 1, null);
        MCPPluginsRegistryIntegration.nativeRegisterAppAccountScope(MCIAccountSessionCreateAndBootstrapNative, userSession);
        return MCIAccountSessionCreateAndBootstrapNative;
    }
}
