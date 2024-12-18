package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8PX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PX implements C8PY {
    public X1v A00;
    public A8B A01;
    public C22978ABc A02;
    public final UserSession A03;
    public final C8PW A04;
    public final java.util.Set A06 = new HashSet();
    public final InterfaceC186578Pa A05 = new InterfaceC186578Pa() { // from class: X.8PZ
        public final Map A00;

        @Override // X.InterfaceC186578Pa
        public final YQ3 Cmd(Bitmap bitmap, UserSession userSession, C186668Pj c186668Pj, C22978ABc c22978ABc) {
            C14360o3.A0B(c186668Pj, 0);
            C14360o3.A0B(c22978ABc, 2);
            InterfaceC186578Pa interfaceC186578Pa = (InterfaceC186578Pa) this.A00.get(c186668Pj.A00.A00);
            if (interfaceC186578Pa != null) {
                return interfaceC186578Pa.Cmd(bitmap, userSession, c186668Pj, c22978ABc);
            }
            return null;
        }

        {
            HashMap hashMap = new HashMap();
            this.A00 = hashMap;
            hashMap.put("LegacyBrushClass", new Object());
            hashMap.put("PointBrush", new InterfaceC186578Pa() { // from class: X.8Pc
                public final C186608Pd A00 = new Object() { // from class: X.8Pd
                    public final InterfaceC186628Pf[] A00 = {new Object(), new Object()};
                };

                @Override // X.InterfaceC186578Pa
                public final YQ3 Cmd(Bitmap bitmap, UserSession userSession, C186668Pj c186668Pj, C22978ABc c22978ABc) {
                    new Point();
                    throw new NullPointerException("getDefault");
                }
            });
        }
    };

    @Override // X.C8PY
    public final void DIn(X1v x1v, C22978ABc c22978ABc) {
        this.A02 = c22978ABc;
        this.A00 = x1v;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((C186688Pl) it.next()).DIn(x1v, c22978ABc);
        }
    }

    public C8PX(UserSession userSession, C8PW c8pw) {
        this.A04 = c8pw;
        this.A03 = userSession;
    }
}
