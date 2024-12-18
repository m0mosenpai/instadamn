package X;

import android.content.Context;
import android.content.res.Resources;
import android.transition.TransitionManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LGG {
    public C47304KvF A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final RecyclerView A06;
    public final UserSession A07;
    public final Capabilities A08;
    public final C47345Kvu A09;
    public final C47377KwS A0A;
    public final C7JS A0B;
    public final C7UR A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public /* synthetic */ LGG(LinearLayout linearLayout, MUG mug, UserSession userSession, Capabilities capabilities, C7JS c7js, String str, boolean z, boolean z2, boolean z3) {
        C7UR c7ur = C7UR.A0A;
        C7UR A00 = C7US.A00(AbstractC166997dE.A0L(linearLayout));
        AbstractC167007dF.A1H(capabilities, 2, mug);
        C14360o3.A0B(A00, 10);
        this.A07 = userSession;
        this.A08 = capabilities;
        this.A0B = c7js;
        this.A01 = linearLayout;
        this.A0F = z;
        this.A0D = str;
        this.A0E = z2;
        this.A0G = z3;
        this.A0C = A00;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(linearLayout, R.id.direct_powerups_recycler_view);
        this.A06 = recyclerView;
        this.A04 = AbstractC167007dF.A0N(linearLayout, R.id.powerups_section_header);
        this.A02 = AbstractC167007dF.A0N(linearLayout, R.id.avatar_powerups_section_header);
        Context A0L = AbstractC166997dE.A0L(recyclerView);
        C47377KwS c47377KwS = new C47377KwS(A0L, new C47344Kvt(this), AnonymousClass988.A1Z.A00(this.A07, capabilities));
        recyclerView.setAdapter(c47377KwS.A00);
        this.A0A = c47377KwS;
        C47345Kvu c47345Kvu = new C47345Kvu(this);
        this.A09 = c47345Kvu;
        AbstractC31174DnI.A17(A0L, recyclerView, false);
        recyclerView.setItemAnimator(null);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        recyclerView.A10(new C3YB(dimensionPixelSize, dimensionPixelSize));
        recyclerView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        if (z2) {
            RecyclerView A0G = AbstractC31172DnG.A0G(linearLayout, R.id.avatar_powerups_recycler_view);
            this.A05 = A0G;
            Context context = A0G.getContext();
            AbstractC31174DnI.A17(context, A0G, false);
            A0G.setItemAnimator(null);
            Resources resources = A0G.getResources();
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            AbstractC37304Gc5.A0z(A0G, AbstractC166997dE.A08(resources), 0);
            A0G.setPadding(0, 0, 0, dimensionPixelSize2);
            UserSession userSession2 = this.A07;
            C14360o3.A07(context);
            C47304KvF c47304KvF = new C47304KvF(context, new C43888Jav(this, 5), userSession2, this.A0F);
            A0G.setAdapter(c47304KvF.A00);
            this.A00 = c47304KvF;
        } else {
            this.A05 = null;
        }
        TextView A0T = AbstractC166997dE.A0T(linearLayout, R.id.direct_powerups_nux);
        this.A03 = A0T;
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        C14360o3.A0B(A002, 0);
        InterfaceC19630xq interfaceC19630xq = A002.A01;
        if (!interfaceC19630xq.getBoolean(AbstractC111324zv.A00(4286), false) && interfaceC19630xq.getInt("direct_power_ups_nux_seen_count", 0) < 3) {
            A0T.setVisibility(0);
            AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "direct_power_ups_nux_seen_count", 0);
        }
        c7js.A02.add(c47345Kvu);
        A01(null, mug);
    }

    public static final void A00(LGG lgg) {
        java.util.Set set = AnonymousClass541.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : set) {
            if (((AnonymousClass541) obj).A01) {
                A1E.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AnonymousClass541 anonymousClass541 = (AnonymousClass541) it.next();
            AnonymousClass988 A00 = AnonymousClass988.A1Z.A00(lgg.A07, lgg.A08);
            C7IM c7im = lgg.A0B.A00;
            String str = lgg.A0D;
            boolean A1b = AbstractC43593JPy.A1b(anonymousClass541);
            String obj2 = anonymousClass541.toString();
            C2EY c2ey = C2EY.A1i;
            A0q.add(new C45893KSw(new AnonymousClass781(anonymousClass541, new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b), C7P3.A0S, c2ey, new MessageIdentifier(obj2, obj2), null, null, System.currentTimeMillis(), A1b, A1b, A1b, true, A1b), new C7QL(A00, c7im, c2ey, AbstractC09440dt.A01(MGC.A00), A1b, A1b, A1b, A1b, A1b, A1b), str, null, A1b, A1b, A1b, A1b), obj2));
        }
        C47377KwS c47377KwS = lgg.A0A;
        c47377KwS.A00.A05(AbstractC43593JPy.A0L(A0q));
        lgg.A06.A0n(0);
    }

    public final void A01(MUG mug, MUG mug2) {
        Object obj;
        RecyclerView recyclerView;
        int i;
        Object obj2 = null;
        if (mug != null) {
            obj = mug.A00;
        } else {
            obj = null;
        }
        if (!C14360o3.A0K(obj, mug2.A00)) {
            A00(this);
        }
        if (mug != null) {
            obj2 = mug.A03;
        }
        List<C45097JxR> list = (List) mug2.A03;
        if (!C14360o3.A0K(obj2, list)) {
            RecyclerView recyclerView2 = this.A05;
            C47304KvF c47304KvF = this.A00;
            String str = this.A0D;
            Capabilities capabilities = this.A08;
            if (recyclerView2 != null && c47304KvF != null) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (C45097JxR c45097JxR : list) {
                    AnonymousClass988 A00 = AnonymousClass988.A1Z.A00(this.A07, capabilities);
                    C7IM c7im = this.A0B.A00;
                    boolean A1b = AbstractC43593JPy.A1b(c45097JxR);
                    AnonymousClass541 anonymousClass541 = (AnonymousClass541) c45097JxR.A04;
                    String obj3 = anonymousClass541.toString();
                    C2EY c2ey = C2EY.A1i;
                    A0q.add(new LZZ(c45097JxR, new AnonymousClass781(anonymousClass541, new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b, A1b), C7P3.A0S, c2ey, new MessageIdentifier(obj3, obj3), null, null, System.currentTimeMillis(), A1b, A1b, A1b, true, A1b), new C7QL(A00, c7im, c2ey, AbstractC09440dt.A01(MFB.A00), A1b, A1b, A1b, A1b, A1b, A1b), str, null, A1b, A1b, A1b, A1b), obj3));
                }
                c47304KvF.A00.A05(AbstractC43593JPy.A0L(A0q));
                recyclerView2.A0n(0);
            }
        }
        boolean z = mug2.A01;
        int i2 = 0;
        this.A06.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        LinearLayout linearLayout = this.A01;
        linearLayout.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        TextView textView = this.A04;
        if (!z || !this.A0G) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        boolean z2 = true;
        if (!z || !AbstractC166987dD.A1b(list)) {
            z2 = false;
        }
        TransitionManager.beginDelayedTransition(linearLayout);
        if (z2 && this.A0E) {
            recyclerView = this.A05;
            i = 0;
        } else {
            recyclerView = this.A05;
            i = 8;
        }
        if (recyclerView != null) {
            recyclerView.setVisibility(i);
        }
        this.A02.setVisibility(i);
    }
}
