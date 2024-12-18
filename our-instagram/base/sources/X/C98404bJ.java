package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98404bJ implements InterfaceC98054ak {
    public C4B6 A00;
    public InterfaceC98054ak A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final C4B6 A05;
    public final C98414bK A06 = new C98414bK();

    @Override // X.InterfaceC98054ak
    public final void FDI(android.net.Uri uri) {
    }

    public final void A00(InterfaceC98144at interfaceC98144at, long j) {
        if (interfaceC98144at == null) {
            this.A01 = this.A06;
            return;
        }
        this.A02 = j;
        InterfaceC98054ak F88 = interfaceC98144at.F88(this.A03, this.A04);
        this.A01 = F88;
        C4B6 c4b6 = this.A00;
        if (c4b6 == null) {
            return;
        }
        F88.AWa(c4b6);
    }

    @Override // X.InterfaceC98054ak
    public final void AWa(C4B6 c4b6) {
        Metadata A00;
        String str;
        C4B6 c4b62 = c4b6;
        C4B6 c4b63 = this.A05;
        if (c4b63 != null && c4b62 != c4b63) {
            String str2 = c4b62.A0W;
            C2IH.A00(str2);
            String str3 = c4b63.A0T;
            String str4 = c4b63.A0U;
            String str5 = str4;
            if (str4 == null) {
                str5 = c4b62.A0U;
            }
            String str6 = c4b62.A0V;
            String str7 = str6;
            if (str6 == null) {
                str7 = c4b63.A0V;
            }
            int i = c4b62.A04;
            int i2 = i;
            if (i == -1) {
                i2 = c4b63.A04;
            }
            int i3 = c4b62.A0D;
            if (i3 == -1) {
                i3 = c4b63.A0D;
            }
            String str8 = c4b62.A0R;
            if (str8 == null) {
                str8 = c4b63.A0R;
            }
            Metadata metadata = c4b62.A0P;
            Metadata metadata2 = c4b63.A0P;
            if (metadata == null) {
                A00 = metadata2;
            } else {
                A00 = metadata.A00(metadata2);
            }
            float f = c4b62.A01;
            if (f == -1.0f) {
                f = c4b63.A01;
            }
            int i4 = c4b62.A0H | c4b63.A0H;
            int i5 = c4b62.A0E | c4b63.A0E;
            DrmInitData drmInitData = c4b63.A0O;
            DrmInitData drmInitData2 = c4b62.A0O;
            ArrayList arrayList = new ArrayList();
            DrmInitData drmInitData3 = null;
            if (drmInitData != null) {
                str = drmInitData.A02;
                for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                    if (schemeData.A04 != null) {
                        arrayList.add(schemeData);
                    }
                }
            } else {
                str = null;
            }
            if (drmInitData2 != null) {
                if (str == null) {
                    str = drmInitData2.A02;
                }
                int size = arrayList.size();
                for (DrmInitData.SchemeData schemeData2 : drmInitData2.A03) {
                    if (schemeData2.A04 != null) {
                        UUID uuid = schemeData2.A03;
                        int i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                if (!((DrmInitData.SchemeData) arrayList.get(i6)).A03.equals(uuid)) {
                                    i6++;
                                }
                            } else {
                                arrayList.add(schemeData2);
                                break;
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                drmInitData3 = new DrmInitData(str, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
            }
            String str9 = c4b62.A0S;
            int i7 = c4b62.A0B;
            List list = c4b62.A0X;
            long j = c4b62.A0M;
            int i8 = c4b62.A0L;
            int i9 = c4b62.A0A;
            int i10 = c4b62.A0F;
            float f2 = c4b62.A02;
            byte[] bArr = c4b62.A0Y;
            int i11 = c4b62.A0I;
            ColorInfo colorInfo = c4b62.A0Q;
            int i12 = c4b62.A06;
            int i13 = c4b62.A0G;
            int i14 = c4b62.A0C;
            int i15 = c4b62.A08;
            int i16 = c4b62.A09;
            int i17 = c4b62.A03;
            int i18 = c4b62.A0J;
            int i19 = c4b62.A0K;
            int i20 = c4b62.A07;
            C4B5 c4b5 = c4b62.A0N;
            if (drmInitData3 != null && i20 == 0) {
                i20 = 2;
            }
            String str10 = c4b5.A07;
            boolean z = c4b5.A0H;
            boolean z2 = c4b5.A0I;
            boolean z3 = c4b5.A0E;
            boolean z4 = c4b5.A0D;
            boolean z5 = c4b5.A0C;
            boolean z6 = c4b5.A0B;
            boolean z7 = c4b5.A0A;
            boolean z8 = c4b5.A09;
            boolean z9 = c4b5.A0J;
            String str11 = c4b5.A05;
            String str12 = c4b5.A06;
            String str13 = c4b5.A04;
            String str14 = c4b5.A08;
            boolean z10 = c4b5.A0G;
            int i21 = c4b5.A01;
            boolean z11 = c4b5.A0F;
            boolean z12 = c4b5.A0K;
            String str15 = c4b5.A03;
            C4B5 c4b52 = c4b63.A0N;
            String str16 = c4b52.A02;
            if (str11 == null) {
                str11 = c4b52.A05;
            }
            if (str13 == null) {
                str13 = c4b52.A04;
            }
            if (str14 == null) {
                str14 = c4b52.A08;
            }
            if (str10 == null) {
                str10 = c4b52.A07;
            }
            c4b62 = new C4B6(new C4B5(str16, str15, str13, str11, str12, str10, str14, i21, z8, z7, z6, z5, z4, z3, z11, z10, z, z2, z9, z12), drmInitData3, A00, colorInfo, str8, str9, str3, str5, str7, str2, list, bArr, f, f2, i17, i2, i12, i20, i15, i16, i9, i7, i14, i3, i5, i10, i13, i4, i11, i18, i19, i8, j);
        }
        this.A00 = c4b62;
        this.A01.AWa(c4b62);
    }

    @Override // X.InterfaceC98054ak
    public final /* synthetic */ void ELN(C97974ac c97974ac, int i) {
        this.A01.ELN(c97974ac, i);
    }

    @Override // X.InterfaceC98054ak
    public final void ELO(C97974ac c97974ac, int i, int i2) {
        this.A01.ELN(c97974ac, i);
    }

    @Override // X.InterfaceC98054ak
    public final int ELR(InterfaceC92364Br interfaceC92364Br, int i, int i2, boolean z) {
        return this.A01.ELR(interfaceC92364Br, i, 0, z);
    }

    @Override // X.InterfaceC98054ak
    public final void ELT(C98094ao c98094ao, int i, int i2, int i3, long j) {
        long j2 = this.A02;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.A01 = this.A06;
        }
        this.A01.ELT(c98094ao, i, i2, i3, j);
    }

    public C98404bJ(C4B6 c4b6, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = c4b6;
    }
}
