package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.OJt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54799OJt {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public LinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public InterfaceC56392iX A05;
    public InterfaceC56392iX A06;
    public InterfaceC56392iX A07;
    public InterfaceC56392iX A08;
    public IgdsButton A09;
    public GradientSpinnerAvatarView A0A;
    public String A0B;

    public final IgdsButton A00() {
        IgdsButton igdsButton = this.A09;
        if (igdsButton != null) {
            return igdsButton;
        }
        C14360o3.A0F("shareButtonEvergreen");
        throw C00O.createAndThrow();
    }
}
