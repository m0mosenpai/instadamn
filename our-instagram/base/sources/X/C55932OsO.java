package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;

/* renamed from: X.OsO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55932OsO implements InterfaceC26491Qe {
    public long A00;
    public C3JY A01;
    public ByteArrayOutputStream A02;
    public final C2JL A03;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        ByteArrayOutputStream byteArrayOutputStream = this.A02;
        if (byteArrayOutputStream != null) {
            AbstractC50522MSa.A1X(byteArrayOutputStream, byteBuffer);
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        long j;
        C14360o3.A0B(c3jq, 0);
        C23781El A00 = c3jq.A00("Content-Length");
        if (A00 != null) {
            try {
                String str = A00.A01;
                C14360o3.A06(str);
                Long A0j = AbstractC166997dE.A0j(str);
                if (A0j != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                this.A00 = j;
            } catch (NumberFormatException unused) {
            }
        }
        this.A02 = new ByteArrayOutputStream();
        int i = c3jq.A01;
        this.A01 = new C3JY(c3jq.A02, Collections.unmodifiableList(c3jq.A03), i, c3jq.A00);
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        C3JY c3jy = this.A01;
        ByteArrayOutputStream byteArrayOutputStream = this.A02;
        if (c3jy != null && byteArrayOutputStream != null) {
            c3jy.A00 = new C126385nZ(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), this.A00);
            this.A03.onSuccess(C56151OwH.A00(c3jy));
        } else {
            this.A03.onFailure(MSW.A0y("Failed to get response"));
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        this.A03.onFailure(MSW.A0y("Failed to get response"));
    }

    public C55932OsO(C2JL c2jl) {
        this.A03 = c2jl;
    }
}
