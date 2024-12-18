package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OuB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56039OuB implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;

    public C56039OuB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        OpalProfileData opalProfileData;
        int i3;
        List list;
        String action;
        switch (this.A00) {
            case 0:
                C0O c0o = (C0O) this.A01;
                switch (i) {
                    case 68681:
                        if (i2 != -1 || intent == null || (opalProfileData = (OpalProfileData) intent.getParcelableExtra("argument_update_profile_data")) == null || c0o.A05 == null) {
                            return;
                        }
                        C0O.A00(c0o).A02(opalProfileData);
                        return;
                    case 68682:
                        if (i2 == -1) {
                            if (intent != null) {
                                i3 = intent.getIntExtra("argument_opal_selected_audience_count", 0);
                                Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("argument_opal_selected_audience_facepile_list");
                                if (parcelableArrayExtra != null) {
                                    ArrayList A17 = AbstractC25225BEi.A17(parcelableArrayExtra.length);
                                    for (Parcelable parcelable : parcelableArrayExtra) {
                                        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.instagram.opal.impl.data.OpalAudienceSelectorRepository.OpalAudience");
                                        A17.add(parcelable);
                                    }
                                    list = AbstractC001800i.A0a(A17);
                                    C51030Mgd A00 = C0O.A00(c0o);
                                    A00.A02(OpalProfileData.A00(((C26073Bg2) A00.A06.getValue()).A05, null, null, null, null, null, null, list, i3, 5119, false, false));
                                }
                            } else {
                                i3 = 0;
                            }
                            list = C16930sl.A00;
                            C51030Mgd A002 = C0O.A00(c0o);
                            A002.A02(OpalProfileData.A00(((C26073Bg2) A002.A06.getValue()).A05, null, null, null, null, null, null, list, i3, 5119, false, false));
                        }
                        if (!c0o.A0A) {
                            return;
                        }
                        c0o.A0A = false;
                        C0O.A02(c0o);
                        return;
                    case 68683:
                        if (i2 != -1 || intent == null || (action = intent.getAction()) == null) {
                            return;
                        }
                        C0O.A00(c0o).A03(action);
                        return;
                    default:
                        return;
                }
            case 1:
                return;
            default:
                C26823Bsl c26823Bsl = (C26823Bsl) this.A01;
                if (i != 7001) {
                    if (i == 7002 && i2 == -1) {
                        if (intent == null || !intent.getBooleanExtra("ARGUMENT_SCHOOL_ADDED", false)) {
                            AbstractC31177DnL.A12(c26823Bsl);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i2 != -1 || intent == null) {
                        return;
                    }
                    if (intent.getBooleanExtra("ARGUMENT_SCHOOL_REMOVED", false)) {
                        C26823Bsl.A00(c26823Bsl);
                        return;
                    } else if (!intent.getBooleanExtra("ARGUMENT_SCHOOL_ADDED", false)) {
                        return;
                    }
                }
                ((C51015MgN) c26823Bsl.A0F.getValue()).A01(0);
                return;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
        Thread thread;
        Looper looper;
        if (1 - this.A00 == 0) {
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            if (AbstractC53604NnB.A01 != null) {
                if (requireActivity instanceof BaseFragmentActivity) {
                    C60930Rbk c60930Rbk = AbstractC53604NnB.A01;
                    C14360o3.A0A(c60930Rbk);
                    ((IgFragmentActivity) requireActivity).unregisterOnActivityResultListener(c60930Rbk);
                } else {
                    abstractC59962oe.unregisterLifecycleListener(AbstractC53604NnB.A01);
                }
                AbstractC53604NnB.A01 = null;
            }
            Handler handler = AbstractC53604NnB.A00;
            if (handler != null && (looper = handler.getLooper()) != null) {
                thread = looper.getThread();
            } else {
                thread = null;
            }
            HandlerThread handlerThread = (HandlerThread) thread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            AbstractC53604NnB.A00 = null;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
