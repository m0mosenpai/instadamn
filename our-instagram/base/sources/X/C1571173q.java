package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.73q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571173q implements InterfaceC60602pj, InterfaceC55932he {
    public FrameLayout A00;
    public C126545np A01;
    public C6T7 A02;
    public final C55982hj A03;

    public final void A01(ViewGroup viewGroup, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, Map map) {
        C64842wi c64842wi;
        C62862tP c62862tP;
        C4NJ c4nj;
        FrameLayout frameLayout;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(interfaceC55362gb, 1);
        C14360o3.A0B(c4nl, 2);
        C55982hj c55982hj = this.A03;
        if (!c55982hj.A0C()) {
            c55982hj.A01();
            A00(this);
        }
        c55982hj.A05(0.0d);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        if ((interfaceC55362gb instanceof C64842wi) && (c64842wi = (C64842wi) interfaceC55362gb) != null && (c62862tP = (C62862tP) c64842wi.A02.getValue()) != null && (c4nl instanceof C4NJ) && (c4nj = (C4NJ) c4nl) != null) {
            if (this.A00 == null) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.bloks_floating_banner, viewGroup, false);
                if ((inflate instanceof FrameLayout) && (frameLayout = (FrameLayout) inflate) != null) {
                    this.A00 = frameLayout;
                    viewGroup.addView(frameLayout);
                } else {
                    return;
                }
            }
            C126545np c126545np = new C126545np(context);
            this.A01 = c126545np;
            FrameLayout frameLayout2 = this.A00;
            if (frameLayout2 != null) {
                frameLayout2.addView(c126545np);
            }
            c62862tP.A01.put(R.id.bloks_action_listener, new C69244VkC(context, c62862tP, interfaceC55362gb, c4nj, new C70984Wls(this), map));
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A09.A00 == -1.0d) {
            A00(this);
            C126545np c126545np = this.A01;
            if (c126545np != null) {
                c126545np.setTranslationY(0.0f);
            }
            c55982hj.A05(0.0d);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int i;
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        C126545np c126545np = this.A01;
        if (c126545np != null) {
            i = c126545np.getMeasuredHeight();
        } else {
            i = 0;
        }
        C126545np c126545np2 = this.A01;
        if (c126545np2 != null) {
            c126545np2.setTranslationY((-f) * i);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C1571173q c1571173q) {
        C6T7 c6t7 = c1571173q.A02;
        if (c6t7 != null) {
            c6t7.A05();
            c1571173q.A02 = null;
            FrameLayout frameLayout = c1571173q.A00;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            c1571173q.A01 = null;
        }
    }

    public C1571173q() {
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A02);
        A02.A05(0.0d);
        A02.A06 = true;
        A02.A0A(this);
        this.A03 = A02;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        A00(this);
        this.A01 = null;
        this.A00 = null;
    }
}
