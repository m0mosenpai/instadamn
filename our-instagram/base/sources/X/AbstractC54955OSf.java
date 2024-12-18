package X;

import android.view.animation.PathInterpolator;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import java.util.Iterator;

/* renamed from: X.OSf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54955OSf {
    public static final C51749MtY A01 = new C51749MtY(new C50627MWo(new C51744MtT((GridSelfViewLocation) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (Object) null, 32767, false, false, false, false), C57222Pb6.A00), new C51671Ms2(null, null, null, null, C05F.A00, 0.0f, 126), C16930sl.A00, AbstractC06930Yk.A0E());
    public static final C26076Bg5 A00 = new C26076Bg5(180, new PathInterpolator(0.2f, 0.12f, 0.0f, 1.0f), 3);

    public static final C51681MsC A00(C51749MtY c51749MtY) {
        Object obj;
        Iterator A1J = AbstractC25226BEj.A1J(c51749MtY.A04);
        while (true) {
            if (A1J.hasNext()) {
                obj = A1J.next();
                if (((C51681MsC) obj).A03 == GridItemType.SELF_VIEW) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C51681MsC) obj;
    }
}
