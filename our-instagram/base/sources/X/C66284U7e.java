package X;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.U7e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66284U7e implements XET {
    public final W8z A00;
    public final /* synthetic */ C70497WZe A01;

    @Override // X.XET
    public final void D21(C70129W5q c70129W5q) {
        C14360o3.A0B(c70129W5q, 0);
        W8z w8z = this.A00;
        synchronized (w8z) {
            HashMap hashMap = new HashMap();
            C69832VwI.A00(c70129W5q, hashMap);
            XC1 xc1 = w8z.A01;
            W8z.A00(w8z, null, null, "media_upload_segmented_transcode_cancel", hashMap, xc1.now() - w8z.A00);
        }
        C70497WZe c70497WZe = this.A01;
        synchronized (c70497WZe) {
            if (c70497WZe.A04 == C05F.A01) {
                c70497WZe.A04 = C05F.A0C;
                C69568VrX c69568VrX = c70497WZe.A01;
                if (c69568VrX != null) {
                    XC1 xc12 = c69568VrX.A01;
                    AbstractC68335VMv.A00(xc12, null, "media_upload_process_cancel", c69568VrX.A02, xc12.now() - c69568VrX.A00);
                }
                InterfaceC72009XEx interfaceC72009XEx = c70497WZe.A0J;
                interfaceC72009XEx.Dk8();
                interfaceC72009XEx.Duv();
            }
        }
    }

    @Override // X.XET
    public final void DEe(C105764pn c105764pn, C70129W5q c70129W5q) {
        AbstractC167017dG.A1N(c105764pn, c70129W5q);
        W8z w8z = this.A00;
        synchronized (w8z) {
            HashMap hashMap = new HashMap();
            C69832VwI.A00(c70129W5q, hashMap);
            XC1 xc1 = w8z.A01;
            W8z.A00(w8z, null, c105764pn, "media_upload_segmented_transcode_failure", hashMap, xc1.now() - w8z.A00);
        }
        C70497WZe c70497WZe = this.A01;
        synchronized (c70497WZe) {
            if (c70497WZe.A04 == C05F.A01) {
                c70497WZe.A04 = C05F.A0N;
                C69568VrX c69568VrX = c70497WZe.A01;
                if (c69568VrX != null) {
                    c69568VrX.A00(c105764pn);
                    InterfaceC72009XEx interfaceC72009XEx = c70497WZe.A0J;
                    interfaceC72009XEx.Dk9(c105764pn);
                    interfaceC72009XEx.Dux(c105764pn);
                    C70497WZe.A03(c70497WZe, c105764pn);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.VvT, java.lang.Object] */
    @Override // X.XET
    public final void Dk5(VDT vdt, File file, int i, long j) {
        C14360o3.A0B(file, 0);
        W8z w8z = this.A00;
        String name = vdt.name();
        C70497WZe c70497WZe = this.A01;
        synchronized (w8z) {
            C14360o3.A0B(name, 0);
            C69687VtX c69687VtX = new C69687VtX(name, i);
            w8z.A02.put(c69687VtX, Long.valueOf(w8z.A01.now()));
            W8z.A00(w8z, c69687VtX, null, "media_upload_segmented_transcode_start", new HashMap(), -1L);
        }
        synchronized (c70497WZe) {
            if (c70497WZe.A04 == C05F.A01) {
                ?? obj = new Object();
                obj.A05 = file;
                obj.A02 = -1L;
                obj.A04 = vdt;
                obj.A06 = "video/mp4";
                obj.A03 = -1L;
                obj.A00 = i;
                obj.A01 = j;
                c70497WZe.A0R.add(obj);
                c70497WZe.A0M.put(file, obj);
                C70497WZe.A02(c70497WZe);
            }
        }
    }

    @Override // X.XET
    public final void onStart() {
    }

    @Override // X.XET
    public final void onSuccess() {
    }

    public C66284U7e(W8z w8z, C70497WZe c70497WZe) {
        this.A01 = c70497WZe;
        this.A00 = w8z;
    }

    @Override // X.XET
    public final void Dk3(VDT vdt, float f) {
        C70497WZe c70497WZe = this.A01;
        synchronized (c70497WZe) {
            C66283U7d c66283U7d = c70497WZe.A0E;
            if (vdt != VDT.A03) {
                c66283U7d.A01 = f;
                C66283U7d.A00(c66283U7d);
            }
        }
    }

    @Override // X.XET
    public final void Dk7(C55176Odf c55176Odf, VDT vdt, int i) {
        long j;
        boolean z;
        W8z w8z = this.A00;
        String name = vdt.name();
        C70497WZe c70497WZe = this.A01;
        synchronized (w8z) {
            C14360o3.A0B(name, 0);
            C69687VtX c69687VtX = new C69687VtX(name, i);
            Long l = (Long) w8z.A02.get(c69687VtX);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("target_bit_rate", String.valueOf(c55176Odf.A0I));
            hashMap2.put("target_height", String.valueOf(c55176Odf.A0B));
            hashMap2.put("target_width", String.valueOf(c55176Odf.A0D));
            hashMap2.put(MSV.A00(1651), String.valueOf(c55176Odf.A0A));
            hashMap2.put("transcode_file_size", String.valueOf(c55176Odf.A0G));
            z = c55176Odf.A0O;
            hashMap2.put(AbstractC111324zv.A00(4752), String.valueOf(z));
            hashMap2.put("segment_duration", String.valueOf(c55176Odf.A0J));
            C70129W5q c70129W5q = c55176Odf.A0L;
            String str = c70129W5q.A0K;
            if (str != null) {
                hashMap2.put("target_codec_profile", str);
            }
            String str2 = c70129W5q.A0I;
            if (str2 != null) {
                hashMap2.put(MSV.A00(201), str2);
            }
            String str3 = c70129W5q.A0H;
            if (str3 != null) {
                hashMap2.put(AbstractC111324zv.A00(2231), str3);
            }
            hashMap.putAll(hashMap2);
            C69832VwI.A00(c70129W5q, hashMap);
            W8z.A00(w8z, c69687VtX, null, "media_upload_segmented_transcode_success", hashMap, w8z.A01.now() - j);
        }
        synchronized (c70497WZe) {
            if (c70497WZe.A04 == C05F.A01) {
                List<C55176Odf> list = c70497WZe.A0P;
                list.add(c55176Odf);
                InterfaceC72009XEx interfaceC72009XEx = c70497WZe.A0J;
                interfaceC72009XEx.DkA(c55176Odf);
                HashMap hashMap3 = c70497WZe.A0M;
                File file = c55176Odf.A0N;
                Object obj = hashMap3.get(file);
                if (obj != null) {
                    C69788VvT c69788VvT = (C69788VvT) obj;
                    c69788VvT.A02 = file.length();
                    c70497WZe.A0O.add(c69788VvT);
                    C70497WZe.A02(c70497WZe);
                    if (z) {
                        try {
                            c70497WZe.A00++;
                            C69568VrX c69568VrX = c70497WZe.A01;
                            if (c69568VrX != null) {
                                if (c70497WZe.A0Q.size() == c70497WZe.A00) {
                                    for (C55176Odf c55176Odf2 : list) {
                                        if (c55176Odf2.A0M == EnumC1125356h.VIDEO) {
                                            c69568VrX.A02.put("target_color_space", AbstractC69825VwB.A00(c55176Odf2.A08));
                                        }
                                    }
                                    XC1 xc1 = c69568VrX.A01;
                                    AbstractC68335VMv.A00(xc1, null, "media_upload_process_success", c69568VrX.A02, xc1.now() - c69568VrX.A00);
                                    interfaceC72009XEx.Dv3(c70497WZe.A0D, c70497WZe.A0F, list, true);
                                    try {
                                        c70497WZe.A0I.A07();
                                    } catch (IllegalStateException e) {
                                        C70497WZe.A03(c70497WZe, e);
                                    }
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c70497WZe.ELs();
                    Exception exc = c70497WZe.A02;
                    if (c70497WZe.A0Q.size() == c70497WZe.A00 && exc != null) {
                        c70497WZe.DvC(exc);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }
}
