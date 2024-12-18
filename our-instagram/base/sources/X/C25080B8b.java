package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel$postVideoSegmentForTransformEdit$1;

/* renamed from: X.B8b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25080B8b extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C206169Az A03;
    public final /* synthetic */ C81N A04;
    public final /* synthetic */ C8NJ A05;
    public final /* synthetic */ C8MT A06;
    public final /* synthetic */ C9TP A07;
    public final /* synthetic */ ClipsCreationViewModel A08;
    public final /* synthetic */ C8NL A09;
    public final /* synthetic */ C87H A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25080B8b(ViewGroup viewGroup, C206169Az c206169Az, C81N c81n, C8NJ c8nj, C8MT c8mt, C9TP c9tp, ClipsCreationViewModel clipsCreationViewModel, C8NL c8nl, C87H c87h, float f, float f2) {
        super(1);
        this.A07 = c9tp;
        this.A02 = viewGroup;
        this.A04 = c81n;
        this.A05 = c8nj;
        this.A0A = c87h;
        this.A06 = c8mt;
        this.A03 = c206169Az;
        this.A00 = f;
        this.A09 = c8nl;
        this.A08 = clipsCreationViewModel;
        this.A01 = f2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        Integer A01;
        Bitmap bitmap = (Bitmap) obj;
        C14360o3.A0B(bitmap, 0);
        C9TP c9tp = this.A07;
        ViewGroup viewGroup = this.A02;
        c9tp.setBackground(new BitmapDrawable(viewGroup.getContext().getResources(), bitmap));
        c9tp.setVisibility(0);
        C81N c81n = this.A04;
        boolean z = false;
        if (c81n.A0D != null) {
            z = true;
            c81n.A05().setVisibility(4);
        }
        C8NJ c8nj = this.A05;
        c8nj.A05 = true;
        C87H c87h = this.A0A;
        if (c87h.A0A.A02() == EnumC189218Zt.A05) {
            c8nj.A03 = -1;
        }
        C8MT c8mt = this.A06;
        C206169Az A00 = C9O8.A00(c8mt.A05, 1.0f);
        c8nj.A01 = A00;
        C206169Az A03 = AMG.A03(this.A03, A00);
        c8nj.A04 = false;
        float f2 = A03.A03 / 3.0f;
        float f3 = A03.A02;
        float f4 = A03.A00;
        float f5 = this.A00;
        c8mt.A09(f2, f3, f4 / f5, A03.A01 / f5);
        c8nj.A04 = true;
        if (z) {
            MultiListenerTextureView A06 = c81n.A06();
            Matrix A0Q = AbstractC166987dD.A0Q();
            A0Q.setScale(f5, f5, AbstractC166987dD.A07(c81n.A05()) / 2.0f, AbstractC166987dD.A08(c81n.A05()) / 2.0f);
            A06.setTransform(A0Q);
        } else {
            c81n.A05().setScaleX(f5);
            c81n.A05().setScaleY(f5);
        }
        c8nj.A00 = f5;
        C8NL c8nl = this.A09;
        int A002 = c87h.A00();
        C9ZF A003 = C8NL.A00(c8nl);
        if (A003 != null && (A01 = C8NL.A01(c8nl.A0E(A003.A02), A002)) != null) {
            A002 = A01.intValue();
        }
        c87h.A07(A002);
        C9ZF A004 = C8NL.A00(c8nl);
        if (A004 != null) {
            C09530e4 A0E = c8nl.A0E(A004.A02);
            c87h.A08(AbstractC166987dD.A0H(A0E.A00), AbstractC166987dD.A0H(A0E.A01));
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A08;
        float f6 = this.A01;
        if (f6 < 0.5625f) {
            f = 0.5625f / f6;
        } else {
            f = 1.0f;
        }
        AbstractC166987dD.A1Z(new ClipsCreationViewModel$postVideoSegmentForTransformEdit$1(clipsCreationViewModel, null, f), AbstractC141776au.A00(clipsCreationViewModel));
        viewGroup.removeView(c9tp);
        viewGroup.addView(c9tp);
        return C0eB.A00;
    }
}
