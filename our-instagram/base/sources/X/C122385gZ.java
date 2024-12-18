package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5gZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122385gZ {
    public final float A00;
    public final int A01;
    public final String A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r9v1, types: [X.5gb, java.lang.Object] */
    public static C122385gZ A00(C97974ac c97974ac) {
        float f;
        try {
            c97974ac.A0H(4);
            int A02 = (c97974ac.A02() & 3) + 1;
            if (A02 != 3) {
                ArrayList arrayList = new ArrayList();
                int A022 = c97974ac.A02() & 31;
                for (int i = 0; i < A022; i++) {
                    int A05 = c97974ac.A05();
                    int i2 = c97974ac.A01;
                    c97974ac.A0H(A05);
                    byte[] bArr = c97974ac.A02;
                    byte[] bArr2 = new byte[A05 + 4];
                    System.arraycopy(AbstractC122395ga.A00, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i2, bArr2, 4, A05);
                    arrayList.add(bArr2);
                }
                int A023 = c97974ac.A02();
                for (int i3 = 0; i3 < A023; i3++) {
                    int A052 = c97974ac.A05();
                    int i4 = c97974ac.A01;
                    c97974ac.A0H(A052);
                    byte[] bArr3 = c97974ac.A02;
                    byte[] bArr4 = new byte[A052 + 4];
                    System.arraycopy(AbstractC122395ga.A00, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i4, bArr4, 4, A052);
                    arrayList.add(bArr4);
                }
                String str = null;
                if (A022 > 0) {
                    byte[] bArr5 = (byte[]) arrayList.get(0);
                    byte[] bArr6 = (byte[]) arrayList.get(0);
                    int length = bArr5.length;
                    ?? obj = new Object();
                    obj.A03 = bArr6;
                    obj.A02 = A02 + 1;
                    obj.A01 = length;
                    obj.A00 = 0;
                    C122405gb.A01(obj);
                    int A03 = obj.A03(8);
                    int A032 = obj.A03(8);
                    int A033 = obj.A03(8);
                    C122405gb.A00(obj);
                    if (A03 == 100 || A03 == 110 || A03 == 122 || A03 == 244 || A03 == 44 || A03 == 83 || A03 == 86 || A03 == 118 || A03 == 128 || A03 == 138) {
                        int A00 = C122405gb.A00(obj);
                        if (A00 == 3) {
                            obj.A04();
                        }
                        C122405gb.A00(obj);
                        C122405gb.A00(obj);
                        obj.A04();
                        if (obj.A06()) {
                            int i5 = 12;
                            if (A00 != 3) {
                                i5 = 8;
                            }
                            int i6 = 0;
                            do {
                                if (obj.A06()) {
                                    int i7 = 64;
                                    if (i6 < 6) {
                                        i7 = 16;
                                    }
                                    int i8 = 8;
                                    int i9 = 0;
                                    while (true) {
                                        int A002 = C122405gb.A00(obj);
                                        int i10 = 1;
                                        if (A002 % 2 == 0) {
                                            i10 = -1;
                                        }
                                        int i11 = (((i10 * ((A002 + 1) / 2)) + i8) + 256) % 256;
                                        if (i11 != 0) {
                                            i8 = i11;
                                        }
                                        do {
                                            i9++;
                                            if (i9 >= i7) {
                                                break;
                                            }
                                        } while (i11 == 0);
                                    }
                                }
                                i6++;
                            } while (i6 < i5);
                        }
                    }
                    C122405gb.A00(obj);
                    int A003 = C122405gb.A00(obj);
                    if (A003 == 0) {
                        C122405gb.A00(obj);
                    } else if (A003 == 1) {
                        obj.A04();
                        C122405gb.A00(obj);
                        C122405gb.A00(obj);
                        long A004 = C122405gb.A00(obj);
                        for (int i12 = 0; i12 < A004; i12++) {
                            C122405gb.A00(obj);
                        }
                    }
                    C122405gb.A00(obj);
                    obj.A04();
                    C122405gb.A00(obj);
                    C122405gb.A00(obj);
                    if (!obj.A06()) {
                        obj.A04();
                    }
                    obj.A04();
                    if (obj.A06()) {
                        C122405gb.A00(obj);
                        C122405gb.A00(obj);
                        C122405gb.A00(obj);
                        C122405gb.A00(obj);
                    }
                    f = 1.0f;
                    if (obj.A06() && obj.A06()) {
                        int A034 = obj.A03(8);
                        if (A034 == 255) {
                            int A035 = obj.A03(16);
                            int A036 = obj.A03(16);
                            if (A035 != 0 && A036 != 0) {
                                f = A035 / A036;
                            }
                        } else {
                            float[] fArr = AbstractC97984ad.A02;
                            if (A034 < 17) {
                                f = fArr[A034];
                            } else {
                                AbstractC46512Bo.A04("NalUnitUtil", AnonymousClass001.A0O("Unexpected aspect_ratio_idc value: ", A034));
                            }
                        }
                    }
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(A03), Integer.valueOf(A032), Integer.valueOf(A033));
                } else {
                    f = 1.0f;
                }
                return new C122385gZ(str, arrayList, f, A02);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C93194Fv.A00("Error parsing AVC config", e);
        }
    }

    public C122385gZ(String str, List list, float f, int i) {
        this.A03 = list;
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }
}
