package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.PFl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56719PFl implements InterfaceC58069Pou {
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessagesInteropOptionsViewModel A01;
    public C52779NXm A02;
    public C34960Fak A03;
    public boolean A04;
    public final Context A05;
    public final C55174Odd A06;
    public final C56142Ow4 A07;
    public final EnumC222416a A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final DirectMessageInteropReachabilityOptions[] A0E;
    public final OQ3 A0F;

    public C56719PFl(Context context, Bundle bundle, C55174Odd c55174Odd, OQ3 oq3, C56142Ow4 c56142Ow4, EnumC222416a enumC222416a, boolean z, boolean z2) {
        C14360o3.A0B(c56142Ow4, 2);
        this.A05 = context;
        this.A07 = c56142Ow4;
        this.A0F = oq3;
        this.A06 = c55174Odd;
        this.A08 = enumC222416a;
        this.A0C = z;
        this.A0D = z2;
        String string = bundle.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", "");
        C14360o3.A07(string);
        this.A09 = string;
        DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = (DirectMessageInteropReachabilityOptions[]) bundle.getParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS");
        if (directMessageInteropReachabilityOptionsArr != null) {
            this.A0E = directMessageInteropReachabilityOptionsArr;
            String string2 = bundle.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", "");
            C14360o3.A07(string2);
            this.A0A = string2;
            this.A0B = bundle.getBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER");
            this.A01 = (DirectMessagesInteropOptionsViewModel) AbstractC153636vY.A00(bundle, DirectMessagesInteropOptionsViewModel.class, "DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL");
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c55174Odd.A00, "ig_interop_reachability_setting_client_interaction");
            if (A0f.isSampled()) {
                A0f.AAP("setting_name", C55174Odd.A01(string2));
                AbstractC166997dE.A1N(A0f, "interaction_type", 0);
                A0f.A9M("extra_data_map", AbstractC167007dF.A0n("account_type", enumC222416a.A01));
                AbstractC31175DnJ.A17(A0f, c55174Odd.A01);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS can't be null, please add DirectMessageInteropReachabilityOptions");
    }

    @Override // X.InterfaceC58069Pou
    public final void FAy(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, C52097N2x c52097N2x, String str) {
        OCH och;
        C14360o3.A0B(directMessagesInteropOptionsViewModel2, 2);
        if (directMessagesInteropOptionsViewModel != null) {
            C55174Odd c55174Odd = this.A06;
            String str2 = this.A0A;
            EnumC222416a enumC222416a = this.A08;
            boolean z = this.A0C;
            boolean z2 = this.A0D;
            c55174Odd.A06(directMessagesInteropOptionsViewModel, directMessagesInteropOptionsViewModel2, enumC222416a, str2, z, z2, false);
            if (c52097N2x != null && (och = c52097N2x.A01) != null && och.A03 != null && och.A02 != null && och.A01 != null && och.A00 != null && c52097N2x.A00 != null) {
                C14360o3.A0B(str2, 0);
                C55174Odd.A03(c55174Odd, directMessagesInteropOptionsViewModel, directMessagesInteropOptionsViewModel2, enumC222416a, str2, z, z2, false);
                OCH och2 = c52097N2x.A01;
                if (och2 != null) {
                    Context context = this.A05;
                    String str3 = (String) AbstractC43691JUa.A00(och2.A03, "", "warning_title");
                    String str4 = (String) AbstractC43691JUa.A00(och2.A02, "", "warning_message");
                    String str5 = (String) AbstractC43691JUa.A00(och2.A01, "", "warning_confirm_button");
                    String str6 = (String) AbstractC43691JUa.A00(och2.A00, "", "warning_cancel_button");
                    N3R n3r = c52097N2x.A00;
                    if (n3r != null) {
                        C56718PFk c56718PFk = new C56718PFk(directMessagesInteropOptionsViewModel, this);
                        AbstractC167027dH.A0a(1, str3, str4, str5, str6);
                        C193328hC A0I = AbstractC31171DnF.A0I(context);
                        A0I.A05 = str3;
                        A0I.A0r(str4);
                        A0I.A0d(DialogInterfaceOnClickListenerC55321Ogj.A00(c56718PFk, n3r, 49), str5);
                        A0I.A0c(DialogInterfaceOnClickListenerC55320Ogi.A00(c56718PFk, 37), str6);
                        DialogInterfaceOnCancelListenerC55251OfP.A00(A0I, c56718PFk, 11);
                        AbstractC166987dD.A1W(A0I);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        OQ3.A00(this.A05);
        A00(this);
    }

    @Override // X.InterfaceC58069Pou
    public final void FCO(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        C14360o3.A0B(directMessagesInteropOptionsViewModel, 1);
        this.A01 = directMessagesInteropOptionsViewModel;
        String str2 = this.A0A;
        this.A00 = directMessagesInteropOptionsViewModel.A00(str2);
        if (directMessagesInteropOptionsViewModel2 != null) {
            this.A06.A06(directMessagesInteropOptionsViewModel2, directMessagesInteropOptionsViewModel, this.A08, str2, this.A0C, this.A0D, true);
        }
        C34960Fak c34960Fak = this.A03;
        if (c34960Fak != null) {
            c34960Fak.A03 = true;
        }
        C52779NXm c52779NXm = this.A02;
        if (c52779NXm != null) {
            c52779NXm.A01();
        }
    }

    public static final void A00(C56719PFl c56719PFl) {
        String str;
        C34960Fak c34960Fak;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = c56719PFl.A00;
        if (directMessageInteropReachabilityOptions != null && (str = directMessageInteropReachabilityOptions.A03) != null && c56719PFl.A02 != null && (c34960Fak = c56719PFl.A03) != null) {
            c34960Fak.A00 = str;
        }
        C34960Fak c34960Fak2 = c56719PFl.A03;
        if (c34960Fak2 != null) {
            c34960Fak2.A03 = true;
        }
        C52779NXm c52779NXm = c56719PFl.A02;
        if (c52779NXm != null) {
            c52779NXm.A01();
        }
    }
}
