package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Uy6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67781Uy6 extends AbstractC200978ue {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C69405Vmp A01;
    public final /* synthetic */ C62688SMc A02;
    public final /* synthetic */ C69518Vqh A03;
    public final /* synthetic */ AbstractC95374Qx A04;
    public final /* synthetic */ Executor A05;

    public C67781Uy6(C69405Vmp c69405Vmp, C62688SMc c62688SMc, C69518Vqh c69518Vqh, AbstractC95374Qx abstractC95374Qx, Executor executor, long j) {
        this.A01 = c69405Vmp;
        this.A02 = c62688SMc;
        this.A03 = c69518Vqh;
        this.A04 = abstractC95374Qx;
        this.A00 = j;
        this.A05 = executor;
    }

    @Override // X.AbstractC200978ue
    public final /* bridge */ /* synthetic */ ListenableFuture A00(Object obj, Object obj2) {
        String A0Q = AbstractC167027dH.A0Q(obj);
        MA2 ma2 = new MA2(new TUY(this.A01, this.A04, this.A02, this.A03, A0Q, 1));
        this.A05.execute(ma2);
        return ma2;
    }

    @Override // X.AbstractC200978ue
    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        Object remove;
        String A0Q = AbstractC167027dH.A0Q(obj);
        C69405Vmp c69405Vmp = this.A01;
        Map map = c69405Vmp.A06;
        synchronized (map) {
            remove = map.remove(A0Q);
        }
        C68913VeD c68913VeD = (C68913VeD) remove;
        if (c68913VeD != null) {
            long j = this.A00;
            AbstractC95374Qx abstractC95374Qx = this.A04;
            long j2 = c68913VeD.A00;
            if (j2 + j < abstractC95374Qx.A00()) {
                ArrayList arrayList = c69405Vmp.A05;
                synchronized (arrayList) {
                    arrayList.add(A0Q);
                }
            }
            synchronized (c69405Vmp.A04) {
                c69405Vmp.A01 = C05F.A0u;
            }
            c69405Vmp.A00 = j2;
            return c68913VeD.A01;
        }
        C62688SMc c62688SMc = this.A02;
        ArrayList A00 = c62688SMc.A00(A0Q);
        synchronized (c69405Vmp.A04) {
            c69405Vmp.A01 = c62688SMc.A00;
        }
        this.A03.A00(A0Q, AbstractC61789Rtj.A00(this.A04.A00(), A00));
        return A00;
    }
}
