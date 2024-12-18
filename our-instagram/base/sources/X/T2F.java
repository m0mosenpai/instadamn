package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2F implements InterfaceC65377TjA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    @Override // X.InterfaceC65377TjA
    public final List ANE(C62577SHc c62577SHc) {
        int i;
        C14360o3.A0B(c62577SHc, 0);
        String obj = c62577SHc.A02.toString().subSequence(c62577SHc.A01, c62577SHc.A00).toString();
        int i2 = 0;
        for (int i3 = 0; i3 < obj.length(); i3++) {
            if (obj.charAt(i3) == '\n') {
                i2++;
            }
        }
        Context context = this.A03;
        R8I r8i = new R8I(context, i2);
        int i4 = this.A02;
        ((AbstractC63487So1) r8i).A01 = i4;
        Paint paint = ((AbstractC63487So1) r8i).A02;
        if (paint != null) {
            paint.setColor(i4);
        }
        ((AbstractC63487So1) r8i).A00 = TypedValue.applyDimension(1, 12.0f, AbstractC167007dF.A0K(context));
        if (c62577SHc.A03) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        return AbstractC16960so.A1Q(new TextAppearanceSpan(context, i), r8i);
    }

    public T2F(Context context, int i, int i2, int i3) {
        this.A03 = context;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
