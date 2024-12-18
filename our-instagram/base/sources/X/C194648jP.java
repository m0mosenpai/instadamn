package X;

import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8jP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194648jP implements InterfaceC55932he {
    public float A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public InterfaceC58362lv A02;
    public boolean A03;
    public final Scene A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final C55982hj A0E;
    public final C86S A0F;
    public final InterfaceC193858i6 A0G;
    public final List A0H;

    public C194648jP(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, C86S c86s, InterfaceC193858i6 interfaceC193858i6) {
        C14360o3.A0B(viewGroup, 1);
        this.A0B = viewGroup;
        this.A0D = viewGroup2;
        this.A0C = viewGroup3;
        this.A0G = interfaceC193858i6;
        this.A0F = c86s;
        View requireViewById = viewGroup2.requireViewById(R.id.gallery_container);
        C14360o3.A07(requireViewById);
        this.A09 = (ViewGroup) requireViewById;
        View requireViewById2 = viewGroup2.requireViewById(R.id.gallery_container_coordinator);
        C14360o3.A07(requireViewById2);
        this.A0A = (ViewGroup) requireViewById2;
        View requireViewById3 = viewGroup2.requireViewById(R.id.gallery_app_bar);
        C14360o3.A07(requireViewById3);
        this.A08 = (ViewGroup) requireViewById3;
        View requireViewById4 = viewGroup2.requireViewById(R.id.gallery_header);
        C14360o3.A07(requireViewById4);
        this.A07 = requireViewById4;
        View requireViewById5 = viewGroup2.requireViewById(R.id.text_overlay_edit_text);
        C14360o3.A07(requireViewById5);
        this.A05 = requireViewById5;
        View requireViewById6 = viewGroup2.requireViewById(R.id.gallery_background);
        C14360o3.A07(requireViewById6);
        this.A06 = requireViewById6;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A04(40.0d, 8.0d));
        A02.A06 = true;
        this.A0E = A02;
        this.A0H = new ArrayList();
        this.A04 = new Scene(viewGroup, requireViewById6);
    }

    public final void A00(AnonymousClass851 anonymousClass851) {
        C14360o3.A0B(anonymousClass851, 0);
        List list = this.A0H;
        if (!list.contains(anonymousClass851)) {
            list.add(anonymousClass851);
        }
    }

    public final void A01(boolean z) {
        this.A03 = false;
        C55982hj c55982hj = this.A0E;
        if (c55982hj.A09.A00 != 0.0d) {
            if (z) {
                c55982hj.A06(0.0d);
            } else {
                c55982hj.A08(0.0d, true);
            }
        }
    }

    public final void A02(boolean z) {
        this.A03 = true;
        int height = this.A09.getHeight();
        if (height == 0) {
            if (this.A01 == null) {
                this.A01 = new ViewTreeObserverOnGlobalLayoutListenerC23269ATe(this, z);
                this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
                return;
            }
            return;
        }
        C55982hj c55982hj = this.A0E;
        double d = height;
        if (c55982hj.A09.A00 == d) {
            return;
        }
        if (z) {
            c55982hj.A06(d);
        } else {
            c55982hj.A08(d, true);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        C14360o3.A0B(c55982hj, 0);
        float f2 = (float) c55982hj.A09.A00;
        ViewGroup viewGroup = this.A09;
        int height = viewGroup.getHeight();
        this.A00 = (float) Math.min(Math.max(AbstractC70163Da.A04(f2, 0.0d, height, 0.0d, 1.0d), 0.0d), 1.0d);
        ViewGroup viewGroup2 = this.A0D;
        viewGroup2.setTranslationY(0.0f);
        viewGroup2.setScaleX(1.0f);
        viewGroup2.setScaleY(1.0f);
        if (f2 < 0.0f) {
            f = 0.15f * f2;
        } else {
            float f3 = height;
            if (f2 > f3) {
                f = f3 + ((f2 - f3) * 0.15f);
            } else {
                f = f2;
            }
        }
        float f4 = -f;
        this.A0C.setTranslationY(f4);
        this.A05.setTranslationY(f4);
        float f5 = height - f;
        this.A07.setTranslationY(f5);
        viewGroup.setTranslationY(f5);
        this.A08.setTranslationY(f5);
        this.A0A.setVisibility(f2 <= 0.0f ? 4 : 0);
        List list = this.A0H;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass851) list.get(i)).DJ2(this.A00, f2);
        }
    }
}
