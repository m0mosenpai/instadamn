package X;

import android.os.Parcel;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

/* loaded from: classes5.dex */
public final class D8e extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8e(Object obj, Object obj2, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy = (IMqttSubscribeListener$Stub$Proxy) this.A02;
                String str = this.A04;
                byte[] bArr = (byte[]) this.A03;
                long j = this.A01;
                int A03 = C0f9.A03(-1445684537);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractC58317Pt9.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeLong(j);
                    iMqttSubscribeListener$Stub$Proxy.A00.transact(1, obtain, null, 1);
                    obtain.recycle();
                    C0f9.A0A(-1106763697, A03);
                    return C0eB.A00;
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(-442580223, A03);
                    throw th;
                }
            case 1:
                CRF crf = (CRF) this.A02;
                String str2 = this.A04;
                AnonymousClass956 anonymousClass956 = crf.A01;
                String A00 = AbstractC111324zv.A00(3326);
                String str3 = crf.A02;
                int i = crf.A00;
                String A0V = AnonymousClass001.A0V(A00, str3, '_', i);
                C14360o3.A0B(A0V, 0);
                InterfaceC19630xq interfaceC19630xq = ((AnonymousClass955) anonymousClass956).A00;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7K(A0V, str2);
                ARD.apply();
                long j2 = this.A01;
                String A0V2 = AnonymousClass001.A0V(AbstractC111324zv.A00(3327), str3, '_', i);
                C14360o3.A0B(A0V2, 0);
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G(A0V2, j2);
                ARD2.apply();
                ((AnonymousClass954) this.A03).A00.markerEnd(966997352, (short) 2);
                return C0eB.A00;
            case 2:
                C45123Jxs c45123Jxs = ((C6HI) ((InterfaceC132245y2) this.A03)).A00;
                String str4 = c45123Jxs.A03;
                ((InterfaceC132365yF) this.A02).CrX(C2Fb.A2r, str4, this.A04, c45123Jxs.A05, this.A01);
                return C0eB.A00;
            default:
                C45123Jxs c45123Jxs2 = ((C26024BfD) this.A03).A00;
                if (c45123Jxs2 != null) {
                    InterfaceC132365yF interfaceC132365yF = (InterfaceC132365yF) this.A02;
                    String str5 = this.A04;
                    long j3 = this.A01;
                    interfaceC132365yF.CrX(C2Fb.A2r, c45123Jxs2.A03, str5, c45123Jxs2.A05, j3);
                }
                return C0eB.A00;
        }
    }
}
