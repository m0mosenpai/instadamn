package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.88M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88M extends BaseAdapter implements C88N {
    public int A00;
    public int A01;
    public C174437pd A02;
    public AnonymousClass887 A03;
    public AnonymousClass895 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final List A08;
    public final FrameLayout.LayoutParams A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final C88K A0C;
    public final C88O A0D;
    public final Map A0E;

    public C88M(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C88K c88k) {
        C14360o3.A0B(userSession, 4);
        this.A0A = interfaceC11380iw;
        this.A0C = c88k;
        this.A0B = userSession;
        this.A08 = new ArrayList();
        this.A0D = new C88O(context, userSession, "DialAdapter");
        this.A0E = new HashMap();
        this.A01 = -1;
        this.A00 = -1;
        int A00 = C88P.A00(context);
        this.A09 = new FrameLayout.LayoutParams(A00, A00);
    }

    public final void A03(int i) {
        A05(null, i, false, false, false);
    }

    public final void A06(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new RuntimeException("dial element is null");
            }
        }
        List list2 = this.A08;
        list2.clear();
        list2.addAll(list);
        int i = this.A01;
        if (i < 0) {
            i = 0;
        }
        this.A01 = i;
        int i2 = this.A00;
        if (i2 < 0) {
            i2 = 0;
        }
        this.A00 = i2;
        C0fA.A00(this, 2126952210);
    }

    @Override // X.C88N
    public final void DD9(C88X c88x, int i) {
        boolean z = false;
        if (Math.abs(this.A01 - i) == 2) {
            z = true;
        }
        A05(null, i, true, true, z);
    }

    public final int A00(String str) {
        int i = 0;
        for (Object obj : this.A08) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (!C14360o3.A0K(((C88X) obj).getId(), str)) {
                i = i2;
            } else {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public final C88X A01() {
        if (A07(this.A01)) {
            return (C88X) this.A08.get(this.A01);
        }
        return null;
    }

    public final void A04(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            C88X A02 = A02(i);
            if (A02 == null) {
                AbstractC12120kG.A0I("DialAdapter", new NullPointerException(AnonymousClass001.A0O("Dial element is null at mPagedToPosition: ", this.A00)), AbstractC06930Yk.A0E());
                return;
            }
            this.A0C.DNi(A02, i);
            AnonymousClass887 anonymousClass887 = this.A03;
            if (anonymousClass887 != null) {
                anonymousClass887.DNi(A02, i);
            } else {
                AbstractC12120kG.A0I("DialAdapter", new NullPointerException(AnonymousClass001.A0O("DialElementSelectedListener is null at position: ", i)), AbstractC06930Yk.A0E());
            }
        }
    }

    public final void A05(String str, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!z && i == this.A01) {
            return;
        }
        int i2 = this.A01;
        this.A01 = i;
        if (A07(i2)) {
            this.A0C.DDD(A02(i2), i2, z2);
            z4 = true;
        } else {
            z4 = false;
        }
        if (A07(i)) {
            if (!z3 || !z) {
                A04(i);
            }
            C88X A02 = A02(i);
            this.A0C.DDB(A02, str, i, z2);
            AnonymousClass887 anonymousClass887 = this.A03;
            if (anonymousClass887 != null) {
                anonymousClass887.DDB(A02, str, i, false);
            } else {
                AbstractC12120kG.A0I("DialAdapter", new NullPointerException(AnonymousClass001.A0O("DialElementSelectedListener is null at position: ", i)), AbstractC06930Yk.A0E());
            }
        } else {
            AbstractC12120kG.A0I("DialAdapter", new NullPointerException(AnonymousClass001.A0O("New selected mPosition is invalid newPosition=", i)), AbstractC06930Yk.A0E());
            if (!z4) {
                return;
            }
        }
        C0fA.A00(this, -1118398906);
    }

    public final boolean A07(int i) {
        if (i >= 0 && i < this.A08.size()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A08.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A08.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        String id = ((C88X) this.A08.get(i)).getId();
        C14360o3.A07(id);
        Map map = this.A0E;
        Number number = (Number) map.get(id);
        if (number == null) {
            number = Long.valueOf(map.size());
            map.put(id, number);
        }
        return number.longValue();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            C88K c88k = this.A0C;
            C174437pd c174437pd = this.A02;
            view2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dial_effect_picker_element, viewGroup, false);
            C14360o3.A0A(view2);
            view2.setTag(new C177327uS(view2, c174437pd, c88k));
            view2.setLayoutParams(this.A09);
        }
        Object tag = view2.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.dial.DialElementViewHolder");
        Object item = getItem(i);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.camera.effect.models.DialElement");
        C88O c88o = this.A0D;
        InterfaceC11380iw interfaceC11380iw = this.A0A;
        int i2 = this.A01;
        boolean z = this.A06;
        boolean z2 = this.A05;
        c88o.A01((C88X) item, interfaceC11380iw, this.A04, this, (C177327uS) tag, i, i2, z, z2, false, this.A07);
        return view2;
    }

    public final C88X A02(int i) {
        if (A07(i)) {
            return (C88X) this.A08.get(i);
        }
        return null;
    }
}
