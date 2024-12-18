package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.LYb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48278LYb implements InterfaceC60602pj, InterfaceC195648l5, InterfaceC188988Yo, AdapterView.OnItemSelectedListener {
    public RecyclerView A00;
    public IgTextView A01;
    public final KD2 A02;
    public final C189058Yv A03;
    public final Context A04;
    public final Fragment A05;
    public final UserSession A06;
    public final C44417JkC A07;
    public final Jo3 A08;

    public C48278LYb(Fragment fragment, UserSession userSession, KD2 kd2) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = fragment;
        this.A02 = kd2;
        Context requireContext = fragment.requireContext();
        this.A04 = requireContext;
        this.A07 = new C44417JkC(this);
        int A00 = AbstractC46698KlH.A00(requireContext);
        int round = Math.round(AbstractC46698KlH.A00(requireContext) / 0.5625f);
        C8SF c8sf = new C8SF(requireContext, userSession, C05F.A00, A00, round, true);
        Jo3 jo3 = new Jo3(c8sf, this, A00, round);
        this.A08 = jo3;
        C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(fragment), c8sf);
        c188958Yl.A03 = EnumC188968Ym.A06;
        c188958Yl.A07 = this;
        this.A03 = new C189058Yv(requireContext, null, jo3, new C189028Ys(c188958Yl));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        AbstractC31172DnG.A1J(view, R.id.gallery_container, 0);
        AbstractC31172DnG.A1J(view, R.id.gallery_container_coordinator, 0);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.gallery_recycler_view);
        Context context = A0G.getContext();
        A0G.setLayoutManager(new GridLayoutManager(context, 3));
        A0G.setAdapter(this.A08);
        C14360o3.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        A0G.A10(new C154176wS(dimensionPixelSize, false, 0));
        A0G.setVisibility(0);
        this.A00 = A0G;
        this.A01 = AbstractC31172DnG.A0X(view, R.id.gallery_empty);
        AbstractC31172DnG.A1J(view, R.id.gallery_header, 0);
        view.requireViewById(R.id.gallery_title).setVisibility(8);
        AbstractC31172DnG.A1J(view, R.id.gallery_cancel_button, 8);
        view.requireViewById(R.id.gallery_settings_gear).setVisibility(4);
        AbstractC31172DnG.A1J(view, R.id.import_oa_instructions, 0);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        C44417JkC c44417JkC = this.A07;
        if (c44417JkC != null) {
            C0fA.A00(c44417JkC, -741721130);
        }
    }

    @Override // X.InterfaceC195648l5
    public final Folder getCurrentFolder() {
        return this.A03.A01;
    }

    @Override // X.InterfaceC195648l5
    public final List getFolders() {
        return AbstractC47899LDt.A00(LWG.A00, this.A03);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A03.A08();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        IgTextView igTextView;
        int i;
        if (AbstractC93174Ft.A03(this.A04)) {
            this.A03.A07();
            igTextView = this.A01;
            if (igTextView != null) {
                i = 4;
            } else {
                return;
            }
        } else {
            igTextView = this.A01;
            if (igTextView == null) {
                return;
            } else {
                i = 0;
            }
        }
        igTextView.setVisibility(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Folder folder = (Folder) getFolders().get(i);
        C189058Yv c189058Yv = this.A03;
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
