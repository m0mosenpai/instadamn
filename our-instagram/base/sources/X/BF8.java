package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class BF8 extends C0YY implements InterfaceC16820sZ {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BF8(Object obj, Object obj2, float f, int i) {
        super(0);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas;
        C25735BYv c25735BYv;
        float f;
        float[] fArr;
        char c;
        Object obj;
        InterfaceC30846DhL interfaceC30846DhL;
        switch (this.A01) {
            case 0:
                if (this.A03 != null) {
                    obj = this.A02;
                    ((TextView) obj).setTextSize(this.A00);
                }
                return C0eB.A00;
            case 1:
                if (((C78003eS) this.A03).A07 != null) {
                    TextView textView = (TextView) this.A02;
                    textView.setLineSpacing(textView.getLineSpacingExtra(), this.A00);
                }
                return C0eB.A00;
            case 2:
                if (this.A02 != null) {
                    obj = this.A03;
                    ((TextView) obj).setTextSize(this.A00);
                }
                return C0eB.A00;
            case 3:
                canvas = (Canvas) this.A02;
                c25735BYv = (C25735BYv) this.A03;
                int[] iArr = C25735BYv.A0b;
                f = 0.0f;
                canvas.rotate(c25735BYv.A01, 0.0f, 0.0f);
                fArr = c25735BYv.A0V;
                c = 0;
                canvas.scale(fArr[c], this.A00, f, f);
                Paint paint = c25735BYv.A0R;
                paint.setAlpha((int) (c25735BYv.A0D.A00 * 255.0f));
                canvas.drawCircle(f, f, 50.0f, paint);
                return C0eB.A00;
            case 4:
                canvas = (Canvas) this.A02;
                c25735BYv = (C25735BYv) this.A03;
                int[] iArr2 = C25735BYv.A0b;
                f = 0.0f;
                canvas.rotate(c25735BYv.A01 + 90.0f, 0.0f, 0.0f);
                fArr = c25735BYv.A0V;
                c = 1;
                canvas.scale(fArr[c], this.A00, f, f);
                Paint paint2 = c25735BYv.A0R;
                paint2.setAlpha((int) (c25735BYv.A0D.A00 * 255.0f));
                canvas.drawCircle(f, f, 50.0f, paint2);
                return C0eB.A00;
            case 5:
                canvas = (Canvas) this.A02;
                c25735BYv = (C25735BYv) this.A03;
                int[] iArr3 = C25735BYv.A0b;
                f = 0.0f;
                canvas.rotate(-c25735BYv.A01, 0.0f, 0.0f);
                fArr = c25735BYv.A0V;
                c = 2;
                canvas.scale(fArr[c], this.A00, f, f);
                Paint paint22 = c25735BYv.A0R;
                paint22.setAlpha((int) (c25735BYv.A0D.A00 * 255.0f));
                canvas.drawCircle(f, f, 50.0f, paint22);
                return C0eB.A00;
            default:
                C76223bS c76223bS = (C76223bS) this.A02;
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A0M = AbstractC25234BEr.A0M(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A0Y, 1.0f, 1)), C05F.A0N, 0, AbstractC25225BEi.A09(this.A00));
                C26326BkX c26326BkX = (C26326BkX) this.A03;
                C51722Yv A00 = A0M.A00(c26326BkX.A01);
                C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
                InterfaceC59172nI interfaceC59172nI = c26326BkX.A00;
                DQG dqg = DQG.A00;
                long A0J = AbstractC25230BEn.A0J();
                if (interfaceC59172nI != null) {
                    interfaceC30846DhL = C29516CzU.A00;
                } else {
                    interfaceC30846DhL = C29515CzT.A00;
                }
                return AbstractC25227BEk.A0V(new C129495tE(interfaceC59172nI, null, null, interfaceC30846DhL, null, null, null, null, null, dqg, A0J), A12, c76223bS, A00);
        }
    }
}
