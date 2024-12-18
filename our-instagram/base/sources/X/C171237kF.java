package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171237kF {
    public int A00;
    public long A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public boolean A08;
    public final View A09;
    public final UserSession A0A;
    public final AbstractC59962oe A0C;
    public final C1810981l A0D;
    public final List A0F = new ArrayList();
    public final List A0E = new ArrayList();
    public String A06 = "";
    public List A07 = new ArrayList();
    public final HashMap A0B = new HashMap();

    public final void A03(final EnumC222849sP enumC222849sP) {
        C14360o3.A0B(enumC222849sP, 0);
        if (!this.A08) {
            AbstractC59962oe abstractC59962oe = this.A0C;
            if (abstractC59962oe.isAdded()) {
                if (this.A0B.get(enumC222849sP) != null && this.A01 > System.currentTimeMillis() - 300000) {
                    if (C18U.A06(C06090Tz.A05, this.A0A, 2342154256167076315L)) {
                        A01(this, enumC222849sP);
                        return;
                    } else {
                        A02(this, enumC222849sP);
                        return;
                    }
                }
                this.A08 = true;
                C4M5.A00();
                UserSession userSession = this.A0A;
                Context context = this.A09.getContext();
                C14360o3.A07(context);
                C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
                C1P1 c1p1 = new C1P1() { // from class: X.9g9
                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        int A03 = C0f9.A03(1183914353);
                        C214489em c214489em = (C214489em) obj;
                        int A032 = C0f9.A03(-486502013);
                        C14360o3.A0B(c214489em, 0);
                        C171237kF c171237kF = C171237kF.this;
                        c171237kF.A08 = false;
                        c171237kF.A01 = System.currentTimeMillis();
                        c171237kF.A06 = c214489em.A01;
                        c171237kF.A00 = c214489em.A00.intValue();
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator it = c214489em.A02.iterator();
                        while (it.hasNext()) {
                            AbstractC167017dG.A1V(A1E, it);
                        }
                        c171237kF.A07 = A1E;
                        HashMap hashMap = c171237kF.A0B;
                        EnumC222849sP enumC222849sP2 = enumC222849sP;
                        hashMap.put(enumC222849sP2, new C9BO(A1E, c171237kF.A00, 8));
                        if (C18U.A06(C06090Tz.A05, c171237kF.A0A, 2342154256167076315L)) {
                            C171237kF.A01(c171237kF, enumC222849sP2);
                        } else {
                            C171237kF.A02(c171237kF, enumC222849sP2);
                        }
                        C0f9.A0A(218781548, A032);
                        C0f9.A0A(1958854296, A03);
                    }
                };
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A09(C05F.A0N);
                c25621Ms.A0B("live/get_live_presence/");
                c25621Ms.A0P(null, C214489em.class, AE7.class, true);
                c25621Ms.A9s("presence_camera_type", enumC222849sP.A00);
                if (enumC222849sP == EnumC222849sP.A04 && AbstractC25351Lp.A01(userSession)) {
                    c25621Ms.A9s("presence_type", "1hr");
                }
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = c1p1;
                C1GJ.A00(context, A00, A0N);
            }
        }
    }

    private final LinearLayout A00() {
        View inflate = ((ViewStub) this.A09.requireViewById(R.id.iglive_presence_overlay_stub)).inflate();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.A03 = linearLayout;
        if (C18U.A06(C06090Tz.A05, this.A0A, 36322757465745891L)) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
        }
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C171237kF r23, X.EnumC222849sP r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171237kF.A01(X.7kF, X.9sP):void");
    }

    public static final void A02(C171237kF c171237kF, EnumC222849sP enumC222849sP) {
        LayoutInflater layoutInflater;
        C9BO c9bo = (C9BO) c171237kF.A0B.get(enumC222849sP);
        if (c9bo != null && c9bo.A00 > 0) {
            if (c171237kF.A03 == null) {
                LinearLayout A00 = c171237kF.A00();
                c171237kF.A03 = A00;
                c171237kF.A04 = (LinearLayout) A00.findViewById(R.id.quick_capture_presence_facepile_container);
                c171237kF.A05 = (TextView) A00.findViewById(R.id.quick_capture_presence_text);
                C14360o3.A07(c171237kF.A09.getContext());
                int A0A = ((int) (AbstractC13880nE.A0A(r0) * (1.0f - 0.65f))) / 2;
                ViewGroup.LayoutParams layoutParams = A00.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(A0A, 0, A0A, 0);
            }
            TextView textView = c171237kF.A05;
            if (textView != null) {
                textView.setText(c171237kF.A06);
                List<String> list = c171237kF.A07;
                ArrayList arrayList = new ArrayList();
                UserSession userSession = c171237kF.A0A;
                C18A A002 = AnonymousClass189.A00(userSession);
                for (String str : list) {
                    User A02 = A002.A02(str);
                    if (A02 == null) {
                        C4LM.A02.A02(userSession, null, str);
                    } else {
                        arrayList.add(A02.Bhu());
                    }
                }
                List list2 = c171237kF.A0F;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(8);
                }
                AbstractC59962oe abstractC59962oe = c171237kF.A0C;
                Object systemService = abstractC59962oe.requireContext().getSystemService(AbstractC58317Pt9.A00(44));
                if (systemService instanceof LayoutInflater) {
                    layoutInflater = (LayoutInflater) systemService;
                } else {
                    layoutInflater = null;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (list2.size() <= i) {
                        if (layoutInflater != null) {
                            View inflate = layoutInflater.inflate(R.layout.quick_capture_social_presence_avatar, (ViewGroup) c171237kF.A03, false);
                            C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
                            LinearLayout linearLayout = c171237kF.A04;
                            if (linearLayout != null) {
                                linearLayout.addView(inflate);
                                list2.add(inflate);
                                List list3 = c171237kF.A0E;
                                View findViewById = inflate.findViewById(R.id.quick_capture_presence_image);
                                C14360o3.A0C(findViewById, AbstractC111324zv.A00(4976));
                                list3.add(findViewById);
                                inflate.requireViewById(R.id.quick_capture_presence_dot).setVisibility(0);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    ((View) list2.get(i)).setVisibility(0);
                    ((IgImageView) c171237kF.A0E.get(i)).setUrl((ImageUrl) arrayList.get(i), abstractC59962oe);
                }
                Object obj = c171237kF.A0D.A08.A00;
                if (obj == C81S.A00 || (obj == C208509Kk.A00 && AbstractC25351Lp.A01(userSession))) {
                    LinearLayout linearLayout2 = c171237kF.A03;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                LinearLayout linearLayout3 = c171237kF.A03;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C171237kF(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C1810981l c1810981l) {
        this.A0A = userSession;
        this.A0C = abstractC59962oe;
        this.A09 = view;
        this.A0D = c1810981l;
    }
}
