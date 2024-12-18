package X;

import android.opengl.GLES10;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;

/* renamed from: X.8oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197728oj implements InterfaceC197718oi {
    public AnonymousClass810 A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C14510oO A04;
    public final /* synthetic */ C15080pO A05;
    public final /* synthetic */ C15080pO A06;
    public final /* synthetic */ C15370ps A07;
    public final /* synthetic */ C15370ps A08;
    public final /* synthetic */ C15370ps A09;
    public final /* synthetic */ C15370ps A0A;
    public final /* synthetic */ C15370ps A0B;

    public static void A00(GainmapFilter gainmapFilter, C197728oj c197728oj) {
        C14360o3.A0B((float[]) c197728oj.A0B.A00, 0);
        gainmapFilter.A04 = (float) Math.log(r0[0]);
        C14360o3.A0B((float[]) c197728oj.A0A.A00, 0);
        gainmapFilter.A03 = (float) Math.log(r0[0]);
        float[] fArr = (float[]) c197728oj.A09.A00;
        C14360o3.A0B(fArr, 0);
        gainmapFilter.A02 = fArr[0];
        float[] fArr2 = (float[]) c197728oj.A08.A00;
        C14360o3.A0B(fArr2, 0);
        gainmapFilter.A01 = fArr2[0];
        float[] fArr3 = (float[]) c197728oj.A07.A00;
        C14360o3.A0B(fArr3, 0);
        gainmapFilter.A00 = fArr3[0];
        gainmapFilter.A06 = c197728oj.A06.A00;
    }

    @Override // X.InterfaceC197718oi
    public final C197728oj B9M() {
        return null;
    }

    @Override // X.InterfaceC199658sH
    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A02}, 0);
    }

    public C197728oj(C14510oO c14510oO, C15080pO c15080pO, C15080pO c15080pO2, C15370ps c15370ps, C15370ps c15370ps2, C15370ps c15370ps3, C15370ps c15370ps4, C15370ps c15370ps5, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = c14510oO;
        this.A05 = c15080pO;
        this.A07 = c15370ps;
        this.A08 = c15370ps2;
        this.A09 = c15370ps3;
        this.A06 = c15080pO2;
        this.A0A = c15370ps4;
        this.A0B = c15370ps5;
    }

    @Override // X.InterfaceC199658sH
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC197718oi
    public final AnonymousClass810 getTexture() {
        AnonymousClass810 anonymousClass810 = this.A00;
        if (anonymousClass810 == null) {
            AnonymousClass811 anonymousClass811 = new AnonymousClass811("GainmapInputSurface");
            anonymousClass811.A01 = this.A02;
            anonymousClass811.A03 = 3553;
            anonymousClass811.A00 = 6408;
            anonymousClass811.A04 = this.A03;
            anonymousClass811.A02 = this.A01;
            AnonymousClass810 anonymousClass8102 = new AnonymousClass810(anonymousClass811);
            this.A00 = anonymousClass8102;
            return anonymousClass8102;
        }
        return anonymousClass810;
    }

    @Override // X.InterfaceC197718oi
    public final int getTextureId() {
        return this.A02;
    }

    @Override // X.InterfaceC199658sH
    public final int getWidth() {
        return this.A03;
    }
}
