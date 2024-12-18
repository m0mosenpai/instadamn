package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.D5i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29643D5i extends C03E implements C0s9 {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29643D5i(Object obj, int i) {
        super(7, obj, C9S.class, "navigateToAddFact", "navigateToAddFact(Lcom/instagram/base/fragment/IgFragment;Lcom/instagram/common/session/Session;Lcom/instagram/creator/agent/settings/constants/FactScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 1);
        this.A00 = i;
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        C09530e4 A1L;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) obj;
        EnumC27380C6j enumC27380C6j = (EnumC27380C6j) obj2;
        AbstractC167017dG.A1N(abstractC12990ll, enumC27380C6j);
        C14360o3.A0B(obj6, 5);
        Fragment fragment = (Fragment) this.receiver;
        C14360o3.A0B(fragment, 0);
        int ordinal = enumC27380C6j.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                A1L = AbstractC166987dD.A1L(obj4, obj5);
            } else {
                A1L = AbstractC166987dD.A1L(obj5, obj4);
            }
        } else {
            A1L = AbstractC166987dD.A1L(null, obj4);
        }
        Object obj8 = A1L.A00;
        Object obj9 = A1L.A01;
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L(AbstractC43591JPw.A00(18), C63.A03), AbstractC166987dD.A1L("creator_ai_add_fact_content_type", enumC27380C6j), AbstractC166987dD.A1L(AbstractC111324zv.A00(199), obj8), AbstractC166987dD.A1L(AbstractC111324zv.A00(380), obj9), AbstractC166987dD.A1L("creator_ai_fact_id", obj3), AbstractC166987dD.A1L("creator_ai_creator_fbid", obj6), AbstractC166987dD.A1L("creator_ai_entry_point_extra", obj7));
        C26765Brm c26765Brm = new C26765Brm();
        c26765Brm.setArguments(A00);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragment.requireActivity(), abstractC12990ll);
        A0r.A0B(null, c26765Brm);
        A0r.A04();
        return C0eB.A00;
    }
}
