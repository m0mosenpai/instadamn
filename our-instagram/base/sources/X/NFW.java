package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFW extends C2AH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AbstractC018607g A02;
    public final /* synthetic */ C22P A03;
    public final /* synthetic */ ACRType A04;
    public final /* synthetic */ C8JY A05;
    public final /* synthetic */ C41181vS A06;
    public final /* synthetic */ C6WQ A07;
    public final /* synthetic */ C145176gc A08;
    public final /* synthetic */ List A09;

    public NFW(Context context, AbstractC018607g abstractC018607g, C22P c22p, ACRType aCRType, C8JY c8jy, C41181vS c41181vS, C6WQ c6wq, C145176gc c145176gc, List list, int i) {
        this.A07 = c6wq;
        this.A09 = list;
        this.A05 = c8jy;
        this.A03 = c22p;
        this.A04 = aCRType;
        this.A08 = c145176gc;
        this.A06 = c41181vS;
        this.A00 = i;
        this.A01 = context;
        this.A02 = abstractC018607g;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C145176gc c145176gc = this.A08;
        Context context = this.A01;
        C8JY c8jy = this.A05;
        C9GR.A0B(context, "NavigateToFeedCreationWithReelItem_RemoteMediaConversionTaskFailed");
        c8jy.A01("NavigateToFeedCreationWithReelItem_RemoteMediaConversionTaskFailed");
        ReelViewerFragment.A0I((ReelViewerFragment) c145176gc.A18, false);
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        this.A07.dismiss();
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        C0fJ.A00(this.A07);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C145176gc c145176gc;
        Context context;
        C8JY c8jy;
        String str;
        String str2;
        String str3;
        Activity rootActivity;
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            List list2 = null;
            String str4 = null;
            String str5 = null;
            List list3 = null;
            if (list.size() == 1) {
                Medium medium = (Medium) list.get(0);
                String id = AbstractC25225BEi.A0x(this.A09, 0).getId();
                if (medium.Cff()) {
                    C8JY c8jy2 = this.A05;
                    C22P c22p = this.A03;
                    ACRType aCRType = this.A04;
                    long j = c8jy2.A00;
                    if (j != 0) {
                        C1QT c1qt = c8jy2.A02;
                        c1qt.flowMarkPoint(j, "FEED_SINGLE_VIDEO_NAVIGATION_START");
                        c1qt.flowEndNewStartFound(c8jy2.A00);
                        c8jy2.A00 = 0L;
                        c8jy2.A00(c22p, aCRType);
                    }
                    C145176gc c145176gc2 = this.A08;
                    UserSession userSession = c145176gc2.A09;
                    if (userSession != null) {
                        if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36323942876589776L)) {
                            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) c145176gc2.A1B.get();
                            if (abstractC59962oe != null && (rootActivity = abstractC59962oe.getRootActivity()) != null) {
                                UserSession userSession2 = c145176gc2.A09;
                                if (userSession2 != null) {
                                    List A1J = AbstractC166987dD.A1J(medium);
                                    C41181vS c41181vS = this.A06;
                                    if (c41181vS.A1K()) {
                                        str4 = c41181vS.A0k;
                                    }
                                    AbstractC86593tX.A0L(rootActivity, c22p, userSession2, null, null, str4, id, A1J, false);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            InterfaceC69973Cg interfaceC69973Cg = c145176gc2.A0D;
                            if (interfaceC69973Cg == null) {
                                return;
                            }
                            android.net.Uri A02 = medium.A02();
                            int i = this.A00;
                            C41181vS c41181vS2 = this.A06;
                            if (c41181vS2.A1K()) {
                                str5 = c41181vS2.A0k;
                            }
                            interfaceC69973Cg.Eo7(A02, c22p, id, str5, i, false);
                            return;
                        }
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                if (medium.A05()) {
                    C8JY c8jy3 = this.A05;
                    long j2 = c8jy3.A00;
                    if (j2 != 0) {
                        c8jy3.A02.flowMarkPoint(j2, "FEED_SINGLE_PHOTO_NAVIGATION_START");
                    }
                    InterfaceC69973Cg interfaceC69973Cg2 = this.A08.A0D;
                    if (interfaceC69973Cg2 == null) {
                        return;
                    }
                    android.net.Uri A022 = medium.A02();
                    int i2 = this.A00;
                    C22P c22p2 = this.A03;
                    C41181vS c41181vS3 = this.A06;
                    if (c41181vS3.A0Q) {
                        str3 = c41181vS3.A0k;
                        list3 = AbstractC166987dD.A1J(id);
                    } else {
                        str3 = null;
                    }
                    interfaceC69973Cg2.EnD(A022, c22p2, null, null, id, null, null, null, str3, null, list3, i2, 10004, false);
                    return;
                }
                c145176gc = this.A08;
                context = this.A01;
                c8jy = this.A05;
                str = "NavigateToFeedCreationWithReelItem_NotPhotoOrVideo";
            } else {
                C8JY c8jy4 = this.A05;
                long j3 = c8jy4.A00;
                if (j3 != 0) {
                    c8jy4.A02.flowMarkPoint(j3, "FEED_CAROUSEL_NAVIGATION_START");
                }
                InterfaceC69973Cg interfaceC69973Cg3 = this.A08.A0D;
                if (interfaceC69973Cg3 == null) {
                    return;
                }
                List list4 = this.A09;
                int i3 = this.A00;
                C22P c22p3 = this.A03;
                C41181vS c41181vS4 = this.A06;
                if (c41181vS4.A0Q) {
                    str2 = c41181vS4.A0k;
                    ArrayList A0q = AbstractC167017dG.A0q(list4);
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        A0q.add(AbstractC37302Gc3.A0g(it));
                    }
                    list2 = AbstractC001800i.A0X(A0q);
                } else {
                    str2 = null;
                }
                AbstractC018607g abstractC018607g = this.A02;
                int i4 = 10001;
                if (c41181vS4.A0Q) {
                    i4 = 10005;
                }
                interfaceC69973Cg3.E2N(abstractC018607g, c22p3, str2, list4, list, list2, i3, i4);
                return;
            }
        } else {
            c145176gc = this.A08;
            context = this.A01;
            c8jy = this.A05;
            str = "NavigateToFeedCreationWithReelItem_EmptyMediumList";
        }
        C9GR.A0B(context, str);
        c8jy.A01(str);
        ReelViewerFragment.A0I((ReelViewerFragment) c145176gc.A18, false);
    }
}
