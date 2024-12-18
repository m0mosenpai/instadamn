package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fs6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35830Fs6 implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35830Fs6(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS optionalTreeField;
        C35266Fh1 c35266Fh1;
        UserSession userSession;
        boolean z;
        C2JS A0k;
        C2JS A05;
        Collection A00;
        C33226ElG c33226ElG;
        C2JS A0k2;
        C2JS requiredTreeField;
        switch (this.A00) {
            case 0:
                C2JS A0k3 = AbstractC25225BEi.A0k(anonymousClass436);
                if (A0k3 != null && (optionalTreeField = A0k3.getOptionalTreeField(0, AbstractC58317Pt9.A00(144), C59377Qda.class, -1101492816)) != null) {
                    C36286Fzd c36286Fzd = (C36286Fzd) this.A02;
                    String A002 = AbstractC58317Pt9.A00(76);
                    if (optionalTreeField.hasFieldValue(A002)) {
                        c36286Fzd.A01 = AbstractC31174DnI.A0o(optionalTreeField, A002, 0);
                    }
                    String A003 = AbstractC58317Pt9.A00(669);
                    if (optionalTreeField.hasFieldValue(A003)) {
                        c36286Fzd.A02 = AbstractC31174DnI.A0o(optionalTreeField, A003, 1);
                    }
                }
                try {
                    AbstractC166987dD.A1Y(this.A01);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                c35266Fh1 = C35266Fh1.A00;
                userSession = (UserSession) this.A02;
                z = ((EO6) this.A01).A01;
                c35266Fh1.A07(userSession, z);
                return;
            case 2:
                if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A05 = A0k.A05(QmO.class, AbstractC58317Pt9.A00(277), 1911787969)) != null && A05.hasFieldValue("is_eligible_for_seo_indexing")) {
                    C33226ElG c33226ElG2 = (C33226ElG) this.A02;
                    c33226ElG2.A0A = true;
                    ((User) this.A01).A03.ETn(AbstractC31174DnI.A0o(A05, "is_eligible_for_seo_indexing", 1));
                    A00 = C33226ElG.A00(c33226ElG2);
                    c33226ElG = c33226ElG2;
                    c33226ElG.setItems(A00);
                    return;
                }
                return;
            case 3:
                ((View) this.A01).setEnabled(true);
                C35266Fh1.A00.A07(((C35042FcF) this.A02).A04, true);
                return;
            case 4:
                ((View) this.A01).setEnabled(true);
                c35266Fh1 = C35266Fh1.A00;
                userSession = ((C35042FcF) this.A02).A04;
                z = false;
                c35266Fh1.A07(userSession, z);
                return;
            case 5:
                C33223ElB c33223ElB = (C33223ElB) this.A02;
                c33223ElB.A08 = false;
                if (anonymousClass436 != null && (A0k2 = AbstractC25225BEi.A0k(anonymousClass436)) != null && (requiredTreeField = A0k2.getRequiredTreeField(0, AbstractC58317Pt9.A00(277), QmO.class, 1911787969)) != null && requiredTreeField.hasFieldValue("is_eligible_for_seo_indexing")) {
                    ((User) this.A01).A03.ETn(AbstractC31174DnI.A0o(requiredTreeField, "is_eligible_for_seo_indexing", 1));
                }
                if (!c33223ElB.A06 && !c33223ElB.A08 && !c33223ElB.A07) {
                    A00 = C33223ElB.A00(c33223ElB);
                    c33226ElG = c33223ElB;
                    c33226ElG.setItems(A00);
                    return;
                }
                return;
            default:
                List list = (List) this.A01;
                C31535DtK c31535DtK = (C31535DtK) this.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    User A02 = ((C18A) c31535DtK.A0u.getValue()).A02(AbstractC166987dD.A1B(it));
                    if (A02 != null) {
                        A1E.add(A02);
                    }
                }
                C31542DtS c31542DtS = c31535DtK.A0E;
                if (c31542DtS == null) {
                    C14360o3.A0F("followListAdapter");
                    throw C00O.createAndThrow();
                }
                for (Object obj : A1E) {
                    c31542DtS.A0C.remove(obj);
                    c31542DtS.A0w.remove(obj);
                }
                c31542DtS.A0G(false, false);
                C9GR.A09(c31535DtK.getContext(), AbstractC166997dE.A0N(c31535DtK).getQuantityString(R.plurals.unfollow_x_following_success, A1E.size(), AbstractC25228BEl.A1Y(A1E.size())));
                return;
        }
    }
}
