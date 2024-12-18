package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;

/* renamed from: X.9fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214999fb extends C53Z implements InterfaceC186128Ng {
    public static final String __redex_internal_original_name = "CanvasCountdownBottomSheetFragment";
    public A5J A00;
    public C42509Iro A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "canvas_countdown_bottom_sheet_fragment";
    }

    @Override // X.InterfaceC186128Ng
    public final void D7t(AlC alC) {
        A5J a5j = this.A00;
        if (a5j != null) {
            C218119kj.A00(C5GJ.CREATE_MODE_VIEW_ALL_SELECTION, a5j.A00, alC);
        }
        C3DN A01 = C3DN.A00.A01(getContext());
        if (A01 != null) {
            A01.A0B();
        }
    }

    @Override // X.InterfaceC186128Ng
    public final void D87() {
        A5J a5j = this.A00;
        if (a5j != null) {
            C88Y c88y = a5j.A00.A06;
            Object obj = C148276lx.A0f;
            C183688Ct c183688Ct = c88y.A00.A01.A03;
            if (obj.equals(obj)) {
                ((C8NW) c183688Ct.A1h.get()).D87();
            } else {
                AbstractC12120kG.A01("QuickCaptureEditController", "Unsupported sticker editor for canvas mode..");
            }
        }
        C3DN A01 = C3DN.A00.A01(getContext());
        if (A01 != null) {
            A01.A0B();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1550788243);
        super.onCreate(bundle);
        C42509Iro c42509Iro = new C42509Iro(requireActivity(), AbstractC018607g.A00(this), getSession(), this, "canvas_countdown_bottom_sheet_fragment");
        this.A01 = c42509Iro;
        c42509Iro.A04.A00(true);
        C0f9.A09(-911164971, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1020377397);
        View inflate = layoutInflater.inflate(R.layout.countdown_sticker_home, viewGroup, false);
        C0f9.A09(-173601231, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.countdown_sticker_list);
        this.A01.A00(nestableRecyclerView);
        nestableRecyclerView.setPassThroughEdge(1);
    }
}
