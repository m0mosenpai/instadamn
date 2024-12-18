package X;

import android.content.Context;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NAF extends C1P1 implements InterfaceC58069Pou {
    public DirectMessagesInteropOptionsViewModel A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final EnumC33470Er5 A06;
    public final UserSession A07;
    public final C34997FbU A08;
    public final C23031Ai A09;
    public final C55174Odd A0A;
    public final O5T A0B;
    public final C34945FaV A0C;
    public final C56142Ow4 A0D;
    public final DirectMessagesOptionsFragment A0E;
    public final EnumC222416a A0F;
    public final boolean A0G;
    public final OQ3 A0H;
    public final InterfaceC58070Pov A0I;
    public final OQ5 A0J;
    public final boolean A0K;
    public final boolean A0L;

    public NAF(Context context, EnumC33470Er5 enumC33470Er5, UserSession userSession, C34997FbU c34997FbU, C23031Ai c23031Ai, C55174Odd c55174Odd, OQ3 oq3, C34945FaV c34945FaV, C56142Ow4 c56142Ow4, DirectMessagesOptionsFragment directMessagesOptionsFragment, InterfaceC58070Pov interfaceC58070Pov, OQ5 oq5, EnumC222416a enumC222416a, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1R(userSession, c23031Ai);
        C14360o3.A0B(c56142Ow4, 5);
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = c23031Ai;
        this.A0J = oq5;
        this.A0D = c56142Ow4;
        this.A0H = oq3;
        this.A0A = c55174Odd;
        this.A08 = c34997FbU;
        this.A0C = c34945FaV;
        this.A03 = z;
        this.A0G = z2;
        this.A0F = enumC222416a;
        this.A0K = z3;
        this.A0L = z4;
        this.A06 = enumC33470Er5;
        this.A0E = directMessagesOptionsFragment;
        this.A0I = interfaceC58070Pov;
        this.A02 = true;
        this.A0B = new O5T(this);
    }

    public static void A00(NAF naf) {
        naf.A02 = true;
        naf.A0E.A00();
    }

    public static final void A01(NAF naf) {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        try {
            naf.A00 = null;
            C23031Ai c23031Ai = naf.A09;
            String A0j = MSX.A0j(c23031Ai, c23031Ai.A5y, C23031Ai.A8c, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            if (A0j != null && A0j.length() != 0) {
                naf.A00 = OY8.parseFromJson(C16V.A00(A0j));
            }
            if (naf.A00 == null) {
                DirectMessagesInteropOptionsViewModel parseFromJson = OY8.parseFromJson(C16V.A00(MSY.A0f(c23031Ai, "interop_reachability_setting", "")));
                if (parseFromJson == null) {
                    EnumC222416a enumC222416a = naf.A0F;
                    if (enumC222416a != null) {
                        int ordinal = enumC222416a.ordinal();
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0G;
                                directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0F;
                                parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, null, null, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions);
                            }
                        } else {
                            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = DirectMessageInteropReachabilityOptions.A0G;
                            parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions3, null, null, null, directMessageInteropReachabilityOptions3, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0F, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions3);
                        }
                    }
                    directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0G;
                    directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0D;
                    parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, null, null, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions);
                }
                naf.A00 = parseFromJson;
            }
        } catch (IOException e) {
            C0w9.A06("DirectMessagesInteropOptionsControllerImpl", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
        }
    }

    @Override // X.InterfaceC58069Pou
    public final void FAy(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, C52097N2x c52097N2x, String str) {
        OCH och;
        C14360o3.A0B(directMessagesInteropOptionsViewModel2, 2);
        if (str != null && directMessagesInteropOptionsViewModel != null) {
            this.A0A.A06(directMessagesInteropOptionsViewModel, directMessagesInteropOptionsViewModel2, this.A0F, str, this.A03, this.A0G, false);
        }
        this.A01 = str;
        if (directMessagesInteropOptionsViewModel != null && c52097N2x != null && (och = c52097N2x.A01) != null && och.A03 != null && och.A02 != null && och.A01 != null && och.A00 != null && c52097N2x.A00 != null) {
            if (str != null) {
                C55174Odd.A03(this.A0A, directMessagesInteropOptionsViewModel, directMessagesInteropOptionsViewModel2, this.A0F, str, this.A03, this.A0G, false);
            }
            OCH och2 = c52097N2x.A01;
            if (och2 != null) {
                Context context = this.A05;
                String str2 = och2.A03;
                if (str2 != null) {
                    String str3 = och2.A02;
                    if (str3 != null) {
                        String str4 = och2.A01;
                        if (str4 != null) {
                            String str5 = och2.A00;
                            if (str5 != null) {
                                N3R n3r = c52097N2x.A00;
                                if (n3r != null) {
                                    C56717PFj c56717PFj = new C56717PFj(this, directMessagesInteropOptionsViewModel);
                                    C14360o3.A0B(context, 0);
                                    AbstractC167027dH.A0a(1, str2, str3, str4, str5);
                                    C193328hC A0I = AbstractC31171DnF.A0I(context);
                                    A0I.A05 = str2;
                                    A0I.A0r(str3);
                                    A0I.A0d(DialogInterfaceOnClickListenerC55321Ogj.A00(c56717PFj, n3r, 49), str4);
                                    A0I.A0c(DialogInterfaceOnClickListenerC55320Ogi.A00(c56717PFj, 37), str5);
                                    DialogInterfaceOnCancelListenerC55251OfP.A00(A0I, c56717PFj, 11);
                                    AbstractC166987dD.A1W(A0I);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        OQ3.A00(this.A05);
        if (directMessagesInteropOptionsViewModel != null) {
            this.A00 = directMessagesInteropOptionsViewModel;
        } else {
            A01(this);
        }
        A00(this);
    }

    @Override // X.InterfaceC58069Pou
    public final void FCO(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        C14360o3.A0B(directMessagesInteropOptionsViewModel, 1);
        if (str != null && directMessagesInteropOptionsViewModel2 != null) {
            this.A0A.A06(directMessagesInteropOptionsViewModel2, directMessagesInteropOptionsViewModel, this.A0F, str, this.A03, this.A0G, true);
        }
        this.A01 = str;
        this.A00 = directMessagesInteropOptionsViewModel;
        this.A02 = true;
        this.A0E.A00();
    }

    public final void A02(String str) {
        EnumC222416a enumC222416a = this.A0F;
        OQ4.A01(this.A00, this.A0I, enumC222416a, str, this.A0K, this.A0L, this.A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-967382734);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        A01(this);
        this.A04 = false;
        C34997FbU c34997FbU = this.A08;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
        AbstractC31171DnF.A1B(A0f, "fetch_data_error");
        AbstractC31171DnF.A1G(A0f, c34997FbU.A01);
        A0f.AAP("component", "toggle");
        AbstractC31171DnF.A1A(A0f, "ig_message_settings");
        A0f.AAP("message_controls_settings_version", "v2");
        A0f.AAP("error_message", AbstractC151876sX.A02(abstractC115105If));
        A0f.AAP("error_identifier", AbstractC151876sX.A01(abstractC115105If));
        A0f.Cht();
        A00(this);
        C0f9.A0A(-1206944391, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1994811149);
        N3R n3r = (N3R) obj;
        int A032 = C0f9.A03(1370537357);
        C14360o3.A0B(n3r, 0);
        super.onSuccess(n3r);
        DirectMessagesInteropOptionsViewModel A00 = N3R.A00(n3r);
        this.A00 = A00;
        try {
            C23031Ai c23031Ai = this.A09;
            String A01 = OY8.A01(A00);
            C14360o3.A0B(A01, 0);
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
            A0w.E7K("interop_reachability_setting", A01);
            A0w.apply();
        } catch (IOException e) {
            C0w9.A06("DirectMessagesInteropOptionsControllerImpl", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        if (C18U.A06(C06090Tz.A05, this.A07, 36311878313444137L)) {
            boolean z = n3r.A0B;
            this.A04 = z;
            if (z && n3r.A00 == null) {
                this.A08.A01("fetch_data_error", null);
                this.A04 = false;
            } else {
                C34997FbU c34997FbU = this.A08;
                Boolean bool = n3r.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
                AbstractC31171DnF.A1B(A0f, "fetch_data");
                AbstractC31171DnF.A1G(A0f, c34997FbU.A01);
                A0f.AAP("component", "toggle");
                A0f.A7v("eligible_ig_dm_toggle", AbstractC31173DnH.A0e(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, "ig_message_settings", z));
                A0f.A7v("source_of_truth_toggle_value", bool);
                A0f.AAP("message_controls_settings_version", "v2");
                A0f.Cht();
                if (this.A04) {
                    C23031Ai c23031Ai2 = this.A09;
                    Boolean bool2 = n3r.A00;
                    if (bool2 != null) {
                        AbstractC31171DnF.A1S(c23031Ai2, bool2, c23031Ai2.A6K, C23031Ai.A8c, 263);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(-404044280, A032);
                        throw A0g;
                    }
                }
            }
        }
        A00(this);
        C0f9.A0A(511228452, A032);
        C0f9.A0A(1550469156, A03);
    }
}
