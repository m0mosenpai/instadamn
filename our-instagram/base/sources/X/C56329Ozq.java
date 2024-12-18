package X;

import android.graphics.PointF;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;

/* renamed from: X.Ozq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56329Ozq implements InterfaceC58041PoR {
    public final /* synthetic */ C22P A00;
    public final /* synthetic */ N6J A01;

    @Override // X.InterfaceC58041PoR
    public final void DxU(User user, boolean z) {
        N6J n6j = this.A01;
        C22P c22p = this.A00;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        InterfaceC09390do interfaceC09390do = n6j.A0U;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36314601322711786L)) {
            peopleTag.A09(user);
        }
        if (z) {
            N6J.A05(n6j).A01(peopleTag, true);
            boolean A0F = AbstractC55229Oez.A0F(c22p, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31172DnG.A0s(N6J.A0R(n6j)));
            C50994Mg1 A05 = N6J.A05(n6j);
            String id = user.getId();
            if (A0F) {
                A05.A02(id);
                return;
            } else {
                A05.A06.A0B(id);
                return;
            }
        }
        N6J.A05(n6j).A01(peopleTag, false);
    }

    public C56329Ozq(C22P c22p, N6J n6j) {
        this.A01 = n6j;
        this.A00 = c22p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1.contains(r2.getId()) != true) goto L6;
     */
    @Override // X.InterfaceC58041PoR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DwE(com.instagram.user.model.User r6, boolean r7) {
        /*
            r5 = this;
            X.N6J r3 = r5.A01
            com.instagram.model.people.PeopleTag r2 = new com.instagram.model.people.PeopleTag
            r2.<init>(r6)
            X.5qm r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.util.List r1 = r0.A0n
            r4 = 1
            if (r1 == 0) goto L1b
            java.lang.String r0 = r2.getId()
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 == r4) goto L1c
        L1b:
            r0 = 0
        L1c:
            r1 = 0
            if (r0 == 0) goto L33
            X.Mg1 r4 = X.N6J.A05(r3)
            java.lang.String r0 = r6.getId()
            r4.A03(r0)
            X.Mg1 r0 = X.N6J.A05(r3)
            X.2GS r0 = r0.A06
            r0.A0B(r1)
        L33:
            X.5qm r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.util.List r0 = r0.A0q
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5d
            X.5qm r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r3)
            java.lang.String r0 = r0.A0U
            boolean r0 = X.AbstractC31174DnI.A1Y(r6, r0)
            if (r0 == 0) goto L56
            X.Mg1 r0 = X.N6J.A05(r3)
            X.2GS r0 = r0.A06
            r0.A0B(r1)
        L56:
            X.Mg1 r0 = X.N6J.A05(r3)
            r0.A00(r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56329Ozq.DwE(com.instagram.user.model.User, boolean):void");
    }
}
