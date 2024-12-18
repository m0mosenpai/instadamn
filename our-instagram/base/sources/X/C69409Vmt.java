package X;

import android.content.Context;
import com.facebook.videolite.transcoder.resizer.DummySurface;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Vmt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69409Vmt {
    public DummySurface A00;
    public final Context A01;
    public final WDI A02;
    public final ACM A03;
    public final VN4 A04;
    public final U7W A05;
    public final XCA A06;
    public final Map A07;

    public C69409Vmt(Context context, WDI wdi, ACM acm, VN4 vn4, U7W u7w, XCA xca, C66036TyY c66036TyY) {
        this.A03 = acm;
        this.A06 = xca;
        this.A01 = context;
        this.A02 = wdi;
        this.A05 = u7w;
        this.A04 = vn4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A07 = linkedHashMap;
        if (c66036TyY != null) {
            AbstractC25227BEk.A1O(c66036TyY, linkedHashMap, 0);
        }
    }
}
