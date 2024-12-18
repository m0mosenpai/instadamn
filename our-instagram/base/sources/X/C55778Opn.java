package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* renamed from: X.Opn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55778Opn implements XES {
    public final /* synthetic */ C45120Jxp A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47Z A02;
    public final /* synthetic */ String A03;

    @Override // X.XES
    public final void D21(C70129W5q c70129W5q) {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.56W] */
    @Override // X.XES
    public final void D6f(List list) {
        OTa oTa;
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            try {
                String str = this.A03;
                File A11 = AbstractC166987dD.A11(str);
                if (A11.exists() && A11.length() > 0) {
                    C55176Odf c55176Odf = (C55176Odf) list.get(0);
                    C47Z c47z = this.A02;
                    c47z.A0g(str);
                    int i = c55176Odf.A0D;
                    int i2 = c55176Odf.A0B;
                    c47z.A0S = i;
                    c47z.A0R = i2;
                    int i3 = (int) c55176Odf.A0H;
                    int i4 = (int) c55176Odf.A0I;
                    ?? obj = new Object();
                    obj.A01 = i3;
                    obj.A00 = i4;
                    c47z.A1W = obj;
                    C45120Jxp c45120Jxp = this.A00;
                    if (c45120Jxp != null && c45120Jxp.A04) {
                        boolean z = c45120Jxp.A05;
                        WDI wdi = c55176Odf.A00;
                        if (wdi != null) {
                            UserSession userSession = this.A01;
                            if (z) {
                                oTa = new OTa(userSession);
                            } else {
                                oTa = null;
                            }
                            c47z.A1j.A00 = new C52031N0f(oTa, wdi, c55176Odf, null, userSession, c47z).A00();
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                AbstractC12120kG.A0C("VideoRenderUtil", "Local Render - couldn't find output file", e);
            }
        }
    }

    @Override // X.XES
    public final void Dk4(File file, long j) {
    }

    @Override // X.XES
    public final void Dk6(C55176Odf c55176Odf) {
    }

    @Override // X.XES
    public final void onStart() {
    }

    public C55778Opn(C45120Jxp c45120Jxp, UserSession userSession, C47Z c47z, String str) {
        this.A02 = c47z;
        this.A03 = str;
        this.A00 = c45120Jxp;
        this.A01 = userSession;
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        Throwable th = (Throwable) obj;
        C14360o3.A0B(th, 0);
        AbstractC12120kG.A0C("VideoRenderUtil", "Video Transcode has failed.", th);
    }

    @Override // X.XES
    public final void Dbq(double d) {
        this.A02.A0e(C05F.A00, d);
    }
}
