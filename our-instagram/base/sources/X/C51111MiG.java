package X;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.MiG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51111MiG extends C110814yt {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51111MiG(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC110824yu
    public final PointF A00(int i) {
        if (this.A00 != 0) {
            return super.A00(i);
        }
        return ((LinearLayoutManager) this.A01).AIz(i);
    }

    @Override // X.C110814yt
    public final int A07() {
        if (1 - this.A00 != 0) {
            return super.A07();
        }
        return -1;
    }

    @Override // X.C110814yt
    public final int A08() {
        return -1;
    }
}
