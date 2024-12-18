package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.base.MediaSession;

/* renamed from: X.KEa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45535KEa extends AbstractC168697g3 {
    public final float A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC189598ae A04;
    public final java.util.Set A05 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AnonymousClass840 anonymousClass840 = (AnonymousClass840) obj;
        if (anonymousClass840.A00().CPp()) {
            anonymousClass306.A7a(0);
            return;
        }
        int i = 2;
        if (((MediaSession) anonymousClass840.A00().CpK().get(0)).Btq() == C05F.A00) {
            i = 1;
        }
        anonymousClass306.A7a(i);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.KzC, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        View view2;
        L2T l2t;
        int A03 = C0f9.A03(1112881494);
        AnonymousClass840 anonymousClass840 = (AnonymousClass840) obj;
        View view3 = view;
        if (view == null) {
            if (i == 0) {
                C44416JkB c44416JkB = new C44416JkB(this.A02, anonymousClass840, this.A04);
                float f = this.A00;
                View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_album_preview);
                ?? obj3 = new Object();
                ReboundViewPager reboundViewPager = (ReboundViewPager) A0A.requireViewById(R.id.album_view_pager);
                obj3.A00 = reboundViewPager;
                reboundViewPager.A0N(c44416JkB, f);
                l2t = obj3;
                view2 = A0A;
            } else if (i == 1) {
                view3 = LBM.A00(viewGroup);
            } else {
                View A0A2 = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_video_preview);
                l2t = new L2T(A0A2);
                view2 = A0A2;
            }
            view2.setTag(l2t);
            view3 = view2;
        }
        int A032 = C0f9.A03(675393004);
        if (i == 0) {
            C47544KzC c47544KzC = (C47544KzC) AbstractC31172DnG.A0x(view3);
            UserSession userSession = this.A03;
            Context context = this.A01;
            InterfaceC189598ae interfaceC189598ae = this.A04;
            java.util.Set set = this.A05;
            float f2 = this.A00;
            ReboundViewPager reboundViewPager2 = c47544KzC.A00;
            reboundViewPager2.setPageSpacing(0.0f);
            reboundViewPager2.A0P(new KL6(context, userSession, anonymousClass840, c47544KzC, interfaceC189598ae, set));
            C47544KzC.A00(context, userSession, anonymousClass840, c47544KzC, interfaceC189598ae, set, (int) f2);
        } else {
            InterfaceC189598ae interfaceC189598ae2 = this.A04;
            String A0M = JQ1.A0M(anonymousClass840.A00(), 0);
            if (i == 1) {
                C47Z BcC = interfaceC189598ae2.BcC(A0M);
                BcC.getClass();
                LBM.A01(this.A02, (C46505Ki4) AbstractC31172DnG.A0x(view3), BcC, anonymousClass840.A00().ANZ().A00);
            } else {
                C47Z BcC2 = interfaceC189598ae2.BcC(A0M);
                BcC2.getClass();
                L2T l2t2 = (L2T) AbstractC31172DnG.A0x(view3);
                java.util.Set set2 = this.A05;
                set2.remove(l2t2.A01);
                set2.add(AbstractC46677Kku.A00(this.A01, this.A03, l2t2, BcC2, BcC2.A02));
            }
        }
        C0f9.A0A(-1011009257, A032);
        C0f9.A0A(1687619217, A03);
        return view3;
    }

    public C45535KEa(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC189598ae interfaceC189598ae, float f) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC189598ae;
        this.A00 = f;
    }
}
