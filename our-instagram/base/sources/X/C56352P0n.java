package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P0n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56352P0n implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final C50985Mfs A03;
    public final UserSession A04;
    public final InterfaceC58310Pt2 A05;
    public final C52471NJp A06;
    public final C23031Ai A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A02.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 20), Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_24), 2131955301);
        this.A00 = A00;
        return A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        C2GT c2gt = this.A03.A00;
        AbstractC59962oe abstractC59962oe = this.A02;
        AbstractC31174DnI.A1E(abstractC59962oe.getViewLifecycleOwner(), c2gt, new C57749Pjc(this, 9), 1);
        C52471NJp c52471NJp = this.A06;
        C23031Ai A00 = AbstractC23021Ah.A00(c52471NJp.A01);
        if (!AbstractC167017dG.A1b(A00, A00.A0c, C23031Ai.A8c, 187)) {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (interfaceC19630xq.getInt("clips_share_sheet_audio_translations_new_badge_impression_count", 0) < 3) {
                c52471NJp.A00 = true;
                AbstractC50522MSa.A1T(interfaceC19630xq, "clips_share_sheet_audio_translations_new_badge_impression_count", 0);
                C05A c05a = c52471NJp.A04;
                C51748MtX c51748MtX = (C51748MtX) c05a.getValue();
                boolean z = c52471NJp.A00;
                boolean z2 = c51748MtX.A02;
                boolean z3 = c51748MtX.A03;
                List list = (List) c51748MtX.A01;
                C14360o3.A0B(list, 2);
                c05a.Egh(new C51748MtX(list, 3, z2, z3, z));
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 25), C07Y.A00(viewLifecycleOwner));
            }
        }
        c52471NJp.A00 = false;
        C05A c05a2 = c52471NJp.A04;
        C51748MtX c51748MtX2 = (C51748MtX) c05a2.getValue();
        boolean z4 = c52471NJp.A00;
        boolean z22 = c51748MtX2.A02;
        boolean z32 = c51748MtX2.A03;
        List list2 = (List) c51748MtX2.A01;
        C14360o3.A0B(list2, 2);
        c05a2.Egh(new C51748MtX(list2, 3, z22, z32, z4));
        C07S c07s2 = C07S.STARTED;
        C07X viewLifecycleOwner2 = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner2, c07s2, this, null, 25), C07Y.A00(viewLifecycleOwner2));
    }

    public C56352P0n(AbstractC59962oe abstractC59962oe, C50985Mfs c50985Mfs, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C52471NJp c52471NJp) {
        JQ0.A1O(abstractC59962oe, userSession, c52471NJp, c50985Mfs, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A06 = c52471NJp;
        this.A03 = c50985Mfs;
        this.A05 = interfaceC58310Pt2;
        this.A07 = AbstractC23021Ah.A00(userSession);
        this.A01 = C81X.A30;
    }
}
