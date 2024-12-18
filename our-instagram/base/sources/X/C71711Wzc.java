package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wzc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71711Wzc implements InterfaceC73823Sp {
    public static final C71711Wzc A00;
    public static final /* synthetic */ C73833Sq A01;

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[0];
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        int ANz = ADQ.ANz(c73833Sq);
        if (ANz == -1) {
            ADQ.ASc(c73833Sq);
            return new Object();
        }
        throw new X6K(ANz);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Wzc, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = new C73833Sq("com.facebook.flipper.plugins.bloksdebugger.ClientState", obj, 0);
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AbstractC167017dG.A1N(encoder, obj);
        C73833Sq c73833Sq = A01;
        encoder.ADR(c73833Sq).ASc(c73833Sq);
    }
}
