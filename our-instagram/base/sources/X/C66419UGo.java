package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.SelectedInterestRowItem;
import com.instagram.business.promote.model.SuggestedInterestRowItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UGo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66419UGo extends C2UU {
    public List A00;
    public final C68955Vet A01;
    public final C69526Vqq A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final InterfaceC09390do A09;
    public final Context A0A;
    public final C68455VRl A0B;
    public final C68457VRn A0C;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.VRl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.VRn, java.lang.Object] */
    public C66419UGo(Context context, C68955Vet c68955Vet, C69526Vqq c69526Vqq, UserSession userSession, String str, String str2) {
        AbstractC167007dF.A1G(userSession, 1, c69526Vqq);
        this.A03 = userSession;
        this.A04 = str;
        this.A0A = context;
        this.A05 = str2;
        this.A02 = c69526Vqq;
        this.A01 = c68955Vet;
        this.A07 = new ArrayList();
        this.A08 = new ArrayList();
        this.A06 = new ArrayList();
        this.A00 = new ArrayList();
        this.A0B = new Object();
        this.A0C = new Object();
        this.A09 = AbstractC09440dt.A01(new X31(this, 49));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C66446UHw c66446UHw;
        Context context;
        int i2;
        AudienceInterest audienceInterest;
        View view;
        int i3;
        UIW uiw;
        TextView textView;
        String str;
        View.OnClickListener onClickListener;
        View view2;
        C14360o3.A0B(c3oo, 0);
        switch (getItemViewType(i)) {
            case 0:
                C14360o3.A0C(this.A07.get(i), "null cannot be cast to non-null type com.instagram.business.promote.model.SelectedInterestHeaderRowItem");
                c66446UHw = (C66446UHw) c3oo;
                context = this.A0A;
                i2 = 2131970532;
                c66446UHw.A00.setText(AbstractC166997dE.A0p(context, i2));
                return;
            case 1:
                Object obj = this.A07.get(i);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.SelectedInterestRowItem");
                UIW uiw2 = (UIW) c3oo;
                audienceInterest = ((SelectedInterestRowItem) obj).A00;
                if (audienceInterest != null) {
                    uiw2.A00.setText(audienceInterest.A01());
                    view = uiw2.itemView;
                    i3 = 69;
                    uiw = uiw2;
                    WNV.A00(view, i3, audienceInterest, uiw);
                    return;
                }
                C14360o3.A0F("interest");
                throw C00O.createAndThrow();
            case 2:
                C14360o3.A0C(this.A07.get(i), "null cannot be cast to non-null type com.instagram.business.promote.model.SuggestedInterestHeaderRowItem");
                c66446UHw = (C66446UHw) c3oo;
                context = this.A0A;
                i2 = 2131970527;
                c66446UHw.A00.setText(AbstractC166997dE.A0p(context, i2));
                return;
            case 3:
                Object obj2 = this.A07.get(i);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.business.promote.model.SuggestedInterestRowItem");
                UIX uix = (UIX) c3oo;
                audienceInterest = ((SuggestedInterestRowItem) obj2).A00;
                if (audienceInterest != null) {
                    uix.A00.setText(audienceInterest.A01());
                    view = uix.itemView;
                    i3 = 70;
                    uiw = uix;
                    WNV.A00(view, i3, audienceInterest, uiw);
                    return;
                }
                C14360o3.A0F("interest");
                throw C00O.createAndThrow();
            case 4:
                C66445UHv c66445UHv = (C66445UHv) c3oo;
                Object obj3 = this.A07.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteHeaderRowViewItem");
                C68724Vb3 c68724Vb3 = (C68724Vb3) obj3;
                AbstractC167007dF.A1K(c66445UHv, c68724Vb3);
                textView = c66445UHv.A00;
                str = c68724Vb3.A00;
                textView.setText(str);
                return;
            case 5:
                C66471UIv c66471UIv = (C66471UIv) c3oo;
                Object obj4 = this.A07.get(i);
                C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteLabelWithCircleCheckFilledIconViewItem");
                C68959Vex c68959Vex = (C68959Vex) obj4;
                AbstractC167007dF.A1K(c66471UIv, c68959Vex);
                c66471UIv.A02.setText(c68959Vex.A01);
                c66471UIv.A01.setVisibility(0);
                onClickListener = c68959Vex.A00;
                view2 = c66471UIv.A00;
                C0fQ.A00(onClickListener, view2);
                return;
            case 6:
                C66472UIw c66472UIw = (C66472UIw) c3oo;
                Object obj5 = this.A07.get(i);
                C14360o3.A0C(obj5, "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteLabelWithCircleIconViewItem");
                C68960Vey c68960Vey = (C68960Vey) obj5;
                AbstractC167007dF.A1K(c66472UIw, c68960Vey);
                c66472UIw.A02.setText(c68960Vey.A01);
                c66472UIw.A01.setVisibility(0);
                onClickListener = c68960Vey.A00;
                view2 = c66472UIw.A00;
                C0fQ.A00(onClickListener, view2);
                return;
            case 7:
                UIT uit = (UIT) c3oo;
                Object obj6 = this.A07.get(i);
                C14360o3.A0C(obj6, "null cannot be cast to non-null type com.instagram.business.promote.viewitem.PromoteHeaderWithSubHeaderRowViewItem");
                C68958Vew c68958Vew = (C68958Vew) obj6;
                AbstractC167007dF.A1K(uit, c68958Vew);
                uit.A00.setText(c68958Vew.A00);
                textView = uit.A01;
                str = c68958Vew.A01;
                textView.setText(str);
                return;
            default:
                return;
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object c66446UHw;
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        switch (i) {
            case 0:
            case 2:
                c66446UHw = new C66446UHw(A0E.inflate(R.layout.interest_header_item_view, viewGroup, false));
                break;
            case 1:
                c66446UHw = new UIW(A0E.inflate(R.layout.selected_interest_item_view, viewGroup, false), this.A02);
                break;
            case 3:
                c66446UHw = new UIX(A0E.inflate(R.layout.suggested_interest_item_view, viewGroup, false), this.A02);
                break;
            case 4:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_header, false);
                A07.setTag(new C66445UHv(A07));
                c66446UHw = new C66445UHv(A07);
                break;
            case 5:
                View A072 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_label_with_circle_check_filled_icon, false);
                A072.setTag(new C66471UIv(A072));
                c66446UHw = A072.getTag();
                if (c66446UHw == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 6:
                View A073 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_label_with_circle_icon, false);
                A073.setTag(new C66472UIw(A073));
                c66446UHw = A073.getTag();
                if (c66446UHw == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            case 7:
                View A074 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A0A), viewGroup, R.layout.promote_recycler_row_header_with_sub_header, false);
                A074.setTag(new UIT(A074));
                c66446UHw = A074.getTag();
                if (c66446UHw == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown View Type");
        }
        return (C3OO) c66446UHw;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.instagram.business.promote.model.SuggestedInterestRowItem] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.instagram.business.promote.model.SelectedInterestRowItem] */
    public final void A00() {
        Object c68724Vb3;
        List list = this.A07;
        list.clear();
        UserSession userSession = this.A03;
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36312389414552676L);
        List<AudienceInterest> list2 = this.A08;
        boolean isEmpty = list2.isEmpty();
        if (A06) {
            if (!isEmpty) {
                ArrayList arrayList = new ArrayList();
                for (AudienceInterest audienceInterest : list2) {
                    String format = String.format("{\"id\": %s, \"name\": %s}", MSX.A1b(audienceInterest.A00(), audienceInterest.A01(), 2));
                    C14360o3.A07(format);
                    arrayList.add(format);
                }
                List<AudienceInterest> list3 = this.A06;
                ArrayList arrayList2 = new ArrayList();
                for (AudienceInterest audienceInterest2 : list3) {
                    String format2 = String.format("{\"id\": %s, \"name\": %s}", MSX.A1b(audienceInterest2.A00(), audienceInterest2.A01(), 2));
                    C14360o3.A07(format2);
                    arrayList2.add(format2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (arrayList2.contains(next)) {
                        arrayList3.add(next);
                    }
                }
                boolean z = !arrayList3.isEmpty();
                Context context = this.A0A;
                if (z) {
                    c68724Vb3 = new C68958Vew(AbstractC166997dE.A0p(context, 2131970525), AbstractC166997dE.A0p(context, 2131970526));
                } else {
                    c68724Vb3 = new C68724Vb3(AbstractC166997dE.A0p(context, 2131970525));
                }
                list.add(c68724Vb3);
                for (AudienceInterest audienceInterest3 : list2) {
                    list.add(new C68959Vex(audienceInterest3.A01(), new WNP(0, audienceInterest3, this)));
                }
            }
            List list4 = this.A00;
            if (list4 != null && !list4.isEmpty()) {
                list.add(new C68724Vb3(AbstractC166997dE.A0p(this.A0A, 2131970486)));
                for (AudienceInterest audienceInterest4 : this.A00) {
                    list.add(new C68960Vey(audienceInterest4.A01(), new WNP(1, audienceInterest4, this)));
                }
            }
        } else if (!isEmpty) {
            list.add(this.A0B);
            for (AudienceInterest audienceInterest5 : list2) {
                C14360o3.A0B(audienceInterest5, 1);
                ?? obj = new Object();
                obj.A00 = audienceInterest5;
                list.add(obj);
            }
            List list5 = this.A00;
            if (list5 != null && !list5.isEmpty()) {
                list.add(this.A0C);
                for (AudienceInterest audienceInterest6 : this.A00) {
                    C14360o3.A0B(audienceInterest6, 1);
                    ?? obj2 = new Object();
                    obj2.A00 = audienceInterest6;
                    list.add(obj2);
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void A01(AudienceInterest audienceInterest) {
        List list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((AudienceInterest) it.next()).A00(), audienceInterest.A00())) {
                return;
            }
        }
        list.add(audienceInterest);
        A00();
        C68955Vet c68955Vet = this.A01;
        UserSession userSession = this.A03;
        String str = this.A04;
        List A02 = AbstractC92144Au.A02(new C70557Wcn(6, C71815X5t.A00), list);
        String str2 = this.A05;
        C1P1 c1p1 = (C1P1) this.A09.getValue();
        C1ON A05 = AbstractC70178WFd.A05(userSession, str, str2, A02, false);
        A05.A00 = c1p1;
        c68955Vet.A00.schedule(A05);
    }

    public final void A02(List list) {
        List list2 = this.A08;
        list2.clear();
        this.A06.clear();
        list2.addAll(list);
        A00();
        C68955Vet c68955Vet = this.A01;
        UserSession userSession = this.A03;
        String str = this.A04;
        List A02 = AbstractC92144Au.A02(new C70557Wcn(6, C71815X5t.A00), list2);
        boolean isEmpty = list.isEmpty();
        String str2 = this.A05;
        C1P1 c1p1 = (C1P1) this.A09.getValue();
        C1ON A05 = AbstractC70178WFd.A05(userSession, str, str2, A02, isEmpty);
        A05.A00 = c1p1;
        c68955Vet.A00.schedule(A05);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(197879091);
        int size = this.A07.size();
        C0f9.A0A(-2110016139, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1993700493);
        Object obj = this.A07.get(i);
        if (obj instanceof C68455VRl) {
            i2 = 0;
        } else if (obj instanceof SelectedInterestRowItem) {
            i2 = 1;
        } else if (obj instanceof C68457VRn) {
            i2 = 2;
        } else if (obj instanceof SuggestedInterestRowItem) {
            i2 = 3;
        } else if (obj instanceof C68724Vb3) {
            i2 = 4;
        } else if (obj instanceof C68958Vew) {
            i2 = 7;
        } else if (obj instanceof C68959Vex) {
            i2 = 5;
        } else {
            boolean z = obj instanceof C68960Vey;
            i2 = -1;
            if (z) {
                i2 = 6;
            }
        }
        C0f9.A0A(342293499, A03);
        return i2;
    }
}
