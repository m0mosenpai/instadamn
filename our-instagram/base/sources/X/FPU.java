package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class FPU {
    public final Context A00;

    public final C36208FyM A00(EB0 eb0) {
        String str;
        String string;
        Context context;
        int i;
        ImageUrl imageUrl = eb0.A01;
        if (eb0.A00 == 0) {
            str = eb0.A05;
            string = eb0.A03;
        } else {
            str = eb0.A03;
            string = this.A00.getString(2131962025);
        }
        if (!eb0.A08 && !eb0.A07) {
            context = this.A00;
            i = 2131953938;
        } else {
            context = this.A00;
            i = 2131953942;
        }
        return new C36208FyM(imageUrl, eb0, str, string, context.getString(i), eb0.A04);
    }

    public FPU(Context context) {
        this.A00 = context;
    }
}
