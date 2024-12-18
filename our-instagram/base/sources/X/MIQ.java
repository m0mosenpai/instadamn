package X;

import android.app.Activity;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIQ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ KPU A03;
    public final /* synthetic */ C47314KvP A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIQ(Activity activity, C41761wQ c41761wQ, KPU kpu, C47314KvP c47314KvP, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        super(1);
        this.A05 = interfaceC16660sJ;
        this.A04 = c47314KvP;
        this.A00 = i;
        this.A01 = activity;
        this.A06 = z;
        this.A02 = c41761wQ;
        this.A03 = kpu;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof C45795KPa) {
            this.A05.invoke(obj);
        } else {
            C47314KvP c47314KvP = this.A04;
            int i = this.A00 + 1;
            Activity activity = this.A01;
            boolean z = this.A06;
            C41761wQ c41761wQ = this.A02;
            KPU kpu = this.A03;
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            List list = c47314KvP.A00;
            if (i >= list.size()) {
                interfaceC16660sJ.invoke(obj);
            } else {
                ((InterfaceC50454MPi) list.get(i)).E4E(activity, c41761wQ, kpu, new MIQ(activity, c41761wQ, kpu, c47314KvP, interfaceC16660sJ, i, z), z);
            }
        }
        return C0eB.A00;
    }
}
