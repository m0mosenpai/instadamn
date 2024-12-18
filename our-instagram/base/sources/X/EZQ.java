package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EZQ extends C3PD {
    public final int A00;
    public final Object A01;

    public EZQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final void DQY(View view) {
        switch (this.A00) {
            case 0:
            case 5:
            case 7:
                return;
            default:
                super.DQY(view);
                return;
        }
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        FFR ffr;
        C140626Xq c140626Xq;
        switch (this.A00) {
            case 0:
                C51377Mmc c51377Mmc = (C51377Mmc) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C56078Ouv c56078Ouv = c51377Mmc.A00;
                if (c56078Ouv != null) {
                    ArchiveReelPeopleFragment archiveReelPeopleFragment = c51377Mmc.A03;
                    if (!archiveReelPeopleFragment.A02) {
                        archiveReelPeopleFragment.A02 = true;
                        String id = c56078Ouv.A00.getId();
                        String A0R = AnonymousClass001.A0R("friend_archive_", id);
                        Reel A0M = ReelStore.A03(archiveReelPeopleFragment.getSession()).A0M(A0R);
                        if (A0M != null) {
                            ArchiveReelPeopleFragment.A01(archiveReelPeopleFragment, c51377Mmc, A0M);
                            archiveReelPeopleFragment.A02 = false;
                            return true;
                        }
                        c51377Mmc.A02.start();
                        c51377Mmc.A01.setVisibility(0);
                        c51377Mmc.A05.setVisibility(0);
                        UserSession session = archiveReelPeopleFragment.getSession();
                        C14360o3.A0B(session, 0);
                        C25621Ms A0M2 = AbstractC31177DnL.A0M(session);
                        AbstractC31173DnH.A1Q(A0M2, "archive/reel/friend_archive_media/%s/", new Object[]{id});
                        C1ON A0e = AbstractC25227BEk.A0e(A0M2, EBA.class, C34755FSu.class);
                        A0e.A00 = new C32531EUh(archiveReelPeopleFragment, c51377Mmc, A0R, 0);
                        archiveReelPeopleFragment.schedule(A0e);
                        return true;
                    }
                    return true;
                }
                return false;
            case 1:
                C32092E8q c32092E8q = (C32092E8q) this.A01;
                interfaceC16660sJ = c32092E8q.A01;
                obj = c32092E8q.A00;
                break;
            case 2:
                C32093E8r c32093E8r = (C32093E8r) this.A01;
                interfaceC16660sJ = c32093E8r.A01;
                obj = c32093E8r.A00;
                break;
            case 3:
                E2K e2k = (E2K) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                E8V e8v = e2k.A01;
                if (e8v != null && (ffr = e2k.A00) != null) {
                    String str = e8v.A00;
                    C14360o3.A0B(str, 0);
                    C32736Eb2 c32736Eb2 = ffr.A00;
                    c32736Eb2.A03().setText(str);
                    c32736Eb2.A03().setSelection(str.length());
                    return true;
                }
                return true;
            case 4:
                return false;
            case 5:
                C34644FOb c34644FOb = (C34644FOb) this.A01;
                String str2 = c34644FOb.A02;
                C34553FKn c34553FKn = c34644FOb.A00;
                if (c34553FKn != null && str2 != null) {
                    c34553FKn.A02.Ddq(c34553FKn.A01, str2, c34553FKn.A00);
                    return true;
                }
                return false;
            case 6:
                C14360o3.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    C45510KCz c45510KCz = (C45510KCz) this.A01;
                    InterfaceC09390do interfaceC09390do = c45510KCz.A0L;
                    KDS A00 = AbstractC46899Kog.A00(AbstractC166987dD.A0r(interfaceC09390do), null, null, AbstractC166987dD.A1E(), -2, 0, 0, 0, true, false);
                    C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
                    AbstractC25225BEi.A1Q(A0g, true);
                    A0g.A0T = new C49615Lw8(c45510KCz, 9);
                    C189478aR A002 = A0g.A00();
                    A00.A01 = new C36436G5l(view, A002, c45510KCz);
                    AbstractC31173DnH.A1G(c45510KCz, A00, A002);
                    C45510KCz.A03(c45510KCz).A05(false);
                    return true;
                }
                return false;
            case 7:
                GF6 gf6 = (GF6) this.A01;
                String str3 = gf6.A03;
                C34533FJt c34533FJt = gf6.A02;
                if (c34533FJt != null && str3 != null) {
                    ENQ enq = c34533FJt.A01;
                    GF6 gf62 = c34533FJt.A00;
                    InterfaceC09390do interfaceC09390do2 = enq.A07;
                    Reel A0M3 = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do2)).A0M(str3);
                    if (A0M3 != null) {
                        C140626Xq c140626Xq2 = enq.A01;
                        if (c140626Xq2 != null) {
                            c140626Xq2.A05(C05F.A0Y);
                        }
                        ArrayList A0z = AbstractC31174DnI.A0z(A0M3);
                        C38E c38e = enq.A00;
                        if (c38e == null) {
                            c38e = new C38E(enq, AbstractC166987dD.A0r(interfaceC09390do2), new C38C(enq));
                            enq.A00 = c38e;
                        }
                        c38e.A0C = enq.A06;
                        C31559Dtj.A00(enq.getRootActivity(), AbstractC13880nE.A0G(gf62.A0B), c38e, enq, 11);
                        c38e.A06(A0M3, ENQ.A08, gf62, null, A0z, A0z);
                        C38E c38e2 = enq.A00;
                        if (c38e2 != null) {
                            c140626Xq = c38e2.A07;
                        } else {
                            c140626Xq = null;
                        }
                        enq.A01 = c140626Xq;
                        gf62.A01 = c140626Xq;
                        return true;
                    }
                    return true;
                }
                return false;
            default:
                return super.DsE(view);
        }
        interfaceC16660sJ.invoke(obj);
        return true;
    }
}
