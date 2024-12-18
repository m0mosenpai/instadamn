package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;

/* loaded from: classes4.dex */
public final class AK9 {
    public float A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final InterfaceC189978bG A04;
    public final ATQ A05;
    public final A8U A06;
    public final View A07;
    public final boolean A08;
    public final View[] A09;
    public final View[] A0A;

    public static final void A00(AK9 ak9, float f) {
        View[] viewArr;
        int i;
        if (!ak9.A01) {
            viewArr = ak9.A09;
            i = 8;
        } else if (!ak9.A08) {
            float f2 = 1.0f - 0.33333334f;
            float f3 = 1.0f - 0.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 0.33333334f) / f2;
            }
            float f5 = (f4 * f3) + 0.0f;
            viewArr = ak9.A09;
            for (View view : viewArr) {
                view.setAlpha(f5);
            }
            i = 0;
            if (f == 0.0f && ak9.A04.Cdk()) {
                i = 4;
            }
        } else {
            return;
        }
        for (View view2 : viewArr) {
            view2.setVisibility(i);
        }
    }

    public static final void A01(AK9 ak9, float f) {
        View[] viewArr;
        int i;
        if (!ak9.A04.Cdk()) {
            viewArr = ak9.A0A;
            i = 8;
        } else {
            float f2 = 0.6666666f - 0.0f;
            float f3 = 0.0f - 1.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 0.0f) / f2;
            }
            float f5 = (f4 * f3) + 1.0f;
            viewArr = ak9.A0A;
            for (View view : viewArr) {
                view.setAlpha(f5);
            }
            i = 0;
            if (f == 1.0f) {
                i = 4;
            }
        }
        for (View view2 : viewArr) {
            view2.setVisibility(i);
        }
    }

    public AK9(ViewGroup viewGroup, InterfaceC189978bG interfaceC189978bG, AMp aMp, boolean z) {
        this.A08 = z;
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.sticker_preview_view);
        this.A07 = A0S;
        View A0S2 = AbstractC166997dE.A0S(viewGroup, R.id.lyrics_scrubber_view);
        this.A02 = A0S2;
        this.A04 = interfaceC189978bG;
        this.A05 = new ATQ(this);
        this.A00 = -1.0f;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = ((C8J9) aMp.A0M).A01.A0P;
        C14360o3.A07(nestableSnapPickerRecyclerView);
        this.A0A = new View[]{A0S, nestableSnapPickerRecyclerView};
        this.A09 = new View[]{A0S2};
        this.A06 = aMp.A0N;
        this.A03 = viewGroup.requireViewById(R.id.sticker_edit_container);
    }
}
