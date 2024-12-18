package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.related.model.RelatedItem;

/* loaded from: classes11.dex */
public final class V83 extends C3CI {
    public final C69227Vjv A00;
    public final UGU A01;

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object A0O;
        C14360o3.A0B(c3ab, 0);
        UGU ugu = this.A01;
        if (ugu instanceof V7o) {
            if (i != 0) {
                A0O = AbstractC001800i.A0O(ugu.A04, i - 1);
            } else {
                return;
            }
        } else {
            A0O = AbstractC001800i.A0O(ugu.A04, i);
        }
        RelatedItem relatedItem = (RelatedItem) A0O;
        if (relatedItem != null) {
            c3ab.FDn(relatedItem.A03, relatedItem, i);
        }
    }

    @Override // X.C36Z
    public final Class CAO() {
        return RelatedItem.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtI(Object obj, int i) {
        String str;
        Integer num;
        InterfaceC11380iw interfaceC11380iw;
        UserSession userSession;
        C19260xA c19260xA;
        String A01;
        RelatedItem relatedItem = (RelatedItem) obj;
        C14360o3.A0B(relatedItem, 0);
        C69227Vjv c69227Vjv = this.A00;
        int intValue = relatedItem.A00().intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                String str2 = relatedItem.A03;
                C14360o3.A07(str2);
                if (c69227Vjv.A03.add(str2)) {
                    num = C05F.A0C;
                    interfaceC11380iw = c69227Vjv.A00;
                    userSession = c69227Vjv.A02;
                    c19260xA = c69227Vjv.A01;
                    A01 = relatedItem.A01();
                    str = relatedItem.A03;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            str = relatedItem.A03;
            C14360o3.A07(str);
            if (!c69227Vjv.A03.add(str)) {
                return;
            }
            num = C05F.A00;
            interfaceC11380iw = c69227Vjv.A00;
            userSession = c69227Vjv.A02;
            c19260xA = c69227Vjv.A01;
            A01 = relatedItem.A01();
        }
        VT6.A00(interfaceC11380iw, c19260xA, userSession, num, A01, str);
    }

    public V83(C69227Vjv c69227Vjv, UGU ugu) {
        this.A01 = ugu;
        this.A00 = c69227Vjv;
    }
}
