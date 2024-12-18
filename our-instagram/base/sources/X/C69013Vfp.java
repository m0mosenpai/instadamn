package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Vfp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69013Vfp {
    public ImageUrl A00;
    public final String A01;

    public C69013Vfp(C41011IEg c41011IEg) {
        String str;
        this.A01 = c41011IEg.A01;
        ICF icf = c41011IEg.A00;
        if (icf != null && (str = icf.A00) != null) {
            this.A00 = new SimpleImageUrl(str);
        }
    }
}
