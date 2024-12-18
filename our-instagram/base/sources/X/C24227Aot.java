package X;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Aot, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24227Aot implements BE4, BCU {
    public ABJ A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final Bundle A02;
    public final EnumC150506pz A03;

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        BBX bbx;
        C14360o3.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType") && bundle.getInt("commandType") == 2 && bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
            int i = bundle.getInt("messageType");
            byte[] byteArray = bundle.getByteArray("buffer");
            if (byteArray != null) {
                AG3 A00 = AG3.A00(byteArray, i);
                ABJ abj = this.A00;
                if (abj != null && (bbx = abj.A02) != null) {
                    bbx.APH(A00);
                }
            }
        }
    }

    public static void A00(Bundle bundle, C24227Aot c24227Aot, ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() > 256000) {
            C0K8.A0C("ServiceMessageChannelHost", "Service message exceeding buffer max size, skipping!");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        bundle.putByteArray("buffer", bArr);
        c24227Aot.A01.add(bundle);
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return this.A02;
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        Map unmodifiableMap;
        C22859A6c c22859A6c;
        if (anonymousClass904 != null && (unmodifiableMap = Collections.unmodifiableMap(anonymousClass904.A00)) != null && (c22859A6c = (C22859A6c) unmodifiableMap.get(this.A03)) != null) {
            ABJ abj = c22859A6c.A01;
            this.A00 = abj;
            abj.A01 = this;
            AG3 ag3 = abj.A00;
            if (ag3 != null) {
                int i = ag3.A00;
                ByteBuffer byteBuffer = ag3.A01;
                setConfiguration(i, byteBuffer, byteBuffer.position());
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A01;
        ArrayList A0U = AbstractC001800i.A0U(list);
        if (A0U.isEmpty()) {
            A0U.add(AbstractC167027dH.A08(this.A03.ordinal()));
        }
        list.clear();
        return A0U;
    }

    @Override // X.BCU
    public final void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2) {
        A00(AbstractC167027dH.A09("offset", Integer.valueOf(i2), AbstractC167007dF.A0o("serviceType", this.A03.ordinal()), AbstractC167027dH.A0Y(C05F.A01), AbstractC166987dD.A1L("messageType", Integer.valueOf(i))), this, byteBuffer);
    }

    @Override // X.BCU
    public final void setConfiguration(int i, ByteBuffer byteBuffer, int i2) {
        Bundle bundle = this.A02;
        bundle.clear();
        bundle.putInt("serviceType", this.A03.ordinal());
        bundle.putInt("commandType", 0);
        bundle.putInt("messageType", i);
        bundle.putInt("offset", i2);
        A00(bundle, this, byteBuffer);
    }

    public C24227Aot(EnumC150506pz enumC150506pz) {
        this.A03 = enumC150506pz;
        this.A02 = AbstractC167027dH.A08(enumC150506pz.ordinal());
    }
}
