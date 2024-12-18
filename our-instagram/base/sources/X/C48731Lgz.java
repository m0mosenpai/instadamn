package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lgz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48731Lgz implements InterfaceC50474MQc {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final GiphyRequestSurface A02;
    public final List A03;
    public final boolean A04;

    @Override // X.InterfaceC50474MQc
    public final /* bridge */ /* synthetic */ String E3X(C40781ul c40781ul) {
        C46496Khv c46496Khv;
        K8R k8r = (K8R) c40781ul;
        C14360o3.A0B(k8r, 0);
        C46499Khy c46499Khy = k8r.A00;
        if (c46499Khy != null && (c46496Khv = c46499Khy.A01) != null) {
            return c46496Khv.A00;
        }
        return null;
    }

    @Override // X.InterfaceC50474MQc
    public final /* bridge */ /* synthetic */ List E3Y(C40781ul c40781ul, EnumC46201Kcd enumC46201Kcd, String str) {
        List A12;
        K8R k8r = (K8R) c40781ul;
        C14360o3.A0B(enumC46201Kcd, 0);
        C14360o3.A0B(k8r, 1);
        boolean z = true;
        if (enumC46201Kcd.ordinal() != 2) {
            A12 = AbstractC43594JPz.A12(k8r.A01.A05);
        } else {
            A12 = AbstractC43594JPz.A12(k8r.A01.A04);
        }
        if (A12 == null) {
            return C16930sl.A00;
        }
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(AbstractC167007dF.A1X(enumC46201Kcd, EnumC46201Kcd.GIPHY_STICKERS));
        if (str.length() != 0) {
            z = false;
        }
        ArrayList A01 = LHG.A01(userSession, valueOf, A12, z);
        if (this.A00 == null) {
            return A01;
        }
        A12.size();
        A01.size();
        return A01;
    }

    public C48731Lgz(GiphyRequestSurface giphyRequestSurface, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, boolean z) {
        this.A03 = list;
        this.A02 = giphyRequestSurface;
        this.A01 = userSession;
        this.A04 = z;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC50474MQc
    public final C1ON AEh(C1OL c1ol, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(this.A03);
        if (this.A04 && str.length() == 0) {
            A1E.add(EnumC46201Kcd.CUTOUT_STICKERS);
        }
        return AbstractC47110Ks5.A00(this.A02, this.A01, str, A1E);
    }
}
