package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.LrH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49323LrH implements InterfaceC37172GZj {
    public final /* synthetic */ C45983KWx A00;

    @Override // X.InterfaceC37172GZj
    public final void D8E() {
    }

    @Override // X.InterfaceC37172GZj
    public final void DIb(int i) {
    }

    @Override // X.InterfaceC37172GZj
    public final void Dsr(ImageUrl imageUrl, String str, String str2, int i, int i2, int i3) {
        AbstractC167007dF.A1K(str, str2);
        C45983KWx c45983KWx = this.A00;
        if (C14360o3.A0K(((KDD) c45983KWx).A04, str)) {
            ((KDD) c45983KWx).A04 = null;
            ((C44547Jmr) c45983KWx.A02.getValue()).A00 = null;
        } else {
            ((KDD) c45983KWx).A04 = str;
            ((C44547Jmr) c45983KWx.A02.getValue()).A00 = new AddChannelsRowChannelInfo(str, str2, i);
        }
        ViewModelListUpdate A00 = c45983KWx.A00();
        C66362zD c66362zD = ((KDD) c45983KWx).A02;
        if (c66362zD != null) {
            c66362zD.A05(A00);
        }
        C66362zD c66362zD2 = ((KDD) c45983KWx).A02;
        if (c66362zD2 != null) {
            c66362zD2.notifyItemRangeChanged(0, A00.A00.size());
        }
    }

    public C49323LrH(C45983KWx c45983KWx) {
        this.A00 = c45983KWx;
    }
}
