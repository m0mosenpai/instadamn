package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OJw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54802OJw {
    public DialogInterface.OnDismissListener A00;
    public Fragment A01;
    public BrandedContentGatingInfoIntf A02;
    public BrandedContentProjectMetadataIntf A03;
    public List A04;
    public boolean A05;
    public final Fragment A06;
    public final FragmentActivity A07;
    public final AbstractC10360h2 A08;
    public final InterfaceC11380iw A09;
    public final InterfaceC41501vz A0A = C56034Ou6.A00(this, 26);
    public final UserSession A0B;
    public final C41181vS A0C;
    public final C145186gd A0D;
    public final Context A0E;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r1.A0c().isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.DialogInterface.OnDismissListener r14, boolean r15) {
        /*
            r13 = this;
            r13.A00 = r14
            com.instagram.common.session.UserSession r4 = r13.A0B
            X.1My r3 = X.AbstractC25651Mw.A00(r4)
            java.lang.Class<X.Ots> r2 = X.C56021Ots.class
            X.1vz r1 = r13.A0A
            java.lang.String r0 = "branded_content_tag_event_story_edit"
            r3.A03(r1, r2, r0)
            java.util.List r7 = r13.A04
            if (r7 != 0) goto L19
            java.util.List r7 = java.util.Collections.emptyList()
        L19:
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r13.A03
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r2 = r13.A02
            boolean r12 = r13.A05
            X.1vS r1 = r13.A0C
            X.1qM r0 = r1.A0b
            r0.getClass()
            java.lang.String r5 = r0.getId()
            java.util.List r0 = r1.A0c()
            if (r0 == 0) goto L3b
            java.util.List r0 = r1.A0c()
            boolean r0 = r0.isEmpty()
            r8 = 1
            if (r0 == 0) goto L3c
        L3b:
            r8 = 0
        L3c:
            java.lang.String r6 = "story"
            X.AbstractC167017dG.A1P(r4, r7)
            r9 = 0
            r10 = 1
            r11 = r15
            androidx.fragment.app.Fragment r0 = X.AbstractC54944ORu.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r0
            androidx.fragment.app.FragmentActivity r0 = r13.A07
            X.6Yy r1 = X.AbstractC25225BEi.A0r(r0, r4)
            androidx.fragment.app.Fragment r0 = r13.A01
            r1.A0E(r0)
            java.lang.String r0 = "disclosure_menu"
            r1.A0A = r0
            r1.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802OJw.A00(android.content.DialogInterface$OnDismissListener, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (r6.A5t() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54802OJw(androidx.fragment.app.Fragment r9, X.InterfaceC11380iw r10, com.instagram.common.session.UserSession r11, X.C41181vS r12, X.C145186gd r13) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 26
            X.Ou6 r0 = X.C56034Ou6.A00(r8, r0)
            r8.A0A = r0
            r8.A0C = r12
            r8.A0B = r11
            X.0h2 r0 = r9.mFragmentManager
            r0.getClass()
            r8.A08 = r0
            android.content.Context r0 = r9.getContext()
            r0.getClass()
            r8.A0E = r0
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            r0.getClass()
            r8.A07 = r0
            r8.A06 = r9
            r8.A0D = r13
            r8.A09 = r10
            r1 = 15
            X.Ogm r0 = new X.Ogm
            r0.<init>(r8, r1)
            r8.A00 = r0
            X.1qM r6 = r12.A0b
            if (r6 == 0) goto L42
            boolean r1 = r6.A5t()
            r0 = 1
            if (r1 != 0) goto L43
        L42:
            r0 = 0
        L43:
            r8.A05 = r0
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            if (r6 == 0) goto L8e
            r6.A3r()
            java.util.List r0 = r6.A3r()
            java.util.Iterator r5 = r0.iterator()
        L56:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r5.next()
            X.4ip r4 = (X.InterfaceC102194ip) r4
            com.instagram.user.model.User r3 = r4.BzF()
            java.lang.Boolean r0 = r4.BcT()
            r2 = 0
            if (r0 == 0) goto L8c
            java.lang.Boolean r0 = r4.BcT()
            boolean r1 = r0.booleanValue()
        L75:
            java.lang.Boolean r0 = r4.Ca9()
            if (r0 == 0) goto L83
            java.lang.Boolean r0 = r4.Ca9()
            boolean r2 = r0.booleanValue()
        L83:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r3, r1, r2)
            r7.add(r0)
            goto L56
        L8c:
            r1 = 0
            goto L75
        L8e:
            r8.A04 = r7
            if (r6 == 0) goto La7
            X.1rF r0 = r6.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r0.Ai4()
        L98:
            r8.A03 = r0
            if (r6 == 0) goto La5
            X.1rF r0 = r6.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r0.BQl()
        La2:
            r8.A02 = r0
            return
        La5:
            r0 = 0
            goto La2
        La7:
            r0 = 0
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802OJw.<init>(androidx.fragment.app.Fragment, X.0iw, com.instagram.common.session.UserSession, X.1vS, X.6gd):void");
    }
}
