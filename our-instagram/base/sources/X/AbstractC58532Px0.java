package X;

import java.io.IOException;

/* renamed from: X.Px0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58532Px0 implements InterfaceC65280ThD {
    public int memoizedHashCode = 0;

    public final int A0C(InterfaceC65595Tne schema) {
        int i;
        AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) this;
        int i2 = abstractC58533Px1.memoizedSerializedSize;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            if (schema == null) {
                schema = AbstractC58320PtC.A0d(abstractC58533Px1);
            }
            i = schema.BtW(abstractC58533Px1);
            if (i < 0) {
                throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", i);
            }
        } else {
            i = i2 & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                if (schema == null) {
                    schema = AbstractC58320PtC.A0d(abstractC58533Px1);
                }
                int BtW = schema.BtW(abstractC58533Px1);
                if (BtW >= 0) {
                    abstractC58533Px1.memoizedSerializedSize = (Integer.MAX_VALUE & BtW) | (abstractC58533Px1.memoizedSerializedSize & Integer.MIN_VALUE);
                    return BtW;
                }
                throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", BtW);
            }
        }
        return i;
    }

    public final C58535Px3 A0D() {
        try {
            int A0C = A0C(null);
            InterfaceC65432Tk3 interfaceC65432Tk3 = AbstractC58536Px4.A02;
            byte[] bArr = new byte[A0C];
            C60802RTn c60802RTn = new C60802RTn(bArr, A0C);
            InterfaceC65595Tne A0d = AbstractC58320PtC.A0d(this);
            C62650SKj c62650SKj = c60802RTn.A01;
            if (c62650SKj == null) {
                c62650SKj = new C62650SKj(c60802RTn);
            }
            A0d.FEp(c62650SKj, this);
            if (c60802RTn.A02 - c60802RTn.A00 == 0) {
                return new C58535Px3(bArr);
            }
            throw AbstractC166987dD.A14("Did not write as much data as expected.");
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A11("Serializing ", MSY.A0h(this), " to a ", "ByteString", " threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] A0E() {
        try {
            int A0C = A0C(null);
            byte[] bArr = new byte[A0C];
            C60802RTn c60802RTn = new C60802RTn(bArr, A0C);
            InterfaceC65595Tne A0d = AbstractC58320PtC.A0d(this);
            C62650SKj c62650SKj = c60802RTn.A01;
            if (c62650SKj == null) {
                c62650SKj = new C62650SKj(c60802RTn);
            }
            A0d.FEp(c62650SKj, this);
            if (c60802RTn.A02 - c60802RTn.A00 == 0) {
                return bArr;
            }
            throw AbstractC166987dD.A14("Did not write as much data as expected.");
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A11("Serializing ", MSY.A0h(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }

    public static C64302T8l A00(Rj2 rj2, AbstractC58533Px1 abstractC58533Px1, Class cls, String str) {
        return new C64302T8l(rj2, (InterfaceC65281ThE) abstractC58533Px1.A0F(C05F.A0u), cls, str);
    }

    public static PxG A01(C58551PxO c58551PxO) {
        RUY ruy = (RUY) ((PxQ) PxG.DEFAULT_INSTANCE.A0F(C05F.A0Y));
        ruy.A07(c58551PxO.A05);
        ruy.A06(c58551PxO.A02);
        ruy.A05(c58551PxO.A00);
        return (PxG) ruy.A02();
    }

    public static RUZ A02() {
        return (RUZ) ((PxQ) RVD.DEFAULT_INSTANCE.A0F(C05F.A0Y));
    }
}
