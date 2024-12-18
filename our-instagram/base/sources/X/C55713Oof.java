package X;

import com.facebook.spm.SentencePieceModel;
import java.util.List;

/* renamed from: X.Oof, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55713Oof implements InterfaceC73523Rd {
    public final OG1 A00;
    public final C3RU A01;
    public final C3RU A02;
    public final SentencePieceModel A03;
    public final C193208h0 A04;

    @Override // X.InterfaceC73523Rd
    public final C3SN E5A(C73673Rt c73673Rt, List list) {
        if (c73673Rt != null) {
            try {
                c73673Rt.A01(AbstractC111324zv.A00(5073));
            } catch (Exception e) {
                if (c73673Rt != null) {
                    c73673Rt.A01("prediction_end");
                }
                return MSZ.A0P(e);
            }
        }
        A00(c73673Rt, this.A02, "");
        A00(c73673Rt, this.A01, "spm");
        if (!list.isEmpty() && list.size() <= 1) {
            C3SN A00 = this.A00.A00(c73673Rt, this.A03, list, this.A04);
            if (c73673Rt != null) {
                c73673Rt.A01("prediction_end");
                return A00;
            }
            return A00;
        }
        if (c73673Rt != null) {
            c73673Rt.A01("prediction_end");
        }
        return MSW.A0L(C16930sl.A00, "Currently, only 1 example is supported", false);
    }

    public static final void A00(C73673Rt c73673Rt, C3RU c3ru, String str) {
        if (c73673Rt != null) {
            c73673Rt.A02(AnonymousClass001.A0R("model_name", str), c3ru.BUR());
            c73673Rt.A02(AnonymousClass001.A0R("model_version", str), String.valueOf(c3ru.BUS()));
            c73673Rt.A02(AnonymousClass001.A0R("model_asset_name", str), c3ru.BUO());
        }
    }

    public C55713Oof(OG1 og1, C3RU c3ru, C3RU c3ru2, SentencePieceModel sentencePieceModel, C193208h0 c193208h0) {
        AbstractC37302Gc3.A1U(c193208h0, sentencePieceModel);
        this.A02 = c3ru;
        this.A01 = c3ru2;
        this.A04 = c193208h0;
        this.A03 = sentencePieceModel;
        this.A00 = og1;
    }
}
