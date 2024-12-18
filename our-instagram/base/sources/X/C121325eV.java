package X;

import com.facebook.quicklog.PointEditor;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5eV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121325eV implements InterfaceC13000lm {
    public C121335eW A00;
    public final UserSession A01;

    public C121325eV(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A00 != null) {
            C006802i.A0p.markerEnd(135806945, (short) 4);
            this.A00 = null;
        }
    }

    public static final void A00(C121325eV c121325eV) {
        C121335eW c121335eW = c121325eV.A00;
        if (c121335eW != null && !c121335eW.A04 && !c121335eW.A03) {
            PointEditor pointEditor = C006802i.A0p.withMarker(135806945).pointEditor("network_fetch_end");
            List list = c121335eW.A01;
            pointEditor.addPointData("is_successful", list.isEmpty()).addPointData("error_descriptions", (String[]) list.toArray(new String[0])).markerEditingCompleted();
            if (!list.isEmpty()) {
                c121325eV.A03(false);
            }
        }
    }

    public static final void A01(C121325eV c121325eV) {
        if (C18U.A06(C06090Tz.A05, c121325eV.A01, 36323062408293269L)) {
            C006802i.A0p.markerStart(135806945);
            c121325eV.A00 = new C121335eW();
        }
    }

    public static final void A02(Boolean bool, String str, List list) {
        PointEditor pointEditor = C006802i.A0p.withMarker(135806945).pointEditor(str);
        if (bool != null) {
            pointEditor.addPointData("is_successful", bool.booleanValue());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C121395ef c121395ef = (C121395ef) it.next();
            pointEditor.addPointData(AnonymousClass001.A0R(c121395ef.A03, "_num_res"), c121395ef.A04.size()).addPointData(AnonymousClass001.A0R(c121395ef.A03, "_expires_in_secs"), TimeUnit.MILLISECONDS.toSeconds(c121395ef.A01 - System.currentTimeMillis())).addPointData(AnonymousClass001.A0R(c121395ef.A03, "_request_id"), c121395ef.A02);
        }
        pointEditor.markerEditingCompleted();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r0.A02.size() != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(boolean r4) {
        /*
            r3 = this;
            X.5eW r0 = r3.A00
            if (r0 == 0) goto L1f
            if (r4 == 0) goto Lf
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r2 = 2
            if (r0 == 0) goto L10
        Lf:
            r2 = 3
        L10:
            X.5eW r0 = r3.A00
            if (r0 == 0) goto L1f
            X.02i r1 = X.C006802i.A0p
            r0 = 135806945(0x8183fe1, float:4.5815925E-34)
            r1.markerEnd(r0, r2)
            r0 = 0
            r3.A00 = r0
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121325eV.A03(boolean):void");
    }
}
