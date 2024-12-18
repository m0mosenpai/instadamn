package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.88T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88T implements View.OnFocusChangeListener, InterfaceC195198kL, C88U, C88V {
    public int A00;
    public View A01;
    public TextView A02;
    public IgTextView A03;
    public C57012jc A04;
    public C57012jc A05;
    public C57012jc A06;
    public SearchEditText A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C88S A0B;
    public final C88Q A0C;
    public final C88W A0D;
    public final int A0E;
    public final Context A0F;
    public final InterfaceC1810081c A0G;

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        this.A0A = true;
        float f = this.A00 + this.A0E;
        C57012jc c57012jc = this.A06;
        c57012jc.getClass();
        View A01 = c57012jc.A01();
        C57012jc c57012jc2 = this.A04;
        c57012jc2.getClass();
        c57012jc2.A01().setY(i2 - f);
        A01.setY((i2 - (A01.getHeight() - this.A03.getHeight())) / 2);
        if (this.A09) {
            A01(this);
            C57012jc c57012jc3 = this.A04;
            c57012jc3.getClass();
            View[] viewArr = {c57012jc3.A01()};
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A04(null, viewArr, false);
        }
    }

    public static SearchEditText A00(C88T c88t) {
        C57012jc c57012jc = c88t.A06;
        c57012jc.getClass();
        return (SearchEditText) c57012jc.A01().requireViewById(R.id.canvas_text_view_input_text);
    }

    public static void A01(C88T c88t) {
        C57012jc c57012jc = c88t.A04;
        c57012jc.getClass();
        if (!c57012jc.A04()) {
            ((RecyclerView) c88t.A04.A01()).setLayoutManager(new LinearLayoutManager(c88t.A0F, 0, false));
        }
    }

    public final void A02() {
        C57012jc c57012jc = this.A06;
        c57012jc.getClass();
        if (c57012jc.A04()) {
            C150956qv.A08(new View[]{this.A06.A01()}, true);
        }
        C57012jc c57012jc2 = this.A05;
        c57012jc2.getClass();
        if (c57012jc2.A04()) {
            C150956qv.A08(new View[]{this.A05.A01()}, false);
        }
        C57012jc c57012jc3 = this.A04;
        c57012jc3.getClass();
        if (c57012jc3.A04()) {
            C150956qv.A08(new View[]{this.A04.A01()}, false);
        }
    }

    public final void A03() {
        if (this.A0A) {
            C88R c88r = this.A0B.A00;
            c88r.A00.getClass();
            c88r.A00.setBackgroundColor(0);
            c88r.A00.setOnTouchListener(null);
            this.A08 = false;
            this.A0A = false;
            this.A07.clearFocus();
            this.A07.setOnFocusChangeListener(null);
            SearchEditText searchEditText = this.A07;
            searchEditText.A0C = null;
            searchEditText.A0F = null;
            C57012jc c57012jc = this.A04;
            c57012jc.getClass();
            if (c57012jc.A04()) {
                C150956qv.A08(new View[]{this.A04.A01()}, false);
            }
            this.A01.getClass();
            C57012jc c57012jc2 = this.A06;
            c57012jc2.getClass();
            c57012jc2.A01().setY(((r3.getHeight() - r3.getPaddingBottom()) - r2.getHeight()) / 2);
        }
    }

    @Override // X.C88V
    public final void DkN(SearchEditText searchEditText, int i, int i2) {
        C88E c88e = this.A0C.A00;
        C88X A01 = c88e.A0H.A01();
        if (A01 != null && !C88E.A00(A01)) {
            if (c88e.A01(A01) instanceof C218109ki) {
                AbstractC167027dH.A0q(searchEditText, i, i2);
                return;
            }
            return;
        }
        AbstractC12120kG.A01("CanvasDialController::onSearchQuerySelectionChanged", "Null dial element for onSearchQuerySelectionChanged");
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.A0D.A00();
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0S(view);
        } else {
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0O(view);
            this.A0D.A01();
        }
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C88E c88e = this.A0C.A00;
        C88X A01 = c88e.A0H.A01();
        A01.getClass();
        ACt A012 = c88e.A01(A01);
        if (A012 instanceof C218069ke) {
            ((C218069ke) A012).A0E.A05();
        }
    }

    public C88T(Context context, C3I9 c3i9, C88S c88s, C88Q c88q, InterfaceC1810081c interfaceC1810081c) {
        this.A0F = context;
        this.A0D = new C88W(context, c3i9, this);
        this.A0G = interfaceC1810081c;
        this.A0C = c88q;
        this.A0B = c88s;
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        A03();
        this.A0G.E4u(new Object());
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        C88E c88e = this.A0C.A00;
        C88X A01 = c88e.A0H.A01();
        A01.getClass();
        ACt A012 = c88e.A01(A01);
        if (A012 instanceof C218109ki) {
            C218109ki c218109ki = (C218109ki) A012;
            c218109ki.A03 = null;
            c218109ki.A0B.A07();
            c218109ki.A06 = false;
            if (charSequence2.equals("@")) {
                charSequence2 = "";
            }
            c218109ki.A0E.Eby(charSequence2);
        } else if (A012 instanceof C218069ke) {
            C218069ke.A02((C218069ke) A012, charSequence2);
        }
        this.A03.setText((CharSequence) null);
    }
}
