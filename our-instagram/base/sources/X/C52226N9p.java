package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N9p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52226N9p extends C1P1 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public C52226N9p(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r8) {
        /*
            r7 = this;
            r0 = -331327582(0xffffffffec4057a2, float:-9.301104E26)
            int r6 = X.C0f9.A03(r0)
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            instagram.features.clips.edit.ClipsEditMetadataController r4 = r7.A00
            boolean r0 = r4.A0c
            if (r0 == 0) goto L40
            java.lang.String r1 = X.AbstractC172137li.A01(r8)
            X.2oe r0 = r4.A0q
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            r2 = r1
            if (r1 == 0) goto L24
            int r0 = r1.length()
            if (r0 != 0) goto L35
        L24:
            if (r3 == 0) goto L4d
            android.content.res.Resources r1 = r3.getResources()
            if (r1 == 0) goto L4d
            r0 = 2131961661(0x7f13273d, float:1.9560025E38)
            java.lang.String r1 = r1.getString(r0)
        L33:
            if (r2 == 0) goto L4a
        L35:
            int r0 = r2.length()
            if (r0 == 0) goto L4a
            java.lang.String r0 = "save_edits_failed_branded_content"
        L3d:
            X.C9GR.A03(r3, r1, r0, r5)
        L40:
            instagram.features.clips.edit.ClipsEditMetadataController.A0G(r4, r5)
            r0 = 579081582(0x2284156e, float:3.580136E-18)
            X.C0f9.A0A(r0, r6)
            return
        L4a:
            java.lang.String r0 = "save_edits_failed"
            goto L3d
        L4d:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52226N9p.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-2033937221);
        ClipsEditMetadataController.A0G(this.A00, true);
        C0f9.A0A(1361615993, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-313574138);
        N3N n3n = (N3N) obj;
        int A032 = C0f9.A03(-392557770);
        C14360o3.A0B(n3n, 0);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        if (clipsEditMetadataController.A0H != null) {
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            Context context = clipsEditMetadataController.A0n;
            AbstractC25226BEj.A1N(context, A0Y, 2131972351);
            A0Y.A02();
            A0Y.A07(R.drawable.instagram_info_pano_outline_24);
            A0Y.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            if (clipsEditMetadataController.view != null) {
                clipsEditMetadataController.A0I().postDelayed(new PP6(A0Y), 50L);
            }
            C38321qM c38321qM = clipsEditMetadataController.A0D;
            if (c38321qM != null && (str = c38321qM.A0M) != null) {
                AbstractC166987dD.A11(str).delete();
            }
        }
        UserSession userSession = clipsEditMetadataController.A0s;
        C1DW.A00(userSession).A03(n3n.A00());
        clipsEditMetadataController.A0o.post(new PP5(clipsEditMetadataController));
        C38321qM A00 = n3n.A00();
        C186808Px A002 = AbstractC186788Pv.A00(userSession);
        String id = A00.getId();
        if (id != null) {
            List A003 = A002.A00(id);
            if (A003 == null) {
                A003 = C16930sl.A00;
            }
            List A3g = A00.A3g();
            C28531Zo.A04.A0G(userSession, "CLIP", A3g, A003);
            Iterator it = A3g.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                if (AbstractC186788Pv.A01(userSession) || AbstractC31175DnJ.A1X(A15, A003)) {
                    C28531Zo.A04.A0A(userSession, A00, new DirectShareTarget(A15));
                }
            }
            C0f9.A0A(-2138238740, A032);
            C0f9.A0A(-1123144063, A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
