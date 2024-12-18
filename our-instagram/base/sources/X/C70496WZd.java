package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.WZd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70496WZd implements XEJ {
    public final C69492VoF A00;
    public final WGC A01;
    public final String A02;
    public final XC1 A03;
    public final MYB A04;
    public final InterfaceC72009XEx A05;
    public final XE9 A06;
    public final Map A07;

    @Override // X.XEJ
    public final synchronized void DkC(W62 w62, float f) {
        this.A06.Dbk(f);
        this.A05.DvE(f);
    }

    @Override // X.XEJ
    public final synchronized void DvC(Exception exc) {
        this.A01.A06();
        this.A06.DG3(exc);
    }

    @Override // X.XEJ
    public final synchronized void DxM(C69203VjW c69203VjW) {
        this.A06.onSuccess(new C69570VrZ(EnumC68130VCo.A03, c69203VjW, new ArrayList()));
    }

    @Override // X.XEJ
    public final void ELs() {
    }

    @Override // X.XEJ
    public final void cancel() {
        synchronized (this) {
            this.A01.A06();
        }
        this.A06.D22(new CancellationException("RawMediaUploadStrategy canceled by user"));
    }

    @Override // X.XEJ
    public final void FD9() {
        File file;
        C69568VrX c69568VrX = new C69568VrX(this.A03, null, this.A07);
        long j = -1;
        AbstractC68335VMv.A00(c69568VrX.A01, null, "media_upload_process_skipped", c69568VrX.A02, -1L);
        this.A05.Duz();
        this.A06.onStart();
        C69492VoF c69492VoF = this.A00;
        String str = this.A02;
        String A00 = AbstractC50672MYq.A00(str, "video/mp4", false);
        C54371O1d c54371O1d = c69492VoF.A0J;
        if (c54371O1d != null) {
            List A08 = c54371O1d.A00.A08(EnumC1125356h.VIDEO, 0);
            if (A08 != null) {
                file = ((C1125756l) A08.get(0)).A04;
                AbstractC1126356r.A06(file);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            file = new File(str);
            j = file.length();
        }
        W62 w62 = new W62(VDT.A04, file, A00, 0, j, 0L, j);
        WGC wgc = this.A01;
        wgc.A08();
        wgc.A09(w62);
        wgc.A07();
    }

    public C70496WZd(XC1 xc1, MYB myb, C69492VoF c69492VoF, C68262VJz c68262VJz, XE9 xe9, String str, Map map) {
        AbstractC43594JPz.A1P(str, xc1);
        this.A00 = c69492VoF;
        this.A02 = str;
        this.A07 = map;
        this.A03 = xc1;
        this.A06 = xe9;
        this.A05 = c69492VoF.A02;
        this.A04 = myb;
        C69275Vkj c69275Vkj = new C69275Vkj(xc1, map);
        this.A01 = c68262VJz.A00(new C69055Vgw(xc1, map, new File(str).length()), myb, this, new W2L(xc1, map), c69275Vkj, EnumC68130VCo.A03);
    }
}
