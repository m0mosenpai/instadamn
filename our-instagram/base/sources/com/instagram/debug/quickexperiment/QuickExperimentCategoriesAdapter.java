package com.instagram.debug.quickexperiment;

import X.AbstractC166987dD;
import X.C0K8;
import X.C2US;
import X.C31335Dq0;
import X.C31566Dts;
import X.C32430EQi;
import X.C32431EQj;
import X.C32436EQo;
import X.C32439EQr;
import X.C32440EQs;
import X.C32473ERz;
import X.C34957Fah;
import X.C35119FeM;
import X.C36731GHa;
import X.C54737OFo;
import X.EQR;
import X.GHX;
import X.GHY;
import X.GYX;
import X.InterfaceC65242xM;
import X.InterfaceC65642y0;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* loaded from: classes6.dex */
public class QuickExperimentCategoriesAdapter extends C2US implements InterfaceC65242xM {
    public static final Class TAG = QuickExperimentCategoriesAdapter.class;
    public List mCategoryList;
    public final C31566Dts mHeaderBinderGroup;
    public final C32436EQo mIgdsTextCellItemBinderGroup;
    public Boolean mInTestRigMode;
    public boolean mIsSearching;
    public final C32473ERz mLoadingRowBinderGroup;
    public final C32439EQr mMenuItemBinderGroup;
    public final C32430EQi mMenuItemWithActionLabelViewBinderGroup;
    public final C32431EQj mSeparatorBinderGroup;
    public final C32440EQs mSwitchBinderGroup;
    public final EQR mTypeaheadHeaderBinderGroup;
    public final boolean mUseRecyclerView;

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.EQR, X.2y0] */
    public QuickExperimentCategoriesAdapter(Context context, GYX gyx, Boolean bool, Boolean bool2) {
        super(false);
        this.mCategoryList = AbstractC166987dD.A1E();
        this.mInTestRigMode = false;
        this.mIsSearching = false;
        C32439EQr c32439EQr = new C32439EQr(context);
        this.mMenuItemBinderGroup = c32439EQr;
        C32436EQo c32436EQo = new C32436EQo(context);
        this.mIgdsTextCellItemBinderGroup = c32436EQo;
        C31566Dts c31566Dts = new C31566Dts(context, null);
        this.mHeaderBinderGroup = c31566Dts;
        C32430EQi c32430EQi = new C32430EQi(context);
        this.mMenuItemWithActionLabelViewBinderGroup = c32430EQi;
        ?? obj = new Object();
        obj.A00 = gyx;
        this.mTypeaheadHeaderBinderGroup = obj;
        C32440EQs c32440EQs = new C32440EQs(context);
        this.mSwitchBinderGroup = c32440EQs;
        C32473ERz c32473ERz = new C32473ERz(context, null);
        this.mLoadingRowBinderGroup = c32473ERz;
        C32431EQj c32431EQj = new C32431EQj(context);
        this.mSeparatorBinderGroup = c32431EQj;
        this.mUseRecyclerView = bool.booleanValue();
        this.mInTestRigMode = bool2;
        init(c31566Dts, c32439EQr, c32440EQs, c32473ERz, c32430EQi, obj, c32431EQj, c32436EQo);
        updateItems();
    }

    @Override // X.InterfaceC65242xM
    public QuickExperimentCategoriesAdapter getAdapter() {
        return this;
    }

    @Override // X.InterfaceC65242xM
    public /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        this.mIsSearching = false;
        updateItems();
    }

    public void setSearching(boolean z) {
        this.mIsSearching = z;
        updateItems();
    }

    @Override // X.C2UT
    public void updateListView() {
        if (this.mUseRecyclerView) {
            notifyDataSetChanged();
        } else {
            super.updateListView();
        }
    }

    private void updateItems() {
        InterfaceC65642y0 interfaceC65642y0;
        C34957Fah c34957Fah;
        InterfaceC65642y0 interfaceC65642y02;
        clear();
        if (!this.mInTestRigMode.booleanValue()) {
            addModel(null, this.mTypeaheadHeaderBinderGroup);
        }
        if (this.mIsSearching) {
            addModel(null, this.mLoadingRowBinderGroup);
        } else {
            for (Object obj : this.mCategoryList) {
                if (obj instanceof C31335Dq0) {
                    interfaceC65642y0 = this.mHeaderBinderGroup;
                } else {
                    if (obj instanceof GHX) {
                        c34957Fah = new C34957Fah(false, false, true);
                        interfaceC65642y02 = this.mMenuItemWithActionLabelViewBinderGroup;
                    } else if (obj instanceof GHY) {
                        c34957Fah = new C34957Fah(false, false, false);
                        interfaceC65642y02 = this.mMenuItemBinderGroup;
                    } else if (obj instanceof C36731GHa) {
                        interfaceC65642y0 = this.mSwitchBinderGroup;
                    } else if (obj instanceof C35119FeM) {
                        interfaceC65642y0 = this.mSeparatorBinderGroup;
                    } else if (obj instanceof C54737OFo) {
                        interfaceC65642y0 = this.mIgdsTextCellItemBinderGroup;
                    } else {
                        C0K8.A02(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", obj.toString()));
                    }
                    addModel(obj, c34957Fah, interfaceC65642y02);
                }
                addModel(obj, interfaceC65642y0);
            }
        }
        updateListView();
    }
}
