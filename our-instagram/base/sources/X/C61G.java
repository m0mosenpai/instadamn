package X;

import android.content.Context;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mci.AppContainerDirectoryPath;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler;
import java.util.UUID;

/* renamed from: X.61G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61G {
    public static NetworkSession A00(C1334860s c1334860s, NotificationCenter notificationCenter) {
        NetworkSession A00;
        boolean z;
        synchronized (C61G.class) {
            A00 = MsysInfraNoSqliteObjectHolder.A00();
            if (A00 == null) {
                NetworkSession networkSession = NetworkSession.$redex_init_class;
                String str = (String) c1334860s.A07.get();
                str.getClass();
                Object obj = c1334860s.A06.get();
                obj.getClass();
                C1334960t c1334960t = (C1334960t) obj;
                c1334960t.getClass();
                A00 = new NetworkSession(str, notificationCenter, c1334960t);
                synchronized (MsysInfraNoSqliteObjectHolder.class) {
                    MsysInfraNoSqliteObjectHolder.A03.A02 = A00;
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            AbstractC136036Di.A00(c1334860s.A08).A0E();
        }
        return A00;
    }

    public static synchronized String A01(C1334860s c1334860s) {
        String obj;
        MsysInfraNoSqliteObjectHolder msysInfraNoSqliteObjectHolder;
        synchronized (C61G.class) {
            obj = UUID.randomUUID().toString();
            synchronized (MsysInfraNoSqliteObjectHolder.class) {
                msysInfraNoSqliteObjectHolder = MsysInfraNoSqliteObjectHolder.A03;
                msysInfraNoSqliteObjectHolder.A00.add(obj);
            }
            BreakpadFatalJavaExceptionDescriptionHandler.Companion companion = BreakpadFatalJavaExceptionDescriptionHandler.Companion;
            C61K.A00.run();
            A02(c1334860s);
            AppContainerDirectoryPath.setAppContainerDirectoryPath((String) c1334860s.A05.get());
            if (MsysInfraNoSqliteObjectHolder.A00() == null) {
                NotificationCenter A00 = C136066Dl.A00();
                AbstractC136036Di.A00(c1334860s.A08).A0F();
                A00(c1334860s, A00);
            }
            AppState appState = new AppState();
            appState.setRegularAppStateUpdate(false);
            appState.setDisableAppStatePersistence(false);
            synchronized (MsysInfraNoSqliteObjectHolder.class) {
                msysInfraNoSqliteObjectHolder.A01 = appState;
            }
        }
        return obj;
    }

    public static void A02(C1334860s c1334860s) {
        c1334860s.A0D.run();
        Context context = c1334860s.A01;
        QuickPerformanceLogger quickPerformanceLogger = c1334860s.A08;
        C61L.A00(context, c1334860s.A02, c1334860s.A04, c1334860s.A0A, c1334860s.A0B, c1334860s.A0C, c1334860s.A00);
        AbstractC136036Di.A00(quickPerformanceLogger).A04();
    }
}
