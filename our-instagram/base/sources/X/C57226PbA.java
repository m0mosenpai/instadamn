package X;

import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rp.omnigrid.marlogrid.MarloGridNative;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* renamed from: X.PbA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57226PbA extends C03E implements InterfaceC16660sJ {
    public static final C57226PbA A00 = new C57226PbA();

    public C57226PbA() {
        super(1, AbstractC53429NkI.class, "computeMarloGridLayout", "computeMarloGridLayout(Lcom/facebook/rtc/views/omnigrid/GridLayoutInput;)Lcom/facebook/rtc/views/omnigrid/GridLayoutOutput;", 1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
        C14360o3.A0B(gridLayoutInput, 0);
        C53727NpG c53727NpG = MarloGridNative.Companion;
        GridLayoutOutputBuilder gridLayoutOutputBuilder = new GridLayoutOutputBuilder(gridLayoutInput);
        MarloGridNative.jni_computeMarloGridLayout(gridLayoutInput, gridLayoutOutputBuilder);
        return gridLayoutOutputBuilder.build();
    }
}
