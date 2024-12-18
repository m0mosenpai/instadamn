package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.rtc.presentation.participants.RtcCallParticipantCellView;

/* renamed from: X.OwY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56166OwY implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;

    public C56166OwY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        switch (this.A00) {
            case 2:
                ((C73163Pr) this.A01).A0X(new Exception("Failed to load center image"));
                return;
            case 3:
            default:
                return;
            case 4:
                C69791VvW c69791VvW = (C69791VvW) this.A01;
                c69791VvW.A04.setVisibility(0);
                c69791VvW.A06.setVisibility(0);
                return;
            case 5:
                AbstractC12120kG.A09("post_live_igtv_cover_picker", "Failed to load cover photo", null);
                return;
            case 6:
                InterfaceC09390do interfaceC09390do = ((PCF) this.A01).A07;
                MSW.A0C(interfaceC09390do).setImageBitmap(null);
                AbstractC43593JPy.A1Q(interfaceC09390do.getValue());
                return;
            case 7:
                RtcCallParticipantCellView rtcCallParticipantCellView = (RtcCallParticipantCellView) this.A01;
                rtcCallParticipantCellView.A01 = null;
                rtcCallParticipantCellView.setBackgroundBitmap(null);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        IgImageView igImageView;
        Bitmap bitmap;
        Bitmap bitmap2;
        Context context;
        int i;
        View view;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c73083Pj, 0);
                OEG oeg = (OEG) this.A01;
                if (oeg.A00 == null || (igImageView = oeg.A01) == null || (bitmap = c73083Pj.A02) == null) {
                    return;
                }
                AbstractC14570oV.A02(GradientDrawable.Orientation.TOP_BOTTOM, igImageView, AbstractC14570oV.A00(bitmap, C05F.A00));
                return;
            case 1:
                OEH oeh = (OEH) this.A01;
                if (oeh.A00 == null || oeh.A01 == null || (bitmap2 = c73083Pj.A02) == null) {
                    return;
                }
                AbstractC14570oV.A02(GradientDrawable.Orientation.TOP_BOTTOM, oeh.A01, AbstractC14570oV.A00(bitmap2, C05F.A00));
                return;
            case 2:
                ((AnonymousClass198) this.A01).A0L(C0eB.A00);
                return;
            case 3:
                C14360o3.A0B(c73083Pj, 0);
                Bitmap bitmap3 = c73083Pj.A02;
                if (bitmap3 == null) {
                    return;
                }
                AbstractC52180N7p abstractC52180N7p = ((NEQ) this.A01).A01.A00;
                if (!(abstractC52180N7p instanceof NMX)) {
                    return;
                }
                NMX nmx = (NMX) abstractC52180N7p;
                if (!MSX.A1W(nmx) || (context = nmx.getContext()) == null) {
                    return;
                }
                P44.A00.A00(context, bitmap3, AbstractC166987dD.A0r(nmx.A0W), MSW.A0b(nmx.A0Y));
                return;
            case 4:
                C69791VvW c69791VvW = (C69791VvW) this.A01;
                i = 0;
                c69791VvW.A04.setVisibility(0);
                view = c69791VvW.A06;
                view.setVisibility(i);
                return;
            case 5:
                C14360o3.A0B(c73083Pj, 0);
                Bitmap bitmap4 = c73083Pj.A02;
                if (bitmap4 != null) {
                    NMU nmu = (NMU) this.A01;
                    C50743Max c50743Max = nmu.A07;
                    if (c50743Max != null) {
                        c50743Max.A07 = bitmap4;
                        c50743Max.invalidateSelf();
                        nmu.A00 = bitmap4;
                        if (!nmu.A04) {
                            return;
                        }
                        P44.A00.A00(nmu.requireContext(), bitmap4, AbstractC166987dD.A0r(nmu.A0C), MSW.A0b(nmu.A0D));
                        return;
                    }
                    C14360o3.A0F("thumb");
                    throw C00O.createAndThrow();
                }
                AbstractC12120kG.A09("post_live_igtv_cover_picker", "Failed to load bit map of cover photo", null);
                return;
            case 6:
                AbstractC166987dD.A0d(((PCF) this.A01).A07).setVisibility(0);
                return;
            case 7:
                C14360o3.A0B(c73083Pj, 0);
                ((RtcCallParticipantCellView) this.A01).setBackgroundBitmap(c73083Pj.A02);
                return;
            default:
                C14360o3.A0B(c73083Pj, 0);
                Bitmap bitmap5 = c73083Pj.A02;
                if (bitmap5 != null) {
                    i = 0;
                    int pixel = bitmap5.getPixel(0, 0);
                    boolean z = true;
                    int pixel2 = bitmap5.getPixel(bitmap5.getWidth() - 1, 0);
                    int pixel3 = bitmap5.getPixel(0, bitmap5.getHeight() - 1);
                    int pixel4 = bitmap5.getPixel(bitmap5.getWidth() - 1, bitmap5.getHeight() - 1);
                    if ((pixel != -1 && pixel != 0) || ((pixel2 != -1 && pixel2 != 0) || ((pixel3 != -1 && pixel3 != 0) || (pixel4 != -1 && pixel4 != 0)))) {
                        z = false;
                    }
                    view = (View) this.A01;
                    if (!z) {
                        i = 4;
                    }
                    view.setVisibility(i);
                    return;
                }
                return;
        }
    }
}
