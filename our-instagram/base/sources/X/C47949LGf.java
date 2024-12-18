package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.LGf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47949LGf {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public C49675Lx6 A03;
    public boolean A04;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final C66362zD A08;
    public final C47425KxG A09;
    public final L6T A0A;
    public final C47426KxH A0B;
    public final L6U A0C;
    public final C47427KxI A0D;

    public static final void A00(C47949LGf c47949LGf) {
        AbstractC70663Fe abstractC70663Fe;
        ArrayList A1F = AbstractC166987dD.A1F(c47949LGf.A05);
        if (c47949LGf.A06) {
            A1F.add(new Object());
        }
        float f = 0.4f;
        if (c47949LGf.A04) {
            f = 1.0f;
        }
        A1F.add(new C45656KIt(f));
        C49675Lx6 c49675Lx6 = c47949LGf.A03;
        if (c49675Lx6 == null) {
            C14360o3.A0F("directVisualTimelineScrollController");
            throw C00O.createAndThrow();
        }
        boolean A1b = AbstractC166987dD.A1b(c49675Lx6.A03);
        c49675Lx6.A03 = A1F;
        if (A1b && c49675Lx6.A01 == -1) {
            ListIterator A14 = AbstractC43592JPx.A14(A1F);
            while (true) {
                if (!A14.hasPrevious()) {
                    break;
                }
                if (A14.previous() instanceof C45656KIt) {
                    int nextIndex = A14.nextIndex();
                    if (nextIndex != -1 && (abstractC70663Fe = c49675Lx6.A09.A0D) != null) {
                        abstractC70663Fe.A1O(nextIndex);
                    }
                }
            }
            c49675Lx6.A01 = -1;
            c49675Lx6.A00 = 0.0f;
        }
        c47949LGf.A08.A05(AbstractC43593JPy.A0L(A1F));
    }

    public final void A01() {
        String str;
        View view = this.A00;
        if (view == null) {
            str = "playIndicator";
        } else {
            view.setVisibility(0);
            C49675Lx6 c49675Lx6 = this.A03;
            if (c49675Lx6 == null) {
                str = "directVisualTimelineScrollController";
            } else {
                boolean z = c49675Lx6.A04;
                L6U l6u = this.A0C;
                if (z) {
                    KBV.A01(l6u.A00);
                    return;
                } else {
                    l6u.A00();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    public C47949LGf(Context context, C47425KxG c47425KxG, L6T l6t, C47426KxH c47426KxH, L6U l6u) {
        this.A07 = context;
        this.A09 = c47425KxG;
        this.A0A = l6t;
        this.A0B = c47426KxH;
        this.A0C = l6u;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C45614KHd(l6t));
        A00.A01(new C45613KHc(c47425KxG));
        this.A08 = AbstractC31173DnH.A0R(A00, new Object());
        this.A05 = C16930sl.A00;
        this.A0D = new C47427KxI(this);
    }

    public final void A02(List list) {
        boolean z;
        String str;
        AbstractC46463KhN kx6;
        ArrayList<C45093JxN> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C45093JxN) next).A0K != null) {
                A1E.add(next);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        for (C45093JxN c45093JxN : A1E) {
            if (AbstractC167007dF.A1X(c45093JxN.A0B, EnumC40111tc.A0a)) {
                kx6 = new KX7(AbstractC25232BEp.A0t(c45093JxN.A0F));
            } else {
                ImageUrl imageUrl = c45093JxN.A04;
                if (imageUrl != null) {
                    str = imageUrl.getUrl();
                } else {
                    str = null;
                }
                kx6 = new KX6(str);
            }
            A0q.add(new C45197Jzd(kx6, c45093JxN.A01()));
        }
        this.A05 = AbstractC166987dD.A1F(A0q);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C45093JxN) it2.next()).A0K == null) {
                    break;
                }
            }
        }
        z = false;
        this.A06 = z;
        A00(this);
    }
}
