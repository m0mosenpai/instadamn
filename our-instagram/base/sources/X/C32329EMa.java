package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.request.graphql.IGDirectChangeNicknameQueryResponseImpl;
import com.instagram.user.model.User;

/* renamed from: X.EMa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32329EMa extends AbstractC59962oe implements InterfaceC189488aT, TextWatcher {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknameChangeFragment";
    public C25671My A00;
    public InterfaceC37169GZg A01;
    public InterfaceC83733oI A02;
    public Capabilities A03;
    public String A04;
    public final InterfaceC09390do A05 = C37052GUi.A00(this, 39);
    public final InterfaceC09390do A06 = C37052GUi.A00(this, 40);
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final boolean A0A = true;
    public final InterfaceC41501vz A08 = C31650DvG.A00(this, 25);
    public final InterfaceC41501vz A09 = C31650DvG.A00(this, 26);

    public final void A01(InterfaceC83733oI interfaceC83733oI, Integer num, String str) {
        Editable text;
        C14360o3.A0B(str, 1);
        if (this.A04 == null && ((text = ((EditText) AbstractC166987dD.A17(this.A05)).getText()) == null || text.length() == 0)) {
            return;
        }
        UserSession A0r = AbstractC166987dD.A0r(this.A07);
        String str2 = ((C83693oE) interfaceC83733oI).A00;
        String A0g = AbstractC167007dF.A0g((EditText) AbstractC166987dD.A17(this.A05));
        C57262Pbk c57262Pbk = new C57262Pbk(interfaceC83733oI, this, str, 6);
        C14360o3.A0B(A0r, 0);
        AbstractC167007dF.A1E(str2, 1, A0g);
        C40701ud A01 = AbstractC40691uc.A01(A0r);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, str2, "ig_thread_igid");
        C2JO c2jo = A0b.A00;
        AbstractC31173DnH.A1M(A0T, c2jo, "metadata");
        C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, A0g, AbstractC31670Dva.A01(0, 8, 22));
        C0CA.A00(A0T2, str, "user_igid");
        AbstractC31173DnH.A1M(A0T2, c2jo, "data");
        A01.ATV(C35813Frp.A00, new C31463Ds7(c57262Pbk, 6), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectChangeNicknameQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), IGDirectChangeNicknameQueryResponseImpl.class, true, null, 0, null, "xig_direct_change_nickname", AbstractC166987dD.A1E()));
        A00(num, C05F.A0C, str);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18A A0h = AbstractC31176DnK.A0h(this.A07);
        Bundle bundle2 = this.mArguments;
        String str4 = null;
        if (bundle2 != null) {
            str = bundle2.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        } else {
            str = null;
        }
        User A02 = A0h.A02(str);
        if (A02 != null) {
            AbstractC167007dF.A0T(view, R.id.nickname_change_selected_user_profile_photo).setUrl(AbstractC81033jX.A00(AbstractC25227BEk.A0B(A02.Bhu().getUrl()), -1, -1), this);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str2 = bundle3.getString(AbstractC31670Dva.A01(0, 8, 22));
            } else {
                str2 = null;
            }
            this.A04 = str2;
            InterfaceC09390do interfaceC09390do = this.A05;
            TextView textView = (TextView) AbstractC166987dD.A17(interfaceC09390do);
            if (str2 != null) {
                textView.setText(this.A04);
            } else {
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null) {
                    str3 = bundle4.getString("username_hint");
                } else {
                    str3 = null;
                }
                textView.setHint(str3);
            }
            ((TextView) AbstractC166987dD.A17(interfaceC09390do)).addTextChangedListener(this);
            AbstractC13880nE.A0R(AbstractC167007dF.A0L(interfaceC09390do));
            ((TextView) this.A06.getValue()).setText(AnonymousClass001.A03(AbstractC167007dF.A0A(this.A04), "/32"));
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str4 = bundle5.getString("nickname_change_entry_point");
            }
            if (!C14360o3.A0K(str4, "thread_details") && C14360o3.A0K(str4, "admin_text")) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            A00(num, C05F.A00, A02.getId());
        }
    }

    private final void A00(Integer num, Integer num2, String str) {
        String str2;
        UserSession A0r = AbstractC166987dD.A0r(this.A07);
        C83693oE c83693oE = (C83693oE) this.A02;
        if (c83693oE != null) {
            str2 = c83693oE.A00;
        } else {
            str2 = null;
        }
        AbstractC46762KmJ.A00(A0r, num, num2, str2, str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        A00(C05F.A00, C05F.A0N, null);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Integer num;
        TextView textView = (TextView) this.A06.getValue();
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (charSequence != null) {
            num = Integer.valueOf(charSequence.length());
        } else {
            num = null;
        }
        A1C.append(num);
        textView.setText(AbstractC166997dE.A0x("/32", A1C));
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return this.A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1359764582);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A02 = A00;
        if (A00 != null) {
            Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            this.A03 = capabilities;
            if (capabilities != null) {
                this.A01 = C7KH.A01(requireContext(), AbstractC166987dD.A0r(this.A07), capabilities, A00);
            }
        }
        C5EW c5ew = new C5EW(C05F.A0C);
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A07);
        this.A00 = A0Q;
        if (A0Q != null) {
            A0Q.E4s(c5ew);
            C25671My c25671My = this.A00;
            if (c25671My != null) {
                c25671My.A01(this.A08, C5EW.class);
                C25671My c25671My2 = this.A00;
                if (c25671My2 != null) {
                    c25671My2.A01(this.A09, C36084FwK.class);
                    C0f9.A09(1194477323, A02);
                    return;
                }
            }
        }
        C14360o3.A0F("igEventBus");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(135884265);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_nickname_change_bottomsheet, viewGroup, false);
        C0f9.A09(26863146, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-575732960);
        super.onDestroy();
        C25671My c25671My = this.A00;
        if (c25671My != null) {
            c25671My.A02(this.A08, C5EW.class);
            C25671My c25671My2 = this.A00;
            if (c25671My2 != null) {
                c25671My2.A02(this.A09, C36084FwK.class);
                C0f9.A09(-345583606, A02);
                return;
            }
        }
        C14360o3.A0F("igEventBus");
        throw C00O.createAndThrow();
    }
}
