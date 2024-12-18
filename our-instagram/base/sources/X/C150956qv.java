package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.6qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150956qv extends AbstractC125325le {
    public static final C55942hf A02 = C55942hf.A04(40.0d, 7.0d);
    public float A00;
    public final C55982hj A01;

    @Deprecated
    public static void A09(View[] viewArr, boolean z) {
        AbstractC125325le.A04(null, viewArr, z);
    }

    @Deprecated
    public static void A08(View[] viewArr, boolean z) {
        for (View view : viewArr) {
            AbstractC125325le.A03(view, null, 8, z);
        }
    }

    public C150956qv(View view) {
        super(view);
        C55982hj A022 = AbstractC13560mi.A00().A02();
        A022.A09(A02);
        A022.A0A(new C668630d() { // from class: X.6qw
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
                C150956qv c150956qv = C150956qv.this;
                int i = c150956qv.A04;
                if (i != -1) {
                    c150956qv.A0a.setVisibility(i);
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                C150956qv c150956qv = C150956qv.this;
                View view2 = c150956qv.A0a;
                view2.setTag(R.id.view_animator, null);
                int i = c150956qv.A03;
                if (i != -1) {
                    view2.setVisibility(i);
                }
                InterfaceC125355lh interfaceC125355lh = c150956qv.A05;
                if (interfaceC125355lh != null) {
                    interfaceC125355lh.onFinish();
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C150956qv.this.A0L((float) c55982hj.A09.A00);
            }
        });
        this.A01 = A022;
    }
}
