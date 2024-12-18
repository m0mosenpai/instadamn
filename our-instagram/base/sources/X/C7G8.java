package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.7G8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G8 implements InterfaceC160027Fo {
    public int A00;
    public int A01;
    public final Activity A02;
    public final UserSession A03;
    public final InterfaceC160057Fr A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final C7FM A0H;

    @Override // X.InterfaceC160027Fo
    public final void Ehp(C7GY c7gy, C7GX c7gx, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c7gx, 0);
        C14360o3.A0B(c7gy, 1);
        View A00 = A00(c7gy, c7gx, z);
        if (A00 != null) {
            C0fQ.A00(new ViewOnClickListenerC23206AQq(interfaceC16660sJ), A00);
        }
    }

    @Override // X.InterfaceC160027Fo
    public final void FBu(C7GX c7gx, final InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        int i = 0;
        C14360o3.A0B(c7gx, 0);
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) this.A09.getValue();
        View view = null;
        if (interfaceC56392iX != null) {
            view = null;
            if (interfaceC56392iX.CWW() || z) {
                view = interfaceC56392iX.getView();
            }
        }
        if ((view instanceof ColorFilterAlphaImageView) && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) view) != null) {
            C09530e4 c09530e4 = new C09530e4(c7gx, Boolean.valueOf(z));
            C7GX c7gx2 = C7GX.A0L;
            if (!c09530e4.equals(new C09530e4(c7gx2, false))) {
                C7GX c7gx3 = C7GX.A0M;
                if (!c09530e4.equals(new C09530e4(c7gx3, false))) {
                    if (c09530e4.equals(new C09530e4(c7gx2, true))) {
                        C0fQ.A00(new View.OnClickListener(this) { // from class: X.7OE
                            public final /* synthetic */ C7G8 A00;

                            {
                                this.A00 = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int A05 = C0f9.A05(1391505552);
                                interfaceC16660sJ.invoke(this.A00.A02);
                                C0f9.A0C(-763167361, A05);
                            }
                        }, colorFilterAlphaImageView);
                        colorFilterAlphaImageView.A04(this.A01, this.A00);
                        colorFilterAlphaImageView.setVisibility(i);
                    } else {
                        if (!c09530e4.equals(new C09530e4(c7gx3, true))) {
                            return;
                        }
                        C0fQ.A00(new ViewOnClickListenerC23218ARc(this, interfaceC16660sJ), colorFilterAlphaImageView);
                        int i2 = this.A0C;
                        int i3 = this.A0B;
                        AbstractC125325le.A01(colorFilterAlphaImageView, 0).A0G();
                        colorFilterAlphaImageView.setVisibility(0);
                        colorFilterAlphaImageView.A04(i2, i3);
                        AbstractC125325le A01 = AbstractC125325le.A01(colorFilterAlphaImageView, 0);
                        A01.A0G();
                        A01.A0U(0.0f, 1.0f, -1.0f);
                        A01.A0V(0.0f, 1.0f, -1.0f);
                        A01.A0E(C55942hf.A04(60.0d, 5.0d)).A0H();
                        return;
                    }
                }
            }
            i = 8;
            colorFilterAlphaImageView.setVisibility(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r5 != 3) goto L25;
     */
    @Override // X.InterfaceC160027Fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FD5(X.C7GY r8, X.C7GX r9, boolean r10) {
        /*
            r7 = this;
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            android.view.View r4 = r7.A00(r8, r9, r10)
            if (r4 == 0) goto L4e
            if (r10 == 0) goto L66
            X.7GX r0 = X.C7GX.A0A
            if (r9 != r0) goto L45
            X.0do r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            X.2iX r0 = (X.InterfaceC56392iX) r0
            if (r0 == 0) goto L45
            android.view.View r3 = r0.getView()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L45
            com.instagram.common.session.UserSession r5 = r7.A03
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36607603991647860(0x820e6c00001674, double:3.214134399083117E-306)
            long r5 = X.C18U.A01(r2, r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L62
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L4f
            r1 = 2131238736(0x7f081f50, float:1.809376E38)
        L42:
            r3.setImageResource(r1)
        L45:
            r0 = 0
        L46:
            r4.setVisibility(r0)
            X.7FM r0 = r7.A0H
            r0.A00(r8, r9, r10)
        L4e:
            return
        L4f:
            r1 = 2
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L59
            r1 = 2131238608(0x7f081ed0, float:1.80935E38)
            goto L42
        L59:
            r1 = 3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 2131238035(0x7f081c93, float:1.8092337E38)
            if (r0 == 0) goto L42
        L62:
            r1 = 2131238605(0x7f081ecd, float:1.8093493E38)
            goto L42
        L66:
            r0 = 8
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7G8.FD5(X.7GY, X.7GX, boolean):void");
    }

    private final View A00(C7GY c7gy, C7GX c7gx, boolean z) {
        InterfaceC09390do interfaceC09390do;
        View view = null;
        if (c7gy == C7GY.A07) {
            switch (c7gx.ordinal()) {
                case 0:
                    return (View) this.A05.getValue();
                case 1:
                    return this.A0E;
                case 4:
                    return this.A0F;
                case 11:
                    return this.A0G;
                case 21:
                    interfaceC09390do = this.A06;
                    break;
                case 22:
                    interfaceC09390do = this.A0A;
                    break;
                case 24:
                    interfaceC09390do = this.A08;
                    break;
                case 25:
                    interfaceC09390do = this.A07;
                    break;
            }
            InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue();
            view = null;
            if ((interfaceC56392iX != null && interfaceC56392iX.CWW()) || (z && interfaceC56392iX != null)) {
                return interfaceC56392iX.getView();
            }
        }
        return view;
    }

    @Override // X.InterfaceC160027Fo
    public final void ADr(C7IK c7ik) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        this.A01 = c7ik.A0C;
        this.A00 = c7ik.A0D;
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) this.A09.getValue();
        if (interfaceC56392iX != null && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) interfaceC56392iX.getView()) != null) {
            colorFilterAlphaImageView.A04(this.A01, this.A00);
        }
    }

    public C7G8(Activity activity, View view, UserSession userSession, InterfaceC160057Fr interfaceC160057Fr, C7FM c7fm) {
        this.A03 = userSession;
        this.A02 = activity;
        this.A0H = c7fm;
        this.A04 = interfaceC160057Fr;
        Context context = view.getContext();
        this.A0D = context;
        this.A01 = AbstractC53242c7.A0F(context, R.attr.glyphColorPrimary);
        this.A00 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        this.A0C = context.getColor(R.color.badge_color);
        this.A0B = context.getColor(R.color.blue_3);
        this.A0E = view.findViewById(R.id.row_thread_composer_button_gallery);
        this.A0G = view.findViewById(R.id.row_thread_composer_voice);
        this.A0F = view.findViewById(R.id.row_thread_composer_button_sticker);
        this.A05 = C1XM.A00(new C206819Dm(this, 32));
        this.A09 = C1XM.A00(new C206819Dm(view, 36));
        this.A08 = C1XM.A00(new C206819Dm(view, 35));
        this.A06 = C1XM.A00(new C206819Dm(view, 33));
        this.A07 = C1XM.A00(new C206819Dm(view, 34));
        this.A0A = C1XM.A00(new C206819Dm(view, 37));
    }
}
