package X;

import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Aan, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23474Aan implements InterfaceC55932he {
    public Integer A00;
    public final int A01;
    public final ImageView A02;
    public final C55982hj A03;
    public final C55942hf A04;

    public C23474Aan(ImageView imageView, int i) {
        C14360o3.A0B(imageView, 1);
        this.A02 = imageView;
        this.A01 = i;
        C55942hf A04 = C55942hf.A04(20.0d, 30.0d);
        this.A04 = A04;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = false;
        A0R.A0A(this);
        A0R.A09(A04);
        this.A03 = A0R;
        this.A00 = C05F.A00;
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        Integer num;
        float scaleX;
        int i;
        if (c55982hj != null) {
            float f = ((float) c55982hj.A09.A00) * 180.0f;
            ImageView imageView = this.A02;
            imageView.setRotationY(f);
            float abs = Math.abs(f) % 360.0f;
            if (abs >= 90.0f && abs <= 270.0f) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            int intValue = num.intValue();
            float scaleX2 = imageView.getScaleX();
            if (intValue == 0 ? scaleX2 < 0.0f : scaleX2 > 0.0f) {
                scaleX = -imageView.getScaleX();
            } else {
                scaleX = imageView.getScaleX();
            }
            imageView.setScaleX(scaleX);
            if (this.A00 != num) {
                this.A00 = num;
                if (intValue != 0) {
                    i = R.drawable.instagram_sparkles_outline_44;
                } else {
                    i = this.A01;
                }
                imageView.setImageResource(i);
            }
        }
    }
}
