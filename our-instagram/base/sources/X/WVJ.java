package X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WVJ implements XGn {
    public long A00;
    public final AbstractC66037TyZ A01;
    public final W62 A02;
    public final /* synthetic */ WGC A03;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        this.A01.A00(null, 1.0d);
        A01(this, null, "onCompletion segment=%s", A00(this));
        WGC wgc = this.A03;
        C69275Vkj c69275Vkj = wgc.A0C.A03;
        XC1 xc1 = c69275Vkj.A03;
        c69275Vkj.A01 = xc1.now();
        AbstractC68335VMv.A00(xc1, null, "media_upload_chunk_transfer_dequeue", c69275Vkj.A04, -1L);
        wgc.A0K.execute(new RunnableC71551Ww0(w63, this, wgc));
    }

    @Override // X.XGn
    public final void DFo(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        C14360o3.A0B(str, 1);
        A01(this, null, "onFailRequest segment=%s, backoff=%s, failureReason=%s, isRetriable=%s, methodName=%s, statusCode=%d", A00(this), Long.valueOf(j), str, Boolean.valueOf(z), str2, Integer.valueOf(i));
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        A01(this, via, "onFailure segment=%s", A00(this));
        WGC wgc = this.A03;
        WGC.A04(this.A02, wgc, via, via.A04, via.A00);
    }

    public WVJ(W62 w62, WGC wgc) {
        this.A03 = wgc;
        this.A02 = w62;
        this.A01 = new C67632Utn(this, wgc);
    }

    public static final String A00(WVJ wvj) {
        Locale locale = Locale.ROOT;
        W62 w62 = wvj.A02;
        String format = String.format(locale, "%s/%s", MSX.A1b(Integer.valueOf(w62.A00), w62.A04, 2));
        C14360o3.A07(format);
        return format;
    }

    public static final void A01(WVJ wvj, Exception exc, String str, Object... objArr) {
        C66040Tyc.A03.A00(wvj.A03.A0E, "transfer", "UploadProtocol", str, exc, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.XE6
    public final void Dbk(float f) {
        AbstractC66037TyZ abstractC66037TyZ = this.A01;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        abstractC66037TyZ.A00(null, f);
    }

    @Override // X.XE6
    public final void onStart() {
        W62 w62 = this.A02;
        A01(this, null, "onStart segment=%s", w62);
        WGC wgc = this.A03;
        synchronized (wgc) {
            C69276Vkk c69276Vkk = wgc.A0C;
            W2L w2l = c69276Vkk.A02;
            synchronized (w2l) {
                w2l.A01.put(w62, Long.valueOf(w2l.A00.now()));
                W2L.A00(w62, w2l, null, "media_upload_chunk_transfer_start", null, -1L);
            }
            c69276Vkk.A04.DkD(w62);
        }
    }

    @Override // X.XGn
    public final void D16(long j) {
        this.A00 = j;
    }

    @Override // X.XE6
    public final void D1z() {
        A01(this, null, "onCancellation segment=%s", A00(this));
    }

    @Override // X.XGn
    public final void DHA(String str, Map map) {
        A01(this, null, "onFinishFetchOffsetGetRequest segment=%s, response=%s", A00(this), str);
    }

    @Override // X.XGn
    public final void DHE(String str, Map map, boolean z) {
        A01(this, null, "onFinishPostRequest segment=%s, wasDuplicate=%s", A00(this), Boolean.valueOf(z));
    }

    @Override // X.XGn
    public final void DkZ(long j, boolean z) {
        A01(this, null, "onSendBytesUsingPostRequest segment=%s, offset=%s, isDuplicate=%s", A00(this), Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // X.XGn
    public final void Dkd(String str, Map map) {
        A01(this, null, "onSendFetchOffsetGetRequest segment=%s, uri=%s", A00(this), str);
    }

    @Override // X.XGn
    public final void DvI(C69684VtU c69684VtU) {
    }
}
