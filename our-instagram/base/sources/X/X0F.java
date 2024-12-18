package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.facebook.flipper.plugins.uidebugger.model.BoxData;
import com.facebook.flipper.plugins.uidebugger.model.Node;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes11.dex */
public final class X0F implements InterfaceC73823Sp {
    public static final X0F A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = Node.A0D;
        List list = null;
        int i = 0;
        Map map = null;
        Integer num = null;
        JsonObject jsonObject = null;
        Map map2 = null;
        Boolean bool = null;
        java.util.Set set = null;
        Bounds bounds = null;
        BoxData boxData = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new Node(bounds, boxData, bool, num2, num, str, str2, list, map2, map, set, jsonObject, i, i2);
                case 0:
                    i2 = ADQ.AO9(c73833Sq, 0);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) ADQ.AOE(num2, C192398fh.A00, c73833Sq, 1);
                    i |= 2;
                    break;
                case 2:
                    str = ADQ.AOK(c73833Sq, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = ADQ.AOK(c73833Sq, 3);
                    i |= 8;
                    break;
                case 4:
                    boxData = (BoxData) ADQ.AOE(boxData, C71726Wzr.A00, c73833Sq, 4);
                    i |= 16;
                    break;
                case 5:
                    map2 = (Map) ADQ.AOF(map2, c3r9Arr[5], c73833Sq, 5);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) ADQ.AOF(map, c3r9Arr[6], c73833Sq, 6);
                    i |= 64;
                    break;
                case 7:
                    jsonObject = (JsonObject) ADQ.AOE(jsonObject, JsonObjectSerializer.A01, c73833Sq, 7);
                    i |= 128;
                    break;
                case 8:
                    bounds = (Bounds) ADQ.AOF(bounds, C71725Wzq.A00, c73833Sq, 8);
                    i |= 256;
                    break;
                case 9:
                    set = (java.util.Set) ADQ.AOF(set, c3r9Arr[9], c73833Sq, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) ADQ.AOF(list, c3r9Arr[10], c73833Sq, 10);
                    i |= 1024;
                    break;
                case 11:
                    num = (Integer) ADQ.AOE(num, C192398fh.A00, c73833Sq, 11);
                    i |= C3OO.FLAG_MOVED;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    bool = (Boolean) ADQ.AOE(bool, C3SL.A00, c73833Sq, 12);
                    i |= 4096;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0F, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.flipper.plugins.uidebugger.model.Node", obj, 13);
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        c73833Sq.A00("parent");
        c73833Sq.A00("qualifiedName");
        c73833Sq.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        c73833Sq.A00("boxData");
        c73833Sq.A00("attributes");
        c73833Sq.A00("inlineAttributes");
        c73833Sq.A00("hiddenAttributes");
        c73833Sq.A00("bounds");
        c73833Sq.A00("tags");
        c73833Sq.A00("children");
        c73833Sq.A00("activeChild");
        c73833Sq.A00("additionalDataCollection");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = Node.A0D;
        C192398fh c192398fh = C192398fh.A00;
        C3R9 A002 = AbstractC192698gB.A00(c192398fh);
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c192398fh, A002, c3rd, c3rd, AbstractC192698gB.A00(C71726Wzr.A00), c3r9Arr[5], c3r9Arr[6], AbstractC192698gB.A00(JsonObjectSerializer.A01), C71725Wzq.A00, c3r9Arr[9], c3r9Arr[10], AbstractC192698gB.A00(c192398fh), AbstractC192698gB.A00(C3SL.A00)};
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Node node = (Node) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, node);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = Node.A0D;
        ADR.ASC(c73833Sq, 0, node.A00);
        C192398fh c192398fh = C192398fh.A00;
        ADR.ASG(node.A05, c192398fh, c73833Sq, A1R ? 1 : 0);
        ADR.ASL(node.A07, c73833Sq, 2);
        ADR.ASL(node.A06, c73833Sq, 3);
        ADR.ASG(node.A02, C71726Wzr.A00, c73833Sq, 4);
        ADR.ASH(node.A09, c3r9Arr[5], c73833Sq, 5);
        ADR.ASH(node.A0A, c3r9Arr[6], c73833Sq, 6);
        ADR.ASG(node.A0C, JsonObjectSerializer.A01, c73833Sq, 7);
        ADR.ASH(node.A01, C71725Wzq.A00, c73833Sq, 8);
        ADR.ASH(node.A0B, c3r9Arr[9], c73833Sq, 9);
        ADR.ASH(node.A08, c3r9Arr[10], c73833Sq, 10);
        ADR.ASG(node.A04, c192398fh, c73833Sq, 11);
        ADR.ASG(node.A03, C3SL.A00, c73833Sq, 12);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
