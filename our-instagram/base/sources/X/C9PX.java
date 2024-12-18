package X;

import android.graphics.Canvas;
import android.text.Spannable;
import android.text.StaticLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.9PX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PX extends C6RB implements C74Q {
    public ViewTreeObserverOnPreDrawListenerC139186Rz A00;
    public Integer A01;
    public final C6RL A02;
    public final float A03;
    public final int A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9PX(android.content.Context r5, com.instagram.common.session.UserSession r6, int r7) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36326442547623809(0x810eb500013781, double:3.036326769736045E-306)
            boolean r2 = X.C18U.A06(r3, r6, r0)
            if (r2 == 0) goto L41
            android.content.Context r2 = r5.getApplicationContext()
        L15:
            r4.<init>(r2, r7)
            java.lang.Integer r2 = X.C05F.A0C
            r4.A01 = r2
            r2 = 2131099903(0x7f0600ff, float:1.7812172E38)
            int r2 = r5.getColor(r2)
            r4.A04 = r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r2 = X.AbstractC13880nE.A00(r5, r2)
            r4.A03 = r2
            boolean r0 = X.C18U.A06(r3, r6, r0)
            if (r0 == 0) goto L37
            android.content.Context r5 = r5.getApplicationContext()
        L37:
            X.C14360o3.A0A(r5)
            X.6RL r0 = X.AbstractC1572274c.A00(r5, r4)
            r4.A02 = r0
            return
        L41:
            r2 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9PX.<init>(android.content.Context, com.instagram.common.session.UserSession, int):void");
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C6RB, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.draw(canvas);
        this.A02.draw(canvas);
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A02;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz = this.A00;
            if (viewTreeObserverOnPreDrawListenerC139186Rz != null) {
                this.A0F.removeSpan(viewTreeObserverOnPreDrawListenerC139186Rz);
            }
            this.A00 = null;
            if (z) {
                float f = super.A00;
                float f2 = super.A01;
                Spannable spannable = this.A0F;
                C14360o3.A07(spannable);
                if (AbstractC190978ct.A00(spannable, 0, spannable.length()) != C6S5.A05) {
                    float f3 = this.A03;
                    f += f3;
                    f2 += f3;
                }
                int i = this.A04;
                float textSize = this.A0b.getTextSize() / 4.0f;
                ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz2 = new ViewTreeObserverOnPreDrawListenerC139186Rz(AbstractC139126Rt.A02(staticLayout, f, f2, f2, textSize, 1.0f), textSize, i);
                this.A00 = viewTreeObserverOnPreDrawListenerC139186Rz2;
                Spannable spannable2 = this.A0F;
                spannable2.setSpan(viewTreeObserverOnPreDrawListenerC139186Rz2, 0, spannable2.length(), 16711698);
            }
            C6RL c6rl = this.A02;
            if (z2) {
                c6rl.A01();
            } else {
                c6rl.A00();
            }
            invalidateSelf();
        }
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return true;
    }
}
