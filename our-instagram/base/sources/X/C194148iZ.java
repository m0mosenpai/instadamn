package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.8iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194148iZ implements InterfaceC153786vn {
    public L40 A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final C188898Yf A05;
    public final InterfaceC193788hy A06;
    public final InterfaceC193778hx A07;
    public final C194218ig A08;
    public final String A09;
    public final java.util.Set A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    public C194148iZ(Context context, UserSession userSession, C188898Yf c188898Yf, InterfaceC193788hy interfaceC193788hy, InterfaceC193778hx interfaceC193778hx, String str, List list) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(list, 8);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = c188898Yf;
        this.A09 = str;
        this.A06 = interfaceC193788hy;
        this.A07 = interfaceC193778hx;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C203238yg) obj).A09) {
                arrayList.add(obj);
            }
        }
        this.A01 = arrayList;
        this.A0A = new LinkedHashSet();
        C66392zG A00 = C66362zD.A00(this.A03);
        final UserSession userSession2 = this.A04;
        final C188898Yf c188898Yf2 = this.A05;
        final InterfaceC193788hy interfaceC193788hy2 = this.A06;
        A00.A01(new AbstractC66412zI(userSession2, c188898Yf2, interfaceC193788hy2, this) { // from class: X.8ia
            public final UserSession A00;
            public final C188898Yf A01;
            public final InterfaceC193788hy A02;
            public final C194148iZ A03;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.gallery_drafts_item, viewGroup, false);
                C14360o3.A0A(inflate);
                Context context2 = inflate.getContext();
                C14360o3.A07(context2);
                UserSession userSession3 = this.A00;
                AbstractC13880nE.A0g(inflate, AbstractC188868Yc.A02(context2));
                AbstractC13880nE.A0W(inflate, C1H4.A01(AbstractC188868Yc.A02(context2) / 0.5625f));
                return new C9V5(inflate, userSession3, this.A02, this.A03);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C195868lW c195868lW;
                C194198ie c194198ie = (C194198ie) interfaceC66482zP;
                C9V5 c9v5 = (C9V5) c3oo;
                C14360o3.A0B(c194198ie, 0);
                C14360o3.A0B(c9v5, 1);
                C203238yg c203238yg = c194198ie.A01;
                boolean A0K = C14360o3.A0K(c9v5.A00, c203238yg);
                c9v5.A00 = c203238yg;
                ImageView imageView = c9v5.A03;
                imageView.setBackground(c9v5.A01);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                ImageView imageView2 = c9v5.A04;
                C194148iZ c194148iZ = this.A03;
                AbstractC226789za.A00(imageView2, c194148iZ.A02, A0K);
                boolean contains = c194148iZ.A0A.contains(c203238yg);
                C177907vP c177907vP = c9v5.A0A;
                int i = -1;
                if (contains) {
                    i = 1;
                }
                c177907vP.A00(i);
                AbstractC226789za.A00(c9v5.A02, contains, A0K);
                UserSession userSession3 = this.A00;
                if (AbstractC23021Ah.A00(userSession3).A1s()) {
                    long j = AbstractC23021Ah.A00(userSession3).A01.getLong("story_drafts_expiration_nux_seen_timestamp_ms", 0L);
                    long j2 = c203238yg.A00;
                    if (j < j2) {
                        j = j2;
                    }
                    TextView textView = c9v5.A06;
                    textView.setVisibility(0);
                    Context context2 = c9v5.itemView.getContext();
                    C14360o3.A07(context2);
                    Resources resources = context2.getResources();
                    C14360o3.A07(resources);
                    textView.setText(C23831Eq.A0D(resources, EnumC89613z1.A06, C05F.A0C, System.currentTimeMillis() / 1000, (j + 604800000) / 1000, false, true, false, false, false));
                } else {
                    c9v5.A06.setVisibility(8);
                }
                C196948nP A002 = c203238yg.A00();
                EnumC198268pb enumC198268pb = null;
                if (A002 != null) {
                    c195868lW = A002.A04;
                } else {
                    c195868lW = null;
                }
                C196948nP A003 = c203238yg.A00();
                if (A003 != null) {
                    enumC198268pb = A003.A02;
                }
                if (enumC198268pb == EnumC198268pb.A07 && c195868lW != null) {
                    TextView textView2 = c9v5.A05;
                    textView2.setVisibility(0);
                    textView2.setText(AbstractC189358aC.A01(c195868lW.A07));
                } else {
                    c9v5.A05.setVisibility(8);
                }
                View view = c9v5.itemView;
                C14360o3.A06(view);
                int i2 = c194198ie.A00;
                L40 l40 = c194148iZ.A00;
                if (l40 != null) {
                    String str2 = c203238yg.A05;
                    c203238yg.A00();
                    Pair pair = new Pair(Integer.valueOf((i2 / 3) + 1), Integer.valueOf((i2 % 3) + 1));
                    C14360o3.A0B(str2, 2);
                    l40.A03.put(view, new C22831A5a(pair));
                }
                this.A01.A01(c9v5, c203238yg);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C194198ie.class;
            }

            {
                this.A00 = userSession2;
                this.A01 = c188898Yf2;
                this.A03 = this;
                this.A02 = interfaceC193788hy2;
            }
        });
        A00.A01(new Object());
        A00.A08 = true;
        A00.A06 = "StoryDraftsGalleryItemAdapter";
        this.A08 = new C194218ig(A00.A00());
    }

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C203238yg) obj).A09) {
                arrayList.add(obj);
            }
        }
        this.A01 = arrayList;
        C66362zD c66362zD = this.A08.A01;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        UserSession userSession = this.A04;
        if (!C18U.A06(C06090Tz.A05, userSession, 36320219139940499L) && AbstractC23021Ah.A00(userSession).A1s()) {
            String string = this.A03.getString(2131974611);
            C14360o3.A07(string);
            viewModelListUpdate.A00(new C194208if(string));
        }
        List list2 = this.A01;
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            arrayList2.add(new C194198ie((C203238yg) obj2, i));
            i = i2;
        }
        viewModelListUpdate.A01(arrayList2);
        c66362zD.A05(viewModelListUpdate);
    }

    public final void A01(java.util.Set set) {
        Number number;
        EnumC198268pb enumC198268pb;
        C14360o3.A0B(set, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : this.A01) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (set.contains(obj)) {
                linkedHashMap.put(obj, Integer.valueOf(i));
            }
            i = i2;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C203238yg c203238yg = (C203238yg) it.next();
            if (linkedHashMap.containsKey(c203238yg)) {
                number = (Number) linkedHashMap.get(c203238yg);
            } else {
                number = 0;
            }
            C22C A01 = AnonymousClass229.A01(this.A04);
            C196948nP A00 = c203238yg.A00();
            if (A00 != null) {
                enumC198268pb = A00.A02;
            } else {
                enumC198268pb = null;
            }
            AnonymousClass249 A06 = AbstractC50677MYv.A06(enumC198268pb);
            String str = c203238yg.A05;
            String str2 = this.A09;
            if (number != null) {
                int intValue = number.intValue();
                A01.A0r(new Pair(Integer.valueOf((intValue / 3) + 1), Integer.valueOf((intValue % 3) + 1)), A06, str, str2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A02(boolean z) {
        this.A02 = z;
        java.util.Set set = this.A0A;
        set.clear();
        this.A07.DU6(set.size());
        this.A08.A01.notifyDataSetChanged();
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        InterfaceC127925qL BAO = this.A08.BAO(i);
        C14360o3.A07(BAO);
        return BAO;
    }
}
