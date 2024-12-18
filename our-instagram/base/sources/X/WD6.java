package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WD6 {
    public static final Handler A08 = AbstractC167007dF.A0J();
    public C38321qM A00;
    public final Context A01;
    public final C67923V2n A02;
    public final OKY A03;
    public final LimitedCommentsFragment A04;
    public final boolean A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;

    public final void A01(C84923qg c84923qg) {
        int size;
        Integer num;
        String quantityString;
        if (c84923qg != null) {
            size = 1;
        } else {
            ImmutableSet A03 = ImmutableSet.A03(this.A02.A06.A00);
            C14360o3.A07(A03);
            size = A03.size();
        }
        boolean z = this.A05;
        if (z) {
            num = C05F.A0N;
        } else {
            num = null;
        }
        Context context = this.A01;
        Resources resources = context.getResources();
        int i = R.plurals.approve_x_comments_dialog_title;
        if (z) {
            i = R.plurals.approve_x_replies_dialog_title;
        }
        Integer valueOf = Integer.valueOf(size);
        String A0W = AbstractC31175DnJ.A0W(resources, valueOf, i, size);
        C14360o3.A0A(A0W);
        if (z) {
            quantityString = context.getString(2131953112);
        } else {
            quantityString = resources.getQuantityString(R.plurals.approve_x_comments_dialog_primary_button, size, valueOf, valueOf);
        }
        C14360o3.A0A(quantityString);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A05 = A0W;
        c193328hC.A0Z(new DialogInterfaceOnClickListenerC70206WHe(16, c84923qg, this), EnumC193348hE.A02, quantityString, true);
        c193328hC.A0b(new WHj(5, c84923qg, num, this), AbstractC166997dE.A0p(context, 2131954754));
        if (!z) {
            c193328hC.A0r(AbstractC31175DnJ.A0W(resources, valueOf, R.plurals.approve_x_comments_dialog_body, size));
        }
        AbstractC166987dD.A1W(c193328hC);
    }

    public static final void A00(WD6 wd6, java.util.Set set) {
        C38321qM c38321qM = wd6.A00;
        if (c38321qM != null) {
            C25621Ms A0c = AbstractC167017dG.A0c(wd6.A07);
            A0c.A0L("limited_interactions/%s/comments/approve_limited_comments/", c38321qM.getId());
            AbstractC31173DnH.A1N(A0c);
            C71473Il A00 = C71473Il.A00(',');
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C84923qg c84923qg = (C84923qg) it.next();
                if (c84923qg != null) {
                    hashSet.add(c84923qg.A0G);
                }
            }
            A0c.A9s(AbstractC43591JPw.A00(322), A00.A02(hashSet));
            A0c.A9s("container_module", wd6.A06.getModuleName());
            A0c.A0R = true;
            C1ON A0N = A0c.A0N();
            A0N.A00 = new C67954V3t(18, set, wd6);
            RunnableC71525WvU runnableC71525WvU = new RunnableC71525WvU(A0N);
            Handler handler = A08;
            ArrayList arrayList = AbstractC47145Kse.A00;
            handler.postDelayed(runnableC71525WvU, AbstractC34043F0w.A00(r4));
        }
    }

    public WD6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C67923V2n c67923V2n, LimitedCommentsFragment limitedCommentsFragment, String str, boolean z) {
        AbstractC43594JPz.A1P(userSession, c67923V2n);
        this.A01 = context;
        this.A07 = userSession;
        this.A00 = c38321qM;
        this.A02 = c67923V2n;
        this.A04 = limitedCommentsFragment;
        this.A05 = z;
        this.A06 = interfaceC11380iw;
        this.A03 = new OKY(interfaceC11380iw, userSession, str);
    }
}
