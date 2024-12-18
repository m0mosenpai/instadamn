package X;

import android.view.View;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.Wsl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71376Wsl implements Runnable {
    public final /* synthetic */ AbstractC67878V0j A00;

    public RunnableC71376Wsl(AbstractC67878V0j abstractC67878V0j) {
        this.A00 = abstractC67878V0j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        AbstractC67878V0j abstractC67878V0j = this.A00;
        if (abstractC67878V0j.mView != null) {
            String str = C51042Mgs.A01(abstractC67878V0j.A07()).A00;
            C51042Mgs A07 = abstractC67878V0j.A07();
            A07.A0C.A04(A07.A0F, A07.A0G, "");
            C38321qM A0h = AbstractC25229BEm.A0h(abstractC67878V0j.getSession(), str);
            if (A0h != null) {
                C65823Tug c65823Tug = abstractC67878V0j.A06;
                String str2 = "grid";
                if (c65823Tug != null) {
                    DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
                    if (discoveryRecyclerView != null) {
                        C68033V7e c68033V7e = abstractC67878V0j.A0F;
                        if (c68033V7e == null) {
                            str2 = "dataSource";
                        } else {
                            InterfaceC127975qQ A072 = c68033V7e.A07(A0h);
                            if (A072 != null) {
                                C65823Tug c65823Tug2 = abstractC67878V0j.A06;
                                if (c65823Tug2 != null) {
                                    int AVT = c65823Tug2.A0E.AVT(A072);
                                    if (AVT != -1) {
                                        int height = discoveryRecyclerView.getHeight() / 2;
                                        AbstractC70663Fe abstractC70663Fe = discoveryRecyclerView.A0D;
                                        if (abstractC70663Fe != null) {
                                            View A0d = abstractC70663Fe.A0d(AVT);
                                            if (A0d != null) {
                                                i = A0d.getHeight() / 2;
                                            } else {
                                                i = 0;
                                            }
                                            AbstractC72193Ls.A05(abstractC70663Fe, AVT, i - height);
                                            return;
                                        }
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
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
    }
}
