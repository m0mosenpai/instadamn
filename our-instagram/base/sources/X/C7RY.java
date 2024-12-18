package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7RY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RY implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final AnonymousClass988 A03;
    public final C162907Rb A04;
    public final HashMap A05 = new HashMap();

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_visual_message, viewGroup, false);
        C14360o3.A0A(inflate);
        JU0 ju0 = new JU0(inflate, this.A03, this);
        this.A04.A00(ju0);
        return ju0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023e, code lost:
    
        if (r0.length() != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0274, code lost:
    
        if (r0.length() != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r14.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01e2, code lost:
    
        r3 = 2131976696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0210, code lost:
    
        r3 = r6.getString(r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        if (r14.length() != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020d, code lost:
    
        r3 = 2131969587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        if (r14.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
    
        if (r14.length() != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        if (r0.length() != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0242, code lost:
    
        r3 = r6.getString(2131969677, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0178, code lost:
    
        if (r0.length() != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0278, code lost:
    
        r3 = r6.getString(2131976870, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (r14.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bb, code lost:
    
        if (r14.length() != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01df, code lost:
    
        if (r14.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0207, code lost:
    
        if (r14.length() != 0) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x006f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x044f  */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r20, X.InterfaceC129555tK r21) {
        /*
            Method dump skipped, instructions count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7RY.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        JU0 ju0 = (JU0) c7qd;
        C14360o3.A0B(ju0, 0);
        TightTextView tightTextView = ju0.A07;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A01(tightTextView, 0).A0G();
        tightTextView.setTranslationY(0.0f);
        tightTextView.setAlpha(1.0f);
        this.A05.clear();
        this.A04.A01(ju0);
    }

    public C7RY(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A02 = interfaceC165247aD;
        this.A03 = anonymousClass988;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        List singletonList = Collections.singletonList(AbstractC1575875s.A00(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C7Q6() { // from class: X.7RZ
            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                Context context;
                int i;
                InterfaceC165117a0 interfaceC165117a0;
                MessageIdentifier BSy;
                RectF A0G;
                ImmutableList A01;
                List list;
                boolean z;
                JVI jvi = (JVI) obj;
                JU0 ju0 = (JU0) obj2;
                C7RY c7ry = C7RY.this;
                C14360o3.A0A(jvi);
                C14360o3.A0A(ju0);
                if (!jvi.A01.A06) {
                    Integer num = jvi.A04;
                    switch (num.intValue()) {
                        case 0:
                            interfaceC165117a0 = (InterfaceC165117a0) c7ry.A02;
                            BSy = jvi.BSy();
                            A0G = AbstractC13880nE.A0G(ju0.A00);
                            C26084BgD c26084BgD = jvi.A00.A01;
                            if (c26084BgD == null) {
                                A01 = null;
                            } else {
                                A01 = AbstractC47173Kt8.A00.A01((MessagingUser) c26084BgD.A02, (InterfaceC50520MRx) c26084BgD.A03, c26084BgD.A01);
                            }
                            list = null;
                            z = false;
                            interfaceC165117a0.Cqv(A0G, ju0, BSy, A01, list, z, false, false);
                            return true;
                        case 1:
                        case 2:
                            if (num == C05F.A0C) {
                                UserSession userSession2 = c7ry.A01;
                                C19280xC A00 = C19280xC.A00(c7ry.A00, "direct_self_replay_raven_tap");
                                A00.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "Thread");
                                AbstractC11060iN.A00(userSession2).EHW(A00);
                            }
                            interfaceC165117a0 = (InterfaceC165117a0) c7ry.A02;
                            BSy = jvi.BSy();
                            z = true;
                            A0G = AbstractC13880nE.A0G(ju0.A00);
                            C26084BgD c26084BgD2 = jvi.A00.A01;
                            if (c26084BgD2 == null) {
                                A01 = null;
                            } else {
                                A01 = AbstractC47173Kt8.A00.A01((MessagingUser) c26084BgD2.A02, (InterfaceC50520MRx) c26084BgD2.A03, c26084BgD2.A01);
                            }
                            list = null;
                            interfaceC165117a0.Cqv(A0G, ju0, BSy, A01, list, z, false, false);
                            return true;
                        case 3:
                            ((InterfaceC164967Zl) c7ry.A02).Eku(jvi.BSy());
                            return true;
                        case 4:
                            context = ju0.A00.getContext();
                            C14360o3.A07(context);
                            i = 2131960838;
                            break;
                        case 5:
                            context = ju0.A00.getContext();
                            C14360o3.A07(context);
                            i = 2131960839;
                            break;
                    }
                    jvi.BSy();
                    ju0.A07.getLocationOnScreen(new int[2]);
                    C9GR.A09(context, context.getString(i));
                    return false;
                }
                return false;
            }
        }, interfaceC165247aD, anonymousClass988));
        C14360o3.A07(singletonList);
        this.A04 = new C162907Rb(singletonList);
    }
}
