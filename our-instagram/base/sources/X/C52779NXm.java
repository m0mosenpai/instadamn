package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NXm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52779NXm extends AbstractC33235ElU implements InterfaceC60122ou, CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(C52779NXm.class);
    public static final String __redex_internal_original_name = "DirectMessagesOptionChooserFragment";
    public C56719PFl A00;
    public C40701ud A01;
    public String A02;
    public final C56026Otx A05 = new C56026Otx(this, 4);
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_messages_options_chooser";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56719PFl c56719PFl = this.A00;
        if (c56719PFl != null) {
            C56142Ow4 c56142Ow4 = c56719PFl.A07;
            synchronized (c56142Ow4) {
                c56142Ow4.A08.add(c56719PFl);
            }
            c56719PFl.A02 = this;
            return;
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    public static final void A00(UserSession userSession, C52779NXm c52779NXm) {
        String str;
        C40701ud c40701ud = c52779NXm.A01;
        if (c40701ud != null) {
            C56719PFl c56719PFl = c52779NXm.A00;
            if (c56719PFl != null) {
                JEZ jez = new JEZ(c52779NXm, 28);
                JEZ jez2 = new JEZ(c52779NXm, 29);
                C14360o3.A0B(userSession, 0);
                String str2 = c56719PFl.A0A;
                int hashCode = str2.hashCode();
                String str3 = "IG_MESSAGE_REQUESTS_OTHERS_ON_IG";
                if (hashCode != -456614348) {
                    if (hashCode != 949752738) {
                        if (hashCode == 1767124056 && str2.equals("group_message_setting")) {
                            str3 = "IG_MESSAGE_GROUPS";
                            FXR.A00(c56719PFl.A05, userSession, c40701ud, str3, new C57750Pjd(48, c56719PFl, jez), new C57750Pjd(49, c56719PFl, jez2));
                            return;
                        }
                        return;
                    }
                    str = "others_on_ig";
                } else {
                    str = "ig_followers";
                }
                if (!str2.equals(str)) {
                    return;
                }
                FXR.A00(c56719PFl.A05, userSession, c40701ud, str3, new C57750Pjd(48, c56719PFl, jez), new C57750Pjd(49, c56719PFl, jez2));
                return;
            }
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public final void A01() {
        C2UU c2uu = (C2UU) getScrollingViewProxy().AZU();
        if (c2uu != null) {
            c2uu.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.OQ5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQ3, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(565947376);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", "");
        InterfaceC09390do interfaceC09390do = this.A04;
        C131995xZ A00 = C196068lw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A06);
        boolean A03 = C196068lw.A03(A00);
        boolean A022 = C196068lw.A02(A00);
        Context requireContext = requireContext();
        C56142Ow4 A002 = AbstractC54193NxX.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25230BEn.A0l(interfaceC09390do), new Object());
        ?? obj = new Object();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String string = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT");
        C14360o3.A0B(A0r, 0);
        C55174Odd c55174Odd = new C55174Odd(this, A0r, string);
        EnumC222416a A0I = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        this.A00 = new C56719PFl(requireContext, requireArguments, c55174Odd, obj, A002, A0I, A03, A022);
        this.A01 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do));
        A00(AbstractC166987dD.A0r(interfaceC09390do), this);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A05, C36092FwS.class);
        C0f9.A09(1899853182, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1368131159);
        super.onResume();
        C56719PFl c56719PFl = this.A00;
        if (c56719PFl != null) {
            List list = this.A03;
            C14360o3.A0B(list, 0);
            if (!c56719PFl.A04) {
                c56719PFl.A04 = true;
                boolean z = c56719PFl.A0B;
                if (z) {
                    MSY.A0w(2131966435, list);
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = c56719PFl.A0E;
                String str2 = "";
                if (directMessageInteropReachabilityOptionsArr != null) {
                    for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : directMessageInteropReachabilityOptionsArr) {
                        String str3 = directMessageInteropReachabilityOptions.A03;
                        Context context = c56719PFl.A05;
                        String string = context.getString(directMessageInteropReachabilityOptions.A01);
                        Integer num = directMessageInteropReachabilityOptions.A02;
                        if (num == null) {
                            str = "";
                        } else {
                            str = context.getString(num.intValue());
                        }
                        A1E.add(new C35124FeR(str3, string, str));
                    }
                }
                DirectMessageInteropReachabilityOptions A00 = c56719PFl.A01.A00(c56719PFl.A0A);
                c56719PFl.A00 = A00;
                if (A00 != null) {
                    str2 = A00.A03;
                }
                C34960Fak c34960Fak = new C34960Fak(new C35748Fqg(c56719PFl, 4), str2, A1E);
                c56719PFl.A03 = c34960Fak;
                list.add(c34960Fak);
                if (z) {
                    list.add(new C35246Fgf(c56719PFl.A09));
                }
            }
            setItems(list);
            C0f9.A09(-1057545012, A02);
            return;
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1827875785);
        super.onStop();
        C56719PFl c56719PFl = this.A00;
        if (c56719PFl != null) {
            C56142Ow4 c56142Ow4 = c56719PFl.A07;
            synchronized (c56142Ow4) {
                c56142Ow4.A08.remove(c56719PFl);
            }
            c56719PFl.A02 = null;
            AbstractC31176DnK.A0Q(this.A04).A02(this.A05, C36092FwS.class);
            C0f9.A09(328008283, A02);
            return;
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }
}
