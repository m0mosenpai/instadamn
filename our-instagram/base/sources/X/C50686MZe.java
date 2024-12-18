package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.meta.foa.cds.CdsBottomSheetTopSpan;

/* renamed from: X.MZe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50686MZe implements InterfaceC51602Yi {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ CdsBottomSheetTopSpan A02;

    public C50686MZe(Context context, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, float f) {
        this.A02 = cdsBottomSheetTopSpan;
        this.A00 = f;
        this.A01 = context;
    }

    @Override // X.InterfaceC51602Yi
    public final int BeY(View view, int i) {
        float f;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = this.A02;
        if (cdsBottomSheetTopSpan != null) {
            if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.Dp) {
                Context context = this.A01;
                C14360o3.A0B((CdsBottomSheetTopSpan.Dp) cdsBottomSheetTopSpan, 0);
                i -= (int) TypedValue.applyDimension(1, r1.A00, context.getResources().getDisplayMetrics());
            } else {
                if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.ScreenPercent) {
                    f = this.A00 - (((CdsBottomSheetTopSpan.ScreenPercent) cdsBottomSheetTopSpan).A00 / 100.0f);
                    return (int) (f * i);
                }
                throw new RuntimeException();
            }
        }
        f = this.A00;
        return (int) (f * i);
    }
}
