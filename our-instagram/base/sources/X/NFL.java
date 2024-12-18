package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFL extends AbstractC66422zJ {
    public final int A02;
    public final C65921TwS A03;
    public final InterfaceC72020XFi A04;
    public final boolean A05;
    public final boolean A06;
    public List A01 = AbstractC166987dD.A1E();
    public List A00 = AbstractC166987dD.A1E();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        float f = RecyclerView.A1E;
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        return new C51266Mkp(layoutInflater, new C51384Mmk(context, C16930sl.A00, 0, 2000L, 45L, true), this.A03, this.A04);
    }

    public static final List A00(XFM xfm) {
        List list = ((C51795Muz) xfm).A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            NUO nuo = new NUO((XFL) obj);
            C65954Twz c65954Twz = new C65954Twz();
            c65954Twz.A09 = "meta_ai_cloud_pill";
            c65954Twz.A08 = "AI_CLOUD";
            c65954Twz.A01 = i;
            c65954Twz.A05 = AbstractC37303Gc4.A0X("AI_CLOUD");
            A0q.add(new NUY(nuo, new Tx0(c65954Twz)));
            i = i2;
        }
        return A0q;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C66362zD c66362zD;
        List list;
        VA4 va4 = (VA4) interfaceC66482zP;
        C51266Mkp c51266Mkp = (C51266Mkp) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, va4, c51266Mkp);
        C51384Mmk c51384Mmk = c51266Mkp.A00;
        if (c51384Mmk != null) {
            C2UU c2uu = c51384Mmk.A0A;
            if ((c2uu instanceof C66362zD) && (c66362zD = (C66362zD) c2uu) != null) {
                int i = this.A02;
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                XFM xfm = va4.A00;
                List A00 = A00(xfm);
                if (this.A06 && AbstractC166987dD.A1b(A00)) {
                    if (this.A01.isEmpty()) {
                        this.A01 = C0eM.A1H(A00);
                    }
                    list = this.A01;
                } else if (AbstractC166987dD.A1b(A00)) {
                    list = A00(xfm);
                } else {
                    if (this.A00.isEmpty()) {
                        int i2 = i * 6;
                        ArrayList A17 = AbstractC25225BEi.A17(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            A17.add(new C56087Ov4(AbstractC167007dF.A1N(i3 % 4)));
                        }
                        this.A00 = A17;
                    }
                    list = this.A00;
                }
                A0E.A01(list);
                Context A0L = AbstractC166997dE.A0L(c51384Mmk);
                View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(A0L), null, R.layout.meta_ai_pill_keyword, false);
                A0R.setTag(new C54618OAt(A0R));
                int i4 = 0;
                A0R.measure(View.MeasureSpec.makeMeasureSpec(c51384Mmk.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), 0);
                float f = 1.5f;
                if (i == A1R) {
                    f = 2.0f;
                }
                int measuredHeight = (int) (A0R.getMeasuredHeight() * i * f);
                if (measuredHeight > 0) {
                    i4 = measuredHeight;
                }
                boolean z = ((C51795Muz) xfm).A01;
                if (!this.A05) {
                    z = false;
                }
                if (c51384Mmk.A00 != i || c51384Mmk.A01 != z) {
                    c51384Mmk.setIsScrollAnimationEnabled(z);
                    ArrayList A172 = AbstractC25225BEi.A17(i);
                    for (int i5 = 0; i5 < i; i5++) {
                        AbstractC166997dE.A1W(A172, AbstractC167017dG.A03(A0L));
                    }
                    c51384Mmk.A00 = i;
                    Context context = c51384Mmk.A05;
                    c51384Mmk.setLayoutManager(new HorizontalStaggeredLayoutManager(context, new C51752Mtb((List) A172, AbstractC167017dG.A0A(context), AbstractC167017dG.A06(context), A1R ? 1 : 0), i));
                    AbstractC43592JPx.A1H(c51384Mmk, -1, i4);
                }
                c66362zD.A05(A0E);
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA4.class;
    }

    public NFL(C65921TwS c65921TwS, InterfaceC72020XFi interfaceC72020XFi, int i, boolean z, boolean z2) {
        this.A03 = c65921TwS;
        this.A04 = interfaceC72020XFi;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = i;
    }
}
