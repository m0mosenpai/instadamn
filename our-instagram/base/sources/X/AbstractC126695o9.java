package X;

import android.text.Html;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.5o9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126695o9 extends AbstractC98594be implements InterfaceC126705oA {
    public AbstractC126695o9() {
        super(new C126715oB[2], new AbstractC126725oC[2]);
        A03(1024);
    }

    @Override // X.InterfaceC126705oA
    public final void EbA(long j) {
    }

    @Override // X.AbstractC98594be
    public final /* bridge */ /* synthetic */ C96094Ts createInputBuffer() {
        return new C96094Ts(1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4ac] */
    public InterfaceC126735oD A06(byte[] bArr, int i, boolean z) {
        int i2;
        C5o8 c5o8 = (C5o8) this;
        ArrayList arrayList = new ArrayList();
        C131905xQ c131905xQ = new C131905xQ();
        ?? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = i;
        while (true) {
            Charset charset = AbstractC50482Ts.A05;
            String A0B = obj.A0B(charset);
            if (A0B == null) {
                break;
            }
            if (A0B.length() != 0) {
                try {
                    Integer.parseInt(A0B);
                    String A0B2 = obj.A0B(charset);
                    if (A0B2 == null) {
                        AbstractC459729h.A02("HeroPlayer2SubripDecoder", "Unexpected end", new Object[0]);
                        break;
                    }
                    Matcher matcher = C5o8.A01.matcher(A0B2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        c131905xQ.A01(C5o8.A00(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            c131905xQ.A01(C5o8.A00(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        StringBuilder sb = c5o8.A00;
                        sb.setLength(0);
                        while (true) {
                            String A0B3 = obj.A0B(charset);
                            if (TextUtils.isEmpty(A0B3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            sb.append(A0B3.trim());
                        }
                        String obj2 = sb.toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        arrayList.add(new C4WQ(null, Html.fromHtml(obj2), -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, -16777216, Integer.MIN_VALUE));
                        if (z2) {
                            arrayList.add(null);
                        }
                    } else {
                        AbstractC459729h.A02("HeroPlayer2SubripDecoder", AnonymousClass001.A0R("Skipping invalid timing: ", A0B2), new Object[0]);
                    }
                } catch (NumberFormatException unused) {
                    AbstractC459729h.A02("HeroPlayer2SubripDecoder", AnonymousClass001.A0R("Skipping invalid index: ", A0B), new Object[0]);
                }
            }
        }
        int size = arrayList.size();
        final C4WQ[] c4wqArr = new C4WQ[size];
        arrayList.toArray(c4wqArr);
        final long[] copyOf = Arrays.copyOf(c131905xQ.A01, c131905xQ.A00);
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new C131925xS(c4wqArr[i3], copyOf[i3]));
        }
        Collections.sort(arrayList2);
        for (i2 = 0; i2 < size; i2++) {
            C131925xS c131925xS = (C131925xS) arrayList2.get(i2);
            c4wqArr[i2] = c131925xS.A01;
            copyOf[i2] = c131925xS.A00;
        }
        return new InterfaceC126735oD(copyOf, c4wqArr) { // from class: X.5xT
            public final long[] A00;
            public final C4WQ[] A01;

            @Override // X.InterfaceC126735oD
            public final long B2n(int i4) {
                boolean z3 = false;
                if (i4 >= 0) {
                    z3 = true;
                }
                C4B8.A03(z3);
                long[] jArr = this.A00;
                C4B8.A03(i4 < jArr.length);
                return jArr[i4];
            }

            @Override // X.InterfaceC126735oD
            public final List Au4(long j) {
                C4WQ c4wq;
                int A04 = Util.A04(this.A00, j, false);
                if (A04 != -1 && (c4wq = this.A01[A04]) != null) {
                    return Collections.singletonList(c4wq);
                }
                return Collections.emptyList();
            }

            @Override // X.InterfaceC126735oD
            public final int B2o() {
                return this.A00.length;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC126735oD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int BWs(long r6) {
                /*
                    r5 = this;
                    long[] r4 = r5.A00
                    int r3 = java.util.Arrays.binarySearch(r4, r6)
                    if (r3 >= 0) goto Lf
                    r3 = r3 ^ (-1)
                La:
                    int r0 = r4.length
                    if (r3 < r0) goto Le
                    r3 = -1
                Le:
                    return r3
                Lf:
                    int r3 = r3 + 1
                    int r0 = r4.length
                    if (r3 >= r0) goto La
                    r1 = r4[r3]
                    int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                    if (r0 != 0) goto La
                    goto Lf
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C131935xT.BWs(long):int");
            }

            {
                this.A01 = c4wqArr;
                this.A00 = copyOf;
            }
        };
    }

    @Override // X.AbstractC98594be
    public final /* bridge */ /* synthetic */ AbstractC117285Sn createOutputBuffer() {
        return new AbstractC126725oC(this) { // from class: X.5oE
            public final AbstractC126695o9 A00;

            @Override // X.AbstractC117285Sn
            public final void release() {
                this.A00.A05(this);
            }

            {
                this.A00 = this;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4YB, java.lang.Exception] */
    @Override // X.AbstractC98594be
    public final /* bridge */ /* synthetic */ C4YB createUnexpectedDecodeException(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override // X.AbstractC98594be
    public final /* bridge */ /* synthetic */ C4YB decode(C96094Ts c96094Ts, AbstractC117285Sn abstractC117285Sn, boolean z) {
        C126715oB c126715oB = (C126715oB) c96094Ts;
        AbstractC126725oC abstractC126725oC = (AbstractC126725oC) abstractC117285Sn;
        try {
            ByteBuffer byteBuffer = c126715oB.A02;
            byteBuffer.getClass();
            InterfaceC126735oD A06 = A06(byteBuffer.array(), byteBuffer.limit(), z);
            long j = c126715oB.A01;
            long j2 = c126715oB.A00;
            ((AbstractC117285Sn) abstractC126725oC).A00 = j;
            abstractC126725oC.A01 = A06;
            if (j2 == Long.MAX_VALUE) {
                j2 = j;
            }
            abstractC126725oC.A00 = j2;
            ((AbstractC96104Tt) abstractC126725oC).A00 = Integer.MAX_VALUE & ((AbstractC96104Tt) abstractC126725oC).A00;
            return null;
        } catch (C4YA e) {
            return e;
        }
    }
}
