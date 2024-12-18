package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Ldq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48553Ldq implements InterfaceC58181Pql {
    public final /* synthetic */ C45752KNf A00;

    @Override // X.InterfaceC58181Pql
    public final void Dac(VideoPreviewView videoPreviewView, float f) {
    }

    @Override // X.InterfaceC58181Pql
    public final void Dbw(int i, int i2) {
    }

    public C48553Ldq(C45752KNf c45752KNf) {
        this.A00 = c45752KNf;
    }

    @Override // X.InterfaceC58181Pql
    public final void DFu(String str) {
        InterfaceC58181Pql interfaceC58181Pql = this.A00.A02;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DFu(str);
        }
    }

    @Override // X.InterfaceC58181Pql
    public final void DPY(VideoPreviewView videoPreviewView, int i, int i2) {
        C45752KNf c45752KNf = this.A00;
        c45752KNf.A00(false);
        c45752KNf.A04.requestLayout();
        InterfaceC58181Pql interfaceC58181Pql = c45752KNf.A02;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DPY(videoPreviewView, i, i2);
        }
    }

    @Override // X.InterfaceC58181Pql
    public final void DYw(VideoPreviewView videoPreviewView) {
        InterfaceC58181Pql interfaceC58181Pql = this.A00.A02;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DYw(videoPreviewView);
        }
    }

    @Override // X.InterfaceC58181Pql
    public final void DYx(VideoPreviewView videoPreviewView) {
        InterfaceC58181Pql interfaceC58181Pql = this.A00.A02;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DYx(videoPreviewView);
        }
    }

    @Override // X.InterfaceC58181Pql
    public final void DoM(MXU mxu) {
        C45752KNf c45752KNf;
        View view;
        boolean z;
        if (mxu == MXU.PAUSED) {
            c45752KNf = this.A00;
            view = c45752KNf.A01;
            z = true;
        } else {
            if (mxu != MXU.STARTED) {
                return;
            }
            c45752KNf = this.A00;
            view = c45752KNf.A01;
            z = false;
        }
        ViewPropertyAnimator animate = view.animate();
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        animate.alpha(f).setDuration(c45752KNf.A00).setListener(new WGw(0, view, z)).start();
    }
}
