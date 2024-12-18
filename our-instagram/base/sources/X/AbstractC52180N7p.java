package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.people.PeopleTag;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.N7p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52180N7p extends AbstractC43842Ja5 implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "VideoMetadataInfoFragment";
    public FrameLayout A00;
    public C52251NAq A01;
    public boolean A02;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A06 = C57538PgC.A00(this, C57538PgC.A01(this, 44), new C57251PbZ(31, null, this), AbstractC25225BEi.A1D(C50995Mg2.class), 45);
    public boolean A03 = true;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(C57538PgC.A01(this, 43));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C57538PgC.A01(this, 42));

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C50995Mg2 c50995Mg2 = (C50995Mg2) this.A06.getValue();
        if (this instanceof NMX) {
            str = MSW.A0b(((NMX) this).A0Y).A0B;
        } else {
            str = ((NMW) this).A0G;
            if (str == null) {
                C14360o3.A0F("composerSessionId");
                throw C00O.createAndThrow();
            }
        }
        c50995Mg2.A02 = str;
        A0B(A0D());
    }

    public final C52251NAq A0C() {
        C52251NAq c52251NAq = this.A01;
        if (c52251NAq != null) {
            return c52251NAq;
        }
        C14360o3.A0F("enterPromoteFlowController");
        throw C00O.createAndThrow();
    }

    public ArrayList A0D() {
        String quantityString;
        NMW nmw = (NMW) this;
        C38321qM c38321qM = nmw.A0C;
        String str = null;
        if (c38321qM != null) {
            ExtendedImageUrl A1q = c38321qM.A1q(nmw.requireContext());
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(new NF0(null, nmw, A1q, C05F.A01, nmw.A0F));
            String A0v = AbstractC25227BEk.A0v(nmw, 2131969519);
            P42 p42 = new P42(nmw);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            A1E2.addAll(nmw.A0K);
            A1E2.addAll(nmw.A0J);
            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) AbstractC001800i.A0J(A1E2);
            String str2 = "";
            if (tag != null) {
                if (tag instanceof PeopleTag) {
                    str2 = ((PeopleTag) tag).A00.A04;
                } else if (tag instanceof FBUserTag) {
                    str2 = ((FBUserTag) tag).A02.A01;
                }
            }
            if (A1E2.isEmpty()) {
                quantityString = null;
            } else {
                quantityString = AbstractC166997dE.A0N(nmw).getQuantityString(R.plurals.people_tagging_x_people_plurals, A1E2.size(), AbstractC25228BEl.A1Z(str2, A1E2.size()));
            }
            InterfaceC09390do interfaceC09390do = nmw.A0Y;
            A1E.add(new C56108OvS(AbstractC166987dD.A0r(interfaceC09390do), p42, A0v, quantityString));
            C38321qM c38321qM2 = nmw.A0C;
            if (c38321qM2 != null) {
                if (!AbstractC166997dE.A1Z(c38321qM2.A0C.Caj(), true)) {
                    A1E.add(new C56102OvM(nmw.A0E, nmw.A0L, nmw.A0U));
                }
                if (((AbstractC52180N7p) nmw).A03) {
                    if (((AbstractC52180N7p) nmw).A02) {
                        str = nmw.getString(2131964277);
                    } else {
                        InterfaceC09390do interfaceC09390do2 = ((AbstractC52180N7p) nmw).A06;
                        if (MSX.A0R(interfaceC09390do2).A03.length() > 0) {
                            str = nmw.getString(2131964274, AbstractC25228BEl.A1Z(MSX.A0R(interfaceC09390do2).A03, MSX.A0R(interfaceC09390do2).A00));
                        }
                    }
                    A1E.add(new C56093OvD(AbstractC25227BEk.A0v(nmw, 2131964258), str));
                }
                A1E.add(new C56107OvR(new P3T(nmw, 28), 2131964255, nmw.A0P, true));
                C38321qM c38321qM3 = nmw.A0C;
                if (c38321qM3 != null) {
                    if (c38321qM3.A6a(AbstractC166987dD.A0r(interfaceC09390do))) {
                        C38321qM c38321qM4 = nmw.A0C;
                        if (c38321qM4 != null) {
                            A1E.add(new C56083Ov0(c38321qM4.A2B(AbstractC166987dD.A0r(interfaceC09390do))));
                        }
                    }
                    return A1E;
                }
            }
        }
        C14360o3.A0F("editMedia");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        if (X.AbstractC25225BEi.A1a(r0.A3Q(), r3.A0J) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (X.AbstractC166997dE.A1Z(r0.AaG(), true) == false) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52180N7p.A0E():void");
    }

    public final void A0F(String str) {
        if (this instanceof NMX) {
            C14360o3.A0B(str, 0);
            MSW.A0b(((NMX) this).A0Y).ERB(str);
        } else {
            C14360o3.A0B(str, 0);
            ((NMW) this).A0F = str;
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        O3D o3d = new O3D(this);
        C168617fv c168617fv = C168607fu.A0I;
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A07;
        return AbstractC16960so.A1Q(new NEQ(c168617fv.A01(requireContext, this, new C61972ry(requireContext(), AbstractC018607g.A00(this), null), AbstractC166987dD.A0r(interfaceC09390do), null, "igtv_edit_page", false), o3d), new Object(), new Object(), new Object(), new NEF(new O3E(this)), new NER(requireActivity(), new O3F(this)), new NEG(new O3G(this)), new NES(requireActivity(), A0C()), new NET(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), new NEU(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), new NEH(requireActivity()), new EXL(this, AbstractC166987dD.A0r(interfaceC09390do)), new Object(), new NEP((C64842wi) this.A04.getValue(), (C64742wY) this.A05.getValue()), new Object(), new NEV(AbstractC166987dD.A0r(interfaceC09390do), new O3H(this)), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C57561PgZ(this, 28));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-182044251);
        super.onCreate(bundle);
        UserSession A0r = AbstractC166987dD.A0r(this.A07);
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        if (this instanceof NMX) {
            str = NNE.A00((NMX) this).A3t;
        } else {
            str = ((NMW) this).A0I;
        }
        this.A01 = new C52251NAq(requireActivity, requireContext, A0r, this, new O3I(this), str);
        registerLifecycleListener(A0C());
        MSY.A1Q(this.A04);
        C0f9.A09(315578258, A02);
    }

    @Override // X.AbstractC43842Ja5, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1934477172);
        C14360o3.A0B(layoutInflater, 0);
        registerLifecycleListener((C64742wY) this.A05.getValue());
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(-1396480639, A02);
        return onCreateView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(-2097287965);
        super.onDestroy();
        unregisterLifecycleListener(A0C());
        C0f9.A09(-14508631, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(1996878828);
        super.onDestroyView();
        unregisterLifecycleListener((C64742wY) this.A05.getValue());
        C0f9.A09(945681096, A02);
    }
}
