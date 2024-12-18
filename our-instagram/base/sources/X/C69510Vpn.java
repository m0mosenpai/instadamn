package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.Vpn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69510Vpn {
    public final ArrayList A00(Layout layout, float f, int i, int i2, boolean z) {
        float f2;
        ArrayList arrayList = new ArrayList();
        float f3 = f * 0.05f;
        float f4 = f * 0.2f;
        float f5 = f4 * 2.5f;
        if (z) {
            f2 = 0.1f * f;
        } else {
            f2 = 0.0f;
        }
        boolean A03 = AbstractC13620mo.A03(layout.getText().toString());
        int lineCount = layout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int lineForOffset = layout.getLineForOffset(i);
            int lineForOffset2 = layout.getLineForOffset(i2);
            if (lineForOffset <= i3 && i3 <= lineForOffset2 && !TextUtils.isEmpty(AbstractC002300n.A0d(AbstractC65702TsY.A0X(layout, i3), "\n", "", false))) {
                RectF A00 = AbstractC70141W6t.A00(layout, f3, f4, f3, f5, f2, 1.0f, i3, lineForOffset, lineForOffset2, i, i2, true, A03);
                if (A00.width() > 2.0f * f3) {
                    arrayList.add(new C69621VsO(A00, 22.25d, f, A03));
                }
            }
        }
        return arrayList;
    }
}
