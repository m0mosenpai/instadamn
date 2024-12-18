package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* loaded from: classes9.dex */
public final class NJL extends OX2 {
    public static final CallerContext A0c = CallerContext.A01(N6J.__redex_internal_original_name);
    public InterfaceC58310Pt2 A00;
    public InterfaceC58168PqY A01;
    public AbstractC53643Nno A02;
    public AbstractC50867Mdy A03;
    public NJR A04;
    public final Bundle A05;
    public final AbstractC59962oe A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final String A09;
    public final String A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public NJL(Bundle bundle, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC25233BEq.A0x(3, userSession, interfaceC11380iw, str);
        this.A06 = abstractC59962oe;
        this.A05 = bundle;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0A = str;
        this.A09 = bundle.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID");
        this.A0F = A00(this, 16);
        this.A0Z = bundle.getBoolean("ARG_CLIPS_IS_WELCOME_VIDEO");
        this.A0Y = bundle.getBoolean("ARG_CLIPS_IS_PROMO_VIDEO");
        this.A0a = bundle.getBoolean("ARG_CLIPS_IS_EXCLUSIVE_BY_DEFAULT");
        this.A0b = !bundle.getBoolean("ClipsConstants.ARG_IS_CLIPS_ENTRY_POINT", true);
        this.A0C = A00(this, 13);
        this.A0V = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 35), C57522Pfw.A00(this, 45), MSW.A1G(abstractC59962oe, null, 17), AbstractC25225BEi.A1D(C50965MfY.class));
        this.A0B = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 41), C57522Pfw.A00(abstractC59962oe, 42), MSW.A1G(abstractC59962oe, null, 20), AbstractC25225BEi.A1D(C50985Mfs.class));
        this.A0U = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 43), C57354PdE.A00, MSW.A1G(abstractC59962oe, null, 21), AbstractC25225BEi.A1D(C25862BcH.class));
        this.A0P = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 29), C57522Pfw.A00(abstractC59962oe, 30), MSW.A1G(abstractC59962oe, null, 10), AbstractC25225BEi.A1D(C44466JlY.class));
        this.A0M = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 31), C57522Pfw.A00(abstractC59962oe, 32), MSW.A1G(abstractC59962oe, null, 11), AbstractC25225BEi.A1D(C50880MeB.class));
        this.A0G = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 33), C57522Pfw.A00(this, 17), MSW.A1G(abstractC59962oe, null, 12), AbstractC25225BEi.A1D(C50994Mg1.class));
        this.A0D = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 34), C57522Pfw.A00(this, 14), MSW.A1G(abstractC59962oe, null, 13), AbstractC25225BEi.A1D(C50991Mfy.class));
        this.A0Q = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 36), C57522Pfw.A00(this, 25), MSW.A1G(abstractC59962oe, null, 14), AbstractC25225BEi.A1D(C44475Jlh.class));
        this.A0O = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 37), C57522Pfw.A00(this, 24), MSW.A1G(abstractC59962oe, null, 15), AbstractC25225BEi.A1D(C51022MgU.class));
        this.A0W = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 38), C57522Pfw.A00(this, 46), MSW.A1G(abstractC59962oe, null, 16), AbstractC25225BEi.A1D(C50899MeU.class));
        this.A0S = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 39), C57522Pfw.A00(this, 27), MSW.A1G(abstractC59962oe, null, 18), AbstractC25225BEi.A1D(ClipsSharingDraftViewModel.class));
        this.A0X = AbstractC25225BEi.A0a(C57522Pfw.A00(abstractC59962oe, 40), C57522Pfw.A00(this, 47), MSW.A1G(abstractC59962oe, null, 19), AbstractC25225BEi.A1D(C50997Mg4.class));
        this.A0I = A00(this, 19);
        this.A0K = A00(this, 21);
        C17050sx A00 = A00(this, 20);
        this.A0J = A00;
        this.A01 = (P0K) A00.getValue();
        this.A0E = A00(this, 15);
        this.A0R = A00(this, 26);
        this.A0H = A00(this, 18);
        this.A0T = A00(this, 28);
        this.A0N = A00(this, 23);
        this.A0L = A00(this, 22);
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new C57522Pfw(obj, i));
    }
}
