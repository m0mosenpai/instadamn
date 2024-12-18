package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.WZe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70497WZe implements XEJ {
    public int A00;
    public C69568VrX A01;
    public Exception A02;
    public Integer A03;
    public Integer A04;
    public Map A05;
    public C69202VjV A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final XC1 A0A;
    public final MYB A0B;
    public final WDI A0C;
    public final MediaComposition A0D;
    public final C66283U7d A0E;
    public final C69492VoF A0F;
    public final W8v A0G;
    public final EnumC68130VCo A0H;
    public final WGC A0I;
    public final InterfaceC72009XEx A0J;
    public final File A0K;
    public final Integer A0L;
    public final HashMap A0M;
    public final HashMap A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final TreeSet A0R;
    public final ExecutorService A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final C69546VrA A0V;
    public final XE9 A0W;

    private final WGC A00(XC1 xc1, WDI wdi, EnumC68130VCo enumC68130VCo, C68262VJz c68262VJz, Map map) {
        String str;
        switch (this.A03.intValue()) {
            case 0:
                str = "NO_RECORD";
                break;
            case 1:
                str = "RECOVERY_FAILED";
                break;
            default:
                str = "RECOVERY_SUCCESS";
                break;
        }
        map.put("crash_recovery_mode", str);
        map.put("video_transcode_is_segmented", String.valueOf(AbstractC167007dF.A1X(enumC68130VCo, EnumC68130VCo.A04)));
        MYB myb = this.A0B;
        if (myb != null) {
            map.put("source_color_space", AbstractC69825VwB.A00(myb.A01));
        }
        XC1 xc12 = this.A0A;
        C69568VrX c69568VrX = new C69568VrX(xc12, wdi, map);
        this.A01 = c69568VrX;
        HashMap hashMap = new HashMap(c69568VrX.A02);
        this.A05 = hashMap;
        C69275Vkj c69275Vkj = new C69275Vkj(xc1, hashMap);
        W2L w2l = new W2L(xc1, this.A05);
        C69055Vgw c69055Vgw = new C69055Vgw(xc12, this.A05, -1L);
        C14360o3.A07(this.A0K.getPath());
        return c68262VJz.A00(c69055Vgw, myb, this, w2l, c69275Vkj, enumC68130VCo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A02(X.C70497WZe r14) {
        /*
            monitor-enter(r14)
        L1:
            java.util.TreeSet r7 = r14.A0R     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lc8
            java.lang.Object r9 = r7.first()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r9 == 0) goto Lb3
            X.VvT r9 = (X.C69788VvT) r9     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.util.HashMap r2 = r14.A0N     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VDT r0 = r9.A04     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.lang.Object r11 = r2.get(r0)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VvT r11 = (X.C69788VvT) r11     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.util.Iterator r8 = X.AbstractC167007dF.A0k(r2)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            r5 = -1
            r10 = 0
        L22:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 == 0) goto L37
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VvT r1 = (X.C69788VvT) r1     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r3 = r1.A03     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L22
            r5 = r3
            r10 = r1
            goto L22
        L37:
            r8 = 0
            if (r11 != 0) goto L3f
            int r0 = r9.A00     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 != 0) goto Lc8
            goto L47
        L3f:
            int r0 = r11.A00     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r1 = r0 + 1
            int r0 = r9.A00     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r1 != r0) goto Lc8
        L47:
            r5 = -1
            if (r10 == 0) goto L51
            long r3 = r10.A02     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Lc8
        L51:
            long r3 = r9.A02     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L66
            java.io.File r1 = r9.A05     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.C14360o3.A0B(r1, r8)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            boolean r0 = r1 instanceof X.VCK     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc8
            X.VCK r1 = (X.VCK) r1     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            boolean r0 = r1.A02     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc8
        L66:
            java.lang.Object r1 = r7.pollFirst()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lb8
            X.VvT r1 = (X.C69788VvT) r1     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.util.Iterator r9 = X.AbstractC167007dF.A0k(r2)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            r7 = -1
            r6 = 0
        L75:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            if (r0 == 0) goto L8a
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VvT r5 = (X.C69788VvT) r5     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r3 = r5.A03     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L75
            r7 = r3
            r6 = r5
            goto L75
        L8a:
            if (r6 != 0) goto L8f
            r10 = 0
            goto L94
        L8f:
            long r10 = r6.A03     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r3 = r6.A02     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r10 = r10 + r3
        L94:
            r1.A03 = r10     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.WGC r0 = r14.A0I     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.io.File r5 = r1.A05     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r8 = r1.A02     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VDT r4 = r1.A04     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            int r7 = r1.A00     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            java.lang.String r6 = r1.A06     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            long r12 = r1.A01     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.W62 r3 = new X.W62     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            r3.<init>(r4, r5, r6, r7, r8, r10, r12)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            r0.A09(r3)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            X.VDT r0 = r1.A04     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            r2.put(r0, r1)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            goto L1
        Lb3:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
            goto Lbc
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
        Lbc:
            throw r0     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcf
        Lbd:
            r1 = move-exception
            A03(r14, r1)     // Catch: java.lang.Throwable -> Lcf
            X.VrX r0 = r14.A01     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lca
            r0.A00(r1)     // Catch: java.lang.Throwable -> Lcf
        Lc8:
            monitor-exit(r14)
            return
        Lca:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70497WZe.A02(X.WZe):void");
    }

    @Override // X.XEJ
    public final synchronized void DkC(W62 w62, float f) {
        float f2;
        C69202VjV c69202VjV = this.A06;
        if (c69202VjV != null) {
            VDT vdt = w62.A04;
            VDT vdt2 = VDT.A05;
            if (vdt == vdt2) {
                Map map = c69202VjV.A03;
                Float f3 = (Float) map.get(w62);
                if (f3 != null) {
                    f2 = f3.floatValue();
                } else {
                    f2 = 0.0f;
                }
                float f4 = f - f2;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                } else if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                float f5 = c69202VjV.A00 + (f4 / c69202VjV.A01);
                c69202VjV.A00 = f5;
                map.put(w62, Float.valueOf(f));
                f = f5;
            }
            C66283U7d c66283U7d = c69202VjV.A02;
            if (VDT.A03 == vdt) {
                c66283U7d.A00 = f;
            } else {
                if (vdt2 != vdt) {
                    c66283U7d.A00 = f;
                }
                c66283U7d.A02 = f;
            }
            C66283U7d.A00(c66283U7d);
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.XEJ
    public final synchronized void DvC(Exception exc) {
        if (this.A04 == C05F.A01) {
            if (this.A0Q.size() == this.A00) {
                this.A04 = C05F.A0N;
                A03(this, exc);
            } else {
                this.A02 = exc;
            }
        }
    }

    @Override // X.XEJ
    public final synchronized void DxM(C69203VjW c69203VjW) {
        this.A0W.onSuccess(new C69570VrZ(this.A0H, c69203VjW, this.A0P));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        if (r2 == null) goto L43;
     */
    @Override // X.XEJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void ELs() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70497WZe.ELs():void");
    }

    @Override // X.XEJ
    public final synchronized void cancel() {
        if (this.A04 == C05F.A01) {
            this.A04 = C05F.A0C;
            A04("SegmentedMediaUploadStrategy canceled by user");
            this.A0W.D22(new CancellationException("SegmentedMediaUploadStrategy canceled by user"));
        }
    }

    public static final JSONArray A01(List list) {
        JSONObject A00;
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof C69788VvT) {
                A00 = ((C69788VvT) obj).A00();
            } else if (obj instanceof C55176Odf) {
                A00 = ((C55176Odf) obj).A03();
            }
            jSONArray.put(A00);
        }
        return jSONArray;
    }

    private final void A04(String str) {
        List list = this.A0Q;
        if (list.size() != this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((XD7) it.next()).AGG(str);
            }
        }
        this.A0I.A06();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc A[Catch: 4pn | RuntimeException -> 0x022e, all -> 0x0236, LOOP:5: B:84:0x01c6->B:86:0x01cc, LOOP_END, TryCatch #1 {4pn | RuntimeException -> 0x022e, blocks: (B:6:0x0015, B:8:0x0019, B:12:0x0052, B:16:0x022d, B:16:0x022d, B:15:0x0226, B:15:0x0226, B:17:0x0058, B:18:0x008a, B:20:0x0090, B:33:0x00a1, B:30:0x00aa, B:23:0x00b3, B:36:0x00bc, B:37:0x00c7, B:39:0x00cd, B:42:0x00d7, B:47:0x00de, B:48:0x00e7, B:50:0x00ed, B:53:0x00f7, B:58:0x00fe, B:60:0x010f, B:62:0x0114, B:64:0x011c, B:65:0x0126, B:67:0x012c, B:68:0x0136, B:70:0x013c, B:73:0x0148, B:75:0x0151, B:78:0x0157, B:81:0x01a2, B:82:0x01be, B:83:0x01c1, B:84:0x01c6, B:86:0x01cc, B:89:0x01e5, B:90:0x01ed, B:92:0x01f3, B:94:0x01fb, B:95:0x0207, B:96:0x0209, B:99:0x0210, B:99:0x0210, B:100:0x0211, B:100:0x0211, B:105:0x021f, B:105:0x021f, B:109:0x0162, B:112:0x0168, B:114:0x0185, B:115:0x0146, B:116:0x0221, B:116:0x0221), top: B:5:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5 A[Catch: 4pn | RuntimeException -> 0x022e, all -> 0x0236, TryCatch #1 {4pn | RuntimeException -> 0x022e, blocks: (B:6:0x0015, B:8:0x0019, B:12:0x0052, B:16:0x022d, B:16:0x022d, B:15:0x0226, B:15:0x0226, B:17:0x0058, B:18:0x008a, B:20:0x0090, B:33:0x00a1, B:30:0x00aa, B:23:0x00b3, B:36:0x00bc, B:37:0x00c7, B:39:0x00cd, B:42:0x00d7, B:47:0x00de, B:48:0x00e7, B:50:0x00ed, B:53:0x00f7, B:58:0x00fe, B:60:0x010f, B:62:0x0114, B:64:0x011c, B:65:0x0126, B:67:0x012c, B:68:0x0136, B:70:0x013c, B:73:0x0148, B:75:0x0151, B:78:0x0157, B:81:0x01a2, B:82:0x01be, B:83:0x01c1, B:84:0x01c6, B:86:0x01cc, B:89:0x01e5, B:90:0x01ed, B:92:0x01f3, B:94:0x01fb, B:95:0x0207, B:96:0x0209, B:99:0x0210, B:99:0x0210, B:100:0x0211, B:100:0x0211, B:105:0x021f, B:105:0x021f, B:109:0x0162, B:112:0x0168, B:114:0x0185, B:115:0x0146, B:116:0x0221, B:116:0x0221), top: B:5:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.XEJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void FD9() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70497WZe.FD9():void");
    }

    public static final void A03(C70497WZe c70497WZe, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        c70497WZe.A04(message);
        c70497WZe.A0W.DG3(exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0276, code lost:
    
        if (r2.isEmpty() == false) goto L51;
     */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.VIs, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70497WZe(X.XC1 r33, X.MYB r34, X.WDI r35, X.C69546VrA r36, com.facebook.videolite.transcoder.base.composition.MediaComposition r37, X.C69492VoF r38, X.W8v r39, X.EnumC68130VCo r40, X.C68262VJz r41, X.XE9 r42, java.lang.Integer r43, java.lang.String r44, java.util.Map r45, java.util.concurrent.ExecutorService r46, int r47, long r48, long r50, boolean r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70497WZe.<init>(X.XC1, X.MYB, X.WDI, X.VrA, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.VoF, X.W8v, X.VCo, X.VJz, X.XE9, java.lang.Integer, java.lang.String, java.util.Map, java.util.concurrent.ExecutorService, int, long, long, boolean, boolean):void");
    }
}
