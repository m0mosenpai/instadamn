package X;

import java.util.List;

/* renamed from: X.4BA, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4BA extends C4BB {
    public final long A00;
    public final android.net.Uri A01;
    public final C4B0 A02;
    public final C5QV A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final C92184Ay A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4BA(C4B6 c4b6, C92184Ay c92184Ay, String str, String str2, String str3, List list, List list2, List list3, List list4, long j) {
        super(c4b6, c92184Ay, list, list2, list3, list4);
        C4B0 c4b0;
        C5QV c5qv;
        String str4 = str;
        this.A01 = android.net.Uri.parse(((C92134At) list.get(0)).A03);
        long j2 = c92184Ay.A00;
        if (j2 <= 0) {
            c4b0 = null;
        } else {
            c4b0 = new C4B0(null, c92184Ay.A01, j2);
        }
        this.A02 = c4b0;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c4b6.A0U);
            sb.append(".");
            sb.append(c4b6.A0T);
            sb.append(".");
            sb.append(-1L);
            str4 = sb.toString();
        }
        this.A04 = str4;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = j;
        if (c4b0 != null) {
            c5qv = 0;
        } else {
            final C4B0 c4b02 = new C4B0(null, 0L, -1L);
            c5qv = new InterfaceC97364Yw(c4b02) { // from class: X.5QV
                public final C4B0 A00;

                @Override // X.InterfaceC97364Yw
                public final long AeO(long j3, long j4) {
                    return 1L;
                }

                @Override // X.InterfaceC97364Yw
                public final long Azu(long j3, long j4) {
                    return j4;
                }

                @Override // X.InterfaceC97364Yw
                public final long B6Y(long j3, long j4) {
                    return 0L;
                }

                @Override // X.InterfaceC97364Yw
                public final long B6h() {
                    return 0L;
                }

                @Override // X.InterfaceC97364Yw
                public final long BX6(long j3, long j4) {
                    return -9223372036854775807L;
                }

                @Override // X.InterfaceC97364Yw
                public final int BfL(long j3) {
                    return -1;
                }

                @Override // X.InterfaceC97364Yw
                public final long BsK(long j3) {
                    return 1L;
                }

                @Override // X.InterfaceC97364Yw
                public final long BsO(long j3, long j4) {
                    return 0L;
                }

                @Override // X.InterfaceC97364Yw
                public final long BsP(long j3) {
                    return -1L;
                }

                @Override // X.InterfaceC97364Yw
                public final long C8V(long j3) {
                    return 0L;
                }

                @Override // X.InterfaceC97364Yw
                public final boolean isExplicit() {
                    return true;
                }

                {
                    this.A00 = c4b02;
                }

                @Override // X.InterfaceC97364Yw
                public final C4B0 BsR(long j3) {
                    return this.A00;
                }
            };
        }
        this.A03 = c5qv;
        this.A07 = c92184Ay;
    }
}
