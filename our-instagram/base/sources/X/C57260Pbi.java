package X;

import android.os.Parcel;
import android.widget.ImageView;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;

/* renamed from: X.Pbi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57260Pbi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57260Pbi(Object obj, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass693 anonymousClass693;
        switch (this.A00) {
            case 2:
                int i = this.A01;
                NTX ntx = (NTX) this.A02;
                if (i > 1) {
                    C50641MXd c50641MXd = ntx.A04;
                    if (c50641MXd != null) {
                        long j = ntx.A05.A02;
                        int A00 = NTX.A00(ntx, i - 1);
                        ImageView A0C = MSW.A0C(ntx.A0H);
                        AnonymousClass693 anonymousClass6932 = (AnonymousClass693) ntx.A0K.getValue();
                        C56253Oy0 c56253Oy0 = new C56253Oy0(ntx, i, this.A03);
                        if (anonymousClass6932 != null) {
                            anonymousClass693 = anonymousClass6932;
                        } else {
                            anonymousClass693 = c50641MXd.A0D;
                        }
                        c50641MXd.A05 = anonymousClass6932;
                        C50641MXd.A00(A0C, anonymousClass693, c56253Oy0, c50641MXd, C05F.A01, Integer.valueOf(A00), j, true, true);
                        break;
                    }
                } else {
                    NTX.A03(ntx, i - 1, this.A03);
                    break;
                }
                break;
            case 3:
                C37556GgC c37556GgC = (C37556GgC) this.A02;
                c37556GgC.A05 = null;
                C37556GgC.A02(c37556GgC, this.A01, this.A03);
                break;
            default:
                IMqttPublishListener iMqttPublishListener = (IMqttPublishListener) this.A02;
                if (iMqttPublishListener != null) {
                    int i2 = this.A01;
                    boolean z = this.A03;
                    IMqttPublishListener.Stub.Proxy proxy = (IMqttPublishListener.Stub.Proxy) iMqttPublishListener;
                    int A03 = C0f9.A03(-1247145901);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.facebook.mqtt.service.ipc.IMqttPublishListener");
                        obtain.writeInt(i2);
                        obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
                        proxy.A00.transact(3, obtain, null, 1);
                        obtain.recycle();
                        C0f9.A0A(-547534307, A03);
                        break;
                    } catch (Throwable th) {
                        obtain.recycle();
                        C0f9.A0A(468553876, A03);
                        throw th;
                    }
                }
                break;
        }
        return C0eB.A00;
    }
}
