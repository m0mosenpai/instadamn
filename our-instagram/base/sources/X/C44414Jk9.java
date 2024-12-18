package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.Jk9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44414Jk9 extends View implements MQL {
    public final Drawable A00;
    public final Drawable A01;
    public final C44059Jdk A02;

    @Override // X.MQL
    public final void D4u(C44059Jdk c44059Jdk, Integer num) {
        Drawable drawable;
        if (num != C05F.A00 && num != C05F.A01) {
            if (num == C05F.A0C) {
                drawable = this.A01;
            } else {
                return;
            }
        } else {
            drawable = this.A00;
        }
        setBackground(drawable);
    }

    public C44414Jk9(Context context, Drawable drawable, Drawable drawable2, C44059Jdk c44059Jdk) {
        super(context);
        setTag(c44059Jdk);
        this.A02 = c44059Jdk;
        c44059Jdk.A08.add(this);
        this.A00 = drawable;
        this.A01 = drawable2;
        Integer num = c44059Jdk.A05;
        if (num != C05F.A00 && num != C05F.A01) {
            if (num == C05F.A0C) {
                drawable = drawable2;
            } else {
                return;
            }
        }
        setBackground(drawable);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object parent = getParent();
        parent.getClass();
        setMeasuredDimension((int) Math.max((((View) parent).getMeasuredWidth() * this.A02.A03) / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, 0L), View.MeasureSpec.getSize(i2));
    }

    @Override // X.MQL
    public final void D4o(C44059Jdk c44059Jdk, long j) {
        requestLayout();
    }
}
