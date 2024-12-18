package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Wor, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71156Wor implements BDW {
    public static final String A04;
    public final Context A00;
    public final UserSession A01;
    public final HashMap A02;
    public final int A03;

    @Override // X.BDW
    public final void A8j(C5NJ c5nj) {
        XEC AM2;
        UserSession userSession = this.A01;
        AnonymousClass229.A01(userSession).A04.A01();
        String str = "";
        try {
            String str2 = c5nj.A05;
            C14360o3.A07(str2);
            String str3 = c5nj.A06;
            File file = new File(str2);
            if ((!file.exists() || file.length() <= 0) && str3 != null) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch A15 = AbstractC58319PtB.A15();
                C70919WkN c70919WkN = new C70919WkN(5, A15, atomicReference);
                C7UR c7ur = C7UR.A0A;
                C7US.A00(this.A00).A05(c70919WkN, str3);
                A15.await(1L, TimeUnit.MINUTES);
                Object obj = atomicReference.get();
                C14360o3.A07(obj);
                str2 = (String) obj;
            }
            str = str2;
            if (c5nj.A03 == C5NP.A05) {
                AM2 = new C70922WkR(str2, C05F.A0C).AM2();
            } else {
                X8Q A00 = AnonymousClass750.A00.A00(null, c5nj.A06, str2, false, false);
                C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.giphy.intf.IGDecoderAnimatedImage");
                AM2 = ((AnonymousClass752) A00).AM2();
            }
            this.A02.put(c5nj, new C69170Viz(AM2));
            AnonymousClass229.A01(userSession).A04.A02();
        } catch (Exception e) {
            AnonymousClass229.A01(userSession).A04.A00();
            C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0R(A04, "failed to create gif decoder"), 817898083);
            AEp.ABW("image_regions_image_url", c5nj.A06);
            AEp.ABW("image_regions_image_path", c5nj.A05);
            AbstractC167007dF.A15(AEp, "image_path", str, e);
            throw e;
        }
    }

    static {
        Map map = C0YZ.A03;
        A04 = AbstractC13230m9.A01(C71156Wor.class);
    }

    @Override // X.BDW
    public final InterfaceC197718oi C6s(C5NJ c5nj, long j, long j2) {
        C69170Viz c69170Viz = (C69170Viz) this.A02.get(c5nj);
        if (c69170Viz == null) {
            return null;
        }
        Bitmap bitmap = c69170Viz.A01;
        c69170Viz.A02.EMm((int) (j % r2.getDuration()), bitmap);
        InterfaceC197718oi A02 = C209089Mq.A02(bitmap, this.A03);
        c69170Viz.A00 = A02;
        return A02;
    }

    @Override // X.BDW
    public final void cleanup() {
        HashMap hashMap = this.A02;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((C69170Viz) A0t.next()).A01.recycle();
        }
        hashMap.clear();
    }

    public C71156Wor(Context context, UserSession userSession, int i) {
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = i;
        this.A02 = new HashMap();
    }
}
