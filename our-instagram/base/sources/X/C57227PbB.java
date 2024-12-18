package X;

import com.facebook.rp.omnigrid.arlogrid.ArloGridNative;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* renamed from: X.PbB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57227PbB extends C03E implements InterfaceC16660sJ {
    public static final C57227PbB A00 = new C57227PbB();

    public C57227PbB() {
        super(1, AbstractC53428NkH.class, "computeArloGridLayout", "computeArloGridLayout(Lcom/facebook/rtc/views/omnigrid/GridLayoutInput;)Lcom/facebook/rtc/views/omnigrid/GridLayoutOutput;", 1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
        C14360o3.A0B(gridLayoutInput, 0);
        C53726NpF c53726NpF = ArloGridNative.Companion;
        GridLayoutOutputBuilder gridLayoutOutputBuilder = new GridLayoutOutputBuilder(gridLayoutInput);
        ArloGridNative.jni_computeArloGridLayout(gridLayoutInput, gridLayoutOutputBuilder);
        return gridLayoutOutputBuilder.build();
    }
}
