package com.instagram.nux.cal.activity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31180DnO;
import X.AbstractC34254F9a;
import X.AbstractC35174FfR;
import X.C00O;
import X.C023409i;
import X.C05F;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C34663FOw;
import X.EKV;
import X.EnumC33360Eot;
import X.FWK;
import X.GY2;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class CalActivity extends BaseFragmentActivity implements InterfaceC11380iw, GY2 {
    public int A00;
    public Bundle A01;
    public AbstractC18680vv A02;
    public String A03;
    public String A04;
    public String A05;
    public C34663FOw A06;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Fragment ekv;
        String str;
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("argument_flow");
            if (stringExtra != null) {
                Integer A00 = AbstractC34254F9a.A00(stringExtra);
                Parcelable parcelableExtra = getIntent().getParcelableExtra("argument_content");
                if (parcelableExtra == null) {
                    parcelableExtra = null;
                }
                EnumC33360Eot enumC33360Eot = (EnumC33360Eot) getIntent().getSerializableExtra("argument_entry_point");
                if (parcelableExtra != null && enumC33360Eot != null) {
                    C140966Yy A0C = AbstractC31180DnO.A0C(this, getSession());
                    C34663FOw c34663FOw = this.A06;
                    if (c34663FOw == null) {
                        str = "fragmentFactory";
                    } else {
                        AbstractC18680vv abstractC18680vv = this.A02;
                        if (abstractC18680vv == null) {
                            str = "_session";
                        } else {
                            if (A00 == C05F.A00) {
                                ekv = c34663FOw.A00(parcelableExtra, abstractC18680vv, enumC33360Eot, A00, null, null);
                            } else if (A00 == C05F.A01) {
                                Bundle A0b = AbstractC166987dD.A0b();
                                AbstractC31175DnJ.A0r(A0b, abstractC18680vv);
                                A0b.putParcelable("argument_content", parcelableExtra);
                                A0b.putString("argument_flow", FWK.A00(A00));
                                A0b.putSerializable("argument_entry_point", enumC33360Eot);
                                ekv = new EKV();
                                ekv.setArguments(A0b);
                            } else {
                                throw AbstractC166987dD.A14("Flow not supported!");
                            }
                            A0C.A0B(null, ekv);
                            A0C.A04();
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.GY2
    public final void DVB() {
        String str;
        AbstractC18680vv abstractC18680vv = this.A02;
        if (abstractC18680vv == null) {
            str = "_session";
        } else {
            Bundle bundle = this.A01;
            str = "clientBundle";
            if (bundle != null) {
                String string = bundle.getString("extra_cal_registration_source");
                Bundle bundle2 = this.A01;
                if (bundle2 != null) {
                    AbstractC35174FfR.A03(abstractC18680vv, AbstractC31174DnI.A0n(bundle2, "extra_cal_force_signup_with_fb_after_cp_claiming"), "upsell_secondary_click", string);
                    Intent A04 = AbstractC31171DnF.A04();
                    A04.putExtra("result_action_positive", false);
                    A04.putExtra("argument_requested_code", this.A00);
                    String str2 = this.A03;
                    if (str2 == null) {
                        str = "accessToken";
                    } else {
                        A04.putExtra("argument_access_token", str2);
                        Bundle bundle3 = this.A01;
                        if (bundle3 != null) {
                            A04.putExtra("argument_client_extras_bundle", bundle3);
                            AbstractC31180DnO.A0y(this, A04);
                            overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            return c09y.A04(A0A);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cal_tos";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.FOw, java.lang.Object] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String str;
        int A00 = C0f9.A00(-1272781869);
        this.A06 = new Object();
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A02 = c09y.A04(A0A);
            this.A00 = getIntent().getIntExtra("argument_requested_code", -1);
            String stringExtra = getIntent().getStringExtra("argument_access_token");
            if (stringExtra != null) {
                this.A03 = stringExtra;
                Bundle bundleExtra = getIntent().getBundleExtra("argument_client_extras_bundle");
                if (bundleExtra != null) {
                    this.A01 = bundleExtra;
                    super.onCreate(bundle);
                    AbstractC18680vv abstractC18680vv = this.A02;
                    if (abstractC18680vv == null) {
                        str = "_session";
                    } else {
                        Bundle bundle2 = this.A01;
                        str = "clientBundle";
                        if (bundle2 != null) {
                            String string = bundle2.getString("extra_cal_registration_source");
                            Bundle bundle3 = this.A01;
                            if (bundle3 != null) {
                                AbstractC35174FfR.A03(abstractC18680vv, AbstractC31174DnI.A0n(bundle3, "extra_cal_force_signup_with_fb_after_cp_claiming"), "upsell_impressions", string);
                                C0f9.A07(-1802316524, A00);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -2064843568;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1024674055;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 459384137;
        }
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
