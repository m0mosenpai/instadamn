package X;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.FaceEffectLinearLayoutManager;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class OyC implements C8FP {
    public int A00;
    public View A01;
    public C8TN A02;
    public ArEffectPickerRecyclerView A03;
    public OyE A04;
    public boolean A05;
    public boolean A06;
    public FaceEffectLinearLayoutManager A07;
    public final int A08;
    public final int A09;
    public final Handler A0A;
    public final C8FL A0B;
    public final NHM A0C;
    public final C1810281e A0D;
    public final Runnable A0E;
    public final boolean A0F;
    public final View A0G;
    public final ViewStub A0H;
    public final C1I4 A0I;
    public final UserSession A0J;
    public final C88L A0K;
    public final C8FR A0L;
    public final C51979MyN A0M;
    public final String A0N;
    public final boolean A0O;

    @Override // X.C8FP
    public final void APS() {
    }

    @Override // X.C8FP
    public final void ARe() {
    }

    @Override // X.C8FP
    public final String Aqw(C88X c88x) {
        return "";
    }

    @Override // X.C8FP
    public final int B0w(C88X c88x) {
        C14360o3.A0B(c88x, 0);
        int indexOf = ((C8JF) this.A0C).A02.indexOf(c88x);
        if (indexOf < 0) {
            return Integer.MIN_VALUE;
        }
        return indexOf;
    }

    @Override // X.C8FP
    public final int B0x(String str) {
        C14360o3.A0B(str, 0);
        return this.A0C.A00(str);
    }

    @Override // X.C8FP
    public final /* synthetic */ void CML() {
    }

    @Override // X.C8FP
    public final void CMn() {
    }

    @Override // X.C8FP
    public final void Cw3(java.util.Set set) {
    }

    @Override // X.C8FP
    public final void DmC() {
    }

    @Override // X.C8FP
    public final void ETI(boolean z) {
        this.A06 = true;
    }

    @Override // X.C8FP
    public final void ETk(String str) {
    }

    @Override // X.C8FP
    public final void ETl(List list) {
        C14360o3.A0B(list, 0);
        this.A0C.A05(Collections.unmodifiableList(list));
    }

    @Override // X.C8FP
    public final void EVD(boolean z) {
    }

    @Override // X.C8FP
    public final void Eba(Product product) {
    }

    @Override // X.C8FP
    public final void Ebe(boolean z) {
    }

    @Override // X.C8FP
    public final /* synthetic */ void EkO() {
    }

    @Override // X.C8FP
    public final void ElN() {
    }

    @Override // X.C8FP
    public final void FBj(float f) {
    }

    @Override // X.C8FP
    public final void onPause() {
    }

    @Override // X.C8FP
    public final void onResume() {
    }

    @Override // X.C8FP
    public final boolean AFk() {
        Object obj = this.A0D.A00.first;
        C14360o3.A07(obj);
        if ((obj == EnumC1810181d.A11 || obj == EnumC1810181d.A0y) && this.A0F) {
            return true;
        }
        return false;
    }

    @Override // X.C8FP
    public final C8FR AcW() {
        return this.A0L;
    }

    @Override // X.C8FP
    public final C88X AuN() {
        InterfaceC120325cX interfaceC120325cX;
        NHM nhm = this.A0C;
        if (nhm.A06(((C8JF) nhm).A00)) {
            interfaceC120325cX = (InterfaceC120325cX) ((C8JF) nhm).A02.get(((C8JF) nhm).A00);
        } else {
            interfaceC120325cX = null;
        }
        return (C88X) interfaceC120325cX;
    }

    @Override // X.C8FP
    public final C88X B0q(int i) {
        return (C88X) this.A0C.A01(i);
    }

    @Override // X.C8FP
    public final int B10() {
        return this.A0C.getItemCount();
    }

    @Override // X.C8FP
    public final int B6m() {
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A07;
        if (faceEffectLinearLayoutManager != null) {
            return faceEffectLinearLayoutManager.A1a();
        }
        return 0;
    }

    @Override // X.C8FP
    public final int BM1() {
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A07;
        if (faceEffectLinearLayoutManager != null) {
            return faceEffectLinearLayoutManager.A1b();
        }
        return 0;
    }

    @Override // X.C8FP
    public final int Bd6() {
        return this.A08;
    }

    @Override // X.C8FP
    public final InterfaceC55932he Bp9() {
        return this.A0M;
    }

    @Override // X.C8FP
    public final C88X Bsa() {
        InterfaceC120325cX interfaceC120325cX;
        NHM nhm = this.A0C;
        if (nhm.A06(((C8JF) nhm).A00)) {
            interfaceC120325cX = (InterfaceC120325cX) ((C8JF) nhm).A02.get(((C8JF) nhm).A00);
        } else {
            interfaceC120325cX = null;
        }
        return (C88X) interfaceC120325cX;
    }

    @Override // X.C8FP
    public final int Bsl() {
        return ((C8JF) this.A0C).A00;
    }

    @Override // X.C8FP
    public final float CAj() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            return arEffectPickerRecyclerView.getTranslationY();
        }
        return 0.0f;
    }

    @Override // X.C8FP
    public final boolean CaF() {
        return AbstractC167007dF.A1W(this.A03);
    }

    @Override // X.C8FP
    public final boolean CaY(int i) {
        return this.A0C.A06(i);
    }

    @Override // X.C8FP
    public final void CoD() {
        if (this.A01 == null) {
            FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = new FaceEffectLinearLayoutManager(AbstractC166997dE.A0L(this.A0G));
            this.A07 = faceEffectLinearLayoutManager;
            faceEffectLinearLayoutManager.A12(true);
            View inflate = this.A0H.inflate();
            this.A01 = inflate;
            boolean z = this.A0O;
            inflate.setFitsSystemWindows(z);
            if (z) {
                inflate.requestApplyInsets();
            }
            View requireViewById = inflate.requireViewById(R.id.ar_effect_picker_recycler_view);
            ArEffectPickerRecyclerView arEffectPickerRecyclerView = (ArEffectPickerRecyclerView) requireViewById;
            this.A03 = arEffectPickerRecyclerView;
            C14360o3.A07(requireViewById);
            String str = this.A0N;
            arEffectPickerRecyclerView.A00 = str;
            arEffectPickerRecyclerView.setLayoutManager(faceEffectLinearLayoutManager);
            arEffectPickerRecyclerView.setAdapter(this.A0C);
            C70623Ez c70623Ez = new C70623Ez();
            ((C3F0) c70623Ez).A00 = false;
            arEffectPickerRecyclerView.setItemAnimator(c70623Ez);
            arEffectPickerRecyclerView.A14(this.A0I);
            if ("video_call".equals(str)) {
                arEffectPickerRecyclerView.A10(new C51180MjO(this));
            }
            if (!"video_call".equals(arEffectPickerRecyclerView.A00)) {
                UGT ugt = new UGT();
                ugt.A07(arEffectPickerRecyclerView);
                faceEffectLinearLayoutManager.A01 = ugt;
            }
            faceEffectLinearLayoutManager.A00 = 100.0f;
            if (C14360o3.A0K(str, "live_broadcast")) {
                arEffectPickerRecyclerView.setBackgroundResource(R.drawable.effect_tray_shadow);
            }
        }
    }

    @Override // X.C8FP
    public final void CtF(int i) {
        this.A0C.notifyItemChanged(i);
    }

    @Override // X.C8FP
    public final void DEo() {
        AbstractC167007dF.A0x(this.A03);
    }

    @Override // X.C8FP
    public final void ECy() {
        NHM nhm = this.A0C;
        nhm.A00 = nhm.A03;
    }

    @Override // X.C8FP
    public final boolean EFG(C88X c88x) {
        NHM nhm = this.A0C;
        String id = c88x.getId();
        int i = 0;
        while (true) {
            List list = ((C8JF) nhm).A02;
            if (i < list.size()) {
                if (AbstractC50102Ry.A00(id, ((InterfaceC120325cX) list.get(i)).getId())) {
                    list.remove(i);
                    return true;
                }
                i++;
            } else {
                return false;
            }
        }
    }

    @Override // X.C8FP
    public final boolean EFH(int i) {
        NHM nhm = this.A0C;
        if (!nhm.A06(i)) {
            return false;
        }
        ((C8JF) nhm).A02.remove(i);
        nhm.notifyDataSetChanged();
        return true;
    }

    @Override // X.C8FP
    public final void EGG() {
        NHM nhm = this.A0C;
        int i = ((C8JF) nhm).A00;
        ((C8JF) nhm).A00 = -1;
        if (nhm.A06(i)) {
            nhm.notifyItemChanged(i);
        }
    }

    @Override // X.C8FP
    public final void EJg() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.A0n(0);
            EGG();
        }
    }

    @Override // X.C8FP
    public final void EMP(int i, boolean z) {
        if (AbstractC167007dF.A1W(this.A03)) {
            NHM nhm = this.A0C;
            if (nhm.A06(i)) {
                nhm.A02(i);
                boolean z2 = nhm.A01;
                ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
                if (z2) {
                    if (arEffectPickerRecyclerView != null) {
                        arEffectPickerRecyclerView.A0o(i);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                if (arEffectPickerRecyclerView != null) {
                    arEffectPickerRecyclerView.A0n(i);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    @Override // X.C8FP
    public final void EMq(String str) {
        NHM nhm = this.A0C;
        int i = 0;
        while (true) {
            List list = ((C8JF) nhm).A02;
            if (i >= list.size()) {
                break;
            }
            if (AbstractC50102Ry.A00(str, ((InterfaceC120325cX) list.get(i)).getId())) {
                nhm.A02(i);
                break;
            }
            i++;
        }
        int i2 = ((C8JF) nhm).A00;
        if (nhm.A06(i2)) {
            CoD();
            nhm.A01 = true;
            ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
            if (arEffectPickerRecyclerView != null) {
                arEffectPickerRecyclerView.A0n(i2);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C8FP
    public final void EgG(float f) {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.setTranslationY(f);
        }
    }

    @Override // X.C8FP
    public final void EmZ(C88X c88x) {
        String str;
        int A00;
        if (c88x != null) {
            str = c88x.getId();
        } else {
            str = null;
        }
        CoD();
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            if (str == null) {
                A00 = 0;
            } else {
                A00 = this.A0C.A00(str);
            }
            NHM nhm = this.A0C;
            if (nhm.A06(A00)) {
                nhm.A01 = true;
                nhm.A03(A00);
                arEffectPickerRecyclerView.A0n(A00);
            }
        }
    }

    @Override // X.C8FP
    public final boolean isEmpty() {
        return ((C8JF) this.A0C).A02.isEmpty();
    }

    @Override // X.C8FP
    public final void notifyDataSetChanged() {
        this.A0C.notifyDataSetChanged();
    }

    @Override // X.C8FP
    public final void setVisibility(int i) {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public OyC(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8FL c8fl, C8FI c8fi, C54458O4m c54458O4m, C1810281e c1810281e, String str, boolean z, boolean z2) {
        this.A0J = userSession;
        this.A0D = c1810281e;
        this.A0G = view;
        this.A0N = str;
        this.A0B = c8fl;
        this.A0O = z;
        this.A0H = AbstractC167007dF.A0M(view, R.id.default_ar_effect_picker_container_stub);
        C56257Oy4 c56257Oy4 = new C56257Oy4(this);
        this.A0K = c56257Oy4;
        NHM nhm = new NHM(AbstractC166997dE.A0L(view), interfaceC11380iw, userSession, c56257Oy4, c8fi, c54458O4m, str, z2);
        this.A0C = nhm;
        this.A0L = new C56264OyB(nhm);
        Resources resources = view.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0M = new C51979MyN(this);
        this.A0A = AbstractC167007dF.A0J();
        this.A0E = new RunnableC56873PLs(this);
        this.A0I = new C51198Mji(this, 2);
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        boolean z3 = false;
        if (arEffectPickerRecyclerView != null && arEffectPickerRecyclerView.getScrollState() == 0) {
            z3 = true;
        }
        this.A0F = z3;
    }

    @Override // X.C8FP
    public final void A8M(C88X c88x, int i) {
        List A1J = AbstractC166987dD.A1J(c88x);
        NHM nhm = this.A0C;
        List unmodifiableList = Collections.unmodifiableList(A1J);
        if (!unmodifiableList.isEmpty()) {
            ((C8JF) nhm).A02.addAll(i, unmodifiableList);
            int i2 = ((C8JF) nhm).A00;
            if (i2 >= i) {
                ((C8JF) nhm).A00 = AbstractC31172DnG.A02(unmodifiableList, i2);
            }
            nhm.notifyItemRangeInserted(i, unmodifiableList.size());
        }
    }

    @Override // X.C8FP
    public final C88X Bb7() {
        return Bsa();
    }

    @Override // X.C8FP
    public final void DDl() {
        CoD();
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.setVisibility(0);
            ArEffectPickerRecyclerView arEffectPickerRecyclerView2 = this.A03;
            if (arEffectPickerRecyclerView2 != null) {
                arEffectPickerRecyclerView2.post(new RunnableC56872PLr(this));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C8FP
    public final void EMs(String str, int i, boolean z) {
        CoD();
        this.A0C.A04(str, z, false, i);
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.A0n(i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C8FP
    public final void EPh(boolean z) {
        this.A05 = z;
    }

    @Override // X.C8FP
    public final void Ea0(OyE oyE) {
        this.A04 = oyE;
    }

    @Override // X.C8FP
    public final void EgC(C8TN c8tn) {
        this.A02 = c8tn;
    }
}
