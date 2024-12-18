package X;

import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

/* loaded from: classes5.dex */
public final class D8d extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8d(Object obj, String str, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            super/*X.1CN*/.CjT(this.A03, this.A01, this.A04);
        } else {
            IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy = (IMqttSubscribeListener$Stub$Proxy) this.A02;
            String str = this.A03;
            boolean z = this.A04;
            int i = this.A01;
            int A03 = C0f9.A03(862514194);
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(AbstractC58317Pt9.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
                obtain.writeString(str);
                obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
                obtain.writeInt(i);
                iMqttSubscribeListener$Stub$Proxy.A00.transact(2, obtain, null, 1);
                obtain.recycle();
                C0f9.A0A(2135198950, A03);
            } catch (Throwable th) {
                obtain.recycle();
                C0f9.A0A(-416007785, A03);
                throw th;
            }
        }
        return C0eB.A00;
    }
}
