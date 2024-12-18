package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.ui.LeadGenCreateFormImageView;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class N6F extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenCreateFormBaseFragment";
    public View A00;
    public View A01;
    public Group A02;
    public Group A03;
    public NestedScrollView A04;
    public IgTextView A05;
    public IgdsBottomButtonLayout A06;
    public LeadGenCreateFormImageView A07;
    public IgAutoCompleteTextView A08;
    public C3I9 A09;
    public C55089Oav A0A;
    public AnonymousClass195 A0B;
    public AnonymousClass195 A0C;
    public final InterfaceC09390do A0F = AbstractC25225BEi.A0a(C57554PgS.A01(this, 40), C57554PgS.A01(this, 39), C57534Pg8.A00(this, null, 15), AbstractC25225BEi.A1D(UFL.class));
    public final Rect A0D = AbstractC166987dD.A0U();
    public final List A0E = AbstractC166987dD.A1E();
    public final InterfaceC60152ox A0G = new C56177Owk(this, 6);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0v;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (AbstractC31176DnK.A1b(A03().A05)) {
            A0v = getString(2131964958);
        } else if (this instanceof C52565NNl) {
            A0v = AbstractC25227BEk.A0v(this, 2131964945);
        } else {
            A0v = AbstractC25227BEk.A0v(this, 2131970757);
        }
        C14360o3.A0A(A0v);
        interfaceC56362iU.setTitle(A0v);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        this.A0A = C55089Oav.A00(this, interfaceC56362iU);
        A02(this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0189, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(N6F n6f, boolean z) {
        C55089Oav c55089Oav = n6f.A0A;
        if (c55089Oav != null) {
            c55089Oav.A04(!z);
            int i = 2131964952;
            if (z) {
                i = 2131965046;
            }
            String A0v = AbstractC25227BEk.A0v(n6f, i);
            Ok5 ok5 = new Ok5(n6f, 6, z);
            InterfaceC56362iU interfaceC56362iU = c55089Oav.A01;
            interfaceC56362iU.Ect(A0v, ok5);
            interfaceC56362iU.ARk(0, false);
            C55089Oav c55089Oav2 = n6f.A0A;
            if (c55089Oav2 != null) {
                c55089Oav2.A01.ARk(0, true);
            }
        }
    }

    public final AbstractC51032Mgg A03() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52565NNl) {
            interfaceC09390do = ((C52565NNl) this).A00;
        } else {
            interfaceC09390do = ((C52564NNk) this).A00;
        }
        return (AbstractC51032Mgg) interfaceC09390do.getValue();
    }

    public final void A04() {
        if (this instanceof C52565NNl) {
            C52565NNl c52565NNl = (C52565NNl) this;
            AbstractC25225BEi.A0r(c52565NNl.requireActivity(), A00(c52565NNl.A00)).A06();
        } else {
            AbstractC25226BEj.A1P(this);
        }
    }

    public static UserSession A00(InterfaceC09390do interfaceC09390do) {
        return ((C52589NOk) interfaceC09390do.getValue()).A00;
    }

    public static final void A01(N6F n6f) {
        AbstractC51032Mgg A03 = n6f.A03();
        if (A03 instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) A03;
            P4X.A03(c52589NOk.A02, c52589NOk.A05, "lead_gen_create_form", "cover_photo_selection_bottom_sheet_impression", AbstractC51032Mgg.A00(c52589NOk));
        } else {
            C52590NOl c52590NOl = (C52590NOl) A03;
            AbstractC43592JPx.A1Q(c52590NOl.A00, c52590NOl.A04, "lead_gen_create_form", "cover_photo_selection_bottom_sheet_impression", "impression");
        }
        AbstractC13880nE.A0O(AbstractC50522MSa.A0J(n6f));
        C52108N4g c52108N4g = new C52108N4g();
        AbstractC25233BEq.A15(c52108N4g, "IgSessionManager.SESSION_TOKEN_KEY", n6f.A03().A02().token);
        C189448aO A0y = AbstractC25225BEi.A0y(n6f.A03().A02());
        AbstractC31172DnG.A1L(n6f, A0y, 2131964949);
        A0y.A1G = true;
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A0T = new PHV(c52108N4g, 1);
        A0y.A0X = new C56772PHp(c52108N4g, 4);
        AbstractC31177DnL.A14(n6f, c52108N4g, A0y);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A03().A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1.A02 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r2 != false) goto L24;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6F.onBackPressed():boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1232804419);
        super.onCreate(bundle);
        AbstractC51032Mgg A03 = A03();
        Context requireContext = requireContext();
        if (A03 instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) A03;
            LeadGenFormData leadGenFormData = c52589NOk.A04;
            if (leadGenFormData.A04.length() == 0) {
                String A022 = C55205OeH.A02(requireContext);
                C14360o3.A0B(A022, 0);
                leadGenFormData.A04 = A022;
            }
            AbstractC166997dE.A1Y(((AbstractC51032Mgg) c52589NOk).A05, false);
        } else {
            C52590NOl c52590NOl = (C52590NOl) A03;
            PromoteData promoteData = c52590NOl.A02;
            String str = promoteData.A1N;
            if (str == null || str.length() == 0) {
                promoteData.A1N = C55205OeH.A02(requireContext);
            }
            AbstractC166997dE.A1Y(((AbstractC51032Mgg) c52590NOl).A05, false);
            ((AbstractC51032Mgg) c52590NOl).A04.Egh(promoteData.A0z);
            if (c52590NOl.A09) {
                promoteData.A1s.add(AbstractC54047Nux.A00(requireContext, EnumC53254Ngs.A06));
                promoteData.A1s.add(AbstractC54047Nux.A00(requireContext, EnumC53254Ngs.A04));
            }
        }
        C0f9.A09(715772090, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(846366407);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_create_form, viewGroup, false);
        C0f9.A09(1294879675, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-885225031);
        super.onDestroy();
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(1550356155, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-61125546);
        super.onDestroyView();
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0E.clear();
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.EFx(this.A0G);
        }
        C0f9.A09(-132841912, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(473784600);
        super.onStart();
        this.A0B = PZH.A01(this, A03().A03, 23);
        this.A0C = PZH.A01(this, ((UFL) this.A0F.getValue()).A08, 24);
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(1130170888, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-74071909);
        super.onStop();
        AnonymousClass195 anonymousClass195 = this.A0B;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        AnonymousClass195 anonymousClass1952 = this.A0C;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A0B = null;
        this.A0C = null;
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(2122529723, A02);
    }
}
