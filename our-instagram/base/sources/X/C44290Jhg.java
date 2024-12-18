package X;

import android.view.View;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.Jhg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44290Jhg extends C668630d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44290Jhg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        switch (this.A00) {
            case 0:
                ((Runnable) this.A02).run();
                c55982hj.A0B(this);
                return;
            case 1:
            default:
                super.Dnk(c55982hj);
                return;
            case 2:
                ((C38376GuD) this.A02).A03.remove(this.A01);
                return;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        Float valueOf;
        InterfaceC16820sZ interfaceC16820sZ;
        Float valueOf2;
        switch (this.A00) {
            case 1:
                View view = (View) this.A02;
                MediaCaptureFragment mediaCaptureFragment = (MediaCaptureFragment) this.A01;
                MSF msf = mediaCaptureFragment.mCaptureProvider;
                msf.getClass();
                view.setVisibility(AbstractC31175DnJ.A01(((ViewOnClickListenerC44269JhH) msf).A0H ? 1 : 0));
                C55992hk c55992hk = c55982hj.A09;
                view.setAlpha(JQ0.A00(c55992hk.A00));
                double d = c55992hk.A00;
                boolean z = mediaCaptureFragment.A08;
                int height = view.getHeight();
                if (z) {
                    height = -height;
                }
                view.setTranslationY((float) AbstractC70163Da.A02(d, height));
                return;
            case 2:
            default:
                super.Dnm(c55982hj);
                return;
            case 3:
                if (c55982hj == null || (valueOf = Float.valueOf((f = (float) c55982hj.A09.A00))) == null) {
                    return;
                }
                ((C2XI) this.A01).A00(valueOf);
                if (f >= 1.0f) {
                    return;
                }
                interfaceC16820sZ = ((C41176IKp) this.A02).A02;
                break;
            case 4:
                if (c55982hj == null || (valueOf2 = Float.valueOf((float) c55982hj.A09.A00)) == null) {
                    return;
                }
                ((C2XI) this.A01).A00(valueOf2);
                if (!C14360o3.A0I(valueOf2, 1.0f)) {
                    return;
                }
                interfaceC16820sZ = ((C41176IKp) this.A02).A01;
                break;
        }
        interfaceC16820sZ.invoke();
    }
}
