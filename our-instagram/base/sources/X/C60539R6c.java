package X;

import java.util.Map;

/* renamed from: X.R6c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60539R6c extends AbstractC50682Uo {
    public final ABB A00;

    @Override // X.AbstractC50682Uo
    public final void A00(AbstractC58570Pxo abstractC58570Pxo) {
        AbstractC61283Rku qjz;
        Map map = abstractC58570Pxo.A03;
        Object obj = map.get("breadcrumb");
        if (obj == null) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null && C14360o3.A0K(abstractC58570Pxo.A02, "RenderOnMainThreadStarted")) {
            Object obj2 = false;
            Object obj3 = map.get("has_main_thread_layout_state");
            if (obj3 != null) {
                obj2 = obj3;
            }
            boolean A1a = AbstractC166987dD.A1a(obj2);
            ABB abb = this.A00;
            if (A1a) {
                qjz = new QJa(AbstractC58318PtA.A0i("root", map), AbstractC58318PtA.A0i("current_size_constraint", map), AbstractC166987dD.A0H(map.get("current_root_id")), AbstractC166987dD.A0H(map.get("root_id")), AbstractC58318PtA.A0i("size_constraint", map), str);
            } else {
                qjz = new QJZ(AbstractC58318PtA.A0i("root", map), str);
            }
            abb.A00(qjz, str);
        }
    }

    public C60539R6c(ABB abb) {
        super("RenderOnMainThreadStarted");
        this.A00 = abb;
    }
}
