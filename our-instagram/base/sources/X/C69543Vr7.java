package X;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.Vr7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69543Vr7 {
    public float A00;
    public Integer A01;

    public final void A00(Dynamic dynamic) {
        Integer num;
        float f = Float.NaN;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    num = C05F.A0N;
                } else {
                    if (asString.endsWith("%")) {
                        this.A01 = C05F.A0C;
                        f = Float.parseFloat(asString.substring(0, asString.length() - 1));
                        this.A00 = f;
                    }
                    AbstractC65702TsY.A1U(AbstractC58317Pt9.A00(643), asString);
                }
            } else if (dynamic.getType() == ReadableType.Number) {
                this.A01 = C05F.A01;
                f = WF1.A01((float) dynamic.asDouble());
                this.A00 = f;
            }
            this.A01 = num;
            this.A00 = f;
        }
        num = C05F.A00;
        this.A01 = num;
        this.A00 = f;
    }
}
