package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.nux.data.MetaAINuxRepository;

/* renamed from: X.BcZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25874BcZ extends AbstractC52922bZ {
    public boolean A00;
    public final Application A01;
    public final FoaUserSession A02;
    public final C28274CdJ A03;
    public final C28172CbJ A04;
    public final CVW A05;
    public final MetaAINuxRepository A06;
    public final EnumC27387C6q A07;
    public final String A08;
    public final C05A A09;
    public final C0UO A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public /* synthetic */ C25874BcZ(Application application, FoaUserSession foaUserSession, C28274CdJ c28274CdJ, CVW cvw, EnumC27387C6q enumC27387C6q, String str, boolean z, boolean z2, boolean z3) {
        C28172CbJ c28172CbJ = new C28172CbJ(foaUserSession, cvw);
        MetaAINuxRepository metaAINuxRepository = new MetaAINuxRepository(application, foaUserSession);
        this.A01 = application;
        this.A02 = foaUserSession;
        this.A07 = enumC27387C6q;
        this.A08 = str;
        this.A05 = cvw;
        this.A03 = c28274CdJ;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A04 = c28172CbJ;
        this.A06 = metaAINuxRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C28256Cd1(C27335C4q.A00));
        this.A09 = A1H;
        this.A0A = A1H;
        this.A00 = true;
    }

    public static final C8f A00(C25874BcZ c25874BcZ) {
        int ordinal = c25874BcZ.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 3) {
                if (ordinal != 1 && ordinal != 2) {
                    throw B4Z.A00();
                }
                return C8f.WRITE;
            }
            return C8f.EDIT;
        }
        return C8f.CREATE;
    }

    public static final EnumC72434Xde A01(C25874BcZ c25874BcZ) {
        int ordinal = c25874BcZ.A07.ordinal();
        if (ordinal != 0 && ordinal != 3) {
            if (ordinal != 1 && ordinal != 2) {
                throw B4Z.A00();
            }
            return AbstractC72654Xjw.A00(AbstractC28338CeQ.A00(c25874BcZ.A08));
        }
        return AbstractC72653Xjv.A00(EnumC53326Ni5.valueOf(c25874BcZ.A08));
    }

    public static final void A02(C25874BcZ c25874BcZ) {
        C28172CbJ c28172CbJ = c25874BcZ.A04;
        EnumC72434Xde A01 = A01(c25874BcZ);
        C8f A00 = A00(c25874BcZ);
        AbstractC167017dG.A1O(A01, A00);
        C28172CbJ.A00(A00, A01, c28172CbJ, "meta_ai_nux_impression", null);
        C05A c05a = c25874BcZ.A09;
        c05a.getValue();
        c05a.Egh(new C28256Cd1(C27334C4p.A00));
    }

    public final void A03() {
        C28172CbJ c28172CbJ = this.A04;
        EnumC72434Xde A01 = A01(this);
        C8f A00 = A00(this);
        AbstractC167017dG.A1O(A01, A00);
        C28172CbJ.A00(A00, A01, c28172CbJ, "meta_ai_nux_not_now_clicked", null);
        C05A c05a = this.A09;
        c05a.getValue();
        c05a.Egh(new C28256Cd1(C27336C4r.A00));
        this.A00 = false;
    }

    public final void A04() {
        C141796aw A00;
        int i;
        MetaAINuxRepository metaAINuxRepository = this.A06;
        String obj = this.A07.toString();
        C14360o3.A0B(obj, 0);
        if (metaAINuxRepository.A00.getSharedPreferences("MetaAINuxImpressionCache", 0).getBoolean(obj, false)) {
            C05A c05a = this.A09;
            c05a.getValue();
            c05a.Egh(new C28256Cd1(new C27337C4s(false)));
            return;
        }
        if (this.A0C) {
            A00 = AbstractC141776au.A00(this);
            i = 27;
        } else {
            A02(this);
            A00 = AbstractC141776au.A00(this);
            i = 28;
        }
        D51.A02(this, A00, i);
    }

    public final void A05(boolean z) {
        if (z) {
            C28172CbJ c28172CbJ = this.A04;
            EnumC72434Xde A01 = A01(this);
            C8f A00 = A00(this);
            AbstractC167017dG.A1O(A01, A00);
            C28172CbJ.A00(A00, A01, c28172CbJ, "meta_ai_nux_action", null);
        }
        C05A c05a = this.A09;
        c05a.getValue();
        c05a.Egh(new C28256Cd1(new C27337C4s(z)));
    }
}
