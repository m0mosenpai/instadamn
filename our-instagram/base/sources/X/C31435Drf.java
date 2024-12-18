package X;

import com.instagram.user.model.User;

/* renamed from: X.Drf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31435Drf extends AbstractC62682t7 {
    public final AbstractC31433Drd A00;

    public C31435Drf(C1BX c1bx, AbstractC31433Drd abstractC31433Drd, String str) {
        super(c1bx, new C31438Dri(str, 1), 250L);
        this.A00 = abstractC31433Drd;
    }

    @Override // X.AbstractC62682t7
    public final /* bridge */ /* synthetic */ void A01(Object obj, long j, Object obj2) {
        C09530e4 c09530e4 = (C09530e4) obj;
        int A0H = AbstractC166987dD.A0H(obj2);
        C14360o3.A0B(c09530e4, 0);
        User user = (User) c09530e4.A01;
        AbstractC31433Drd abstractC31433Drd = this.A00;
        C14360o3.A0B(user, 1);
        if (abstractC31433Drd.A03.add(user.getId())) {
            abstractC31433Drd.A02.A00(j, user.getId(), A0H, user.A0O(), AbstractC31171DnF.A0e(user));
        }
    }

    @Override // X.AbstractC62682t7
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
    }
}
