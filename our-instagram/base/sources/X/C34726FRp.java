package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.Collections;

/* renamed from: X.FRp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34726FRp {
    public FIO A00;
    public InterfaceC37160GYx A01;
    public GXZ A02;
    public InterfaceC685936w A03;
    public C38321qM A04;
    public C75113Zb A05;
    public C189478aR A06;
    public final Bundle A07;
    public final UserSession A08;
    public final C2EY A09;

    public final void A01() {
        this.A07.putBoolean("DirectShareSheetConstants.is_created_from_bottom_sheet_navigator", true);
    }

    public final void A04(InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 0);
        Bundle bundle = this.A07;
        bundle.putBoolean("DirectShareSheetConstants.insights_sponsored", interfaceC60442pS.isSponsoredEligible());
        bundle.putBoolean("DirectShareSheetConstants.insights_organic", interfaceC60442pS.isOrganicEligible());
    }

    public final void A06(String str) {
        C14360o3.A0B(str, 0);
        C2EY c2ey = this.A09;
        F3N f3n = F3N.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 28 && ordinal != 20 && ordinal != 37 && ordinal != 3) {
            if (ordinal == 15 && AbstractC31174DnI.A0k(this.A08, str) == null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("User not found in UserCache: contentType=");
                A1C.append(c2ey);
                A1C.append(" contentId=");
                throw AbstractC166987dD.A14(AbstractC166997dE.A0x(str, A1C));
            }
        } else if (AbstractC25229BEm.A0h(this.A08, str) == null) {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("Media not found in MediaCache: contentType=");
            A1C2.append(c2ey);
            A1C2.append(" contentId=");
            throw AbstractC166987dD.A14(AbstractC166997dE.A0x(str, A1C2));
        }
        this.A07.putString("DirectShareSheetConstants.content_id", str);
    }

    public final void A07(String str) {
        C14360o3.A0B(str, 0);
        this.A07.putString("DirectShareSheetConstants.web_link_share", str);
    }

    public final DirectShareSheetFragment A00() {
        DirectShareSheetFragment directShareSheetFragment = new DirectShareSheetFragment();
        directShareSheetFragment.setArguments(this.A07);
        InterfaceC37160GYx interfaceC37160GYx = this.A01;
        if (interfaceC37160GYx != null) {
            directShareSheetFragment.A0S = interfaceC37160GYx;
        }
        C189478aR c189478aR = this.A06;
        if (c189478aR != null) {
            directShareSheetFragment.A0f = c189478aR;
        }
        C75113Zb c75113Zb = this.A05;
        if (c75113Zb != null) {
            directShareSheetFragment.A0e = c75113Zb;
        }
        InterfaceC685936w interfaceC685936w = this.A03;
        if (interfaceC685936w != null) {
            directShareSheetFragment.A0V = interfaceC685936w;
        }
        C38321qM c38321qM = this.A04;
        if (c38321qM != null) {
            directShareSheetFragment.A0d = c38321qM;
        }
        GXZ gxz = this.A02;
        if (gxz != null) {
            directShareSheetFragment.A0U = gxz;
        }
        FIO fio = this.A00;
        if (fio != null) {
            directShareSheetFragment.A0J = fio;
        }
        return directShareSheetFragment;
    }

    public final void A02(C19260xA c19260xA) {
        this.A07.putSerializable("DirectShareSheetConstants.analytics_extras", AbstractC11490j8.A03(c19260xA));
    }

    public final void A08(boolean z) {
        this.A07.putBoolean("DirectShareSheetConstants.should_show_bottom_sheet_drag_handle", z);
    }

    public C34726FRp(UserSession userSession, C2EY c2ey, String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        this.A07 = A0b;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("DirectShareSheetConstants.message_type", c2ey.A00);
        if (str != null) {
            A0b.putString("DirectShareSheetConstants.source_module", str);
            this.A08 = userSession;
            this.A09 = c2ey;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcelable, java.lang.Object, com.instagram.direct.model.DirectAREffectShare] */
    public final void A03(ImageUrl imageUrl, ProductAREffectContainer productAREffectContainer, String str, String str2, String str3) {
        AbstractC167017dG.A1N(str, str2);
        ?? obj = new Object();
        obj.A09 = Collections.emptyList();
        obj.A0A = Collections.emptyList();
        obj.A07 = str;
        obj.A08 = str2;
        obj.A01 = imageUrl;
        obj.A06 = str3;
        obj.A05 = null;
        obj.A00 = null;
        obj.A04 = productAREffectContainer;
        this.A07.putParcelable("DirectShareSheetConstants.ar_effect_share", obj);
    }

    public final void A05(InterfaceC83733oI interfaceC83733oI, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, boolean z) {
        DirectForwardingParams directForwardingParams;
        C83693oE A02 = AbstractC1345466e.A02(interfaceC83733oI);
        MsysThreadId A04 = AbstractC1345466e.A04(interfaceC83733oI);
        if (A02 != null) {
            directForwardingParams = new DirectForwardingParams(num, num2, num3, num4, A02.A00, str, str2, str3, str4, str5, false, z);
        } else if (A04 != null) {
            directForwardingParams = new DirectForwardingParams(num, num2, null, null, String.valueOf(A04.A00), str, str2, null, null, null, true, z);
        } else {
            throw AbstractC166987dD.A12("Unsupported threadId type");
        }
        this.A07.putParcelable("DirectShareSheetConstants.forward_params", directForwardingParams);
    }
}
