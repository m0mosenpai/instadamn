package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KFG extends AbstractC60592pi implements InterfaceC195648l5, InterfaceC188988Yo, InterfaceC23471Cj, AdapterView.OnItemSelectedListener {
    public RecyclerView A00;
    public L41 A01;
    public final Context A02;
    public final C44417JkC A03;
    public final C45470KBf A04;
    public final C189058Yv A05;
    public final Jo4 A06;

    public KFG(Fragment fragment, UserSession userSession, C45470KBf c45470KBf) {
        C14360o3.A0B(userSession, 1);
        this.A04 = c45470KBf;
        Context requireContext = fragment.requireContext();
        this.A02 = requireContext;
        C44417JkC c44417JkC = new C44417JkC(this);
        c44417JkC.A01 = R.layout.layout_folder_picker_title;
        c44417JkC.A00 = R.layout.layout_folder_picker_item;
        this.A03 = c44417JkC;
        int A00 = AbstractC46698KlH.A00(requireContext);
        int round = Math.round(AbstractC46698KlH.A00(requireContext) / 0.5625f);
        C8SF c8sf = new C8SF(requireContext, userSession, C05F.A00, A00, round, true);
        Jo4 jo4 = new Jo4(c8sf, this, A00, round);
        this.A06 = jo4;
        C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(fragment), c8sf);
        c188958Yl.A03 = EnumC188968Ym.A05;
        c188958Yl.A07 = this;
        this.A05 = new C189058Yv(requireContext, null, jo4, new C189028Ys(c188958Yl));
    }

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        Context context = A0F.getContext();
        A0F.setLayoutManager(new GridLayoutManager(context, 3));
        A0F.setAdapter(this.A06);
        C14360o3.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        A0F.A10(new C154176wS(dimensionPixelSize, false, 0));
        this.A00 = A0F;
        this.A01 = new L41(this.A04.requireActivity(), AbstractC31176DnK.A0C(view, R.id.root_container), this);
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        C44417JkC c44417JkC = this.A03;
        if (c44417JkC != null) {
            C0fA.A00(c44417JkC, -899693561);
        }
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C195838lR c195838lR;
        boolean A03 = AbstractC93174Ft.A03(this.A02);
        L41 l41 = this.A01;
        if (A03) {
            if (l41 != null && (c195838lR = l41.A00) != null) {
                c195838lR.A00();
                l41.A00 = null;
            }
            this.A05.A07();
            return;
        }
        if (l41 == null) {
            return;
        }
        C195838lR c195838lR2 = l41.A00;
        if (c195838lR2 != null) {
            c195838lR2.A00();
            l41.A00 = null;
        }
        C195838lR A0j = AbstractC43593JPy.A0j(l41.A01);
        l41.A00 = A0j;
        A0j.A05(l41.A04);
        A0j.A04(l41.A03);
        A0j.A02(2131956899);
        A0j.A03(new ViewOnClickListenerC48063LPo(l41, 55));
    }

    @Override // X.InterfaceC195648l5
    public final Folder getCurrentFolder() {
        return this.A05.A01;
    }

    @Override // X.InterfaceC195648l5
    public final List getFolders() {
        return AbstractC47899LDt.A00(LWH.A00, this.A05);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A05.A08();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        if (AbstractC93174Ft.A03(this.A02)) {
            L41 l41 = this.A01;
            if (l41 != null) {
                C195838lR c195838lR = l41.A00;
                if (c195838lR != null) {
                    c195838lR.A00();
                    l41.A00 = null;
                }
                this.A05.A07();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        AbstractC93174Ft.A01(this.A04.requireActivity(), this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Folder folder = (Folder) getFolders().get(i);
        C189058Yv c189058Yv = this.A05;
        int i2 = c189058Yv.A01.A02;
        int i3 = folder.A02;
        if (i2 != i3) {
            c189058Yv.A0C(i3);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.A0n(0);
            }
        }
    }
}
