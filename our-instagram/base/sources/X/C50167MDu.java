package X;

import com.meta.compose.component.swipeable.SwipeableState;

/* renamed from: X.MDu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50167MDu extends C0YY implements InterfaceC16820sZ {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50167MDu(Object obj, float f, int i) {
        super(0);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A01) {
            case 0:
                C5Y1 c5y1 = (C5Y1) this.A02;
                c5y1.A07(Float.valueOf(this.A00), c5y1.A00);
                return C0eB.A00;
            case 1:
                return Float.valueOf(AbstractC25231BEo.A03(((SwipeableState) this.A02).A09) / this.A00);
            default:
                float f = this.A00;
                LI5 li5 = (LI5) this.A02;
                Long l = li5.A00;
                if (l != null) {
                    li5.A03.markPointWithEditor(l.longValue(), "navigate_to_media_edit_single").addPointData(AbstractC111324zv.A00(1094), f).markerEditingCompleted();
                } else {
                    C0f5 AEp = C18950wb.A01.AEp("media_gallery_logging_step_with_no_flow_id", 817899801);
                    AEp.ABW("logging_step", "navigate_to_media_edit_single");
                    AEp.report();
                }
                return C0eB.A00;
        }
    }
}
