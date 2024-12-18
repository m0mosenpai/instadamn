package X;

import android.content.Context;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ou8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56036Ou8 implements InterfaceC41501vz {
    public final Context A00;
    public final AbstractC10360h2 A01;
    public final C22P A02;
    public final UserSession A03;
    public final MediaCaptureActivity A04;
    public final AnonymousClass841 A05;
    public final UpcomingEvent A06;

    private void A04(Fragment fragment) {
        if (fragment instanceof AbstractC59962oe) {
            ((AbstractC59962oe) fragment).setContentInset(0, C3HB.A00(this.A00), 0, 0);
        }
        if (fragment instanceof C38K) {
            C38K c38k = (C38K) fragment;
            c38k.A00 = new Rect(0, C3HB.A00(this.A00), 0, 0);
            c38k.A0Z();
        }
    }

    public C56036Ou8(AbstractC10360h2 abstractC10360h2, C22P c22p, UserSession userSession, MediaCaptureActivity mediaCaptureActivity, AnonymousClass840 anonymousClass840, UpcomingEvent upcomingEvent) {
        this.A00 = mediaCaptureActivity;
        this.A03 = userSession;
        this.A01 = abstractC10360h2;
        this.A05 = anonymousClass840.A00();
        this.A04 = mediaCaptureActivity;
        this.A02 = c22p;
        this.A06 = upcomingEvent;
    }

    public static final ArrayList A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1X(A1E, MSW.A0R(it).AgC());
        }
        return A1E;
    }

    public static final ArrayList A01(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(MSW.A0R(it).B6E());
        }
        return A1E;
    }

    public static final ArrayList A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            CropInfo AtF = A0R.AtF();
            if (AtF != null) {
                Rect rect = AtF.A02;
                AbstractC166997dE.A1X(A1E2, rect.height());
                AbstractC166997dE.A1X(A1E2, rect.width());
            }
            A1E.add(A1E2);
        }
        return A1E;
    }

    public static final ArrayList A03(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            if (A0R.AtF() != null) {
                AbstractC166997dE.A1X(A1E2, r2.A00);
                AbstractC166997dE.A1X(A1E2, r2.A01);
            }
            A1E.add(A1E2);
        }
        return A1E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        if (X.C18U.A06(r5, r1, 36323848387767950L) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0215, code lost:
    
        if (r8 != com.instagram.creation.state.CreationState.A0T) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x048d, code lost:
    
        if (r0 == com.instagram.creation.state.CreationState.A07) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x063b, code lost:
    
        if (r0 == com.instagram.creation.state.CreationState.A0T) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0637, code lost:
    
        if (r0 != com.instagram.creation.state.CreationState.A0S) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x06e7, code lost:
    
        if (r6 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0211, code lost:
    
        if (r8 != com.instagram.creation.state.CreationState.A0S) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x029e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C50698MZt r39) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56036Ou8.A05(X.MZt):void");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-32732803);
        A05((C50698MZt) obj);
        C0f9.A0A(-901752710, A03);
    }
}
