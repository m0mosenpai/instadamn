package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.R;
import java.io.File;

/* renamed from: X.AeI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23683AeI implements XCU, BC3 {
    public final C1828789i A00;
    public final Context A01;

    @Override // X.XCU
    public final void onFailure(Exception exc) {
    }

    @Override // X.BC3
    public final void ALh(BE6 be6) {
        Bitmap bitmap;
        if (be6 != null) {
            bitmap = be6.BQU();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            Context context = this.A01;
            AbstractC70197WGf.A04(context, bitmap, this, C50472Tr.A02(context, false), context.getColor(R.color.badge_color));
        } else {
            Context context2 = this.A01;
            AbstractC70197WGf.A06(context2, this, C50472Tr.A02(context2, false), 0.2f, -16777216, -16777216, false);
        }
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        this.A00.A01(C8IU.A03(file, 1, 0));
    }

    public C23683AeI(Context context, C1828789i c1828789i) {
        AbstractC167017dG.A1P(context, c1828789i);
        this.A01 = context;
        this.A00 = c1828789i;
    }
}
