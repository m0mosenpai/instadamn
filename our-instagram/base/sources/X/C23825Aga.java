package X;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import java.util.List;

/* renamed from: X.Aga, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23825Aga implements C8AD {
    public C183688Ct A00;
    public CaptureRuleSystemState A01;
    public final C8B7 A02;
    public final UserSession A03;

    public C23825Aga(UserSession userSession) {
        C8B7 c8b7;
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = new CaptureRuleSystemState(null, C8B9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        if (C8B6.A00(userSession).booleanValue()) {
            c8b7 = AbstractC173047nI.A00(userSession);
        } else {
            c8b7 = null;
        }
        this.A02 = c8b7;
    }

    @Override // X.C8AD
    public final void A9F(C183688Ct c183688Ct, C8AG c8ag) {
    }

    @Override // X.C8AD
    public final void AHl(Void r1) {
    }

    @Override // X.C8AD
    public final boolean CcJ(C8AG c8ag) {
        C14360o3.A0B(c8ag, 0);
        return c8ag.CcK(this.A01);
    }

    @Override // X.C8AD
    public final void Cx6() {
    }

    @Override // X.C8AD
    public final void D0N(List list) {
    }

    @Override // X.C8AD
    public final void D8H(boolean z) {
    }

    @Override // X.C8AD
    public final void DDo() {
    }

    @Override // X.C8AD
    public final void DEs() {
        this.A01 = new CaptureRuleSystemState(null, C8B9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A00();
    }

    @Override // X.C8AD
    public final void DNC(boolean z) {
    }

    @Override // X.C8AD
    public final void DRg(BrandedContentGatingInfo brandedContentGatingInfo) {
    }

    @Override // X.C8AD
    public final void DSj() {
    }

    @Override // X.C8AD
    public final void DUN() {
    }

    @Override // X.C8AD
    public final void DYR(boolean z) {
    }

    @Override // X.C8AD
    public final void DYS() {
    }

    @Override // X.C8AD
    public final void DbO(ReelProductLink reelProductLink) {
    }

    @Override // X.C8AD
    public final void Dbh(ProfileShopLink profileShopLink) {
    }

    @Override // X.C8AD
    public final void Ddd(List list) {
    }

    @Override // X.C8AD
    public final void Doe(Drawable drawable) {
    }

    @Override // X.C8AD
    public final void Dol(Drawable drawable) {
    }

    @Override // X.C8AD
    public final void DpR(List list, boolean z) {
    }

    @Override // X.C8AD
    public final void Dss() {
    }

    @Override // X.C8AD
    public final void EKV(C198908qq c198908qq, Void r2) {
    }

    private final void A00() {
        int A01;
        C173617oD c173617oD;
        if (C8B6.A00(this.A03).booleanValue()) {
            A01 = AbstractC173097nN.A01("story_v2");
            java.util.Set A00 = AbstractC226739zV.A00(this.A01);
            C8B7 c8b7 = this.A02;
            if (c8b7 != null) {
                c173617oD = (C173617oD) c8b7.A07.getValue();
            } else {
                c173617oD = null;
            }
            if (c173617oD != null) {
                EnumC173197nX enumC173197nX = EnumC173197nX.IG;
                EnumC173527o4 enumC173527o4 = EnumC173527o4.STORY;
                List A012 = ALn.A01(new C23009ACj(enumC173197nX, AbstractC166987dD.A1J(enumC173527o4), AbstractC166987dD.A1J(this.A01.A04)), new C23009ACj(EnumC173197nX.FB, AbstractC166987dD.A1J(enumC173527o4), AbstractC166987dD.A1J(this.A01.A04)), c173617oD, A00);
                C183688Ct c183688Ct = this.A00;
                if (c183688Ct != null) {
                    c183688Ct.A0o(A012);
                }
            } else {
                C0K8.A0C("PreCaptureCaptureRuleSystem", "(checkXpostingCompatibility) config==null");
                C183688Ct c183688Ct2 = this.A00;
                if (c183688Ct2 != null) {
                    c183688Ct2.A0o(null);
                }
            }
        } else {
            A01 = AbstractC173097nN.A01("story_v0");
        }
        C006802i.A0p.markerEnd(383657104, A01, (short) 2);
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        CaptureRuleSystemState captureRuleSystemState = (CaptureRuleSystemState) parcelable;
        if (captureRuleSystemState != null) {
            this.A01 = captureRuleSystemState;
            A00();
        }
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        return this.A01;
    }

    @Override // X.C8AD
    public final C198908qq ELg() {
        return new C198908qq(this.A01);
    }

    @Override // X.C8AD
    public final void EhR(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }
}
