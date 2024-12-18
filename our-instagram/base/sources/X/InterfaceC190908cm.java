package X;

import com.facebook.R;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* renamed from: X.8cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC190908cm {
    public static final C190918cn A00 = C190918cn.A00;
    public static final InterfaceC190908cm A01 = new InterfaceC190908cm() { // from class: X.8co
        @Override // X.InterfaceC190908cm
        public final TextColors ALM(int i) {
            TextShadow textShadow;
            if (i == -1) {
                textShadow = TextShadow.A04;
            } else {
                textShadow = TextShadow.A03;
            }
            return new TextColors(textShadow, i);
        }
    };
    public static final InterfaceC190908cm A02 = new InterfaceC190908cm() { // from class: X.8cp
        public final float[] A00 = new float[3];
        public final float[] A01 = new float[3];

        /* JADX WARN: Type inference failed for: r1v9, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
        @Override // X.InterfaceC190908cm
        public final TextColors ALM(int i) {
            int A07;
            int i2 = -16777216;
            if (i == -16777216) {
                A07 = -4969017;
            } else {
                float[] fArr = this.A00;
                AbstractC56842jH.A09(i, fArr);
                float[] fArr2 = this.A01;
                fArr2[0] = fArr[0];
                fArr2[1] = Math.min(1.0f, fArr[1] * 1.1f);
                fArr2[2] = 0.95f;
                i2 = AbstractC56842jH.A07(fArr2);
                AbstractC56842jH.A09(i, fArr);
                fArr2[0] = fArr[0];
                float f = 0.0f;
                if (fArr[1] != 0.0f) {
                    f = 1.0f;
                }
                fArr2[1] = f;
                fArr2[2] = 0.8f;
                A07 = AbstractC56842jH.A07(fArr2);
            }
            ?? obj = new Object();
            obj.A00 = A07;
            obj.A01 = R.dimen.memory_subtitle_text_size;
            obj.A02 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
            return new TextColors(obj, i2);
        }
    };

    TextColors ALM(int i);
}
