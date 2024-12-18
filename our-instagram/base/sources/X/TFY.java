package X;

import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.location.platform.api.Location;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class TFY implements InterfaceC65592TnX, InterfaceC65528Tlx {
    public int A00;
    public InterfaceC65528Tlx A01;
    public C1QW A02;
    public boolean A03;
    public boolean A04;
    public final C1QW A05;
    public final C1QY A06;
    public final InterfaceC65453TkP A07;
    public final InterfaceC65592TnX A08;
    public final C18240vB A09;

    public TFY(C1QW c1qw, C1QY c1qy, InterfaceC65453TkP interfaceC65453TkP, InterfaceC65592TnX interfaceC65592TnX, C18240vB c18240vB) {
        C14360o3.A0B(interfaceC65453TkP, 1);
        this.A07 = interfaceC65453TkP;
        this.A05 = c1qw;
        this.A08 = interfaceC65592TnX;
        this.A06 = c1qy;
        this.A09 = c18240vB;
    }

    @Override // X.InterfaceC65592TnX
    public final void DED(C61030Rdy c61030Rdy) {
        C14360o3.A0B(c61030Rdy, 0);
        this.A04 = false;
        this.A08.DED(c61030Rdy);
    }

    @Override // X.InterfaceC65592TnX
    public final void E22() {
        this.A04 = false;
        this.A08.E22();
        if (this.A06.A09 == EnumC23341Bw.API) {
            C1QW c1qw = this.A05;
            c1qw.A00("X-Tigon-Is-Retry");
            c1qw.A01("X-Tigon-Is-Retry", "True");
        }
    }

    @Override // X.InterfaceC65528Tlx
    public final void AGv(int i, boolean z) {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A01;
        if (interfaceC65528Tlx != null) {
            interfaceC65528Tlx.AGv(i, z);
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void DgD() {
        if (!this.A03) {
            this.A08.DgD();
            this.A03 = true;
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void Dgg(C3JQ c3jq) {
        String host;
        int i = c3jq.A01;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 <= 10 && (i == 301 || i == 302 || i == 303 || i == 307)) {
            try {
                C1QW c1qw = this.A05;
                C23781El A00 = c3jq.A00(Location.TAG);
                if (A00 != null) {
                    try {
                        java.net.URI create = java.net.URI.create(A00.A01);
                        if (!create.isAbsolute()) {
                            create = c1qw.A09.resolve(create);
                        }
                        List<C23781El> list = c1qw.A01;
                        String scheme = create.getScheme();
                        if (scheme == null || !scheme.equals("https") || (host = create.getHost()) == null || (!host.equals(IGPixelRequestBuffer.URL_PREFIX) && !host.equals("instagram.com") && !host.endsWith(".facebook.com") && !host.endsWith(".instagram.com"))) {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            List asList = Arrays.asList(AbstractC23991Fl.A00);
                            for (C23781El c23781El : list) {
                                if (asList.contains(c23781El.A00)) {
                                    A1E.add(c23781El);
                                }
                            }
                            list = A1E;
                        }
                        String A19 = AbstractC166987dD.A19(create);
                        this.A02 = new C1QW(c1qw.A05, c1qw.A06, c1qw.A07, A19, list, null, c1qw.A04, 192, true, false, c1qw.A02);
                        this.A04 = true;
                        return;
                    } catch (IllegalArgumentException unused) {
                        throw MSY.A0X("Invalid redirect URI: ", A00.A01);
                    }
                }
                throw MSW.A0y("Redirect required, but Location header missing from response");
            } catch (Throwable th) {
                C0w9.A07("LigerRedirect", th);
            }
        }
        this.A08.Dgg(c3jq);
    }

    @Override // X.InterfaceC65528Tlx
    public final void cancel() {
        InterfaceC65528Tlx interfaceC65528Tlx = this.A01;
        if (interfaceC65528Tlx != null) {
            interfaceC65528Tlx.cancel();
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onBody(ByteBuffer byteBuffer) {
        if (!this.A04) {
            this.A08.onBody(byteBuffer);
        }
    }

    @Override // X.InterfaceC65592TnX
    public final void onEOM() {
        if (this.A04) {
            C1QW c1qw = this.A02;
            if (c1qw != null) {
                this.A04 = false;
                this.A01 = this.A07.Enq(c1qw, this.A06, this, this.A09);
                return;
            }
            throw AbstractC166987dD.A14("mRedirectRequest should not be null if mPendingRedirect is true.  onResponse() should be call before onEOM()");
        }
        this.A08.onEOM();
    }

    @Override // X.InterfaceC65592TnX
    public final void onFirstByteFlushed(long j) {
        this.A08.onFirstByteFlushed(j);
    }

    @Override // X.InterfaceC65592TnX
    public final void onHeaderBytesReceived(long j, long j2) {
        this.A08.onHeaderBytesReceived(j, j2);
    }

    @Override // X.InterfaceC65592TnX
    public final void onLastByteAcked(long j, long j2) {
        this.A08.onLastByteAcked(j, j2);
    }
}
