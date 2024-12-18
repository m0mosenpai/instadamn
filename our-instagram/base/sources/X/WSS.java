package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes11.dex */
public final class WSS implements InterfaceC71939XBo {
    public final int A00;
    public final int A01;
    public final float A02;
    public final int A03;
    public final WFa A04 = new WFa();
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC71939XBo
    public final /* synthetic */ void reset() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            if (r7 == r8) goto L2b
            r5 = r11 | 33
            r0 = r7 & 1
            r4 = 0
            r1 = 1
            boolean r3 = X.AbstractC167007dF.A1M(r0)
            r0 = r7 & 2
            boolean r2 = X.AbstractC167007dF.A1M(r0)
            if (r3 == 0) goto L36
            if (r2 == 0) goto L17
            r1 = 3
        L17:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r6.setSpan(r0, r9, r10, r5)
        L1f:
            r0 = r7 & 4
            if (r0 == 0) goto L2c
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L28:
            r6.setSpan(r0, r9, r10, r5)
        L2b:
            return
        L2c:
            if (r3 != 0) goto L2b
            if (r2 != 0) goto L2b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L28
        L36:
            if (r2 == 0) goto L1f
            r1 = 2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSS.A00(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    @Override // X.InterfaceC71939XBo
    public final void E3P(InterfaceC71874X8h interfaceC71874X8h, C70003VzN c70003VzN, byte[] bArr, int i, int i2) {
        String A0I;
        ImmutableList of;
        WFa wFa = this.A04;
        wFa.A0Q(bArr, i + i2);
        wFa.A0O(i);
        WDn.A01(AbstractC43593JPy.A1Z(wFa.A00 - wFa.A01, 2));
        int A08 = wFa.A08();
        if (A08 == 0) {
            A0I = "";
        } else {
            int i3 = wFa.A01;
            Charset A0J = wFa.A0J();
            int i4 = A08 - (wFa.A01 - i3);
            if (A0J == null) {
                A0J = AbstractC50482Ts.A05;
            }
            A0I = wFa.A0I(A0J, i4);
        }
        if (A0I.isEmpty()) {
            of = ImmutableList.of();
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0I);
            int i5 = this.A01;
            A00(spannableStringBuilder, i5, 0, 0, spannableStringBuilder.length(), 16711680);
            int i6 = this.A00;
            int length = spannableStringBuilder.length();
            if (i6 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i6 >>> 8) | ((i6 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.A05;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.A02;
            while (true) {
                int i7 = wFa.A00;
                int i8 = wFa.A01;
                if (i7 - i8 < 8) {
                    break;
                }
                int A01 = wFa.A01();
                int A012 = wFa.A01();
                boolean z = true;
                if (A012 == 1937013100) {
                    if (i7 - wFa.A01 < 2) {
                        z = false;
                    }
                    WDn.A01(z);
                    int A082 = wFa.A08();
                    for (int i9 = 0; i9 < A082; i9++) {
                        WDn.A01(AbstractC43593JPy.A1Z(wFa.A00 - wFa.A01, 12));
                        int A083 = wFa.A08();
                        int A084 = wFa.A08();
                        wFa.A0P(2);
                        int A05 = wFa.A05();
                        wFa.A0P(1);
                        int A013 = wFa.A01();
                        if (A084 > spannableStringBuilder.length()) {
                            AbstractC63374Sil.A04("Tx3gParser", AnonymousClass001.A0n("Truncating styl end (", ") to cueText.length() (", ").", A084, spannableStringBuilder.length()));
                            A084 = spannableStringBuilder.length();
                        }
                        if (A083 >= A084) {
                            AbstractC63374Sil.A04("Tx3gParser", AnonymousClass001.A0n("Ignoring styl with start (", ") >= end (", ").", A083, A084));
                        } else {
                            A00(spannableStringBuilder, A05, i5, A083, A084, 0);
                            if (A013 != i6) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan((A013 >>> 8) | ((A013 & 255) << 24)), A083, A084, 33);
                            }
                        }
                    }
                } else if (A012 == 1952608120 && this.A06) {
                    if (i7 - wFa.A01 < 2) {
                        z = false;
                    }
                    WDn.A01(z);
                    f = AbstractC58322PtE.A01(wFa.A08() / this.A03, 0.95f, 0.0f);
                }
                wFa.A0O(i8 + A01);
            }
            of = ImmutableList.of((Object) new W5G(null, null, null, spannableStringBuilder, f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
        }
        interfaceC71874X8h.accept(new C69037Vge(of, -9223372036854775807L, -9223372036854775807L));
    }

    public WSS(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.A01 = bArr[24];
            this.A00 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.A05 = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC50482Ts.A05)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.A03 = i;
            boolean z = (bArr[0] & 32) != 0;
            this.A06 = z;
            if (z) {
                this.A02 = AbstractC58322PtE.A01(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f, 0.0f);
                return;
            } else {
                this.A02 = 0.85f;
                return;
            }
        }
        this.A00 = -1;
        this.A05 = "sans-serif";
        this.A02 = 0.85f;
        this.A03 = -1;
    }
}
