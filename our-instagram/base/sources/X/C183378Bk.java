package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183378Bk {
    public final Context A00;
    public final UserSession A01;
    public final C183388Bl A02;
    public final C49602Pt A03;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();

    public static final void A02(C209059Mn c209059Mn, C183378Bk c183378Bk, C115475Kh c115475Kh, File file, int i) {
        String str;
        Bitmap A02;
        FileOutputStream fileOutputStream;
        try {
            if (AbstractC115515Kl.A05(c115475Kh)) {
                C115525Km c115525Km = c115475Kh.A0G;
                Point A00 = c209059Mn.A00(new Point(c115525Km.A09, c115525Km.A05));
                String str2 = c115475Kh.A0G.A0I;
                if (str2 != null && (A02 = C1NC.A0E(str2, A00.x, A00.y)) != null) {
                    fileOutputStream = new FileOutputStream(file);
                } else {
                    AbstractC12120kG.A09("VideoFrameStore", AnonymousClass001.A0R("retrieveFrame from image failed. path: ", c115475Kh.A0G.A0I), null);
                    return;
                }
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                C115525Km c115525Km2 = c115475Kh.A0G;
                long convert = timeUnit.convert(c115525Km2.A02 - c115525Km2.A03, TimeUnit.MILLISECONDS);
                long min = Math.min(Math.max(0L, convert - (timeUnit.convert(1L, TimeUnit.SECONDS) / 30)), timeUnit.convert(i, TimeUnit.MILLISECONDS));
                Context context = c183378Bk.A00;
                UserSession userSession = c183378Bk.A01;
                File file2 = new File(c115475Kh.A0G.A0F);
                MYU A002 = MYG.A00(userSession);
                MYV A003 = MYH.A00(userSession);
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(A002, 6);
                C14360o3.A0B(A003, 7);
                A02 = AMI.A02(AMI.A03(context, userSession, c209059Mn, A002, A003, file2, convert, false), convert, min);
                fileOutputStream = new FileOutputStream(file);
            }
            AMI.A04(A02, fileOutputStream);
        } catch (IOException e) {
            e = e;
            str = "retrieveFrame_IOException";
            AbstractC12120kG.A09("VideoFrameStore", str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "retrieveFrame_IllegalStateException";
            AbstractC12120kG.A09("VideoFrameStore", str, e);
        } catch (UnknownFormatConversionException e3) {
            e = e3;
            str = "retrieveFrame_UnknownFormatConversionException";
            AbstractC12120kG.A09("VideoFrameStore", str, e);
        } catch (Throwable th) {
            e = th;
            str = "retrieveFrame";
            AbstractC12120kG.A09("VideoFrameStore", str, e);
        }
    }

    public final void A03(Bitmap.Config config, InterfaceC25187BCk interfaceC25187BCk, String str, int i, int i2) {
        C14360o3.A0B(str, 0);
        C115475Kh A00 = AbstractC54870OOf.A00(str);
        C14360o3.A0B(A00, 0);
        A01(config, interfaceC25187BCk, this, A00, (int) (A00.A09 * Math.abs(A00.A00)), i, i2, false);
    }

    public static final File A00(C209059Mn c209059Mn, C183378Bk c183378Bk, C115475Kh c115475Kh, int i) {
        C49602Pt c49602Pt = c183378Bk.A03;
        if (c49602Pt.A02()) {
            C115525Km c115525Km = c115475Kh.A0G;
            Point A00 = c209059Mn.A00(new Point(c115525Km.A09, c115525Km.A05));
            File file = new File(c115475Kh.A0G.A0F);
            StringBuilder sb = new StringBuilder();
            sb.append("time-");
            sb.append(i);
            sb.append("-size-");
            sb.append(A00.x);
            sb.append('x');
            sb.append(A00.y);
            return AMc.A01(c49602Pt, file, sb.toString());
        }
        throw new IOException("Failed to initialize directory provider");
    }

    public static final void A01(final Bitmap.Config config, final InterfaceC25187BCk interfaceC25187BCk, final C183378Bk c183378Bk, final C115475Kh c115475Kh, final int i, final int i2, final int i3, final boolean z) {
        try {
            final File A00 = A00(new C209059Mn(i3), c183378Bk, c115475Kh, i);
            A00.exists();
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9jU
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(94, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Bitmap A02;
                    FileOutputStream fileOutputStream;
                    C183378Bk c183378Bk2 = c183378Bk;
                    C115475Kh c115475Kh2 = c115475Kh;
                    File file = A00;
                    int i4 = i;
                    int i5 = i2;
                    int i6 = i3;
                    Bitmap.Config config2 = config;
                    InterfaceC25187BCk interfaceC25187BCk2 = interfaceC25187BCk;
                    boolean z2 = z;
                    if (!file.exists()) {
                        C209059Mn c209059Mn = new C209059Mn(i6);
                        if (z2) {
                            try {
                                if (AbstractC115515Kl.A05(c115475Kh2)) {
                                    C115525Km c115525Km = c115475Kh2.A0G;
                                    Point A002 = c209059Mn.A00(new Point(c115525Km.A09, c115525Km.A05));
                                    String str2 = c115475Kh2.A0G.A0I;
                                    if (str2 != null && (A02 = C1NC.A0E(str2, A002.x, A002.y)) != null) {
                                        fileOutputStream = new FileOutputStream(file);
                                    } else {
                                        AbstractC12120kG.A09("VideoFrameStore", AnonymousClass001.A0R("continuousRetrieveFrame from image failed. path: ", c115475Kh2.A0G.A0I), null);
                                    }
                                } else {
                                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                                    C115525Km c115525Km2 = c115475Kh2.A0G;
                                    long convert = timeUnit.convert(c115525Km2.A02 - c115525Km2.A03, TimeUnit.MILLISECONDS);
                                    long min = Math.min(Math.max(0L, convert - (timeUnit.convert(1L, TimeUnit.SECONDS) / 30)), timeUnit.convert(i4, TimeUnit.MILLISECONDS));
                                    Context context = c183378Bk2.A00;
                                    UserSession userSession = c183378Bk2.A01;
                                    A02 = AMI.A02(AMI.A03(context, userSession, c209059Mn, MYG.A00(userSession), MYH.A00(userSession), AbstractC166987dD.A11(c115475Kh2.A0G.A0F), convert, true), convert, min);
                                    fileOutputStream = new FileOutputStream(file);
                                }
                                AMI.A04(A02, fileOutputStream);
                            } catch (IOException e) {
                                e = e;
                                str = "continuousRetrieveFrame_IOException";
                                AbstractC12120kG.A09("VideoFrameStore", str, e);
                                C11T.A02(new RunnableC24664Avy(AMI.A01(config2, file, i5, i6), interfaceC25187BCk2));
                            } catch (IllegalStateException e2) {
                                e = e2;
                                str = "continuousRetrieveFrame_IllegalStateException";
                                AbstractC12120kG.A09("VideoFrameStore", str, e);
                                C11T.A02(new RunnableC24664Avy(AMI.A01(config2, file, i5, i6), interfaceC25187BCk2));
                            } catch (UnknownFormatConversionException e3) {
                                e = e3;
                                str = "continuousRetrieveFrame_UnknownFormatConversionException";
                                AbstractC12120kG.A09("VideoFrameStore", str, e);
                                C11T.A02(new RunnableC24664Avy(AMI.A01(config2, file, i5, i6), interfaceC25187BCk2));
                            } catch (Throwable th) {
                                e = th;
                                str = "continuousRetrieveFrame";
                                AbstractC12120kG.A09("VideoFrameStore", str, e);
                                C11T.A02(new RunnableC24664Avy(AMI.A01(config2, file, i5, i6), interfaceC25187BCk2));
                            }
                        } else {
                            C183378Bk.A02(c209059Mn, c183378Bk2, c115475Kh2, file, i4);
                        }
                    }
                    C11T.A02(new RunnableC24664Avy(AMI.A01(config2, file, i5, i6), interfaceC25187BCk2));
                }
            });
        } catch (IOException unused) {
            interfaceC25187BCk.DIT();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Bl] */
    public C183378Bk(final Context context, final UserSession userSession, C49602Pt c49602Pt) {
        this.A00 = context;
        this.A03 = c49602Pt;
        this.A01 = userSession;
        this.A02 = new Object(context, userSession) { // from class: X.8Bl
            public final Context A00;
            public final DisplayMetrics A01;
            public final UserSession A02;
            public final C49602Pt A03;

            {
                C14360o3.A0B(context, 1);
                C14360o3.A0B(userSession, 2);
                this.A00 = context;
                this.A02 = userSession;
                this.A03 = C2Ps.A00(context, userSession);
                this.A01 = context.getResources().getDisplayMetrics();
            }
        };
    }
}
