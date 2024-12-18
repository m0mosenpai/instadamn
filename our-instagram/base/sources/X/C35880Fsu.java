package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fsu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35880Fsu implements InterfaceC28041Xi {
    public final int A00;
    public final Object A01;

    public C35880Fsu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        boolean A0K;
        switch (this.A00) {
            case 0:
                java.util.Set set = (java.util.Set) this.A01;
                String A17 = AbstractC31172DnG.A17((Map.Entry) obj);
                if (!AbstractC31171DnF.A1Y(A17) && !"ent_id".equals(A17) && !AbstractC63229Sfh.A03(A17, set)) {
                    return false;
                }
                return true;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || ((C46g) this.A01).AJj(entry.getKey(), entry.getValue())) {
                    return false;
                }
                return true;
            case 2:
            default:
                return false;
            case 3:
                C83403nh c83403nh = (C83403nh) obj;
                if (c83403nh == null) {
                    return false;
                }
                return c83403nh.A1l(C17060sy.A01.A01(((C47776L7z) this.A01).A00));
            case 4:
                A0K = C14360o3.A0K(C17060sy.A01.A01(((GFg) this.A01).A03), obj);
                break;
            case 5:
                A0K = ((List) this.A01).contains(AbstractC166997dE.A0k(((DirectShareTarget) obj).A0B()));
                break;
        }
        return !A0K;
    }
}
