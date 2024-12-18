package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class KA3 extends AbstractC32247EIg implements JPX {
    public static final String __redex_internal_original_name = "ReelAvatarStickerBottomSheetFragment";
    public C189478aR A02;
    public C44533Jmd A03;
    public MPC A04;
    public C146016hy A05;
    public String A06;
    public String A07;
    public boolean A08;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public final InterfaceC09390do A0P = AbstractC60492pY.A02(this);
    public AbstractC439921h A01 = C439821g.A00;
    public C53O A00 = new C48240LWp(this, 9);
    public int A0E = 2131953561;
    public int A0D = 2131953559;
    public int A0C = 2131953557;
    public Integer A0H = 2131953568;
    public Integer A0G = 2131953567;
    public Integer A0F = 2131953562;
    public boolean A0O = true;
    public int A0B = 2131953570;
    public int A0A = 2131953569;
    public int A09 = 2131953555;
    public boolean A0N = true;
    public Integer A0I = 2131953566;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static final void A00(KA3 ka3) {
        C41551w4 c41551w4;
        C41181vS AuU;
        C146016hy c146016hy = ka3.A05;
        if (c146016hy != null) {
            if (!ka3.A0M && (c41551w4 = ((ReelViewerFragment) c146016hy.A04).A0a) != null) {
                if (!C6XB.A00.A00(c146016hy.A00, c41551w4.A0H.A0D())) {
                    InterfaceC1118853a interfaceC1118853a = c146016hy.A04;
                    C41551w4 c41551w42 = ((ReelViewerFragment) interfaceC1118853a).A0a;
                    if (c41551w42 != null && (AuU = interfaceC1118853a.AuU()) != null) {
                        c146016hy.A05.E2a(AuU, c41551w42, true);
                    }
                }
            }
            C189478aR c189478aR = ka3.A02;
            if (c189478aR != null) {
                c189478aR.A07();
            }
        }
    }

    @Override // X.AbstractC32247EIg
    public final int A04() {
        return this.A09;
    }

    @Override // X.AbstractC32247EIg
    public final int A05() {
        return this.A0A;
    }

    @Override // X.AbstractC32247EIg
    public final int A06() {
        return this.A0B;
    }

    @Override // X.AbstractC32247EIg
    public final int A07() {
        return this.A0C;
    }

    @Override // X.AbstractC32247EIg
    public final int A08() {
        return this.A0D;
    }

    @Override // X.AbstractC32247EIg
    public final int A09() {
        return this.A0E;
    }

    @Override // X.AbstractC32247EIg
    public final C53O A0A() {
        return this.A00;
    }

    @Override // X.AbstractC32247EIg
    public final ImageUrl A0B() {
        return null;
    }

    @Override // X.AbstractC32247EIg
    public final Integer A0C() {
        return this.A0F;
    }

    @Override // X.AbstractC32247EIg
    public final Integer A0D() {
        return this.A0G;
    }

    @Override // X.AbstractC32247EIg
    public final Integer A0E() {
        return this.A0H;
    }

    @Override // X.AbstractC32247EIg
    public final Integer A0F() {
        return this.A0I;
    }

    @Override // X.AbstractC32247EIg
    public final String A0G() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("editorLoggingMechanism");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC32247EIg
    public final String A0H() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("editorLoggingSurface");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC32247EIg
    public final void A0I() {
        InterfaceC09390do interfaceC09390do = this.A0P;
        this.A01 = C20Y.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01.A00;
        JZ8 jz8 = AbstractC47193KtS.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        jz8.A01(requireActivity(), this.A00, A0r, A0H(), A0G());
    }

    @Override // X.AbstractC32247EIg
    public final boolean A0J() {
        return C14360o3.A0K(C20Y.A00(AbstractC166987dD.A0r(this.A0P)).A01.A00, C125535lz.A00);
    }

    @Override // X.AbstractC32247EIg
    public final boolean A0K() {
        return this.A0N;
    }

    @Override // X.AbstractC32247EIg
    public final boolean A0L() {
        return this.A0O;
    }

    @Override // X.AbstractC32247EIg
    public final boolean A0M() {
        return this.A0M;
    }

    @Override // X.AbstractC32247EIg
    public final void A0N() {
        String str;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57165PZj c57165PZj = new C57165PZj(c07s, this, viewLifecycleOwner, null, 34);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c57165PZj, A00);
        SpinnerImageView spinnerImageView = super.A08;
        if (spinnerImageView != null) {
            AbstractC31171DnF.A1M(spinnerImageView);
            C44533Jmd c44533Jmd = this.A03;
            if (c44533Jmd == null) {
                str = "viewModel";
            } else {
                AbstractC23641Du.A05(anonymousClass191, new PZB(c44533Jmd, (InterfaceC23621Ds) null, 40), AbstractC141776au.A00(c44533Jmd));
                return;
            }
        } else {
            str = "loadingSpinner";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC32247EIg
    public final void A0O() {
        MPC mpc = this.A04;
        if (mpc != null) {
            mpc.Dau();
        }
        View view = this.mView;
        if (view != null) {
            view.post(new M2H(this));
        }
        C22C A0T = AbstractC43593JPy.A0T(this.A0P);
        String str = this.A0K;
        if (str == null) {
            C14360o3.A0F("avatarStickerTemplateId");
            throw C00O.createAndThrow();
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC111324zv.A00(533), str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A0T).A01, "mimicry_upsell_tap_add_avatar_to_story");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, "avatar_stickers_upsell");
            AbstractC31174DnI.A1G(A0f, A1G);
        }
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A01;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0L;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return I58.A00(this, str);
    }

    @Override // X.AbstractC32247EIg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(1946562765);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A07 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A06 = string2;
                String string3 = requireArguments.getString("args_upsell_avatar_sticker_template_id");
                if (string3 != null) {
                    this.A0K = string3;
                    this.A0J = requireArguments.getString("args_upsell_avatar_sticker_expression_id");
                    String string4 = requireArguments.getString("args_previous_module_name");
                    if (string4 != null) {
                        this.A0L = string4;
                        this.A0M = requireArguments.getBoolean("args_is_self_story");
                        this.A08 = requireArguments.getBoolean("args_is_from_template_participation");
                        C018307d viewModelStore = getViewModelStore();
                        UserSession A0r = AbstractC166987dD.A0r(this.A0P);
                        String str = this.A0K;
                        if (str == null) {
                            C14360o3.A0F("avatarStickerTemplateId");
                            throw C00O.createAndThrow();
                        }
                        this.A03 = (C44533Jmd) new C52942bb(new C45589KGd(A0r, str, this.A0J), viewModelStore, C52962bd.A00).A00(C44533Jmd.class);
                        C0f9.A09(567633719, A02);
                        return;
                    }
                    A14 = AbstractC166987dD.A14("previous module required");
                    i = 1051663527;
                } else {
                    A14 = AbstractC166987dD.A14("avatar sticker template id required");
                    i = -147816042;
                }
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = 1857629002;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = 690774439;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
