package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.36Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36Q {
    public C36V A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final C63622uj A03;
    public final C36T A04;
    public final C36R A05;
    public final C36S A06;
    public final Map A07;
    public final Map A08;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.36T] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.36S] */
    public C36Q(InterfaceC59992oh interfaceC59992oh, final UserSession userSession, C57112jm c57112jm, final List list, final List list2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c57112jm;
        this.A03 = new C63622uj();
        final C36R c36r = new C36R(list);
        this.A05 = c36r;
        final ?? r1 = new Object(list, list2) { // from class: X.36S
            public final List A00;
            public final List A01;

            {
                this.A00 = list;
                this.A01 = list2;
            }
        };
        this.A06 = r1;
        this.A04 = new InterfaceC43071ya(userSession) { // from class: X.36T
            public final UserSession A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                InterfaceC38371qR interfaceC38371qR;
                if (c59062n7 != null) {
                    interfaceC38371qR = (InterfaceC38371qR) c59062n7.A03;
                } else {
                    interfaceC38371qR = null;
                }
                if (interfaceC38371qR instanceof C40971v4) {
                    if ((interfaceC57162jr != null ? interfaceC57162jr.CFq(c59062n7) : null) == C05F.A00) {
                        AbstractC41561w6.A00(this.A00).A01((C40971v4) interfaceC38371qR);
                    }
                }
            }

            {
                this.A00 = userSession;
            }
        };
        this.A08 = new HashMap();
        this.A07 = new HashMap();
        interfaceC59992oh.registerLifecycleListener(new InterfaceC60602pj(c36r, r1) { // from class: X.36U
            public final C36R A00;
            public final C36S A01;

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void ADK(View view) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void D8S(View view) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onCreate() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onDestroy() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onDestroyView() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onResume() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onStart() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onStop() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final void onPause() {
                this.A00.pause();
            }

            {
                this.A00 = c36r;
                this.A01 = r1;
            }
        });
        this.A00 = C36V.A02;
    }
}
