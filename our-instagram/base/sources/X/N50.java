package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N50 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SeriesSelectionSheetFragment";
    public ViewGroup A00;
    public RecyclerView A01;
    public InterfaceC57954Pn0 A02;
    public View A03;
    public ViewGroup A04;
    public AnonymousClass710 A05;
    public O3C A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A01(this);
    public final C51146Mip A07 = new C2UU();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.Integer r4) {
        /*
            r3 = this;
            r2 = 0
            android.view.View r0 = r3.mView
            if (r0 != 0) goto Ld
            X.O3C r0 = new X.O3C
            r0.<init>(r4)
            r3.A06 = r0
            return
        Ld:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 == r2) goto L33
            r0 = 2
            r3.A00(r2)
            if (r1 == r0) goto L2b
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L49
            r0 = 8
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A01
            if (r0 == 0) goto L4c
            r0.setVisibility(r2)
            return
        L2b:
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L49
            r0.setVisibility(r2)
            goto L3f
        L33:
            r3.A00(r0)
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L49
            r0 = 8
            r1.setVisibility(r0)
        L3f:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A01
            if (r1 == 0) goto L4c
            r0 = 8
            r1.setVisibility(r0)
            return
        L49:
            java.lang.String r0 = "errorStateContainer"
            goto L4e
        L4c:
            java.lang.String r0 = "recyclerView"
        L4e:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N50.A01(java.lang.Integer):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "selection_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31180DnO.A08(view);
        this.A04 = (ViewGroup) view.findViewById(R.id.loading_state_container);
        this.A00 = (ViewGroup) view.findViewById(R.id.error_state_container);
        this.A05 = AbstractC54033Nuj.A00(requireContext(), true);
        View requireViewById = view.requireViewById(R.id.loading_spinner);
        AnonymousClass710 anonymousClass710 = this.A05;
        if (anonymousClass710 == null) {
            str = "spinnerDrawable";
        } else {
            requireViewById.setBackground(anonymousClass710);
            this.A03 = requireViewById;
            ViewOnClickListenerC55455Ok9.A01(view.findViewById(R.id.retry), 17, this);
            RecyclerView recyclerView = this.A01;
            str = "recyclerView";
            if (recyclerView != null) {
                recyclerView.setAdapter(this.A07);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    AbstractC31174DnI.A16(getContext(), recyclerView2, 1, false);
                    O3C o3c = this.A06;
                    if (o3c != null) {
                        A01(o3c.A00);
                    }
                    this.A06 = null;
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A00(boolean z) {
        AnonymousClass710 anonymousClass710 = this.A05;
        if (z) {
            if (anonymousClass710 != null) {
                anonymousClass710.A02(true);
                AnonymousClass710 anonymousClass7102 = this.A05;
                if (anonymousClass7102 != null) {
                    anonymousClass7102.A01(1.0f);
                    ViewGroup viewGroup = this.A04;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        RecyclerView recyclerView = this.A01;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(8);
                            return;
                        }
                        C14360o3.A0F("recyclerView");
                    }
                    C14360o3.A0F("loadingStateContainer");
                }
            }
            C14360o3.A0F("spinnerDrawable");
        } else {
            if (anonymousClass710 != null) {
                anonymousClass710.A02(false);
                ViewGroup viewGroup2 = this.A04;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                    RecyclerView recyclerView2 = this.A01;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                        return;
                    }
                    C14360o3.A0F("recyclerView");
                }
                C14360o3.A0F("loadingStateContainer");
            }
            C14360o3.A0F("spinnerDrawable");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-500470524);
        super.onCreate(bundle);
        C0f9.A09(-1712917613, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(550330760);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.selection_sheet_fragment, viewGroup, false);
        C0f9.A09(852497860, A02);
        return inflate;
    }
}
