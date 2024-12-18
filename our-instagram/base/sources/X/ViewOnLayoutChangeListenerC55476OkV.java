package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.ui.widget.draggable.DraggableContainer;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OkV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC55476OkV implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnLayoutChangeListenerC55476OkV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55476OkV(obj, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0260: INVOKE (r1 I:java.util.Iterator) = (r12 I:java.util.List) INTERFACE call: java.util.List.iterator():java.util.Iterator A[MD:():java.util.Iterator<E> (c)] (LINE:608), block:B:115:0x025c */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x025c: INVOKE (r2 I:java.lang.StringBuilder) = (r8v0 ?? I:java.lang.Object), (r7v0 ?? I:java.lang.Object), (r6v0 ?? I:java.lang.Object), (r2 I:int) STATIC call: X.MSa.A0n(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder (m)] (LINE:604), block:B:115:0x025c */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x025c: INVOKE (r2 I:java.lang.StringBuilder) = (r8v0 ?? I:java.lang.Object), (r7v0 ?? I:java.lang.Object), (r6 I:java.lang.Object), (r2 I:int) STATIC call: X.MSa.A0n(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder (m)] (LINE:604), block:B:115:0x025c */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x025c: INVOKE (r2 I:java.lang.StringBuilder) = (r8 I:java.lang.Object), (r7 I:java.lang.Object), (r6 I:java.lang.Object), (r2 I:int) STATIC call: X.MSa.A0n(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, int):java.lang.StringBuilder (m)] (LINE:604), block:B:115:0x025c */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        StringBuilder A0n;
        StringBuilder A0n2;
        ?? A0n3;
        ?? it;
        PunchedOverlayView punchedOverlayView;
        AbstractC46675Kks kl1;
        String str;
        int i9;
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC16620sF interfaceC16620sF;
        int i10 = i6;
        try {
            switch (this.A00) {
                case 0:
                    int i11 = i3 / 2;
                    int i12 = i4 / 2;
                    SelectHighlightsCoverFragment selectHighlightsCoverFragment = (SelectHighlightsCoverFragment) this.A01;
                    if (selectHighlightsCoverFragment.A06) {
                        float f = i3;
                        int A00 = (int) AbstractC25227BEk.A00(i4, 1.3333334f * f);
                        punchedOverlayView = selectHighlightsCoverFragment.mPunchedOverlayView;
                        kl1 = new KL0(new RectF(0.0f, A00, f, i4 - A00), AbstractC167017dG.A08(selectHighlightsCoverFragment.requireContext()));
                    } else {
                        punchedOverlayView = selectHighlightsCoverFragment.mPunchedOverlayView;
                        kl1 = new KL1(i11, i12, i11);
                    }
                    punchedOverlayView.A00(kl1);
                    return;
                case 1:
                    C14360o3.A0B(view, 0);
                    OXL oxl = AbstractC54340Nzy.A00;
                    DraggableContainer draggableContainer = (DraggableContainer) this.A01;
                    float A002 = DraggableContainer.A00(draggableContainer);
                    float A01 = DraggableContainer.A01(draggableContainer);
                    synchronized (oxl) {
                        AbstractC54808OKe abstractC54808OKe = oxl.A00;
                        if (abstractC54808OKe != null) {
                            for (InterfaceC58141Pq6 interfaceC58141Pq6 : OXL.A00(oxl, abstractC54808OKe.getClass())) {
                                Object obj = abstractC54808OKe.A00().get();
                                if (obj != null) {
                                    interfaceC58141Pq6.DC7((View) obj, A002, A01);
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                    return;
                case 2:
                    MSX.A1S(((BaselStackedTimelineMiddleActionViewControllerImpl) this.A01).A03, i4 - i2);
                    return;
                case 3:
                    if (view.getHeight() == i8 - i6) {
                        return;
                    }
                    NI5 ni5 = ((ClipsStackedTimelineFragment) this.A01).A0E;
                    if (ni5 == null) {
                        str = "videoTrackViewController";
                        break;
                    } else {
                        ni5.A02.A00 = view.getHeight();
                        ni5.A0N(MSZ.A0A(ni5.A0K.A0Y));
                        return;
                    }
                case 4:
                    if (i10 == i2 && i8 == i4) {
                        return;
                    }
                    EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                    editMediaInfoFragment.mCaption.getClass();
                    if (editMediaInfoFragment.mCaption.getVisibility() == 0) {
                        i9 = editMediaInfoFragment.mCaption.getHeight();
                    } else {
                        i9 = 0;
                    }
                    int AYS = ((i4 - i2) + AbstractC31176DnK.A0J(editMediaInfoFragment).AYS()) - i9;
                    if (AYS <= 0) {
                        return;
                    }
                    C56065Oui c56065Oui = editMediaInfoFragment.A0G;
                    if (c56065Oui != null) {
                        c56065Oui.A00().setHeight(AYS);
                        return;
                    }
                    editMediaInfoFragment.mCaption.setDropDownHeight(AYS);
                    if (!editMediaInfoFragment.mCaption.isPopupShowing()) {
                        return;
                    }
                    editMediaInfoFragment.mCaption.showDropDown();
                    return;
                case 5:
                    float f2 = i3 - i;
                    int A02 = MSW.A02(f2, 0.8f);
                    int i13 = i4 / 2;
                    int i14 = A02 / 2;
                    C52165N6r c52165N6r = (C52165N6r) this.A01;
                    RectF rectF = new RectF(0.0f, i13 - i14, f2, i13 + i14);
                    c52165N6r.A02 = rectF;
                    PunchedOverlayView punchedOverlayView2 = c52165N6r.A07;
                    if (punchedOverlayView2 == null) {
                        str = "punchedOverlayView";
                        break;
                    } else {
                        punchedOverlayView2.A00(new KL0(rectF, 0.0f));
                        GridLinesView gridLinesView = c52165N6r.A09;
                        if (gridLinesView == null) {
                            str = "gridLinesView";
                            break;
                        } else {
                            AbstractC13880nE.A0W(gridLinesView, A02);
                            return;
                        }
                    }
                case 6:
                    int i15 = i3 - i;
                    if (i7 - i5 == i15 || (interfaceC16660sJ = (InterfaceC16660sJ) ((Reference) this.A01).get()) == null) {
                        return;
                    }
                    AbstractC43592JPx.A19(i15, interfaceC16660sJ);
                    return;
                case 7:
                    view.removeOnLayoutChangeListener(this);
                    PCD pcd = (PCD) this.A01;
                    InterfaceC09390do interfaceC09390do = pcd.A0B;
                    AbstractC166987dD.A0d(interfaceC09390do).getParent();
                    pcd.A06.findViewById(R.id.bloks_fragment_container);
                    AbstractC10360h2 abstractC10360h2 = pcd.A07;
                    Fragment A0O = abstractC10360h2.A0O(R.id.bloks_fragment_container);
                    List A04 = abstractC10360h2.A0U.A04();
                    C14360o3.A07(A04);
                    abstractC10360h2.A0L();
                    Iterator it2 = A04.iterator();
                    while (it2.hasNext()) {
                        if (((Fragment) it2.next()) instanceof C72743Nv) {
                        }
                    }
                    InterfaceC09390do interfaceC09390do2 = pcd.A09;
                    if (C14360o3.A0K(A0O, interfaceC09390do2.getValue())) {
                        return;
                    }
                    C14240no c14240no = new C14240no(abstractC10360h2);
                    c14240no.A0A((Fragment) interfaceC09390do2.getValue(), R.id.bloks_fragment_container);
                    c14240no.A06();
                    AbstractC166987dD.A0d(interfaceC09390do).setFitsSystemWindows(true);
                    AbstractC008903d.A00(AbstractC166987dD.A0d(interfaceC09390do), C55542Olc.A00);
                    return;
                case 8:
                    int i16 = i8 - i6;
                    int i17 = i3 - i;
                    int i18 = i4 - i2;
                    if ((i7 - i5 == i17 && i16 == i18) || (interfaceC16620sF = ((RtcCallParticipantCellView) this.A01).A04) == null) {
                        return;
                    }
                    interfaceC16620sF.invoke(Integer.valueOf(i17), Integer.valueOf(i18));
                    return;
                case 9:
                    ((C50925Meu) ((ODS) this.A01).A04.getValue()).A00 = view.getMeasuredHeight();
                    return;
                default:
                    C55128Obp c55128Obp = (C55128Obp) this.A01;
                    if (c55128Obp.A0B.getBottom() > AbstractC13880nE.A09(c55128Obp.A04)) {
                        if (C55128Obp.A00(c55128Obp) >= c55128Obp.A07.getMeasuredHeight()) {
                            C55128Obp.A00(c55128Obp);
                        }
                        C110964z8 c110964z8 = new C110964z8();
                        ViewParent parent = c55128Obp.A0A.getParent();
                        C14360o3.A0C(parent, AbstractC111324zv.A00(14));
                        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                        c110964z8.A0I(constraintLayout);
                        c110964z8.A09(R.id.iglive_reactions_extensions, 3);
                        c110964z8.A09(R.id.iglive_reactions_extensions, 4);
                        AbstractC43592JPx.A1F(constraintLayout, -2);
                        c110964z8.A0C(R.id.iglive_reactions_extensions, 4, R.id.iglive_reactions_composer, 3);
                        AbstractC66022TyK.A02(constraintLayout, null);
                        c110964z8.A0G(constraintLayout);
                        return;
                    }
                    return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException e) {
            StringBuilder A0n4 = AbstractC50522MSa.A0n(A0n, i4, A0n2, A0n3);
            Iterator it3 = it.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            A0n4.append(C0eB.A00);
            A0n4.append(" \nBloksSreenFragment: ");
            C72743Nv c72743Nv = (C72743Nv) i3;
            String str2 = i10;
            if (c72743Nv != null) {
                str2 = c72743Nv.getUrl();
            }
            A0n4.append(str2);
            C0w9.A07("RtcCoWatchBloksContentPickerViewHolder", new IllegalArgumentException(AbstractC166997dE.A0x(" \n", A0n4), e));
        }
    }
}
