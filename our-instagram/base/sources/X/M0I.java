package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class M0I implements Runnable {
    public final /* synthetic */ KCP A00;

    public M0I(KCP kcp) {
        this.A00 = kcp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KB4 kb4;
        KCP kcp = this.A00;
        C47Z A0i = AbstractC43593JPy.A0i(kcp);
        if (A0i == null) {
            C0f5 AEp = C18950wb.A01.AEp(KCP.__redex_internal_original_name, 817901174);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Getting pendingMedia failed");
            AEp.report();
            return;
        }
        if (kcp.mView == null) {
            return;
        }
        ClipInfo clipInfo = A0i.A1N;
        double A0A = AbstractC13880nE.A0A(kcp.requireContext()) / 7.5d;
        C54998OUj c54998OUj = NLH.A0Z;
        Context requireContext = kcp.requireContext();
        InterfaceC09390do interfaceC09390do = kcp.A0O;
        double A01 = c54998OUj.A01(requireContext, AbstractC166987dD.A0r(interfaceC09390do), clipInfo);
        if (A0A < A01) {
            A0A = A01;
        }
        int i = (int) A0A;
        double dimensionPixelSize = AbstractC31177DnL.A09(kcp).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        double dimensionPixelSize2 = AbstractC31177DnL.A09(kcp).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
        if (dimensionPixelSize < dimensionPixelSize2) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        try {
            kcp.A0H = new OXC(AbstractC166987dD.A0r(interfaceC09390do), AbstractC54906OQd.A00(clipInfo), i, (int) dimensionPixelSize);
        } catch (IOException e) {
            AbstractC12120kG.A09(KCP.__redex_internal_original_name, MSV.A00(875), e);
        }
        Integer num = kcp.A0I;
        if ((num == C05F.A0N || num == C05F.A0C) && (kb4 = kcp.A0E) != null) {
            kb4.A07 = kcp.A0H;
            kb4.A0D();
        }
        C9KK c9kk = kcp.A0G;
        if (c9kk == null) {
            return;
        }
        int i2 = clipInfo.A09;
        int i3 = clipInfo.A06;
        c9kk.A01 = i2;
        c9kk.A00 = i3;
    }
}
