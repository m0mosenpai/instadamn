package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.io.File;

/* renamed from: X.OlT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55535OlT implements SeekBar.OnSeekBarChangeListener, InterfaceC58174Pqe, InterfaceC25193BCq, InterfaceC58090PpF, InterfaceC58280PsY {
    public NYO A00;
    public boolean A01;
    public float A02;
    public InterfaceC09390do A03;
    public final int A04;
    public final LinearLayout A05;
    public final SeekBar A06;
    public final ConstrainedTextureView A07;
    public final C50743Max A08;
    public final InterfaceC58130Ppt A09;
    public final C50982Mfp A0A;
    public final OXC A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final FrameLayout A0G;
    public final UserSession A0H;
    public final InterfaceC57942Pmm A0I;
    public final C9KK A0J;
    public final Runnable A0K;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58174Pqe
    public final void CMa() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58174Pqe
    public final void DaI() {
    }

    @Override // X.InterfaceC25193BCq
    public final void DfG(RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf) {
        UserSession userSession = this.A0H;
        Context context = this.A0F;
        InterfaceC58179Pqj interfaceC58179Pqj = this.A0A.A0D;
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(A0K, 0);
        this.A00 = new NYO(context, userSession, runnableC208819Lp, c208719Lf, this, interfaceC58179Pqj, false);
    }

    @Override // X.InterfaceC58174Pqe
    public final void Eky() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.NnR, java.lang.Object] */
    private void A00() {
        OXC oxc = this.A0B;
        if (oxc != 0) {
            oxc.A00();
            LinearLayout linearLayout = this.A05;
            int childCount = linearLayout.getChildCount() - 1;
            double d = this.A04;
            double d2 = this.A0E;
            int hashCode = linearLayout.hashCode();
            ?? obj = new Object();
            obj.A04 = 0;
            obj.A02 = childCount;
            obj.A01 = d;
            obj.A00 = d2;
            obj.A03 = hashCode;
            oxc.A03(obj);
        }
    }

    @Override // X.InterfaceC58090PpF
    public final void APx(Bitmap bitmap, int i, int i2) {
        LinearLayout linearLayout = this.A05;
        if (linearLayout.hashCode() == i2) {
            ((ImageView) linearLayout.getChildAt(i)).setImageBitmap(bitmap);
        }
    }

    @Override // X.InterfaceC58280PsY
    public final Bitmap AuD() {
        return this.A07.getBitmap();
    }

    @Override // X.InterfaceC25193BCq
    public final void DfH() {
        NYO nyo = this.A00;
        nyo.getClass();
        nyo.A0D = true;
        this.A00 = null;
    }

    @Override // X.InterfaceC58090PpF
    public final void Drf(double[] dArr) {
        OXC oxc = this.A0B;
        if (this.A0G != null && oxc != null) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout.getChildCount() == 0) {
                int width = linearLayout.getWidth();
                int i = this.A04;
                int i2 = (width / i) + 1;
                C50982Mfp c50982Mfp = this.A0A;
                long j = (c50982Mfp.A02 - c50982Mfp.A03) / i2;
                double[] dArr2 = new double[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    dArr2[i3] = r11 + (i3 * j);
                }
                oxc.A04 = dArr2;
                oxc.A00();
                for (int i4 = 0; i4 < i2; i4++) {
                    ImageView imageView = new ImageView(this.A0F);
                    AbstractC43592JPx.A1H(imageView, i, this.A0E);
                    imageView.setPadding(0, 0, 0, 0);
                    linearLayout.addView(imageView);
                }
                A00();
            }
        }
    }

    @Override // X.InterfaceC58280PsY
    public final void ELc(boolean z, float f) {
        this.A02 = f;
        this.A01 = z;
        this.A00.getClass();
        NYO nyo = this.A00;
        if (nyo.A09) {
            nyo.A09();
        } else {
            nyo.A0B = true;
        }
    }

    @Override // X.InterfaceC58174Pqe
    public final void ELo() {
        File file;
        Context context = this.A0F;
        UserSession userSession = this.A0H;
        Bitmap bitmap = this.A07.getBitmap();
        float f = this.A02;
        int i = this.A0D;
        int i2 = this.A0C;
        InterfaceC09390do interfaceC09390do = this.A03;
        if (interfaceC09390do != null) {
            file = (File) interfaceC09390do.getValue();
        } else {
            file = null;
        }
        C55186Odr.A01(context, bitmap, null, userSession, this.A0I, file, f, i, i2);
    }

    @Override // X.InterfaceC58174Pqe
    public final void FC2() {
        this.A0G.postDelayed(new POU(this), 50L);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        RunnableC208819Lp runnableC208819Lp;
        C209359Nt c209359Nt = this.A0J.A08;
        if (c209359Nt != null && (runnableC208819Lp = c209359Nt.A00) != null) {
            runnableC208819Lp.A01();
        }
        OXC oxc = this.A0B;
        if (oxc != null) {
            oxc.A00();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int max = (i * 100) / this.A06.getMax();
            NYO nyo = this.A00;
            if (nyo != null) {
                C50982Mfp c50982Mfp = this.A0A;
                c50982Mfp.A00(max, false);
                Object A02 = c50982Mfp.A05.A02();
                A02.getClass();
                nyo.A0A(AbstractC166987dD.A0H(A02));
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A0J.A00();
        if (this.A05.getChildCount() * this.A04 > 0 && this.A0B != null) {
            A00();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A09.DoA();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.A09.Dp1();
    }

    public C55535OlT(Context context, FrameLayout frameLayout, LinearLayout linearLayout, SeekBar seekBar, C07X c07x, UserSession userSession, C50743Max c50743Max, InterfaceC58130Ppt interfaceC58130Ppt, C50982Mfp c50982Mfp, OXC oxc, String str, InterfaceC09390do interfaceC09390do, float f, float f2, int i, int i2, int i3, int i4) {
        POT pot = new POT(this);
        this.A0K = pot;
        this.A0F = context;
        this.A0H = userSession;
        this.A0G = frameLayout;
        this.A03 = interfaceC09390do;
        C9KK c9kk = new C9KK(context, userSession, str);
        this.A0J = c9kk;
        this.A09 = interfaceC58130Ppt;
        this.A0A = c50982Mfp;
        MY1.A00(c07x, c50982Mfp.A07, this, 16);
        this.A0I = new P1I(c50982Mfp);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        c9kk.A03 = constrainedTextureView;
        this.A07 = constrainedTextureView;
        constrainedTextureView.setVisibility(0);
        c9kk.A07 = this;
        constrainedTextureView.setSurfaceTextureListener(c9kk);
        constrainedTextureView.setAspectRatio(f);
        float f3 = f2 / f;
        if (f3 >= 1.0f) {
            constrainedTextureView.setScaleX(f3);
        } else {
            constrainedTextureView.setScaleY(1.0f / f3);
        }
        frameLayout.addView(constrainedTextureView, 0);
        this.A06 = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.A0E = i2;
        this.A04 = i;
        this.A0B = oxc;
        if (oxc != null) {
            oxc.A02 = this;
        }
        this.A05 = linearLayout;
        linearLayout.post(pot);
        this.A08 = c50743Max;
        this.A0D = i3;
        this.A0C = i4;
    }
}
