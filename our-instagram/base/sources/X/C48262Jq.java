package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.2Jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48262Jq extends C1RW {
    public long A00;
    public Context A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C0JO A08;
    public final C09970fz A09;
    public final C10040gH A0A;
    public final C2Ju A0B;
    public final Map A0C;
    public final Executor A0D;
    public final C48242Jn A0E;
    public final C19490xZ A0F;
    public final Queue A0G;

    public static synchronized void A01(C48262Jq c48262Jq) {
        synchronized (c48262Jq) {
            Queue queue = c48262Jq.A0G;
            queue.isEmpty();
            if (!c48262Jq.A04 && !queue.isEmpty() && !c48262Jq.A02) {
                C58623Pyr c58623Pyr = (C58623Pyr) queue.remove();
                A00(new ArrayList(c58623Pyr.A01.A02));
                c48262Jq.A04 = true;
                if (!c48262Jq.A03) {
                    try {
                        c48262Jq.A0B.EDP(new C58638PzB(c48262Jq));
                        c48262Jq.A03 = true;
                    } catch (SecurityException e) {
                        C0K8.A0G("GooglePlayDownloader", "unable to register listener", e);
                    }
                }
                if (!c48262Jq.A06) {
                    c48262Jq.A06 = true;
                    for (String str : c48262Jq.A0B.BIV()) {
                        if (AbstractC09930fu.A00(str) < 0) {
                            C0K8.A0E("GooglePlayDownloader", AnonymousClass001.A0R("Unknown module name received from Google sessionState: ", str));
                        }
                        C0g3.A00().A05(str, C05F.A0C);
                    }
                }
                if (!c48262Jq.A07 && !c48262Jq.A05) {
                    c48262Jq.A02 = true;
                    c48262Jq.A05 = true;
                    c48262Jq.A0D.execute(new RunnableC58639PzC(c48262Jq));
                }
                c48262Jq.A0D.execute(new RunnableC58632Pz0(c58623Pyr, c48262Jq));
            }
        }
    }

    public static synchronized void A02(C48262Jq c48262Jq, AbstractC62642SJz abstractC62642SJz, boolean z) {
        int i;
        C58623Pyr c58623Pyr;
        Object[] objArr;
        String str;
        IOException iOException;
        C58427Pv6 c58427Pv6;
        C62674SLm c62674SLm;
        C58427Pv6 c58427Pv62;
        Exception exc;
        Integer num;
        synchronized (c48262Jq) {
            RP1 rp1 = (RP1) abstractC62642SJz;
            int i2 = rp1.A00;
            if (i2 != -1 && (i = rp1.A02) != -9) {
                if (z) {
                    int i3 = rp1.A01;
                    if (i3 != 2) {
                        if (i3 != 5) {
                            if (i3 == 6 || i3 == 7) {
                                num = C05F.A0N;
                            }
                        } else {
                            num = C05F.A0C;
                        }
                    } else {
                        num = C05F.A0Y;
                    }
                    Iterator it = abstractC62642SJz.A01().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (AbstractC09930fu.A00(str2) < 0) {
                            C0K8.A0E("GooglePlayDownloader", AnonymousClass001.A0R("Unknown module name received from Google sessionState: ", str2));
                        }
                        C0g3.A00().A05(str2, num);
                    }
                }
                Map map = c48262Jq.A0C;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    c58623Pyr = (C58623Pyr) map.get(valueOf);
                } else {
                    c58623Pyr = new C58623Pyr(new C58427Pv6(), new C58621Pyp(C05F.A0Y, new HashSet(abstractC62642SJz.A01())));
                    map.put(valueOf, c58623Pyr);
                }
                int i4 = rp1.A01;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 5) {
                            if (i4 != 6 && i4 != 7) {
                                if (i4 == 8) {
                                    PendingIntent pendingIntent = rp1.A05;
                                    if (pendingIntent == null) {
                                        c58427Pv62 = c58623Pyr.A00;
                                        exc = new Exception("resolution intent is null");
                                    } else if (!"com.android.vending".equals(pendingIntent.getTargetPackage())) {
                                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("targetPackage was %s", pendingIntent.getTargetPackage());
                                        c58427Pv62 = c58623Pyr.A00;
                                        exc = new Exception(formatStrLocaleSafe);
                                    } else if (c58623Pyr.A01.A01 != C05F.A00) {
                                        c48262Jq.A0B.AGW(i2);
                                    } else {
                                        try {
                                            c48262Jq.A01.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                                        } catch (IntentSender.SendIntentException e) {
                                            if (e.getMessage() != null && !e.getMessage().isEmpty()) {
                                                e.getMessage();
                                            }
                                            c58623Pyr.A00.A00(e);
                                        }
                                    }
                                    c58427Pv62.A00(exc);
                                    map.remove(valueOf);
                                }
                            } else {
                                c58427Pv6 = c58623Pyr.A00;
                                final String obj = abstractC62642SJz.toString();
                                c62674SLm = new C62674SLm(new Exception(obj) { // from class: X.9tv
                                }, Integer.valueOf(i), 2);
                                c58427Pv6.A01(c62674SLm);
                                map.remove(valueOf);
                            }
                        } else {
                            try {
                                String.format("Modules installed: %s. There should be a new context!", A00(abstractC62642SJz.A01()));
                                Context context = c48262Jq.A01;
                                Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                                C19490xZ c19490xZ = c48262Jq.A0F;
                                if (!c19490xZ.A00.getApplicationInfo().sourceDir.equals(createPackageContext.getApplicationInfo().sourceDir)) {
                                    c19490xZ.A00 = createPackageContext;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = abstractC62642SJz.A01().iterator();
                                while (it2.hasNext()) {
                                    String str3 = (String) it2.next();
                                    if (!AbstractC10000gD.A01(c48262Jq.A01, str3)) {
                                        arrayList.add(str3);
                                    }
                                }
                                C0K8.A0N("GooglePlayDownloader", "Unable to refresh context - splits should exist for  %s but not found", e2, arrayList.toString());
                            }
                            try {
                                List list = rp1.A08;
                                if (list != null) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        String stringExtra = ((Intent) it3.next()).getStringExtra("module_name");
                                        String A02 = C0g3.A00().A02(stringExtra);
                                        if (A02 != null) {
                                            if (AbstractC10000gD.A01(c48262Jq.A01, stringExtra)) {
                                                c48262Jq.A09.A03(stringExtra, A02).delete();
                                            } else {
                                                C0K8.A0E("GooglePlayDownloader", "Attempted to delete download file, but split APK does not exist");
                                            }
                                        } else {
                                            throw new IOException(AnonymousClass001.A0R("No hash found for ", stringExtra));
                                        }
                                    }
                                }
                            } catch (IOException e3) {
                                C0K8.A0K("GooglePlayDownloader", "Exception cleaning up module", e3);
                            }
                            c58427Pv6 = c58623Pyr.A00;
                            c62674SLm = new C62674SLm(null, null, 1);
                            c58427Pv6.A01(c62674SLm);
                            map.remove(valueOf);
                        }
                    } else {
                        try {
                            String.format("Modules: %s downloaded", A00(abstractC62642SJz.A01()));
                            List<Intent> list2 = rp1.A08;
                            if (list2 != null && !list2.isEmpty()) {
                                Throwable e4 = null;
                                ArrayList arrayList2 = new ArrayList();
                                C0g3 A00 = C0g3.A00();
                                Context context2 = c48262Jq.A01;
                                A00.A06(context2);
                                for (Intent intent : list2) {
                                    String stringExtra2 = intent.getStringExtra("module_name");
                                    String stringExtra3 = intent.getStringExtra("split_id");
                                    if (stringExtra2 == null) {
                                        objArr = new Object[]{stringExtra3};
                                        str = "Ignoring split with ID %s due to null moduleName";
                                    } else if (!"heliumiab".equals(stringExtra2) && !"heliumfulldownload".equals(stringExtra2)) {
                                        if (intent.hasExtra("split_id") && !stringExtra2.equals(stringExtra3)) {
                                            objArr = new Object[]{stringExtra3};
                                            str = "ignoring split with ID %s";
                                        } else {
                                            String A022 = C0g3.A00().A02(stringExtra2);
                                            if (A022 != null) {
                                                if (!c48262Jq.A09.A03(stringExtra2, A022).exists() && !AbstractC10000gD.A01(context2, stringExtra2)) {
                                                    try {
                                                        android.net.Uri data = intent.getData();
                                                        if (data == null) {
                                                            e4 = new IOException("null uri to extract downloaded file");
                                                        } else {
                                                            C10040gH c10040gH = c48262Jq.A0A;
                                                            synchronized (c10040gH) {
                                                                C0g3 c0g3 = c10040gH.A02;
                                                                if (c0g3.A06(c10040gH.A00)) {
                                                                    int A002 = AbstractC09930fu.A00(stringExtra2);
                                                                    if (A002 >= 0) {
                                                                        String A023 = c0g3.A02(stringExtra2);
                                                                        A023.getClass();
                                                                        File A03 = c10040gH.A01.A03(stringExtra2, A023);
                                                                        c10040gH.A03.AU5(data, A03, stringExtra2);
                                                                        Boolean[] boolArr = c10040gH.A04;
                                                                        boolean z2 = false;
                                                                        if (A03.exists()) {
                                                                            z2 = true;
                                                                        }
                                                                        boolArr[A002] = Boolean.valueOf(z2);
                                                                    } else {
                                                                        C0K8.A0Q("VoltronModuleCache", "Checking cache for %s but module does not exist", stringExtra2);
                                                                        iOException = new IOException("invalid module found");
                                                                    }
                                                                } else {
                                                                    iOException = new IOException("Unable to load module metadata");
                                                                }
                                                                throw iOException;
                                                                break;
                                                            }
                                                        }
                                                    } catch (IOException | SecurityException e5) {
                                                        e4 = e5;
                                                    }
                                                }
                                                arrayList2.add(stringExtra2);
                                                C0g3.A00().A05(stringExtra2, C05F.A0C);
                                            } else {
                                                throw new IOException(AnonymousClass001.A0R("No hash found for ", stringExtra2));
                                            }
                                        }
                                    }
                                    C0K8.A0O("GooglePlayDownloader", str, objArr);
                                }
                                if (e4 == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        Object next = it4.next();
                                        if (!abstractC62642SJz.A01().contains(next)) {
                                            arrayList3.add(next);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        C0K8.A0Q("GooglePlayDownloader", "Extra module extracted from session: %s", A00(arrayList3));
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it5 = abstractC62642SJz.A01().iterator();
                                    while (it5.hasNext()) {
                                        Object next2 = it5.next();
                                        if (!arrayList2.contains(next2)) {
                                            arrayList4.add(next2);
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        throw new FileNotFoundException(A00(arrayList4).concat(" were not found in downloaded session"));
                                    }
                                } else {
                                    throw new IOException(e4);
                                }
                            } else {
                                C0K8.A0Q("GooglePlayDownloader", "There are no extracted intents for modules %s", A00(abstractC62642SJz.A01()));
                            }
                            c58623Pyr.A00.A01(new C62674SLm(null, null, 1));
                        } catch (IOException e6) {
                            C0K8.A0L("GooglePlayDownloader", "Exception while downloading modules: %s", e6, A00(abstractC62642SJz.A01()));
                            c58623Pyr.A00.A00(e6);
                        }
                    }
                }
            } else {
                C0K8.A0P("GooglePlayDownloader", "Error onStateUpdate state info: %s", abstractC62642SJz.toString());
            }
        }
    }

    @Override // X.C1RW
    public final String getName() {
        return "GooglePlay";
    }

    public static String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            } else {
                z = false;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // X.C1RW
    public final C58428Pv7 A03(C58621Pyp c58621Pyp) {
        C58427Pv6 c58427Pv6 = new C58427Pv6();
        AOU(c58621Pyp);
        C58623Pyr c58623Pyr = new C58623Pyr(c58427Pv6, c58621Pyp);
        synchronized (this) {
            this.A0G.offer(c58623Pyr);
            A01(this);
        }
        return c58427Pv6.A00;
    }

    @Override // X.C1RW
    public final void AOU(C58621Pyp c58621Pyp) {
        this.A0B.AOV(new ArrayList(c58621Pyp.A02));
    }

    @Override // X.C1RW
    public final C58428Pv7 Eo5(C58427Pv6 c58427Pv6, C58621Pyp c58621Pyp) {
        C5KS AOW = this.A0B.AOW(new ArrayList(c58621Pyp.A02));
        Executor executor = this.A0D;
        AOW.A04(new T7D(c58427Pv6, this), executor);
        AOW.A0B(new T72(c58427Pv6, this), executor);
        return c58427Pv6.A00;
    }

    public C48262Jq(Context context, C48242Jn c48242Jn, C19490xZ c19490xZ, C09970fz c09970fz, C10040gH c10040gH, Executor executor) {
        C48282Js c48282Js;
        this.A08 = RealtimeSinceBootClock.A00;
        this.A03 = false;
        this.A07 = false;
        this.A06 = false;
        this.A01 = context;
        this.A0C = new HashMap();
        this.A0G = new LinkedList();
        this.A0F = c19490xZ;
        synchronized (C48272Jr.class) {
            c48282Js = C48272Jr.A00;
            if (c48282Js == null) {
                c48282Js = new C48282Js(context);
                C48272Jr.A00 = c48282Js;
            }
        }
        this.A0B = c48282Js;
        this.A09 = c09970fz;
        this.A0A = c10040gH;
        this.A0D = executor;
        this.A0E = c48242Jn;
    }

    @Override // X.C1RW
    public final boolean Cc3(C58428Pv7 c58428Pv7) {
        int i;
        Exception A03 = c58428Pv7.A03();
        if ((A03 instanceof RjK) || ((A03 instanceof N20) && (i = ((Rk3) A03).A00.A00) != -5 && i != -2 && i != 0)) {
            return true;
        }
        return false;
    }

    public C48262Jq() {
    }
}
