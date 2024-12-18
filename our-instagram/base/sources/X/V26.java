package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.PaymentMethod;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteSaveAudienceEditResponse;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V26 extends AbstractC67958V3x {
    public final int A00;
    public final Object A01;

    public V26(C70399WUb c70399WUb, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = "";
        super.A01 = AbstractC31173DnH.A0g();
        super.A00 = c70399WUb;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        String str;
        String str2;
        IllegalStateException illegalStateException;
        int i2;
        String str3;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1767044746);
                super.onFail(abstractC115105If);
                AbstractC129685tX.A00(abstractC115105If, (InterfaceC24741Ir) this.A01);
                i = -775163345;
                C0f9.A0A(i, A0N);
                return;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1845163375);
                super.onFail(abstractC115105If);
                i = 2016007831;
                C0f9.A0A(i, A0N);
                return;
            case 2:
                A0N = C0f9.A03(2042407481);
                C14360o3.A0B(abstractC115105If, 0);
                C67968V4h c67968V4h = (C67968V4h) this.A01;
                FragmentActivity fragmentActivity = c67968V4h.A00;
                String string = fragmentActivity.getString(2131961896);
                if (string == null || string.length() == 0) {
                    string = AbstractC166997dE.A0p(fragmentActivity, 2131961896);
                }
                C9GR.A09(fragmentActivity, string);
                c67968V4h.A05.A0Z(c67968V4h.A06.BiZ().toString(), "update_draft", abstractC115105If.A01());
                c67968V4h.A01.A01.setIsLoading(false);
                super.onFail(abstractC115105If);
                i = 423919547;
                C0f9.A0A(i, A0N);
                return;
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 862061101);
                SpinnerImageView spinnerImageView = ((C67870V0b) this.A01).A08;
                if (spinnerImageView == null) {
                    str2 = "loadingSpinner";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                spinnerImageView.setLoadingStatus(C3T1.FAILED);
                super.onFail(abstractC115105If);
                i = 566667719;
                C0f9.A0A(i, A0N);
                return;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -414882163);
                C67867Uzy c67867Uzy = (C67867Uzy) this.A01;
                C70399WUb c70399WUb = c67867Uzy.A02;
                if (c70399WUb != null) {
                    c70399WUb.A0Z(VG4.A1Q.toString(), "delete_draft", abstractC115105If.A01());
                    String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(c67867Uzy), 2131970544);
                    Context requireContext = c67867Uzy.requireContext();
                    if (A0q.length() == 0) {
                        A0q = AbstractC25227BEk.A0v(c67867Uzy, 2131970544);
                    }
                    C9GR.A09(requireContext, A0q);
                    super.onFail(abstractC115105If);
                    i = 986760795;
                    C0f9.A0A(i, A0N);
                    return;
                }
                str2 = "promoteLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 5:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1486772980);
                C70399WUb.A00(((C66424UGt) this.A01).A03.A0y).A0M(VG4.A0z, "suggested_interest_search_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = -164899043;
                C0f9.A0A(i, A0N);
                return;
            case 6:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1296290106);
                C70399WUb.A00(((C66419UGo) this.A01).A03).A0M(VG4.A0z, "suggested_interest_search_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = -252256466;
                C0f9.A0A(i, A0N);
                return;
            case 7:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1867422205);
                V11 v11 = (V11) this.A01;
                C70399WUb c70399WUb2 = v11.A03;
                if (c70399WUb2 != null) {
                    c70399WUb2.A0M(VG4.A0B, "audience_fetch", abstractC115105If.A01());
                }
                V11.A06(v11);
                super.onFail(abstractC115105If);
                i = 1570830955;
                C0f9.A0A(i, A0N);
                return;
            case 8:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 708025198);
                C67872V0d c67872V0d = (C67872V0d) this.A01;
                AbstractC65702TsY.A0N(c67872V0d.A0Z).A0Z(VG4.A0X.toString(), "create_audience", abstractC115105If.A01());
                Context context = c67872V0d.getContext();
                if (context != null) {
                    AbstractC31173DnH.A13(context, c67872V0d, 2131970493);
                }
                super.onFail(abstractC115105If);
                i = -1801306870;
                C0f9.A0A(i, A0N);
                return;
            case 9:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1881208329);
                C67872V0d c67872V0d2 = (C67872V0d) this.A01;
                C70399WUb A0N2 = AbstractC65702TsY.A0N(c67872V0d2.A0Z);
                VG4 vg4 = (VG4) c67872V0d2.A0W.getValue();
                if (C67872V0d.A04(c67872V0d2)) {
                    str = "edit_audience";
                } else {
                    str = "create_audience";
                }
                A0N2.A0M(vg4, str, abstractC115105If.A01());
                C67872V0d.A00(c67872V0d2);
                C67872V0d.A01(c67872V0d2);
                super.onFail(abstractC115105If);
                i = -335893443;
                C0f9.A0A(i, A0N);
                return;
            case 10:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -799144771);
                C67872V0d c67872V0d3 = (C67872V0d) this.A01;
                AbstractC65702TsY.A0N(c67872V0d3.A0Z).A0Z(VG4.A0e.toString(), "edit_audience", abstractC115105If.A01());
                Context context2 = c67872V0d3.getContext();
                if (context2 != null) {
                    AbstractC31173DnH.A13(context2, c67872V0d3, 2131970655);
                }
                super.onFail(abstractC115105If);
                i = 28987780;
                C0f9.A0A(i, A0N);
                return;
            case 11:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 233440742);
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                C70399WUb c70399WUb3 = c67892V0z.A0B;
                if (c70399WUb3 != null) {
                    c70399WUb3.A0M(VG4.A0B, "audience_fetch", abstractC115105If.A01());
                }
                c67892V0z.A09();
                super.onFail(abstractC115105If);
                i = 747037110;
                C0f9.A0A(i, A0N);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 2004256240);
                C67892V0z c67892V0z2 = (C67892V0z) this.A01;
                C70399WUb c70399WUb4 = c67892V0z2.A0B;
                if (c70399WUb4 != null) {
                    c70399WUb4.A0M(VG4.A1Q, "tax_payment_fetch", abstractC115105If.A01());
                }
                if (c67892V0z2.getActivity() != null) {
                    AbstractC10360h2 abstractC10360h2 = c67892V0z2.mFragmentManager;
                    if (abstractC10360h2 != null) {
                        abstractC10360h2.A12();
                        AbstractC65702TsY.A0q();
                        Bundle bundle = new Bundle();
                        bundle.putString("error_title", null);
                        bundle.putString(TraceFieldType.Error, null);
                        bundle.putString("error_type", "unknown_error");
                        bundle.putString("ad_account_id", null);
                        V0Y v0y = new V0Y();
                        v0y.setArguments(bundle);
                        FragmentActivity requireActivity = c67892V0z2.requireActivity();
                        UserSession userSession = c67892V0z2.A0H;
                        if (userSession == null) {
                            str2 = "userSession";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        AbstractC31177DnL.A0w(null, v0y, requireActivity, userSession);
                        super.onFail(abstractC115105If);
                        i = -67335643;
                        C0f9.A0A(i, A0N);
                        return;
                    }
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = 697877793;
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = -1909975130;
                }
                C0f9.A0A(i2, A0N);
                throw illegalStateException;
            default:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1410209733);
                Throwable A01 = abstractC115105If.A01();
                String str4 = "";
                if (A01 == null) {
                    str3 = "";
                } else {
                    str3 = A01.getMessage();
                }
                V09 v09 = (V09) this.A01;
                C70399WUb c70399WUb5 = v09.A00;
                if (c70399WUb5 != null) {
                    String obj = VG4.A17.toString();
                    if (str3 != null) {
                        str4 = str3;
                    }
                    C70399WUb.A08(c70399WUb5, obj, "save_draft", str4, null, V09.A00(v09));
                    String A0q2 = AbstractC166997dE.A0q(AbstractC166997dE.A0N(v09), 2131970931);
                    Context requireContext2 = v09.requireContext();
                    if (A0q2.length() == 0) {
                        A0q2 = AbstractC25227BEk.A0v(v09, 2131970931);
                    }
                    C9GR.A09(requireContext2, A0q2);
                    super.onFail(abstractC115105If);
                    i = -380176493;
                    C0f9.A0A(i, A0N);
                    return;
                }
                str2 = "promoteLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        int A032;
        int i2;
        switch (this.A00) {
            case 1:
                A032 = C0f9.A03(-1172610834);
                super.onFinish();
                V12 v12 = (V12) this.A01;
                v12.A0C = false;
                V12.A08(v12);
                i2 = -158526725;
                C0f9.A0A(i2, A032);
                return;
            case 2:
            case 5:
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                super.onFinish();
                return;
            case 3:
                A03 = C0f9.A03(2010134724);
                super.onFinish();
                SpinnerImageView spinnerImageView = ((C67870V0b) this.A01).A08;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                    i = 1254597034;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(1271628951);
                C67867Uzy c67867Uzy = (C67867Uzy) this.A01;
                View view = c67867Uzy.A01;
                if (view == null) {
                    str = "discardButtonRow";
                } else {
                    view.setClickable(true);
                    View view2 = c67867Uzy.A00;
                    if (view2 == null) {
                        str = "cancelButtonRow";
                    } else {
                        view2.setClickable(true);
                        i = 2024676257;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A032 = C0f9.A03(750104621);
                super.onFinish();
                V11 v11 = (V11) this.A01;
                C69655Vsw c69655Vsw = v11.A05;
                if (c69655Vsw != null) {
                    str = "createAudienceRow";
                    int i3 = 8;
                    SpinnerImageView spinnerImageView2 = v11.A08;
                    if (spinnerImageView2 != null) {
                        spinnerImageView2.setLoadingStatus(C3T1.SUCCESS);
                    }
                    c69655Vsw.A08.setVisibility(0);
                    View view3 = v11.A00;
                    if (view3 != null) {
                        if (!V11.A00(v11).A0C() && !V11.A00(v11).A21.contains(SpecialRequirementCategory.A08)) {
                            i3 = 0;
                        }
                        view3.setVisibility(i3);
                        C70813WhW c70813WhW = (C70813WhW) v11.A0M.getValue();
                        long j = c70813WhW.A00;
                        if (j != 0) {
                            c70813WhW.A01.flowMarkPoint(j, "promote_audience_audience_list_radio_group_rendered");
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C70813WhW c70813WhW2 = (C70813WhW) v11.A0M.getValue();
                long j2 = c70813WhW2.A00;
                if (j2 != 0) {
                    c70813WhW2.A01.flowMarkPoint(j2, "promote_audience_list_rendered");
                }
                i2 = 365985457;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A03 = C0f9.A03(-1022709377);
                super.onFinish();
                FRW frw = ((C67872V0d) this.A01).A0P;
                if (frw != null) {
                    frw.A01.setIsLoading(false);
                    i = 1670097077;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                A03 = C0f9.A03(680425071);
                super.onFinish();
                SpinnerImageView spinnerImageView3 = ((C67872V0d) this.A01).A0R;
                if (spinnerImageView3 != null) {
                    spinnerImageView3.setLoadingStatus(C3T1.SUCCESS);
                    i = -295032494;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                A03 = C0f9.A03(1958685371);
                super.onFinish();
                FRW frw2 = ((C67872V0d) this.A01).A0P;
                if (frw2 != null) {
                    frw2.A01.setIsLoading(false);
                    i = -918356606;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 11:
                A03 = C0f9.A03(1173321669);
                super.onFinish();
                C67892V0z.A02((C67892V0z) this.A01);
                i = 679204123;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(281169133);
                V09.A01((V09) this.A01, true);
                i = -466479604;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onStart() {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(155745621);
                super.onStart();
                V12 v12 = (V12) this.A01;
                v12.A0C = true;
                V12.A08(v12);
                i = 596159800;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-1339406057);
                super.onStart();
                ((C67968V4h) this.A01).A01.A01.setIsLoading(true);
                i = -1085981358;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-105224223);
                super.onStart();
                SpinnerImageView spinnerImageView = ((C67870V0b) this.A01).A08;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                    i = 245214550;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
            case 5:
            case 6:
            default:
                super.onStart();
                return;
            case 7:
                A03 = C0f9.A03(-1869333756);
                super.onStart();
                V11 v11 = (V11) this.A01;
                C69655Vsw c69655Vsw = v11.A05;
                if (c69655Vsw != null) {
                    str = "createAudienceRow";
                    c69655Vsw.A08.setVisibility(8);
                    View view = v11.A00;
                    if (view != null) {
                        view.setVisibility(8);
                        SpinnerImageView spinnerImageView2 = v11.A08;
                        if (spinnerImageView2 != null) {
                            spinnerImageView2.setLoadingStatus(C3T1.LOADING);
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 1306578435;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(-1186903302);
                super.onStart();
                FRW frw = ((C67872V0d) this.A01).A0P;
                if (frw != null) {
                    frw.A01.setIsLoading(true);
                    i = 130061422;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                A03 = C0f9.A03(438875008);
                super.onStart();
                SpinnerImageView spinnerImageView3 = ((C67872V0d) this.A01).A0R;
                if (spinnerImageView3 != null) {
                    spinnerImageView3.setLoadingStatus(C3T1.LOADING);
                    i = 535968218;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "loadingSpinner";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                A03 = C0f9.A03(335733141);
                super.onStart();
                FRW frw2 = ((C67872V0d) this.A01).A0P;
                if (frw2 != null) {
                    frw2.A01.setIsLoading(true);
                    i = 1737975631;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "actionBarButtonController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:200:0x05ef. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, X.VIy] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object, X.VIy] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        ImmutableList copyOf;
        ImmutableList copyOf2;
        int i;
        ImmutableList copyOf3;
        ImmutableList copyOf4;
        int A032;
        int A033;
        int i2;
        IllegalStateException illegalStateException;
        int i3;
        int A034;
        int i4;
        ImmutableList of;
        V11 v11;
        ImmutableList of2;
        String str;
        int A0N;
        ImmutableList of3;
        C67892V0z c67892V0z;
        String str2;
        ImmutableList of4;
        Map map;
        String str3;
        IllegalStateException illegalStateException2;
        int i5;
        String str4;
        String str5;
        Map A0E;
        String str6;
        MUW muw;
        C70399WUb c70399WUb;
        VG4 vg4;
        PaymentMethod paymentMethod;
        String str7;
        MUW muw2;
        XDE xde;
        int ordinal;
        int A035;
        int i6;
        String str8;
        switch (this.A00) {
            case 0:
                A035 = C0f9.A03(1504425993);
                InterfaceC40821up interfaceC40821up = (C40781ul) obj;
                int A0N2 = AbstractC167017dG.A0N(interfaceC40821up, 2051668792);
                A01(interfaceC40821up);
                AbstractC129685tX.A00(new C115115Ig(interfaceC40821up), (InterfaceC24741Ir) this.A01);
                C0f9.A0A(2058254866, A0N2);
                i6 = 1891844771;
                C0f9.A0A(i6, A035);
                return;
            case 1:
                int A036 = C0f9.A03(330688464);
                H9L h9l = (H9L) obj;
                int A037 = C0f9.A03(-986483933);
                C14360o3.A0B(h9l, 0);
                V12 v12 = (V12) this.A01;
                PromoteData promoteData = v12.A08;
                str4 = "promoteData";
                str5 = "promoteData";
                if (promoteData != null) {
                    promoteData.A05 = 0;
                    promoteData.A0J = 0;
                    promoteData.A0B = 0;
                    promoteData.A0K = 0;
                    promoteData.A0L = 0;
                    JIS jis = h9l.A00;
                    if (jis == null) {
                        str5 = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                    } else {
                        C66631UQh c66631UQh = (C66631UQh) jis;
                        promoteData.A03 = AbstractC167017dG.A0K(c66631UQh.A00);
                        promoteData.A0C = AbstractC167017dG.A0K(c66631UQh.A01);
                        List list = c66631UQh.A03;
                        if (list != null) {
                            promoteData.A1y = list;
                        }
                        List list2 = c66631UQh.A02;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                H2T h2t = (H2T) ((JIR) it.next());
                                List list3 = h2t.A02;
                                if (list3 != null) {
                                    A0E = new LinkedHashMap(AbstractC50522MSa.A09(list3));
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        UQp uQp = (UQp) ((JIV) it2.next());
                                        AbstractC37301Gc2.A1T(Integer.valueOf(uQp.A01), A0E, uQp.A00);
                                    }
                                } else {
                                    A0E = AbstractC06930Yk.A0E();
                                }
                                switch (h2t.A00.ordinal()) {
                                    case 1:
                                        PromoteData promoteData2 = v12.A08;
                                        if (promoteData2 == null) {
                                            break;
                                        } else {
                                            promoteData2.A0B = AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(A0E, 1));
                                        }
                                    case 2:
                                        PromoteData promoteData3 = v12.A08;
                                        if (promoteData3 == null) {
                                            break;
                                        } else {
                                            promoteData3.A23 = A0E;
                                        }
                                    case 3:
                                        PromoteData promoteData4 = v12.A08;
                                        if (promoteData4 == null) {
                                            break;
                                        } else {
                                            promoteData4.A05 = AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(A0E, 1));
                                        }
                                    case 4:
                                    case 5:
                                        Map.Entry entry = (Map.Entry) AbstractC001800i.A0A(A0E.entrySet());
                                        if (entry != null) {
                                            PromoteData promoteData5 = v12.A08;
                                            if (promoteData5 == null) {
                                                break;
                                            } else {
                                                promoteData5.A0B(AbstractC43593JPy.A04(entry));
                                                PromoteData promoteData6 = v12.A08;
                                                if (promoteData6 == null) {
                                                    break;
                                                } else {
                                                    int intValue = ((Number) entry.getKey()).intValue();
                                                    PromoteData promoteData7 = v12.A08;
                                                    if (promoteData7 == null) {
                                                        break;
                                                    } else {
                                                        List list4 = promoteData7.A1o;
                                                        if (!list4.isEmpty()) {
                                                            int A01 = AbstractC31176DnK.A01(list4, 0);
                                                            int abs = Math.abs(intValue - A01);
                                                            Iterator it3 = list4.iterator();
                                                            while (it3.hasNext()) {
                                                                int A0B = AbstractC167007dF.A0B(it3);
                                                                int abs2 = Math.abs(intValue - A0B);
                                                                if (abs2 <= abs) {
                                                                    A01 = A0B;
                                                                    abs = abs2;
                                                                } else {
                                                                    promoteData6.A09 = A01;
                                                                }
                                                            }
                                                            promoteData6.A09 = A01;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    case 7:
                                        PromoteData promoteData8 = v12.A08;
                                        if (promoteData8 == null) {
                                            break;
                                        } else {
                                            promoteData8.A0Z = h2t.A01;
                                        }
                                    case 8:
                                        PromoteData promoteData9 = v12.A08;
                                        if (promoteData9 == null) {
                                            break;
                                        } else {
                                            promoteData9.A0J = AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(A0E, 1));
                                        }
                                    case 9:
                                        PromoteData promoteData10 = v12.A08;
                                        if (promoteData10 == null) {
                                            break;
                                        } else {
                                            promoteData10.A0K = AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(A0E, 1));
                                        }
                                    case 10:
                                        PromoteData promoteData11 = v12.A08;
                                        if (promoteData11 == null) {
                                            break;
                                        } else {
                                            promoteData11.A0L = AbstractC167017dG.A0K((Number) AbstractC166997dE.A0m(A0E, 1));
                                        }
                                }
                            }
                        }
                        WCx wCx = WCx.A00;
                        PromoteData promoteData12 = v12.A08;
                        if (promoteData12 != null) {
                            wCx.A01(promoteData12);
                            View view = v12.mView;
                            if (view != null) {
                                V12.A05(view, v12);
                                V12.A06(v12);
                                A01(h9l);
                                C0f9.A0A(-1546673824, A037);
                                C0f9.A0A(925099590, A036);
                                return;
                            }
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0A(-1628521378, A037);
                            throw A0g;
                        }
                    }
                    C14360o3.A0F(str5);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 2:
                A032 = C0f9.A03(937104078);
                C67811Uyk c67811Uyk = (C67811Uyk) obj;
                A033 = C0f9.A03(500624675);
                C14360o3.A0B(c67811Uyk, 0);
                C67968V4h c67968V4h = (C67968V4h) this.A01;
                c67968V4h.A01.A01.setIsLoading(false);
                UPA upa = c67811Uyk.A00;
                C70399WUb c70399WUb2 = c67968V4h.A05;
                String obj2 = c67968V4h.A06.BiZ().toString();
                if (upa != null) {
                    c70399WUb2.A0V(obj2, "update_draft", upa.A03);
                    UPA upa2 = c67811Uyk.A00;
                    if (upa2 != null) {
                        String str9 = upa2.A02;
                        FragmentActivity fragmentActivity = c67968V4h.A00;
                        if (str9 == null || str9.length() == 0) {
                            str9 = AbstractC166997dE.A0p(fragmentActivity, 2131961896);
                        }
                        C9GR.A09(fragmentActivity, str9);
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i3 = -22891705;
                        C0f9.A0A(i3, A033);
                        throw illegalStateException;
                    }
                } else {
                    c70399WUb2.A0S(obj2, "update_draft");
                    PromoteData promoteData13 = c67968V4h.A02;
                    PromoteState.A00(promoteData13);
                    promoteData13.A2x = true;
                    c67968V4h.A00.onBackPressed();
                }
                A01(c67811Uyk);
                C0f9.A0A(-65573837, A033);
                i2 = -314478921;
                C0f9.A0A(i2, A032);
                return;
            case 3:
                A034 = C0f9.A03(-143662810);
                PromoteAudienceInfo promoteAudienceInfo = (PromoteAudienceInfo) obj;
                int A0N3 = AbstractC167017dG.A0N(promoteAudienceInfo, 1408426903);
                C67870V0b c67870V0b = (C67870V0b) this.A01;
                PromoteData promoteData14 = c67870V0b.A05;
                if (promoteData14 != null) {
                    promoteData14.A0p = promoteAudienceInfo;
                    C67870V0b.A00(c67870V0b);
                    A01(promoteAudienceInfo);
                    C0f9.A0A(1904717097, A0N3);
                    i4 = -2065994708;
                    C0f9.A0A(i4, A034);
                    return;
                }
                str2 = "promoteData";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                A035 = C0f9.A03(-1560950571);
                C67806Uyf c67806Uyf = (C67806Uyf) obj;
                A0N = AbstractC167017dG.A0N(c67806Uyf, -1505409307);
                UPA upa3 = c67806Uyf.A00;
                str2 = "promoteLogger";
                C67867Uzy c67867Uzy = (C67867Uzy) this.A01;
                if (upa3 != null) {
                    C70399WUb c70399WUb3 = c67867Uzy.A02;
                    if (c70399WUb3 != null) {
                        c70399WUb3.A0V(VG4.A1Q.toString(), "delete_draft", upa3.A03);
                        UPA upa4 = c67806Uyf.A00;
                        if (upa4 != null) {
                            String str10 = upa4.A02;
                            Context requireContext = c67867Uzy.requireContext();
                            if (str10 == null || str10.length() == 0) {
                                str10 = AbstractC25227BEk.A0v(c67867Uzy, 2131970544);
                            }
                            C9GR.A09(requireContext, str10);
                            AbstractC25226BEj.A1Q(c67867Uzy);
                            A01(c67806Uyf);
                            C0f9.A0A(1945853894, A0N);
                            i6 = -2110626056;
                            C0f9.A0A(i6, A035);
                            return;
                        }
                        illegalStateException2 = new IllegalStateException("Required value was null.");
                        i5 = -1799593049;
                        C0f9.A0A(i5, A0N);
                        throw illegalStateException2;
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C70399WUb c70399WUb4 = c67867Uzy.A02;
                if (c70399WUb4 != null) {
                    c70399WUb4.A0S(VG4.A1Q.toString(), "delete_draft");
                    PromoteData promoteData15 = c67867Uzy.A04;
                    if (promoteData15 != null) {
                        promoteData15.A2x = true;
                        AbstractC25227BEk.A1B(c67867Uzy);
                        A01(c67806Uyf);
                        C0f9.A0A(1945853894, A0N);
                        i6 = -2110626056;
                        C0f9.A0A(i6, A035);
                        return;
                    }
                    str2 = "promoteData";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(-960680361);
                C67826Uyz c67826Uyz = (C67826Uyz) obj;
                int A0N4 = AbstractC167017dG.A0N(c67826Uyz, 1877713401);
                C66424UGt c66424UGt = (C66424UGt) this.A01;
                UserSession userSession = c66424UGt.A03.A0y;
                C70399WUb.A00(userSession).A0E(VG4.A0z, "suggested_interest_search_fetch");
                List list5 = c67826Uyz.A01;
                if (list5 == null) {
                    copyOf = ImmutableList.of();
                } else {
                    copyOf = ImmutableList.copyOf((Collection) list5);
                }
                c66424UGt.A00 = copyOf;
                List list6 = c67826Uyz.A00;
                if (list6 == null) {
                    copyOf2 = ImmutableList.of();
                } else {
                    copyOf2 = ImmutableList.copyOf((Collection) list6);
                }
                C14360o3.A07(copyOf2);
                if (!copyOf2.isEmpty()) {
                    List list7 = c66424UGt.A06;
                    if (list7.isEmpty()) {
                        C14360o3.A06(userSession);
                        if (C18U.A06(C06090Tz.A05, userSession, 36312389414552676L)) {
                            list7.addAll(copyOf2);
                            c66424UGt.A04.addAll(copyOf2);
                        }
                    }
                }
                c66424UGt.A01();
                A01(c67826Uyz);
                C0f9.A0A(-1571574814, A0N4);
                i = -1079519981;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(-873216910);
                C67826Uyz c67826Uyz2 = (C67826Uyz) obj;
                int A038 = C0f9.A03(2031880500);
                C14360o3.A0B(c67826Uyz2, 0);
                C66419UGo c66419UGo = (C66419UGo) this.A01;
                UserSession userSession2 = c66419UGo.A03;
                C70399WUb.A00(userSession2).A0E(VG4.A0z, "suggested_interest_search_fetch");
                List list8 = c67826Uyz2.A01;
                if (list8 == null) {
                    copyOf3 = ImmutableList.of();
                } else {
                    copyOf3 = ImmutableList.copyOf((Collection) list8);
                }
                c66419UGo.A00 = copyOf3;
                List list9 = c67826Uyz2.A00;
                if (list9 == null) {
                    copyOf4 = ImmutableList.of();
                } else {
                    copyOf4 = ImmutableList.copyOf((Collection) list9);
                }
                C14360o3.A07(copyOf4);
                if (!copyOf4.isEmpty()) {
                    List list10 = c66419UGo.A08;
                    if (list10.isEmpty()) {
                        C14360o3.A0B(userSession2, 0);
                        if (C18U.A06(C06090Tz.A05, userSession2, 36312389414552676L)) {
                            list10.addAll(copyOf4);
                            c66419UGo.A06.addAll(copyOf4);
                        }
                    }
                }
                c66419UGo.A00();
                A01(c67826Uyz2);
                C0f9.A0A(-1398124682, A038);
                i = -1150399838;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A032 = C0f9.A03(-1490502003);
                C67832Uz5 c67832Uz5 = (C67832Uz5) obj;
                A033 = AbstractC167017dG.A0N(c67832Uz5, 785890367);
                UPA upa5 = c67832Uz5.A00;
                if (upa5 != null) {
                    v11 = (V11) this.A01;
                    C70399WUb c70399WUb5 = v11.A03;
                    if (c70399WUb5 != null) {
                        c70399WUb5.A0J(VG4.A0B, "audience_fetch", upa5.A03);
                    }
                    if (upa5.A01 == ErrorIdentifier.A0W) {
                        C146106i8 c146106i8 = new C146106i8();
                        c146106i8.A05();
                        c146106i8.A0H = "promote_audience_deprecated_interests_warning";
                        c146106i8.A0D = upa5.A02;
                        c146106i8.A06();
                        AbstractC25233BEq.A1F(c146106i8);
                        A01(c67832Uz5);
                        C0f9.A0A(961598107, A033);
                        i2 = 1067279499;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                    V11.A06(v11);
                    A01(c67832Uz5);
                    C0f9.A0A(961598107, A033);
                    i2 = 1067279499;
                    C0f9.A0A(i2, A032);
                    return;
                }
                List list11 = c67832Uz5.A01;
                if (list11 != null) {
                    of = ImmutableList.copyOf((Collection) list11);
                } else {
                    of = ImmutableList.of();
                }
                v11 = (V11) this.A01;
                if (of == null) {
                    C70399WUb c70399WUb6 = v11.A03;
                    if (c70399WUb6 != null) {
                        c70399WUb6.A0J(VG4.A0B, "audience_fetch", "available audience is empty");
                    }
                    V11.A06(v11);
                    A01(c67832Uz5);
                    C0f9.A0A(961598107, A033);
                    i2 = 1067279499;
                    C0f9.A0A(i2, A032);
                    return;
                }
                V11.A00(v11).A2r = c67832Uz5.A02;
                PromoteData A00 = V11.A00(v11);
                List list12 = c67832Uz5.A01;
                if (list12 != null) {
                    of2 = ImmutableList.copyOf((Collection) list12);
                } else {
                    of2 = ImmutableList.of();
                }
                A00.A1m = of2;
                List<PromoteAudience> list13 = V11.A00(v11).A1m;
                C14360o3.A06(list13);
                for (PromoteAudience promoteAudience : list13) {
                    boolean A0P = WGs.A0P(promoteAudience);
                    Map map2 = V11.A00(v11).A22;
                    if (A0P) {
                        C14360o3.A06(map2);
                        BoostedPostAudienceOption boostedPostAudienceOption = promoteAudience.A03;
                        if (boostedPostAudienceOption != null) {
                            str = boostedPostAudienceOption.toString();
                            map2.put(str, promoteAudience);
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i3 = 899323671;
                            C0f9.A0A(i3, A033);
                            throw illegalStateException;
                        }
                    } else {
                        C14360o3.A06(map2);
                        str = promoteAudience.A05;
                        if (str != null) {
                            map2.put(str, promoteAudience);
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i3 = 1536033171;
                            C0f9.A0A(i3, A033);
                            throw illegalStateException;
                        }
                    }
                }
                C70399WUb c70399WUb7 = v11.A03;
                if (c70399WUb7 != null) {
                    c70399WUb7.A0X(VG4.A0B.toString(), "audience_fetch", V11.A00(v11).A22.keySet().toString());
                }
                ((PromoteState) v11.A0L.getValue()).A0C(true);
                A01(c67832Uz5);
                C0f9.A0A(961598107, A033);
                i2 = 1067279499;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A035 = C0f9.A03(951849785);
                PromoteCreateAudienceResponse promoteCreateAudienceResponse = (PromoteCreateAudienceResponse) obj;
                int A039 = C0f9.A03(1824849618);
                C14360o3.A0B(promoteCreateAudienceResponse, 0);
                UPA upa6 = promoteCreateAudienceResponse.A00;
                C67872V0d c67872V0d = (C67872V0d) this.A01;
                if (upa6 == null) {
                    InterfaceC09390do interfaceC09390do = c67872V0d.A0a;
                    ((PromoteState) interfaceC09390do.getValue()).A0C(false);
                    InterfaceC09390do interfaceC09390do2 = c67872V0d.A0Z;
                    AbstractC65702TsY.A0N(interfaceC09390do2).A0S(VG4.A0X.toString(), "create_audience");
                    PromoteState promoteState = (PromoteState) interfaceC09390do.getValue();
                    InterfaceC09390do interfaceC09390do3 = c67872V0d.A0Y;
                    promoteState.A09((PromoteData) AbstractC166987dD.A17(interfaceC09390do3), promoteCreateAudienceResponse.A01);
                    AbstractC65702TsY.A0N(interfaceC09390do2).A0C((VG4) c67872V0d.A0W.getValue(), (PromoteData) AbstractC166987dD.A17(interfaceC09390do3));
                    AbstractC25226BEj.A1Q(c67872V0d);
                } else {
                    C70399WUb.A08(AbstractC65702TsY.A0N(c67872V0d.A0Z), VG4.A0X.toString(), "create_audience", upa6.A03, upa6.A01.toString(), null);
                    C9GR.A03(c67872V0d.getContext(), upa6.A02, null, 0);
                }
                A01(promoteCreateAudienceResponse);
                C0f9.A0A(-358582863, A039);
                i6 = -416782886;
                C0f9.A0A(i6, A035);
                return;
            case 9:
                A035 = C0f9.A03(-1280421880);
                PromoteAudienceInfo promoteAudienceInfo2 = (PromoteAudienceInfo) obj;
                int A0N5 = AbstractC167017dG.A0N(promoteAudienceInfo2, 1605307133);
                C67872V0d c67872V0d2 = (C67872V0d) this.A01;
                C70399WUb A0N6 = AbstractC65702TsY.A0N(c67872V0d2.A0Z);
                VG4 vg42 = (VG4) c67872V0d2.A0W.getValue();
                if (C67872V0d.A04(c67872V0d2)) {
                    str8 = "edit_audience";
                } else {
                    str8 = "create_audience";
                }
                A0N6.A0E(vg42, str8);
                ((PromoteData) AbstractC166987dD.A17(c67872V0d2.A0Y)).A0q = promoteAudienceInfo2;
                C67872V0d.A00(c67872V0d2);
                C67872V0d.A01(c67872V0d2);
                A01(promoteAudienceInfo2);
                C0f9.A0A(-667252288, A0N5);
                i6 = 983045580;
                C0f9.A0A(i6, A035);
                return;
            case 10:
                A035 = C0f9.A03(1070927283);
                PromoteSaveAudienceEditResponse promoteSaveAudienceEditResponse = (PromoteSaveAudienceEditResponse) obj;
                int A0310 = C0f9.A03(1512635465);
                C14360o3.A0B(promoteSaveAudienceEditResponse, 0);
                boolean z = promoteSaveAudienceEditResponse.A00;
                C67872V0d c67872V0d3 = (C67872V0d) this.A01;
                if (z) {
                    ((PromoteState) c67872V0d3.A0a.getValue()).A0C(false);
                    AbstractC65702TsY.A0N(c67872V0d3.A0Z).A0C((VG4) c67872V0d3.A0W.getValue(), (PromoteData) AbstractC166987dD.A17(c67872V0d3.A0Y));
                    AbstractC25226BEj.A1Q(c67872V0d3);
                } else {
                    AbstractC65702TsY.A0N(c67872V0d3.A0Z).A0V(VG4.A0e.toString(), "edit_audience", "");
                }
                A01(promoteSaveAudienceEditResponse);
                C0f9.A0A(910348221, A0310);
                i6 = 1844216972;
                C0f9.A0A(i6, A035);
                return;
            case 11:
                int A0311 = C0f9.A03(567743909);
                C67832Uz5 c67832Uz52 = (C67832Uz5) obj;
                A0N = AbstractC167017dG.A0N(c67832Uz52, -1964248624);
                UPA upa7 = c67832Uz52.A00;
                if (upa7 != null) {
                    c67892V0z = (C67892V0z) this.A01;
                    C70399WUb c70399WUb8 = c67892V0z.A0B;
                    if (c70399WUb8 != null) {
                        VG4 vg43 = VG4.A0B;
                        String str11 = upa7.A03;
                        if (str11 == null) {
                            str11 = "";
                        }
                        c70399WUb8.A0J(vg43, "audience_fetch", str11);
                    }
                    if (upa7.A01 == ErrorIdentifier.A0W) {
                        C146106i8 c146106i82 = new C146106i8();
                        c146106i82.A05();
                        c146106i82.A0H = "promote_deprecated_interests_warning";
                        c146106i82.A0D = upa7.A02;
                        c146106i82.A06();
                        AbstractC25233BEq.A1F(c146106i82);
                    }
                    c67892V0z.A09();
                } else {
                    List list14 = c67832Uz52.A01;
                    if (list14 != null) {
                        of3 = ImmutableList.copyOf((Collection) list14);
                    } else {
                        of3 = ImmutableList.of();
                    }
                    c67892V0z = (C67892V0z) this.A01;
                    if (of3 == null) {
                        C70399WUb c70399WUb9 = c67892V0z.A0B;
                        if (c70399WUb9 != null) {
                            c70399WUb9.A0J(VG4.A0B, "audience_fetch", "available audience is empty");
                        }
                        c67892V0z.A09();
                    } else {
                        PromoteData promoteData16 = c67892V0z.A0F;
                        str2 = "promoteData";
                        if (promoteData16 != null) {
                            promoteData16.A2r = c67832Uz52.A02;
                            List list15 = c67832Uz52.A01;
                            if (list15 != null) {
                                of4 = ImmutableList.copyOf((Collection) list15);
                            } else {
                                of4 = ImmutableList.of();
                            }
                            promoteData16.A1m = of4;
                            PromoteData promoteData17 = c67892V0z.A0F;
                            if (promoteData17 != null) {
                                Iterator it4 = promoteData17.A1m.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        PromoteAudience promoteAudience2 = (PromoteAudience) it4.next();
                                        boolean A0P2 = WGs.A0P(promoteAudience2);
                                        PromoteData promoteData18 = c67892V0z.A0F;
                                        if (A0P2) {
                                            if (promoteData18 != null) {
                                                map = promoteData18.A22;
                                                C14360o3.A06(map);
                                                BoostedPostAudienceOption boostedPostAudienceOption2 = promoteAudience2.A03;
                                                if (boostedPostAudienceOption2 != null) {
                                                    str3 = boostedPostAudienceOption2.toString();
                                                    map.put(str3, promoteAudience2);
                                                } else {
                                                    illegalStateException2 = new IllegalStateException("Required value was null.");
                                                    i5 = 712324110;
                                                    break;
                                                }
                                            }
                                        } else if (promoteData18 != null) {
                                            map = promoteData18.A22;
                                            C14360o3.A06(map);
                                            str3 = promoteAudience2.A05;
                                            if (str3 != null) {
                                                map.put(str3, promoteAudience2);
                                            } else {
                                                illegalStateException2 = new IllegalStateException("Required value was null.");
                                                i5 = -1440952923;
                                                break;
                                            }
                                        }
                                        throw C00O.createAndThrow();
                                    }
                                    C70399WUb c70399WUb10 = c67892V0z.A0B;
                                    if (c70399WUb10 != null) {
                                        String obj3 = VG4.A0B.toString();
                                        PromoteData promoteData19 = c67892V0z.A0F;
                                        if (promoteData19 != null) {
                                            c70399WUb10.A0X(obj3, "audience_fetch", promoteData19.A22.keySet().toString());
                                        }
                                    }
                                    PromoteState promoteState2 = c67892V0z.A0G;
                                    if (promoteState2 == null) {
                                        str2 = "promoteState";
                                    } else {
                                        promoteState2.A0C(true);
                                        C67892V0z.A02(c67892V0z);
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                }
                A01(c67832Uz52);
                C0f9.A0A(1230677560, A0N);
                C0f9.A0A(338998790, A0311);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A034 = C0f9.A03(850381676);
                C38852H9a c38852H9a = (C38852H9a) obj;
                int A0312 = C0f9.A03(-1278605528);
                C14360o3.A0B(c38852H9a, 0);
                C67892V0z c67892V0z2 = (C67892V0z) this.A01;
                FragmentActivity activity = c67892V0z2.getActivity();
                if (activity != 0) {
                    UPP upp = c38852H9a.A08;
                    if (upp == null) {
                        str6 = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                    } else {
                        UPA upa8 = upp.A07;
                        if (upa8 != null && (ordinal = upa8.A01.ordinal()) != 37 && ordinal != 34 && ordinal != 35 && ordinal != 38 && ordinal != 36) {
                            C70399WUb c70399WUb11 = c67892V0z2.A0B;
                            if (c70399WUb11 != null) {
                                c70399WUb11.A0J(VG4.A1Q, "tax_payment_fetch", upa8.A03);
                            }
                            AbstractC10360h2 abstractC10360h2 = c67892V0z2.mFragmentManager;
                            if (abstractC10360h2 != null) {
                                abstractC10360h2.A12();
                                AbstractC65702TsY.A0q();
                                ErrorIdentifier errorIdentifier = ErrorIdentifier.A18;
                                Bundle bundle = new Bundle();
                                bundle.putString("error_title", null);
                                bundle.putString(TraceFieldType.Error, null);
                                bundle.putString("error_type", errorIdentifier.toString());
                                bundle.putString("ad_account_id", null);
                                V0Y v0y = new V0Y();
                                v0y.setArguments(bundle);
                                UserSession userSession3 = c67892V0z2.A0H;
                                if (userSession3 == null) {
                                    str6 = "userSession";
                                } else {
                                    AbstractC31177DnL.A0w(null, v0y, activity, userSession3);
                                    A01(c38852H9a);
                                    if (activity instanceof XDE) {
                                        xde.Cn9("promote_review", VG4.A1Q.toString());
                                    }
                                }
                            } else {
                                IllegalStateException A0g2 = AbstractC166997dE.A0g();
                                C0f9.A0A(1797142648, A0312);
                                throw A0g2;
                            }
                        } else {
                            C70399WUb c70399WUb12 = c67892V0z2.A0B;
                            if (c70399WUb12 != null) {
                                c70399WUb12.A0E(VG4.A1Q, "tax_payment_fetch");
                            }
                            PromoteState promoteState3 = c67892V0z2.A0G;
                            if (promoteState3 == null) {
                                str6 = "promoteState";
                            } else {
                                if (!promoteState3.A08) {
                                    promoteState3.A08 = true;
                                    PromoteState.A01(promoteState3, C05F.A06);
                                }
                                PromoteData promoteData20 = c67892V0z2.A0F;
                                str6 = "promoteData";
                                if (promoteData20 != null) {
                                    promoteData20.A0M = upp.A00;
                                    promoteData20.A0X = upp.A06;
                                    promoteData20.A0Y = upa8;
                                    promoteData20.A0W = upp.A05;
                                    promoteData20.A1T = upp.A08;
                                    promoteData20.A0P = upp.A03;
                                    promoteData20.A0N = upp.A02;
                                    C50627MWo c50627MWo = upp.A01;
                                    if (c50627MWo != null) {
                                        muw = (MUW) c50627MWo.A00;
                                    } else {
                                        muw = null;
                                    }
                                    promoteData20.A0O = muw;
                                    str5 = "reviewScreenContentView";
                                    str4 = "loadingSpinner";
                                    SpinnerImageView spinnerImageView = c67892V0z2.A0K;
                                    if (spinnerImageView != null) {
                                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                                        View view2 = c67892V0z2.A07;
                                        if (view2 != null) {
                                            view2.setVisibility(0);
                                            PromoteData promoteData21 = c67892V0z2.A0F;
                                            if (promoteData21 != null) {
                                                promoteData21.A0Q = upp.A04;
                                                IgdsStepperHeader igdsStepperHeader = c67892V0z2.A0J;
                                                if (igdsStepperHeader == null) {
                                                    str6 = "stepperHeader";
                                                } else {
                                                    igdsStepperHeader.A01();
                                                    C67892V0z.A04(c67892V0z2);
                                                    C69648Vsp c69648Vsp = c67892V0z2.A0E;
                                                    if (c69648Vsp == null) {
                                                        str6 = "paymentInformationController";
                                                    } else {
                                                        PromoteData promoteData22 = c69648Vsp.A04;
                                                        MUW muw3 = promoteData22.A0O;
                                                        FundingSourceType fundingSourceType = null;
                                                        if (muw3 != null && muw3.A00 != null) {
                                                            c70399WUb = c69648Vsp.A02;
                                                            vg4 = c69648Vsp.A01;
                                                            c70399WUb.A0I(vg4, "payment_required_action");
                                                        } else {
                                                            c70399WUb = c69648Vsp.A02;
                                                            vg4 = c69648Vsp.A01;
                                                            PaymentInfo paymentInfo = promoteData22.A0X;
                                                            if (paymentInfo != null && (paymentMethod = paymentInfo.A00) != null) {
                                                                fundingSourceType = paymentMethod.Bbq();
                                                            }
                                                            String valueOf = String.valueOf(fundingSourceType);
                                                            CallerContext callerContext = C70399WUb.A07;
                                                            C0Zx c0Zx = new C0Zx();
                                                            AbstractC65702TsY.A1I(c0Zx, c70399WUb);
                                                            if (valueOf != null) {
                                                                c0Zx.A06(AbstractC111324zv.A00(2859), valueOf);
                                                            }
                                                            C18920wW c18920wW = c70399WUb.A05;
                                                            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "promoted_posts_view_component");
                                                            A002.AAP("component", "existing_payment_method");
                                                            AbstractC65702TsY.A1D(A002, c70399WUb, vg4);
                                                            AbstractC65702TsY.A1B(A002, c0Zx);
                                                        }
                                                        KEF kef = c69648Vsp.A03;
                                                        List list16 = kef.A00;
                                                        list16.clear();
                                                        kef.clear();
                                                        Integer num = C05F.A0C;
                                                        Context context = c69648Vsp.A00;
                                                        String A0p = AbstractC166997dE.A0p(context, 2131970917);
                                                        UQ6 uq6 = promoteData22.A0P;
                                                        String str12 = null;
                                                        if (uq6 != null) {
                                                            str7 = uq6.A08;
                                                            List list17 = (List) uq6.A02;
                                                            if (list17 != null) {
                                                                str12 = (String) AbstractC001800i.A0J(list17);
                                                            }
                                                        } else {
                                                            str7 = null;
                                                        }
                                                        list16.add(new C69342Vlo(WN0.A00, c69648Vsp.A06, new SimpleImageUrl(str12), A0p, str7, num));
                                                        UQ6 uq62 = promoteData22.A0P;
                                                        if (uq62 != null && (muw2 = (MUW) uq62.A04) != null) {
                                                            list16.add(new C69342Vlo(new WNV(66, muw2, c69648Vsp), null, null, muw2.A02, null, C05F.A0N));
                                                            c70399WUb.A0I(vg4, "payment_primary_action_button");
                                                        }
                                                        Integer num2 = C05F.A01;
                                                        ?? obj4 = new Object();
                                                        obj4.A00 = num2;
                                                        list16.add(obj4);
                                                        E71 e71 = promoteData22.A0N;
                                                        if (e71 != null) {
                                                            List list18 = promoteData22.A1v;
                                                            int size = list18.size();
                                                            int i7 = promoteData22.A0I;
                                                            if (size > 1) {
                                                                i7 *= list18.size();
                                                            }
                                                            String A0c = AbstractC65702TsY.A0c(promoteData22, i7);
                                                            Integer num3 = C05F.A0j;
                                                            list16.add(new C69342Vlo(WN2.A00, null, null, AbstractC166997dE.A0p(context, 2131970923), null, num3));
                                                            Integer num4 = C05F.A0u;
                                                            list16.add(new C69342Vlo(WN3.A00, null, null, AbstractC166997dE.A0p(context, 2131970922), A0c, num4));
                                                            List list19 = (List) e71.A01;
                                                            if (list19 != null) {
                                                                Iterator it5 = list19.iterator();
                                                                while (it5.hasNext()) {
                                                                    URO uro = (URO) ((XFU) it5.next());
                                                                    list16.add(new C69342Vlo(WN4.A00, null, null, uro.A00, uro.A01, num4));
                                                                }
                                                            }
                                                            list16.add(new C69342Vlo(WN5.A00, null, null, AbstractC166997dE.A0p(context, 2131970924), e71.A02, num3));
                                                            ?? obj5 = new Object();
                                                            obj5.A00 = num2;
                                                            list16.add(obj5);
                                                        }
                                                        UQ6 uq63 = promoteData22.A0P;
                                                        if (uq63 != null) {
                                                            MUW muw4 = (MUW) uq63.A01;
                                                            String str13 = uq63.A07;
                                                            if (muw4 != null && str13 != null) {
                                                                String A0T = AnonymousClass001.A0T(str13, muw4.A02, ' ');
                                                                SpannableString spannableString = new SpannableString(A0T);
                                                                spannableString.setSpan(new C66328U9c(3, c69648Vsp, muw4), str13.length(), AbstractC167007dF.A0A(A0T), 33);
                                                                list16.add(new C69342Vlo(WN1.A00, null, null, spannableString, null, C05F.A0Y));
                                                                c70399WUb.A0I(vg4, "payment_inline_footer_row");
                                                            }
                                                        }
                                                        kef.A00();
                                                        C67892V0z.A03(c67892V0z2);
                                                        WFR wfr = AbstractC68626VYc.A00;
                                                        PromoteData promoteData23 = c67892V0z2.A0F;
                                                        if (promoteData23 != null) {
                                                            wfr.A04(activity, promoteData23, new X32(c67892V0z2, 18));
                                                            A01(c38852H9a);
                                                            if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
                                                                xde.Cn9("promote_review", VG4.A1Q.toString());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F(str5);
                                        throw C00O.createAndThrow();
                                    }
                                    C14360o3.A0F(str4);
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                        C0f9.A0A(i4, A034);
                        return;
                    }
                    C14360o3.A0F(str6);
                    throw C00O.createAndThrow();
                }
                C0f9.A0A(1589252754, A0312);
                i4 = 2094427549;
                C0f9.A0A(i4, A034);
                return;
            default:
                A035 = C0f9.A03(-484544888);
                C67805Uye c67805Uye = (C67805Uye) obj;
                A033 = AbstractC167017dG.A0N(c67805Uye, -2080077240);
                UPA upa9 = c67805Uye.A00;
                str2 = "promoteLogger";
                V09 v09 = (V09) this.A01;
                C70399WUb c70399WUb13 = v09.A00;
                if (upa9 != null) {
                    if (c70399WUb13 != null) {
                        C70399WUb.A08(c70399WUb13, VG4.A17.toString(), "save_draft", upa9.A03, null, V09.A00(v09));
                        UPA upa10 = c67805Uye.A00;
                        if (upa10 != null) {
                            String str14 = upa10.A02;
                            Context requireContext2 = v09.requireContext();
                            if (str14 == null || str14.length() == 0) {
                                str14 = AbstractC25227BEk.A0v(v09, 2131970931);
                            }
                            C9GR.A09(requireContext2, str14);
                            AbstractC25226BEj.A1Q(v09);
                            A01(c67805Uye);
                            C0f9.A0A(-1558330418, A033);
                            i6 = -703304702;
                            C0f9.A0A(i6, A035);
                            return;
                        }
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i3 = -1346488685;
                        C0f9.A0A(i3, A033);
                        throw illegalStateException;
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                if (c70399WUb13 != null) {
                    C70399WUb.A06(c70399WUb13, VG4.A17.toString(), "save_draft", V09.A00(v09));
                    PromoteData promoteData24 = v09.A02;
                    if (promoteData24 != null) {
                        promoteData24.A2x = true;
                        AbstractC25227BEk.A1B(v09);
                        A01(c67805Uye);
                        C0f9.A0A(-1558330418, A033);
                        i6 = -703304702;
                        C0f9.A0A(i6, A035);
                        return;
                    }
                    str2 = "promoteData";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V26(C70399WUb c70399WUb, Object obj, String str, int i) {
        super(c70399WUb, str);
        this.A00 = i;
        this.A01 = obj;
    }
}
