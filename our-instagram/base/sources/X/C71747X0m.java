package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.shopify.checkout.models.Address;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71747X0m implements InterfaceC73823Sp {
    public static final C71747X0m A00;
    public static final SerialDescriptor A01;

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0m, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.Address", obj, 11);
        c73833Sq.A01("referenceId", true);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        c73833Sq.A01("firstName", true);
        c73833Sq.A01("lastName", true);
        c73833Sq.A01("postalCode", true);
        c73833Sq.A01("address1", true);
        c73833Sq.A01("address2", true);
        c73833Sq.A01(ServerW3CShippingAddressConstants.CITY, true);
        c73833Sq.A01("countryCode", true);
        c73833Sq.A01("zoneCode", true);
        c73833Sq.A01("phone", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new Address(str, str11, str9, str10, str8, str5, str7, str4, str3, str2, str6, i);
                case 0:
                    str = (String) ADQ.AOE(str, C3RD.A01, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str11 = (String) ADQ.AOE(str11, C3RD.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str9 = (String) ADQ.AOE(str9, C3RD.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str10 = (String) ADQ.AOE(str10, C3RD.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str8 = (String) ADQ.AOE(str8, C3RD.A01, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ADQ.AOE(str5, C3RD.A01, serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) ADQ.AOE(str7, C3RD.A01, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) ADQ.AOE(str4, C3RD.A01, serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str6 = (String) ADQ.AOE(str6, C3RD.A01, serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Address address = (Address) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, address);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        if (ADR.EiY(serialDescriptor, 0) || address.A09 != null) {
            ADR.ASG(address.A09, C3RD.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || address.A06 != null) {
            ADR.ASG(address.A06, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || address.A04 != null) {
            ADR.ASG(address.A04, C3RD.A01, serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || address.A05 != null) {
            ADR.ASG(address.A05, C3RD.A01, serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || address.A08 != null) {
            ADR.ASG(address.A08, C3RD.A01, serialDescriptor, 4);
        }
        if (ADR.EiY(serialDescriptor, 5) || address.A00 != null) {
            ADR.ASG(address.A00, C3RD.A01, serialDescriptor, 5);
        }
        if (ADR.EiY(serialDescriptor, 6) || address.A01 != null) {
            ADR.ASG(address.A01, C3RD.A01, serialDescriptor, 6);
        }
        if (ADR.EiY(serialDescriptor, 7) || address.A02 != null) {
            ADR.ASG(address.A02, C3RD.A01, serialDescriptor, 7);
        }
        if (ADR.EiY(serialDescriptor, 8) || address.A03 != null) {
            ADR.ASG(address.A03, C3RD.A01, serialDescriptor, 8);
        }
        if (ADR.EiY(serialDescriptor, 9) || address.A0A != null) {
            ADR.ASG(address.A0A, C3RD.A01, serialDescriptor, 9);
        }
        if (ADR.EiY(serialDescriptor, 10) || address.A07 != null) {
            ADR.ASG(address.A07, C3RD.A01, serialDescriptor, 10);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
