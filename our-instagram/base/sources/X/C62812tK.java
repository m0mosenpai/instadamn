package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.music.common.model.AudioType;
import com.instagram.search.common.analytics.SearchContext;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62812tK implements InterfaceC60602pj {
    public C30A A00;
    public final Context A01;
    public final C9C3 A02;
    public final C62842tN A03;
    public final C62832tM A04;
    public final UserSession A05;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2tN] */
    public C62812tK(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A05 = userSession;
        this.A01 = context;
        final C9C3 c9c3 = new C9C3();
        this.A02 = c9c3;
        final C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        this.A04 = A00;
        this.A03 = new InterfaceC62852tO(c9c3, A00) { // from class: X.2tN
            public final C9C3 A00;
            public final C62832tM A01;

            @Override // X.InterfaceC62852tO
            public final void D5C(C120985dq c120985dq, Integer num, int i) {
                List list;
                C14360o3.A0B(c120985dq, 0);
                C62832tM c62832tM = this.A01;
                C9C3 c9c32 = this.A00;
                String str = c9c32.A01;
                if (str != null) {
                    list = c62832tM.A02(str).A03;
                } else {
                    list = C16930sl.A00;
                }
                if (list.contains(c120985dq)) {
                    c9c32.A00 = c120985dq;
                    ((AbstractCollection) c9c32.A04).add(c120985dq.getId());
                }
                c9c32.A02 = true;
            }

            @Override // X.InterfaceC62852tO
            public final void D5D(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC62852tO
            public final void D5I(InterfaceC111084zP interfaceC111084zP, List list, boolean z, boolean z2) {
            }

            {
                this.A00 = c9c3;
                this.A01 = A00;
            }
        };
    }

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
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
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
    public final void onDestroy() {
        String str = this.A02.A01;
        if (str != null) {
            C62832tM c62832tM = this.A04;
            c62832tM.A05(this.A03, str);
            c62832tM.A07(str);
        }
    }

    public final void A00(Fragment fragment, EnumC120805dQ enumC120805dQ, InterfaceC111084zP interfaceC111084zP, ClipsViewerSource clipsViewerSource, C88543xC c88543xC, C101544hP c101544hP, RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        String str6;
        String str7;
        AudioType audioType;
        String str8;
        RIXUChainingSourceType rIXUChainingSourceType;
        C38321qM c38321qM;
        C14360o3.A0B(clipsViewerSource, 0);
        C14360o3.A0B(interfaceC111084zP, 4);
        C14360o3.A0B(str3, 5);
        UserSession userSession = this.A05;
        C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, userSession);
        c116875Qr.A1D = str;
        c116875Qr.A1G = str2;
        c116875Qr.A0r = str3;
        c116875Qr.A0V = num;
        c116875Qr.A1d = true;
        C06090Tz c06090Tz = C06090Tz.A05;
        c116875Qr.A1N = C18U.A06(c06090Tz, userSession, 36311032204951970L);
        c116875Qr.A1c = C18U.A06(c06090Tz, userSession, 36311032206328227L);
        c116875Qr.A1f = C18U.A06(c06090Tz, userSession, 36311032206459300L);
        c116875Qr.A1h = z;
        c116875Qr.A1t = z2;
        c116875Qr.A0l = null;
        c116875Qr.A08 = enumC120805dQ;
        if (c88543xC != null) {
            str6 = c88543xC.getAssetId();
        } else {
            str6 = null;
        }
        c116875Qr.A1C = str6;
        if (c88543xC != null) {
            str7 = c88543xC.getAssetId();
        } else {
            str7 = null;
        }
        c116875Qr.A0g = str7;
        if (c88543xC != null) {
            audioType = c88543xC.A01;
        } else {
            audioType = null;
        }
        c116875Qr.A0M = audioType;
        if (c88543xC != null) {
            C128865s0 c128865s0 = new C128865s0(CMG.A00);
            c128865s0.A08 = c88543xC.A00;
            str8 = c128865s0.A00().A0W;
        } else {
            str8 = null;
        }
        c116875Qr.A0v = str8;
        c116875Qr.A03(new SearchContext(null, null, str4, null, null, null, null, null));
        c116875Qr.A0x = str5;
        c116875Qr.A0K = rIXUChainingBehaviorDefinition;
        c116875Qr.A0X = num2;
        if (C18U.A06(c06090Tz, userSession, 36330393917473626L)) {
            c116875Qr.A1d = false;
            c116875Qr.A1v = true;
        }
        if (C18U.A06(c06090Tz, userSession, 36330393917604700L)) {
            c116875Qr.A1d = false;
            c116875Qr.A1v = false;
            c116875Qr.A1P = true;
            if (c101544hP != null) {
                View view = c101544hP.itemView;
                C14360o3.A06(view);
                RectF rectF = AbstractC13880nE.A01;
                RectF rectF2 = new RectF();
                AbstractC13880nE.A0M(rectF2, view);
                c116875Qr.A02 = rectF2.top - AbstractC13880nE.A0B(this.A01);
                c116875Qr.A00 = rectF2.height();
                c116875Qr.A01 = rectF2.left;
                c116875Qr.A03 = rectF2.width();
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36330393917539163L)) {
            c116875Qr.A1w = true;
        }
        if (C18U.A06(c06090Tz, userSession, 36330393917670237L)) {
            c116875Qr.A1Y = true;
            CAB.A00 = new C57745PjY(new WeakReference(fragment), 12);
            if (fragment != null) {
                fragment.onPause();
                fragment.onStop();
            }
        }
        if (clipsViewerSource == ClipsViewerSource.A0S) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C120985dq c120985dq = (C120985dq) it.next();
                arrayList.add((c120985dq == null || (c38321qM = c120985dq.A02) == null) ? null : c38321qM.getId());
            }
            c116875Qr.A0A = ImmutableList.copyOf((Collection) arrayList);
            Context context = this.A01;
            c116875Qr.A0o = context.getString(2131966684);
            c116875Qr.A0p = context.getString(2131966683);
        }
        if (C18U.A06(c06090Tz, userSession, 36318170442373116L) && rIXUChainingBehaviorDefinition != null && (rIXUChainingSourceType = rIXUChainingBehaviorDefinition.A00) != null && rIXUChainingSourceType != RIXUChainingSourceType.A0A && rIXUChainingSourceType != RIXUChainingSourceType.A0B) {
            c116875Qr.A0q = AnonymousClass001.A0T(clipsViewerSource.A00, rIXUChainingSourceType.A00, '_');
        }
        ClipsViewerConfig A00 = c116875Qr.A00();
        this.A04.A03(interfaceC111084zP, EnumC125615m7.A03, str2, list, true, true);
        Context context2 = this.A01;
        C14360o3.A0C(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context2;
        if (z3) {
            AbstractC86593tX.A0Y(fragmentActivity, A00, userSession);
        } else {
            AbstractC86593tX.A0X(fragmentActivity, A00, userSession);
        }
    }
}
