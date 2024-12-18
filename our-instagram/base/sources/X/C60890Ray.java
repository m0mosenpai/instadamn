package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ray, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60890Ray extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IdVerificationDocumentTypeFragment";
    public Context A00;
    public Bundle A01;
    public FragmentActivity A02;
    public AbstractC10360h2 A03;
    public TF9 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public UserSession A0B;
    public boolean A0C;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        if (this.A0C) {
            C3LO c3lo = new C3LO();
            c3lo.A02(C05F.A09);
            c3lo.A0G = new ViewOnClickListenerC63507Soa(this, 17);
            Context context = this.A00;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            c3lo.A02 = context.getColor(AbstractC53242c7.A08(context));
            interfaceC56362iU.AA9(new C3LY(c3lo));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "id_verification";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0A) {
            getSession();
        }
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A0B;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        TF9 tf9 = this.A04;
        if (tf9 == null) {
            C14360o3.A0F("idVerificationLogger");
            throw C00O.createAndThrow();
        }
        tf9.A00(EnumC61065Ree.A04, EnumC61067Reg.A01, this.A07);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            AbstractC10360h2 abstractC10360h2 = this.A03;
            if (abstractC10360h2 == null) {
                C14360o3.A0F("fragmentManager");
                throw C00O.createAndThrow();
            }
            AbstractC63248Sg4.A02(abstractC10360h2);
            android.net.Uri data = intent.getData();
            AuthenticityUploadMedium authenticityUploadMedium = (AuthenticityUploadMedium) intent.getSerializableExtra("front_authenticity_upload_medium");
            if (data != null && data.getPath() != null) {
                UserSession session = getSession();
                String path = data.getPath();
                C14360o3.A0A(path);
                new L7n(authenticityUploadMedium, session, new TH3(this), path, this.A07).A00();
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC58323PtF.A1L(this);
        if (this.A0C) {
            FragmentActivity fragmentActivity = this.A02;
            if (fragmentActivity == null) {
                C14360o3.A0F("fragmentActivity");
                throw C00O.createAndThrow();
            }
            if (fragmentActivity instanceof ChallengeActivity) {
                fragmentActivity.finish();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(-1411191524);
        super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A0B = C023409i.A0A.A06(requireArguments);
        Bundle bundle2 = this.A01;
        if (bundle2 != null) {
            this.A07 = bundle2.getString("challenge_use_case");
            Bundle bundle3 = this.A01;
            if (bundle3 != null) {
                this.A06 = bundle3.getString("challenge_id");
                Bundle bundle4 = this.A01;
                if (bundle4 != null) {
                    this.A05 = bundle4.getString("av_session_id");
                    Bundle bundle5 = this.A01;
                    if (bundle5 != null) {
                        this.A08 = bundle5.getString("flow_id");
                        Bundle bundle6 = this.A01;
                        if (bundle6 != null) {
                            this.A09 = bundle6.getString("product_surface");
                            FragmentActivity requireActivity = requireActivity();
                            this.A02 = requireActivity;
                            this.A03 = requireActivity.getSupportFragmentManager();
                            this.A04 = new TF9(getSession());
                            String str = this.A07;
                            if (str == null || (!str.equals("idv_reactive") && !str.equals("ig_scraping"))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.A0C = z;
                            this.A0A = "ig_age_verification_idv".equals(str);
                            C0f9.A09(-1134147838, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("args");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1939094927);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_document_type_layout, viewGroup, false);
        ViewOnClickListenerC63507Soa.A00(AbstractC166997dE.A0S(inflate, R.id.document_type_group_2_option), 18, this);
        C64P c64p = (C64P) AbstractC166997dE.A0R(inflate, R.id.document_type_next_button);
        c64p.setPrimaryButtonEnabled(false);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC63507Soa(this, 19));
        ((RadioGroup) AbstractC166997dE.A0R(inflate, R.id.document_type_radio_group)).setOnCheckedChangeListener(new C35752Fqk(7, this, c64p));
        C0f9.A09(1366254340, A02);
        return inflate;
    }
}
