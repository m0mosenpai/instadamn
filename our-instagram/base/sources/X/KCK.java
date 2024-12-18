package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler;
import com.instagram.igds.components.form.IgFormField;

/* loaded from: classes8.dex */
public final class KCK extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "RenameOriginalAudioFragment";
    public RenameOriginalAudioApiHandler A00;
    public IgFormField A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C13400mQ A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final LO2 A0D;
    public final InterfaceC13380mO A0E;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rename_original_audio";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField igFormField = (IgFormField) view.requireViewById(R.id.input_field);
        igFormField.setLabelText(getString(2131972344));
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("originalTitle");
            throw C00O.createAndThrow();
        }
        igFormField.setText(str);
        igFormField.setMaxLength(50);
        igFormField.setRuleChecker(new P33(this, 0));
        igFormField.A0H(this.A0D);
        this.A01 = igFormField;
        igFormField.A0E();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0C);
        Long A0V = AbstractC37302Gc3.A0V(this.A02);
        String str2 = this.A06;
        C14360o3.A0B(A0o, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o), "instagram_rename_audio_page_impression");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, "rename_original_audio");
            A0f.A9K("container_id", A0V);
            AbstractC25233BEq.A17(A0f, "media_tap_token", str2);
            A0f.Cht();
        }
    }

    public static final String A00(KCK kck) {
        IgFormField igFormField = kck.A01;
        if (igFormField == null) {
            C14360o3.A0F("inputField");
            throw C00O.createAndThrow();
        }
        return AbstractC25228BEl.A1A(igFormField.getText().toString());
    }

    public static final void A01(KCK kck) {
        IgFormField igFormField = kck.A01;
        if (igFormField == null) {
            C14360o3.A0F("inputField");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igFormField);
        C193328hC A0O = AbstractC31175DnJ.A0O(kck);
        A0O.A0A(2131976209);
        A0O.A09(2131961661);
        A0O.A0s(true);
        A0O.A0t(true);
        AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC48023LMs.A00(kck, 10), A0O, 2131954754);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A08) {
            String A00 = A00(this);
            String str = this.A05;
            if (str == null) {
                C14360o3.A0F("originalTitle");
                throw C00O.createAndThrow();
            }
            A00.contentEquals(str);
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0C);
            Long A0V = AbstractC37302Gc3.A0V(this.A02);
            String str2 = this.A06;
            C14360o3.A0B(A0o, 1);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o), "instagram_rename_audio_exit_rename_page_unsuccessful");
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1O(A0f, "rename_original_audio");
                A0f.A9K("container_id", A0V);
                AbstractC25233BEq.A17(A0f, "media_tap_token", str2);
                A0f.Cht();
                return false;
            }
            return false;
        }
        return false;
    }

    public KCK() {
        C0YZ A1D = AbstractC25225BEi.A1D(C44466JlY.class);
        this.A0B = AbstractC25225BEi.A0a(new MHO(this, 15), new MHO(this, 16), new D8L(6, null, this), A1D);
        JX1 jx1 = new JX1(this, 2);
        this.A0E = jx1;
        this.A0A = new C13400mQ(AbstractC167007dF.A0J(), jx1, 300L);
        this.A0D = new LO2(this, 0);
        this.A0C = AbstractC60492pY.A02(this);
    }

    public static final void A02(KCK kck, CharSequence charSequence) {
        String obj = charSequence.toString();
        String str = kck.A05;
        if (str == null) {
            C14360o3.A0F("originalTitle");
            throw C00O.createAndThrow();
        }
        C56352iT.A0t.A03(kck.requireActivity()).EkG(AbstractC167007dF.A1M(obj.contentEquals(str) ? 1 : 0));
    }

    public static final void A03(KCK kck, String str) {
        if (AbstractC25225BEi.A1Y(str)) {
            String str2 = kck.A05;
            if (str2 == null) {
                C14360o3.A0F("originalTitle");
                throw C00O.createAndThrow();
            }
            if (!str.contentEquals(str2)) {
                C50120MBu.A01(kck, str, AbstractC25235BEs.A0S(kck), 26);
            }
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = AbstractC166997dE.A0N(this).getString(2131972344);
        A00.A01 = new ViewOnClickListenerC48064LPp(this, 51);
        AbstractC31172DnG.A1E(AbstractC166997dE.A0N(this), interfaceC56362iU.Ehj(new C31722DwR(A00)), 2131955764);
        interfaceC56362iU.ARS(true);
        interfaceC56362iU.EkT(new ViewOnClickListenerC48064LPp(this, 50), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(25280910);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("original_audio_current_title");
        if (string == null || AbstractC001900j.A0T(string)) {
            string = AbstractC25227BEk.A0u(requireActivity(), 2131955765);
        }
        this.A05 = string;
        this.A04 = requireArguments.getString("original_audio_media_id");
        this.A02 = requireArguments.getString("audio_asset_id");
        this.A06 = requireArguments.getString("source_media_tap_token");
        this.A07 = requireArguments.getBoolean("audio_page_via_notification");
        this.A00 = new RenameOriginalAudioApiHandler(AbstractC166987dD.A0r(this.A0C));
        C0f9.A09(12208438, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-629311670);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_rename_original_audio, viewGroup, false);
        C0f9.A09(1820155017, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-15437734);
        super.onPause();
        IgFormField igFormField = this.A01;
        if (igFormField == null) {
            C14360o3.A0F("inputField");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igFormField);
        C0f9.A09(2047808814, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1722046557);
        super.onResume();
        A02(this, A00(this));
        A03(this, A00(this));
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            igFormField.requestFocus();
            IgFormField igFormField2 = this.A01;
            if (igFormField2 != null) {
                AbstractC13880nE.A0N(igFormField2);
                C0f9.A09(1709218523, A02);
                return;
            }
        }
        C14360o3.A0F("inputField");
        throw C00O.createAndThrow();
    }
}
