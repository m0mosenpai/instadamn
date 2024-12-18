package X;

import android.app.Application;
import androidx.lifecycle.CoroutineLiveData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.75E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75E extends C193578hc implements C75F {
    public long A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final C2GT A04;
    public final UserSession A05;
    public final ClipsDraftRepository A06;
    public final ClipsDraftPreviewItemRepository A07;
    public final ClipsNetworkImportDraftRepository A08;
    public final C49602Pt A09;
    public final C23031Ai A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final InterfaceC19390xP A0D;
    public final InterfaceC19390xP A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75E(Application application, UserSession userSession, ClipsDraftRepository clipsDraftRepository, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, C49602Pt c49602Pt, C23031Ai c23031Ai) {
        super(application);
        C14360o3.A0B(c23031Ai, 3);
        C14360o3.A0B(c49602Pt, 4);
        C14360o3.A0B(clipsDraftPreviewItemRepository, 5);
        C14360o3.A0B(clipsDraftRepository, 7);
        this.A05 = userSession;
        this.A0A = c23031Ai;
        this.A09 = c49602Pt;
        this.A07 = clipsDraftPreviewItemRepository;
        this.A08 = clipsNetworkImportDraftRepository;
        this.A06 = clipsDraftRepository;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A0B = c24721Ip;
        this.A0D = AbstractC07080Za.A03(c24721Ip);
        C43810JYx c43810JYx = new C43810JYx(clipsDraftPreviewItemRepository.A03);
        this.A0C = c43810JYx;
        C43811JYy c43811JYy = new C43811JYy(clipsNetworkImportDraftRepository.A0A);
        this.A0E = c43811JYy;
        InterfaceC19390xP mwo = new MWO(new InterfaceC19390xP[]{c43811JYy, c43810JYx});
        mwo = C18U.A06(C06090Tz.A06, userSession, 36328139060296927L) ? new JZI(mwo) : mwo;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        CoroutineLiveData A00 = AbstractC58232lf.A00(anonymousClass191, mwo);
        this.A01 = A00;
        C58252li A01 = C75M.A01(A00, new C9EL(this, 12));
        this.A02 = A01;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, new AnonymousClass058(new C9DH(AbstractC011604e.A00(C05F.A00, C0JE.A00(new C9D3(A01, (InterfaceC23621Ds) null, 6, 42)), -1), (InterfaceC23621Ds) null, this, 39)));
        this.A04 = AbstractC58232lf.A00(anonymousClass191, c43810JYx);
    }

    public final void A0G(C9J0 c9j0, String str) {
        C14360o3.A0B(c9j0, 0);
        C14360o3.A0B(str, 1);
        AbstractC23641Du.A05(C12L.A00.CPG(603422383, 3), new MC9(this, c9j0, str, (InterfaceC23621Ds) null, 27), AbstractC141776au.A00(this));
    }

    public final void A0F() {
        List list = (List) this.A01.A02();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C9J0) obj).A00()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C9J0) it.next()).A09);
            }
            C22C A01 = AnonymousClass229.A01(this.A05);
            C18920wW c18920wW = ((C22F) A01).A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_see_all_drafts");
            if (A00.isSampled()) {
                A00.A8p("event_type", 1);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A8R(A01.A0J(), "camera_destination");
                C22M c22m = ((C22F) A01).A04;
                A00.AAP("camera_session_id", c22m.A0L);
                A00.AAk("composition_str_id_list", arrayList2);
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.A8R(c22m.A0C, "surface");
                A00.Cht();
            }
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A07;
            C206989Ed c206989Ed = new C206989Ed(this, 19);
            C19K A02 = AnonymousClass194.A02(clipsDraftPreviewItemRepository.A01);
            C9DH c9dh = new C9DH(c206989Ed, (InterfaceC23621Ds) null, clipsDraftPreviewItemRepository, 38);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A02);
        }
    }

    @Override // X.C75F
    public final Object CCu(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A06.A0E(c5jk, interfaceC23621Ds);
    }

    public final void A0E() {
        C141796aw A00 = AbstractC141776au.A00(this);
        C206649Cv c206649Cv = new C206649Cv(this, null, 5);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A00);
    }
}
