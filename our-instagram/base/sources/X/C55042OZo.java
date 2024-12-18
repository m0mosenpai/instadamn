package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.common.IGTVUploadProgress;

/* renamed from: X.OZo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55042OZo {
    public int A00;
    public IGTVUploadProgress A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final UserSession A05;
    public final OAK A06;
    public final NX0 A07;
    public final NX0 A08;
    public final String A09;
    public final InterfaceC09390do A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C55042OZo(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, OAK oak, String str) {
        InterfaceC57827Pkt interfaceC57827Pkt = C56437P3y.A00;
        if (bundle != null) {
            C54546O7y c54546O7y = new C54546O7y();
            int i = bundle.getInt("uploadnavigator.extra.saved_current_state");
            if (i != 0) {
                interfaceC57827Pkt = (InterfaceC57827Pkt) AbstractC166997dE.A0m(c54546O7y.A00, i);
                if (interfaceC57827Pkt == null) {
                    throw AbstractC31175DnJ.A0U("Navigation state not found for index: ", i);
                }
            } else {
                throw AbstractC166987dD.A14("Navigation state index not found in restore bundle");
            }
        }
        NX0 nx0 = new NX0(interfaceC57827Pkt);
        NN0 nn0 = NN0.A00;
        C56423P3k c56423P3k = C56423P3k.A00;
        nx0.A08(c56423P3k, nn0);
        C52553NMz c52553NMz = C52553NMz.A00;
        C56415P3c c56415P3c = C56415P3c.A00;
        nx0.A08(c56415P3c, c52553NMz);
        NN1 nn1 = NN1.A00;
        C56416P3d c56416P3d = C56416P3d.A00;
        nx0.A08(c56416P3d, nn1);
        NN2 nn2 = NN2.A00;
        C56419P3g c56419P3g = C56419P3g.A00;
        nx0.A08(c56419P3g, nn2);
        NN3 nn3 = NN3.A00;
        C56424P3l c56424P3l = C56424P3l.A00;
        nx0.A08(c56424P3l, nn3);
        C52542NMo c52542NMo = C52542NMo.A00;
        C52528NMa c52528NMa = C52528NMa.A00;
        nx0.A06(c56423P3k, c56415P3c, c52542NMo, c52528NMa);
        nx0.A06(c56415P3c, c56424P3l, c52542NMo, c52528NMa);
        C52539NMl c52539NMl = C52539NMl.A00;
        C56425P3m c56425P3m = C56425P3m.A00;
        AbstractC54034Nuk.A00(nx0, c56424P3l, c56425P3m, c52539NMl, false);
        AbstractC54034Nuk.A00(nx0, c56424P3l, c56416P3d, C52543NMp.A00, false);
        C56435P3w c56435P3w = C56435P3w.A00;
        AbstractC54034Nuk.A00(nx0, c56435P3w, C56434P3v.A00, C52536NMi.A00, true);
        AbstractC54034Nuk.A00(nx0, c56424P3l, c56435P3w, C52545NMr.A00, true);
        AbstractC54034Nuk.A00(nx0, c56424P3l, c56419P3g, C52546NMs.A00, false);
        AbstractC54034Nuk.A00(nx0, c56425P3m, C56420P3h.A00, C52538NMk.A00, false);
        AbstractC54034Nuk.A00(nx0, c56425P3m, C56417P3e.A00, C52537NMj.A00, false);
        AbstractC54034Nuk.A00(nx0, c56425P3m, C56438P3z.A00, C52529NMb.A00, false);
        nx0.A05(c56424P3l, C56428P3p.A00, C52551NMx.class);
        nx0.A05(c56424P3l, C56429P3q.A00, AbstractC52547NMt.class);
        nx0.A05(c56424P3l, C56427P3o.A00, C52552NMy.class);
        nx0.A05(c56425P3m, C56426P3n.A00, C52548NMu.class);
        nx0.A05(c56424P3l, C56430P3r.A00, C52549NMv.class);
        nx0.A05(c56424P3l, C56431P3s.A00, C52550NMw.class);
        C52540NMm c52540NMm = C52540NMm.A00;
        C56418P3f c56418P3f = C56418P3f.A00;
        AbstractC54034Nuk.A00(nx0, c56424P3l, c56418P3f, c52540NMm, false);
        AbstractC54034Nuk.A00(nx0, c56424P3l, C56432P3t.A00, C52541NMn.A00, false);
        C52544NMq c52544NMq = C52544NMq.A00;
        C56422P3j c56422P3j = C56422P3j.A00;
        nx0.A06(c56416P3d, c56422P3j, c52544NMq, c52528NMa);
        NN7 nn7 = NN7.A00;
        C14360o3.A0B(nn7, 1);
        Class<?> cls = nn7.getClass();
        nx0.A03(cls, c56422P3j, c56422P3j);
        C56421P3i c56421P3i = C56421P3i.A00;
        nx0.A06(c56418P3f, c56421P3i, c52544NMq, c52528NMa);
        nx0.A03(cls, c56421P3i, c56421P3i);
        nx0.A06(c56419P3g, c56422P3j, c52544NMq, c52528NMa);
        nx0.A03(cls, c56422P3j, c56422P3j);
        nx0.A07(c56415P3c, C52535NMh.A00);
        nx0.A07(c56415P3c, C52531NMd.A00);
        nx0.A07(c56424P3l, C52533NMf.A00);
        nx0.A07(c56424P3l, C52534NMg.A00);
        nx0.A07(c56424P3l, C52530NMc.A00);
        nx0.A07(c56424P3l, C52532NMe.A00);
        int i2 = 3;
        C14360o3.A0B(str, 5);
        this.A07 = nx0;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        nx0.A02(new C56743PGl(this, 1));
        this.A05 = userSession;
        this.A06 = oak;
        this.A09 = str;
        this.A08 = nx0;
        this.A0A = C1XM.A00(C57538PgC.A01(this, 13));
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.A01 = new IGTVUploadProgress(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2);
        if (bundle != null) {
            C54546O7y c54546O7y2 = new C54546O7y();
            int i3 = bundle.getInt("uploadnavigator.extra.saved_start_state");
            if (i3 != 0) {
                InterfaceC57827Pkt interfaceC57827Pkt2 = (InterfaceC57827Pkt) AbstractC166997dE.A0m(c54546O7y2.A00, i3);
                if (interfaceC57827Pkt2 != null) {
                    nx0.A00 = interfaceC57827Pkt2;
                    this.A00 = bundle.getInt("uploadnavigator.extra.num_system_save");
                    IGTVUploadProgress iGTVUploadProgress = (IGTVUploadProgress) bundle.getParcelable("uploadnavigator.extra.upload_flow_progress");
                    this.A01 = iGTVUploadProgress == null ? new IGTVUploadProgress(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i2) : iGTVUploadProgress;
                    this.A0A.getValue();
                    C14360o3.A07(((C1810281e) this.A07).A00.first);
                    return;
                }
                throw AbstractC31175DnJ.A0U("Navigation state not found for index: ", i3);
            }
            throw AbstractC166987dD.A14("Navigation state index not found in restore bundle");
        }
    }

    public static final void A01(InterfaceC57827Pkt interfaceC57827Pkt, Object obj) {
        if (interfaceC57827Pkt instanceof InterfaceC57951Pmx) {
            C14360o3.A0C(((InterfaceC57951Pmx) interfaceC57827Pkt).B8N(obj), AbstractC111324zv.A00(7));
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NavigationState with action: ");
        A1C.append(obj);
        throw AbstractC43594JPz.A0o(interfaceC57827Pkt, " is not a FragmentDestination: ", A1C);
    }

    public static final void A00(FragmentActivity fragmentActivity, C55042OZo c55042OZo, IGTVUploadProgress iGTVUploadProgress, int i) {
        Intent intent = fragmentActivity.getIntent();
        if (intent != null && intent.getIntExtra("uploadflow.extra.upload_request_code", -1) >= 0) {
            Intent A04 = AbstractC31171DnF.A04();
            A04.putExtra("igtvplugin.extra.composer_session_id", c55042OZo.A09);
            A04.putExtra("igtvplugin.extra.upload_progress", iGTVUploadProgress);
            fragmentActivity.setResult(i, A04);
        }
    }
}
