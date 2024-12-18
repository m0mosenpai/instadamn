package X;

import android.view.View;
import com.facebook.R;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* renamed from: X.35p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC682735p extends AbstractC682835q {
    public final Map A00;

    public final void A03(View view, C38321qM c38321qM) {
        int i;
        Map map;
        if (this instanceof AnonymousClass361) {
            AnonymousClass361 anonymousClass361 = (AnonymousClass361) this;
            if (c38321qM.Cff() && anonymousClass361.A00) {
                map = ((AbstractC682735p) anonymousClass361).A00;
            } else {
                return;
            }
        } else {
            if (this instanceof AnonymousClass363) {
                if (!c38321qM.A5M()) {
                    return;
                }
            } else if ((this instanceof AnonymousClass367) || (this instanceof AnonymousClass366)) {
                if (c38321qM.A4n()) {
                    i = R.id.showreel_native_media_view;
                } else {
                    InterfaceC104804nl Aso = c38321qM.A0C.Aso();
                    if (Aso == null || Aso.Bx5() == null) {
                        return;
                    } else {
                        i = R.id.showreel_composition_view;
                    }
                }
                View findViewById = view.findViewById(i);
                if (findViewById == null) {
                    return;
                }
                this.A00.put(c38321qM, findViewById);
                return;
            }
            map = this.A00;
        }
        map.put(c38321qM, view);
    }

    public AbstractC682735p(Map map) {
        super(map);
        C18B c18b = new C18B();
        c18b.A04(MapMakerInternalMap.Strength.A01);
        c18b.A01();
        this.A00 = AbstractC06930Yk.A03(c18b.A00());
    }
}
