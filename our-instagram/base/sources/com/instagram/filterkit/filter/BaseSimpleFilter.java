package com.instagram.filterkit.filter;

import X.C209089Mq;
import X.C72783Xn3;
import X.C72832XoQ;
import X.C9N1;
import X.C9N2;
import X.XO3;
import X.YPq;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class BaseSimpleFilter extends BaseFilter {
    public static final C9N2 A03 = C9N1.A00();
    public C72832XoQ A00;
    public XO3 A01;
    public final C72783Xn3 A02 = new Object();

    @Override // X.BCA
    public final void AHR(YPq yPq) {
        XO3 xo3 = this.A01;
        if (xo3 != null) {
            int i = xo3.A00;
            BitmapFactory.Options options = C209089Mq.A00;
            GLES20.glDeleteProgram(i);
            this.A01 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public BaseSimpleFilter(Parcel parcel) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public BaseSimpleFilter() {
    }
}
