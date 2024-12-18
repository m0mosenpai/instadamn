package X;

import android.view.View;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes8.dex */
public final class KLA extends AbstractC48552Ldp {
    public final /* synthetic */ C45513KDd A00;
    public final /* synthetic */ ClipInfo A01;

    public KLA(C45513KDd c45513KDd, ClipInfo clipInfo) {
        this.A00 = c45513KDd;
        this.A01 = clipInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58181Pql
    public final void DPY(VideoPreviewView videoPreviewView, int i, int i2) {
        C5L6 c5l6;
        C45513KDd c45513KDd = this.A00;
        C6WQ c6wq = c45513KDd.A05;
        if (c6wq != null) {
            c6wq.dismiss();
            c45513KDd.A05 = null;
        }
        boolean z = 1;
        c45513KDd.A08 = true;
        if (i != i2) {
            z = 0;
        }
        c45513KDd.A07 = z;
        c45513KDd.A01.setVisibility(AbstractC167007dF.A05(!z));
        AnonymousClass841 A00 = C45513KDd.A00(c45513KDd);
        if (c45513KDd.A07) {
            c5l6 = C5L6.A0E;
        } else {
            c5l6 = ((MX5) A00).A01.A06;
            c5l6.getClass();
        }
        ((MX5) A00).A01.A05 = c5l6;
        c45513KDd.A03.setVisibility(0);
        c45513KDd.A03.A06();
        View view = c45513KDd.A00;
        view.getClass();
        ViewOnClickListenerC48063LPo.A00(view, 35, this);
    }

    @Override // X.AbstractC48552Ldp, X.InterfaceC58181Pql
    public final void Dac(VideoPreviewView videoPreviewView, float f) {
        C45513KDd.A00(this.A00).EPt(f);
        this.A01.A00 = f;
        if (!LHK.A02(0, f, false)) {
            AbstractC12120kG.A01(C45513KDd.__redex_internal_original_name, AnonymousClass001.A0N("Invalid aspect ratio: ", f));
        }
    }
}
