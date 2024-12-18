package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dwt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC31740Dwt extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC31740Dwt(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        LruCache lruCache;
        C1ON A06;
        List list;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(message, 0);
                if (message.what != 1) {
                    return;
                }
                Object obj = message.obj;
                AbstractC25225BEi.A1S(obj);
                String str = (String) obj;
                if (str.length() == 0) {
                    return;
                }
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A01;
                CallerContext callerContext = CategorySearchFragment.A0U;
                LruCache lruCache2 = C34934FaK.A01;
                AbstractC18680vv abstractC18680vv = categorySearchFragment.A0A;
                C14360o3.A0A(abstractC18680vv);
                Context requireContext = categorySearchFragment.requireContext();
                C08790ch A00 = AbstractC018607g.A00(categorySearchFragment);
                boolean A03 = AbstractC35211Fg4.A03(categorySearchFragment.A06);
                EU9 eu9 = new EU9(categorySearchFragment);
                C14360o3.A0B(abstractC18680vv, 0);
                if (A03) {
                    lruCache = C34934FaK.A02;
                } else {
                    lruCache = C34934FaK.A01;
                }
                Object obj2 = lruCache.get(str);
                if (obj2 != null) {
                    eu9.onSuccess(obj2);
                    return;
                }
                EUN eun = new EUN(eu9, str, A03);
                C2JM A0b = AbstractC25225BEi.A0b();
                A0b.A04("query", str);
                A0b.A04("locale", C1Q2.A00());
                A0b.A01("filter_temp_deprecated_cat");
                C18C.A0E(true);
                C907442n c907442n = new C907442n(A0b, E52.class, "CategoryTypeaheadQuery", false);
                boolean z = abstractC18680vv instanceof UserSession;
                C907542o c907542o = new C907542o(abstractC18680vv);
                c907542o.A08(c907442n);
                if (z) {
                    A06 = c907542o.A05();
                } else {
                    A06 = c907542o.A06();
                }
                A06.A00 = eun;
                C1GJ.A00(requireContext, A00, A06);
                return;
            case 1:
                if (message.what != 1) {
                    return;
                }
                String str2 = (String) message.obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                ENK enk = (ENK) this.A01;
                if (!enk.isVisible()) {
                    return;
                }
                C907642p c907642p = new C907642p(FVV.class, "CityQuery", StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str2), true);
                C907542o c907542o2 = new C907542o(AbstractC31178DnM.A0M(AbstractC60492pY.A02(enk)));
                c907542o2.A09(c907642p);
                Integer num = C05F.A00;
                c907542o2.A08 = AbstractC111324zv.A00(58);
                C1ON A07 = c907542o2.A07(num);
                A07.A00 = new EUJ(enk, str2);
                enk.schedule(A07);
                return;
            case 2:
                C14360o3.A0B(message, 0);
                int i = message.what;
                if (i == 1) {
                    AbstractC13880nE.A0O(((C36473G6x) this.A01).A07);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    C36473G6x.A00((C36473G6x) this.A01);
                    return;
                }
            case 3:
                EVH evh = (EVH) this.A01;
                while (true) {
                    Deque deque = evh.A05;
                    if (deque.isEmpty()) {
                        return;
                    }
                    String str3 = (String) deque.removeFirst();
                    if (evh.A01 != null && str3 != null && (list = evh.A02) != null) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C1ON A04 = AbstractC35238FgX.A04(evh.A00, AbstractC13670mt.A06("friendships/%s/following/", AbstractC25226BEj.A15(it).getId()), str3, "nux_follow_from_logged_in_accounts", null);
                            A1E.add(A04);
                            A04.A00 = new C32531EUh(evh, A04, str3, 10);
                            C1GL c1gl = evh.A04;
                            if (c1gl != null) {
                                c1gl.schedule(A04);
                            }
                        }
                        evh.A06.put(str3, A1E);
                    }
                }
                break;
            case 4:
                super.handleMessage(message);
                if (message.what != 1) {
                    return;
                }
                EKC.A01((EKC) this.A01);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public HandlerC31740Dwt(C36473G6x c36473G6x, int i) {
        this.A00 = i;
        this.A01 = c36473G6x;
    }
}
