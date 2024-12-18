package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Woq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71155Woq implements BDV {
    public static final String A04;
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final HashMap A03;

    @Override // X.BDV
    public final void A8j(C5NJ c5nj) {
        XEC AM2;
        UserSession userSession = this.A02;
        AnonymousClass229.A01(userSession).A04.A01();
        String str = c5nj.A05;
        C14360o3.A07(str);
        boolean exists = new File(str).exists();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String str2 = A04;
        try {
            String str3 = c5nj.A06;
            if (!exists && str3 != null) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch A15 = AbstractC58319PtB.A15();
                WkO wkO = new WkO(A15, atomicBoolean, atomicReference);
                C7UR c7ur = C7UR.A0A;
                C7US.A00(this.A01).A05(wkO, str3);
                A15.await(1L, TimeUnit.MINUTES);
                str = (String) atomicReference.get();
            }
            if (c5nj.A03 == C5NP.A05) {
                AM2 = new C70922WkR(str, C05F.A0C).AM2();
            } else {
                X8Q A00 = AnonymousClass750.A00.A00(null, str3, str, false, false);
                C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.giphy.intf.IGDecoderAnimatedImage");
                AM2 = ((AnonymousClass752) A00).AM2();
            }
            this.A03.put(c5nj, new C69169Viy(AM2));
            AnonymousClass229.A01(userSession).A04.A02();
        } catch (Exception e) {
            AnonymousClass229.A01(userSession).A04.A00();
            if (!(e instanceof C7VD) && !(e instanceof InterruptedException)) {
                C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R(str2, "failed to render gif"), 817898083);
                AEp.ERI(e);
                AEp.report();
                throw e;
            }
            String A1D = AnonymousClass001.A1D("File exists ? ", exists);
            if (!exists) {
                StringBuilder A11 = AbstractC166997dE.A11(A1D);
                A11.append("Failed to Re-download=");
                A11.append(atomicBoolean.get());
                A1D = A11.toString();
            }
            String A0T = AnonymousClass001.A0T(A1D, Environment.getExternalStorageState(new File(str)), ' ');
            AbstractC167007dF.A15(C18950wb.A01.AEp(AnonymousClass001.A0R(str2, "failed to render gif"), 817898083), DialogModule.KEY_MESSAGE, AnonymousClass001.A0T(A0T, str, ':'), e);
            throw new RuntimeException(A0T, e);
        }
    }

    static {
        Map map = C0YZ.A03;
        A04 = AbstractC13230m9.A01(C71155Woq.class);
    }

    @Override // X.BDV
    public final InterfaceC197718oi C6s(C5NJ c5nj, long j, long j2) {
        C69169Viy c69169Viy = (C69169Viy) this.A03.get(c5nj);
        if (c69169Viy == null) {
            return null;
        }
        Bitmap bitmap = c69169Viy.A01;
        c69169Viy.A02.EMm((int) (j % r2.getDuration()), bitmap);
        InterfaceC197718oi A02 = C209089Mq.A02(bitmap, this.A00);
        c69169Viy.A00 = A02;
        return A02;
    }

    @Override // X.BDV
    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((C69169Viy) A0t.next()).A01.recycle();
        }
        hashMap.clear();
    }

    public C71155Woq(Context context, UserSession userSession, int i) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = new HashMap();
    }
}
