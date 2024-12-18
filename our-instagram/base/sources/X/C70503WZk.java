package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.WZk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70503WZk implements XCC {
    public final /* synthetic */ C70193WFw A00;

    @Override // X.XCC
    public final void D6X(List list) {
        long j;
        XEJ c70496WZd;
        C70193WFw c70193WFw = this.A00;
        synchronized (c70193WFw) {
            List<C70125W5g> A02 = C15500q5.A02(list);
            if (A02 == null || A02.isEmpty()) {
                C69492VoF c69492VoF = c70193WFw.A0H;
                if (c69492VoF.A01.A03()) {
                    if (A02 == null) {
                        A02 = new ArrayList();
                    }
                    A02.addAll(c69492VoF.A00.AwC(c70193WFw.A02, c70193WFw.A03, c69492VoF));
                } else {
                    if (A02 != null) {
                    }
                    C70193WFw.A04(c70193WFw, new Exception("Strategy config list is empty"));
                }
            }
            if (!A02.isEmpty()) {
                C69492VoF c69492VoF2 = c70193WFw.A0H;
                List list2 = c70193WFw.A0O;
                ArrayList arrayList = new ArrayList();
                for (C70125W5g c70125W5g : A02) {
                    EnumC68130VCo enumC68130VCo = c70125W5g.A03;
                    C69616VsJ c69616VsJ = c70193WFw.A0G;
                    HashMap A00 = c69616VsJ.A00();
                    MYB myb = c70193WFw.A02;
                    WDI wdi = c70125W5g.A02;
                    boolean z = c70125W5g.A05;
                    C14360o3.A0B(enumC68130VCo, 0);
                    HashMap hashMap = new HashMap(A00);
                    if (enumC68130VCo == EnumC68130VCo.A03) {
                        hashMap.put("target_upload_settings_mode", "raw");
                    } else if (myb != null) {
                        if (wdi != null) {
                            j = ((myb.A07 / 1000) * wdi.A01()) / 8;
                        } else {
                            j = myb.A08;
                        }
                        hashMap.put("target_upload_settings_mode", "transcode");
                        hashMap.put("estimated_resized_file_size", String.valueOf(j));
                        hashMap.put("is_streaming_transcode", String.valueOf(z));
                        hashMap.put("video_transcode_is_segmented", String.valueOf(AbstractC167007dF.A1X(enumC68130VCo, EnumC68130VCo.A04)));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                    XC1 xc1 = c70193WFw.A0D;
                    C66282U7c c66282U7c = new C66282U7c(new W54(xc1, c70193WFw.A0E, hashMap), c70193WFw);
                    MediaComposition mediaComposition = c70193WFw.A04;
                    C54371O1d c54371O1d = c69492VoF2.A0J;
                    if (c54371O1d != null) {
                        C1125756l A002 = WGX.A00(EnumC1125356h.VIDEO, c54371O1d.A00);
                        if (A002 != null) {
                            A002.A01(false);
                        }
                    }
                    C68262VJz c68262VJz = c70193WFw.A07;
                    if (c68262VJz != null) {
                        if (enumC68130VCo.ordinal() != 0) {
                            boolean z2 = c70125W5g.A04;
                            long j2 = c70125W5g.A01;
                            long j3 = c70125W5g.A00;
                            ExecutorService executorService = c70193WFw.A0P;
                            if (executorService != null) {
                                File file = c70193WFw.A08;
                                if (file != null) {
                                    String path = file.getPath();
                                    C14360o3.A07(path);
                                    c70496WZd = new C70497WZe(xc1, c70193WFw.A02, wdi, c70193WFw.A0F, mediaComposition, c69492VoF2, c70193WFw.A06, enumC68130VCo, c68262VJz, c66282U7c, c69492VoF2.A0O, path, c69616VsJ.A00(), executorService, c70193WFw.A00, j2, j3, z, z2);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            File file2 = c70193WFw.A08;
                            if (file2 != null) {
                                String path2 = file2.getPath();
                                C14360o3.A0A(path2);
                                c70496WZd = new C70496WZd(xc1, c70193WFw.A02, c69492VoF2, c68262VJz, c66282U7c, path2, c69616VsJ.A00());
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        arrayList.add(c70496WZd);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                list2.addAll(arrayList);
                if (c70193WFw.A0K.A06()) {
                    C70193WFw.A02(c70193WFw);
                    C70193WFw.A03(c70193WFw);
                }
                XEJ xej = (XEJ) list2.get(c70193WFw.A00);
                c70193WFw.A05 = xej;
                c70193WFw.A0A = true;
                if (xej != null) {
                    xej.FD9();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C70193WFw.A04(c70193WFw, new Exception("Strategy config list is empty"));
        }
        c70193WFw.A0L.DxN(list);
    }

    public C70503WZk(C70193WFw c70193WFw) {
        this.A00 = c70193WFw;
    }

    @Override // X.XCC
    public final void onFailure(Exception exc) {
        C70193WFw.A04(this.A00, exc);
    }
}
