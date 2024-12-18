package com.instagram.debug.devoptions.signalsplayground.adapter;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25230BEn;
import X.C0f9;
import X.C14360o3;
import X.C2UU;
import X.C3OO;
import X.InterfaceC11380iw;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersAdapter extends C2UU {
    public static final Companion Companion = new Object();
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_USER = 1;
    public final InterfaceC11380iw analyticsModule;
    public final CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate delegate;
    public final ArrayList testUserListItems;

    @Override // X.C2UU
    public void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder) {
            Object obj = this.testUserListItems.get(i);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem.TestUserHeader");
            ((CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder) c3oo).bind(((TestUserListItem.TestUserHeader) obj).titleRes, i);
        } else {
            if (!(c3oo instanceof CreatorInspirationSignalsPlaygroundTestUserRowViewHolder)) {
                return;
            }
            Object obj2 = this.testUserListItems.get(i);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem.TestUserItem");
            ((CreatorInspirationSignalsPlaygroundTestUserRowViewHolder) c3oo).bind(((TestUserListItem.TestUserItem) obj2).user);
        }
    }

    @Override // X.C2UU
    public C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new CreatorInspirationSignalsPlaygroundTestUserRowViewHolder(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_test_user_row_item, false), this.analyticsModule, this.delegate);
            }
            throw AbstractC25230BEn.A0n(AbstractC111324zv.A00(1845), i);
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_inspiration_signals_playground_test_user_header_item, false));
    }

    public final void setTestUserListItems(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = this.testUserListItems;
        arrayList.clear();
        arrayList.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    public CreatorInspirationSignalsPlaygroundTestUsersAdapter(InterfaceC11380iw interfaceC11380iw, CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate delegate) {
        AbstractC167017dG.A1P(interfaceC11380iw, delegate);
        this.analyticsModule = interfaceC11380iw;
        this.delegate = delegate;
        this.testUserListItems = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1047790167);
        int size = this.testUserListItems.size();
        C0f9.A0A(1027877296, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public int getItemViewType(int i) {
        int A03 = C0f9.A03(-289732153);
        int i2 = 1;
        int i3 = -1873361922;
        if (this.testUserListItems.get(i) instanceof TestUserListItem.TestUserHeader) {
            i2 = 0;
            i3 = 1702992782;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }

    /* loaded from: classes5.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
