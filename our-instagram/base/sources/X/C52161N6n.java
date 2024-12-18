package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.N6n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52161N6n extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserFragment";
    public View A00;
    public RecyclerView A01;
    public C89P A02;
    public C38321qM A03;
    public C25897Bcy A04;
    public ArrayList A05;
    public int A06;
    public ViewGroup A07;
    public C41711wL A08;
    public final Map A09;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0N;
    public final Map A0A = AbstractC166987dD.A1I();
    public final InterfaceC09390do A0F = C57515Pfp.A00(this, 2);
    public final InterfaceC09390do A0M = C57515Pfp.A00(this, 17);

    public final String A00(C38321qM c38321qM) {
        String str;
        C38321qM c38321qM2;
        C14360o3.A0B(c38321qM, 0);
        Iterator A15 = AbstractC166997dE.A15(this.A0A);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int size = ((PagingDataAdapter) A1K.getValue()).A01().size();
            for (int i = 0; i < size; i++) {
                String id = c38321qM.getId();
                C120985dq c120985dq = (C120985dq) ((PagingDataAdapter) A1K.getValue()).A01().get(i);
                if (c120985dq != null && (c38321qM2 = c120985dq.A02) != null) {
                    str = c38321qM2.getId();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(id, str)) {
                    return AbstractC31172DnG.A17(A1K);
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_template_browser_v2";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0I;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        IEJ iej = (IEJ) A0k.A01(IEJ.class, new MHO(A0k, 39));
        iej.A00 = ((UserFlowLoggerImpl) iej.A01.getValue()).flowStartForMarker(357645003, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        View findViewById = view.findViewById(R.id.clips_template_browser_layout);
        if (findViewById != null) {
            this.A01 = AbstractC31172DnG.A0G(view, R.id.clips_template_browser_vertical_recycler_view);
            InterfaceC09390do interfaceC09390do2 = this.A0C;
            findViewById.setPadding(AbstractC167027dH.A01(interfaceC09390do2), AbstractC167027dH.A01(interfaceC09390do2), AbstractC167027dH.A01(interfaceC09390do2), AbstractC167027dH.A01(interfaceC09390do2));
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(20));
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, AbstractC167027dH.A01(this.A0N), 0, 0);
            C50983Mfq c50983Mfq = (C50983Mfq) this.A0J.getValue();
            if (c50983Mfq != null) {
                JQ0.A11(this, new C57153PYx(this, null, 11), c50983Mfq.A03);
            }
            this.A00 = view.requireViewById(R.id.empty_saved_and_audio_view);
            ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.empty_saved_and_audio_view_button);
            this.A07 = A0F;
            if (A0F != null) {
                C0fQ.A00(new ViewOnClickListenerC37847Gl1(this, 0), A0F);
            }
            findViewById.setVisibility(0);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager((AbstractC70663Fe) this.A0B.getValue());
                recyclerView2.A14((C1I4) this.A0G.getValue());
            }
            JQ0.A11(this, new PZN(view, this, null, 38), ((C50999Mg6) this.A0L.getValue()).A06);
            C41711wL A01 = C41711wL.A01(AbstractC166987dD.A0r(interfaceC09390do));
            this.A08 = A01;
            if (A01 != null) {
                this.A06 = A01.A09();
                C41711wL c41711wL = this.A08;
                if (c41711wL != null) {
                    c41711wL.A0C(5);
                    return;
                }
            }
            C14360o3.A0F("playerServiceController");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        OU4 A00 = AbstractC53871Nrz.A00(AbstractC166987dD.A0r(this.A0I));
        Long l = A00.A01;
        if (l != null) {
            OU4.A00(A00).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        }
        A00.A01 = null;
        java.util.Set set = A00.A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            OU4.A00(A00).flowEndCancel(MSY.A07(it), CancelReason.USER_CANCELLED);
        }
        set.clear();
        return false;
    }

    public C52161N6n() {
        C57515Pfp c57515Pfp = new C57515Pfp(this, 16);
        C57515Pfp c57515Pfp2 = new C57515Pfp(this, 5);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57515Pfp(c57515Pfp2, 6));
        this.A0L = AbstractC25225BEi.A0a(new C57515Pfp(A00, 7), c57515Pfp, new D8J(26, null, A00), AbstractC25225BEi.A1D(C50999Mg6.class));
        this.A0J = C57515Pfp.A00(this, 14);
        C57515Pfp c57515Pfp3 = new C57515Pfp(this, 15);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C57515Pfp(new C57515Pfp(this, 8), 9));
        this.A0K = AbstractC25225BEi.A0a(new C57515Pfp(A002, 10), c57515Pfp3, new D8J(27, null, A002), AbstractC25225BEi.A1D(Gt6.class));
        this.A0B = C1XM.A00(new C29888DGc(this, 48));
        this.A0G = C57515Pfp.A00(this, 3);
        this.A0C = C1XM.A00(new C29888DGc(this, 49));
        this.A0N = C57515Pfp.A00(this, 18);
        this.A09 = AbstractC166987dD.A1I();
        this.A0E = C57515Pfp.A00(this, 1);
        this.A0H = C57515Pfp.A00(this, 4);
        this.A0D = C57515Pfp.A00(this, 0);
        this.A0I = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        C50983Mfq c50983Mfq;
        C38321qM c38321qM;
        C50983Mfq c50983Mfq2;
        String str3;
        String str4;
        C38321qM c38321qM2;
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == -1 && intent != null && intent.getBooleanExtra("ClipsConstants.ARGS_CLIPS_TEMPLATE_CAMERA_UPDATED_SAVE_STATUS", false) && this.A03 != null) {
            Iterator A15 = AbstractC166997dE.A15(this.A0A);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                int size = ((PagingDataAdapter) A1K.getValue()).A01().size();
                for (int i3 = 0; i3 < size; i3++) {
                    C120985dq c120985dq = (C120985dq) ((PagingDataAdapter) A1K.getValue()).A01().get(i3);
                    C38321qM c38321qM3 = this.A03;
                    if (c38321qM3 != null) {
                        str = c38321qM3.getId();
                    } else {
                        str = null;
                    }
                    if (c120985dq != null && (c38321qM2 = c120985dq.A02) != null) {
                        str2 = c38321qM2.getId();
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str, str2)) {
                        Iterator A13 = AbstractC166997dE.A13(MSX.A0X(this).A01);
                        while (A13.hasNext()) {
                            C38514GwZ c38514GwZ = (C38514GwZ) AbstractC166997dE.A0l(A13);
                            C38321qM c38321qM4 = c38514GwZ.A00;
                            if (c38321qM4 != null) {
                                str3 = c38321qM4.getId();
                            } else {
                                str3 = null;
                            }
                            C38321qM c38321qM5 = this.A03;
                            if (c38321qM5 != null) {
                                str4 = c38321qM5.getId();
                            } else {
                                str4 = null;
                            }
                            if (C14360o3.A0K(str3, str4)) {
                                C38321qM c38321qM6 = this.A03;
                                if (c38321qM6 != null && c38321qM6.CcN()) {
                                    c38514GwZ.A00();
                                } else {
                                    c38514GwZ.A01();
                                }
                            }
                        }
                        if (this.A0F.getValue() == ClipsTemplateBrowserV2Type.A05 && (c38321qM = this.A03) != null && (c50983Mfq2 = (C50983Mfq) this.A0J.getValue()) != null) {
                            c50983Mfq2.A01(c38321qM);
                        }
                        if (c120985dq != null && (c50983Mfq = (C50983Mfq) this.A0J.getValue()) != null) {
                            C38321qM c38321qM7 = this.A03;
                            if (c38321qM7 != null) {
                                c50983Mfq.A00(c120985dq, c38321qM7.BqJ());
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(858168918);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_layout, viewGroup, false);
        C0f9.A09(428478322, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(359949865);
        super.onDestroyView();
        int i = this.A06;
        if (i != 0) {
            C41711wL c41711wL = this.A08;
            if (c41711wL == null) {
                C14360o3.A0F("playerServiceController");
                throw C00O.createAndThrow();
            }
            c41711wL.A0C(i);
        }
        MSX.A0X(this).A0E();
        this.A01 = null;
        this.A00 = null;
        this.A07 = null;
        this.A03 = null;
        C0f9.A09(138447577, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(352746574);
        super.onPause();
        MSX.A0X(this).A0F();
        C0f9.A09(698559078, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Object obj;
        int A02 = C0f9.A02(995820942);
        super.onResume();
        C50983Mfq c50983Mfq = (C50983Mfq) this.A0J.getValue();
        if (c50983Mfq != null) {
            obj = c50983Mfq.A03.getValue();
        } else {
            obj = null;
        }
        if (obj == this.A0F.getValue()) {
            Gt6 A0X = MSX.A0X(this);
            A0X.A00 = false;
            Gt6.A01(A0X);
        }
        C0f9.A09(595328334, A02);
    }
}
