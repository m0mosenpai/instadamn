package X;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24181Gn implements C1G4 {
    public final C1C2 A00;
    public final C24191Go A01 = new C19Q() { // from class: X.1Go
        public final Map A00;

        @Override // X.C19Q, X.C19O
        public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
            int i;
            C14360o3.A0B(c1qw, 0);
            C14360o3.A0B(byteBuffer, 2);
            Map map = this.A00;
            Number number = (Number) map.get(c1qw);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            map.put(c1qw, Integer.valueOf(i + byteBuffer.remaining()));
        }

        @Override // X.C19Q, X.C19O
        public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
            int i;
            C14360o3.A0B(c1qw, 0);
            C14360o3.A0B(c1qy, 1);
            C1C2 c1c2 = C24181Gn.this.A00;
            EnumC23341Bw enumC23341Bw = c1qy.A09;
            C1Ef A00 = c1qy.A00();
            C14360o3.A07(A00);
            Map map = this.A00;
            Number number = (Number) map.get(c1qw);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            c1c2.A00(A00, enumC23341Bw, 1, i);
            map.remove(c1qw);
        }

        {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            C14360o3.A07(synchronizedMap);
            this.A00 = synchronizedMap;
        }
    };
    public final C1G4 A02;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C1C2 c1c2;
        EnumC23341Bw enumC23341Bw;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        if (interfaceC26421Px != null) {
            long contentLength = interfaceC26421Px.getContentLength();
            if (contentLength > 20480) {
                String path = c1qw.A09.getPath();
                if (C14360o3.A0K(path, "/api/v1/upload/photo/")) {
                    c1c2 = this.A00;
                    enumC23341Bw = EnumC23341Bw.Image;
                } else if (path != null && AbstractC001900j.A0a(path, "/rupload_igvideo/", false)) {
                    c1c2 = this.A00;
                    enumC23341Bw = EnumC23341Bw.Video;
                }
                C1Ef A00 = c1qy.A00();
                C14360o3.A07(A00);
                c1c2.A00(A00, enumC23341Bw, 0, contentLength);
            }
        }
        c26511Qg.A01(this.A01);
        InterfaceC27191Tt startRequest = this.A02.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Go] */
    public C24181Gn(C1C2 c1c2, C1G4 c1g4) {
        this.A00 = c1c2;
        this.A02 = c1g4;
    }
}
