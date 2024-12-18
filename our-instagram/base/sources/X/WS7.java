package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WS7 implements XG2 {
    public C70130W5r A00;
    public InterfaceC71939XBo A01;
    public final XG2 A06;
    public final InterfaceC72027XFp A07;
    public int A03 = 0;
    public int A02 = 0;
    public byte[] A04 = Util.A07;
    public final WFa A05 = new WFa();

    @Override // X.XG2
    public final /* synthetic */ int ELK(InterfaceC71873X8g interfaceC71873X8g, int i, boolean z) {
        return ELQ(interfaceC71873X8g, i, 0, z);
    }

    @Override // X.XG2
    public final /* synthetic */ void ELL(WFa wFa, int i) {
        ELM(wFa, i, 0);
    }

    @Override // X.XG2
    public final int ELQ(InterfaceC71873X8g interfaceC71873X8g, int i, int i2, boolean z) {
        if (this.A01 == null) {
            return this.A06.ELQ(interfaceC71873X8g, i, 0, z);
        }
        A00(i);
        int read = interfaceC71873X8g.read(this.A04, this.A02, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.A02 += read;
        return read;
    }

    private void A00(int i) {
        byte[] bArr;
        byte[] bArr2 = this.A04;
        int length = bArr2.length;
        int i2 = this.A02;
        if (length - i2 < i) {
            int i3 = this.A03;
            int i4 = i2 - i3;
            int max = Math.max(i4 * 2, i + i4);
            if (max <= length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, i3, bArr, 0, i4);
            this.A03 = 0;
            this.A02 = i4;
            this.A04 = bArr;
        }
    }

    @Override // X.XG2
    public final void AWZ(C70130W5r c70130W5r) {
        InterfaceC71939XBo interfaceC71939XBo;
        String str = c70130W5r.A0Y;
        str.getClass();
        WDn.A01(AbstractC167007dF.A1P(WEI.A00(str), 3));
        if (!c70130W5r.equals(this.A00)) {
            this.A00 = c70130W5r;
            InterfaceC72027XFp interfaceC72027XFp = this.A07;
            if (interfaceC72027XFp.EpS(c70130W5r)) {
                interfaceC71939XBo = interfaceC72027XFp.AL4(c70130W5r);
            } else {
                interfaceC71939XBo = null;
            }
            this.A01 = interfaceC71939XBo;
        }
        InterfaceC71939XBo interfaceC71939XBo2 = this.A01;
        XG2 xg2 = this.A06;
        if (interfaceC71939XBo2 != null) {
            C70116W4o c70116W4o = new C70116W4o(c70130W5r);
            c70116W4o.A00("application/x-media3-cues");
            c70116W4o.A0R = str;
            c70116W4o.A0M = Long.MAX_VALUE;
            c70116W4o.A06 = this.A07.Au3(c70130W5r);
            c70130W5r = new C70130W5r(c70116W4o);
        }
        xg2.AWZ(c70130W5r);
    }

    @Override // X.XG2
    public final void ELM(WFa wFa, int i, int i2) {
        if (this.A01 == null) {
            this.A06.ELM(wFa, i, i2);
            return;
        }
        A00(i);
        wFa.A0R(this.A04, this.A02, i);
        this.A02 += i;
    }

    @Override // X.XG2
    public final void ELS(C69702Vtx c69702Vtx, final int i, int i2, int i3, final long j) {
        if (this.A01 == null) {
            this.A06.ELS(c69702Vtx, i, i2, i3, j);
            return;
        }
        WDn.A03(AbstractC25229BEm.A1Z(c69702Vtx), "DRM on subtitles is not supported");
        int i4 = (this.A02 - i3) - i2;
        InterfaceC71939XBo interfaceC71939XBo = this.A01;
        byte[] bArr = this.A04;
        interfaceC71939XBo.E3P(new InterfaceC71874X8h() { // from class: X.WR8
            @Override // X.InterfaceC71874X8h
            public final void accept(Object obj) {
                WS7 ws7 = WS7.this;
                long j2 = j;
                int i5 = i;
                C69037Vge c69037Vge = (C69037Vge) obj;
                WDn.A00(ws7.A00);
                ImmutableList immutableList = c69037Vge.A02;
                long j3 = c69037Vge.A00;
                ArrayList<? extends Parcelable> A0q = AbstractC25230BEn.A0q(immutableList);
                Iterator<E> it = immutableList.iterator();
                while (it.hasNext()) {
                    W5G w5g = (W5G) it.next();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = w5g.A0F;
                    if (charSequence != null) {
                        bundle.putCharSequence(W5G.A0S, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = W1B.A00;
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                            for (W29 w29 : (W29[]) spanned.getSpans(0, spanned.length(), W29.class)) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(W29.A03, w29.A01);
                                bundle2.putInt(W29.A02, w29.A00);
                                arrayList.add(W1B.A00(bundle2, spanned, w29, 1));
                            }
                            for (W2V w2v : (W2V[]) spanned.getSpans(0, spanned.length(), W2V.class)) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(W2V.A04, w2v.A01);
                                bundle3.putInt(W2V.A03, w2v.A00);
                                bundle3.putInt(W2V.A05, w2v.A02);
                                arrayList.add(W1B.A00(bundle3, spanned, w2v, 2));
                            }
                            for (VKY vky : (VKY[]) spanned.getSpans(0, spanned.length(), VKY.class)) {
                                arrayList.add(W1B.A00(null, spanned, vky, 3));
                            }
                            if (!arrayList.isEmpty()) {
                                bundle.putParcelableArrayList(W5G.A0J, arrayList);
                            }
                        }
                    }
                    bundle.putSerializable(W5G.A0T, w5g.A0E);
                    bundle.putSerializable(W5G.A0N, w5g.A0D);
                    bundle.putFloat(W5G.A0K, w5g.A01);
                    bundle.putInt(W5G.A0M, w5g.A07);
                    bundle.putInt(W5G.A0L, w5g.A06);
                    bundle.putFloat(W5G.A0O, w5g.A02);
                    bundle.putInt(W5G.A0P, w5g.A08);
                    bundle.putInt(W5G.A0V, w5g.A09);
                    bundle.putFloat(W5G.A0U, w5g.A05);
                    bundle.putFloat(W5G.A0R, w5g.A04);
                    bundle.putFloat(W5G.A0I, w5g.A00);
                    bundle.putBoolean(W5G.A0Y, false);
                    bundle.putInt(W5G.A0X, w5g.A0B);
                    bundle.putInt(W5G.A0W, w5g.A0A);
                    bundle.putFloat(W5G.A0Q, w5g.A03);
                    Bitmap bitmap = w5g.A0C;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        C0fK.A01(compressFormat, bitmap, 0);
                        WDn.A02(bitmap.compress(compressFormat, 0, byteArrayOutputStream));
                        bundle.putByteArray(W5G.A0H, byteArrayOutputStream.toByteArray());
                    }
                    A0q.add(bundle);
                }
                Bundle bundle4 = new Bundle();
                bundle4.putParcelableArrayList("c", A0q);
                bundle4.putLong("d", j3);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle4);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                WFa wFa = ws7.A05;
                int length = marshall.length;
                wFa.A0Q(marshall, length);
                XG2 xg2 = ws7.A06;
                xg2.ELL(wFa, length);
                long j4 = c69037Vge.A01;
                C70130W5r c70130W5r = ws7.A00;
                if (j4 == -9223372036854775807L) {
                    WDn.A02(AbstractC167007dF.A1N((c70130W5r.A0O > Long.MAX_VALUE ? 1 : (c70130W5r.A0O == Long.MAX_VALUE ? 0 : -1))));
                } else {
                    long j5 = c70130W5r.A0O;
                    if (j5 == Long.MAX_VALUE) {
                        j2 += j4;
                    } else {
                        j2 = j4 + j5;
                    }
                }
                xg2.ELS(null, i5, length, 0, j2);
            }
        }, C70003VzN.A00, bArr, i4, i2);
        int i5 = i4 + i2;
        this.A03 = i5;
        if (i5 != this.A02) {
            return;
        }
        this.A03 = 0;
        this.A02 = 0;
    }

    public WS7(XG2 xg2, InterfaceC72027XFp interfaceC72027XFp) {
        this.A06 = xg2;
        this.A07 = interfaceC72027XFp;
    }
}
