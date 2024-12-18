package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NHT extends AbstractC56270Oyf {
    public View A00;
    public View A01;
    public View A02;
    public final UserSession A03;
    public final C185278Js A04;
    public final InterfaceC190038bM A05;
    public final AbstractC51119MiO A06;
    public final C54425O3f A07;
    public final InterfaceC16660sJ A08;
    public final AbstractC59962oe A09;
    public final boolean A0A;

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        RecyclerView A0B = AbstractC43592JPx.A0B(viewGroup, R.id.audio_filters_recycler_view);
        String str = "contentView";
        if (A0B != null) {
            super.A00 = A0B;
            View findViewById = viewGroup.findViewById(R.id.audio_filter_content);
            this.A00 = findViewById;
            if (findViewById != null) {
                this.A02 = findViewById.findViewById(R.id.audio_filter_play_pause_button);
                View view = this.A00;
                if (view != null) {
                    this.A01 = view.findViewById(R.id.audio_filter_done_button);
                    return;
                }
            }
        } else {
            View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_audio_filter_bottom_sheet, (ViewGroup) null, false);
            this.A00 = inflate;
            if (inflate != null) {
                RecyclerView A0B2 = AbstractC43592JPx.A0B(inflate, R.id.audio_filters_recycler_view);
                C14360o3.A0B(A0B2, 0);
                super.A00 = A0B2;
                View view2 = this.A00;
                if (view2 != null) {
                    this.A02 = view2.findViewById(R.id.audio_filter_play_pause_button);
                    View view3 = this.A00;
                    if (view3 != null) {
                        View findViewById2 = view3.findViewById(R.id.audio_filter_done_button);
                        this.A01 = findViewById2;
                        if (findViewById2 == null) {
                            str = "doneButton";
                        } else {
                            ViewOnClickListenerC55457OkB.A01(findViewById2, 25, this);
                            View view4 = this.A00;
                            if (view4 != null) {
                                viewGroup.addView(view4, new LinearLayout.LayoutParams(-1, -1));
                                A00().setLayoutManager(new GridLayoutManager(A00().getContext(), 3, 1, false));
                                A00().setAdapter(this.A06);
                                C185278Js c185278Js = this.A04;
                                if (c185278Js == null) {
                                    return;
                                }
                                c185278Js.A0B = true;
                                c185278Js.A0D = this.A0A;
                                AbstractC18560vj.A03(C07Y.A00(this.A09), MSW.A1I(PZJ.A01(this, null, 4), c185278Js.A0G));
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public NHT(AbstractC59962oe abstractC59962oe, UserSession userSession, C185278Js c185278Js, InterfaceC190038bM interfaceC190038bM, C54425O3f c54425O3f, boolean z) {
        this.A09 = abstractC59962oe;
        this.A04 = c185278Js;
        this.A07 = c54425O3f;
        this.A0A = z;
        this.A05 = interfaceC190038bM;
        this.A03 = userSession;
        C57747Pja A00 = C57747Pja.A00(this, 7);
        this.A08 = A00;
        this.A06 = new NHQ(A00);
    }
}
