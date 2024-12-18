package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.WvH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71512WvH implements Runnable {
    public final /* synthetic */ V7Y A00;
    public final /* synthetic */ V1R A01;

    public RunnableC71512WvH(V7Y v7y, V1R v1r) {
        this.A01 = v1r;
        this.A00 = v7y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V1R v1r = this.A01;
        if (v1r.mView != null) {
            C38321qM A0h = AbstractC25229BEm.A0h(V1R.A00(v1r), this.A00.A02);
            if (A0h != null) {
                C65823Tug c65823Tug = v1r.A07;
                String str = "grid";
                if (c65823Tug != null) {
                    if (c65823Tug.A04 != null) {
                        C68034V7f c68034V7f = v1r.A08;
                        if (c68034V7f == null) {
                            str = "dataSource";
                        } else {
                            AbstractC127945qN A04 = C68034V7f.A00(c68034V7f.A00, c68034V7f).A04(A0h);
                            if (A04 != null) {
                                C66095TzW c66095TzW = v1r.A06;
                                if (c66095TzW == null) {
                                    str = "adapter";
                                } else {
                                    int AVT = c66095TzW.AVT(A04);
                                    if (AVT != -1) {
                                        C65823Tug c65823Tug2 = v1r.A07;
                                        if (c65823Tug2 != null) {
                                            DiscoveryRecyclerView discoveryRecyclerView = c65823Tug2.A04;
                                            if (discoveryRecyclerView != null) {
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
