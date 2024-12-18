package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.P0q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56355P0q implements InterfaceC58169PqZ {
    public final NK6 A00;
    public final NKA A01;
    public final NKE A02;
    public final C55092Ob3 A03;
    public final EnumC53380NjV A04;
    public final C81X A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View inflate = AbstractC31175DnJ.A06(this.A06).inflate(R.layout.composer_fundraiser_row, (ViewGroup) null);
        AbstractC43592JPx.A1T(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        AbstractC50522MSa.A0y(viewGroup);
        C55092Ob3 c55092Ob3 = this.A03;
        if (C6WI.A01().A0A != null) {
            NKE nke = c55092Ob3.A0C;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = C6WI.A01().A0A;
            C14360o3.A0B(existingStandaloneFundraiserForFeedModel, 0);
            nke.A04 = existingStandaloneFundraiserForFeedModel;
            C6WI.A01().A0A = null;
        }
        User A10 = AbstractC166987dD.A10(c55092Ob3.A0B);
        NKE nke2 = c55092Ob3.A0C;
        nke2.A01 = A10.A03.BzX();
        InterfaceC81733ki AYu = A10.A03.AYu();
        nke2.A00 = AYu;
        HashSet A1H = AbstractC166987dD.A1H();
        if (AYu != null) {
            Iterator it = AYu.B9F().iterator();
            while (it.hasNext()) {
                String AnD = ((InterfaceC43571JMf) it.next()).AnD();
                if (AnD != null) {
                    A1H.add(AnD);
                }
            }
        }
        nke2.A06 = A1H;
        FragmentActivity requireActivity = c55092Ob3.A0A.requireActivity();
        c55092Ob3.A03 = viewGroup;
        c55092Ob3.A02 = viewGroup.requireViewById(R.id.suggestion_pills_scroll_view);
        c55092Ob3.A04 = AbstractC31173DnH.A0F(c55092Ob3.A03, R.id.suggestion_pills_view_group);
        c55092Ob3.A00 = c55092Ob3.A03.requireViewById(R.id.create_fundraiser_label);
        c55092Ob3.A01 = c55092Ob3.A03.requireViewById(R.id.create_fundraiser_upsell_label);
        c55092Ob3.A05 = new C55023OWx(requireActivity, c55092Ob3.A00);
        c55092Ob3.A02();
        c55092Ob3.A03();
        return viewGroup;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        C55092Ob3 c55092Ob3 = this.A03;
        String str = this.A02.A05;
        LinkedHashSet linkedHashSet = c55092Ob3.A0C.A07;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        linkedHashSet.clear();
        linkedHashSet.addAll(AbstractC53940NtD.A00(str));
        if (!linkedHashSet2.equals(linkedHashSet)) {
            c55092Ob3.A03();
        }
        AbstractC59962oe abstractC59962oe = this.A06;
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57173PZr A02 = C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 32);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, A02, A00);
        C07S c07s2 = C07S.STARTED;
        C07X viewLifecycleOwner2 = abstractC59962oe.getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, C57173PZr.A02(viewLifecycleOwner2, c07s2, this, null, 33), C07Y.A00(viewLifecycleOwner2));
        C07X A0K2 = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, C57173PZr.A02(A0K, c07s2, this, null, 34), C07Y.A00(A0K));
        AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, C57173PZr.A02(A0K2, c07s2, this, null, 35), C07Y.A00(A0K2)).getLifecycle().A09(new MU2(this, 4));
    }

    public C56355P0q(AbstractC59962oe abstractC59962oe, UserSession userSession, NK6 nk6, NKA nka, NKE nke) {
        AbstractC167027dH.A13(userSession, abstractC59962oe, nke);
        C14360o3.A0B(nka, 5);
        this.A07 = userSession;
        this.A06 = abstractC59962oe;
        this.A02 = nke;
        this.A00 = nk6;
        this.A01 = nka;
        this.A03 = new C55092Ob3(abstractC59962oe, userSession, nke);
        this.A05 = C81X.A02;
        this.A04 = EnumC53380NjV.A02;
    }
}
