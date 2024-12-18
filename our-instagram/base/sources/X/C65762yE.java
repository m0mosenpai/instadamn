package X;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65762yE extends AbstractC65632xz {
    public int A00;
    public C63762ux A01;
    public C685736u A02;
    public boolean A03;
    public Activity A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C63752uw A08;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return MSV.A00(773);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        View.OnClickListener loo;
        int A03 = C0f9.A03(1435552226);
        UserSession userSession = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A06;
        C69453Vnc c69453Vnc = (C69453Vnc) view.getTag();
        C42526Is5 c42526Is5 = (C42526Is5) obj;
        C63752uw c63752uw = this.A08;
        C685736u c685736u = this.A02;
        C42661IuI c42661IuI = (C42661IuI) obj2;
        Activity activity = this.A04;
        if (this.A03) {
            HorizontalRecyclerPager horizontalRecyclerPager = c69453Vnc.A0A;
            horizontalRecyclerPager.setVisibility(0);
            c69453Vnc.A09.setVisibility(0);
            C38380GuH c38380GuH = new C38380GuH(c42661IuI);
            horizontalRecyclerPager.A0a();
            horizontalRecyclerPager.A14(c38380GuH);
            Parcelable parcelable = c42661IuI.A00;
            AbstractC70663Fe abstractC70663Fe = horizontalRecyclerPager.A0D;
            if (parcelable != null && abstractC70663Fe != null) {
                abstractC70663Fe.A1P(parcelable);
            }
            ArrayList arrayList = new ArrayList(c42526Is5.A00());
            int i3 = 0;
            while (i3 < arrayList.size()) {
                User user = ((C41100IHr) arrayList.get(i3)).A02;
                if (user == null || (!user.A27() && !user.A2A())) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.isEmpty()) {
                VTD.A00(c69453Vnc, 8, true);
            } else {
                horizontalRecyclerPager.setAdapter(new UGf(activity, interfaceC11380iw, userSession, c63752uw, c69453Vnc, c42526Is5, arrayList));
                VTD.A00(c69453Vnc, 0, true);
            }
        } else {
            LinearLayout linearLayout = c69453Vnc.A04;
            linearLayout.setVisibility(0);
            List list = c42526Is5.A00;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            int childCount = linearLayout.getChildCount();
            if (i2 < childCount) {
                int i4 = childCount - i2;
                for (int i5 = 0; i5 < i4; i5++) {
                    linearLayout.removeViewAt(0);
                    c69453Vnc.A0B.remove(0);
                }
            } else if (i2 > childCount) {
                int i6 = i2 - childCount;
                LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
                for (int i7 = 0; i7 < i6; i7++) {
                    View inflate = from.inflate(R.layout.netego_row_follow_request, (ViewGroup) null);
                    c69453Vnc.A0B.add(new C69388VmY(inflate));
                    linearLayout.addView(inflate);
                }
            }
            List A00 = c42526Is5.A00();
            boolean z = false;
            for (int i8 = 0; i8 < A00.size(); i8++) {
                C69388VmY c69388VmY = (C69388VmY) c69453Vnc.A0B.get(i8);
                C41100IHr c41100IHr = (C41100IHr) A00.get(i8);
                User user2 = c41100IHr.A02;
                if (user2 == null || (!user2.A2A() && !user2.A27())) {
                    c69388VmY.A00.setVisibility(8);
                    boolean z2 = z;
                    z = false;
                    if (!z2) {
                    }
                } else {
                    View view2 = c69388VmY.A00;
                    view2.setVisibility(0);
                    String id = user2.getId();
                    if (c63752uw.A05.add(id)) {
                        BIM.A02(c63752uw.A01, c63752uw.A02, id, i8);
                    }
                    C0fQ.A00(new WMW(c63752uw, user2, i8), view2);
                    c69388VmY.A05.setUrl(user2.Bhu(), interfaceC11380iw);
                    TextView textView = c69388VmY.A04;
                    textView.setText(user2.getUsername());
                    String fullName = user2.getFullName();
                    boolean isEmpty = TextUtils.isEmpty(fullName);
                    TextView textView2 = c69388VmY.A03;
                    if (isEmpty) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(fullName);
                        textView2.setVisibility(0);
                    }
                    C85963sQ.A0B(textView, user2.isVerified());
                    String str = c41100IHr.A03;
                    boolean isEmpty2 = TextUtils.isEmpty(str);
                    TextView textView3 = c69388VmY.A02;
                    if (!isEmpty2) {
                        textView3.setText(str);
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                    FollowButton followButton = c69388VmY.A06;
                    followButton.A0J.A04(interfaceC11380iw, userSession, user2);
                    boolean A2A = user2.A2A();
                    TextView textView4 = c69388VmY.A01;
                    if (A2A) {
                        textView4.setVisibility(0);
                        followButton.setVisibility(8);
                    } else {
                        textView4.setVisibility(8);
                        followButton.setVisibility(0);
                    }
                    C0fQ.A00(new WMf(c63752uw, c69388VmY, user2, i8), textView4);
                }
                z = true;
            }
            if (!z) {
                VTD.A00(c69453Vnc, 8, false);
            } else {
                VTD.A00(c69453Vnc, 0, false);
            }
        }
        TextView textView5 = c69453Vnc.A06;
        if (textView5.getVisibility() == 0) {
            loo = new LON(c63752uw);
        } else {
            textView5 = c69453Vnc.A07;
            loo = new LOO(c63752uw);
        }
        C0fQ.A00(loo, textView5);
        C0fQ.A00(new ViewOnClickListenerC41927IiK(c42661IuI, c42526Is5, c685736u), c69453Vnc.A03);
        this.A01.EDV(view, c42526Is5);
        C0f9.A0A(843203947, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
        this.A01.A9W((C42526Is5) obj, (C42661IuI) obj2);
    }

    public C65762yE(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63752uw c63752uw, C63762ux c63762ux) {
        this.A05 = context;
        this.A04 = activity;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A08 = c63752uw;
        this.A01 = c63762ux;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(620742040);
        Context context = this.A05;
        int i2 = this.A00;
        boolean z = this.A03;
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.netego_follow_requests, viewGroup, false);
        C69453Vnc c69453Vnc = new C69453Vnc(inflate);
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            C3YB c3yb = new C3YB(dimensionPixelSize, dimensionPixelSize);
            c69453Vnc.A00 = c3yb;
            HorizontalRecyclerPager horizontalRecyclerPager = c69453Vnc.A0A;
            horizontalRecyclerPager.A10(c3yb);
            horizontalRecyclerPager.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            horizontalRecyclerPager.setLayoutManager(new LinearLayoutManager(context, 0, false));
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                View inflate2 = from.inflate(R.layout.netego_row_follow_request, (ViewGroup) null);
                c69453Vnc.A0B.add(new C69388VmY(inflate2));
                c69453Vnc.A04.addView(inflate2);
            }
        }
        c69453Vnc.A01.post(new RunnableC71359WsU(c69453Vnc));
        inflate.setTag(c69453Vnc);
        C0f9.A0A(1209613846, A03);
        return inflate;
    }
}
