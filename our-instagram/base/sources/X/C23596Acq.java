package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Acq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23596Acq implements C1NJ {
    public final int A00;
    public final Object A01;

    public C23596Acq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        AbstractC80633is abstractC80633is;
        InteractiveDrawableContainer interactiveDrawableContainer;
        C1830289x c1830289x;
        Bitmap bitmap;
        C23780Afr c23780Afr;
        Drawable drawable;
        int i;
        switch (this.A00) {
            case 0:
                AKT akt = (AKT) this.A01;
                if (akt.A04 != this) {
                    return;
                }
                Bitmap bitmap2 = c73033Pe.A01;
                bitmap2.getClass();
                AKT.A00(bitmap2, akt);
                return;
            case 1:
                Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
                if (A0O == null) {
                    return;
                }
                ((AAG) this.A01).A07.invoke(null, null, null, A0O);
                return;
            case 2:
                C14360o3.A0B(c73033Pe, 1);
                AAG aag = (AAG) this.A01;
                C1816583x c1816583x = aag.A03;
                if (c1816583x == null || (interactiveDrawableContainer = aag.A04) == null || (c1830289x = aag.A02) == null || (bitmap = c73033Pe.A01) == null) {
                    return;
                }
                C148276lx c148276lx = C148276lx.A1I;
                C23108AGw A00 = C23108AGw.A00();
                A00.A00 = 1.5f;
                A00.A01 = 0.3f;
                A00.A0Q = false;
                A00.A0F = false;
                C9S6 c9s6 = new C9S6(aag.A00, bitmap, aag.A01, c1816583x, interactiveDrawableContainer);
                aag.A07.invoke(A00, c9s6, c148276lx, bitmap);
                c23780Afr = new C23780Afr(1, c9s6, aag);
                break;
            case 3:
                Bitmap A0O2 = AbstractC166997dE.A0O(c73033Pe);
                if (A0O2 == null) {
                    return;
                }
                C148276lx c148276lx2 = C148276lx.A1P;
                C23108AGw A002 = C23108AGw.A00();
                A002.A00 = 1.5f;
                A002.A01 = 0.3f;
                A002.A0Q = false;
                A002.A0F = false;
                A9S a9s = (A9S) this.A01;
                C1816183p c1816183p = a9s.A01;
                C210569Sv c210569Sv = new C210569Sv(A0O2, a9s.A02, c1816183p.A01, c1816183p.A02);
                a9s.A04.invoke(A002, c210569Sv, c148276lx2);
                c1830289x = a9s.A00;
                c23780Afr = new C23780Afr(2, c210569Sv, a9s);
                break;
            case 4:
                Bitmap A0O3 = AbstractC166997dE.A0O(c73033Pe);
                if (A0O3 == null) {
                    return;
                }
                AbstractC62752SPj abstractC62752SPj = (AbstractC62752SPj) this.A01;
                Resources A0M = AbstractC166997dE.A0M(abstractC62752SPj.A01);
                if (!abstractC62752SPj.A06 && abstractC62752SPj.A00 == 0.0f) {
                    drawable = new BitmapDrawable(A0M, A0O3);
                } else {
                    C8FY c8fy = new C8FY(A0M, A0O3);
                    if (abstractC62752SPj.A06) {
                        c8fy.A00();
                        drawable = c8fy;
                    } else {
                        c8fy.A02(abstractC62752SPj.A00);
                        drawable = c8fy;
                    }
                }
                abstractC62752SPj.A01(drawable);
                return;
            case 5:
                AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
                Bitmap bitmap3 = c73033Pe.A01;
                C80463ib c80463ib = (C80463ib) this.A01;
                if (bitmap3 != null) {
                    ImageUrl BRz = interfaceC59502nt.BRz();
                    C14360o3.A07(BRz);
                    abstractC80633is = new C80623ir(bitmap3, BRz, c73033Pe.A04, c73033Pe.A00);
                } else {
                    abstractC80633is = C220209o6.A00;
                }
                c80463ib.A01 = abstractC80633is;
                return;
            case 6:
                C14360o3.A0B(c73033Pe, 1);
                Bitmap bitmap4 = c73033Pe.A01;
                if (bitmap4 == null) {
                    return;
                }
                C216269hj c216269hj = (C216269hj) this.A01;
                int i2 = c216269hj.A02;
                Float f = c216269hj.A05;
                if (f != null) {
                    i = (int) f.floatValue();
                } else {
                    i = 0;
                }
                Bitmap A003 = C0fK.A00(bitmap4, i2, i, true);
                if (A003 == null) {
                    return;
                }
                C9Rz c9Rz = new C9Rz(A003, null, AbstractC13880nE.A04(c216269hj.A03, 12), 12);
                c9Rz.setBounds(0, 0, A003.getWidth(), A003.getHeight());
                c216269hj.A01 = c9Rz;
                c216269hj.A00 = A003.getHeight();
                return;
            default:
                Bitmap A0O4 = AbstractC166997dE.A0O(c73033Pe);
                if (A0O4 != null) {
                    N54 n54 = (N54) this.A01;
                    Bitmap A05 = C1NC.A05(A0O4);
                    if (A05 != null) {
                        ImageView imageView = n54.A00;
                        if (imageView != null) {
                            imageView.setImageDrawable(new BitmapDrawable(AbstractC166997dE.A0N(n54), A05));
                            ImageView imageView2 = n54.A00;
                            if (imageView2 != null) {
                                imageView2.setColorFilter(n54.requireContext().getColor(R.color.fds_transparent));
                                return;
                            }
                        }
                        C14360o3.A0F("profilePhoto");
                        throw C00O.createAndThrow();
                    }
                    return;
                }
                return;
        }
        c1830289x.A01(c23780Afr);
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        if (5 - this.A00 == 0) {
            ((C80463ib) this.A01).A01 = C220209o6.A00;
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
