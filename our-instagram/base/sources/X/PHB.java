package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PHB implements InterfaceC58082Pp7, InterfaceC37295Gbw {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final N6M A03;
    public final C50994Mg1 A04;
    public final AbstractC10360h2 A05;
    public final C22P A06;
    public final Boolean A07;

    public PHB(Context context, View view, AbstractC10360h2 abstractC10360h2, C22P c22p, UserSession userSession, N6M n6m, C50994Mg1 c50994Mg1, Boolean bool) {
        AbstractC167007dF.A1H(userSession, 2, c22p);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = abstractC10360h2;
        this.A01 = view;
        this.A03 = n6m;
        this.A04 = c50994Mg1;
        this.A06 = c22p;
        this.A07 = bool;
    }

    public final void A02(String str) {
        VideoView videoView = (VideoView) AbstractC166997dE.A0R(this.A01, R.id.people_tagging_video_preview_container);
        videoView.setVisibility(0);
        videoView.setOnPreparedListener(new LNA(this, 1));
        videoView.setOnCompletionListener(new C48030LMz(videoView, 3));
        if (C18U.A06(C06090Tz.A05, this.A02, 36318033004664660L)) {
            videoView.setOnErrorListener(Oh2.A00);
        }
        videoView.setVideoPath(str);
    }

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
    }

    @Override // X.InterfaceC58082Pp7
    public final void AAT(User user, boolean z) {
        String str;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36314601322711786L)) {
            peopleTag.A09(user);
        }
        if (z) {
            C50994Mg1 c50994Mg1 = this.A04;
            c50994Mg1.A01(peopleTag, true);
            boolean A0F = AbstractC55229Oez.A0F(this.A06, userSession, this.A07);
            String id = user.getId();
            if (A0F) {
                c50994Mg1.A02(id);
            } else {
                c50994Mg1.A06.A0B(id);
            }
        } else {
            this.A04.A01(peopleTag, false);
        }
        AVh();
        if (z) {
            N6M n6m = this.A03;
            String str2 = n6m.A0B;
            if (str2 != null) {
                C22P c22p = n6m.A03;
                if (c22p != null) {
                    UserSession A0r = AbstractC166987dD.A0r(n6m.A0Q);
                    C14360o3.A0B(A0r, 3);
                    AnonymousClass229.A01(A0r).A0E.A0R(c22p, str2, "clips_people_tagging");
                }
                str = "entryPoint";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "cameraSessionId";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        N6M n6m2 = this.A03;
        String str3 = n6m2.A0B;
        if (str3 != null) {
            C22P c22p2 = n6m2.A03;
            if (c22p2 != null) {
                UserSession A0r2 = AbstractC166987dD.A0r(n6m2.A0Q);
                C14360o3.A0B(A0r2, 3);
                C448624q c448624q = AnonymousClass229.A01(A0r2).A0E;
                C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
                if (AbstractC25226BEj.A1Z(A0A)) {
                    A0A.A0M(C81X.A2e, "tool_type");
                    A0A.A0s("IG_CAMERA_TAG_PEOPLE_PERSON_ADDED");
                    C448624q.A00(A0A, c448624q);
                    A0A.A0R("camera_session_id", str3);
                    A0A.A0a(EnumC114925Hg.CLIPS);
                    A0A.A0M(EnumC193318hB.A02, "capture_type");
                    A0A.A0b(c22p2);
                    A0A.A0T();
                    A0A.A0c(AnonymousClass249.VIDEO);
                    A0A.A0m("clips_people_tagging");
                    MSW.A1P(EnumC50631MWs.A0L, A0A);
                    AbstractC167017dG.A1D(A0A);
                    return;
                }
                return;
            }
            str = "entryPoint";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "cameraSessionId";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37183GZu
    public final FragmentActivity B8O() {
        return null;
    }

    @Override // X.InterfaceC43445JHj
    public final void CvL(Product product) {
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
    }

    @Override // X.InterfaceC43445JHj
    public final void D9a(Product product) {
    }

    @Override // X.InterfaceC43422JGm
    public final void D9b(ProductCollection productCollection) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DDE(Context context, User user, String str, int i) {
    }

    @Override // X.InterfaceC37183GZu
    public final void DFQ(FBUserTag fBUserTag) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DT2(User user, int i) {
    }

    @Override // X.GYN
    public final void Ds5() {
    }

    @Override // X.InterfaceC37184GZv, X.InterfaceC37182GZt
    public final void Dy8(User user, int i) {
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
    }

    @Override // X.InterfaceC43445JHj
    public final boolean Eja(Product product) {
        return false;
    }

    public final List A00() {
        List list = (List) this.A04.A09.A02();
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    public final List A01() {
        List list = (List) this.A04.A0A.A02();
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC58082Pp7
    public final void AVh() {
        this.A05.A18("PeopleTagSearch", 1);
        this.A03.A08(A01());
    }

    @Override // X.InterfaceC37183GZu
    public final void DFR(FBUserTag fBUserTag) {
        C50994Mg1 c50994Mg1 = this.A04;
        C05A c05a = c50994Mg1.A0C;
        List A1A = MSW.A1A(c05a);
        if (A1A == null) {
            A1A = C16930sl.A00;
        }
        if (AbstractC166987dD.A1b(A1A)) {
            ArrayList A0w = MSZ.A0w(c05a);
            if (A0w.remove(fBUserTag)) {
                c05a.Egh(A0w);
            }
            C05A c05a2 = c50994Mg1.A0B;
            java.util.Set A0j = AbstractC001800i.A0j(AbstractC31172DnG.A0w(c05a2));
            A0j.add(fBUserTag);
            c05a2.Egh(AbstractC001800i.A0a(A0j));
            this.A03.A08(A01());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC37184GZv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dew(com.instagram.user.model.User r10) {
        /*
            r9 = this;
            com.instagram.model.people.PeopleTag r7 = new com.instagram.model.people.PeopleTag
            r7.<init>(r10)
            java.util.List r0 = r9.A00()
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            r2 = 0
            if (r0 == 0) goto L7d
            java.util.List r1 = r9.A00()
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7d
            X.Mg1 r6 = r9.A04
            java.lang.String r0 = r10.getId()
            r6.A03(r0)
            X.2GS r0 = r6.A06
            r0.A0B(r2)
            X.N6M r0 = r9.A03
            java.lang.String r5 = r0.A0B
            if (r5 == 0) goto Lc7
            X.22P r4 = r0.A03
            if (r4 == 0) goto Lca
            X.0do r0 = r0.A0Q
            X.0ll r1 = X.AbstractC166987dD.A0o(r0)
            java.lang.String r3 = "clips_people_tagging"
            r2 = 2
            r0 = 3
            X.C14360o3.A0B(r1, r0)
            X.0wW r1 = X.AbstractC12220kQ.A02(r1)
            java.lang.String r0 = "ig_camera_invite_collaborator_person_removed"
            X.0Ai r8 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L66
            X.AbstractC166987dD.A1S(r8, r5)
            X.5Hg r1 = X.EnumC114925Hg.CLIPS
            java.lang.String r0 = "camera_destination"
            X.MSZ.A1B(r1, r8, r0)
            X.AbstractC50522MSa.A16(r4, r8, r2)
            X.AbstractC50523MSb.A0y(r8, r3)
        L63:
            X.AbstractC167017dG.A1C(r8)
        L66:
            java.util.List r0 = r9.A01()
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L7c
            r6.A00(r7)
            X.N6M r1 = r9.A03
            java.util.List r0 = r9.A01()
            r1.A08(r0)
        L7c:
            return
        L7d:
            X.Mg1 r6 = r9.A04
            X.2GS r1 = r6.A06
            java.lang.Object r0 = r1.A02()
            boolean r0 = X.AbstractC31174DnI.A1Y(r10, r0)
            if (r0 == 0) goto L8f
            r1.A0B(r2)
            goto L66
        L8f:
            X.N6M r0 = r9.A03
            java.lang.String r5 = r0.A0B
            if (r5 == 0) goto Lc7
            X.22P r4 = r0.A03
            if (r4 == 0) goto Lca
            X.0do r0 = r0.A0Q
            X.0ll r1 = X.AbstractC166987dD.A0o(r0)
            java.lang.String r3 = "clips_people_tagging"
            r2 = 2
            r0 = 3
            X.C14360o3.A0B(r1, r0)
            X.0wW r1 = X.AbstractC12220kQ.A02(r1)
            java.lang.String r0 = "ig_camera_tag_people_person_removed"
            X.0Ai r8 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L66
            X.AbstractC166987dD.A1S(r8, r5)
            X.5Hg r1 = X.EnumC114925Hg.CLIPS
            java.lang.String r0 = "camera_destination"
            X.MSZ.A1B(r1, r8, r0)
            X.AbstractC50522MSa.A16(r4, r8, r2)
            X.AbstractC50523MSb.A0y(r8, r3)
            goto L63
        Lc7:
            java.lang.String r0 = "cameraSessionId"
            goto Lcc
        Lca:
            java.lang.String r0 = "entryPoint"
        Lcc:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PHB.Dew(com.instagram.user.model.User):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC37184GZv
    public final void DKa(User user, boolean z) {
        Object obj;
        Object obj2;
        Iterator it = A01().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC31174DnI.A1Y(user, ((com.instagram.tagging.model.Tag) obj).getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PeopleTag peopleTag = (PeopleTag) obj;
        if (peopleTag != null) {
            peopleTag.A02 = !z;
            C2GS c2gs = this.A04.A0A;
            List<com.instagram.tagging.model.Tag> list = (List) c2gs.A02();
            if (list != null) {
                obj2 = AbstractC167017dG.A0q(list);
                for (com.instagram.tagging.model.Tag tag : list) {
                    if (C14360o3.A0K(tag.getId(), peopleTag.getId())) {
                        tag = peopleTag;
                    }
                    obj2.add(tag);
                }
            } else {
                obj2 = C16930sl.A00;
            }
            c2gs.A0B(obj2);
        }
    }
}
