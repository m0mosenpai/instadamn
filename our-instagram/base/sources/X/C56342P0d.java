package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: X.P0d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56342P0d implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC58310Pt2 A03;
    public final C52470NJo A04;
    public final C81X A05;
    public final AnonymousClass841 A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C51754Mtd A00;
        C52369NFj A01 = OOy.A01(this.A01.requireContext(), null, null, Integer.valueOf(R.drawable.instagram_crown_pano_outline_24), 2131961930);
        this.A00 = A01;
        C52369NFj.A02(A01, this, 12);
        MediaCaptureConfig mediaCaptureConfig = ((MX5) this.A06).A01.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A04) {
            C52470NJo c52470NJo = this.A04;
            C51754Mtd A04 = c52470NJo.A04();
            if (((C50526MSf) c52470NJo.A02.getValue()).A01) {
                A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04, EnumC76383bi.A07, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
                c52470NJo.A07(A00);
            }
        }
        C54415O2v c54415O2v = new C54415O2v(this.A02);
        InterfaceC19630xq interfaceC19630xq = c54415O2v.A00.A01;
        if (AbstractC31172DnG.A01(interfaceC19630xq, "exclusive_post_creation_tooltip_count") < 3 && System.currentTimeMillis() - AbstractC31175DnJ.A03(interfaceC19630xq, "exclusive_post_creation_tooltip_timestamp") > AbstractC43593JPy.A09(TimeUnit.DAYS)) {
            C52369NFj c52369NFj = this.A00;
            if (c52369NFj != null) {
                AbstractC13880nE.A0u(c52369NFj, new PUL(5, c54415O2v, this));
            }
            C14360o3.A0F("exclusivePostsRow");
            throw C00O.createAndThrow();
        }
        C52369NFj c52369NFj2 = this.A00;
        if (c52369NFj2 != null) {
            return c52369NFj2;
        }
        C14360o3.A0F("exclusivePostsRow");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 36), C07Y.A00(viewLifecycleOwner));
    }

    public C56342P0d(AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass841 anonymousClass841, InterfaceC58310Pt2 interfaceC58310Pt2, C52470NJo c52470NJo) {
        AbstractC167027dH.A13(abstractC59962oe, userSession, anonymousClass841);
        C14360o3.A0B(interfaceC58310Pt2, 5);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A06 = anonymousClass841;
        this.A04 = c52470NJo;
        this.A03 = interfaceC58310Pt2;
        this.A05 = C81X.A11;
    }
}
