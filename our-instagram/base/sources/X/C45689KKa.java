package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KKa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45689KKa extends C5RN {
    public final RectF A00;
    public final C45128JyU A01;
    public final AbstractC44205Jg9 A02;
    public final C44201Jg4 A03;
    public final InterfaceC16820sZ A04;
    public final float A05;
    public final float A06;
    public final Context A07;

    public C45689KKa(Context context, UserSession userSession, C45128JyU c45128JyU, InterfaceC16820sZ interfaceC16820sZ, float f, float f2, int i, int i2) {
        C14360o3.A0B(userSession, 2);
        this.A07 = context;
        this.A05 = f;
        this.A06 = f2;
        this.A01 = c45128JyU;
        this.A04 = interfaceC16820sZ;
        C45987KXb c45987KXb = C45987KXb.A00;
        this.A02 = c45987KXb;
        this.A03 = new C44201Jg4(context, userSession, AbstractC44199Jg2.A00(c45128JyU), c45987KXb, new C50158MDl(this, 41));
        this.A00 = AbstractC166987dD.A0X();
        setBounds(0, 0, i, i2);
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        A00();
        canvas.save();
        canvas.save();
        RectF rectF = this.A00;
        canvas.translate(rectF.left, rectF.top);
        this.A03.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    private final void A00() {
        C44201Jg4 c44201Jg4 = this.A03;
        int A0H = AbstractC166997dE.A0H(c44201Jg4);
        int A0G = AbstractC166997dE.A0G(c44201Jg4);
        RectF rectF = this.A00;
        float f = this.A05;
        float A02 = AbstractC166987dD.A02(A0H);
        float f2 = this.A06;
        rectF.set(f - A02, f2 - A0G, f + A02, f2);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A03);
    }
}
