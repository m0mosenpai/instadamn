package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.G6w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36472G6w implements InterfaceC37232Gah {
    public final RecyclerView A00;
    public final ViewOnFocusChangeListenerC35694FpU A01;
    public final E02 A02;
    public final IgdsInlineSearchBox A03;
    public final InterfaceC09390do A04;

    public C36472G6w(ViewGroup viewGroup, RecyclerView recyclerView, ViewOnFocusChangeListenerC35694FpU viewOnFocusChangeListenerC35694FpU, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A0a(1, userSession, viewOnFocusChangeListenerC35694FpU, igdsInlineSearchBox, recyclerView);
        C14360o3.A0B(viewGroup, 6);
        this.A01 = viewOnFocusChangeListenerC35694FpU;
        this.A03 = igdsInlineSearchBox;
        this.A00 = recyclerView;
        E02 e02 = new E02(interfaceC16660sJ, userSession);
        this.A02 = e02;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37054GUk(this, 24));
        View findViewById = viewGroup.findViewById(R.id.direct_recipients_selected_section);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        AbstractC31176DnK.A1E(viewGroup, R.id.direct_metadata_header_container, 8);
        AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        e02.setHasStableIds(true);
        recyclerView.setAdapter(e02);
        recyclerView.setItemAnimator(new C82223lj(new C37054GUk(this, 23)));
    }

    public static final void A00(C36472G6w c36472G6w) {
        ValueAnimator ofInt = ValueAnimator.ofInt(AbstractC167027dH.A01(c36472G6w.A04), 0);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new C35292FhR(c36472G6w, 2));
        ofInt.addListener(new C35280FhF(c36472G6w, 5));
        ofInt.start();
    }

    public static final void A01(C36472G6w c36472G6w, InterfaceC16820sZ interfaceC16820sZ) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, AbstractC167027dH.A01(c36472G6w.A04));
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new C35292FhR(c36472G6w, 3));
        ofInt.addListener(new ANB(7, c36472G6w, interfaceC16820sZ));
        ofInt.start();
    }

    @Override // X.InterfaceC37232Gah
    public final void DyP(List list) {
    }

    @Override // X.InterfaceC37232Gah
    public final void EK2() {
    }

    @Override // X.InterfaceC37232Gah
    public final void Efx(int i) {
    }

    @Override // X.InterfaceC37232Gah
    public final void FCm(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37232Gah
    public final void AHQ() {
        this.A03.A02 = null;
    }

    @Override // X.InterfaceC37232Gah
    public final boolean AHn() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (!igdsInlineSearchBox.hasFocus()) {
            return false;
        }
        igdsInlineSearchBox.clearFocus();
        return true;
    }

    @Override // X.InterfaceC37232Gah
    public final void AI3() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        igdsInlineSearchBox.setTag("");
        GZD gzd = igdsInlineSearchBox.A02;
        if (gzd != null) {
            gzd.onSearchCleared(igdsInlineSearchBox.getSearchString());
        }
        igdsInlineSearchBox.A0E.setText("");
        igdsInlineSearchBox.setTag(null);
    }

    @Override // X.InterfaceC37232Gah
    public final String BrI() {
        return this.A03.getSearchString();
    }

    @Override // X.InterfaceC37232Gah
    public final boolean CKx() {
        return this.A03.hasFocus();
    }

    @Override // X.InterfaceC37232Gah
    public final void CMc() {
        AbstractC13880nE.A0O(this.A03);
    }

    @Override // X.InterfaceC37232Gah
    public final void E0x() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        igdsInlineSearchBox.A02 = new C36509G8h(this, 6);
        igdsInlineSearchBox.A00 = new ViewOnFocusChangeListenerC35694FpU(this, 6);
        igdsInlineSearchBox.setEditTextOnClickListener(new ViewOnClickListenerC35666Fp0(this, 54));
    }

    @Override // X.InterfaceC37232Gah
    public final void EJ5() {
        this.A03.requestFocus();
    }

    @Override // X.InterfaceC37232Gah
    public final void EdJ(String str) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        BackInterceptEditText backInterceptEditText = igdsInlineSearchBox.A0E;
        backInterceptEditText.setText(str);
        backInterceptEditText.requestFocus();
        Pattern pattern = AbstractC13670mt.A01;
        igdsInlineSearchBox.setSelection(str.length());
    }

    @Override // X.InterfaceC37232Gah
    public final void El3() {
        AbstractC13880nE.A0T(this.A03);
    }

    @Override // X.InterfaceC37232Gah
    public final void FCP(String str, List list, boolean z, boolean z2) {
        RecyclerView recyclerView = this.A00;
        Animation animation = recyclerView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if ((!list.isEmpty()) && recyclerView.getVisibility() == 8) {
            A01(this, new GT0(this, str, list, z, z2));
            return;
        }
        int size = list.size();
        E02 e02 = this.A02;
        boolean A1S = AbstractC25230BEn.A1S(size, e02.getItemCount());
        AbstractC31175DnJ.A0x(e02, list, e02.A01);
        if (A1S) {
            recyclerView.A0n(AbstractC31172DnG.A03(list, 1));
        }
        if (!z) {
            return;
        }
        AI3();
    }
}
