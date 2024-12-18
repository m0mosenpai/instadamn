package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import java.util.List;

/* renamed from: X.8hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193768hw implements InterfaceC193778hx, InterfaceC193788hy {
    public int A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public InterfaceC56392iX A04;
    public C193838i4 A05;
    public C194148iZ A06;
    public C31349DqE A07;
    public C6WQ A08;
    public final Activity A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final AbstractC59962oe A0C;
    public final InterfaceC11380iw A0D;
    public final UserSession A0E;
    public final C1810981l A0F;
    public final C8YY A0G;
    public final StoryDraftsCreationViewModel A0H;
    public final C75E A0I;
    public final C188848Ya A0J;

    public C193768hw(Activity activity, ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8YY c8yy, StoryDraftsCreationViewModel storyDraftsCreationViewModel, C75E c75e, C188848Ya c188848Ya) {
        int i;
        C14360o3.A0B(viewGroup, 5);
        C14360o3.A0B(c188848Ya, 6);
        this.A09 = activity;
        this.A0C = abstractC59962oe;
        this.A0E = userSession;
        this.A0D = interfaceC11380iw;
        this.A0B = viewGroup;
        this.A0J = c188848Ya;
        this.A0I = c75e;
        this.A0H = storyDraftsCreationViewModel;
        this.A0G = c8yy;
        this.A0F = c1810981l;
        this.A0A = activity.getApplicationContext();
        List list = (List) c75e.A01.A02();
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    public final void A00(Bitmap bitmap, C203238yg c203238yg, C183978Ee c183978Ee) {
        C14360o3.A0B(c183978Ee, 0);
        C14360o3.A0B(bitmap, 1);
        C193838i4 c193838i4 = this.A05;
        if (c193838i4 != null) {
            int i = c183978Ee.A07;
            if (!c193838i4.A0C) {
                C193838i4.A07(bitmap, c193838i4, i);
            }
            C8YY c8yy = this.A0G;
            C193838i4 c193838i42 = this.A05;
            if (c193838i42 != null) {
                c8yy.A0H(c193838i42, c203238yg, c183978Ee);
                return;
            }
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    public final void A01(Bitmap bitmap, C203238yg c203238yg, C195868lW c195868lW) {
        C14360o3.A0B(c195868lW, 0);
        C14360o3.A0B(bitmap, 1);
        C193838i4 c193838i4 = this.A05;
        if (c193838i4 != null) {
            if (!c193838i4.A0C) {
                C193838i4.A07(bitmap, c193838i4, 0);
            }
            C8YY c8yy = this.A0G;
            C193838i4 c193838i42 = this.A05;
            if (c193838i42 != null) {
                c8yy.A0I(c193838i42, c203238yg, c195868lW);
                return;
            }
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC193778hx
    public final void DU6(int i) {
        String str = "draftsDeleteButtonStubHolder";
        if (i > 0) {
            InterfaceC56392iX interfaceC56392iX = this.A04;
            if (interfaceC56392iX != null) {
                View view = interfaceC56392iX.getView();
                if (view.getVisibility() != 0) {
                    AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                    A01.A0G();
                    C14360o3.A06(this.A0A);
                    A01.A0T(AbstractC13880nE.A06(r0), 0.0f);
                    A01.A04 = 0;
                    A01.A0F(true).A0H();
                }
                IgTextView igTextView = this.A02;
                if (igTextView == null) {
                    str = "draftsDeleteButton";
                } else {
                    igTextView.setText(this.A0A.getString(2131974607, Integer.valueOf(i)));
                    return;
                }
            }
        } else {
            InterfaceC56392iX interfaceC56392iX2 = this.A04;
            if (interfaceC56392iX2 != null) {
                if (interfaceC56392iX2.CWW()) {
                    AbstractC125325le A012 = AbstractC125325le.A01(interfaceC56392iX2.getView(), 0);
                    A012.A0G();
                    C14360o3.A06(this.A0A);
                    A012.A0K(AbstractC13880nE.A06(r0));
                    A012.A03 = 8;
                    A012.A0F(true).A0H();
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC193788hy
    public final void DpK(Bitmap bitmap, String str) {
        C14360o3.A0B(str, 1);
        AbstractC58232lf.A00(AnonymousClass191.A00, new AnonymousClass058(new C206709Db(this.A0J, str, null))).A06(this.A0C, new C194618jM(new C207189Ex(1, this, bitmap)));
    }
}
