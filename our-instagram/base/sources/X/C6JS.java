package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabase$SchemaDeployerCallback;
import com.instagram.common.session.UserSession;
import com.messaging.standalonedatabase.StandaloneDatabaseUtilMCFBridgejniDispatcher;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6JS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JS implements InterfaceC13050lr {
    public static final C6JT A05 = new Object();
    public StandaloneDatabaseHandle A00;
    public C135646Bq A01;
    public boolean A02;
    public final UserSession A03;
    public final AuthData A04;

    public C6JS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = AnonymousClass618.A00(userSession);
    }

    public static final void A00(final C6JU c6ju, final C6JS c6js) {
        if (!c6js.A02) {
            c6js.A02 = true;
            C42221xC A09 = C42221xC.A09(C61A.A02(c6js.A03, true));
            final C41761wQ c41761wQ = new C41761wQ(null);
            c41761wQ.A02(A09, new InterfaceC42241xE() { // from class: X.6Bp
                /* JADX WARN: Type inference failed for: r6v0, types: [X.6Bq, com.facebook.msys.mca.MailboxFeature] */
                @Override // X.InterfaceC42241xE
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    String absolutePath;
                    AbstractC1345065z abstractC1345065z = C135646Bq.A00;
                    ?? mailboxFeature = new MailboxFeature(new C135656Br((AccountSession) obj));
                    final C6JS c6js2 = c6js;
                    Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
                    C14360o3.A07(applicationContext);
                    File databasePath = applicationContext.getDatabasePath("igd_wellbeing_database");
                    C14360o3.A07(databasePath);
                    File parentFile = databasePath.getParentFile();
                    parentFile.getClass();
                    parentFile.mkdirs();
                    try {
                        absolutePath = databasePath.getCanonicalPath();
                    } catch (IOException unused) {
                        absolutePath = databasePath.getAbsolutePath();
                    }
                    String A0R = AnonymousClass001.A0R("file://", absolutePath);
                    MailboxStandaloneDatabase$SchemaDeployerCallback mailboxStandaloneDatabase$SchemaDeployerCallback = new MailboxStandaloneDatabase$SchemaDeployerCallback() { // from class: X.6Bt
                    };
                    InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                    if (!ASj.ELJ(new C135686Bv(mailboxFutureImpl, mailboxStandaloneDatabase$SchemaDeployerCallback, mailboxFeature, A0R))) {
                        mailboxFutureImpl.cancel(false);
                    }
                    final C6JU c6ju2 = c6ju;
                    mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.6Bx
                        @Override // com.facebook.msys.mca.MailboxCallback
                        public final /* bridge */ /* synthetic */ void onCompletion(Object obj2) {
                            MailboxNullable mailboxNullable = (MailboxNullable) obj2;
                            C14360o3.A0B(mailboxNullable, 0);
                            C6JS c6js3 = c6js2;
                            StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) mailboxNullable.value;
                            c6js3.A00 = standaloneDatabaseHandle;
                            if (standaloneDatabaseHandle == null) {
                                c6js3.A02 = false;
                            }
                            C6JU c6ju3 = c6ju2;
                            if (c6ju3 != null) {
                                C2DG c2dg = c6ju3.A00;
                                if (!c6ju3.A01) {
                                    C2DG.A03(c2dg);
                                }
                                UserSession userSession = c2dg.A09;
                                C14360o3.A0B(userSession, 0);
                                if (C18U.A06(C06090Tz.A05, userSession, 36322791825353276L)) {
                                    userSession.A01(C128765rk.class, new MHJ(userSession, 12));
                                }
                            }
                        }
                    });
                    c6js2.A01 = mailboxFeature;
                    c41761wQ.A00.dispose();
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.91P] */
    public final C91P A01() {
        final StandaloneDatabaseHandle standaloneDatabaseHandle = this.A00;
        if (standaloneDatabaseHandle != null) {
            return new InterfaceC135846Cm(standaloneDatabaseHandle) { // from class: X.91P
                public final InterfaceExecutorC135866Co A00;

                @Override // X.InterfaceC135846Cm
                public final InterfaceExecutorC135866Co ASj(int i) {
                    if (i == 3) {
                        return this.A00;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0c(AbstractC111324zv.A00(3669), " is not supported by StandaloneDatabaseMailboxApiHandleMetaProvider.", i));
                }

                {
                    this.A00 = new C91Q(standaloneDatabaseHandle, this);
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        String absolutePath;
        C135646Bq c135646Bq;
        if (z) {
            StandaloneDatabaseHandle standaloneDatabaseHandle = this.A00;
            if (standaloneDatabaseHandle != null && (c135646Bq = this.A01) != null) {
                InterfaceExecutorC135866Co ASj = c135646Bq.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                if (!ASj.ELJ(new LU9(mailboxFutureImpl, standaloneDatabaseHandle, c135646Bq))) {
                    mailboxFutureImpl.cancel(false);
                }
            }
            AuthData authData = this.A04;
            if (authData.getFacebookUserID() != null) {
                String facebookUserID = authData.getFacebookUserID();
                if (facebookUserID != null) {
                    long parseLong = Long.parseLong(facebookUserID);
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    File databasePath = context.getDatabasePath("igd_wellbeing_database");
                    C14360o3.A07(databasePath);
                    File parentFile = databasePath.getParentFile();
                    parentFile.getClass();
                    parentFile.mkdirs();
                    try {
                        absolutePath = databasePath.getCanonicalPath();
                    } catch (IOException unused) {
                        absolutePath = databasePath.getAbsolutePath();
                    }
                    StandaloneDatabaseUtilMCFBridgejniDispatcher.StandaloneDatabaseUtilDeleteDatabaseNative(parseLong, "IGDWellbeingDatabase", AnonymousClass001.A0R("file://", absolutePath));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            this.A02 = false;
        }
    }
}
