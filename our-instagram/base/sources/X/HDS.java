package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.model.reels.Reel;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HDS extends C53Z implements JIC, InterfaceC41501vz, InterfaceC60122ou, JPi {
    public static final String __redex_internal_original_name = "ReelQuestionResponsesListFragment";
    public C38370Gu6 A00;
    public RecyclerView A01;
    public C41181vS A02;
    public C41189ILc A03;
    public C37987GnX A04;

    @Override // X.JHI
    public final /* synthetic */ void Dcf(C41628IbJ c41628IbJ, int i) {
    }

    @Override // X.JIC
    public final void EMa() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (RecyclerView) view.findViewById(R.id.question_responses_list);
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        C41189ILc c41189ILc = this.A03;
        if (c41189ILc == null) {
            str = "questionResponsesListHelper";
        } else {
            RecyclerView recyclerView = this.A01;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                c41189ILc.A00(recyclerView, dimensionPixelSize, dimensionPixelSize);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JIC
    public final C41181vS Aum() {
        return this.A02;
    }

    @Override // X.JIC
    public final IF7 BjY(int i) {
        C38370Gu6 c38370Gu6 = this.A00;
        C14360o3.A0A(c38370Gu6);
        C41628IbJ c41628IbJ = (C41628IbJ) c38370Gu6.A01.get(i);
        C14360o3.A07(c41628IbJ);
        return I5K.A00(c41628IbJ);
    }

    @Override // X.JIC
    public final int BjZ() {
        C38370Gu6 c38370Gu6 = this.A00;
        C14360o3.A0A(c38370Gu6);
        return c38370Gu6.A01.size();
    }

    @Override // X.JIC
    public final void CJ4(int i) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        AbstractC41339IRk.A01(recyclerView, i);
    }

    @Override // X.JIC
    public final void Dcg() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        AbstractC41339IRk.A00(recyclerView);
    }

    @Override // X.JHI
    public final void Dch(C41628IbJ c41628IbJ, int i) {
        C37987GnX c37987GnX = this.A04;
        if (c37987GnX == null) {
            C14360o3.A0F("questionResponseReshareController");
            throw C00O.createAndThrow();
        }
        c37987GnX.A00(i);
    }

    @Override // X.JIC
    public final void Dgn() {
        C38370Gu6 c38370Gu6 = this.A00;
        C14360o3.A0A(c38370Gu6);
        c38370Gu6.notifyDataSetChanged();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_question_responses_list";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131971786));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1015000473);
        super.onCreate(bundle);
        String string = requireArguments().getString("ReelQuestionResponsesListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelQuestionResponsesListFragment.REEL_ITEM_ID");
        Reel A0I = AbstractC37301Gc2.A0I(getSession(), string);
        if (A0I != null) {
            Iterator it = A0I.A0O(getSession()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41181vS c41181vS = (C41181vS) it.next();
                if (C14360o3.A0K(c41181vS.A0j, string2)) {
                    this.A02 = c41181vS;
                    break;
                }
            }
        }
        C41181vS c41181vS2 = this.A02;
        String str2 = null;
        if (c41181vS2 != null) {
            str = AbstractC37301Gc2.A0h(c41181vS2.A0b);
            C41181vS c41181vS3 = this.A02;
            C14360o3.A0A(c41181vS3);
            AlD A03 = C6ZB.A03(c41181vS3);
            if (A03 != null) {
                str2 = A03.A00.A08;
            }
        } else {
            str = null;
        }
        C41189ILc c41189ILc = new C41189ILc(this, getSession(), this, C05F.A00, str, str2);
        this.A03 = c41189ILc;
        C38370Gu6 c38370Gu6 = c41189ILc.A01;
        this.A00 = c38370Gu6;
        C14360o3.A0A(c38370Gu6);
        c38370Gu6.setHasStableIds(true);
        C37987GnX c37987GnX = new C37987GnX(requireActivity(), AbstractC018607g.A00(this), this, getSession(), this);
        this.A04 = c37987GnX;
        registerLifecycleListener(c37987GnX);
        if (this.A02 != null) {
            C41189ILc c41189ILc2 = this.A03;
            if (c41189ILc2 == null) {
                C14360o3.A0F("questionResponsesListHelper");
                throw C00O.createAndThrow();
            }
            c41189ILc2.A02.A00(true);
        }
        C0f9.A09(-969722994, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1896978945);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_question_responses_list, viewGroup, false);
        C0f9.A09(896345604, A02);
        return inflate;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(728386421);
        C42244InU c42244InU = (C42244InU) obj;
        int A0N = AbstractC167017dG.A0N(c42244InU, -1044720452);
        C38370Gu6 c38370Gu6 = this.A00;
        C14360o3.A0A(c38370Gu6);
        if (c38370Gu6.A01.remove(c42244InU.A00)) {
            C38370Gu6.A00(c38370Gu6);
        }
        C0f9.A0A(1781565774, A0N);
        C0f9.A0A(1230467488, A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1085454506);
        super.onPause();
        AbstractC25651Mw.A00(getSession()).A02(this, C42244InU.class);
        C0f9.A09(1004739565, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1255202675);
        super.onResume();
        if (!C06P.A00(AbstractC31174DnI.A0I(this)) && this.A02 == null) {
            AbstractC25226BEj.A1Q(this);
        }
        AbstractC25651Mw.A00(getSession()).A01(this, C42244InU.class);
        C0f9.A09(-1997301121, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1821395823);
        super.onStart();
        AbstractC31179DnN.A1J(this, 8);
        C0f9.A09(308646868, A02);
    }
}
