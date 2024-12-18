package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86803ts implements InterfaceC86813tt {
    public C38321qM A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC80023hr A03;
    public final C86123sj A04;
    public final C75113Zb A05;
    public final C9BH A06;

    public C86803ts(C9BH c9bh, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC80023hr interfaceC80023hr, C86123sj c86123sj, C75113Zb c75113Zb) {
        C14360o3.A0B(c9bh, 2);
        this.A01 = userSession;
        this.A06 = c9bh;
        this.A05 = c75113Zb;
        this.A02 = interfaceC60442pS;
        this.A04 = c86123sj;
        this.A03 = interfaceC80023hr;
    }

    private final void A00() {
        C86123sj c86123sj = this.A04;
        InterfaceC16130rD interfaceC16130rD = c86123sj.A04;
        C0YR[] c0yrArr = C86123sj.A05;
        IgImageView igImageView = (IgImageView) interfaceC16130rD.CES(c86123sj, c0yrArr[0]);
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                igImageView.setUrl(A1S, this.A02);
                InterfaceC16130rD interfaceC16130rD2 = c86123sj.A03;
                ((View) interfaceC16130rD2.CES(c86123sj, c0yrArr[1])).setVisibility(0);
                InterfaceC09390do interfaceC09390do = c86123sj.A02;
                Object value = interfaceC09390do.getValue();
                C14360o3.A07(value);
                c86123sj.A00 = new J19((View) value, new J7S(this, 41), new J6x(this));
                C0fQ.A00(new ViewOnClickListenerC41877IhF(this), (View) interfaceC16130rD2.CES(c86123sj, c0yrArr[1]));
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) ((C9BH) this.A06.A00).A00;
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                C38321qM c38321qM2 = this.A00;
                if (c38321qM2 != null) {
                    interfaceC16620sF.invoke(value2, c38321qM2);
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F("thumbnailMedia");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC86813tt
    public final void ABN() {
        C38321qM A08 = AbstractC86593tX.A08(this.A02, this.A01);
        if (A08 != null && A08.A1S() != null) {
            this.A00 = A08;
            C86123sj c86123sj = this.A04;
            Object value = c86123sj.A02.getValue();
            C14360o3.A07(value);
            ((View) value).setVisibility(0);
            A00();
            J19 j19 = c86123sj.A00;
            if (j19 != null) {
                GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX = j19.A02;
                int i = 1;
                if (AbstractC13620mo.A02(j19.A01.getContext())) {
                    i = -1;
                }
                gestureDetectorOnGestureListenerC148016lX.A01(i * j19.A00, 0.0f);
                gestureDetectorOnGestureListenerC148016lX.A02(J19.A07, 0.0f, 0.0f, 5.0f, 0.0f);
                return;
            }
            C14360o3.A0F("animationController");
            throw C00O.createAndThrow();
        }
        hide();
    }

    @Override // X.InterfaceC86813tt
    public final void Ekx() {
        C38321qM A08 = AbstractC86593tX.A08(this.A02, this.A01);
        if (A08 != null && A08.A1S() != null) {
            this.A00 = A08;
            Object value = this.A04.A02.getValue();
            C14360o3.A07(value);
            ((View) value).setVisibility(0);
            A00();
            return;
        }
        hide();
    }

    @Override // X.InterfaceC86813tt
    public final void hide() {
        this.A04.A01.A03(8);
    }
}
