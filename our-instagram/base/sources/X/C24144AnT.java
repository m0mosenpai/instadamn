package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AnT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24144AnT implements InterfaceC184998Io {
    public final /* synthetic */ C23805AgG A00;

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void DOn(float f, float f2) {
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void E2A(float f) {
    }

    public C24144AnT(C23805AgG c23805AgG) {
        this.A00 = c23805AgG;
    }

    private final void A00(float f) {
        C23805AgG c23805AgG = this.A00;
        AbstractC167007dF.A0w(c23805AgG.A03);
        SurfaceTexture surfaceTexture = c23805AgG.A02;
        if (surfaceTexture != null) {
            W37.A00(new X34(surfaceTexture, c23805AgG.A09, f, c23805AgG.A01, c23805AgG.A00));
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
        String str;
        C23805AgG c23805AgG = this.A00;
        AbstractC167007dF.A0x(c23805AgG.A03);
        W37 w37 = c23805AgG.A09;
        EnumC185018Iq enumC185018Iq = c23805AgG.A0K;
        C14360o3.A0B(enumC185018Iq, 0);
        Map map = w37.A04;
        C22952A9w c22952A9w = (C22952A9w) map.get(enumC185018Iq);
        if (c22952A9w != null) {
            FilmstripTimelineView filmstripTimelineView = c23805AgG.A05;
            str = "trimmerTimelineView";
            if (filmstripTimelineView != null) {
                float leftTrimmerValue = filmstripTimelineView.A0A.getLeftTrimmerValue();
                float rightTrimmerValue = filmstripTimelineView.A0A.getRightTrimmerValue();
                float f = c22952A9w.A00;
                if (f != leftTrimmerValue || c22952A9w.A01 != rightTrimmerValue) {
                    if (f != leftTrimmerValue) {
                        c22952A9w.A00 = leftTrimmerValue;
                    }
                    if (c22952A9w.A01 != rightTrimmerValue) {
                        c22952A9w.A01 = rightTrimmerValue;
                    }
                    C8J0 c8j0 = c23805AgG.A0A;
                    C14360o3.A0B("boomerang trimmed", 0);
                    c8j0.A03.A0C("boomerang trimmed", c8j0.A00);
                    FilmstripTimelineView filmstripTimelineView2 = c23805AgG.A05;
                    if (filmstripTimelineView2 != null) {
                        float leftTrimmerValue2 = filmstripTimelineView2.A0A.getLeftTrimmerValue();
                        float rightTrimmerValue2 = filmstripTimelineView2.A0A.getRightTrimmerValue();
                        AtomicInteger atomicInteger = w37.A05;
                        if (atomicInteger.get() != 5 && atomicInteger.compareAndSet(0, 5)) {
                            try {
                                String A0C = AbstractC916948n.A0C(AbstractC916948n.A0D(null, 0, false));
                                C14360o3.A07(A0C);
                                w37.A06.invoke();
                                W37.A00(new X33(w37, A0C, leftTrimmerValue2, rightTrimmerValue2));
                            } catch (IOException e) {
                                C0K8.A0F(AbstractC111324zv.A00(290), AbstractC111324zv.A00(693), e);
                            }
                        }
                        EnumC185018Iq enumC185018Iq2 = c23805AgG.A0K;
                        C14360o3.A0B(enumC185018Iq2, 0);
                        C22952A9w c22952A9w2 = (C22952A9w) map.get(enumC185018Iq2);
                        if (c22952A9w2 != null) {
                            c22952A9w2.A03++;
                            return;
                        }
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        EnumC185018Iq enumC185018Iq3 = c23805AgG.A0K;
        C14360o3.A0B(enumC185018Iq3, 0);
        C22952A9w c22952A9w3 = (C22952A9w) map.get(enumC185018Iq3);
        if (c22952A9w3 != null) {
            FilmstripTimelineView filmstripTimelineView3 = c23805AgG.A05;
            if (filmstripTimelineView3 == null) {
                str = "trimmerTimelineView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            filmstripTimelineView3.A01(c22952A9w3.A00, c22952A9w3.A01);
        }
        AbstractC167007dF.A0x(c23805AgG.A03);
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        C23805AgG c23805AgG = this.A00;
        if (c23805AgG.A03 == null) {
            TextureView textureView = new TextureView(c23805AgG.A06);
            FrameLayout frameLayout = c23805AgG.A04;
            if (frameLayout == null) {
                C14360o3.A0F("trimmerPreviewViewHolder");
                throw C00O.createAndThrow();
            }
            frameLayout.addView(textureView);
            textureView.setSurfaceTextureListener(new AQ2(c23805AgG, 3));
            textureView.setVisibility(8);
            c23805AgG.A03 = textureView;
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        A00(f);
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        A00(f);
    }
}
