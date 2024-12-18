package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.Metadata;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0D implements InterfaceC73823Sp {
    public static final X0D A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = Metadata.A09;
        Integer num = null;
        Integer num2 = null;
        Map map = null;
        java.util.Set set = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new Metadata(num2, num, str, str2, str3, map, set, i2, i, z);
                case 0:
                    i = ADQ.AO9(c73833Sq, 0);
                    i2 |= 1;
                    break;
                case 1:
                    str = ADQ.AOK(c73833Sq, 1);
                    i2 |= 2;
                    break;
                case 2:
                    str2 = ADQ.AOK(c73833Sq, 2);
                    i2 |= 4;
                    break;
                case 3:
                    str3 = ADQ.AOK(c73833Sq, 3);
                    i2 |= 8;
                    break;
                case 4:
                    z = ADQ.ANs(c73833Sq, 4);
                    i2 |= 16;
                    break;
                case 5:
                    set = (java.util.Set) ADQ.AOE(set, c3r9Arr[5], c73833Sq, 5);
                    i2 |= 32;
                    break;
                case 6:
                    map = (Map) ADQ.AOE(map, c3r9Arr[6], c73833Sq, 6);
                    i2 |= 64;
                    break;
                case 7:
                    num2 = (Integer) ADQ.AOE(num2, C192398fh.A00, c73833Sq, 7);
                    i2 |= 128;
                    break;
                case 8:
                    num = (Integer) ADQ.AOE(num, C192398fh.A00, c73833Sq, 8);
                    i2 |= 256;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X0D, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.Metadata", obj, 9);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        c73833Sq.A00("namespace");
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        c73833Sq.A00("mutable");
        c73833Sq.A01("possibleValues", true);
        c73833Sq.A01("customAttributes", true);
        c73833Sq.A00("minValue");
        c73833Sq.A00("maxValue");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = Metadata.A09;
        C192398fh c192398fh = C192398fh.A00;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c192398fh, c3rd, c3rd, c3rd, C3SL.A00, AbstractC192698gB.A00(c3r9Arr[5]), AbstractC192698gB.A00(c3r9Arr[6]), AbstractC192698gB.A00(c192398fh), AbstractC192698gB.A00(c192398fh)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Metadata metadata = (Metadata) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, metadata);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = Metadata.A09;
        ADR.ASC(c73833Sq, 0, metadata.A00);
        ADR.ASL(metadata.A05, c73833Sq, A1R ? 1 : 0);
        ADR.ASL(metadata.A04, c73833Sq, 2);
        ADR.ASL(metadata.A03, c73833Sq, 3);
        ADR.AS2(c73833Sq, 4, metadata.A08);
        if (ADR.EiY(c73833Sq, 5) || !C14360o3.A0K(metadata.A07, C16910sj.A00)) {
            ADR.ASG(metadata.A07, c3r9Arr[5], c73833Sq, 5);
        }
        if (ADR.EiY(c73833Sq, 6) || metadata.A06 != null) {
            ADR.ASG(metadata.A06, c3r9Arr[6], c73833Sq, 6);
        }
        C192398fh c192398fh = C192398fh.A00;
        ADR.ASG(metadata.A02, c192398fh, c73833Sq, 7);
        ADR.ASG(metadata.A01, c192398fh, c73833Sq, 8);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
