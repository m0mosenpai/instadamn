package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PTw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57083PTw implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Rect A03;
    public final /* synthetic */ Medium A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C47Z A06;
    public final /* synthetic */ String A07;

    public RunnableC57083PTw(Context context, Rect rect, Medium medium, UserSession userSession, C47Z c47z, String str, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = context;
        this.A05 = userSession;
        this.A04 = medium;
        this.A07 = str;
        this.A06 = c47z;
        this.A03 = rect;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.XD9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.OW6, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.A00 != this.A01) {
                Context context = this.A02;
                UserSession userSession = this.A05;
                String str = this.A04.A0X;
                String str2 = this.A07;
                C14360o3.A0A(str2);
                C47Z c47z = this.A06;
                C55190Odw A02 = C55190Odw.A02(context, userSession, c47z, c47z.A5x, new C55146Od7(userSession, c47z.A0D(), false, c47z.A5D, true, false).A06());
                Point point = A02.A00;
                C14360o3.A07(point);
                int i = point.x;
                int i2 = point.y;
                WDI wdi = new WDI();
                wdi.A0C = i;
                wdi.A0A = i2;
                wdi.A00 = c47z.A02;
                int A04 = A02.A04();
                wdi.A04 = A04;
                wdi.A01 = A04;
                wdi.A02 = 30;
                wdi.A03 = 4;
                wdi.A0K = AbstractC54277Nyx.A00(userSession, c47z.A0D());
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 4);
                AtomicReference atomicReference = new AtomicReference();
                C52032N0g c52032N0g = new C52032N0g(atomicReference);
                C1126256q c1126256q = new C1126256q();
                AbstractC50522MSa.A1K(c1126256q, new C1125856m(EnumC1125356h.VIDEO), new C1125656k(AbstractC166987dD.A11(str)));
                C69201VjU c69201VjU = new C69201VjU();
                c69201VjU.A00 = 128000;
                c69201VjU.A01 = 2;
                W3N w3n = new W3N();
                w3n.A08 = new MediaComposition(c1126256q);
                w3n.A06 = wdi;
                w3n.A0F = str2;
                w3n.A07 = c52032N0g;
                w3n.A0C = new C70087W2j(c69201VjU);
                w3n.A0Q = true;
                w3n.A0B = new C50717MaG(userSession, c47z);
                File cacheDir = context.getCacheDir();
                C14360o3.A07(cacheDir);
                OBZ obz = new OBZ(userSession, cacheDir, true, false);
                ?? obj = new Object();
                OW6.A00(context, obz, obj, new C69489VoC(w3n));
                obj.A0B = new Object();
                obj.A06 = new C55771Opf(context);
                obj.A02 = VYA.A00;
                try {
                    try {
                        C50665MYi.A00(obj, userSession).FDu();
                        if (atomicReference.get() != null) {
                            throw new IOException("Failure when updating video", (Throwable) atomicReference.get());
                        }
                    } catch (InterruptedException e) {
                        throw new IOException("Failure when updating video", e);
                    }
                } catch (ExecutionException e2) {
                    throw new IOException("Failure when updating video", e2);
                }
            }
            C55119Obe.A00(this.A02, this.A05, this.A06);
        } catch (Exception e3) {
            UserSession userSession2 = this.A05;
            C47Z c47z2 = this.A06;
            if (C18U.A06(C06090Tz.A05, userSession2, 2342163254124159148L)) {
                AbstractC25651Mw.A00(userSession2).E4s(new LYL(c47z2, true));
            }
            C0w9.A06("open_carousel_submission_uploader", "Error cropping or posting video", e3);
            Context context2 = this.A02;
            EnumC141996bI enumC141996bI = EnumC141996bI.A05;
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(context2, A0K, 2131969147);
            A0K.A0C = enumC141996bI;
            AbstractC31178DnM.A1S(A0K);
        }
    }
}
