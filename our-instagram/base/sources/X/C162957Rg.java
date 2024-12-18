package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162957Rg implements C7QD {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public C57012jc A04;
    public InterfaceC56392iX A05;
    public JTR A06;
    public boolean A07;
    public final View A08;
    public final ViewStub A09;
    public final C162987Rj A0A;
    public final AnonymousClass988 A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    public final void A00(TextView textView) {
        InterfaceC56392iX interfaceC56392iX = this.A05;
        if (!interfaceC56392iX.CWW()) {
            View view = this.A08;
            TextView textView2 = textView;
            if (textView == null) {
                textView2 = interfaceC56392iX.getView();
            }
            this.A03 = textView2;
            if (textView2 != null) {
                this.A07 = AbstractC13620mo.A02(view.getContext());
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.direct_row_message_sidebar_width);
                int i = dimensionPixelSize;
                if (this.A07) {
                    i = -dimensionPixelSize;
                }
                this.A02 = i;
                ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                this.A03.setLayoutParams(layoutParams);
                this.A03.setTranslationX(this.A02);
                if (((Boolean) this.A0B.A0Y.getValue()).booleanValue()) {
                    this.A03.setVisibility(8);
                }
            }
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A08;
    }

    public C162957Rg(ViewGroup viewGroup, C55952hg c55952hg, AnonymousClass988 anonymousClass988) {
        this.A08 = viewGroup;
        this.A0B = anonymousClass988;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.message_status_stub);
        this.A09 = viewStub;
        this.A05 = AbstractC56372iV.A01(viewStub, false, false);
        this.A04 = new C57012jc((ViewStub) viewGroup.findViewById(R.id.action_icon_stub));
        this.A0A = new C162987Rj(c55952hg, new InterfaceC162977Ri() { // from class: X.7Rh
            @Override // X.InterfaceC162977Ri
            public final float Abt() {
                return -((C162957Rg.this.A05.getView().getY() + (r4.getHeight() / 2.0f)) - (r1.A08.getContext().getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) / 2.0f));
            }

            @Override // X.InterfaceC162977Ri
            public final void CwW() {
                InterfaceC164967Zl interfaceC164967Zl;
                JTR jtr = C162957Rg.this.A06;
                if (jtr != null && (interfaceC164967Zl = jtr.A01.A01) != null) {
                    ((InterfaceC165607an) interfaceC164967Zl).DkV(new MessageIdentifier(jtr.A02.A03, null));
                }
            }

            @Override // X.InterfaceC162977Ri
            public final void Dx5(float f, float f2, float f3, float f4, float f5) {
                InterfaceC163207Sf interfaceC163207Sf;
                C162957Rg c162957Rg = C162957Rg.this;
                C57012jc c57012jc = c162957Rg.A04;
                if (c57012jc.A00() == 0) {
                    View A01 = c57012jc.A01();
                    A01.setTranslationX(f3 + f2);
                    A01.setTranslationY(f4);
                    A01.setRotation(f5);
                    float f6 = c162957Rg.A01 * (1.0f - f);
                    JTR jtr = c162957Rg.A06;
                    if (jtr != null && (interfaceC163207Sf = jtr.A00) != null) {
                        interfaceC163207Sf.E29(f2, f6);
                    }
                }
            }
        });
    }
}
