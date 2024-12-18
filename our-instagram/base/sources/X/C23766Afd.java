package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Afd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23766Afd implements InterfaceC25214BDm {
    public final int A00;
    public final Object A01;

    public C23766Afd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void AIF() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC25214BDm
    public final void AIG(String str, List list, List list2, boolean z) {
        AbstractC67881V0m abstractC67881V0m;
        FragmentActivity requireActivity;
        Intent intent;
        C81Y c81y;
        boolean z2;
        FragmentActivity requireActivity2;
        C81Y c81y2;
        boolean z3;
        String str2;
        Context context;
        switch (this.A00) {
            case 1:
            case 2:
            case 5:
                return;
            case 3:
            case Process.SIGTERM /* 15 */:
            default:
                Fragment fragment = (Fragment) this.A01;
                fragment.requireActivity().setResult(-1);
                requireActivity2 = fragment.requireActivity();
                requireActivity2.finish();
                return;
            case 4:
                C214859fN c214859fN = (C214859fN) this.A01;
                c81y = c214859fN.A00;
                if (c81y == null) {
                    return;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                if (list != null && !list.isEmpty()) {
                    A1E.add("story");
                }
                if (list2 != null && !list2.isEmpty()) {
                    A1E.add(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                }
                C214859fN.A00(c214859fN, "", A1E, true, false);
                z2 = !c214859fN.A03;
                c81y.A05("button", z2);
                return;
            case 6:
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                C14360o3.A0C(A00, AbstractC111324zv.A00(128));
                AbstractC72153Lo.A00 = true;
                ((InterfaceC53742dD) A00).EfJ(C1QO.A0C);
                C81Y c81y3 = ((AbstractC67881V0m) this.A01).A01;
                C14360o3.A0A(c81y3);
                c81y3.A05("button", true);
                return;
            case 7:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC67881V0m abstractC67881V0m2 = (AbstractC67881V0m) this.A01;
                requireActivity2 = abstractC67881V0m2.requireActivity();
                requireActivity2.setResult(-1, C35223FgG.A00(list, list2));
                C81Y c81y4 = abstractC67881V0m2.A01;
                if (c81y4 != null) {
                    c81y4.A05("button", true);
                    return;
                }
                requireActivity2.finish();
                return;
            case 8:
                abstractC67881V0m = (AbstractC67881V0m) this.A01;
                requireActivity = abstractC67881V0m.requireActivity();
                intent = new Intent();
                requireActivity.setResult(-1, intent);
                abstractC67881V0m.A01();
                return;
            case 9:
                EnumC46137Kbb enumC46137Kbb = EnumC46137Kbb.A02;
                abstractC67881V0m = (AbstractC67881V0m) this.A01;
                if (enumC46137Kbb.equals(abstractC67881V0m.requireArguments().getSerializable(AbstractC43591JPw.A00(487)))) {
                    abstractC67881V0m.requireActivity().setResult(-1, C35223FgG.A00(list, list2));
                } else if (abstractC67881V0m.requireArguments().getBoolean(AbstractC111324zv.A00(3644))) {
                    C12260kU.A0C(abstractC67881V0m.requireContext(), C14H.A00().A01(abstractC67881V0m.requireContext()));
                }
                abstractC67881V0m.A01();
                return;
            case 10:
                AbstractC67881V0m abstractC67881V0m3 = (AbstractC67881V0m) this.A01;
                c81y2 = abstractC67881V0m3.A01;
                if (c81y2 == null) {
                    return;
                }
                z3 = true;
                str2 = "button";
                if (list == null || (!list.contains(UserStoryTarget.A01) && !list.contains(UserStoryTarget.A02) && !list.contains(UserStoryTarget.A09))) {
                    context = abstractC67881V0m3.getContext();
                    if (context == null) {
                        throw AbstractC166997dE.A0g();
                    }
                    c81y2.A02(context);
                    return;
                }
                c81y2.A05(str2, z3);
                return;
            case 11:
            case 14:
                AbstractC67881V0m abstractC67881V0m4 = (AbstractC67881V0m) this.A01;
                if (abstractC67881V0m4.A01 == null) {
                    return;
                }
                if (list != null && (list.contains(UserStoryTarget.A01) || list.contains(UserStoryTarget.A02) || list.contains(UserStoryTarget.A09))) {
                    C81Y c81y5 = abstractC67881V0m4.A01;
                    if (c81y5 == null) {
                        return;
                    }
                    c81y5.A05("button", true);
                    return;
                }
                c81y2 = abstractC67881V0m4.A01;
                if (c81y2 == null) {
                    return;
                }
                context = abstractC67881V0m4.getContext();
                c81y2.A02(context);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC67881V0m abstractC67881V0m5 = (AbstractC67881V0m) this.A01;
                c81y2 = abstractC67881V0m5.A01;
                if (c81y2 == null) {
                    return;
                }
                z3 = true;
                str2 = "button";
                if (list == null || (!list.contains(UserStoryTarget.A01) && !list.contains(UserStoryTarget.A02) && !list.contains(UserStoryTarget.A09))) {
                    context = abstractC67881V0m5.getContext();
                    if (context == null) {
                        throw AbstractC166997dE.A0g();
                    }
                    c81y2.A02(context);
                    return;
                }
                c81y2.A05(str2, z3);
                return;
            case 16:
                AbstractC67881V0m abstractC67881V0m6 = (AbstractC67881V0m) this.A01;
                FragmentActivity activity = abstractC67881V0m6.getActivity();
                if (activity != null) {
                    activity.setResult(-1, C35223FgG.A00(list, list2));
                }
                c81y = abstractC67881V0m6.A01;
                if (c81y != null) {
                    z2 = true;
                    c81y.A05("button", z2);
                    return;
                } else {
                    FragmentActivity activity2 = abstractC67881V0m6.getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    activity2.finish();
                    return;
                }
            case 17:
                abstractC67881V0m = (AbstractC67881V0m) this.A01;
                requireActivity = abstractC67881V0m.requireActivity();
                intent = C35223FgG.A00(list, list2);
                requireActivity.setResult(-1, intent);
                abstractC67881V0m.A01();
                return;
        }
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Cqw(String str) {
        InterfaceC53742dD interfaceC53742dD;
        if (5 - this.A00 == 0) {
            C14360o3.A0B("media_posted_to_clips", 0);
            InterfaceC53722dB A00 = AbstractC54852fj.A00();
            if ((A00 instanceof InterfaceC53742dD) && (interfaceC53742dD = (InterfaceC53742dD) A00) != null) {
                try {
                    interfaceC53742dD.FBp(new PositionConfig(null, null, null, "media_posted_to_clips", null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
                    interfaceC53742dD.EfJ(AbstractC58592mI.A00(AbstractC166987dD.A0r(((C9LP) this.A01).A1Z)).A00());
                } catch (Exception e) {
                    AbstractC167017dG.A1J(C18950wb.A01, "navigateToExplore", e, 817897248);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Cqz(String str) {
        InterfaceC53742dD interfaceC53742dD;
        switch (this.A00) {
            case 5:
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                if (!(A00 instanceof InterfaceC53742dD) || (interfaceC53742dD = (InterfaceC53742dD) A00) == null) {
                    return;
                }
                try {
                    interfaceC53742dD.FBp(new PositionConfig(null, null, null, str, null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
                    AbstractC72153Lo.A00 = true;
                    interfaceC53742dD.EfJ(C1QO.A0C);
                    return;
                } catch (Exception e) {
                    AbstractC167017dG.A1J(C18950wb.A01, "navigateToFeed", e, 817897248);
                    return;
                }
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC67881V0m abstractC67881V0m = (AbstractC67881V0m) this.A01;
                C81Y c81y = abstractC67881V0m.A01;
                if (c81y != null) {
                    c81y.A05("button", true);
                }
                AbstractC25651Mw.A00(AbstractC166987dD.A0q(abstractC67881V0m)).E4s(new Object());
                return;
        }
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void E2e() {
        if (2 - this.A00 == 0) {
            KCD.A00((KCD) this.A01, false, true);
        }
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Crg(String str) {
    }
}
