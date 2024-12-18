package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.8SF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SF implements C8SG, C1NJ {
    public static final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public static final HashSet A0A = new HashSet();
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final Handler A04;
    public final ContentResolver A05;
    public final UserSession A06;
    public final C18340vL A07;
    public final Integer A08;

    public C8SF(Context context, UserSession userSession, Integer num, int i, int i2, boolean z) {
        C14360o3.A0B(context, 2);
        this.A06 = userSession;
        this.A03 = context;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = z;
        this.A08 = num;
        this.A04 = new Handler(Looper.getMainLooper());
        ContentResolver contentResolver = context.getContentResolver();
        C14360o3.A07(contentResolver);
        this.A05 = contentResolver;
        this.A07 = new C18340vL(C14120nc.A00(), Runtime.getRuntime().availableProcessors() * 2);
    }

    public static final void A02(CancellationSignal cancellationSignal, C193528hX c193528hX, C8SF c8sf, Medium medium, WeakReference weakReference) {
        InterfaceC193488hT interfaceC193488hT = (InterfaceC193488hT) weakReference.get();
        if (interfaceC193488hT != null && interfaceC193488hT.CXZ(medium)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC193548hZ.A00(c8sf.A05, cancellationSignal, c193528hX, medium, c8sf.A06, weakReference, c8sf.A02, c8sf.A01);
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                AbstractC193548hZ.A01(c8sf.A03, options, medium, c8sf.A00);
                String str = medium.A0a;
                if (str == null) {
                    return;
                }
                BitmapFactory.decodeFile(str, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                if (i <= 0 || i2 <= 0) {
                    C0w9.A03("GalleryThumbnailLoader", AnonymousClass001.A0x("Bitmap could not be decoded: width = ", ", height = ", ", thumbnail path = ", medium.A0a, i, i2));
                }
                int i3 = c8sf.A02;
                int i4 = c8sf.A01;
                int i5 = 1;
                while (i / i5 > i3 && i2 / i5 > i4) {
                    i5 *= 2;
                }
                medium.A06 = Math.max(i5, 1);
                A09.put(A01(c8sf, medium), new C193508hV(medium.A0a, medium.A06));
                A03(c8sf, medium, weakReference);
            } catch (IllegalStateException e) {
                C0w9.A06("GalleryThumbnailLoader", "legacyLoadThumbnail failed", e);
            }
        }
    }

    public final void A04(Medium medium, InterfaceC193488hT interfaceC193488hT) {
        C14360o3.A0B(medium, 0);
        C14360o3.A0B(interfaceC193488hT, 1);
        A00(null, this, medium, interfaceC193488hT, false);
    }

    @Override // X.C8SG
    public final C193498hU AGR(C193528hX c193528hX, C193498hU c193498hU, Medium medium, InterfaceC193488hT interfaceC193488hT, Integer num, Integer num2, Integer num3) {
        C14360o3.A0B(interfaceC193488hT, 2);
        if (c193498hU != null) {
            C18340vL c18340vL = this.A07;
            CancellationSignal cancellationSignal = c193498hU.A01;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            AbstractRunnableC14200nk abstractRunnableC14200nk = c193498hU.A00;
            if (abstractRunnableC14200nk != null) {
                c18340vL.A00.remove(abstractRunnableC14200nk);
            }
        }
        return A00(c193528hX, this, medium, interfaceC193488hT, false);
    }

    @Override // X.C1NJ
    public final void Cza(final InterfaceC59502nt interfaceC59502nt, final C73033Pe c73033Pe) {
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        Runnable runnable = new Runnable() { // from class: X.9Ov
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                Object C4x = InterfaceC59502nt.this.C4x();
                if (C4x != null) {
                    C209509Ok c209509Ok = (C209509Ok) C4x;
                    InterfaceC193488hT interfaceC193488hT = (InterfaceC193488hT) c209509Ok.A01.get();
                    Medium medium = c209509Ok.A00;
                    if (interfaceC193488hT != null && interfaceC193488hT.CXZ(medium) && (bitmap = c73033Pe.A01) != null) {
                        interfaceC193488hT.Dt1(bitmap, medium, false);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        if (C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            this.A04.post(runnable);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C14360o3.A0B(interfaceC59502nt, 0);
        RunnableC24298Aq3 runnableC24298Aq3 = new RunnableC24298Aq3(interfaceC59502nt);
        if (C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnableC24298Aq3.run();
        } else {
            this.A04.post(runnableC24298Aq3);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static final C193498hU A00(final C193528hX c193528hX, final C8SF c8sf, final Medium medium, InterfaceC193488hT interfaceC193488hT, final boolean z) {
        final WeakReference weakReference = new WeakReference(interfaceC193488hT);
        final C193498hU c193498hU = new C193498hU();
        if (A0A.contains(Integer.valueOf(medium.A05))) {
            interfaceC193488hT.DN1(medium, null);
            return c193498hU;
        }
        ConcurrentHashMap concurrentHashMap = A09;
        C193508hV c193508hV = (C193508hV) concurrentHashMap.get(A01(c8sf, medium));
        if (c193508hV != null && new File(c193508hV.A01).exists()) {
            Object obj = concurrentHashMap.get(A01(c8sf, medium));
            if (obj != null) {
                C193508hV c193508hV2 = (C193508hV) obj;
                medium.A0a = c193508hV2.A01;
                medium.A06 = c193508hV2.A00;
                A03(c8sf, medium, weakReference);
                return c193498hU;
            }
            throw new IllegalStateException("Required value was null.");
        }
        try {
            final Runnable runnable = new Runnable() { // from class: X.8hW
                @Override // java.lang.Runnable
                public final void run() {
                    if (z) {
                        try {
                            C8SF c8sf2 = c8sf;
                            Medium medium2 = medium;
                            CancellationSignal cancellationSignal = c193498hU.A01;
                            WeakReference weakReference2 = weakReference;
                            InterfaceC193488hT interfaceC193488hT2 = (InterfaceC193488hT) weakReference2.get();
                            if (interfaceC193488hT2 != null && interfaceC193488hT2.CXZ(medium2)) {
                                File A04 = AbstractC13530mf.A04(c8sf2.A03);
                                C14360o3.A07(A04);
                                medium2.A0a = A04.getPath();
                                try {
                                    AMI.A04(AMI.A00(Bitmap.Config.RGB_565, new Point(c8sf2.A02, c8sf2.A01), new File(medium2.A0X), 0L), new FileOutputStream(A04));
                                    C8SF.A09.put(C8SF.A01(c8sf2, medium2), new C193508hV(medium2.A0a, medium2.A06));
                                    C8SF.A03(c8sf2, medium2, weakReference2);
                                    return;
                                } catch (Exception e) {
                                    if (!(e instanceof IOException) && !(e instanceof IllegalArgumentException)) {
                                        throw e;
                                    }
                                    C0w9.A07("GalleryThumbnailLoader_loadFirstFrameThumbnail", e);
                                    C8SF.A02(cancellationSignal, null, c8sf2, medium2, weakReference2);
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e2) {
                            C0w9.A06("GalleryThumbnailLoader", AnonymousClass001.A0R("loadFirstFrameThumbnail failed. file path: ", medium.A0X), e2);
                        }
                    }
                    C8SF c8sf3 = c8sf;
                    Medium medium3 = medium;
                    C8SF.A02(c193498hU.A01, c193528hX, c8sf3, medium3, weakReference);
                }
            };
            AbstractRunnableC14200nk abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.8hY
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1910247448, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            };
            if (c8sf.A08 == C05F.A01) {
                c193498hU.A00 = abstractRunnableC14200nk;
            }
            c8sf.A07.ATO(abstractRunnableC14200nk);
            return c193498hU;
        } catch (RejectedExecutionException e) {
            C0w9.A07("GalleryThumbnailLoader#rejectedExectutionException", e);
            return c193498hU;
        }
    }

    public static final String A01(C8SF c8sf, Medium medium) {
        StringBuilder sb = new StringBuilder();
        sb.append(medium.A0X);
        sb.append('?');
        sb.append(c8sf.A02);
        sb.append('x');
        sb.append(c8sf.A01);
        return sb.toString();
    }

    public static final void A03(C8SF c8sf, Medium medium, WeakReference weakReference) {
        String obj = android.net.Uri.fromFile(new File(medium.A0a)).toString();
        C14360o3.A07(obj);
        C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(obj), null);
        A0J.A0I = false;
        A0J.A05 = c8sf.A06;
        A0J.A08 = new C209509Ok(medium, weakReference);
        A0J.A02(c8sf);
        A0J.A01 = medium.A06;
        A0J.A01();
    }

    public final void A05(final Medium medium, InterfaceC193488hT interfaceC193488hT) {
        final WeakReference weakReference = new WeakReference(interfaceC193488hT);
        final C193498hU c193498hU = new C193498hU();
        UserSession userSession = this.A06;
        if (C18U.A06(C06090Tz.A05, userSession, 36327812643502984L)) {
            this.A07.ATO(new AbstractRunnableC14200nk() { // from class: X.9jH
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1910247448, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Medium medium2 = medium;
                    C8SF c8sf = this;
                    AbstractC193548hZ.A03(c193498hU.A01, medium2, weakReference, c8sf.A02, c8sf.A01);
                }
            });
            return;
        }
        if (userSession == null) {
            AbstractC12120kG.A04("GalleryThumbnailLoader", "null UserSession", 817895804, null);
        }
        AbstractC193548hZ.A03(c193498hU.A01, medium, weakReference, this.A02, this.A01);
    }

    @Override // X.C8SG
    public final void AHe() {
        A0A.clear();
    }
}
