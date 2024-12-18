package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1;

/* loaded from: classes5.dex */
public final class DIB extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ EnumC27376C6f A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ C19L A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIB(LazyListState lazyListState, InterfaceC74953Yl interfaceC74953Yl, EnumC27376C6f enumC27376C6f, InterfaceC16660sJ interfaceC16660sJ, C19L c19l, float f, float f2, float f3) {
        super(1);
        this.A06 = interfaceC16660sJ;
        this.A05 = enumC27376C6f;
        this.A07 = c19l;
        this.A03 = lazyListState;
        this.A04 = interfaceC74953Yl;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        this.A06.invoke(obj);
        EnumC27376C6f enumC27376C6f = this.A05;
        if (enumC27376C6f == EnumC27376C6f.A03 || enumC27376C6f == EnumC27376C6f.A05) {
            AbstractC166987dD.A1Z(new IgdsSegmentedPillsKt$IgdsSegmentedPills$11$1$1$clickModifier$1$1$1(this.A03, this.A04, null, this.A00, this.A01, this.A02), this.A07);
        }
        return C0eB.A00;
    }
}
