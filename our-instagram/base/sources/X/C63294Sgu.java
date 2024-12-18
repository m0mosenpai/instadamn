package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: X.Sgu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63294Sgu {
    public static final C62527SFe A00(SKI ski, EnumC61108RfO enumC61108RfO, Integer num, String str, Map map, byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        C09530e4 A00 = ski.A00(enumC61108RfO);
        String str2 = (String) A00.A00;
        String str3 = (String) A00.A01;
        AbstractC58562Pxe.A01(str2);
        C62528SFf c62528SFf = new C62528SFf(str3, num, str);
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        Charset charset = C15W.A05;
        A0U.write(AbstractC58318PtA.A1a("private-attribution", charset));
        A0U.write(0);
        A0U.write(AbstractC58318PtA.A1a(c62528SFf.A01, charset));
        A0U.write(0);
        A0U.write(AbstractC58318PtA.A1a(c62528SFf.A02, charset));
        A0U.write(0);
        byte b = 0;
        A0U.write(new byte[]{0});
        ByteBuffer A17 = AbstractC58320PtC.A17(2);
        A17.putShort((short) 0);
        byte[] array = A17.array();
        C14360o3.A07(array);
        A0U.write(array);
        byte[] bArr2 = new byte[1];
        if (c62528SFf.A00.intValue() == 0) {
            b = 1;
        }
        bArr2[0] = b;
        A0U.write(bArr2);
        byte[] byteArray = A0U.toByteArray();
        C14360o3.A07(byteArray);
        C58549PxM c58549PxM = (C58549PxM) map.get(enumC61108RfO);
        if (c58549PxM != null) {
            SUU.A00("create_hybrid_encrypt_start");
            C62987SaB c62987SaB = C62987SaB.A01;
            c62987SaB.A01(C64310T8t.A00);
            c62987SaB.A02(C64310T8t.A01);
            InterfaceC65427Tjy interfaceC65427Tjy = (InterfaceC65427Tjy) c58549PxM.A03(InterfaceC65427Tjy.class);
            C14360o3.A07(interfaceC65427Tjy);
            SUU.A00("create_hybrid_encrypt_end");
            SUU.A00("perform_encryption_start");
            byte[] ASM = interfaceC65427Tjy.ASM(bArr, byteArray);
            C14360o3.A07(ASM);
            SUU.A00("perform_encryption_end");
            ByteBuffer wrap = ByteBuffer.wrap(ASM);
            C14360o3.A07(wrap);
            wrap.get(new byte[5]);
            byte[] bArr3 = new byte[32];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4);
            return new C62527SFe(c62528SFf, bArr3, bArr4);
        }
        throw MSY.A0d("No keyset handle for helper ", enumC61108RfO.name());
    }

    public static final C51u A01(C51u c51u, C51u c51u2) {
        return new C51u(A02((C62527SFe) c51u.A00, (C62527SFe) c51u2.A00), A02((C62527SFe) c51u.A01, (C62527SFe) c51u2.A01), A02((C62527SFe) c51u.A02, (C62527SFe) c51u2.A02));
    }

    public final C51u A03(SKI ski, Integer num, String str, Map map, long j) {
        C51u A00 = C63170SeV.A03.A00(EnumC61063Rec.A03, j);
        return A04(ski, num, str, map, new C51u(((C63170SeV) A00.A00).A01(), ((C63170SeV) A00.A01).A01(), ((C63170SeV) A00.A02).A01()));
    }

    public final C51u A04(SKI ski, Integer num, String str, Map map, C51u c51u) {
        return new C51u(A00(ski, EnumC61108RfO.A02, num, str, map, (byte[]) c51u.A00), A00(ski, EnumC61108RfO.A04, num, str, map, (byte[]) c51u.A01), A00(ski, EnumC61108RfO.A03, num, str, map, (byte[]) c51u.A02));
    }

    public static final byte[] A02(C62527SFe c62527SFe, C62527SFe c62527SFe2) {
        byte b;
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        ByteArrayOutputStream A0U2 = AbstractC58318PtA.A0U();
        A0U2.write(c62527SFe.A02);
        A0U2.write(c62527SFe.A01);
        byte[] byteArray = A0U2.toByteArray();
        C14360o3.A07(byteArray);
        A0U.write(byteArray);
        if (c62527SFe2 != null) {
            ByteArrayOutputStream A0U3 = AbstractC58318PtA.A0U();
            A0U3.write(c62527SFe2.A02);
            A0U3.write(c62527SFe2.A01);
            byte[] byteArray2 = A0U3.toByteArray();
            C14360o3.A07(byteArray2);
            A0U.write(byteArray2);
            ByteArrayOutputStream A0U4 = AbstractC58318PtA.A0U();
            byte[] bArr = new byte[1];
            C62528SFf c62528SFf = c62527SFe.A00;
            if (c62528SFf.A00.intValue() != 0) {
                b = 0;
            } else {
                b = 1;
            }
            bArr[0] = b;
            A0U4.write(bArr);
            A0U4.write(new byte[]{0});
            ByteBuffer A17 = AbstractC58320PtC.A17(2);
            A17.putShort((short) 0);
            byte[] array = A17.array();
            C14360o3.A07(array);
            A0U4.write(array);
            A0U4.write(MSY.A1a(c62528SFf.A02));
            byte[] byteArray3 = A0U4.toByteArray();
            C14360o3.A07(byteArray3);
            A0U.write(byteArray3);
        }
        byte[] byteArray4 = A0U.toByteArray();
        C14360o3.A07(byteArray4);
        return byteArray4;
    }
}
