package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hbb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39449Hbb extends C34722FRj {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C37171oF A02;

    public C39449Hbb(FragmentActivity fragmentActivity, UserSession userSession, C37171oF c37171oF) {
        this.A02 = c37171oF;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.C34722FRj
    public final void A01() {
        C006802i.A0p.markerPoint(387849633, "network_request_failed");
        C9GR.A0E(this.A00, AbstractC43591JPw.A00(198));
    }

    @Override // X.C34722FRj
    public final void A02() {
        C006802i.A0p.markerPoint(387849633, AbstractC111324zv.A00(1121));
    }

    @Override // X.C34722FRj
    public final void A04(Integer num) {
        C006802i.A0p.markerPoint(387849633, AbstractC111324zv.A00(1122));
    }
}
