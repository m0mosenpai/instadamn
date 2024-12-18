package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.80O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80O extends IgSimpleImageView {
    public boolean A00;
    public final AnonymousClass815 A01;

    public C80O(UserSession userSession, Context context) {
        super(context);
        this.A01 = new AnonymousClass815(userSession, context, true);
    }

    @Override // com.instagram.common.ui.base.IgSimpleImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C6RB c6rb;
        float f;
        C6RB c6rb2;
        C6RC c6rc;
        V7K v7k;
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            Drawable drawable = getDrawable();
            C6RD c6rd = null;
            if ((drawable instanceof V7K) && (v7k = (V7K) drawable) != null) {
                v7k.A0b();
            }
            Drawable drawable2 = getDrawable();
            if (drawable2 instanceof C6RB) {
                c6rb = (C6RB) drawable2;
            } else {
                c6rb = null;
            }
            float f2 = 0.0f;
            if (c6rb != null) {
                f = C6RE.A00(c6rb.A0G);
            } else {
                f = 0.0f;
            }
            canvas.save();
            canvas.translate(f, 0.0f);
            if (c6rb != null) {
                c6rb.A0S(canvas);
            }
            canvas.restore();
            if (c6rb != null && (c6rc = c6rb.A0I) != null) {
                float A01 = AbstractC23029ADl.A01(c6rc, c6rb.A0b.getTextSize());
                if (Float.valueOf(A01) != null) {
                    f2 = A01;
                }
            }
            int width = (int) (getWidth() + (2.0f * f2));
            long nanoTime = System.nanoTime();
            AnonymousClass815 anonymousClass815 = this.A01;
            Drawable drawable3 = getDrawable();
            if ((drawable3 instanceof C6RB) && (c6rb2 = (C6RB) drawable3) != null) {
                c6rd = c6rb2.A0J;
            }
            float f3 = f + f2;
            int i = width;
            if (width < 1) {
                i = 1;
            }
            float f4 = 1.0f / i;
            int height = getHeight();
            if (height < 1) {
                height = 1;
            }
            anonymousClass815.A02(canvas, AbstractC227029zy.A00(c6rd, f3, f4, 1.0f / height, 1.0f), new C207029Eh(canvas, f2, 2), new B8V(c6rb, f, f2), width, canvas.getHeight(), nanoTime);
            return;
        }
        super.onDraw(canvas);
    }

    public final void A00() {
        APK B3e;
        C80Q c80q = this.A01.A00;
        if (c80q != null && (B3e = c80q.B3e()) != null) {
            synchronized (B3e) {
                B3e.A05.clear();
                B3e.A02.A00.clear();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        C80Q c80q;
        int A06 = C0f9.A06(1977465285);
        AnonymousClass815 anonymousClass815 = this.A01;
        if (anonymousClass815 != null && (c80q = anonymousClass815.A00) != null) {
            c80q.cleanup();
        }
        super.onDetachedFromWindow();
        C0f9.A0D(-2074510809, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1.A0F.length() <= 0) goto L10;
     */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            super.setImageDrawable(r3)
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            boolean r0 = r1 instanceof X.C6RB
            if (r0 == 0) goto L1c
            X.6RB r1 = (X.C6RB) r1
            if (r1 == 0) goto L1c
            X.6RC r0 = r1.A0I
            if (r0 == 0) goto L1c
            android.text.Spannable r0 = r1.A0F
            int r1 = r0.length()
            r0 = 1
            if (r1 > 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.A00 = r0
            X.815 r1 = r2.A01
            if (r0 == 0) goto L2b
            X.80Q r0 = r1.A00
            if (r0 == 0) goto L2a
            r0.Enz()
        L2a:
            return
        L2b:
            monitor-enter(r1)
            X.80Q r0 = r1.A00     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L33
            r0.Eoh()     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r1)
            return
        L35:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80O.setImageDrawable(android.graphics.drawable.Drawable):void");
    }
}
