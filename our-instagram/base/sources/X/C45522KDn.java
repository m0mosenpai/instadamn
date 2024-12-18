package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KDn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45522KDn extends AbstractC43842Ja5 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AppreciationGiftingBottomSheetFragment";
    public Space A00;
    public MO5 A01;
    public IgdsBottomButtonLayout A02;
    public C189478aR A03;
    public SpinnerImageView A04;
    public final List A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final C47245KuI A09;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "appreciation_gifting";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        getParentFragmentManager().A0q(new UF3(this, 1), true);
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.loading);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.send_button);
        this.A02 = A0j;
        if (A0j == null) {
            str = "sendButton";
        } else {
            A0j.setPrimaryButtonEnabled(false);
            Space space = (Space) view.requireViewById(R.id.space_terms);
            this.A00 = space;
            if (space == null) {
                str = "termsPlaceHolder";
            } else {
                space.getLayoutParams().height = (int) (AbstractC13880nE.A03(requireContext(), 12.0f) * 1.12f * 2.0f);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 14);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                AbstractC23641Du.A05(anonymousClass191, mcq, A00);
                C44552Jmy c44552Jmy = (C44552Jmy) this.A08.getValue();
                String A01 = AbstractC153636vY.A01(requireArguments(), "arg_gifting_media_id");
                C14360o3.A0B(A01, 0);
                if (C14360o3.A0K(c44552Jmy.A07.getValue(), C48233LWi.A00)) {
                    C47740L6e c47740L6e = c44552Jmy.A01;
                    AbstractC43592JPx.A1W(541931976, c47740L6e.A01, true);
                    c47740L6e.A00.markerStart(541931976);
                    AbstractC23641Du.A05(anonymousClass191, new C50120MBu(c44552Jmy, A01, null, 9), AbstractC141776au.A00(c44552Jmy));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final List A00(C45037JwS c45037JwS) {
        List list = (List) c45037JwS.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((C45114Jxj) it.next()).A05);
        }
        return A0q;
    }

    public static final void A01(C45522KDn c45522KDn, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C7UR c7ur = C7UR.A0A;
        C7UR A00 = C7US.A00(c45522KDn.requireContext());
        c45522KDn.A07.getValue();
        A00.A05(new C49468Lth(c45522KDn, interfaceC16660sJ, z), str);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.KHp, X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        KI4 ki4 = new KI4(this.A09, this, AbstractC166987dD.A0r(this.A07));
        ?? obj = new Object();
        C45630KHt c45630KHt = new C45630KHt((C47244KuH) this.A06.getValue(), this);
        ?? obj2 = new Object();
        obj2.A00 = null;
        return AbstractC16960so.A1Q(ki4, obj, c45630KHt, obj2, new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50356MLi(this, 28));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C44552Jmy c44552Jmy = (C44552Jmy) this.A08.getValue();
        C47740L6e c47740L6e = c44552Jmy.A01;
        AbstractC43592JPx.A1W(541931976, c47740L6e.A01, false);
        c47740L6e.A00.markerEnd(541931976, (short) 22);
        LJ7 lj7 = c44552Jmy.A00;
        C44882Jtw A00 = LJ7.A00(EnumC46198Kca.A06, lj7, C05F.A0j);
        LJ3 lj3 = lj7.A02;
        String str = lj7.A01.A03;
        C16920sk A0E = AbstractC06930Yk.A0E();
        AbstractC167017dG.A1O(str, A0E);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lj3.A02, "user_click_appreciationgiver_exit");
        if (A0f.isSampled()) {
            LJ3.A01(A0f, lj3, str);
            JQ0.A13(lj3.A01, A0f, A00);
            AbstractC43593JPy.A1K(A0f, A0E);
        }
        return false;
    }

    public C45522KDn() {
        C50250MHf A01 = C50250MHf.A01(this, 36);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 33), 34));
        this.A08 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 35), A01, new C29897DGl(38, null, A00), AbstractC25225BEi.A1D(C44552Jmy.class));
        ArrayList A17 = AbstractC25225BEi.A17(6);
        int i = 0;
        do {
            A17.add(new Object());
            i++;
        } while (i < 6);
        this.A05 = A17;
        this.A09 = new C47245KuI(this);
        this.A06 = AbstractC09440dt.A01(C50250MHf.A01(this, 32));
        this.A07 = AbstractC60492pY.A02(this);
    }
}
