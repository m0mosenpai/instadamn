package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.utils.ThreadMetadataOverrideBroadcastReceiver;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;
import java.util.List;

/* loaded from: classes9.dex */
public final class P4Q implements InterfaceC191378do {
    public final /* synthetic */ C52776NXh A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AbstractC33235ElU A02;
    public final /* synthetic */ List A03;

    public P4Q(C52776NXh c52776NXh, UserSession userSession, AbstractC33235ElU abstractC33235ElU, List list) {
        this.A01 = userSession;
        this.A02 = abstractC33235ElU;
        this.A03 = list;
        this.A00 = c52776NXh;
    }

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        AbstractC33235ElU abstractC33235ElU = this.A02;
        if (abstractC33235ElU.getContext() != null) {
            C9GR.A06(abstractC33235ElU.getContext(), 2131958005);
        }
        this.A00.setBottomSheetMenuItems(this.A03);
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        try {
            UserSession userSession = this.A01;
            AbstractC33235ElU abstractC33235ElU = this.A02;
            C52776NXh c52776NXh = this.A00;
            List pinnedDevOptions = DeveloperOptionsPluginImpl.INSTANCE.getPinnedDevOptions(userSession, abstractC33235ElU, new C56375P1k(c52776NXh, abstractC33235ElU));
            C14360o3.A07(pinnedDevOptions);
            if (AbstractC166987dD.A1b(pinnedDevOptions)) {
                List list = this.A03;
                list.add(new C35119FeM(true));
                list.add(new C31335Dq0("Pinned Rageshake Items"));
                list.addAll(pinnedDevOptions);
            }
            FragmentActivity activity = c52776NXh.getActivity();
            if (activity != null && activity.findViewById(R.id.thread_fragment_container) != null) {
                List list2 = this.A03;
                list2.add(new C35119FeM(true));
                list2.add(new C31335Dq0("IG Direct"));
                list2.add(new GHY(c52776NXh.requireContext(), new ViewOnClickListenerC55467OkM(c52776NXh, 66), 2131971463));
                list2.add(new GHY(c52776NXh.requireContext(), new ViewOnClickListenerC55467OkM(c52776NXh, 67), 2131971464));
                ThreadMetadataOverrideBroadcastReceiver.Companion.isEnabled(userSession);
            }
            c52776NXh.setBottomSheetMenuItems(this.A03);
        } catch (AnonymousClass060 e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
