package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes7.dex */
public abstract class IN1 {
    public final float A00;
    public final C41630IbL A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final ExtendedImageUrl A00(Context context) {
        C41630IbL c41630IbL = this.A01;
        if (c41630IbL != null) {
            ExtendedImageUrl extendedImageUrl = c41630IbL.A00;
            if (extendedImageUrl == null) {
                ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) c41630IbL.A02.invoke(context);
                c41630IbL.A00 = extendedImageUrl2;
                return extendedImageUrl2;
            }
            return extendedImageUrl;
        }
        return null;
    }

    public final String A01() {
        if (this instanceof C39353HZs) {
            return ((C39353HZs) this).A02;
        }
        if (this instanceof C39352HZr) {
            return ((C39352HZr) this).A02;
        }
        if (this instanceof C39349HZo) {
            return ((C39349HZo) this).A01;
        }
        if (this instanceof C39351HZq) {
            return ((C39351HZq) this).A01;
        }
        if (this instanceof C39350HZp) {
            return ((C39350HZp) this).A02;
        }
        if (this instanceof C39354HZt) {
            return ((C39354HZt) this).A02;
        }
        return this.A04;
    }

    public IN1(C41630IbL c41630IbL, Integer num, String str, String str2, float f) {
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A00 = f;
        this.A01 = c41630IbL;
    }
}
