package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JWv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43757JWv extends AbstractC37623GhI implements C38Y {
    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    public final View A0B() {
        if (this instanceof C46110KbA) {
            L5B l5b = ((C46110KbA) this).A00;
            if (l5b != null) {
                return l5b.A03;
            }
            return null;
        }
        return ((C43755JWt) this).A01;
    }

    public final void A0C() {
        if (this instanceof C43755JWt) {
            C43755JWt c43755JWt = (C43755JWt) this;
            C43756JWu c43756JWu = c43755JWt.A0N;
            if (c43756JWu != null) {
                c43756JWu.A0B(null, true);
            }
            ViewGroup viewGroup = c43755JWt.A02;
            if (viewGroup != null && viewGroup.getVisibility() == 4) {
                ViewGroup viewGroup2 = c43755JWt.A02;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                View view = c43755JWt.A01;
                if (view != null) {
                    view.setOnTouchListener(null);
                }
            }
            FragmentActivity fragmentActivity = c43755JWt.A0G;
            Drawable drawable = fragmentActivity.getApplicationContext().getDrawable(R.drawable.instagram_reaction_add_pano_outline_24);
            int color = fragmentActivity.getApplicationContext().getColor(AbstractC53242c7.A0B(fragmentActivity.getApplicationContext()));
            IgImageView igImageView = c43755JWt.A03;
            if (igImageView != null) {
                igImageView.setImageDrawable(drawable);
            }
            IgImageView igImageView2 = c43755JWt.A03;
            if (igImageView2 != null) {
                igImageView2.setColorFilter(color);
                return;
            }
            return;
        }
        C46110KbA c46110KbA = (C46110KbA) this;
        c46110KbA.A06.A0B(null, true);
        L5B l5b = c46110KbA.A00;
        if (l5b != null && l5b.A00.getVisibility() == 4) {
            L5B l5b2 = c46110KbA.A00;
            if (l5b2 != null) {
                l5b2.A00.setVisibility(0);
            }
            L5B l5b3 = c46110KbA.A00;
            if (l5b3 != null) {
                l5b3.A03.setOnTouchListener(null);
            }
        }
        L5B l5b4 = c46110KbA.A00;
        if (l5b4 != null) {
            IgImageView igImageView3 = l5b4.A07;
            Activity activity = c46110KbA.A03;
            AbstractC166997dE.A19(activity, igImageView3, R.drawable.instagram_reaction_add_pano_outline_24);
            AbstractC31173DnH.A11(activity, igImageView3, AbstractC53242c7.A0B(activity));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0D() {
        if (this instanceof C43755JWt) {
            C43755JWt c43755JWt = (C43755JWt) this;
            AbstractC13880nE.A0K(c43755JWt.A0G);
            c43755JWt.A09 = false;
            C43755JWt.A05(c43755JWt);
            return;
        }
        C46110KbA c46110KbA = (C46110KbA) this;
        AbstractC13880nE.A0K(c46110KbA.A03);
        c46110KbA.A01 = false;
        C46110KbA.A02(c46110KbA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0E() {
        C46110KbA c46110KbA;
        if (this instanceof C43755JWt) {
            C43755JWt c43755JWt = (C43755JWt) this;
            AbstractC167007dF.A0x(c43755JWt.A01);
            c46110KbA = c43755JWt;
        } else {
            C46110KbA c46110KbA2 = (C46110KbA) this;
            L5B l5b = c46110KbA2.A00;
            c46110KbA = c46110KbA2;
            if (l5b != null) {
                l5b.A03.setVisibility(8);
                c46110KbA = c46110KbA2;
            }
        }
        c46110KbA.A0D();
    }

    public final void A0F() {
        if (this instanceof C43755JWt) {
            AbstractC167007dF.A0w(((C43755JWt) this).A01);
            return;
        }
        L5B l5b = ((C46110KbA) this).A00;
        if (l5b == null) {
            return;
        }
        l5b.A03.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43757JWv.A0G(java.lang.String, java.lang.String):void");
    }

    public final boolean A0H() {
        Integer num;
        if (this instanceof C43755JWt) {
            C43755JWt c43755JWt = (C43755JWt) this;
            C37556GgC c37556GgC = ((AbstractC37623GhI) c43755JWt).A02;
            if (c37556GgC != null) {
                num = Integer.valueOf(c37556GgC.A03());
            } else {
                num = null;
            }
            if (c43755JWt.A0I.A0J && num != null && num.intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0I() {
        boolean z;
        View view;
        if (this instanceof C43755JWt) {
            view = ((C43755JWt) this).A01;
            z = false;
            if (view == null) {
                return false;
            }
        } else {
            L5B l5b = ((C46110KbA) this).A00;
            z = false;
            if (l5b == null) {
                return false;
            }
            view = l5b.A03;
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return z;
    }
}
