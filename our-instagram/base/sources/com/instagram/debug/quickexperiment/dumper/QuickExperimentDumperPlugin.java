package com.instagram.debug.quickexperiment.dumper;

import X.AbstractC167017dG;
import X.AbstractC20080yf;
import X.AbstractC68225VIl;
import X.C17280tP;
import X.EnumC20090yg;
import X.InterfaceC13000lm;
import X.InterfaceC16820sZ;
import X.VIO;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class QuickExperimentDumperPlugin {
    public static final String CLEAR_CMD = "clear";
    public static final String IMPORT_USER_CMD = "import_user";
    public static final String NAME = "qe";
    public static final String OVERRIDE_CMD = "override";
    public static UserSessionListener sLastListener;

    /* renamed from: com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass1 extends AbstractC20080yf {
        public AnonymousClass1(String str, String str2, EnumC20090yg enumC20090yg, long j) {
            super(str, str2, enumC20090yg, j);
        }
    }

    /* loaded from: classes11.dex */
    public class UserSessionListener implements InterfaceC13000lm {
        public final UserSession mUserSession;

        public static UserSessionListener getInstance(final UserSession userSession) {
            return (UserSessionListener) userSession.A01(UserSessionListener.class, new InterfaceC16820sZ() { // from class: com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin$UserSessionListener$$ExternalSyntheticLambda0
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return new QuickExperimentDumperPlugin.UserSessionListener(UserSession.this);
                }
            });
        }

        public static /* synthetic */ UserSessionListener lambda$getInstance$0(UserSession userSession) {
            return new UserSessionListener(userSession);
        }

        public UserSessionListener(UserSession userSession) {
            this.mUserSession = userSession;
        }

        public static void onUserSessionStart(UserSession userSession, Context context, boolean z) {
            C17280tP A00 = C17280tP.A00();
            if (AbstractC167017dG.A1b(A00, A00.A1q, C17280tP.A4G, 119)) {
                QuickExperimentDumperPlugin.sLastListener = getInstance(userSession);
            }
        }

        @Override // X.InterfaceC13000lm
        public void onSessionWillEnd() {
            QuickExperimentDumperPlugin.clear();
            QuickExperimentDumperPlugin.sLastListener = null;
        }
    }

    public String getName() {
        return NAME;
    }

    private void usage(PrintStream printStream) {
        printStream.print(IMPORT_USER_CMD);
        printStream.println(" <userId>");
        printStream.println();
        printStream.print(OVERRIDE_CMD);
        printStream.println(" <config> <param> <value>");
        printStream.println("       Note: only works if no user spoofing");
        printStream.println();
        printStream.println(CLEAR_CMD);
    }

    public void dump(VIO vio) {
        throw new NullPointerException("getStdout");
    }

    public static void clear() {
        C17280tP A00 = C17280tP.A00();
        AbstractC68225VIl.A01 = null;
        A00.A0D(null);
    }
}
