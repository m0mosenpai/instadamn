package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* loaded from: classes7.dex */
public abstract class IZ9 {
    public static final InterfaceC65702y7 A00 = C42357IpJ.A00;

    public static final void A00(View.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, IgImageButton igImageButton, int i, int i2, boolean z, boolean z2) {
        int i3;
        String str;
        EnumC153466vG enumC153466vG;
        C14360o3.A0B(igImageButton, 0);
        AbstractC167017dG.A1P(c38321qM, interfaceC11380iw);
        C38321qM A1e = c38321qM.A1e(0);
        if (A1e == null) {
            A1e = c38321qM;
        }
        if (A1e.Cff()) {
            i3 = 2131963491;
            if (z) {
                i3 = 2131963149;
            }
        } else {
            i3 = 2131963490;
            if (z) {
                i3 = 2131963148;
            }
        }
        igImageButton.setContentDescription(igImageButton.getResources().getString(i3, AbstractC25228BEl.A1Z(Integer.valueOf(i + 1), i2 + 1)));
        if (!z) {
            ((IgImageView) igImageButton).A0I = A00;
        }
        igImageButton.setVisibility(0);
        igImageButton.A0H();
        if (z && A1e.BRN() != null) {
            InterfaceC109094vY BRN = A1e.BRN();
            if (BRN != null) {
                str = BRN.getOverlayType();
            } else {
                str = null;
            }
            if ("MISINFORMATION".equals(str)) {
                enumC153466vG = EnumC153466vG.A0G;
            } else {
                enumC153466vG = EnumC153466vG.A0B;
            }
            igImageButton.setIcon(enumC153466vG);
            ((IgImageView) igImageButton).A04 = 6;
            AbstractC25235BEs.A1I(interfaceC11380iw, igImageButton, AnonymousClass001.A0R(AbstractC111324zv.A00(1180), A1e.BU6()));
        } else {
            igImageButton.setIcon(EnumC153466vG.A0C);
            ((IgImageView) igImageButton).A04 = 3;
            ImageUrl A1S = A1e.A1S();
            if (A1S != null) {
                igImageButton.setUrl(A1S, interfaceC11380iw);
            }
        }
        if (z2) {
            igImageButton.setIcon(EnumC153466vG.A0H);
        }
        igImageButton.setOnTouchListener(null);
        if (onClickListener == null) {
            C0fQ.A00(ViewOnClickListenerC42032Ik1.A00(igImageButton, 30), igImageButton);
        } else {
            C0fQ.A00(onClickListener, igImageButton);
        }
    }
}
