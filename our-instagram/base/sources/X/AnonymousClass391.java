package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.391, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass391 {
    public int A00;
    public C61792rg A01;
    public ViewOnTouchListenerC60632pm A02;
    public InterfaceC60142ow A03;
    public C57112jm A04;
    public C684636j A05;
    public InterfaceC114705Ga A06;
    public C5Gi A07;
    public C36Y A08;
    public InterfaceC114745Gf A09;
    public InterfaceC686036x A0A;
    public AnonymousClass392 A0B;
    public C33A A0C;
    public AbstractC61692rW A0D;
    public C33F A0E;
    public C684736k A0F;
    public C33P A0G;
    public C36Q A0H;
    public C81063jb A0I;
    public C61382r1 A0J;
    public ViewOnKeyListenerC677333n A0K;
    public InterfaceC114755Gg A0L;
    public AnonymousClass388 A0M;
    public InterfaceC684136e A0N;
    public SearchContext A0O;
    public InterfaceC61432r6 A0P;
    public C676533f A0Q;
    public C1M1 A0R;
    public String A0V;
    public String A0W;
    public List A0Y;
    public boolean A0Z;
    public boolean A0b;
    public boolean A0c;
    public C684436h A0d;
    public UserSession A0e;
    public C33F A0f;
    public User A0g;
    public final Context A0h;
    public final Fragment A0i;
    public final AbstractC10360h2 A0j;
    public final InterfaceC65272xP A0k;
    public final InterfaceC60442pS A0l;
    public boolean A0a = false;
    public EnumC114765Gh A0S = null;
    public Long A0U = null;
    public String A0X = null;
    public Boolean A0T = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.Fragment, X.2oh] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.36e, java.lang.Object] */
    public final AnonymousClass396 A00() {
        String str;
        if (this.A0H == null && this.A0R == null) {
            throw new NullPointerException("Either SessionIdProvider or MediaViewPointHelper must be not null.");
        }
        if (this.A04 == null) {
            this.A04 = AnonymousClass393.A00(this.A0i);
        }
        if (this.A0G == null) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            Context context = this.A0h;
            UserSession userSession = this.A0e;
            InterfaceC60442pS interfaceC60442pS = this.A0l;
            InterfaceC65272xP interfaceC65272xP = this.A0k;
            C1M1 c1m1 = this.A0R;
            if (c1m1 != null) {
                str = c1m1.getSessionId();
            } else {
                str = null;
            }
            C33N c33n = C33N.A08;
            this.A0G = new C33P(context, this.A0i, userSession, this.A04, interfaceC60442pS, this.A0D, interfaceC65272xP, null, c33n, C05F.A0u, str, false);
        }
        if (this.A0K == null) {
            this.A0K = new ViewOnKeyListenerC677333n(this.A0h, this.A0e, this.A0l, C33O.A00());
        }
        if (this.A0Q == null) {
            this.A0Q = new C676533f(this.A0i.getActivity(), this.A0k, this.A0e, this.A0l);
        }
        C36Y c36y = this.A08;
        if (c36y == null) {
            UserSession userSession2 = this.A0e;
            InterfaceC60442pS interfaceC60442pS2 = this.A0l;
            InterfaceC65272xP interfaceC65272xP2 = this.A0k;
            c36y = new C36Y(this.A0i, new C64362vv(userSession2, interfaceC60442pS2, interfaceC65272xP2, this.A0R), interfaceC60442pS2, interfaceC65272xP2, false);
            this.A08 = c36y;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c36y);
        List list = this.A0Y;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        if (this.A0E == null) {
            UserSession userSession3 = this.A0e;
            this.A0E = new C33F(userSession3, new C683736a(userSession3));
        }
        if (this.A0f == null) {
            UserSession userSession4 = this.A0e;
            final boolean z = this.A0Z;
            this.A0f = new C33F(userSession4, new C33C(z) { // from class: X.395
                public boolean A00;
                public final boolean A01;

                @Override // X.C33C
                public final void Dtr() {
                    this.A00 = true;
                }

                @Override // X.C33C
                public final boolean Elr() {
                    return true;
                }

                @Override // X.C33C
                public final boolean Ejn() {
                    if (this.A01 && !this.A00) {
                        return true;
                    }
                    return false;
                }

                @Override // X.C33C
                public final /* synthetic */ boolean Elq() {
                    return true;
                }

                {
                    this.A01 = z;
                }
            });
        }
        InterfaceC684136e interfaceC684136e = this.A0N;
        InterfaceC684136e interfaceC684136e2 = interfaceC684136e;
        if (interfaceC684136e == null) {
            Fragment fragment = this.A0i;
            if ((fragment instanceof InterfaceC53712dA) && ((InterfaceC53712dA) fragment).C4u() == 0) {
                C684036d c684036d = new C684036d(fragment, this.A0l, (InterfaceC53832dN) ((InterfaceC60052on) fragment).getRootActivity());
                this.A0N = c684036d;
                interfaceC684136e2 = c684036d;
            } else {
                ?? obj = new Object();
                this.A0N = obj;
                interfaceC684136e2 = obj;
            }
        }
        if (this.A0M == null) {
            this.A0M = new AnonymousClass387(this.A0i, this.A0e, this.A0l, null, interfaceC684136e2, this.A0O, this.A0R, this.A0U, this.A0X, false);
        }
        if (this.A0d == null) {
            this.A0d = new C684436h(this.A0i.getActivity(), this.A0e);
        }
        if (this.A0P == null) {
            this.A0P = new C85663rv();
        }
        if (this.A0A == null) {
            if (this.A0H == null) {
                Context context2 = this.A0h;
                Fragment fragment2 = this.A0i;
                InterfaceC59992oh interfaceC59992oh = (InterfaceC59992oh) fragment2;
                FragmentActivity requireActivity = fragment2.requireActivity();
                UserSession userSession5 = this.A0e;
                InterfaceC60442pS interfaceC60442pS3 = this.A0l;
                C1M1 c1m12 = this.A0R;
                C57112jm c57112jm = this.A04;
                AnonymousClass341 anonymousClass341 = AnonymousClass341.A0K;
                HLZ hlz = new HLZ();
                C33P c33p = this.A0G;
                C33P c33p2 = null;
                if (c33p.A0B != null) {
                    c33p2 = c33p;
                }
                ViewOnKeyListenerC677333n viewOnKeyListenerC677333n = this.A0K;
                AbstractC61692rW abstractC61692rW = this.A0D;
                C61382r1 c61382r1 = this.A0J;
                C14360o3.A0B(interfaceC59992oh, 1);
                C14360o3.A0B(c1m12, 5);
                C14360o3.A0B(c57112jm, 6);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(hlz);
                this.A0H = AbstractC37505GfN.A00(context2, requireActivity, interfaceC59992oh, userSession5, c57112jm, interfaceC60442pS3, abstractC61692rW, anonymousClass341, c33p2, c61382r1, viewOnKeyListenerC677333n, c1m12, null, arrayList2);
            }
            Fragment fragment3 = this.A0i;
            AbstractC10360h2 abstractC10360h2 = this.A0j;
            InterfaceC60442pS interfaceC60442pS4 = this.A0l;
            InterfaceC65272xP interfaceC65272xP3 = this.A0k;
            C33P c33p3 = this.A0G;
            ViewOnKeyListenerC677333n viewOnKeyListenerC677333n2 = this.A0K;
            C36Y c36y2 = this.A08;
            C33A c33a = this.A0C;
            C676533f c676533f = this.A0Q;
            UserSession userSession6 = this.A0e;
            C1M1 c1m13 = this.A0R;
            C33F c33f = this.A0E;
            C33F c33f2 = this.A0f;
            AnonymousClass388 anonymousClass388 = this.A0M;
            C684436h c684436h = this.A0d;
            C57332k8 A04 = C57332k8.A04(this.A0h, userSession6);
            boolean z2 = this.A0b;
            InterfaceC114745Gf interfaceC114745Gf = this.A09;
            C57112jm c57112jm2 = this.A04;
            C36Q c36q = this.A0H;
            String str2 = this.A0W;
            C684636j c684636j = this.A05;
            C684736k c684736k = this.A0F;
            InterfaceC61432r6 interfaceC61432r6 = this.A0P;
            boolean z3 = this.A0c;
            boolean z4 = this.A0a;
            InterfaceC114755Gg interfaceC114755Gg = this.A0L;
            String str3 = this.A0V;
            InterfaceC114705Ga interfaceC114705Ga = this.A06;
            EnumC114765Gh enumC114765Gh = this.A0S;
            C5Gi c5Gi = this.A07;
            boolean booleanValue = this.A0T.booleanValue();
            SearchContext searchContext = this.A0O;
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
            C81063jb c81063jb = this.A0I;
            Long l = this.A0U;
            String str4 = this.A0X;
            InterfaceC60142ow interfaceC60142ow = this.A03;
            AbstractC61692rW abstractC61692rW2 = this.A0D;
            C14360o3.A0B(abstractC10360h2, 2);
            C14360o3.A0B(interfaceC65272xP3, 4);
            C14360o3.A0B(c33p3, 5);
            C14360o3.A0B(c676533f, 9);
            C14360o3.A0B(c33f, 12);
            C14360o3.A0B(anonymousClass388, 14);
            C14360o3.A0B(c57112jm2, 20);
            C14360o3.A0B(interfaceC61432r6, 27);
            this.A0A = new C685836v(fragment3, abstractC10360h2, viewOnTouchListenerC60632pm, interfaceC60142ow, c684436h, userSession6, c57112jm2, c684636j, interfaceC114705Ga, c5Gi, c36y2, interfaceC114745Gf, interfaceC60442pS4, c33a, abstractC61692rW2, interfaceC65272xP3, c33f, null, c33f2, c684736k, A04, c33p3, c36q, c81063jb, null, null, viewOnKeyListenerC677333n2, interfaceC114755Gg, null, anonymousClass388, searchContext, interfaceC61432r6, c676533f, c1m13, enumC114765Gh, l, null, str2, null, str3, str4, z2, z3, z4, booleanValue);
        }
        int i2 = this.A00;
        int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Fragment fragment4 = this.A0i;
        FragmentActivity activity = fragment4.getActivity();
        UserSession userSession7 = this.A0e;
        InterfaceC60442pS interfaceC60442pS5 = this.A0l;
        if (i2 <= 0) {
            i2 = 23592961;
        }
        C62882tR c62882tR = new C62882tR(activity, interfaceC60442pS5, userSession7, i2);
        InterfaceC65272xP interfaceC65272xP4 = this.A0k;
        C33P c33p4 = this.A0G;
        ViewOnKeyListenerC677333n viewOnKeyListenerC677333n3 = this.A0K;
        C36Y c36y3 = this.A08;
        C33A c33a2 = this.A0C;
        C676533f c676533f2 = this.A0Q;
        InterfaceC684136e interfaceC684136e3 = this.A0N;
        return new AnonymousClass396(fragment4, this.A01, userSession7, c36y3, this.A0A, interfaceC65272xP4, this.A0B, interfaceC60442pS5, c33a2, C57352kA.A05(userSession7), c33p4, viewOnKeyListenerC677333n3, c62882tR, interfaceC684136e3, this.A0P, c676533f2, this.A0R, arrayList);
    }

    public AnonymousClass391(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC65272xP interfaceC65272xP, C60972qL c60972qL) {
        this.A0h = c60972qL.A00;
        this.A0i = fragment;
        this.A0j = abstractC10360h2;
        this.A0k = interfaceC65272xP;
        this.A0l = c60972qL.A02;
        UserSession userSession = c60972qL.A01;
        this.A0e = userSession;
        this.A0g = C17060sy.A01.A01(userSession);
    }
}
