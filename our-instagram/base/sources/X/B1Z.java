package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1Z implements Callable {
    public final AAW A00;
    public final boolean A01;

    public B1Z(AAW aaw) {
        C14360o3.A0B(aaw, 1);
        this.A00 = aaw;
        this.A01 = aaw.A06.A5F;
    }

    private final void A00() {
        C47Z c47z = this.A00.A06;
        c47z.A4a = null;
        c47z.A2k = null;
        c47z.A0g(null);
        c47z.A0f(null);
        c47z.A16 = null;
        c47z.A5F = this.A01;
        c47z.A1V = new C47v(0.0f, 31);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final String call() {
        Integer num;
        String str;
        String str2;
        AAW aaw = this.A00;
        Context context = aaw.A00;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            AbstractC24481Hr abstractC24481Hr = aaw.A02;
            if (abstractC24481Hr != null) {
                File file = (File) LH2.A01(abstractC24481Hr);
                C47Z c47z = aaw.A06;
                if (file != null) {
                    str2 = file.getAbsolutePath();
                } else {
                    str2 = null;
                }
                c47z.A2k = str2;
            }
            Map map = aaw.A07;
            if (!map.isEmpty()) {
                AEF.A01(aaw.A01, aaw.A06, new LinkedHashMap(map));
            }
            TransformMatrixConfig transformMatrixConfig = aaw.A03;
            if (transformMatrixConfig != null) {
                aaw.A06.A16 = transformMatrixConfig;
            }
            if (aaw.A08) {
                aaw.A06.A5F = true;
            } else {
                C47v c47v = aaw.A05;
                if (c47v != null) {
                    aaw.A06.A1V = c47v;
                }
            }
            C115595Kt c115595Kt = aaw.A04;
            if (c115595Kt != null) {
                C47Z c47z2 = aaw.A06;
                c47z2.A1P = c115595Kt;
                UserSession userSession = aaw.A01;
                C14360o3.A0B(userSession, 1);
                c47z2.A0r = AbstractC23119AKd.A01(context, userSession, c115595Kt, C2Ps.A00(context, userSession), false);
            }
            boolean z = aaw.A0A;
            if (z) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            UserSession userSession2 = aaw.A01;
            C47Z c47z3 = aaw.A06;
            if (!AbstractC54104Nw2.A00(applicationContext, null, userSession2, c47z3, num)) {
                if (C18U.A06(C06090Tz.A05, userSession2, 36326232094160647L) && (str = c47z3.A3V) != null) {
                    File A11 = AbstractC166987dD.A11(str);
                    if (A11.exists()) {
                        A11.delete();
                    }
                }
                A00();
                throw new IOException("Failed to save video to gallery");
            }
            String str3 = c47z3.A3V;
            if (str3 != null) {
                if (z) {
                    C9PL c9pl = new C9PL(str3);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    String str4 = c47z3.A2o;
                    if (str4 != null) {
                        A1E.add(str4);
                    }
                    ArrayList A0I = c47z3.A0I();
                    if (A0I != null) {
                        A1E.addAll(A0I);
                    }
                    c9pl.A0A = A1E;
                    c9pl.A07 = c47z3.A2n;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it = c47z3.A4D.iterator();
                    while (it.hasNext()) {
                        String obj = ((C5JB) it.next()).A01.toString();
                        if (C14360o3.A0K(obj, CameraTool.A1D.A00)) {
                            A1E2.add(obj);
                        }
                    }
                    c9pl.A09 = A1E2;
                    c9pl.A06 = c47z3.A2V;
                    c9pl.A00 = c47z3.A1b;
                    c9pl.A0B = aaw.A09;
                    AbstractC188508Wp.A04(userSession2, c9pl);
                }
                A00();
                return str3;
            }
            A00();
            AbstractC12120kG.A0D("SaveVideoCallable", "Pending media file path was null", null);
            throw new IOException("Pending media file path was null");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
