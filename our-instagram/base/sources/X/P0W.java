package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0W implements InterfaceC58169PqZ {
    public C52368NFi A00;
    public final AbstractC59962oe A01;
    public final NKM A02;
    public final C81X A03;
    public final UserSession A04;
    public final InterfaceC58310Pt2 A05;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 6), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        EnumC53307Nhj enumC53307Nhj;
        Drawable drawable;
        AbstractC59962oe abstractC59962oe = this.A01;
        Context requireContext = abstractC59962oe.requireContext();
        C0UO c0uo = this.A02.A07;
        InterfaceC173987oq interfaceC173987oq = (InterfaceC173987oq) ((C51756Mtf) c0uo.getValue()).A00;
        String str2 = null;
        if (interfaceC173987oq != null) {
            str = interfaceC173987oq.getUsername();
        } else {
            str = null;
        }
        Context requireContext2 = abstractC59962oe.requireContext();
        String string = abstractC59962oe.requireContext().getString(2131975517);
        Context requireContext3 = abstractC59962oe.requireContext();
        InterfaceC173987oq interfaceC173987oq2 = (InterfaceC173987oq) ((C51756Mtf) c0uo.getValue()).A00;
        if (interfaceC173987oq2 != null) {
            enumC53307Nhj = interfaceC173987oq2.AY3();
        } else {
            enumC53307Nhj = null;
        }
        String A0t = AbstractC31174DnI.A0t(requireContext2, string, C50701MZw.A03(requireContext3, enumC53307Nhj), 2131971975);
        InterfaceC173987oq interfaceC173987oq3 = (InterfaceC173987oq) ((C51756Mtf) c0uo.getValue()).A00;
        if (interfaceC173987oq3 != null) {
            str2 = interfaceC173987oq3.getProfilePicUrl();
        }
        C52368NFi c52368NFi = new C52368NFi(requireContext);
        AbstractC50522MSa.A0y(c52368NFi);
        c52368NFi.setOrientation(1);
        c52368NFi.setTitle(str);
        if (str2 != null && (drawable = requireContext.getDrawable(R.drawable.avatar_bottom_badge_threads)) != null) {
            c52368NFi.setProfileImage(abstractC59962oe, str2, drawable);
        }
        if (A0t != null) {
            c52368NFi.setSubtitle(A0t);
        }
        this.A00 = c52368NFi;
        return c52368NFi;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A03;
    }

    public P0W(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NKM nkm) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A04 = userSession;
        this.A02 = nkm;
        this.A05 = interfaceC58310Pt2;
        this.A03 = C81X.A2F;
    }
}
