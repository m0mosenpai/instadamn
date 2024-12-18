package X;

import android.graphics.Rect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class MaU implements InterfaceC58288Psg {
    public FilterChain A00;
    public final InterfaceC197218ns A01;
    public final float A02;
    public final UserSession A03;
    public final C81N A04;
    public final AnonymousClass841 A05;
    public final C8Lw A06;
    public final boolean A07;

    public MaU(UserSession userSession, C81N c81n, AnonymousClass840 anonymousClass840, InterfaceC197218ns interfaceC197218ns) {
        float f;
        this.A03 = userSession;
        this.A01 = interfaceC197218ns;
        this.A04 = c81n;
        C8Lw c8Lw = new C8Lw(c81n);
        c8Lw.A00 = EnumC197888oz.A03;
        boolean z = true;
        c8Lw.A01 = true;
        this.A06 = c8Lw;
        AnonymousClass841 A00 = anonymousClass840.A00();
        this.A05 = A00;
        C5L6 ANZ = A00.ANZ();
        if (ANZ == C5L6.A0B) {
            CreationSession creationSession = ((MX5) A00).A01;
            if (creationSession.A00() == 0) {
                f = 1.0f;
            } else {
                int A01 = creationSession.A01();
                float A002 = creationSession.A00();
                float f2 = A01;
                if (A00.ATe() % 180 == 0) {
                    A002 = f2;
                    f2 = A002;
                }
                f = AbstractC54248NyT.A00(userSession, null, A002 / f2);
            }
        } else if (A00.CPp()) {
            f = A00.AB3();
        } else {
            f = ANZ.A00;
        }
        this.A02 = f;
        if (A00.CPp()) {
            if (A00.ATe() % 180 == 0 || !A00.ANZ().A03) {
                z = false;
            }
        } else {
            z = A00.ANZ().A03;
        }
        this.A07 = z;
        if (interfaceC197218ns.CVj()) {
            C56225OxY c56225OxY = new C56225OxY(this);
            c81n.A09 = c56225OxY;
            c56225OxY.DKG(c81n.A01);
        }
        if (c81n.A0B()) {
            CropInfo AtF = interfaceC197218ns.AtF();
            if (!A00.CPp() && AtF != null) {
                Rect rect = AtF.A02;
                f = rect.width() / rect.height();
            }
            c81n.A07(f);
        }
    }

    @Override // X.InterfaceC58288Psg
    public final void AP4() {
        this.A01.AP4();
    }

    @Override // X.InterfaceC58288Psg
    public final void AQ8(FilterGroupModel filterGroupModel) {
        FilterChain filterChain;
        this.A01.Efe(this.A04.A05(), this.A06, A0R.A00(filterGroupModel, "FeedOneCameraImageRenderControllerManager"));
        if (filterGroupModel != null) {
            filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
        } else {
            filterChain = null;
        }
        this.A00 = filterChain;
        EGV();
    }

    @Override // X.InterfaceC58288Psg
    public final void CO0(int i, int i2) {
        if (this.A04.A0B()) {
            this.A01.EaN(i, i2);
            return;
        }
        AnonymousClass841 anonymousClass841 = this.A05;
        if (anonymousClass841.ANZ() == C5L6.A0E) {
            EaN(i, i);
            return;
        }
        int ATe = anonymousClass841.ATe();
        CreationSession creationSession = ((MX5) anonymousClass841).A01;
        C3AY A08 = MX2.A08(this.A02, creationSession.A01(), creationSession.A00(), ATe, i, this.A07, false);
        Object obj = A08.A00;
        C14360o3.A06(obj);
        int A0H = AbstractC166987dD.A0H(obj);
        Object obj2 = A08.A01;
        C14360o3.A06(obj2);
        EaN(A0H, AbstractC166987dD.A0H(obj2));
    }

    @Override // X.C8MA
    public final void EGV() {
        FilterGroupModel filterGroupModel;
        InterfaceC197218ns interfaceC197218ns = this.A01;
        FilterChain filterChain = this.A00;
        if (filterChain == null) {
            PhotoSession A02 = ((MX5) this.A05).A01.A02();
            if (A02 != null && (filterGroupModel = A02.A07) != null) {
                filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            } else {
                filterChain = null;
            }
        }
        interfaceC197218ns.EUY(filterChain);
        interfaceC197218ns.EGV();
    }

    @Override // X.InterfaceC58288Psg
    public final void ESU(CropInfo cropInfo) {
        this.A01.ESU(cropInfo);
    }

    @Override // X.InterfaceC58288Psg
    public final void EaN(int i, int i2) {
        C81N c81n = this.A04;
        if (c81n.A0B()) {
            c81n.A07(i / i2);
        } else {
            this.A01.EaN(i, i2);
        }
    }

    @Override // X.InterfaceC58288Psg
    public final void Ee2() {
        this.A01.Ee2();
    }

    @Override // X.InterfaceC58288Psg
    public final void Efd(FilterGroupModel filterGroupModel) {
        this.A01.Efe(this.A04.A05(), this.A06, A0R.A00(filterGroupModel, "FeedOneCameraImageRenderControllerManager"));
    }
}
