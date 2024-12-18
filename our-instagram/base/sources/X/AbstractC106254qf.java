package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.4qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106254qf {
    public static C61606RqV A00;
    public static C106274qh A01;
    public static boolean A02;
    public static boolean A03;
    public static Integer A04;
    public static final Object A05 = new Object();

    public static EnumC61128Rfi A00() {
        if (!A02) {
            return null;
        }
        C61606RqV c61606RqV = A00;
        if (c61606RqV == null) {
            return EnumC61128Rfi.A05;
        }
        return c61606RqV.A00();
    }

    public static Integer A01() {
        Integer num;
        C62412SAm c62412SAm;
        synchronized (A05) {
            num = A04;
            if (num == null) {
                C106274qh c106274qh = A01;
                if (c106274qh != null) {
                    C106234qd c106234qd = c106274qh.A00;
                    Context context = c106234qd.A00;
                    AbstractC12990ll abstractC12990ll = c106234qd.A01;
                    boolean z = false;
                    if (!new File(context.getDataDir(), "app_webview_embedded").exists()) {
                        try {
                            if (AbstractC61699RsG.A00(new C62412SAm(context.getPackageManager().getPackageInfo("com.google.android.webview", 0).getLongVersionCode())) == C05F.A00) {
                                c62412SAm = new C62412SAm(context.getPackageManager().getPackageInfo("com.google.android.webview", 0).getLongVersionCode());
                            } else {
                                ArrayList arrayList = new ArrayList();
                                try {
                                    C62412SAm A002 = AbstractC61700RsH.A00(context, "com.google.android.webview");
                                    if (AbstractC61699RsG.A00(A002) == C05F.A01) {
                                        arrayList.add(A002);
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                try {
                                    C62412SAm A003 = AbstractC61700RsH.A00(context, AbstractC58317Pt9.A00(248));
                                    if (AbstractC61699RsG.A00(A003) == C05F.A01) {
                                        arrayList.add(A003);
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                if (!arrayList.isEmpty()) {
                                    Object obj = arrayList.get(0);
                                    C14360o3.A0A(obj);
                                    c62412SAm = (C62412SAm) obj;
                                } else {
                                    throw new PackageManager.NameNotFoundException("No suitable candidates found for trichrome patching");
                                }
                            }
                            if (c62412SAm.A00 / 100000 > 6723) {
                                z = true;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                    }
                    if (z) {
                        num = C05F.A01;
                    } else {
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, abstractC12990ll, 2342164370815526248L) && C106434qx.A00.A01(context, C18U.A06(c06090Tz, abstractC12990ll, 2342164370815460711L), C18U.A06(c06090Tz, abstractC12990ll, 36321361602225516L)) != C05F.A0Y) {
                            num = C05F.A0C;
                        } else {
                            String str = context.getApplicationInfo().nativeLibraryDir;
                            boolean z2 = true;
                            if (str == null || !AbstractC002300n.A0h(str, "/mnt/asec/", false)) {
                                z2 = false;
                            }
                            if (z2) {
                                num = C05F.A0N;
                            } else {
                                num = C05F.A00;
                            }
                        }
                    }
                    A04 = num;
                } else {
                    throw new IllegalStateException("Attempted to fetch device eligibility prior to injection");
                }
            }
        }
        return num;
    }
}
