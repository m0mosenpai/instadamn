package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UMU extends Wc6 {
    public VCH A00;
    public C2BB A01;
    public Integer A02;
    public final String A03;
    public final boolean A04;

    @Override // X.Wc6
    public final boolean A03() {
        if (super.A01 == -1 && super.A03 != null) {
            return AbstractC167007dF.A1X(this.A02, C05F.A0C);
        }
        return super.A03();
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        VCH vch = this.A00;
        if (vch != null) {
            super.A03 = vch.A00();
            this.A00 = null;
            Integer num = this.A02;
            if (num == C05F.A00 || num == C05F.A01) {
                this.A02 = C05F.A0N;
            }
        }
        try {
            InterfaceC92344Bp interfaceC92344Bp = super.A02;
            if (interfaceC92344Bp != null) {
                interfaceC92344Bp.close();
            }
            super.A02 = null;
            this.A01 = null;
        } catch (IOException e) {
            C2BB c2bb = this.A01;
            if (c2bb != null) {
                c2bb.DvA(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.ByteArrayOutputStream, X.VCH] */
    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        String str;
        String A00 = MSV.A00(1723);
        C2BB c2bb = this.A01;
        if (c2bb != null) {
            c2bb.DvF(EnumC92424Bx.NOT_CACHED, c4c7);
        }
        try {
            InterfaceC92344Bp interfaceC92344Bp = super.A02;
            if (interfaceC92344Bp != null) {
                long open = interfaceC92344Bp.open(c4c7);
                int i = (int) open;
                super.A01 = i;
                super.A00 = 0;
                if (i == -1) {
                    this.A00 = new ByteArrayOutputStream();
                    this.A02 = C05F.A00;
                } else if (i <= 1048576) {
                    super.A03 = new byte[i];
                }
                if (this.A01 != null) {
                    Map responseHeaders = super.A02.getResponseHeaders();
                    if (responseHeaders != null) {
                        String obj = c4c7.A06.toString();
                        String str2 = this.A03;
                        AbstractMap.SimpleEntry[] simpleEntryArr = C46492Bm.A0B;
                        List list = (List) responseHeaders.get("x-fb-video-livetrace-parentsource");
                        int i2 = 0;
                        String str3 = null;
                        if (list != null) {
                            str = (String) list.get(0);
                            C46492Bm.A08.put(obj, str);
                        } else {
                            str = null;
                        }
                        List list2 = (List) responseHeaders.get("x-fb-video-livetrace-ids");
                        if (list2 != null) {
                            String str4 = (String) list2.get(0);
                            ArrayList arrayList = new ArrayList();
                            for (String str5 : str4.split(",[\\s]*")) {
                                try {
                                    String[] split = str5.split(":");
                                    arrayList.add(new C68918VeI(Long.parseLong(split[0]), 1000 * Long.parseLong(split[1])));
                                } catch (NumberFormatException unused) {
                                }
                            }
                            C68918VeI[] c68918VeIArr = (C68918VeI[]) arrayList.toArray(new C68918VeI[arrayList.size()]);
                            AbstractMap.SimpleEntry[] simpleEntryArr2 = C46492Bm.A0B;
                            while (true) {
                                AbstractMap.SimpleEntry simpleEntry = simpleEntryArr2[i2];
                                if (responseHeaders.get(simpleEntry.getKey()) != null) {
                                    str3 = (String) simpleEntry.getValue();
                                    break;
                                }
                                i2++;
                                if (i2 >= 3) {
                                    break;
                                }
                            }
                            this.A01.DvD("live_trace", new C46492Bm(obj, str2, str, str3, "SUCCESS", null, c68918VeIArr, System.currentTimeMillis()));
                        }
                        A02(this.A01, this.A04);
                    }
                    C4C6 c4c6 = c4c7.A07;
                    if (c4c6 != null) {
                        Map map = c4c6.A0Q;
                        if (map.containsKey(A00)) {
                            this.A01.ETY((String) map.get(A00));
                            return open;
                        }
                    }
                }
                return open;
            }
            throw new IOException("No http data source.");
        } catch (IOException e) {
            C2BB c2bb2 = this.A01;
            if (c2bb2 != null) {
                c2bb2.DvA(e);
            }
            throw e;
        }
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        String str;
        int i3 = super.A01;
        if (i3 != -1) {
            int i4 = i3 - super.A00;
            if (i4 == 0) {
                return -1;
            }
            if (i2 > i4) {
                i2 = i4;
            }
        }
        if (i2 > 0) {
            try {
                InterfaceC92344Bp interfaceC92344Bp = super.A02;
                if (interfaceC92344Bp != null) {
                    i2 = interfaceC92344Bp.read(bArr, i, i2);
                    if (i2 > 0) {
                        byte[] bArr2 = super.A03;
                        if (bArr2 != null) {
                            System.arraycopy(bArr, i, bArr2, super.A00, i2);
                        } else if (this.A00 != null) {
                            Integer num = this.A02;
                            Integer num2 = C05F.A01;
                            if (num != num2) {
                                if (num != C05F.A00) {
                                    String A00 = AbstractC111324zv.A00(1839);
                                    if (num != null) {
                                        switch (num.intValue()) {
                                            case 1:
                                                str = "Partial";
                                                break;
                                            case 2:
                                                str = "Completed";
                                                break;
                                            case 3:
                                                str = "Canceled";
                                                break;
                                            default:
                                                str = "Started";
                                                break;
                                        }
                                    } else {
                                        str = "null";
                                    }
                                    android.util.Log.e("NonPrefetchDataSource", AnonymousClass001.A0R(A00, str));
                                }
                                this.A02 = num2;
                            }
                            this.A00.write(bArr, i, i2);
                        }
                        super.A00 += i2;
                        return i2;
                    }
                } else {
                    i2 = -1;
                }
                if (super.A01 == -1 && i2 == -1) {
                    this.A02 = C05F.A0C;
                    return i2;
                }
            } catch (IOException e) {
                C2BB c2bb = this.A01;
                if (c2bb != null) {
                    c2bb.DvA(e);
                }
                throw e;
            }
        }
        return i2;
    }

    public UMU(C2Ai c2Ai, C2BB c2bb, C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, String str, int i, int i2, boolean z) {
        this.A03 = c92304Bk.A07;
        super.A02 = c2Ai.A00(c92304Bk, interfaceC92334Bn, c2bb, str, i, i2);
        this.A01 = c2bb;
        super.A03 = null;
        this.A00 = null;
        this.A04 = z;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A01 = wva;
    }
}
