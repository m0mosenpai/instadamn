package com.instagram.debug.devoptions.section.zerorating;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC26671Qw;
import X.AbstractC31173DnH;
import X.AbstractC50523MSb;
import X.AbstractC54299NzJ;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.C00O;
import X.C023409i;
import X.C0f9;
import X.C102544jn;
import X.C14360o3;
import X.C1R0;
import X.C26661Qv;
import X.InterfaceC26681Qx;
import X.MSX;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Random;

/* loaded from: classes9.dex */
public final class ZeroE2ETestFragment extends AbstractC59962oe {
    public final Handler autoUpdate = new Handler();
    public Runnable autoUpdateTask;
    public boolean paused;
    public UserSession session;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "zero_token_summary";
    }

    public void setSession(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.session = userSession;
    }

    private final String getTokenStatsText(InterfaceC26681Qx interfaceC26681Qx) {
        int i;
        int i2;
        int i3;
        int i4;
        long A02;
        if (interfaceC26681Qx instanceof AbstractC26671Qw) {
            AbstractC26671Qw abstractC26671Qw = (AbstractC26671Qw) interfaceC26681Qx;
            synchronized (abstractC26671Qw) {
                C102544jn c102544jn = abstractC26671Qw.A01;
                i = c102544jn.A02;
                i2 = c102544jn.A03;
                i3 = c102544jn.A00;
                i4 = c102544jn.A01;
                A02 = abstractC26671Qw.A08.A02();
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('[');
            A1C.append(i);
            A1C.append(',');
            A1C.append(i2);
            A1C.append(',');
            A1C.append(i3);
            A1C.append(',');
            A1C.append(i4);
            A1C.append(',');
            A1C.append(A02);
            return MSX.A0l(A1C, ']');
        }
        return "N/A";
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateView(View view) {
        TextView A0N = AbstractC167007dF.A0N(view, R.id.nonce);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.token_manager_class);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.token_fetch_at);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.token_fetch_reason);
        TextView A0N5 = AbstractC167007dF.A0N(view, R.id.carrier_id);
        TextView A0N6 = AbstractC167007dF.A0N(view, R.id.connection_type_string);
        TextView A0N7 = AbstractC167007dF.A0N(view, R.id.token_stats);
        InterfaceC26681Qx A00 = C26661Qv.A00(getSession());
        C1R0 C98 = A00.C98();
        A0N.setText(AnonymousClass001.A0Q("Nonce: ", new Random().nextLong()));
        AbstractC50523MSb.A0o(A0N2, "TokenManagerClass: ", AbstractC31173DnH.A0q(A00));
        A0N3.setText(AnonymousClass001.A0Q("TokenFetchAt: ", C98.A03));
        AbstractC50523MSb.A0o(A0N4, "TokenFetchReason: ", A00.BV1());
        AbstractC50523MSb.A0o(A0N5, "E2EDogfoodCarrierId: ", AbstractC54299NzJ.A00());
        AbstractC50523MSb.A0o(A0N6, "ConnectionTypeString: ", null);
        AbstractC50523MSb.A0o(A0N7, "TokenStats: ", getTokenStatsText(A00));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1347444036);
        super.onCreate(bundle);
        setSession(C023409i.A0A.A06(requireArguments()));
        C0f9.A09(798408916, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1455428785);
        C14360o3.A0B(layoutInflater, 0);
        final View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.fragment_zero_e2e_test, false);
        updateView(A0C);
        Runnable runnable = new Runnable() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroE2ETestFragment$onCreateView$task$1
            @Override // java.lang.Runnable
            public void run() {
                final ZeroE2ETestFragment zeroE2ETestFragment = ZeroE2ETestFragment.this;
                if (!zeroE2ETestFragment.paused) {
                    final View view = A0C;
                    view.post(new Runnable() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroE2ETestFragment$onCreateView$task$1$run$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZeroE2ETestFragment zeroE2ETestFragment2 = ZeroE2ETestFragment.this;
                            View view2 = view;
                            C14360o3.A0A(view2);
                            zeroE2ETestFragment2.updateView(view2);
                        }
                    });
                }
                ZeroE2ETestFragment.this.autoUpdate.postDelayed(this, 2000L);
            }
        };
        this.autoUpdateTask = runnable;
        this.autoUpdate.postDelayed(runnable, 2000L);
        C0f9.A09(-1322816348, A02);
        return A0C;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(673281480);
        Runnable runnable = this.autoUpdateTask;
        if (runnable != null) {
            this.autoUpdate.removeCallbacks(runnable);
        }
        super.onDestroy();
        C0f9.A09(791167589, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(584840411);
        this.paused = true;
        super.onPause();
        C0f9.A09(-1740283976, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-856704126);
        super.onResume();
        this.paused = false;
        C0f9.A09(701792103, A02);
    }
}
