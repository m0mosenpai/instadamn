package com.instagram.debug.devoptions.api;

import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.C05F;
import X.C140966Yy;
import X.C1RQ;
import X.C6XJ;
import X.C9GR;
import X.EnumC27091Ti;
import X.InterfaceC191378do;
import X.MTC;
import X.MTD;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import com.instagram.modal.ModalActivity;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class DeveloperOptionsLauncher {

    /* loaded from: classes10.dex */
    public interface VoltronCallbacks {
        void onFailure();

        void onSuccess();
    }

    public static /* synthetic */ Fragment lambda$launchMediaInjectionTool$0() {
        return new InjectMediaToolFragment();
    }

    public static void launchDirectInboxV2ExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLauncherDeveloperOptionsModal(context, fragmentActivity, userSession, AbstractC111324zv.A00(4281));
    }

    public static void launchHomeDeliveryDebugTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, null, fragmentActivity, userSession, new Callable() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DeveloperOptionsPluginImpl.INSTANCE.getHomeDeliveryDebugTool();
            }
        });
    }

    public static void launchMediaInjectionTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, null, fragmentActivity, userSession, new Callable() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new InjectMediaToolFragment();
            }
        });
    }

    public static void launchStoriesExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, null, fragmentActivity, userSession, new Callable() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DeveloperOptionsPluginImpl.INSTANCE.getStoriesExperimentSwitcherToolFragment();
            }
        });
    }

    public static void loadAndLaunchDeveloperOptions(Context context, AbstractC10360h2 abstractC10360h2, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, abstractC10360h2, fragmentActivity, userSession, new Callable() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DeveloperOptionsPluginImpl.INSTANCE.getDeveloperOptionsFragment();
            }
        });
    }

    public static void loadVoltronModule(FragmentActivity fragmentActivity, UserSession userSession, final VoltronCallbacks voltronCallbacks) {
        MTC mtc = new MTC(EnumC27091Ti.A0M);
        mtc.A03 = C05F.A00;
        mtc.A02 = new InterfaceC191378do() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.3
            @Override // X.InterfaceC191378do
            public void onFailure(String str, boolean z) {
                VoltronCallbacks.this.onFailure();
            }

            @Override // X.InterfaceC191378do
            public void onSuccess() {
                try {
                    VoltronCallbacks.this.onSuccess();
                } catch (Exception e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
        };
        mtc.A01 = fragmentActivity.getSupportFragmentManager();
        C1RQ.A00().A03(userSession, new MTD(mtc));
    }

    public static void loadAndLaunchDeveloperOption(final Context context, AbstractC10360h2 abstractC10360h2, final FragmentActivity fragmentActivity, final UserSession userSession, final Callable callable) {
        if (EndToEnd.A05()) {
            C9GR.A08(context, 2131958251, 1);
        } else {
            loadVoltronModule(fragmentActivity, userSession, new VoltronCallbacks() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.1
                @Override // com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.VoltronCallbacks
                public void onFailure() {
                    C9GR.A08(context, 2131958005, 1);
                }

                @Override // com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.VoltronCallbacks
                public void onSuccess() {
                    try {
                        Fragment fragment = (Fragment) callable.call();
                        if (fragment != null) {
                            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
                            c140966Yy.A0B(null, fragment);
                            c140966Yy.A04();
                            return;
                        }
                        throw new NullPointerException();
                    } catch (Exception e) {
                        throw AbstractC58318PtA.A0f(e);
                    }
                }
            });
        }
    }

    public static void loadAndLauncherDeveloperOptionsModal(final Context context, final FragmentActivity fragmentActivity, final UserSession userSession, final String str) {
        if (EndToEnd.A05()) {
            C9GR.A08(context, 2131958251, 1);
        } else {
            loadVoltronModule(fragmentActivity, userSession, new VoltronCallbacks() { // from class: com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.2
                @Override // com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.VoltronCallbacks
                public void onFailure() {
                    C9GR.A08(context, 2131958005, 1);
                }

                @Override // com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.VoltronCallbacks
                public void onSuccess() {
                    UserSession userSession2 = UserSession.this;
                    String str2 = str;
                    C6XJ c6xj = new C6XJ(fragmentActivity, AbstractC166987dD.A0b(), userSession2, ModalActivity.class, str2);
                    c6xj.A07();
                    c6xj.A0C(fragmentActivity);
                }
            });
        }
    }
}
