package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import com.facebook.R;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.74P, reason: invalid class name */
/* loaded from: classes3.dex */
public class C74P extends Drawable implements C5RP, C74Q, Drawable.Callback, C74M, Choreographer.FrameCallback, C74R, C74S, C5RS, C74T {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Bitmap A08;
    public AvatarInfo A09;
    public XEC A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public InterfaceC16820sZ A0H;
    public InterfaceC16820sZ A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public float A0P;
    public int A0Q;
    public int A0R;
    public boolean A0S;
    public boolean A0T;
    public final float A0U;
    public final float A0V;
    public final Context A0W;
    public final Paint A0X;
    public final Drawable A0Y;
    public final UserSession A0Z;
    public final C74X A0a;
    public final AbstractRunnableC14200nk A0b;
    public final C74W A0c;
    public final EnumC150226pU A0d;
    public final C6RL A0e;
    public final C75B A0f;
    public final C49602Pt A0g;
    public final Integer A0h;
    public final Runnable A0i;
    public final Runnable A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final InterfaceC09390do A0o;
    public final InterfaceC09390do A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final int A0u;
    public final int A0v;
    public final Paint A0w;
    public final Rect A0x;
    public final C74V A0y;
    public final CopyOnWriteArraySet A0z;
    public final CopyOnWriteArraySet A10;
    public final boolean A11;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1 != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized android.graphics.Bitmap A02(X.C74P r7, X.XEC r8) {
        /*
            monitor-enter(r7)
            android.graphics.Bitmap r3 = r7.A08     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r8 instanceof X.C70921WkQ     // Catch: java.lang.Throwable -> L7e
            r5 = 0
            if (r6 == 0) goto Lc
            r0 = r8
            X.WkQ r0 = (X.C70921WkQ) r0     // Catch: java.lang.Throwable -> L7e
            goto Ld
        Lc:
            r0 = r5
        Ld:
            r4 = 1
            if (r0 == 0) goto L17
            boolean r1 = r0.A02()     // Catch: java.lang.Throwable -> L7e
            r0 = 1
            if (r1 == r4) goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L22
            r0 = r8
            X.WkQ r0 = (X.C70921WkQ) r0     // Catch: java.lang.Throwable -> L7e
            int r2 = r0.A01()     // Catch: java.lang.Throwable -> L7e
            goto L26
        L22:
            int r2 = r8.getWidth()     // Catch: java.lang.Throwable -> L7e
        L26:
            if (r6 == 0) goto L2c
            r0 = r8
            X.WkQ r0 = (X.C70921WkQ) r0     // Catch: java.lang.Throwable -> L7e
            goto L2d
        L2c:
            r0 = r5
        L2d:
            if (r0 == 0) goto L36
            boolean r1 = r0.A02()     // Catch: java.lang.Throwable -> L7e
            r0 = 1
            if (r1 == r4) goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L41
            r0 = r8
            X.WkQ r0 = (X.C70921WkQ) r0     // Catch: java.lang.Throwable -> L7e
            int r1 = r0.A00()     // Catch: java.lang.Throwable -> L7e
            goto L45
        L41:
            int r1 = r8.getHeight()     // Catch: java.lang.Throwable -> L7e
        L45:
            if (r3 == 0) goto L54
            int r0 = r3.getWidth()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r0) goto L54
            int r0 = r3.getHeight()     // Catch: java.lang.Throwable -> L7e
            if (r1 != r0) goto L54
            goto L7c
        L54:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L7e
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Throwable -> L7e
            r7.A08 = r3     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L61
            r5 = r8
            X.WkQ r5 = (X.C70921WkQ) r5     // Catch: java.lang.Throwable -> L7e
        L61:
            if (r5 == 0) goto L6a
            boolean r0 = r5.A02()     // Catch: java.lang.Throwable -> L7e
            if (r0 != r4) goto L6a
            goto L6b
        L6a:
            r4 = 0
        L6b:
            if (r4 != 0) goto L79
            int r0 = r3.getHeight()     // Catch: java.lang.Throwable -> L7e
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L7e
            float r0 = r7.A01()     // Catch: java.lang.Throwable -> L7e
            float r1 = r1 * r0
            r7.A00 = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            X.C14360o3.A07(r3)     // Catch: java.lang.Throwable -> L7e
        L7c:
            monitor-exit(r7)
            return r3
        L7e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74P.A02(X.74P, X.XEC):android.graphics.Bitmap");
    }

    public final void A08() {
        if (this.A0L) {
            this.A0L = false;
            invalidateSelf();
        }
        this.A07 = System.currentTimeMillis();
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (((java.util.Map) r2.A07.getValue()).containsKey(r1) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(java.lang.String r9) {
        /*
            r8 = this;
            r3 = r8
            java.lang.Integer r2 = r8.A0B
            java.lang.Integer r1 = X.C05F.A00
            if (r2 == r1) goto L44
            java.lang.Integer r0 = X.C05F.A0N
            if (r2 == r0) goto L44
            r8.A0B = r1
            X.75B r2 = r8.A0f
            if (r2 == 0) goto L34
            java.lang.String r1 = r8.A0k
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.0UO r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L34
            X.0UO r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r1)
            r7 = 1
            if (r0 == 0) goto L35
        L34:
            r7 = 0
        L35:
            X.7UR r0 = X.C7UR.A0A
            android.content.Context r0 = r8.A0W
            X.7UR r2 = X.C7US.A00(r0)
            r5 = 0
            boolean r6 = r8.A0t
            r4 = r9
            r2.A06(r3, r4, r5, r6, r7)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74P.A0C(java.lang.String):void");
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A10.add(interfaceC25177BCa);
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C74Q
    public final boolean CaH(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        EnumC150226pU enumC150226pU = this.A0d;
        if ((enumC150226pU != EnumC150226pU.A0f || !AbstractC002300n.A0h(this.A0k, "gif_", false)) && (enumC150226pU != EnumC150226pU.A0A || !C18U.A06(C06090Tz.A05, userSession, 36319909903540047L) || !C14360o3.A0K(this.A0G, userSession.userId))) {
            return false;
        }
        return true;
    }

    @Override // X.C74R
    public final /* synthetic */ void D2h(boolean z) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    public void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(xec, 1);
        C14360o3.A0B(str2, 2);
        A0B(xec, str, str2);
        A09();
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C74M) it.next()).DQ3(xec, str, str2);
        }
        if (this.A0d == EnumC150226pU.A0M) {
            UserSession userSession = this.A0Z;
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A06, userSession, 36323741013782086L)) {
                String absolutePath = new File(this.A0g.C5c(), AnonymousClass001.A0R(this.A0k, "_webp")).getAbsolutePath();
                C14360o3.A07(absolutePath);
                this.A0D = null;
                A04(this, absolutePath);
            }
        }
    }

    @Override // X.C74M
    public final void DQ4(XEC xec, String str, String str2, final String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(xec, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        DQ3(xec, str, str2);
        File C5c = this.A0g.C5c();
        String str4 = this.A0k;
        final File file = new File(C5c, AnonymousClass001.A0R(str4, "_audio"));
        if (file.exists()) {
            C75B c75b = this.A0f;
            if (c75b != null) {
                c75b.A03(str4, file.getAbsolutePath());
                return;
            }
            return;
        }
        C14120nc.A00().ATO(new AbstractRunnableC14200nk(this) { // from class: X.9jD
            public final /* synthetic */ C74P A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(135, 2, false, false);
                this.A00 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str3);
                    File file2 = file;
                    AbstractC13530mf.A0B(file2, fileInputStream);
                    C74P c74p = this.A00;
                    C75B c75b2 = c74p.A0f;
                    if (c75b2 != null) {
                        c75b2.A03(c74p.A0k, file2.getAbsolutePath());
                    }
                } catch (IOException e) {
                    C0w9.A06("failed to cache audio file", AnonymousClass001.A0u("from: ", str3, " to: ", file.getAbsolutePath()), e);
                }
            }
        });
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
        C14360o3.A0B(str, 0);
        this.A0P = f;
        this.A0a.A00(f);
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C74M) it.next()).Dbm(str, f);
        }
    }

    @Override // X.C74R
    public final void DhX() {
        this.A0J = true;
        A03(this);
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A10.remove(interfaceC25177BCa);
    }

    @Override // X.C74S
    public final void Edi(boolean z) {
        this.A0M = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float A01;
        C70921WkQ c70921WkQ;
        XEC xec;
        C14360o3.A0B(canvas, 0);
        if (this.A0A == null) {
            Drawable drawable = this.A0Y;
            if (drawable == null) {
                C74X c74x = this.A0a;
                c74x.A00(this.A0P);
                c74x.draw(canvas);
            } else {
                drawable.draw(canvas);
            }
        } else {
            if (!this.A0S) {
                this.A0S = true;
                Iterator it = this.A10.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    ((InterfaceC25177BCa) it.next()).DZL();
                }
            }
            canvas.save();
            C14360o3.A07(getBounds());
            XEC xec2 = this.A0A;
            if ((xec2 instanceof C70921WkQ) && (c70921WkQ = (C70921WkQ) xec2) != null && c70921WkQ.A02()) {
                A01 = 1.0f;
            } else {
                A01 = A01();
                if (A01 != 1.0f) {
                    canvas.scale(A01, A01);
                }
            }
            Bitmap bitmap = this.A08;
            if (bitmap != null) {
                if (this.A0O) {
                    float A012 = A01();
                    RectF rectF = new RectF(getBounds());
                    float f = rectF.left;
                    float f2 = this.A0V;
                    rectF.left = (f - f2) / A012;
                    rectF.right = (rectF.right + f2) / A012;
                    rectF.top = (rectF.top - f2) / A012;
                    rectF.bottom = (rectF.bottom + f2) / A012;
                    float f3 = this.A0U;
                    canvas.drawRoundRect(rectF, f3, f3, this.A0X);
                }
                canvas.drawBitmap(bitmap, r4.left / A01, r4.top / A01, this.A0w);
            }
            canvas.restore();
        }
        if (this.A0N && !this.A0L) {
            this.A0N = false;
            long j = this.A06;
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (j - this.A07 <= Azf() * this.A0R) {
                if (this.A0T && this.A0H != null && (xec = this.A0A) != null) {
                    int frameCount = xec.getFrameCount();
                    int i = this.A0Q;
                    if (i <= frameCount) {
                        this.A0Q = i + 1;
                    } else {
                        this.A0T = false;
                        InterfaceC16820sZ interfaceC16820sZ = this.A0H;
                        if (interfaceC16820sZ != null) {
                            interfaceC16820sZ.invoke();
                        }
                    }
                }
                Choreographer.getInstance().postFrameCallbackDelayed(this, currentTimeMillis);
            } else {
                InterfaceC16820sZ interfaceC16820sZ2 = this.A0I;
                if (interfaceC16820sZ2 != null) {
                    interfaceC16820sZ2.invoke();
                }
            }
        }
        this.A0e.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        Rect rect2 = this.A0x;
        rect2.set(getBounds());
        int A01 = C1H4.A01(rect2.width() * 0.15f);
        rect2.inset(A01, A01);
        this.A0a.setBounds(rect2);
        Drawable drawable = this.A0Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.A0E == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C74P r3) {
        /*
            java.lang.Integer r1 = r3.A0B
            java.lang.Integer r0 = X.C05F.A01
            r2 = 1
            if (r1 != r0) goto Lc
            java.lang.String r0 = r3.A0E
            r1 = 1
            if (r0 != 0) goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r0 = r3.A0J
            if (r0 == 0) goto L1f
            boolean r0 = r3.A0K
            if (r0 != 0) goto L1f
        L15:
            if (r1 == 0) goto L1e
            if (r2 == 0) goto L1e
            java.lang.String r0 = r3.A0E
            r3.A0C(r0)
        L1e:
            return
        L1f:
            r2 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74P.A03(X.74P):void");
    }

    public static final void A04(final C74P c74p, final String str) {
        if (c74p.A0F != null && str != null) {
            if (new File(str).exists()) {
                c74p.A0D = str;
            } else {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iv
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(135, 2, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C74P c74p2 = C74P.this;
                            FileInputStream fileInputStream = new FileInputStream(c74p2.A0F);
                            String str2 = str;
                            AbstractC13530mf.A0B(AbstractC166987dD.A11(str2), fileInputStream);
                            c74p2.A0D = str2;
                        } catch (IOException e) {
                            C0w9.A06("failed to cache gif file", AnonymousClass001.A0u("from: ", C74P.this.A0F, " to: ", str), e);
                        }
                    }
                });
            }
        }
    }

    public final void A05() {
        if (!this.A0L) {
            this.A0L = true;
            invalidateSelf();
        }
    }

    public final void A06() {
        this.A05 = 0L;
        this.A02 = 0;
        this.A06 = 0L;
    }

    public final void A07() {
        if (this.A0L) {
            this.A0L = false;
            invalidateSelf();
            this.A05 = System.currentTimeMillis();
            if (((Boolean) this.A0o.getValue()).booleanValue()) {
                AbstractRunnableC14200nk abstractRunnableC14200nk = this.A0b;
                C14360o3.A0B(abstractRunnableC14200nk, 0);
                ExecutorService executorService = MWU.A00;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(5);
                    MWU.A00 = executorService;
                }
                executorService.execute(abstractRunnableC14200nk);
                return;
            }
            C14120nc.A00().ATO(this.A0b);
        }
    }

    public final void A0A(int i) {
        if (this.A0R != i) {
            this.A0R = i;
            invalidateSelf();
        }
    }

    public final void A0B(XEC xec, String str, String str2) {
        Integer num;
        C70921WkQ c70921WkQ;
        this.A0P = 1.0f;
        this.A0A = xec;
        if (this.A0d == EnumC150226pU.A0M && AbstractC185298Jv.A06(this.A0Z) && (xec instanceof C70921WkQ) && (c70921WkQ = (C70921WkQ) xec) != null) {
            c70921WkQ.A02 = C05F.A0C;
            c70921WkQ.A01 = -1;
            c70921WkQ.A00 = -1;
        }
        this.A0F = str2;
        if (AbstractC50102Ry.A00(this.A0E, str)) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        this.A0B = num;
        A04(this, this.A0D);
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A10.clear();
    }

    @Override // X.C5RS
    public final void AQg(Canvas canvas) {
        XEC xec = this.A0A;
        if (xec != null) {
            canvas.save();
            C14360o3.A07(getBounds());
            float A01 = A01();
            canvas.scale(A01, A01);
            Bitmap createBitmap = Bitmap.createBitmap(xec.getWidth(), xec.getHeight(), Bitmap.Config.ARGB_8888);
            C14360o3.A07(createBitmap);
            if (Azf() == 0) {
                Bitmap bitmap = this.A08;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, r7.left / A01, r7.top / A01, this.A0w);
                }
            } else {
                int i = 4;
                if (this.A0d == EnumC150226pU.A0M) {
                    i = 1;
                }
                int i2 = 0;
                do {
                    xec.EMm((int) (((i2 * Azf()) / 4) % Azf()), createBitmap);
                    canvas.drawBitmap(createBitmap, r7.left / A01, r7.top / A01, this.A0w);
                    i2++;
                } while (i2 < i);
            }
            createBitmap.recycle();
            canvas.restore();
        }
    }

    @Override // X.C74T
    public final long Azf() {
        if (this.A0A != null) {
            return r0.getDuration();
        }
        return 0L;
    }

    @Override // X.C74S
    public final /* synthetic */ EnumC223189sx Btb() {
        return EnumC223189sx.A04;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0e;
    }

    @Override // X.C74S
    public final boolean Ccs() {
        return this.A0M;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C74M
    public final boolean EiZ() {
        String str;
        C75B c75b = this.A0f;
        if (c75b != null) {
            String str2 = this.A0k;
            C14360o3.A0B(str2, 0);
            C206409Bx c206409Bx = (C206409Bx) C75B.A00(c75b).get(str2);
            if (c206409Bx != null && (str = c206409Bx.A01) != null) {
                return !new File(str).exists();
            }
            return true;
        }
        return false;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A0O = z;
        C6RL c6rl = this.A0e;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        XEC xec;
        int i;
        if (!this.A0L && (xec = this.A0A) != null) {
            long j2 = this.A05;
            int i2 = 0;
            if (j2 > 0) {
                i = (int) (System.currentTimeMillis() - j2);
            } else {
                i = 0;
            }
            if (xec.getDuration() > 0) {
                i2 = (this.A02 + i) % xec.getDuration();
            }
            this.A02 = i2;
            this.A05 = System.currentTimeMillis();
            if (((Boolean) this.A0o.getValue()).booleanValue()) {
                AbstractRunnableC14200nk abstractRunnableC14200nk = this.A0b;
                C14360o3.A0B(abstractRunnableC14200nk, 0);
                ExecutorService executorService = MWU.A00;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(5);
                    MWU.A00 = executorService;
                }
                executorService.execute(abstractRunnableC14200nk);
                return;
            }
            C14120nc.A00().ATO(this.A0b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C70921WkQ c70921WkQ;
        XEC xec = this.A0A;
        if ((xec instanceof C70921WkQ) && (c70921WkQ = (C70921WkQ) xec) != null && c70921WkQ.A02()) {
            int A00 = c70921WkQ.A00();
            if (Integer.valueOf(A00) != null) {
                return A00;
            }
        }
        if (this.A0A == null) {
            return this.A0u;
        }
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C70921WkQ c70921WkQ;
        XEC xec = this.A0A;
        if ((xec instanceof C70921WkQ) && (c70921WkQ = (C70921WkQ) xec) != null && c70921WkQ.A02()) {
            int A01 = c70921WkQ.A01();
            if (Integer.valueOf(A01) != null) {
                return A01;
            }
        }
        if (this.A0A == null) {
            return this.A0v;
        }
        return this.A04;
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A0A != null) {
            return false;
        }
        return true;
    }

    @Override // X.C74M
    public void onError(String str) {
        this.A0B = C05F.A0N;
        this.A0P = 1.0f;
        this.A0a.A00(1.0f);
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C74M) it.next()).onError(str);
        }
        C11T.A02(this.A0i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0w.setAlpha(i);
        this.A0X.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0w.setColorFilter(colorFilter);
        this.A0X.setColorFilter(colorFilter);
    }

    private final float A01() {
        float intrinsicWidth = getIntrinsicWidth();
        if (this.A0A != null) {
            return intrinsicWidth / r0.getWidth();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A09() {
        this.A07 = System.currentTimeMillis();
        if (this.A11) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        Iterator it = this.A10.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ((InterfaceC25177BCa) it.next()).DQ0();
        }
        A03(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.74W, java.lang.Object] */
    public C74P(Context context, Drawable drawable, UserSession userSession, InterfaceC25177BCa interfaceC25177BCa, EnumC150226pU enumC150226pU, C75B c75b, C74V c74v, C74M c74m, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5;
        C14360o3.A0B(str, 3);
        this.A0W = context;
        this.A0Z = userSession;
        this.A0l = str;
        this.A0k = str2;
        this.A0d = enumC150226pU;
        this.A0h = num;
        this.A0m = str3;
        this.A0n = str4;
        this.A0E = str5;
        this.A0y = c74v;
        this.A0s = z;
        this.A01 = 0.0f;
        this.A11 = z2;
        this.A0Y = drawable;
        this.A0t = z3;
        this.A0f = c75b;
        this.A0R = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.cds_white_a20));
        this.A0X = paint;
        this.A0V = AbstractC13880nE.A00(context, 5.0f);
        this.A0U = AbstractC13880nE.A00(context, 10.0f);
        String str6 = this.A0E;
        int i6 = c74v.A01;
        int i7 = c74v.A02;
        int i8 = c74v.A00;
        ?? obj = new Object();
        obj.A08 = str2;
        obj.A09 = str;
        obj.A07 = str6;
        obj.A00 = f;
        obj.A02 = i6;
        obj.A05 = i7;
        obj.A01 = i8;
        obj.A03 = i;
        obj.A04 = i2;
        obj.A0A = z;
        obj.A06 = num2;
        this.A0c = obj;
        this.A04 = i7;
        this.A03 = i8;
        this.A0w = new Paint(2);
        if (i6 != -1) {
            i3 = i6;
        } else {
            i6 = this.A04;
            i3 = this.A03;
        }
        C74X c74x = new C74X(num2, f, 0.65f, i6, i3, i, i2);
        c74x.setCallback(this);
        this.A0a = c74x;
        if (drawable != null) {
            i4 = drawable.getIntrinsicWidth();
        } else {
            i4 = c74x.A04;
        }
        this.A0v = i4;
        if (drawable != null) {
            i5 = drawable.getIntrinsicHeight();
        } else {
            i5 = c74x.A03;
        }
        this.A0u = i5;
        this.A0x = new Rect();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A10 = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        this.A0z = copyOnWriteArraySet2;
        this.A0i = new Runnable() { // from class: X.74Y
            @Override // java.lang.Runnable
            public final void run() {
                C74P c74p = C74P.this;
                boolean z4 = false;
                if (c74p.A0B != C05F.A0N) {
                    z4 = true;
                }
                c74p.A0N = z4;
                c74p.invalidateSelf();
            }
        };
        this.A0p = AbstractC09440dt.A01(new C9EM(this, 17));
        this.A0o = AbstractC09440dt.A01(new C9EM(this, 16));
        final int i9 = ((Boolean) this.A0p.getValue()).booleanValue() ? 1 : 3;
        this.A0b = new AbstractRunnableC14200nk(i9) { // from class: X.74Z
            @Override // java.lang.Runnable
            public final void run() {
                C74P c74p = C74P.this;
                if (c74p.A0A != null) {
                    try {
                        c74p.A06 = c74p.A05 + r2.EMm(c74p.A02, C74P.A02(c74p, r2));
                        C11T.A02(c74p.A0i);
                    } catch (OutOfMemoryError unused) {
                        c74p.A0K = true;
                        C11T.A02(c74p.A0j);
                    } catch (RuntimeException e) {
                        c74p.A0K = true;
                        if (c74p.A0B == C05F.A0C) {
                            C11T.A02(c74p.A0j);
                            return;
                        }
                        throw e;
                    }
                }
            }
        };
        this.A0j = new Runnable() { // from class: X.74a
            @Override // java.lang.Runnable
            public final void run() {
                C74P c74p = C74P.this;
                if (c74p.A0B == C05F.A0C) {
                    c74p.A0C(c74p.A0l);
                    c74p.invalidateSelf();
                }
            }
        };
        this.A0T = true;
        this.A0r = AbstractC09440dt.A01(C1572174b.A00);
        this.A0g = C2Ps.A00(context, userSession);
        this.A0q = AbstractC09440dt.A01(new C9EM(this, 18));
        if (interfaceC25177BCa != null) {
            copyOnWriteArraySet.add(interfaceC25177BCa);
        }
        if (c74m != null) {
            copyOnWriteArraySet2.add(c74m);
        }
        if (enumC150226pU != EnumC150226pU.A0M ? enumC150226pU != EnumC150226pU.A0A : str.length() > 0) {
            A0C(str);
        }
        this.A0C = str2;
        this.A0e = AbstractC1572274c.A00(context, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C74P(Context context, UserSession userSession, C74V c74v, Integer num, String str, String str2, String str3, float f, int i, int i2, boolean z) {
        this(context, null, userSession, null, EnumC150226pU.A0f, null, c74v, null, null, num, str, str2, null, null, str3, f, i, i2, z, true, false);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(num, 11);
        if (userSession != null) {
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74P(android.content.Context r25, com.instagram.common.session.UserSession r26, X.C74V r27, com.instagram.model.mediasize.GifUrlImpl r28, com.instagram.model.mediasize.GifUrlImpl r29, java.lang.Integer r30, java.lang.String r31, float r32, int r33, int r34, boolean r35) {
        /*
            r24 = this;
            r4 = 0
            r1 = 1
            r3 = r25
            X.C14360o3.A0B(r3, r1)
            r0 = 3
            r2 = r28
            X.C14360o3.A0B(r2, r0)
            r0 = 4
            r14 = r31
            X.C14360o3.A0B(r14, r0)
            r5 = r26
            if (r26 == 0) goto L4c
            X.17b r0 = X.C3WL.A00(r2)
            com.instagram.model.mediasize.GifUrlImpl r0 = (com.instagram.model.mediasize.GifUrlImpl) r0
            java.lang.String r13 = r0.A09
            X.6pU r7 = X.EnumC150226pU.A0f
            if (r29 == 0) goto L4a
            X.17b r0 = X.C3WL.A00(r29)
            com.instagram.model.mediasize.GifUrlImpl r0 = (com.instagram.model.mediasize.GifUrlImpl) r0
            java.lang.String r0 = r0.A09
        L2b:
            r23 = 0
            r2 = r24
            r9 = r27
            r12 = r30
            r18 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r6 = r4
            r8 = r4
            r10 = r4
            r11 = r4
            r15 = r4
            r16 = r4
            r17 = r0
            r22 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L4a:
            r0 = 0
            goto L2b
        L4c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74P.<init>(android.content.Context, com.instagram.common.session.UserSession, X.74V, com.instagram.model.mediasize.GifUrlImpl, com.instagram.model.mediasize.GifUrlImpl, java.lang.Integer, java.lang.String, float, int, int, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74P(android.content.Context r23, com.instagram.common.session.UserSession r24, com.instagram.common.typedurl.ImageUrl r25, com.instagram.common.typedurl.ImageUrl r26, X.InterfaceC25177BCa r27, X.C74V r28, java.lang.Integer r29, java.lang.String r30, float r31, int r32, int r33, boolean r34) {
        /*
            r22 = this;
            r20 = 1
            r0 = 3
            r1 = r25
            X.C14360o3.A0B(r1, r0)
            r0 = 4
            r12 = r30
            X.C14360o3.A0B(r12, r0)
            r3 = r24
            if (r24 == 0) goto L49
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC59522nv.A00(r1)
            java.lang.String r11 = r0.getUrl()
            X.C14360o3.A07(r11)
            X.6pU r5 = X.EnumC150226pU.A0f
            r2 = 0
            if (r26 == 0) goto L47
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC59522nv.A00(r26)
            java.lang.String r15 = r0.getUrl()
        L2a:
            r21 = 0
            r0 = r22
            r1 = r23
            r4 = r27
            r7 = r28
            r10 = r29
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r34
            r6 = r2
            r8 = r2
            r9 = r2
            r13 = r2
            r14 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L47:
            r15 = 0
            goto L2a
        L49:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74P.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, X.BCa, X.74V, java.lang.Integer, java.lang.String, float, int, int, boolean):void");
    }
}
