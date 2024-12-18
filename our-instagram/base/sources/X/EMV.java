package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public abstract class EMV extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "BaseManageDataSheetFragment";

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        if (this instanceof EfC) {
            return ((EfC) this).A00;
        }
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        if (this instanceof EfC) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        String str;
        if (this instanceof EfB) {
            EfB efB = (EfB) this;
            int i3 = (-i) - i2;
            LinearLayout linearLayout = efB.A02;
            if (linearLayout == null) {
                str = "buttonContainer";
            } else {
                float f = i3;
                linearLayout.setTranslationY(f);
                Button button = efB.A01;
                if (button == null) {
                    str = "saveButton";
                } else {
                    button.setTranslationY(f);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }
}
