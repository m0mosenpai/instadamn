package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.Owp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56182Owp implements AnonymousClass652 {
    public final /* synthetic */ C55210OeT A00;

    @Override // X.AnonymousClass652
    public final void D38(MotionEvent motionEvent, View view) {
    }

    @Override // X.AnonymousClass652
    public final void DLs(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        C14360o3.A0B(reboundHorizontalScrollView, 0);
        if (i >= 0) {
            C55210OeT c55210OeT = this.A00;
            if (i < C55210OeT.A02(c55210OeT).size()) {
                EnumC131525wo enumC131525wo = reboundHorizontalScrollView.A07;
                if (enumC131525wo != EnumC131525wo.A04) {
                    if (enumC131525wo == EnumC131525wo.A02) {
                        C55982hj c55982hj = reboundHorizontalScrollView.A0I;
                        if (Math.abs(c55982hj.A01 - c55982hj.A03) > 50.0d) {
                            return;
                        }
                    }
                    if (i2 == i) {
                        return;
                    }
                    C55210OeT.A06(c55210OeT, i2, i, true);
                    C55210OeT.A03(c55210OeT);
                    return;
                }
                return;
            }
        }
        C0w9.A03("RtcArEffectPickerTabController", "tab index out of bound.");
    }

    @Override // X.AnonymousClass652
    public final void Dj2(EnumC131525wo enumC131525wo, EnumC131525wo enumC131525wo2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.AnonymousClass652
    public final void DsC(View view, int i) {
        view.setSelected(true);
    }

    @Override // X.AnonymousClass652
    public final void Du6(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.AnonymousClass652
    public final void DuG(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public C56182Owp(C55210OeT c55210OeT) {
        this.A00 = c55210OeT;
    }

    @Override // X.AnonymousClass652
    public final void Dio(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
        if (reboundHorizontalScrollView.A07 == EnumC131525wo.A04 && Math.abs(reboundHorizontalScrollView.getVelocity()) < 1000.0f) {
            C55210OeT c55210OeT = this.A00;
            int indexOf = C55210OeT.A02(c55210OeT).indexOf(c55210OeT.A02);
            int currentChildIndex = reboundHorizontalScrollView.getCurrentChildIndex();
            if (indexOf != currentChildIndex) {
                C55210OeT.A06(c55210OeT, indexOf, currentChildIndex, true);
                C55210OeT.A03(c55210OeT);
            }
        }
    }
}
