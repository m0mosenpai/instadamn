package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.location.Location;
import com.facebook.R;

/* renamed from: X.U6z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66279U6z extends AbstractC66278U6y implements X91 {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public final U70 A04;
    public final float A05;
    public final float A06;
    public final Paint A07;
    public final Paint A08;
    public final C2TB A09;
    public final C55982hj A0A;
    public final C55982hj A0B;
    public final XAv A0C;

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        C55982hj c55982hj;
        C55982hj c55982hj2;
        Location AuZ = this.A0C.AuZ("CurrentLocationDrawable");
        if (AuZ != null) {
            double A01 = WFW.A01(AuZ.getLongitude());
            double A00 = WFW.A00(AuZ.getLatitude());
            if (!this.A03) {
                this.A03 = true;
                c55982hj = this.A0A;
                c55982hj.A08(A01, true);
                c55982hj2 = this.A0B;
                c55982hj2.A08(A00, true);
            } else {
                c55982hj = this.A0A;
                c55982hj.A06(A01);
                c55982hj2 = this.A0B;
                c55982hj2.A06(A00);
            }
            double d = c55982hj.A09.A00;
            double d2 = c55982hj2.A09.A00;
            WFW wfw = super.A08;
            wfw.A05(this.A09);
            float[] fArr = super.A0C;
            wfw.A07(fArr, d + ((int) Math.ceil(r0.A01 - d)), d2);
            float f = fArr[0];
            float f2 = fArr[1];
            canvas.drawCircle(f, f2, this.A06, this.A07);
            canvas.drawCircle(f, f2, this.A00 * this.A05, this.A08);
        }
    }

    @Override // X.X91
    public final void Cwk(U70 u70) {
        float f;
        float f2 = u70.A00;
        if (f2 < this.A01) {
            this.A02 = !this.A02;
        }
        if (this.A02) {
            f = (1.0f - f2) * 0.25f;
        } else {
            f = 0.25f * f2;
        }
        this.A00 = 1.0f - f;
        this.A01 = f2;
        A05();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2TB, java.lang.Object] */
    public C66279U6z(Context context, C70394WTw c70394WTw, XAv xAv) {
        super(c70394WTw);
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(3);
        this.A07 = paint2;
        this.A09 = new Object();
        this.A0C = xAv;
        super.A03 = 0;
        super.A02 = 0.0f;
        float f = super.A0A;
        this.A05 = 8.0f * f;
        this.A06 = 11.0f * f;
        U70 A00 = U70.A00(0.0f, 1.0f);
        this.A04 = A00;
        A00.A05 = -1;
        A00.A08(this);
        A00.A07 = 1800L;
        AbstractC166987dD.A1N(context, paint, R.color.badge_color);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setShadowLayer(f * 14.0f, 0.0f, 0.0f, context.getColor(R.color.black_40_transparent));
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        A02.A02 = 1.0E-16d;
        A02.A00 = 1.0E-16d;
        this.A0A = A02;
        C55982hj A022 = C55952hg.A00().A02();
        A022.A06 = true;
        A022.A02 = 1.0E-16d;
        A022.A00 = 1.0E-16d;
        this.A0B = A022;
        Cwk(A00);
    }
}
