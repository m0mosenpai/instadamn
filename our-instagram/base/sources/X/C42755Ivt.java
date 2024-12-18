package X;

import android.content.Context;
import android.widget.ListView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.List;

/* renamed from: X.Ivt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42755Ivt implements InterfaceC154766xR {
    public final /* synthetic */ HD7 A00;

    @Override // X.InterfaceC154766xR
    public final void DRa(String str, Long l) {
    }

    public C42755Ivt(HD7 hd7) {
        this.A00 = hd7;
    }

    @Override // X.InterfaceC154766xR
    public final void DRX(AbstractC115105If abstractC115105If, EnumC125775mS enumC125775mS) {
        HD7 hd7 = this.A00;
        C9GR.A0F(hd7.getActivity(), "could_not_refresh_feed", 2131956848);
        HD7.A01(hd7);
    }

    @Override // X.InterfaceC154766xR
    public final void DRZ(EnumC125775mS enumC125775mS) {
        ListView A02 = AbstractC37300Gc1.A02(this.A00);
        C14360o3.A0C(A02, MSV.A00(16));
        ((RefreshableListView) A02).setIsLoading(false);
    }

    @Override // X.InterfaceC154766xR
    public final void DRc(EnumC125775mS enumC125775mS, boolean z, boolean z2, boolean z3) {
        HD7 hd7 = this.A00;
        if (hd7.A0W() != null) {
            RefreshableListView refreshableListView = (RefreshableListView) hd7.A0W();
            if (refreshableListView != null) {
                refreshableListView.setIsLoading(true);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        HD7.A01(hd7);
    }

    @Override // X.InterfaceC154766xR
    public final void DRd(Context context, C51758Mth c51758Mth, C123645id c123645id, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        HD7 hd7 = this.A00;
        HD7.A01(hd7);
        String str = "adapter";
        if (z) {
            HEO heo = hd7.A01;
            if (heo != null) {
                heo.A04.A04();
                heo.A0C();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        HEO heo2 = hd7.A01;
        if (heo2 != null) {
            List list = c123645id.A06;
            C14360o3.A07(list);
            heo2.A04.A0B(list);
            heo2.A0C();
            C3CO c3co = hd7.A02;
            if (c3co == null) {
                str = "mediaUpdateListener";
            } else {
                c3co.A00();
                HEO heo3 = hd7.A01;
                if (heo3 != null) {
                    C0fA.A00(heo3, 1840167460);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
