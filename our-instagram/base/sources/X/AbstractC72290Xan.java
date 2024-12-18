package X;

/* renamed from: X.Xan, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72290Xan extends AbstractC73479YFc {
    public C72283Xag A00;
    public Y13 A01;

    @Override // X.AbstractC73479YFc
    public void A01(YQ3 yq3) {
        Y13 y13;
        super.A01(yq3);
        this.A00 = (C72283Xag) C72283Xag.class.cast(yq3);
        AbstractC73478YFb abstractC73478YFb = (AbstractC73478YFb) yq3;
        if (abstractC73478YFb instanceof C72281Xae) {
            y13 = Y13.A06;
        } else {
            y13 = abstractC73478YFb.A06;
        }
        this.A01 = y13;
        this.A02 = abstractC73478YFb.A03;
        super.A00 = yq3.AbQ() / 255.0f;
    }
}
