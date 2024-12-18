package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class T4X implements InterfaceC92354Bq {
    public int A00;
    public C4C7 A01;
    public C2BC A02;
    public C44991Jvh A03;
    public InputStream A04;
    public final UserSession A05;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        C14360o3.A0B(c4c7, 0);
        android.net.Uri uri = c4c7.A06;
        C14360o3.A06(uri);
        if (LLT.A09(uri.toString())) {
            C4C7 c4c72 = this.A01;
            if (c4c72 != null) {
                long j = c4c7.A04;
                long j2 = c4c7.A03;
                if (!AbstractC31174DnI.A1a(uri, c4c72.A06.toString()) || c4c72.A04 != j || c4c72.A03 != j2) {
                    throw new C93214Fx(c4c7, "DataSource is already opened", 1004, 1);
                }
            } else {
                this.A01 = c4c7;
                int i = (int) c4c7.A04;
                int i2 = (int) c4c7.A03;
                InterfaceC09390do interfaceC09390do = LKn.A05;
                C44991Jvh A03 = AbstractC46712KlV.A00(this.A05).A03(AbstractC166987dD.A19(uri), null, i, i2);
                this.A03 = A03;
                if (A03 != null) {
                    boolean z = false;
                    int i3 = A03.A05;
                    this.A04 = A03.A06;
                    if (i == 0) {
                        i = 0;
                    }
                    if (i3 != -1 && i3 != 0) {
                        if (i2 != -1) {
                            int i4 = i3 - i;
                            if (i4 > i2) {
                                i4 = i2;
                            }
                            i2 = i4;
                        } else {
                            i2 = i3 - i;
                        }
                    } else if (i2 == -1) {
                        i2 = -1;
                    }
                    this.A00 = i2;
                    C2BC c2bc = this.A02;
                    if (c2bc != null) {
                        if (i3 == -1) {
                            z = true;
                        }
                        c2bc.DvH(this, c4c7, true, z);
                    }
                } else {
                    throw new C93214Fx(c4c7, "Failed to download media", 1001, 1);
                }
            }
            return this.A00;
        }
        throw new C93214Fx(c4c7, "Invalid uri", 1004, 1);
    }

    public static C4C7 A00() {
        Map emptyMap = Collections.emptyMap();
        android.net.Uri parse = android.net.Uri.parse("");
        C4B8.A02(parse);
        C4C7 c4c7 = C4C7.A0B;
        return new C4C7(parse, new C4C6(), null, emptyMap, null, 1, 0, 0L, 0L, -1L);
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            inputStream.close();
        }
        C2BC c2bc = this.A02;
        if (c2bc != null) {
            C4C7 c4c7 = this.A01;
            C4C7 c4c72 = C4C7.A0B;
            if (c4c7 == null) {
                c4c7 = C4C7.A0B;
            }
            c2bc.Dv9(this, c4c7, true);
        }
        C44991Jvh c44991Jvh = this.A03;
        if (c44991Jvh != null) {
            UserSession userSession = this.A05;
            synchronized (c44991Jvh) {
                if (!c44991Jvh.A04) {
                    String str = c44991Jvh.A01;
                    if (str == null) {
                        c44991Jvh.A03 = true;
                        c44991Jvh.A00 = userSession;
                    } else {
                        InterfaceC09390do interfaceC09390do = LKn.A05;
                        AbstractC46712KlV.A00(userSession).A05(str);
                    }
                }
            }
            C44991Jvh.A00(c44991Jvh);
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        android.net.Uri uri;
        C4C7 c4c7 = this.A01;
        if (c4c7 == null || (uri = c4c7.A06) == null) {
            return android.net.Uri.EMPTY;
        }
        return uri;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        int i3 = i2;
        C14360o3.A0B(bArr, 0);
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            C44991Jvh c44991Jvh = this.A03;
            if (c44991Jvh != null) {
                synchronized (c44991Jvh) {
                    z = c44991Jvh.A02;
                }
                if (z) {
                    throw new C93214Fx(A00(), "DataSource is already closed", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
                }
            }
            int i4 = this.A00;
            if (i4 != -1) {
                if (i4 > i3) {
                    i4 = i3;
                }
                i3 = i4;
            }
            try {
                int read = inputStream.read(bArr, i, i3);
                int i5 = this.A00;
                if (i5 != -1) {
                    this.A00 = i5 - read;
                }
                C2BC c2bc = this.A02;
                if (c2bc != null) {
                    C4C7 c4c7 = this.A01;
                    C4C7 c4c72 = C4C7.A0B;
                    if (c4c7 == null) {
                        c4c7 = C4C7.A0B;
                    }
                    c2bc.D15(this, c4c7, read, true);
                }
                if (this.A00 > 0 && read == -1) {
                    throw MSW.A0y("InputSteam unexpectedly closed");
                }
                return read;
            } catch (IOException unused) {
                close();
                throw new C93214Fx(A00(), "Failed to read bytes", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
            }
        }
        Map emptyMap = Collections.emptyMap();
        android.net.Uri parse = android.net.Uri.parse("");
        C4B8.A02(parse);
        C4C7 c4c73 = C4C7.A0B;
        throw new C93214Fx(new C4C7(parse, new C4C6(), null, emptyMap, null, 1, 0, 0L, 0L, -1L), "DataSource is not opened", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
    }

    public T4X(UserSession userSession) {
        this.A05 = userSession;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        this.A02 = c2bc;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
