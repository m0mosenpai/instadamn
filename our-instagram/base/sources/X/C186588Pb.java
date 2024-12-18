package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186588Pb implements InterfaceC186578Pa {
    @Override // X.InterfaceC186578Pa
    public final YQ3 Cmd(Bitmap bitmap, UserSession userSession, C186668Pj c186668Pj, C22978ABc c22978ABc) {
        YQ3 c72291Xao;
        C14360o3.A0B(c186668Pj, 0);
        C14360o3.A0B(c22978ABc, 2);
        String str = c186668Pj.A00.A01;
        C14360o3.A07(str);
        if ("Pen".equals(str)) {
            c72291Xao = new C72286Xaj();
        } else if ("Marker".equals(str)) {
            c72291Xao = new C72285Xai();
        } else if ("Neon".equals(str)) {
            c72291Xao = new C72277Xaa();
        } else if ("Eraser".equals(str)) {
            c72291Xao = new C72281Xae();
        } else if ("Special".equals(str)) {
            c72291Xao = new C72292Xap();
        } else if (AbstractC111324zv.A00(1723).equals(str)) {
            c72291Xao = new C72295Xas();
        } else {
            if ("Arrow".equals(str)) {
                c72291Xao = new C72291Xao();
            }
            return null;
        }
        c72291Xao.CNp(c22978ABc);
        if (!c72291Xao.isValid()) {
            return null;
        }
        return c72291Xao;
    }
}
