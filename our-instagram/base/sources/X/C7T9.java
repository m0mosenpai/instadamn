package X;

import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7T9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7T9 implements C7QC {
    public static final C7TA A07 = new Object();
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final AnonymousClass988 A03;
    public final C162907Rb A04;
    public final HashMap A05 = new HashMap();
    public final Map A06 = new HashMap();

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_visual_thumbnail_message, viewGroup, false);
        C14360o3.A0A(inflate);
        AnonymousClass988 anonymousClass988 = this.A03;
        JV2 jv2 = new JV2(inflate, this.A00, this.A01, anonymousClass988, this);
        this.A04.A00(jv2);
        return jv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r30, X.InterfaceC129555tK r31) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7T9.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        JV2 jv2 = (JV2) c7qd;
        C14360o3.A0B(jv2, 0);
        HashMap hashMap = this.A05;
        if (hashMap.containsKey(jv2)) {
            hashMap.remove(jv2);
        }
        C7TA.A01(this.A01, jv2, this.A06);
        L7B l7b = jv2.A00;
        if (l7b != null) {
            l7b.A00();
        }
        jv2.A00 = null;
        this.A04.A01(jv2);
    }

    public C7T9(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC165247aD;
        this.A03 = anonymousClass988;
        List singletonList = Collections.singletonList(AbstractC1575875s.A00(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C7Q6() { // from class: X.7TB
            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                ImmutableList A01;
                C129565tL c129565tL = (C129565tL) obj;
                JV2 jv2 = (JV2) obj2;
                if (!c129565tL.A08) {
                    C7T9 c7t9 = C7T9.this;
                    C14360o3.A0A(jv2);
                    InterfaceC129525tH interfaceC129525tH = ((AbstractC129515tG) c129565tL).A00;
                    boolean BCt = interfaceC129525tH.BCt();
                    MessageIdentifier BSy = c129565tL.BSy();
                    InterfaceC165247aD interfaceC165247aD2 = c7t9.A02;
                    if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD2, BSy, BCt)) {
                        if (jv2.A0B.getVisibility() != 0) {
                            if (AbstractC46827KnM.A00(interfaceC129525tH.CVC(), c129565tL.A09).A01()) {
                                InterfaceC165117a0 interfaceC165117a0 = (InterfaceC165117a0) interfaceC165247aD2;
                                MessageIdentifier BSy2 = c129565tL.BSy();
                                RectF A0G = AbstractC13880nE.A0G(jv2.A0A);
                                C26084BgD c26084BgD = c129565tL.A01.A01;
                                if (c26084BgD == null) {
                                    A01 = null;
                                } else {
                                    InterfaceC50520MRx interfaceC50520MRx = (InterfaceC50520MRx) c26084BgD.A03;
                                    int i = c26084BgD.A01;
                                    A01 = AbstractC47173Kt8.A00.A01((MessagingUser) c26084BgD.A02, interfaceC50520MRx, i);
                                }
                                interfaceC165117a0.Cqv(A0G, jv2, BSy2, A01, null, false, true, false);
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }, interfaceC165247aD, anonymousClass988));
        C14360o3.A07(singletonList);
        this.A04 = new C162907Rb(singletonList);
    }
}
