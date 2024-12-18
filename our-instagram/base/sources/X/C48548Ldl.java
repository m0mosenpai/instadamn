package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Ldl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48548Ldl implements InterfaceC60152ox {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        KFH kfh;
        String str;
        AbstractC125325le A0A;
        switch (this.A00) {
            case 0:
                if (i <= 0) {
                    return;
                }
                View view = ((L5D) this.A01).A03;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                return;
            case 1:
                View view2 = ((C48593LeV) this.A01).A04;
                if (view2 == null) {
                    return;
                }
                A0A = AbstractC43592JPx.A0n(view2).A0A();
                A0A.A0K(-i);
                A0A.A0H();
                return;
            case 2:
                int i2 = 0;
                boolean z2 = true;
                if (i == 0) {
                    z2 = false;
                    C215759gr c215759gr = (C215759gr) this.A01;
                    C210989Uv c210989Uv = c215759gr.A00;
                    if (c210989Uv != null) {
                        c210989Uv.A01.clearFocus();
                        C23630AdP.A00(c215759gr.A04.A00);
                    }
                }
                A0A = AbstractC125325le.A01(((C215759gr) this.A01).A01, 0);
                A0A.A0K(-i);
                A0A.A04 = 0;
                if (!z2) {
                    i2 = 8;
                }
                A0A.A03 = i2;
                float f = 0.0f;
                if (z2) {
                    f = 1.0f;
                }
                A0A.A0I(f);
                A0A.A0H();
                return;
            case 3:
                LRZ lrz = (LRZ) this.A01;
                lrz.A00 = AbstractC167007dF.A1O(i);
                View view3 = lrz.A02;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i > 0) {
                    marginLayoutParams.bottomMargin = i;
                } else {
                    marginLayoutParams.bottomMargin = 0;
                }
                view3.setLayoutParams(layoutParams);
                return;
            case 4:
                kfh = ((C45816KPv) this.A01).A02;
                ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(AbstractC43593JPy.A0D(kfh));
                A0G.setMargins(A0G.leftMargin, A0G.topMargin, A0G.rightMargin, i);
                AbstractC43593JPy.A0D(kfh).requestLayout();
                return;
            case 5:
                C45815KPu c45815KPu = (C45815KPu) this.A01;
                kfh = c45815KPu.A07;
                ViewGroup.MarginLayoutParams A0G2 = AbstractC31177DnL.A0G(AbstractC43593JPy.A0D(kfh));
                A0G2.setMargins(A0G2.leftMargin, A0G2.topMargin, A0G2.rightMargin, i + AbstractC167017dG.A06(c45815KPu.requireContext()));
                AbstractC43593JPy.A0D(kfh).requestLayout();
                return;
            case 6:
                KBZ kbz = (KBZ) this.A01;
                kbz.A02 = i;
                kbz.A00 = i;
                KBZ.A04(kbz, i);
                if (i == 0) {
                    return;
                }
                AbstractC167007dF.A0x(kbz.A05);
                return;
            case 7:
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                c45466KBb.A00 = i;
                RecyclerView recyclerView = c45466KBb.A0C;
                if (recyclerView != null && recyclerView.getVisibility() == 0 && c45466KBb.A00 == 0) {
                    C45466KBb.A0G(c45466KBb);
                }
                if (!c45466KBb.A0w) {
                    View view4 = c45466KBb.A04;
                    if (view4 == null) {
                        C14360o3.A0F("bottomBarContainer");
                        throw C00O.createAndThrow();
                    }
                    ViewGroup.MarginLayoutParams A0G3 = AbstractC31177DnL.A0G(view4);
                    A0G3.bottomMargin = c45466KBb.A00;
                    view4.setLayoutParams(A0G3);
                }
                if (c45466KBb.A0t) {
                    if (c45466KBb.A00 > 0) {
                        C45466KBb.A0C(c45466KBb);
                    } else if (!c45466KBb.A0w) {
                        int A00 = AbstractC13890nF.A00(c45466KBb.requireContext()) / 2;
                        C56352iT c56352iT = c45466KBb.A0E;
                        if (c56352iT == null) {
                            str = "actionBarService";
                        } else {
                            int AYS = A00 - c56352iT.AYS();
                            View view5 = c45466KBb.A03;
                            str = "avatarContainer";
                            if (view5 != null) {
                                int height = (AYS - view5.getHeight()) - AbstractC166997dE.A0N(c45466KBb).getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                                View view6 = c45466KBb.A03;
                                if (view6 != null) {
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, "translationY", view6.getTranslationY(), height);
                                    ofFloat.setDuration(250L);
                                    ofFloat.start();
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                c45466KBb.A0t = true;
                return;
            case 8:
                AbstractC43592JPx.A19(i, (InterfaceC16660sJ) this.A01);
                return;
            default:
                boolean A1S = AbstractC25230BEn.A1S(i, C30D.A01);
                C19L c19l = (C19L) this.A01;
                AbstractC166987dD.A1Z(new C50110MAi(c19l, null, i, 1, A1S), c19l);
                return;
        }
    }

    public C48548Ldl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
