package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class EOK extends AbstractC43842Ja5 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectDailyPromptsResponseListFragment";
    public int A00;
    public IgTextView A01;
    public C36297Fzr A02;
    public EnumC33364Eox A03;
    public DirectAggregatedMediaViewerController A04;
    public C2EC A05;
    public CountdownTimerPill A06;
    public DirectShareTarget A07;
    public DirectThreadKey A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC41501vz A0L;
    public final String A0M;

    public static final void A03(EOK eok, VG2 vg2, String str, String str2) {
        String str3;
        FragmentActivity requireActivity = eok.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(eok.A0I);
        DirectPromptTypes directPromptTypes = DirectPromptTypes.A06;
        String str4 = eok.A0B;
        if (str4 == null) {
            str3 = "messageId";
        } else {
            String str5 = eok.A0C;
            if (str5 == null) {
                str3 = "threadId";
            } else {
                LL1.A03(requireActivity, eok, A0r, directPromptTypes, EnumC65855TvH.A0k, vg2, str2, str4, str, str5);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C7IH c7ih = AbstractC86593tX.A06(requireContext(), AbstractC31181DnP.A0A(interfaceC09390do)).A04;
        InterfaceC09390do interfaceC09390do2 = this.A0K;
        return AbstractC16960so.A1Q(new EZ0(this, A0r, c7ih, new C34543FKd(AbstractC166987dD.A0r(interfaceC09390do), new C36401G4c(this, 3), (C31831Dyp) interfaceC09390do2.getValue()), (C31831Dyp) interfaceC09390do2.getValue()), new KJL(AbstractC166987dD.A0r(interfaceC09390do)), new KJM(AbstractC166987dD.A0r(interfaceC09390do)), new C65721Tsu(((C31831Dyp) interfaceC09390do2.getValue()).A05, null, null, R.layout.direct_empty_view));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50261MHq(this, 2));
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = (CountdownTimerPill) view.requireViewById(R.id.countdown_timer);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.add_response_button);
        A01(view, this);
        AbstractC31176DnK.A0Q(this.A0I).A01(this.A0L, C36078FwE.class);
        AbstractC008903d.A00(AbstractC31178DnM.A0B(this), new C55541Olb(view, 2));
        addOnScrollListener(new C153156uj(getRecyclerView().A0D, new G7M(this, 5), C153146ui.A0A, false, false));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(view, viewLifecycleOwner, c07s, this, null, 33), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (X.C14360o3.A0K(X.AbstractC31173DnH.A0t(r11.A0I), r12) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(X.EOK r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            X.0do r0 = r11.A0J
            java.lang.Object r2 = r0.getValue()
            X.98R r2 = (X.C98R) r2
            java.lang.String r0 = r11.A0C
            if (r0 != 0) goto L16
            java.lang.String r0 = "threadId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L16:
            X.3oE r1 = X.AbstractC31171DnF.A0N(r0)
            r0 = 68
            boolean r0 = r2.A00(r1, r0)
            if (r0 != 0) goto L2f
            X.0do r0 = r11.A0I
            java.lang.String r0 = X.AbstractC31173DnH.A0t(r0)
            boolean r0 = X.C14360o3.A0K(r0, r12)
            r4 = 0
            if (r0 == 0) goto L30
        L2f:
            r4 = 1
        L30:
            X.0do r1 = r11.A0I
            java.lang.String r0 = X.AbstractC31173DnH.A0t(r1)
            boolean r3 = X.AbstractC25225BEi.A1a(r0, r12)
            android.content.Context r5 = r11.requireContext()
            java.lang.String r0 = X.AbstractC31173DnH.A0t(r1)
            boolean r2 = X.C14360o3.A0K(r0, r12)
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            if (r14 == 0) goto L65
            r7 = 0
            r1 = 48
            X.ME3 r8 = new X.ME3
            r8.<init>(r13, r11, r1)
            r9 = 2131958937(0x7f131c99, float:1.95545E38)
            r10 = 2131238222(0x7f081d4e, float:1.8092717E38)
            java.lang.Boolean r6 = X.AbstractC166997dE.A0a()
            X.8sw r1 = X.AbstractC35247Fgg.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L65:
            if (r4 == 0) goto L82
            java.lang.Integer r7 = X.AbstractC31174DnI.A0p(r5)
            r1 = 2
            X.D8R r8 = new X.D8R
            r8.<init>(r11, r13, r1, r2)
            r9 = 2131959015(0x7f131ce7, float:1.9554658E38)
            r10 = 2131238254(0x7f081d6e, float:1.8092782E38)
            java.lang.Boolean r6 = X.AbstractC166997dE.A0a()
            X.8sw r1 = X.AbstractC35247Fgg.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L82:
            if (r3 == 0) goto La0
            java.lang.Integer r7 = X.AbstractC31174DnI.A0p(r5)
            r1 = 24
            X.DH5 r8 = new X.DH5
            r8.<init>(r11, r13, r12, r1)
            r9 = 2131972368(0x7f135110, float:1.9581742E38)
            r10 = 2131238781(0x7f081f7d, float:1.809385E38)
            java.lang.Boolean r6 = X.AbstractC166997dE.A0a()
            X.8sw r1 = X.AbstractC35247Fgg.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOK.A00(X.EOK, java.lang.String, java.lang.String, boolean):java.util.ArrayList");
    }

    public static final void A02(View view, EOK eok, List list) {
        if (list != null) {
            C8QJ A0X = AbstractC31174DnI.A0X(eok.requireContext(), AbstractC166987dD.A0r(eok.A0I), list, false);
            if (A0X.getContentView() != null) {
                A0X.showAsDropDown(view, 0, 0);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A04;
        if (directAggregatedMediaViewerController == null) {
            C14360o3.A0F("mediaViewerController");
            throw C00O.createAndThrow();
        }
        return directAggregatedMediaViewerController.A0l();
    }

    public EOK() {
        C37056GUm c37056GUm = new C37056GUm(this, 16);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37056GUm(new C37056GUm((Object) this, 12), 13));
        this.A0K = AbstractC25225BEi.A0a(new C37056GUm(A00, 14), c37056GUm, new MHU(35, null, A00), AbstractC25225BEi.A1D(C31831Dyp.class));
        this.A0J = AbstractC09440dt.A01(new C37056GUm(this, 15));
        this.A0L = C31650DvG.A00(this, 39);
        this.A0I = AbstractC60492pY.A02(this);
        this.A0M = __redex_internal_original_name;
    }

    public static final void A01(View view, EOK eok) {
        C56342iS.A01(new ViewOnClickListenerC35666Fp0(eok, 45), AbstractC31176DnK.A0C(view, R.id.action_bar_container)).A0X(new Ft8(eok, 2));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0M;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Throwable A0t;
        int i;
        EnumC33364Eox enumC33364Eox;
        int A02 = C0f9.A02(-921534523);
        super.onCreate(bundle);
        boolean z = false;
        C04L.A00(AbstractC31174DnI.A0H(this), false);
        Bundle requireArguments = requireArguments();
        C3o9 A00 = AbstractC43826JZo.A00(requireArguments, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A00 != null) {
            DirectThreadKey A01 = JRE.A01(A00);
            this.A08 = A01;
            String str = "threadKey";
            C3I9 c3i9 = null;
            if (A01 != null) {
                String str2 = A01.A00;
                if (str2 != null) {
                    this.A0C = str2;
                    InterfaceC09390do interfaceC09390do = this.A0I;
                    C2DS A0O = AbstractC31180DnO.A0O(interfaceC09390do);
                    DirectThreadKey directThreadKey = this.A08;
                    if (directThreadKey != null) {
                        this.A05 = C2DU.A03((C2DU) A0O, directThreadKey);
                        Parcelable parcelable = requireArguments.getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
                        Parcelable.Creator creator = DirectShareTarget.CREATOR;
                        C14360o3.A08(creator);
                        this.A07 = (DirectShareTarget) ((Parcelable) C0B1.A01(creator, parcelable, DirectShareTarget.class));
                        String A0b = AbstractC31171DnF.A0b(requireArguments);
                        String str3 = "";
                        if (A0b == null) {
                            A0b = "";
                        }
                        this.A0A = A0b;
                        String string = requireArguments.getString("message_id");
                        if (string == null) {
                            string = "";
                        }
                        this.A0B = string;
                        String string2 = requireArguments.getString("client_context");
                        if (string2 == null) {
                            string2 = "";
                        }
                        this.A09 = string2;
                        C98R c98r = (C98R) this.A0J.getValue();
                        String str4 = this.A0C;
                        if (str4 == null) {
                            str = "threadId";
                        } else {
                            this.A0F = c98r.A00(AbstractC31171DnF.A0N(str4), 67);
                            this.A04 = new DirectAggregatedMediaViewerController(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), c3i9, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, z, z);
                            this.A00 = requireArguments.getInt("direct_channel_audience_type");
                            String string3 = requireArguments.getString("channel_user_type");
                            if (string3 != null) {
                                str3 = string3;
                            }
                            this.A0D = str3;
                            Serializable serializable = requireArguments.getSerializable("prompts_entry_point");
                            if (serializable instanceof EnumC33364Eox) {
                                enumC33364Eox = (EnumC33364Eox) serializable;
                            } else {
                                enumC33364Eox = null;
                            }
                            this.A03 = enumC33364Eox;
                            this.A02 = AbstractC34062F1p.A00(AbstractC166987dD.A0r(interfaceC09390do));
                            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A04;
                            if (directAggregatedMediaViewerController == null) {
                                str = "mediaViewerController";
                            } else {
                                registerLifecycleListener(directAggregatedMediaViewerController);
                                ((C31831Dyp) this.A0K.getValue()).A01(true, false);
                                C0f9.A09(-175455463, A02);
                                return;
                            }
                        }
                    }
                } else {
                    A0t = AbstractC166997dE.A0g();
                    i = -715441188;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A0t = AbstractC31172DnG.A0t();
        i = -1311607748;
        C0f9.A09(i, A02);
        throw A0t;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(674197141);
        super.onDestroy();
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A04;
        if (directAggregatedMediaViewerController == null) {
            C14360o3.A0F("mediaViewerController");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(directAggregatedMediaViewerController);
        C0f9.A09(-672174267, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(233581196);
        super.onDestroyView();
        this.A06 = null;
        this.A01 = null;
        AbstractC31176DnK.A0Q(this.A0I).A02(this.A0L, C36078FwE.class);
        C0f9.A09(-1349848551, A02);
    }
}
