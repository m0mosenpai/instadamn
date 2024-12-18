package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.J4r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43128J4r implements Runnable {
    public final /* synthetic */ C38934HCh A00;
    public final /* synthetic */ HKJ A01;

    public RunnableC43128J4r(C38934HCh c38934HCh, HKJ hkj) {
        this.A00 = c38934HCh;
        this.A01 = hkj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C38934HCh c38934HCh = this.A00;
        if (c38934HCh.mView != null) {
            String str2 = this.A01.A02;
            C14360o3.A0A(str2);
            C38321qM A0F = AbstractC37304Gc5.A0F(str2, c38934HCh.A0M);
            if (A0F != null) {
                C65823Tug c65823Tug = c38934HCh.A03;
                if (c65823Tug == null) {
                    str = "grid";
                } else {
                    DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
                    if (discoveryRecyclerView != null) {
                        C38086GpF c38086GpF = c38934HCh.A04;
                        if (c38086GpF == null) {
                            str = "dataSource";
                        } else {
                            AbstractC127945qN A04 = c38086GpF.A01.A04(A0F);
                            if (A04 != null) {
                                C66095TzW c66095TzW = c38934HCh.A02;
                                if (c66095TzW == null) {
                                    str = "adapter";
                                } else {
                                    int AVT = c66095TzW.AVT(A04);
                                    if (AVT != -1) {
                                        discoveryRecyclerView.A0o(AVT);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }
}
