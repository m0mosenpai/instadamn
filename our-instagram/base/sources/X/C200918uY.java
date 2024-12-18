package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.RemoteException;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200918uY {
    public final C03190Dc A00;
    public final AbstractC48762Lu A01;
    public final AtomicInteger A02;
    public final C200778uK A03;
    public final InterfaceC200868uT A04;
    public final AbstractC200888uV A05;
    public final C200768uJ A06;

    public C200918uY(C200758uI c200758uI) {
        C200768uJ c200768uJ = c200758uI.A05;
        C200778uK c200778uK = c200758uI.A02;
        InterfaceC200868uT interfaceC200868uT = c200758uI.A03;
        AbstractC200888uV abstractC200888uV = c200758uI.A04;
        AbstractC48762Lu abstractC48762Lu = c200758uI.A01;
        this.A02 = new AtomicInteger((int) (Math.random() * 2.147483647E9d));
        this.A06 = c200768uJ;
        this.A03 = c200778uK;
        this.A04 = interfaceC200868uT;
        this.A05 = abstractC200888uV;
        this.A01 = abstractC48762Lu;
        this.A00 = c200758uI.A00;
    }

    public static ContentProviderClient A00(Context context, Enum r15, Integer num, String str, AbstractC200848uR abstractC200848uR, C200918uY c200918uY) {
        String str2;
        PackageManager packageManager;
        String str3;
        String str4;
        try {
            packageManager = context.getPackageManager();
        } catch (SecurityException e) {
            if (r15 instanceof EnumC200938ua) {
                AbstractC200888uV abstractC200888uV = c200918uY.A05;
                String name = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
                String name2 = r15.name();
                Integer num2 = C05F.A15;
                if (num.intValue() != 0) {
                    str2 = "LITE_PROVIDER";
                } else {
                    str2 = "LEGACY_PROVIDER";
                }
                abstractC200888uV.A03(num2, name, name2, abstractC200888uV.A01("resolver_name", str2, TraceFieldType.FailureReason, e.getMessage(), "instance_key", str));
            }
        }
        if (packageManager != null) {
            try {
            } catch (PackageManager.NameNotFoundException e2) {
                if (r15 instanceof EnumC200938ua) {
                    AbstractC200888uV abstractC200888uV2 = c200918uY.A05;
                    String name3 = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
                    String name4 = r15.name();
                    Integer num3 = C05F.A08;
                    if (num.intValue() != 0) {
                        str3 = "LITE_PROVIDER";
                    } else {
                        str3 = "LEGACY_PROVIDER";
                    }
                    abstractC200888uV2.A03(num3, name3, name4, abstractC200888uV2.A01("resolver_name", str3, TraceFieldType.FailureReason, e2.getMessage(), "instance_key", str));
                }
            }
            if (!packageManager.getApplicationInfo(abstractC200848uR.A02, 0).enabled && (r15 instanceof EnumC200938ua)) {
                AbstractC200888uV abstractC200888uV3 = c200918uY.A05;
                String name5 = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
                String name6 = r15.name();
                Integer num4 = C05F.A07;
                if (num.intValue() != 0) {
                    str4 = "LITE_PROVIDER";
                } else {
                    str4 = "LEGACY_PROVIDER";
                }
                abstractC200888uV3.A03(num4, name5, name6, abstractC200888uV3.A01("resolver_name", str4, "instance_key", str));
                return null;
            }
        }
        android.net.Uri uri = abstractC200848uR.A00;
        C14360o3.A0B(uri, 1);
        C03190Dc c03190Dc = c200918uY.A00;
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                C0LG A01 = C0LG.A01(context, authority);
                if (!c03190Dc.A03(A01, AbstractC08450c9.A02(context))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("The provider for uri '");
                    sb.append(authority);
                    sb.append("' is not trusted: ");
                    sb.append(A01);
                    throw new SecurityException(sb.toString());
                }
            } catch (SecurityException unused) {
                authority = null;
            }
        } else {
            authority = null;
        }
        if (authority == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        C06280Ut.A00(authority, -635758405, C05F.A00);
        return contentResolver.acquireUnstableContentProviderClient(authority);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r8.moveToNext() != true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A01(android.content.Context r40, java.lang.String r41, java.util.List r42, X.C200918uY r43) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200918uY.A01(android.content.Context, java.lang.String, java.util.List, X.8uY):java.util.ArrayList");
    }

    public static void A02(Context context, String str, String str2, List list, AbstractC200848uR abstractC200848uR, C200918uY c200918uY) {
        Integer num;
        String num2 = Integer.toString(c200918uY.A02.incrementAndGet());
        AbstractC200888uV abstractC200888uV = c200918uY.A05;
        String name = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
        EnumC200938ua enumC200938ua = EnumC200938ua.ACTIVE_ACCOUNT;
        Integer num3 = C05F.A00;
        abstractC200888uV.A08(name, abstractC200888uV.A01("resolver_name", "LEGACY_PROVIDER", "caller_name", str2, "instance_key", num2), "ACTIVE_ACCOUNT");
        ContentProviderClient A00 = A00(context, enumC200938ua, num3, num2, abstractC200848uR, c200918uY);
        if (A00 != null) {
            c200918uY.A04.Dno(abstractC200848uR);
            try {
                ArrayList A01 = c200918uY.A03.A01(A00, str, num2, abstractC200848uR, enumC200938ua, abstractC200888uV);
                A04(num3, num2, str2, A01, abstractC200848uR, enumC200938ua, c200918uY);
                list.addAll(A01);
                A00.close();
            } catch (RemoteException e) {
                e = e;
                num = C05F.A1F;
                abstractC200888uV.A03(num, name, "ACTIVE_ACCOUNT", abstractC200888uV.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num2));
            } catch (SecurityException e2) {
                e = e2;
                num = C05F.A15;
                abstractC200888uV.A03(num, name, "ACTIVE_ACCOUNT", abstractC200888uV.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num2));
            }
        }
    }

    public static void A03(Context context, String str, List list, AbstractC200848uR abstractC200848uR, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua, C200918uY c200918uY) {
        ArrayList arrayList;
        ACJ F8L;
        String num = Integer.toString(c200918uY.A02.incrementAndGet());
        AbstractC200888uV abstractC200888uV = c200918uY.A05;
        EnumC200798uM enumC200798uM = abstractC200848uR.A04;
        String name = AbstractC200928uZ.A00(enumC200798uM).name();
        String name2 = enumC200938ua.name();
        Integer num2 = C05F.A01;
        abstractC200888uV.A08(name, abstractC200888uV.A01("resolver_name", "LITE_PROVIDER", "caller_name", str, "instance_key", num), name2);
        ContentProviderClient A00 = A00(context, enumC200938ua, num2, num, abstractC200848uR, c200918uY);
        if (A00 != null) {
            try {
                C14360o3.A0B(enumC200808uN, 3);
                C14360o3.A0B(num, 5);
                Cursor A002 = C200778uK.A00(A00, enumC200938ua, num2, null, num, abstractC200848uR, abstractC200888uV);
                if (A002 != null) {
                    arrayList = new ArrayList();
                    InterfaceC203078yP interfaceC203078yP = (InterfaceC203078yP) AbstractC203048yM.A00.get(enumC200798uM);
                    try {
                        try {
                        } catch (C200998ug e) {
                            abstractC200888uV.A03(C05F.A1I, name, name2, abstractC200888uV.A01("resolver_name", "LITE_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num));
                        }
                        if (interfaceC203078yP == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Can't find corresponding transformer for SsoSource =");
                            sb.append(enumC200798uM);
                            throw new RuntimeException(sb.toString());
                        }
                        while (A002.moveToNext()) {
                            if (enumC200798uM == EnumC200798uM.INSTAGRAM) {
                                F8L = interfaceC203078yP.F8N(A002, enumC200938ua);
                            } else {
                                F8L = interfaceC203078yP.F8L(A002, enumC200808uN, enumC200938ua);
                            }
                            if (F8L != null) {
                                arrayList.add(F8L);
                            }
                        }
                        A002.close();
                        A04(num2, num, str, arrayList, abstractC200848uR, enumC200938ua, c200918uY);
                        list.addAll(arrayList);
                        A00.close();
                    } finally {
                        A002.close();
                    }
                }
                arrayList = new ArrayList();
                A04(num2, num, str, arrayList, abstractC200848uR, enumC200938ua, c200918uY);
                list.addAll(arrayList);
                A00.close();
            } catch (RemoteException e2) {
                abstractC200888uV.A03(C05F.A1F, enumC200808uN.name(), name2, abstractC200888uV.A01("resolver_name", "LITE_PROVIDER", TraceFieldType.FailureReason, e2.getMessage(), "instance_key", num));
            }
        }
    }

    public static void A04(Integer num, String str, String str2, List list, AbstractC200848uR abstractC200848uR, EnumC200938ua enumC200938ua, C200918uY c200918uY) {
        String str3;
        String str4;
        String str5;
        boolean isEmpty = list.isEmpty();
        AbstractC200888uV abstractC200888uV = c200918uY.A05;
        String name = AbstractC200928uZ.A00(abstractC200848uR.A04).name();
        String name2 = enumC200938ua.name();
        if (!isEmpty) {
            if (num.intValue() != 0) {
                str5 = "LITE_PROVIDER";
            } else {
                str5 = "LEGACY_PROVIDER";
            }
            HashMap A01 = abstractC200888uV.A01("resolver_name", str5, "instance_key", str);
            AbstractC200888uV.A00(EnumC200948ub.A05, name, name2, null, null, A01, abstractC200888uV);
            if (abstractC200888uV.A02() != null) {
                C200958uc A02 = abstractC200888uV.A02();
                int A00 = C200958uc.A00(A01);
                QuickPerformanceLogger quickPerformanceLogger = A02.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(857814189, A00, (short) 2);
                }
            }
        } else {
            Integer num2 = C05F.A0N;
            if (num.intValue() != 0) {
                str3 = "LITE_PROVIDER";
            } else {
                str3 = "LEGACY_PROVIDER";
            }
            abstractC200888uV.A03(num2, name, name2, abstractC200888uV.A01("resolver_name", str3, "instance_key", str));
        }
        AbstractC48762Lu abstractC48762Lu = c200918uY.A01;
        if (abstractC48762Lu != null) {
            for (Object obj : list) {
                if (obj instanceof ACJ) {
                    str4 = ((ACJ) obj).A02;
                } else if (obj instanceof C203148yW) {
                    str4 = ((C203148yW) obj).A01.A01.A02;
                }
                abstractC48762Lu.A00(name, name2, str4, str2);
            }
        }
    }
}
