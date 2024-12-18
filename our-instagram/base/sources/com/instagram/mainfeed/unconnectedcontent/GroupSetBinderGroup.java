package com.instagram.mainfeed.unconnectedcontent;

import X.AbstractC13880nE;
import X.AbstractC65632xz;
import X.AnonymousClass306;
import X.C0f9;
import X.C0fQ;
import X.C110394yB;
import X.C110424yE;
import X.C110434yF;
import X.C110454yH;
import X.C14360o3;
import X.C27869CQg;
import X.C3ZF;
import X.C66672zk;
import X.InterfaceC63342uH;
import X.ViewOnClickListenerC41905Ihy;
import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes2.dex */
public final class GroupSetBinderGroup extends AbstractC65632xz {
    public static final C66672zk Companion = new Object();
    public static final int ITEM_VIEW_TYPE_GROUP_SET_HEADER = 0;
    public static final int NUM_VIEW_TYPES = 3;
    public final InterfaceC63342uH delegate;
    public final UserSession userSession;

    public GroupSetBinderGroup(UserSession userSession, InterfaceC63342uH interfaceC63342uH) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC63342uH, 2);
        this.userSession = userSession;
        this.delegate = interfaceC63342uH;
    }

    @Override // X.InterfaceC65642y0
    public void buildRowViewTypes(AnonymousClass306 anonymousClass306, C110424yE c110424yE, C110454yH c110454yH) {
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c110424yE, 1);
        C14360o3.A0B(c110454yH, 2);
        anonymousClass306.A7b(0, c110424yE, c110454yH);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public String getBinderGroupName() {
        return "GroupSet";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C110394yB) ((C110424yE) obj).A00).A06;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1873585415);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.GroupSetHeaderViewBinder.Holder");
        C27869CQg c27869CQg = (C27869CQg) tag;
        C110424yE c110424yE = (C110424yE) obj;
        InterfaceC63342uH interfaceC63342uH = this.delegate;
        C14360o3.A0B(c27869CQg, 0);
        C14360o3.A0B(c110424yE, 1);
        C14360o3.A0B(interfaceC63342uH, 2);
        C110434yF A00 = c110424yE.A00(C3ZF.A06.A00);
        if (A00 != null) {
            IgTextView igTextView = c27869CQg.A00;
            igTextView.setText(A00.A05);
            C0fQ.A00(new ViewOnClickListenerC41905Ihy(A00, interfaceC63342uH), igTextView);
            if (!c110424yE.A02()) {
                igTextView.setVisibility(0);
            }
        }
        for (C110434yF c110434yF : c110424yE.A01()) {
            if (C14360o3.A0K(c110434yF.A03, c110424yE.A01)) {
                c27869CQg.A01.setText(c110434yF.A05);
            }
        }
        C0f9.A0A(201782743, A03);
    }

    @Override // X.InterfaceC65642y0
    public View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-502904764);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_group_set_header, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.title);
        C14360o3.A07(requireViewById);
        View requireViewById2 = inflate.requireViewById(R.id.open_older_posts);
        C14360o3.A07(requireViewById2);
        C14360o3.A07(inflate.requireViewById(R.id.top_divider));
        C14360o3.A07(inflate.requireViewById(R.id.bottom_divider));
        inflate.setTag(new C27869CQg((IgTextView) requireViewById, (IgTextView) requireViewById2));
        RectF rectF = AbstractC13880nE.A01;
        inflate.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0nA
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfo, 1);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
        });
        C0f9.A0A(870454877, A03);
        return inflate;
    }
}
