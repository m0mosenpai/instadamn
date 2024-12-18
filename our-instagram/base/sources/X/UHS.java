package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UHS extends C1I4 implements XDJ {
    public ValueAnimator A00;
    public Integer A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final View A06;
    public final ViewOnKeyListenerC67976V4r A07;
    public final C70666Wem A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final boolean A0E;
    public final RecyclerView A0F;

    public UHS(Context context, View view, RecyclerView recyclerView, ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, C70666Wem c70666Wem, boolean z) {
        C14360o3.A0B(context, 1);
        this.A06 = view;
        this.A0F = recyclerView;
        this.A0E = z;
        this.A08 = c70666Wem;
        this.A07 = viewOnKeyListenerC67976V4r;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
        this.A04 = AbstractC167017dG.A0B(context);
        this.A0B = AbstractC09440dt.A01(new X32(this, 33));
        this.A0C = AbstractC09440dt.A01(new X32(this, 34));
        this.A09 = AbstractC09440dt.A01(new X32(this, 31));
        this.A0A = AbstractC09440dt.A01(new X32(this, 32));
        this.A0D = AbstractC09440dt.A01(new X32(this, 35));
        this.A01 = C05F.A01;
        if (z) {
            new C71L(this.A03, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION).A04((View) this.A0C.getValue());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(250L);
            C65759TtZ.A00(ofFloat, this, 15);
            U5Q.A00(ofFloat, this, 20);
            this.A00 = ofFloat;
        }
    }

    @Override // X.XDJ
    public final boolean DC8(C70419WUx c70419WUx, float f, int i) {
        boolean z = i == 1 && A00(this.A0F);
        this.A02 = z;
        return z;
    }

    public static final boolean A00(RecyclerView recyclerView) {
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        if (linearLayoutManager.A1b() + 1 == linearLayoutManager.A0U()) {
            View A0e = linearLayoutManager.A0e(linearLayoutManager.A0T() - 1);
            if (A0e != null) {
                if (A0e.getBottom() == recyclerView.getHeight()) {
                    return true;
                }
                return false;
            }
            throw AbstractC166997dE.A0g();
        }
        return false;
    }

    @Override // X.XDJ
    public final void DBu(C70419WUx c70419WUx, float f) {
        InterfaceC09390do interfaceC09390do;
        float f2 = this.A03;
        float f3 = -f;
        if (f2 + f3 >= f2) {
            float f4 = this.A05;
            if (f3 >= f4) {
                f3 = f4;
            }
            float f5 = f3 / f4;
            if (this.A0E) {
                interfaceC09390do = this.A0B;
            } else {
                interfaceC09390do = this.A0C;
            }
            ViewGroup.LayoutParams layoutParams = ((View) interfaceC09390do.getValue()).getLayoutParams();
            layoutParams.height = (int) (f2 + f3);
            ((View) this.A0C.getValue()).setLayoutParams(layoutParams);
            float f6 = (-f3) / 2.0f;
            float f7 = ((-this.A04) * f5) + f6;
            ((View) this.A09.getValue()).setTranslationY(f7);
            InterfaceC09390do interfaceC09390do2 = this.A0A;
            ((View) interfaceC09390do2.getValue()).setTranslationY(f7);
            ((View) interfaceC09390do2.getValue()).setAlpha(f5);
            ((View) this.A0D.getValue()).setTranslationY(f6);
            this.A0F.scrollBy(0, (int) f3);
        }
    }

    @Override // X.XDJ
    public final void DC1(C70419WUx c70419WUx, float f, float f2) {
        float abs = Math.abs(f) / this.A05;
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(abs, 0.0f);
        ofFloat.setDuration(250L);
        C65759TtZ.A00(ofFloat, this, 14);
        ofFloat.addListener(new C66299U7x(this, abs, 4));
        ofFloat.start();
        this.A02 = false;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        int A03 = C0f9.A03(693264027);
        if (!this.A02) {
            boolean A00 = A00(this.A0F);
            ValueAnimator valueAnimator = this.A00;
            if (A00) {
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning() && ((View) this.A0B.getValue()).getAlpha() == 1.0f) {
                        this.A01 = C05F.A01;
                        valueAnimator.start();
                    } else if (valueAnimator.isRunning() && this.A01 == C05F.A00) {
                        num = C05F.A01;
                        this.A01 = num;
                        valueAnimator.reverse();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (valueAnimator != null) {
                if ((!valueAnimator.isRunning() && ((View) this.A0B.getValue()).getAlpha() == 0.0f) || (valueAnimator.isRunning() && this.A01 == C05F.A01)) {
                    num = C05F.A00;
                    this.A01 = num;
                    valueAnimator.reverse();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0A(-1446612219, A03);
    }
}
