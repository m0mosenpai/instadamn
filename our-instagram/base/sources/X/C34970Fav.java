package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Fav, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34970Fav {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public C163917Vf A04;
    public IgdsButton A05;
    public IgdsButton A06;
    public AnonymousClass195 A07;
    public final View A09;
    public boolean A08 = true;
    public final C19L A0A = AnonymousClass194.A02(C12L.A00.A04);

    public C34970Fav(View view, C163917Vf c163917Vf) {
        this.A09 = view;
        this.A04 = c163917Vf;
    }

    public static final void A00(View view, String str) {
        if (view != null) {
            if (str != null) {
                view.setVisibility(0);
                if (view instanceof IgdsButton) {
                    ((IgdsButton) view).setText(str);
                    return;
                } else {
                    if (!(view instanceof IgTextView)) {
                        return;
                    }
                    ((TextView) view).setText(str);
                    return;
                }
            }
            view.setVisibility(8);
        }
    }
}
