package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P1B implements InterfaceC58169PqZ {
    public InterfaceC58202Pr8 A00;
    public C52369NFj A01;
    public final AbstractC59962oe A02;
    public final C25862BcH A03;
    public final UserSession A04;
    public final NKG A05;
    public final EnumC53380NjV A06;
    public final C81X A07;

    public P1B(AbstractC59962oe abstractC59962oe, C25862BcH c25862BcH, UserSession userSession, NKG nkg) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, nkg, c25862BcH);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = nkg;
        this.A03 = c25862BcH;
        this.A07 = C81X.A2R;
        this.A06 = EnumC53380NjV.A0K;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 7), C07Y.A00(viewLifecycleOwner));
    }

    public static C22C A00(P1B p1b) {
        UserSession userSession = p1b.A04;
        return (C22C) ((C28179CbR) userSession.A01(C28179CbR.class, new C29888DGc(userSession, 38))).A02.getValue();
    }

    public static final void A01(P1B p1b) {
        C193328hC A0b = AbstractC31176DnK.A0b(p1b.A02);
        InterfaceC58202Pr8 interfaceC58202Pr8 = p1b.A00;
        if (interfaceC58202Pr8 != null) {
            A0b.A0A(interfaceC58202Pr8.BzA());
            InterfaceC58202Pr8 interfaceC58202Pr82 = p1b.A00;
            if (interfaceC58202Pr82 != null) {
                A0b.A09(interfaceC58202Pr82.Bz9());
                AbstractC31176DnK.A1W(A0b);
                return;
            }
        }
        C14360o3.A0F("spinsTextProvider");
        throw C00O.createAndThrow();
    }

    public static final void A02(P1B p1b, boolean z) {
        List list;
        List list2;
        Object obj;
        C93094Fl c93094Fl;
        NKG nkg = p1b.A05;
        C211819a8 c211819a8 = (C211819a8) ((MUW) p1b.A03.A00.getValue()).A01;
        FragmentActivity requireActivity = p1b.A02.requireActivity();
        if (z && c211819a8 != null) {
            C47Z c47z = nkg.A00;
            if (c47z != null && (list2 = c47z.A4o) != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C5QG) it.next()).A0O = false;
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        C93094Fl c93094Fl2 = ((C5QG) obj).A02;
                        if (c93094Fl2 != null && C14360o3.A0K(c93094Fl2.A0F, c211819a8.getText()) && c93094Fl2.A02 == c211819a8.BDQ() && c93094Fl2.A08 == c211819a8.CHe() && c93094Fl2.A05 == c211819a8.Bpb() && c93094Fl2.A03 == c211819a8.BYd() && c93094Fl2.A04 == c211819a8.BYf()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C5QG c5qg = (C5QG) obj;
                if (c5qg != null && (c93094Fl = c5qg.A02) != null) {
                    List list3 = c93094Fl.A0G;
                    C14360o3.A0B(list3, 0);
                    ArrayList A0i = AbstractC167007dF.A0i(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        A0i.add(((InterfaceC93074Fh) it3.next()).EsG());
                    }
                    ClipsTextAlignment clipsTextAlignment = c93094Fl.A0B;
                    Float valueOf = Float.valueOf(c93094Fl.A00);
                    Float valueOf2 = Float.valueOf(c93094Fl.A01);
                    Float valueOf3 = Float.valueOf(c93094Fl.A02);
                    Boolean valueOf4 = Boolean.valueOf(AbstractC167007dF.A1M(c93094Fl.A09));
                    Float valueOf5 = Float.valueOf(c93094Fl.A03);
                    Float valueOf6 = Float.valueOf(c93094Fl.A04);
                    Float valueOf7 = Float.valueOf(c93094Fl.A05);
                    Float valueOf8 = Float.valueOf(c93094Fl.A06);
                    Float valueOf9 = Float.valueOf(c93094Fl.A07);
                    String str = c93094Fl.A0F;
                    ClipsTextEmphasisMode clipsTextEmphasisMode = c93094Fl.A0C;
                    ClipsTextFormatType clipsTextFormatType = c93094Fl.A0D;
                    Float valueOf10 = Float.valueOf(c93094Fl.A08);
                    Integer valueOf11 = Integer.valueOf(c93094Fl.A0A);
                    ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                    Iterator it4 = A0i.iterator();
                    while (it4.hasNext()) {
                        A0i2.add(((InterfaceC93074Fh) it4.next()).EsG());
                    }
                    C38700H2l c38700H2l = new C38700H2l(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, valueOf4, null, valueOf, valueOf2, valueOf3, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str, A0i2);
                    c5qg.A0O = true;
                    NKG.A00(nkg, AbstractC166987dD.A1J(c38700H2l));
                }
            }
            C47Z c47z2 = nkg.A00;
            if (c47z2 != null) {
                C56146OwA c56146OwA = nkg.A04;
                AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new MC7(c47z2, nkg.A01, c56146OwA, null, 48), C07Y.A00(requireActivity));
                return;
            }
            return;
        }
        C47Z c47z3 = nkg.A00;
        if (c47z3 != null && (list = c47z3.A4o) != null) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                ((C5QG) it5.next()).A0O = false;
            }
            NKG.A00(nkg, null);
        }
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        this.A00 = AbstractC54314NzY.A00(this.A04);
        AbstractC59962oe abstractC59962oe = this.A02;
        Context requireContext = abstractC59962oe.requireContext();
        InterfaceC58202Pr8 interfaceC58202Pr8 = this.A00;
        String str = "spinsTextProvider";
        if (interfaceC58202Pr8 != null) {
            int BuD = interfaceC58202Pr8.BuD();
            C52369NFj A01 = OOy.A01(requireContext, null, abstractC59962oe.getString(interfaceC58202Pr8.BuC()), Integer.valueOf(R.drawable.instagram_reshare_pano_filled_24), BuD);
            this.A01 = A01;
            C57525Pfz A00 = C57525Pfz.A00(this, 42);
            str = "spinsOption";
            A01.setOnToggleListener(new P3X(4, A00, this));
            ViewOnClickListenerC55465OkK.A01(A01, 17, A00, this);
            C52369NFj c52369NFj = this.A01;
            if (c52369NFj != null) {
                return c52369NFj;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A07;
    }
}
