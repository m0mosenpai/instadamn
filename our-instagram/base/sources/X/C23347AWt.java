package X;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AWt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23347AWt implements BBX, BCI {
    public final EnumC150506pz A00;
    public final ABJ A01;
    public final List A02;

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
                    int i2 = bundle.getInt("messageType");
                    byte[] byteArray = bundle.getByteArray("buffer");
                    if (byteArray != null) {
                        this.A01.A00(AG3.A00(byteArray, i2));
                    }
                }
            } else if (i == 1 && bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
                int i3 = bundle.getInt("messageType");
                byte[] byteArray2 = bundle.getByteArray("buffer");
                if (byteArray2 != null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray2.length);
                    allocateDirect.put(byteArray2);
                    allocateDirect.position(0);
                    BCU bcu = this.A01.A01;
                    if (bcu != null) {
                        bcu.didReceiveMessageFromPlatform(i3, allocateDirect, allocateDirect.position());
                    }
                }
            }
        }
        List list = this.A02;
        if (AbstractC166987dD.A1b(list)) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            list.clear();
            return A1F;
        }
        return null;
    }

    @Override // X.BBX
    public final void APH(AG3 ag3) {
        Bundle A09 = AbstractC167027dH.A09("offset", Integer.valueOf(ag3.A01.position()), AbstractC167007dF.A0o("serviceType", this.A00.ordinal()), AbstractC167027dH.A0Y(C05F.A0C), AbstractC166987dD.A1L("messageType", Integer.valueOf(ag3.A00)));
        ByteBuffer byteBuffer = ag3.A01;
        if (byteBuffer.capacity() > 256000) {
            C0K8.A0C("ServiceMessageChannelHost", "Service message exceeding buffer max size, skipping!");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        A09.putByteArray("buffer", bArr);
        this.A02.add(A09);
    }

    public C23347AWt(EnumC150506pz enumC150506pz, ABJ abj) {
        this.A00 = enumC150506pz;
        this.A01 = abj;
        abj.A02 = this;
        this.A02 = AbstractC166987dD.A1E();
    }
}
