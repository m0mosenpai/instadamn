package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71732Wzx implements InterfaceC73823Sp {
    public static final C71732Wzx A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = FrameworkEvent.A07;
        Long l = null;
        String str = null;
        Map map = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new FrameworkEvent(l, str2, str, map, i3, i, i2, j);
                case 0:
                    i = ADQ.AO9(c73833Sq, 0);
                    i3 |= 1;
                    break;
                case 1:
                    i2 = ADQ.AO9(c73833Sq, 1);
                    i3 |= 2;
                    break;
                case 2:
                    str2 = ADQ.AOK(c73833Sq, 2);
                    i3 |= 4;
                    break;
                case 3:
                    j = ADQ.AOC(c73833Sq, 3);
                    i3 |= 8;
                    break;
                case 4:
                    l = (Long) ADQ.AOE(l, C3RJ.A00, c73833Sq, 4);
                    i3 |= 16;
                    break;
                case 5:
                    str = ADQ.AOK(c73833Sq, 5);
                    i3 |= 32;
                    break;
                case 6:
                    map = (Map) ADQ.AOF(map, c3r9Arr[6], c73833Sq, 6);
                    i3 |= 64;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzx, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent", obj, 7);
        c73833Sq.A00("treeId");
        c73833Sq.A00("nodeId");
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        c73833Sq.A00("timestamp");
        c73833Sq.A00("duration");
        c73833Sq.A00("thread");
        c73833Sq.A00("payload");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = FrameworkEvent.A07;
        C192398fh c192398fh = C192398fh.A00;
        C3RD c3rd = C3RD.A01;
        C3RJ c3rj = C3RJ.A00;
        return new C3R9[]{c192398fh, c192398fh, c3rd, c3rj, AbstractC192698gB.A00(c3rj), c3rd, c3r9Arr[6]};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FrameworkEvent frameworkEvent = (FrameworkEvent) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, frameworkEvent);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = FrameworkEvent.A07;
        ADR.ASC(c73833Sq, 0, frameworkEvent.A01);
        ADR.ASC(c73833Sq, A1R ? 1 : 0, frameworkEvent.A00);
        ADR.ASL(frameworkEvent.A05, c73833Sq, 2);
        ADR.ASE(c73833Sq, 3, frameworkEvent.A02);
        ADR.ASG(frameworkEvent.A03, C3RJ.A00, c73833Sq, 4);
        ADR.ASL(frameworkEvent.A04, c73833Sq, 5);
        ADR.ASH(frameworkEvent.A06, c3r9Arr[6], c73833Sq, 6);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
