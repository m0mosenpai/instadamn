package X;

import android.view.View;
import com.facebook.R;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;

/* loaded from: classes9.dex */
public final class NXW extends AbstractC54484O5m {
    public C51681MsC A00;
    public boolean A01;
    public final View.OnClickListener A02;
    public final View A03;
    public final RtcCallParticipantCellView A04;
    public final O57 A05;
    public final InterfaceC16620sF A06;
    public final InterfaceC16610sE A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NXW(View view, O57 o57, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A07 = interfaceC16610sE;
        this.A05 = o57;
        this.A06 = interfaceC16620sF;
        this.A02 = new Ok3(interfaceC16820sZ, 30);
        RtcCallParticipantCellView rtcCallParticipantCellView = (RtcCallParticipantCellView) AbstractC166997dE.A0R(view, R.id.call_participant_cell_view);
        this.A04 = rtcCallParticipantCellView;
        rtcCallParticipantCellView.setVideoSizeChangeListener(new C56684PEc(this));
        rtcCallParticipantCellView.setFrameRenderListener(new C57524Pfy(this, 6));
        rtcCallParticipantCellView.setOnVisibilityChangedListener(new C57753Pjg(this, 29));
        AbstractC13880nE.A0q(rtcCallParticipantCellView, new PO8(this));
        rtcCallParticipantCellView.A03 = interfaceC16820sZ2;
    }

    public final void A01() {
        this.A00 = null;
        RtcCallParticipantCellView rtcCallParticipantCellView = this.A04;
        C55720Oom c55720Oom = rtcCallParticipantCellView.A0F;
        AbstractC166987dD.A0d(c55720Oom.A0A).removeOnLayoutChangeListener(rtcCallParticipantCellView.A07);
        c55720Oom.A01();
        rtcCallParticipantCellView.A04 = null;
    }

    public static final void A00(NXW nxw, C51681MsC c51681MsC, boolean z) {
        C51681MsC c51681MsC2;
        if (!z && (c51681MsC2 = nxw.A00) != null && c51681MsC.A02 == c51681MsC2.A02 && c51681MsC.A0N == c51681MsC2.A0N) {
            return;
        }
        if (c51681MsC.A0N) {
            RtcCallParticipantCellView rtcCallParticipantCellView = nxw.A04;
            InterfaceC16660sJ interfaceC16660sJ = c51681MsC.A05.A00;
            C57228PbC c57228PbC = new C57228PbC(nxw, 13);
            C55720Oom c55720Oom = rtcCallParticipantCellView.A0F;
            interfaceC16660sJ.invoke(c55720Oom);
            if (rtcCallParticipantCellView.A04 == null) {
                AbstractC166987dD.A0d(c55720Oom.A0A).addOnLayoutChangeListener(rtcCallParticipantCellView.A07);
            }
            rtcCallParticipantCellView.A04 = c57228PbC;
            rtcCallParticipantCellView.A0A.setVisibility(0);
            return;
        }
        RtcCallParticipantCellView rtcCallParticipantCellView2 = nxw.A04;
        rtcCallParticipantCellView2.A0A.setVisibility(8);
        C55720Oom c55720Oom2 = rtcCallParticipantCellView2.A0F;
        UAG uag = c55720Oom2.A01;
        if (uag != null) {
            uag.A0C.clearImage();
        }
        AbstractC166987dD.A0d(c55720Oom2.A0A).removeOnLayoutChangeListener(rtcCallParticipantCellView2.A07);
        c55720Oom2.A01();
        rtcCallParticipantCellView2.A04 = null;
    }
}
