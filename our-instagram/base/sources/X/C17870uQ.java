package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.0uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17870uQ implements InterfaceC13000lm {
    public boolean A00;
    public final InterfaceC12870lZ A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC12870lZ interfaceC12870lZ = this.A01;
        if (this.A00 && interfaceC12870lZ != null) {
            C218914p.A06(interfaceC12870lZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0di, java.lang.Object] */
    public C17870uQ(Context context, UserSession userSession) {
        long j;
        C06090Tz c06090Tz;
        long j2;
        if (AbstractC14490oL.A09(context)) {
            j = 36320738830984040L;
        } else {
            j = 36312578393113790L;
        }
        C17880uR c17880uR = null;
        if (C20150ym.A07(AbstractC20100yh.A00(j))) {
            if (ClassTracingLogger.A00) {
                this.A00 = true;
                if (C0K7.A02(context)) {
                    File A01 = C0K7.A01(context);
                    if (A01.exists()) {
                        File A00 = C0K7.A00(context);
                        File[] listFiles = A01.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.equals(A00)) {
                                    AbstractC03440Gx.A02(file);
                                }
                            }
                        }
                    }
                }
                c17880uR = new C17880uR(context, new C12210kP(AbstractC12960li.A00).A00(), userSession, this);
            }
            this.A01 = c17880uR;
            int i = 1;
            if (!AbstractC14490oL.A09(context)) {
                if (C1C0.A00(userSession)) {
                    c06090Tz = C06090Tz.A05;
                    j2 = 36594053370021443L;
                } else if (!((Boolean) EnumC12920le.A04.getValue()).booleanValue() && !((Boolean) EnumC12920le.A05.getValue()).booleanValue()) {
                    c06090Tz = C06090Tz.A05;
                    j2 = 36594053369890369L;
                } else {
                    c06090Tz = C06090Tz.A05;
                    j2 = 36594053369955906L;
                }
                int intValue = Long.valueOf(C18U.A01(c06090Tz, userSession, j2)).intValue();
                if (intValue <= 0 || new Random().nextInt(intValue) != 0) {
                    i = 0;
                }
            }
            try {
                HashSet hashSet = new HashSet();
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            hashSet.add(((ComponentInfo) serviceInfo).processName);
                        }
                    }
                } else {
                    C0K8.A02(ClassTracingLogger.class, "getPackageManager failed. Not logging.");
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String A0R = AnonymousClass001.A0R("classtracinglogger_enable_", (String) it.next());
                    ?? obj = new Object();
                    obj.A00 = context;
                    AbstractC05790Sg.A03(obj, A0R, i);
                }
            } catch (PackageManager.NameNotFoundException e) {
                C0K8.A05(ClassTracingLogger.class, "Package manager failed. Not logging.", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    C0K8.A05(ClassTracingLogger.class, "DeadObjectException while attempting to update enabled state.", e2);
                } else {
                    throw e2;
                }
            }
            ?? obj2 = new Object();
            obj2.A00 = context;
            AbstractC05790Sg.A03(obj2, "mdcd_multiprocess_enable", i);
            for (String str : AbstractC12950lh.A00(context)) {
                String A0R2 = AnonymousClass001.A0R("nativemetrics_", str);
                ?? obj3 = new Object();
                obj3.A00 = context;
                AbstractC05790Sg.A03(obj3, A0R2, i);
            }
        }
    }

    public static void A00(Context context, C18920wW c18920wW) {
        HashSet A01 = AbstractC62767SQe.A01(context, AbstractC12950lh.A00(context));
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_native_libraries_usage"), 298);
        c25531Mh.A0S("loaded_libraries", new ArrayList(A01));
        c25531Mh.A0R("release_channel", EnumC12920le.A00().name().toLowerCase(Locale.US));
        c25531Mh.Cht();
    }
}
