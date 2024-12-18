package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class NEQ extends AbstractC66412zI {
    public final C168607fu A00;
    public final O3D A01;

    public NEQ(C168607fu c168607fu, O3D o3d) {
        C14360o3.A0B(c168607fu, 2);
        this.A01 = o3d;
        this.A00 = c168607fu;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C51327Mlo c51327Mlo = new C51327Mlo(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.video_caption_cover_photo_layout, false));
        C55346Oi6.A01(c51327Mlo.A04, this, 4);
        return c51327Mlo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        boolean z;
        int i;
        int i2;
        C56302iJ c56302iJ;
        String str;
        NF0 nf0 = (NF0) interfaceC66482zP;
        C51327Mlo c51327Mlo = (C51327Mlo) c3oo;
        boolean A1a = AbstractC167017dG.A1a(nf0, c51327Mlo);
        IgAutoCompleteTextView igAutoCompleteTextView = c51327Mlo.A04;
        igAutoCompleteTextView.setText(nf0.A04);
        igAutoCompleteTextView.A07 = A1a;
        igAutoCompleteTextView.setAdapter(this.A00);
        FrameLayout frameLayout = c51327Mlo.A01;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if ((layoutParams instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams) != null) {
            if (1 - nf0.A03.intValue() != 0) {
                str = "H,1:1";
            } else {
                str = "H,0.643:1";
            }
            c56302iJ.A0z = str;
        }
        TypedValue typedValue = new TypedValue();
        IgImageView igImageView = c51327Mlo.A03;
        igImageView.getResources().getValue(R.dimen.clips_minicountdown_view_parent_view_ratio, typedValue, A1a);
        AbstractC13880nE.A0g(frameLayout, (int) (AbstractC13880nE.A0A(AbstractC166997dE.A0L(igImageView)) * typedValue.getFloat()));
        int A05 = AbstractC167007dF.A05(nf0.A05 ? 1 : 0);
        c51327Mlo.A02.setVisibility(A05);
        c51327Mlo.A00.setVisibility(A05);
        android.net.Uri uri = nf0.A00;
        if (uri != null) {
            igImageView.setImageURI(uri);
        }
        ImageUrl imageUrl = nf0.A02;
        if (imageUrl != null) {
            igImageView.A0E = new C56166OwY(this, 3);
            igImageView.setUrl(imageUrl, nf0.A01);
        }
        AbstractC56952jT.A01(frameLayout);
        ViewOnClickListenerC55460OkF.A00(frameLayout, 25, this);
        AbstractC52180N7p abstractC52180N7p = this.A01.A00;
        abstractC52180N7p.A00 = frameLayout;
        if (abstractC52180N7p instanceof NMX) {
            NMX nmx = (NMX) abstractC52180N7p;
            if ((MSW.A0c(nmx).A0J == null || AbstractC167007dF.A1W(MSW.A0b(nmx.A0Y).A0M.A0C)) && nmx.A0B == null) {
                if (MSW.A0c(nmx).A00 > 0.643f) {
                    z = true;
                    i = NNE.A00(nmx).A0G;
                } else {
                    z = false;
                    i = (int) (NNE.A00(nmx).A0H / 0.643f);
                }
                C47Z c47z = MSY.A0O(nmx).A02;
                if (z) {
                    i2 = (int) (c47z.A0G * 0.643f);
                } else {
                    i2 = c47z.A0H;
                }
                float f = 0.643f;
                if (MSW.A0c(nmx).A00 == 1.0f) {
                    f = 1.0f;
                }
                Context requireContext = nmx.requireContext();
                InterfaceC09390do interfaceC09390do = nmx.A0W;
                PJQ pjq = new PJQ(requireContext, frameLayout, AbstractC166987dD.A0r(interfaceC09390do), new P1J(nmx, 2), new C24197AoK(nmx.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), NNE.A00(nmx), NNE.A00(nmx).A02), f, i2, i);
                C9KK c9kk = pjq.A01;
                c9kk.A07 = pjq;
                c9kk.A00();
                nmx.A0B = pjq;
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NF0.class;
    }
}
